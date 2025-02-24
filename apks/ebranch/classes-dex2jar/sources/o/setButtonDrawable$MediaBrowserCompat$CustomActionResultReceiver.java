package o;

import android.content.Context;
import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/setButtonDrawable$MediaBrowserCompat$CustomActionResultReceiver.class */
public final class setButtonDrawable$MediaBrowserCompat$CustomActionResultReceiver extends setBackgroundDrawable {
    final /* synthetic */ setButtonDrawable i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setButtonDrawable$MediaBrowserCompat$CustomActionResultReceiver(setButtonDrawable setbuttondrawable, Context context, setOnDismissListener setondismisslistener, View view, boolean z) {
        super(context, setondismisslistener, view, true, setHasDecor$MediaBrowserCompat$CustomActionResultReceiver.k);
        this.i = setbuttondrawable;
        a(8388613);
        c(setbuttondrawable.p);
    }

    @Override // o.setBackgroundDrawable
    public final void a() {
        if (this.i.c != null) {
            this.i.c.close();
        }
        this.i.f202o = null;
        a();
    }
}
