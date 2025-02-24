package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
/* loaded from: classes-dex2jar.jar:o/setThumbDrawable.class */
class setThumbDrawable implements setTextOn {
    private setSwitchTypeface g(setTextOff settextoff) {
        return (setSwitchTypeface) settextoff.b();
    }

    @Override // o.setTextOn
    public float a(setTextOff settextoff) {
        return g(settextoff).b;
    }

    @Override // o.setTextOn
    public void a() {
    }

    @Override // o.setTextOn
    public void a(setTextOff settextoff, float f) {
        setSwitchTypeface g = g(settextoff);
        if (f != g.d) {
            g.d = f;
            g.d(null);
            g.invalidateSelf();
        }
    }

    @Override // o.setTextOn
    public void a(setTextOff settextoff, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        settextoff.b(new setSwitchTypeface(colorStateList, f));
        View a = settextoff.a();
        a.setClipToOutline(true);
        a.setElevation(f2);
        b(settextoff, f3);
    }

    @Override // o.setTextOn
    public float b(setTextOff settextoff) {
        return settextoff.a().getElevation();
    }

    @Override // o.setTextOn
    public void b(setTextOff settextoff, float f) {
        setSwitchTypeface g = g(settextoff);
        boolean e = settextoff.e();
        boolean c = settextoff.c();
        if (!(f == g.b && g.c == e && g.e == c)) {
            g.b = f;
            g.c = e;
            g.e = c;
            g.d(null);
            g.invalidateSelf();
        }
        i(settextoff);
    }

    @Override // o.setTextOn
    public ColorStateList c(setTextOff settextoff) {
        return g(settextoff).a;
    }

    @Override // o.setTextOn
    public float d(setTextOff settextoff) {
        return f(settextoff) * 2.0f;
    }

    @Override // o.setTextOn
    public float e(setTextOff settextoff) {
        return f(settextoff) * 2.0f;
    }

    @Override // o.setTextOn
    public void e(setTextOff settextoff, float f) {
        settextoff.a().setElevation(f);
    }

    @Override // o.setTextOn
    public void e(setTextOff settextoff, ColorStateList colorStateList) {
        setSwitchTypeface g = g(settextoff);
        g.b(colorStateList);
        g.invalidateSelf();
    }

    @Override // o.setTextOn
    public float f(setTextOff settextoff) {
        return g(settextoff).d;
    }

    @Override // o.setTextOn
    public void h(setTextOff settextoff) {
        b(settextoff, a(settextoff));
    }

    @Override // o.setTextOn
    public void i(setTextOff settextoff) {
        if (!settextoff.e()) {
            settextoff.a(0, 0, 0, 0);
            return;
        }
        float a = a(settextoff);
        float f = f(settextoff);
        int ceil = (int) Math.ceil((double) setSwitchTextAppearance.e(a, f, settextoff.c()));
        int ceil2 = (int) Math.ceil((double) setSwitchTextAppearance.b(a, f, settextoff.c()));
        settextoff.a(ceil, ceil2, ceil, ceil2);
    }

    @Override // o.setTextOn
    public void j(setTextOff settextoff) {
        b(settextoff, a(settextoff));
    }
}
