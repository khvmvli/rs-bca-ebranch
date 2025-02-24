package o;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.AbsListView;
import java.util.Calendar;
import java.util.TimeZone;
import o.setOnStartEnterTransitionListener;
/* loaded from: classes2-dex2jar.jar:o/onChooseORProduct.class */
public abstract class onChooseORProduct extends setOnStartEnterTransitionListener.MediaBrowserCompat.CustomActionResultReceiver<read> implements onChooseProductOR$MediaBrowserCompat$CustomActionResultReceiver {
    IconCompatParcelizer b;
    protected final OR2PilihProductFragment e;

    /* loaded from: classes2-dex2jar.jar:o/onChooseORProduct$IconCompatParcelizer.class */
    public static final class IconCompatParcelizer {
        private Calendar a;
        int b;
        int c;
        int d;
        TimeZone e;

        public IconCompatParcelizer(int i, int i2, int i3, TimeZone timeZone) {
            this.e = timeZone;
            this.d = i;
            this.c = i2;
            this.b = i3;
        }

        public IconCompatParcelizer(long j, TimeZone timeZone) {
            this.e = timeZone;
            e(j);
        }

        public IconCompatParcelizer(Calendar calendar, TimeZone timeZone) {
            this.e = timeZone;
            this.d = calendar.get(1);
            this.c = calendar.get(2);
            this.b = calendar.get(5);
        }

        public IconCompatParcelizer(TimeZone timeZone) {
            this.e = timeZone;
            e(System.currentTimeMillis());
        }

        private void e(long j) {
            if (this.a == null) {
                this.a = Calendar.getInstance(this.e);
            }
            this.a.setTimeInMillis(j);
            this.c = this.a.get(2);
            this.d = this.a.get(1);
            this.b = this.a.get(5);
        }
    }

    /* loaded from: classes2-dex2jar.jar:o/onChooseORProduct$read.class */
    static final class read extends setOnStartEnterTransitionListener.OnBackPressedDispatcher.LifecycleOnBackPressedCancellable {
        public read(onChooseProductOR onchooseproductor) {
            super(onchooseproductor);
        }

        static boolean e(IconCompatParcelizer iconCompatParcelizer, int i, int i2) {
            return iconCompatParcelizer.d == i && iconCompatParcelizer.c == i2;
        }
    }

    public onChooseORProduct(OR2PilihProductFragment oR2PilihProductFragment) {
        this.e = oR2PilihProductFragment;
        this.b = new IconCompatParcelizer(System.currentTimeMillis(), this.e.i());
        this.b = oR2PilihProductFragment.h();
        a();
        a(true);
    }

    public final /* synthetic */ setOnStartEnterTransitionListener.OnBackPressedDispatcher.LifecycleOnBackPressedCancellable a(ViewGroup viewGroup, int i) {
        onChooseProductOR c = c(viewGroup.getContext());
        c.setLayoutParams(new AbsListView.LayoutParams(-1, -1));
        c.setClickable(true);
        c.setOnDayClickListener(this);
        return new read(c);
    }

    @Override // o.onChooseProductOR$MediaBrowserCompat$CustomActionResultReceiver
    public final void a(IconCompatParcelizer iconCompatParcelizer) {
        this.e.o();
        this.e.c(iconCompatParcelizer.d, iconCompatParcelizer.c, iconCompatParcelizer.b);
        this.b = iconCompatParcelizer;
        a();
    }

    public final int c() {
        Calendar c = this.e.c();
        Calendar g = this.e.g();
        return (((c.get(1) * 12) + c.get(2)) - ((g.get(1) * 12) + g.get(2))) + 1;
    }

    public final long c(int i) {
        return (long) i;
    }

    public abstract onChooseProductOR c(Context context);

    public final /* synthetic */ void e(setOnStartEnterTransitionListener.OnBackPressedDispatcher.LifecycleOnBackPressedCancellable lifecycleOnBackPressedCancellable, int i) {
        read read2 = (read) lifecycleOnBackPressedCancellable;
        OR2PilihProductFragment oR2PilihProductFragment = this.e;
        IconCompatParcelizer iconCompatParcelizer = this.b;
        int i2 = (oR2PilihProductFragment.g().get(2) + i) % 12;
        int j = ((i + oR2PilihProductFragment.g().get(2)) / 12) + oR2PilihProductFragment.j();
        ((onChooseProductOR) read2.b).setMonthParams(read.e(iconCompatParcelizer, j, i2) ? iconCompatParcelizer.b : -1, j, i2, oR2PilihProductFragment.b());
        read2.b.invalidate();
    }
}
