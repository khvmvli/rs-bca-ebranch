package o;
/* loaded from: classes-dex2jar.jar:o/setEmergencyContactName.class */
final class setEmergencyContactName {
    private final int a;
    private final Object c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public setEmergencyContactName(Object obj, int i) {
        this.c = obj;
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof setEmergencyContactName)) {
            return false;
        }
        setEmergencyContactName setemergencycontactname = (setEmergencyContactName) obj;
        return this.c == setemergencycontactname.c && this.a == setemergencycontactname.a;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.c) * 65535) + this.a;
    }
}
