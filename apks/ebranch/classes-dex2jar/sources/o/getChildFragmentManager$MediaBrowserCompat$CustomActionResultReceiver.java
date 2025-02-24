package o;

import android.view.accessibility.AccessibilityNodeInfo;
/* loaded from: classes-dex2jar.jar:o/getChildFragmentManager$MediaBrowserCompat$CustomActionResultReceiver.class */
public class getChildFragmentManager$MediaBrowserCompat$CustomActionResultReceiver {
    final Object a;

    getChildFragmentManager$MediaBrowserCompat$CustomActionResultReceiver(Object obj) {
        this.a = obj;
    }

    public static getChildFragmentManager$MediaBrowserCompat$CustomActionResultReceiver b(int i, int i2, boolean z, int i3) {
        return new getChildFragmentManager$MediaBrowserCompat$CustomActionResultReceiver(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z, i3));
    }

    public static getChildFragmentManager$MediaBrowserCompat$CustomActionResultReceiver e(int i, int i2, boolean z) {
        return new getChildFragmentManager$MediaBrowserCompat$CustomActionResultReceiver(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z));
    }
}
