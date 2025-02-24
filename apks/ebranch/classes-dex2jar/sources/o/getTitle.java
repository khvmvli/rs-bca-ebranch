package o;

import android.content.res.AssetManager;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.InputStream;
import o.getAmountKliring;
/* loaded from: classes-dex2jar.jar:o/getTitle.class */
public final class getTitle<Data> implements getAmountKliring<Uri, Data> {
    private static final int b = 22;
    private final RemoteActionCompatParcelizer<Data> a;
    private final AssetManager e;

    /* loaded from: classes-dex2jar.jar:o/getTitle$IconCompatParcelizer.class */
    public static final class IconCompatParcelizer implements GetAcctOpeningCategoryDataResponse<Uri, InputStream>, RemoteActionCompatParcelizer<InputStream> {
        private final AssetManager c;

        public IconCompatParcelizer(AssetManager assetManager) {
            this.c = assetManager;
        }

        @Override // o.getTitle.RemoteActionCompatParcelizer
        public final CreateQueueReservationResponse$$Parcelable<InputStream> c(AssetManager assetManager, String str) {
            return new getAccountList(assetManager, str);
        }

        @Override // o.GetAcctOpeningCategoryDataResponse
        public final getAmountKliring<Uri, InputStream> e(getListCategory getlistcategory) {
            return new getTitle(this.c, this);
        }
    }

    /* loaded from: classes-dex2jar.jar:o/getTitle$RemoteActionCompatParcelizer.class */
    public interface RemoteActionCompatParcelizer<Data> {
        CreateQueueReservationResponse$$Parcelable<Data> c(AssetManager assetManager, String str);
    }

    /* loaded from: classes-dex2jar.jar:o/getTitle$read.class */
    public static final class read implements GetAcctOpeningCategoryDataResponse<Uri, ParcelFileDescriptor>, RemoteActionCompatParcelizer<ParcelFileDescriptor> {
        private final AssetManager a;

        public read(AssetManager assetManager) {
            this.a = assetManager;
        }

        @Override // o.getTitle.RemoteActionCompatParcelizer
        public final CreateQueueReservationResponse$$Parcelable<ParcelFileDescriptor> c(AssetManager assetManager, String str) {
            return new getTxnStatus(assetManager, str);
        }

        @Override // o.GetAcctOpeningCategoryDataResponse
        public final getAmountKliring<Uri, ParcelFileDescriptor> e(getListCategory getlistcategory) {
            return new getTitle(this.a, this);
        }
    }

    public getTitle(AssetManager assetManager, RemoteActionCompatParcelizer<Data> remoteActionCompatParcelizer) {
        this.e = assetManager;
        this.a = remoteActionCompatParcelizer;
    }

    @Override // o.getAmountKliring
    public final /* synthetic */ boolean a(Uri uri) {
        Uri uri2 = uri;
        boolean z = false;
        if ("file".equals(uri2.getScheme())) {
            z = false;
            if (!uri2.getPathSegments().isEmpty()) {
                z = false;
                if ("android_asset".equals(uri2.getPathSegments().get(0))) {
                    z = true;
                }
            }
        }
        return z;
    }

    @Override // o.getAmountKliring
    public final /* synthetic */ getAmountKliring.write c(Uri uri, int i, int i2, CategoryResponse categoryResponse) {
        Uri uri2 = uri;
        return new getAmountKliring.write(new getReceiverPhone(uri2), this.a.c(this.e, uri2.toString().substring(b)));
    }
}
