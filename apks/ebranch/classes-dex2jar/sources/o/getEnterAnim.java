package o;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes-dex2jar.jar:o/getEnterAnim.class */
public class getEnterAnim {
    private final Object c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/getEnterAnim$RemoteActionCompatParcelizer.class */
    public static class RemoteActionCompatParcelizer extends getEnterAnim$MediaBrowserCompat$CustomActionResultReceiver {
        RemoteActionCompatParcelizer(getEnterAnim getenteranim) {
            super(getenteranim);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public void addExtraDataToAccessibilityNodeInfo(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.a.b(i, getChildFragmentManager.d(accessibilityNodeInfo), str, bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/getEnterAnim$write.class */
    public static class write extends AccessibilityNodeProvider {
        final getEnterAnim a;

        public write(getEnterAnim getenteranim) {
            this.a = getenteranim;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            getChildFragmentManager a = this.a.a(i);
            if (a == null) {
                return null;
            }
            return a.x();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
            List<getChildFragmentManager> a = this.a.a(str, i);
            if (a == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = a.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(a.get(i2).x());
            }
            return arrayList;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int i, int i2, Bundle bundle) {
            return this.a.d(i, i2, bundle);
        }
    }

    public getEnterAnim() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.c = new RemoteActionCompatParcelizer(this);
        } else {
            this.c = new getEnterAnim$MediaBrowserCompat$CustomActionResultReceiver(this);
        }
    }

    public getEnterAnim(Object obj) {
        this.c = obj;
    }

    public List<getChildFragmentManager> a(String str, int i) {
        return null;
    }

    public getChildFragmentManager a(int i) {
        return null;
    }

    public void b(int i, getChildFragmentManager getchildfragmentmanager, String str, Bundle bundle) {
    }

    public Object d() {
        return this.c;
    }

    public getChildFragmentManager d(int i) {
        return null;
    }

    public boolean d(int i, int i2, Bundle bundle) {
        return false;
    }
}
