package o;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.NetworkInfo;
import java.io.IOException;
import java.io.InputStream;
import o.onChooseTanggalJatuhTempo;
/* loaded from: classes2-dex2jar.jar:o/onChooseNomorRekening.class */
public abstract class onChooseNomorRekening {

    /* loaded from: classes2-dex2jar.jar:o/onChooseNomorRekening$IconCompatParcelizer.class */
    public static final class IconCompatParcelizer {
        final onChooseTanggalJatuhTempo.write a;
        final Bitmap b;
        final InputStream c;
        final int d;

        public IconCompatParcelizer(Bitmap bitmap, InputStream inputStream, onChooseTanggalJatuhTempo.write write, int i) {
            boolean z = false;
            if ((inputStream != null ? true : z) ^ (bitmap != null)) {
                this.b = bitmap;
                this.c = inputStream;
                this.a = (onChooseTanggalJatuhTempo.write) OR1DataPengirimFragment.b(write, "loadedFrom == null");
                this.d = i;
                return;
            }
            throw new AssertionError();
        }

        public IconCompatParcelizer(Bitmap bitmap, onChooseTanggalJatuhTempo.write write) {
            this((Bitmap) OR1DataPengirimFragment.b(bitmap, "bitmap == null"), null, write, 0);
        }

        public IconCompatParcelizer(InputStream inputStream, onChooseTanggalJatuhTempo.write write) {
            this(null, (InputStream) OR1DataPengirimFragment.b(inputStream, "stream == null"), write, 0);
        }
    }

    public static void c(int i, int i2, int i3, int i4, BitmapFactory.Options options, CC9FormKartuKreditFragment_ViewBinding cC9FormKartuKreditFragment_ViewBinding) {
        int i5;
        double d;
        if (i4 > i2 || i3 > i) {
            if (i2 == 0) {
                d = Math.floor((double) (((float) i3) / ((float) i)));
            } else if (i == 0) {
                d = Math.floor((double) (((float) i4) / ((float) i2)));
            } else {
                int floor = (int) Math.floor((double) (((float) i4) / ((float) i2)));
                int floor2 = (int) Math.floor((double) (((float) i3) / ((float) i)));
                i5 = cC9FormKartuKreditFragment_ViewBinding.c ? Math.max(floor, floor2) : Math.min(floor, floor2);
            }
            i5 = (int) d;
        } else {
            i5 = 1;
        }
        options.inSampleSize = i5;
        options.inJustDecodeBounds = false;
    }

    public static BitmapFactory.Options e(CC9FormKartuKreditFragment_ViewBinding cC9FormKartuKreditFragment_ViewBinding) {
        BitmapFactory.Options options;
        boolean z = false;
        boolean z2 = (cC9FormKartuKreditFragment_ViewBinding.t == 0 && cC9FormKartuKreditFragment_ViewBinding.f18o == 0) ? false : true;
        if (cC9FormKartuKreditFragment_ViewBinding.b != null) {
            z = true;
        }
        if (z2 || z) {
            BitmapFactory.Options options2 = new BitmapFactory.Options();
            options2.inJustDecodeBounds = z2;
            if (z) {
                options2.inPreferredConfig = cC9FormKartuKreditFragment_ViewBinding.b;
            }
            options = options2;
        } else {
            options = null;
        }
        return options;
    }

    public int a() {
        return 0;
    }

    public boolean b() {
        return false;
    }

    public boolean c(NetworkInfo networkInfo) {
        return false;
    }

    public abstract boolean c(CC9FormKartuKreditFragment_ViewBinding cC9FormKartuKreditFragment_ViewBinding);

    public abstract IconCompatParcelizer d(CC9FormKartuKreditFragment_ViewBinding cC9FormKartuKreditFragment_ViewBinding) throws IOException;
}
