package o;

import java.util.concurrent.Executor;
/* loaded from: classes2-dex2jar.jar:o/RootDetectorPresenter.class */
final class RootDetectorPresenter implements Executor {
    public final InquiryLoadDataBTPresenter e;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.e.d(ReviewSetoranFragment.e, runnable);
    }

    @Override // java.lang.Object
    public final String toString() {
        return this.e.toString();
    }
}
