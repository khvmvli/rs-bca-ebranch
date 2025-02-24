package o;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import io.realm.internal.Property;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;
/* loaded from: classes-dex2jar.jar:o/getFlagReservationTellerReguler.class */
public final class getFlagReservationTellerReguler implements CategoryResponse$$Parcelable<ByteBuffer, getProvince> {
    private final IconCompatParcelizer b;
    private final read c;
    private final Context d;
    private final getPrioritasKiosk f;
    private final List<ImageHeaderParser> g;
    private static final IconCompatParcelizer e = new IconCompatParcelizer();
    private static final read a = new read();

    /* loaded from: classes-dex2jar.jar:o/getFlagReservationTellerReguler$IconCompatParcelizer.class */
    static final class IconCompatParcelizer {
        IconCompatParcelizer() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/getFlagReservationTellerReguler$read.class */
    public static final class read {
        final Queue<getContentIn> d = getTxnNotes2.d(0);

        read() {
        }

        final getContentIn a(ByteBuffer byteBuffer) {
            getContentIn getcontentin;
            synchronized (this) {
                getContentIn poll = this.d.poll();
                getcontentin = poll;
                if (poll == null) {
                    getcontentin = new getContentIn();
                }
                getcontentin.e = null;
                Arrays.fill(getcontentin.c, (byte) 0);
                getcontentin.d = new setCategoryCd();
                getcontentin.a = 0;
                ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                getcontentin.e = asReadOnlyBuffer;
                asReadOnlyBuffer.position(0);
                getcontentin.e.order(ByteOrder.LITTLE_ENDIAN);
            }
            return getcontentin;
        }
    }

    public getFlagReservationTellerReguler(Context context, List<ImageHeaderParser> list, setValueArray setvaluearray, DetailTransactionResponse detailTransactionResponse) {
        this(context, list, setvaluearray, detailTransactionResponse, a, e);
    }

    private getFlagReservationTellerReguler(Context context, List<ImageHeaderParser> list, setValueArray setvaluearray, DetailTransactionResponse detailTransactionResponse, read read2, IconCompatParcelizer iconCompatParcelizer) {
        this.d = context.getApplicationContext();
        this.g = list;
        this.b = iconCompatParcelizer;
        this.f = new getPrioritasKiosk(setvaluearray, detailTransactionResponse);
        this.c = read2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public getPhone d(ByteBuffer byteBuffer, int i, int i2, CategoryResponse categoryResponse) {
        getContentIn a2 = this.c.a(byteBuffer);
        try {
            getPhone d = d(byteBuffer, i, i2, a2, categoryResponse);
            read read2 = this.c;
            synchronized (read2) {
                try {
                    a2.e = null;
                    a2.d = null;
                    read2.d.offer(a2);
                } catch (Throwable th) {
                    throw th;
                }
            }
            return d;
        } catch (Throwable th2) {
            read read3 = this.c;
            synchronized (read3) {
                try {
                    a2.e = null;
                    a2.d = null;
                    read3.d.offer(a2);
                    throw th2;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    private getPhone d(ByteBuffer byteBuffer, int i, int i2, getContentIn getcontentin, CategoryResponse categoryResponse) {
        Throwable th;
        setCategoryCd setcategorycd;
        String str = "Decoded GIF from stream in ";
        long b = getTotalAmountWarkat.b();
        try {
            if (getcontentin.e != null) {
                if (getcontentin.d.l != 0) {
                    setcategorycd = getcontentin.d;
                } else {
                    StringBuilder sb = new StringBuilder();
                    for (int i3 = 0; i3 < 6; i3++) {
                        sb.append((char) getcontentin.a());
                    }
                    if (!sb.toString().startsWith("GIF")) {
                        getcontentin.d.l = 1;
                    } else {
                        getcontentin.d.n = getcontentin.e.getShort();
                        getcontentin.d.f = getcontentin.e.getShort();
                        int a2 = getcontentin.a();
                        getcontentin.d.j = (a2 & Property.TYPE_ARRAY) != 0;
                        try {
                            getcontentin.d.h = (int) Math.pow(2.0d, (double) ((a2 & 7) + 1));
                            getcontentin.d.c = getcontentin.a();
                            getcontentin.d.k = getcontentin.a();
                            if (getcontentin.d.j) {
                                if (!(getcontentin.d.l != 0)) {
                                    setCategoryCd setcategorycd2 = getcontentin.d;
                                    setcategorycd2.i = getcontentin.c(setcategorycd2.h);
                                    setCategoryCd setcategorycd3 = getcontentin.d;
                                    setcategorycd3.a = setcategorycd3.i[getcontentin.d.c];
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            str = "Decoded GIF from stream in ";
                            if (Log.isLoggable("BufferGifDecoder", 2)) {
                                StringBuilder sb2 = new StringBuilder(str);
                                sb2.append(getTotalAmountWarkat.e(b));
                                Log.v("BufferGifDecoder", sb2.toString());
                            }
                            throw th;
                        }
                    }
                    if (!(getcontentin.d.l != 0)) {
                        getcontentin.d();
                        if (getcontentin.d.b < 0) {
                            getcontentin.d.l = 1;
                        }
                    }
                    setcategorycd = getcontentin.d;
                }
                if (setcategorycd.b > 0 && setcategorycd.l == 0) {
                    getCode<setContentIn> getcode = setBranchInitial.e;
                    Bitmap.Config config = (categoryResponse.c.containsKey(getcode) ? categoryResponse.c.get(getcode) : getcode.a) == setContentIn.PREFER_RGB_565 ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                    int min = Math.min(setcategorycd.f / i2, setcategorycd.n / i);
                    int max = Math.max(1, min == 0 ? 0 : Integer.highestOneBit(min));
                    if (Log.isLoggable("BufferGifDecoder", 2) && max > 1) {
                        StringBuilder sb3 = new StringBuilder("Downsampling GIF, sampleSize: ");
                        sb3.append(max);
                        sb3.append(", target dimens: [");
                        sb3.append(i);
                        sb3.append("x");
                        sb3.append(i2);
                        sb3.append("], actual dimens: [");
                        sb3.append(setcategorycd.n);
                        sb3.append("x");
                        sb3.append(setcategorycd.f);
                        sb3.append("]");
                        Log.v("BufferGifDecoder", sb3.toString());
                    }
                    setContentEn setcontenten = new setContentEn(this.f, setcategorycd, byteBuffer, max);
                    setcontenten.a(config);
                    setcontenten.a();
                    Bitmap h = setcontenten.h();
                    if (h != null) {
                        getPhone getphone = new getPhone(new getProvince(this.d, setcontenten, GetAcctOpeningCategoryDataResponse$Content$$Parcelable.e(), i, i2, h));
                        if (Log.isLoggable("BufferGifDecoder", 2)) {
                            StringBuilder sb4 = new StringBuilder("Decoded GIF from stream in ");
                            sb4.append(getTotalAmountWarkat.e(b));
                            Log.v("BufferGifDecoder", sb4.toString());
                        }
                        return getphone;
                    } else if (!Log.isLoggable("BufferGifDecoder", 2)) {
                        return null;
                    } else {
                        StringBuilder sb5 = new StringBuilder("Decoded GIF from stream in ");
                        sb5.append(getTotalAmountWarkat.e(b));
                        Log.v("BufferGifDecoder", sb5.toString());
                        return null;
                    }
                }
                if (!Log.isLoggable("BufferGifDecoder", 2)) {
                    return null;
                }
                StringBuilder sb6 = new StringBuilder("Decoded GIF from stream in ");
                sb6.append(getTotalAmountWarkat.e(b));
                Log.v("BufferGifDecoder", sb6.toString());
                return null;
            }
            throw new IllegalStateException("You must call setData() before parseHeader()");
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // o.CategoryResponse$$Parcelable
    public final /* synthetic */ boolean a(ByteBuffer byteBuffer, CategoryResponse categoryResponse) throws IOException {
        boolean z;
        ByteBuffer byteBuffer2 = byteBuffer;
        getCode<Boolean> getcode = setBranchInitial.a;
        if (!((Boolean) (categoryResponse.c.containsKey(getcode) ? categoryResponse.c.get(getcode) : getcode.a)).booleanValue()) {
            if ((byteBuffer2 == null ? ImageHeaderParser.ImageType.UNKNOWN : CategoriesORResponse$Category$$Parcelable.a(this.g, 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: o.CategoriesORResponse$Category$$Parcelable, state: GENERATED_AND_UNLOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:268)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:668)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:378)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:132)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:117)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:104)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:974)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:799)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:382)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:132)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:117)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:104)
                	at jadx.core.codegen.InsnGen.makeTernary(InsnGen.java:1022)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:496)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:132)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:117)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:104)
                	at jadx.core.codegen.ConditionGen.addCompare(ConditionGen.java:129)
                	at jadx.core.codegen.ConditionGen.add(ConditionGen.java:57)
                	at jadx.core.codegen.ConditionGen.add(ConditionGen.java:46)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:111)
                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:137)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:79)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:122)
                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:137)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:255)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:248)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:369)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:304)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:270)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                */
            /*
                this = this;
                r0 = r6
                java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
                r8 = r0
                o.getCode<java.lang.Boolean> r0 = o.setBranchInitial.a
                r6 = r0
                r0 = r7
                o.setThumbTextPadding<o.getCode<?>, java.lang.Object> r0 = r0.c
                r1 = r6
                boolean r0 = r0.containsKey(r1)
                if (r0 == 0) goto L_0x0020
                r0 = r7
                o.setThumbTextPadding<o.getCode<?>, java.lang.Object> r0 = r0.c
                r1 = r6
                java.lang.Object r0 = r0.get(r1)
                r6 = r0
                goto L_0x0025
            L_0x0020:
                r0 = r6
                T r0 = r0.a
                r6 = r0
            L_0x0025:
                r0 = r6
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r0 = r0.booleanValue()
                if (r0 != 0) goto L_0x0059
                r0 = r5
                java.util.List<com.bumptech.glide.load.ImageHeaderParser> r0 = r0.g
                r6 = r0
                r0 = r8
                if (r0 != 0) goto L_0x003f
                com.bumptech.glide.load.ImageHeaderParser$ImageType r0 = com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN
                r6 = r0
                goto L_0x004c
            L_0x003f:
                r0 = r6
                o.CategoriesORResponse$Category$$Parcelable$4 r1 = new o.CategoriesORResponse$Category$$Parcelable$4
                r2 = r1
                r3 = r8
                r2.<init>(r3)
                com.bumptech.glide.load.ImageHeaderParser$ImageType r0 = o.CategoriesORResponse$Category$$Parcelable.a(r0, r1)
                r6 = r0
            L_0x004c:
                r0 = r6
                com.bumptech.glide.load.ImageHeaderParser$ImageType r1 = com.bumptech.glide.load.ImageHeaderParser.ImageType.GIF
                if (r0 != r1) goto L_0x0059
                r0 = 1
                r9 = r0
                goto L_0x005c
            L_0x0059:
                r0 = 0
                r9 = r0
            L_0x005c:
                r0 = r9
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: o.getFlagReservationTellerReguler.a(java.lang.Object, o.CategoryResponse):boolean");
        }
    }
