package o;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import o.onChooseValueFasilitasPerlindungan;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2-dex2jar.jar:o/onClickUbahDataAlamat.class */
public final class onClickUbahDataAlamat extends onClickUbahDataKartuTambahan1 {
    private float g;
    private boolean h = true;
    private float i;
    private float j;

    public onClickUbahDataAlamat(onChooseValueFasilitasPerlindungan.RemoteActionCompatParcelizer... remoteActionCompatParcelizerArr) {
        super(remoteActionCompatParcelizerArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public onClickUbahDataAlamat d() {
        ArrayList arrayList = this.c;
        int size = this.c.size();
        onChooseValueFasilitasPerlindungan.RemoteActionCompatParcelizer[] remoteActionCompatParcelizerArr = new onChooseValueFasilitasPerlindungan.RemoteActionCompatParcelizer[size];
        for (int i = 0; i < size; i++) {
            remoteActionCompatParcelizerArr[i] = (onChooseValueFasilitasPerlindungan.RemoteActionCompatParcelizer) ((onChooseValueFasilitasPerlindungan) arrayList.get(i)).clone();
        }
        return new onClickUbahDataAlamat(remoteActionCompatParcelizerArr);
    }

    public final float a(float f) {
        if (this.f == 2) {
            if (this.h) {
                this.h = false;
                this.i = ((onChooseValueFasilitasPerlindungan.RemoteActionCompatParcelizer) this.c.get(0)).e;
                float f2 = ((onChooseValueFasilitasPerlindungan.RemoteActionCompatParcelizer) this.c.get(1)).e;
                this.j = f2;
                this.g = f2 - this.i;
            }
            float f3 = f;
            if (this.a != null) {
                f3 = this.a.getInterpolation(f);
            }
            return this.b == null ? this.i + (f3 * this.g) : ((Number) this.b.e(f3, Float.valueOf(this.i), Float.valueOf(this.j))).floatValue();
        } else if (f <= 0.0f) {
            onChooseValueFasilitasPerlindungan.RemoteActionCompatParcelizer remoteActionCompatParcelizer = (onChooseValueFasilitasPerlindungan.RemoteActionCompatParcelizer) this.c.get(0);
            onChooseValueFasilitasPerlindungan.RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = (onChooseValueFasilitasPerlindungan.RemoteActionCompatParcelizer) this.c.get(1);
            float f4 = remoteActionCompatParcelizer.e;
            float f5 = remoteActionCompatParcelizer2.e;
            float f6 = remoteActionCompatParcelizer.d;
            float f7 = remoteActionCompatParcelizer2.d;
            Interpolator interpolator = remoteActionCompatParcelizer2.c;
            float f8 = f;
            if (interpolator != null) {
                f8 = interpolator.getInterpolation(f);
            }
            float f9 = (f8 - f6) / (f7 - f6);
            return this.b == null ? f4 + (f9 * (f5 - f4)) : ((Number) this.b.e(f9, Float.valueOf(f4), Float.valueOf(f5))).floatValue();
        } else if (f >= 1.0f) {
            onChooseValueFasilitasPerlindungan.RemoteActionCompatParcelizer remoteActionCompatParcelizer3 = (onChooseValueFasilitasPerlindungan.RemoteActionCompatParcelizer) this.c.get(this.f - 2);
            onChooseValueFasilitasPerlindungan.RemoteActionCompatParcelizer remoteActionCompatParcelizer4 = (onChooseValueFasilitasPerlindungan.RemoteActionCompatParcelizer) this.c.get(this.f - 1);
            float f10 = remoteActionCompatParcelizer3.e;
            float f11 = remoteActionCompatParcelizer4.e;
            float f12 = remoteActionCompatParcelizer3.d;
            float f13 = remoteActionCompatParcelizer4.d;
            Interpolator interpolator2 = remoteActionCompatParcelizer4.c;
            float f14 = f;
            if (interpolator2 != null) {
                f14 = interpolator2.getInterpolation(f);
            }
            float f15 = (f14 - f12) / (f13 - f12);
            return this.b == null ? f10 + (f15 * (f11 - f10)) : ((Number) this.b.e(f15, Float.valueOf(f10), Float.valueOf(f11))).floatValue();
        } else {
            onChooseValueFasilitasPerlindungan.RemoteActionCompatParcelizer remoteActionCompatParcelizer5 = (onChooseValueFasilitasPerlindungan.RemoteActionCompatParcelizer) this.c.get(0);
            int i = 1;
            while (i < this.f) {
                onChooseValueFasilitasPerlindungan.RemoteActionCompatParcelizer remoteActionCompatParcelizer6 = (onChooseValueFasilitasPerlindungan.RemoteActionCompatParcelizer) this.c.get(i);
                if (f < remoteActionCompatParcelizer6.d) {
                    Interpolator interpolator3 = remoteActionCompatParcelizer6.c;
                    float f16 = f;
                    if (interpolator3 != null) {
                        f16 = interpolator3.getInterpolation(f);
                    }
                    float f17 = (f16 - remoteActionCompatParcelizer5.d) / (remoteActionCompatParcelizer6.d - remoteActionCompatParcelizer5.d);
                    float f18 = remoteActionCompatParcelizer5.e;
                    float f19 = remoteActionCompatParcelizer6.e;
                    return this.b == null ? f18 + (f17 * (f19 - f18)) : ((Number) this.b.e(f17, Float.valueOf(f18), Float.valueOf(f19))).floatValue();
                }
                i++;
                remoteActionCompatParcelizer5 = remoteActionCompatParcelizer6;
            }
            return ((Number) ((onChooseValueFasilitasPerlindungan) this.c.get(this.f - 1)).c()).floatValue();
        }
    }

    @Override // o.onClickUbahDataKartuTambahan1
    public final Object c(float f) {
        return Float.valueOf(a(f));
    }
}
