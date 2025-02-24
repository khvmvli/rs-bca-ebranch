package o;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* loaded from: classes2-dex2jar.jar:o/getRequestBody.class */
public abstract class getRequestBody<T> extends getResponseImageBitmap$com_github_ChuckerTeam_Chucker_library {
    private static final /* synthetic */ AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(getRequestBody.class, Object.class, "_consensus");
    public volatile /* synthetic */ Object _consensus = getProtocol.c;

    public final Object b(Object obj) {
        if (RateTransactionPresenter.c()) {
            if (!(obj != getProtocol.c)) {
                throw new AssertionError();
            }
        }
        Object obj2 = this._consensus;
        return obj2 != getProtocol.c ? obj2 : InquiryEditDataORPresenter.e(e, this, getProtocol.c, obj) ? obj : this._consensus;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.getResponseImageBitmap$com_github_ChuckerTeam_Chucker_library
    public final Object c(Object obj) {
        Object obj2 = this._consensus;
        Object obj3 = obj2;
        if (obj2 == getProtocol.c) {
            obj3 = b(e(obj));
        }
        e(obj, obj3);
        return obj3;
    }

    public abstract Object e(T t);

    public abstract void e(T t, Object obj);
}
