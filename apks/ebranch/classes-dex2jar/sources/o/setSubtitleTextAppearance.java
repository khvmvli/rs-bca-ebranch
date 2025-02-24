package o;

import io.realm.internal.Property;
/* loaded from: classes-dex2jar.jar:o/setSubtitleTextAppearance.class */
final class setSubtitleTextAppearance {

    /* loaded from: classes-dex2jar.jar:o/setSubtitleTextAppearance$RemoteActionCompatParcelizer.class */
    static final class RemoteActionCompatParcelizer<T> implements read<T> {
        private final Object[] b = new Object[Property.TYPE_SET];
        private int d;

        /* JADX INFO: Access modifiers changed from: package-private */
        public RemoteActionCompatParcelizer(int i) {
        }

        @Override // o.setSubtitleTextAppearance.read
        public final void a(T[] tArr, int i) {
            int i2 = i;
            if (i > tArr.length) {
                i2 = tArr.length;
            }
            for (int i3 = 0; i3 < i2; i3++) {
                T t = tArr[i3];
                int i4 = this.d;
                Object[] objArr = this.b;
                if (i4 < objArr.length) {
                    objArr[i4] = t;
                    this.d = i4 + 1;
                }
            }
        }

        @Override // o.setSubtitleTextAppearance.read
        public final T b() {
            int i = this.d;
            if (i <= 0) {
                return null;
            }
            int i2 = i - 1;
            Object[] objArr = this.b;
            T t = (T) objArr[i2];
            objArr[i2] = null;
            this.d = i2;
            return t;
        }

        @Override // o.setSubtitleTextAppearance.read
        public final boolean d(T t) {
            int i = this.d;
            Object[] objArr = this.b;
            if (i >= objArr.length) {
                return false;
            }
            objArr[i] = t;
            this.d = i + 1;
            return true;
        }
    }

    /* loaded from: classes-dex2jar.jar:o/setSubtitleTextAppearance$read.class */
    interface read<T> {
        void a(T[] tArr, int i);

        T b();

        boolean d(T t);
    }
}
