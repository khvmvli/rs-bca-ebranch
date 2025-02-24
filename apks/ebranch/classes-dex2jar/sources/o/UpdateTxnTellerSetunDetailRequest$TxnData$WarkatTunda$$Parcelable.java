package o;

import com.bca.smartbranch.fragment.Page6GLFragment;
/* loaded from: classes-dex2jar.jar:o/UpdateTxnTellerSetunDetailRequest$TxnData$WarkatTunda$$Parcelable.class */
public final /* synthetic */ class UpdateTxnTellerSetunDetailRequest$TxnData$WarkatTunda$$Parcelable implements Runnable {
    public final /* synthetic */ Page6GLFragment.AnonymousClass5 a;

    public /* synthetic */ UpdateTxnTellerSetunDetailRequest$TxnData$WarkatTunda$$Parcelable(Page6GLFragment.AnonymousClass5 r4) {
        this.a = r4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Page6GLFragment.AnonymousClass5 r0 = this.a;
        Page6GLFragment.this.etNoKitas.setText("");
        Page6GLFragment.this.etMasaBerlakuKitas.setText("");
        Page6GLFragment.this.tilNoKitas.setHintEnabled(false);
        Page6GLFragment.this.tilMasaBerlaku.setHintEnabled(false);
        Page6GLFragment page6GLFragment = Page6GLFragment.this;
        page6GLFragment.a(page6GLFragment.etFields.indexOf(Page6GLFragment.this.etNoKitas));
        Page6GLFragment page6GLFragment2 = Page6GLFragment.this;
        page6GLFragment2.a(page6GLFragment2.etFields.indexOf(Page6GLFragment.this.etMasaBerlakuKitas));
    }
}
