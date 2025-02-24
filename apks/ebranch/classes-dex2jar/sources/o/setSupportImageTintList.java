package o;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;
/* loaded from: classes-dex2jar.jar:o/setSupportImageTintList.class */
class setSupportImageTintList {
    private boolean e;
    private final CompoundButton g;
    private ColorStateList c = null;
    private PorterDuff.Mode d = null;
    private boolean a = false;
    private boolean b = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public setSupportImageTintList(CompoundButton compoundButton) {
        this.g = compoundButton;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int a(int i) {
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        if (this.e) {
            this.e = false;
            return;
        }
        this.e = true;
        e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0072 A[Catch: all -> 0x00f2, TRY_ENTER, TryCatch #0 {all -> 0x00f2, blocks: (B:3:0x0035, B:5:0x0044, B:7:0x0056, B:12:0x0072, B:14:0x0081, B:16:0x0093, B:17:0x00a4, B:17:0x00a4, B:18:0x00a7, B:20:0x00b3, B:21:0x00c1, B:21:0x00c1, B:22:0x00c4, B:24:0x00d0), top: B:32:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b3 A[Catch: all -> 0x00f2, TryCatch #0 {all -> 0x00f2, blocks: (B:3:0x0035, B:5:0x0044, B:7:0x0056, B:12:0x0072, B:14:0x0081, B:16:0x0093, B:17:0x00a4, B:17:0x00a4, B:18:0x00a7, B:20:0x00b3, B:21:0x00c1, B:21:0x00c1, B:22:0x00c4, B:24:0x00d0), top: B:32:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d0 A[Catch: all -> 0x00f2, TryCatch #0 {all -> 0x00f2, blocks: (B:3:0x0035, B:5:0x0044, B:7:0x0056, B:12:0x0072, B:14:0x0081, B:16:0x0093, B:17:0x00a4, B:17:0x00a4, B:18:0x00a7, B:20:0x00b3, B:21:0x00c1, B:21:0x00c1, B:22:0x00c4, B:24:0x00d0), top: B:32:0x0035 }] */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void a(android.util.AttributeSet r10, int r11) {
        /*
        // Method dump skipped, instructions count: 256
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setSupportImageTintList.a(android.util.AttributeSet, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(ColorStateList colorStateList) {
        this.c = colorStateList;
        this.a = true;
        e();
    }

    void e() {
        Drawable b = getHost.b(this.g);
        if (b == null) {
            return;
        }
        if (this.a || this.b) {
            Drawable mutate = getInsetsForType.h(b).mutate();
            if (this.a) {
                getInsetsForType.e(mutate, this.c);
            }
            if (this.b) {
                getInsetsForType.d(mutate, this.d);
            }
            if (mutate.isStateful()) {
                mutate.setState(this.g.getDrawableState());
            }
            this.g.setButtonDrawable(mutate);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(PorterDuff.Mode mode) {
        this.d = mode;
        this.b = true;
        e();
    }
}
