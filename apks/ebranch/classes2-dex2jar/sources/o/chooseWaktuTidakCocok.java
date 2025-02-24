package o;
/* loaded from: classes2-dex2jar.jar:o/chooseWaktuTidakCocok.class */
public final class chooseWaktuTidakCocok extends JenisIdDialog_ViewBinding implements Cloneable {
    public float a;
    public float b;
    public float c;
    public float d;
    public float e = -1.0f;
    public float i;

    public chooseWaktuTidakCocok(float f, float f2, float f3) {
        this.c = f;
        this.i = f2;
        if (f3 >= 0.0f) {
            this.b = f3;
            this.a = 0.0f;
            return;
        }
        throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
    }

    @Override // o.JenisIdDialog_ViewBinding
    public final void b(float f, float f2, float f3, JenisKodeBankDialog_ViewBinding jenisKodeBankDialog_ViewBinding) {
        float f4;
        float f5 = this.d;
        if (f5 == 0.0f) {
            jenisKodeBankDialog_ViewBinding.c(f, 0.0f);
            return;
        }
        float f6 = ((this.c * 2.0f) + f5) / 2.0f;
        float f7 = f3 * this.i;
        float f8 = f2 + this.a;
        float f9 = (this.b * f3) + ((1.0f - f3) * f6);
        if (f9 / f6 >= 1.0f) {
            jenisKodeBankDialog_ViewBinding.c(f, 0.0f);
            return;
        }
        float f10 = this.e;
        float f11 = f10 * f3;
        boolean z = f10 == -1.0f || Math.abs((f10 * 2.0f) - f5) < 0.1f;
        if (!z) {
            f4 = 1.75f;
            f9 = 0.0f;
        } else {
            f4 = 0.0f;
        }
        float f12 = f6 + f7;
        float f13 = f9 + f7;
        float sqrt = (float) Math.sqrt((double) ((f12 * f12) - (f13 * f13)));
        float f14 = f8 - sqrt;
        float f15 = f8 + sqrt;
        float degrees = (float) Math.toDegrees(Math.atan((double) (sqrt / f13)));
        float f16 = (90.0f - degrees) + f4;
        jenisKodeBankDialog_ViewBinding.c(f14, 0.0f);
        float f17 = f7 * 2.0f;
        jenisKodeBankDialog_ViewBinding.e(f14 - f7, 0.0f, f14 + f7, f17, 270.0f, degrees);
        if (z) {
            jenisKodeBankDialog_ViewBinding.e(f8 - f6, (-f6) - f9, f8 + f6, f6 - f9, 180.0f - f16, (f16 * 2.0f) - 180.0f);
        } else {
            float f18 = this.c;
            float f19 = f11 * 2.0f;
            float f20 = f8 - f6;
            float f21 = f11 + f18;
            jenisKodeBankDialog_ViewBinding.e(f20, -f21, f20 + f18 + f19, f21, 180.0f - f16, ((f16 * 2.0f) - 180.0f) / 2.0f);
            float f22 = f8 + f6;
            float f23 = this.c;
            jenisKodeBankDialog_ViewBinding.c(f22 - ((f23 / 2.0f) + f11), f23 + f11);
            float f24 = this.c;
            float f25 = f11 + f24;
            jenisKodeBankDialog_ViewBinding.e(f22 - (f19 + f24), -f25, f22, f25, 90.0f, f16 - 90.0f);
        }
        jenisKodeBankDialog_ViewBinding.e(f15 - f7, 0.0f, f15 + f7, f17, 270.0f - degrees, degrees);
        jenisKodeBankDialog_ViewBinding.c(f, 0.0f);
    }
}
