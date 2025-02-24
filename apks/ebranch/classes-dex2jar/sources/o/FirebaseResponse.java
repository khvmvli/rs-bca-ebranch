package o;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;
import o.CreateQueueReservationResponse$$Parcelable;
import o.getAmountKliring;
import o.getBankNameKliring;
/* loaded from: classes-dex2jar.jar:o/FirebaseResponse.class */
public final class FirebaseResponse implements setContentOrder<ByteBuffer> {

    /* loaded from: classes-dex2jar.jar:o/FirebaseResponse$TxnDataDetail.class */
    public interface TxnDataDetail {
        @Deprecated
        public static final TxnDataDetail b = new TxnDataDetail() { // from class: o.FirebaseResponse.TxnDataDetail.5
            @Override // o.FirebaseResponse.TxnDataDetail
            public final Map<String, String> d() {
                return Collections.emptyMap();
            }
        };
        public static final TxnDataDetail d;

        static {
            getBankNameKliring.IconCompatParcelizer iconCompatParcelizer = new getBankNameKliring.IconCompatParcelizer();
            iconCompatParcelizer.a = true;
            d = new getBankNameKliring(iconCompatParcelizer.b);
        }

        Map<String, String> d();
    }

    /* loaded from: classes-dex2jar.jar:o/FirebaseResponse$ValueTxnDataDetail.class */
    public final class ValueTxnDataDetail<Data> implements getAmountKliring<File, Data> {
        private final IconCompatParcelizer<Data> a;

        /* loaded from: classes-dex2jar.jar:o/FirebaseResponse$ValueTxnDataDetail$IconCompatParcelizer.class */
        public interface IconCompatParcelizer<Data> {
            Class<Data> b();

            Data c(File file) throws FileNotFoundException;

            void d(Data data) throws IOException;
        }

        /* loaded from: classes-dex2jar.jar:o/FirebaseResponse$ValueTxnDataDetail$RemoteActionCompatParcelizer.class */
        public static final class RemoteActionCompatParcelizer extends FirebaseResponse$ValueTxnDataDetail$MediaBrowserCompat$CustomActionResultReceiver<ParcelFileDescriptor> {
            public RemoteActionCompatParcelizer() {
                super(new IconCompatParcelizer<ParcelFileDescriptor>() { // from class: o.FirebaseResponse.ValueTxnDataDetail.RemoteActionCompatParcelizer.4
                    @Override // o.FirebaseResponse.ValueTxnDataDetail.IconCompatParcelizer
                    public final Class<ParcelFileDescriptor> b() {
                        return ParcelFileDescriptor.class;
                    }

                    @Override // o.FirebaseResponse.ValueTxnDataDetail.IconCompatParcelizer
                    public final /* synthetic */ ParcelFileDescriptor c(File file) throws FileNotFoundException {
                        return ParcelFileDescriptor.open(file, 268435456);
                    }

                    @Override // o.FirebaseResponse.ValueTxnDataDetail.IconCompatParcelizer
                    public final /* synthetic */ void d(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
                        parcelFileDescriptor.close();
                    }
                });
            }
        }

        /* loaded from: classes-dex2jar.jar:o/FirebaseResponse$ValueTxnDataDetail$read.class */
        public static final class read extends FirebaseResponse$ValueTxnDataDetail$MediaBrowserCompat$CustomActionResultReceiver<InputStream> {
            public read() {
                super(new IconCompatParcelizer<InputStream>() { // from class: o.FirebaseResponse.ValueTxnDataDetail.read.1
                    @Override // o.FirebaseResponse.ValueTxnDataDetail.IconCompatParcelizer
                    public final Class<InputStream> b() {
                        return InputStream.class;
                    }

                    @Override // o.FirebaseResponse.ValueTxnDataDetail.IconCompatParcelizer
                    public final /* synthetic */ InputStream c(File file) throws FileNotFoundException {
                        return new FileInputStream(file);
                    }

                    @Override // o.FirebaseResponse.ValueTxnDataDetail.IconCompatParcelizer
                    public final /* synthetic */ void d(InputStream inputStream) throws IOException {
                        inputStream.close();
                    }
                });
            }
        }

        /* loaded from: classes-dex2jar.jar:o/FirebaseResponse$ValueTxnDataDetail$write.class */
        static final class write<Data> implements CreateQueueReservationResponse$$Parcelable<Data> {
            private final IconCompatParcelizer<Data> a;
            private Data c;
            private final File d;

            write(File file, IconCompatParcelizer<Data> iconCompatParcelizer) {
                this.d = file;
                this.a = iconCompatParcelizer;
            }

            @Override // o.CreateQueueReservationResponse$$Parcelable
            public final void a() {
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, Data] */
            @Override // o.CreateQueueReservationResponse$$Parcelable
            public final void a(setCategories setcategories, CreateQueueReservationResponse$$Parcelable.IconCompatParcelizer<? super Data> iconCompatParcelizer) {
                try {
                    Data c = this.a.c(this.d);
                    this.c = c;
                    iconCompatParcelizer.a(c);
                } catch (FileNotFoundException e) {
                    if (Log.isLoggable("FileLoader", 3)) {
                        Log.d("FileLoader", "Failed to open file", e);
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
                Data data = this.c;
                if (data != null) {
                    try {
                        this.a.d(data);
                    } catch (IOException e) {
                    }
                }
            }

            @Override // o.CreateQueueReservationResponse$$Parcelable
            public final Class<Data> e() {
                return this.a.b();
            }
        }

        public ValueTxnDataDetail(IconCompatParcelizer<Data> iconCompatParcelizer) {
            this.a = iconCompatParcelizer;
        }

        @Override // o.getAmountKliring
        public final /* bridge */ /* synthetic */ boolean a(File file) {
            return true;
        }

        @Override // o.getAmountKliring
        public final /* synthetic */ getAmountKliring.write c(File file, int i, int i2, CategoryResponse categoryResponse) {
            File file2 = file;
            return new getAmountKliring.write(new getReceiverPhone(file2), new write(file2, this.a));
        }
    }

    private static boolean d(ByteBuffer byteBuffer, File file) {
        boolean z;
        try {
            getLimitMin.d(byteBuffer, file);
            z = true;
        } catch (IOException e) {
            if (Log.isLoggable("ByteBufferEncoder", 3)) {
                Log.d("ByteBufferEncoder", "Failed to write data", e);
            }
            z = false;
        }
        return z;
    }

    @Override // o.setContentOrder
    public final /* synthetic */ boolean c(ByteBuffer byteBuffer, File file, CategoryResponse categoryResponse) {
        return d(byteBuffer, file);
    }
}
