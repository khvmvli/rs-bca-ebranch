package o;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2-dex2jar.jar:o/onEditWarkatList.class */
public final class onEditWarkatList {
    final showDataDiri a;
    long b;
    long c;
    long d;
    long e;
    final Handler f;
    final HandlerThread g;
    int h;
    int i;
    long j;
    int k;
    long l;
    long m;

    /* renamed from: o  reason: collision with root package name */
    long f79o;

    /* loaded from: classes2-dex2jar.jar:o/onEditWarkatList$read.class */
    static final class read extends Handler {
        private final onEditWarkatList a;

        public read(Looper looper, onEditWarkatList oneditwarkatlist) {
            super(looper);
            this.a = oneditwarkatlist;
        }

        @Override // android.os.Handler
        public final void handleMessage(final Message message) {
            int i = message.what;
            if (i == 0) {
                this.a.c++;
            } else if (i == 1) {
                this.a.j++;
            } else if (i == 2) {
                onEditWarkatList oneditwarkatlist = this.a;
                long j = (long) message.arg1;
                int i2 = oneditwarkatlist.i + 1;
                oneditwarkatlist.i = i2;
                long j2 = oneditwarkatlist.f79o + j;
                oneditwarkatlist.f79o = j2;
                oneditwarkatlist.b = j2 / ((long) i2);
            } else if (i == 3) {
                onEditWarkatList oneditwarkatlist2 = this.a;
                long j3 = (long) message.arg1;
                oneditwarkatlist2.k++;
                long j4 = oneditwarkatlist2.m + j3;
                oneditwarkatlist2.m = j4;
                oneditwarkatlist2.e = j4 / ((long) oneditwarkatlist2.i);
            } else if (i != 4) {
                onChooseTanggalJatuhTempo.c.post(new Runnable() { // from class: o.onEditWarkatList.read.4
                    @Override // java.lang.Runnable
                    public final void run() {
                        StringBuilder sb = new StringBuilder("Unhandled stats message.");
                        sb.append(message.what);
                        throw new AssertionError(sb.toString());
                    }
                });
            } else {
                onEditWarkatList oneditwarkatlist3 = this.a;
                Long l = (Long) message.obj;
                oneditwarkatlist3.h++;
                long longValue = oneditwarkatlist3.l + l.longValue();
                oneditwarkatlist3.l = longValue;
                oneditwarkatlist3.d = longValue / ((long) oneditwarkatlist3.h);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public onEditWarkatList(showDataDiri showdatadiri) {
        this.a = showdatadiri;
        HandlerThread handlerThread = new HandlerThread("Picasso-Stats", 10);
        this.g = handlerThread;
        handlerThread.start();
        OR1DataPengirimFragment.d(handlerThread.getLooper());
        this.f = new read(handlerThread.getLooper(), this);
    }
}
