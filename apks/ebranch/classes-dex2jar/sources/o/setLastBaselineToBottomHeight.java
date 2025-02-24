package o;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
/* loaded from: classes-dex2jar.jar:o/setLastBaselineToBottomHeight.class */
final class setLastBaselineToBottomHeight {
    private TextView c;
    private TextClassifier e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public setLastBaselineToBottomHeight(TextView textView) {
        this.c = textView;
    }

    public final TextClassifier c() {
        TextClassifier textClassifier = this.e;
        TextClassifier textClassifier2 = textClassifier;
        if (textClassifier == null) {
            TextClassificationManager textClassificationManager = (TextClassificationManager) this.c.getContext().getSystemService(TextClassificationManager.class);
            if (textClassificationManager != null) {
                return textClassificationManager.getTextClassifier();
            }
            textClassifier2 = TextClassifier.NO_OP;
        }
        return textClassifier2;
    }

    public final void c(TextClassifier textClassifier) {
        this.e = textClassifier;
    }
}
