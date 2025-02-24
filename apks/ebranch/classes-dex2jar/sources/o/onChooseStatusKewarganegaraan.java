package o;

import com.google.gson.JsonIOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
/* loaded from: classes-dex2jar.jar:o/onChooseStatusKewarganegaraan.class */
public final class onChooseStatusKewarganegaraan {
    private final CC14FormKartuKreditPekerjaanFragment_ViewBinding b = CC14FormKartuKreditPekerjaanFragment_ViewBinding.c();
    private final Map<Type, BN5PilihNomorOTPFragment<?>> c;

    public onChooseStatusKewarganegaraan(Map<Type, BN5PilihNomorOTPFragment<?>> map) {
        this.c = map;
    }

    private <T> onChange<T> c(Class<? super T> cls) {
        try {
            final Constructor<? super T> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            if (!declaredConstructor.isAccessible()) {
                this.b.a(declaredConstructor);
            }
            return new onChange<T>() { // from class: o.onChooseStatusKewarganegaraan.9
                /* JADX WARN: Type inference failed for: r0v15, types: [T, java.lang.Object] */
                @Override // o.onChange
                public final T c() {
                    try {
                        return declaredConstructor.newInstance(null);
                    } catch (IllegalAccessException e) {
                        throw new AssertionError(e);
                    } catch (InstantiationException e2) {
                        StringBuilder sb = new StringBuilder("Failed to invoke ");
                        sb.append(declaredConstructor);
                        sb.append(" with no args");
                        throw new RuntimeException(sb.toString(), e2);
                    } catch (InvocationTargetException e3) {
                        StringBuilder sb2 = new StringBuilder("Failed to invoke ");
                        sb2.append(declaredConstructor);
                        sb2.append(" with no args");
                        throw new RuntimeException(sb2.toString(), e3.getTargetException());
                    }
                }
            };
        } catch (NoSuchMethodException e) {
            return null;
        }
    }

    public final <T> onChange<T> c(showPekerjaanDialog<T> showpekerjaandialog) {
        final Type type = showpekerjaandialog.e;
        final Class<? super T> cls = showpekerjaandialog.d;
        final BN5PilihNomorOTPFragment<?> bN5PilihNomorOTPFragment = this.c.get(type);
        if (bN5PilihNomorOTPFragment != null) {
            return new onChange<T>() { // from class: o.onChooseStatusKewarganegaraan.2
                /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object] */
                @Override // o.onChange
                public final T c() {
                    return bN5PilihNomorOTPFragment.b();
                }
            };
        }
        final BN5PilihNomorOTPFragment<?> bN5PilihNomorOTPFragment2 = this.c.get(cls);
        if (bN5PilihNomorOTPFragment2 != null) {
            return new onChange<T>() { // from class: o.onChooseStatusKewarganegaraan.7
                /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object] */
                @Override // o.onChange
                public final T c() {
                    return bN5PilihNomorOTPFragment2.b();
                }
            };
        }
        onChange<T> c = c(cls);
        if (c != null) {
            return c;
        }
        onChange<T> r7 = Collection.class.isAssignableFrom(cls) ? SortedSet.class.isAssignableFrom(cls) ? new onChange<T>() { // from class: o.onChooseStatusKewarganegaraan.10
            /* JADX WARN: Type inference failed for: r0v0, types: [T, java.util.TreeSet] */
            @Override // o.onChange
            public final T c() {
                return new TreeSet();
            }
        } : EnumSet.class.isAssignableFrom(cls) ? new onChange<T>() { // from class: o.onChooseStatusKewarganegaraan.8
            /* JADX WARN: Type inference failed for: r0v20, types: [T, java.util.EnumSet] */
            @Override // o.onChange
            public final T c() {
                Type type2 = type;
                if (type2 instanceof ParameterizedType) {
                    Type type3 = ((ParameterizedType) type2).getActualTypeArguments()[0];
                    if (type3 instanceof Class) {
                        return EnumSet.noneOf((Class) type3);
                    }
                    StringBuilder sb = new StringBuilder("Invalid EnumSet type: ");
                    sb.append(type.toString());
                    throw new JsonIOException(sb.toString());
                }
                StringBuilder sb2 = new StringBuilder("Invalid EnumSet type: ");
                sb2.append(type.toString());
                throw new JsonIOException(sb2.toString());
            }
        } : Set.class.isAssignableFrom(cls) ? new onChange<T>() { // from class: o.onChooseStatusKewarganegaraan.12
            /* JADX WARN: Type inference failed for: r0v0, types: [T, java.util.LinkedHashSet] */
            @Override // o.onChange
            public final T c() {
                return new LinkedHashSet();
            }
        } : Queue.class.isAssignableFrom(cls) ? new onChange<T>() { // from class: o.onChooseStatusKewarganegaraan.11
            /* JADX WARN: Type inference failed for: r0v0, types: [T, java.util.ArrayDeque] */
            @Override // o.onChange
            public final T c() {
                return new ArrayDeque();
            }
        } : new onChange<T>() { // from class: o.onChooseStatusKewarganegaraan.13
            /* JADX WARN: Type inference failed for: r0v0, types: [T, java.util.ArrayList] */
            @Override // o.onChange
            public final T c() {
                return new ArrayList();
            }
        } : Map.class.isAssignableFrom(cls) ? ConcurrentNavigableMap.class.isAssignableFrom(cls) ? new onChange<T>() { // from class: o.onChooseStatusKewarganegaraan.15
            /* JADX WARN: Type inference failed for: r0v0, types: [java.util.concurrent.ConcurrentSkipListMap, T] */
            @Override // o.onChange
            public final T c() {
                return new ConcurrentSkipListMap();
            }
        } : ConcurrentMap.class.isAssignableFrom(cls) ? new onChange<T>() { // from class: o.onChooseStatusKewarganegaraan.1
            /* JADX WARN: Type inference failed for: r0v0, types: [T, java.util.concurrent.ConcurrentHashMap] */
            @Override // o.onChange
            public final T c() {
                return new ConcurrentHashMap();
            }
        } : SortedMap.class.isAssignableFrom(cls) ? new onChange<T>() { // from class: o.onChooseStatusKewarganegaraan.3
            /* JADX WARN: Type inference failed for: r0v0, types: [java.util.TreeMap, T] */
            @Override // o.onChange
            public final T c() {
                return new TreeMap();
            }
        } : (!(type instanceof ParameterizedType) || String.class.isAssignableFrom(new showPekerjaanDialog(((ParameterizedType) type).getActualTypeArguments()[0]).d)) ? new onChange<T>() { // from class: o.onChooseStatusKewarganegaraan.4
            /* JADX WARN: Type inference failed for: r0v0, types: [o.BaseFragment, T] */
            @Override // o.onChange
            public final T c() {
                return new BaseFragment();
            }
        } : new onChange<T>() { // from class: o.onChooseStatusKewarganegaraan.5
            /* JADX WARN: Type inference failed for: r0v0, types: [java.util.LinkedHashMap, T] */
            @Override // o.onChange
            public final T c() {
                return new LinkedHashMap();
            }
        } : null;
        return r7 != null ? r7 : new onChange<T>() { // from class: o.onChooseStatusKewarganegaraan.6
            private final CC10PasporFormKartuKreditFragment_ViewBinding e = CC10PasporFormKartuKreditFragment_ViewBinding.b();

            /* JADX WARN: Type inference failed for: r0v8, types: [T, java.lang.Object] */
            @Override // o.onChange
            public final T c() {
                try {
                    return this.e.c(cls);
                } catch (Exception e) {
                    StringBuilder sb = new StringBuilder("Unable to invoke no-args constructor for ");
                    sb.append(type);
                    sb.append(". Registering an InstanceCreator with Gson for this type may fix this problem.");
                    throw new RuntimeException(sb.toString(), e);
                }
            }
        };
    }

    public final String toString() {
        return this.c.toString();
    }
}
