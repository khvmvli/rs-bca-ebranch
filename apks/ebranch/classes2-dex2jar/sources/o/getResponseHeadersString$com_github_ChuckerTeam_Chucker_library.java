package o;

import java.util.ArrayDeque;
import java.util.Iterator;
import o.Page6KLFragment;
/* loaded from: classes2-dex2jar.jar:o/getResponseHeadersString$com_github_ChuckerTeam_Chucker_library.class */
public final class getResponseHeadersString$com_github_ChuckerTeam_Chucker_library {
    private static final String b;
    private static final String d;

    static {
        Object obj;
        Object obj2;
        Object obj3 = "o.ReviewSetoranUbahFragment_ViewBinding";
        String str = "o.getResponseHeadersString$com_github_ChuckerTeam_Chucker_library";
        try {
            Page6KLFragment$MediaBrowserCompat$CustomActionResultReceiver page6KLFragment$MediaBrowserCompat$CustomActionResultReceiver = Page6KLFragment.a;
            obj = Page6KLFragment.d(Class.forName("o.ReviewSetoranUbahFragment_ViewBinding").getCanonicalName());
        } catch (Throwable th) {
            Page6KLFragment$MediaBrowserCompat$CustomActionResultReceiver page6KLFragment$MediaBrowserCompat$CustomActionResultReceiver2 = Page6KLFragment.a;
            subscribeReservationRescheduleEvent.e(th, "");
            obj = Page6KLFragment.d(new Page6KLFragment.IconCompatParcelizer(th));
        }
        if (Page6KLFragment.e(obj) == null) {
            obj3 = obj;
        }
        b = (String) obj3;
        try {
            Page6KLFragment$MediaBrowserCompat$CustomActionResultReceiver page6KLFragment$MediaBrowserCompat$CustomActionResultReceiver3 = Page6KLFragment.a;
            obj2 = Page6KLFragment.d(Class.forName("o.getResponseHeadersString$com_github_ChuckerTeam_Chucker_library").getCanonicalName());
        } catch (Throwable th2) {
            Page6KLFragment$MediaBrowserCompat$CustomActionResultReceiver page6KLFragment$MediaBrowserCompat$CustomActionResultReceiver4 = Page6KLFragment.a;
            subscribeReservationRescheduleEvent.e(th2, "");
            obj2 = Page6KLFragment.d(new Page6KLFragment.IconCompatParcelizer(th2));
        }
        String str2 = str;
        if (Page6KLFragment.e(obj2) == null) {
            str2 = obj2;
        }
        d = (String) str2;
    }

    private static final <E extends Throwable> E b(E e, E e2, ArrayDeque<StackTraceElement> arrayDeque) {
        arrayDeque.addFirst(new StackTraceElement(subscribeReservationRescheduleEvent.b("\b\b\b(", "Coroutine boundary"), "\b", "\b", -1));
        StackTraceElement[] stackTrace = e.getStackTrace();
        int c = c(stackTrace, b);
        int i = 0;
        if (c == -1) {
            Object[] array = arrayDeque.toArray(new StackTraceElement[0]);
            if (array != null) {
                e2.setStackTrace((StackTraceElement[]) array);
                return e2;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[arrayDeque.size() + c];
        if (c > 0) {
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                stackTraceElementArr[i2] = stackTrace[i2];
                if (i3 >= c) {
                    break;
                }
                i2 = i3;
            }
        }
        Iterator<StackTraceElement> it = arrayDeque.iterator();
        while (it.hasNext()) {
            stackTraceElementArr[i + c] = it.next();
            i++;
        }
        e2.setStackTrace(stackTraceElementArr);
        return e2;
    }

    private static final void b(StackTraceElement[] stackTraceElementArr, ArrayDeque<StackTraceElement> arrayDeque) {
        int i;
        int length = stackTraceElementArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                i = -1;
                break;
            }
            i = i2;
            if (CheckOTPSessionPresenter.a(stackTraceElementArr[i2].getClassName(), "\b\b\b", false)) {
                break;
            }
            i2++;
        }
        int i3 = i + 1;
        int length2 = stackTraceElementArr.length - 1;
        if (i3 <= length2) {
            while (true) {
                StackTraceElement stackTraceElement = stackTraceElementArr[length2];
                StackTraceElement last = arrayDeque.getLast();
                if (stackTraceElement.getLineNumber() == last.getLineNumber() && subscribeReservationRescheduleEvent.b(stackTraceElement.getMethodName(), last.getMethodName()) && subscribeReservationRescheduleEvent.b(stackTraceElement.getFileName(), last.getFileName()) && subscribeReservationRescheduleEvent.b(stackTraceElement.getClassName(), last.getClassName())) {
                    arrayDeque.removeLast();
                }
                arrayDeque.addFirst(stackTraceElementArr[length2]);
                if (length2 != i3) {
                    length2--;
                } else {
                    return;
                }
            }
        }
    }

    private static final int c(StackTraceElement[] stackTraceElementArr, String str) {
        int i;
        int length = stackTraceElementArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                i = -1;
                break;
            }
            i = i2;
            if (subscribeReservationRescheduleEvent.b(str, stackTraceElementArr[i2].getClassName())) {
                break;
            }
            i2++;
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b7, code lost:
        if (o.subscribeReservationRescheduleEvent.b(r0.getMessage(), r0.getMessage()) == false) goto L_0x009a;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c3  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static final /* synthetic */ java.lang.Throwable c(java.lang.Throwable r5, o.SumberDanaDataPemilikSetunFragment r6) {
        /*
        // Method dump skipped, instructions count: 320
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getResponseHeadersString$com_github_ChuckerTeam_Chucker_library.c(java.lang.Throwable, o.SumberDanaDataPemilikSetunFragment):java.lang.Throwable");
    }

    public static final <E extends Throwable> E d(E e) {
        E e2 = (E) e.getCause();
        if (e2 != null && subscribeReservationRescheduleEvent.b(e2.getClass(), e.getClass())) {
            StackTraceElement[] stackTrace = e.getStackTrace();
            int length = stackTrace.length;
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (CheckOTPSessionPresenter.a(stackTrace[i].getClassName(), "\b\b\b", false)) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
            if (z) {
                return e2;
            }
        }
        return e;
    }
}
