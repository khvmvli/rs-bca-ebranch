package io.github.inflationx.calligraphy3;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.TextView;
import io.realm.internal.Property;
/* loaded from: classes-dex2jar.jar:io/github/inflationx/calligraphy3/CalligraphyUtils.class */
public final class CalligraphyUtils {
    public static final int[] ANDROID_ATTR_TEXT_APPEARANCE = {16842804};
    private static Boolean sAppCompatViewCheck;
    private static Boolean sToolbarCheck;

    private CalligraphyUtils() {
    }

    static void applyFontToTextView(Context context, TextView textView, CalligraphyConfig calligraphyConfig) {
        applyFontToTextView(context, textView, calligraphyConfig, false);
    }

    public static void applyFontToTextView(Context context, TextView textView, CalligraphyConfig calligraphyConfig, String str) {
        applyFontToTextView(context, textView, calligraphyConfig, str, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void applyFontToTextView(Context context, TextView textView, CalligraphyConfig calligraphyConfig, String str, boolean z) {
        if (context != null && textView != null && calligraphyConfig != null) {
            if (TextUtils.isEmpty(str) || !applyFontToTextView(context, textView, str, z)) {
                applyFontToTextView(context, textView, calligraphyConfig, z);
            }
        }
    }

    static void applyFontToTextView(Context context, TextView textView, CalligraphyConfig calligraphyConfig, boolean z) {
        if (context != null && textView != null && calligraphyConfig != null && calligraphyConfig.isFontSet()) {
            applyFontToTextView(context, textView, calligraphyConfig.getFontPath(), z);
        }
    }

    public static boolean applyFontToTextView(Context context, TextView textView, String str) {
        return applyFontToTextView(context, textView, str, false);
    }

    static boolean applyFontToTextView(Context context, TextView textView, String str, boolean z) {
        if (textView == null || context == null) {
            return false;
        }
        return applyFontToTextView(textView, TypefaceUtils.load(context.getAssets(), str), z);
    }

    public static boolean applyFontToTextView(TextView textView, Typeface typeface) {
        return applyFontToTextView(textView, typeface, false);
    }

    public static boolean applyFontToTextView(TextView textView, Typeface typeface, boolean z) {
        if (textView == null || typeface == null) {
            return false;
        }
        textView.setPaintFlags(textView.getPaintFlags() | Property.TYPE_ARRAY | 1);
        textView.setTypeface(typeface);
        if (!z) {
            return true;
        }
        textView.setText(applyTypefaceSpan(textView.getText(), typeface), TextView.BufferType.SPANNABLE);
        textView.addTextChangedListener(new 1(typeface));
        return true;
    }

    public static CharSequence applyTypefaceSpan(CharSequence charSequence, Typeface typeface) {
        CharSequence charSequence2 = charSequence;
        if (charSequence != null) {
            charSequence2 = charSequence;
            if (charSequence.length() > 0) {
                charSequence2 = charSequence;
                if (!(charSequence instanceof Spannable)) {
                    charSequence2 = new SpannableString(charSequence);
                }
                ((Spannable) charSequence2).setSpan(TypefaceUtils.getSpan(typeface), 0, charSequence2.length(), 33);
            }
        }
        return charSequence2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean canAddV7AppCompatViews() {
        if (sAppCompatViewCheck == null) {
            try {
                Class.forName("o.setTypeface");
                sAppCompatViewCheck = Boolean.TRUE;
            } catch (ClassNotFoundException e) {
                sAppCompatViewCheck = Boolean.FALSE;
            }
        }
        return sAppCompatViewCheck.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean canCheckForV7Toolbar() {
        if (sToolbarCheck == null) {
            try {
                Class.forName("o.setInputType");
                sToolbarCheck = Boolean.TRUE;
            } catch (ClassNotFoundException e) {
                sToolbarCheck = Boolean.FALSE;
            }
        }
        return sToolbarCheck.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String pullFontPathFromStyle(Context context, AttributeSet attributeSet, int[] iArr) {
        TypedArray obtainStyledAttributes;
        if (iArr == null || attributeSet == null || (obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr)) == null) {
            return null;
        }
        try {
            String string = obtainStyledAttributes.getString(0);
            if (!TextUtils.isEmpty(string)) {
                obtainStyledAttributes.recycle();
                return string;
            }
        } catch (Exception e) {
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
        obtainStyledAttributes.recycle();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Finally extract failed */
    public static String pullFontPathFromTextAppearance(Context context, AttributeSet attributeSet, int[] iArr) {
        if (iArr == null || attributeSet == null) {
            return null;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ANDROID_ATTR_TEXT_APPEARANCE);
        int i = -1;
        if (obtainStyledAttributes != null) {
            try {
                i = obtainStyledAttributes.getResourceId(0, -1);
            } catch (Exception e) {
                obtainStyledAttributes.recycle();
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
        obtainStyledAttributes = context.obtainStyledAttributes(i, iArr);
        if (obtainStyledAttributes == null) {
            return null;
        }
        try {
            return obtainStyledAttributes.getString(0);
        } catch (Exception e2) {
            return null;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String pullFontPathFromTheme(Context context, int i, int i2, int[] iArr) {
        if (i == -1 || iArr == null) {
            return null;
        }
        Resources.Theme theme = context.getTheme();
        TypedValue typedValue = new TypedValue();
        theme.resolveAttribute(i, typedValue, true);
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(typedValue.resourceId, new int[]{i2});
        try {
            int resourceId = obtainStyledAttributes.getResourceId(0, -1);
            obtainStyledAttributes.recycle();
            if (resourceId == -1 || (obtainStyledAttributes = context.obtainStyledAttributes(resourceId, iArr)) == null) {
                return null;
            }
            try {
                return obtainStyledAttributes.getString(0);
            } catch (Exception e) {
                return null;
            } finally {
            }
        } catch (Exception e2) {
            return null;
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String pullFontPathFromTheme(Context context, int i, int[] iArr) {
        if (i == -1 || iArr == null) {
            return null;
        }
        Resources.Theme theme = context.getTheme();
        TypedValue typedValue = new TypedValue();
        theme.resolveAttribute(i, typedValue, true);
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(typedValue.resourceId, iArr);
        try {
            return obtainStyledAttributes.getString(0);
        } catch (Exception e) {
            return null;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String pullFontPathFromView(Context context, AttributeSet attributeSet, int[] iArr) {
        if (iArr == null || attributeSet == null) {
            return null;
        }
        try {
            String resourceEntryName = context.getResources().getResourceEntryName(iArr[0]);
            int attributeResourceValue = attributeSet.getAttributeResourceValue(null, resourceEntryName, -1);
            String string = attributeResourceValue > 0 ? context.getString(attributeResourceValue) : attributeSet.getAttributeValue(null, resourceEntryName);
            String str = string;
            if (string != null) {
                str = string;
                if (string.startsWith("?")) {
                    str = string;
                    if (string.length() > 1) {
                        String substring = string.substring(1);
                        str = string;
                        if (TextUtils.isDigitsOnly(substring)) {
                            int parseInt = Integer.parseInt(substring);
                            TypedValue typedValue = new TypedValue();
                            context.getTheme().resolveAttribute(parseInt, typedValue, true);
                            str = string;
                            if (typedValue.type == 3) {
                                str = string;
                                if (typedValue.string != null) {
                                    str = typedValue.string.toString();
                                }
                            }
                        }
                    }
                }
            }
            return str;
        } catch (Resources.NotFoundException e) {
            return null;
        }
    }
}
