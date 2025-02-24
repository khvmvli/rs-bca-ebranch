package o;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import androidx.fragment.app.Fragment;
import java.io.FileDescriptor;
import java.io.PrintWriter;
/* loaded from: classes-dex2jar.jar:o/initState.class */
public abstract class initState<E> extends getViewModelStore {
    final Activity a;
    private final int b;
    final Context c;
    final Handler d;
    final isDetached e;

    private initState(Activity activity, Context context, Handler handler, int i) {
        this.e = new isHideReplaced();
        this.a = activity;
        if (context != null) {
            this.c = context;
            if (handler != null) {
                this.d = handler;
                this.b = 0;
                return;
            }
            throw new NullPointerException("handler == null");
        }
        throw new NullPointerException("context == null");
    }

    public initState(getView getview) {
        this(getview, getview, new Handler(), 0);
    }

    public boolean a(String str) {
        return false;
    }

    public LayoutInflater b() {
        return LayoutInflater.from(this.c);
    }

    public abstract E c();

    public final void d(Fragment fragment, Intent intent, int i, Bundle bundle) {
        if (i == -1) {
            copyWindowDataInto.d(this.c, intent, bundle);
            return;
        }
        throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
    }

    public void d(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    @Override // o.getViewModelStore
    public boolean d() {
        return true;
    }

    @Override // o.getViewModelStore
    public View e(int i) {
        return null;
    }

    public void f() {
    }

    public final Context g() {
        return this.c;
    }

    public boolean h() {
        return true;
    }

    public final Handler i() {
        return this.d;
    }

    public final Activity j() {
        return this.a;
    }
}
