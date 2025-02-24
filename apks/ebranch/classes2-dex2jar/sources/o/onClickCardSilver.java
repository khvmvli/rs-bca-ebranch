package o;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
/* loaded from: classes2-dex2jar.jar:o/onClickCardSilver.class */
public final class onClickCardSilver extends ContextWrapper {
    private final onChooseValueSumberPenghasilan a;
    static final /* synthetic */ BeneficiaryBankDetailPresenter[] d = {(BeneficiaryBankDetailPresenter) subscriberLoadDraftBankTransferEvent.b(new subscriberDeleteTmpListTeller(subscriberLoadDraftBankTransferEvent.a(onClickCardSilver.class), "inflater", "getInflater()Lio/github/inflationx/viewpump/internal/-ViewPumpLayoutInflater;"))};
    public static final write b = new write((byte) 0);

    /* loaded from: classes2-dex2jar.jar:o/onClickCardSilver$read.class */
    static final class read extends subscribeDraftTxnBerkalaEvent implements pilihNoRek<Page6DTahapanXpresiFragment_ViewBinding> {
        read() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            LayoutInflater from = LayoutInflater.from(onClickCardSilver.this.getBaseContext());
            subscribeReservationRescheduleEvent.a(from, "");
            return new Page6DTahapanXpresiFragment_ViewBinding(from, onClickCardSilver.this, false);
        }
    }

    /* loaded from: classes2-dex2jar.jar:o/onClickCardSilver$write.class */
    public static final class write {
        private write() {
        }

        public /* synthetic */ write(byte b) {
            this();
        }
    }

    private onClickCardSilver(Context context) {
        super(context);
        this.a = showBidangPekerjaanDialog.a(showDescPekerjaanDialog.NONE, new read());
    }

    public /* synthetic */ onClickCardSilver(Context context, byte b2) {
        this(context);
    }

    public static final ContextWrapper c(Context context) {
        subscribeReservationRescheduleEvent.b(context, "");
        return new onClickCardSilver(context, (byte) 0);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        subscribeReservationRescheduleEvent.b(str, "");
        return subscribeReservationRescheduleEvent.b("layout_inflater", str) ? (Page6DTahapanXpresiFragment_ViewBinding) this.a.d() : getSystemService(str);
    }
}
