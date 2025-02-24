package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.util.Xml;
import java.io.IOException;
import java.util.HashMap;
import o.setDesignInformation;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes-dex2jar.jar:o/setConstraintSet.class */
public final class setConstraintSet {
    setDesignInformation a;
    final setMaxHeight b;
    int e = -1;
    int c = -1;
    SparseArray<setConstraintSet$MediaBrowserCompat$CustomActionResultReceiver> h = new SparseArray<>();
    private SparseArray<setDesignInformation> i = new SparseArray<>();
    setOnConstraintsChanged d = null;

    /* loaded from: classes-dex2jar.jar:o/setConstraintSet$RemoteActionCompatParcelizer.class */
    public static final class RemoteActionCompatParcelizer {
        float a;
        float b;
        float c;
        int d;
        setDesignInformation e;
        float h;

        public RemoteActionCompatParcelizer(Context context, XmlPullParser xmlPullParser) {
            this.h = Float.NaN;
            this.b = Float.NaN;
            this.a = Float.NaN;
            this.c = Float.NaN;
            this.d = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.fa);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.fb) {
                    this.d = obtainStyledAttributes.getResourceId(index, this.d);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.d);
                    context.getResources().getResourceName(this.d);
                    if ("layout".equals(resourceTypeName)) {
                        setDesignInformation setdesigninformation = new setDesignInformation();
                        this.e = setdesigninformation;
                        setdesigninformation.e(context, this.d);
                    }
                } else if (index == setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.fh) {
                    this.c = obtainStyledAttributes.getDimension(index, this.c);
                } else if (index == setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.fe) {
                    this.b = obtainStyledAttributes.getDimension(index, this.b);
                } else if (index == setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.ff) {
                    this.a = obtainStyledAttributes.getDimension(index, this.a);
                } else if (index == setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.fg) {
                    this.h = obtainStyledAttributes.getDimension(index, this.h);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            obtainStyledAttributes.recycle();
        }

        public final boolean b(float f, float f2) {
            if (!Float.isNaN(this.h) && f < this.h) {
                return false;
            }
            if (!Float.isNaN(this.b) && f2 < this.b) {
                return false;
            }
            if (Float.isNaN(this.a) || f <= this.a) {
                return Float.isNaN(this.c) || f2 <= this.c;
            }
            return false;
        }
    }

    public setConstraintSet(Context context, setMaxHeight setmaxheight, int i) {
        this.b = setmaxheight;
        b(context, i);
    }

    private void a(Context context, XmlPullParser xmlPullParser) {
        int eventType;
        setDesignInformation.IconCompatParcelizer iconCompatParcelizer;
        setDesignInformation setdesigninformation = new setDesignInformation();
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if ("id".equals(xmlPullParser.getAttributeName(i))) {
                String attributeValue = xmlPullParser.getAttributeValue(i);
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                int i2 = identifier;
                if (identifier == -1) {
                    if (attributeValue == null || attributeValue.length() <= 1) {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                        i2 = identifier;
                    } else {
                        i2 = Integer.parseInt(attributeValue.substring(1));
                    }
                }
                try {
                    eventType = xmlPullParser.getEventType();
                    iconCompatParcelizer = null;
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (XmlPullParserException e2) {
                    e2.printStackTrace();
                }
                while (eventType != 1) {
                    if (eventType != 0) {
                        char c = 3;
                        if (eventType == 2) {
                            String name = xmlPullParser.getName();
                            switch (name.hashCode()) {
                                case -2025855158:
                                    if (name.equals("Layout")) {
                                        c = 5;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1984451626:
                                    if (name.equals("Motion")) {
                                        c = 6;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1269513683:
                                    if (name.equals("PropertySet")) {
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -1238332596:
                                    if (name.equals("Transform")) {
                                        c = 4;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case -71750448:
                                    if (name.equals("Guideline")) {
                                        c = 1;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1331510167:
                                    if (name.equals("Barrier")) {
                                        c = 2;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1791837707:
                                    if (name.equals("CustomAttribute")) {
                                        c = 7;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                case 1803088381:
                                    if (name.equals("Constraint")) {
                                        c = 0;
                                        break;
                                    }
                                    c = 65535;
                                    break;
                                default:
                                    c = 65535;
                                    break;
                            }
                            switch (c) {
                                case 0:
                                    iconCompatParcelizer = setdesigninformation.c(context, Xml.asAttributeSet(xmlPullParser));
                                    break;
                                case 1:
                                    iconCompatParcelizer = setdesigninformation.c(context, Xml.asAttributeSet(xmlPullParser));
                                    iconCompatParcelizer.d.P = true;
                                    iconCompatParcelizer.d.I = true;
                                    break;
                                case 2:
                                    iconCompatParcelizer = setdesigninformation.c(context, Xml.asAttributeSet(xmlPullParser));
                                    iconCompatParcelizer.d.R = 1;
                                    break;
                                case 3:
                                    if (iconCompatParcelizer != null) {
                                        iconCompatParcelizer.c.e(context, Xml.asAttributeSet(xmlPullParser));
                                        iconCompatParcelizer = iconCompatParcelizer;
                                        break;
                                    } else {
                                        StringBuilder sb = new StringBuilder();
                                        sb.append("XML parser error must be within a Constraint ");
                                        sb.append(xmlPullParser.getLineNumber());
                                        throw new RuntimeException(sb.toString());
                                    }
                                case 4:
                                    if (iconCompatParcelizer != null) {
                                        iconCompatParcelizer.f.e(context, Xml.asAttributeSet(xmlPullParser));
                                        iconCompatParcelizer = iconCompatParcelizer;
                                        break;
                                    } else {
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append("XML parser error must be within a Constraint ");
                                        sb2.append(xmlPullParser.getLineNumber());
                                        throw new RuntimeException(sb2.toString());
                                    }
                                case 5:
                                    if (iconCompatParcelizer != null) {
                                        iconCompatParcelizer.d.c(context, Xml.asAttributeSet(xmlPullParser));
                                        iconCompatParcelizer = iconCompatParcelizer;
                                        break;
                                    } else {
                                        StringBuilder sb3 = new StringBuilder();
                                        sb3.append("XML parser error must be within a Constraint ");
                                        sb3.append(xmlPullParser.getLineNumber());
                                        throw new RuntimeException(sb3.toString());
                                    }
                                case 6:
                                    if (iconCompatParcelizer != null) {
                                        iconCompatParcelizer.e.c(context, Xml.asAttributeSet(xmlPullParser));
                                        iconCompatParcelizer = iconCompatParcelizer;
                                        break;
                                    } else {
                                        StringBuilder sb4 = new StringBuilder();
                                        sb4.append("XML parser error must be within a Constraint ");
                                        sb4.append(xmlPullParser.getLineNumber());
                                        throw new RuntimeException(sb4.toString());
                                    }
                                case 7:
                                    if (iconCompatParcelizer != null) {
                                        HashMap<String, setType> hashMap = iconCompatParcelizer.a;
                                        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cA);
                                        int indexCount = obtainStyledAttributes.getIndexCount();
                                        String str = null;
                                        Object obj = null;
                                        setType$MediaBrowserCompat$CustomActionResultReceiver settype_mediabrowsercompat_customactionresultreceiver = null;
                                        for (int i3 = 0; i3 < indexCount; i3++) {
                                            int index = obtainStyledAttributes.getIndex(i3);
                                            if (index == setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cH) {
                                                String string = obtainStyledAttributes.getString(index);
                                                str = string;
                                                obj = obj;
                                                settype_mediabrowsercompat_customactionresultreceiver = settype_mediabrowsercompat_customactionresultreceiver;
                                                if (string != null) {
                                                    str = string;
                                                    obj = obj;
                                                    settype_mediabrowsercompat_customactionresultreceiver = settype_mediabrowsercompat_customactionresultreceiver;
                                                    if (string.length() > 0) {
                                                        StringBuilder sb5 = new StringBuilder();
                                                        sb5.append(Character.toUpperCase(string.charAt(0)));
                                                        sb5.append(string.substring(1));
                                                        str = sb5.toString();
                                                        settype_mediabrowsercompat_customactionresultreceiver = settype_mediabrowsercompat_customactionresultreceiver;
                                                        obj = obj;
                                                    }
                                                }
                                            } else if (index == setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cE) {
                                                obj = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                                                settype_mediabrowsercompat_customactionresultreceiver = setType$MediaBrowserCompat$CustomActionResultReceiver.BOOLEAN_TYPE;
                                            } else if (index == setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cD) {
                                                settype_mediabrowsercompat_customactionresultreceiver = setType$MediaBrowserCompat$CustomActionResultReceiver.COLOR_TYPE;
                                                obj = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                                            } else if (index == setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cF) {
                                                settype_mediabrowsercompat_customactionresultreceiver = setType$MediaBrowserCompat$CustomActionResultReceiver.COLOR_DRAWABLE_TYPE;
                                                obj = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                                            } else if (index == setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cK) {
                                                settype_mediabrowsercompat_customactionresultreceiver = setType$MediaBrowserCompat$CustomActionResultReceiver.DIMENSION_TYPE;
                                                obj = Float.valueOf(TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                                            } else if (index == setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cG) {
                                                settype_mediabrowsercompat_customactionresultreceiver = setType$MediaBrowserCompat$CustomActionResultReceiver.DIMENSION_TYPE;
                                                obj = Float.valueOf(obtainStyledAttributes.getDimension(index, 0.0f));
                                            } else if (index == setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cJ) {
                                                settype_mediabrowsercompat_customactionresultreceiver = setType$MediaBrowserCompat$CustomActionResultReceiver.FLOAT_TYPE;
                                                obj = Float.valueOf(obtainStyledAttributes.getFloat(index, Float.NaN));
                                            } else {
                                                if (index == setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cL) {
                                                    settype_mediabrowsercompat_customactionresultreceiver = setType$MediaBrowserCompat$CustomActionResultReceiver.INT_TYPE;
                                                    obj = Integer.valueOf(obtainStyledAttributes.getInteger(index, -1));
                                                } else {
                                                    str = str;
                                                    obj = obj;
                                                    settype_mediabrowsercompat_customactionresultreceiver = settype_mediabrowsercompat_customactionresultreceiver;
                                                    if (index == setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cI) {
                                                        settype_mediabrowsercompat_customactionresultreceiver = setType$MediaBrowserCompat$CustomActionResultReceiver.STRING_TYPE;
                                                        obj = obtainStyledAttributes.getString(index);
                                                    }
                                                }
                                                str = str;
                                            }
                                        }
                                        if (!(str == null || obj == null)) {
                                            hashMap.put(str, new setType(str, settype_mediabrowsercompat_customactionresultreceiver, obj));
                                        }
                                        obtainStyledAttributes.recycle();
                                        iconCompatParcelizer = iconCompatParcelizer;
                                        break;
                                    } else {
                                        StringBuilder sb6 = new StringBuilder();
                                        sb6.append("XML parser error must be within a Constraint ");
                                        sb6.append(xmlPullParser.getLineNumber());
                                        throw new RuntimeException(sb6.toString());
                                    }
                                default:
                                    iconCompatParcelizer = iconCompatParcelizer;
                                    break;
                            }
                        } else if (eventType != 3) {
                            iconCompatParcelizer = iconCompatParcelizer;
                        } else {
                            String name2 = xmlPullParser.getName();
                            if ("ConstraintSet".equals(name2)) {
                                this.i.put(i2, setdesigninformation);
                                return;
                            }
                            iconCompatParcelizer = iconCompatParcelizer;
                            if (name2.equalsIgnoreCase("Constraint")) {
                                setdesigninformation.a.put(Integer.valueOf(iconCompatParcelizer.b), iconCompatParcelizer);
                                iconCompatParcelizer = null;
                            }
                        }
                    } else {
                        xmlPullParser.getName();
                        iconCompatParcelizer = iconCompatParcelizer;
                    }
                    eventType = xmlPullParser.next();
                }
                this.i.put(i2, setdesigninformation);
                return;
            }
        }
    }

    private void b(Context context, int i) {
        char c;
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            int eventType = xml.getEventType();
            setConstraintSet$MediaBrowserCompat$CustomActionResultReceiver setconstraintset_mediabrowsercompat_customactionresultreceiver = null;
            while (eventType != 1) {
                if (eventType == 0) {
                    xml.getName();
                    setconstraintset_mediabrowsercompat_customactionresultreceiver = setconstraintset_mediabrowsercompat_customactionresultreceiver;
                } else if (eventType != 2) {
                    setconstraintset_mediabrowsercompat_customactionresultreceiver = setconstraintset_mediabrowsercompat_customactionresultreceiver;
                } else {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                c = 4;
                                break;
                            }
                            c = 65535;
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1382829617:
                            if (name.equals("StateSet")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1657696882:
                            if (name.equals("layoutDescription")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    setconstraintset_mediabrowsercompat_customactionresultreceiver = setconstraintset_mediabrowsercompat_customactionresultreceiver;
                    if (c != 0) {
                        setconstraintset_mediabrowsercompat_customactionresultreceiver = setconstraintset_mediabrowsercompat_customactionresultreceiver;
                        if (c != 1) {
                            if (c == 2) {
                                setconstraintset_mediabrowsercompat_customactionresultreceiver = new setConstraintSet$MediaBrowserCompat$CustomActionResultReceiver(context, xml);
                                this.h.put(setconstraintset_mediabrowsercompat_customactionresultreceiver.d, setconstraintset_mediabrowsercompat_customactionresultreceiver);
                            } else if (c == 3) {
                                RemoteActionCompatParcelizer remoteActionCompatParcelizer = new RemoteActionCompatParcelizer(context, xml);
                                setconstraintset_mediabrowsercompat_customactionresultreceiver = setconstraintset_mediabrowsercompat_customactionresultreceiver;
                                if (setconstraintset_mediabrowsercompat_customactionresultreceiver != null) {
                                    setconstraintset_mediabrowsercompat_customactionresultreceiver.e.add(remoteActionCompatParcelizer);
                                    setconstraintset_mediabrowsercompat_customactionresultreceiver = setconstraintset_mediabrowsercompat_customactionresultreceiver;
                                }
                            } else if (c != 4) {
                                StringBuilder sb = new StringBuilder();
                                sb.append("unknown tag ");
                                sb.append(name);
                                Log.v("ConstraintLayoutStates", sb.toString());
                                setconstraintset_mediabrowsercompat_customactionresultreceiver = setconstraintset_mediabrowsercompat_customactionresultreceiver;
                            } else {
                                a(context, xml);
                                setconstraintset_mediabrowsercompat_customactionresultreceiver = setconstraintset_mediabrowsercompat_customactionresultreceiver;
                            }
                        }
                    }
                }
                eventType = xml.next();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        }
    }
}
