package o;
/* loaded from: classes-dex2jar.jar:o/Page6NLFragment.class */
public class Page6NLFragment extends Page6MLFragment_ViewBinding {
    public static /* synthetic */ Object[] c(Object[] objArr, Object[] objArr2, int i, int i2, int i3, int i4) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = objArr.length;
        }
        subscribeReservationRescheduleEvent.e(objArr, "");
        subscribeReservationRescheduleEvent.e(objArr2, "");
        System.arraycopy(objArr, i2, objArr2, i, i3 - i2);
        return objArr2;
    }
}
