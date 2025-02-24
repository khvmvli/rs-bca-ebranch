package o;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Arrays;
/* loaded from: classes2-dex2jar.jar:o/onClickUbahDataKartuTambahan1.class */
class onClickUbahDataKartuTambahan1 {
    Interpolator a;
    onClickUbahDataKontakDarurat b;
    ArrayList<onChooseValueFasilitasPerlindungan> c;
    onChooseValueFasilitasPerlindungan d;
    onChooseValueFasilitasPerlindungan e;
    int f;

    public onClickUbahDataKartuTambahan1(onChooseValueFasilitasPerlindungan... onchoosevaluefasilitasperlindunganArr) {
        this.f = onchoosevaluefasilitasperlindunganArr.length;
        ArrayList<onChooseValueFasilitasPerlindungan> arrayList = new ArrayList<>();
        this.c = arrayList;
        arrayList.addAll(Arrays.asList(onchoosevaluefasilitasperlindunganArr));
        this.e = this.c.get(0);
        onChooseValueFasilitasPerlindungan onchoosevaluefasilitasperlindungan = this.c.get(this.f - 1);
        this.d = onchoosevaluefasilitasperlindungan;
        this.a = onchoosevaluefasilitasperlindungan.c;
    }

    public Object c(float f) {
        int i = this.f;
        if (i == 2) {
            Interpolator interpolator = this.a;
            float f2 = f;
            if (interpolator != null) {
                f2 = interpolator.getInterpolation(f);
            }
            return this.b.e(f2, this.e.c(), this.d.c());
        }
        int i2 = 1;
        if (f <= 0.0f) {
            onChooseValueFasilitasPerlindungan onchoosevaluefasilitasperlindungan = this.c.get(1);
            Interpolator interpolator2 = onchoosevaluefasilitasperlindungan.c;
            float f3 = f;
            if (interpolator2 != null) {
                f3 = interpolator2.getInterpolation(f);
            }
            float f4 = this.e.d;
            return this.b.e((f3 - f4) / (onchoosevaluefasilitasperlindungan.d - f4), this.e.c(), onchoosevaluefasilitasperlindungan.c());
        } else if (f >= 1.0f) {
            onChooseValueFasilitasPerlindungan onchoosevaluefasilitasperlindungan2 = this.c.get(i - 2);
            Interpolator interpolator3 = this.d.c;
            float f5 = f;
            if (interpolator3 != null) {
                f5 = interpolator3.getInterpolation(f);
            }
            float f6 = onchoosevaluefasilitasperlindungan2.d;
            return this.b.e((f5 - f6) / (this.d.d - f6), onchoosevaluefasilitasperlindungan2.c(), this.d.c());
        } else {
            onChooseValueFasilitasPerlindungan onchoosevaluefasilitasperlindungan3 = this.e;
            while (i2 < this.f) {
                onChooseValueFasilitasPerlindungan onchoosevaluefasilitasperlindungan4 = this.c.get(i2);
                if (f < onchoosevaluefasilitasperlindungan4.d) {
                    Interpolator interpolator4 = onchoosevaluefasilitasperlindungan4.c;
                    float f7 = f;
                    if (interpolator4 != null) {
                        f7 = interpolator4.getInterpolation(f);
                    }
                    float f8 = onchoosevaluefasilitasperlindungan3.d;
                    return this.b.e((f7 - f8) / (onchoosevaluefasilitasperlindungan4.d - f8), onchoosevaluefasilitasperlindungan3.c(), onchoosevaluefasilitasperlindungan4.c());
                }
                i2++;
                onchoosevaluefasilitasperlindungan3 = onchoosevaluefasilitasperlindungan4;
            }
            return this.d.c();
        }
    }

    /* renamed from: d */
    public onClickUbahDataKartuTambahan1 clone() {
        ArrayList<onChooseValueFasilitasPerlindungan> arrayList = this.c;
        int size = arrayList.size();
        onChooseValueFasilitasPerlindungan[] onchoosevaluefasilitasperlindunganArr = new onChooseValueFasilitasPerlindungan[size];
        for (int i = 0; i < size; i++) {
            onchoosevaluefasilitasperlindunganArr[i] = arrayList.get(i).clone();
        }
        return new onClickUbahDataKartuTambahan1(onchoosevaluefasilitasperlindunganArr);
    }

    public String toString() {
        String str = " ";
        for (int i = 0; i < this.f; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(this.c.get(i).c());
            sb.append("  ");
            str = sb.toString();
        }
        return str;
    }
}
