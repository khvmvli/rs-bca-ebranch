package o;

import android.content.Context;
import o.getTargetRequestCode;
import o.getViewLifecycleOwnerLiveData;
import o.onContextItemSelected;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/getTargetRequestCode$MediaBrowserCompat$CustomActionResultReceiver.class */
public final class getTargetRequestCode$MediaBrowserCompat$CustomActionResultReceiver extends getTargetRequestCode.RemoteActionCompatParcelizer {
    private boolean a;
    private getViewLifecycleOwnerLiveData.write b;
    private boolean e = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public getTargetRequestCode$MediaBrowserCompat$CustomActionResultReceiver(onContextItemSelected.RemoteActionCompatParcelizer remoteActionCompatParcelizer, setNestedScrollingEnabled setnestedscrollingenabled, boolean z) {
        super(remoteActionCompatParcelizer, setnestedscrollingenabled);
        this.a = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final getViewLifecycleOwnerLiveData.write e(Context context) {
        if (this.e) {
            return this.b;
        }
        getViewLifecycleOwnerLiveData.write b = getViewLifecycleOwnerLiveData.b(context, c().b, c().a == onContextItemSelected.RemoteActionCompatParcelizer.write.VISIBLE, this.a);
        this.b = b;
        this.e = true;
        return b;
    }
}
