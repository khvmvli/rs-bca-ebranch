package o;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import o.getAmountKliring;
/* loaded from: classes-dex2jar.jar:o/setCategoryCode.class */
public final class setCategoryCode<Data> implements getAmountKliring<Uri, Data> {
    private static final Set<String> d = Collections.unmodifiableSet(new HashSet(Arrays.asList("file", "android.resource", "content")));
    private final setCategoryCode$MediaBrowserCompat$CustomActionResultReceiver<Data> c;

    /* loaded from: classes-dex2jar.jar:o/setCategoryCode$RemoteActionCompatParcelizer.class */
    public static final class RemoteActionCompatParcelizer implements GetAcctOpeningCategoryDataResponse<Uri, InputStream>, setCategoryCode$MediaBrowserCompat$CustomActionResultReceiver<InputStream> {
        private final ContentResolver c;

        public RemoteActionCompatParcelizer(ContentResolver contentResolver) {
            this.c = contentResolver;
        }

        @Override // o.setCategoryCode$MediaBrowserCompat$CustomActionResultReceiver
        public final CreateQueueReservationResponse$$Parcelable<InputStream> b(Uri uri) {
            return new setTxnType(this.c, uri);
        }

        @Override // o.GetAcctOpeningCategoryDataResponse
        public final getAmountKliring<Uri, InputStream> e(getListCategory getlistcategory) {
            return new setCategoryCode(this);
        }
    }

    /* loaded from: classes-dex2jar.jar:o/setCategoryCode$read.class */
    public static final class read implements GetAcctOpeningCategoryDataResponse<Uri, ParcelFileDescriptor>, setCategoryCode$MediaBrowserCompat$CustomActionResultReceiver<ParcelFileDescriptor> {
        private final ContentResolver a;

        public read(ContentResolver contentResolver) {
            this.a = contentResolver;
        }

        @Override // o.setCategoryCode$MediaBrowserCompat$CustomActionResultReceiver
        public final CreateQueueReservationResponse$$Parcelable<ParcelFileDescriptor> b(Uri uri) {
            return new setAdditionalInfo(this.a, uri);
        }

        @Override // o.GetAcctOpeningCategoryDataResponse
        public final getAmountKliring<Uri, ParcelFileDescriptor> e(getListCategory getlistcategory) {
            return new setCategoryCode(this);
        }
    }

    /* loaded from: classes-dex2jar.jar:o/setCategoryCode$write.class */
    public static final class write implements GetAcctOpeningCategoryDataResponse<Uri, AssetFileDescriptor>, setCategoryCode$MediaBrowserCompat$CustomActionResultReceiver<AssetFileDescriptor> {
        private final ContentResolver d;

        public write(ContentResolver contentResolver) {
            this.d = contentResolver;
        }

        @Override // o.setCategoryCode$MediaBrowserCompat$CustomActionResultReceiver
        public final CreateQueueReservationResponse$$Parcelable<AssetFileDescriptor> b(Uri uri) {
            return new getReferenceNumber(this.d, uri);
        }

        @Override // o.GetAcctOpeningCategoryDataResponse
        public final getAmountKliring<Uri, AssetFileDescriptor> e(getListCategory getlistcategory) {
            return new setCategoryCode(this);
        }
    }

    public setCategoryCode(setCategoryCode$MediaBrowserCompat$CustomActionResultReceiver<Data> setcategorycode_mediabrowsercompat_customactionresultreceiver) {
        this.c = setcategorycode_mediabrowsercompat_customactionresultreceiver;
    }

    @Override // o.getAmountKliring
    public final /* synthetic */ boolean a(Uri uri) {
        return d.contains(uri.getScheme());
    }

    @Override // o.getAmountKliring
    public final /* synthetic */ getAmountKliring.write c(Uri uri, int i, int i2, CategoryResponse categoryResponse) {
        Uri uri2 = uri;
        return new getAmountKliring.write(new getReceiverPhone(uri2), this.c.b(uri2));
    }
}
