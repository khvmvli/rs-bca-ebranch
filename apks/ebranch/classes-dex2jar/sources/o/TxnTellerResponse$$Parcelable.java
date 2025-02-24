package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.text.DateFormat;
import java.util.List;
import o.setCurrencyName;
/* loaded from: classes-dex2jar.jar:o/TxnTellerResponse$$Parcelable.class */
public final class TxnTellerResponse$$Parcelable extends setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver<write> {
    final RemoteActionCompatParcelizer b;
    List<GetTxnTellerDetailResponse$TxnDetail$Representative$$Parcelable> e = PenerimaFragment.b;

    /* loaded from: classes-dex2jar.jar:o/TxnTellerResponse$$Parcelable$RemoteActionCompatParcelizer.class */
    public interface RemoteActionCompatParcelizer {
        void a(long j);
    }

    /* loaded from: classes-dex2jar.jar:o/TxnTellerResponse$$Parcelable$write.class */
    public final class write extends setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable implements View.OnClickListener {
        final setWarkat q;
        final /* synthetic */ TxnTellerResponse$$Parcelable t;
        Long x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public write(TxnTellerResponse$$Parcelable txnTellerResponse$$Parcelable, setWarkat setwarkat) {
            super(setwarkat.c);
            subscribeReservationRescheduleEvent.e(setwarkat, "");
            this.t = txnTellerResponse$$Parcelable;
            this.q = setwarkat;
            this.b.setOnClickListener(this);
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            subscribeReservationRescheduleEvent.e(view, "");
            Long l = this.x;
            if (l != null) {
                TxnTellerResponse$$Parcelable txnTellerResponse$$Parcelable = this.t;
                long longValue = l.longValue();
                RemoteActionCompatParcelizer remoteActionCompatParcelizer = txnTellerResponse$$Parcelable.b;
                c();
                remoteActionCompatParcelizer.a(longValue);
            }
        }
    }

    public TxnTellerResponse$$Parcelable(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        subscribeReservationRescheduleEvent.e(remoteActionCompatParcelizer, "");
        this.b = remoteActionCompatParcelizer;
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final /* synthetic */ write a(ViewGroup viewGroup, int i) {
        subscribeReservationRescheduleEvent.e(viewGroup, "");
        setWarkat b = setWarkat.b(LayoutInflater.from(viewGroup.getContext()).inflate(setCurrencyName.read.f, viewGroup, false));
        subscribeReservationRescheduleEvent.d(b, "");
        return new write(this, b);
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final int c() {
        return this.e.size();
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final /* synthetic */ void e(write write2, int i) {
        write write3 = write2;
        subscribeReservationRescheduleEvent.e(write3, "");
        GetTxnTellerDetailResponse$TxnDetail$Representative$$Parcelable getTxnTellerDetailResponse$TxnDetail$Representative$$Parcelable = this.e.get(i);
        subscribeReservationRescheduleEvent.e(getTxnTellerDetailResponse$TxnDetail$Representative$$Parcelable, "");
        setWarkat setwarkat = write3.q;
        write3.x = getTxnTellerDetailResponse$TxnDetail$Representative$$Parcelable.e;
        setwarkat.d.setText(getTxnTellerDetailResponse$TxnDetail$Representative$$Parcelable.a);
        setwarkat.e.setText(getTxnTellerDetailResponse$TxnDetail$Representative$$Parcelable.b);
        setwarkat.a.setText(getTxnTellerDetailResponse$TxnDetail$Representative$$Parcelable.c);
        setwarkat.b.setText(DateFormat.getDateTimeInstance(3, 2).format(getTxnTellerDetailResponse$TxnDetail$Representative$$Parcelable.d));
    }
}
