package o;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import io.realm.CollectionUtils;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
/* loaded from: classes-dex2jar.jar:o/setType.class */
public final class setType {
    private int a;
    private float b;
    private int c;
    boolean d;
    String e;
    private String f;
    private setType$MediaBrowserCompat$CustomActionResultReceiver i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.setType$1  reason: invalid class name */
    /* loaded from: classes-dex2jar.jar:o/setType$1.class */
    public static final /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[setType$MediaBrowserCompat$CustomActionResultReceiver.values().length];
            d = iArr;
            try {
                iArr[setType$MediaBrowserCompat$CustomActionResultReceiver.COLOR_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                d[setType$MediaBrowserCompat$CustomActionResultReceiver.COLOR_DRAWABLE_TYPE.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                d[setType$MediaBrowserCompat$CustomActionResultReceiver.INT_TYPE.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                d[setType$MediaBrowserCompat$CustomActionResultReceiver.FLOAT_TYPE.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                d[setType$MediaBrowserCompat$CustomActionResultReceiver.STRING_TYPE.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
            try {
                d[setType$MediaBrowserCompat$CustomActionResultReceiver.BOOLEAN_TYPE.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
            }
            try {
                d[setType$MediaBrowserCompat$CustomActionResultReceiver.DIMENSION_TYPE.ordinal()] = 7;
            } catch (NoSuchFieldError e7) {
            }
        }
    }

    public setType(String str, setType$MediaBrowserCompat$CustomActionResultReceiver settype_mediabrowsercompat_customactionresultreceiver, Object obj) {
        this.e = str;
        this.i = settype_mediabrowsercompat_customactionresultreceiver;
        d(obj);
    }

    private setType(setType settype, Object obj) {
        this.e = settype.e;
        this.i = settype.i;
        d(obj);
    }

    public static void b(View view, HashMap<String, setType> hashMap) {
        Class<?> cls = view.getClass();
        for (String str : hashMap.keySet()) {
            setType settype = hashMap.get(str);
            StringBuilder sb = new StringBuilder(CollectionUtils.SET_TYPE);
            sb.append(str);
            String obj = sb.toString();
            try {
                switch (AnonymousClass1.d[settype.i.ordinal()]) {
                    case 1:
                        cls.getMethod(obj, Integer.TYPE).invoke(view, Integer.valueOf(settype.c));
                        break;
                    case 2:
                        Method method = cls.getMethod(obj, Drawable.class);
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(settype.c);
                        method.invoke(view, colorDrawable);
                        break;
                    case 3:
                        cls.getMethod(obj, Integer.TYPE).invoke(view, Integer.valueOf(settype.a));
                        break;
                    case 4:
                        cls.getMethod(obj, Float.TYPE).invoke(view, Float.valueOf(settype.b));
                        break;
                    case 5:
                        cls.getMethod(obj, CharSequence.class).invoke(view, settype.f);
                        break;
                    case 6:
                        cls.getMethod(obj, Boolean.TYPE).invoke(view, Boolean.valueOf(settype.d));
                        break;
                    case 7:
                        cls.getMethod(obj, Float.TYPE).invoke(view, Float.valueOf(settype.b));
                        break;
                }
            } catch (IllegalAccessException e) {
                StringBuilder sb2 = new StringBuilder(" Custom Attribute \"");
                sb2.append(str);
                sb2.append("\" not found on ");
                sb2.append(cls.getName());
                Log.e("TransitionLayout", sb2.toString());
                e.printStackTrace();
            } catch (NoSuchMethodException e2) {
                Log.e("TransitionLayout", e2.getMessage());
                StringBuilder sb3 = new StringBuilder(" Custom Attribute \"");
                sb3.append(str);
                sb3.append("\" not found on ");
                sb3.append(cls.getName());
                Log.e("TransitionLayout", sb3.toString());
                StringBuilder sb4 = new StringBuilder();
                sb4.append(cls.getName());
                sb4.append(" must have a method ");
                sb4.append(obj);
                Log.e("TransitionLayout", sb4.toString());
            } catch (InvocationTargetException e3) {
                StringBuilder sb5 = new StringBuilder(" Custom Attribute \"");
                sb5.append(str);
                sb5.append("\" not found on ");
                sb5.append(cls.getName());
                Log.e("TransitionLayout", sb5.toString());
                e3.printStackTrace();
            }
        }
    }

    private void d(Object obj) {
        switch (AnonymousClass1.d[this.i.ordinal()]) {
            case 1:
            case 2:
                this.c = ((Integer) obj).intValue();
                return;
            case 3:
                this.a = ((Integer) obj).intValue();
                return;
            case 4:
                this.b = ((Float) obj).floatValue();
                return;
            case 5:
                this.f = (String) obj;
                return;
            case 6:
                this.d = ((Boolean) obj).booleanValue();
                return;
            case 7:
                this.b = ((Float) obj).floatValue();
                return;
            default:
                return;
        }
    }

    public static HashMap<String, setType> e(HashMap<String, setType> hashMap, View view) {
        HashMap<String, setType> hashMap2 = new HashMap<>();
        Class<?> cls = view.getClass();
        for (String str : hashMap.keySet()) {
            setType settype = hashMap.get(str);
            try {
                if (str.equals("BackgroundColor")) {
                    hashMap2.put(str, new setType(settype, Integer.valueOf(((ColorDrawable) view.getBackground()).getColor())));
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("getMap");
                    sb.append(str);
                    hashMap2.put(str, new setType(settype, cls.getMethod(sb.toString(), new Class[0]).invoke(view, new Object[0])));
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (NoSuchMethodException e2) {
                e2.printStackTrace();
            } catch (InvocationTargetException e3) {
                e3.printStackTrace();
            }
        }
        return hashMap2;
    }
}
