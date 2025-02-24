package o;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import o.Setoran$$Parcelable;
import o.realmSet;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2-dex2jar.jar:o/realmGet$Email.class */
public final class realmGet$Email implements Application.ActivityLifecycleCallbacks {
    final /* synthetic */ Setoran$$Parcelable.AnonymousClass1 b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ realmGet$Email(Setoran$$Parcelable.AnonymousClass1 r4, realmSet$currency realmset_currency) {
        this.b = r4;
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [o.Setoran$$Parcelable$1, o.realmSet$RepresentativeName] */
    /* JADX WARN: Type inference failed for: r0v3, types: [o.Setoran$$Parcelable$1, o.realmSet$RepresentativeName] */
    /* JADX WARN: Type inference failed for: r0v32, types: [o.Setoran$$Parcelable$1, o.realmSet$RepresentativeName] */
    /* JADX WARN: Type inference failed for: r0v46, types: [o.Setoran$$Parcelable$1, o.realmSet$RepresentativeName] */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        realmGet$TxnPurpose realmget_txnpurpose;
        try {
            try {
                this.b.q.s_().i().b("onActivityCreated");
                Intent intent = activity.getIntent();
                if (intent == null) {
                    realmget_txnpurpose = ((realmSet.descTransaksi) this.b).q;
                } else {
                    Uri data = intent.getData();
                    if (data != null && data.isHierarchical()) {
                        this.b.q.u();
                        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
                        boolean z = true;
                        String str = true != ("android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra)) ? "auto" : "gs";
                        String queryParameter = data.getQueryParameter("referrer");
                        if (bundle != null) {
                            z = false;
                        }
                        this.b.q.o_().b(new Runnable(z, data, str, queryParameter) { // from class: o.Setoran$$Parcelable
                            final /* synthetic */ boolean a;
                            final /* synthetic */ String b;
                            final /* synthetic */ Uri d;
                            final /* synthetic */ String e;

                            /* JADX INFO: Access modifiers changed from: package-private */
                            {
                                this.a = r5;
                                this.d = r6;
                                this.e = r7;
                                this.b = r8;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:36:0x0107 A[Catch: RuntimeException -> 0x02c7, TRY_ENTER, TRY_LEAVE, TryCatch #0 {RuntimeException -> 0x02c7, blocks: (B:3:0x0022, B:5:0x003a, B:7:0x004e, B:10:0x0063, B:13:0x0079, B:15:0x0083, B:17:0x008d, B:19:0x0097, B:21:0x00a1, B:24:0x00b7, B:26:0x00ca, B:27:0x00d6, B:29:0x00e3, B:32:0x00f6, B:36:0x0107, B:39:0x011d, B:41:0x0139, B:45:0x0147, B:47:0x0151, B:49:0x016b, B:52:0x018c, B:54:0x01a2, B:58:0x01bb, B:62:0x01ca, B:65:0x01d5, B:67:0x01e9, B:70:0x01f2, B:74:0x0221, B:75:0x023f, B:77:0x0254, B:79:0x0261, B:81:0x026b, B:83:0x0275, B:85:0x027f, B:87:0x0289, B:89:0x0293, B:92:0x029f, B:94:0x02a5, B:96:0x02b4), top: B:101:0x0022 }] */
                            /* JADX WARN: Removed duplicated region for block: B:51:0x0189  */
                            /* JADX WARN: Removed duplicated region for block: B:69:0x01ef  */
                            /* JADX WARN: Removed duplicated region for block: B:70:0x01f2 A[Catch: RuntimeException -> 0x02c7, TRY_ENTER, TRY_LEAVE, TryCatch #0 {RuntimeException -> 0x02c7, blocks: (B:3:0x0022, B:5:0x003a, B:7:0x004e, B:10:0x0063, B:13:0x0079, B:15:0x0083, B:17:0x008d, B:19:0x0097, B:21:0x00a1, B:24:0x00b7, B:26:0x00ca, B:27:0x00d6, B:29:0x00e3, B:32:0x00f6, B:36:0x0107, B:39:0x011d, B:41:0x0139, B:45:0x0147, B:47:0x0151, B:49:0x016b, B:52:0x018c, B:54:0x01a2, B:58:0x01bb, B:62:0x01ca, B:65:0x01d5, B:67:0x01e9, B:70:0x01f2, B:74:0x0221, B:75:0x023f, B:77:0x0254, B:79:0x0261, B:81:0x026b, B:83:0x0275, B:85:0x027f, B:87:0x0289, B:89:0x0293, B:92:0x029f, B:94:0x02a5, B:96:0x02b4), top: B:101:0x0022 }] */
                            /* JADX WARN: Type inference failed for: r0v100, types: [o.Setoran$$Parcelable$1, o.realmSet$RepresentativeName] */
                            /* JADX WARN: Type inference failed for: r0v11, types: [o.Setoran$$Parcelable$1, o.realmSet$RepresentativeName] */
                            /* JADX WARN: Type inference failed for: r0v118, types: [o.Setoran$$Parcelable$1, o.realmSet$RepresentativeName] */
                            /* JADX WARN: Type inference failed for: r0v13, types: [o.Setoran$$Parcelable$1, o.realmSet$RepresentativeName] */
                            /* JADX WARN: Type inference failed for: r0v150, types: [o.Setoran$$Parcelable$1, o.realmSet$RepresentativeName] */
                            /* JADX WARN: Type inference failed for: r0v155, types: [o.Setoran$$Parcelable$1, o.realmSet$RepresentativeName] */
                            /* JADX WARN: Type inference failed for: r0v18, types: [o.Setoran$$Parcelable$1, o.realmSet$RepresentativeName] */
                            /* JADX WARN: Type inference failed for: r0v25, types: [o.Setoran$$Parcelable$1, o.realmSet$RepresentativeName] */
                            /* JADX WARN: Type inference failed for: r0v33, types: [o.Setoran$$Parcelable$1, o.realmSet$RepresentativeName] */
                            /* JADX WARN: Type inference failed for: r0v38, types: [o.Setoran$$Parcelable$1, o.realmSet$RepresentativeName] */
                            /* JADX WARN: Type inference failed for: r0v46, types: [o.Setoran$$Parcelable$1, o.realmSet$RepresentativeName] */
                            /* JADX WARN: Type inference failed for: r0v68, types: [o.Setoran$$Parcelable$1, o.realmSet$RepresentativeName] */
                            /* JADX WARN: Type inference failed for: r0v78, types: [o.Setoran$$Parcelable$1, o.realmSet$RepresentativeName] */
                            /* JADX WARN: Type inference failed for: r0v92, types: [o.Setoran$$Parcelable$1, o.realmSet$RepresentativeName] */
                            @Override // java.lang.Runnable
                            /* Code decompiled incorrectly, please refer to instructions dump */
                            public final void run() {
                                /*
                                // Method dump skipped, instructions count: 734
                                */
                                throw new UnsupportedOperationException("Method not decompiled: o.Setoran$$Parcelable.run():void");
                            }
                        });
                        realmget_txnpurpose = ((realmSet.descTransaksi) this.b).q;
                    }
                    realmget_txnpurpose = ((realmSet.descTransaksi) this.b).q;
                }
            } catch (RuntimeException e) {
                this.b.q.s_().b().e("Throwable caught in onActivityCreated", e);
                realmget_txnpurpose = ((realmSet.descTransaksi) this.b).q;
            }
            realmget_txnpurpose.I().e(activity, bundle);
        } catch (Throwable th) {
            ((realmSet.descTransaksi) this.b).q.I().e(activity, bundle);
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        ((realmSet.descTransaksi) this.b).q.I().e(activity);
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [o.realmSet$RepresentativeName, o.realmSet$eChannels] */
    /* JADX WARN: Unknown variable types count: 1 */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final void onActivityPaused(android.app.Activity r8) {
        /*
            r7 = this;
            r0 = r7
            o.Setoran$$Parcelable$1 r0 = r0.b
            o.realmGet$TxnPurpose r0 = r0.q
            o.getIdType r0 = r0.I()
            r1 = r8
            r0.d(r1)
            r0 = r7
            o.Setoran$$Parcelable$1 r0 = r0.b
            o.realmGet$TxnPurpose r0 = r0.q
            o.realmSet$eChannels r0 = r0.r()
            r8 = r0
            r0 = r8
            o.realmGet$TxnPurpose r0 = r0.q
            o.getNoTelpKontakPengirim r0 = r0.q_()
            long r0 = r0.b()
            r9 = r0
            r0 = r8
            o.realmGet$TxnPurpose r0 = r0.q
            o.realmGet$SenderIdType r0 = r0.o_()
            o.realmGet$membership r1 = new o.realmGet$membership
            r2 = r1
            r3 = r8
            r4 = r9
            r2.<init>(r4)
            r0.b(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.realmGet$Email.onActivityPaused(android.app.Activity):void");
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [o.realmSet$RepresentativeName, o.realmSet$eChannels] */
    /* JADX WARN: Unknown variable types count: 1 */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final void onActivityResumed(android.app.Activity r8) {
        /*
            r7 = this;
            r0 = r7
            o.Setoran$$Parcelable$1 r0 = r0.b
            o.realmGet$TxnPurpose r0 = r0.q
            o.realmSet$eChannels r0 = r0.r()
            r9 = r0
            r0 = r9
            o.realmGet$TxnPurpose r0 = r0.q
            o.getNoTelpKontakPengirim r0 = r0.q_()
            long r0 = r0.b()
            r10 = r0
            r0 = r9
            o.realmGet$TxnPurpose r0 = r0.q
            o.realmGet$SenderIdType r0 = r0.o_()
            o.realmGet$sessionId r1 = new o.realmGet$sessionId
            r2 = r1
            r3 = r9
            r4 = r10
            r2.<init>(r4)
            r0.b(r1)
            r0 = r7
            o.Setoran$$Parcelable$1 r0 = r0.b
            o.realmGet$TxnPurpose r0 = r0.q
            o.getIdType r0 = r0.I()
            r1 = r8
            r0.c(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.realmGet$Email.onActivityResumed(android.app.Activity):void");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        ((realmSet.descTransaksi) this.b).q.I().a(activity, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
