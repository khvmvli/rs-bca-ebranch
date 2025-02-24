package o;

import java.io.IOException;
import java.nio.ByteBuffer;
/* loaded from: classes-dex2jar.jar:o/getFlagReservationCsoReguler.class */
public final class getFlagReservationCsoReguler implements setReservationTime<ByteBuffer> {
    private final ByteBuffer e;

    /* loaded from: classes-dex2jar.jar:o/getFlagReservationCsoReguler$write.class */
    public static final class write implements setReservationTime$MediaBrowserCompat$CustomActionResultReceiver<ByteBuffer> {
        @Override // o.setReservationTime$MediaBrowserCompat$CustomActionResultReceiver
        public final Class<ByteBuffer> c() {
            return ByteBuffer.class;
        }

        @Override // o.setReservationTime$MediaBrowserCompat$CustomActionResultReceiver
        public final /* synthetic */ setReservationTime<ByteBuffer> d(ByteBuffer byteBuffer) {
            return new getFlagReservationCsoReguler(byteBuffer);
        }
    }

    public getFlagReservationCsoReguler(ByteBuffer byteBuffer) {
        this.e = byteBuffer;
    }

    @Override // o.setReservationTime
    public final /* synthetic */ ByteBuffer a() throws IOException {
        this.e.position(0);
        return this.e;
    }

    @Override // o.setReservationTime
    public final void d() {
    }
}
