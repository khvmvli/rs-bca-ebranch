package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
/* loaded from: classes2-dex2jar.jar:o/GuestWarningWebViewDialog_ViewBinding.class */
public final class GuestWarningWebViewDialog_ViewBinding {
    private static final int[] e = {BaseDialogKotlin$MediaBrowserCompat$CustomActionResultReceiver.l};
    private static final int[] b = {BaseDialogKotlin$MediaBrowserCompat$CustomActionResultReceiver.q};

    public static void a(Context context) {
        e(context, e, "Theme.AppCompat");
    }

    public static void a(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, BaseDialogKotlin$MediaSessionCompat$Token.ig, i, i2);
        boolean z = obtainStyledAttributes.getBoolean(BaseDialogKotlin$MediaSessionCompat$Token.ij, false);
        obtainStyledAttributes.recycle();
        if (z) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(BaseDialogKotlin$MediaBrowserCompat$CustomActionResultReceiver.u, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                e(context, b, "Theme.MaterialComponents");
            }
        }
        a(context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0079, code lost:
        if (r0.getResourceId(o.BaseDialogKotlin$MediaSessionCompat$Token.ie, -1) != -1) goto L_0x007c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static void a(android.content.Context r6, android.util.AttributeSet r7, int[] r8, int r9, int r10, int... r11) {
        /*
            r0 = r6
            r1 = r7
            int[] r2 = o.BaseDialogKotlin$MediaSessionCompat$Token.ig
            r3 = r9
            r4 = r10
            android.content.res.TypedArray r0 = r0.obtainStyledAttributes(r1, r2, r3, r4)
            r12 = r0
            int r0 = o.BaseDialogKotlin$MediaSessionCompat$Token.ih
            r13 = r0
            r0 = 0
            r14 = r0
            r0 = r12
            r1 = r13
            r2 = 0
            boolean r0 = r0.getBoolean(r1, r2)
            if (r0 != 0) goto L_0x0026
            r0 = r12
            r0.recycle()
            return
        L_0x0026:
            r0 = r11
            if (r0 == 0) goto L_0x006c
            r0 = r11
            int r0 = r0.length
            if (r0 == 0) goto L_0x006c
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            android.content.res.TypedArray r0 = r0.obtainStyledAttributes(r1, r2, r3, r4)
            r6 = r0
            r0 = r11
            int r0 = r0.length
            r10 = r0
            r0 = 0
            r9 = r0
        L_0x0042:
            r0 = r9
            r1 = r10
            if (r0 >= r1) goto L_0x0065
            r0 = r6
            r1 = r11
            r2 = r9
            r1 = r1[r2]
            r2 = -1
            int r0 = r0.getResourceId(r1, r2)
            r1 = -1
            if (r0 != r1) goto L_0x005f
            r0 = r6
            r0.recycle()
            r0 = r14
            r9 = r0
            goto L_0x007e
        L_0x005f:
            int r9 = r9 + 1
            goto L_0x0042
        L_0x0065:
            r0 = r6
            r0.recycle()
            goto L_0x007c
        L_0x006c:
            r0 = r14
            r9 = r0
            r0 = r12
            int r1 = o.BaseDialogKotlin$MediaSessionCompat$Token.ie
            r2 = -1
            int r0 = r0.getResourceId(r1, r2)
            r1 = -1
            if (r0 == r1) goto L_0x007e
        L_0x007c:
            r0 = 1
            r9 = r0
        L_0x007e:
            r0 = r12
            r0.recycle()
            r0 = r9
            if (r0 == 0) goto L_0x0088
            return
        L_0x0088:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.String r2 = "This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant)."
            r1.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.GuestWarningWebViewDialog_ViewBinding.a(android.content.Context, android.util.AttributeSet, int[], int, int, int[]):void");
    }

    public static setIconifiedByDefault b(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        a(context, attributeSet, i, i2);
        a(context, attributeSet, iArr, i, i2, iArr2);
        return new setIconifiedByDefault(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    private static boolean b(Context context, int[] iArr) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i = 0; i < iArr.length; i++) {
            if (!obtainStyledAttributes.hasValue(i)) {
                obtainStyledAttributes.recycle();
                return false;
            }
        }
        obtainStyledAttributes.recycle();
        return true;
    }

    public static TypedArray c(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        a(context, attributeSet, i, i2);
        a(context, attributeSet, iArr, i, i2, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i, i2);
    }

    private static void e(Context context, int[] iArr, String str) {
        if (!b(context, iArr)) {
            StringBuilder sb = new StringBuilder("The style on this component requires your app theme to be ");
            sb.append(str);
            sb.append(" (or a descendant).");
            throw new IllegalArgumentException(sb.toString());
        }
    }
}
