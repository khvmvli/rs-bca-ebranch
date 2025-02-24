package o;

import android.content.Context;
import android.os.Bundle;
import o.realmGet;
/* loaded from: classes2-dex2jar.jar:o/realmSet$TxnNotes.class */
public final class realmSet$TxnNotes {
    String a;
    String b;
    final Context c;
    Boolean d;
    String e;
    realmGet.bcaDebitCardType f;
    String g;
    long h;
    boolean i;
    final Long j;

    public realmSet$TxnNotes(Context context, realmGet.bcaDebitCardType bcadebitcardtype, Long l) {
        this.i = true;
        setFotoKtp.b(context);
        Context applicationContext = context.getApplicationContext();
        setFotoKtp.b(applicationContext);
        this.c = applicationContext;
        this.j = l;
        if (bcadebitcardtype != null) {
            this.f = bcadebitcardtype;
            this.a = bcadebitcardtype.h;
            this.b = bcadebitcardtype.b;
            this.e = bcadebitcardtype.c;
            this.i = bcadebitcardtype.d;
            this.h = bcadebitcardtype.a;
            this.g = bcadebitcardtype.j;
            Bundle bundle = bcadebitcardtype.f;
            if (bundle != null) {
                this.d = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
