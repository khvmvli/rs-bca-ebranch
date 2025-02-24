package o;

import java.io.Serializable;
/* loaded from: classes2-dex2jar.jar:o/Page6KLFragment.class */
public final class Page6KLFragment<T> implements Serializable {
    public static final Page6KLFragment$MediaBrowserCompat$CustomActionResultReceiver a = new Page6KLFragment$MediaBrowserCompat$CustomActionResultReceiver((byte) 0);
    private final Object e;

    /* loaded from: classes2-dex2jar.jar:o/Page6KLFragment$IconCompatParcelizer.class */
    public static final class IconCompatParcelizer implements Serializable {
        public final Throwable d;

        public IconCompatParcelizer(Throwable th) {
            subscribeReservationRescheduleEvent.e(th, "");
            this.d = th;
        }

        @Override // java.lang.Object
        public final boolean equals(Object obj) {
            return (obj instanceof IconCompatParcelizer) && subscribeReservationRescheduleEvent.b(this.d, ((IconCompatParcelizer) obj).d);
        }

        @Override // java.lang.Object
        public final int hashCode() {
            return this.d.hashCode();
        }

        @Override // java.lang.Object
        public final String toString() {
            StringBuilder sb = new StringBuilder("Failure(");
            sb.append(this.d);
            sb.append(')');
            return sb.toString();
        }
    }

    public static final boolean b(Object obj) {
        return obj instanceof IconCompatParcelizer;
    }

    public static final boolean c(Object obj) {
        return !(obj instanceof IconCompatParcelizer);
    }

    public static <T> Object d(Object obj) {
        return obj;
    }

    public static final Throwable e(Object obj) {
        return obj instanceof IconCompatParcelizer ? ((IconCompatParcelizer) obj).d : null;
    }

    @Override // java.lang.Object
    public final boolean equals(Object obj) {
        return (obj instanceof Page6KLFragment) && subscribeReservationRescheduleEvent.b(this.e, ((Page6KLFragment) obj).e);
    }

    @Override // java.lang.Object
    public final int hashCode() {
        Object obj = this.e;
        return obj == null ? 0 : obj.hashCode();
    }

    @Override // java.lang.Object
    public final String toString() {
        String str;
        Object obj = this.e;
        if (obj instanceof IconCompatParcelizer) {
            str = ((IconCompatParcelizer) obj).toString();
        } else {
            StringBuilder sb = new StringBuilder("Success(");
            sb.append(obj);
            sb.append(')');
            str = sb.toString();
        }
        return str;
    }
}
