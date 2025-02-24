package o;

import java.lang.Comparable;
import o.getTotalSizeString$com_github_ChuckerTeam_Chucker_library;
/* loaded from: classes2-dex2jar.jar:o/getUrl$com_github_ChuckerTeam_Chucker_library.class */
public class getUrl$com_github_ChuckerTeam_Chucker_library<T extends getTotalSizeString$com_github_ChuckerTeam_Chucker_library & Comparable<? super T>> {
    public volatile /* synthetic */ int _size = 0;
    public T[] d;

    private final void a(int i, int i2) {
        T[] tArr = this.d;
        subscribeReservationRescheduleEvent.c(tArr);
        T t = tArr[i2];
        subscribeReservationRescheduleEvent.c(t);
        T t2 = tArr[i];
        subscribeReservationRescheduleEvent.c(t2);
        tArr[i] = t;
        tArr[i2] = t2;
        t.c(i);
        t2.c(i2);
    }

    private final void e(int i) {
        while (true) {
            int i2 = (i << 1) + 1;
            if (i2 < this._size) {
                T[] tArr = this.d;
                subscribeReservationRescheduleEvent.c(tArr);
                int i3 = i2 + 1;
                i = i2;
                if (i3 < this._size) {
                    T t = tArr[i3];
                    subscribeReservationRescheduleEvent.c(t);
                    Comparable comparable = (Comparable) t;
                    T t2 = tArr[i2];
                    subscribeReservationRescheduleEvent.c(t2);
                    i = i2;
                    if (comparable.compareTo(t2) < 0) {
                        i = i3;
                    }
                }
                T t3 = tArr[i];
                subscribeReservationRescheduleEvent.c(t3);
                Comparable comparable2 = (Comparable) t3;
                T t4 = tArr[i];
                subscribeReservationRescheduleEvent.c(t4);
                if (comparable2.compareTo(t4) > 0) {
                    a(i, i);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public final T b() {
        T b;
        synchronized (this) {
            b = this._size > 0 ? b(0) : null;
        }
        return b;
    }

    public final T b(int i) {
        boolean z = false;
        if (RateTransactionPresenter.c()) {
            if (!(this._size > 0)) {
                throw new AssertionError();
            }
        }
        T[] tArr = this.d;
        subscribeReservationRescheduleEvent.c(tArr);
        this._size--;
        if (i < this._size) {
            a(i, this._size);
            int i2 = (i - 1) / 2;
            if (i > 0) {
                T t = tArr[i];
                subscribeReservationRescheduleEvent.c(t);
                Comparable comparable = (Comparable) t;
                T t2 = tArr[i2];
                subscribeReservationRescheduleEvent.c(t2);
                if (comparable.compareTo(t2) < 0) {
                    a(i, i2);
                    d(i2);
                }
            }
            e(i);
        }
        T t3 = tArr[this._size];
        subscribeReservationRescheduleEvent.c(t3);
        if (RateTransactionPresenter.c()) {
            if (t3.F_() == this) {
                z = true;
            }
            if (!z) {
                throw new AssertionError();
            }
        }
        t3.d(null);
        t3.c(-1);
        tArr[this._size] = null;
        return t3;
    }

    public final T d() {
        T t;
        synchronized (this) {
            T[] tArr = this.d;
            t = tArr == null ? null : tArr[0];
        }
        return t;
    }

    public final void d(int i) {
        while (i > 0) {
            T[] tArr = this.d;
            subscribeReservationRescheduleEvent.c(tArr);
            int i2 = (i - 1) / 2;
            T t = tArr[i2];
            subscribeReservationRescheduleEvent.c(t);
            Comparable comparable = (Comparable) t;
            T t2 = tArr[i];
            subscribeReservationRescheduleEvent.c(t2);
            if (comparable.compareTo(t2) > 0) {
                a(i, i2);
                i = i2;
            } else {
                return;
            }
        }
    }
}
