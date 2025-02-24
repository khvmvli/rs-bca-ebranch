package o;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import java.io.IOException;
import o.setGuidelineBegin;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes-dex2jar.jar:o/getStableInsets.class */
final class getStableInsets {
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00d4, code lost:
        r0 = new java.lang.StringBuilder();
        r0.append(r7.getPositionDescription());
        r0.append(": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00f9, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(r0.toString());
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private static o.getStableInsets$MediaBrowserCompat$CustomActionResultReceiver a(android.content.res.Resources r6, org.xmlpull.v1.XmlPullParser r7, android.util.AttributeSet r8, android.content.res.Resources.Theme r9) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
        // Method dump skipped, instructions count: 274
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getStableInsets.a(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):o.getStableInsets$MediaBrowserCompat$CustomActionResultReceiver");
    }

    private static Shader.TileMode d(int i) {
        return i != 1 ? i != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR : Shader.TileMode.REPEAT;
    }

    private static getStableInsets$MediaBrowserCompat$CustomActionResultReceiver d(getStableInsets$MediaBrowserCompat$CustomActionResultReceiver getstableinsets_mediabrowsercompat_customactionresultreceiver, int i, int i2, boolean z, int i3) {
        return getstableinsets_mediabrowsercompat_customactionresultreceiver != null ? getstableinsets_mediabrowsercompat_customactionresultreceiver : z ? new getStableInsets$MediaBrowserCompat$CustomActionResultReceiver(i, i3, i2) : new getStableInsets$MediaBrowserCompat$CustomActionResultReceiver(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Shader e(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws IOException, XmlPullParserException {
        String name = xmlPullParser.getName();
        if (name.equals("gradient")) {
            int[] iArr = setGuidelineBegin.write.x;
            TypedArray obtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
            float f = !(xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "startX") != null) ? 0.0f : obtainAttributes.getFloat(setGuidelineBegin.write.J, 0.0f);
            float f2 = !(xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "startY") != null) ? 0.0f : obtainAttributes.getFloat(setGuidelineBegin.write.L, 0.0f);
            float f3 = !(xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "endX") != null) ? 0.0f : obtainAttributes.getFloat(setGuidelineBegin.write.G, 0.0f);
            float f4 = !(xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "endY") != null) ? 0.0f : obtainAttributes.getFloat(setGuidelineBegin.write.I, 0.0f);
            float f5 = !(xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "centerX") != null) ? 0.0f : obtainAttributes.getFloat(setGuidelineBegin.write.C, 0.0f);
            float f6 = !(xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "centerY") != null) ? 0.0f : obtainAttributes.getFloat(setGuidelineBegin.write.D, 0.0f);
            int i = !(xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "type") != null) ? 0 : obtainAttributes.getInt(setGuidelineBegin.write.N, 0);
            int color = !(xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "startColor") != null) ? 0 : obtainAttributes.getColor(setGuidelineBegin.write.F, 0);
            boolean z = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null;
            int color2 = !(xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null) ? 0 : obtainAttributes.getColor(setGuidelineBegin.write.z, 0);
            int color3 = !(xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "endColor") != null) ? 0 : obtainAttributes.getColor(setGuidelineBegin.write.H, 0);
            int i2 = !(xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "tileMode") != null) ? 0 : obtainAttributes.getInt(setGuidelineBegin.write.M, 0);
            float f7 = !(xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "gradientRadius") != null) ? 0.0f : obtainAttributes.getFloat(setGuidelineBegin.write.E, 0.0f);
            obtainAttributes.recycle();
            getStableInsets$MediaBrowserCompat$CustomActionResultReceiver d = d(a(resources, xmlPullParser, attributeSet, theme), color, color3, z, color2);
            if (i != 1) {
                return i != 2 ? new LinearGradient(f, f2, f3, f4, d.c, d.d, d(i2)) : new SweepGradient(f5, f6, d.c, d.d);
            }
            if (f7 > 0.0f) {
                return new RadialGradient(f5, f6, f7, d.c, d.d, d(i2));
            }
            throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(xmlPullParser.getPositionDescription());
        sb.append(": invalid gradient color tag ");
        sb.append(name);
        throw new XmlPullParserException(sb.toString());
    }
}
