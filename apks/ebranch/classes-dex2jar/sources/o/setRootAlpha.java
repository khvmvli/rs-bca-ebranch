package o;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Locale;
import o.VersionedParcel$ParcelException;
/* loaded from: classes-dex2jar.jar:o/setRootAlpha.class */
final class setRootAlpha extends VersionedParcel$ParcelException.write {
    VersionedParcel$ParcelException.MediaDescriptionCompat a;
    private final LinearLayoutManager d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public setRootAlpha(LinearLayoutManager linearLayoutManager) {
        this.d = linearLayoutManager;
    }

    @Override // o.VersionedParcel$ParcelException.write
    public final void a(int i) {
    }

    @Override // o.VersionedParcel$ParcelException.write
    public final void b(int i, float f, int i2) {
        if (this.a != null) {
            for (int i3 = 0; i3 < this.d.m(); i3++) {
                View h = this.d.h(i3);
                if (h != null) {
                    LinearLayoutManager.f(h);
                } else {
                    throw new IllegalStateException(String.format(Locale.US, "LayoutManager returned a null child at pos %d/%d while transforming pages", Integer.valueOf(i3), Integer.valueOf(this.d.m())));
                }
            }
        }
    }

    @Override // o.VersionedParcel$ParcelException.write
    public final void e(int i) {
    }
}
