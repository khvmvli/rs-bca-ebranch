package o;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;
/* loaded from: classes2-dex2jar.jar:o/HapusDaftarTransferDialog.class */
public class HapusDaftarTransferDialog extends ImageButton {
    public int g;

    public HapusDaftarTransferDialog(Context context) {
        this(context, null);
    }

    public HapusDaftarTransferDialog(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public HapusDaftarTransferDialog(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.g = getVisibility();
    }

    public final void e(int i, boolean z) {
        setVisibility(i);
        if (z) {
            this.g = i;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        setVisibility(i);
        this.g = i;
    }
}
