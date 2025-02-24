package o;

import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;
/* loaded from: classes-dex2jar.jar:o/getExitAnim.class */
public final class getExitAnim {
    private static final String[] a = new String[0];

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/getExitAnim$IconCompatParcelizer.class */
    public static class IconCompatParcelizer {
        static void d(EditorInfo editorInfo, CharSequence charSequence, int i) {
            editorInfo.setInitialSurroundingSubText(charSequence, i);
        }
    }

    public static void a(EditorInfo editorInfo, CharSequence charSequence, int i) {
        if (Build.VERSION.SDK_INT >= 30) {
            IconCompatParcelizer.d(editorInfo, charSequence, i);
            return;
        }
        int i2 = (editorInfo.initialSelStart > editorInfo.initialSelEnd ? editorInfo.initialSelEnd : editorInfo.initialSelStart) - i;
        int i3 = (editorInfo.initialSelStart > editorInfo.initialSelEnd ? editorInfo.initialSelStart : editorInfo.initialSelEnd) - i;
        int length = charSequence.length();
        if (i < 0 || i2 < 0 || i3 > length) {
            d(editorInfo, null, 0, 0);
        } else if (b(editorInfo.inputType)) {
            d(editorInfo, null, 0, 0);
        } else if (length <= 2048) {
            d(editorInfo, charSequence, i2, i3);
        } else {
            a(editorInfo, charSequence, i2, i3);
        }
    }

    private static void a(EditorInfo editorInfo, CharSequence charSequence, int i, int i2) {
        int i3 = i2 - i;
        int i4 = i3 > 1024 ? 0 : i3;
        int i5 = 2048 - i4;
        int min = Math.min(charSequence.length() - i2, i5 - Math.min(i, (int) (((double) i5) * 0.8d)));
        int min2 = Math.min(i, i5 - min);
        int i6 = i - min2;
        int i7 = min2;
        int i8 = i6;
        if (a(charSequence, i6, 0)) {
            i8 = i6 + 1;
            i7 = min2 - 1;
        }
        int i9 = min;
        if (a(charSequence, (i2 + min) - 1, 1)) {
            i9 = min - 1;
        }
        d(editorInfo, i4 != i3 ? TextUtils.concat(charSequence.subSequence(i8, i8 + i7), charSequence.subSequence(i2, i9 + i2)) : charSequence.subSequence(i8, i7 + i4 + i9 + i8), i7, i4 + i7);
    }

    private static boolean a(CharSequence charSequence, int i, int i2) {
        if (i2 == 0) {
            return Character.isLowSurrogate(charSequence.charAt(i));
        }
        if (i2 != 1) {
            return false;
        }
        return Character.isHighSurrogate(charSequence.charAt(i));
    }

    public static void b(EditorInfo editorInfo, String[] strArr) {
        if (Build.VERSION.SDK_INT >= 25) {
            editorInfo.contentMimeTypes = strArr;
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArr);
        editorInfo.extras.putStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArr);
    }

    private static boolean b(int i) {
        int i2 = i & 4095;
        return i2 == 129 || i2 == 225 || i2 == 18;
    }

    public static String[] b(EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 25) {
            String[] strArr = editorInfo.contentMimeTypes;
            String[] strArr2 = strArr;
            if (strArr == null) {
                strArr2 = a;
            }
            return strArr2;
        } else if (editorInfo.extras == null) {
            return a;
        } else {
            String[] stringArray = editorInfo.extras.getStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
            String[] strArr3 = stringArray;
            if (stringArray == null) {
                strArr3 = editorInfo.extras.getStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
            }
            String[] strArr4 = strArr3;
            if (strArr3 == null) {
                strArr4 = a;
            }
            return strArr4;
        }
    }

    public static void c(EditorInfo editorInfo, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 30) {
            IconCompatParcelizer.d(editorInfo, charSequence, 0);
        } else {
            a(editorInfo, charSequence, 0);
        }
    }

    private static void d(EditorInfo editorInfo, CharSequence charSequence, int i, int i2) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i2);
    }
}
