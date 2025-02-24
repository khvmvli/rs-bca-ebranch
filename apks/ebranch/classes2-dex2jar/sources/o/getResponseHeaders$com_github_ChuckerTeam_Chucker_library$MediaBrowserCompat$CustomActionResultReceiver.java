package o;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* loaded from: classes2-dex2jar.jar:o/getResponseHeaders$com_github_ChuckerTeam_Chucker_library$MediaBrowserCompat$CustomActionResultReceiver.class */
public abstract class getResponseHeaders$com_github_ChuckerTeam_Chucker_library$MediaBrowserCompat$CustomActionResultReceiver extends getRequestBody<getResponseHeaders$com_github_ChuckerTeam_Chucker_library> {
    public getResponseHeaders$com_github_ChuckerTeam_Chucker_library a;
    public final getResponseHeaders$com_github_ChuckerTeam_Chucker_library c;

    public getResponseHeaders$com_github_ChuckerTeam_Chucker_library$MediaBrowserCompat$CustomActionResultReceiver(getResponseHeaders$com_github_ChuckerTeam_Chucker_library getresponseheaders_com_github_chuckerteam_chucker_library) {
        this.c = getresponseheaders_com_github_chuckerteam_chucker_library;
    }

    @Override // o.getRequestBody
    public final /* synthetic */ void e(getResponseHeaders$com_github_ChuckerTeam_Chucker_library getresponseheaders_com_github_chuckerteam_chucker_library, Object obj) {
        getResponseHeaders$com_github_ChuckerTeam_Chucker_library getresponseheaders_com_github_chuckerteam_chucker_library2 = getresponseheaders_com_github_chuckerteam_chucker_library;
        boolean z = true;
        boolean z2 = obj == null;
        getResponseHeaders$com_github_ChuckerTeam_Chucker_library getresponseheaders_com_github_chuckerteam_chucker_library3 = z2 ? this.c : this.a;
        if (getresponseheaders_com_github_chuckerteam_chucker_library3 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = getResponseHeaders$com_github_ChuckerTeam_Chucker_library.e;
            while (true) {
                if (!atomicReferenceFieldUpdater.compareAndSet(getresponseheaders_com_github_chuckerteam_chucker_library2, this, getresponseheaders_com_github_chuckerteam_chucker_library3)) {
                    if (atomicReferenceFieldUpdater.get(getresponseheaders_com_github_chuckerteam_chucker_library2) != this) {
                        z = false;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (z && z2) {
                getResponseHeaders$com_github_ChuckerTeam_Chucker_library getresponseheaders_com_github_chuckerteam_chucker_library4 = this.c;
                getResponseHeaders$com_github_ChuckerTeam_Chucker_library getresponseheaders_com_github_chuckerteam_chucker_library5 = this.a;
                subscribeReservationRescheduleEvent.c(getresponseheaders_com_github_chuckerteam_chucker_library5);
                getresponseheaders_com_github_chuckerteam_chucker_library4.d(getresponseheaders_com_github_chuckerteam_chucker_library5);
            }
        }
    }
}
