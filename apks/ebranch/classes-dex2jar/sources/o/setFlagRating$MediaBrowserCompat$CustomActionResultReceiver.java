package o;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;
/* loaded from: classes-dex2jar.jar:o/setFlagRating$MediaBrowserCompat$CustomActionResultReceiver.class */
final class setFlagRating$MediaBrowserCompat$CustomActionResultReceiver implements ObjectEncoder<TransaksiTundaDetail> {
    static final setFlagRating$MediaBrowserCompat$CustomActionResultReceiver e = new setFlagRating$MediaBrowserCompat$CustomActionResultReceiver();
    private static final FieldDescriptor a = FieldDescriptor.of("eventTimeMs");
    private static final FieldDescriptor d = FieldDescriptor.of("eventCode");
    private static final FieldDescriptor b = FieldDescriptor.of("eventUptimeMs");
    private static final FieldDescriptor j = FieldDescriptor.of("sourceExtension");
    private static final FieldDescriptor f = FieldDescriptor.of("sourceExtensionJsonProto3");
    private static final FieldDescriptor h = FieldDescriptor.of("timezoneOffsetSeconds");
    private static final FieldDescriptor c = FieldDescriptor.of("networkConnectionInfo");

    private setFlagRating$MediaBrowserCompat$CustomActionResultReceiver() {
    }

    public final /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        TransaksiTundaDetail transaksiTundaDetail = (TransaksiTundaDetail) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.add(a, transaksiTundaDetail.b());
        objectEncoderContext.add(d, transaksiTundaDetail.c());
        objectEncoderContext.add(b, transaksiTundaDetail.a());
        objectEncoderContext.add(j, transaksiTundaDetail.d());
        objectEncoderContext.add(f, transaksiTundaDetail.j());
        objectEncoderContext.add(h, transaksiTundaDetail.f());
        objectEncoderContext.add(c, transaksiTundaDetail.e());
    }
}
