package o;

import android.content.Context;
import android.util.SparseIntArray;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
/* loaded from: classes-dex2jar.jar:o/setJobOthers.class */
public final class setJobOthers {
    private realmGet$incomeSourceValue a;
    private final SparseIntArray d;

    public setJobOthers() {
        this(realmGet$jobOthers.a());
    }

    public setJobOthers(realmGet$incomeSourceValue realmget_incomesourcevalue) {
        this.d = new SparseIntArray();
        setFotoKtp.b(realmget_incomesourcevalue);
        this.a = realmget_incomesourcevalue;
    }

    public final int c(Context context, int i) {
        return this.d.get(i, -1);
    }

    public final void d() {
        this.d.clear();
    }

    @ResultIgnorabilityUnspecified
    public final int e(Context context, realmGet$name$MediaBrowserCompat$SearchResultReceiver realmget_name_mediabrowsercompat_searchresultreceiver) {
        setFotoKtp.b(context);
        setFotoKtp.b(realmget_name_mediabrowsercompat_searchresultreceiver);
        int c = 0;
        if (!realmget_name_mediabrowsercompat_searchresultreceiver.o()) {
            return 0;
        }
        int a = realmget_name_mediabrowsercompat_searchresultreceiver.a();
        c = c(context, a);
        if (c == -1) {
            int i = 0;
            while (true) {
                if (i >= this.d.size()) {
                    c = -1;
                    break;
                }
                int keyAt = this.d.keyAt(i);
                if (keyAt > a && this.d.get(keyAt) == 0) {
                    break;
                }
                i++;
            }
            if (c == -1) {
                c = this.a.c(context, a);
            }
            this.d.put(a, c);
        }
        return c;
    }
}
