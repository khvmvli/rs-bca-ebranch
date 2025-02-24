package o;

import android.widget.EditText;
/* loaded from: classes2-dex2jar.jar:o/pilihNorek.class */
public final class pilihNorek {

    /* loaded from: classes2-dex2jar.jar:o/pilihNorek$IconCompatParcelizer.class */
    static final class IconCompatParcelizer extends subscribeDraftTxnBerkalaEvent implements T1TransaksiTarikanUbahFragment_ViewBinding<String, onCLickStatusNpwp> {
        final /* synthetic */ T1TransaksiTarikanUbahFragment_ViewBinding<String, onCLickStatusNpwp> d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        IconCompatParcelizer(T1TransaksiTarikanUbahFragment_ViewBinding<? super String, onCLickStatusNpwp> t1TransaksiTarikanUbahFragment_ViewBinding) {
            super(1);
            this.d = t1TransaksiTarikanUbahFragment_ViewBinding;
        }

        public final /* synthetic */ Object a(Object obj) {
            String str = (String) obj;
            subscribeReservationRescheduleEvent.e(str, "");
            this.d.a(str);
            return onCLickStatusNpwp.e;
        }
    }

    public static final boolean c(EditText editText, T1TransaksiTarikanUbahFragment_ViewBinding<? super String, onCLickStatusNpwp> t1TransaksiTarikanUbahFragment_ViewBinding) {
        subscribeReservationRescheduleEvent.e(editText, "");
        subscribeReservationRescheduleEvent.e(t1TransaksiTarikanUbahFragment_ViewBinding, "");
        subscribeReservationRescheduleEvent.e(editText, "");
        KliringInfoBiayaFragment_ViewBinding c = KliringInfoBiayaFragment_ViewBinding.c(new KliringInfoBiayaFragment_ViewBinding(editText.getText().toString()), null, 1);
        T1TransaksiTarikanUbahFragment_ViewBinding<? super String, onCLickStatusNpwp> iconCompatParcelizer = new IconCompatParcelizer(t1TransaksiTarikanUbahFragment_ViewBinding);
        subscribeReservationRescheduleEvent.e(iconCompatParcelizer, "");
        c.b = iconCompatParcelizer;
        return c.a();
    }
}
