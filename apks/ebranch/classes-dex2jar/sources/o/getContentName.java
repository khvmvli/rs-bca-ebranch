package o;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import java.io.InputStream;
import o.getAmountKliring;
/* loaded from: classes-dex2jar.jar:o/getContentName.class */
public final class getContentName implements getAmountKliring<Uri, InputStream> {
    private final Context e;

    /* loaded from: classes-dex2jar.jar:o/getContentName$write.class */
    public static final class write implements GetAcctOpeningCategoryDataResponse<Uri, InputStream> {
        private final Context d;

        public write(Context context) {
            this.d = context;
        }

        @Override // o.GetAcctOpeningCategoryDataResponse
        public final getAmountKliring<Uri, InputStream> e(getListCategory getlistcategory) {
            return new getContentName(this.d);
        }
    }

    public getContentName(Context context) {
        this.e = context.getApplicationContext();
    }

    @Override // o.getAmountKliring
    public final /* synthetic */ boolean a(Uri uri) {
        Uri uri2 = uri;
        return CustDataResponse.a(uri2) && uri2.getPathSegments().contains("video");
    }

    @Override // o.getAmountKliring
    public final /* synthetic */ getAmountKliring.write<InputStream> c(Uri uri, int i, int i2, CategoryResponse categoryResponse) {
        Uri uri2 = uri;
        if (!CustDataResponse.a(i, i2)) {
            return null;
        }
        getCode<Long> getcode = getEmergencyCloseEndDate.d;
        Long l = (Long) (categoryResponse.c.containsKey(getcode) ? categoryResponse.c.get(getcode) : getcode.a);
        if (!(l != null && l.longValue() == -1)) {
            return null;
        }
        getReceiverPhone getreceiverphone = new getReceiverPhone(uri2);
        Context context = this.e;
        return new getAmountKliring.write<>(getreceiverphone, CreateReservationResponse$$Parcelable.e(context, uri2, new getPhoneList(context.getContentResolver()) { // from class: o.CreateReservationResponse$$Parcelable$MediaBrowserCompat$CustomActionResultReceiver
            private static final String[] d = {"_data"};
            private final ContentResolver b;

            {
                this.b = r4;
            }

            @Override // o.getPhoneList
            public final Cursor c(Uri uri3) {
                return this.b.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, d, "kind = 1 AND video_id = ?", new String[]{uri3.getLastPathSegment()}, null);
            }
        }));
    }
}
