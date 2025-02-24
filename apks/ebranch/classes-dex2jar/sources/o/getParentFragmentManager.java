package o;

import android.content.ClipData;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
/* loaded from: classes-dex2jar.jar:o/getParentFragmentManager.class */
public final class getParentFragmentManager implements prepareCallInternal {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/getParentFragmentManager$read.class */
    public static final class read {
        static CharSequence c(Context context, ClipData.Item item, int i) {
            if ((i & 1) == 0) {
                return item.coerceToStyledText(context);
            }
            CharSequence coerceToText = item.coerceToText(context);
            String str = coerceToText;
            if (coerceToText instanceof Spanned) {
                str = coerceToText.toString();
            }
            return str;
        }
    }

    private static void c(Editable editable, CharSequence charSequence) {
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        int max = Math.max(0, Math.min(selectionStart, selectionEnd));
        int max2 = Math.max(0, Math.max(selectionStart, selectionEnd));
        Selection.setSelection(editable, max2);
        editable.replace(max, max2, charSequence);
    }

    private static void c(TextView textView, onSaveInstanceState onsaveinstancestate) {
        ClipData e = onsaveinstancestate.e();
        Context context = textView.getContext();
        int d = onsaveinstancestate.d();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        for (int i = 0; i < e.getItemCount(); i++) {
            CharSequence c = read.c(context, e.getItemAt(i), d);
            if (c != null) {
                spannableStringBuilder.append(c);
            }
        }
        c((Editable) textView.getText(), spannableStringBuilder);
    }

    @Override // o.prepareCallInternal
    public final onSaveInstanceState a(View view, onSaveInstanceState onsaveinstancestate) {
        if (Log.isLoggable("ReceiveContent", 3)) {
            StringBuilder sb = new StringBuilder("onReceive: ");
            sb.append(onsaveinstancestate);
            Log.d("ReceiveContent", sb.toString());
        }
        int c = onsaveinstancestate.c();
        if (c == 2) {
            return onsaveinstancestate;
        }
        if (c == 3) {
            c((TextView) view, onsaveinstancestate);
            return null;
        }
        ClipData e = onsaveinstancestate.e();
        int d = onsaveinstancestate.d();
        TextView textView = (TextView) view;
        Editable editable = (Editable) textView.getText();
        Context context = textView.getContext();
        boolean z = false;
        for (int i = 0; i < e.getItemCount(); i++) {
            CharSequence c2 = read.c(context, e.getItemAt(i), d);
            z = z;
            if (c2 != null) {
                if (!z) {
                    c(editable, c2);
                    z = true;
                } else {
                    editable.insert(Selection.getSelectionEnd(editable), "\n");
                    editable.insert(Selection.getSelectionEnd(editable), c2);
                    z = z;
                }
            }
        }
        return null;
    }
}
