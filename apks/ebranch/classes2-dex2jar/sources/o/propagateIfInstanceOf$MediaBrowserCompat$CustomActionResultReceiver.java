package o;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
/* loaded from: classes2-dex2jar.jar:o/propagateIfInstanceOf$MediaBrowserCompat$CustomActionResultReceiver.class */
public class propagateIfInstanceOf$MediaBrowserCompat$CustomActionResultReceiver extends Fragment {
    private boolean a;
    private documentProvider b;
    protected Bundle c;
    protected boolean d;
    private Object e;

    public void onCreate(Bundle bundle) {
        onCreate(bundle);
        documentProvider documentprovider = propagateIfInstanceOf.a.a.a;
        documentProvider documentprovider2 = documentprovider;
        if (documentprovider == null) {
            documentprovider2 = documentProvider.b();
        }
        this.b = documentprovider2;
        documentprovider2.c(this);
        this.a = true;
    }

    public void onEventMainThread(ArrayListAccumulator arrayListAccumulator) {
        Object obj;
        if (arrayListAccumulator == null || (obj = arrayListAccumulator.c) == null || obj.equals(this.e)) {
            propagateIfInstanceOf.a(arrayListAccumulator);
            isDetached fragmentManager = getFragmentManager();
            fragmentManager.a(true);
            fragmentManager.e();
            getText findFragmentByTag = fragmentManager.findFragmentByTag("de.greenrobot.eventbus.error_dialog");
            if (findFragmentByTag != null) {
                findFragmentByTag.dismiss();
            }
            getText gettext = (getText) propagateIfInstanceOf.a.b(arrayListAccumulator, this.d, this.c);
            if (gettext != null) {
                gettext.show(fragmentManager, "de.greenrobot.eventbus.error_dialog");
            }
        }
    }

    public void onPause() {
        this.b.e(this);
        onPause();
    }

    public void onResume() {
        onResume();
        if (this.a) {
            this.a = false;
            return;
        }
        documentProvider documentprovider = propagateIfInstanceOf.a.a.a;
        documentProvider documentprovider2 = documentprovider;
        if (documentprovider == null) {
            documentprovider2 = documentProvider.b();
        }
        this.b = documentprovider2;
        documentprovider2.c(this);
    }
}
