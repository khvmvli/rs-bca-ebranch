package o;

import android.util.Log;
import java.io.PrintStream;
import java.util.logging.Level;
/* loaded from: classes2-dex2jar.jar:o/start.class */
public interface start {

    /* loaded from: classes2-dex2jar.jar:o/start$RemoteActionCompatParcelizer.class */
    public static final class RemoteActionCompatParcelizer implements start {
        @Override // o.start
        public final void e(Level level, String str) {
            PrintStream printStream = System.out;
            StringBuilder sb = new StringBuilder("[");
            sb.append(level);
            sb.append("] ");
            sb.append(str);
            printStream.println(sb.toString());
        }

        @Override // o.start
        public final void e(Level level, String str, Throwable th) {
            PrintStream printStream = System.out;
            StringBuilder sb = new StringBuilder("[");
            sb.append(level);
            sb.append("] ");
            sb.append(str);
            printStream.println(sb.toString());
            th.printStackTrace(System.out);
        }
    }

    /* loaded from: classes2-dex2jar.jar:o/start$write.class */
    public static final class write implements start {
        static final boolean a;
        private final String d;

        static {
            boolean z;
            if (Class.forName("android.util.Log") != null) {
                z = true;
                a = z;
            }
            z = false;
            a = z;
        }

        public write(String str) {
            this.d = str;
        }

        public static boolean a() {
            return a;
        }

        private static int d(Level level) {
            int intValue = level.intValue();
            if (intValue < 800) {
                return intValue < 500 ? 2 : 3;
            }
            if (intValue < 900) {
                return 4;
            }
            return intValue < 1000 ? 5 : 6;
        }

        @Override // o.start
        public final void e(Level level, String str) {
            if (level != Level.OFF) {
                Log.println(d(level), this.d, str);
            }
        }

        @Override // o.start
        public final void e(Level level, String str, Throwable th) {
            if (level != Level.OFF) {
                int d = d(level);
                String str2 = this.d;
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append("\n");
                sb.append(Log.getStackTraceString(th));
                Log.println(d, str2, sb.toString());
            }
        }
    }

    void e(Level level, String str);

    void e(Level level, String str, Throwable th);
}
