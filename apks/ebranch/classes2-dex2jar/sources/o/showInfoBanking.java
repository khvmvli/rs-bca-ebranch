package o;

import android.content.Context;
import android.text.Editable;
import android.util.AttributeSet;
import o.Page6DBCADollarSFragment;
/* loaded from: classes2-dex2jar.jar:o/showInfoBanking.class */
public final class showInfoBanking extends setPopupBackgroundDrawable {
    public showInfoBanking(Context context) {
        super(context);
        e(context);
    }

    public showInfoBanking(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        e(context);
    }

    public showInfoBanking(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        e(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void e(Context context) {
        setCursorVisible(false);
        setTextColor(context.getResources().getColor(Page6DBCADollarSFragment.RemoteActionCompatParcelizer.d));
        setBackgroundDrawable(null);
        setInputType(2);
        setSelectAllOnFocus(false);
        setTextIsSelectable(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onSelectionChanged(int i, int i2) {
        Editable text = getText();
        if ((text == null || i == text.length()) && i2 == text.length()) {
            onSelectionChanged(i, i2);
        } else {
            setSelection(text.length(), text.length());
        }
    }
}
