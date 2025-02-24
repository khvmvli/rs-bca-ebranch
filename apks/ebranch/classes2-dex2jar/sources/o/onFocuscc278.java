package o;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.IOException;
import o.onChooseNomorRekening;
import o.onChooseTanggalJatuhTempo;
/* loaded from: classes2-dex2jar.jar:o/onFocuscc278.class */
final class onFocuscc278 extends onChooseNomorRekening {
    private static final int b = 22;
    private final AssetManager c;

    public onFocuscc278(Context context) {
        this.c = context.getAssets();
    }

    @Override // o.onChooseNomorRekening
    public final boolean c(CC9FormKartuKreditFragment_ViewBinding cC9FormKartuKreditFragment_ViewBinding) {
        Uri uri = cC9FormKartuKreditFragment_ViewBinding.q;
        boolean z = false;
        if ("file".equals(uri.getScheme())) {
            z = false;
            if (!uri.getPathSegments().isEmpty()) {
                z = false;
                if ("android_asset".equals(uri.getPathSegments().get(0))) {
                    z = true;
                }
            }
        }
        return z;
    }

    @Override // o.onChooseNomorRekening
    public final onChooseNomorRekening.IconCompatParcelizer d(CC9FormKartuKreditFragment_ViewBinding cC9FormKartuKreditFragment_ViewBinding) throws IOException {
        return new onChooseNomorRekening.IconCompatParcelizer(this.c.open(cC9FormKartuKreditFragment_ViewBinding.q.toString().substring(b)), onChooseTanggalJatuhTempo.write.DISK);
    }
}
