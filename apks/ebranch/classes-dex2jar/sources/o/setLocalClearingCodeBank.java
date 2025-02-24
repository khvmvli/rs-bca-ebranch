package o;

import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import o.realmSet;
/* loaded from: classes-dex2jar.jar:o/setLocalClearingCodeBank.class */
public final class setLocalClearingCodeBank {
    public static <TResult> TResult a(setJatuhTempo<TResult> setjatuhtempo) throws ExecutionException, InterruptedException {
        if (!realmGet$hasManyPenerima.b()) {
            setFotoKtp.e();
            if (setjatuhtempo == null) {
                throw new NullPointerException("Task must not be null");
            } else if (setjatuhtempo.e()) {
                return (TResult) d(setjatuhtempo);
            } else {
                setNominal setnominal = new setNominal((setNamaBank) null);
                setjatuhtempo.b(realmSet.nomorWarkat.c, (realmSet.nominal) setnominal);
                setjatuhtempo.b(realmSet.nomorWarkat.c, (realmSet.jenisWarkat) setnominal);
                setjatuhtempo.a(realmSet.nomorWarkat.c, setnominal);
                setnominal.d();
                return (TResult) d(setjatuhtempo);
            }
        } else {
            throw new IllegalStateException("Must not be called on the main application thread");
        }
    }

    public static <TResult> TResult b(setJatuhTempo<TResult> setjatuhtempo, long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        if (!realmGet$hasManyPenerima.b()) {
            setFotoKtp.e();
            if (setjatuhtempo == null) {
                throw new NullPointerException("Task must not be null");
            } else if (timeUnit == null) {
                throw new NullPointerException("TimeUnit must not be null");
            } else if (setjatuhtempo.e()) {
                return (TResult) d(setjatuhtempo);
            } else {
                setNominal setnominal = new setNominal((setNamaBank) null);
                setjatuhtempo.b(realmSet.nomorWarkat.c, (realmSet.nominal) setnominal);
                setjatuhtempo.b(realmSet.nomorWarkat.c, (realmSet.jenisWarkat) setnominal);
                setjatuhtempo.a(realmSet.nomorWarkat.c, setnominal);
                if (setnominal.d(j, timeUnit)) {
                    return (TResult) d(setjatuhtempo);
                }
                throw new TimeoutException("Timed out waiting for Task");
            }
        } else {
            throw new IllegalStateException("Must not be called on the main application thread");
        }
    }

    public static setJatuhTempo<Void> c(Collection<? extends setJatuhTempo<?>> collection) {
        if (collection == null || collection.isEmpty()) {
            BahasaLayananDialog bahasaLayananDialog = new BahasaLayananDialog();
            bahasaLayananDialog.e(null);
            return bahasaLayananDialog;
        }
        Iterator<? extends setJatuhTempo<?>> it = collection.iterator();
        while (it.hasNext()) {
            if (((setJatuhTempo) it.next()) == null) {
                throw new NullPointerException("null tasks are not accepted");
            }
        }
        BahasaLayananDialog bahasaLayananDialog2 = new BahasaLayananDialog();
        realmSet.jenisWarkat setkodejeniswarkat = new setKodeJenisWarkat(collection.size(), bahasaLayananDialog2);
        Iterator<? extends setJatuhTempo<?>> it2 = collection.iterator();
        while (it2.hasNext()) {
            setJatuhTempo setjatuhtempo = (setJatuhTempo) it2.next();
            setjatuhtempo.b(realmSet.nomorWarkat.c, (realmSet.nominal) setkodejeniswarkat);
            setjatuhtempo.b(realmSet.nomorWarkat.c, setkodejeniswarkat);
            setjatuhtempo.a(realmSet.nomorWarkat.c, setkodejeniswarkat);
        }
        return bahasaLayananDialog2;
    }

    @Deprecated
    public static <TResult> setJatuhTempo<TResult> c(Executor executor, Callable<TResult> callable) {
        if (executor == null) {
            throw new NullPointerException("Executor must not be null");
        } else if (callable != null) {
            BahasaLayananDialog bahasaLayananDialog = new BahasaLayananDialog();
            executor.execute(new bindViews(bahasaLayananDialog, callable));
            return bahasaLayananDialog;
        } else {
            throw new NullPointerException("Callback must not be null");
        }
    }

    private static Object d(setJatuhTempo setjatuhtempo) throws ExecutionException {
        if (setjatuhtempo.b()) {
            return setjatuhtempo.c();
        }
        if (setjatuhtempo.a()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(setjatuhtempo.d());
    }
}
