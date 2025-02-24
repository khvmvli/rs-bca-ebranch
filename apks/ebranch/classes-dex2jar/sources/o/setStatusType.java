package o;

import o.setTypeDraft;
/* loaded from: classes-dex2jar.jar:o/setStatusType.class */
final class setStatusType extends setTypeDraft {
    private final setTypeDraft.write b;
    private final setTypeDraft.IconCompatParcelizer c;

    /* loaded from: classes-dex2jar.jar:o/setStatusType$read.class */
    public static final class read extends setTypeDraft.read {
        private setTypeDraft.IconCompatParcelizer a;
        private setTypeDraft.write c;

        @Override // o.setTypeDraft.read
        public final setTypeDraft.read a(setTypeDraft.IconCompatParcelizer iconCompatParcelizer) {
            this.a = iconCompatParcelizer;
            return this;
        }

        @Override // o.setTypeDraft.read
        public final setTypeDraft a() {
            return new setStatusType(this.c, this.a, (byte) 0);
        }

        @Override // o.setTypeDraft.read
        public final setTypeDraft.read d(setTypeDraft.write write) {
            this.c = write;
            return this;
        }
    }

    private setStatusType(setTypeDraft.write write, setTypeDraft.IconCompatParcelizer iconCompatParcelizer) {
        this.b = write;
        this.c = iconCompatParcelizer;
    }

    /* synthetic */ setStatusType(setTypeDraft.write write, setTypeDraft.IconCompatParcelizer iconCompatParcelizer, byte b) {
        this(write, iconCompatParcelizer);
    }

    @Override // o.setTypeDraft
    public final setTypeDraft.IconCompatParcelizer a() {
        return this.c;
    }

    @Override // o.setTypeDraft
    public final setTypeDraft.write b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof setTypeDraft)) {
            return false;
        }
        setTypeDraft settypedraft = (setTypeDraft) obj;
        setTypeDraft.write write = this.b;
        if (write != null ? write.equals(settypedraft.b()) : settypedraft.b() == null) {
            setTypeDraft.IconCompatParcelizer iconCompatParcelizer = this.c;
            return iconCompatParcelizer != null ? z : z;
        }
        z = false;
    }

    public final int hashCode() {
        setTypeDraft.write write = this.b;
        int i = 0;
        int hashCode = write == null ? 0 : write.hashCode();
        setTypeDraft.IconCompatParcelizer iconCompatParcelizer = this.c;
        if (iconCompatParcelizer != null) {
            i = iconCompatParcelizer.hashCode();
        }
        return ((hashCode ^ 1000003) * 1000003) ^ i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkConnectionInfo{networkType=");
        sb.append(this.b);
        sb.append(", mobileSubtype=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }
}
