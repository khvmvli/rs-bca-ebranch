package io.github.inflationx.calligraphy3;

import android.content.Context;
import android.view.View;
import o.Page6DTahapanBCASFragment;
import o.onClickCardGold;
import o.subscribeReservationRescheduleEvent;
/* loaded from: classes-dex2jar.jar:io/github/inflationx/calligraphy3/CalligraphyInterceptor.class */
public class CalligraphyInterceptor implements Page6DTahapanBCASFragment {
    private final Calligraphy calligraphy;

    public CalligraphyInterceptor(CalligraphyConfig calligraphyConfig) {
        this.calligraphy = new Calligraphy(calligraphyConfig);
    }

    @Override // o.Page6DTahapanBCASFragment
    public onClickCardGold intercept(Page6DTahapanBCASFragment.write write) {
        onClickCardGold e = write.e(write.b());
        View onViewCreated = this.calligraphy.onViewCreated(e.b, e.e, e.c);
        onClickCardGold.IconCompatParcelizer iconCompatParcelizer = new onClickCardGold.IconCompatParcelizer(e);
        iconCompatParcelizer.c = onViewCreated;
        String str = iconCompatParcelizer.d;
        if (str != null) {
            View view = iconCompatParcelizer.c;
            if (view == null) {
                view = null;
            } else if (!subscribeReservationRescheduleEvent.b((Object) str, (Object) view.getClass().getName())) {
                StringBuilder sb = new StringBuilder("name (");
                sb.append(str);
                sb.append(") must be the view's fully qualified name (");
                sb.append(view.getClass().getName());
                sb.append(')');
                throw new IllegalStateException(sb.toString().toString());
            }
            Context context = iconCompatParcelizer.b;
            if (context != null) {
                return new onClickCardGold(view, str, context, iconCompatParcelizer.a);
            }
            throw new IllegalStateException("context == null");
        }
        throw new IllegalStateException("name == null".toString());
    }
}
