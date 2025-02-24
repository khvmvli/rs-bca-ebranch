package o;
/* loaded from: classes2-dex2jar.jar:o/Glide.class */
public final class Glide {
    private static final getScheme$com_github_ChuckerTeam_Chucker_library e = new getScheme$com_github_ChuckerTeam_Chucker_library("COMPLETING_ALREADY");
    public static final getScheme$com_github_ChuckerTeam_Chucker_library d = new getScheme$com_github_ChuckerTeam_Chucker_library("COMPLETING_WAITING_CHILDREN");
    private static final getScheme$com_github_ChuckerTeam_Chucker_library b = new getScheme$com_github_ChuckerTeam_Chucker_library("COMPLETING_RETRY");
    private static final getScheme$com_github_ChuckerTeam_Chucker_library h = new getScheme$com_github_ChuckerTeam_Chucker_library("TOO_LATE_TO_CANCEL");
    private static final getScheme$com_github_ChuckerTeam_Chucker_library i = new getScheme$com_github_ChuckerTeam_Chucker_library("SEALED");
    private static final RescheduleReservationPresenter a = new RescheduleReservationPresenter(false);
    private static final RescheduleReservationPresenter c = new RescheduleReservationPresenter(true);

    public static final Object a(Object obj) {
        Object obj2 = obj;
        if (obj instanceof TxnTellerPresenter) {
            obj2 = new UpdateProfilePresenter((TxnTellerPresenter) obj);
        }
        return obj2;
    }

    public static final Object d(Object obj) {
        UpdateProfilePresenter updateProfilePresenter = obj instanceof UpdateProfilePresenter ? (UpdateProfilePresenter) obj : null;
        if (updateProfilePresenter != null) {
            obj = updateProfilePresenter.c;
        }
        return obj;
    }

    public static final /* synthetic */ RescheduleReservationPresenter d() {
        return c;
    }
}
