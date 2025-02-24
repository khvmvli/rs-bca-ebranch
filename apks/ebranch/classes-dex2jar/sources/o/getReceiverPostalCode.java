package o;

import java.util.concurrent.Executor;
/* loaded from: classes-dex2jar.jar:o/getReceiverPostalCode.class */
public final class getReceiverPostalCode {
    private static final Executor a = new Executor() { // from class: o.getReceiverPostalCode.2
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            getTxnNotes2.c(runnable);
        }
    };
    private static final Executor b = new Executor() { // from class: o.getReceiverPostalCode.3
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            runnable.run();
        }
    };

    public static Executor c() {
        return b;
    }

    public static Executor e() {
        return a;
    }
}
