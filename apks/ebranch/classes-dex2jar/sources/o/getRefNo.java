package o;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import o.CreateQueueReservationResponse$$Parcelable;
import o.getAmountKliring;
/* loaded from: classes-dex2jar.jar:o/getRefNo.class */
public final class getRefNo implements getAmountKliring<File, ByteBuffer> {

    /* loaded from: classes-dex2jar.jar:o/getRefNo$IconCompatParcelizer.class */
    static final class IconCompatParcelizer implements CreateQueueReservationResponse$$Parcelable<ByteBuffer> {
        private final File c;

        IconCompatParcelizer(File file) {
            this.c = file;
        }

        @Override // o.CreateQueueReservationResponse$$Parcelable
        public final void a() {
        }

        @Override // o.CreateQueueReservationResponse$$Parcelable
        public final void a(setCategories setcategories, CreateQueueReservationResponse$$Parcelable.IconCompatParcelizer<? super ByteBuffer> iconCompatParcelizer) {
            try {
                iconCompatParcelizer.a(getLimitMin.b(this.c));
            } catch (IOException e) {
                if (Log.isLoggable("ByteBufferFileLoader", 3)) {
                    Log.d("ByteBufferFileLoader", "Failed to obtain ByteBuffer for file", e);
                }
                iconCompatParcelizer.b(e);
            }
        }

        @Override // o.CreateQueueReservationResponse$$Parcelable
        public final setNextCategoryCd b() {
            return setNextCategoryCd.LOCAL;
        }

        @Override // o.CreateQueueReservationResponse$$Parcelable
        public final void c() {
        }

        @Override // o.CreateQueueReservationResponse$$Parcelable
        public final Class<ByteBuffer> e() {
            return ByteBuffer.class;
        }
    }

    @Override // o.getAmountKliring
    public final /* bridge */ /* synthetic */ boolean a(File file) {
        return true;
    }

    @Override // o.getAmountKliring
    public final /* synthetic */ getAmountKliring.write<ByteBuffer> c(File file, int i, int i2, CategoryResponse categoryResponse) {
        File file2 = file;
        return new getAmountKliring.write<>(new getReceiverPhone(file2), new IconCompatParcelizer(file2));
    }
}
