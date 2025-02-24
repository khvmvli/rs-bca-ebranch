package o;

import android.os.Bundle;
/* loaded from: classes-dex2jar.jar:o/setPurposePemRekOthers.class */
public final class setPurposePemRekOthers extends setMaritalStatusValue {
    final /* synthetic */ setCitizenValue e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setPurposePemRekOthers(setCitizenValue setcitizenvalue, int i, Bundle bundle) {
        super(setcitizenvalue, i, null);
        this.e = setcitizenvalue;
    }

    @Override // o.setMaritalStatusValue
    protected final void c(realmGet$jobValue realmget_jobvalue) {
        if (!this.e.k() || !setCitizenValue.j(this.e)) {
            this.e.a.c(realmget_jobvalue);
            this.e.a(realmget_jobvalue);
            return;
        }
        setCitizenValue.d(this.e, 16);
    }

    @Override // o.setMaritalStatusValue
    protected final boolean d() {
        this.e.a.c(realmGet$jobValue.e);
        return true;
    }
}
