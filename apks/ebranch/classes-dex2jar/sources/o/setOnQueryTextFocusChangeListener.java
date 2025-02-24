package o;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import com.facebook.stetho.websocket.CloseCodes;
import o.setHasDecor;
/* loaded from: classes-dex2jar.jar:o/setOnQueryTextFocusChangeListener.class */
final class setOnQueryTextFocusChangeListener {
    final View a;
    final Context b;
    final WindowManager.LayoutParams c;
    final TextView d;
    final Rect h = new Rect();
    final int[] e = new int[2];
    final int[] j = new int[2];

    /* JADX INFO: Access modifiers changed from: package-private */
    public setOnQueryTextFocusChangeListener(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.c = layoutParams;
        this.b = context;
        View inflate = LayoutInflater.from(context).inflate(setHasDecor.MediaMetadataCompat.y, (ViewGroup) null);
        this.a = inflate;
        this.d = (TextView) inflate.findViewById(setHasDecor$MediaBrowserCompat$SearchResultReceiver.u);
        layoutParams.setTitle(getClass().getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = CloseCodes.PROTOCOL_ERROR;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = setHasDecor.MediaDescriptionCompat.d;
        layoutParams.flags = 24;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        if (this.a.getParent() != null) {
            ((WindowManager) this.b.getSystemService("window")).removeView(this.a);
        }
    }
}
