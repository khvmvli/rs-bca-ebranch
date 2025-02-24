package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import okhttp3.Call;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.BuiltInConverters;
import retrofit2.CallAdapter;
import retrofit2.Converter;
import retrofit2.ServiceMethod;
/* loaded from: classes-dex2jar.jar:retrofit2/Retrofit.class */
public final class Retrofit {
    final HttpUrl baseUrl;
    final List<CallAdapter.Factory> callAdapterFactories;
    final Call.Factory callFactory;
    @Nullable
    final Executor callbackExecutor;
    final List<Converter.Factory> converterFactories;
    private final Map<Method, ServiceMethod<?, ?>> serviceMethodCache = new ConcurrentHashMap();
    final boolean validateEagerly;

    /* loaded from: classes-dex2jar.jar:retrofit2/Retrofit$Builder.class */
    public static final class Builder {
        private HttpUrl baseUrl;
        private final List<CallAdapter.Factory> callAdapterFactories;
        @Nullable
        private Call.Factory callFactory;
        @Nullable
        private Executor callbackExecutor;
        private final List<Converter.Factory> converterFactories;
        private final Platform platform;
        private boolean validateEagerly;

        public Builder() {
            this(Platform.get());
        }

        Builder(Platform platform) {
            this.converterFactories = new ArrayList();
            this.callAdapterFactories = new ArrayList();
            this.platform = platform;
        }

        Builder(Retrofit retrofit) {
            ArrayList arrayList = new ArrayList();
            this.converterFactories = arrayList;
            ArrayList arrayList2 = new ArrayList();
            this.callAdapterFactories = arrayList2;
            this.platform = Platform.get();
            this.callFactory = retrofit.callFactory;
            this.baseUrl = retrofit.baseUrl;
            arrayList.addAll(retrofit.converterFactories);
            arrayList.remove(0);
            arrayList2.addAll(retrofit.callAdapterFactories);
            arrayList2.remove(arrayList2.size() - 1);
            this.callbackExecutor = retrofit.callbackExecutor;
            this.validateEagerly = retrofit.validateEagerly;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final Builder addCallAdapterFactory(CallAdapter.Factory factory) {
            this.callAdapterFactories.add(Utils.checkNotNull(factory, "factory == null"));
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final Builder addConverterFactory(Converter.Factory factory) {
            this.converterFactories.add(Utils.checkNotNull(factory, "factory == null"));
            return this;
        }

        public final Builder baseUrl(String str) {
            Utils.checkNotNull(str, "baseUrl == null");
            HttpUrl parse = HttpUrl.parse(str);
            if (parse != null) {
                return baseUrl(parse);
            }
            StringBuilder sb = new StringBuilder("Illegal URL: ");
            sb.append(str);
            throw new IllegalArgumentException(sb.toString());
        }

        public final Builder baseUrl(HttpUrl httpUrl) {
            Utils.checkNotNull(httpUrl, "baseUrl == null");
            List<String> pathSegments = httpUrl.pathSegments();
            if ("".equals(pathSegments.get(pathSegments.size() - 1))) {
                this.baseUrl = httpUrl;
                return this;
            }
            StringBuilder sb = new StringBuilder("baseUrl must end in /: ");
            sb.append(httpUrl);
            throw new IllegalArgumentException(sb.toString());
        }

        public final Retrofit build() {
            if (this.baseUrl != null) {
                Call.Factory factory = this.callFactory;
                Call.Factory factory2 = factory;
                if (factory == null) {
                    factory2 = new OkHttpClient();
                }
                Executor executor = this.callbackExecutor;
                Executor executor2 = executor;
                if (executor == null) {
                    executor2 = this.platform.defaultCallbackExecutor();
                }
                ArrayList arrayList = new ArrayList(this.callAdapterFactories);
                arrayList.add(this.platform.defaultCallAdapterFactory(executor2));
                ArrayList arrayList2 = new ArrayList(this.converterFactories.size() + 1);
                arrayList2.add(new BuiltInConverters());
                arrayList2.addAll(this.converterFactories);
                return new Retrofit(factory2, this.baseUrl, Collections.unmodifiableList(arrayList2), Collections.unmodifiableList(arrayList), executor2, this.validateEagerly);
            }
            throw new IllegalStateException("Base URL required.");
        }

        public final List<CallAdapter.Factory> callAdapterFactories() {
            return this.callAdapterFactories;
        }

        public final Builder callFactory(Call.Factory factory) {
            this.callFactory = (Call.Factory) Utils.checkNotNull(factory, "factory == null");
            return this;
        }

        public final Builder callbackExecutor(Executor executor) {
            this.callbackExecutor = (Executor) Utils.checkNotNull(executor, "executor == null");
            return this;
        }

        public final Builder client(OkHttpClient okHttpClient) {
            return callFactory((Call.Factory) Utils.checkNotNull(okHttpClient, "client == null"));
        }

        public final List<Converter.Factory> converterFactories() {
            return this.converterFactories;
        }

        public final Builder validateEagerly(boolean z) {
            this.validateEagerly = z;
            return this;
        }
    }

    Retrofit(Call.Factory factory, HttpUrl httpUrl, List<Converter.Factory> list, List<CallAdapter.Factory> list2, @Nullable Executor executor, boolean z) {
        this.callFactory = factory;
        this.baseUrl = httpUrl;
        this.converterFactories = list;
        this.callAdapterFactories = list2;
        this.callbackExecutor = executor;
        this.validateEagerly = z;
    }

    private void eagerlyValidateMethods(Class<?> cls) {
        Platform platform = Platform.get();
        Method[] declaredMethods = cls.getDeclaredMethods();
        for (Method method : declaredMethods) {
            if (!platform.isDefaultMethod(method)) {
                loadServiceMethod(method);
            }
        }
    }

    public final HttpUrl baseUrl() {
        return this.baseUrl;
    }

    public final CallAdapter<?, ?> callAdapter(Type type, Annotation[] annotationArr) {
        return nextCallAdapter(null, type, annotationArr);
    }

    public final List<CallAdapter.Factory> callAdapterFactories() {
        return this.callAdapterFactories;
    }

    public final Call.Factory callFactory() {
        return this.callFactory;
    }

    @Nullable
    public final Executor callbackExecutor() {
        return this.callbackExecutor;
    }

    public final List<Converter.Factory> converterFactories() {
        return this.converterFactories;
    }

    public final <T> T create(final Class<T> cls) {
        Utils.validateServiceInterface(cls);
        if (this.validateEagerly) {
            eagerlyValidateMethods(cls);
        }
        return (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new InvocationHandler() { // from class: retrofit2.Retrofit.1
            private final Platform platform = Platform.get();

            @Override // java.lang.reflect.InvocationHandler
            public Object invoke(Object obj, Method method, @Nullable Object[] objArr) throws Throwable {
                if (method.getDeclaringClass() == Object.class) {
                    return method.invoke(this, objArr);
                }
                if (this.platform.isDefaultMethod(method)) {
                    return this.platform.invokeDefaultMethod(method, cls, obj, objArr);
                }
                ServiceMethod<?, ?> loadServiceMethod = Retrofit.this.loadServiceMethod(method);
                return loadServiceMethod.adapt(new OkHttpCall(loadServiceMethod, objArr));
            }
        });
    }

    final ServiceMethod<?, ?> loadServiceMethod(Method method) {
        ServiceMethod serviceMethod;
        ServiceMethod<?, ?> serviceMethod2 = this.serviceMethodCache.get(method);
        if (serviceMethod2 != null) {
            return serviceMethod2;
        }
        synchronized (this.serviceMethodCache) {
            ServiceMethod serviceMethod3 = this.serviceMethodCache.get(method);
            serviceMethod = serviceMethod3;
            if (serviceMethod3 == null) {
                serviceMethod = new ServiceMethod.Builder(this, method).build();
                this.serviceMethodCache.put(method, serviceMethod);
            }
        }
        return serviceMethod;
    }

    public final Builder newBuilder() {
        return new Builder(this);
    }

    public final CallAdapter<?, ?> nextCallAdapter(@Nullable CallAdapter.Factory factory, Type type, Annotation[] annotationArr) {
        Utils.checkNotNull(type, "returnType == null");
        Utils.checkNotNull(annotationArr, "annotations == null");
        int indexOf = this.callAdapterFactories.indexOf(factory) + 1;
        int size = this.callAdapterFactories.size();
        for (int i = indexOf; i < size; i++) {
            CallAdapter<?, ?> callAdapter = this.callAdapterFactories.get(i).get(type, annotationArr, this);
            if (callAdapter != null) {
                return callAdapter;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate call adapter for ");
        sb.append(type);
        sb.append(".\n");
        if (factory != null) {
            sb.append("  Skipped:");
            for (int i2 = 0; i2 < indexOf; i2++) {
                sb.append("\n   * ");
                sb.append(this.callAdapterFactories.get(i2).getClass().getName());
            }
            sb.append('\n');
        }
        sb.append("  Tried:");
        int size2 = this.callAdapterFactories.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.callAdapterFactories.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public final <T> Converter<T, RequestBody> nextRequestBodyConverter(@Nullable Converter.Factory factory, Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Utils.checkNotNull(type, "type == null");
        Utils.checkNotNull(annotationArr, "parameterAnnotations == null");
        Utils.checkNotNull(annotationArr2, "methodAnnotations == null");
        int indexOf = this.converterFactories.indexOf(factory) + 1;
        int size = this.converterFactories.size();
        for (int i = indexOf; i < size; i++) {
            Converter<T, RequestBody> converter = (Converter<T, RequestBody>) this.converterFactories.get(i).requestBodyConverter(type, annotationArr, annotationArr2, this);
            if (converter != null) {
                return converter;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate RequestBody converter for ");
        sb.append(type);
        sb.append(".\n");
        if (factory != null) {
            sb.append("  Skipped:");
            for (int i2 = 0; i2 < indexOf; i2++) {
                sb.append("\n   * ");
                sb.append(this.converterFactories.get(i2).getClass().getName());
            }
            sb.append('\n');
        }
        sb.append("  Tried:");
        int size2 = this.converterFactories.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.converterFactories.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public final <T> Converter<ResponseBody, T> nextResponseBodyConverter(@Nullable Converter.Factory factory, Type type, Annotation[] annotationArr) {
        Utils.checkNotNull(type, "type == null");
        Utils.checkNotNull(annotationArr, "annotations == null");
        int indexOf = this.converterFactories.indexOf(factory) + 1;
        int size = this.converterFactories.size();
        for (int i = indexOf; i < size; i++) {
            Converter<ResponseBody, T> converter = (Converter<ResponseBody, T>) this.converterFactories.get(i).responseBodyConverter(type, annotationArr, this);
            if (converter != null) {
                return converter;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate ResponseBody converter for ");
        sb.append(type);
        sb.append(".\n");
        if (factory != null) {
            sb.append("  Skipped:");
            for (int i2 = 0; i2 < indexOf; i2++) {
                sb.append("\n   * ");
                sb.append(this.converterFactories.get(i2).getClass().getName());
            }
            sb.append('\n');
        }
        sb.append("  Tried:");
        int size2 = this.converterFactories.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.converterFactories.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public final <T> Converter<T, RequestBody> requestBodyConverter(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        return nextRequestBodyConverter(null, type, annotationArr, annotationArr2);
    }

    public final <T> Converter<ResponseBody, T> responseBodyConverter(Type type, Annotation[] annotationArr) {
        return nextResponseBodyConverter(null, type, annotationArr);
    }

    public final <T> Converter<T, String> stringConverter(Type type, Annotation[] annotationArr) {
        Utils.checkNotNull(type, "type == null");
        Utils.checkNotNull(annotationArr, "annotations == null");
        int size = this.converterFactories.size();
        for (int i = 0; i < size; i++) {
            Converter<T, String> converter = (Converter<T, String>) this.converterFactories.get(i).stringConverter(type, annotationArr, this);
            if (converter != null) {
                return converter;
            }
        }
        return BuiltInConverters.ToStringConverter.INSTANCE;
    }
}
