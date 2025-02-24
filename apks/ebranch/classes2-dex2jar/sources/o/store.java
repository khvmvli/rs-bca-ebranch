package o;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2-dex2jar.jar:o/store.class */
public final class store {
    final enableDumpapp a;
    final Object c;
    volatile boolean e = true;

    store(Object obj, enableDumpapp enabledumpapp) {
        this.c = obj;
        this.a = enabledumpapp;
    }

    public final boolean equals(Object obj) {
        boolean z = false;
        if (obj instanceof store) {
            store store = (store) obj;
            z = false;
            if (this.c == store.c) {
                z = false;
                if (this.a.equals(store.a)) {
                    z = true;
                }
            }
        }
        return z;
    }

    public final int hashCode() {
        return this.c.hashCode() + this.a.a.hashCode();
    }
}
