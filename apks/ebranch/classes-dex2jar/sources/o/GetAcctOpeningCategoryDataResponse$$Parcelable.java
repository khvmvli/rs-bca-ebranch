package o;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o.onFindViewById;
/* loaded from: classes-dex2jar.jar:o/GetAcctOpeningCategoryDataResponse$$Parcelable.class */
public final class GetAcctOpeningCategoryDataResponse$$Parcelable {
    public final write b;
    public final getListCategory d;

    /* loaded from: classes-dex2jar.jar:o/GetAcctOpeningCategoryDataResponse$$Parcelable$write.class */
    public static final class write {
        public final Map<Class<?>, read<?>> c = new HashMap();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes-dex2jar.jar:o/GetAcctOpeningCategoryDataResponse$$Parcelable$write$read.class */
        public static final class read<Model> {
            final List<getAmountKliring<Model, ?>> b;

            public read(List<getAmountKliring<Model, ?>> list) {
                this.b = list;
            }
        }

        write() {
        }
    }

    private GetAcctOpeningCategoryDataResponse$$Parcelable(getListCategory getlistcategory) {
        this.b = new write();
        this.d = getlistcategory;
    }

    public GetAcctOpeningCategoryDataResponse$$Parcelable(onFindViewById.write<List<Throwable>> write2) {
        this(new getListCategory(write2));
    }

    public final List<Class<?>> b(Class<?> cls) {
        List<Class<?>> d;
        synchronized (this) {
            d = this.d.d(cls);
        }
        return d;
    }

    public <A> List<getAmountKliring<A, ?>> d(Class<A> cls) {
        List<getAmountKliring<A, ?>> list;
        synchronized (this) {
            write.read<?> read = this.b.c.get(cls);
            List<getAmountKliring<?, ?>> list2 = read == null ? null : read.b;
            list = list2 == 1 ? 1 : 0;
            if (list2 == null) {
                list = Collections.unmodifiableList(this.d.a(cls));
                if (this.b.c.put(cls, new write.read<>(list)) != null) {
                    StringBuilder sb = new StringBuilder("Already cached loaders for model: ");
                    sb.append(cls);
                    throw new IllegalStateException(sb.toString());
                }
            }
        }
        return list;
    }
}
