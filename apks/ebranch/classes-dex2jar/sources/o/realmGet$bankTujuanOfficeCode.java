package o;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;
/* loaded from: classes-dex2jar.jar:o/realmGet$bankTujuanOfficeCode.class */
final class realmGet$bankTujuanOfficeCode implements ObjectEncoder<AbstractC0018realmGet$norekPenerima> {
    static final realmGet$bankTujuanOfficeCode d = new realmGet$bankTujuanOfficeCode();
    private static final FieldDescriptor e = FieldDescriptor.of("messagingClientEventExtension");

    private realmGet$bankTujuanOfficeCode() {
    }

    public final /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        ((ObjectEncoderContext) obj2).add(e, ((AbstractC0018realmGet$norekPenerima) obj).d());
    }
}
