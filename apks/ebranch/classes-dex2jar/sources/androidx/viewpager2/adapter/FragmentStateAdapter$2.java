package androidx.viewpager2.adapter;

import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import o.findFragmentByWho;
import o.getRootAlpha;
import o.getUserVisibleHint;
import o.isDetached;
import o.onRequestPermissionsResult;
import o.onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver;
import o.onResume;
import o.performContextItemSelected;
import o.setPathData;
/* loaded from: classes-dex2jar.jar:androidx/viewpager2/adapter/FragmentStateAdapter$2.class */
public class FragmentStateAdapter$2 implements onResume {
    final /* synthetic */ getRootAlpha b;
    final /* synthetic */ setPathData e;

    FragmentStateAdapter$2(setPathData setpathdata, getRootAlpha getrootalpha) {
        this.e = setpathdata;
        this.b = getrootalpha;
    }

    @Override // o.onResume
    public final void b(performContextItemSelected performcontextitemselected, onRequestPermissionsResult$MediaBrowserCompat$CustomActionResultReceiver onrequestpermissionsresult_mediabrowsercompat_customactionresultreceiver) {
        isDetached isdetached = this.e.e;
        if (!(isdetached.q || isdetached.p)) {
            performcontextitemselected.getLifecycle().e(this);
            if (findFragmentByWho.F((FrameLayout) this.b.b)) {
                setPathData setpathdata = this.e;
                getRootAlpha getrootalpha = this.b;
                Fragment a = setpathdata.j.a(getrootalpha.e, null);
                if (a != null) {
                    FrameLayout frameLayout = (FrameLayout) getrootalpha.b;
                    View view = a.getView();
                    if (!a.isAdded() && view != null) {
                        throw new IllegalStateException("Design assumption violated.");
                    } else if (a.isAdded() && view == null) {
                        setpathdata.d(a, frameLayout);
                    } else if (!a.isAdded() || view.getParent() == null) {
                        if (a.isAdded()) {
                            setPathData.e(view, frameLayout);
                            return;
                        }
                        isDetached isdetached2 = setpathdata.e;
                        if (!(isdetached2.q || isdetached2.p)) {
                            setpathdata.d(a, frameLayout);
                            getUserVisibleHint getuservisiblehint = new getUserVisibleHint(setpathdata.e);
                            StringBuilder sb = new StringBuilder("f");
                            sb.append(getrootalpha.e);
                            getuservisiblehint.d(0, a, sb.toString(), 1);
                            getuservisiblehint.c(a, onRequestPermissionsResult.read.STARTED).a();
                            setpathdata.b.a(false);
                        } else if (!setpathdata.e.i) {
                            setpathdata.f.c(new FragmentStateAdapter$2(setpathdata, getrootalpha));
                        }
                    } else if (view.getParent() != frameLayout) {
                        setPathData.e(view, frameLayout);
                    }
                } else {
                    throw new IllegalStateException("Design assumption violated.");
                }
            }
        }
    }
}
