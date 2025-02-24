package o;

import android.content.Context;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
/* loaded from: classes-dex2jar.jar:o/getAnnualFeeAddOnAmount.class */
public class getAnnualFeeAddOnAmount extends EditText {
    public getAnnualFeeAddOnAmount(Context context) {
        super(context);
    }

    public getAnnualFeeAddOnAmount(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public getAnnualFeeAddOnAmount(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = onCreateInputConnection(editorInfo);
        editorInfo.imeOptions &= -1073741825;
        return onCreateInputConnection;
    }
}
