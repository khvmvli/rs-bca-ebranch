package o;
/* loaded from: classes2-dex2jar.jar:o/onClickedSetiapHari.class */
public final class onClickedSetiapHari<T> {
    public final T c;
    public final int e;

    public onClickedSetiapHari(int i, T t) {
        this.e = i;
        this.c = t;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof onClickedSetiapHari)) {
            return false;
        }
        onClickedSetiapHari onclickedsetiaphari = (onClickedSetiapHari) obj;
        return this.e == onclickedsetiaphari.e && subscribeReservationRescheduleEvent.b(this.c, onclickedsetiaphari.c);
    }

    public final int hashCode() {
        int i = this.e;
        T t = this.c;
        return (i * 31) + (t == null ? 0 : t.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IndexedValue(index=");
        sb.append(this.e);
        sb.append(", value=");
        sb.append(this.c);
        sb.append(')');
        return sb.toString();
    }
}
