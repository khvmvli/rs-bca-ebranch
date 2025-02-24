package o;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.concurrent.Callable;
/* loaded from: classes2-dex2jar.jar:o/PilihRekeningDialog.class */
public final class PilihRekeningDialog implements Callable<String> {
    final /* synthetic */ FirebaseAnalytics c;

    public PilihRekeningDialog(FirebaseAnalytics firebaseAnalytics) {
        this.c = firebaseAnalytics;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ String call() throws Exception {
        return this.c.zzb.a();
    }
}
