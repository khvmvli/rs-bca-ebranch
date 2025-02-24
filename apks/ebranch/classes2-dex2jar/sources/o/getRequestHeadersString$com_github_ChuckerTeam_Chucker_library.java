package o;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import o.Page6KLFragment;
/* loaded from: classes2-dex2jar.jar:o/getRequestHeadersString$com_github_ChuckerTeam_Chucker_library.class */
public final class getRequestHeadersString$com_github_ChuckerTeam_Chucker_library {
    private static final int a = c(Throwable.class, -1);
    private static final ReentrantReadWriteLock e = new ReentrantReadWriteLock();
    private static final WeakHashMap<Class<? extends Throwable>, T1TransaksiTarikanUbahFragment_ViewBinding<Throwable, Throwable>> b = new WeakHashMap<>();

    /* loaded from: classes2-dex2jar.jar:o/getRequestHeadersString$com_github_ChuckerTeam_Chucker_library$IconCompatParcelizer.class */
    public static final class IconCompatParcelizer extends subscribeDraftTxnBerkalaEvent implements T1TransaksiTarikanUbahFragment_ViewBinding<Throwable, Throwable> {
        final /* synthetic */ Constructor a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IconCompatParcelizer(Constructor constructor) {
            super(1);
            this.a = constructor;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public Throwable a(Throwable th) {
            Object obj;
            Object newInstance;
            try {
                Page6KLFragment$MediaBrowserCompat$CustomActionResultReceiver page6KLFragment$MediaBrowserCompat$CustomActionResultReceiver = Page6KLFragment.a;
                newInstance = this.a.newInstance(th);
            } catch (Throwable th2) {
                Page6KLFragment$MediaBrowserCompat$CustomActionResultReceiver page6KLFragment$MediaBrowserCompat$CustomActionResultReceiver2 = Page6KLFragment.a;
                subscribeReservationRescheduleEvent.e(th2, "");
                obj = Page6KLFragment.d(new Page6KLFragment.IconCompatParcelizer(th2));
            }
            if (newInstance != null) {
                obj = Page6KLFragment.d((Throwable) newInstance);
                Object obj2 = obj;
                if (Page6KLFragment.b(obj)) {
                    obj2 = null;
                }
                return (Throwable) obj2;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2-dex2jar.jar:o/getRequestHeadersString$com_github_ChuckerTeam_Chucker_library$MediaDescriptionCompat.class */
    public static final class MediaDescriptionCompat extends subscribeDraftTxnBerkalaEvent implements T1TransaksiTarikanUbahFragment_ViewBinding {
        public static final MediaDescriptionCompat b = new MediaDescriptionCompat();

        MediaDescriptionCompat() {
            super(1);
        }

        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            return null;
        }
    }

    /* loaded from: classes2-dex2jar.jar:o/getRequestHeadersString$com_github_ChuckerTeam_Chucker_library$RemoteActionCompatParcelizer.class */
    public static final class RemoteActionCompatParcelizer extends subscribeDraftTxnBerkalaEvent implements T1TransaksiTarikanUbahFragment_ViewBinding<Throwable, Throwable> {
        final /* synthetic */ Constructor d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RemoteActionCompatParcelizer(Constructor constructor) {
            super(1);
            this.d = constructor;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public Throwable a(Throwable th) {
            Object obj;
            Object newInstance;
            try {
                Page6KLFragment$MediaBrowserCompat$CustomActionResultReceiver page6KLFragment$MediaBrowserCompat$CustomActionResultReceiver = Page6KLFragment.a;
                newInstance = this.d.newInstance(th.getMessage(), th);
            } catch (Throwable th2) {
                Page6KLFragment$MediaBrowserCompat$CustomActionResultReceiver page6KLFragment$MediaBrowserCompat$CustomActionResultReceiver2 = Page6KLFragment.a;
                subscribeReservationRescheduleEvent.e(th2, "");
                obj = Page6KLFragment.d(new Page6KLFragment.IconCompatParcelizer(th2));
            }
            if (newInstance != null) {
                obj = Page6KLFragment.d((Throwable) newInstance);
                Object obj2 = obj;
                if (Page6KLFragment.b(obj)) {
                    obj2 = null;
                }
                return (Throwable) obj2;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
        }
    }

    /* loaded from: classes2-dex2jar.jar:o/getRequestHeadersString$com_github_ChuckerTeam_Chucker_library$read.class */
    public static final class read<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            Integer valueOf = Integer.valueOf(((Constructor) t2).getParameterTypes().length);
            Integer valueOf2 = Integer.valueOf(((Constructor) t).getParameterTypes().length);
            if (valueOf == valueOf2) {
                return 0;
            }
            if (valueOf == null) {
                return -1;
            }
            if (valueOf2 == null) {
                return 1;
            }
            return valueOf.compareTo(valueOf2);
        }
    }

    /* loaded from: classes2-dex2jar.jar:o/getRequestHeadersString$com_github_ChuckerTeam_Chucker_library$write.class */
    public static final class write extends subscribeDraftTxnBerkalaEvent implements T1TransaksiTarikanUbahFragment_ViewBinding<Throwable, Throwable> {
        final /* synthetic */ Constructor b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public write(Constructor constructor) {
            super(1);
            this.b = constructor;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public Throwable a(Throwable th) {
            Object obj;
            Object newInstance;
            try {
                Page6KLFragment$MediaBrowserCompat$CustomActionResultReceiver page6KLFragment$MediaBrowserCompat$CustomActionResultReceiver = Page6KLFragment.a;
                newInstance = this.b.newInstance(new Object[0]);
            } catch (Throwable th2) {
                Page6KLFragment$MediaBrowserCompat$CustomActionResultReceiver page6KLFragment$MediaBrowserCompat$CustomActionResultReceiver2 = Page6KLFragment.a;
                subscribeReservationRescheduleEvent.e(th2, "");
                obj = Page6KLFragment.d(new Page6KLFragment.IconCompatParcelizer(th2));
            }
            if (newInstance != null) {
                Throwable th3 = (Throwable) newInstance;
                th3.initCause(th);
                obj = Page6KLFragment.d(th3);
                Object obj2 = obj;
                if (Page6KLFragment.b(obj)) {
                    obj2 = null;
                }
                return (Throwable) obj2;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
        }
    }

    private static final int c(Class<?> cls, int i) {
        Object obj;
        int i2;
        Class<? super Object> superclass;
        subscribeReservationRescheduleEvent.e(cls, "");
        subscriberLoadDraftBankTransferEvent.a(cls);
        try {
            Page6KLFragment$MediaBrowserCompat$CustomActionResultReceiver page6KLFragment$MediaBrowserCompat$CustomActionResultReceiver = Page6KLFragment.a;
            int i3 = 0;
            do {
                int i4 = 0;
                for (Field field : cls.getDeclaredFields()) {
                    i4 = i4;
                    if (!Modifier.isStatic(field.getModifiers())) {
                        i4++;
                    }
                }
                i2 = i3 + i4;
                superclass = cls.getSuperclass();
                i3 = i2;
                cls = superclass;
            } while (superclass != null);
            obj = Page6KLFragment.d(Integer.valueOf(i2));
        } catch (Throwable th) {
            Page6KLFragment$MediaBrowserCompat$CustomActionResultReceiver page6KLFragment$MediaBrowserCompat$CustomActionResultReceiver2 = Page6KLFragment.a;
            subscribeReservationRescheduleEvent.e(th, "");
            obj = Page6KLFragment.d(new Page6KLFragment.IconCompatParcelizer(th));
        }
        Object obj2 = obj;
        if (Page6KLFragment.b(obj)) {
            obj2 = Integer.valueOf(i);
        }
        return ((Number) obj2).intValue();
    }

    /* JADX WARN: Finally extract failed */
    public static final <E extends Throwable> E c(E e2) {
        boolean z = e2 instanceof GetPPUNumberPresenter;
        E e3 = null;
        Object obj = null;
        if (z) {
            try {
                Page6KLFragment$MediaBrowserCompat$CustomActionResultReceiver page6KLFragment$MediaBrowserCompat$CustomActionResultReceiver = Page6KLFragment.a;
                obj = Page6KLFragment.d(((GetPPUNumberPresenter) e2).c());
            } catch (Throwable th) {
                Page6KLFragment$MediaBrowserCompat$CustomActionResultReceiver page6KLFragment$MediaBrowserCompat$CustomActionResultReceiver2 = Page6KLFragment.a;
                subscribeReservationRescheduleEvent.e(th, "");
                obj = Page6KLFragment.d(new Page6KLFragment.IconCompatParcelizer(th));
            }
            if (Page6KLFragment.b(obj)) {
            }
            return (E) ((Throwable) obj);
        }
        ReentrantReadWriteLock reentrantReadWriteLock = e;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        readLock.lock();
        try {
            T1TransaksiTarikanUbahFragment_ViewBinding<Throwable, Throwable> t1TransaksiTarikanUbahFragment_ViewBinding = b.get(e2.getClass());
            readLock.unlock();
            if (t1TransaksiTarikanUbahFragment_ViewBinding != null) {
                return (E) ((Throwable) t1TransaksiTarikanUbahFragment_ViewBinding.a(e2));
            }
            if (a != c(e2.getClass(), 0)) {
                ReentrantReadWriteLock.ReadLock readLock2 = reentrantReadWriteLock.readLock();
                int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
                for (int i = 0; i < readHoldCount; i++) {
                    readLock2.unlock();
                }
                ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
                writeLock.lock();
                try {
                    b.put(e2.getClass(), getRequestHeadersString$com_github_ChuckerTeam_Chucker_library$MediaBrowserCompat$MediaItem.c);
                    onCLickStatusNpwp onclickstatusnpwp = onCLickStatusNpwp.e;
                    for (int i2 = 0; i2 < readHoldCount; i2++) {
                        readLock2.lock();
                    }
                    writeLock.unlock();
                    return null;
                } catch (Throwable th2) {
                    for (int i3 = 0; i3 < readHoldCount; i3++) {
                        readLock2.lock();
                    }
                    writeLock.unlock();
                    throw th2;
                }
            } else {
                Object[] constructors = e2.getClass().getConstructors();
                read read2 = new read();
                subscribeReservationRescheduleEvent.e(constructors, "");
                subscribeReservationRescheduleEvent.e(read2, "");
                subscribeReservationRescheduleEvent.e(constructors, "");
                subscribeReservationRescheduleEvent.e(read2, "");
                Object[] objArr = constructors;
                if (!(constructors.length == 0)) {
                    Object[] copyOf = Arrays.copyOf(constructors, constructors.length);
                    subscribeReservationRescheduleEvent.d(copyOf, "");
                    subscribeReservationRescheduleEvent.e(copyOf, "");
                    subscribeReservationRescheduleEvent.e(read2, "");
                    objArr = copyOf;
                    if (copyOf.length > 1) {
                        Arrays.sort(copyOf, read2);
                        objArr = copyOf;
                    }
                }
                subscribeReservationRescheduleEvent.e(objArr, "");
                List<Constructor> asList = Arrays.asList(objArr);
                subscribeReservationRescheduleEvent.d(asList, "");
                T1TransaksiTarikanUbahFragment_ViewBinding t1TransaksiTarikanUbahFragment_ViewBinding2 = null;
                for (Constructor constructor : asList) {
                    Class<?>[] parameterTypes = constructor.getParameterTypes();
                    int length = parameterTypes.length;
                    if (length == 0) {
                        t1TransaksiTarikanUbahFragment_ViewBinding2 = (T1TransaksiTarikanUbahFragment_ViewBinding) new write(constructor);
                    } else if (length != 1) {
                        if (length == 2 && subscribeReservationRescheduleEvent.b(parameterTypes[0], String.class) && subscribeReservationRescheduleEvent.b(parameterTypes[1], Throwable.class)) {
                            t1TransaksiTarikanUbahFragment_ViewBinding2 = (T1TransaksiTarikanUbahFragment_ViewBinding) new RemoteActionCompatParcelizer(constructor);
                        }
                        t1TransaksiTarikanUbahFragment_ViewBinding2 = null;
                    } else {
                        Class<?> cls = parameterTypes[0];
                        if (subscribeReservationRescheduleEvent.b(cls, Throwable.class)) {
                            t1TransaksiTarikanUbahFragment_ViewBinding2 = (T1TransaksiTarikanUbahFragment_ViewBinding) new IconCompatParcelizer(constructor);
                        } else {
                            if (subscribeReservationRescheduleEvent.b(cls, String.class)) {
                                t1TransaksiTarikanUbahFragment_ViewBinding2 = (T1TransaksiTarikanUbahFragment_ViewBinding) new T1TransaksiTarikanUbahFragment_ViewBinding<Throwable, Throwable>(constructor) { // from class: o.getRequestHeadersString$com_github_ChuckerTeam_Chucker_library$MediaBrowserCompat$CustomActionResultReceiver
                                    final /* synthetic */ Constructor a;

                                    {
                                        this.a = r4;
                                    }

                                    /* JADX INFO: Access modifiers changed from: private */
                                    /* renamed from: d */
                                    public Throwable a(Throwable th3) {
                                        Object obj2;
                                        Object newInstance;
                                        try {
                                            Page6KLFragment$MediaBrowserCompat$CustomActionResultReceiver page6KLFragment$MediaBrowserCompat$CustomActionResultReceiver3 = Page6KLFragment.a;
                                            newInstance = this.a.newInstance(th3.getMessage());
                                        } catch (Throwable th4) {
                                            Page6KLFragment$MediaBrowserCompat$CustomActionResultReceiver page6KLFragment$MediaBrowserCompat$CustomActionResultReceiver4 = Page6KLFragment.a;
                                            subscribeReservationRescheduleEvent.e(th4, "");
                                            obj2 = Page6KLFragment.d(new Page6KLFragment.IconCompatParcelizer(th4));
                                        }
                                        if (newInstance != null) {
                                            Throwable th5 = (Throwable) newInstance;
                                            th5.initCause(th3);
                                            obj2 = Page6KLFragment.d(th5);
                                            Object obj3 = obj2;
                                            if (Page6KLFragment.b(obj2)) {
                                                obj3 = null;
                                            }
                                            return (Throwable) obj3;
                                        }
                                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
                                    }
                                };
                            }
                            t1TransaksiTarikanUbahFragment_ViewBinding2 = null;
                        }
                    }
                    t1TransaksiTarikanUbahFragment_ViewBinding2 = t1TransaksiTarikanUbahFragment_ViewBinding2;
                    if (t1TransaksiTarikanUbahFragment_ViewBinding2 != null) {
                        break;
                    }
                }
                ReentrantReadWriteLock reentrantReadWriteLock2 = e;
                ReentrantReadWriteLock.ReadLock readLock3 = reentrantReadWriteLock2.readLock();
                int readHoldCount2 = reentrantReadWriteLock2.getWriteHoldCount() == 0 ? reentrantReadWriteLock2.getReadHoldCount() : 0;
                for (int i4 = 0; i4 < readHoldCount2; i4++) {
                    readLock3.unlock();
                }
                ReentrantReadWriteLock.WriteLock writeLock2 = reentrantReadWriteLock2.writeLock();
                writeLock2.lock();
                try {
                    b.put(e2.getClass(), t1TransaksiTarikanUbahFragment_ViewBinding2 == null ? (T1TransaksiTarikanUbahFragment_ViewBinding) MediaDescriptionCompat.b : t1TransaksiTarikanUbahFragment_ViewBinding2);
                    onCLickStatusNpwp onclickstatusnpwp2 = onCLickStatusNpwp.e;
                    for (int i5 = 0; i5 < readHoldCount2; i5++) {
                        readLock3.lock();
                    }
                    writeLock2.unlock();
                    if (t1TransaksiTarikanUbahFragment_ViewBinding2 != null) {
                        e3 = (E) ((Throwable) t1TransaksiTarikanUbahFragment_ViewBinding2.a(e2));
                    }
                    return e3;
                } catch (Throwable th3) {
                    for (int i6 = 0; i6 < readHoldCount2; i6++) {
                        readLock3.lock();
                    }
                    writeLock2.unlock();
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            readLock.unlock();
            throw th4;
        }
    }
}
