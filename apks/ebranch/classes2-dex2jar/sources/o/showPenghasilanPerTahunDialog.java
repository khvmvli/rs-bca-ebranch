package o;

import kotlin.NoWhenBranchMatchedException;
/* loaded from: classes2-dex2jar.jar:o/showPenghasilanPerTahunDialog.class */
public class showPenghasilanPerTahunDialog {

    /* loaded from: classes2-dex2jar.jar:o/showPenghasilanPerTahunDialog$RemoteActionCompatParcelizer.class */
    public final /* synthetic */ class RemoteActionCompatParcelizer {
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[showDescPekerjaanDialog.values().length];
            iArr[showDescPekerjaanDialog.SYNCHRONIZED.ordinal()] = 1;
            iArr[showDescPekerjaanDialog.PUBLICATION.ordinal()] = 2;
            iArr[showDescPekerjaanDialog.NONE.ordinal()] = 3;
            b = iArr;
        }
    }

    public static final <T> onChooseValueSumberPenghasilan<T> a(showDescPekerjaanDialog showdescpekerjaandialog, pilihNoRek<? extends T> pilihnorek) {
        onChooseValueSumberPenghasilan<T> onchoosevaluesumberpenghasilan;
        subscribeReservationRescheduleEvent.e(showdescpekerjaandialog, "");
        subscribeReservationRescheduleEvent.e(pilihnorek, "");
        int i = RemoteActionCompatParcelizer.b[showdescpekerjaandialog.ordinal()];
        if (i == 1) {
            onchoosevaluesumberpenghasilan = (onChooseValueSumberPenghasilan) new Page6KLFragment_ViewBinding(pilihnorek, (Object) null, 2);
        } else if (i == 2) {
            onchoosevaluesumberpenghasilan = (onChooseValueSumberPenghasilan) new onChooseValueStatusNPWP(pilihnorek);
        } else if (i == 3) {
            onchoosevaluesumberpenghasilan = (onChooseValueSumberPenghasilan) new Page6LLFragment_ViewBinding(pilihnorek);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return onchoosevaluesumberpenghasilan;
    }
}
