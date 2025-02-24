package o;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import o.CreateQueueReservationResponse$$Parcelable;
import o.getAmountKliring;
/* loaded from: classes-dex2jar.jar:o/setContentName.class */
public final class setContentName<DataT> implements getAmountKliring<Uri, DataT> {
    private final getAmountKliring<Uri, DataT> a;
    private final getAmountKliring<File, DataT> b;
    private final Context c;
    private final Class<DataT> d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/setContentName$IconCompatParcelizer.class */
    public static abstract class IconCompatParcelizer<DataT> implements GetAcctOpeningCategoryDataResponse<Uri, DataT> {
        private final Class<DataT> d;
        private final Context e;

        public IconCompatParcelizer(Context context, Class<DataT> cls) {
            this.e = context;
            this.d = cls;
        }

        @Override // o.GetAcctOpeningCategoryDataResponse
        public final getAmountKliring<Uri, DataT> e(getListCategory getlistcategory) {
            return new setContentName(this.e, getlistcategory.b(File.class, this.d), getlistcategory.b(Uri.class, this.d), this.d);
        }
    }

    /* loaded from: classes-dex2jar.jar:o/setContentName$RemoteActionCompatParcelizer.class */
    public static final class RemoteActionCompatParcelizer extends IconCompatParcelizer<InputStream> {
        public RemoteActionCompatParcelizer(Context context) {
            super(context, InputStream.class);
        }
    }

    /* loaded from: classes-dex2jar.jar:o/setContentName$read.class */
    static final class read<DataT> implements CreateQueueReservationResponse$$Parcelable<DataT> {
        private static final String[] d = {"_data"};
        private volatile CreateQueueReservationResponse$$Parcelable<DataT> a;
        private final Class<DataT> b;
        private final getAmountKliring<File, DataT> c;
        private final Context e;
        private final Uri f;
        private final int g;
        private final getAmountKliring<Uri, DataT> h;
        private volatile boolean i;
        private final CategoryResponse j;
        private final int l;

        read(Context context, getAmountKliring<File, DataT> getamountkliring, getAmountKliring<Uri, DataT> getamountkliring2, Uri uri, int i, int i2, CategoryResponse categoryResponse, Class<DataT> cls) {
            this.e = context.getApplicationContext();
            this.c = getamountkliring;
            this.h = getamountkliring2;
            this.f = uri;
            this.l = i;
            this.g = i2;
            this.j = categoryResponse;
            this.b = cls;
        }

        private File c(Uri uri) throws FileNotFoundException {
            Cursor cursor = null;
            try {
                Cursor query = this.e.getContentResolver().query(uri, d, null, null, null);
                if (query == null || !query.moveToFirst()) {
                    StringBuilder sb = new StringBuilder("Failed to media store entry for: ");
                    sb.append(uri);
                    throw new FileNotFoundException(sb.toString());
                }
                String string = query.getString(query.getColumnIndexOrThrow("_data"));
                if (!TextUtils.isEmpty(string)) {
                    File file = new File(string);
                    if (query != null) {
                        query.close();
                    }
                    return file;
                }
                StringBuilder sb2 = new StringBuilder("File path was empty in media store for: ");
                sb2.append(uri);
                throw new FileNotFoundException(sb2.toString());
            } catch (Throwable th) {
                if (0 != 0) {
                    cursor.close();
                }
                throw th;
            }
        }

        @Override // o.CreateQueueReservationResponse$$Parcelable
        public final void a() {
            this.i = true;
            CreateQueueReservationResponse$$Parcelable<DataT> createQueueReservationResponse$$Parcelable = this.a;
            if (createQueueReservationResponse$$Parcelable != null) {
                createQueueReservationResponse$$Parcelable.a();
            }
        }

        @Override // o.CreateQueueReservationResponse$$Parcelable
        public final void a(setCategories setcategories, CreateQueueReservationResponse$$Parcelable.IconCompatParcelizer<? super DataT> iconCompatParcelizer) {
            getAmountKliring.write<DataT> write;
            try {
                if (Environment.isExternalStorageLegacy()) {
                    write = this.c.c(c(this.f), this.l, this.g, this.j);
                } else {
                    write = this.h.c(this.e.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0 ? MediaStore.setRequireOriginal(this.f) : this.f, this.l, this.g, this.j);
                }
                CreateQueueReservationResponse$$Parcelable<DataT> createQueueReservationResponse$$Parcelable = write != null ? write.a : null;
                if (createQueueReservationResponse$$Parcelable == null) {
                    StringBuilder sb = new StringBuilder("Failed to build fetcher for: ");
                    sb.append(this.f);
                    iconCompatParcelizer.b(new IllegalArgumentException(sb.toString()));
                    return;
                }
                this.a = createQueueReservationResponse$$Parcelable;
                if (this.i) {
                    a();
                } else {
                    createQueueReservationResponse$$Parcelable.a(setcategories, iconCompatParcelizer);
                }
            } catch (FileNotFoundException e) {
                iconCompatParcelizer.b(e);
            }
        }

        @Override // o.CreateQueueReservationResponse$$Parcelable
        public final setNextCategoryCd b() {
            return setNextCategoryCd.LOCAL;
        }

        @Override // o.CreateQueueReservationResponse$$Parcelable
        public final void c() {
            CreateQueueReservationResponse$$Parcelable<DataT> createQueueReservationResponse$$Parcelable = this.a;
            if (createQueueReservationResponse$$Parcelable != null) {
                createQueueReservationResponse$$Parcelable.c();
            }
        }

        @Override // o.CreateQueueReservationResponse$$Parcelable
        public final Class<DataT> e() {
            return this.b;
        }
    }

    setContentName(Context context, getAmountKliring<File, DataT> getamountkliring, getAmountKliring<Uri, DataT> getamountkliring2, Class<DataT> cls) {
        this.c = context.getApplicationContext();
        this.b = getamountkliring;
        this.a = getamountkliring2;
        this.d = cls;
    }

    @Override // o.getAmountKliring
    public final /* bridge */ /* synthetic */ boolean a(Uri uri) {
        return Build.VERSION.SDK_INT >= 29 && CustDataResponse.a(uri);
    }

    @Override // o.getAmountKliring
    public final /* synthetic */ getAmountKliring.write c(Uri uri, int i, int i2, CategoryResponse categoryResponse) {
        Uri uri2 = uri;
        return new getAmountKliring.write(new getReceiverPhone(uri2), new read(this.c, this.b, this.a, uri2, i, i2, categoryResponse, this.d));
    }
}
