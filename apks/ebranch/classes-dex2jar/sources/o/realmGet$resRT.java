package o;

import android.os.Looper;
import android.text.TextUtils;
import java.util.concurrent.Executor;
import o.realmGet$resRT;
/* loaded from: classes-dex2jar.jar:o/realmGet$resRT.class */
public final class realmGet$resRT<L> {
    volatile RemoteActionCompatParcelizer a;
    private final Executor d;
    volatile Object e;

    /* loaded from: classes-dex2jar.jar:o/realmGet$resRT$IconCompatParcelizer.class */
    public interface IconCompatParcelizer<L> {
        void a(L l);

        void d();
    }

    /* loaded from: classes-dex2jar.jar:o/realmGet$resRT$RemoteActionCompatParcelizer.class */
    public static final class RemoteActionCompatParcelizer<L> {
        private final String c;
        private final Object d;

        RemoteActionCompatParcelizer(L l, String str) {
            this.d = l;
            this.c = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RemoteActionCompatParcelizer)) {
                return false;
            }
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = (RemoteActionCompatParcelizer) obj;
            return this.d == remoteActionCompatParcelizer.d && this.c.equals(remoteActionCompatParcelizer.c);
        }

        public final int hashCode() {
            return (System.identityHashCode(this.d) * 31) + this.c.hashCode();
        }
    }

    public realmGet$resRT(Looper looper, L l, String str) {
        this.d = new getTotalPembayaran(looper);
        if (l != null) {
            this.e = l;
            if (!TextUtils.isEmpty(str)) {
                this.a = new RemoteActionCompatParcelizer(l, str);
                return;
            }
            throw new IllegalArgumentException("Given String is empty or null");
        }
        throw new NullPointerException("Listener must not be null");
    }

    public final RemoteActionCompatParcelizer<L> b() {
        return this.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(IconCompatParcelizer iconCompatParcelizer) {
        Object obj = this.e;
        if (obj == null) {
            iconCompatParcelizer.d();
            return;
        }
        try {
            iconCompatParcelizer.a(obj);
        } catch (RuntimeException e) {
            iconCompatParcelizer.d();
            throw e;
        }
    }

    public final void e() {
        this.e = null;
        this.a = null;
    }

    public final void e(IconCompatParcelizer<? super L> iconCompatParcelizer) {
        if (iconCompatParcelizer != null) {
            this.d.execute(new Runnable(iconCompatParcelizer) { // from class: o.realmSet$kitasKitapExpDate
                public final /* synthetic */ realmGet$resRT.IconCompatParcelizer b;

                {
                    this.b = r5;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    realmGet$resRT.this.d(this.b);
                }
            });
            return;
        }
        throw new NullPointerException("Notifier must not be null");
    }
}
