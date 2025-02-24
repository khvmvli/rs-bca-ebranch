package o;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes-dex2jar.jar:o/GetDaftarPekerjaanResponse.class */
public final class GetDaftarPekerjaanResponse implements setVendorKiosk {
    public final Set<getCurrencyName<?>> e = Collections.newSetFromMap(new WeakHashMap());

    /* loaded from: classes-dex2jar.jar:o/GetDaftarPekerjaanResponse$DataPekerjaanOutput.class */
    public final class DataPekerjaanOutput {
        private final AtomicReference<getTxnPurposeType> e = new AtomicReference<>();
        public final setThumbTextPadding<getTxnPurposeType, List<Class<?>>> b = new setThumbTextPadding<>();

        public final List<Class<?>> d(Class<?> cls, Class<?> cls2, Class<?> cls3) {
            getTxnPurposeType gettxnpurposetype;
            List<Class<?>> list;
            getTxnPurposeType andSet = this.e.getAndSet(null);
            if (andSet == null) {
                gettxnpurposetype = new getTxnPurposeType(cls, cls2, cls3);
            } else {
                andSet.d = cls;
                andSet.b = cls2;
                andSet.e = cls3;
                gettxnpurposetype = andSet;
            }
            synchronized (this.b) {
                list = this.b.get(gettxnpurposetype);
            }
            this.e.set(gettxnpurposetype);
            return list;
        }
    }

    @Override // o.setVendorKiosk
    public final void a() {
        for (getCurrencyName getcurrencyname : getTxnNotes2.c(this.e)) {
            getcurrencyname.a();
        }
    }

    @Override // o.setVendorKiosk
    public final void c() {
        for (getCurrencyName getcurrencyname : getTxnNotes2.c(this.e)) {
            getcurrencyname.c();
        }
    }

    @Override // o.setVendorKiosk
    public final void d() {
        for (getCurrencyName getcurrencyname : getTxnNotes2.c(this.e)) {
            getcurrencyname.d();
        }
    }
}
