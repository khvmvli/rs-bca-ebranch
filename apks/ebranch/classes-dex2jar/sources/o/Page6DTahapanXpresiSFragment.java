package o;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
/* loaded from: classes-dex2jar.jar:o/Page6DTahapanXpresiSFragment.class */
public final class Page6DTahapanXpresiSFragment implements onClickCardPlatinum {
    public static final read d = new read((byte) 0);
    private static final Class<? extends Object>[] c = {Context.class};
    private static final Class<? extends Object>[] a = {Context.class, AttributeSet.class};

    /* loaded from: classes-dex2jar.jar:o/Page6DTahapanXpresiSFragment$read.class */
    public static final class read {
        private read() {
        }

        public /* synthetic */ read(byte b) {
            this();
        }
    }

    @Override // o.onClickCardPlatinum
    public final View a(View view, String str, Context context, AttributeSet attributeSet) {
        Constructor constructor;
        Object[] objArr;
        subscribeReservationRescheduleEvent.b((Object) str, "");
        subscribeReservationRescheduleEvent.b((Object) context, "");
        try {
            Class<? extends U> asSubclass = Class.forName(str).asSubclass(View.class);
            try {
                Class<? extends Object>[] clsArr = a;
                constructor = asSubclass.getConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length));
                subscribeReservationRescheduleEvent.a(constructor, "");
                objArr = new Object[2];
                objArr[0] = context;
                objArr[1] = attributeSet;
            } catch (NoSuchMethodException e) {
                Class<? extends Object>[] clsArr2 = c;
                constructor = asSubclass.getConstructor((Class[]) Arrays.copyOf(clsArr2, clsArr2.length));
                subscribeReservationRescheduleEvent.a(constructor, "");
                objArr = new Context[1];
                objArr[0] = context;
            }
            constructor.setAccessible(true);
            return (View) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (Exception e2) {
            if (e2 instanceof ClassNotFoundException) {
                e2.printStackTrace();
                return null;
            } else if (e2 instanceof NoSuchMethodException) {
                e2.printStackTrace();
                return null;
            } else if (e2 instanceof IllegalAccessException) {
                e2.printStackTrace();
                return null;
            } else if (e2 instanceof InstantiationException) {
                e2.printStackTrace();
                return null;
            } else if (e2 instanceof InvocationTargetException) {
                e2.printStackTrace();
                return null;
            } else {
                throw e2;
            }
        }
    }
}
