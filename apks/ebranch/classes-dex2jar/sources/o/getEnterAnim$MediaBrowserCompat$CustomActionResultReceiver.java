package o;

import android.view.accessibility.AccessibilityNodeInfo;
import o.getEnterAnim;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/getEnterAnim$MediaBrowserCompat$CustomActionResultReceiver.class */
public class getEnterAnim$MediaBrowserCompat$CustomActionResultReceiver extends getEnterAnim.write {
    /* JADX INFO: Access modifiers changed from: package-private */
    public getEnterAnim$MediaBrowserCompat$CustomActionResultReceiver(getEnterAnim getenteranim) {
        super(getenteranim);
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public AccessibilityNodeInfo findFocus(int i) {
        getChildFragmentManager d = this.a.d(i);
        if (d == null) {
            return null;
        }
        return d.x();
    }
}
