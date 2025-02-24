package o;

import androidx.fragment.app.Fragment;
import o.onRequestPermissionsResult;
/* loaded from: classes-dex2jar.jar:o/setPathData$MediaBrowserCompat$CustomActionResultReceiver.class */
public final class setPathData$MediaBrowserCompat$CustomActionResultReceiver {
    final /* synthetic */ setPathData c;
    private long d;
    private VersionedParcel$ParcelException e;

    public final void a(boolean z) {
        int i;
        isDetached isdetached = this.c.e;
        if (!(isdetached.q || isdetached.p) && this.e.f.e == 0) {
            setTrackDrawable<Fragment> settrackdrawable = this.c.j;
            if (settrackdrawable.c) {
                settrackdrawable.e();
            }
            if (!(settrackdrawable.a == 0) && this.c.c() != 0 && (i = this.e.b) < this.c.c()) {
                long c = this.c.c(i);
                if (c != this.d) {
                    Fragment fragment = null;
                    Fragment a = this.c.j.a(c, null);
                    if (a != null && a.isAdded()) {
                        this.d = c;
                        getUserVisibleHint getuservisiblehint = new getUserVisibleHint(this.c.e);
                        int i2 = 0;
                        while (true) {
                            setTrackDrawable<Fragment> settrackdrawable2 = this.c.j;
                            if (settrackdrawable2.c) {
                                settrackdrawable2.e();
                            }
                            if (i2 >= settrackdrawable2.a) {
                                break;
                            }
                            setTrackDrawable<Fragment> settrackdrawable3 = this.c.j;
                            if (settrackdrawable3.c) {
                                settrackdrawable3.e();
                            }
                            long j = settrackdrawable3.d[i2];
                            setTrackDrawable<Fragment> settrackdrawable4 = this.c.j;
                            if (settrackdrawable4.c) {
                                settrackdrawable4.e();
                            }
                            Fragment fragment2 = (Fragment) settrackdrawable4.b[i2];
                            fragment = fragment;
                            if (fragment2.isAdded()) {
                                if (j != this.d) {
                                    getuservisiblehint.c(fragment2, onRequestPermissionsResult.read.STARTED);
                                } else {
                                    fragment = fragment2;
                                }
                                fragment2.setMenuVisibility(j == this.d);
                            }
                            i2++;
                        }
                        if (fragment != null) {
                            getuservisiblehint.c(fragment, onRequestPermissionsResult.read.RESUMED);
                        }
                        if (!getuservisiblehint.j()) {
                            getuservisiblehint.a();
                        }
                    }
                }
            }
        }
    }
}
