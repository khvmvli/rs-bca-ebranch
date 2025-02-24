package o;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import o.OnPageChange;
/* loaded from: classes-dex2jar.jar:o/OnLongClick.class */
public final class OnLongClick extends BindString {
    private final OnPageChange.Callback<Integer, Integer> b;
    private OnPageChange.Callback<ColorFilter, ColorFilter> d;
    private final setPageColor f;
    private final String g;
    private final boolean h;

    /* JADX WARN: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public OnLongClick(o.setText r12, o.setPageColor r13, o.getResourceEntryName r14) {
        /*
            r11 = this;
            r0 = r14
            o.getResourceEntryName$RemoteActionCompatParcelizer r0 = r0.b
            r15 = r0
            int[] r0 = o.getResourceEntryName.AnonymousClass2.e
            r1 = r15
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r16 = r0
            r0 = r16
            r1 = 1
            if (r0 == r1) goto L_0x002d
            r0 = r16
            r1 = 2
            if (r0 == r1) goto L_0x0025
            android.graphics.Paint$Cap r0 = android.graphics.Paint.Cap.SQUARE
            r15 = r0
            goto L_0x0032
        L_0x0025:
            android.graphics.Paint$Cap r0 = android.graphics.Paint.Cap.ROUND
            r15 = r0
            goto L_0x0032
        L_0x002d:
            android.graphics.Paint$Cap r0 = android.graphics.Paint.Cap.BUTT
            r15 = r0
        L_0x0032:
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r15
            r4 = r14
            o.getResourceEntryName$write r4 = r4.d
            android.graphics.Paint$Join r4 = r4.e()
            r5 = r14
            float r5 = r5.f
            r6 = r14
            o.size r6 = r6.i
            r7 = r14
            o.ImmutableList r7 = r7.h
            r8 = r14
            java.util.List<o.ImmutableList> r8 = r8.c
            r9 = r14
            o.ImmutableList r9 = r9.j
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r0 = r11
            r1 = r13
            r0.f = r1
            r0 = r11
            r1 = r14
            java.lang.String r1 = r1.g
            r0.g = r1
            r0 = r11
            r1 = r14
            boolean r1 = r1.a
            r0.h = r1
            o.OnTextChanged r0 = new o.OnTextChanged
            r1 = r0
            r2 = r14
            o.run r2 = r2.e
            java.util.List r2 = r2.c
            r1.<init>(r2)
            r12 = r0
            r0 = r11
            r1 = r12
            r0.b = r1
            r0 = r12
            java.util.List<o.OnPageChange$Callback$MediaBrowserCompat$CustomActionResultReceiver> r0 = r0.d
            r1 = r11
            boolean r0 = r0.add(r1)
            r0 = r13
            java.util.List<o.OnPageChange$Callback<?, ?>> r0 = r0.e
            r1 = r12
            boolean r0 = r0.add(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.OnLongClick.<init>(o.setText, o.setPageColor, o.getResourceEntryName):void");
    }

    @Override // o.BindString, o.doClick
    public final <T> void a(T t, onClickBcaMobile<T> onclickbcamobile) {
        a(t, onclickbcamobile);
        if (t == value.w) {
            this.b.d(onclickbcamobile);
        } else if (t == value.b) {
            OnPageChange.Callback<ColorFilter, ColorFilter> callback = this.d;
            if (callback != null) {
                this.f.e.remove(callback);
            }
            if (onclickbcamobile == null) {
                this.d = null;
                return;
            }
            Unbinder unbinder = new Unbinder(onclickbcamobile);
            this.d = unbinder;
            unbinder.d.add(this);
            setPageColor setpagecolor = this.f;
            OnPageChange.Callback<Integer, Integer> callback2 = this.b;
            if (callback2 != null) {
                setpagecolor.e.add(callback2);
            }
        }
    }

    @Override // o.BindString, o.ButterKnife
    public final void c(Canvas canvas, Matrix matrix, int i) {
        if (!this.h) {
            this.a.setColor(((OnTextChanged) this.b).f());
            if (this.d != null) {
                this.a.setColorFilter(this.d.h());
            }
            c(canvas, matrix, i);
        }
    }

    @Override // o.style
    public final String e() {
        return this.g;
    }
}
