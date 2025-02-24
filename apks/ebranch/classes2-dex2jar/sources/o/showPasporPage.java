package o;

import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import o.OR1DataPengirimFragment;
import o.onChooseTanggalJatuhTempo;
/* loaded from: classes2-dex2jar.jar:o/showPasporPage.class */
final class showPasporPage extends ThreadPoolExecutor {
    /* JADX INFO: Access modifiers changed from: package-private */
    public showPasporPage() {
        super(3, 3, 0, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new OR1DataPengirimFragment.write());
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final Future<?> submit(Runnable runnable) {
        showPasporPage$MediaBrowserCompat$CustomActionResultReceiver showpasporpage_mediabrowsercompat_customactionresultreceiver = new Comparable<showPasporPage$MediaBrowserCompat$CustomActionResultReceiver>((onFocuscc279) runnable) { // from class: o.showPasporPage$MediaBrowserCompat$CustomActionResultReceiver
            private final onFocuscc279 d;

            {
                this.d = r5;
            }

            @Override // java.lang.Comparable
            public final /* synthetic */ int compareTo(showPasporPage$MediaBrowserCompat$CustomActionResultReceiver showpasporpage_mediabrowsercompat_customactionresultreceiver2) {
                showPasporPage$MediaBrowserCompat$CustomActionResultReceiver showpasporpage_mediabrowsercompat_customactionresultreceiver3 = showpasporpage_mediabrowsercompat_customactionresultreceiver2;
                onChooseTanggalJatuhTempo.read read = this.d.l;
                onChooseTanggalJatuhTempo.read read2 = showpasporpage_mediabrowsercompat_customactionresultreceiver3.d.l;
                return read == read2 ? this.d.p - showpasporpage_mediabrowsercompat_customactionresultreceiver3.d.p : read2.ordinal() - read.ordinal();
            }
        };
        execute(showpasporpage_mediabrowsercompat_customactionresultreceiver);
        return showpasporpage_mediabrowsercompat_customactionresultreceiver;
    }
}
