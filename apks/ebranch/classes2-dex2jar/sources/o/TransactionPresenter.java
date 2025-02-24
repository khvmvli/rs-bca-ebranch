package o;

import java.util.concurrent.Executor;
/* loaded from: classes2-dex2jar.jar:o/TransactionPresenter.class */
public final class TransactionPresenter {
    public static final InquiryLoadDataBTPresenter c(Executor executor) {
        RootDetectorPresenter rootDetectorPresenter = executor instanceof RootDetectorPresenter ? (RootDetectorPresenter) executor : null;
        return rootDetectorPresenter == null ? new TujuanTransaksiORPresenter(executor) : rootDetectorPresenter.e;
    }
}
