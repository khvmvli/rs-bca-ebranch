package o;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.provider.MediaStore;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.realm.RealmFieldTypeConstants;
import java.io.IOException;
import o.onChooseNomorRekening;
import o.onChooseTanggalJatuhTempo;
/* loaded from: classes2-dex2jar.jar:o/subscribeSexEvent.class */
final class subscribeSexEvent extends showDataFasilitas {
    private static final String[] a = {"orientation"};

    /* loaded from: classes2-dex2jar.jar:o/subscribeSexEvent$write.class */
    enum write {
        MICRO(3, 96, 96),
        MINI(1, RealmFieldTypeConstants.DICTIONARY_OFFSET, 384),
        FULL(2, -1, -1);
        
        final int b;
        final int d;
        final int h;

        write(int i, int i2, int i3) {
            this.b = i;
            this.h = i2;
            this.d = i3;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public subscribeSexEvent(Context context) {
        super(context);
    }

    private static int d(ContentResolver contentResolver, Uri uri) {
        Cursor cursor = null;
        Cursor cursor2 = null;
        try {
            Cursor query = contentResolver.query(uri, a, null, null, null);
            if (query != null && query.moveToFirst()) {
                cursor2 = query;
                cursor = query;
                int i = query.getInt(0);
                if (query != null) {
                    query.close();
                }
                return i;
            }
            if (query == null) {
                return 0;
            }
            query.close();
            return 0;
        } catch (RuntimeException e) {
            if (cursor2 == null) {
                return 0;
            }
            cursor2.close();
            return 0;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    @Override // o.showDataFasilitas, o.onChooseNomorRekening
    public final boolean c(CC9FormKartuKreditFragment_ViewBinding cC9FormKartuKreditFragment_ViewBinding) {
        Uri uri = cC9FormKartuKreditFragment_ViewBinding.q;
        return FirebaseAnalytics.Param.CONTENT.equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    @Override // o.showDataFasilitas, o.onChooseNomorRekening
    public final onChooseNomorRekening.IconCompatParcelizer d(CC9FormKartuKreditFragment_ViewBinding cC9FormKartuKreditFragment_ViewBinding) throws IOException {
        Bitmap bitmap;
        ContentResolver contentResolver = this.b.getContentResolver();
        int d = d(contentResolver, cC9FormKartuKreditFragment_ViewBinding.q);
        String type = contentResolver.getType(cC9FormKartuKreditFragment_ViewBinding.q);
        boolean z = false;
        boolean z2 = type != null && type.startsWith("video/");
        if (!(cC9FormKartuKreditFragment_ViewBinding.t == 0 && cC9FormKartuKreditFragment_ViewBinding.f18o == 0)) {
            z = true;
        }
        if (z) {
            int i = cC9FormKartuKreditFragment_ViewBinding.t;
            int i2 = cC9FormKartuKreditFragment_ViewBinding.f18o;
            write write2 = (i > write.MICRO.h || i2 > write.MICRO.d) ? (i > write.MINI.h || i2 > write.MINI.d) ? write.FULL : write.MINI : write.MICRO;
            if (!z2 && write2 == write.FULL) {
                return new onChooseNomorRekening.IconCompatParcelizer(null, this.b.getContentResolver().openInputStream(cC9FormKartuKreditFragment_ViewBinding.q), onChooseTanggalJatuhTempo.write.DISK, d);
            }
            long parseId = ContentUris.parseId(cC9FormKartuKreditFragment_ViewBinding.q);
            BitmapFactory.Options e = e(cC9FormKartuKreditFragment_ViewBinding);
            e.inJustDecodeBounds = true;
            c(cC9FormKartuKreditFragment_ViewBinding.t, cC9FormKartuKreditFragment_ViewBinding.f18o, write2.h, write2.d, e, cC9FormKartuKreditFragment_ViewBinding);
            if (z2) {
                bitmap = MediaStore.Video.Thumbnails.getThumbnail(contentResolver, parseId, write2 == write.FULL ? 1 : write2.b, e);
            } else {
                bitmap = MediaStore.Images.Thumbnails.getThumbnail(contentResolver, parseId, write2.b, e);
            }
            if (bitmap != null) {
                return new onChooseNomorRekening.IconCompatParcelizer(bitmap, null, onChooseTanggalJatuhTempo.write.DISK, d);
            }
        }
        return new onChooseNomorRekening.IconCompatParcelizer(null, this.b.getContentResolver().openInputStream(cC9FormKartuKreditFragment_ViewBinding.q), onChooseTanggalJatuhTempo.write.DISK, d);
    }
}
