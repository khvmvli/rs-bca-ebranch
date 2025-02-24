package o;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import io.realm.internal.Property;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
/* loaded from: classes-dex2jar.jar:o/isChecked.class */
public final class isChecked {
    private static int[] c = {795478023, 2123890692, -1152885460, 544349236, 79825554, 77042182, -2074611080, -53344899, 1389181714, 1331595545, -1031942354, -510272072, 1873441898, -518130589, 2111307285, -601204838, 282934, 706391162};
    private static int d = 1;
    private static int e;

    /* loaded from: classes-dex2jar.jar:o/isChecked$IconCompatParcelizer.class */
    public static final class IconCompatParcelizer {
        private static int a = 0;
        public static final char[] b;
        public static final String d;
        public static final String e;
        private static int c = 0;
        private static int h = (c + 7) % Property.TYPE_ARRAY;

        static {
            c();
            Object[] objArr = new Object[1];
            e(false, 13 - Process.getGidForName(""), new char[]{65518, 19, '\t', 65534, 65526, 24, 65526, 65535, 20, 65514, '\n', 21, 65529, 65496, 11, '\"', 65530, 65524, '\f', 65535, 28, 65534, 65529, 21, 65525, 65496, 65525, 18, 65513, ' ', 65526, 0, 65526, 65497, 65531, 65499, 65525, '\"', 11, '\"', 65534, 20, 65532, 65516, 65530, 27, 65534, 0, 65525, '\"', '\n', 21, 65518, 29, 65534, 65519, 19, 65496, 11, 65496}, 221 - View.MeasureSpec.getMode(0), ExpandableListView.getPackedPositionType(0) + 60, objArr);
            d = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            e(false, 61 - TextUtils.getCapsMode("", 0, 0), new char[]{65521, 65524, 65519, 65517, 65519, 31, 65520, 65522, ' ', 65519, 65518, 65517, 65523, 31, 65523, 65516, 30, ' ', 65522, ' ', ' ', 31, 31, 65519, 65521, 65518, 65521, 65519, 30, 28, 65524, 65522, 65518, 65524, 65521, 65522, 65523, 28, 65521, 65515, 65522, 65519, 29, 29, 31, 28, '!', 28, 65524, 29, 65518, 65516, 65517, 65519, 65517, 65518, 65515, 31, 29, 31, 65515, 65519, 30, 65515}, 202 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (ViewConfiguration.getTouchSlop() >> 8) + 64, objArr2);
            e = ((String) objArr2[0]).intern();
            Object[] objArr3 = new Object[1];
            e(true, 2 - (ViewConfiguration.getTapTimeout() >> 16), new char[]{65515, 65514, ' ', 31, 30, 29, 28, 27, 65523, 65522, 65521, 65520, 65519, 65518, 65517, 65516}, 204 - (SystemClock.elapsedRealtime() > 0 ? 1 : (SystemClock.elapsedRealtime() == 0 ? 0 : -1)), 16 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr3);
            b = ((String) objArr3[0]).intern().toCharArray();
        }

        static void c() {
            a = 133;
        }

        private static void e(boolean z, int i, char[] cArr, int i2, int i3, Object[] objArr) {
            String str;
            synchronized (CC23AFormKartuKreditFragment_ViewBinding.e) {
                char[] cArr2 = new char[i3];
                CC23AFormKartuKreditFragment_ViewBinding.c = 0;
                while (CC23AFormKartuKreditFragment_ViewBinding.c < i3) {
                    CC23AFormKartuKreditFragment_ViewBinding.a = cArr[CC23AFormKartuKreditFragment_ViewBinding.c];
                    cArr2[CC23AFormKartuKreditFragment_ViewBinding.c] = (char) ((char) (CC23AFormKartuKreditFragment_ViewBinding.a + i2));
                    int i4 = CC23AFormKartuKreditFragment_ViewBinding.c;
                    cArr2[i4] = (char) ((char) (cArr2[i4] - a));
                    CC23AFormKartuKreditFragment_ViewBinding.c++;
                }
                if (i > 0) {
                    CC23AFormKartuKreditFragment_ViewBinding.b = i;
                    char[] cArr3 = new char[i3];
                    System.arraycopy(cArr2, 0, cArr3, 0, i3);
                    System.arraycopy(cArr3, 0, cArr2, i3 - CC23AFormKartuKreditFragment_ViewBinding.b, CC23AFormKartuKreditFragment_ViewBinding.b);
                    System.arraycopy(cArr3, CC23AFormKartuKreditFragment_ViewBinding.b, cArr2, 0, i3 - CC23AFormKartuKreditFragment_ViewBinding.b);
                }
                char[] cArr4 = cArr2;
                if (z) {
                    cArr4 = new char[i3];
                    CC23AFormKartuKreditFragment_ViewBinding.c = 0;
                    while (CC23AFormKartuKreditFragment_ViewBinding.c < i3) {
                        cArr4[CC23AFormKartuKreditFragment_ViewBinding.c] = (char) cArr2[(i3 - CC23AFormKartuKreditFragment_ViewBinding.c) - 1];
                        CC23AFormKartuKreditFragment_ViewBinding.c++;
                    }
                }
                str = new String(cArr4);
            }
            objArr[0] = str;
        }
    }

    public static String a(String str) {
        String str2;
        try {
            Object[] objArr = new Object[1];
            e(new int[]{584099051, -1825187425, 739883328, 1877422164, -2016785215, 553185632}, 10 - Color.green(0), objArr);
            Mac instance = Mac.getInstance(((String) objArr[0]).intern());
            Object[] objArr2 = new Object[1];
            e(new int[]{1954892759, 988328913, -402442085, 110413224, 1401306150, -2083588941, -1546931221, 883835316, -1159588960, -1015075630, -1408254683, 1085938870, -297704489, 2105207246, 1311149699, -1452500589, 1561565679, -8487355, -1501761490, -1482144259, 1242443022, -1591072184, -2068199800, 707512256, -2000398588, -1356775607, 675834749, 748154710, -1406903257, 356294096}, 60 - (ViewConfiguration.getPressedStateDuration() >> 16), objArr2);
            byte[] bytes = ((String) objArr2[0]).intern().getBytes();
            Object[] objArr3 = new Object[1];
            e(new int[]{584099051, -1825187425, 739883328, 1877422164, -2016785215, 553185632}, 10 - View.getDefaultSize(0, 0), objArr3);
            instance.init(new SecretKeySpec(bytes, ((String) objArr3[0]).intern()));
            str2 = e(instance.doFinal(str.getBytes()));
            e = (d + 97) % Property.TYPE_ARRAY;
        } catch (Exception e2) {
            str2 = "";
        }
        return str2;
    }

    private static String e(byte[] bArr) {
        boolean z = true;
        char[] cArr = new char[bArr.length << 1];
        int i = 0;
        while (true) {
            if (!(i < bArr.length)) {
                break;
            }
            try {
                try {
                    e = (d + 1) % Property.TYPE_ARRAY;
                    int i2 = bArr[i] & 255;
                    int i3 = i << 1;
                    cArr[i3] = (char) IconCompatParcelizer.b[i2 >>> 4];
                    cArr[i3 + 1] = (char) IconCompatParcelizer.b[i2 & 15];
                    i++;
                } catch (Exception e2) {
                    throw e2;
                }
            } catch (Exception e3) {
                throw e3;
            }
            throw e2;
        }
        String str = new String(cArr);
        int i4 = e + 81;
        d = i4 % Property.TYPE_ARRAY;
        if (i4 % 2 != 0) {
            z = false;
        }
        if (!z) {
            return str;
        }
        throw new NullPointerException();
    }

    private static void e(int[] iArr, int i, Object[] objArr) {
        String str;
        synchronized (CC23BFormKartuKreditFragment.c) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) c.clone();
            CC23BFormKartuKreditFragment.e = 0;
            while (CC23BFormKartuKreditFragment.e < iArr.length) {
                cArr[0] = (char) ((char) (iArr[CC23BFormKartuKreditFragment.e] >> 16));
                cArr[1] = (char) ((char) iArr[CC23BFormKartuKreditFragment.e]);
                cArr[2] = (char) ((char) (iArr[CC23BFormKartuKreditFragment.e + 1] >> 16));
                cArr[3] = (char) ((char) iArr[CC23BFormKartuKreditFragment.e + 1]);
                CC23BFormKartuKreditFragment.d = (cArr[0] << 16) + cArr[1];
                CC23BFormKartuKreditFragment.b = (cArr[2] << 16) + cArr[3];
                CC23BFormKartuKreditFragment.d(iArr2);
                for (int i2 = 0; i2 < 16; i2++) {
                    int i3 = CC23BFormKartuKreditFragment.d ^ iArr2[i2];
                    CC23BFormKartuKreditFragment.d = i3;
                    CC23BFormKartuKreditFragment.b = CC23BFormKartuKreditFragment.a(i3) ^ CC23BFormKartuKreditFragment.b;
                    int i4 = CC23BFormKartuKreditFragment.d;
                    CC23BFormKartuKreditFragment.d = CC23BFormKartuKreditFragment.b;
                    CC23BFormKartuKreditFragment.b = i4;
                }
                int i5 = CC23BFormKartuKreditFragment.d;
                CC23BFormKartuKreditFragment.d = CC23BFormKartuKreditFragment.b;
                CC23BFormKartuKreditFragment.b = i5;
                CC23BFormKartuKreditFragment.b = i5 ^ iArr2[16];
                CC23BFormKartuKreditFragment.d ^= iArr2[17];
                int i6 = CC23BFormKartuKreditFragment.d;
                int i7 = CC23BFormKartuKreditFragment.b;
                cArr[0] = (char) ((char) (CC23BFormKartuKreditFragment.d >>> 16));
                cArr[1] = (char) ((char) CC23BFormKartuKreditFragment.d);
                cArr[2] = (char) ((char) (CC23BFormKartuKreditFragment.b >>> 16));
                cArr[3] = (char) ((char) CC23BFormKartuKreditFragment.b);
                CC23BFormKartuKreditFragment.d(iArr2);
                cArr2[CC23BFormKartuKreditFragment.e << 1] = (char) cArr[0];
                cArr2[(CC23BFormKartuKreditFragment.e << 1) + 1] = (char) cArr[1];
                cArr2[(CC23BFormKartuKreditFragment.e << 1) + 2] = (char) cArr[2];
                cArr2[(CC23BFormKartuKreditFragment.e << 1) + 3] = (char) cArr[3];
                CC23BFormKartuKreditFragment.e += 2;
            }
            str = new String(cArr2, 0, i);
        }
        objArr[0] = str;
    }
}
