package o;

import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
/* loaded from: classes-dex2jar.jar:o/getTipeNasabahPenerimaId.class */
final /* synthetic */ class getTipeNasabahPenerimaId implements ObjectEncoder {
    static final ObjectEncoder c = new getTipeNasabahPenerimaId();

    private getTipeNasabahPenerimaId() {
    }

    public final void encode(Object obj, Object obj2) {
        ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
        int i = realmGet$beritaPenerima.d;
        String valueOf = String.valueOf(obj.getClass().getCanonicalName());
        throw new EncodingException(valueOf.length() != 0 ? "Couldn't find encoder for type ".concat(valueOf) : new String("Couldn't find encoder for type "));
    }
}
