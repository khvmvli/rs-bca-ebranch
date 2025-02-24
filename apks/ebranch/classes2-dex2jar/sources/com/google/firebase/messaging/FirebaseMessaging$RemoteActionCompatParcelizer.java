package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import com.google.firebase.DataCollectionDefaultChange;
import com.google.firebase.events.Event;
import com.google.firebase.events.EventHandler;
import com.google.firebase.events.Subscriber;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessaging$RemoteActionCompatParcelizer;
import io.realm.RealmFieldTypeConstants;
import o.UpgradeAppDialog;
/* loaded from: classes2-dex2jar.jar:com/google/firebase/messaging/FirebaseMessaging$RemoteActionCompatParcelizer.class */
public class FirebaseMessaging$RemoteActionCompatParcelizer {
    final Subscriber a;
    private boolean b;
    Boolean c;
    public final /* synthetic */ FirebaseMessaging d;
    EventHandler<DataCollectionDefaultChange> e;

    FirebaseMessaging$RemoteActionCompatParcelizer(FirebaseMessaging firebaseMessaging, Subscriber subscriber) {
        this.d = firebaseMessaging;
        this.a = subscriber;
    }

    private Boolean d() {
        ApplicationInfo applicationInfo;
        Context applicationContext = FirebaseMessaging.access$000(this.d).getApplicationContext();
        SharedPreferences sharedPreferences = applicationContext.getSharedPreferences("com.google.firebase.messaging", 0);
        if (sharedPreferences.contains("auto_init")) {
            return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
        }
        try {
            PackageManager packageManager = applicationContext.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), RealmFieldTypeConstants.LIST_OFFSET)) == null || applicationInfo.metaData == null || !applicationInfo.metaData.containsKey("firebase_messaging_auto_init_enabled")) {
                return null;
            }
            return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
        } catch (PackageManager.NameNotFoundException e) {
            return null;
        }
    }

    final void a() {
        synchronized (this) {
            if (!this.b) {
                Boolean d = d();
                this.c = d;
                if (d == null) {
                    UpgradeAppDialog upgradeAppDialog = new EventHandler(this) { // from class: o.UpgradeAppDialog
                        private final FirebaseMessaging$RemoteActionCompatParcelizer a;

                        {
                            this.a = r4;
                        }

                        @Override // com.google.firebase.events.EventHandler
                        public final void handle(Event event) {
                            FirebaseMessaging$RemoteActionCompatParcelizer firebaseMessaging$RemoteActionCompatParcelizer = this.a;
                            if (firebaseMessaging$RemoteActionCompatParcelizer.c()) {
                                FirebaseMessaging.access$100(firebaseMessaging$RemoteActionCompatParcelizer.d);
                            }
                        }
                    };
                    this.e = upgradeAppDialog;
                    this.a.subscribe(DataCollectionDefaultChange.class, upgradeAppDialog);
                }
                this.b = true;
            }
        }
    }

    public final boolean c() {
        boolean booleanValue;
        synchronized (this) {
            a();
            Boolean bool = this.c;
            booleanValue = bool != null ? bool.booleanValue() : FirebaseMessaging.access$000(this.d).isDataCollectionDefaultEnabled();
        }
        return booleanValue;
    }
}
