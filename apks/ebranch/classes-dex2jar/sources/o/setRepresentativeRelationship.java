package o;

import com.bca.smartbranch.activity.CC8FormKartuKreditActivity;
import com.bca.smartbranch.fragment.CC9FormKartuKreditFragment;
import io.realm.Realm;
/* loaded from: classes-dex2jar.jar:o/setRepresentativeRelationship.class */
public final /* synthetic */ class setRepresentativeRelationship implements Realm.Transaction {
    public final /* synthetic */ CC9FormKartuKreditFragment c;

    public /* synthetic */ setRepresentativeRelationship(CC9FormKartuKreditFragment cC9FormKartuKreditFragment) {
        this.c = cC9FormKartuKreditFragment;
    }

    @Override // io.realm.Realm.Transaction
    public final void execute(Realm realm) {
        ((CC8FormKartuKreditActivity) this.c.getActivity()).n.setIdentityCardType("");
    }
}
