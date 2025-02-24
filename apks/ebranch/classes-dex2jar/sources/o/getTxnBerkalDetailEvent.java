package o;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
/* loaded from: classes-dex2jar.jar:o/getTxnBerkalDetailEvent.class */
public final class getTxnBerkalDetailEvent {
    private static final Object[] c = new Object[0];

    public static final Object[] b(Collection<?> collection, Object[] objArr) {
        Object[] objArr2;
        subscribeReservationRescheduleEvent.e(collection, "");
        int size = collection.size();
        int i = 0;
        if (size == 0) {
            objArr2 = objArr;
            if (objArr.length > 0) {
                objArr[0] = null;
                objArr2 = objArr;
            }
        } else {
            Iterator<?> it = collection.iterator();
            if (!it.hasNext()) {
                objArr2 = objArr;
                if (objArr.length > 0) {
                    objArr[0] = null;
                    objArr2 = objArr;
                }
            } else {
                if (size <= objArr.length) {
                    objArr2 = objArr;
                } else {
                    Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
                    subscribeReservationRescheduleEvent.c(newInstance);
                    objArr2 = (Object[]) newInstance;
                }
                while (true) {
                    int i2 = i + 1;
                    objArr2[i] = it.next();
                    if (i2 >= objArr2.length) {
                        if (!it.hasNext()) {
                            break;
                        }
                        int i3 = ((i2 * 3) + 1) >>> 1;
                        int i4 = i3;
                        if (i3 <= i2) {
                            if (i2 < 2147483645) {
                                i4 = 2147483645;
                            } else {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArr2 = Arrays.copyOf(objArr2, i4);
                        subscribeReservationRescheduleEvent.d(objArr2, "");
                        i = i2;
                    } else {
                        objArr2 = objArr2;
                        if (it.hasNext()) {
                            i = i2;
                        } else if (objArr2 == objArr) {
                            objArr[i2] = null;
                            objArr2 = objArr;
                        } else {
                            objArr2 = Arrays.copyOf(objArr2, i2);
                            subscribeReservationRescheduleEvent.d(objArr2, "");
                        }
                    }
                }
            }
        }
        return objArr2;
    }

    public static final Object[] d(Collection<?> collection) {
        Object[] objArr;
        subscribeReservationRescheduleEvent.e(collection, "");
        int size = collection.size();
        if (size != 0) {
            Iterator<?> it = collection.iterator();
            if (it.hasNext()) {
                Object[] objArr2 = new Object[size];
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    objArr2[i] = it.next();
                    if (i2 >= objArr2.length) {
                        objArr = objArr2;
                        if (!it.hasNext()) {
                            break;
                        }
                        int i3 = ((i2 * 3) + 1) >>> 1;
                        int i4 = i3;
                        if (i3 <= i2) {
                            if (i2 < 2147483645) {
                                i4 = 2147483645;
                            } else {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArr2 = Arrays.copyOf(objArr2, i4);
                        subscribeReservationRescheduleEvent.d(objArr2, "");
                        i = i2;
                    } else {
                        objArr2 = objArr2;
                        if (!it.hasNext()) {
                            objArr = Arrays.copyOf(objArr2, i2);
                            subscribeReservationRescheduleEvent.d(objArr, "");
                            break;
                        }
                        i = i2;
                    }
                }
            }
        }
        objArr = c;
        return objArr;
    }
}
