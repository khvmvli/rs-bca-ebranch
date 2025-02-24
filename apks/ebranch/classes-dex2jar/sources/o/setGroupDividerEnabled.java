package o;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* loaded from: classes-dex2jar.jar:o/setGroupDividerEnabled.class */
public class setGroupDividerEnabled {
    private final Object[] b = new Object[2];
    private static final Class<?>[] d = {Context.class, AttributeSet.class};
    private static final int[] e = {16843375};
    private static final String[] a = {"android.widget.", "android.view.", "android.webkit."};
    private static final setCollapseIcon<String, Constructor<? extends View>> c = new setCollapseIcon<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/setGroupDividerEnabled$write.class */
    public static class write implements View.OnClickListener {
        private Context b;
        private Method c;
        private final String d;
        private final View e;

        public write(View view, String str) {
            this.e = view;
            this.d = str;
        }

        private void d(Context context) {
            String str;
            Method method;
            while (context != null) {
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.d, View.class)) != null) {
                        this.c = method;
                        this.b = context;
                        return;
                    }
                } catch (NoSuchMethodException e) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
            int id = this.e.getId();
            if (id == -1) {
                str = "";
            } else {
                StringBuilder sb = new StringBuilder(" with id '");
                sb.append(this.e.getContext().getResources().getResourceEntryName(id));
                sb.append("'");
                str = sb.toString();
            }
            StringBuilder sb2 = new StringBuilder("Could not find method ");
            sb2.append(this.d);
            sb2.append("(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
            sb2.append(this.e.getClass());
            sb2.append(str);
            throw new IllegalStateException(sb2.toString());
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.c == null) {
                d(this.e.getContext());
            }
            try {
                this.c.invoke(this.b, view);
            } catch (IllegalAccessException e) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
            } catch (InvocationTargetException e2) {
                throw new IllegalStateException("Could not execute method for android:onClick", e2);
            }
        }
    }

    private View a(Context context, String str, String str2) throws ClassNotFoundException, InflateException {
        String obj;
        setCollapseIcon<String, Constructor<? extends View>> setcollapseicon = c;
        Constructor<? extends View> constructor = setcollapseicon.get(str);
        Constructor<? extends View> constructor2 = constructor;
        if (constructor == null) {
            if (str2 != null) {
                try {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str2);
                    sb.append(str);
                    obj = sb.toString();
                } catch (Exception e2) {
                    return null;
                }
            } else {
                obj = str;
            }
            constructor2 = Class.forName(obj, false, context.getClassLoader()).asSubclass(View.class).getConstructor(d);
            setcollapseicon.put(str, constructor2);
        }
        constructor2.setAccessible(true);
        return (View) constructor2.newInstance(this.b);
    }

    /* JADX WARN: Finally extract failed */
    private View c(Context context, String str, AttributeSet attributeSet) {
        String str2 = str;
        if (str.equals("view")) {
            str2 = attributeSet.getAttributeValue(null, "class");
        }
        try {
            Object[] objArr = this.b;
            objArr[0] = context;
            objArr[1] = attributeSet;
            if (-1 == str2.indexOf(46)) {
                int i = 0;
                while (true) {
                    String[] strArr = a;
                    if (i < strArr.length) {
                        View a2 = a(context, str2, strArr[i]);
                        if (a2 != null) {
                            Object[] objArr2 = this.b;
                            objArr2[0] = null;
                            objArr2[1] = null;
                            return a2;
                        }
                        i++;
                    } else {
                        Object[] objArr3 = this.b;
                        objArr3[0] = null;
                        objArr3[1] = null;
                        return null;
                    }
                }
            } else {
                View a3 = a(context, str2, null);
                Object[] objArr4 = this.b;
                objArr4[0] = null;
                objArr4[1] = null;
                return a3;
            }
        } catch (Exception e2) {
            Object[] objArr5 = this.b;
            objArr5[0] = null;
            objArr5[1] = null;
            return null;
        } catch (Throwable th) {
            Object[] objArr6 = this.b;
            objArr6[0] = null;
            objArr6[1] = null;
            throw th;
        }
    }

    private void d(View view, String str) {
        if (view == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(getClass().getName());
            sb.append(" asked to inflate view for <");
            sb.append(str);
            sb.append(">, but returned null");
            throw new IllegalStateException(sb.toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006c, code lost:
        if (((o.setShowingForActionMode) r6).b != r11) goto L_0x006f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private static android.content.Context e(android.content.Context r6, android.util.AttributeSet r7, boolean r8, boolean r9) {
        /*
            r0 = r6
            r1 = r7
            int[] r2 = o.setHasDecor$MediaBrowserCompat$MediaItem.dV
            r3 = 0
            r4 = 0
            android.content.res.TypedArray r0 = r0.obtainStyledAttributes(r1, r2, r3, r4)
            r7 = r0
            r0 = r8
            if (r0 == 0) goto L_0x001c
            r0 = r7
            int r1 = o.setHasDecor$MediaBrowserCompat$MediaItem.eg
            r2 = 0
            int r0 = r0.getResourceId(r1, r2)
            r10 = r0
            goto L_0x001f
        L_0x001c:
            r0 = 0
            r10 = r0
        L_0x001f:
            r0 = r10
            r11 = r0
            r0 = r9
            if (r0 == 0) goto L_0x004f
            r0 = r10
            r11 = r0
            r0 = r10
            if (r0 != 0) goto L_0x004f
            r0 = r7
            int r1 = o.setHasDecor$MediaBrowserCompat$MediaItem.eh
            r2 = 0
            int r0 = r0.getResourceId(r1, r2)
            r10 = r0
            r0 = r10
            r11 = r0
            r0 = r10
            if (r0 == 0) goto L_0x004f
            java.lang.String r0 = "AppCompatViewInflater"
            java.lang.String r1 = "app:theme is now deprecated. Please move to using android:theme instead."
            int r0 = android.util.Log.i(r0, r1)
            r0 = r10
            r11 = r0
        L_0x004f:
            r0 = r7
            r0.recycle()
            r0 = r6
            r7 = r0
            r0 = r11
            if (r0 == 0) goto L_0x007a
            r0 = r6
            boolean r0 = r0 instanceof o.setShowingForActionMode
            if (r0 == 0) goto L_0x006f
            r0 = r6
            r7 = r0
            r0 = r6
            o.setShowingForActionMode r0 = (o.setShowingForActionMode) r0
            int r0 = r0.b
            r1 = r11
            if (r0 == r1) goto L_0x007a
        L_0x006f:
            o.setShowingForActionMode r0 = new o.setShowingForActionMode
            r1 = r0
            r2 = r6
            r3 = r11
            r1.<init>(r2, r3)
            r7 = r0
        L_0x007a:
            r0 = r7
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setGroupDividerEnabled.e(android.content.Context, android.util.AttributeSet, boolean, boolean):android.content.Context");
    }

    private void e(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if ((context instanceof ContextWrapper) && findFragmentByWho.A(view)) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e);
            String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                view.setOnClickListener(new write(view, string));
            }
            obtainStyledAttributes.recycle();
        }
    }

    protected setCheckMarkDrawable a(Context context, AttributeSet attributeSet) {
        return new setCheckMarkDrawable(context, attributeSet);
    }

    protected setPopupBackgroundDrawable b(Context context, AttributeSet attributeSet) {
        return new setPopupBackgroundDrawable(context, attributeSet);
    }

    protected setAdapter c(Context context, AttributeSet attributeSet) {
        return new setAdapter(context, attributeSet);
    }

    protected View d(Context context, String str, AttributeSet attributeSet) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001f, code lost:
        if (r12 != false) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final android.view.View d(android.view.View r6, java.lang.String r7, android.content.Context r8, android.util.AttributeSet r9, boolean r10, boolean r11, boolean r12, boolean r13) {
        /*
        // Method dump skipped, instructions count: 801
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setGroupDividerEnabled.d(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet, boolean, boolean, boolean, boolean):android.view.View");
    }

    protected setImageURI d(Context context, AttributeSet attributeSet) {
        return new setImageURI(context, attributeSet);
    }

    protected setSupportImageTintMode e(Context context, AttributeSet attributeSet) {
        return new setSupportImageTintMode(context, attributeSet);
    }

    protected setCompoundDrawables f(Context context, AttributeSet attributeSet) {
        return new setCompoundDrawables(context, attributeSet);
    }

    protected setPopupBackgroundResource g(Context context, AttributeSet attributeSet) {
        return new setPopupBackgroundResource(context, attributeSet);
    }

    protected setDropDownHorizontalOffset h(Context context, AttributeSet attributeSet) {
        return new setDropDownHorizontalOffset(context, attributeSet);
    }

    protected setCompoundDrawablesRelative i(Context context, AttributeSet attributeSet) {
        return new setCompoundDrawablesRelative(context, attributeSet);
    }

    protected setCompoundDrawablesWithIntrinsicBounds j(Context context, AttributeSet attributeSet) {
        return new setCompoundDrawablesWithIntrinsicBounds(context, attributeSet);
    }

    protected setTextMetricsParamsCompat l(Context context, AttributeSet attributeSet) {
        return new setTextMetricsParamsCompat(context, attributeSet);
    }

    protected setTypeface m(Context context, AttributeSet attributeSet) {
        return new setTypeface(context, attributeSet);
    }

    protected setTextFuture n(Context context, AttributeSet attributeSet) {
        return new setTextFuture(context, attributeSet);
    }

    protected setLineHeight o(Context context, AttributeSet attributeSet) {
        return new setLineHeight(context, attributeSet);
    }
}
