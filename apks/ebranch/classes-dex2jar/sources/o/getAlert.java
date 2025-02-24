package o;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import o.CreateQueueReservationResponse$$Parcelable;
import o.getAlert;
import o.getAmountKliring;
/* loaded from: classes-dex2jar.jar:o/getAlert.class */
public final class getAlert<Data> implements getAmountKliring<byte[], Data> {
    private final IconCompatParcelizer<Data> c;

    /* loaded from: classes-dex2jar.jar:o/getAlert$IconCompatParcelizer.class */
    public interface IconCompatParcelizer<Data> {
        Class<Data> b();

        Data b(byte[] bArr);
    }

    /* loaded from: classes-dex2jar.jar:o/getAlert$RemoteActionCompatParcelizer.class */
    public static final class RemoteActionCompatParcelizer implements GetAcctOpeningCategoryDataResponse<byte[], ByteBuffer> {
        @Override // o.GetAcctOpeningCategoryDataResponse
        public final getAmountKliring<byte[], ByteBuffer> e(getListCategory getlistcategory) {
            return new getAlert(new IconCompatParcelizer<ByteBuffer>() { // from class: o.getAlert.RemoteActionCompatParcelizer.3
                @Override // o.getAlert.IconCompatParcelizer
                public final Class<ByteBuffer> b() {
                    return ByteBuffer.class;
                }

                @Override // o.getAlert.IconCompatParcelizer
                public final /* synthetic */ ByteBuffer b(byte[] bArr) {
                    return ByteBuffer.wrap(bArr);
                }
            });
        }
    }

    /* loaded from: classes-dex2jar.jar:o/getAlert$read.class */
    public static final class read implements GetAcctOpeningCategoryDataResponse<byte[], InputStream> {
        @Override // o.GetAcctOpeningCategoryDataResponse
        public final getAmountKliring<byte[], InputStream> e(getListCategory getlistcategory) {
            return new getAlert(new IconCompatParcelizer<InputStream>() { // from class: o.getAlert.read.4
                @Override // o.getAlert.IconCompatParcelizer
                public final Class<InputStream> b() {
                    return InputStream.class;
                }

                @Override // o.getAlert.IconCompatParcelizer
                public final /* synthetic */ InputStream b(byte[] bArr) {
                    return new ByteArrayInputStream(bArr);
                }
            });
        }
    }

    public getAlert(IconCompatParcelizer<Data> iconCompatParcelizer) {
        this.c = iconCompatParcelizer;
    }

    @Override // o.getAmountKliring
    public final /* bridge */ /* synthetic */ boolean a(byte[] bArr) {
        return true;
    }

    @Override // o.getAmountKliring
    public final /* synthetic */ getAmountKliring.write c(byte[] bArr, int i, int i2, CategoryResponse categoryResponse) {
        byte[] bArr2 = bArr;
        return new getAmountKliring.write(new getReceiverPhone(bArr2), new CreateQueueReservationResponse$$Parcelable<Data>(bArr2, this.c) { // from class: o.getAlert$MediaBrowserCompat$CustomActionResultReceiver
            private final getAlert.IconCompatParcelizer<Data> c;
            private final byte[] e;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.e = r4;
                this.c = r5;
            }

            @Override // o.CreateQueueReservationResponse$$Parcelable
            public final void a() {
            }

            @Override // o.CreateQueueReservationResponse$$Parcelable
            public final void a(setCategories setcategories, CreateQueueReservationResponse$$Parcelable.IconCompatParcelizer<? super Data> iconCompatParcelizer) {
                iconCompatParcelizer.a((Data) this.c.b(this.e));
            }

            @Override // o.CreateQueueReservationResponse$$Parcelable
            public final setNextCategoryCd b() {
                return setNextCategoryCd.LOCAL;
            }

            @Override // o.CreateQueueReservationResponse$$Parcelable
            public final void c() {
            }

            @Override // o.CreateQueueReservationResponse$$Parcelable
            public final Class<Data> e() {
                return this.c.b();
            }
        });
    }
}
