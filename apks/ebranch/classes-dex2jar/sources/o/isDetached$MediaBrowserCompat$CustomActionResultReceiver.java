package o;

import java.util.ArrayList;
import o.isDetached;
/* loaded from: classes-dex2jar.jar:o/isDetached$MediaBrowserCompat$CustomActionResultReceiver.class */
public final class isDetached$MediaBrowserCompat$CustomActionResultReceiver implements isDetached.IconCompatParcelizer {
    final int a;
    final int c;
    final /* synthetic */ isDetached d;
    final String e;

    public isDetached$MediaBrowserCompat$CustomActionResultReceiver(isDetached isdetached, String str, int i, int i2) {
        this.d = isdetached;
        this.e = str;
        this.a = i;
        this.c = i2;
    }

    @Override // o.isDetached.IconCompatParcelizer
    public final boolean d(ArrayList<getUserVisibleHint> arrayList, ArrayList<Boolean> arrayList2) {
        if (this.d.s == null || this.a >= 0 || this.e != null || !this.d.s.getChildFragmentManager().b(null, -1, 0)) {
            return this.d.a(arrayList, arrayList2, this.e, this.a, this.c);
        }
        return false;
    }
}
