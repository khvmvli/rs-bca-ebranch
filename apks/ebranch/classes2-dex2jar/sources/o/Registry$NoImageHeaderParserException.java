package o;
/* loaded from: classes2-dex2jar.jar:o/Registry$NoImageHeaderParserException.class */
public final class Registry$NoImageHeaderParserException extends getResponseBody implements TxnTellerPresenter {
    public final String a(String str) {
        StringBuilder sb = new StringBuilder("List{");
        sb.append(str);
        sb.append("}[");
        Registry$NoImageHeaderParserException registry$NoImageHeaderParserException = this;
        boolean z = true;
        for (getResponseHeaders$com_github_ChuckerTeam_Chucker_library getresponseheaders_com_github_chuckerteam_chucker_library = (getResponseHeaders$com_github_ChuckerTeam_Chucker_library) registry$NoImageHeaderParserException.c(); !subscribeReservationRescheduleEvent.b(getresponseheaders_com_github_chuckerteam_chucker_library, registry$NoImageHeaderParserException); getresponseheaders_com_github_chuckerteam_chucker_library = getresponseheaders_com_github_chuckerteam_chucker_library.h()) {
            z = z;
            if (getresponseheaders_com_github_chuckerteam_chucker_library instanceof VTandFAPresenter) {
                VTandFAPresenter vTandFAPresenter = (VTandFAPresenter) getresponseheaders_com_github_chuckerteam_chucker_library;
                if (z) {
                    z = false;
                } else {
                    sb.append(", ");
                }
                sb.append(vTandFAPresenter);
            }
        }
        sb.append("]");
        String obj = sb.toString();
        subscribeReservationRescheduleEvent.d(obj, "");
        return obj;
    }

    @Override // o.TxnTellerPresenter
    public final boolean b() {
        return true;
    }

    @Override // o.TxnTellerPresenter
    public final Registry$NoImageHeaderParserException e() {
        return this;
    }

    @Override // o.getResponseHeaders$com_github_ChuckerTeam_Chucker_library
    public final String toString() {
        return RateTransactionPresenter.e() ? a("Active") : toString();
    }
}
