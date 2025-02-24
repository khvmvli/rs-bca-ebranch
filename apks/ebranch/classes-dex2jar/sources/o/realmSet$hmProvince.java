package o;

import o.setCitizenValue;
/* loaded from: classes-dex2jar.jar:o/realmSet$hmProvince.class */
public final class realmSet$hmProvince implements setCitizenValue.write {
    final /* synthetic */ realmSet$hmPhoneNumber d;

    public realmSet$hmProvince(realmSet$hmPhoneNumber realmset_hmphonenumber) {
        this.d = realmset_hmphonenumber;
    }

    @Override // o.setCitizenValue.write
    public final void d() {
        this.d.b.e.post(new Runnable() { // from class: o.realmSet$hmRT
            @Override // java.lang.Runnable
            public final void run() {
                realmSet$hmPhoneNumber realmset_hmphonenumber = realmSet$hmProvince.this.d;
                realmset_hmphonenumber.c.c(String.valueOf(realmset_hmphonenumber.c.getClass().getName()).concat(" disconnecting because it was signed out."));
            }
        });
    }
}
