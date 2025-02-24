package o;

import android.util.Log;
import com.bumptech.glide.Registry;
import java.util.Collections;
import java.util.List;
import o.CreateQueueReservationResponse$$Parcelable;
import o.CustDataResponse;
import o.getAmountKliring;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/setResidency.class */
public final class setResidency implements CustDataResponse.Phone, CustDataResponse$Phone$MediaBrowserCompat$CustomActionResultReceiver {
    final getPhoneID<?> a;
    volatile getAmountKliring.write<?> b;
    setAccountID c;
    final CustDataResponse$Phone$MediaBrowserCompat$CustomActionResultReceiver d;
    Object e;
    private CustDataResponse$$Parcelable f;
    private int i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public setResidency(getPhoneID<?> getphoneid, CustDataResponse$Phone$MediaBrowserCompat$CustomActionResultReceiver custDataResponse$Phone$MediaBrowserCompat$CustomActionResultReceiver) {
        this.a = getphoneid;
        this.d = custDataResponse$Phone$MediaBrowserCompat$CustomActionResultReceiver;
    }

    private boolean a() {
        return this.i < this.a.e().size();
    }

    /* JADX WARN: Finally extract failed */
    @Override // o.CustDataResponse.Phone
    public final boolean b() {
        Object obj = this.e;
        if (obj != null) {
            this.e = null;
            long b = getTotalAmountWarkat.b();
            try {
                setContentOrder c = this.a.c.h.d.c(obj.getClass());
                if (c != null) {
                    getAccountID getaccountid = new getAccountID(c, obj, this.a.f);
                    this.c = new setAccountID(this.b.b, this.a.k);
                    this.a.e.c().a(this.c, getaccountid);
                    if (Log.isLoggable("SourceGenerator", 2)) {
                        StringBuilder sb = new StringBuilder("Finished encoding source to cache, key: ");
                        sb.append(this.c);
                        sb.append(", data: ");
                        sb.append(obj);
                        sb.append(", encoder: ");
                        sb.append(c);
                        sb.append(", duration: ");
                        sb.append(getTotalAmountWarkat.e(b));
                        Log.v("SourceGenerator", sb.toString());
                    }
                    this.b.a.c();
                    this.f = new CustDataResponse$$Parcelable(Collections.singletonList(this.b.b), this.a, this);
                } else {
                    throw new Registry.NoSourceEncoderAvailableException(obj.getClass());
                }
            } catch (Throwable th) {
                this.b.a.c();
                throw th;
            }
        }
        CustDataResponse$$Parcelable custDataResponse$$Parcelable = this.f;
        if (custDataResponse$$Parcelable != null && custDataResponse$$Parcelable.b()) {
            return true;
        }
        this.f = null;
        this.b = null;
        boolean z = false;
        while (!z && a()) {
            List<getAmountKliring.write<?>> e = this.a.e();
            int i = this.i;
            this.i = i + 1;
            this.b = e.get(i);
            if (this.b != null && (this.a.a.e(this.b.a.b()) || this.a.b(this.b.a.e()))) {
                final getAmountKliring.write<?> write = this.b;
                this.b.a.a(this.a.j, new CreateQueueReservationResponse$$Parcelable.IconCompatParcelizer<Object>() { // from class: o.setResidency.1
                    @Override // o.CreateQueueReservationResponse$$Parcelable.IconCompatParcelizer
                    public final void a(Object obj2) {
                        setResidency setresidency = setResidency.this;
                        getAmountKliring.write<?> write2 = write;
                        getAmountKliring.write<?> write3 = setresidency.b;
                        if (write3 != null && write3 == write2) {
                            setResidency setresidency2 = setResidency.this;
                            getAmountKliring.write write4 = write;
                            DaftarTransferResponse daftarTransferResponse = setresidency2.a.a;
                            if (obj2 == null || !daftarTransferResponse.e(write4.a.b())) {
                                setresidency2.d.d(write4.b, obj2, write4.a, write4.a.b(), setresidency2.c);
                                return;
                            }
                            setresidency2.e = obj2;
                            setresidency2.d.c();
                        }
                    }

                    @Override // o.CreateQueueReservationResponse$$Parcelable.IconCompatParcelizer
                    public final void b(Exception exc) {
                        setResidency setresidency = setResidency.this;
                        getAmountKliring.write<?> write2 = write;
                        getAmountKliring.write<?> write3 = setresidency.b;
                        if (write3 != null && write3 == write2) {
                            setResidency setresidency2 = setResidency.this;
                            getAmountKliring.write write4 = write;
                            setresidency2.d.d(setresidency2.c, exc, write4.a, write4.a.b());
                        }
                    }
                });
                z = true;
            }
        }
        return z;
    }

    @Override // o.CustDataResponse$Phone$MediaBrowserCompat$CustomActionResultReceiver
    public final void c() {
        throw new UnsupportedOperationException();
    }

    @Override // o.CustDataResponse.Phone
    public final void d() {
        getAmountKliring.write<?> write = this.b;
        if (write != null) {
            write.a.a();
        }
    }

    @Override // o.CustDataResponse$Phone$MediaBrowserCompat$CustomActionResultReceiver
    public final void d(setCode setcode, Exception exc, CreateQueueReservationResponse$$Parcelable<?> createQueueReservationResponse$$Parcelable, setNextCategoryCd setnextcategorycd) {
        this.d.d(setcode, exc, createQueueReservationResponse$$Parcelable, this.b.a.b());
    }

    @Override // o.CustDataResponse$Phone$MediaBrowserCompat$CustomActionResultReceiver
    public final void d(setCode setcode, Object obj, CreateQueueReservationResponse$$Parcelable<?> createQueueReservationResponse$$Parcelable, setNextCategoryCd setnextcategorycd, setCode setcode2) {
        this.d.d(setcode, obj, createQueueReservationResponse$$Parcelable, this.b.a.b(), setcode);
    }
}
