package o;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* loaded from: classes2-dex2jar.jar:o/PilihRekeningSumberDanaDialog.class */
public final class PilihRekeningSumberDanaDialog extends ThreadPoolExecutor {
    public PilihRekeningSumberDanaDialog(TimeUnit timeUnit, BlockingQueue blockingQueue) {
        super(0, 1, 30, timeUnit, blockingQueue);
    }
}
