package o;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes-dex2jar.jar:o/getSystemWindowInsets.class */
public final class getSystemWindowInsets {
    private final Shader a;
    private final ColorStateList b;
    private int e;

    private getSystemWindowInsets(Shader shader, ColorStateList colorStateList, int i) {
        this.a = shader;
        this.b = colorStateList;
        this.e = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static getSystemWindowInsets b(int i) {
        return new getSystemWindowInsets(null, null, i);
    }

    static getSystemWindowInsets c(ColorStateList colorStateList) {
        return new getSystemWindowInsets(null, colorStateList, colorStateList.getDefaultColor());
    }

    private static getSystemWindowInsets c(Resources resources, int i, Resources.Theme theme) throws IOException, XmlPullParserException {
        int next;
        XmlResourceParser xml = resources.getXml(i);
        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            String name = xml.getName();
            name.hashCode();
            if (name.equals("gradient")) {
                return d(getStableInsets.e(resources, xml, asAttributeSet, theme));
            }
            if (name.equals("selector")) {
                return c(getTappableElementInsets.b(resources, xml, asAttributeSet, theme));
            }
            StringBuilder sb = new StringBuilder();
            sb.append(xml.getPositionDescription());
            sb.append(": unsupported complex color tag ");
            sb.append(name);
            throw new XmlPullParserException(sb.toString());
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static getSystemWindowInsets d(Resources resources, int i, Resources.Theme theme) {
        try {
            return c(resources, i, theme);
        } catch (Exception e) {
            Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e);
            return null;
        }
    }

    static getSystemWindowInsets d(Shader shader) {
        return new getSystemWindowInsets(shader, null, 0);
    }

    public final void a(int i) {
        this.e = i;
    }

    public final boolean a() {
        ColorStateList colorStateList;
        return this.a == null && (colorStateList = this.b) != null && colorStateList.isStateful();
    }

    public final boolean b() {
        return this.a != null;
    }

    public final boolean c() {
        return b() || this.e != 0;
    }

    public final boolean c(int[] iArr) {
        boolean z;
        ColorStateList colorStateList;
        int colorForState;
        if (!a() || (colorForState = (colorStateList = this.b).getColorForState(iArr, colorStateList.getDefaultColor())) == this.e) {
            z = false;
        } else {
            this.e = colorForState;
            z = true;
        }
        return z;
    }

    public final int d() {
        return this.e;
    }

    public final Shader e() {
        return this.a;
    }
}
