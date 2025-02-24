package o;

import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes-dex2jar.jar:o/setDescriptions.class */
public final class setDescriptions {
    private static final SpannableStringBuilder a(String str, List<Integer> list, int i, int i2, int i3) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        for (Number number : list) {
            int intValue = number.intValue();
            int i4 = intValue + i;
            spannableStringBuilder.setSpan(new UnderlineSpan(), intValue, i4, 33);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i3), intValue, i4, 33);
            spannableStringBuilder.setSpan(new BackgroundColorSpan(i2), intValue, i4, 33);
        }
        return spannableStringBuilder;
    }

    public static final SpannableStringBuilder d(String str, String str2, int i, int i2) {
        subscribeReservationRescheduleEvent.e(str, "");
        subscribeReservationRescheduleEvent.e(str2, "");
        ArrayList arrayList = new ArrayList();
        String str3 = str;
        int e = CheckOTPSessionPresenter.e(str3, str2, 0, true);
        while (e >= 0) {
            arrayList.add(Integer.valueOf(e));
            e = CheckOTPSessionPresenter.e(str3, str2, e + 1, true);
        }
        return a(str, arrayList, str2.length(), i, i2);
    }
}
