package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
/* loaded from: classes2-dex2jar.jar:o/KetentuanBankTransferDialog.class */
public class KetentuanBankTransferDialog extends LinearLayout implements KeluarFormReservationDialog {
    private int a;
    private int b;
    public Button c;
    TextView e;

    public KetentuanBankTransferDialog(Context context) {
        this(context, null);
    }

    public KetentuanBankTransferDialog(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, BaseDialogKotlin$MediaSessionCompat$Token.fK);
        this.b = obtainStyledAttributes.getDimensionPixelSize(BaseDialogKotlin$MediaSessionCompat$Token.fL, -1);
        this.a = obtainStyledAttributes.getDimensionPixelSize(BaseDialogKotlin$MediaSessionCompat$Token.fM, -1);
        obtainStyledAttributes.recycle();
    }

    private boolean a(int i, int i2, int i3) {
        boolean z;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        } else {
            z = false;
        }
        if (!(this.e.getPaddingTop() == i2 && this.e.getPaddingBottom() == i3)) {
            TextView textView = this.e;
            if (findFragmentByWho.I(textView)) {
                findFragmentByWho.c(textView, findFragmentByWho.t(textView), i2, findFragmentByWho.s(textView), i3);
                z = true;
            } else {
                textView.setPadding(textView.getPaddingLeft(), i2, textView.getPaddingRight(), i3);
                z = true;
            }
        }
        return z;
    }

    @Override // o.KeluarFormReservationDialog
    public final void c(int i, int i2) {
        this.e.setAlpha(0.0f);
        this.e.animate().alpha(1.0f).setDuration(180).setStartDelay(70).start();
        if (this.c.getVisibility() == 0) {
            this.c.setAlpha(0.0f);
            this.c.animate().alpha(1.0f).setDuration(180).setStartDelay(70).start();
        }
    }

    @Override // o.KeluarFormReservationDialog
    public final void d(int i, int i2) {
        this.e.setAlpha(1.0f);
        this.e.animate().alpha(0.0f).setDuration(180).setStartDelay(0).start();
        if (this.c.getVisibility() == 0) {
            this.c.setAlpha(1.0f);
            this.c.animate().alpha(0.0f).setDuration(180).setStartDelay(0).start();
        }
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        onFinishInflate();
        this.e = (TextView) findViewById(BaseDialogKotlin$MediaBrowserCompat$ItemReceiver.W);
        this.c = (Button) findViewById(BaseDialogKotlin$MediaBrowserCompat$ItemReceiver.X);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x008f, code lost:
        if (a(1, r7, r7 - r0) != false) goto L_0x00ab;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a8, code lost:
        if (a(0, r7, r7) != false) goto L_0x00ab;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ab, code lost:
        r11 = true;
     */
    @Override // android.widget.LinearLayout, android.view.View
    /* Code decompiled incorrectly, please refer to instructions dump */
    protected void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            r0 = r6
            r1 = r7
            r2 = r8
            r0.onMeasure(r1, r2)
            r0 = r7
            r9 = r0
            r0 = r6
            int r0 = r0.b
            if (r0 <= 0) goto L_0x0032
            r0 = r6
            int r0 = r0.getMeasuredWidth()
            r10 = r0
            r0 = r6
            int r0 = r0.b
            r11 = r0
            r0 = r7
            r9 = r0
            r0 = r10
            r1 = r11
            if (r0 <= r1) goto L_0x0032
            r0 = r11
            r1 = 1073741824(0x40000000, float:2.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
            r9 = r0
            r0 = r6
            r1 = r9
            r2 = r8
            r0.onMeasure(r1, r2)
        L_0x0032:
            r0 = r6
            android.content.res.Resources r0 = r0.getResources()
            int r1 = o.BaseDialogKotlin.read.h
            int r0 = r0.getDimensionPixelSize(r1)
            r7 = r0
            r0 = r6
            android.content.res.Resources r0 = r0.getResources()
            int r1 = o.BaseDialogKotlin.read.f
            int r0 = r0.getDimensionPixelSize(r1)
            r10 = r0
            r0 = r6
            android.widget.TextView r0 = r0.e
            android.text.Layout r0 = r0.getLayout()
            int r0 = r0.getLineCount()
            r11 = r0
            r0 = 0
            r12 = r0
            r0 = r11
            r1 = 1
            if (r0 <= r1) goto L_0x0064
            r0 = 1
            r11 = r0
            goto L_0x0067
        L_0x0064:
            r0 = 0
            r11 = r0
        L_0x0067:
            r0 = r11
            if (r0 == 0) goto L_0x0095
            r0 = r6
            int r0 = r0.a
            if (r0 <= 0) goto L_0x0095
            r0 = r6
            android.widget.Button r0 = r0.c
            int r0 = r0.getMeasuredWidth()
            r1 = r6
            int r1 = r1.a
            if (r0 <= r1) goto L_0x0095
            r0 = r12
            r11 = r0
            r0 = r6
            r1 = 1
            r2 = r7
            r3 = r7
            r4 = r10
            int r3 = r3 - r4
            boolean r0 = r0.a(r1, r2, r3)
            if (r0 == 0) goto L_0x00ae
            goto L_0x00ab
        L_0x0095:
            r0 = r11
            if (r0 != 0) goto L_0x009d
            r0 = r10
            r7 = r0
        L_0x009d:
            r0 = r12
            r11 = r0
            r0 = r6
            r1 = 0
            r2 = r7
            r3 = r7
            boolean r0 = r0.a(r1, r2, r3)
            if (r0 == 0) goto L_0x00ae
        L_0x00ab:
            r0 = 1
            r11 = r0
        L_0x00ae:
            r0 = r11
            if (r0 == 0) goto L_0x00b9
            r0 = r6
            r1 = r9
            r2 = r8
            r0.onMeasure(r1, r2)
        L_0x00b9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.KetentuanBankTransferDialog.onMeasure(int, int):void");
    }

    public void setMaxInlineActionWidth(int i) {
        this.a = i;
    }
}
