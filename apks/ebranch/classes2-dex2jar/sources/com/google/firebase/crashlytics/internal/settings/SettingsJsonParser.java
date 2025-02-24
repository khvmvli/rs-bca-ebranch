package com.google.firebase.crashlytics.internal.settings;

import com.google.firebase.crashlytics.internal.common.CurrentTimeProvider;
import com.google.firebase.crashlytics.internal.settings.model.SettingsData;
import o.SumberPenghasilanDialog_ViewBinding;
import o.SuratPernyataanBNDialog;
import o.TahapanBCADialog_ViewBinding;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2-dex2jar.jar:com/google/firebase/crashlytics/internal/settings/SettingsJsonParser.class */
public class SettingsJsonParser {
    private final CurrentTimeProvider currentTimeProvider;

    SettingsJsonParser(CurrentTimeProvider currentTimeProvider) {
        this.currentTimeProvider = currentTimeProvider;
    }

    private static SuratPernyataanBNDialog getJsonTransformForVersion(int i) {
        return i != 3 ? new SumberPenghasilanDialog_ViewBinding() : new TahapanBCADialog_ViewBinding();
    }

    public SettingsData parseSettingsJson(JSONObject jSONObject) throws JSONException {
        return getJsonTransformForVersion(jSONObject.getInt("settings_version")).b(this.currentTimeProvider, jSONObject);
    }
}
