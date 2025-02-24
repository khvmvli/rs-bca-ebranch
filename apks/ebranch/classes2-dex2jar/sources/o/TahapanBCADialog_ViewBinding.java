package o;

import com.google.firebase.crashlytics.internal.common.CurrentTimeProvider;
import com.google.firebase.crashlytics.internal.settings.model.AppSettingsData;
import com.google.firebase.crashlytics.internal.settings.model.FeaturesSettingsData;
import com.google.firebase.crashlytics.internal.settings.model.SessionSettingsData;
import com.google.firebase.crashlytics.internal.settings.model.SettingsData;
import java.util.Locale;
import org.joda.time.DateTimeConstants;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2-dex2jar.jar:o/TahapanBCADialog_ViewBinding.class */
public final class TahapanBCADialog_ViewBinding implements SuratPernyataanBNDialog {
    @Override // o.SuratPernyataanBNDialog
    public final SettingsData b(CurrentTimeProvider currentTimeProvider, JSONObject jSONObject) throws JSONException {
        int optInt = jSONObject.optInt("settings_version", 0);
        int optInt2 = jSONObject.optInt("cache_duration", DateTimeConstants.SECONDS_PER_HOUR);
        JSONObject jSONObject2 = jSONObject.getJSONObject("fabric");
        JSONObject jSONObject3 = jSONObject.getJSONObject("app");
        String string = jSONObject3.getString("status");
        boolean equals = AppSettingsData.STATUS_NEW.equals(string);
        String string2 = jSONObject2.getString("bundle_id");
        AppSettingsData appSettingsData = new AppSettingsData(string, equals ? "https://update.crashlytics.com/spi/v1/platforms/android/apps" : String.format(Locale.US, "https://update.crashlytics.com/spi/v1/platforms/android/apps/%s", string2), String.format(Locale.US, "https://reports.crashlytics.com/spi/v1/platforms/android/apps/%s/reports", string2), String.format(Locale.US, "https://reports.crashlytics.com/sdk-api/v1/platforms/android/apps/%s/minidumps", string2), string2, jSONObject2.getString("org_id"), jSONObject3.optBoolean("update_required", false), jSONObject3.optInt("report_upload_variant", 0), jSONObject3.optInt("native_report_upload_variant", 0));
        SessionSettingsData sessionSettingsData = new SessionSettingsData(8, 4);
        JSONObject jSONObject4 = jSONObject.getJSONObject("features");
        return new SettingsData(jSONObject.has("expires_at") ? jSONObject.optLong("expires_at") : currentTimeProvider.getCurrentTimeMillis() + (((long) optInt2) * 1000), appSettingsData, sessionSettingsData, new FeaturesSettingsData(jSONObject4.optBoolean("collect_reports", true), jSONObject4.optBoolean("collect_anrs", false)), optInt, optInt2);
    }
}
