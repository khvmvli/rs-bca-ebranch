package o;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import o.dismiss;
/* loaded from: classes-dex2jar.jar:o/access$000.class */
public final class access$000 {
    private static final ExecutorService a;
    static final setThumbResource<String, Typeface> d = new setThumbResource<>(16);
    static final Object e = new Object();
    static final setCollapseIcon<String, ArrayList<onCancel<IconCompatParcelizer>>> c = new setCollapseIcon<>();

    /* loaded from: classes-dex2jar.jar:o/access$000$IconCompatParcelizer.class */
    public static final class IconCompatParcelizer {
        final int a;
        final Typeface c;

        IconCompatParcelizer(int i) {
            this.c = null;
            this.a = i;
        }

        IconCompatParcelizer(Typeface typeface) {
            this.c = typeface;
            this.a = 0;
        }
    }

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new ThreadFactory("fonts-androidx", 10) { // from class: o.dismiss$MediaBrowserCompat$CustomActionResultReceiver
            private int a;
            private String d;

            /* loaded from: classes-dex2jar.jar:o/dismiss$MediaBrowserCompat$CustomActionResultReceiver$read.class */
            static final class read extends Thread {
                private final int c;

                read(Runnable runnable, String str, int i) {
                    super(runnable, str);
                    this.c = i;
                }

                @Override // java.lang.Thread, java.lang.Runnable
                public final void run() {
                    Process.setThreadPriority(this.c);
                    run();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.d = r4;
                this.a = r5;
            }

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return new read(runnable, this.d, this.a);
            }
        });
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        a = threadPoolExecutor;
    }

    public static Typeface d(final Context context, final access$100 access_100, final int i, Executor executor, final access$200 access_200) {
        final String d2 = d(access_100, i);
        Typeface e2 = d.e(d2);
        if (e2 != null) {
            access_200.b(new IconCompatParcelizer(e2));
            return e2;
        }
        AnonymousClass4 r0 = new onCancel<IconCompatParcelizer>() { // from class: o.access$000.4
            @Override // o.onCancel
            public final /* synthetic */ void e(IconCompatParcelizer iconCompatParcelizer) {
                access_200.b(iconCompatParcelizer);
            }
        };
        synchronized (e) {
            setCollapseIcon<String, ArrayList<onCancel<IconCompatParcelizer>>> setcollapseicon = c;
            ArrayList<onCancel<IconCompatParcelizer>> arrayList = setcollapseicon.get(d2);
            if (arrayList != null) {
                arrayList.add(r0);
                return null;
            }
            ArrayList<onCancel<IconCompatParcelizer>> arrayList2 = new ArrayList<>();
            arrayList2.add(r0);
            setcollapseicon.put(d2, arrayList2);
            AnonymousClass5 r02 = new Callable<IconCompatParcelizer>() { // from class: o.access$000.5
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ IconCompatParcelizer call() throws Exception {
                    return access$000.e(d2, context, access_100, i);
                }
            };
            Executor executor2 = executor;
            if (executor == null) {
                executor2 = a;
            }
            executor2.execute(new dismiss.read(Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler(), r02, new onCancel<IconCompatParcelizer>() { // from class: o.access$000.3
                @Override // o.onCancel
                public final /* synthetic */ void e(IconCompatParcelizer iconCompatParcelizer) {
                    IconCompatParcelizer iconCompatParcelizer2 = iconCompatParcelizer;
                    synchronized (access$000.e) {
                        ArrayList<onCancel<IconCompatParcelizer>> arrayList3 = access$000.c.get(d2);
                        if (arrayList3 != null) {
                            access$000.c.remove(d2);
                            for (int i2 = 0; i2 < arrayList3.size(); i2++) {
                                arrayList3.get(i2).e(iconCompatParcelizer2);
                            }
                        }
                    }
                }
            }));
            return null;
        }
    }

    private static String d(access$100 access_100, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(access_100.b);
        sb.append("-");
        sb.append(i);
        return sb.toString();
    }

    public static Typeface e(final Context context, final access$100 access_100, access$200 access_200, final int i, int i2) {
        final String d2 = d(access_100, i);
        Typeface e2 = d.e(d2);
        if (e2 != null) {
            access_200.b(new IconCompatParcelizer(e2));
            return e2;
        } else if (i2 == -1) {
            IconCompatParcelizer e3 = e(d2, context, access_100, i);
            access_200.b(e3);
            return e3.c;
        } else {
            try {
                IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) dismiss.d(a, new Callable<IconCompatParcelizer>() { // from class: o.access$000.2
                    @Override // java.util.concurrent.Callable
                    public final /* synthetic */ IconCompatParcelizer call() throws Exception {
                        return access$000.e(d2, context, access_100, i);
                    }
                }, i2);
                access_200.b(iconCompatParcelizer);
                return iconCompatParcelizer.c;
            } catch (InterruptedException e4) {
                access_200.b(new IconCompatParcelizer(-3));
                return null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ab  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    static o.access$000.IconCompatParcelizer e(java.lang.String r5, android.content.Context r6, o.access$100 r7, int r8) {
        /*
        // Method dump skipped, instructions count: 223
        */
        throw new UnsupportedOperationException("Method not decompiled: o.access$000.e(java.lang.String, android.content.Context, o.access$100, int):o.access$000$IconCompatParcelizer");
    }
}
