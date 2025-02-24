package o;

import android.content.Context;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.IOException;
import o.onChooseNomorRekening;
import o.onChooseTanggalJatuhTempo;
/* loaded from: classes2-dex2jar.jar:o/showDataFasilitas.class */
class showDataFasilitas extends onChooseNomorRekening {
    final Context b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public showDataFasilitas(Context context) {
        this.b = context;
    }

    @Override // o.onChooseNomorRekening
    public boolean c(CC9FormKartuKreditFragment_ViewBinding cC9FormKartuKreditFragment_ViewBinding) {
        return FirebaseAnalytics.Param.CONTENT.equals(cC9FormKartuKreditFragment_ViewBinding.q.getScheme());
    }

    @Override // o.onChooseNomorRekening
    public onChooseNomorRekening.IconCompatParcelizer d(CC9FormKartuKreditFragment_ViewBinding cC9FormKartuKreditFragment_ViewBinding) throws IOException {
        return new onChooseNomorRekening.IconCompatParcelizer(this.b.getContentResolver().openInputStream(cC9FormKartuKreditFragment_ViewBinding.q), onChooseTanggalJatuhTempo.write.DISK);
    }
}
