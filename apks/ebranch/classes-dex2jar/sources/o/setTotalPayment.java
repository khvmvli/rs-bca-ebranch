package o;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
/* loaded from: classes-dex2jar.jar:o/setTotalPayment.class */
final class setTotalPayment {
    final Map<String, read> e = new HashMap();
    final RemoteActionCompatParcelizer c = new RemoteActionCompatParcelizer();

    /* loaded from: classes-dex2jar.jar:o/setTotalPayment$RemoteActionCompatParcelizer.class */
    static final class RemoteActionCompatParcelizer {
        final Queue<read> b = new ArrayDeque();

        RemoteActionCompatParcelizer() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final read c() {
            read poll;
            synchronized (this.b) {
                poll = this.b.poll();
            }
            read read = poll;
            if (poll == null) {
                read = new read();
            }
            return read;
        }
    }

    /* loaded from: classes-dex2jar.jar:o/setTotalPayment$read.class */
    static final class read {
        final Lock b = new ReentrantLock();
        int c;

        read() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(String str) {
        read read2;
        synchronized (this) {
            read read3 = this.e.get(str);
            if (read3 != null) {
                read2 = read3;
                if (read2.c > 0) {
                    read2.c--;
                    if (read2.c == 0) {
                        read remove = this.e.remove(str);
                        if (remove.equals(read2)) {
                            RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.c;
                            synchronized (remoteActionCompatParcelizer.b) {
                                if (remoteActionCompatParcelizer.b.size() < 10) {
                                    remoteActionCompatParcelizer.b.offer(remove);
                                }
                            }
                        } else {
                            StringBuilder sb = new StringBuilder("Removed the wrong lock, expected to remove: ");
                            sb.append(read2);
                            sb.append(", but actually removed: ");
                            sb.append(remove);
                            sb.append(", safeKey: ");
                            sb.append(str);
                            throw new IllegalStateException(sb.toString());
                        }
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder("Cannot release a lock that is not held, safeKey: ");
                    sb2.append(str);
                    sb2.append(", interestedThreads: ");
                    sb2.append(read2.c);
                    throw new IllegalStateException(sb2.toString());
                }
            } else {
                throw new NullPointerException("Argument must not be null");
            }
        }
        read2.b.unlock();
    }
}
