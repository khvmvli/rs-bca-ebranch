package o;
/* loaded from: classes2-dex2jar.jar:o/JenisIdDialog.class */
public final class JenisIdDialog extends InfoNegaraORDialog_ViewBinding {
    float d = -1.0f;

    @Override // o.InfoNegaraORDialog_ViewBinding
    public final void b(JenisKodeBankDialog_ViewBinding jenisKodeBankDialog_ViewBinding, float f, float f2, float f3) {
        jenisKodeBankDialog_ViewBinding.e(0.0f, f3 * f2, 180.0f, 180.0f - f);
        double d = (double) f3;
        double d2 = (double) f2;
        jenisKodeBankDialog_ViewBinding.c((float) (Math.sin(Math.toRadians((double) f)) * d * d2), (float) (Math.sin(Math.toRadians((double) (90.0f - f))) * d * d2));
    }
}
