package com.google.firebase.crashlytics.internal.settings;

import com.google.firebase.crashlytics.internal.settings.model.SettingsData;
import o.BahasaLayananDialog;
import o.realmSet$namaBank;
import o.setJatuhTempo;
import o.setJenisWarkat;
import org.json.JSONObject;
/* loaded from: classes2-dex2jar.jar:com/google/firebase/crashlytics/internal/settings/SettingsController$2.class */
final class SettingsController$2 implements realmSet$namaBank<Void, Void> {
    final /* synthetic */ SettingsController d;

    SettingsController$2(SettingsController settingsController) {
        this.d = settingsController;
    }

    @Override // o.realmSet$namaBank
    public final /* synthetic */ setJatuhTempo<Void> a(Void r6) throws Exception {
        JSONObject invoke = SettingsController.access$100(this.d).invoke(SettingsController.access$000(this.d), true);
        if (invoke != null) {
            SettingsData parseSettingsJson = SettingsController.access$200(this.d).parseSettingsJson(invoke);
            SettingsController.access$300(this.d).writeCachedSettings(parseSettingsJson.getExpiresAtMillis(), invoke);
            SettingsController.access$400(this.d, invoke, "Loaded settings: ");
            SettingsController settingsController = this.d;
            SettingsController.access$500(settingsController, SettingsController.access$000(settingsController).instanceId);
            SettingsController.access$600(this.d).set(parseSettingsJson);
            setJenisWarkat setjeniswarkat = (setJenisWarkat) SettingsController.access$700(this.d).get();
            setjeniswarkat.c.a(parseSettingsJson.getAppSettingsData());
            setJenisWarkat setjeniswarkat2 = new setJenisWarkat();
            setjeniswarkat2.c.a(parseSettingsJson.getAppSettingsData());
            SettingsController.access$700(this.d).set(setjeniswarkat2);
        }
        BahasaLayananDialog bahasaLayananDialog = new BahasaLayananDialog();
        bahasaLayananDialog.e((Object) null);
        return bahasaLayananDialog;
    }
}
