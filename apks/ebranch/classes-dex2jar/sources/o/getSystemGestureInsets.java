package o;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Base64;
import android.util.Xml;
import com.facebook.stetho.server.http.HttpStatus;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o.setGuidelineBegin;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes-dex2jar.jar:o/getSystemGestureInsets.class */
public class getSystemGestureInsets {

    /* loaded from: classes-dex2jar.jar:o/getSystemGestureInsets$IconCompatParcelizer.class */
    public static final class IconCompatParcelizer {
        private String a;
        private int b;
        private final String c;
        private boolean d;
        private int e;
        private int i;

        public IconCompatParcelizer(String str, int i, boolean z, String str2, int i2, int i3) {
            this.c = str;
            this.i = i;
            this.d = z;
            this.a = str2;
            this.b = i2;
            this.e = i3;
        }

        public final int a() {
            return this.b;
        }

        public final String b() {
            return this.c;
        }

        public final int c() {
            return this.i;
        }

        public final String d() {
            return this.a;
        }

        public final int e() {
            return this.e;
        }

        public final boolean i() {
            return this.d;
        }
    }

    /* loaded from: classes-dex2jar.jar:o/getSystemGestureInsets$read.class */
    public static final class read implements write {
        private final IconCompatParcelizer[] e;

        public read(IconCompatParcelizer[] iconCompatParcelizerArr) {
            this.e = iconCompatParcelizerArr;
        }

        public final IconCompatParcelizer[] c() {
            return this.e;
        }
    }

    /* loaded from: classes-dex2jar.jar:o/getSystemGestureInsets$write.class */
    public interface write {
    }

    public static List<List<byte[]>> a(Resources resources, int i) {
        if (i == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (c(obtainTypedArray, 0) == 1) {
                for (int i2 = 0; i2 < obtainTypedArray.length(); i2++) {
                    int resourceId = obtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        arrayList.add(e(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(e(resources.getStringArray(i)));
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    private static write b(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return c(xmlPullParser, resources);
        }
        d(xmlPullParser);
        return null;
    }

    private static int c(TypedArray typedArray, int i) {
        return typedArray.getType(i);
    }

    private static write c(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), setGuidelineBegin.write.b);
        String string = obtainAttributes.getString(setGuidelineBegin.write.p);
        String string2 = obtainAttributes.getString(setGuidelineBegin.write.u);
        String string3 = obtainAttributes.getString(setGuidelineBegin.write.y);
        int resourceId = obtainAttributes.getResourceId(setGuidelineBegin.write.s, 0);
        int integer = obtainAttributes.getInteger(setGuidelineBegin.write.r, 1);
        int integer2 = obtainAttributes.getInteger(setGuidelineBegin.write.q, HttpStatus.HTTP_INTERNAL_SERVER_ERROR);
        String string4 = obtainAttributes.getString(setGuidelineBegin.write.v);
        obtainAttributes.recycle();
        if (string == null || string2 == null || string3 == null) {
            ArrayList arrayList = new ArrayList();
            while (xmlPullParser.next() != 3) {
                if (xmlPullParser.getEventType() == 2) {
                    if (xmlPullParser.getName().equals("font")) {
                        arrayList.add(d(xmlPullParser, resources));
                    } else {
                        d(xmlPullParser);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new read((IconCompatParcelizer[]) arrayList.toArray(new IconCompatParcelizer[arrayList.size()]));
        }
        while (xmlPullParser.next() != 3) {
            d(xmlPullParser);
        }
        return new getSystemGestureInsets$MediaBrowserCompat$CustomActionResultReceiver(new access$100(string, string2, string3, a(resources, resourceId)), integer, integer2, string4);
    }

    private static IconCompatParcelizer d(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), setGuidelineBegin.write.g);
        int i = obtainAttributes.getInt(obtainAttributes.hasValue(setGuidelineBegin.write.f228o) ? setGuidelineBegin.write.f228o : setGuidelineBegin.write.h, 400);
        boolean z = 1 == obtainAttributes.getInt(obtainAttributes.hasValue(setGuidelineBegin.write.n) ? setGuidelineBegin.write.n : setGuidelineBegin.write.j, 0);
        int i2 = obtainAttributes.hasValue(setGuidelineBegin.write.t) ? setGuidelineBegin.write.t : setGuidelineBegin.write.m;
        String string = obtainAttributes.getString(obtainAttributes.hasValue(setGuidelineBegin.write.l) ? setGuidelineBegin.write.l : setGuidelineBegin.write.i);
        int i3 = obtainAttributes.getInt(i2, 0);
        int i4 = obtainAttributes.hasValue(setGuidelineBegin.write.k) ? setGuidelineBegin.write.k : setGuidelineBegin.write.f;
        int resourceId = obtainAttributes.getResourceId(i4, 0);
        String string2 = obtainAttributes.getString(i4);
        obtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            d(xmlPullParser);
        }
        return new IconCompatParcelizer(string2, i, z, string, i3, resourceId);
    }

    private static void d(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    private static List<byte[]> e(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }

    public static write e(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return b(xmlPullParser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }
}
