package o;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import java.util.Set;
import o.realmGet;
import o.realmGet$name;
import o.realmGet$occupation;
/* loaded from: classes-dex2jar.jar:o/realmSet$occupationValue.class */
public final class realmSet$occupationValue extends seteChannels implements realmGet$occupation.IconCompatParcelizer, realmGet$occupation.read {
    private static final realmGet$name.IconCompatParcelizer d = realmGet.localClearingCodeBank.c;
    private final Context a;
    private final realmGet$name.IconCompatParcelizer b;
    private final Handler c;
    private final Set e;
    private final setDob f;
    private realmGet.nomorWarkat h;
    private realmSet$occupationFlagFreeText i;

    public realmSet$occupationValue(Context context, Handler handler, setDob setdob) {
        realmGet$name.IconCompatParcelizer iconCompatParcelizer = d;
        this.a = context;
        this.c = handler;
        this.f = (setDob) setFotoKtp.a(setdob, "ClientSettings must not be null");
        this.e = setdob.e();
        this.b = iconCompatParcelizer;
    }

    public static /* synthetic */ void c(realmSet$occupationValue realmset_occupationvalue, realmGet.kodeBank kodebank) {
        realmGet$jobValue d2 = kodebank.d();
        if (d2.c()) {
            setMaritalStatus setmaritalstatus = (setMaritalStatus) setFotoKtp.b(kodebank.b());
            realmGet$jobValue c = setmaritalstatus.c();
            if (!c.c()) {
                String valueOf = String.valueOf(String.valueOf(c));
                Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(valueOf), new Exception());
                realmset_occupationvalue.i.a(c);
                realmset_occupationvalue.h.e();
                return;
            }
            realmset_occupationvalue.i.b(setmaritalstatus.e(), realmset_occupationvalue.e);
        } else {
            realmset_occupationvalue.i.a(d2);
        }
        realmset_occupationvalue.h.e();
    }

    public final void a(realmSet$occupationFlagFreeText realmset_occupationflagfreetext) {
        realmGet.nomorWarkat nomorwarkat = this.h;
        if (nomorwarkat != null) {
            nomorwarkat.e();
        }
        this.f.c(Integer.valueOf(System.identityHashCode(this)));
        realmGet$name.IconCompatParcelizer iconCompatParcelizer = this.b;
        Context context = this.a;
        Handler handler = this.c;
        setDob setdob = this.f;
        this.h = iconCompatParcelizer.a(context, handler.getLooper(), setdob, setdob.d(), this, this);
        this.i = realmset_occupationflagfreetext;
        Set set = this.e;
        if (set == null || set.isEmpty()) {
            this.c.post(new Runnable() { // from class: o.realmSet$npwp
                @Override // java.lang.Runnable
                public final void run() {
                    realmSet$occupationValue.this.i.a(new realmGet$jobValue(4));
                }
            });
        } else {
            this.h.K();
        }
    }

    public final void b() {
        realmGet.nomorWarkat nomorwarkat = this.h;
        if (nomorwarkat != null) {
            nomorwarkat.e();
        }
    }

    @Override // o.realmGet$resProvince
    public final void b(realmGet$jobValue realmget_jobvalue) {
        this.i.a(realmget_jobvalue);
    }

    public final void c(realmGet.kodeBank kodebank) {
        this.c.post(new Runnable(kodebank) { // from class: o.realmSet$officeAddress
            final /* synthetic */ realmGet.kodeBank a;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.a = r5;
            }

            @Override // java.lang.Runnable
            public final void run() {
                realmSet$occupationValue.c(realmSet$occupationValue.this, this.a);
            }
        });
    }

    @Override // o.realmGet$resCountry
    public final void e(int i) {
        this.i.d(i);
    }

    @Override // o.realmGet$resCountry
    public final void e(Bundle bundle) {
        this.h.d(this);
    }
}
