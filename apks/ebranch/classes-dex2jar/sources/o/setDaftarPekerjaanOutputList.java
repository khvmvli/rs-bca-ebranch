package o;

import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes-dex2jar.jar:o/setDaftarPekerjaanOutputList.class */
public final class setDaftarPekerjaanOutputList {
    public static final getResidency<?, ?, ?> d = new getResidency<>(Object.class, Object.class, Object.class, Collections.singletonList(new setPhoneID(Object.class, Object.class, Object.class, Collections.emptyList(), new setFlagReservationTellerSolitaire(), null)), null);
    public final setThumbTextPadding<getTxnPurposeType, getResidency<?, ?, ?>> a = new setThumbTextPadding<>();
    private final AtomicReference<getTxnPurposeType> e = new AtomicReference<>();

    public static boolean b(getResidency<?, ?, ?> getresidency) {
        return d.equals(getresidency);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <Data, TResource, Transcode> getResidency<Data, TResource, Transcode> b(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        getResidency<Data, TResource, Transcode> getresidency;
        getTxnPurposeType andSet = this.e.getAndSet(null);
        getTxnPurposeType gettxnpurposetype = andSet;
        if (andSet == null) {
            gettxnpurposetype = new getTxnPurposeType();
        }
        gettxnpurposetype.d = cls;
        gettxnpurposetype.b = cls2;
        gettxnpurposetype.e = cls3;
        synchronized (this.a) {
            getresidency = (getResidency<Data, TResource, Transcode>) this.a.get(gettxnpurposetype);
        }
        this.e.set(gettxnpurposetype);
        return getresidency;
    }
}
