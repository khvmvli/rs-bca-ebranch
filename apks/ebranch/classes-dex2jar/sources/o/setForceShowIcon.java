package o;

import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.Deque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes-dex2jar.jar:o/setForceShowIcon.class */
final class setForceShowIcon {
    final Deque<WeakReference<XmlPullParser>> e = new ArrayDeque();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static XmlPullParser a(Deque<WeakReference<XmlPullParser>> deque) {
        while (!deque.isEmpty()) {
            XmlPullParser xmlPullParser = deque.peek().get();
            if (!e(xmlPullParser)) {
                return xmlPullParser;
            }
            deque.pop();
        }
        return null;
    }

    private static boolean e(XmlPullParser xmlPullParser) {
        boolean z = true;
        if (xmlPullParser != null) {
            z = true;
            try {
                if (xmlPullParser.getEventType() != 3) {
                    z = xmlPullParser.getEventType() == 1;
                }
            } catch (XmlPullParserException e) {
                z = true;
            }
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean e(XmlPullParser xmlPullParser, XmlPullParser xmlPullParser2) {
        if (xmlPullParser2 == null || xmlPullParser == xmlPullParser2) {
            return false;
        }
        try {
            if (xmlPullParser2.getEventType() == 2) {
                return "include".equals(xmlPullParser2.getName());
            }
            return false;
        } catch (XmlPullParserException e) {
            return false;
        }
    }
}
