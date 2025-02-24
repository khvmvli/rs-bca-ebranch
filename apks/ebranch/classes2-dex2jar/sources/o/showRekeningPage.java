package o;

import com.google.firebase.messaging.Constants;
import java.lang.reflect.Field;
/* loaded from: classes2-dex2jar.jar:o/showRekeningPage.class */
public final class showRekeningPage {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static final int d(ReviewSetoranUbahFragment_ViewBinding reviewSetoranUbahFragment_ViewBinding) {
        int i = -1;
        try {
            Field declaredField = reviewSetoranUbahFragment_ViewBinding.getClass().getDeclaredField(Constants.ScionAnalytics.PARAM_LABEL);
            declaredField.setAccessible(true);
            Object obj = declaredField.get(reviewSetoranUbahFragment_ViewBinding);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            i = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception e) {
        }
        return i;
    }
}
