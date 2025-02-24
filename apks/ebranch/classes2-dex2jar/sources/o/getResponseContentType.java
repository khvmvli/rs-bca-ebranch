package o;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* loaded from: classes2-dex2jar.jar:o/getResponseContentType.class */
public class getResponseContentType<E> {
    private static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(getResponseContentType.class, Object.class, "_cur");
    private volatile /* synthetic */ Object _cur = new getResponseDateString$com_github_ChuckerTeam_Chucker_library(8, false);

    public getResponseContentType(boolean z) {
    }

    public final boolean b(E e) {
        while (true) {
            getResponseDateString$com_github_ChuckerTeam_Chucker_library getresponsedatestring_com_github_chuckerteam_chucker_library = (getResponseDateString$com_github_ChuckerTeam_Chucker_library) this._cur;
            int a2 = getresponsedatestring_com_github_chuckerteam_chucker_library.a(e);
            if (a2 == 0) {
                return true;
            }
            if (a2 == 1) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
                getResponseDateString$com_github_ChuckerTeam_Chucker_library<E> e2 = getresponsedatestring_com_github_chuckerteam_chucker_library.e(getresponsedatestring_com_github_chuckerteam_chucker_library.c());
                while (!atomicReferenceFieldUpdater.compareAndSet(this, getresponsedatestring_com_github_chuckerteam_chucker_library, e2) && atomicReferenceFieldUpdater.get(this) == getresponsedatestring_com_github_chuckerteam_chucker_library) {
                }
            } else if (a2 == 2) {
                return false;
            }
        }
    }

    public final E c() {
        while (true) {
            getResponseDateString$com_github_ChuckerTeam_Chucker_library getresponsedatestring_com_github_chuckerteam_chucker_library = (getResponseDateString$com_github_ChuckerTeam_Chucker_library) this._cur;
            E e = (E) getresponsedatestring_com_github_chuckerteam_chucker_library.b();
            if (e != getResponseDateString$com_github_ChuckerTeam_Chucker_library.c) {
                return e;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
            getResponseDateString$com_github_ChuckerTeam_Chucker_library<E> e2 = getresponsedatestring_com_github_chuckerteam_chucker_library.e(getresponsedatestring_com_github_chuckerteam_chucker_library.c());
            while (!atomicReferenceFieldUpdater.compareAndSet(this, getresponsedatestring_com_github_chuckerteam_chucker_library, e2) && atomicReferenceFieldUpdater.get(this) == getresponsedatestring_com_github_chuckerteam_chucker_library) {
            }
        }
    }

    public final void d() {
        while (true) {
            getResponseDateString$com_github_ChuckerTeam_Chucker_library getresponsedatestring_com_github_chuckerteam_chucker_library = (getResponseDateString$com_github_ChuckerTeam_Chucker_library) this._cur;
            if (!getresponsedatestring_com_github_chuckerteam_chucker_library.a()) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
                getResponseDateString$com_github_ChuckerTeam_Chucker_library<E> e = getresponsedatestring_com_github_chuckerteam_chucker_library.e(getresponsedatestring_com_github_chuckerteam_chucker_library.c());
                while (!atomicReferenceFieldUpdater.compareAndSet(this, getresponsedatestring_com_github_chuckerteam_chucker_library, e) && atomicReferenceFieldUpdater.get(this) == getresponsedatestring_com_github_chuckerteam_chucker_library) {
                }
            } else {
                return;
            }
        }
    }

    public final int e() {
        long j = ((getResponseDateString$com_github_ChuckerTeam_Chucker_library) this._cur)._state;
        return 1073741823 & (((int) ((j & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j)));
    }
}
