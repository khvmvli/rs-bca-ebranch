package o;

import java.io.Serializable;
import java.lang.reflect.Method;
import o.Page6KLFragment;
import o.SumberDanaPilihIdentitasSetunFragment_ViewBinding;
/* loaded from: classes2-dex2jar.jar:o/ReviewSetoranUbahFragment_ViewBinding.class */
public abstract class ReviewSetoranUbahFragment_ViewBinding implements ProsesTarikanFragment<Object>, SumberDanaDataPemilikSetunFragment, Serializable {
    private final ProsesTarikanFragment<Object> completion;

    public ReviewSetoranUbahFragment_ViewBinding(ProsesTarikanFragment<Object> prosesTarikanFragment) {
        this.completion = prosesTarikanFragment;
    }

    public ProsesTarikanFragment<onCLickStatusNpwp> create(Object obj, ProsesTarikanFragment<?> prosesTarikanFragment) {
        subscribeReservationRescheduleEvent.e(prosesTarikanFragment, "");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public ProsesTarikanFragment<onCLickStatusNpwp> create(ProsesTarikanFragment<?> prosesTarikanFragment) {
        subscribeReservationRescheduleEvent.e(prosesTarikanFragment, "");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    @Override // o.SumberDanaDataPemilikSetunFragment
    public SumberDanaDataPemilikSetunFragment getCallerFrame() {
        ProsesTarikanFragment<Object> prosesTarikanFragment = this.completion;
        return prosesTarikanFragment instanceof SumberDanaDataPemilikSetunFragment ? (SumberDanaDataPemilikSetunFragment) prosesTarikanFragment : null;
    }

    public final ProsesTarikanFragment<Object> getCompletion() {
        return this.completion;
    }

    @Override // o.SumberDanaDataPemilikSetunFragment
    public StackTraceElement getStackTraceElement() {
        String str;
        String str2;
        subscribeReservationRescheduleEvent.e(this, "");
        SumberDanaPilihIdentitasSetunFragment annotation = getClass().getAnnotation(SumberDanaPilihIdentitasSetunFragment.class);
        if (annotation == null) {
            return null;
        }
        int a = annotation.a();
        if (a <= 1) {
            int d = showRekeningPage.d(this);
            int i = d < 0 ? -1 : annotation.c()[d];
            SumberDanaPilihIdentitasSetunFragment_ViewBinding sumberDanaPilihIdentitasSetunFragment_ViewBinding = SumberDanaPilihIdentitasSetunFragment_ViewBinding.c;
            subscribeReservationRescheduleEvent.e(this, "");
            SumberDanaPilihIdentitasSetunFragment_ViewBinding.read read = SumberDanaPilihIdentitasSetunFragment_ViewBinding.e;
            SumberDanaPilihIdentitasSetunFragment_ViewBinding.read read2 = read;
            if (read == null) {
                read2 = SumberDanaPilihIdentitasSetunFragment_ViewBinding.a(this);
            }
            if (read2 == SumberDanaPilihIdentitasSetunFragment_ViewBinding.b) {
                str = null;
            } else {
                Method method = read2.b;
                Object invoke = method != null ? method.invoke(getClass(), new Object[0]) : null;
                if (invoke == null) {
                    str = null;
                } else {
                    Method method2 = read2.c;
                    Object invoke2 = method2 != null ? method2.invoke(invoke, new Object[0]) : null;
                    if (invoke2 == null) {
                        str = null;
                    } else {
                        Method method3 = read2.a;
                        Object invoke3 = method3 != null ? method3.invoke(invoke2, new Object[0]) : null;
                        str = null;
                        if (invoke3 instanceof String) {
                            str = (String) invoke3;
                        }
                    }
                }
            }
            if (str == null) {
                str2 = annotation.d();
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append('/');
                sb.append(annotation.d());
                str2 = sb.toString();
            }
            return new StackTraceElement(str2, annotation.b(), annotation.e(), i);
        }
        StringBuilder sb2 = new StringBuilder("Debug metadata version mismatch. Expected: ");
        sb2.append(1);
        sb2.append(", got ");
        sb2.append(a);
        sb2.append(". Please update the Kotlin standard library.");
        throw new IllegalStateException(sb2.toString().toString());
    }

    protected abstract Object invokeSuspend(Object obj);

    protected void releaseIntercepted() {
    }

    @Override // o.ProsesTarikanFragment
    public final void resumeWith(Object obj) {
        Object invokeSuspend;
        ProsesTarikanFragment<Object> prosesTarikanFragment = this;
        do {
            subscribeReservationRescheduleEvent.e(prosesTarikanFragment, "");
            ReviewSetoranUbahFragment_ViewBinding reviewSetoranUbahFragment_ViewBinding = (ReviewSetoranUbahFragment_ViewBinding) prosesTarikanFragment;
            prosesTarikanFragment = reviewSetoranUbahFragment_ViewBinding.completion;
            subscribeReservationRescheduleEvent.c(prosesTarikanFragment);
            try {
                invokeSuspend = reviewSetoranUbahFragment_ViewBinding.invokeSuspend(obj);
            } catch (Throwable th) {
                Page6KLFragment$MediaBrowserCompat$CustomActionResultReceiver page6KLFragment$MediaBrowserCompat$CustomActionResultReceiver = Page6KLFragment.a;
                subscribeReservationRescheduleEvent.e(th, "");
                obj = Page6KLFragment.d(new Page6KLFragment.IconCompatParcelizer(th));
            }
            if (invokeSuspend != ReviewSetoranFragment_ViewBinding.COROUTINE_SUSPENDED) {
                Page6KLFragment$MediaBrowserCompat$CustomActionResultReceiver page6KLFragment$MediaBrowserCompat$CustomActionResultReceiver2 = Page6KLFragment.a;
                obj = Page6KLFragment.d(invokeSuspend);
                reviewSetoranUbahFragment_ViewBinding.releaseIntercepted();
            } else {
                return;
            }
        } while (prosesTarikanFragment instanceof ReviewSetoranUbahFragment_ViewBinding);
        prosesTarikanFragment.resumeWith(obj);
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        StackTraceElement stackTraceElement = getStackTraceElement();
        Serializable serializable = stackTraceElement;
        if (stackTraceElement == null) {
            serializable = getClass().getName();
        }
        sb.append(serializable);
        return sb.toString();
    }
}
