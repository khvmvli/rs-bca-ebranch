package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Handler;
import android.text.TextPaint;
import android.util.Log;
import o.inset;
/* loaded from: classes2-dex2jar.jar:o/InfoCaraPembayaranDialog.class */
public class InfoCaraPembayaranDialog {
    public final boolean a;
    public final float b;
    public Typeface c;
    boolean d = false;
    public final String e;
    public final ColorStateList f;
    public final float g;
    public final float h;
    public final float i;
    public final boolean j;
    public final ColorStateList k;
    public final int l;
    public final ColorStateList m;
    public float n;

    /* renamed from: o  reason: collision with root package name */
    public final ColorStateList f32o;
    private final int p;
    public final int r;

    public InfoCaraPembayaranDialog(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, BaseDialogKotlin$MediaSessionCompat$Token.gE);
        this.n = obtainStyledAttributes.getDimension(BaseDialogKotlin$MediaSessionCompat$Token.gM, 0.0f);
        this.m = HubunganKeuanganDialog_ViewBinding.c(context, obtainStyledAttributes, BaseDialogKotlin$MediaSessionCompat$Token.gJ);
        this.f32o = HubunganKeuanganDialog_ViewBinding.c(context, obtainStyledAttributes, BaseDialogKotlin$MediaSessionCompat$Token.gO);
        this.k = HubunganKeuanganDialog_ViewBinding.c(context, obtainStyledAttributes, BaseDialogKotlin$MediaSessionCompat$Token.gL);
        this.l = obtainStyledAttributes.getInt(BaseDialogKotlin$MediaSessionCompat$Token.gK, 0);
        this.r = obtainStyledAttributes.getInt(BaseDialogKotlin$MediaSessionCompat$Token.gN, 1);
        int i2 = BaseDialogKotlin$MediaSessionCompat$Token.gT;
        int i3 = obtainStyledAttributes.hasValue(i2) ? i2 : BaseDialogKotlin$MediaSessionCompat$Token.gD;
        this.p = obtainStyledAttributes.getResourceId(i3, 0);
        this.e = obtainStyledAttributes.getString(i3);
        this.j = obtainStyledAttributes.getBoolean(BaseDialogKotlin$MediaSessionCompat$Token.gR, false);
        this.f = HubunganKeuanganDialog_ViewBinding.c(context, obtainStyledAttributes, BaseDialogKotlin$MediaSessionCompat$Token.gG);
        this.g = obtainStyledAttributes.getFloat(BaseDialogKotlin$MediaSessionCompat$Token.gI, 0.0f);
        this.i = obtainStyledAttributes.getFloat(BaseDialogKotlin$MediaSessionCompat$Token.gH, 0.0f);
        this.h = obtainStyledAttributes.getFloat(BaseDialogKotlin$MediaSessionCompat$Token.gF, 0.0f);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i, BaseDialogKotlin$MediaSessionCompat$Token.ej);
        this.a = obtainStyledAttributes2.hasValue(BaseDialogKotlin$MediaSessionCompat$Token.em);
        this.b = obtainStyledAttributes2.getFloat(BaseDialogKotlin$MediaSessionCompat$Token.em, 0.0f);
        obtainStyledAttributes2.recycle();
    }

    public final void a(Context context, TextPaint textPaint, InfoEchannelDialog infoEchannelDialog) {
        if (c(context)) {
            e(textPaint, b(context));
        } else {
            c(context, textPaint, infoEchannelDialog);
        }
        ColorStateList colorStateList = this.m;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, this.m.getDefaultColor()) : -16777216);
        float f = this.h;
        float f2 = this.g;
        float f3 = this.i;
        ColorStateList colorStateList2 = this.f;
        textPaint.setShadowLayer(f, f2, f3, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, this.f.getDefaultColor()) : 0);
    }

    public final Typeface b(Context context) {
        if (this.d) {
            return this.c;
        }
        if (!context.isRestricted()) {
            try {
                try {
                    Typeface c = inset.c(context, this.p);
                    this.c = c;
                    if (c != null) {
                        this.c = Typeface.create(c, this.l);
                    }
                } catch (Resources.NotFoundException | UnsupportedOperationException e) {
                }
            } catch (Exception e2) {
                StringBuilder sb = new StringBuilder("Error loading font ");
                sb.append(this.e);
                Log.d("TextAppearance", sb.toString(), e2);
            }
        }
        b();
        this.d = true;
        return this.c;
    }

    public void b() {
        String str;
        if (this.c == null && (str = this.e) != null) {
            this.c = Typeface.create(str, this.l);
        }
        if (this.c == null) {
            int i = this.r;
            if (i == 1) {
                this.c = Typeface.SANS_SERIF;
            } else if (i == 2) {
                this.c = Typeface.SERIF;
            } else if (i != 3) {
                this.c = Typeface.DEFAULT;
            } else {
                this.c = Typeface.MONOSPACE;
            }
            this.c = Typeface.create(this.c, this.l);
        }
    }

    public final void c(Context context, final TextPaint textPaint, final InfoEchannelDialog infoEchannelDialog) {
        b();
        e(textPaint, this.c);
        c(context, new InfoEchannelDialog() { // from class: o.InfoCaraPembayaranDialog.5
            @Override // o.InfoEchannelDialog
            public final void c(Typeface typeface, boolean z) {
                InfoCaraPembayaranDialog.this.e(textPaint, typeface);
                infoEchannelDialog.c(typeface, z);
            }

            @Override // o.InfoEchannelDialog
            public final void d(int i) {
                infoEchannelDialog.d(i);
            }
        });
    }

    public final void c(Context context, final InfoEchannelDialog infoEchannelDialog) {
        if (c(context)) {
            b(context);
        } else {
            b();
        }
        int i = this.p;
        if (i == 0) {
            this.d = true;
        }
        if (this.d) {
            infoEchannelDialog.c(this.c, true);
            return;
        }
        try {
            inset.a(context, i, new inset.RemoteActionCompatParcelizer() { // from class: o.InfoCaraPembayaranDialog.4
                public final void e(int i2) {
                    InfoCaraPembayaranDialog.this.d = true;
                    infoEchannelDialog.d(i2);
                }

                public final void e(Typeface typeface) {
                    InfoCaraPembayaranDialog infoCaraPembayaranDialog = InfoCaraPembayaranDialog.this;
                    infoCaraPembayaranDialog.c = Typeface.create(typeface, infoCaraPembayaranDialog.l);
                    InfoCaraPembayaranDialog.this.d = true;
                    infoEchannelDialog.c(InfoCaraPembayaranDialog.this.c, false);
                }
            }, (Handler) null);
        } catch (Resources.NotFoundException e) {
            this.d = true;
            infoEchannelDialog.d(1);
        } catch (Exception e2) {
            StringBuilder sb = new StringBuilder("Error loading font ");
            sb.append(this.e);
            Log.d("TextAppearance", sb.toString(), e2);
            this.d = true;
            infoEchannelDialog.d(-3);
        }
    }

    public boolean c(Context context) {
        boolean z = true;
        if (InfoDialog.d) {
            return true;
        }
        int i = this.p;
        if ((i != 0 ? inset.b(context, i) : null) == null) {
            z = false;
        }
        return z;
    }

    public final void e(TextPaint textPaint, Typeface typeface) {
        textPaint.setTypeface(typeface);
        int style = (typeface.getStyle() ^ -1) & this.l;
        textPaint.setFakeBoldText((style & 1) != 0);
        textPaint.setTextSkewX((style & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.n);
        if (this.a) {
            textPaint.setLetterSpacing(this.b);
        }
    }
}
