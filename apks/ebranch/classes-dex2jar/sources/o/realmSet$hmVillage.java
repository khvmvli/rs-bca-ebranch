package o;

import android.util.Log;
import java.util.Set;
import o.setCitizenValue;
/* loaded from: classes-dex2jar.jar:o/realmSet$hmVillage.class */
public final class realmSet$hmVillage implements setCitizenValue.RemoteActionCompatParcelizer, realmSet$occupationFlagFreeText {
    final /* synthetic */ realmGet$resCity b;
    private final realmGet$religion c;
    private final realmGet$name$MediaBrowserCompat$SearchResultReceiver e;
    private setExpID a = null;
    private Set d = null;
    private boolean i = false;

    public realmSet$hmVillage(realmGet$resCity realmget_rescity, realmGet$name$MediaBrowserCompat$SearchResultReceiver realmget_name_mediabrowsercompat_searchresultreceiver, realmGet$religion realmget_religion) {
        this.b = realmget_rescity;
        this.e = realmget_name_mediabrowsercompat_searchresultreceiver;
        this.c = realmget_religion;
    }

    public final void a() {
        setExpID setexpid;
        if (this.i && (setexpid = this.a) != null) {
            this.e.a(setexpid, this.d);
        }
    }

    @Override // o.realmSet$occupationFlagFreeText
    public final void a(realmGet$jobValue realmget_jobvalue) {
        realmSet$hmPhoneNumber realmset_hmphonenumber = (realmSet$hmPhoneNumber) this.b.f183o.get(this.c);
        if (realmset_hmphonenumber != null) {
            realmset_hmphonenumber.e(realmget_jobvalue);
        }
    }

    @Override // o.realmSet$occupationFlagFreeText
    public final void b(setExpID setexpid, Set set) {
        if (setexpid == null || set == null) {
            Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
            a(new realmGet$jobValue(4));
            return;
        }
        this.a = setexpid;
        this.d = set;
        a();
    }

    @Override // o.setCitizenValue.RemoteActionCompatParcelizer
    public final void c(realmGet$jobValue realmget_jobvalue) {
        this.b.e.post(new Runnable(realmget_jobvalue) { // from class: o.realmSet$hphoneMB
            final /* synthetic */ realmGet$jobValue c;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.c = r5;
            }

            @Override // java.lang.Runnable
            public final void run() {
                realmSet$hmVillage realmset_hmvillage = realmSet$hmVillage.this;
                realmSet$hmPhoneNumber realmset_hmphonenumber = (realmSet$hmPhoneNumber) realmset_hmvillage.b.f183o.get(realmset_hmvillage.c);
                if (realmset_hmphonenumber != null) {
                    if (this.c.c()) {
                        realmSet$hmVillage.this.i = true;
                        if (realmSet$hmVillage.this.e.n()) {
                            realmSet$hmVillage.this.a();
                            return;
                        }
                        try {
                            realmSet$hmVillage realmset_hmvillage2 = realmSet$hmVillage.this;
                            realmset_hmvillage2.e.a(null, realmset_hmvillage2.e.i());
                        } catch (SecurityException e) {
                            Log.e("GoogleApiManager", "Failed to get service from broker. ", e);
                            realmSet$hmVillage.this.e.c("Failed to get service from broker.");
                            realmset_hmphonenumber.e(new realmGet$jobValue(10), (Exception) null);
                        }
                    } else {
                        realmset_hmphonenumber.e(this.c, (Exception) null);
                    }
                }
            }
        });
    }

    @Override // o.realmSet$occupationFlagFreeText
    public final void d(int i) {
        realmSet$hmPhoneNumber realmset_hmphonenumber = (realmSet$hmPhoneNumber) this.b.f183o.get(this.c);
        if (realmset_hmphonenumber == null) {
            return;
        }
        if (realmset_hmphonenumber.j) {
            realmset_hmphonenumber.e(new realmGet$jobValue(17));
        } else {
            realmset_hmphonenumber.e(i);
        }
    }
}
