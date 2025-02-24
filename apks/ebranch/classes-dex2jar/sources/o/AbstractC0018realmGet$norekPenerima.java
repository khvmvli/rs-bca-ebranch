package o;

import com.google.firebase.encoders.annotations.Encodable;
import com.google.firebase.messaging.reporting.MessagingClientEventExtension;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
@Encodable
/* renamed from: o.realmGet$norekPenerima  reason: case insensitive filesystem */
/* loaded from: classes-dex2jar.jar:o/realmGet$norekPenerima.class */
public abstract class AbstractC0018realmGet$norekPenerima {
    private static final realmGet$bankTujuanCode b;

    static {
        realmGet$beritaPenerima realmget_beritapenerima = new realmGet$beritaPenerima();
        realmGet$metodePengirimanPenerima.b.configure(realmget_beritapenerima);
        b = realmget_beritapenerima.c();
    }

    private AbstractC0018realmGet$norekPenerima() {
    }

    public static void c(Object obj, OutputStream outputStream) throws IOException {
        b.d(obj, outputStream);
    }

    public static byte[] c(Object obj) {
        realmGet$bankTujuanCode realmget_banktujuancode = b;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            realmget_banktujuancode.d(obj, byteArrayOutputStream);
        } catch (IOException e) {
        }
        return byteArrayOutputStream.toByteArray();
    }

    public abstract MessagingClientEventExtension d();
}
