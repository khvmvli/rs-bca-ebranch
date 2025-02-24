package o;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;
/* loaded from: classes-dex2jar.jar:o/setFlagRating$MediaBrowserCompat$SearchResultReceiver.class */
final class setFlagRating$MediaBrowserCompat$SearchResultReceiver implements ObjectEncoder<setTypeDraft> {
    static final setFlagRating$MediaBrowserCompat$SearchResultReceiver c = new setFlagRating$MediaBrowserCompat$SearchResultReceiver();
    private static final FieldDescriptor a = FieldDescriptor.of("networkType");
    private static final FieldDescriptor d = FieldDescriptor.of("mobileSubtype");

    private setFlagRating$MediaBrowserCompat$SearchResultReceiver() {
    }

    public final /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
        setTypeDraft settypedraft = (setTypeDraft) obj;
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        objectEncoderContext.add(a, settypedraft.b());
        objectEncoderContext.add(d, settypedraft.a());
    }
}
