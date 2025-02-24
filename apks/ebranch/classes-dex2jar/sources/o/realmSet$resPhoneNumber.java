package o;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicReference;
import o.BankTransfer$$Parcelable;
/* loaded from: classes-dex2jar.jar:o/realmSet$resPhoneNumber.class */
public abstract class realmSet$resPhoneNumber extends realmGet$resAddress implements DialogInterface.OnCancelListener {
    protected volatile boolean a;
    protected final realmGet$jobOthers b;
    protected final AtomicReference d = new AtomicReference(null);
    private final Handler c = new BankTransfer$$Parcelable.AnonymousClass1(Looper.getMainLooper());

    public realmSet$resPhoneNumber(realmGet$religionValue realmget_religionvalue, realmGet$jobOthers realmget_jobothers) {
        super(realmget_religionvalue);
        this.b = realmget_jobothers;
    }

    public final void d(realmGet$jobValue realmget_jobvalue, int i) {
        this.d.set(null);
        c(realmget_jobvalue, i);
    }

    private static final int e(realmSet$resHouseStatus realmset_reshousestatus) {
        if (realmset_reshousestatus == null) {
            return -1;
        }
        return realmset_reshousestatus.b();
    }

    public final void i() {
        this.d.set(null);
        j();
    }

    @Override // o.realmGet$resAddress
    public void b() {
        b();
        this.a = false;
    }

    public final void b(realmGet$jobValue realmget_jobvalue, int i) {
        AtomicReference atomicReference;
        realmSet$resHouseStatus realmset_reshousestatus = new realmSet$resHouseStatus(realmget_jobvalue, i);
        do {
            atomicReference = this.d;
            if (InquiryEditDataORPresenter.b(atomicReference, (Object) null, realmset_reshousestatus)) {
                this.c.post(new realmSet$resProvince(this, realmset_reshousestatus));
                return;
            }
        } while (atomicReference.get() == null);
    }

    @Override // o.realmGet$resAddress
    public void c() {
        c();
        this.a = true;
    }

    protected abstract void c(realmGet$jobValue realmget_jobvalue, int i);

    @Override // o.realmGet$resAddress
    public final void d(int i, int i2, Intent intent) {
        realmSet$resHouseStatus realmset_reshousestatus = (realmSet$resHouseStatus) this.d.get();
        if (i != 1) {
            if (i == 2) {
                int d = this.b.d(d());
                if (d == 0) {
                    i();
                    return;
                } else if (realmset_reshousestatus == null) {
                    return;
                } else {
                    if (realmset_reshousestatus.e().d() == 18 && d == 18) {
                        return;
                    }
                }
            }
        } else if (i2 == -1) {
            i();
            return;
        } else if (i2 == 0) {
            if (realmset_reshousestatus != null) {
                int i3 = 13;
                if (intent != null) {
                    i3 = intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13);
                }
                d(new realmGet$jobValue(i3, null, realmset_reshousestatus.e().toString()), e(realmset_reshousestatus));
                return;
            }
            return;
        }
        if (realmset_reshousestatus != null) {
            d(realmset_reshousestatus.e(), realmset_reshousestatus.b());
        }
    }

    @Override // o.realmGet$resAddress
    public final void d(Bundle bundle) {
        d(bundle);
        realmSet$resHouseStatus realmset_reshousestatus = (realmSet$resHouseStatus) this.d.get();
        if (realmset_reshousestatus != null) {
            bundle.putBoolean("resolving_error", true);
            bundle.putInt("failed_client_id", realmset_reshousestatus.b());
            bundle.putInt("failed_status", realmset_reshousestatus.e().d());
            bundle.putParcelable("failed_resolution", realmset_reshousestatus.e().a());
        }
    }

    @Override // o.realmGet$resAddress
    public final void e(Bundle bundle) {
        e(bundle);
        if (bundle != null) {
            this.d.set(bundle.getBoolean("resolving_error", false) ? new realmSet$resHouseStatus(new realmGet$jobValue(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    protected abstract void j();

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        d(new realmGet$jobValue(13, null), e((realmSet$resHouseStatus) this.d.get()));
    }
}
