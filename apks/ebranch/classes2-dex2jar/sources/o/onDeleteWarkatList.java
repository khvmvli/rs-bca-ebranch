package o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.IOException;
import o.onChooseNomorRekening;
import o.onChooseTanggalJatuhTempo;
/* loaded from: classes2-dex2jar.jar:o/onDeleteWarkatList.class */
final class onDeleteWarkatList extends onChooseNomorRekening {
    private final Context e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public onDeleteWarkatList(Context context) {
        this.e = context;
    }

    private static Bitmap c(Resources resources, int i, CC9FormKartuKreditFragment_ViewBinding cC9FormKartuKreditFragment_ViewBinding) {
        BitmapFactory.Options e = e(cC9FormKartuKreditFragment_ViewBinding);
        if (e != null && e.inJustDecodeBounds) {
            BitmapFactory.decodeResource(resources, i, e);
            onChooseNomorRekening.c(cC9FormKartuKreditFragment_ViewBinding.t, cC9FormKartuKreditFragment_ViewBinding.f18o, e.outWidth, e.outHeight, e, cC9FormKartuKreditFragment_ViewBinding);
        }
        return BitmapFactory.decodeResource(resources, i, e);
    }

    @Override // o.onChooseNomorRekening
    public final boolean c(CC9FormKartuKreditFragment_ViewBinding cC9FormKartuKreditFragment_ViewBinding) {
        if (cC9FormKartuKreditFragment_ViewBinding.j != 0) {
            return true;
        }
        return "android.resource".equals(cC9FormKartuKreditFragment_ViewBinding.q.getScheme());
    }

    @Override // o.onChooseNomorRekening
    public final onChooseNomorRekening.IconCompatParcelizer d(CC9FormKartuKreditFragment_ViewBinding cC9FormKartuKreditFragment_ViewBinding) throws IOException {
        Resources a = OR1DataPengirimFragment.a(this.e, cC9FormKartuKreditFragment_ViewBinding);
        return new onChooseNomorRekening.IconCompatParcelizer(c(a, OR1DataPengirimFragment.d(a, cC9FormKartuKreditFragment_ViewBinding), cC9FormKartuKreditFragment_ViewBinding), onChooseTanggalJatuhTempo.write.DISK);
    }
}
