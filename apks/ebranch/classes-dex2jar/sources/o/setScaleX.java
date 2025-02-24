package o;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
/* loaded from: classes-dex2jar.jar:o/setScaleX.class */
public abstract class setScaleX {
    DataSetObserver b;
    public final DataSetObservable c = new DataSetObservable();

    public void a(Parcelable parcelable, ClassLoader classLoader) {
    }

    public void a(ViewGroup viewGroup) {
    }

    public void a(ViewGroup viewGroup, int i, Object obj) {
        throw new UnsupportedOperationException("Required method destroyItem was not overridden");
    }

    public abstract boolean a(View view, Object obj);

    public Parcelable b() {
        return null;
    }

    public void b(ViewGroup viewGroup) {
    }

    public void b(ViewGroup viewGroup, int i, Object obj) {
    }

    public CharSequence c(int i) {
        return null;
    }

    public abstract int d();

    public Object e(ViewGroup viewGroup, int i) {
        throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
    }
}
