package o;

import android.content.Context;
import java.util.concurrent.Executor;
/* loaded from: classes-dex2jar.jar:o/getJobOthers.class */
public final class getJobOthers {
    final realmGet$businessField a;
    final getMaritalStatus b;
    final Context c;
    public final Executor d;
    final getCurrentPage e;
    final getLastEducation g;
    final realmGet$acctType i;

    @onClickNegara
    public getJobOthers(Context context, getCurrentPage getcurrentpage, getMaritalStatus getmaritalstatus, getLastEducation getlasteducation, Executor executor, realmGet$acctType realmget_accttype, realmGet$businessField realmget_businessfield) {
        this.c = context;
        this.e = getcurrentpage;
        this.b = getmaritalstatus;
        this.g = getlasteducation;
        this.d = executor;
        this.i = realmget_accttype;
        this.a = realmget_businessfield;
    }
}
