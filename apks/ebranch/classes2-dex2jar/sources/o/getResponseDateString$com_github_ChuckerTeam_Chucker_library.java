package o;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
/* loaded from: classes2-dex2jar.jar:o/getResponseDateString$com_github_ChuckerTeam_Chucker_library.class */
public final class getResponseDateString$com_github_ChuckerTeam_Chucker_library<E> {
    public static final read b = new read((byte) 0);
    public static final getScheme$com_github_ChuckerTeam_Chucker_library c = new getScheme$com_github_ChuckerTeam_Chucker_library("REMOVE_FROZEN");
    private static final /* synthetic */ AtomicReferenceFieldUpdater d = AtomicReferenceFieldUpdater.newUpdater(getResponseDateString$com_github_ChuckerTeam_Chucker_library.class, Object.class, "_next");
    private static final /* synthetic */ AtomicLongFieldUpdater e = AtomicLongFieldUpdater.newUpdater(getResponseDateString$com_github_ChuckerTeam_Chucker_library.class, "_state");
    private volatile /* synthetic */ Object _next = null;
    public volatile /* synthetic */ long _state = 0;
    private /* synthetic */ AtomicReferenceArray a;
    private final int f;
    private final boolean g;
    private final int i;

    /* loaded from: classes2-dex2jar.jar:o/getResponseDateString$com_github_ChuckerTeam_Chucker_library$read.class */
    public static final class read {
        private read() {
        }

        public /* synthetic */ read(byte b) {
            this();
        }
    }

    public getResponseDateString$com_github_ChuckerTeam_Chucker_library(int i, boolean z) {
        this.f = i;
        this.g = z;
        int i2 = i - 1;
        this.i = i2;
        this.a = new AtomicReferenceArray(i);
        boolean z2 = false;
        if (i2 <= 1073741823) {
            if (!((i & i2) == 0 ? true : z2)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    private final getResponseDateString$com_github_ChuckerTeam_Chucker_library<E> a(int i, E e2) {
        Object obj = this.a.get(this.i & i);
        if (!(obj instanceof getResponseDateString$com_github_ChuckerTeam_Chucker_library$MediaBrowserCompat$CustomActionResultReceiver) || ((getResponseDateString$com_github_ChuckerTeam_Chucker_library$MediaBrowserCompat$CustomActionResultReceiver) obj).a != i) {
            return null;
        }
        this.a.set(i & this.i, e2);
        return this;
    }

    private final getResponseDateString$com_github_ChuckerTeam_Chucker_library<E> d(int i, int i2) {
        long j;
        int i3;
        do {
            j = this._state;
            boolean z = false;
            i3 = (int) (1073741823 & j);
            if (RateTransactionPresenter.c()) {
                if (i3 == i) {
                    z = true;
                }
                if (!z) {
                    throw new AssertionError();
                }
            }
            if ((1152921504606846976L & j) != 0) {
                return e();
            }
        } while (!e.compareAndSet(this, j, (-1073741824 & j) | ((long) i2)));
        this.a.set(this.i & i3, null);
        return null;
    }

    public final int a(E e2) {
        while (true) {
            long j = this._state;
            int i = 1;
            if ((3458764513820540928L & j) != 0) {
                if ((2305843009213693952L & j) != 0) {
                    i = 2;
                }
                return i;
            }
            int i2 = (int) (1073741823 & j);
            int i3 = (int) ((1152921503533105152L & j) >> 30);
            int i4 = this.i;
            if (((i3 + 2) & i4) == (i2 & i4)) {
                return 1;
            }
            if (!this.g && this.a.get(i3 & i4) != null) {
                int i5 = this.f;
                if (i5 < 1024 || ((i3 - i2) & 1073741823) > (i5 >> 1)) {
                    return 1;
                }
            } else if (e.compareAndSet(this, j, (((long) ((i3 + 1) & 1073741823)) << 30) | (-1152921503533105153L & j))) {
                this.a.set(i3 & i4, e2);
                getResponseDateString$com_github_ChuckerTeam_Chucker_library<E> getresponsedatestring_com_github_chuckerteam_chucker_library = this;
                while ((getresponsedatestring_com_github_chuckerteam_chucker_library._state & 1152921504606846976L) != 0) {
                    getResponseDateString$com_github_ChuckerTeam_Chucker_library<E> a = getresponsedatestring_com_github_chuckerteam_chucker_library.e(getresponsedatestring_com_github_chuckerteam_chucker_library.c()).a(i3, e2);
                    getresponsedatestring_com_github_chuckerteam_chucker_library = a;
                    if (a == null) {
                        return 0;
                    }
                }
                return 0;
            }
        }
    }

    public final boolean a() {
        long j;
        do {
            j = this._state;
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
        } while (!e.compareAndSet(this, j, j | 2305843009213693952L));
        return true;
    }

    public final Object b() {
        getResponseDateString$com_github_ChuckerTeam_Chucker_library<E> d2;
        while (true) {
            long j = this._state;
            if ((1152921504606846976L & j) != 0) {
                return c;
            }
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            int i3 = this.i;
            int i4 = i3 & i;
            if ((i2 & i3) == i4) {
                return null;
            }
            Object obj = this.a.get(i4);
            if (obj == null) {
                if (this.g) {
                    return null;
                }
            } else if (obj instanceof getResponseDateString$com_github_ChuckerTeam_Chucker_library$MediaBrowserCompat$CustomActionResultReceiver) {
                return null;
            } else {
                int i5 = (i + 1) & 1073741823;
                if (e.compareAndSet(this, j, (-1073741824 & j) | ((long) i5))) {
                    this.a.set(this.i & i, null);
                    return obj;
                } else if (this.g) {
                    getResponseDateString$com_github_ChuckerTeam_Chucker_library<E> getresponsedatestring_com_github_chuckerteam_chucker_library = this;
                    do {
                        d2 = getresponsedatestring_com_github_chuckerteam_chucker_library.d(i, i5);
                        getresponsedatestring_com_github_chuckerteam_chucker_library = d2;
                    } while (d2 != null);
                    return obj;
                }
            }
        }
    }

    public final long c() {
        long j;
        long j2;
        do {
            j = this._state;
            if ((j & 1152921504606846976L) != 0) {
                return j;
            }
            j2 = j | 1152921504606846976L;
        } while (!e.compareAndSet(this, j, j2));
        return j2;
    }

    public final getResponseDateString$com_github_ChuckerTeam_Chucker_library<E> e() {
        return e(c());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final getResponseDateString$com_github_ChuckerTeam_Chucker_library<E> e(long j) {
        while (true) {
            getResponseDateString$com_github_ChuckerTeam_Chucker_library<E> getresponsedatestring_com_github_chuckerteam_chucker_library = (getResponseDateString$com_github_ChuckerTeam_Chucker_library) this._next;
            if (getresponsedatestring_com_github_chuckerteam_chucker_library != null) {
                return getresponsedatestring_com_github_chuckerteam_chucker_library;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d;
            getResponseDateString$com_github_ChuckerTeam_Chucker_library getresponsedatestring_com_github_chuckerteam_chucker_library2 = new getResponseDateString$com_github_ChuckerTeam_Chucker_library(this.f << 1, this.g);
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            while (true) {
                int i3 = this.i;
                int i4 = i & i3;
                if (i4 == (i3 & i2)) {
                    break;
                }
                Object obj = this.a.get(i4);
                Object obj2 = obj;
                if (obj == null) {
                    obj2 = new getResponseDateString$com_github_ChuckerTeam_Chucker_library$MediaBrowserCompat$CustomActionResultReceiver(i);
                }
                getresponsedatestring_com_github_chuckerteam_chucker_library2.a.set(getresponsedatestring_com_github_chuckerteam_chucker_library2.i & i, obj2);
                i++;
            }
            getresponsedatestring_com_github_chuckerteam_chucker_library2._state = -1152921504606846977L & j;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, getresponsedatestring_com_github_chuckerteam_chucker_library2) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }
}
