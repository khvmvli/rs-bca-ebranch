package o;

import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import o.setProgressViewEndTarget;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/setTrimPathEnd.class */
public class setTrimPathEnd {
    private static boolean a;
    private static Method b;
    private static boolean d;
    private static Field e;

    private void b() {
        if (!d) {
            try {
                Method declaredMethod = View.class.getDeclaredMethod("setFrame", Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE);
                b = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e2) {
                Log.i("ViewUtilsBase", "Failed to retrieve setFrame method", e2);
            }
            d = true;
        }
    }

    public void a(View view) {
        if (view.getVisibility() == 0) {
            view.setTag(setProgressViewEndTarget.write.a, null);
        }
    }

    public void a(View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            a(view2, matrix);
            matrix.postTranslate((float) view2.getScrollX(), (float) view2.getScrollY());
        }
        matrix.postTranslate((float) (-view.getLeft()), (float) (-view.getTop()));
        Matrix matrix2 = view.getMatrix();
        if (!matrix2.isIdentity()) {
            Matrix matrix3 = new Matrix();
            if (matrix2.invert(matrix3)) {
                matrix.postConcat(matrix3);
            }
        }
    }

    public float b(View view) {
        Float f = (Float) view.getTag(setProgressViewEndTarget.write.a);
        return f != null ? view.getAlpha() / f.floatValue() : view.getAlpha();
    }

    public void d(View view, int i) {
        if (!a) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                e = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.i("ViewUtilsBase", "fetchViewFlagsField: ");
            }
            a = true;
        }
        Field field = e;
        if (field != null) {
            try {
                e.setInt(view, i | (field.getInt(view) & -13));
            } catch (IllegalAccessException e3) {
            }
        }
    }

    public void d(View view, int i, int i2, int i3, int i4) {
        b();
        Method method = b;
        if (method != null) {
            try {
                method.invoke(view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
            } catch (IllegalAccessException e2) {
            } catch (InvocationTargetException e3) {
                throw new RuntimeException(e3.getCause());
            }
        }
    }

    public void e(View view) {
        if (view.getTag(setProgressViewEndTarget.write.a) == null) {
            view.setTag(setProgressViewEndTarget.write.a, Float.valueOf(view.getAlpha()));
        }
    }

    public void e(View view, float f) {
        Float f2 = (Float) view.getTag(setProgressViewEndTarget.write.a);
        if (f2 != null) {
            view.setAlpha(f2.floatValue() * f);
        } else {
            view.setAlpha(f);
        }
    }

    public void e(View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            e(view2, matrix);
            matrix.preTranslate((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
        }
        matrix.preTranslate((float) view.getLeft(), (float) view.getTop());
        Matrix matrix2 = view.getMatrix();
        if (!matrix2.isIdentity()) {
            matrix.preConcat(matrix2);
        }
    }
}
