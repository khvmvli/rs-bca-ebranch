package o;

import java.util.ArrayList;
/* loaded from: classes2-dex2jar.jar:o/getNotificationText$com_github_ChuckerTeam_Chucker_library.class */
public abstract class getNotificationText$com_github_ChuckerTeam_Chucker_library<T> implements getParsedRequestHeaders$com_github_ChuckerTeam_Chucker_library<T> {
    public final int b;
    public final ProsesTarikanFragment_ViewBinding c;
    public final getDurationString$com_github_ChuckerTeam_Chucker_library e;

    public getNotificationText$com_github_ChuckerTeam_Chucker_library(ProsesTarikanFragment_ViewBinding prosesTarikanFragment_ViewBinding, int i, getDurationString$com_github_ChuckerTeam_Chucker_library getdurationstring_com_github_chuckerteam_chucker_library) {
        this.c = prosesTarikanFragment_ViewBinding;
        this.b = i;
        this.e = getdurationstring_com_github_chuckerteam_chucker_library;
        if (RateTransactionPresenter.c()) {
            if (!(i != -1)) {
                throw new AssertionError();
            }
        }
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        if (this.c != ReviewSetoranFragment.e) {
            arrayList.add(subscribeReservationRescheduleEvent.b("context=", this.c));
        }
        int i = this.b;
        if (i != -3) {
            arrayList.add(subscribeReservationRescheduleEvent.b("capacity=", Integer.valueOf(i)));
        }
        if (this.e != getDurationString$com_github_ChuckerTeam_Chucker_library.SUSPEND) {
            arrayList.add(subscribeReservationRescheduleEvent.b("onBufferOverflow=", this.e));
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('[');
        sb.append(onClickUbahDataAlamatIdentitas.c(arrayList, ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (T1TransaksiTarikanUbahFragment_ViewBinding) null, 62));
        sb.append(']');
        return sb.toString();
    }
}
