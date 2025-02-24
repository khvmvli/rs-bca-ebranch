package o;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;
import o.realmGet$oldCustFlag;
/* loaded from: classes-dex2jar.jar:o/realmSet$officePostCode.class */
public final class realmSet$officePostCode<R extends realmGet$oldCustFlag> extends realmGet$officeProvince<R> implements realmGet$officeName<R> {
    private realmGet$occupationFlagFreeText a;
    private realmSet$officePostCode b;
    private volatile realmGet$officeCity c;
    private realmGet$officePostCode d;
    private final Object e;
    private final realmSet$officeName f;
    private Status g;
    private final WeakReference h;
    private boolean i;

    private final boolean a() {
        return (this.c == null || ((realmGet$occupation) this.h.get()) == null) ? false : true;
    }

    public final void c(Status status) {
        synchronized (this.e) {
            this.g = status;
            e(status);
        }
    }

    private final void d() {
        if (this.d != null || this.c != null) {
            realmGet$occupation realmget_occupation = (realmGet$occupation) this.h.get();
            if (!(this.i || this.d == null || realmget_occupation == null)) {
                realmget_occupation.e(this);
                this.i = true;
            }
            Status status = this.g;
            if (status != null) {
                e(status);
                return;
            }
            realmGet$occupationFlagFreeText realmget_occupationflagfreetext = this.a;
            if (realmget_occupationflagfreetext != null) {
                realmget_occupationflagfreetext.e(this);
            }
        }
    }

    private final void e(Status status) {
        synchronized (this.e) {
            realmGet$officePostCode realmget_officepostcode = this.d;
            if (realmget_officepostcode != null) {
                ((realmSet$officePostCode) setFotoKtp.b(this.b)).c((Status) setFotoKtp.a(realmget_officepostcode.b(status), "onFailure must not return null"));
            } else if (a()) {
                ((realmGet$officeCity) setFotoKtp.b(this.c)).e(status);
            }
        }
    }

    public static final void e(realmGet$oldCustFlag realmget_oldcustflag) {
        if (realmget_oldcustflag instanceof realmGet$occupationValue) {
            try {
                ((realmGet$occupationValue) realmget_oldcustflag).b();
            } catch (RuntimeException e) {
                Log.w("TransformedResultImpl", "Unable to release ".concat(String.valueOf(String.valueOf(realmget_oldcustflag))), e);
            }
        }
    }

    public final void b() {
        this.c = null;
    }

    @Override // o.realmGet$officeName
    public final void c(realmGet$oldCustFlag realmget_oldcustflag) {
        synchronized (this.e) {
            if (!realmget_oldcustflag.e().c()) {
                c(realmget_oldcustflag.e());
                e(realmget_oldcustflag);
            } else if (this.d != null) {
                realmSet$name.b().submit(new Runnable(realmget_oldcustflag) { // from class: o.realmSet$officeCity
                    final /* synthetic */ realmGet$oldCustFlag a;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.a = r5;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        realmGet$occupation realmget_occupation;
                        try {
                            try {
                                realmGet$purposePemRekOthers.d.set(true);
                                realmGet$occupationFlagFreeText e = ((realmGet$officePostCode) setFotoKtp.b(realmSet$officePostCode.this.d)).e(this.a);
                                realmSet$officePostCode realmset_officepostcode = realmSet$officePostCode.this;
                                realmset_officepostcode.f.sendMessage(realmset_officepostcode.f.obtainMessage(0, e));
                                realmGet$purposePemRekOthers.d.set(false);
                                realmSet$officePostCode realmset_officepostcode2 = realmSet$officePostCode.this;
                                realmSet$officePostCode.e(this.a);
                                realmget_occupation = (realmGet$occupation) realmSet$officePostCode.this.h.get();
                                if (realmget_occupation == null) {
                                    return;
                                }
                            } catch (RuntimeException e2) {
                                realmSet$officePostCode realmset_officepostcode3 = realmSet$officePostCode.this;
                                realmset_officepostcode3.f.sendMessage(realmset_officepostcode3.f.obtainMessage(1, e2));
                                realmGet$purposePemRekOthers.d.set(false);
                                realmSet$officePostCode realmset_officepostcode4 = realmSet$officePostCode.this;
                                realmSet$officePostCode.e(this.a);
                                realmget_occupation = (realmGet$occupation) realmSet$officePostCode.this.h.get();
                                if (realmget_occupation == null) {
                                    return;
                                }
                            }
                            realmget_occupation.c(realmSet$officePostCode.this);
                        } catch (Throwable th) {
                            realmGet$purposePemRekOthers.d.set(false);
                            realmSet$officePostCode realmset_officepostcode5 = realmSet$officePostCode.this;
                            realmSet$officePostCode.e(this.a);
                            realmGet$occupation realmget_occupation2 = (realmGet$occupation) realmSet$officePostCode.this.h.get();
                            if (realmget_occupation2 != null) {
                                realmget_occupation2.c(realmSet$officePostCode.this);
                            }
                            throw th;
                        }
                    }
                });
            } else if (a()) {
                ((realmGet$officeCity) setFotoKtp.b(this.c)).b(realmget_oldcustflag);
            }
        }
    }

    public final void e(realmGet$occupationFlagFreeText realmget_occupationflagfreetext) {
        synchronized (this.e) {
            this.a = realmget_occupationflagfreetext;
            d();
        }
    }
}
