package o;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import java.lang.ref.WeakReference;
/* loaded from: classes2-dex2jar.jar:o/GuestWarningDialog_ViewBinding.class */
public final class GuestWarningDialog_ViewBinding {
    WeakReference<IconCompatParcelizer> a;
    public float c;
    public InfoCaraPembayaranDialog d;
    public final TextPaint e = new TextPaint(1);
    public final InfoEchannelDialog b = new InfoEchannelDialog() { // from class: o.GuestWarningDialog_ViewBinding.2
        @Override // o.InfoEchannelDialog
        public final void c(Typeface typeface, boolean z) {
            if (!z) {
                GuestWarningDialog_ViewBinding.this.j = true;
                IconCompatParcelizer iconCompatParcelizer = GuestWarningDialog_ViewBinding.this.a.get();
                if (iconCompatParcelizer != null) {
                    iconCompatParcelizer.d();
                }
            }
        }

        @Override // o.InfoEchannelDialog
        public final void d(int i) {
            GuestWarningDialog_ViewBinding.this.j = true;
            IconCompatParcelizer iconCompatParcelizer = GuestWarningDialog_ViewBinding.this.a.get();
            if (iconCompatParcelizer != null) {
                iconCompatParcelizer.d();
            }
        }
    };
    public boolean j = true;

    /* loaded from: classes2-dex2jar.jar:o/GuestWarningDialog_ViewBinding$IconCompatParcelizer.class */
    public interface IconCompatParcelizer {
        void d();

        int[] getState();

        @Override // o.GuestWarningDialog_ViewBinding.IconCompatParcelizer
        boolean onStateChange(int[] iArr);
    }

    public GuestWarningDialog_ViewBinding(IconCompatParcelizer iconCompatParcelizer) {
        this.a = new WeakReference<>(null);
        this.a = new WeakReference<>(iconCompatParcelizer);
    }

    public final void d(InfoCaraPembayaranDialog infoCaraPembayaranDialog, Context context) {
        if (this.d != infoCaraPembayaranDialog) {
            this.d = infoCaraPembayaranDialog;
            if (infoCaraPembayaranDialog != null) {
                TextPaint textPaint = this.e;
                InfoEchannelDialog infoEchannelDialog = this.b;
                if (infoCaraPembayaranDialog.c(context)) {
                    infoCaraPembayaranDialog.e(textPaint, infoCaraPembayaranDialog.b(context));
                } else {
                    infoCaraPembayaranDialog.c(context, textPaint, infoEchannelDialog);
                }
                IconCompatParcelizer iconCompatParcelizer = this.a.get();
                if (iconCompatParcelizer != null) {
                    this.e.drawableState = iconCompatParcelizer.getState();
                }
                infoCaraPembayaranDialog.a(context, this.e, this.b);
                this.j = true;
            }
            IconCompatParcelizer iconCompatParcelizer2 = this.a.get();
            if (iconCompatParcelizer2 != null) {
                iconCompatParcelizer2.d();
                iconCompatParcelizer2.onStateChange(iconCompatParcelizer2.getState());
            }
        }
    }
}
