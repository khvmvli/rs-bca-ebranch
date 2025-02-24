package o;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.List;
import o.DetailTundaReservasiROActivity_ViewBinding;
/* loaded from: classes-dex2jar.jar:o/DetailTundaReservasiROActivity_ViewBinding.class */
public final class DetailTundaReservasiROActivity_ViewBinding extends setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver<write> {
    public List<OpenAccountActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver> b;
    private Context e;

    /* loaded from: classes-dex2jar.jar:o/DetailTundaReservasiROActivity_ViewBinding$write.class */
    public static final class write extends setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable {
        TextView q;
        LinearLayout t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public write(View view) {
            super(view);
            subscribeReservationRescheduleEvent.e(view, "");
            View findViewById = view.findViewById(2131297766);
            subscribeReservationRescheduleEvent.d(findViewById, "");
            this.t = (LinearLayout) findViewById;
            View findViewById2 = view.findViewById(2131298883);
            subscribeReservationRescheduleEvent.d(findViewById2, "");
            this.q = (TextView) findViewById2;
        }

        public static /* synthetic */ void c(OpenAccountActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver openAccountActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver, View view) {
            subscribeReservationRescheduleEvent.e(openAccountActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver, "");
            documentProvider.b().d(new goDeleteAccount(openAccountActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.e, openAccountActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.d, openAccountActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.a));
        }
    }

    public DetailTundaReservasiROActivity_ViewBinding(Context context, List<OpenAccountActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver> list) {
        subscribeReservationRescheduleEvent.e(context, "");
        subscribeReservationRescheduleEvent.e(list, "");
        this.e = context;
        this.b = list;
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final /* synthetic */ write a(ViewGroup viewGroup, int i) {
        subscribeReservationRescheduleEvent.e(viewGroup, "");
        View inflate = LayoutInflater.from(this.e).inflate(2131493322, viewGroup, false);
        subscribeReservationRescheduleEvent.d(inflate, "");
        return new write(inflate);
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final int c() {
        return this.b.size();
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final /* synthetic */ void e(write write2, int i) {
        write write3 = write2;
        subscribeReservationRescheduleEvent.e(write3, "");
        OpenAccountActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver openAccountActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver = this.b.get(i);
        subscribeReservationRescheduleEvent.e(openAccountActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver, "");
        write3.q.setText(openAccountActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.e);
        write3.t.setOnClickListener(new View.OnClickListener() { // from class: o.onSuccessDialog
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DetailTundaReservasiROActivity_ViewBinding.write.c(OpenAccountActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.this, view);
            }
        });
    }
}
