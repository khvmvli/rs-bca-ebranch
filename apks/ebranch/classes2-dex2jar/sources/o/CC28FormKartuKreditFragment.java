package o;

import android.graphics.Bitmap;
import android.net.NetworkInfo;
import android.os.Handler;
import com.squareup.picasso.Downloader;
import java.io.IOException;
import java.io.InputStream;
import o.onChooseNomorRekening;
import o.onChooseTanggalJatuhTempo;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2-dex2jar.jar:o/CC28FormKartuKreditFragment.class */
public final class CC28FormKartuKreditFragment extends onChooseNomorRekening {
    private final onEditWarkatList a;
    private final Downloader c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2-dex2jar.jar:o/CC28FormKartuKreditFragment$IconCompatParcelizer.class */
    public static final class IconCompatParcelizer extends IOException {
        public IconCompatParcelizer(String str) {
            super(str);
        }
    }

    public CC28FormKartuKreditFragment(Downloader downloader, onEditWarkatList oneditwarkatlist) {
        this.c = downloader;
        this.a = oneditwarkatlist;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.onChooseNomorRekening
    public final int a() {
        return 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.onChooseNomorRekening
    public final boolean b() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.onChooseNomorRekening
    public final boolean c(NetworkInfo networkInfo) {
        return networkInfo == null || networkInfo.isConnected();
    }

    @Override // o.onChooseNomorRekening
    public final boolean c(CC9FormKartuKreditFragment_ViewBinding cC9FormKartuKreditFragment_ViewBinding) {
        String scheme = cC9FormKartuKreditFragment_ViewBinding.q.getScheme();
        return "http".equals(scheme) || "https".equals(scheme);
    }

    @Override // o.onChooseNomorRekening
    public final onChooseNomorRekening.IconCompatParcelizer d(CC9FormKartuKreditFragment_ViewBinding cC9FormKartuKreditFragment_ViewBinding) throws IOException {
        Downloader.read c = this.c.c(cC9FormKartuKreditFragment_ViewBinding.q, cC9FormKartuKreditFragment_ViewBinding.h);
        onChooseTanggalJatuhTempo.write write = c.d ? onChooseTanggalJatuhTempo.write.DISK : onChooseTanggalJatuhTempo.write.NETWORK;
        Bitmap bitmap = c.b;
        if (bitmap != null) {
            return new onChooseNomorRekening.IconCompatParcelizer(bitmap, write);
        }
        InputStream inputStream = c.e;
        if (inputStream == null) {
            return null;
        }
        if (write == onChooseTanggalJatuhTempo.write.DISK && c.a == 0) {
            OR1DataPengirimFragment.c(inputStream);
            throw new IconCompatParcelizer("Received response with 0 content-length header.");
        }
        if (write == onChooseTanggalJatuhTempo.write.NETWORK && c.a > 0) {
            onEditWarkatList oneditwarkatlist = this.a;
            long j = c.a;
            Handler handler = oneditwarkatlist.f;
            handler.sendMessage(handler.obtainMessage(4, Long.valueOf(j)));
        }
        return new onChooseNomorRekening.IconCompatParcelizer(inputStream, write);
    }
}
