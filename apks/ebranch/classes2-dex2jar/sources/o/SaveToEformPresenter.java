package o;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* loaded from: classes2-dex2jar.jar:o/SaveToEformPresenter.class */
public abstract class SaveToEformPresenter extends SendEmailActPresenter {
    private static final /* synthetic */ AtomicReferenceFieldUpdater g = AtomicReferenceFieldUpdater.newUpdater(SaveToEformPresenter.class, Object.class, "_queue");
    private static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(SaveToEformPresenter.class, Object.class, "_delayed");
    private volatile /* synthetic */ Object _queue = null;
    private volatile /* synthetic */ Object _delayed = null;
    private volatile /* synthetic */ int _isCompleted = 0;

    /* loaded from: classes2-dex2jar.jar:o/SaveToEformPresenter$IconCompatParcelizer.class */
    public static final class IconCompatParcelizer extends getUrl$com_github_ChuckerTeam_Chucker_library<SaveToEformPresenter$MediaBrowserCompat$CustomActionResultReceiver> {
        public long a;

        public IconCompatParcelizer(long j) {
            this.a = j;
        }
    }

    private final boolean c(Runnable runnable) {
        while (true) {
            Object obj = this._queue;
            boolean z = false;
            if (this._isCompleted != 0) {
                return false;
            }
            if (obj == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, null, runnable)) {
                        if (atomicReferenceFieldUpdater.get(this) != null) {
                            break;
                        }
                    } else {
                        z = true;
                        break;
                    }
                }
                if (z) {
                    return true;
                }
            } else if (obj instanceof getResponseDateString$com_github_ChuckerTeam_Chucker_library) {
                if (obj != null) {
                    getResponseDateString$com_github_ChuckerTeam_Chucker_library getresponsedatestring_com_github_chuckerteam_chucker_library = (getResponseDateString$com_github_ChuckerTeam_Chucker_library) obj;
                    int a2 = getresponsedatestring_com_github_chuckerteam_chucker_library.a(runnable);
                    if (a2 == 0) {
                        return true;
                    }
                    if (a2 == 1) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = g;
                        getResponseDateString$com_github_ChuckerTeam_Chucker_library e = getresponsedatestring_com_github_chuckerteam_chucker_library.e(getresponsedatestring_com_github_chuckerteam_chucker_library.c());
                        while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, e) && atomicReferenceFieldUpdater2.get(this) == obj) {
                        }
                    } else if (a2 == 2) {
                        return false;
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }>{ kotlinx.coroutines.EventLoop_commonKt.Queue<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }> }");
                }
            } else if (obj == SubmitKliringCompletePresenter.d) {
                return false;
            } else {
                getResponseDateString$com_github_ChuckerTeam_Chucker_library getresponsedatestring_com_github_chuckerteam_chucker_library2 = new getResponseDateString$com_github_ChuckerTeam_Chucker_library(8, true);
                if (obj != null) {
                    getresponsedatestring_com_github_chuckerteam_chucker_library2.a((Runnable) obj);
                    getresponsedatestring_com_github_chuckerteam_chucker_library2.a(runnable);
                    if (InquiryEditDataORPresenter.e(g, this, obj, getresponsedatestring_com_github_chuckerteam_chucker_library2)) {
                        return true;
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                }
            }
        }
    }

    private final void o() {
        GetAcctOpeningCategoryDataPresenter getAcctOpeningCategoryDataPresenter = ForgotEmailPassPresenter.e;
        long nanoTime = getAcctOpeningCategoryDataPresenter == null ? System.nanoTime() : getAcctOpeningCategoryDataPresenter.c();
        while (true) {
            IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) this._delayed;
            SaveToEformPresenter$MediaBrowserCompat$CustomActionResultReceiver b = iconCompatParcelizer == null ? null : iconCompatParcelizer.b();
            if (b != null) {
                b(nanoTime, b);
            } else {
                return;
            }
        }
    }

    @Override // o.SendEmailTransactionSuccessPresenter
    protected final long a() {
        long nanoTime = 0;
        if (a() == 0) {
            return 0;
        }
        Object obj = this._queue;
        if (obj != null) {
            if (!(obj instanceof getResponseDateString$com_github_ChuckerTeam_Chucker_library)) {
                return obj == SubmitKliringCompletePresenter.d ? Long.MAX_VALUE : 0;
            }
            long j = ((getResponseDateString$com_github_ChuckerTeam_Chucker_library) obj)._state;
            boolean z = false;
            if (((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30))) {
                z = true;
            }
            if (!z) {
                return 0;
            }
        }
        IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) this._delayed;
        SaveToEformPresenter$MediaBrowserCompat$CustomActionResultReceiver d = iconCompatParcelizer == null ? null : iconCompatParcelizer.d();
        if (d == null) {
            return Long.MAX_VALUE;
        }
        long j2 = d.c;
        GetAcctOpeningCategoryDataPresenter getAcctOpeningCategoryDataPresenter = ForgotEmailPassPresenter.e;
        nanoTime = j2 - (getAcctOpeningCategoryDataPresenter == null ? System.nanoTime() : getAcctOpeningCategoryDataPresenter.c());
        if (nanoTime < 0) {
        }
        return nanoTime;
    }

    public final void c(long j, SaveToEformPresenter$MediaBrowserCompat$CustomActionResultReceiver saveToEformPresenter$MediaBrowserCompat$CustomActionResultReceiver) {
        int i;
        SaveToEformPresenter$MediaBrowserCompat$CustomActionResultReceiver saveToEformPresenter$MediaBrowserCompat$CustomActionResultReceiver2 = null;
        boolean z = true;
        if (this._isCompleted != 0) {
            i = 1;
        } else {
            IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) this._delayed;
            IconCompatParcelizer iconCompatParcelizer2 = iconCompatParcelizer;
            if (iconCompatParcelizer == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
                IconCompatParcelizer iconCompatParcelizer3 = new IconCompatParcelizer(j);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, iconCompatParcelizer3) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj = this._delayed;
                subscribeReservationRescheduleEvent.c(obj);
                iconCompatParcelizer2 = (IconCompatParcelizer) obj;
            }
            i = saveToEformPresenter$MediaBrowserCompat$CustomActionResultReceiver.d(j, iconCompatParcelizer2, this);
        }
        if (i == 0) {
            IconCompatParcelizer iconCompatParcelizer4 = (IconCompatParcelizer) this._delayed;
            if (iconCompatParcelizer4 != null) {
                saveToEformPresenter$MediaBrowserCompat$CustomActionResultReceiver2 = iconCompatParcelizer4.d();
            }
            if (saveToEformPresenter$MediaBrowserCompat$CustomActionResultReceiver2 != saveToEformPresenter$MediaBrowserCompat$CustomActionResultReceiver) {
                z = false;
            }
            if (z) {
                n();
            }
        } else if (i == 1) {
            b(j, saveToEformPresenter$MediaBrowserCompat$CustomActionResultReceiver);
        } else if (i != 2) {
            throw new IllegalStateException("unexpected result".toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005d, code lost:
        if (((int) (1073741823 & r0)) == ((int) ((r0 & 1152921503533105152L) >> 30))) goto L_0x006d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0067, code lost:
        if (r0 != o.SubmitKliringCompletePresenter.d) goto L_0x006f;
     */
    @Override // o.SendEmailTransactionSuccessPresenter
    /* Code decompiled incorrectly, please refer to instructions dump */
    protected final boolean c() {
        /*
            r6 = this;
            r0 = r6
            boolean r0 = r0.j()
            r7 = r0
            r0 = 0
            r8 = r0
            r0 = r7
            if (r0 != 0) goto L_0x000d
            r0 = 0
            return r0
        L_0x000d:
            r0 = r6
            java.lang.Object r0 = r0._delayed
            o.SaveToEformPresenter$IconCompatParcelizer r0 = (o.SaveToEformPresenter.IconCompatParcelizer) r0
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L_0x0030
            r0 = r9
            int r0 = r0._size
            if (r0 != 0) goto L_0x0026
            r0 = 1
            r10 = r0
            goto L_0x0029
        L_0x0026:
            r0 = 0
            r10 = r0
        L_0x0029:
            r0 = r10
            if (r0 != 0) goto L_0x0030
            r0 = 0
            return r0
        L_0x0030:
            r0 = r6
            java.lang.Object r0 = r0._queue
            r9 = r0
            r0 = r9
            if (r0 != 0) goto L_0x003c
            goto L_0x006d
        L_0x003c:
            r0 = r9
            boolean r0 = r0 instanceof o.getResponseDateString$com_github_ChuckerTeam_Chucker_library
            if (r0 == 0) goto L_0x0063
            r0 = r9
            o.getResponseDateString$com_github_ChuckerTeam_Chucker_library r0 = (o.getResponseDateString$com_github_ChuckerTeam_Chucker_library) r0
            long r0 = r0._state
            r11 = r0
            r0 = 1073741823(0x3fffffff, double:5.304989472E-315)
            r1 = r11
            long r0 = r0 & r1
            int r0 = (int) r0
            r1 = r11
            r2 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r1 = r1 & r2
            r2 = 30
            long r1 = r1 >> r2
            int r1 = (int) r1
            if (r0 != r1) goto L_0x006f
            goto L_0x006d
        L_0x0063:
            r0 = r9
            o.getScheme$com_github_ChuckerTeam_Chucker_library r1 = o.SubmitKliringCompletePresenter.a()
            if (r0 == r1) goto L_0x006d
            goto L_0x006f
        L_0x006d:
            r0 = 1
            r8 = r0
        L_0x006f:
            r0 = r8
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.SaveToEformPresenter.c():boolean");
    }

    public final void d(Runnable runnable) {
        SaveToEformPresenter saveToEformPresenter = this;
        while (!saveToEformPresenter.c(runnable)) {
            saveToEformPresenter = RequestOTPPresenter.a;
        }
        saveToEformPresenter.n();
    }

    @Override // o.InquiryLoadDataBTPresenter
    public final void d(ProsesTarikanFragment_ViewBinding prosesTarikanFragment_ViewBinding, Runnable runnable) {
        if (c(runnable)) {
            n();
        } else {
            RequestOTPPresenter.a.d(runnable);
        }
    }

    @Override // o.SendEmailTransactionSuccessPresenter
    public final long h() {
        Runnable runnable;
        SaveToEformPresenter$MediaBrowserCompat$CustomActionResultReceiver saveToEformPresenter$MediaBrowserCompat$CustomActionResultReceiver;
        if (f()) {
            return 0;
        }
        IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) this._delayed;
        if (iconCompatParcelizer != null) {
            if (!(iconCompatParcelizer._size == 0)) {
                GetAcctOpeningCategoryDataPresenter getAcctOpeningCategoryDataPresenter = ForgotEmailPassPresenter.e;
                long nanoTime = getAcctOpeningCategoryDataPresenter == null ? System.nanoTime() : getAcctOpeningCategoryDataPresenter.c();
                do {
                    IconCompatParcelizer iconCompatParcelizer2 = iconCompatParcelizer;
                    synchronized (iconCompatParcelizer2) {
                        Object[] objArr = iconCompatParcelizer2.d;
                        Object obj = objArr == null ? null : objArr[0];
                        if (obj == null) {
                            saveToEformPresenter$MediaBrowserCompat$CustomActionResultReceiver = null;
                        } else {
                            SaveToEformPresenter$MediaBrowserCompat$CustomActionResultReceiver saveToEformPresenter$MediaBrowserCompat$CustomActionResultReceiver2 = (SaveToEformPresenter$MediaBrowserCompat$CustomActionResultReceiver) obj;
                            saveToEformPresenter$MediaBrowserCompat$CustomActionResultReceiver = ((nanoTime - saveToEformPresenter$MediaBrowserCompat$CustomActionResultReceiver2.c) > 0 ? 1 : ((nanoTime - saveToEformPresenter$MediaBrowserCompat$CustomActionResultReceiver2.c) == 0 ? 0 : -1)) >= 0 ? c(saveToEformPresenter$MediaBrowserCompat$CustomActionResultReceiver2) : false ? iconCompatParcelizer2.b(0) : null;
                        }
                    }
                } while (saveToEformPresenter$MediaBrowserCompat$CustomActionResultReceiver != null);
            }
        }
        while (true) {
            Object obj2 = this._queue;
            if (obj2 == null) {
                runnable = null;
                break;
            } else if (obj2 instanceof getResponseDateString$com_github_ChuckerTeam_Chucker_library) {
                if (obj2 != null) {
                    getResponseDateString$com_github_ChuckerTeam_Chucker_library getresponsedatestring_com_github_chuckerteam_chucker_library = (getResponseDateString$com_github_ChuckerTeam_Chucker_library) obj2;
                    Object b = getresponsedatestring_com_github_chuckerteam_chucker_library.b();
                    if (b != getResponseDateString$com_github_ChuckerTeam_Chucker_library.c) {
                        runnable = (Runnable) b;
                        break;
                    }
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g;
                    getResponseDateString$com_github_ChuckerTeam_Chucker_library e = getresponsedatestring_com_github_chuckerteam_chucker_library.e(getresponsedatestring_com_github_chuckerteam_chucker_library.c());
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, e) && atomicReferenceFieldUpdater.get(this) == obj2) {
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }>{ kotlinx.coroutines.EventLoop_commonKt.Queue<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }> }");
                }
            } else if (obj2 == SubmitKliringCompletePresenter.d) {
                runnable = null;
                break;
            } else if (InquiryEditDataORPresenter.e(g, this, obj2, null)) {
                if (obj2 != null) {
                    runnable = (Runnable) obj2;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                }
            }
        }
        if (runnable == null) {
            return a();
        }
        runnable.run();
        return 0;
    }

    @Override // o.SendEmailTransactionSuccessPresenter
    protected final void i() {
        HttpTransaction httpTransaction = HttpTransaction.b;
        HttpTransaction.c();
        this._isCompleted = 1;
        if (!RateTransactionPresenter.c() || this._isCompleted != 0) {
            while (true) {
                Object obj = this._queue;
                if (obj != null) {
                    if (!(obj instanceof getResponseDateString$com_github_ChuckerTeam_Chucker_library)) {
                        if (obj == SubmitKliringCompletePresenter.d) {
                            break;
                        }
                        getResponseDateString$com_github_ChuckerTeam_Chucker_library getresponsedatestring_com_github_chuckerteam_chucker_library = new getResponseDateString$com_github_ChuckerTeam_Chucker_library(8, true);
                        if (obj != null) {
                            getresponsedatestring_com_github_chuckerteam_chucker_library.a((Runnable) obj);
                            if (InquiryEditDataORPresenter.e(g, this, obj, getresponsedatestring_com_github_chuckerteam_chucker_library)) {
                                break;
                            }
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                        }
                    } else {
                        ((getResponseDateString$com_github_ChuckerTeam_Chucker_library) obj).a();
                        break;
                    }
                } else if (InquiryEditDataORPresenter.e(g, this, null, SubmitKliringCompletePresenter.d)) {
                    break;
                }
            }
            do {
            } while (h() <= 0);
            o();
            return;
        }
        throw new AssertionError();
    }

    protected final void l() {
        this._queue = null;
        this._delayed = null;
    }
}
