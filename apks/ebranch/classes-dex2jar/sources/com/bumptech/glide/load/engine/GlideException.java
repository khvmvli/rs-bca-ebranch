package com.bumptech.glide.load.engine;

import android.util.Log;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o.setCode;
import o.setNextCategoryCd;
/* loaded from: classes-dex2jar.jar:com/bumptech/glide/load/engine/GlideException.class */
public final class GlideException extends Exception {
    private static final StackTraceElement[] a = new StackTraceElement[0];
    public setNextCategoryCd b;
    public Exception c;
    public Class<?> d;
    public setCode e;
    private String f;
    private final List<Throwable> g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:com/bumptech/glide/load/engine/GlideException$write.class */
    public static final class write implements Appendable {
        private boolean a = true;
        private final Appendable b;

        write(Appendable appendable) {
            this.b = appendable;
        }

        @Override // java.lang.Appendable
        public final Appendable append(char c) throws IOException {
            boolean z = false;
            if (this.a) {
                this.a = false;
                this.b.append("  ");
            }
            if (c == '\n') {
                z = true;
            }
            this.a = z;
            this.b.append(c);
            return this;
        }

        @Override // java.lang.Appendable
        public final Appendable append(CharSequence charSequence) throws IOException {
            CharSequence charSequence2 = charSequence;
            if (charSequence == null) {
                charSequence2 = "";
            }
            return append(charSequence2, 0, charSequence2.length());
        }

        @Override // java.lang.Appendable
        public final Appendable append(CharSequence charSequence, int i, int i2) throws IOException {
            CharSequence charSequence2 = charSequence;
            if (charSequence == null) {
                charSequence2 = "";
            }
            if (this.a) {
                this.a = false;
                this.b.append("  ");
            }
            boolean z = false;
            if (charSequence2.length() > 0) {
                z = false;
                if (charSequence2.charAt(i2 - 1) == '\n') {
                    z = true;
                }
            }
            this.a = z;
            this.b.append(charSequence2, i, i2);
            return this;
        }
    }

    public GlideException(String str) {
        this(str, Collections.emptyList());
    }

    public GlideException(String str, Throwable th) {
        this(str, Collections.singletonList(th));
    }

    public GlideException(String str, List<Throwable> list) {
        this.f = str;
        setStackTrace(a);
        this.g = list;
    }

    private void a(Throwable th, List<Throwable> list) {
        if (th instanceof GlideException) {
            for (Throwable th2 : ((GlideException) th).g) {
                a(th2, list);
            }
            return;
        }
        list.add(th);
    }

    private static void b(Throwable th, Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append('\n');
        } catch (IOException e) {
            throw new RuntimeException(th);
        }
    }

    private static void c(List<Throwable> list, Appendable appendable) {
        try {
            int size = list.size();
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                appendable.append("Cause (").append(String.valueOf(i2)).append(" of ").append(String.valueOf(size)).append("): ");
                Throwable th = list.get(i);
                if (th instanceof GlideException) {
                    GlideException glideException = (GlideException) th;
                    b(glideException, appendable);
                    c(glideException.g, new write(appendable));
                } else {
                    b(th, appendable);
                }
                i = i2;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public final void c(String str) {
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            StringBuilder sb = new StringBuilder("Root cause (");
            int i2 = i + 1;
            sb.append(i2);
            sb.append(" of ");
            sb.append(size);
            sb.append(")");
            Log.i(str, sb.toString(), arrayList.get(i));
            i = i2;
        }
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        return this;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.f);
        String str3 = "";
        if (this.d != null) {
            StringBuilder sb2 = new StringBuilder(", ");
            sb2.append(this.d);
            str = sb2.toString();
        } else {
            str = "";
        }
        sb.append(str);
        if (this.b != null) {
            StringBuilder sb3 = new StringBuilder(", ");
            sb3.append(this.b);
            str2 = sb3.toString();
        } else {
            str2 = "";
        }
        sb.append(str2);
        if (this.e != null) {
            StringBuilder sb4 = new StringBuilder(", ");
            sb4.append(this.e);
            str3 = sb4.toString();
        }
        sb.append(str3);
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
        if (arrayList.isEmpty()) {
            return sb.toString();
        }
        if (arrayList.size() == 1) {
            sb.append("\nThere was 1 root cause:");
        } else {
            sb.append("\nThere were ");
            sb.append(arrayList.size());
            sb.append(" root causes:");
        }
        for (Throwable th : arrayList) {
            sb.append('\n');
            sb.append(th.getClass().getName());
            sb.append('(');
            sb.append(th.getMessage());
            sb.append(')');
        }
        sb.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb.toString();
    }

    @Override // java.lang.Throwable
    public final void printStackTrace() {
        printStackTrace(System.err);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) {
        b(this, printStream);
        c(this.g, new write(printStream));
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) {
        b(this, printWriter);
        c(this.g, new write(printWriter));
    }
}
