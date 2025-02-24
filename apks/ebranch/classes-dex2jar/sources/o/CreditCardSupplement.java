package o;

import java.io.IOException;
/* loaded from: classes-dex2jar.jar:o/CreditCardSupplement.class */
final class CreditCardSupplement extends realmSet$incomeDisplayAmount<getSupplementCardLimit, getSupplementCardLimit> {
    @Override // o.realmSet$incomeDisplayAmount
    public final /* bridge */ /* synthetic */ getSupplementCardLimit a(Object obj) {
        return ((setHmKecamatan) obj).zzc;
    }

    @Override // o.realmSet$incomeDisplayAmount
    public final /* synthetic */ getSupplementCardLimit b() {
        return getSupplementCardLimit.d();
    }

    @Override // o.realmSet$incomeDisplayAmount
    public final /* synthetic */ getSupplementCardLimit b(getSupplementCardLimit getsupplementcardlimit, getSupplementCardLimit getsupplementcardlimit2) {
        getSupplementCardLimit getsupplementcardlimit3 = getsupplementcardlimit2;
        return getsupplementcardlimit3.equals(getSupplementCardLimit.a()) ? getsupplementcardlimit : getSupplementCardLimit.c(getsupplementcardlimit, getsupplementcardlimit3);
    }

    @Override // o.realmSet$incomeDisplayAmount
    public final void c(Object obj) {
        ((setHmKecamatan) obj).zzc.b();
    }

    @Override // o.realmSet$incomeDisplayAmount
    public final /* bridge */ /* synthetic */ void c(Object obj, getSupplementCardLimit getsupplementcardlimit) {
        ((setHmKecamatan) obj).zzc = getsupplementcardlimit;
    }

    @Override // o.realmSet$incomeDisplayAmount
    public final /* synthetic */ void c(getSupplementCardLimit getsupplementcardlimit, setEmergencyContactOfficeExt setemergencycontactofficeext) throws IOException {
        getsupplementcardlimit.e(setemergencycontactofficeext);
    }

    @Override // o.realmSet$incomeDisplayAmount
    public final /* synthetic */ int d(getSupplementCardLimit getsupplementcardlimit) {
        return getsupplementcardlimit.e();
    }

    @Override // o.realmSet$incomeDisplayAmount
    public final /* synthetic */ void d(getSupplementCardLimit getsupplementcardlimit, int i, long j) {
        getsupplementcardlimit.b(i << 3, Long.valueOf(j));
    }

    @Override // o.realmSet$incomeDisplayAmount
    public final /* synthetic */ int e(getSupplementCardLimit getsupplementcardlimit) {
        return getsupplementcardlimit.c();
    }
}
