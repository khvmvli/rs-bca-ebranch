package o;

import android.view.KeyEvent;
import android.widget.TextView;
/* loaded from: classes-dex2jar.jar:o/setCardDescription.class */
public final /* synthetic */ class setCardDescription implements TextView.OnEditorActionListener {
    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        return (keyEvent.getAction() == 0 && i == 66) ? false : true;
    }
}
