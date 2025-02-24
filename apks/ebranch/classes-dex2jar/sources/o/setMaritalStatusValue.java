package o;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.IInterface;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/setMaritalStatusValue.class */
public abstract class setMaritalStatusValue extends setOfficeProvince {
    public final Bundle b;
    final /* synthetic */ setCitizenValue c;
    public final int d;

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setMaritalStatusValue(setCitizenValue setcitizenvalue, int i, Bundle bundle) {
        super(setcitizenvalue, true);
        this.c = setcitizenvalue;
        this.d = i;
        this.b = bundle;
    }

    protected abstract void c(realmGet$jobValue realmget_jobvalue);

    @Override // o.setOfficeProvince
    protected final /* synthetic */ void d(Object obj) {
        PendingIntent pendingIntent = null;
        if (this.d != 0) {
            this.c.d(1, (IInterface) null);
            Bundle bundle = this.b;
            if (bundle != null) {
                pendingIntent = (PendingIntent) bundle.getParcelable("pendingIntent");
            }
            c(new realmGet$jobValue(this.d, pendingIntent));
        } else if (!d()) {
            this.c.d(1, (IInterface) null);
            c(new realmGet$jobValue(8, null));
        }
    }

    protected abstract boolean d();

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.setOfficeProvince
    public final void e() {
    }
}
