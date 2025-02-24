package o;

import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.RotateAnimation;
import android.widget.TextView;
import com.bca.smartbranch.data.localdb.Warkat;
import com.facebook.stetho.server.http.HttpStatus;
import java.util.ArrayList;
import o.FormBankNotesActivity_ViewBinding;
/* loaded from: classes-dex2jar.jar:o/FormBankNotesActivity_ViewBinding.class */
public final class FormBankNotesActivity_ViewBinding extends setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver<RemoteActionCompatParcelizer> {
    public ArrayList<Warkat> b = new ArrayList<>();

    /* loaded from: classes-dex2jar.jar:o/FormBankNotesActivity_ViewBinding$RemoteActionCompatParcelizer.class */
    public static final class RemoteActionCompatParcelizer extends setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable {
        final ListMultipleReservasiAdapter$ListDetailMultiTransaksiVH_ViewBinding q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RemoteActionCompatParcelizer(ListMultipleReservasiAdapter$ListDetailMultiTransaksiVH_ViewBinding listMultipleReservasiAdapter$ListDetailMultiTransaksiVH_ViewBinding) {
            super(listMultipleReservasiAdapter$ListDetailMultiTransaksiVH_ViewBinding.f);
            subscribeReservationRescheduleEvent.e(listMultipleReservasiAdapter$ListDetailMultiTransaksiVH_ViewBinding, "");
            this.q = listMultipleReservasiAdapter$ListDetailMultiTransaksiVH_ViewBinding;
        }

        public static /* synthetic */ void c(RemoteActionCompatParcelizer remoteActionCompatParcelizer, setMessage setmessage, ListMultipleReservasiAdapter$ListDetailMultiTransaksiVH_ViewBinding listMultipleReservasiAdapter$ListDetailMultiTransaksiVH_ViewBinding, View view) {
            subscribeReservationRescheduleEvent.e(remoteActionCompatParcelizer, "");
            subscribeReservationRescheduleEvent.e(setmessage, "");
            subscribeReservationRescheduleEvent.e(listMultipleReservasiAdapter$ListDetailMultiTransaksiVH_ViewBinding, "");
            int i = remoteActionCompatParcelizer.q.a.b;
            if (i == 2 || i == 3) {
                setmessage.c = new RotateAnimation(-180.0f, 0.0f, 1, 0.5f, 1, 0.5f);
                setmessage.e(listMultipleReservasiAdapter$ListDetailMultiTransaksiVH_ViewBinding.j);
                remoteActionCompatParcelizer.q.a.setExpanded(false, true);
                return;
            }
            setmessage.c = new RotateAnimation(0.0f, -180.0f, 1, 0.5f, 1, 0.5f);
            setmessage.e(listMultipleReservasiAdapter$ListDetailMultiTransaksiVH_ViewBinding.j);
            remoteActionCompatParcelizer.q.a.setExpanded(true, true);
        }

        public static /* synthetic */ void d(RemoteActionCompatParcelizer remoteActionCompatParcelizer, Warkat warkat, int i, View view) {
            subscribeReservationRescheduleEvent.e(remoteActionCompatParcelizer, "");
            subscribeReservationRescheduleEvent.e(warkat, "");
            subscribeReservationRescheduleEvent.d(view, "");
            setHoverListener sethoverlistener = new setHoverListener(view.getContext(), view);
            new setUiOptions(sethoverlistener.b).inflate(2131558418, sethoverlistener.a);
            sethoverlistener.c = new onChooseValueYakinKeluarReservation(i, warkat);
            setBackgroundDrawable setbackgrounddrawable = new setBackgroundDrawable(view.getContext(), sethoverlistener.a, view, false, 0, 2131886356);
            setbackgrounddrawable.e = true;
            setInitialActivityCount setinitialactivitycount = setbackgrounddrawable.c;
            if (setinitialactivitycount != null) {
                setinitialactivitycount.d(true);
            }
            setbackgrounddrawable.b = 8388613;
            setbackgrounddrawable.c();
        }

        public static /* synthetic */ boolean d(int i, Warkat warkat, MenuItem menuItem) {
            boolean z;
            subscribeReservationRescheduleEvent.e(warkat, "");
            int itemId = menuItem.getItemId();
            if (itemId == 2131297271) {
                documentProvider.b().d(new ConfirmMastercardAdapter$ViewHolder_ViewBinding(i, warkat, "delete"));
            } else if (itemId != 2131299742) {
                z = false;
                return z;
            } else {
                documentProvider.b().d(new ConfirmMastercardAdapter$ViewHolder_ViewBinding(i, warkat, "edit"));
            }
            z = true;
            return z;
        }
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final /* synthetic */ RemoteActionCompatParcelizer a(ViewGroup viewGroup, int i) {
        subscribeReservationRescheduleEvent.e(viewGroup, "");
        ListMultipleReservasiAdapter$ListDetailMultiTransaksiVH_ViewBinding c = ListMultipleReservasiAdapter$ListDetailMultiTransaksiVH_ViewBinding.c(LayoutInflater.from(viewGroup.getContext()).inflate(2131493310, viewGroup, false));
        subscribeReservationRescheduleEvent.d(c, "");
        return new RemoteActionCompatParcelizer(c);
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final int c() {
        return this.b.size();
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final /* synthetic */ void e(RemoteActionCompatParcelizer remoteActionCompatParcelizer, int i) {
        RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = remoteActionCompatParcelizer;
        subscribeReservationRescheduleEvent.e(remoteActionCompatParcelizer2, "");
        Warkat warkat = this.b.get(i);
        subscribeReservationRescheduleEvent.d(warkat, "");
        Warkat warkat2 = warkat;
        int size = this.b.size();
        subscribeReservationRescheduleEvent.e(warkat2, "");
        setMessage setmessage = new setMessage();
        setmessage.e = HttpStatus.HTTP_INTERNAL_SERVER_ERROR;
        ListMultipleReservasiAdapter$ListDetailMultiTransaksiVH_ViewBinding listMultipleReservasiAdapter$ListDetailMultiTransaksiVH_ViewBinding = remoteActionCompatParcelizer2.q;
        View view = listMultipleReservasiAdapter$ListDetailMultiTransaksiVH_ViewBinding.d;
        subscribeReservationRescheduleEvent.d(view, "");
        boolean z = true;
        if (size <= 1) {
            z = false;
        }
        view.setVisibility(z ? 0 : 8);
        listMultipleReservasiAdapter$ListDetailMultiTransaksiVH_ViewBinding.g.setImageResource(2131231090);
        listMultipleReservasiAdapter$ListDetailMultiTransaksiVH_ViewBinding.b.setVisibility(8);
        listMultipleReservasiAdapter$ListDetailMultiTransaksiVH_ViewBinding.j.setVisibility(0);
        listMultipleReservasiAdapter$ListDetailMultiTransaksiVH_ViewBinding.i.setVisibility(0);
        TextView textView = listMultipleReservasiAdapter$ListDetailMultiTransaksiVH_ViewBinding.m;
        StringBuilder sb = new StringBuilder("Warkat ");
        sb.append(i + 1);
        textView.setText(sb.toString());
        listMultipleReservasiAdapter$ListDetailMultiTransaksiVH_ViewBinding.h.a.setText(warkat2.getNomorWarkat());
        listMultipleReservasiAdapter$ListDetailMultiTransaksiVH_ViewBinding.h.d.setText(warkat2.getJenisWarkat());
        listMultipleReservasiAdapter$ListDetailMultiTransaksiVH_ViewBinding.h.e.setText(warkat2.getNamaBank());
        TextView textView2 = listMultipleReservasiAdapter$ListDetailMultiTransaksiVH_ViewBinding.h.c;
        StringBuilder sb2 = new StringBuilder();
        Double nominal = warkat2.getNominal();
        subscribeReservationRescheduleEvent.d(nominal, "");
        sb2.append(getPromotion.a(String.valueOf(nominal.doubleValue())));
        sb2.append(" IDR");
        textView2.setText(sb2.toString());
        remoteActionCompatParcelizer2.q.c.setOnClickListener(new View.OnClickListener(setmessage, listMultipleReservasiAdapter$ListDetailMultiTransaksiVH_ViewBinding) { // from class: o.FormReservasiUbahTellerActivity
            public final /* synthetic */ ListMultipleReservasiAdapter$ListDetailMultiTransaksiVH_ViewBinding a;
            public final /* synthetic */ setMessage e;

            {
                this.e = r5;
                this.a = r6;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                FormBankNotesActivity_ViewBinding.RemoteActionCompatParcelizer.c(FormBankNotesActivity_ViewBinding.RemoteActionCompatParcelizer.this, this.e, this.a, view2);
            }
        });
        listMultipleReservasiAdapter$ListDetailMultiTransaksiVH_ViewBinding.i.setOnClickListener(new View.OnClickListener(warkat2, i) { // from class: o.FormSuccessActivity
            public final /* synthetic */ int c;
            public final /* synthetic */ Warkat d;

            {
                this.d = r5;
                this.c = r6;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                FormBankNotesActivity_ViewBinding.RemoteActionCompatParcelizer.d(FormBankNotesActivity_ViewBinding.RemoteActionCompatParcelizer.this, this.d, this.c, view2);
            }
        });
    }
}
