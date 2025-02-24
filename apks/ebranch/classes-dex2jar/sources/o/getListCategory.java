package o;

import com.bumptech.glide.Registry;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import o.GetAcctOpeningCategoryDataResponse;
import o.getAmountKliring;
import o.onFindViewById;
/* loaded from: classes-dex2jar.jar:o/getListCategory.class */
public final class getListCategory {
    private final Set<write<?, ?>> c;
    private final getListCategory$MediaBrowserCompat$CustomActionResultReceiver d;
    private final List<write<?, ?>> e;
    private final onFindViewById.write<List<Throwable>> h;
    private static final getListCategory$MediaBrowserCompat$CustomActionResultReceiver b = new getListCategory$MediaBrowserCompat$CustomActionResultReceiver();
    private static final getAmountKliring<Object, Object> a = new RemoteActionCompatParcelizer();

    /* loaded from: classes-dex2jar.jar:o/getListCategory$RemoteActionCompatParcelizer.class */
    static final class RemoteActionCompatParcelizer implements getAmountKliring<Object, Object> {
        RemoteActionCompatParcelizer() {
        }

        @Override // o.getAmountKliring
        public final boolean a(Object obj) {
            return false;
        }

        @Override // o.getAmountKliring
        public final getAmountKliring.write<Object> c(Object obj, int i, int i2, CategoryResponse categoryResponse) {
            return null;
        }
    }

    /* loaded from: classes-dex2jar.jar:o/getListCategory$write.class */
    public static final class write<Model, Data> {
        final Class<Data> a;
        final Class<Model> c;
        final GetAcctOpeningCategoryDataResponse<? extends Model, ? extends Data> d;

        public write(Class<Model> cls, Class<Data> cls2, GetAcctOpeningCategoryDataResponse<? extends Model, ? extends Data> getAcctOpeningCategoryDataResponse) {
            this.c = cls;
            this.a = cls2;
            this.d = getAcctOpeningCategoryDataResponse;
        }
    }

    public getListCategory(onFindViewById.write<List<Throwable>> write2) {
        this(write2, b);
    }

    private getListCategory(onFindViewById.write<List<Throwable>> write2, getListCategory$MediaBrowserCompat$CustomActionResultReceiver getlistcategory_mediabrowsercompat_customactionresultreceiver) {
        this.e = new ArrayList();
        this.c = new HashSet();
        this.h = write2;
        this.d = getlistcategory_mediabrowsercompat_customactionresultreceiver;
    }

    private <Model, Data> getAmountKliring<Model, Data> d(write<?, ?> write2) {
        getAmountKliring<? extends Object, ? extends Object> e = write2.d.e(this);
        if (e != null) {
            return (getAmountKliring<Model, Data>) e;
        }
        throw new NullPointerException("Argument must not be null");
    }

    public final <Model> List<getAmountKliring<Model, ?>> a(Class<Model> cls) {
        ArrayList arrayList;
        synchronized (this) {
            try {
                arrayList = new ArrayList();
                for (write<?, ?> write2 : this.e) {
                    if (!this.c.contains(write2) && write2.c.isAssignableFrom(cls)) {
                        this.c.add(write2);
                        arrayList.add(d(write2));
                        this.c.remove(write2);
                    }
                }
            } finally {
                throw th;
            }
        }
        return arrayList;
    }

    <Model, Data> void a(Class<Model> cls, Class<Data> cls2, GetAcctOpeningCategoryDataResponse<? extends Model, ? extends Data> getAcctOpeningCategoryDataResponse, boolean z) {
        write<?, ?> write2 = new write<>(cls, cls2, getAcctOpeningCategoryDataResponse);
        List<write<?, ?>> list = this.e;
        list.add(list.size(), write2);
    }

    public final <Model, Data> getAmountKliring<Model, Data> b(Class<Model> cls, Class<Data> cls2) {
        synchronized (this) {
            try {
                ArrayList arrayList = new ArrayList();
                boolean z = false;
                for (write<?, ?> write2 : this.e) {
                    if (this.c.contains(write2)) {
                        z = true;
                    } else if (write2.c.isAssignableFrom(cls) && write2.a.isAssignableFrom(cls2)) {
                        this.c.add(write2);
                        arrayList.add(d(write2));
                        this.c.remove(write2);
                    }
                }
                if (arrayList.size() > 1) {
                    return new GetAcctOpeningCategoryDataResponse.CategoryAcct(arrayList, this.h);
                } else if (arrayList.size() == 1) {
                    return (getAmountKliring) arrayList.get(0);
                } else if (z) {
                    return (getAmountKliring<Model, Data>) a;
                } else {
                    throw new Registry.NoModelLoaderAvailableException((Class<?>) cls, (Class<?>) cls2);
                }
            } finally {
                throw th;
            }
        }
    }

    public final List<Class<?>> d(Class<?> cls) {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList();
            for (write<?, ?> write2 : this.e) {
                if (!arrayList.contains(write2.a) && write2.c.isAssignableFrom(cls)) {
                    arrayList.add(write2.a);
                }
            }
        }
        return arrayList;
    }

    public final <Model, Data> void d(Class<Model> cls, Class<Data> cls2, GetAcctOpeningCategoryDataResponse<? extends Model, ? extends Data> getAcctOpeningCategoryDataResponse) {
        synchronized (this) {
            a(cls, cls2, getAcctOpeningCategoryDataResponse, true);
        }
    }
}
