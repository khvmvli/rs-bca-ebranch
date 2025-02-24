package o;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes-dex2jar.jar:o/setUiOptions.class */
public final class setUiOptions extends MenuInflater {
    static final Class<?>[] d;
    static final Class<?>[] e;
    final Object[] a;
    final Object[] b;
    Context c;
    private Object f;

    /* loaded from: classes-dex2jar.jar:o/setUiOptions$IconCompatParcelizer.class */
    public static final class IconCompatParcelizer implements MenuItem.OnMenuItemClickListener {
        private static final Class<?>[] b = {MenuItem.class};
        private Object a;
        private Method c;

        public IconCompatParcelizer(Object obj, String str) {
            this.a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.c = cls.getMethod(str, b);
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder("Couldn't resolve menu item onClick handler ");
                sb.append(str);
                sb.append(" in class ");
                sb.append(cls.getName());
                InflateException inflateException = new InflateException(sb.toString());
                inflateException.initCause(e);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public final boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.c.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.c.invoke(this.a, menuItem)).booleanValue();
                }
                this.c.invoke(this.a, menuItem);
                return true;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* loaded from: classes-dex2jar.jar:o/setUiOptions$read.class */
    public final class read {
        CharSequence A;
        CharSequence B;
        int C;
        CharSequence D;
        Menu F;
        int f;
        onCreateDialog g;
        String h;
        String j;
        int k;
        char l;
        boolean m;
        int n;

        /* renamed from: o */
        int f291o;
        boolean p;
        boolean r;
        CharSequence s;
        int t;
        char u;
        String v;
        int w;
        int y;
        boolean z;
        ColorStateList q = null;
        PorterDuff.Mode x = null;
        int b = 0;
        int a = 0;
        int e = 0;
        int c = 0;
        boolean i = true;
        boolean d = true;

        public read(Menu menu) {
            setUiOptions.this = r4;
            this.F = menu;
        }

        void a(MenuItem menuItem) {
            boolean z = false;
            menuItem.setChecked(this.r).setVisible(this.z).setEnabled(this.p).setCheckable(this.n > 0).setTitleCondensed(this.D).setIcon(this.t);
            int i = this.C;
            if (i >= 0) {
                menuItem.setShowAsAction(i);
            }
            if (this.v != null) {
                if (!setUiOptions.this.c.isRestricted()) {
                    menuItem.setOnMenuItemClickListener(new IconCompatParcelizer(setUiOptions.this.d(), this.v));
                } else {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
            }
            if (this.n >= 2) {
                if (menuItem instanceof setExpandActivityOverflowButtonDrawable) {
                    setExpandActivityOverflowButtonDrawable setexpandactivityoverflowbuttondrawable = (setExpandActivityOverflowButtonDrawable) menuItem;
                    setexpandactivityoverflowbuttondrawable.b = (setexpandactivityoverflowbuttondrawable.b & -5) | 4;
                } else if (menuItem instanceof setProvider) {
                    ((setProvider) menuItem).b(true);
                }
            }
            String str = this.h;
            if (str != null) {
                menuItem.setActionView((View) c(str, setUiOptions.d, setUiOptions.this.b));
                z = true;
            }
            int i2 = this.f;
            if (i2 > 0) {
                if (!z) {
                    menuItem.setActionView(i2);
                } else {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                }
            }
            onCreateDialog oncreatedialog = this.g;
            if (oncreatedialog != null) {
                setShowsDialog.e(menuItem, oncreatedialog);
            }
            setShowsDialog.a(menuItem, this.s);
            setShowsDialog.d(menuItem, this.B);
            setShowsDialog.d(menuItem, this.l, this.k);
            setShowsDialog.e(menuItem, this.u, this.y);
            PorterDuff.Mode mode = this.x;
            if (mode != null) {
                setShowsDialog.a(menuItem, mode);
            }
            ColorStateList colorStateList = this.q;
            if (colorStateList != null) {
                setShowsDialog.b(menuItem, colorStateList);
            }
        }

        <T> T c(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, setUiOptions.this.c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder("Cannot instantiate class: ");
                sb.append(str);
                Log.w("SupportMenuInflater", sb.toString(), e);
                return null;
            }
        }

        public final SubMenu d() {
            this.m = true;
            SubMenu addSubMenu = this.F.addSubMenu(this.b, this.w, this.f291o, this.A);
            a(addSubMenu.getItem());
            return addSubMenu;
        }
    }

    static {
        Class<?>[] clsArr = {Context.class};
        d = clsArr;
        e = clsArr;
    }

    public setUiOptions(Context context) {
        super(context);
        this.c = context;
        Object[] objArr = {context};
        this.b = objArr;
        this.a = objArr;
    }

    private Object a(Object obj) {
        if (obj instanceof Activity) {
            return obj;
        }
        Object obj2 = obj;
        if (obj instanceof ContextWrapper) {
            obj2 = a(((ContextWrapper) obj).getBaseContext());
        }
        return obj2;
    }

    private void b(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        read read2 = new read(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType != 2) {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            } else {
                String name = xmlPullParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlPullParser.next();
                } else {
                    StringBuilder sb = new StringBuilder("Expecting menu, got ");
                    sb.append(name);
                    throw new RuntimeException(sb.toString());
                }
            }
        }
        String str = null;
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            } else if (eventType != 2) {
                if (eventType == 3) {
                    String name2 = xmlPullParser.getName();
                    if (z2 && name2.equals(str)) {
                        str = null;
                        z2 = false;
                    } else if (name2.equals("group")) {
                        read2.b = 0;
                        read2.a = 0;
                        read2.e = 0;
                        read2.c = 0;
                        read2.i = true;
                        read2.d = true;
                    } else if (name2.equals("item")) {
                        if (!read2.m) {
                            if (read2.g == null || !read2.g.d()) {
                                read2.m = true;
                                read2.a(read2.F.add(read2.b, read2.w, read2.f291o, read2.A));
                            } else {
                                read2.d();
                            }
                        }
                    } else if (name2.equals("menu")) {
                        z = true;
                        z2 = z2;
                    }
                    eventType = xmlPullParser.next();
                }
                z2 = z2;
                eventType = xmlPullParser.next();
            } else {
                if (!z2) {
                    String name3 = xmlPullParser.getName();
                    if (name3.equals("group")) {
                        TypedArray obtainStyledAttributes = setUiOptions.this.c.obtainStyledAttributes(attributeSet, setHasDecor$MediaBrowserCompat$MediaItem.bB);
                        read2.b = obtainStyledAttributes.getResourceId(setHasDecor$MediaBrowserCompat$MediaItem.bD, 0);
                        read2.a = obtainStyledAttributes.getInt(setHasDecor$MediaBrowserCompat$MediaItem.bH, 0);
                        read2.e = obtainStyledAttributes.getInt(setHasDecor$MediaBrowserCompat$MediaItem.bJ, 0);
                        read2.c = obtainStyledAttributes.getInt(setHasDecor$MediaBrowserCompat$MediaItem.bA, 0);
                        read2.i = obtainStyledAttributes.getBoolean(setHasDecor$MediaBrowserCompat$MediaItem.bI, true);
                        read2.d = obtainStyledAttributes.getBoolean(setHasDecor$MediaBrowserCompat$MediaItem.bC, true);
                        obtainStyledAttributes.recycle();
                    } else if (name3.equals("item")) {
                        Context context = setUiOptions.this.c;
                        setIconifiedByDefault seticonifiedbydefault = new setIconifiedByDefault(context, context.obtainStyledAttributes(attributeSet, setHasDecor$MediaBrowserCompat$MediaItem.bG));
                        read2.w = seticonifiedbydefault.d.getResourceId(setHasDecor$MediaBrowserCompat$MediaItem.bQ, 0);
                        read2.f291o = (seticonifiedbydefault.d.getInt(setHasDecor$MediaBrowserCompat$MediaItem.bT, read2.a) & -65536) | (seticonifiedbydefault.d.getInt(setHasDecor$MediaBrowserCompat$MediaItem.bU, read2.e) & 65535);
                        read2.A = seticonifiedbydefault.d.getText(setHasDecor$MediaBrowserCompat$MediaItem.bX);
                        read2.D = seticonifiedbydefault.d.getText(setHasDecor$MediaBrowserCompat$MediaItem.bW);
                        read2.t = seticonifiedbydefault.d.getResourceId(setHasDecor$MediaBrowserCompat$MediaItem.bP, 0);
                        String string = seticonifiedbydefault.d.getString(setHasDecor$MediaBrowserCompat$MediaItem.bN);
                        read2.l = (char) (string == null ? 0 : string.charAt(0));
                        read2.k = seticonifiedbydefault.d.getInt(setHasDecor$MediaBrowserCompat$MediaItem.bO, 4096);
                        String string2 = seticonifiedbydefault.d.getString(setHasDecor$MediaBrowserCompat$MediaItem.bY);
                        read2.u = (char) (string2 == null ? 0 : string2.charAt(0));
                        read2.y = seticonifiedbydefault.d.getInt(setHasDecor$MediaBrowserCompat$MediaItem.cc, 4096);
                        if (seticonifiedbydefault.d.hasValue(setHasDecor$MediaBrowserCompat$MediaItem.bK)) {
                            read2.n = seticonifiedbydefault.d.getBoolean(setHasDecor$MediaBrowserCompat$MediaItem.bK, false) ? 1 : 0;
                        } else {
                            read2.n = read2.c;
                        }
                        read2.r = seticonifiedbydefault.d.getBoolean(setHasDecor$MediaBrowserCompat$MediaItem.bS, false);
                        read2.z = seticonifiedbydefault.d.getBoolean(setHasDecor$MediaBrowserCompat$MediaItem.bZ, read2.i);
                        read2.p = seticonifiedbydefault.d.getBoolean(setHasDecor$MediaBrowserCompat$MediaItem.bR, read2.d);
                        read2.C = seticonifiedbydefault.d.getInt(setHasDecor$MediaBrowserCompat$MediaItem.ch, -1);
                        read2.v = seticonifiedbydefault.d.getString(setHasDecor$MediaBrowserCompat$MediaItem.bV);
                        read2.f = seticonifiedbydefault.d.getResourceId(setHasDecor$MediaBrowserCompat$MediaItem.bF, 0);
                        read2.h = seticonifiedbydefault.d.getString(setHasDecor$MediaBrowserCompat$MediaItem.bL);
                        String string3 = seticonifiedbydefault.d.getString(setHasDecor$MediaBrowserCompat$MediaItem.bM);
                        read2.j = string3;
                        boolean z3 = string3 != null;
                        if (z3 && read2.f == 0 && read2.h == null) {
                            read2.g = (onCreateDialog) read2.c(string3, e, setUiOptions.this.a);
                        } else {
                            if (z3) {
                                Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                            }
                            read2.g = null;
                        }
                        read2.s = seticonifiedbydefault.d.getText(setHasDecor$MediaBrowserCompat$MediaItem.ca);
                        read2.B = seticonifiedbydefault.d.getText(setHasDecor$MediaBrowserCompat$MediaItem.cg);
                        if (seticonifiedbydefault.d.hasValue(setHasDecor$MediaBrowserCompat$MediaItem.cb)) {
                            read2.x = setOnFitSystemWindowsListener.e(seticonifiedbydefault.d.getInt(setHasDecor$MediaBrowserCompat$MediaItem.cb, -1), read2.x);
                        } else {
                            read2.x = null;
                        }
                        if (seticonifiedbydefault.d.hasValue(setHasDecor$MediaBrowserCompat$MediaItem.cd)) {
                            read2.q = seticonifiedbydefault.e(setHasDecor$MediaBrowserCompat$MediaItem.cd);
                        } else {
                            read2.q = null;
                        }
                        seticonifiedbydefault.d.recycle();
                        read2.m = false;
                    } else {
                        if (name3.equals("menu")) {
                            b(xmlPullParser, attributeSet, read2.d());
                            z2 = z2;
                        } else {
                            str = name3;
                            z2 = true;
                        }
                        eventType = xmlPullParser.next();
                    }
                }
                z2 = z2;
                eventType = xmlPullParser.next();
            }
        }
    }

    final Object d() {
        Object obj;
        if (this.f == null) {
            Context context = this.c;
            if (context instanceof Activity) {
                obj = context;
            } else {
                obj = context;
                if (context instanceof ContextWrapper) {
                    obj = a(((ContextWrapper) context).getBaseContext());
                }
            }
            this.f = obj;
        }
        return this.f;
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i, Menu menu) {
        XmlResourceParser xmlResourceParser;
        if (!(menu instanceof WindowInsetsCompat$Impl29)) {
            inflate(i, menu);
            return;
        }
        try {
            XmlResourceParser xmlResourceParser2 = null;
            XmlResourceParser xmlResourceParser3 = null;
            xmlResourceParser = null;
            try {
                try {
                    XmlResourceParser layout = this.c.getResources().getLayout(i);
                    xmlResourceParser = layout;
                    xmlResourceParser2 = layout;
                    xmlResourceParser3 = layout;
                    b(layout, Xml.asAttributeSet(layout), menu);
                    if (layout != null) {
                        layout.close();
                    }
                } catch (XmlPullParserException e2) {
                    throw new InflateException("Error inflating menu XML", e2);
                }
            } catch (IOException e3) {
                throw new InflateException("Error inflating menu XML", e3);
            }
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
