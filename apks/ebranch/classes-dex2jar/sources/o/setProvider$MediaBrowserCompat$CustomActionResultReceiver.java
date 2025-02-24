package o;

import android.content.Context;
import android.view.ActionProvider;
import android.view.SubMenu;
import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/setProvider$MediaBrowserCompat$CustomActionResultReceiver.class */
public class setProvider$MediaBrowserCompat$CustomActionResultReceiver extends onCreateDialog {
    final ActionProvider b;
    final /* synthetic */ setProvider c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setProvider$MediaBrowserCompat$CustomActionResultReceiver(setProvider setprovider, Context context, ActionProvider actionProvider) {
        super(context);
        this.c = setprovider;
        this.b = actionProvider;
    }

    @Override // o.onCreateDialog
    public View b() {
        return this.b.onCreateActionView();
    }

    @Override // o.onCreateDialog
    public boolean c() {
        return this.b.onPerformDefaultAction();
    }

    @Override // o.onCreateDialog
    public boolean d() {
        return this.b.hasSubMenu();
    }

    @Override // o.onCreateDialog
    public void e(SubMenu subMenu) {
        this.b.onPrepareSubMenu(this.c.e(subMenu));
    }
}
