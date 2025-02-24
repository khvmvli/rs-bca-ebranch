package o;

import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes2-dex2jar.jar:o/KliringInfoBiayaFragment_ViewBinding.class */
public final class KliringInfoBiayaFragment_ViewBinding {
    public T1TransaksiTarikanUbahFragment_ViewBinding<? super String, onCLickStatusNpwp> b;
    private pilihNoRek<onCLickStatusNpwp> c;
    private final String f;
    private boolean a = true;
    private String e = "";
    private ArrayList<onUpdatePenerimaData> d = new ArrayList<>();

    public KliringInfoBiayaFragment_ViewBinding(String str) {
        subscribeReservationRescheduleEvent.e(str, "");
        this.f = str;
    }

    public static /* synthetic */ KliringInfoBiayaFragment_ViewBinding c(KliringInfoBiayaFragment_ViewBinding kliringInfoBiayaFragment_ViewBinding, String str, int i) {
        onUpdateWarkat onupdatewarkat = new onUpdateWarkat(null, 1);
        subscribeReservationRescheduleEvent.e(onupdatewarkat, "");
        kliringInfoBiayaFragment_ViewBinding.d.add(onupdatewarkat);
        return kliringInfoBiayaFragment_ViewBinding;
    }

    public final boolean a() {
        Iterator<onUpdatePenerimaData> it = this.d.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            onUpdatePenerimaData next = it.next();
            if (!next.d(this.f)) {
                String e = next.e();
                subscribeReservationRescheduleEvent.e(e, "");
                this.a = false;
                this.e = e;
                break;
            }
        }
        if (this.a) {
            pilihNoRek<onCLickStatusNpwp> pilihnorek = this.c;
            if (pilihnorek != null) {
                pilihnorek.invoke();
            }
        } else {
            T1TransaksiTarikanUbahFragment_ViewBinding<? super String, onCLickStatusNpwp> t1TransaksiTarikanUbahFragment_ViewBinding = this.b;
            if (t1TransaksiTarikanUbahFragment_ViewBinding != null) {
                t1TransaksiTarikanUbahFragment_ViewBinding.a(this.e);
            }
        }
        return this.a;
    }
}
