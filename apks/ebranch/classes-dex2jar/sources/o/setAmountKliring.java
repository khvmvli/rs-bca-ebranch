package o;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;
import o.CreateQueueReservationResponse$$Parcelable;
import o.getAmountKliring;
/* loaded from: classes-dex2jar.jar:o/setAmountKliring.class */
public final class setAmountKliring implements getAmountKliring<Uri, File> {
    private final Context a;

    /* loaded from: classes-dex2jar.jar:o/setAmountKliring$write.class */
    public static final class write implements GetAcctOpeningCategoryDataResponse<Uri, File> {
        private final Context a;

        public write(Context context) {
            this.a = context;
        }

        @Override // o.GetAcctOpeningCategoryDataResponse
        public final getAmountKliring<Uri, File> e(getListCategory getlistcategory) {
            return new setAmountKliring(this.a);
        }
    }

    public setAmountKliring(Context context) {
        this.a = context;
    }

    @Override // o.getAmountKliring
    public final /* bridge */ /* synthetic */ boolean a(Uri uri) {
        return CustDataResponse.a(uri);
    }

    @Override // o.getAmountKliring
    public final /* synthetic */ getAmountKliring.write<File> c(Uri uri, int i, int i2, CategoryResponse categoryResponse) {
        Uri uri2 = uri;
        return new getAmountKliring.write<>(new getReceiverPhone(uri2), new CreateQueueReservationResponse$$Parcelable<File>(this.a, uri2) { // from class: o.setAmountKliring$MediaBrowserCompat$CustomActionResultReceiver
            private static final String[] e = {"_data"};
            private final Context a;
            private final Uri d;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.a = r4;
                this.d = r5;
            }

            @Override // o.CreateQueueReservationResponse$$Parcelable
            public final void a() {
            }

            @Override // o.CreateQueueReservationResponse$$Parcelable
            public final void a(setCategories setcategories, CreateQueueReservationResponse$$Parcelable.IconCompatParcelizer<? super File> iconCompatParcelizer) {
                Cursor query = this.a.getContentResolver().query(this.d, e, null, null, null);
                String str = null;
                str = null;
                if (query != null) {
                    try {
                        if (query.moveToFirst()) {
                            str = query.getString(query.getColumnIndexOrThrow("_data"));
                        }
                    } finally {
                        query.close();
                    }
                }
                if (TextUtils.isEmpty(str)) {
                    StringBuilder sb = new StringBuilder("Failed to find file path for: ");
                    sb.append(this.d);
                    iconCompatParcelizer.b(new FileNotFoundException(sb.toString()));
                    return;
                }
                iconCompatParcelizer.a(new File(str));
            }

            @Override // o.CreateQueueReservationResponse$$Parcelable
            public final setNextCategoryCd b() {
                return setNextCategoryCd.LOCAL;
            }

            @Override // o.CreateQueueReservationResponse$$Parcelable
            public final void c() {
            }

            @Override // o.CreateQueueReservationResponse$$Parcelable
            public final Class<File> e() {
                return File.class;
            }
        });
    }
}
