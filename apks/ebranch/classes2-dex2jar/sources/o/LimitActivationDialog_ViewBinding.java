package o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
/* loaded from: classes2-dex2jar.jar:o/LimitActivationDialog_ViewBinding.class */
public final class LimitActivationDialog_ViewBinding extends View {
    public final Drawable a;
    public final int b;
    public final CharSequence e;

    public LimitActivationDialog_ViewBinding(Context context) {
        this(context, null);
    }

    public LimitActivationDialog_ViewBinding(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setIconifiedByDefault seticonifiedbydefault = new setIconifiedByDefault(context, context.obtainStyledAttributes(attributeSet, BaseDialogKotlin$MediaSessionCompat$Token.fW));
        this.e = seticonifiedbydefault.d.getText(BaseDialogKotlin$MediaSessionCompat$Token.gb);
        this.a = seticonifiedbydefault.d(BaseDialogKotlin$MediaSessionCompat$Token.ga);
        this.b = seticonifiedbydefault.d.getResourceId(BaseDialogKotlin$MediaSessionCompat$Token.fY, 0);
        seticonifiedbydefault.d.recycle();
    }
}
