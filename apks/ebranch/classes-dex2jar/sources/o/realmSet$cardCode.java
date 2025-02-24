package o;

import java.util.Collections;
import java.util.List;
import java.util.Map;
/* loaded from: classes-dex2jar.jar:o/realmSet$cardCode.class */
public final class realmSet$cardCode extends realmSet$cardName {
    public realmSet$cardCode(int i) {
        super(i, null);
    }

    @Override // o.realmSet$cardName
    public final void d() {
        if (!e()) {
            for (int i = 0; i < b(); i++) {
                Map.Entry d = d(i);
                if (((setFlagAgreeLifeInsurance) d.getKey()).d()) {
                    d.setValue(Collections.unmodifiableList((List) d.getValue()));
                }
            }
            for (Map.Entry entry : c()) {
                if (((setFlagAgreeLifeInsurance) entry.getKey()).d()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        d();
    }
}
