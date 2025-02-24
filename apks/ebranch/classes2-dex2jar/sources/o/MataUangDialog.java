package o;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
/* loaded from: classes2-dex2jar.jar:o/MataUangDialog.class */
public class MataUangDialog extends setTypeface {
    public MataUangDialog(Context context) {
        this(context, null);
    }

    public MataUangDialog(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public MataUangDialog(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private MataUangDialog(Context context, AttributeSet attributeSet, int i, int i2) {
        super(MataUangDialog_ViewBinding.a(context, attributeSet, i, 0), attributeSet, i);
        Context context2 = getContext();
        boolean z = true;
        if (HubunganDialog_ViewBinding.e(context2, BaseDialogKotlin$MediaBrowserCompat$CustomActionResultReceiver.T, true)) {
            Resources.Theme theme = context2.getTheme();
            TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, BaseDialogKotlin$MediaSessionCompat$Token.en, i, 0);
            int e = e(context2, obtainStyledAttributes, BaseDialogKotlin$MediaSessionCompat$Token.el, BaseDialogKotlin$MediaSessionCompat$Token.ep);
            obtainStyledAttributes.recycle();
            if (!(e == -1 ? false : z)) {
                TypedArray obtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, BaseDialogKotlin$MediaSessionCompat$Token.en, i, 0);
                int resourceId = obtainStyledAttributes2.getResourceId(BaseDialogKotlin$MediaSessionCompat$Token.er, -1);
                obtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    d(theme, resourceId);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void d(Resources.Theme theme, int i) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(i, BaseDialogKotlin$MediaSessionCompat$Token.ej);
        int e = e(getContext(), obtainStyledAttributes, BaseDialogKotlin$MediaSessionCompat$Token.ek, BaseDialogKotlin$MediaSessionCompat$Token.eo);
        obtainStyledAttributes.recycle();
        if (e >= 0) {
            setLineHeight(e);
        }
    }

    private static int e(Context context, TypedArray typedArray, int... iArr) {
        int i = -1;
        for (int i2 = 0; i2 < 2 && i < 0; i2++) {
            i = HubunganKeuanganDialog_ViewBinding.d(context, typedArray, iArr[i2], -1);
        }
        return i;
    }

    public void setTextAppearance(Context context, int i) {
        setTextAppearance(context, i);
        if (HubunganDialog_ViewBinding.e(context, BaseDialogKotlin$MediaBrowserCompat$CustomActionResultReceiver.T, true)) {
            d(context.getTheme(), i);
        }
    }
}
