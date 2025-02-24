package o;

import android.view.View;
import o.setMaxHeight;
import o.setOnInflateListener;
import o.setTitleMarginEnd;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/setMaxHeight$MediaBrowserCompat$CustomActionResultReceiver.class */
public final class setMaxHeight$MediaBrowserCompat$CustomActionResultReceiver implements setOnInflateListener.IconCompatParcelizer {
    setMaxHeight a;
    int b;
    int c;
    int d;
    int e;
    final /* synthetic */ setMaxHeight f;
    int h;
    int i;

    public setMaxHeight$MediaBrowserCompat$CustomActionResultReceiver(setMaxHeight setmaxheight, setMaxHeight setmaxheight2) {
        this.f = setmaxheight;
        this.a = setmaxheight2;
    }

    private static boolean b(int i, int i2, int i3) {
        if (i == i2) {
            return true;
        }
        int mode = View.MeasureSpec.getMode(i);
        View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode2 == 1073741824) {
            return (mode == Integer.MIN_VALUE || mode == 0) && i3 == size;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b9, code lost:
        if (r6.f == o.setOnInflateListener$MediaBrowserCompat$CustomActionResultReceiver.b) goto L_0x00bc;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0201, code lost:
        if (r6.f == o.setOnInflateListener$MediaBrowserCompat$CustomActionResultReceiver.b) goto L_0x0204;
     */
    /* JADX WARN: Removed duplicated region for block: B:180:0x041d  */
    @Override // o.setOnInflateListener.IconCompatParcelizer
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final void b(o.setTitleMarginEnd r5, o.setOnInflateListener$MediaBrowserCompat$CustomActionResultReceiver r6) {
        /*
        // Method dump skipped, instructions count: 1792
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setMaxHeight$MediaBrowserCompat$CustomActionResultReceiver.b(o.setTitleMarginEnd, o.setOnInflateListener$MediaBrowserCompat$CustomActionResultReceiver):void");
    }

    @Override // o.setOnInflateListener.IconCompatParcelizer
    public final void d() {
        int childCount = this.a.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.a.getChildAt(i);
            if (childAt instanceof setElevation) {
                setElevation setelevation = (setElevation) childAt;
                if (setelevation.a != null) {
                    setMaxHeight.RemoteActionCompatParcelizer remoteActionCompatParcelizer = (setMaxHeight.RemoteActionCompatParcelizer) setelevation.getLayoutParams();
                    setMaxHeight.RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = (setMaxHeight.RemoteActionCompatParcelizer) setelevation.a.getLayoutParams();
                    remoteActionCompatParcelizer2.ao.ap = 0;
                    if (remoteActionCompatParcelizer.ao.M[0] != setTitleMarginEnd.write.FIXED) {
                        setTitleMarginEnd settitlemarginend = remoteActionCompatParcelizer.ao;
                        setTitleMarginEnd settitlemarginend2 = remoteActionCompatParcelizer2.ao;
                        settitlemarginend.n(settitlemarginend2.ap == 8 ? 0 : settitlemarginend2.aw);
                    }
                    if (remoteActionCompatParcelizer.ao.M[1] != setTitleMarginEnd.write.FIXED) {
                        setTitleMarginEnd settitlemarginend3 = remoteActionCompatParcelizer.ao;
                        setTitleMarginEnd settitlemarginend4 = remoteActionCompatParcelizer2.ao;
                        settitlemarginend3.i(settitlemarginend4.ap == 8 ? 0 : settitlemarginend4.v);
                    }
                    remoteActionCompatParcelizer2.ao.ap = 8;
                }
            }
        }
        int size = this.a.j.size();
        if (size > 0) {
            for (int i2 = 0; i2 < size; i2++) {
                this.a.j.get(i2);
            }
        }
    }
}
