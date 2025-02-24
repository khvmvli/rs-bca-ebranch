package o;

import android.content.Context;
import android.content.DialogInterface;
/* loaded from: classes-dex2jar.jar:o/StockListBNResponse$StockBranch$$Parcelable.class */
public final class StockListBNResponse$StockBranch$$Parcelable {
    public static final void d(Context context, getCategorySttCode getcategorysttcode, pilihNoRek<onCLickStatusNpwp> pilihnorek, pilihNoRek<onCLickStatusNpwp> pilihnorek2) {
        subscribeReservationRescheduleEvent.e(context, "");
        subscribeReservationRescheduleEvent.e(getcategorysttcode, "");
        new ErrorGetPpuNumberDialog_ViewBinding(context).b(getcategorysttcode.d).a(getcategorysttcode.c).a(getcategorysttcode.e, new DialogInterface.OnClickListener() { // from class: o.getStockBranchList
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                pilihNoRek pilihnorek3 = pilihNoRek.this;
                if (pilihnorek3 != null) {
                    pilihnorek3.invoke();
                }
            }
        }).b(getcategorysttcode.b, new DialogInterface.OnClickListener() { // from class: o.StockListBNResponse$$Parcelable
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                pilihNoRek pilihnorek3 = pilihNoRek.this;
                if (pilihnorek3 != null) {
                    pilihnorek3.invoke();
                }
            }
        }).b().show();
    }
}
