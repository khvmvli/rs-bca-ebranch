package o;
/* loaded from: classes-dex2jar.jar:o/realmSet$image.class */
public final class realmSet$image<V> {
    private static final Object e = new Object();
    private final V a;
    private final realmSet$editable<V> b;
    private final String c;
    private final V d;
    private final Object j = new Object();
    private volatile V i = null;
    private volatile V f = null;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ realmSet$image(String str, Object obj, Object obj2, realmSet$editable realmset_editable, realmGet$receiverNameTeller realmget_receivernameteller) {
        this.c = str;
        this.a = obj;
        this.d = obj2;
        this.b = realmset_editable;
    }

    public final V d(V v) {
        V v2;
        synchronized (this.j) {
        }
        if (v != null) {
            return v;
        }
        if (realmSet$codeTransaksi.a == null) {
            return this.a;
        }
        synchronized (e) {
            if (setSetorans.a()) {
                return this.f == null ? this.a : this.f;
            }
            try {
                for (realmSet$image realmset_image : realmSet$hasDone.aE) {
                    if (!setSetorans.a()) {
                        try {
                            realmSet$editable<V> realmset_editable = realmset_image.b;
                            v2 = null;
                            if (realmset_editable != null) {
                                v2 = realmset_editable.a();
                            }
                        } catch (IllegalStateException e2) {
                            v2 = null;
                        }
                        synchronized (e) {
                            realmset_image.f = v2;
                        }
                    } else {
                        throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                    }
                }
            } catch (SecurityException e3) {
            }
            realmSet$editable<V> realmset_editable2 = this.b;
            if (realmset_editable2 == null) {
                return this.a;
            }
            try {
                return realmset_editable2.a();
            } catch (IllegalStateException e4) {
                return this.a;
            } catch (SecurityException e5) {
                return this.a;
            }
        }
    }

    public final String d() {
        return this.c;
    }
}
