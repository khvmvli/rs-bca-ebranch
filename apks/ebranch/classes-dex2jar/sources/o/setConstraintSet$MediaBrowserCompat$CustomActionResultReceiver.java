package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.Xml;
import java.util.ArrayList;
import o.setConstraintSet;
import org.xmlpull.v1.XmlPullParser;
/* loaded from: classes-dex2jar.jar:o/setConstraintSet$MediaBrowserCompat$CustomActionResultReceiver.class */
final class setConstraintSet$MediaBrowserCompat$CustomActionResultReceiver {
    setDesignInformation a;
    int c;
    int d;
    ArrayList<setConstraintSet.RemoteActionCompatParcelizer> e = new ArrayList<>();

    public setConstraintSet$MediaBrowserCompat$CustomActionResultReceiver(Context context, XmlPullParser xmlPullParser) {
        this.c = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.eG);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.eJ) {
                this.d = obtainStyledAttributes.getResourceId(index, this.d);
            } else if (index == setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.eK) {
                this.c = obtainStyledAttributes.getResourceId(index, this.c);
                String resourceTypeName = context.getResources().getResourceTypeName(this.c);
                context.getResources().getResourceName(this.c);
                if ("layout".equals(resourceTypeName)) {
                    setDesignInformation setdesigninformation = new setDesignInformation();
                    this.a = setdesigninformation;
                    setdesigninformation.e(context, this.c);
                }
            }
        }
        obtainStyledAttributes.recycle();
    }

    public final int b(float f, float f2) {
        for (int i = 0; i < this.e.size(); i++) {
            if (this.e.get(i).b(f, f2)) {
                return i;
            }
        }
        return -1;
    }
}
