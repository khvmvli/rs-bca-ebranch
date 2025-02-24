package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import java.util.List;
/* loaded from: classes2-dex2jar.jar:o/Page6DBCADollarSFragment_ViewBinding.class */
public class Page6DBCADollarSFragment_ViewBinding extends FrameLayout {
    private Context a;
    private List<clikedKlikBCA> b;
    public showInfoBanking c;
    private Page6DBCADollarFragment d;
    private int e;

    public Page6DBCADollarSFragment_ViewBinding(Context context) {
        super(context);
        this.a = context;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes((AttributeSet) null, Page6DBCADollarSFragment$MediaBrowserCompat$CustomActionResultReceiver.G);
        b(obtainStyledAttributes, null);
        obtainStyledAttributes.recycle();
    }

    public Page6DBCADollarSFragment_ViewBinding(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = context;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, Page6DBCADollarSFragment$MediaBrowserCompat$CustomActionResultReceiver.G);
        b(obtainStyledAttributes, attributeSet);
        obtainStyledAttributes.recycle();
    }

    public Page6DBCADollarSFragment_ViewBinding(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = context;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, Page6DBCADollarSFragment$MediaBrowserCompat$CustomActionResultReceiver.G);
        b(obtainStyledAttributes, attributeSet);
        obtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v47, types: [android.widget.TextView, o.showInfoBanking] */
    /* JADX WARN: Type inference failed for: r0v51, types: [android.widget.TextView, o.showInfoBanking] */
    /* JADX WARN: Type inference failed for: r1v19, types: [o.showInfoBanking, android.view.View] */
    /* JADX WARN: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private void a(android.content.res.TypedArray r9, android.util.AttributeSet r10) {
        /*
        // Method dump skipped, instructions count: 516
        */
        throw new UnsupportedOperationException("Method not decompiled: o.Page6DBCADollarSFragment_ViewBinding.a(android.content.res.TypedArray, android.util.AttributeSet):void");
    }

    private void b(TypedArray typedArray, AttributeSet attributeSet) {
        this.e = typedArray.getInt(Page6DBCADollarSFragment$MediaBrowserCompat$CustomActionResultReceiver.Z, 4);
        a(typedArray, attributeSet);
    }

    static /* synthetic */ void d(Page6DBCADollarSFragment_ViewBinding page6DBCADollarSFragment_ViewBinding, int i) {
        for (int i2 = 0; i2 < page6DBCADollarSFragment_ViewBinding.b.size(); i2++) {
            if (i2 == i) {
                page6DBCADollarSFragment_ViewBinding.b.get(i2).setViewState(1);
            } else {
                page6DBCADollarSFragment_ViewBinding.b.get(i2).setViewState(0);
            }
        }
        if (i == page6DBCADollarSFragment_ViewBinding.b.size()) {
            List<clikedKlikBCA> list = page6DBCADollarSFragment_ViewBinding.b;
            list.get(list.size() - 1).setViewState(1);
        }
    }

    public final void b() {
        List<clikedKlikBCA> list = this.b;
        if (list != null) {
            for (clikedKlikBCA clikedklikbca : list) {
                clikedklikbca.setViewState(-1);
            }
        }
    }

    public void setOTP(CharSequence charSequence) {
        for (int i = 0; i < this.b.size(); i++) {
            if (i < charSequence.length()) {
                this.b.get(i).setText(String.valueOf(charSequence.charAt(i)));
            } else {
                this.b.get(i).setText("");
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.widget.TextView, o.showInfoBanking] */
    public void setOTP(String str) {
        this.c.setText(str);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [o.showInfoBanking, android.view.View] */
    @Override // android.view.View
    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        setOnTouchListener(onTouchListener);
        this.c.setOnTouchListener(onTouchListener);
    }

    public void setOtpListener(Page6DBCADollarFragment page6DBCADollarFragment) {
        this.d = page6DBCADollarFragment;
    }
}
