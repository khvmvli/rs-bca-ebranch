package o;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.messaging.reporting.MessagingClientEventExtension;
import java.io.IOException;
/* loaded from: classes-dex2jar.jar:o/realmGet$bankTujuanPenerima.class */
final class realmGet$bankTujuanPenerima implements ObjectEncoder<MessagingClientEventExtension> {
    private static final FieldDescriptor b;
    static final realmGet$bankTujuanPenerima e = new realmGet$bankTujuanPenerima();

    static {
        FieldDescriptor.Builder builder = FieldDescriptor.builder("messagingClientEvent");
        realmSet$metodePengirimanPenerima realmset_metodepengirimanpenerima = new realmSet$metodePengirimanPenerima();
        realmset_metodepengirimanpenerima.e(1);
        b = builder.withProperty(realmset_metodepengirimanpenerima.c()).build();
    }

    private realmGet$bankTujuanPenerima() {
    }

    public final /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        ((ObjectEncoderContext) obj2).add(b, ((MessagingClientEventExtension) obj).getMessagingClientEventInternal());
    }
}
