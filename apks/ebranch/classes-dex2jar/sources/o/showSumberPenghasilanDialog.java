package o;

import java.io.Serializable;
/* loaded from: classes-dex2jar.jar:o/showSumberPenghasilanDialog.class */
public final class showSumberPenghasilanDialog<A, B> implements Serializable {
    public final B a;
    public final A c;

    public showSumberPenghasilanDialog(A a, B b) {
        this.c = a;
        this.a = b;
    }

    @Override // java.lang.Object
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof showSumberPenghasilanDialog)) {
            return false;
        }
        showSumberPenghasilanDialog showsumberpenghasilandialog = (showSumberPenghasilanDialog) obj;
        return subscribeReservationRescheduleEvent.b(this.c, showsumberpenghasilandialog.c) && subscribeReservationRescheduleEvent.b(this.a, showsumberpenghasilandialog.a);
    }

    @Override // java.lang.Object
    public final int hashCode() {
        A a = this.c;
        int i = 0;
        int hashCode = a == null ? 0 : a.hashCode();
        B b = this.a;
        if (b != null) {
            i = b.hashCode();
        }
        return (hashCode * 31) + i;
    }

    @Override // java.lang.Object
    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(this.c);
        sb.append(", ");
        sb.append(this.a);
        sb.append(')');
        return sb.toString();
    }
}
