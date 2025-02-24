package o;

import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;
import com.google.firebase.messaging.reporting.MessagingClientEvent;
import com.google.firebase.messaging.reporting.MessagingClientEventExtension;
/* loaded from: classes-dex2jar.jar:o/realmGet$metodePengirimanPenerima.class */
public final class realmGet$metodePengirimanPenerima implements Configurator {
    public static final Configurator b = new realmGet$metodePengirimanPenerima();

    private realmGet$metodePengirimanPenerima() {
    }

    public final void configure(EncoderConfig<?> encoderConfig) {
        encoderConfig.registerEncoder(AbstractC0018realmGet$norekPenerima.class, realmGet$bankTujuanOfficeCode.d);
        encoderConfig.registerEncoder(MessagingClientEventExtension.class, realmGet$bankTujuanPenerima.e);
        encoderConfig.registerEncoder(MessagingClientEvent.class, realmGet$alamatPenerima.a);
    }
}
