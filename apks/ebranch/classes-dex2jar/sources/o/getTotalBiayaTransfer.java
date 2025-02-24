package o;

import android.app.Application;
import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.annotation.Nullable;
/* loaded from: classes-dex2jar.jar:o/getTotalBiayaTransfer.class */
public final class getTotalBiayaTransfer {
    private static int b;
    @Nullable
    private static String e;

    public static String c() {
        Throwable th;
        String readLine;
        if (e == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                e = Application.getProcessName();
            } else {
                int i = b;
                int i2 = i;
                if (i == 0) {
                    i2 = Process.myPid();
                    b = i2;
                }
                r7 = null;
                BufferedReader bufferedReader = null;
                r8 = null;
                String str = null;
                if (i2 > 0) {
                    try {
                        StringBuilder sb = new StringBuilder("/proc/");
                        sb.append(i2);
                        sb.append("/cmdline");
                        String obj = sb.toString();
                        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            bufferedReader = new BufferedReader(new FileReader(obj));
                            try {
                                readLine = bufferedReader.readLine();
                            } catch (IOException e2) {
                            } catch (Throwable th2) {
                                th = th2;
                                getTanggalJatuhTempoTransaksi.e(bufferedReader);
                                throw th;
                            }
                        } finally {
                            StrictMode.setThreadPolicy(allowThreadDiskReads);
                        }
                    } catch (IOException e3) {
                        str = null;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                    if (readLine != null) {
                        str = readLine.trim();
                        getTanggalJatuhTempoTransaksi.e(bufferedReader);
                    } else {
                        throw new NullPointerException("null reference");
                    }
                }
                e = str;
            }
        }
        return e;
    }
}
