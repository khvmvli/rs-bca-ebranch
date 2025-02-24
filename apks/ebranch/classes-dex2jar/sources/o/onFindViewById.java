package o;
/* loaded from: classes-dex2jar.jar:o/onFindViewById.class */
public final class onFindViewById {

    /* loaded from: classes-dex2jar.jar:o/onFindViewById$RemoteActionCompatParcelizer.class */
    public static class RemoteActionCompatParcelizer<T> implements write<T> {
        private final Object[] a;
        private int c;

        public RemoteActionCompatParcelizer(int i) {
            if (i > 0) {
                this.a = new Object[i];
                return;
            }
            throw new IllegalArgumentException("The max pool size must be > 0");
        }

        @Override // o.onFindViewById.write
        public T a() {
            int i = this.c;
            if (i <= 0) {
                return null;
            }
            int i2 = i - 1;
            Object[] objArr = this.a;
            T t = (T) objArr[i2];
            objArr[i2] = null;
            this.c = i2;
            return t;
        }

        @Override // o.onFindViewById.write
        public boolean c(T t) {
            boolean z;
            int i = 0;
            while (true) {
                if (i >= this.c) {
                    z = false;
                    break;
                } else if (this.a[i] == t) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
            if (!z) {
                int i2 = this.c;
                Object[] objArr = this.a;
                if (i2 >= objArr.length) {
                    return false;
                }
                objArr[i2] = t;
                this.c = i2 + 1;
                return true;
            }
            throw new IllegalStateException("Already in the pool!");
        }
    }

    /* loaded from: classes-dex2jar.jar:o/onFindViewById$read.class */
    public static final class read<T> extends RemoteActionCompatParcelizer<T> {
        private final Object e = new Object();

        public read(int i) {
            super(i);
        }

        @Override // o.onFindViewById.RemoteActionCompatParcelizer, o.onFindViewById.write
        public final T a() {
            T a;
            synchronized (this.e) {
                a = a();
            }
            return a;
        }

        @Override // o.onFindViewById.RemoteActionCompatParcelizer, o.onFindViewById.write
        public final boolean c(T t) {
            boolean c;
            synchronized (this.e) {
                c = c(t);
            }
            return c;
        }
    }

    /* loaded from: classes-dex2jar.jar:o/onFindViewById$write.class */
    public interface write<T> {
        T a();

        boolean c(T t);
    }
}
