package o;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import com.squareup.picasso.Downloader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;
import o.CC28FormKartuKreditFragment;
import o.onChooseNomorRekening;
import o.onChooseTanggalJatuhTempo;
/* loaded from: classes2-dex2jar.jar:o/onFocuscc279.class */
public final class onFocuscc279 implements Runnable {
    final showDataDiri a;
    List<showDataAlamat> b;
    final showDataLainnya c;
    showDataAlamat d;
    final CC9FormKartuKreditFragment_ViewBinding e;
    Exception f;
    final String g;
    Future<?> h;
    int i;
    onChooseTanggalJatuhTempo.write j;
    final onChooseNomorRekening k;
    onChooseTanggalJatuhTempo.read l;
    int m;
    final onChooseTanggalJatuhTempo n;

    /* renamed from: o */
    final int f80o;
    final int p = v.incrementAndGet();
    int r;
    final onEditWarkatList s;
    Bitmap t;
    private static final Object q = new Object();
    private static final ThreadLocal<StringBuilder> x = new ThreadLocal<StringBuilder>() { // from class: o.onFocuscc279.4
        @Override // java.lang.ThreadLocal
        protected final /* synthetic */ StringBuilder initialValue() {
            return new StringBuilder("Picasso-");
        }
    };
    private static final AtomicInteger v = new AtomicInteger();
    private static final onChooseNomorRekening u = new onChooseNomorRekening() { // from class: o.onFocuscc279.5
        @Override // o.onChooseNomorRekening
        public final boolean c(CC9FormKartuKreditFragment_ViewBinding cC9FormKartuKreditFragment_ViewBinding) {
            return true;
        }

        @Override // o.onChooseNomorRekening
        public final onChooseNomorRekening.IconCompatParcelizer d(CC9FormKartuKreditFragment_ViewBinding cC9FormKartuKreditFragment_ViewBinding) throws IOException {
            StringBuilder sb = new StringBuilder("Unrecognized type of request: ");
            sb.append(cC9FormKartuKreditFragment_ViewBinding);
            throw new IllegalStateException(sb.toString());
        }
    };

    private onFocuscc279(onChooseTanggalJatuhTempo onchoosetanggaljatuhtempo, showDataLainnya showdatalainnya, showDataDiri showdatadiri, onEditWarkatList oneditwarkatlist, showDataAlamat showdataalamat, onChooseNomorRekening onchoosenomorrekening) {
        this.n = onchoosetanggaljatuhtempo;
        this.c = showdatalainnya;
        this.a = showdatadiri;
        this.s = oneditwarkatlist;
        this.d = showdataalamat;
        this.g = showdataalamat.d;
        this.e = showdataalamat.j;
        this.l = showdataalamat.j.i;
        this.f80o = showdataalamat.c;
        this.m = showdataalamat.i;
        this.k = onchoosenomorrekening;
        this.r = onchoosenomorrekening.a();
    }

    private static Bitmap a(List<onChooseJenisWarkat> list, Bitmap bitmap) {
        int size = list.size();
        int i = 0;
        while (i < size) {
            final onChooseJenisWarkat onchoosejeniswarkat = list.get(i);
            try {
                Bitmap d = onchoosejeniswarkat.d();
                if (d == null) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Transformation ");
                    sb.append(onchoosejeniswarkat.a());
                    sb.append(" returned null after ");
                    sb.append(i);
                    sb.append(" previous transformation(s).\n\nTransformation list:\n");
                    for (onChooseJenisWarkat onchoosejeniswarkat2 : list) {
                        sb.append(onchoosejeniswarkat2.a());
                        sb.append('\n');
                    }
                    onChooseTanggalJatuhTempo.c.post(new Runnable() { // from class: o.onFocuscc279.2
                        @Override // java.lang.Runnable
                        public final void run() {
                            throw new NullPointerException(sb.toString());
                        }
                    });
                    return null;
                } else if (d == bitmap && bitmap.isRecycled()) {
                    onChooseTanggalJatuhTempo.c.post(new Runnable() { // from class: o.onFocuscc279.3
                        @Override // java.lang.Runnable
                        public final void run() {
                            StringBuilder sb2 = new StringBuilder("Transformation ");
                            sb2.append(onchoosejeniswarkat.a());
                            sb2.append(" returned input Bitmap but recycled it.");
                            throw new IllegalStateException(sb2.toString());
                        }
                    });
                    return null;
                } else if (d == bitmap || bitmap.isRecycled()) {
                    i++;
                    bitmap = d;
                } else {
                    onChooseTanggalJatuhTempo.c.post(new Runnable() { // from class: o.onFocuscc279.10
                        @Override // java.lang.Runnable
                        public final void run() {
                            StringBuilder sb2 = new StringBuilder("Transformation ");
                            sb2.append(onchoosejeniswarkat.a());
                            sb2.append(" mutated input Bitmap but failed to recycle the original.");
                            throw new IllegalStateException(sb2.toString());
                        }
                    });
                    return null;
                }
            } catch (RuntimeException e) {
                onChooseTanggalJatuhTempo.c.post(new Runnable() { // from class: o.onFocuscc279.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        StringBuilder sb2 = new StringBuilder("Transformation ");
                        sb2.append(onchoosejeniswarkat.a());
                        sb2.append(" crashed with exception.");
                        throw new RuntimeException(sb2.toString(), e);
                    }
                });
                return null;
            }
        }
        return bitmap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x0207, code lost:
        if (r8.i != 0) goto L_0x020a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x024b, code lost:
        if (r8.i != 0) goto L_0x024e;
     */
    /* JADX WARN: Removed duplicated region for block: B:194:0x047f A[Catch: all -> 0x0534, TRY_ENTER, TryCatch #1 {, blocks: (B:80:0x0212, B:82:0x021e, B:89:0x0230, B:97:0x0247, B:100:0x024f, B:102:0x027c, B:109:0x028e, B:116:0x02a2, B:119:0x02bb, B:121:0x02c2, B:122:0x02d4, B:124:0x02dc, B:129:0x030c, B:131:0x0335, B:143:0x037c, B:146:0x0397, B:162:0x03de, B:189:0x0467, B:194:0x047f, B:196:0x0489, B:199:0x04a0, B:202:0x04aa, B:204:0x04b4, B:206:0x04c6, B:213:0x04de, B:215:0x04ed, B:217:0x04f7), top: B:231:0x0212 }] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x04a0 A[Catch: all -> 0x0534, TRY_ENTER, TRY_LEAVE, TryCatch #1 {, blocks: (B:80:0x0212, B:82:0x021e, B:89:0x0230, B:97:0x0247, B:100:0x024f, B:102:0x027c, B:109:0x028e, B:116:0x02a2, B:119:0x02bb, B:121:0x02c2, B:122:0x02d4, B:124:0x02dc, B:129:0x030c, B:131:0x0335, B:143:0x037c, B:146:0x0397, B:162:0x03de, B:189:0x0467, B:194:0x047f, B:196:0x0489, B:199:0x04a0, B:202:0x04aa, B:204:0x04b4, B:206:0x04c6, B:213:0x04de, B:215:0x04ed, B:217:0x04f7), top: B:231:0x0212 }] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x04b4 A[Catch: all -> 0x0534, TRY_LEAVE, TryCatch #1 {, blocks: (B:80:0x0212, B:82:0x021e, B:89:0x0230, B:97:0x0247, B:100:0x024f, B:102:0x027c, B:109:0x028e, B:116:0x02a2, B:119:0x02bb, B:121:0x02c2, B:122:0x02d4, B:124:0x02dc, B:129:0x030c, B:131:0x0335, B:143:0x037c, B:146:0x0397, B:162:0x03de, B:189:0x0467, B:194:0x047f, B:196:0x0489, B:199:0x04a0, B:202:0x04aa, B:204:0x04b4, B:206:0x04c6, B:213:0x04de, B:215:0x04ed, B:217:0x04f7), top: B:231:0x0212 }] */
    /* JADX WARN: Removed duplicated region for block: B:208:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x04d5  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x04de A[Catch: all -> 0x0534, TRY_ENTER, TRY_LEAVE, TryCatch #1 {, blocks: (B:80:0x0212, B:82:0x021e, B:89:0x0230, B:97:0x0247, B:100:0x024f, B:102:0x027c, B:109:0x028e, B:116:0x02a2, B:119:0x02bb, B:121:0x02c2, B:122:0x02d4, B:124:0x02dc, B:129:0x030c, B:131:0x0335, B:143:0x037c, B:146:0x0397, B:162:0x03de, B:189:0x0467, B:194:0x047f, B:196:0x0489, B:199:0x04a0, B:202:0x04aa, B:204:0x04b4, B:206:0x04c6, B:213:0x04de, B:215:0x04ed, B:217:0x04f7), top: B:231:0x0212 }] */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0212 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0201  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private android.graphics.Bitmap b() throws java.io.IOException {
        /*
        // Method dump skipped, instructions count: 1340
        */
        throw new UnsupportedOperationException("Method not decompiled: o.onFocuscc279.b():android.graphics.Bitmap");
    }

    public static onFocuscc279 e(onChooseTanggalJatuhTempo onchoosetanggaljatuhtempo, showDataLainnya showdatalainnya, showDataDiri showdatadiri, onEditWarkatList oneditwarkatlist, showDataAlamat showdataalamat) {
        CC9FormKartuKreditFragment_ViewBinding cC9FormKartuKreditFragment_ViewBinding = showdataalamat.j;
        List<onChooseNomorRekening> list = onchoosetanggaljatuhtempo.h;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            onChooseNomorRekening onchoosenomorrekening = list.get(i);
            if (onchoosenomorrekening.c(cC9FormKartuKreditFragment_ViewBinding)) {
                return new onFocuscc279(onchoosetanggaljatuhtempo, showdatalainnya, showdatadiri, oneditwarkatlist, showdataalamat, onchoosenomorrekening);
            }
        }
        return new onFocuscc279(onchoosetanggaljatuhtempo, showdatalainnya, showdatadiri, oneditwarkatlist, showdataalamat, u);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001e, code lost:
        if (r0.isEmpty() != false) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final boolean a() {
        /*
            r3 = this;
            r0 = r3
            o.showDataAlamat r0 = r0.d
            r4 = r0
            r0 = 0
            r5 = r0
            r0 = r5
            r6 = r0
            r0 = r4
            if (r0 != 0) goto L_0x003a
            r0 = r3
            java.util.List<o.showDataAlamat> r0 = r0.b
            r4 = r0
            r0 = r4
            if (r0 == 0) goto L_0x0021
            r0 = r5
            r6 = r0
            r0 = r4
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x003a
        L_0x0021:
            r0 = r3
            java.util.concurrent.Future<?> r0 = r0.h
            r4 = r0
            r0 = r5
            r6 = r0
            r0 = r4
            if (r0 == 0) goto L_0x003a
            r0 = r5
            r6 = r0
            r0 = r4
            r1 = 0
            boolean r0 = r0.cancel(r1)
            if (r0 == 0) goto L_0x003a
            r0 = 1
            r6 = r0
        L_0x003a:
            r0 = r6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.onFocuscc279.a():boolean");
    }

    public final void b(showDataAlamat showdataalamat) {
        boolean z = this.n.f;
        CC9FormKartuKreditFragment_ViewBinding cC9FormKartuKreditFragment_ViewBinding = showdataalamat.j;
        if (this.d == null) {
            this.d = showdataalamat;
            if (z) {
                List<showDataAlamat> list = this.b;
                if (list == null || list.isEmpty()) {
                    OR1DataPengirimFragment.b("Hunter", "joined", cC9FormKartuKreditFragment_ViewBinding.b(), "to empty hunter");
                } else {
                    OR1DataPengirimFragment.b("Hunter", "joined", cC9FormKartuKreditFragment_ViewBinding.b(), OR1DataPengirimFragment.d(this, "to "));
                }
            }
        } else {
            if (this.b == null) {
                this.b = new ArrayList(3);
            }
            this.b.add(showdataalamat);
            if (z) {
                OR1DataPengirimFragment.b("Hunter", "joined", cC9FormKartuKreditFragment_ViewBinding.b(), OR1DataPengirimFragment.d(this, "to "));
            }
            onChooseTanggalJatuhTempo.read read = showdataalamat.j.i;
            if (read.ordinal() > this.l.ordinal()) {
                this.l = read;
            }
        }
    }

    public final void e(showDataAlamat showdataalamat) {
        boolean z;
        onChooseTanggalJatuhTempo.read read;
        int i = 0;
        if (this.d == showdataalamat) {
            this.d = null;
            z = true;
        } else {
            List<showDataAlamat> list = this.b;
            z = list != null ? list.remove(showdataalamat) : false;
        }
        if (z && showdataalamat.j.i == this.l) {
            onChooseTanggalJatuhTempo.read read2 = onChooseTanggalJatuhTempo.read.LOW;
            List<showDataAlamat> list2 = this.b;
            boolean z2 = list2 != null && !list2.isEmpty();
            showDataAlamat showdataalamat2 = this.d;
            boolean z3 = true;
            if (showdataalamat2 == null) {
                z3 = z2;
            }
            if (!z3) {
                read = read2;
            } else {
                if (showdataalamat2 != null) {
                    read2 = showdataalamat2.j.i;
                }
                read = read2;
                if (z2) {
                    int size = this.b.size();
                    while (true) {
                        read = read2;
                        if (i >= size) {
                            break;
                        }
                        onChooseTanggalJatuhTempo.read read3 = this.b.get(i).j.i;
                        read2 = read2;
                        if (read3.ordinal() > read2.ordinal()) {
                            read2 = read3;
                        }
                        i++;
                    }
                }
            }
            this.l = read;
        }
        if (this.n.f) {
            OR1DataPengirimFragment.b("Hunter", "removed", showdataalamat.j.b(), OR1DataPengirimFragment.d(this, "from "));
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Throwable th;
        String str;
        try {
            try {
                str = "Picasso-Idle";
                try {
                    try {
                        try {
                            CC9FormKartuKreditFragment_ViewBinding cC9FormKartuKreditFragment_ViewBinding = this.e;
                            Uri uri = cC9FormKartuKreditFragment_ViewBinding.q;
                            String valueOf = uri != null ? String.valueOf(uri.getPath()) : Integer.toHexString(cC9FormKartuKreditFragment_ViewBinding.j);
                            StringBuilder sb = x.get();
                            sb.ensureCapacity(valueOf.length() + 8);
                            sb.replace(8, sb.length(), valueOf);
                            Thread.currentThread().setName(sb.toString());
                            if (this.n.f) {
                                OR1DataPengirimFragment.e("Hunter", "executing", OR1DataPengirimFragment.b(this));
                            }
                            Bitmap b = b();
                            this.t = b;
                            if (b == null) {
                                Handler handler = this.c.i;
                                handler.sendMessage(handler.obtainMessage(6, this));
                            } else {
                                Handler handler2 = this.c.i;
                                handler2.sendMessage(handler2.obtainMessage(4, this));
                            }
                        } catch (OutOfMemoryError e) {
                            StringWriter stringWriter = new StringWriter();
                            onEditWarkatList oneditwarkatlist = this.s;
                            try {
                                OnUpdateKliringPenerimaDataClick onUpdateKliringPenerimaDataClick = new OnUpdateKliringPenerimaDataClick(oneditwarkatlist.a.c(), oneditwarkatlist.a.a(), oneditwarkatlist.c, oneditwarkatlist.j, oneditwarkatlist.l, oneditwarkatlist.f79o, oneditwarkatlist.m, oneditwarkatlist.d, oneditwarkatlist.b, oneditwarkatlist.e, oneditwarkatlist.h, oneditwarkatlist.i, oneditwarkatlist.k, System.currentTimeMillis());
                                PrintWriter printWriter = new PrintWriter(stringWriter);
                                printWriter.println("===============BEGIN PICASSO STATS ===============");
                                printWriter.println("Memory Cache Stats");
                                printWriter.print("  Max Cache Size: ");
                                printWriter.println(onUpdateKliringPenerimaDataClick.i);
                                printWriter.print("  Cache Size: ");
                                printWriter.println(onUpdateKliringPenerimaDataClick.g);
                                printWriter.print("  Cache % Full: ");
                                printWriter.println((int) Math.ceil((double) ((((float) onUpdateKliringPenerimaDataClick.g) / ((float) onUpdateKliringPenerimaDataClick.i)) * 100.0f)));
                                printWriter.print("  Cache Hits: ");
                                printWriter.println(onUpdateKliringPenerimaDataClick.a);
                                printWriter.print("  Cache Misses: ");
                                printWriter.println(onUpdateKliringPenerimaDataClick.d);
                                printWriter.println("Network Stats");
                                printWriter.print("  Download Count: ");
                                printWriter.println(onUpdateKliringPenerimaDataClick.f);
                                printWriter.print("  Total Download Size: ");
                                printWriter.println(onUpdateKliringPenerimaDataClick.f45o);
                                printWriter.print("  Average Download Size: ");
                                printWriter.println(onUpdateKliringPenerimaDataClick.b);
                                printWriter.println("Bitmap Stats");
                                printWriter.print("  Total Bitmaps Decoded: ");
                                printWriter.println(onUpdateKliringPenerimaDataClick.h);
                                printWriter.print("  Total Bitmap Size: ");
                                printWriter.println(onUpdateKliringPenerimaDataClick.n);
                                printWriter.print("  Total Transformed Bitmaps: ");
                                printWriter.println(onUpdateKliringPenerimaDataClick.k);
                                printWriter.print("  Total Transformed Bitmap Size: ");
                                printWriter.println(onUpdateKliringPenerimaDataClick.m);
                                printWriter.print("  Average Bitmap Size: ");
                                printWriter.println(onUpdateKliringPenerimaDataClick.c);
                                printWriter.print("  Average Transformed Bitmap Size: ");
                                printWriter.println(onUpdateKliringPenerimaDataClick.e);
                                printWriter.println("===============END PICASSO STATS ===============");
                                printWriter.flush();
                                this.f = new RuntimeException(stringWriter.toString(), e);
                                Handler handler3 = this.c.i;
                                handler3.sendMessage(handler3.obtainMessage(6, this));
                            } catch (Throwable th2) {
                                th = th2;
                                str = "Picasso-Idle";
                                Thread.currentThread().setName(str);
                                throw th;
                            }
                        }
                    } catch (Downloader.ResponseException e2) {
                        if (!e2.d || e2.a != 504) {
                            this.f = e2;
                        }
                        Handler handler4 = this.c.i;
                        handler4.sendMessage(handler4.obtainMessage(6, this));
                    } catch (CC28FormKartuKreditFragment.IconCompatParcelizer e3) {
                        this.f = e3;
                        Handler handler5 = this.c.i;
                        handler5.sendMessageDelayed(handler5.obtainMessage(5, this), 500);
                    }
                } catch (IOException e4) {
                    this.f = e4;
                    Handler handler6 = this.c.i;
                    handler6.sendMessageDelayed(handler6.obtainMessage(5, this), 500);
                } catch (Exception e5) {
                    this.f = e5;
                    Handler handler7 = this.c.i;
                    handler7.sendMessage(handler7.obtainMessage(6, this));
                }
                Thread.currentThread().setName("Picasso-Idle");
            } catch (Throwable th3) {
                th = th3;
                Thread.currentThread().setName(str);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }
}
