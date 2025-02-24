package o;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;
/* loaded from: classes-dex2jar.jar:o/getBankKey.class */
public final class getBankKey {
    public static final getCode<Boolean> c;
    public static final getCode<Boolean> e;
    final DetailTransactionResponse f;
    final List<ImageHeaderParser> h;
    private final DisplayMetrics k;
    private final setValueArray l;

    /* renamed from: o */
    private final GetBankSpecialRelationResponse$SpecialBank$$Parcelable f139o = GetBankSpecialRelationResponse$SpecialBank$$Parcelable.c();
    public static final getCode<setContentIn> a = getCode.c("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", setContentIn.e);
    public static final getCode<getDescription> j = getCode.c("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace", getDescription.SRGB);
    @Deprecated
    public static final getCode<getCurrencyCode> b = getCurrencyCode.f;
    private static final Set<String> g = Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
    static final read d = new read() { // from class: o.getBankKey.4
        @Override // o.getBankKey.read
        public final void b() {
        }

        @Override // o.getBankKey.read
        public final void e(setValueArray setvaluearray, Bitmap bitmap) {
        }
    };
    private static final Set<ImageHeaderParser.ImageType> m = Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));
    private static final Queue<BitmapFactory.Options> i = getTxnNotes2.d(0);

    /* loaded from: classes-dex2jar.jar:o/getBankKey$read.class */
    public interface read {
        void b();

        void e(setValueArray setvaluearray, Bitmap bitmap) throws IOException;
    }

    static {
        Boolean bool = Boolean.FALSE;
        e = getCode.c("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", bool);
        c = getCode.c("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", bool);
    }

    public getBankKey(List<ImageHeaderParser> list, DisplayMetrics displayMetrics, setValueArray setvaluearray, DetailTransactionResponse detailTransactionResponse) {
        this.h = list;
        if (displayMetrics != null) {
            this.k = displayMetrics;
            if (setvaluearray != null) {
                this.l = setvaluearray;
                if (detailTransactionResponse != null) {
                    this.f = detailTransactionResponse;
                    return;
                }
                throw new NullPointerException("Argument must not be null");
            }
            throw new NullPointerException("Argument must not be null");
        }
        throw new NullPointerException("Argument must not be null");
    }

    private static void a(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = null;
            options.outColorSpace = null;
            options.outConfig = null;
        }
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    private void b(setBranchLists setbranchlists, setContentIn setcontentin, boolean z, boolean z2, BitmapFactory.Options options, int i2, int i3) {
        boolean z3;
        boolean b2 = this.f139o.b(i2, i3, z, z2);
        if (b2) {
            options.inPreferredConfig = Bitmap.Config.HARDWARE;
            options.inMutable = false;
        }
        if (!b2) {
            if (setcontentin != setContentIn.PREFER_ARGB_8888) {
                try {
                    z3 = setbranchlists.c().hasAlpha();
                } catch (IOException e2) {
                    z3 = false;
                    if (Log.isLoggable("Downsampler", 3)) {
                        StringBuilder sb = new StringBuilder("Cannot determine whether the image has alpha or not from header, format ");
                        sb.append(setcontentin);
                        Log.d("Downsampler", sb.toString(), e2);
                        z3 = false;
                    }
                }
                options.inPreferredConfig = z3 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
                if (options.inPreferredConfig == Bitmap.Config.RGB_565) {
                    options.inDither = true;
                    return;
                }
                return;
            }
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        }
    }

    public static boolean b() {
        return true;
    }

    private static String c(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder(" (");
        sb.append(bitmap.getAllocationByteCount());
        sb.append(")");
        String obj = sb.toString();
        StringBuilder sb2 = new StringBuilder("[");
        sb2.append(bitmap.getWidth());
        sb2.append("x");
        sb2.append(bitmap.getHeight());
        sb2.append("] ");
        sb2.append(bitmap.getConfig());
        sb2.append(obj);
        return sb2.toString();
    }

    private static int[] c(setBranchLists setbranchlists, BitmapFactory.Options options, read read2, setValueArray setvaluearray) throws IOException {
        options.inJustDecodeBounds = true;
        e(setbranchlists, options, read2, setvaluearray);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    private static BitmapFactory.Options d() {
        BitmapFactory.Options poll;
        BitmapFactory.Options options;
        synchronized (getBankKey.class) {
            try {
                Queue<BitmapFactory.Options> queue = i;
                synchronized (queue) {
                    poll = queue.poll();
                }
                options = poll;
                if (poll == null) {
                    options = new BitmapFactory.Options();
                    a(options);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return options;
    }

    /* JADX WARN: Finally extract failed */
    private static Bitmap e(setBranchLists setbranchlists, BitmapFactory.Options options, read read2, setValueArray setvaluearray) throws IOException {
        Bitmap e2;
        if (!options.inJustDecodeBounds) {
            read2.b();
            setbranchlists.e();
        }
        try {
            int i2 = options.outWidth;
            int i3 = options.outHeight;
            String str = options.outMimeType;
            getBranchType.c().lock();
            try {
                e2 = setbranchlists.e(options);
            } catch (IllegalArgumentException e3) {
                StringBuilder sb = new StringBuilder("Exception decoding bitmap, outWidth: ");
                sb.append(i2);
                sb.append(", outHeight: ");
                sb.append(i3);
                sb.append(", outMimeType: ");
                sb.append(str);
                sb.append(", inBitmap: ");
                sb.append(c(options.inBitmap));
                IOException iOException = new IOException(sb.toString(), e3);
                if (Log.isLoggable("Downsampler", 3)) {
                    Log.d("Downsampler", "Failed to decode with inBitmap, trying again without Bitmap re-use", iOException);
                }
                if (options.inBitmap != null) {
                    try {
                        setvaluearray.b(options.inBitmap);
                        options.inBitmap = null;
                        e2 = e(setbranchlists, options, read2, setvaluearray);
                    } catch (IOException e4) {
                        throw iOException;
                    }
                } else {
                    throw iOException;
                }
            }
            getBranchType.c().unlock();
            return e2;
        } catch (Throwable th) {
            getBranchType.c().unlock();
            throw th;
        }
    }

    private static boolean e(BitmapFactory.Options options) {
        return options.inTargetDensity > 0 && options.inDensity > 0 && options.inTargetDensity != options.inDensity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0652 A[Catch: all -> 0x0a28, TRY_LEAVE, TryCatch #3 {all -> 0x0a28, blocks: (B:84:0x0247, B:87:0x025d, B:90:0x0295, B:92:0x02ab, B:93:0x02b7, B:94:0x02c0, B:94:0x02c0, B:97:0x02c8, B:101:0x02de, B:103:0x02ed, B:110:0x030e, B:112:0x031d, B:115:0x0353, B:117:0x0364, B:119:0x036c, B:121:0x0374, B:123:0x037c, B:130:0x0394, B:132:0x03a9, B:134:0x03c4, B:138:0x03d1, B:140:0x03ed, B:142:0x040c, B:145:0x042b, B:150:0x0453, B:152:0x046c, B:156:0x0497, B:158:0x04ae, B:159:0x04b7, B:161:0x04c6, B:163:0x04cd, B:166:0x05bd, B:167:0x05c9, B:168:0x05ca, B:168:0x05ca, B:169:0x05cd, B:170:0x063f, B:173:0x0648, B:175:0x0652, B:178:0x06aa, B:185:0x06db, B:187:0x06e3, B:189:0x06f8, B:191:0x0709, B:193:0x0742), top: B:279:0x020b }] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x06e3 A[Catch: all -> 0x0a28, TRY_LEAVE, TryCatch #3 {all -> 0x0a28, blocks: (B:84:0x0247, B:87:0x025d, B:90:0x0295, B:92:0x02ab, B:93:0x02b7, B:94:0x02c0, B:94:0x02c0, B:97:0x02c8, B:101:0x02de, B:103:0x02ed, B:110:0x030e, B:112:0x031d, B:115:0x0353, B:117:0x0364, B:119:0x036c, B:121:0x0374, B:123:0x037c, B:130:0x0394, B:132:0x03a9, B:134:0x03c4, B:138:0x03d1, B:140:0x03ed, B:142:0x040c, B:145:0x042b, B:150:0x0453, B:152:0x046c, B:156:0x0497, B:158:0x04ae, B:159:0x04b7, B:161:0x04c6, B:163:0x04cd, B:166:0x05bd, B:167:0x05c9, B:168:0x05ca, B:168:0x05ca, B:169:0x05cd, B:170:0x063f, B:173:0x0648, B:175:0x0652, B:178:0x06aa, B:185:0x06db, B:187:0x06e3, B:189:0x06f8, B:191:0x0709, B:193:0x0742), top: B:279:0x020b }] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x06f5  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0742 A[Catch: all -> 0x0a28, TryCatch #3 {all -> 0x0a28, blocks: (B:84:0x0247, B:87:0x025d, B:90:0x0295, B:92:0x02ab, B:93:0x02b7, B:94:0x02c0, B:94:0x02c0, B:97:0x02c8, B:101:0x02de, B:103:0x02ed, B:110:0x030e, B:112:0x031d, B:115:0x0353, B:117:0x0364, B:119:0x036c, B:121:0x0374, B:123:0x037c, B:130:0x0394, B:132:0x03a9, B:134:0x03c4, B:138:0x03d1, B:140:0x03ed, B:142:0x040c, B:145:0x042b, B:150:0x0453, B:152:0x046c, B:156:0x0497, B:158:0x04ae, B:159:0x04b7, B:161:0x04c6, B:163:0x04cd, B:166:0x05bd, B:167:0x05c9, B:168:0x05ca, B:168:0x05ca, B:169:0x05cd, B:170:0x063f, B:173:0x0648, B:175:0x0652, B:178:0x06aa, B:185:0x06db, B:187:0x06e3, B:189:0x06f8, B:191:0x0709, B:193:0x0742), top: B:279:0x020b }] */
    /* JADX WARN: Removed duplicated region for block: B:201:0x07fb A[Catch: all -> 0x0a24, TryCatch #1 {all -> 0x0a24, blocks: (B:199:0x07ed, B:201:0x07fb, B:203:0x0806, B:207:0x081c, B:209:0x0825, B:211:0x083b, B:213:0x0843, B:215:0x084b, B:217:0x0853, B:224:0x086c, B:225:0x0874, B:227:0x087b, B:228:0x0886, B:230:0x088e, B:232:0x089a, B:234:0x08c0, B:237:0x099e, B:239:0x09bc, B:241:0x09c6, B:244:0x09da, B:247:0x09eb), top: B:275:0x07ed }] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0810  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x081c A[Catch: all -> 0x0a24, TRY_ENTER, TryCatch #1 {all -> 0x0a24, blocks: (B:199:0x07ed, B:201:0x07fb, B:203:0x0806, B:207:0x081c, B:209:0x0825, B:211:0x083b, B:213:0x0843, B:215:0x084b, B:217:0x0853, B:224:0x086c, B:225:0x0874, B:227:0x087b, B:228:0x0886, B:230:0x088e, B:232:0x089a, B:234:0x08c0, B:237:0x099e, B:239:0x09bc, B:241:0x09c6, B:244:0x09da, B:247:0x09eb), top: B:275:0x07ed }] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0843 A[Catch: all -> 0x0a24, TryCatch #1 {all -> 0x0a24, blocks: (B:199:0x07ed, B:201:0x07fb, B:203:0x0806, B:207:0x081c, B:209:0x0825, B:211:0x083b, B:213:0x0843, B:215:0x084b, B:217:0x0853, B:224:0x086c, B:225:0x0874, B:227:0x087b, B:228:0x0886, B:230:0x088e, B:232:0x089a, B:234:0x08c0, B:237:0x099e, B:239:0x09bc, B:241:0x09c6, B:244:0x09da, B:247:0x09eb), top: B:275:0x07ed }] */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0886 A[Catch: all -> 0x0a24, TRY_ENTER, TryCatch #1 {all -> 0x0a24, blocks: (B:199:0x07ed, B:201:0x07fb, B:203:0x0806, B:207:0x081c, B:209:0x0825, B:211:0x083b, B:213:0x0843, B:215:0x084b, B:217:0x0853, B:224:0x086c, B:225:0x0874, B:227:0x087b, B:228:0x0886, B:230:0x088e, B:232:0x089a, B:234:0x08c0, B:237:0x099e, B:239:0x09bc, B:241:0x09c6, B:244:0x09da, B:247:0x09eb), top: B:275:0x07ed }] */
    /* JADX WARN: Removed duplicated region for block: B:234:0x08c0 A[Catch: all -> 0x0a24, TryCatch #1 {all -> 0x0a24, blocks: (B:199:0x07ed, B:201:0x07fb, B:203:0x0806, B:207:0x081c, B:209:0x0825, B:211:0x083b, B:213:0x0843, B:215:0x084b, B:217:0x0853, B:224:0x086c, B:225:0x0874, B:227:0x087b, B:228:0x0886, B:230:0x088e, B:232:0x089a, B:234:0x08c0, B:237:0x099e, B:239:0x09bc, B:241:0x09c6, B:244:0x09da, B:247:0x09eb), top: B:275:0x07ed }] */
    /* JADX WARN: Removed duplicated region for block: B:237:0x099e A[Catch: all -> 0x0a24, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0a24, blocks: (B:199:0x07ed, B:201:0x07fb, B:203:0x0806, B:207:0x081c, B:209:0x0825, B:211:0x083b, B:213:0x0843, B:215:0x084b, B:217:0x0853, B:224:0x086c, B:225:0x0874, B:227:0x087b, B:228:0x0886, B:230:0x088e, B:232:0x089a, B:234:0x08c0, B:237:0x099e, B:239:0x09bc, B:241:0x09c6, B:244:0x09da, B:247:0x09eb), top: B:275:0x07ed }] */
    /* JADX WARN: Removed duplicated region for block: B:243:0x09d8  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x09e5  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x09eb A[Catch: all -> 0x0a24, TRY_ENTER, TryCatch #1 {all -> 0x0a24, blocks: (B:199:0x07ed, B:201:0x07fb, B:203:0x0806, B:207:0x081c, B:209:0x0825, B:211:0x083b, B:213:0x0843, B:215:0x084b, B:217:0x0853, B:224:0x086c, B:225:0x0874, B:227:0x087b, B:228:0x0886, B:230:0x088e, B:232:0x089a, B:234:0x08c0, B:237:0x099e, B:239:0x09bc, B:241:0x09c6, B:244:0x09da, B:247:0x09eb), top: B:275:0x07ed }] */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0a03 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01f8  */
    /* JADX WARN: Type inference failed for: r0v402, types: [double] */
    /* JADX WARN: Type inference failed for: r0v423, types: [java.lang.StringBuilder, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r46v0 */
    /* JADX WARN: Type inference failed for: r46v1 */
    /* JADX WARN: Type inference failed for: r46v2 */
    /* JADX WARN: Type inference failed for: r46v4 */
    /* JADX WARN: Type inference failed for: r46v8 */
    /* JADX WARN: Type inference failed for: r46v9 */
    /* JADX WARN: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public o.setIbanFlag<android.graphics.Bitmap> c(o.setBranchLists r10, int r11, int r12, o.CategoryResponse r13, o.getBankKey.read r14) throws java.io.IOException {
        /*
        // Method dump skipped, instructions count: 2654
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getBankKey.c(o.setBranchLists, int, int, o.CategoryResponse, o.getBankKey$read):o.setIbanFlag");
    }
}
