package o;

import java.io.File;
import java.util.List;
import o.CreateQueueReservationResponse$$Parcelable;
import o.CustDataResponse;
import o.getAmountKliring;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/setAliasName.class */
public final class setAliasName implements CustDataResponse.Phone, CreateQueueReservationResponse$$Parcelable.IconCompatParcelizer<Object> {
    private final getPhoneID<?> a;
    private File b;
    private final CustDataResponse$Phone$MediaBrowserCompat$CustomActionResultReceiver c;
    private volatile getAmountKliring.write<?> d;
    private setCitizenship e;
    private List<getAmountKliring<File, ?>> f;
    private int g;
    private int h = -1;
    private setCode i;
    private int j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public setAliasName(getPhoneID<?> getphoneid, CustDataResponse$Phone$MediaBrowserCompat$CustomActionResultReceiver custDataResponse$Phone$MediaBrowserCompat$CustomActionResultReceiver) {
        this.a = getphoneid;
        this.c = custDataResponse$Phone$MediaBrowserCompat$CustomActionResultReceiver;
    }

    @Override // o.CreateQueueReservationResponse$$Parcelable.IconCompatParcelizer
    public final void a(Object obj) {
        this.c.d(this.i, obj, this.d.a, setNextCategoryCd.RESOURCE_DISK_CACHE, this.e);
    }

    @Override // o.CreateQueueReservationResponse$$Parcelable.IconCompatParcelizer
    public final void b(Exception exc) {
        this.c.d(this.e, exc, this.d.a, setNextCategoryCd.RESOURCE_DISK_CACHE);
    }

    @Override // o.CustDataResponse.Phone
    public final boolean b() {
        List<setCode> d = this.a.d();
        if (d.isEmpty()) {
            return false;
        }
        getPhoneID<?> getphoneid = this.a;
        List<Class<?>> e = getphoneid.c.h.e(getphoneid.g.getClass(), getphoneid.h, getphoneid.l);
        if (!e.isEmpty()) {
            while (true) {
                List<getAmountKliring<File, ?>> list = this.f;
                if (list != null) {
                    if (this.j < list.size()) {
                        this.d = null;
                        boolean z = false;
                        while (!z) {
                            if (!(this.j < this.f.size())) {
                                break;
                            }
                            List<getAmountKliring<File, ?>> list2 = this.f;
                            int i = this.j;
                            this.j = i + 1;
                            this.d = list2.get(i).c(this.b, this.a.f152o, this.a.d, this.a.f);
                            if (this.d != null && this.a.b(this.d.a.e())) {
                                this.d.a.a(this.a.j, this);
                                z = true;
                            }
                        }
                        return z;
                    }
                }
                int i2 = this.h + 1;
                this.h = i2;
                if (i2 >= e.size()) {
                    int i3 = this.g + 1;
                    this.g = i3;
                    if (i3 >= d.size()) {
                        return false;
                    }
                    this.h = 0;
                }
                setCode setcode = d.get(this.g);
                Class<?> cls = e.get(this.h);
                this.e = new setCitizenship(this.a.c.d, setcode, this.a.k, this.a.f152o, this.a.d, this.a.d(cls), cls, this.a.f);
                File e2 = this.a.e.c().e(this.e);
                this.b = e2;
                if (e2 != null) {
                    this.i = setcode;
                    this.f = this.a.c.h.b(e2);
                    this.j = 0;
                }
            }
        } else if (File.class.equals(this.a.l)) {
            return false;
        } else {
            StringBuilder sb = new StringBuilder("Failed to find any load path from ");
            sb.append(this.a.g.getClass());
            sb.append(" to ");
            sb.append(this.a.l);
            throw new IllegalStateException(sb.toString());
        }
    }

    @Override // o.CustDataResponse.Phone
    public final void d() {
        getAmountKliring.write<?> write = this.d;
        if (write != null) {
            write.a.a();
        }
    }
}
