package o;

import com.facebook.stetho.websocket.CloseCodes;
import com.google.android.gms.internal.measurement.zzd;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
/* loaded from: classes-dex2jar.jar:o/getNationality.class */
public final class getNationality {
    final realmGet$npwpImg c;
    realmSet$ccOtherBankCreditCards d;
    final getCcOtherBankAccounts b = new getCcOtherBankAccounts();
    private final realmGet$TipeTujuanTransaksiPenerima a = new realmGet$TipeTujuanTransaksiPenerima();

    public getNationality() {
        realmGet$npwpImg realmget_npwpimg = new realmGet$npwpImg();
        this.c = realmget_npwpimg;
        this.d = realmget_npwpimg.c.d();
        realmget_npwpimg.e.b("internal.registerCallback", new Callable(this) { // from class: o.getBirthPlace
            private final getNationality d;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.d = r4;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.d.d();
            }
        });
        realmget_npwpimg.e.b("internal.eventLogger", new Callable(this) { // from class: o.getEmergencyContactOfficeExt
            private final getNationality a;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.a = r4;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new setGender(this.a.b);
            }
        });
    }

    public final boolean a() {
        return !this.b.a().isEmpty();
    }

    public final getCcOtherBankAccounts b() {
        return this.b;
    }

    public final /* synthetic */ getCurrCompanyBusinessType d() throws Exception {
        return new getCurrCompanyBusinessType(this.a) { // from class: o.realmGet$StatusPendudukPenerima
            private final realmGet$TipeTujuanTransaksiPenerima c;

            {
                this.c = r4;
            }

            @Override // o.getCurrCompanyBusinessType
            public final getCustomerFullName b(realmSet$ccOtherBankCreditCards realmset_ccotherbankcreditcards, List<getCustomerFullName> list) {
                realmSet$flagBCAAccount.b(this.a, 3, list);
                String d = realmset_ccotherbankcreditcards.a(list.get(0)).d();
                getCustomerFullName a = realmset_ccotherbankcreditcards.a(list.get(1));
                if (a instanceof getDraft) {
                    getCustomerFullName a2 = realmset_ccotherbankcreditcards.a(list.get(2));
                    if (a2 instanceof getCurrOfficeBusinessField) {
                        getCurrOfficeBusinessField getcurrofficebusinessfield = (getCurrOfficeBusinessField) a2;
                        if (getcurrofficebusinessfield.e("type")) {
                            this.c.d(d, getcurrofficebusinessfield.e("priority") ? realmSet$flagBCAAccount.e(getcurrofficebusinessfield.c("priority").a().doubleValue()) : CloseCodes.NORMAL_CLOSURE, (getDraft) a, getcurrofficebusinessfield.c("type").d());
                            return getCustomerFullName.g;
                        }
                        throw new IllegalArgumentException("Undefined rule type");
                    }
                    throw new IllegalArgumentException("Invalid callback params");
                }
                throw new IllegalArgumentException("Invalid callback type");
            }
        };
    }

    public final void d(realmSet$customerName realmset_customername) throws zzd {
        getCurrCompanyBusinessType getcurrcompanybusinesstype;
        try {
            this.d = this.c.c.d();
            if (!(this.c.c(this.d, (realmSet$emergencyContactMobileNumber[]) realmset_customername.d().toArray(new realmSet$emergencyContactMobileNumber[0])) instanceof getCurrOfficeAddress)) {
                for (realmSet$currWorkPeriod realmset_currworkperiod : realmset_customername.e().d()) {
                    List<realmSet$emergencyContactMobileNumber> c = realmset_currworkperiod.c();
                    String d = realmset_currworkperiod.d();
                    for (realmSet$emergencyContactMobileNumber realmset_emergencycontactmobilenumber : c) {
                        getCustomerFullName c2 = this.c.c(this.d, realmset_emergencycontactmobilenumber);
                        if (c2 instanceof getCurrOfficeBusinessField) {
                            realmSet$ccOtherBankCreditCards realmset_ccotherbankcreditcards = this.d;
                            if (!realmset_ccotherbankcreditcards.d(d)) {
                                getcurrcompanybusinesstype = null;
                            } else {
                                getCustomerFullName e = realmset_ccotherbankcreditcards.e(d);
                                if (!(e instanceof getCurrCompanyBusinessType)) {
                                    String valueOf = String.valueOf(d);
                                    throw new IllegalStateException(valueOf.length() != 0 ? "Invalid function name: ".concat(valueOf) : new String("Invalid function name: "));
                                }
                                getcurrcompanybusinesstype = (getCurrCompanyBusinessType) e;
                            }
                            if (getcurrcompanybusinesstype == null) {
                                String valueOf2 = String.valueOf(d);
                                throw new IllegalStateException(valueOf2.length() != 0 ? "Rule function is undefined: ".concat(valueOf2) : new String("Rule function is undefined: "));
                            }
                            getcurrcompanybusinesstype.b(this.d, Collections.singletonList(c2));
                        } else {
                            throw new IllegalArgumentException("Invalid rule definition");
                        }
                    }
                }
                return;
            }
            throw new IllegalStateException("Program loading failed");
        } catch (Throwable th) {
            throw new zzd(th);
        }
    }

    public final boolean d(getCreditCardOptions getcreditcardoptions) throws zzd {
        try {
            this.b.b(getcreditcardoptions);
            this.c.d.c("runtime.counter", new getCreditCardSupplements(Double.valueOf(0.0d)));
            this.a.a(this.d.d(), this.b);
            if (!e()) {
                return a();
            }
            return true;
        } catch (Throwable th) {
            throw new zzd(th);
        }
    }

    public final void e(String str, Callable<? extends getCurrCompanyBusinessType> callable) {
        this.c.e.b(str, callable);
    }

    public final boolean e() {
        return !this.b.e().equals(this.b.b());
    }
}
