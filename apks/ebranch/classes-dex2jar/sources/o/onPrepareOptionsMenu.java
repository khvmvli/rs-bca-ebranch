package o;

import java.io.Closeable;
import java.util.concurrent.CancellationException;
/* loaded from: classes-dex2jar.jar:o/onPrepareOptionsMenu.class */
public final class onPrepareOptionsMenu implements Closeable, InquiryLoadDataSetunPresenter {
    private final ProsesTarikanFragment_ViewBinding e;

    public onPrepareOptionsMenu(ProsesTarikanFragment_ViewBinding prosesTarikanFragment_ViewBinding) {
        subscribeReservationRescheduleEvent.e(prosesTarikanFragment_ViewBinding, "");
        this.e = prosesTarikanFragment_ViewBinding;
    }

    public final ProsesTarikanFragment_ViewBinding b() {
        return this.e;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        UpdateReceiverDataPresenter b = this.e.b(UpdateReceiverDataPresenter.b);
        if (b != null) {
            b.a((CancellationException) null);
        }
    }
}
