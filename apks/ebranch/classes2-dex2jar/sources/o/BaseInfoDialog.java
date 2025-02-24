package o;

import android.animation.TypeEvaluator;
/* loaded from: classes2-dex2jar.jar:o/BaseInfoDialog.class */
public final class BaseInfoDialog implements TypeEvaluator<Integer> {
    public static final BaseInfoDialog a = new BaseInfoDialog();

    public static Integer a(float f, Integer num, Integer num2) {
        int intValue = num.intValue();
        float f2 = ((float) (intValue >>> 24)) / 255.0f;
        float f3 = ((float) ((intValue >> 16) & 255)) / 255.0f;
        float f4 = ((float) ((intValue >> 8) & 255)) / 255.0f;
        float f5 = ((float) (intValue & 255)) / 255.0f;
        int intValue2 = num2.intValue();
        float f6 = ((float) (intValue2 >>> 24)) / 255.0f;
        float f7 = ((float) ((intValue2 >> 16) & 255)) / 255.0f;
        float f8 = ((float) ((intValue2 >> 8) & 255)) / 255.0f;
        float f9 = ((float) (intValue2 & 255)) / 255.0f;
        float pow = (float) Math.pow((double) f3, 2.2d);
        float pow2 = (float) Math.pow((double) f4, 2.2d);
        float pow3 = (float) Math.pow((double) f5, 2.2d);
        float pow4 = (float) Math.pow((double) f7, 2.2d);
        float pow5 = (float) Math.pow((double) f8, 2.2d);
        float pow6 = (float) Math.pow((double) f9, 2.2d);
        return Integer.valueOf((Math.round((f2 + ((f6 - f2) * f)) * 255.0f) << 24) | (Math.round(((float) Math.pow((double) (pow + ((pow4 - pow) * f)), 0.45454545454545453d)) * 255.0f) << 16) | (Math.round(((float) Math.pow((double) (pow2 + ((pow5 - pow2) * f)), 0.45454545454545453d)) * 255.0f) << 8) | Math.round(((float) Math.pow((double) (pow3 + ((pow6 - pow3) * f)), 0.45454545454545453d)) * 255.0f));
    }

    @Override // android.animation.TypeEvaluator
    public final /* synthetic */ Integer evaluate(float f, Integer num, Integer num2) {
        return a(f, num, num2);
    }
}
