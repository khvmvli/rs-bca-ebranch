package o;

import android.content.res.AssetManager;
import android.util.Log;
import java.io.IOException;
import o.CreateQueueReservationResponse$$Parcelable;
/* loaded from: classes-dex2jar.jar:o/CreateQueueReservationResponse.class */
public abstract class CreateQueueReservationResponse<T> implements CreateQueueReservationResponse$$Parcelable<T> {
    private final String c;
    private final AssetManager d;
    private T e;

    public CreateQueueReservationResponse(AssetManager assetManager, String str) {
        this.d = assetManager;
        this.c = str;
    }

    @Override // o.CreateQueueReservationResponse$$Parcelable
    public final void a() {
    }

    @Override // o.CreateQueueReservationResponse$$Parcelable
    public final void a(setCategories setcategories, CreateQueueReservationResponse$$Parcelable.IconCompatParcelizer<? super T> iconCompatParcelizer) {
        try {
            T d = d(this.d, this.c);
            this.e = d;
            iconCompatParcelizer.a(d);
        } catch (IOException e) {
            if (Log.isLoggable("AssetPathFetcher", 3)) {
                Log.d("AssetPathFetcher", "Failed to load data from asset manager", e);
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
        T t = this.e;
        if (t != null) {
            try {
                c(t);
            } catch (IOException e) {
            }
        }
    }

    protected abstract void c(T t) throws IOException;

    protected abstract T d(AssetManager assetManager, String str) throws IOException;
}
