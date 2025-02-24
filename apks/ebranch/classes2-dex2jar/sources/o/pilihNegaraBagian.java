package o;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import android.util.AttributeSet;
import java.util.UUID;
/* loaded from: classes2-dex2jar.jar:o/pilihNegaraBagian.class */
public class pilihNegaraBagian extends pilihTipeTujuanTransaksiPenerima {
    protected Runnable d;
    protected String e = UUID.randomUUID().toString();
    protected Handler c = new Handler();

    /* JADX INFO: Access modifiers changed from: protected */
    public pilihNegaraBagian(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public pilihNegaraBagian(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public pilihNegaraBagian(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    protected final void d(Runnable runnable, long j) {
        if (this.c == null) {
            this.c = new Handler();
        }
        this.c.postAtTime(runnable, this.e, SystemClock.uptimeMillis() + 15);
    }
}
