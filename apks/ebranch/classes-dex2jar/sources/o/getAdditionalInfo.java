package o;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import java.io.FileNotFoundException;
import java.io.IOException;
import o.CreateQueueReservationResponse$$Parcelable;
/* loaded from: classes-dex2jar.jar:o/getAdditionalInfo.class */
public abstract class getAdditionalInfo<T> implements CreateQueueReservationResponse$$Parcelable<T> {
    private T a;
    private final Uri b;
    private final ContentResolver c;

    public getAdditionalInfo(ContentResolver contentResolver, Uri uri) {
        this.c = contentResolver;
        this.b = uri;
    }

    protected abstract T a(Uri uri, ContentResolver contentResolver) throws FileNotFoundException;

    @Override // o.CreateQueueReservationResponse$$Parcelable
    public final void a() {
    }

    @Override // o.CreateQueueReservationResponse$$Parcelable
    public final void a(setCategories setcategories, CreateQueueReservationResponse$$Parcelable.IconCompatParcelizer<? super T> iconCompatParcelizer) {
        try {
            T a = a(this.b, this.c);
            this.a = a;
            iconCompatParcelizer.a(a);
        } catch (FileNotFoundException e) {
            if (Log.isLoggable("LocalUriFetcher", 3)) {
                Log.d("LocalUriFetcher", "Failed to open Uri", e);
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
        T t = this.a;
        if (t != null) {
            try {
                e(t);
            } catch (IOException e) {
            }
        }
    }

    protected abstract void e(T t) throws IOException;
}
