package o;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
/* loaded from: classes2-dex2jar.jar:o/TujuanTransaksiORPresenter.class */
public final class TujuanTransaksiORPresenter extends SubmitBankNotesPresenter {
    private final Executor b;

    public TujuanTransaksiORPresenter(Executor executor) {
        this.b = executor;
        getRequestHeaders.a(executor);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.b;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    @Override // o.InquiryLoadDataBTPresenter
    public final void d(ProsesTarikanFragment_ViewBinding prosesTarikanFragment_ViewBinding, Runnable runnable) {
        try {
            Executor executor = this.b;
            GetAcctOpeningCategoryDataPresenter getAcctOpeningCategoryDataPresenter = ForgotEmailPassPresenter.e;
            executor.execute(getAcctOpeningCategoryDataPresenter == null ? runnable : getAcctOpeningCategoryDataPresenter.a());
        } catch (RejectedExecutionException e) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e);
            UpdateReceiverDataPresenter updateReceiverDataPresenter = (UpdateReceiverDataPresenter) prosesTarikanFragment_ViewBinding.b(UpdateReceiverDataPresenter.b);
            if (updateReceiverDataPresenter != null) {
                updateReceiverDataPresenter.a(cancellationException);
            }
            ReservasiListChosenPresenter.a().d(prosesTarikanFragment_ViewBinding, runnable);
        }
    }

    @Override // java.lang.Object
    public final boolean equals(Object obj) {
        return (obj instanceof TujuanTransaksiORPresenter) && ((TujuanTransaksiORPresenter) obj).b == this.b;
    }

    @Override // java.lang.Object
    public final int hashCode() {
        return System.identityHashCode(this.b);
    }

    @Override // o.InquiryLoadDataBTPresenter, java.lang.Object
    public final String toString() {
        return this.b.toString();
    }
}
