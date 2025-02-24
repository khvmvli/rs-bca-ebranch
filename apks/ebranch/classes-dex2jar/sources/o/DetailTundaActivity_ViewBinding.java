package o;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bca.smartbranch.activity.DaftarPemilikSumberDanaMenuActivity;
import com.google.firebase.messaging.Constants$ScionAnalytics$MessageType;
import java.util.ArrayList;
import java.util.Locale;
import o.DetailTundaActivity_ViewBinding;
import o.detailBCAFullPayment;
/* loaded from: classes-dex2jar.jar:o/DetailTundaActivity_ViewBinding.class */
public final class DetailTundaActivity_ViewBinding extends setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver<setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable> {
    public boolean b;
    public ArrayList<detailBCAFullPayment.read> e = new ArrayList<>();
    private final int f = 1;
    private final String g;
    private final int i;
    private final Context j;

    /* loaded from: classes-dex2jar.jar:o/DetailTundaActivity_ViewBinding$IconCompatParcelizer.class */
    public static final class IconCompatParcelizer extends setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable {
        final ListMultipleReservasiAdapter$ListMultipleReservasiVH_ViewBinding t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IconCompatParcelizer(ListMultipleReservasiAdapter$ListMultipleReservasiVH_ViewBinding listMultipleReservasiAdapter$ListMultipleReservasiVH_ViewBinding) {
            super(listMultipleReservasiAdapter$ListMultipleReservasiVH_ViewBinding.d);
            subscribeReservationRescheduleEvent.e(listMultipleReservasiAdapter$ListMultipleReservasiVH_ViewBinding, "");
            this.t = listMultipleReservasiAdapter$ListMultipleReservasiVH_ViewBinding;
        }

        public static /* synthetic */ void b(Context context, detailBCAFullPayment.read read, String str, View view) {
            subscribeReservationRescheduleEvent.e(context, "");
            subscribeReservationRescheduleEvent.e(read, "");
            Intent intent = new Intent(context, subscribeChooseBCACardEvent.class);
            intent.putExtra(Constants$ScionAnalytics$MessageType.DATA_MESSAGE, read);
            DaftarPemilikSumberDanaMenuActivity.IconCompatParcelizer iconCompatParcelizer = DaftarPemilikSumberDanaMenuActivity.j;
            intent.putExtra(DaftarPemilikSumberDanaMenuActivity.m, str);
            context.startActivity(intent);
        }
    }

    /* loaded from: classes-dex2jar.jar:o/DetailTundaActivity_ViewBinding$read.class */
    public static final class read extends setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable {
        private final ListNegaraPemrekAdapter$ListNegaraAdapterVH_ViewBinding q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public read(ListNegaraPemrekAdapter$ListNegaraAdapterVH_ViewBinding listNegaraPemrekAdapter$ListNegaraAdapterVH_ViewBinding) {
            super(listNegaraPemrekAdapter$ListNegaraAdapterVH_ViewBinding.a);
            subscribeReservationRescheduleEvent.e(listNegaraPemrekAdapter$ListNegaraAdapterVH_ViewBinding, "");
            this.q = listNegaraPemrekAdapter$ListNegaraAdapterVH_ViewBinding;
        }
    }

    public DetailTundaActivity_ViewBinding(Context context, String str) {
        subscribeReservationRescheduleEvent.e(context, "");
        this.j = context;
        this.g = str;
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable a(ViewGroup viewGroup, int i) {
        read read2;
        subscribeReservationRescheduleEvent.e(viewGroup, "");
        if (i == this.i) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(2131493337, viewGroup, false);
            LinearLayout linearLayout = (LinearLayout) inflate;
            int i2 = 2131299440;
            TextView textView = (TextView) setRotation.a(inflate, 2131299440);
            if (textView != null) {
                TextView textView2 = (TextView) setRotation.a(inflate, 2131299498);
                if (textView2 != null) {
                    ListMultipleReservasiAdapter$ListMultipleReservasiVH_ViewBinding listMultipleReservasiAdapter$ListMultipleReservasiVH_ViewBinding = new ListMultipleReservasiAdapter$ListMultipleReservasiVH_ViewBinding(linearLayout, linearLayout, textView, textView2);
                    subscribeReservationRescheduleEvent.d(listMultipleReservasiAdapter$ListMultipleReservasiVH_ViewBinding, "");
                    read2 = new IconCompatParcelizer(listMultipleReservasiAdapter$ListMultipleReservasiVH_ViewBinding);
                } else {
                    i2 = 2131299498;
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
        } else if (i == this.f) {
            View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(2131493338, viewGroup, false);
            if (inflate2 != null) {
                ListNegaraPemrekAdapter$ListNegaraAdapterVH_ViewBinding listNegaraPemrekAdapter$ListNegaraAdapterVH_ViewBinding = new ListNegaraPemrekAdapter$ListNegaraAdapterVH_ViewBinding((setWeightSum) inflate2);
                subscribeReservationRescheduleEvent.d(listNegaraPemrekAdapter$ListNegaraAdapterVH_ViewBinding, "");
                read2 = new read(listNegaraPemrekAdapter$ListNegaraAdapterVH_ViewBinding);
            } else {
                throw new NullPointerException("rootView");
            }
        } else {
            read2 = null;
        }
        subscribeReservationRescheduleEvent.c(read2);
        return read2;
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final int c() {
        ArrayList<detailBCAFullPayment.read> arrayList = this.e;
        return arrayList != null ? arrayList.size() : 0;
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final int d(int i) {
        int i2;
        if (this.b) {
            ArrayList<detailBCAFullPayment.read> arrayList = this.e;
            if (i >= (arrayList != null ? arrayList.size() : 0) - 1) {
                i2 = this.f;
                return i2;
            }
        }
        i2 = this.i;
        return i2;
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final void e(setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable, int i) {
        ArrayList<detailBCAFullPayment.read> arrayList;
        detailBCAFullPayment.read read2;
        String str;
        boolean z;
        subscribeReservationRescheduleEvent.e(setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable, "");
        if ((setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable instanceof IconCompatParcelizer) && (arrayList = this.e) != null && (read2 = arrayList.get(i)) != null) {
            Context context = this.j;
            String str2 = this.g;
            subscribeReservationRescheduleEvent.e(context, "");
            subscribeReservationRescheduleEvent.e(read2, "");
            ListMultipleReservasiAdapter$ListMultipleReservasiVH_ViewBinding listMultipleReservasiAdapter$ListMultipleReservasiVH_ViewBinding = ((IconCompatParcelizer) setonstartentertransitionlistener_onbackpresseddispatcher_lifecycleonbackpressedcancellable).t;
            String str3 = read2.a;
            if (subscribeReservationRescheduleEvent.b((Object) str3, (Object) "KTP")) {
                str = context.getResources().getString(2131821815);
                subscribeReservationRescheduleEvent.d(str, "");
            } else {
                if (subscribeReservationRescheduleEvent.b((Object) str3, (Object) "Paspor")) {
                    z = true;
                } else {
                    String upperCase = "Paspor".toUpperCase(Locale.ROOT);
                    subscribeReservationRescheduleEvent.d(upperCase, "");
                    z = subscribeReservationRescheduleEvent.b((Object) str3, (Object) upperCase);
                }
                if (z) {
                    str = context.getResources().getString(2131821986);
                    subscribeReservationRescheduleEvent.d(str, "");
                } else if (subscribeReservationRescheduleEvent.b((Object) str3, (Object) "SIUP")) {
                    str = context.getResources().getString(2131822122);
                    subscribeReservationRescheduleEvent.d(str, "");
                } else {
                    str = context.getResources().getString(2131822074);
                    subscribeReservationRescheduleEvent.d(str, "");
                }
            }
            listMultipleReservasiAdapter$ListMultipleReservasiVH_ViewBinding.b.setText(read2.e);
            TextView textView = listMultipleReservasiAdapter$ListMultipleReservasiVH_ViewBinding.e;
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" - ");
            sb.append(read2.c);
            textView.setText(sb.toString());
            listMultipleReservasiAdapter$ListMultipleReservasiVH_ViewBinding.a.setOnClickListener(new View.OnClickListener(context, read2, str2) { // from class: o.subscribeSubmitBatalEvent
                public final /* synthetic */ Context b;
                public final /* synthetic */ String d;
                public final /* synthetic */ detailBCAFullPayment.read e;

                {
                    this.b = r4;
                    this.e = r5;
                    this.d = r6;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    DetailTundaActivity_ViewBinding.IconCompatParcelizer.b(this.b, this.e, this.d, view);
                }
            });
        }
    }
}
