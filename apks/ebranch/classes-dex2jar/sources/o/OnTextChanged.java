package o;

import android.graphics.Color;
import android.graphics.Paint;
import java.util.List;
import o.OnPageChange;
/* loaded from: classes-dex2jar.jar:o/OnTextChanged.class */
public final class OnTextChanged extends R<Integer> {

    /* loaded from: classes-dex2jar.jar:o/OnTextChanged$Callback.class */
    public final class Callback implements OnPageChange$Callback$MediaBrowserCompat$CustomActionResultReceiver {
        public final OnPageChange.Callback<Float, Float> a;
        public final OnPageChange.Callback<Float, Float> b;
        public final OnPageChange.Callback<Float, Float> c;
        public final OnPageChange.Callback<Integer, Integer> d;
        public final OnPageChange.Callback<Float, Float> e;
        private final OnPageChange$Callback$MediaBrowserCompat$CustomActionResultReceiver g;
        private boolean i = true;

        public Callback(OnPageChange$Callback$MediaBrowserCompat$CustomActionResultReceiver onPageChange$Callback$MediaBrowserCompat$CustomActionResultReceiver, setPageColor setpagecolor, setSafeMode setsafemode) {
            this.g = onPageChange$Callback$MediaBrowserCompat$CustomActionResultReceiver;
            OnTextChanged onTextChanged = new OnTextChanged(setsafemode.b.c);
            this.d = onTextChanged;
            onTextChanged.d.add(this);
            setpagecolor.e.add(onTextChanged);
            OnPageChange onPageChange = new OnPageChange(setsafemode.d.c);
            this.a = onPageChange;
            onPageChange.d.add(this);
            setpagecolor.e.add(onPageChange);
            OnPageChange onPageChange2 = new OnPageChange(setsafemode.c.c);
            this.c = onPageChange2;
            onPageChange2.d.add(this);
            setpagecolor.e.add(onPageChange2);
            OnPageChange onPageChange3 = new OnPageChange(setsafemode.e.c);
            this.e = onPageChange3;
            onPageChange3.d.add(this);
            setpagecolor.e.add(onPageChange3);
            OnPageChange onPageChange4 = new OnPageChange(setsafemode.a.c);
            this.b = onPageChange4;
            onPageChange4.d.add(this);
            setpagecolor.e.add(onPageChange4);
        }

        @Override // o.OnPageChange$Callback$MediaBrowserCompat$CustomActionResultReceiver
        public final void a() {
            this.i = true;
            this.g.a();
        }

        public final void b(Paint paint) {
            if (this.i) {
                this.i = false;
                double floatValue = ((double) this.c.h().floatValue()) * 0.017453292519943295d;
                float floatValue2 = this.e.h().floatValue();
                float sin = (float) Math.sin(floatValue);
                float cos = (float) Math.cos(floatValue + 3.141592653589793d);
                int intValue = this.d.h().intValue();
                paint.setShadowLayer(this.b.h().floatValue(), sin * floatValue2, cos * floatValue2, Color.argb(Math.round(this.a.h().floatValue()), Color.red(intValue), Color.green(intValue), Color.blue(intValue)));
            }
        }
    }

    public OnTextChanged(List<onClickBcaKlikpay<Integer>> list) {
        super(list);
    }

    private int e(onClickBcaKlikpay<Integer> onclickbcaklikpay, float f) {
        if (onclickbcaklikpay.h == null || onclickbcaklikpay.e == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        int intValue = onclickbcaklikpay.h.intValue();
        int intValue2 = onclickbcaklikpay.e.intValue();
        if (this.e != null) {
            onClickBcaMobile onclickbcamobile = this.e;
            Integer num = (Integer) onclickbcamobile.b(onclickbcamobile.e.c(onclickbcaklikpay.j, onclickbcaklikpay.b.floatValue(), Integer.valueOf(intValue), Integer.valueOf(intValue2), f, b(), e()));
            if (num != null) {
                return num.intValue();
            }
        }
        return AvailableBookingTimeV2Activity_ViewBinding.b(BN6PembayaranActivity.d(f, 0.0f, 1.0f), intValue, intValue2);
    }

    @Override // o.OnPageChange.Callback
    final /* synthetic */ Object b(onClickBcaKlikpay onclickbcaklikpay, float f) {
        return Integer.valueOf(e(onclickbcaklikpay, f));
    }

    public final int f() {
        return e(a(), d());
    }
}
