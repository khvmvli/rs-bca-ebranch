package o;
/* loaded from: classes-dex2jar.jar:o/setTxbDateFormatted.class */
public abstract class setTxbDateFormatted {

    /* loaded from: classes-dex2jar.jar:o/setTxbDateFormatted$RemoteActionCompatParcelizer.class */
    public enum RemoteActionCompatParcelizer {
        UNKNOWN(0),
        ANDROID_FIREBASE(23);
        
        private final int b;

        RemoteActionCompatParcelizer(int i) {
            this.b = i;
        }
    }

    public abstract setFlagBooking a();

    public abstract RemoteActionCompatParcelizer b();
}
