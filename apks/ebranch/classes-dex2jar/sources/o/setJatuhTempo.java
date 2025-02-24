package o;

import java.util.concurrent.Executor;
import o.realmSet;
/* loaded from: classes-dex2jar.jar:o/setJatuhTempo.class */
public abstract class setJatuhTempo<TResult> {
    public setJatuhTempo<TResult> a(Executor executor, realmSet.kodeJenisWarkat kodejeniswarkat) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented");
    }

    public abstract boolean a();

    public abstract setJatuhTempo<TResult> b(Executor executor, realmSet.jenisWarkat jeniswarkat);

    public <TContinuationResult> setJatuhTempo<TContinuationResult> b(Executor executor, realmSet$kodeBank<TResult, TContinuationResult> realmset_kodebank) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    public abstract setJatuhTempo<TResult> b(Executor executor, realmSet.nominal<? super TResult> nominal);

    public <TContinuationResult> setJatuhTempo<TContinuationResult> b(realmSet$kodeBank<TResult, TContinuationResult> realmset_kodebank) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    public abstract boolean b();

    public abstract TResult c();

    public <TContinuationResult> setJatuhTempo<TContinuationResult> c(realmSet.namaBank<TResult, TContinuationResult> namabank) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }

    public abstract Exception d();

    public abstract <X extends Throwable> TResult d(Class<X> cls) throws Throwable;

    public <TContinuationResult> setJatuhTempo<TContinuationResult> d(Executor executor, realmSet$kodeBank<TResult, setJatuhTempo<TContinuationResult>> realmset_kodebank) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    public setJatuhTempo<TResult> d(realmSet.localClearingCodeBank<TResult> localclearingcodebank) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public setJatuhTempo<TResult> e(Executor executor, realmSet.localClearingCodeBank<TResult> localclearingcodebank) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public <TContinuationResult> setJatuhTempo<TContinuationResult> e(Executor executor, realmSet.namaBank<TResult, TContinuationResult> namabank) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }

    public abstract boolean e();
}
