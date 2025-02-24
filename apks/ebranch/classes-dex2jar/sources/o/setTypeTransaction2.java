package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.animation.Interpolator;
import java.lang.reflect.Field;
import o.getDataId;
import o.getPathData;
/* loaded from: classes-dex2jar.jar:o/setTypeTransaction2.class */
public class setTypeTransaction2 extends getPathData {
    public boolean p;
    public setTypeTransaction2$MediaBrowserCompat$CustomActionResultReceiver s;
    private boolean u;
    private TransaksiTunda v;
    private boolean y;
    public int r = 5000;
    private int D = 800;
    private int x = 1;
    private boolean z = true;
    private getPathData.MediaMetadataCompat w = new getPathData.MediaMetadataCompat() { // from class: o.setTypeTransaction2.1
        @Override // o.getPathData.MediaMetadataCompat, o.getPathData$MediaBrowserCompat$ItemReceiver
        public final void d(int i) {
            d(i);
            if (i == 0 && setTypeTransaction2.this.d != null && (setTypeTransaction2.this.d instanceof getFlagBooking)) {
                int i2 = setTypeTransaction2.this.j;
                int d = setTypeTransaction2.this.d.d() - 2;
                if (i2 == 0) {
                    setTypeTransaction2.this.setCurrentItem(d, false);
                } else if (i2 > d) {
                    setTypeTransaction2.this.setCurrentItem(1, false);
                }
            }
        }
    };

    public setTypeTransaction2(Context context) {
        super(context);
        a(context, (AttributeSet) null);
    }

    public setTypeTransaction2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet);
    }

    private void a() {
        try {
            Field declaredField = getPathData.class.getDeclaredField("t");
            declaredField.setAccessible(true);
            Field declaredField2 = getPathData.class.getDeclaredField("a");
            declaredField2.setAccessible(true);
            TransaksiTunda transaksiTunda = new TransaksiTunda(getContext(), (Interpolator) declaredField2.get(null));
            this.v = transaksiTunda;
            transaksiTunda.a = this.D;
            declaredField.set(this, this.v);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void a(Context context, AttributeSet attributeSet) {
        this.s = new setTypeTransaction2$MediaBrowserCompat$CustomActionResultReceiver(this);
        a();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, getDataId.IconCompatParcelizer.b, 0, 0);
            try {
                this.r = obtainStyledAttributes.getInt(getDataId.IconCompatParcelizer.a, 5000);
                this.x = obtainStyledAttributes.getInt(getDataId.IconCompatParcelizer.c, 1);
                this.z = obtainStyledAttributes.getBoolean(getDataId.IconCompatParcelizer.e, true);
                this.u = obtainStyledAttributes.getBoolean(getDataId.IconCompatParcelizer.d, false);
                this.D = obtainStyledAttributes.getInt(getDataId.IconCompatParcelizer.c, 800);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }

    public static /* synthetic */ void b(setTypeTransaction2 settypetransaction2) {
        int d;
        setScaleX setscalex = settypetransaction2.d;
        int i = settypetransaction2.j;
        if (setscalex != null && (d = setscalex.d()) > 1) {
            int i2 = settypetransaction2.x == 1 ? i + 1 : i - 1;
            if ((settypetransaction2.d instanceof getFlagBooking) || !settypetransaction2.u) {
                settypetransaction2.setCurrentItem(i2, true);
            } else if (i2 < 0) {
                settypetransaction2.setCurrentItem(d - 1, true);
            } else if (i2 == d) {
                settypetransaction2.setCurrentItem(0, true);
            } else {
                settypetransaction2.setCurrentItem(i2, true);
            }
        }
    }

    public static /* synthetic */ void d(setTypeTransaction2 settypetransaction2, long j) {
        settypetransaction2.s.removeMessages(1);
        settypetransaction2.s.sendEmptyMessageDelayed(1, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int b = setCancelable.b(motionEvent);
        if (this.z) {
            if (b != 0) {
                if ((b == 1 || b == 4) && this.y && this.d.d() > 1) {
                    this.p = true;
                    long j = (long) this.r;
                    this.s.removeMessages(1);
                    this.s.sendEmptyMessageDelayed(1, j);
                }
            } else if (this.p) {
                this.y = true;
                this.p = false;
                this.s.removeMessages(1);
            }
        }
        return dispatchTouchEvent(motionEvent);
    }

    @Override // o.getPathData, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        onAttachedToWindow();
        a(this.w);
    }

    @Override // o.getPathData, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        onDetachedFromWindow();
        e(this.w);
    }

    @Override // o.getPathData
    public void setAdapter(setScaleX setscalex) {
        setAdapter(setscalex);
        if (setscalex != null && (setscalex instanceof getFlagBooking) && setscalex.d() > 1) {
            setCurrentItem((((setscalex.d() - 2) / 2) - (((setscalex.d() - 2) / 2) % ((getFlagBooking) setscalex).c())) + 1);
        }
    }

    public void setCycle(boolean z) {
        this.u = z;
    }

    public void setDirection(int i) {
        this.x = i;
    }

    public void setSlideDuration(int i) {
        this.D = i;
    }

    public void setSlideInterval(int i) {
        this.r = i;
        a();
    }

    public void setStopWhenTouch(boolean z) {
        this.z = z;
    }
}
