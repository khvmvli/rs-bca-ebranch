package o;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes-dex2jar.jar:o/GetDaftarPekerjaanResponse$$Parcelable.class */
public final class GetDaftarPekerjaanResponse$$Parcelable {
    private final List<String> d = new ArrayList();
    private final Map<String, List<read<?, ?>>> e = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/GetDaftarPekerjaanResponse$$Parcelable$read.class */
    public static final class read<T, R> {
        final Class<R> c;
        final CategoryResponse$$Parcelable<T, R> d;
        private final Class<T> e;

        public read(Class<T> cls, Class<R> cls2, CategoryResponse$$Parcelable<T, R> categoryResponse$$Parcelable) {
            this.e = cls;
            this.c = cls2;
            this.d = categoryResponse$$Parcelable;
        }

        public final boolean e(Class<?> cls, Class<?> cls2) {
            return this.e.isAssignableFrom(cls) && cls2.isAssignableFrom(this.c);
        }
    }

    private List<read<?, ?>> b(String str) {
        List<read<?, ?>> list;
        synchronized (this) {
            if (!this.d.contains(str)) {
                this.d.add(str);
            }
            List<read<?, ?>> list2 = this.e.get(str);
            list = list2;
            if (list2 == null) {
                list = new ArrayList<>();
                this.e.put(str, list);
            }
        }
        return list;
    }

    public final <T, R> List<Class<R>> a(Class<T> cls, Class<R> cls2) {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList();
            for (String str : this.d) {
                List<read<?, ?>> list = this.e.get(str);
                if (list != null) {
                    for (read<?, ?> read2 : list) {
                        if (read2.e(cls, cls2) && !arrayList.contains(read2.c)) {
                            arrayList.add(read2.c);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public final <T, R> void a(String str, CategoryResponse$$Parcelable<T, R> categoryResponse$$Parcelable, Class<T> cls, Class<R> cls2) {
        synchronized (this) {
            b(str).add(new read<>(cls, cls2, categoryResponse$$Parcelable));
        }
    }

    public final void a(List<String> list) {
        synchronized (this) {
            ArrayList<String> arrayList = new ArrayList(this.d);
            this.d.clear();
            for (String str : list) {
                this.d.add(str);
            }
            for (String str2 : arrayList) {
                if (!list.contains(str2)) {
                    this.d.add(str2);
                }
            }
        }
    }

    public final <T, R> List<CategoryResponse$$Parcelable<T, R>> b(Class<T> cls, Class<R> cls2) {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList();
            for (String str : this.d) {
                List<read<?, ?>> list = this.e.get(str);
                if (list != null) {
                    for (read<?, ?> read2 : list) {
                        if (read2.e(cls, cls2)) {
                            arrayList.add(read2.d);
                        }
                    }
                }
            }
        }
        return arrayList;
    }
}
