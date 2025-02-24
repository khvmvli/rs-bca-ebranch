package o;

import android.os.Process;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.common.IdManager;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2-dex2jar.jar:o/ResetAccountSuccessDialog_ViewBinding.class */
public final class ResetAccountSuccessDialog_ViewBinding {
    private static final AtomicLong c = new AtomicLong(0);
    private static String d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ResetAccountSuccessDialog_ViewBinding(IdManager idManager) {
        long time = new Date().getTime();
        long j = time / 1000;
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt((int) j);
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        byte[] array = allocate.array();
        byte b = array[0];
        byte b2 = array[1];
        byte b3 = array[2];
        byte b4 = array[3];
        byte[] e = e(time % 1000);
        byte b5 = e[0];
        byte b6 = e[1];
        byte[] e2 = e(c.incrementAndGet());
        byte b7 = e2[0];
        byte b8 = e2[1];
        byte[] e3 = e((long) Integer.valueOf(Process.myPid()).shortValue());
        byte b9 = e3[0];
        byte b10 = e3[1];
        String sha1 = CommonUtils.sha1(idManager.getCrashlyticsInstallId());
        String hexify = CommonUtils.hexify(new byte[]{b, b2, b3, b4, b5, b6, b7, b8, b9, b10});
        d = String.format(Locale.US, "%s%s%s%s", hexify.substring(0, 12), hexify.substring(12, 16), hexify.subSequence(16, 20), sha1.substring(0, 12)).toUpperCase(Locale.US);
    }

    private static byte[] e(long j) {
        ByteBuffer allocate = ByteBuffer.allocate(2);
        allocate.putShort((short) ((int) j));
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        return allocate.array();
    }

    public final String toString() {
        return d;
    }
}
