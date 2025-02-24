package o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.ViewGroup;
import android.view.Window;
import o.setDropDownBackgroundResource;
import o.setOnDismissListener;
/* loaded from: classes-dex2jar.jar:o/setSelector.class */
public interface setSelector {
    void a();

    void a(int i);

    void a(Drawable drawable);

    void a(CharSequence charSequence);

    int b();

    void b(int i);

    void b(Window.Callback callback);

    void b(setDropDownBackgroundResource.IconCompatParcelizer iconCompatParcelizer, setOnDismissListener.RemoteActionCompatParcelizer remoteActionCompatParcelizer);

    void b(boolean z);

    Context c();

    void c(int i);

    void c(setTabSelected settabselected);

    void d();

    void d(int i);

    void d(CharSequence charSequence);

    generateActivityResultKey e(int i, long j);

    void e(int i);

    void e(Drawable drawable);

    void e(Menu menu, setDropDownBackgroundResource.IconCompatParcelizer iconCompatParcelizer);

    boolean e();

    ViewGroup f();

    boolean g();

    boolean h();

    Menu i();

    int j();

    void k();

    boolean l();

    boolean m();

    void n();

    void o();

    boolean r();
}
