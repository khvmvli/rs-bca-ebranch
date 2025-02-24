package o;

import java.util.Queue;
/* loaded from: classes-dex2jar.jar:o/setBankNameKliring.class */
public final class setBankNameKliring<A, B> {
    public final getTxnSourceValue<RemoteActionCompatParcelizer<A>, B> e;

    /* loaded from: classes-dex2jar.jar:o/setBankNameKliring$RemoteActionCompatParcelizer.class */
    public static final class RemoteActionCompatParcelizer<A> {
        static final Queue<RemoteActionCompatParcelizer<?>> c = getTxnNotes2.d(0);
        private int a;
        private A b;
        private int d;

        private RemoteActionCompatParcelizer() {
        }

        public static <A> RemoteActionCompatParcelizer<A> b(A a, int i, int i2) {
            RemoteActionCompatParcelizer<?> poll;
            Queue<RemoteActionCompatParcelizer<?>> queue = c;
            synchronized (queue) {
                poll = queue.poll();
            }
            RemoteActionCompatParcelizer<A> remoteActionCompatParcelizer = (RemoteActionCompatParcelizer<A>) poll;
            if (poll == null) {
                remoteActionCompatParcelizer = new RemoteActionCompatParcelizer<>();
            }
            ((RemoteActionCompatParcelizer) remoteActionCompatParcelizer).b = a;
            ((RemoteActionCompatParcelizer) remoteActionCompatParcelizer).d = i;
            ((RemoteActionCompatParcelizer) remoteActionCompatParcelizer).a = i2;
            return remoteActionCompatParcelizer;
        }

        public final boolean equals(Object obj) {
            boolean z = false;
            if (obj instanceof RemoteActionCompatParcelizer) {
                RemoteActionCompatParcelizer remoteActionCompatParcelizer = (RemoteActionCompatParcelizer) obj;
                z = false;
                if (this.d == remoteActionCompatParcelizer.d) {
                    z = false;
                    if (this.a == remoteActionCompatParcelizer.a) {
                        z = false;
                        if (this.b.equals(remoteActionCompatParcelizer.b)) {
                            z = true;
                        }
                    }
                }
            }
            return z;
        }

        public final int hashCode() {
            return (((this.a * 31) + this.d) * 31) + this.b.hashCode();
        }
    }

    public setBankNameKliring() {
        this(250);
    }

    public setBankNameKliring(long j) {
        this.e = new getTxnSourceValue<RemoteActionCompatParcelizer<A>, B>(j) { // from class: o.setBankNameKliring.5
            @Override // o.getTxnSourceValue
            public final /* synthetic */ void d(Object obj, Object obj2) {
                RemoteActionCompatParcelizer<?> remoteActionCompatParcelizer = (RemoteActionCompatParcelizer) obj;
                Queue<RemoteActionCompatParcelizer<?>> queue = RemoteActionCompatParcelizer.c;
                synchronized (queue) {
                    queue.offer(remoteActionCompatParcelizer);
                }
            }
        };
    }

    public final B b(A a, int i, int i2) {
        RemoteActionCompatParcelizer<A> b = RemoteActionCompatParcelizer.b(a, 0, 0);
        B b2 = this.e.b((getTxnSourceValue<RemoteActionCompatParcelizer<A>, B>) b);
        Queue<RemoteActionCompatParcelizer<?>> queue = RemoteActionCompatParcelizer.c;
        synchronized (queue) {
            queue.offer(b);
        }
        return b2;
    }
}
