package o;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* loaded from: classes2-dex2jar.jar:o/VTandFAPresenter.class */
public abstract class VTandFAPresenter extends GetIdentityPresenter implements RescheduleReservationV2Presenter, TxnTellerPresenter {
    public GeneratedAppGlideModule d;

    @Override // o.RescheduleReservationV2Presenter
    public final void a() {
        boolean z;
        GeneratedAppGlideModule generatedAppGlideModule = this.d;
        if (generatedAppGlideModule == null) {
            subscribeReservationRescheduleEvent.e("");
            generatedAppGlideModule = null;
        }
        while (true) {
            Object obj = generatedAppGlideModule._state;
            if (obj instanceof getResponseImageBitmap$com_github_ChuckerTeam_Chucker_library) {
                ((getResponseImageBitmap$com_github_ChuckerTeam_Chucker_library) obj).c(generatedAppGlideModule);
            } else if (obj instanceof VTandFAPresenter) {
                if (obj == this) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = GeneratedAppGlideModule.c;
                    RescheduleReservationPresenter rescheduleReservationPresenter = Glide.c;
                    while (true) {
                        if (!atomicReferenceFieldUpdater.compareAndSet(generatedAppGlideModule, obj, rescheduleReservationPresenter)) {
                            if (atomicReferenceFieldUpdater.get(generatedAppGlideModule) != obj) {
                                z = false;
                                break;
                            }
                        } else {
                            z = true;
                            break;
                        }
                    }
                    if (z) {
                        return;
                    }
                } else {
                    return;
                }
            } else if ((obj instanceof TxnTellerPresenter) && ((TxnTellerPresenter) obj).e() != null) {
                E_();
                return;
            } else {
                return;
            }
        }
    }

    @Override // o.TxnTellerPresenter
    public final boolean b() {
        return true;
    }

    @Override // o.TxnTellerPresenter
    public final Registry$NoImageHeaderParserException e() {
        return null;
    }

    @Override // o.getResponseHeaders$com_github_ChuckerTeam_Chucker_library
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[job@");
        GeneratedAppGlideModule generatedAppGlideModule = this.d;
        if (generatedAppGlideModule == null) {
            subscribeReservationRescheduleEvent.e("");
            generatedAppGlideModule = null;
        }
        sb.append(Integer.toHexString(System.identityHashCode(generatedAppGlideModule)));
        sb.append(']');
        return sb.toString();
    }
}
