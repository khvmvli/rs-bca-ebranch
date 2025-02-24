package o;

import android.graphics.Bitmap;
import android.widget.ImageView;
import o.setNextCategory;
/* loaded from: classes-dex2jar.jar:o/GetTxnTellerDetailKUResponse.class */
public final class GetTxnTellerDetailKUResponse implements setNextCategory, getNextCategory {
    public volatile getNextCategory a;
    private boolean c;
    public volatile getNextCategory d;
    private final setNextCategory e;
    private final Object j;
    private setNextCategory.RemoteActionCompatParcelizer b = setNextCategory.RemoteActionCompatParcelizer.CLEARED;
    private setNextCategory.RemoteActionCompatParcelizer g = setNextCategory.RemoteActionCompatParcelizer.CLEARED;

    /* loaded from: classes-dex2jar.jar:o/GetTxnTellerDetailKUResponse$TxnDetail.class */
    public final class TxnDetail extends getSenderAddress2<Bitmap> {
        public TxnDetail(ImageView imageView) {
            super(imageView);
        }

        @Override // o.getSenderAddress2
        protected final /* synthetic */ void b(Bitmap bitmap) {
            ((ImageView) this.a).setImageBitmap(bitmap);
        }
    }

    public GetTxnTellerDetailKUResponse(Object obj, setNextCategory setnextcategory) {
        this.j = obj;
        this.e = setnextcategory;
    }

    @Override // o.getNextCategory
    public final void a() {
        synchronized (this.j) {
            this.c = false;
            this.b = setNextCategory.RemoteActionCompatParcelizer.CLEARED;
            this.g = setNextCategory.RemoteActionCompatParcelizer.CLEARED;
            this.d.a();
            this.a.a();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0049, code lost:
        if (r3.b != o.setNextCategory.RemoteActionCompatParcelizer.SUCCESS) goto L_0x004c;
     */
    @Override // o.setNextCategory
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final boolean a(o.getNextCategory r4) {
        /*
            r3 = this;
            r0 = r3
            java.lang.Object r0 = r0.j
            r5 = r0
            r0 = r5
            monitor-enter(r0)
            r0 = r3
            o.setNextCategory r0 = r0.e     // Catch: all -> 0x0054
            r6 = r0
            r0 = 0
            r7 = r0
            r0 = r6
            if (r0 == 0) goto L_0x0023
            r0 = r6
            r1 = r3
            boolean r0 = r0.a(r1)     // Catch: all -> 0x0054
            if (r0 != 0) goto L_0x0023
            r0 = 0
            r8 = r0
            goto L_0x0026
        L_0x0023:
            r0 = 1
            r8 = r0
        L_0x0026:
            r0 = r7
            r9 = r0
            r0 = r8
            if (r0 == 0) goto L_0x004f
            r0 = r4
            r1 = r3
            o.getNextCategory r1 = r1.a     // Catch: all -> 0x0054
            boolean r0 = r0.equals(r1)     // Catch: all -> 0x0054
            if (r0 != 0) goto L_0x004c
            r0 = r3
            o.setNextCategory$RemoteActionCompatParcelizer r0 = r0.b     // Catch: all -> 0x0054
            r4 = r0
            o.setNextCategory$RemoteActionCompatParcelizer r0 = o.setNextCategory.RemoteActionCompatParcelizer.SUCCESS     // Catch: all -> 0x0054
            r6 = r0
            r0 = r7
            r9 = r0
            r0 = r4
            r1 = r6
            if (r0 == r1) goto L_0x004f
        L_0x004c:
            r0 = 1
            r9 = r0
        L_0x004f:
            r0 = r5
            monitor-exit(r0)
            r0 = r9
            return r0
        L_0x0054:
            r4 = move-exception
            r0 = r5
            monitor-exit(r0)
            r0 = r4
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.GetTxnTellerDetailKUResponse.a(o.getNextCategory):boolean");
    }

    @Override // o.setNextCategory
    public final void b(getNextCategory getnextcategory) {
        synchronized (this.j) {
            if (!getnextcategory.equals(this.a)) {
                this.g = setNextCategory.RemoteActionCompatParcelizer.FAILED;
                return;
            }
            this.b = setNextCategory.RemoteActionCompatParcelizer.FAILED;
            setNextCategory setnextcategory = this.e;
            if (setnextcategory != null) {
                setnextcategory.b(this);
            }
        }
    }

    @Override // o.setNextCategory, o.getNextCategory
    public final boolean b() {
        boolean z;
        synchronized (this.j) {
            if (!this.d.b()) {
                if (!this.a.b()) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    @Override // o.setNextCategory
    public final setNextCategory c() {
        setNextCategory c;
        synchronized (this.j) {
            setNextCategory setnextcategory = this.e;
            c = setnextcategory != null ? setnextcategory.c() : this;
        }
        return c;
    }

    @Override // o.setNextCategory
    public final boolean c(getNextCategory getnextcategory) {
        boolean z;
        synchronized (this.j) {
            setNextCategory setnextcategory = this.e;
            z = false;
            if (setnextcategory == null || setnextcategory.c(this)) {
                z = false;
                if (getnextcategory.equals(this.a)) {
                    z = false;
                    if (this.b != setNextCategory.RemoteActionCompatParcelizer.PAUSED) {
                        z = true;
                    }
                }
            }
        }
        return z;
    }

    @Override // o.getNextCategory
    public final boolean d() {
        boolean z;
        synchronized (this.j) {
            z = this.b == setNextCategory.RemoteActionCompatParcelizer.CLEARED;
        }
        return z;
    }

    @Override // o.setNextCategory
    public final boolean d(getNextCategory getnextcategory) {
        boolean z;
        synchronized (this.j) {
            setNextCategory setnextcategory = this.e;
            z = false;
            if (setnextcategory == null || setnextcategory.d(this)) {
                z = false;
                if (getnextcategory.equals(this.a)) {
                    z = false;
                    if (!b()) {
                        z = true;
                    }
                }
            }
        }
        return z;
    }

    @Override // o.getNextCategory
    public final void e() {
        synchronized (this.j) {
            this.c = true;
            if (!(this.b == setNextCategory.RemoteActionCompatParcelizer.SUCCESS || this.g == setNextCategory.RemoteActionCompatParcelizer.RUNNING)) {
                this.g = setNextCategory.RemoteActionCompatParcelizer.RUNNING;
                this.d.e();
            }
            if (this.c && this.b != setNextCategory.RemoteActionCompatParcelizer.RUNNING) {
                this.b = setNextCategory.RemoteActionCompatParcelizer.RUNNING;
                this.a.e();
            }
            this.c = false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003e, code lost:
        if (r3.d != null) goto L_0x004e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0041, code lost:
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0048, code lost:
        if (r0.d != null) goto L_0x0064;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004e, code lost:
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005e, code lost:
        if (r3.d.e(r0.d) == false) goto L_0x0064;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0061, code lost:
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0021, code lost:
        if (r0.a == null) goto L_0x003a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0037, code lost:
        if (r3.a.e(r0.a) != false) goto L_0x003a;
     */
    @Override // o.getNextCategory
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final boolean e(o.getNextCategory r4) {
        /*
            r3 = this;
            r0 = r4
            boolean r0 = r0 instanceof o.GetTxnTellerDetailKUResponse
            r5 = r0
            r0 = 0
            r6 = r0
            r0 = r6
            r7 = r0
            r0 = r5
            if (r0 == 0) goto L_0x0064
            r0 = r4
            o.GetTxnTellerDetailKUResponse r0 = (o.GetTxnTellerDetailKUResponse) r0
            r4 = r0
            r0 = r3
            o.getNextCategory r0 = r0.a
            if (r0 != 0) goto L_0x0027
            r0 = r6
            r7 = r0
            r0 = r4
            o.getNextCategory r0 = r0.a
            if (r0 != 0) goto L_0x0064
            goto L_0x003a
        L_0x0027:
            r0 = r6
            r7 = r0
            r0 = r3
            o.getNextCategory r0 = r0.a
            r1 = r4
            o.getNextCategory r1 = r1.a
            boolean r0 = r0.e(r1)
            if (r0 == 0) goto L_0x0064
        L_0x003a:
            r0 = r3
            o.getNextCategory r0 = r0.d
            if (r0 != 0) goto L_0x004e
            r0 = r6
            r7 = r0
            r0 = r4
            o.getNextCategory r0 = r0.d
            if (r0 != 0) goto L_0x0064
            goto L_0x0061
        L_0x004e:
            r0 = r6
            r7 = r0
            r0 = r3
            o.getNextCategory r0 = r0.d
            r1 = r4
            o.getNextCategory r1 = r1.d
            boolean r0 = r0.e(r1)
            if (r0 == 0) goto L_0x0064
        L_0x0061:
            r0 = 1
            r7 = r0
        L_0x0064:
            r0 = r7
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.GetTxnTellerDetailKUResponse.e(o.getNextCategory):boolean");
    }

    @Override // o.getNextCategory
    public final boolean f() {
        boolean z;
        synchronized (this.j) {
            z = this.b == setNextCategory.RemoteActionCompatParcelizer.SUCCESS;
        }
        return z;
    }

    @Override // o.getNextCategory
    public final void g() {
        synchronized (this.j) {
            if (!this.g.h) {
                this.g = setNextCategory.RemoteActionCompatParcelizer.PAUSED;
                this.d.g();
            }
            if (!this.b.h) {
                this.b = setNextCategory.RemoteActionCompatParcelizer.PAUSED;
                this.a.g();
            }
        }
    }

    @Override // o.getNextCategory
    public final boolean h() {
        boolean z;
        synchronized (this.j) {
            z = this.b == setNextCategory.RemoteActionCompatParcelizer.RUNNING;
        }
        return z;
    }

    @Override // o.setNextCategory
    public final void i(getNextCategory getnextcategory) {
        synchronized (this.j) {
            if (getnextcategory.equals(this.d)) {
                this.g = setNextCategory.RemoteActionCompatParcelizer.SUCCESS;
                return;
            }
            this.b = setNextCategory.RemoteActionCompatParcelizer.SUCCESS;
            setNextCategory setnextcategory = this.e;
            if (setnextcategory != null) {
                setnextcategory.i(this);
            }
            if (!this.g.h) {
                this.d.a();
            }
        }
    }
}
