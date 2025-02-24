package o;

import com.google.firebase.crashlytics.internal.common.CurrentTimeProvider;
import com.google.firebase.crashlytics.internal.settings.model.AppSettingsData;
import com.google.firebase.crashlytics.internal.settings.model.FeaturesSettingsData;
import com.google.firebase.crashlytics.internal.settings.model.SessionSettingsData;
import com.google.firebase.crashlytics.internal.settings.model.Settings;
import com.google.firebase.crashlytics.internal.settings.model.SettingsData;
import org.joda.time.DateTimeConstants;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2-dex2jar.jar:o/SumberPenghasilanDialog_ViewBinding.class */
public final class SumberPenghasilanDialog_ViewBinding implements SuratPernyataanBNDialog {
    private static long d(CurrentTimeProvider currentTimeProvider, long j, JSONObject jSONObject) {
        return jSONObject.has("expires_at") ? jSONObject.optLong("expires_at") : currentTimeProvider.getCurrentTimeMillis() + (j * 1000);
    }

    public static Settings d(CurrentTimeProvider currentTimeProvider) {
        JSONObject jSONObject = new JSONObject();
        return new SettingsData(d(currentTimeProvider, 3600, jSONObject), null, new SessionSettingsData(jSONObject.optInt("max_custom_exception_events", 8), 4), new FeaturesSettingsData(jSONObject.optBoolean("collect_reports", true), jSONObject.optBoolean("collect_anrs", false)), 0, DateTimeConstants.SECONDS_PER_HOUR);
    }

    @Override // o.SuratPernyataanBNDialog
    public final SettingsData b(CurrentTimeProvider currentTimeProvider, JSONObject jSONObject) throws JSONException {
        int optInt = jSONObject.optInt("settings_version", 0);
        int optInt2 = jSONObject.optInt("cache_duration", DateTimeConstants.SECONDS_PER_HOUR);
        JSONObject jSONObject2 = jSONObject.getJSONObject("app");
        AppSettingsData appSettingsData = new AppSettingsData(jSONObject2.getString("status"), jSONObject2.getString("url"), jSONObject2.getString("reports_url"), jSONObject2.getString("ndk_reports_url"), jSONObject2.optBoolean("update_required", false));
        SessionSettingsData sessionSettingsData = new SessionSettingsData(jSONObject.getJSONObject("session").optInt("max_custom_exception_events", 8), 4);
        JSONObject jSONObject3 = jSONObject.getJSONObject("features");
        return new SettingsData(d(currentTimeProvider, (long) optInt2, jSONObject), appSettingsData, sessionSettingsData, new FeaturesSettingsData(jSONObject3.optBoolean("collect_reports", true), jSONObject3.optBoolean("collect_anrs", false)), optInt, optInt2);
    }
}
