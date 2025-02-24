package o;

import o.ProsesTarikanFragment_ViewBinding;
/* loaded from: classes2-dex2jar.jar:o/KliringPresenter.class */
public final class KliringPresenter extends ProsesORFragment_ViewBinding {
    public static final RemoteActionCompatParcelizer e = new RemoteActionCompatParcelizer((byte) 0);
    final String d;

    /* loaded from: classes2-dex2jar.jar:o/KliringPresenter$RemoteActionCompatParcelizer.class */
    public static final class RemoteActionCompatParcelizer implements ProsesTarikanFragment_ViewBinding.read<KliringPresenter> {
        private RemoteActionCompatParcelizer() {
        }

        public /* synthetic */ RemoteActionCompatParcelizer(byte b) {
            this();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof KliringPresenter) && subscribeReservationRescheduleEvent.b(this.d, ((KliringPresenter) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CoroutineName(");
        sb.append(this.d);
        sb.append(')');
        return sb.toString();
    }
}
