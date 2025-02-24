package androidx.appcompat.widget;

import android.os.Build;
import android.widget.AutoCompleteTextView;
import java.lang.reflect.Method;
/* loaded from: classes-dex2jar.jar:androidx/appcompat/widget/SearchView$MediaBrowserCompat$CustomActionResultReceiver.class */
final class SearchView$MediaBrowserCompat$CustomActionResultReceiver {
    private Method a;
    Method b;
    Method e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SearchView$MediaBrowserCompat$CustomActionResultReceiver() {
        this.e = null;
        this.b = null;
        this.a = null;
        if (Build.VERSION.SDK_INT < 29) {
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.e = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException e2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.a = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException e3) {
            }
        } else {
            throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(AutoCompleteTextView autoCompleteTextView) {
        if (Build.VERSION.SDK_INT < 29) {
            Method method = this.a;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, Boolean.TRUE);
                } catch (Exception e) {
                }
            }
        } else {
            throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
        }
    }
}
