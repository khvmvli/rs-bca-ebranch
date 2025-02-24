package o;

import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes2-dex2jar.jar:o/OR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.class */
final class OR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver {
    ArrayList<OR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver> a = new ArrayList<>();
    private int[] c;

    public OR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver(int... iArr) {
        this.c = iArr;
    }

    private boolean c(int i) {
        for (int i2 : this.c) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public final OR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver d(int i) {
        ArrayList<OR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver> arrayList = this.a;
        if (arrayList == null) {
            return null;
        }
        Iterator<OR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver> it = arrayList.iterator();
        while (it.hasNext()) {
            OR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver next = it.next();
            if (next.c(i)) {
                return next;
            }
        }
        return null;
    }
}
