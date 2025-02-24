package o;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/* loaded from: classes-dex2jar.jar:o/BindFloat.class */
public final class BindFloat {
    public boolean c = false;
    public final Set<Object> b = new setThumbTintMode();
    public final Map<String, AvailableBookingTimeROActivity_ViewBinding> a = new HashMap();
    private final Comparator<onDestroyView<String, Float>> d = new Comparator<onDestroyView<String, Float>>() { // from class: o.BindFloat.3
        @Override // java.util.Comparator
        public final /* synthetic */ int compare(onDestroyView<String, Float> ondestroyview, onDestroyView<String, Float> ondestroyview2) {
            float floatValue = ondestroyview.c.floatValue();
            float floatValue2 = ondestroyview2.c.floatValue();
            if (floatValue2 > floatValue) {
                return 1;
            }
            return floatValue > floatValue2 ? -1 : 0;
        }
    };
}
