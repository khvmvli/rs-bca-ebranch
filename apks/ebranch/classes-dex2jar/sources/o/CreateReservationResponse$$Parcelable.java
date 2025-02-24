package o;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;
import com.bumptech.glide.Glide;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import o.CreateQueueReservationResponse$$Parcelable;
import o.CustDataResponse;
/* loaded from: classes-dex2jar.jar:o/CreateReservationResponse$$Parcelable.class */
public final class CreateReservationResponse$$Parcelable implements CreateQueueReservationResponse$$Parcelable<InputStream> {
    private InputStream a;
    private final CustDataResponse.Account b;
    private final Uri e;

    /* loaded from: classes-dex2jar.jar:o/CreateReservationResponse$$Parcelable$write.class */
    public static final class write implements getPhoneList {
        private static final String[] e = {"_data"};
        private final ContentResolver c;

        public write(ContentResolver contentResolver) {
            this.c = contentResolver;
        }

        @Override // o.getPhoneList
        public final Cursor c(Uri uri) {
            return this.c.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, e, "kind = 1 AND image_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    private CreateReservationResponse$$Parcelable(Uri uri, CustDataResponse.Account account) {
        this.e = uri;
        this.b = account;
    }

    public static CreateReservationResponse$$Parcelable e(Context context, Uri uri, getPhoneList getphonelist) {
        DetailTransactionResponse detailTransactionResponse = Glide.e(context).a;
        List<ImageHeaderParser> e = Glide.e(context).j.c.e();
        if (!e.isEmpty()) {
            return new CreateReservationResponse$$Parcelable(uri, new CustDataResponse.Account(e, getphonelist, detailTransactionResponse, context.getContentResolver()));
        }
        throw new Registry.NoImageHeaderParserException();
    }

    @Override // o.CreateQueueReservationResponse$$Parcelable
    public final void a() {
    }

    @Override // o.CreateQueueReservationResponse$$Parcelable
    public final void a(setCategories setcategories, CreateQueueReservationResponse$$Parcelable.IconCompatParcelizer<? super InputStream> iconCompatParcelizer) {
        try {
            InputStream d = this.b.d(this.e);
            int c = d != null ? this.b.c(this.e) : -1;
            InputStream inputStream = d;
            if (c != -1) {
                inputStream = new setReferenceNumber(d, c);
            }
            this.a = inputStream;
            iconCompatParcelizer.a(inputStream);
        } catch (FileNotFoundException e) {
            if (Log.isLoggable("MediaStoreThumbFetcher", 3)) {
                Log.d("MediaStoreThumbFetcher", "Failed to find thumbnail file", e);
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
        InputStream inputStream = this.a;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e) {
            }
        }
    }

    @Override // o.CreateQueueReservationResponse$$Parcelable
    public final Class<InputStream> e() {
        return InputStream.class;
    }
}
