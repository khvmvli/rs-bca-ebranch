package o;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes-dex2jar.jar:o/setCategoryContent.class */
public final class setCategoryContent implements setContentOrder<InputStream> {
    private final DetailTransactionResponse d;

    public setCategoryContent(DetailTransactionResponse detailTransactionResponse) {
        this.d = detailTransactionResponse;
    }

    private boolean e(InputStream inputStream, File file) {
        Throwable th;
        IOException e;
        byte[] bArr = (byte[]) this.d.b(65536, byte[].class);
        FileOutputStream fileOutputStream = null;
        FileOutputStream fileOutputStream2 = null;
        boolean z = false;
        try {
            try {
                fileOutputStream2 = new FileOutputStream(file);
                while (true) {
                    try {
                        int read = inputStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        fileOutputStream2.write(bArr, 0, read);
                    } catch (IOException e2) {
                        e = e2;
                        fileOutputStream = fileOutputStream2;
                        if (Log.isLoggable("StreamEncoder", 3)) {
                            fileOutputStream2 = fileOutputStream;
                            Log.d("StreamEncoder", "Failed to encode data onto the OutputStream", e);
                        }
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException e3) {
                            }
                        }
                        this.d.e(bArr);
                        return z;
                    } catch (Throwable th2) {
                        th = th2;
                        if (fileOutputStream2 != null) {
                            try {
                                fileOutputStream2.close();
                            } catch (IOException e4) {
                            }
                        }
                        this.d.e(bArr);
                        throw th;
                    }
                }
                fileOutputStream2.close();
                try {
                    fileOutputStream2.close();
                } catch (IOException e5) {
                }
                this.d.e(bArr);
                z = true;
            } catch (IOException e6) {
                e = e6;
            }
            return z;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // o.setContentOrder
    public final /* synthetic */ boolean c(InputStream inputStream, File file, CategoryResponse categoryResponse) {
        return e(inputStream, file);
    }
}
