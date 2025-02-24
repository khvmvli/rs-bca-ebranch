package o;

import android.content.Context;
import android.media.ExifInterface;
import java.io.IOException;
import java.io.InputStream;
import o.onChooseNomorRekening;
import o.onChooseTanggalJatuhTempo;
/* loaded from: classes2-dex2jar.jar:o/showDataKontakDarurat.class */
final class showDataKontakDarurat extends showDataFasilitas {
    /* JADX INFO: Access modifiers changed from: package-private */
    public showDataKontakDarurat(Context context) {
        super(context);
    }

    @Override // o.showDataFasilitas, o.onChooseNomorRekening
    public final boolean c(CC9FormKartuKreditFragment_ViewBinding cC9FormKartuKreditFragment_ViewBinding) {
        return "file".equals(cC9FormKartuKreditFragment_ViewBinding.q.getScheme());
    }

    @Override // o.showDataFasilitas, o.onChooseNomorRekening
    public final onChooseNomorRekening.IconCompatParcelizer d(CC9FormKartuKreditFragment_ViewBinding cC9FormKartuKreditFragment_ViewBinding) throws IOException {
        InputStream openInputStream = this.b.getContentResolver().openInputStream(cC9FormKartuKreditFragment_ViewBinding.q);
        onChooseTanggalJatuhTempo.write write = onChooseTanggalJatuhTempo.write.DISK;
        int attributeInt = new ExifInterface(cC9FormKartuKreditFragment_ViewBinding.q.getPath()).getAttributeInt("Orientation", 1);
        return new onChooseNomorRekening.IconCompatParcelizer(null, openInputStream, write, attributeInt != 3 ? attributeInt != 6 ? attributeInt != 8 ? 0 : 270 : 90 : 180);
    }
}
