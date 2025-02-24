package o;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import o.CheckCISNPresenter;
/* loaded from: classes-dex2jar.jar:o/DaftarTransferLoadDataORPresenter.class */
public class DaftarTransferLoadDataORPresenter extends DaftarTransferSetunFromUbahReservasiPresenter {
    public static /* synthetic */ int a(CharSequence charSequence, String str, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return CheckOTPSessionPresenter.e(charSequence, str, i, z);
    }

    public static final String a(CharSequence charSequence, setRegionPrefix setregionprefix) {
        subscribeReservationRescheduleEvent.e(charSequence, "");
        subscribeReservationRescheduleEvent.e(setregionprefix, "");
        return charSequence.subSequence(((setBackgroundTransparent) setregionprefix).c, ((setBackgroundTransparent) setregionprefix).d + 1).toString();
    }

    public static /* synthetic */ int c(CharSequence charSequence, String str, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            subscribeReservationRescheduleEvent.e(charSequence, "");
            i = charSequence.length() - 1;
        }
        return CheckOTPSessionPresenter.d(charSequence, str, i, false);
    }

    public static final CharSequence c(CharSequence charSequence) {
        subscribeReservationRescheduleEvent.e(charSequence, "");
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            char charAt = charSequence.charAt(!z ? i : length);
            boolean z2 = Character.isWhitespace(charAt) || Character.isSpaceChar(charAt);
            if (z) {
                if (!z2) {
                    break;
                }
                length--;
            } else if (!z2) {
                z = true;
            } else {
                i++;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    public static /* synthetic */ String c(String str, String str2, String str3, int i) {
        subscribeReservationRescheduleEvent.e(str, "");
        subscribeReservationRescheduleEvent.e(str2, "");
        subscribeReservationRescheduleEvent.e(str, "");
        int e = CheckOTPSessionPresenter.e(str, str2, 0, false);
        String str4 = str;
        if (e != -1) {
            str4 = str.substring(e + str2.length(), str.length());
            subscribeReservationRescheduleEvent.d(str4, "");
        }
        return str4;
    }

    public static final boolean c(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        subscribeReservationRescheduleEvent.e(charSequence, "");
        subscribeReservationRescheduleEvent.e(charSequence2, "");
        if (i2 < 0 || charSequence.length() - i3 < 0 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!CheckCutOffPresenter.e(charSequence.charAt(i4 + 0), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    public static final int d(CharSequence charSequence, char c, int i, boolean z) {
        int i2;
        boolean z2;
        subscribeReservationRescheduleEvent.e(charSequence, "");
        if (z || !(charSequence instanceof String)) {
            char[] cArr = {(char) c};
            subscribeReservationRescheduleEvent.e(charSequence, "");
            subscribeReservationRescheduleEvent.e(cArr, "");
            if (z || !(charSequence instanceof String)) {
                int i3 = i;
                if (i < 0) {
                    i3 = 0;
                }
                subscribeReservationRescheduleEvent.e(charSequence, "");
                setRegionPrefix setregionprefix = new setRegionPrefix(i3, charSequence.length() - 1);
                clickSimpanNama setwatcher = new setWatcher(((setBackgroundTransparent) setregionprefix).c, ((setBackgroundTransparent) setregionprefix).d, ((setBackgroundTransparent) setregionprefix).a);
                while (true) {
                    if (!setwatcher.hasNext()) {
                        i2 = -1;
                        break;
                    }
                    int c2 = setwatcher.c();
                    char charAt = charSequence.charAt(c2);
                    int i4 = 0;
                    while (true) {
                        if (i4 > 0) {
                            z2 = false;
                            break;
                        } else if (CheckCutOffPresenter.e(cArr[i4], charAt, z)) {
                            z2 = true;
                            break;
                        } else {
                            i4++;
                        }
                    }
                    if (z2) {
                        i2 = c2;
                        break;
                    }
                }
            } else {
                i2 = ((String) charSequence).indexOf(Page6MLFragment.b(cArr), i);
            }
        } else {
            i2 = ((String) charSequence).indexOf(c, i);
        }
        return i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0097, code lost:
        if (r0 > r0) goto L_0x009a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ed, code lost:
        if (r0 > r0) goto L_0x00f0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private static final int d(java.lang.CharSequence r7, java.lang.CharSequence r8, int r9, int r10, boolean r11, boolean r12) {
        /*
        // Method dump skipped, instructions count: 289
        */
        throw new UnsupportedOperationException("Method not decompiled: o.DaftarTransferLoadDataORPresenter.d(java.lang.CharSequence, java.lang.CharSequence, int, int, boolean, boolean):int");
    }

    public static final int d(CharSequence charSequence, String str, int i, boolean z) {
        subscribeReservationRescheduleEvent.e(charSequence, "");
        subscribeReservationRescheduleEvent.e(str, "");
        return (z || !(charSequence instanceof String)) ? d(charSequence, str, i, 0, z, true) : ((String) charSequence).lastIndexOf(str, i);
    }

    public static final String d(String str, char c, String str2) {
        int i;
        boolean z;
        subscribeReservationRescheduleEvent.e(str, "");
        subscribeReservationRescheduleEvent.e(str2, "");
        String str3 = str;
        subscribeReservationRescheduleEvent.e(str3, "");
        int length = str3.length() - 1;
        subscribeReservationRescheduleEvent.e(str3, "");
        if (!(str3 instanceof String)) {
            char[] cArr = {(char) c};
            subscribeReservationRescheduleEvent.e(str3, "");
            subscribeReservationRescheduleEvent.e(cArr, "");
            if (!(str3 instanceof String)) {
                subscribeReservationRescheduleEvent.e(str3, "");
                int length2 = str3.length() - 1;
                i = length;
                if (length > length2) {
                    i = length2;
                }
                while (true) {
                    if (i < 0) {
                        i = -1;
                        break;
                    }
                    char charAt = str3.charAt(i);
                    int i2 = 0;
                    while (true) {
                        if (i2 > 0) {
                            z = false;
                            break;
                        } else if (CheckCutOffPresenter.e(cArr[i2], charAt, false)) {
                            z = true;
                            break;
                        } else {
                            i2++;
                        }
                    }
                    if (z) {
                        break;
                    }
                    i--;
                }
            } else {
                i = str3.lastIndexOf(Page6MLFragment.b(cArr), length);
            }
        } else {
            i = str3.lastIndexOf(c, length);
        }
        if (i != -1) {
            str2 = str.substring(i + 1, str.length());
            subscribeReservationRescheduleEvent.d(str2, "");
        }
        return str2;
    }

    public static final List<String> d(CharSequence charSequence, String[] strArr, boolean z, int i) {
        int length;
        int e;
        subscribeReservationRescheduleEvent.e(charSequence, "");
        subscribeReservationRescheduleEvent.e(strArr, "");
        int i2 = 10;
        int i3 = 0;
        if (strArr.length == 1) {
            String str = strArr[0];
            if (!(str.length() == 0)) {
                CheckOTPSessionPresenter.d(i);
                int e2 = CheckOTPSessionPresenter.e(charSequence, str, 0, z);
                if (e2 == -1 || i == 1) {
                    List<String> singletonList = Collections.singletonList(charSequence.toString());
                    subscribeReservationRescheduleEvent.d(singletonList, "");
                    return singletonList;
                }
                boolean z2 = i > 0;
                int i4 = 10;
                if (z2) {
                    i4 = i > 10 ? 10 : i;
                }
                ArrayList arrayList = new ArrayList(i4);
                int i5 = e2;
                do {
                    arrayList.add(charSequence.subSequence(i3, i5).toString());
                    length = str.length() + i5;
                    if (z2 && arrayList.size() == i - 1) {
                        break;
                    }
                    e = CheckOTPSessionPresenter.e(charSequence, str, length, z);
                    i3 = length;
                    i5 = e;
                } while (e != -1);
                arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
                return arrayList;
            }
        }
        CancelTundaPresenter<setRegionPrefix> e3 = e(charSequence, strArr, 0, z, i);
        subscribeReservationRescheduleEvent.e(e3, "");
        Iterable<setRegionPrefix> remoteActionCompatParcelizer = new CheckCISNPresenter.RemoteActionCompatParcelizer(e3);
        subscribeReservationRescheduleEvent.e(remoteActionCompatParcelizer, "");
        if (remoteActionCompatParcelizer instanceof Collection) {
            i2 = ((Collection) remoteActionCompatParcelizer).size();
        }
        ArrayList arrayList2 = new ArrayList(i2);
        for (setRegionPrefix setregionprefix : remoteActionCompatParcelizer) {
            arrayList2.add(CheckOTPSessionPresenter.a(charSequence, setregionprefix));
        }
        return arrayList2;
    }

    public static final void d(int i) {
        if (!(i >= 0)) {
            StringBuilder sb = new StringBuilder("Limit must be non-negative, but was ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString().toString());
        }
    }

    public static final boolean d(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        boolean z2;
        subscribeReservationRescheduleEvent.e(charSequence, "");
        subscribeReservationRescheduleEvent.e(charSequence2, "");
        if (charSequence2 instanceof String) {
            if (CheckOTPSessionPresenter.e(charSequence, (String) charSequence2, 0, z) >= 0) {
                z2 = true;
            }
            z2 = false;
        } else {
            if (d(charSequence, charSequence2, 0, charSequence.length(), z, false) >= 0) {
                z2 = true;
            }
            z2 = false;
        }
        return z2;
    }

    public static final int e(CharSequence charSequence, String str, int i, boolean z) {
        subscribeReservationRescheduleEvent.e(charSequence, "");
        subscribeReservationRescheduleEvent.e(str, "");
        return (z || !(charSequence instanceof String)) ? d(charSequence, str, i, charSequence.length(), z, false) : ((String) charSequence).indexOf(str, i);
    }

    public static final CancelTundaPresenter<setRegionPrefix> e(CharSequence charSequence, String[] strArr, int i, boolean z, int i2) {
        CheckOTPSessionPresenter.d(i2);
        subscribeReservationRescheduleEvent.e(strArr, "");
        List asList = Arrays.asList(strArr);
        subscribeReservationRescheduleEvent.d(asList, "");
        return new CheckVersionPresenter<>(charSequence, i, i2, new RemoteActionCompatParcelizer(asList, z));
    }
}
