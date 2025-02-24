package o;
/* loaded from: classes-dex2jar.jar:o/setBankStatesName.class */
public abstract class setBankStatesName {

    /* loaded from: classes-dex2jar.jar:o/setBankStatesName$write.class */
    public static final class write extends setBankStatesName {
        private volatile boolean a;

        public write() {
            super((byte) 0);
        }

        @Override // o.setBankStatesName
        public final void c() {
            if (this.a) {
                throw new IllegalStateException("Already released");
            }
        }

        @Override // o.setBankStatesName
        public final void d(boolean z) {
            this.a = z;
        }
    }

    private setBankStatesName() {
    }

    /* synthetic */ setBankStatesName(byte b) {
        this();
    }

    public abstract void c();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void d(boolean z);
}
