package o;

import android.util.Log;
/* loaded from: classes-dex2jar.jar:o/setOfficeProvince.class */
public abstract class setOfficeProvince {
    final /* synthetic */ setCitizenValue a;
    private boolean b = false;
    private Object d;

    public setOfficeProvince(setCitizenValue setcitizenvalue, Object obj) {
        this.a = setcitizenvalue;
        this.d = obj;
    }

    public final void a() {
        b();
        synchronized (this.a.u) {
            this.a.u.remove(this);
        }
    }

    public final void b() {
        synchronized (this) {
            this.d = null;
        }
    }

    public final void c() {
        Object obj;
        synchronized (this) {
            obj = this.d;
            if (this.b) {
                String obj2 = toString();
                Log.w("GmsClient", "Callback proxy " + obj2 + " being reused. This is not safe.");
            }
        }
        if (obj != null) {
            try {
                d(obj);
            } catch (RuntimeException e) {
                throw e;
            }
        }
        synchronized (this) {
            this.b = true;
        }
        a();
    }

    protected abstract void d(Object obj);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void e();
}
