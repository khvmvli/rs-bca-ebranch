package o;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import o.OR3DataTransaksiBFragment;
import o.showInfoValueTodayOR;
/* loaded from: classes2-dex2jar.jar:o/lewati.class */
public final class lewati extends ViewGroup implements View.OnClickListener, OR3DataTransaksiBFragment.write {
    private OR2PilihProductFragment a;
    private ImageButton b;
    public OR3DataTransaksiBFragment c;
    private ImageButton e;

    public lewati(Context context) {
        super(context);
        e();
    }

    public lewati(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        e();
    }

    public lewati(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        e();
    }

    public lewati(Context context, OR2PilihProductFragment oR2PilihProductFragment) {
        super(context);
        this.a = oR2PilihProductFragment;
        e();
    }

    private void b(int i) {
        boolean z = true;
        int i2 = 0;
        boolean z2 = this.a.f() == showInfoValueTodayOR.read.HORIZONTAL;
        boolean z3 = i > 0;
        if (i >= this.c.f() - 1) {
            z = false;
        }
        this.b.setVisibility((!z2 || !z3) ? 4 : 0);
        ImageButton imageButton = this.e;
        if (!z2 || !z) {
            i2 = 4;
        }
        imageButton.setVisibility(i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [o.onChooseKategoriTujuanTransaksiOR, android.view.View, o.OR3DataTransaksiBFragment] */
    /* JADX WARN: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private void e() {
        /*
            r5 = this;
            o.onChooseKategoriTujuanTransaksiOR r0 = new o.onChooseKategoriTujuanTransaksiOR
            r1 = r0
            r2 = r5
            android.content.Context r2 = r2.getContext()
            r3 = r5
            o.OR2PilihProductFragment r3 = r3.a
            r1.<init>(r2, r3)
            r6 = r0
            r0 = r5
            r1 = r6
            r0.c = r1
            r0 = r5
            r1 = r6
            r0.addView(r1)
            r0 = r5
            android.content.Context r0 = r0.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r1 = o.pilihJenisKodeBank.read.d
            r2 = r5
            r3 = 0
            android.view.View r0 = r0.inflate(r1, r2, r3)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r7 = r0
        L_0x002d:
            r0 = r7
            int r0 = r0.getChildCount()
            if (r0 <= 0) goto L_0x0047
            r0 = r7
            r1 = 0
            android.view.View r0 = r0.getChildAt(r1)
            r6 = r0
            r0 = r7
            r1 = 0
            r0.removeViewAt(r1)
            r0 = r5
            r1 = r6
            r0.addView(r1)
            goto L_0x002d
        L_0x0047:
            r0 = r5
            r1 = r5
            int r2 = o.pilihJenisKodeBank.RemoteActionCompatParcelizer.r
            android.view.View r1 = r1.findViewById(r2)
            android.widget.ImageButton r1 = (android.widget.ImageButton) r1
            r0.b = r1
            r0 = r5
            r1 = r5
            int r2 = o.pilihJenisKodeBank.RemoteActionCompatParcelizer.q
            android.view.View r1 = r1.findViewById(r2)
            android.widget.ImageButton r1 = (android.widget.ImageButton) r1
            r0.e = r1
            r0 = r5
            o.OR2PilihProductFragment r0 = r0.a
            o.showInfoValueTodayOR$write r0 = r0.n()
            o.showInfoValueTodayOR$write r1 = o.showInfoValueTodayOR.write.VERSION_1
            if (r0 != r1) goto L_0x00a1
            r0 = 1
            r1 = 1098907648(0x41800000, float:16.0)
            r2 = r5
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r0 = android.util.TypedValue.applyDimension(r0, r1, r2)
            int r0 = (int) r0
            r8 = r0
            r0 = r5
            android.widget.ImageButton r0 = r0.b
            r1 = r8
            r0.setMinimumHeight(r1)
            r0 = r5
            android.widget.ImageButton r0 = r0.b
            r1 = r8
            r0.setMinimumWidth(r1)
            r0 = r5
            android.widget.ImageButton r0 = r0.e
            r1 = r8
            r0.setMinimumHeight(r1)
            r0 = r5
            android.widget.ImageButton r0 = r0.e
            r1 = r8
            r0.setMinimumWidth(r1)
        L_0x00a1:
            r0 = r5
            android.widget.ImageButton r0 = r0.b
            r1 = r5
            r0.setOnClickListener(r1)
            r0 = r5
            android.widget.ImageButton r0 = r0.e
            r1 = r5
            r0.setOnClickListener(r1)
            r0 = r5
            o.OR3DataTransaksiBFragment r0 = r0.c
            r1 = r5
            r0.setOnPageListener(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.lewati.e():void");
    }

    @Override // o.OR3DataTransaksiBFragment.write
    public final void a(int i) {
        b(i);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i;
        if (this.e == view) {
            i = 1;
        } else if (this.b == view) {
            i = -1;
        } else {
            return;
        }
        int e = OR3DataTransaksiBFragment.e(this.c.j()) + i;
        this.c.e(e);
        b(e);
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [o.OR3DataTransaksiBFragment, android.view.ViewGroup] */
    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ImageButton imageButton;
        ImageButton imageButton2;
        if (findFragmentByWho.k(this) == 1) {
            imageButton2 = this.e;
            imageButton = this.b;
        } else {
            imageButton2 = this.b;
            imageButton = this.e;
        }
        int i5 = i3 - i;
        this.c.layout(0, 0, i5, i4 - i2);
        pilihSumberDanaOR pilihsumberdanaor = (pilihSumberDanaOR) this.c.getChildAt(0);
        int f = pilihsumberdanaor.f();
        int c = pilihsumberdanaor.c();
        int e = pilihsumberdanaor.e();
        int measuredWidth = imageButton2.getMeasuredWidth();
        int measuredHeight = imageButton2.getMeasuredHeight();
        int paddingTop = pilihsumberdanaor.getPaddingTop() + ((f - measuredHeight) / 2);
        int i6 = ((c - measuredWidth) / 2) + e;
        imageButton2.layout(i6, paddingTop, measuredWidth + i6, measuredHeight + paddingTop);
        int measuredWidth2 = imageButton.getMeasuredWidth();
        int measuredHeight2 = imageButton.getMeasuredHeight();
        int paddingTop2 = pilihsumberdanaor.getPaddingTop() + ((f - measuredHeight2) / 2);
        int i7 = ((i5 - e) - ((c - measuredWidth2) / 2)) - 2;
        imageButton.layout(i7 - measuredWidth2, paddingTop2, i7, measuredHeight2 + paddingTop2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.view.View, o.OR3DataTransaksiBFragment] */
    /* JADX WARN: Type inference failed for: r0v6, types: [android.view.View, o.OR3DataTransaksiBFragment] */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.View, o.OR3DataTransaksiBFragment] */
    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        measureChild(this.c, i, i2);
        setMeasuredDimension(this.c.getMeasuredWidthAndState(), this.c.getMeasuredHeightAndState());
        int measuredWidth = this.c.getMeasuredWidth();
        int measuredHeight = this.c.getMeasuredHeight();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, Integer.MIN_VALUE);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight, Integer.MIN_VALUE);
        this.b.measure(makeMeasureSpec, makeMeasureSpec2);
        this.e.measure(makeMeasureSpec, makeMeasureSpec2);
    }
}
