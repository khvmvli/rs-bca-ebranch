package o;

import com.google.android.gms.internal.measurement.zzkn;
/* loaded from: classes-dex2jar.jar:o/setPreferredMailingAddress.class */
public class setPreferredMailingAddress {
    private static final setEmergencyContactPhoneNumber b = setEmergencyContactPhoneNumber.c();
    private volatile setCurrOfficePostCode c;
    protected volatile realmGet$cardDescription e;

    public final int a() {
        if (this.c != null) {
            return ((setCurrOfficePhoneNumber) this.c).b.length;
        }
        if (this.e != null) {
            return this.e.au();
        }
        return 0;
    }

    public final setCurrOfficePostCode c() {
        if (this.c != null) {
            return this.c;
        }
        synchronized (this) {
            if (this.c != null) {
                return this.c;
            }
            if (this.e == null) {
                this.c = setCurrOfficePostCode.a;
            } else {
                this.c = this.e.aj();
            }
            return this.c;
        }
    }

    protected final void d(realmGet$cardDescription realmget_carddescription) {
        if (this.e == null) {
            synchronized (this) {
                if (this.e == null) {
                    try {
                        this.e = realmget_carddescription;
                        this.c = setCurrOfficePostCode.a;
                    } catch (zzkn e) {
                        this.e = realmget_carddescription;
                        this.c = setCurrOfficePostCode.a;
                    }
                }
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setPreferredMailingAddress)) {
            return false;
        }
        setPreferredMailingAddress setpreferredmailingaddress = (setPreferredMailingAddress) obj;
        realmGet$cardDescription realmget_carddescription = this.e;
        realmGet$cardDescription realmget_carddescription2 = setpreferredmailingaddress.e;
        if (realmget_carddescription == null && realmget_carddescription2 == null) {
            return c().equals(setpreferredmailingaddress.c());
        }
        if (realmget_carddescription != null && realmget_carddescription2 != null) {
            return realmget_carddescription.equals(realmget_carddescription2);
        }
        if (realmget_carddescription != null) {
            setpreferredmailingaddress.d(realmget_carddescription.l_());
            return realmget_carddescription.equals(setpreferredmailingaddress.e);
        }
        d(realmget_carddescription2.l_());
        return this.e.equals(realmget_carddescription2);
    }

    public int hashCode() {
        return 1;
    }
}
