package o;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.text.format.Formatter;
import android.util.Log;
/* loaded from: classes-dex2jar.jar:o/DetailTransactionResponse$ValueTxnDataDetail$$Parcelable.class */
public final class DetailTransactionResponse$ValueTxnDataDetail$$Parcelable {
    public final int a;
    public final int c;
    private final Context d;
    public final int e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/DetailTransactionResponse$ValueTxnDataDetail$$Parcelable$read.class */
    public interface read {
        int a();

        int d();
    }

    /* loaded from: classes-dex2jar.jar:o/DetailTransactionResponse$ValueTxnDataDetail$$Parcelable$write.class */
    public static final class write {
        static final int a;
        ActivityManager c;
        float d;
        final Context e;
        read g;
        float h = 2.0f;
        float i = 0.4f;
        float j = 0.33f;
        int b = 4194304;

        static {
            a = Build.VERSION.SDK_INT < 26 ? 4 : 1;
        }

        public write(Context context) {
            this.d = (float) a;
            this.e = context;
            this.c = (ActivityManager) context.getSystemService("activity");
            this.g = new DetailTransactionResponse$ValueTxnDataDetail$$Parcelable$MediaBrowserCompat$CustomActionResultReceiver(context.getResources().getDisplayMetrics());
            if (Build.VERSION.SDK_INT >= 26 && this.c.isLowRamDevice()) {
                this.d = 0.0f;
            }
        }
    }

    public DetailTransactionResponse$ValueTxnDataDetail$$Parcelable(write write2) {
        this.d = write2.e;
        int i = write2.c.isLowRamDevice() ? write2.b / 2 : write2.b;
        this.e = i;
        ActivityManager activityManager = write2.c;
        float f = write2.i;
        f = write2.j;
        int memoryClass = activityManager.getMemoryClass();
        boolean isLowRamDevice = activityManager.isLowRamDevice();
        float f2 = (float) ((memoryClass << 10) << 10);
        if (isLowRamDevice) {
        }
        int round = Math.round(f2 * f);
        float a = (float) ((write2.g.a() * write2.g.d()) << 2);
        int round2 = Math.round(write2.d * a);
        int round3 = Math.round(a * write2.h);
        int i2 = round - i;
        int i3 = round3 + round2;
        if (i3 <= i2) {
            this.a = round3;
            this.c = round2;
        } else {
            float f3 = ((float) i2) / (write2.d + write2.h);
            this.a = Math.round(write2.h * f3);
            this.c = Math.round(f3 * write2.d);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            StringBuilder sb = new StringBuilder("Calculation complete, Calculated memory cache size: ");
            sb.append(Formatter.formatFileSize(this.d, (long) this.a));
            sb.append(", pool size: ");
            sb.append(Formatter.formatFileSize(this.d, (long) this.c));
            sb.append(", byte array size: ");
            sb.append(Formatter.formatFileSize(this.d, (long) i));
            sb.append(", memory class limited? ");
            sb.append(i3 > round);
            sb.append(", max size: ");
            sb.append(Formatter.formatFileSize(this.d, (long) round));
            sb.append(", memoryClass: ");
            sb.append(write2.c.getMemoryClass());
            sb.append(", isLowMemoryDevice: ");
            sb.append(write2.c.isLowRamDevice());
            Log.d("MemorySizeCalculator", sb.toString());
        }
    }
}
