package o;

import android.graphics.Color;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import o.onClickUbahCabang;
/* loaded from: classes-dex2jar.jar:o/setTextDelegate.class */
public final class setTextDelegate implements onFormSuccess<Utils> {
    private int a;

    public setTextDelegate(int i) {
        this.a = i;
    }

    private void a(Utils utils, List<Float> list) {
        double d;
        int i = this.a << 2;
        if (list.size() > i) {
            int size = (list.size() - i) / 2;
            double[] dArr = new double[size];
            double[] dArr2 = new double[size];
            int i2 = 0;
            while (i < list.size()) {
                if (i % 2 == 0) {
                    dArr[i2] = (double) list.get(i).floatValue();
                } else {
                    dArr2[i2] = (double) list.get(i).floatValue();
                    i2++;
                }
                i++;
            }
            for (int i3 = 0; i3 < utils.d.length; i3++) {
                int i4 = utils.d[i3];
                double d2 = (double) utils.e[i3];
                int i5 = 1;
                while (true) {
                    if (i5 >= size) {
                        d = dArr2[size - 1];
                        break;
                    }
                    int i6 = i5 - 1;
                    double d3 = dArr[i6];
                    double d4 = dArr[i5];
                    if (d4 >= d2) {
                        d = BN6PembayaranActivity.c(dArr2[i6], dArr2[i5], BN6PembayaranActivity.d((d2 - d3) / (d4 - d3), 0.0d, 1.0d));
                        break;
                    }
                    i5++;
                }
                utils.d[i3] = Color.argb((int) (d * 255.0d), Color.red(i4), Color.green(i4), Color.blue(i4));
            }
        }
    }

    @Override // o.onFormSuccess
    public final /* synthetic */ Utils e(onClickUbahCabang onclickubahcabang, float f) throws IOException {
        ArrayList arrayList = new ArrayList();
        boolean z = onclickubahcabang.n() == onClickUbahCabang.RemoteActionCompatParcelizer.BEGIN_ARRAY;
        if (z) {
            onclickubahcabang.e();
        }
        while (onclickubahcabang.i()) {
            arrayList.add(Float.valueOf((float) onclickubahcabang.h()));
        }
        if (z) {
            onclickubahcabang.a();
        }
        if (this.a == -1) {
            this.a = arrayList.size() / 4;
        }
        int i = this.a;
        float[] fArr = new float[i];
        int[] iArr = new int[i];
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < (this.a << 2); i4++) {
            int i5 = i4 / 4;
            double floatValue = (double) arrayList.get(i4).floatValue();
            int i6 = i4 % 4;
            if (i6 == 0) {
                if (i5 > 0) {
                    float f2 = fArr[i5 - 1];
                    float f3 = (float) floatValue;
                    if (f2 >= f3) {
                        fArr[i5] = f3 + 0.01f;
                        i2 = i2;
                        i3 = i3;
                    }
                }
                fArr[i5] = (float) floatValue;
                i3 = i3;
                i2 = i2;
            } else if (i6 == 1) {
                i2 = (int) (floatValue * 255.0d);
                i3 = i3;
            } else if (i6 != 2) {
                i2 = i2;
                i3 = i3;
                if (i6 == 3) {
                    iArr[i5] = Color.argb(255, i2, i3, (int) (floatValue * 255.0d));
                    i2 = i2;
                    i3 = i3;
                }
            } else {
                i3 = (int) (floatValue * 255.0d);
                i2 = i2;
            }
        }
        Utils utils = new Utils(fArr, iArr);
        a(utils, arrayList);
        return utils;
    }
}
