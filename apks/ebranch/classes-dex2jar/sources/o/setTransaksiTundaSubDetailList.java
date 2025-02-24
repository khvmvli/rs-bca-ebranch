package o;

import android.util.Log;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
/* loaded from: classes-dex2jar.jar:o/setTransaksiTundaSubDetailList.class */
public final class setTransaksiTundaSubDetailList implements getExpID<Executor> {

    /* loaded from: classes-dex2jar.jar:o/setTransaksiTundaSubDetailList$read.class */
    static final class read {
        static final setTransaksiTundaSubDetailList c = new setTransaksiTundaSubDetailList();
    }

    @Override // o.Page6JLFragment_ViewBinding
    public final /* synthetic */ Object c() {
        return new Executor(Executors.newSingleThreadExecutor()) { // from class: o.TransaksiTundaSubDetail$$Parcelable
            private final Executor a;

            /* loaded from: classes-dex2jar.jar:o/TransaksiTundaSubDetail$$Parcelable$RemoteActionCompatParcelizer.class */
            static final class RemoteActionCompatParcelizer implements Runnable {
                private final Runnable b;

                RemoteActionCompatParcelizer(Runnable runnable) {
                    this.b = runnable;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        this.b.run();
                    } catch (Exception e) {
                        StringBuilder sb = new StringBuilder("TransportRuntime.");
                        sb.append("Executor");
                        Log.e(sb.toString(), "Background execution failure.", e);
                    }
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.a = r4;
            }

            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                this.a.execute(new RemoteActionCompatParcelizer(runnable));
            }
        };
    }
}
