package o;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.StateSet;
import android.util.Xml;
import java.io.IOException;
import java.lang.reflect.Array;
import o.setGuidelineBegin;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes-dex2jar.jar:o/getTappableElementInsets.class */
public final class getTappableElementInsets {
    private static TypedArray a(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public static ColorStateList b(Resources resources, int i, Resources.Theme theme) {
        try {
            return b(resources, resources.getXml(i), theme);
        } catch (Exception e) {
            Log.e("CSLCompat", "Failed to inflate ColorStateList.", e);
            return null;
        }
    }

    public static ColorStateList b(Resources resources, XmlPullParser xmlPullParser, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return b(resources, xmlPullParser, asAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static ColorStateList b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        String name = xmlPullParser.getName();
        if (name.equals("selector")) {
            return c(resources, xmlPullParser, attributeSet, theme);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(xmlPullParser.getPositionDescription());
        sb.append(": invalid color state list tag ");
        sb.append(name);
        throw new XmlPullParserException(sb.toString());
    }

    private static ColorStateList c(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth;
        int depth2 = xmlPullParser.getDepth() + 1;
        int[][] iArr = new int[20];
        int[] iArr2 = new int[20];
        int i = 0;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1 || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                break;
            } else if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                TypedArray a = a(resources, theme, attributeSet, setGuidelineBegin.write.e);
                int color = a.getColor(setGuidelineBegin.write.c, -65281);
                float f = 1.0f;
                if (a.hasValue(setGuidelineBegin.write.d)) {
                    f = a.getFloat(setGuidelineBegin.write.d, 1.0f);
                } else if (a.hasValue(setGuidelineBegin.write.a)) {
                    f = a.getFloat(setGuidelineBegin.write.a, 1.0f);
                }
                a.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr3 = new int[attributeCount];
                int i2 = 0;
                for (int i3 = 0; i3 < attributeCount; i3++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i3);
                    i2 = i2;
                    if (attributeNameResource != 16843173) {
                        i2 = i2;
                        if (attributeNameResource != 16843551) {
                            i2 = i2;
                            if (attributeNameResource != setGuidelineBegin.read.d) {
                                iArr3[i2] = attributeSet.getAttributeBooleanValue(i3, false) ? attributeNameResource : -attributeNameResource;
                                i2++;
                            }
                        }
                    }
                }
                int[] trimStateSet = StateSet.trimStateSet(iArr3, i2);
                int e = e(color, f);
                int i4 = i + 1;
                int i5 = 8;
                int[] iArr4 = iArr2;
                if (i4 > iArr2.length) {
                    iArr4 = new int[i <= 4 ? 8 : i << 1];
                    System.arraycopy(iArr2, 0, iArr4, 0, i);
                }
                iArr4[i] = e;
                Object[] objArr = iArr;
                if (i4 > iArr.length) {
                    Class<?> componentType = iArr.getClass().getComponentType();
                    if (i > 4) {
                        i5 = i << 1;
                    }
                    objArr = (Object[]) Array.newInstance(componentType, i5);
                    System.arraycopy(iArr, 0, objArr, 0, i);
                }
                objArr[i] = trimStateSet;
                iArr = (int[][]) objArr;
                i = i4;
                iArr2 = iArr4;
            }
        }
        int[] iArr5 = new int[i];
        int[][] iArr6 = new int[i];
        System.arraycopy(iArr2, 0, iArr5, 0, i);
        System.arraycopy(iArr, 0, iArr6, 0, i);
        return new ColorStateList(iArr6, iArr5);
    }

    private static int e(int i, float f) {
        return (Math.round(((float) Color.alpha(i)) * f) << 24) | (16777215 & i);
    }
}
