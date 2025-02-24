package o;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bumptech.glide.Glide;
import java.util.ArrayList;
import java.util.List;
import o.CategoriesORResponse;
/* loaded from: classes-dex2jar.jar:o/getTimeZone.class */
public final class getTimeZone {
    write a;
    int b;
    final setValueArray c;
    final List<getTimeZone$MediaBrowserCompat$CustomActionResultReceiver> d;
    public Bitmap e;
    write f;
    boolean g;
    public final setCategoryEn h;
    int i;
    boolean j;
    private boolean k;
    private final Handler l;
    int m;
    final CategoriesORResponse.Category n;

    /* renamed from: o */
    write f160o;
    private getCategoryEn<Bitmap> p;
    private getReservationDate<Bitmap> r;
    private boolean t;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/getTimeZone$RemoteActionCompatParcelizer.class */
    public final class RemoteActionCompatParcelizer implements Handler.Callback {
        RemoteActionCompatParcelizer() {
            getTimeZone.this = r4;
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            if (message.what == 1) {
                getTimeZone.this.b((write) message.obj);
                return true;
            } else if (message.what != 2) {
                return false;
            } else {
                getTimeZone.this.n.a((write) message.obj);
                return false;
            }
        }
    }

    /* loaded from: classes-dex2jar.jar:o/getTimeZone$write.class */
    public static final class write extends GetTxnTellerDetailKUResponse$$Parcelable<Bitmap> {
        private final long a;
        private final Handler c;
        final int d;
        Bitmap e;

        write(Handler handler, int i, long j) {
            this.c = handler;
            this.d = i;
            this.a = j;
        }

        @Override // o.getCurrencyName
        public final void c(Drawable drawable) {
            this.e = null;
        }

        @Override // o.getCurrencyName
        public final /* synthetic */ void e(Object obj, getFlag_iban getflag_iban) {
            this.e = (Bitmap) obj;
            this.c.sendMessageAtTime(this.c.obtainMessage(1, this), this.a);
        }
    }

    public getTimeZone(Glide glide, setCategoryEn setcategoryen, int i, int i2, getReservationDate<Bitmap> getreservationdate, Bitmap bitmap) {
        this(glide.d, Glide.d(glide.b.getBaseContext()), setcategoryen, null, Glide.d(glide.b.getBaseContext()).b().c(new GetPPUNumberResponse().e(DaftarTransferResponse.d).a(true).d(true).e(i, i2)), getreservationdate, bitmap);
    }

    private getTimeZone(setValueArray setvaluearray, CategoriesORResponse.Category category, setCategoryEn setcategoryen, Handler handler, getCategoryEn<Bitmap> getcategoryen, getReservationDate<Bitmap> getreservationdate, Bitmap bitmap) {
        this.d = new ArrayList();
        this.n = category;
        Handler handler2 = handler == null ? new Handler(Looper.getMainLooper(), new RemoteActionCompatParcelizer()) : handler;
        this.c = setvaluearray;
        this.l = handler2;
        this.p = getcategoryen;
        this.h = setcategoryen;
        a(getreservationdate, bitmap);
    }

    public final void a(getReservationDate<Bitmap> getreservationdate, Bitmap bitmap) {
        if (getreservationdate != null) {
            this.r = getreservationdate;
            if (bitmap != null) {
                this.e = bitmap;
                this.p = this.p.c(new GetPPUNumberResponse().b(getreservationdate));
                this.b = getTxnNotes2.a(bitmap);
                this.m = bitmap.getWidth();
                this.i = bitmap.getHeight();
                return;
            }
            throw new NullPointerException("Argument must not be null");
        }
        throw new NullPointerException("Argument must not be null");
    }

    final void b(write write2) {
        this.k = false;
        if (this.j) {
            this.l.obtainMessage(2, write2).sendToTarget();
        } else if (this.g) {
            if (write2.e != null) {
                Bitmap bitmap = this.e;
                if (bitmap != null) {
                    this.c.b(bitmap);
                    this.e = null;
                }
                write write3 = this.a;
                this.a = write2;
                for (int size = this.d.size() - 1; size >= 0; size--) {
                    this.d.get(size).b();
                }
                if (write3 != null) {
                    this.l.obtainMessage(2, write3).sendToTarget();
                }
            }
            d();
        } else if (this.t) {
            this.l.obtainMessage(2, write2).sendToTarget();
        } else {
            this.f160o = write2;
        }
    }

    public void d() {
        if (this.g && !this.k) {
            if (this.t) {
                if (this.f160o == null) {
                    this.h.i();
                    this.t = false;
                } else {
                    throw new IllegalArgumentException("Pending target must be null when starting from the first frame");
                }
            }
            write write2 = this.f160o;
            if (write2 != null) {
                this.f160o = null;
                b(write2);
                return;
            }
            this.k = true;
            int j = this.h.j();
            this.h.a();
            this.f = new write(this.l, this.h.b(), SystemClock.uptimeMillis() + ((long) j));
            getCategoryEn<Bitmap> a = this.p.c(new GetPPUNumberResponse().c(new getReceiverPhone(Double.valueOf(Math.random())))).a(this.h);
            a.a(this.f, null, a, getReceiverPostalCode.e());
        }
    }
}
