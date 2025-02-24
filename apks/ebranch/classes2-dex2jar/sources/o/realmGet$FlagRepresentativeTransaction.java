package o;

import android.content.SharedPreferences;
import android.util.Pair;
import o.realmGet;
import o.realmSet;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
/* loaded from: classes2-dex2jar.jar:o/realmGet$FlagRepresentativeTransaction.class */
public final class realmGet$FlagRepresentativeTransaction extends realmSet$RepresentativeRelationship {
    static final Pair<String, Long> a = new Pair<>("", 0L);
    public setTypeTransksi d;
    public boolean k;
    private SharedPreferences p;
    private String u;
    private boolean v;
    private long y;
    public final getIsLongForm h = new getIsLongForm(this, "session_timeout", 1800000);
    public final setSystemAppId i = new setSystemAppId(this, "start_new_session", true);
    public final getIsLongForm j = new getIsLongForm(this, "last_pause_time", 0);
    public final realmGet$FlagDaftarTransfer g = new realmGet$FlagDaftarTransfer(this, "non_personalized_ads", null);
    public final setSystemAppId f = new setSystemAppId(this, "allow_remote_dynamite", false);
    public final getIsLongForm c = new getIsLongForm(this, "first_open_time", 0);
    public final getIsLongForm b = new getIsLongForm(this, "app_install_time", 0);
    public final realmGet$FlagDaftarTransfer e = new realmGet$FlagDaftarTransfer(this, "app_instance_id", null);
    public final setSystemAppId l = new setSystemAppId(this, "app_backgrounded", false);

    /* renamed from: o */
    public final setSystemAppId f87o = new setSystemAppId(this, "deep_link_retrieval_complete", false);
    public final getIsLongForm n = new getIsLongForm(this, "deep_link_retrieval_attempts", 0);
    public final realmGet$FlagDaftarTransfer m = new realmGet$FlagDaftarTransfer(this, "firebase_feature_rollouts", null);
    public final realmGet$FlagDaftarTransfer t = new realmGet$FlagDaftarTransfer(this, "deferred_attribution_cache", null);
    public final getIsLongForm r = new getIsLongForm(this, "deferred_attribution_cache_timestamp", 0);
    public final Setoran s = new Setoran(this, "default_event_parameters", null);

    public realmGet$FlagRepresentativeTransaction(realmGet$TxnPurpose realmget_txnpurpose) {
        super(realmget_txnpurpose);
    }

    public final SharedPreferences a() {
        r_();
        s();
        setFotoKtp.b(this.p);
        return this.p;
    }

    public final void a(boolean z) {
        r_();
        this.q.s_().i().e("App measurement setting deferred collection", Boolean.valueOf(z));
        SharedPreferences.Editor edit = a().edit();
        edit.putBoolean("deferred_analytics_collection", z);
        edit.apply();
    }

    public final Pair<String, Boolean> c(String str) {
        r_();
        long b = this.q.q_().b();
        String str2 = this.u;
        if (str2 != null && b < this.y) {
            return new Pair<>(str2, Boolean.valueOf(this.v));
        }
        this.y = b + this.q.t().d(str, realmSet.hasDone.C);
        realmGet.citizenValue.setShouldSkipGmsCoreVersionCheck(true);
        try {
            realmGet.citizenValue.write advertisingIdInfo = realmGet.citizenValue.getAdvertisingIdInfo(this.q.t_());
            this.u = "";
            String id = advertisingIdInfo.getId();
            if (id != null) {
                this.u = id;
            }
            this.v = advertisingIdInfo.isLimitAdTrackingEnabled();
        } catch (Exception e) {
            this.q.s_().h().e("Unable to get advertising id", e);
            this.u = "";
        }
        realmGet.citizenValue.setShouldSkipGmsCoreVersionCheck(false);
        return new Pair<>(this.u, Boolean.valueOf(this.v));
    }

    public final getTanggalJatuhTempo c() {
        r_();
        return getTanggalJatuhTempo.d(a().getString("consent_settings", "G1"));
    }

    public final Boolean d() {
        r_();
        if (a().contains("measurement_enabled")) {
            return Boolean.valueOf(a().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    public final boolean d(int i) {
        return getTanggalJatuhTempo.d(i, a().getInt("consent_source", 100));
    }

    public final void e(Boolean bool) {
        r_();
        SharedPreferences.Editor edit = a().edit();
        if (bool != null) {
            edit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            edit.remove("measurement_enabled");
        }
        edit.apply();
    }

    @Override // o.realmSet$RepresentativeRelationship
    protected final boolean e() {
        return true;
    }

    public final boolean e(long j) {
        return j - this.h.d() > this.j.d();
    }

    public final boolean g() {
        SharedPreferences sharedPreferences = this.p;
        if (sharedPreferences == null) {
            return false;
        }
        return sharedPreferences.contains("deferred_analytics_collection");
    }

    @Override // o.realmSet$RepresentativeRelationship
    @EnsuresNonNull.List({@EnsuresNonNull({"this.preferences"}), @EnsuresNonNull({"this.monitoringSample"})})
    protected final void u_() {
        SharedPreferences sharedPreferences = this.q.t_().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.p = sharedPreferences;
        boolean z = sharedPreferences.getBoolean("has_been_opened", false);
        this.k = z;
        if (!z) {
            SharedPreferences.Editor edit = this.p.edit();
            edit.putBoolean("has_been_opened", true);
            edit.apply();
        }
        this.q.t();
        this.d = new setTypeTransksi(this, "health_monitor", Math.max(0L, ((Long) realmSet.hasDone.ae.d((Object) null)).longValue()), null);
    }
}
