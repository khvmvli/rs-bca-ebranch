package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
/* loaded from: classes-dex2jar.jar:o/setIconifiedByDefault.class */
public final class setIconifiedByDefault {
    TypedValue c;
    public final TypedArray d;
    final Context e;

    public setIconifiedByDefault(Context context, TypedArray typedArray) {
        this.e = context;
        this.d = typedArray;
    }

    public final Drawable a(int i) {
        int resourceId;
        if (!this.d.hasValue(i) || (resourceId = this.d.getResourceId(i, 0)) == 0) {
            return null;
        }
        return setImageResource.c().c(this.e, resourceId, true);
    }

    public final Drawable d(int i) {
        int resourceId;
        return (!this.d.hasValue(i) || (resourceId = this.d.getResourceId(i, 0)) == 0) ? this.d.getDrawable(i) : setPrimaryBackground.c(this.e, resourceId);
    }

    public final ColorStateList e(int i) {
        int resourceId;
        ColorStateList b;
        return (!this.d.hasValue(i) || (resourceId = this.d.getResourceId(i, 0)) == 0 || (b = setPrimaryBackground.b(this.e, resourceId)) == null) ? this.d.getColorStateList(i) : b;
    }
}
