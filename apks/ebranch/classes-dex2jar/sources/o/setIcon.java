package o;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import o.Keep;
/* loaded from: classes-dex2jar.jar:o/setIcon.class */
public abstract class setIcon {
    private static int b;
    private static final setThumbTintMode<WeakReference<setIcon>> d = new setThumbTintMode<>();
    private static final Object a = new Object();

    public static int a() {
        return b;
    }

    public static setIcon a(Activity activity, setItemInvoker setiteminvoker) {
        return new setPopupCallback(activity, setiteminvoker);
    }

    public static setIcon a(Dialog dialog, setItemInvoker setiteminvoker) {
        return new setPopupCallback(dialog, setiteminvoker);
    }

    static void a(setIcon seticon) {
        synchronized (a) {
            e(seticon);
        }
    }

    static void b(setIcon seticon) {
        synchronized (a) {
            e(seticon);
            d.add(new WeakReference<>(seticon));
        }
    }

    private static void e(setIcon seticon) {
        synchronized (a) {
            Iterator<WeakReference<setIcon>> it = d.iterator();
            while (it.hasNext()) {
                setIcon seticon2 = it.next().get();
                if (seticon2 == seticon || seticon2 == null) {
                    it.remove();
                }
            }
        }
    }

    public abstract void a(Bundle bundle);

    public abstract void a(View view);

    public abstract void a(setInputType setinputtype);

    public abstract boolean a(int i);

    public abstract Keep.RemoteActionCompatParcelizer b();

    public void b(int i) {
    }

    public abstract void b(Bundle bundle);

    public abstract void b(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void b(CharSequence charSequence);

    public int c() {
        return -100;
    }

    public abstract MenuInflater d();

    public abstract <T extends View> T d(int i);

    @Deprecated
    public void d(Context context) {
    }

    public abstract void d(Configuration configuration);

    public abstract void d(View view, ViewGroup.LayoutParams layoutParams);

    public Context e(Context context) {
        d(context);
        return context;
    }

    public abstract setBackgroundResource e();

    public abstract void e(int i);

    public abstract void e(Bundle bundle);

    public abstract void f();

    public abstract void g();

    public abstract void h();

    public abstract void i();

    public abstract void j();

    public abstract void m();
}
