package o;

import android.widget.AutoCompleteTextView;
/* loaded from: classes2-dex2jar.jar:o/onChooseRekeningSumberDana.class */
public final class onChooseRekeningSumberDana {

    /* loaded from: classes2-dex2jar.jar:o/onChooseRekeningSumberDana$RemoteActionCompatParcelizer.class */
    static final class RemoteActionCompatParcelizer extends subscribeDraftTxnBerkalaEvent implements T1TransaksiTarikanUbahFragment_ViewBinding<String, onCLickStatusNpwp> {
        final /* synthetic */ T1TransaksiTarikanUbahFragment_ViewBinding<String, onCLickStatusNpwp> e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        RemoteActionCompatParcelizer(T1TransaksiTarikanUbahFragment_ViewBinding<? super String, onCLickStatusNpwp> t1TransaksiTarikanUbahFragment_ViewBinding) {
            super(1);
            this.e = t1TransaksiTarikanUbahFragment_ViewBinding;
        }

        public final /* synthetic */ Object a(Object obj) {
            String str = (String) obj;
            subscribeReservationRescheduleEvent.e(str, "");
            this.e.a(str);
            return onCLickStatusNpwp.e;
        }
    }

    public static final boolean d(AutoCompleteTextView autoCompleteTextView, T1TransaksiTarikanUbahFragment_ViewBinding<? super String, onCLickStatusNpwp> t1TransaksiTarikanUbahFragment_ViewBinding) {
        subscribeReservationRescheduleEvent.e(autoCompleteTextView, "");
        subscribeReservationRescheduleEvent.e(t1TransaksiTarikanUbahFragment_ViewBinding, "");
        subscribeReservationRescheduleEvent.e(autoCompleteTextView, "");
        KliringInfoBiayaFragment_ViewBinding c = KliringInfoBiayaFragment_ViewBinding.c(new KliringInfoBiayaFragment_ViewBinding(autoCompleteTextView.getText().toString()), null, 1);
        T1TransaksiTarikanUbahFragment_ViewBinding<? super String, onCLickStatusNpwp> remoteActionCompatParcelizer = new RemoteActionCompatParcelizer(t1TransaksiTarikanUbahFragment_ViewBinding);
        subscribeReservationRescheduleEvent.e(remoteActionCompatParcelizer, "");
        c.b = remoteActionCompatParcelizer;
        return c.a();
    }
}
