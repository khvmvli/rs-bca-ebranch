package o;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
@onChooseValueDescPekerjaan
/* loaded from: classes-dex2jar.jar:o/getFlagDifResidency.class */
final class getFlagDifResidency implements getCurrentPage {
    private final getFlagDifResidency$MediaBrowserCompat$CustomActionResultReceiver a;
    private final Map<String, getFlagEKTP> b;
    private final getDebitCardType c;

    /* JADX INFO: Access modifiers changed from: package-private */
    @onClickNegara
    public getFlagDifResidency(Context context, getDebitCardType getdebitcardtype) {
        this(new getFlagDifResidency$MediaBrowserCompat$CustomActionResultReceiver(context), getdebitcardtype);
    }

    private getFlagDifResidency(getFlagDifResidency$MediaBrowserCompat$CustomActionResultReceiver getflagdifresidency_mediabrowsercompat_customactionresultreceiver, getDebitCardType getdebitcardtype) {
        this.b = new HashMap();
        this.a = getflagdifresidency_mediabrowsercompat_customactionresultreceiver;
        this.c = getdebitcardtype;
    }

    @Override // o.getCurrentPage
    public final getFlagEKTP d(String str) {
        synchronized (this) {
            if (this.b.containsKey(str)) {
                return this.b.get(str);
            }
            getCob d = this.a.d(str);
            if (d == null) {
                return null;
            }
            getDebitCardType getdebitcardtype = this.c;
            getFlagEKTP create = d.create(new getCitizenOthers(getdebitcardtype.b, getdebitcardtype.e, getdebitcardtype.a, str));
            this.b.put(str, create);
            return create;
        }
    }
}
