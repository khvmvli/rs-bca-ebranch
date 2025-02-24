package o;

import io.realm.RealmFieldTypeConstants;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* loaded from: classes2-dex2jar.jar:o/setRequestBodyPlainText.class */
public final class setRequestBodyPlainText {
    static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(setRequestBodyPlainText.class, Object.class, "lastScheduledTask");
    private static final /* synthetic */ AtomicIntegerFieldUpdater d = AtomicIntegerFieldUpdater.newUpdater(setRequestBodyPlainText.class, "producerIndex");
    private static final /* synthetic */ AtomicIntegerFieldUpdater e = AtomicIntegerFieldUpdater.newUpdater(setRequestBodyPlainText.class, "consumerIndex");
    private static final /* synthetic */ AtomicIntegerFieldUpdater c = AtomicIntegerFieldUpdater.newUpdater(setRequestBodyPlainText.class, "blockingTasksInBuffer");
    private final AtomicReferenceArray<setMethod> a = new AtomicReferenceArray<>((int) RealmFieldTypeConstants.LIST_OFFSET);
    volatile /* synthetic */ Object lastScheduledTask = null;
    volatile /* synthetic */ int producerIndex = 0;
    volatile /* synthetic */ int consumerIndex = 0;
    private volatile /* synthetic */ int blockingTasksInBuffer = 0;

    private final setMethod a(setMethod setmethod) {
        boolean z = true;
        if (setmethod.g.a() != 1) {
            z = false;
        }
        if (z) {
            c.incrementAndGet(this);
        }
        if (this.producerIndex - this.consumerIndex == 127) {
            return setmethod;
        }
        int i = this.producerIndex & 127;
        while (this.a.get(i) != null) {
            Thread.yield();
        }
        this.a.lazySet(i, setmethod);
        d.incrementAndGet(this);
        return null;
    }

    private final long d(setRequestBodyPlainText setrequestbodyplaintext, boolean z) {
        setMethod setmethod;
        boolean z2;
        do {
            setmethod = (setMethod) setrequestbodyplaintext.lastScheduledTask;
            if (setmethod != null) {
                z2 = true;
                if (z) {
                    if (!(setmethod.g.a() == 1)) {
                        return -2;
                    }
                }
                long a = setRequestContentType.f.a() - setmethod.j;
                if (a >= setRequestContentType.d) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
                    while (true) {
                        if (!atomicReferenceFieldUpdater.compareAndSet(setrequestbodyplaintext, setmethod, null)) {
                            if (atomicReferenceFieldUpdater.get(setrequestbodyplaintext) != setmethod) {
                                z2 = false;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                } else {
                    return setRequestContentType.d - a;
                }
            } else {
                return -2;
            }
        } while (!z2);
        c(setmethod, false);
        return -1;
    }

    public final long c(setRequestBodyPlainText setrequestbodyplaintext) {
        if (RateTransactionPresenter.c()) {
            if (!(this.producerIndex - this.consumerIndex == 0)) {
                throw new AssertionError();
            }
        }
        int i = setrequestbodyplaintext.producerIndex;
        AtomicReferenceArray<setMethod> atomicReferenceArray = setrequestbodyplaintext.a;
        for (int i2 = setrequestbodyplaintext.consumerIndex; i2 != i; i2++) {
            int i3 = i2 & 127;
            if (setrequestbodyplaintext.blockingTasksInBuffer == 0) {
                break;
            }
            setMethod setmethod = atomicReferenceArray.get(i3);
            if (setmethod != null) {
                if ((setmethod.g.a() == 1) && InquiryEditDataORPresenter.b(atomicReferenceArray, i3, setmethod, null)) {
                    c.decrementAndGet(setrequestbodyplaintext);
                    c(setmethod, false);
                    return -1;
                }
            }
        }
        return d(setrequestbodyplaintext, true);
    }

    public final setMethod c(setMethod setmethod, boolean z) {
        if (z) {
            return a(setmethod);
        }
        setMethod setmethod2 = (setMethod) b.getAndSet(this, setmethod);
        if (setmethod2 == null) {
            return null;
        }
        return a(setmethod2);
    }

    public final void c(isResponseBodyPlainText isresponsebodyplaintext) {
        boolean z;
        setMethod setmethod = (setMethod) b.getAndSet(this, null);
        if (setmethod != null) {
            isresponsebodyplaintext.b(setmethod);
        }
        do {
            setMethod e2 = e();
            if (e2 == null) {
                z = false;
            } else {
                isresponsebodyplaintext.b(e2);
                z = true;
            }
        } while (z);
    }

    public final setMethod d() {
        setMethod setmethod = (setMethod) b.getAndSet(this, null);
        setMethod setmethod2 = setmethod;
        if (setmethod == null) {
            setmethod2 = e();
        }
        return setmethod2;
    }

    public final long e(setRequestBodyPlainText setrequestbodyplaintext) {
        boolean z = true;
        if (RateTransactionPresenter.c()) {
            if (!(this.producerIndex - this.consumerIndex == 0)) {
                throw new AssertionError();
            }
        }
        setMethod e2 = setrequestbodyplaintext.e();
        if (e2 == null) {
            return d(setrequestbodyplaintext, false);
        }
        setMethod c2 = c(e2, false);
        if (!RateTransactionPresenter.c()) {
            return -1;
        }
        if (c2 != null) {
            z = false;
        }
        if (z) {
            return -1;
        }
        throw new AssertionError();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final setMethod e() {
        setMethod andSet;
        while (true) {
            int i = this.consumerIndex;
            if (i - this.producerIndex == 0) {
                return null;
            }
            if (e.compareAndSet(this, i, i + 1) && (andSet = this.a.getAndSet(i & 127, null)) != null) {
                if (andSet != null) {
                    boolean z = false;
                    if (andSet.g.a() == 1) {
                        int decrementAndGet = c.decrementAndGet(this);
                        if (RateTransactionPresenter.c()) {
                            if (decrementAndGet >= 0) {
                                z = true;
                            }
                            if (!z) {
                                throw new AssertionError();
                            }
                        }
                    }
                }
                return andSet;
            }
        }
    }
}
