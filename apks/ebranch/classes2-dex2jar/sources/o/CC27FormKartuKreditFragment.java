package o;

import android.view.animation.Interpolator;
import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2-dex2jar.jar:o/CC27FormKartuKreditFragment.class */
public final class CC27FormKartuKreditFragment extends onClickUbahDataKartuTambahan1 {
    private int g;
    private boolean h = true;
    private int i;
    private int j;

    public CC27FormKartuKreditFragment(onChooseValueFasilitasPerlindungan$MediaBrowserCompat$CustomActionResultReceiver... onchoosevaluefasilitasperlindungan_mediabrowsercompat_customactionresultreceiverArr) {
        super(onchoosevaluefasilitasperlindungan_mediabrowsercompat_customactionresultreceiverArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public CC27FormKartuKreditFragment d() {
        ArrayList arrayList = this.c;
        int size = this.c.size();
        onChooseValueFasilitasPerlindungan$MediaBrowserCompat$CustomActionResultReceiver[] onchoosevaluefasilitasperlindungan_mediabrowsercompat_customactionresultreceiverArr = new onChooseValueFasilitasPerlindungan$MediaBrowserCompat$CustomActionResultReceiver[size];
        for (int i = 0; i < size; i++) {
            onchoosevaluefasilitasperlindungan_mediabrowsercompat_customactionresultreceiverArr[i] = (onChooseValueFasilitasPerlindungan$MediaBrowserCompat$CustomActionResultReceiver) ((onChooseValueFasilitasPerlindungan) arrayList.get(i)).clone();
        }
        return new CC27FormKartuKreditFragment(onchoosevaluefasilitasperlindungan_mediabrowsercompat_customactionresultreceiverArr);
    }

    @Override // o.onClickUbahDataKartuTambahan1
    public final Object c(float f) {
        return Integer.valueOf(d(f));
    }

    public final int d(float f) {
        if (this.f == 2) {
            if (this.h) {
                this.h = false;
                this.i = ((onChooseValueFasilitasPerlindungan$MediaBrowserCompat$CustomActionResultReceiver) this.c.get(0)).e;
                int i = ((onChooseValueFasilitasPerlindungan$MediaBrowserCompat$CustomActionResultReceiver) this.c.get(1)).e;
                this.j = i;
                this.g = i - this.i;
            }
            float f2 = f;
            if (this.a != null) {
                f2 = this.a.getInterpolation(f);
            }
            return this.b == null ? this.i + ((int) (f2 * ((float) this.g))) : ((Number) this.b.e(f2, Integer.valueOf(this.i), Integer.valueOf(this.j))).intValue();
        } else if (f <= 0.0f) {
            onChooseValueFasilitasPerlindungan$MediaBrowserCompat$CustomActionResultReceiver onchoosevaluefasilitasperlindungan_mediabrowsercompat_customactionresultreceiver = (onChooseValueFasilitasPerlindungan$MediaBrowserCompat$CustomActionResultReceiver) this.c.get(0);
            onChooseValueFasilitasPerlindungan$MediaBrowserCompat$CustomActionResultReceiver onchoosevaluefasilitasperlindungan_mediabrowsercompat_customactionresultreceiver2 = (onChooseValueFasilitasPerlindungan$MediaBrowserCompat$CustomActionResultReceiver) this.c.get(1);
            int i2 = onchoosevaluefasilitasperlindungan_mediabrowsercompat_customactionresultreceiver.e;
            int i3 = onchoosevaluefasilitasperlindungan_mediabrowsercompat_customactionresultreceiver2.e;
            float f3 = onchoosevaluefasilitasperlindungan_mediabrowsercompat_customactionresultreceiver.d;
            float f4 = onchoosevaluefasilitasperlindungan_mediabrowsercompat_customactionresultreceiver2.d;
            Interpolator interpolator = onchoosevaluefasilitasperlindungan_mediabrowsercompat_customactionresultreceiver2.c;
            float f5 = f;
            if (interpolator != null) {
                f5 = interpolator.getInterpolation(f);
            }
            float f6 = (f5 - f3) / (f4 - f3);
            return this.b == null ? i2 + ((int) (f6 * ((float) (i3 - i2)))) : ((Number) this.b.e(f6, Integer.valueOf(i2), Integer.valueOf(i3))).intValue();
        } else if (f >= 1.0f) {
            onChooseValueFasilitasPerlindungan$MediaBrowserCompat$CustomActionResultReceiver onchoosevaluefasilitasperlindungan_mediabrowsercompat_customactionresultreceiver3 = (onChooseValueFasilitasPerlindungan$MediaBrowserCompat$CustomActionResultReceiver) this.c.get(this.f - 2);
            onChooseValueFasilitasPerlindungan$MediaBrowserCompat$CustomActionResultReceiver onchoosevaluefasilitasperlindungan_mediabrowsercompat_customactionresultreceiver4 = (onChooseValueFasilitasPerlindungan$MediaBrowserCompat$CustomActionResultReceiver) this.c.get(this.f - 1);
            int i4 = onchoosevaluefasilitasperlindungan_mediabrowsercompat_customactionresultreceiver3.e;
            int i5 = onchoosevaluefasilitasperlindungan_mediabrowsercompat_customactionresultreceiver4.e;
            float f7 = onchoosevaluefasilitasperlindungan_mediabrowsercompat_customactionresultreceiver3.d;
            float f8 = onchoosevaluefasilitasperlindungan_mediabrowsercompat_customactionresultreceiver4.d;
            Interpolator interpolator2 = onchoosevaluefasilitasperlindungan_mediabrowsercompat_customactionresultreceiver4.c;
            float f9 = f;
            if (interpolator2 != null) {
                f9 = interpolator2.getInterpolation(f);
            }
            float f10 = (f9 - f7) / (f8 - f7);
            return this.b == null ? i4 + ((int) (f10 * ((float) (i5 - i4)))) : ((Number) this.b.e(f10, Integer.valueOf(i4), Integer.valueOf(i5))).intValue();
        } else {
            onChooseValueFasilitasPerlindungan$MediaBrowserCompat$CustomActionResultReceiver onchoosevaluefasilitasperlindungan_mediabrowsercompat_customactionresultreceiver5 = (onChooseValueFasilitasPerlindungan$MediaBrowserCompat$CustomActionResultReceiver) this.c.get(0);
            int i6 = 1;
            while (i6 < this.f) {
                onChooseValueFasilitasPerlindungan$MediaBrowserCompat$CustomActionResultReceiver onchoosevaluefasilitasperlindungan_mediabrowsercompat_customactionresultreceiver6 = (onChooseValueFasilitasPerlindungan$MediaBrowserCompat$CustomActionResultReceiver) this.c.get(i6);
                if (f < onchoosevaluefasilitasperlindungan_mediabrowsercompat_customactionresultreceiver6.d) {
                    Interpolator interpolator3 = onchoosevaluefasilitasperlindungan_mediabrowsercompat_customactionresultreceiver6.c;
                    float f11 = f;
                    if (interpolator3 != null) {
                        f11 = interpolator3.getInterpolation(f);
                    }
                    float f12 = (f11 - onchoosevaluefasilitasperlindungan_mediabrowsercompat_customactionresultreceiver5.d) / (onchoosevaluefasilitasperlindungan_mediabrowsercompat_customactionresultreceiver6.d - onchoosevaluefasilitasperlindungan_mediabrowsercompat_customactionresultreceiver5.d);
                    int i7 = onchoosevaluefasilitasperlindungan_mediabrowsercompat_customactionresultreceiver5.e;
                    int i8 = onchoosevaluefasilitasperlindungan_mediabrowsercompat_customactionresultreceiver6.e;
                    return this.b == null ? i7 + ((int) (f12 * ((float) (i8 - i7)))) : ((Number) this.b.e(f12, Integer.valueOf(i7), Integer.valueOf(i8))).intValue();
                }
                i6++;
                onchoosevaluefasilitasperlindungan_mediabrowsercompat_customactionresultreceiver5 = onchoosevaluefasilitasperlindungan_mediabrowsercompat_customactionresultreceiver6;
            }
            return ((Number) ((onChooseValueFasilitasPerlindungan) this.c.get(this.f - 1)).c()).intValue();
        }
    }
}
