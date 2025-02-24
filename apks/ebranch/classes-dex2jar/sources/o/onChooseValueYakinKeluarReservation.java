package o;

import android.view.MenuItem;
import com.bca.smartbranch.data.localdb.Warkat;
import o.FormBankNotesActivity_ViewBinding;
import o.setHoverListener;
/* loaded from: classes-dex2jar.jar:o/onChooseValueYakinKeluarReservation.class */
public final /* synthetic */ class onChooseValueYakinKeluarReservation implements setHoverListener.write {
    public final /* synthetic */ int a;
    public final /* synthetic */ Warkat d;

    public /* synthetic */ onChooseValueYakinKeluarReservation(int i, Warkat warkat) {
        this.a = i;
        this.d = warkat;
    }

    @Override // o.setHoverListener.write
    public final boolean a(MenuItem menuItem) {
        return FormBankNotesActivity_ViewBinding.RemoteActionCompatParcelizer.d(this.a, this.d, menuItem);
    }
}
