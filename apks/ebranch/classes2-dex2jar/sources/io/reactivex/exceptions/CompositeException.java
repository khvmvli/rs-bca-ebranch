package io.reactivex.exceptions;

import io.realm.RealmFieldTypeConstants;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes2-dex2jar.jar:io/reactivex/exceptions/CompositeException.class */
public final class CompositeException extends RuntimeException {
    private Throwable b;
    private final String c;
    private final List<Throwable> e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2-dex2jar.jar:io/reactivex/exceptions/CompositeException$IconCompatParcelizer.class */
    public static abstract class IconCompatParcelizer {
        IconCompatParcelizer() {
        }

        abstract void c(Object obj);
    }

    /* loaded from: classes2-dex2jar.jar:io/reactivex/exceptions/CompositeException$RemoteActionCompatParcelizer.class */
    static final class RemoteActionCompatParcelizer extends IconCompatParcelizer {
        private final PrintWriter c;

        RemoteActionCompatParcelizer(PrintWriter printWriter) {
            this.c = printWriter;
        }

        @Override // io.reactivex.exceptions.CompositeException.IconCompatParcelizer
        final void c(Object obj) {
            this.c.println(obj);
        }
    }

    /* loaded from: classes2-dex2jar.jar:io/reactivex/exceptions/CompositeException$read.class */
    static final class read extends IconCompatParcelizer {
        private final PrintStream c;

        read(PrintStream printStream) {
            this.c = printStream;
        }

        @Override // io.reactivex.exceptions.CompositeException.IconCompatParcelizer
        final void c(Object obj) {
            this.c.println(obj);
        }
    }

    /* loaded from: classes2-dex2jar.jar:io/reactivex/exceptions/CompositeException$write.class */
    static final class write extends RuntimeException {
        write() {
        }

        @Override // java.lang.Throwable
        public final String getMessage() {
            return "Chain of Causes for CompositeException In Order Received =>";
        }
    }

    private static List<Throwable> a(Throwable th) {
        ArrayList arrayList = new ArrayList();
        Throwable cause = th.getCause();
        if (cause != null && cause != th) {
            while (true) {
                arrayList.add(cause);
                cause = cause.getCause();
                if (cause == null || cause == cause) {
                    break;
                }
            }
        }
        return arrayList;
    }

    private Throwable e(Throwable th) {
        Throwable cause = th.getCause();
        if (cause == null || this.b == cause) {
            return th;
        }
        while (true) {
            cause = cause.getCause();
            if (cause == null || cause == cause) {
                break;
            }
        }
        return cause;
    }

    private void e(IconCompatParcelizer iconCompatParcelizer) {
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
        for (Throwable th : this.e) {
            sb.append("  ComposedException ");
            sb.append(i);
            sb.append(" :\n");
            e(sb, th, "\t");
            i++;
        }
        iconCompatParcelizer.c(sb.toString());
    }

    private void e(StringBuilder sb, Throwable th, String str) {
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

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        Throwable th;
        synchronized (this) {
            if (this.b == null) {
                write write2 = new write();
                HashSet hashSet = new HashSet();
                Iterator<Throwable> it = this.e.iterator();
                write write3 = write2;
                while (it.hasNext()) {
                    Throwable next = it.next();
                    if (!hashSet.contains(next)) {
                        hashSet.add(next);
                        for (Throwable th2 : a(next)) {
                            if (hashSet.contains(th2)) {
                                next = new RuntimeException("Duplicate found in causal chain so cropping to prevent loop ...");
                            } else {
                                hashSet.add(th2);
                            }
                        }
                        try {
                            write3.initCause(next);
                        } catch (Throwable th3) {
                        }
                        write3 = e(write3);
                    }
                }
                this.b = write2;
            }
            th = this.b;
        }
        return th;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.c;
    }

    @Override // java.lang.Throwable
    public final void printStackTrace() {
        printStackTrace(System.err);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) {
        e(new read(printStream));
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) {
        e(new RemoteActionCompatParcelizer(printWriter));
    }
}
