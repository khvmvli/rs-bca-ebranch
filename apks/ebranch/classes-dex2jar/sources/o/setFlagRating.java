package o;

import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;
import java.io.IOException;
/* loaded from: classes-dex2jar.jar:o/setFlagRating.class */
public final class setFlagRating implements Configurator {
    public static final Configurator c = new setFlagRating();

    /* loaded from: classes-dex2jar.jar:o/setFlagRating$IconCompatParcelizer.class */
    static final class IconCompatParcelizer implements ObjectEncoder<setFlagBooking> {
        static final IconCompatParcelizer d = new IconCompatParcelizer();
        private static final FieldDescriptor k = FieldDescriptor.of("sdkVersion");
        private static final FieldDescriptor j = FieldDescriptor.of("model");
        private static final FieldDescriptor g = FieldDescriptor.of("hardware");
        private static final FieldDescriptor e = FieldDescriptor.of("device");
        private static final FieldDescriptor n = FieldDescriptor.of("product");
        private static final FieldDescriptor l = FieldDescriptor.of("osBuild");
        private static final FieldDescriptor h = FieldDescriptor.of("manufacturer");
        private static final FieldDescriptor b = FieldDescriptor.of("fingerprint");
        private static final FieldDescriptor i = FieldDescriptor.of("locale");
        private static final FieldDescriptor c = FieldDescriptor.of("country");
        private static final FieldDescriptor f = FieldDescriptor.of("mccMnc");
        private static final FieldDescriptor a = FieldDescriptor.of("applicationBuild");

        private IconCompatParcelizer() {
        }

        public final /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
            setFlagBooking setflagbooking = (setFlagBooking) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.add(k, setflagbooking.k());
            objectEncoderContext.add(j, setflagbooking.h());
            objectEncoderContext.add(g, setflagbooking.d());
            objectEncoderContext.add(e, setflagbooking.a());
            objectEncoderContext.add(n, setflagbooking.l());
            objectEncoderContext.add(l, setflagbooking.f());
            objectEncoderContext.add(h, setflagbooking.j());
            objectEncoderContext.add(b, setflagbooking.c());
            objectEncoderContext.add(i, setflagbooking.i());
            objectEncoderContext.add(c, setflagbooking.b());
            objectEncoderContext.add(f, setflagbooking.g());
            objectEncoderContext.add(a, setflagbooking.e());
        }
    }

    /* loaded from: classes-dex2jar.jar:o/setFlagRating$RemoteActionCompatParcelizer.class */
    static final class RemoteActionCompatParcelizer implements ObjectEncoder<TransaksiTunda$$Parcelable> {
        static final RemoteActionCompatParcelizer b = new RemoteActionCompatParcelizer();
        private static final FieldDescriptor f = FieldDescriptor.of("requestTimeMs");
        private static final FieldDescriptor g = FieldDescriptor.of("requestUptimeMs");
        private static final FieldDescriptor d = FieldDescriptor.of("clientInfo");
        private static final FieldDescriptor a = FieldDescriptor.of("logSource");
        private static final FieldDescriptor c = FieldDescriptor.of("logSourceName");
        private static final FieldDescriptor e = FieldDescriptor.of("logEvent");
        private static final FieldDescriptor i = FieldDescriptor.of("qosTier");

        private RemoteActionCompatParcelizer() {
        }

        public final /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
            TransaksiTunda$$Parcelable transaksiTunda$$Parcelable = (TransaksiTunda$$Parcelable) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.add(f, transaksiTunda$$Parcelable.i());
            objectEncoderContext.add(g, transaksiTunda$$Parcelable.j());
            objectEncoderContext.add(d, transaksiTunda$$Parcelable.d());
            objectEncoderContext.add(a, transaksiTunda$$Parcelable.e());
            objectEncoderContext.add(c, transaksiTunda$$Parcelable.b());
            objectEncoderContext.add(e, transaksiTunda$$Parcelable.a());
            objectEncoderContext.add(i, transaksiTunda$$Parcelable.c());
        }
    }

    /* loaded from: classes-dex2jar.jar:o/setFlagRating$read.class */
    static final class read implements ObjectEncoder<setTxbDateFormatted> {
        static final read d = new read();
        private static final FieldDescriptor c = FieldDescriptor.of("clientType");
        private static final FieldDescriptor a = FieldDescriptor.of("androidClientInfo");

        private read() {
        }

        public final /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
            setTxbDateFormatted settxbdateformatted = (setTxbDateFormatted) obj;
            ObjectEncoderContext objectEncoderContext = (ObjectEncoderContext) obj2;
            objectEncoderContext.add(c, settxbdateformatted.b());
            objectEncoderContext.add(a, settxbdateformatted.a());
        }
    }

    /* loaded from: classes-dex2jar.jar:o/setFlagRating$write.class */
    static final class write implements ObjectEncoder<setServiceType> {
        static final write b = new write();
        private static final FieldDescriptor a = FieldDescriptor.of("logRequest");

        private write() {
        }

        public final /* synthetic */ void encode(Object obj, Object obj2) throws IOException {
            ((ObjectEncoderContext) obj2).add(a, ((setServiceType) obj).b());
        }
    }

    private setFlagRating() {
    }

    public final void configure(EncoderConfig<?> encoderConfig) {
        encoderConfig.registerEncoder(setServiceType.class, write.b);
        encoderConfig.registerEncoder(setDraft.class, write.b);
        encoderConfig.registerEncoder(TransaksiTunda$$Parcelable.class, RemoteActionCompatParcelizer.b);
        encoderConfig.registerEncoder(setTransaksiTundaDetailList.class, RemoteActionCompatParcelizer.b);
        encoderConfig.registerEncoder(setTxbDateFormatted.class, read.d);
        encoderConfig.registerEncoder(setHeader.class, read.d);
        encoderConfig.registerEncoder(setFlagBooking.class, IconCompatParcelizer.d);
        encoderConfig.registerEncoder(setDataId.class, IconCompatParcelizer.d);
        encoderConfig.registerEncoder(TransaksiTundaDetail.class, setFlagRating$MediaBrowserCompat$CustomActionResultReceiver.e);
        encoderConfig.registerEncoder(setStatus.class, setFlagRating$MediaBrowserCompat$CustomActionResultReceiver.e);
        encoderConfig.registerEncoder(setTypeDraft.class, setFlagRating$MediaBrowserCompat$SearchResultReceiver.c);
        encoderConfig.registerEncoder(setStatusType.class, setFlagRating$MediaBrowserCompat$SearchResultReceiver.c);
    }
}
