package o;

import android.util.Pair;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Locale;
import o.realmGet;
import o.realmSet;
/* loaded from: classes2-dex2jar.jar:o/realmGet$isFlagContactKU.class */
public final class realmGet$isFlagContactKU extends realmSet$isMember {
    public final getIsLongForm a;
    public final getIsLongForm b;
    public final getIsLongForm c;
    public final getIsLongForm d;
    public final getIsLongForm e;
    private String f;
    private long i;
    private boolean j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public realmGet$isFlagContactKU(realmSet$kirimanUangs realmset_kirimanuangs) {
        super(realmset_kirimanuangs);
        realmGet$FlagRepresentativeTransaction q = this.q.q();
        q.getClass();
        this.c = new getIsLongForm(q, "last_delete_stale", 0);
        realmGet$FlagRepresentativeTransaction q2 = this.q.q();
        q2.getClass();
        this.b = new getIsLongForm(q2, "backoff", 0);
        realmGet$FlagRepresentativeTransaction q3 = this.q.q();
        q3.getClass();
        this.e = new getIsLongForm(q3, "last_upload", 0);
        realmGet$FlagRepresentativeTransaction q4 = this.q.q();
        q4.getClass();
        this.d = new getIsLongForm(q4, "last_upload_attempt", 0);
        realmGet$FlagRepresentativeTransaction q5 = this.q.q();
        q5.getClass();
        this.a = new getIsLongForm(q5, "midnight_offset", 0);
    }

    @Deprecated
    final Pair<String, Boolean> a(String str) {
        r_();
        long b = this.q.q_().b();
        String str2 = this.f;
        if (str2 != null && b < this.i) {
            return new Pair<>(str2, Boolean.valueOf(this.j));
        }
        this.i = b + this.q.t().d(str, realmSet.hasDone.C);
        realmGet.citizenValue.setShouldSkipGmsCoreVersionCheck(true);
        try {
            realmGet.citizenValue.write advertisingIdInfo = realmGet.citizenValue.getAdvertisingIdInfo(this.q.t_());
            this.f = "";
            String id = advertisingIdInfo.getId();
            if (id != null) {
                this.f = id;
            }
            this.j = advertisingIdInfo.isLimitAdTrackingEnabled();
        } catch (Exception e) {
            this.q.s_().h().e("Unable to get advertising id", e);
            this.f = "";
        }
        realmGet.citizenValue.setShouldSkipGmsCoreVersionCheck(false);
        return new Pair<>(this.f, Boolean.valueOf(this.j));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Pair<String, Boolean> d(String str, getTanggalJatuhTempo gettanggaljatuhtempo) {
        return gettanggaljatuhtempo.c() ? a(str) : new Pair<>("", false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Deprecated
    public final String e(String str) {
        r_();
        String str2 = (String) a(str).first;
        MessageDigest d = setAcctNo.d();
        if (d == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, d.digest(str2.getBytes())));
    }

    @Override // o.realmSet$isMember
    protected final boolean n() {
        return false;
    }
}
