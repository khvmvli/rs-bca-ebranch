package o;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import o.setActionBarVisibilityCallback;
/* loaded from: classes-dex2jar.jar:o/setBackgroundResource.class */
public abstract class setBackgroundResource {

    /* loaded from: classes-dex2jar.jar:o/setBackgroundResource$IconCompatParcelizer.class */
    public static class IconCompatParcelizer extends ViewGroup.MarginLayoutParams {
        public int a;

        public IconCompatParcelizer(int i, int i2) {
            super(i, i2);
            this.a = 8388627;
        }

        public IconCompatParcelizer(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, setHasDecor$MediaBrowserCompat$MediaItem.d);
            this.a = obtainStyledAttributes.getInt(setHasDecor$MediaBrowserCompat$MediaItem.c, 0);
            obtainStyledAttributes.recycle();
        }

        public IconCompatParcelizer(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.a = 0;
        }

        public IconCompatParcelizer(IconCompatParcelizer iconCompatParcelizer) {
            super((ViewGroup.MarginLayoutParams) iconCompatParcelizer);
            this.a = 0;
            this.a = iconCompatParcelizer.a;
        }
    }

    @Deprecated
    /* loaded from: classes-dex2jar.jar:o/setBackgroundResource$write.class */
    public static abstract class write {
        public abstract Drawable a();

        public abstract View b();

        public abstract CharSequence c();

        public abstract CharSequence e();
    }

    public Context a() {
        return null;
    }

    public setActionBarVisibilityCallback a(setActionBarVisibilityCallback.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        return null;
    }

    public void a(Drawable drawable) {
    }

    public void a(CharSequence charSequence) {
    }

    public void a(boolean z) {
    }

    public boolean a(int i, KeyEvent keyEvent) {
        return false;
    }

    public void b(Configuration configuration) {
    }

    public void b(boolean z) {
    }

    public boolean b() {
        return false;
    }

    public boolean b(KeyEvent keyEvent) {
        return false;
    }

    public void c(int i) {
    }

    public void c(boolean z) {
        throw new UnsupportedOperationException("Hide on content scroll is not supported in this action bar configuration.");
    }

    public boolean c() {
        return false;
    }

    public abstract void d(CharSequence charSequence);

    public abstract void d(boolean z);

    public boolean d() {
        return false;
    }

    public abstract int e();

    public void e(boolean z) {
    }

    public boolean g() {
        return false;
    }

    public void h() {
    }
}
