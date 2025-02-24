package o;

import com.google.firebase.iid.internal.FirebaseInstanceIdInternal;
import com.google.firebase.messaging.FirebaseMessaging;
/* loaded from: classes2-dex2jar.jar:o/TujuanPembelianBNDialog_ViewBinding.class */
public final /* synthetic */ class TujuanPembelianBNDialog_ViewBinding implements FirebaseInstanceIdInternal.NewTokenListener {
    private final FirebaseMessaging a;

    public TujuanPembelianBNDialog_ViewBinding(FirebaseMessaging firebaseMessaging) {
        this.a = firebaseMessaging;
    }

    @Override // com.google.firebase.iid.internal.FirebaseInstanceIdInternal.NewTokenListener
    public final void onNewToken(String str) {
        this.a.bridge$lambda$0$FirebaseMessaging(str);
    }
}
