package o;

import androidx.lifecycle.LiveData;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.concurrent.Executor;
import o.SubmitBankNotesResponse;
import o.subscribeTransaksiBatalEvent;
/* loaded from: classes-dex2jar.jar:o/getNotes.class */
public final class getNotes {
    private static final Object c = new Object();

    /* loaded from: classes-dex2jar.jar:o/getNotes$IconCompatParcelizer.class */
    public static final class IconCompatParcelizer extends subscribeDraftTxnBerkalaEvent implements onClickInfo<T, T, Boolean> {
        public static final IconCompatParcelizer a = new IconCompatParcelizer();

        IconCompatParcelizer() {
            super(2);
        }

        @Override // o.onClickInfo
        public final /* synthetic */ Boolean invoke(Object obj, Object obj2) {
            return Boolean.valueOf(subscribeReservationRescheduleEvent.b(obj, obj2));
        }
    }

    public static /* synthetic */ void a(Executor executor, subscribeTransaksiBatalEvent.MediaBrowserCompat.CustomActionResultReceiver customActionResultReceiver, onClickInfo onclickinfo, performDetach performdetach, Object obj) {
        subscribeReservationRescheduleEvent.e(executor, "");
        subscribeReservationRescheduleEvent.e(customActionResultReceiver, "");
        subscribeReservationRescheduleEvent.e(onclickinfo, "");
        subscribeReservationRescheduleEvent.e(performdetach, "");
        executor.execute(new Runnable(customActionResultReceiver, onclickinfo, obj, performdetach) { // from class: o.SubmitBankNotesResponse
            public final /* synthetic */ performDetach a;
            public final /* synthetic */ subscribeTransaksiBatalEvent.MediaBrowserCompat.CustomActionResultReceiver b;
            public final /* synthetic */ onClickInfo d;
            public final /* synthetic */ Object e;

            /* loaded from: classes-dex2jar.jar:o/SubmitBankNotesResponse$SubmitBankNotesDataOutput.class */
            public final class SubmitBankNotesDataOutput {
                public static final SubmitBankNotesDataOutput b = new SubmitBankNotesDataOutput();
                private static final onChooseValueSumberPenghasilan d;

                /* loaded from: classes-dex2jar.jar:o/SubmitBankNotesResponse$SubmitBankNotesDataOutput$RemoteActionCompatParcelizer.class */
                static final class RemoteActionCompatParcelizer extends subscribeDraftTxnBerkalaEvent implements pilihNoRek<BN5PilihNomorOTPFragment_ViewBinding> {
                    public static final RemoteActionCompatParcelizer d = new RemoteActionCompatParcelizer();

                    RemoteActionCompatParcelizer() {
                        super(0);
                    }

                    @Override // o.pilihNoRek
                    public final /* synthetic */ BN5PilihNomorOTPFragment_ViewBinding invoke() {
                        subscribeCancelBankNotesEvent subscribecancelbanknotesevent;
                        subscribeCancelBankNotesEvent subscribecancelbanknotesevent2;
                        subscribeCancelBankNotesEvent subscribecancelbanknotesevent3;
                        BN5PilihRekeningFragment bN5PilihRekeningFragment = new BN5PilihRekeningFragment();
                        bN5PilihRekeningFragment.d = false;
                        bN5PilihRekeningFragment.n = true;
                        bN5PilihRekeningFragment.m = true;
                        ArrayList arrayList = new ArrayList(bN5PilihRekeningFragment.g.size() + bN5PilihRekeningFragment.j.size() + 3);
                        arrayList.addAll(bN5PilihRekeningFragment.g);
                        Collections.reverse(arrayList);
                        ArrayList arrayList2 = new ArrayList(bN5PilihRekeningFragment.j);
                        Collections.reverse(arrayList2);
                        arrayList.addAll(arrayList2);
                        String str = bN5PilihRekeningFragment.e;
                        int i = bN5PilihRekeningFragment.c;
                        int i2 = bN5PilihRekeningFragment.t;
                        if (str == null || "".equals(str.trim())) {
                            if (!(i == 2 || i2 == 2)) {
                                subscribecancelbanknotesevent3 = new subscribeCancelBankNotesEvent(Date.class, i, i2);
                                subscribecancelbanknotesevent = new subscribeCancelBankNotesEvent(Timestamp.class, i, i2);
                                subscribecancelbanknotesevent2 = new subscribeCancelBankNotesEvent(java.sql.Date.class, i, i2);
                            }
                            return new BN5PilihNomorOTPFragment_ViewBinding(bN5PilihRekeningFragment.b, bN5PilihRekeningFragment.h, bN5PilihRekeningFragment.f, bN5PilihRekeningFragment.n, bN5PilihRekeningFragment.a, bN5PilihRekeningFragment.i, bN5PilihRekeningFragment.d, bN5PilihRekeningFragment.m, bN5PilihRekeningFragment.o, bN5PilihRekeningFragment.k, bN5PilihRekeningFragment.l, bN5PilihRekeningFragment.e, bN5PilihRekeningFragment.c, bN5PilihRekeningFragment.t, bN5PilihRekeningFragment.g, bN5PilihRekeningFragment.j, arrayList);
                        }
                        subscribecancelbanknotesevent3 = new subscribeCancelBankNotesEvent(Date.class, str);
                        subscribecancelbanknotesevent = new subscribeCancelBankNotesEvent(Timestamp.class, str);
                        subscribecancelbanknotesevent2 = new subscribeCancelBankNotesEvent(java.sql.Date.class, str);
                        arrayList.add(showStatusTempatTinggalDialog.e(Date.class, subscribecancelbanknotesevent3));
                        arrayList.add(showStatusTempatTinggalDialog.e(Timestamp.class, subscribecancelbanknotesevent));
                        arrayList.add(showStatusTempatTinggalDialog.e(java.sql.Date.class, subscribecancelbanknotesevent2));
                        return new BN5PilihNomorOTPFragment_ViewBinding(bN5PilihRekeningFragment.b, bN5PilihRekeningFragment.h, bN5PilihRekeningFragment.f, bN5PilihRekeningFragment.n, bN5PilihRekeningFragment.a, bN5PilihRekeningFragment.i, bN5PilihRekeningFragment.d, bN5PilihRekeningFragment.m, bN5PilihRekeningFragment.o, bN5PilihRekeningFragment.k, bN5PilihRekeningFragment.l, bN5PilihRekeningFragment.e, bN5PilihRekeningFragment.c, bN5PilihRekeningFragment.t, bN5PilihRekeningFragment.g, bN5PilihRekeningFragment.j, arrayList);
                    }
                }

                static {
                    RemoteActionCompatParcelizer remoteActionCompatParcelizer = RemoteActionCompatParcelizer.d;
                    subscribeReservationRescheduleEvent.e(remoteActionCompatParcelizer, "");
                    d = new Page6KLFragment_ViewBinding(remoteActionCompatParcelizer, null, 2);
                }

                private SubmitBankNotesDataOutput() {
                }

                public static BN5PilihNomorOTPFragment_ViewBinding c() {
                    Object d2 = d.d();
                    subscribeReservationRescheduleEvent.d(d2, "");
                    return (BN5PilihNomorOTPFragment_ViewBinding) d2;
                }
            }

            /* loaded from: classes-dex2jar.jar:o/SubmitBankNotesResponse$SubmitBankNotesDescription.class */
            public final /* synthetic */ class SubmitBankNotesDescription implements performLowMemory {
                public final /* synthetic */ subscribeTransaksiBatalEvent.MediaBrowserCompat.CustomActionResultReceiver a;
                public final /* synthetic */ subscribeTransaksiBatalEvent.MediaBrowserCompat.CustomActionResultReceiver c;
                public final /* synthetic */ onClickInfo d;
                public final /* synthetic */ performDetach e;

                public /* synthetic */ SubmitBankNotesDescription(subscribeTransaksiBatalEvent.MediaBrowserCompat.CustomActionResultReceiver customActionResultReceiver, subscribeTransaksiBatalEvent.MediaBrowserCompat.CustomActionResultReceiver customActionResultReceiver2, performDetach performdetach, onClickInfo onclickinfo) {
                    this.c = customActionResultReceiver;
                    this.a = customActionResultReceiver2;
                    this.e = performdetach;
                    this.d = onclickinfo;
                }

                @Override // o.performLowMemory
                public final void e(Object obj) {
                    getNotes.b(this.c, this.a, this.e, this.d, obj);
                }
            }

            {
                this.b = r4;
                this.d = r5;
                this.e = r6;
                this.a = r7;
            }

            @Override // java.lang.Runnable
            public final void run() {
                getNotes.d(this.b, this.d, this.e, this.a);
            }
        });
    }

    public static final <T1, T2> LiveData<showSumberPenghasilanDialog<T1, T2>> b(LiveData<T1> liveData, LiveData<T2> liveData2) {
        subscribeReservationRescheduleEvent.e(liveData, "");
        subscribeReservationRescheduleEvent.e(liveData2, "");
        return d(liveData, liveData2, getNotes$MediaBrowserCompat$CustomActionResultReceiver.b);
    }

    public static /* synthetic */ void b(subscribeTransaksiBatalEvent.MediaBrowserCompat.CustomActionResultReceiver customActionResultReceiver, subscribeTransaksiBatalEvent.MediaBrowserCompat.CustomActionResultReceiver customActionResultReceiver2, performDetach performdetach, onClickInfo onclickinfo, Object obj) {
        subscribeReservationRescheduleEvent.e(customActionResultReceiver, "");
        subscribeReservationRescheduleEvent.e(customActionResultReceiver2, "");
        subscribeReservationRescheduleEvent.e(performdetach, "");
        subscribeReservationRescheduleEvent.e(onclickinfo, "");
        customActionResultReceiver.b = obj;
        Object obj2 = customActionResultReceiver2.b;
        if (obj == null) {
            Object obj3 = performdetach.c;
            if (obj3 == LiveData.e) {
                obj3 = null;
            }
            if (obj3 != null) {
                performdetach.a(null);
                return;
            }
        }
        if (obj != null && obj2 != null) {
            performdetach.a(onclickinfo.invoke(obj, obj2));
        }
    }

    public static /* synthetic */ LiveData c(LiveData liveData, Executor executor, onClickInfo onclickinfo, int i) {
        if ((i & 1) != 0) {
            executor = setQueryHint.e();
            subscribeReservationRescheduleEvent.d(executor, "");
        }
        if ((i & 2) != 0) {
            onclickinfo = IconCompatParcelizer.a;
        }
        subscribeReservationRescheduleEvent.e(liveData, "");
        subscribeReservationRescheduleEvent.e(executor, "");
        subscribeReservationRescheduleEvent.e(onclickinfo, "");
        performDetach performdetach = new performDetach();
        subscribeTransaksiBatalEvent.MediaBrowserCompat.CustomActionResultReceiver customActionResultReceiver = new subscribeTransaksiBatalEvent.MediaBrowserCompat.CustomActionResultReceiver();
        customActionResultReceiver.b = c;
        performdetach.d(liveData, new performLowMemory(executor, customActionResultReceiver, onclickinfo, performdetach) { // from class: o.SubmitBankNotesResponse$$Parcelable
            public final /* synthetic */ onClickInfo a;
            public final /* synthetic */ performDetach b;
            public final /* synthetic */ subscribeTransaksiBatalEvent.MediaBrowserCompat.CustomActionResultReceiver c;
            public final /* synthetic */ Executor e;

            {
                this.e = r4;
                this.c = r5;
                this.a = r6;
                this.b = r7;
            }

            @Override // o.performLowMemory
            public final void e(Object obj) {
                getNotes.a(this.e, this.c, this.a, this.b, obj);
            }
        });
        return performdetach;
    }

    public static final <T1, T2, R> LiveData<R> d(LiveData<T1> liveData, LiveData<T2> liveData2, onClickInfo<? super T1, ? super T2, ? extends R> onclickinfo) {
        subscribeReservationRescheduleEvent.e(liveData, "");
        subscribeReservationRescheduleEvent.e(liveData2, "");
        subscribeReservationRescheduleEvent.e(onclickinfo, "");
        performDetach performdetach = new performDetach();
        subscribeTransaksiBatalEvent.MediaBrowserCompat.CustomActionResultReceiver customActionResultReceiver = new subscribeTransaksiBatalEvent.MediaBrowserCompat.CustomActionResultReceiver();
        subscribeTransaksiBatalEvent.MediaBrowserCompat.CustomActionResultReceiver customActionResultReceiver2 = new subscribeTransaksiBatalEvent.MediaBrowserCompat.CustomActionResultReceiver();
        performdetach.d(liveData, new SubmitBankNotesResponse.SubmitBankNotesDescription(customActionResultReceiver, customActionResultReceiver2, performdetach, onclickinfo));
        performdetach.d(liveData2, new performLowMemory(customActionResultReceiver2, customActionResultReceiver, performdetach, onclickinfo) { // from class: o.SubmitBankNotesResponse$SubmitBankNotesDataOutput$$Parcelable
            public final /* synthetic */ performDetach a;
            public final /* synthetic */ subscribeTransaksiBatalEvent.MediaBrowserCompat.CustomActionResultReceiver c;
            public final /* synthetic */ subscribeTransaksiBatalEvent.MediaBrowserCompat.CustomActionResultReceiver d;
            public final /* synthetic */ onClickInfo e;

            {
                this.c = r4;
                this.d = r5;
                this.a = r6;
                this.e = r7;
            }

            @Override // o.performLowMemory
            public final void e(Object obj) {
                getNotes.d(this.c, this.d, this.a, this.e, obj);
            }
        });
        return performdetach;
    }

    public static /* synthetic */ void d(subscribeTransaksiBatalEvent.MediaBrowserCompat.CustomActionResultReceiver customActionResultReceiver, onClickInfo onclickinfo, Object obj, performDetach performdetach) {
        subscribeReservationRescheduleEvent.e(customActionResultReceiver, "");
        subscribeReservationRescheduleEvent.e(onclickinfo, "");
        subscribeReservationRescheduleEvent.e(performdetach, "");
        if (customActionResultReceiver.b == c || !((Boolean) onclickinfo.invoke(customActionResultReceiver.b, obj)).booleanValue()) {
            customActionResultReceiver.b = obj;
            performdetach.d((performDetach) obj);
        }
    }

    public static /* synthetic */ void d(subscribeTransaksiBatalEvent.MediaBrowserCompat.CustomActionResultReceiver customActionResultReceiver, subscribeTransaksiBatalEvent.MediaBrowserCompat.CustomActionResultReceiver customActionResultReceiver2, performDetach performdetach, onClickInfo onclickinfo, Object obj) {
        subscribeReservationRescheduleEvent.e(customActionResultReceiver, "");
        subscribeReservationRescheduleEvent.e(customActionResultReceiver2, "");
        subscribeReservationRescheduleEvent.e(performdetach, "");
        subscribeReservationRescheduleEvent.e(onclickinfo, "");
        customActionResultReceiver.b = obj;
        Object obj2 = customActionResultReceiver2.b;
        if (obj == null) {
            Object obj3 = performdetach.c;
            if (obj3 == LiveData.e) {
                obj3 = null;
            }
            if (obj3 != null) {
                performdetach.a(null);
                return;
            }
        }
        if (obj2 != null && obj != null) {
            performdetach.a(onclickinfo.invoke(obj2, obj));
        }
    }
}
