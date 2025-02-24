package o;
/* loaded from: classes-dex2jar.jar:o/realmSet$currOfficeAddress.class */
public final class realmSet$currOfficeAddress extends setFlagOtherCC<realmSet$currOfficeBusinessField, realmSet$currOfficeAddress> {
    private realmSet$currOfficeAddress() {
        super(realmSet$currOfficeBusinessField.zzg);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ realmSet$currOfficeAddress(realmGet$prevCompanyName realmget_prevcompanyname) {
        super(realmSet$currOfficeBusinessField.zzg);
    }

    public final realmSet$currOfficeAddress a(Iterable<? extends Long> iterable) {
        if (this.c) {
            u();
            this.c = false;
        }
        realmSet$currOfficeBusinessField.e((realmSet$currOfficeBusinessField) this.b, iterable);
        return this;
    }

    public final realmSet$currOfficeAddress d(int i) {
        if (this.c) {
            u();
            this.c = false;
        }
        realmSet$currOfficeBusinessField.a((realmSet$currOfficeBusinessField) this.b, i);
        return this;
    }
}
