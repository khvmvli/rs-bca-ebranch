package rx.exceptions;

import io.realm.RealmFieldTypeConstants;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes2-dex2jar.jar:rx/exceptions/CompositeException.class */
public final class CompositeException extends RuntimeException {
    private final List<Throwable> b;
    private final String d;
    private Throwable e;

    /* loaded from: classes2-dex2jar.jar:rx/exceptions/CompositeException$IconCompatParcelizer.class */
    static final class IconCompatParcelizer extends RemoteActionCompatParcelizer {
        private final PrintStream e;

        IconCompatParcelizer(PrintStream printStream) {
            this.e = printStream;
        }

        @Override // rx.exceptions.CompositeException.RemoteActionCompatParcelizer
        final Object a() {
            return this.e;
        }

        @Override // rx.exceptions.CompositeException.RemoteActionCompatParcelizer
        final void a(Object obj) {
            this.e.println(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2-dex2jar.jar:rx/exceptions/CompositeException$RemoteActionCompatParcelizer.class */
    public static abstract class RemoteActionCompatParcelizer {
        RemoteActionCompatParcelizer() {
        }

        abstract Object a();

        abstract void a(Object obj);
    }

    /* loaded from: classes2-dex2jar.jar:rx/exceptions/CompositeException$read.class */
    static final class read extends RuntimeException {
        read() {
        }

        @Override // java.lang.Throwable
        public final String getMessage() {
            return "Chain of Causes for CompositeException In Order Received =>";
        }
    }

    /* loaded from: classes2-dex2jar.jar:rx/exceptions/CompositeException$write.class */
    static final class write extends RemoteActionCompatParcelizer {
        private final PrintWriter c;

        write(PrintWriter printWriter) {
            this.c = printWriter;
        }

        @Override // rx.exceptions.CompositeException.RemoteActionCompatParcelizer
        final Object a() {
            return this.c;
        }

        @Override // rx.exceptions.CompositeException.RemoteActionCompatParcelizer
        final void a(Object obj) {
            this.c.println(obj);
        }
    }

    private static List<Throwable> a(Throwable th) {
        ArrayList arrayList = new ArrayList();
        Throwable cause = th.getCause();
        if (cause != null && cause != th) {
            Throwable th2 = cause;
            while (true) {
                arrayList.add(th2);
                Throwable cause2 = th2.getCause();
                if (cause2 == null || cause2 == th2) {
                    break;
                }
                th2 = th2.getCause();
            }
        }
        return arrayList;
    }

    private void b(StringBuilder sb, Throwable th, String str) {
        while (true) {
            sb.append(str);
            sb.append(th);
            sb.append('\n');
            StackTraceElement[] stackTrace = th.getStackTrace();
            for (StackTraceElement stackTraceElement : stackTrace) {
                sb.append("\t\tat ");
                sb.append(stackTraceElement);
                sb.append('\n');
            }
            if (th.getCause() != null) {
                sb.append("\tCaused by: ");
                th = th.getCause();
                str = "";
            } else {
                return;
            }
        }
    }

    private void b(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        StringBuilder sb = new StringBuilder((int) RealmFieldTypeConstants.LIST_OFFSET);
        sb.append(this);
        sb.append('\n');
        StackTraceElement[] stackTrace = getStackTrace();
        for (StackTraceElement stackTraceElement : stackTrace) {
            sb.append("\tat ");
            sb.append(stackTraceElement);
            sb.append('\n');
        }
        int i = 1;
        for (Throwable th : this.b) {
            sb.append("  ComposedException ");
            sb.append(i);
            sb.append(" :\n");
            b(sb, th, "\t");
            i++;
        }
        synchronized (remoteActionCompatParcelizer.a()) {
            remoteActionCompatParcelizer.a(sb.toString());
        }
    }

    private static Throwable d(Throwable th) {
        Throwable cause = th.getCause();
        if (cause == null || cause == th) {
            return th;
        }
        Throwable th2 = cause;
        while (true) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null || cause2 == th2) {
                break;
            }
            th2 = th2.getCause();
        }
        return th2;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        Throwable th;
        synchronized (this) {
            if (this.e == null) {
                Throwable read2 = new read();
                HashSet hashSet = new HashSet();
                Iterator<Throwable> it = this.b.iterator();
                Throwable th2 = read2;
                while (it.hasNext()) {
                    Throwable next = it.next();
                    if (!hashSet.contains(next)) {
                        hashSet.add(next);
                        for (Throwable th3 : a(next)) {
                            if (hashSet.contains(th3)) {
                                next = new RuntimeException("Duplicate found in causal chain so cropping to prevent loop ...");
                            } else {
                                hashSet.add(th3);
                            }
                        }
                        try {
                            th2.initCause(next);
                        } catch (Throwable th4) {
                        }
                        th2 = d(th2);
                    }
                }
                this.e = read2;
            }
            th = this.e;
        }
        return th;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.d;
    }

    @Override // java.lang.Throwable
    public final void printStackTrace() {
        printStackTrace(System.err);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) {
        b(new IconCompatParcelizer(printStream));
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) {
        b(new write(printWriter));
    }
}
