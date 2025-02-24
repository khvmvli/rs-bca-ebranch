package o;

import java.io.File;
import java.util.List;
import o.CreateQueueReservationResponse$$Parcelable;
import o.CustDataResponse;
import o.getAmountKliring;
/* loaded from: classes-dex2jar.jar:o/CustDataResponse$$Parcelable.class */
public final class CustDataResponse$$Parcelable implements CustDataResponse.Phone, CreateQueueReservationResponse$$Parcelable.IconCompatParcelizer<Object> {
    private final CustDataResponse$Phone$MediaBrowserCompat$CustomActionResultReceiver a;
    private final List<setCode> b;
    private File c;
    private final getPhoneID<?> d;
    private volatile getAmountKliring.write<?> e;
    private setCode f;
    private int h;
    private int i;
    private List<getAmountKliring<File, ?>> j;

    public CustDataResponse$$Parcelable(List<setCode> list, getPhoneID<?> getphoneid, CustDataResponse$Phone$MediaBrowserCompat$CustomActionResultReceiver custDataResponse$Phone$MediaBrowserCompat$CustomActionResultReceiver) {
        this.i = -1;
        this.b = list;
        this.d = getphoneid;
        this.a = custDataResponse$Phone$MediaBrowserCompat$CustomActionResultReceiver;
    }

    public CustDataResponse$$Parcelable(getPhoneID<?> getphoneid, CustDataResponse$Phone$MediaBrowserCompat$CustomActionResultReceiver custDataResponse$Phone$MediaBrowserCompat$CustomActionResultReceiver) {
        this(getphoneid.d(), getphoneid, custDataResponse$Phone$MediaBrowserCompat$CustomActionResultReceiver);
    }

    @Override // o.CreateQueueReservationResponse$$Parcelable.IconCompatParcelizer
    public final void a(Object obj) {
        this.a.d(this.f, obj, this.e.a, setNextCategoryCd.DATA_DISK_CACHE, this.f);
    }

    @Override // o.CreateQueueReservationResponse$$Parcelable.IconCompatParcelizer
    public final void b(Exception exc) {
        this.a.d(this.f, exc, this.e.a, setNextCategoryCd.DATA_DISK_CACHE);
    }

    @Override // o.CustDataResponse.Phone
    public final boolean b() {
        while (true) {
            List<getAmountKliring<File, ?>> list = this.j;
            if (list != null) {
                if (this.h < list.size()) {
                    this.e = null;
                    boolean z = false;
                    while (!z) {
                        if (!(this.h < this.j.size())) {
                            break;
                        }
                        List<getAmountKliring<File, ?>> list2 = this.j;
                        int i = this.h;
                        this.h = i + 1;
                        this.e = list2.get(i).c(this.c, this.d.f152o, this.d.d, this.d.f);
                        if (this.e != null) {
                            getPhoneID<?> getphoneid = this.d;
                            if (getphoneid.c.h.a(this.e.a.e(), getphoneid.h, getphoneid.l) != null) {
                                this.e.a.a(this.d.j, this);
                                z = true;
                            }
                        }
                    }
                    return z;
                }
            }
            int i2 = this.i + 1;
            this.i = i2;
            if (i2 >= this.b.size()) {
                return false;
            }
            setCode setcode = this.b.get(this.i);
            File e = this.d.e.c().e(new setAccountID(setcode, this.d.k));
            this.c = e;
            if (e != null) {
                this.f = setcode;
                this.j = this.d.c.h.b(e);
                this.h = 0;
            }
        }
    }

    @Override // o.CustDataResponse.Phone
    public final void d() {
        getAmountKliring.write<?> write = this.e;
        if (write != null) {
            write.a.a();
        }
    }
}
