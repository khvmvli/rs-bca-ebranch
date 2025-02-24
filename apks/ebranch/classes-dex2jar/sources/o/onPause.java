package o;

import java.util.ArrayDeque;
import java.util.Queue;
/* loaded from: classes-dex2jar.jar:o/onPause.class */
public final class onPause {
    private boolean c;
    public boolean d;
    public boolean e = true;
    private final Queue<Runnable> b = new ArrayDeque();

    public final void e() {
        if (!this.c) {
            try {
                this.c = true;
                while (!this.b.isEmpty()) {
                    if (!(this.d || !this.e)) {
                        break;
                    }
                    Runnable poll = this.b.poll();
                    if (poll != null) {
                        poll.run();
                    }
                }
            } finally {
                this.c = false;
            }
        }
    }
}
