package o;

import android.content.Context;
import android.content.Intent;
/* loaded from: classes-dex2jar.jar:o/ComponentActivity$4.class */
public abstract class ComponentActivity$4<I, O> {

    /* loaded from: classes-dex2jar.jar:o/ComponentActivity$4$read.class */
    public static final class read<T> {
        public final T a;

        public read(T t) {
            this.a = t;
        }
    }

    public read<O> c(Context context, I i) {
        return null;
    }

    public abstract Intent d(Context context, I i);

    public abstract O e(int i, Intent intent);
}
