package o;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicLong;
/* loaded from: classes-dex2jar.jar:o/setStockBranchList.class */
public final class setStockBranchList {
    public static final setStockBranchList a = new setStockBranchList();
    private static final AtomicLong e = new AtomicLong();

    private setStockBranchList() {
    }

    public static File b(File file, String str) {
        File file2;
        File file3;
        subscribeReservationRescheduleEvent.e(file, "");
        subscribeReservationRescheduleEvent.e(str, "");
        try {
            file3 = new File(file, str);
            if (file3.exists() && !file3.delete()) {
                StringBuilder sb = new StringBuilder("Failed to delete file ");
                sb.append(file3);
                throw new IOException(sb.toString());
            }
            File parentFile = file3.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
        } catch (IOException e2) {
            new IOException("An error occurred while creating a Chucker file", e2).printStackTrace();
            file2 = null;
        }
        if (file3.createNewFile()) {
            file2 = file3;
            return file2;
        }
        StringBuilder sb2 = new StringBuilder("File ");
        sb2.append(file3);
        sb2.append(" already exists");
        throw new IOException(sb2.toString());
    }
}
