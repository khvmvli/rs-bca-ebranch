package o;

import o.setTxbDateFormatted;
/* loaded from: classes-dex2jar.jar:o/setHeader.class */
final class setHeader extends setTxbDateFormatted {
    private final setTxbDateFormatted.RemoteActionCompatParcelizer c;
    private final setFlagBooking e;

    /* loaded from: classes-dex2jar.jar:o/setHeader$write.class */
    public static final class write extends setTxbDateFormatted$MediaBrowserCompat$CustomActionResultReceiver {
        private setTxbDateFormatted.RemoteActionCompatParcelizer a;
        private setFlagBooking c;

        @Override // o.setTxbDateFormatted$MediaBrowserCompat$CustomActionResultReceiver
        public final setTxbDateFormatted a() {
            return new setHeader(this.a, this.c, (byte) 0);
        }

        @Override // o.setTxbDateFormatted$MediaBrowserCompat$CustomActionResultReceiver
        public final setTxbDateFormatted$MediaBrowserCompat$CustomActionResultReceiver c(setFlagBooking setflagbooking) {
            this.c = setflagbooking;
            return this;
        }

        @Override // o.setTxbDateFormatted$MediaBrowserCompat$CustomActionResultReceiver
        public final setTxbDateFormatted$MediaBrowserCompat$CustomActionResultReceiver e(setTxbDateFormatted.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
            this.a = remoteActionCompatParcelizer;
            return this;
        }
    }

    private setHeader(setTxbDateFormatted.RemoteActionCompatParcelizer remoteActionCompatParcelizer, setFlagBooking setflagbooking) {
        this.c = remoteActionCompatParcelizer;
        this.e = setflagbooking;
    }

    /* synthetic */ setHeader(setTxbDateFormatted.RemoteActionCompatParcelizer remoteActionCompatParcelizer, setFlagBooking setflagbooking, byte b) {
        this(remoteActionCompatParcelizer, setflagbooking);
    }

    @Override // o.setTxbDateFormatted
    public final setFlagBooking a() {
        return this.e;
    }

    @Override // o.setTxbDateFormatted
    public final setTxbDateFormatted.RemoteActionCompatParcelizer b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof setTxbDateFormatted)) {
            return false;
        }
        setTxbDateFormatted settxbdateformatted = (setTxbDateFormatted) obj;
        setTxbDateFormatted.RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.c;
        if (remoteActionCompatParcelizer != null ? remoteActionCompatParcelizer.equals(settxbdateformatted.b()) : settxbdateformatted.b() == null) {
            setFlagBooking setflagbooking = this.e;
            return setflagbooking != null ? z : z;
        }
        z = false;
    }

    public final int hashCode() {
        setTxbDateFormatted.RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.c;
        int i = 0;
        int hashCode = remoteActionCompatParcelizer == null ? 0 : remoteActionCompatParcelizer.hashCode();
        setFlagBooking setflagbooking = this.e;
        if (setflagbooking != null) {
            i = setflagbooking.hashCode();
        }
        return ((hashCode ^ 1000003) * 1000003) ^ i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClientInfo{clientType=");
        sb.append(this.c);
        sb.append(", androidClientInfo=");
        sb.append(this.e);
        sb.append("}");
        return sb.toString();
    }
}
