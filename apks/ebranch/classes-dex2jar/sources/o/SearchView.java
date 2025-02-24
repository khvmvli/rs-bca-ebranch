package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes-dex2jar.jar:o/SearchView.class */
public final class SearchView {
    private static SearchView b;
    final WeakHashMap<Context, setTrackDrawable<WeakReference<Drawable.ConstantState>>> d = new WeakHashMap<>(0);
    MediaDescriptionCompat e;
    private setCollapseIcon<String, write> f;
    private TypedValue g;
    private WeakHashMap<Context, setTrackTintList<ColorStateList>> h;
    private setTrackTintList<String> i;
    private boolean j;
    private static final PorterDuff.Mode a = PorterDuff.Mode.SRC_IN;
    private static final IconCompatParcelizer c = new IconCompatParcelizer(6);

    /* loaded from: classes-dex2jar.jar:o/SearchView$IconCompatParcelizer.class */
    public static final class IconCompatParcelizer extends setThumbResource<Integer, PorterDuffColorFilter> {
        public IconCompatParcelizer(int i) {
            super(6);
        }
    }

    /* loaded from: classes-dex2jar.jar:o/SearchView$MediaDescriptionCompat.class */
    public interface MediaDescriptionCompat {
        ColorStateList a(Context context, int i);

        boolean a(Context context, int i, Drawable drawable);

        Drawable c(SearchView searchView, Context context, int i);

        PorterDuff.Mode d(int i);

        boolean d(Context context, int i, Drawable drawable);
    }

    /* loaded from: classes-dex2jar.jar:o/SearchView$MediaMetadataCompat.class */
    public static final class MediaMetadataCompat implements write {
        MediaMetadataCompat() {
        }

        @Override // o.SearchView.write
        public final Drawable b(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return setTranslateX.a(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e);
                return null;
            }
        }
    }

    /* loaded from: classes-dex2jar.jar:o/SearchView$RemoteActionCompatParcelizer.class */
    public static class RemoteActionCompatParcelizer implements write {
        RemoteActionCompatParcelizer() {
        }

        @Override // o.SearchView.write
        public final Drawable b(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            String classAttribute = attributeSet.getClassAttribute();
            if (classAttribute == null) {
                return null;
            }
            try {
                Drawable drawable = (Drawable) RemoteActionCompatParcelizer.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                drawable.inflate(context.getResources(), xmlPullParser, attributeSet, theme);
                return drawable;
            } catch (Exception e) {
                Log.e("DrawableDelegate", "Exception while inflating <drawable>", e);
                return null;
            }
        }
    }

    /* loaded from: classes-dex2jar.jar:o/SearchView$read.class */
    public static final class read implements write {
        read() {
        }

        @Override // o.SearchView.write
        public final Drawable b(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return setActionBarHideOffset.a(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e);
                return null;
            }
        }
    }

    /* loaded from: classes-dex2jar.jar:o/SearchView$write.class */
    public interface write {
        Drawable b(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    private Drawable b(Context context, int i) {
        int next;
        setCollapseIcon<String, write> setcollapseicon = this.f;
        if (setcollapseicon == null || setcollapseicon.isEmpty()) {
            return null;
        }
        setTrackTintList<String> settracktintlist = this.i;
        if (settracktintlist != null) {
            String b2 = settracktintlist.b(i);
            if ("appcompat_skip_skip".equals(b2)) {
                return null;
            }
            if (b2 != null && this.f.get(b2) == null) {
                return null;
            }
        } else {
            this.i = new setTrackTintList<>();
        }
        if (this.g == null) {
            this.g = new TypedValue();
        }
        TypedValue typedValue = this.g;
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        long j = (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
        Drawable d = d(context, j);
        if (d != null) {
            return d;
        }
        Drawable drawable = d;
        if (typedValue.string != null) {
            drawable = d;
            if (typedValue.string.toString().endsWith(".xml")) {
                drawable = d;
                try {
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
                        this.i.a(i, name);
                        write write2 = this.f.get(name);
                        Drawable drawable2 = d;
                        if (write2 != null) {
                            drawable2 = write2.b(context, xml, asAttributeSet, context.getTheme());
                        }
                        drawable = drawable2;
                        if (drawable2 != null) {
                            drawable2.setChangingConfigurations(typedValue.changingConfigurations);
                            e(context, j, drawable2);
                            drawable = drawable2;
                        }
                    } else {
                        throw new XmlPullParserException("No start tag found");
                    }
                } catch (Exception e) {
                    Log.e("ResourceManagerInternal", "Exception while inflating drawable", e);
                }
            }
        }
        if (drawable == null) {
            this.i.a(i, "appcompat_skip_skip");
        }
        return drawable;
    }

    public static void b(Drawable drawable, setImeOptions setimeoptions, int[] iArr) {
        if (!setOnFitSystemWindowsListener.c(drawable) || drawable.mutate() == drawable) {
            if (setimeoptions.c || setimeoptions.e) {
                ColorStateList colorStateList = setimeoptions.c ? setimeoptions.a : null;
                PorterDuff.Mode mode = setimeoptions.e ? setimeoptions.d : a;
                PorterDuffColorFilter porterDuffColorFilter = null;
                if (colorStateList != null) {
                    porterDuffColorFilter = null;
                    if (mode != null) {
                        porterDuffColorFilter = d(colorStateList.getColorForState(iArr, 0), mode);
                    }
                }
                drawable.setColorFilter(porterDuffColorFilter);
            } else {
                drawable.clearColorFilter();
            }
            if (Build.VERSION.SDK_INT <= 23) {
                drawable.invalidateSelf();
                return;
            }
            return;
        }
        Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
    }

    private Drawable c(Context context, int i, boolean z, Drawable drawable) {
        Drawable drawable2;
        ColorStateList d = d(context, i);
        PorterDuff.Mode mode = null;
        if (d != null) {
            Drawable drawable3 = drawable;
            if (setOnFitSystemWindowsListener.c(drawable)) {
                drawable3 = drawable.mutate();
            }
            Drawable h = getInsetsForType.h(drawable3);
            getInsetsForType.e(h, d);
            MediaDescriptionCompat mediaDescriptionCompat = this.e;
            if (mediaDescriptionCompat != null) {
                mode = mediaDescriptionCompat.d(i);
            }
            drawable2 = h;
            if (mode != null) {
                getInsetsForType.d(h, mode);
                drawable2 = h;
            }
        } else {
            MediaDescriptionCompat mediaDescriptionCompat2 = this.e;
            if (mediaDescriptionCompat2 == null || !mediaDescriptionCompat2.d(context, i, drawable)) {
                drawable2 = drawable;
                if (!d(context, i, drawable)) {
                    drawable2 = drawable;
                    if (z) {
                        drawable2 = null;
                    }
                }
            } else {
                drawable2 = drawable;
            }
        }
        return drawable2;
    }

    public static PorterDuffColorFilter d(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (SearchView.class) {
            try {
                IconCompatParcelizer iconCompatParcelizer = c;
                int i2 = (i + 31) * 31;
                PorterDuffColorFilter e = iconCompatParcelizer.e(Integer.valueOf(mode.hashCode() + i2));
                porterDuffColorFilter = e;
                if (e == null) {
                    porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
                    iconCompatParcelizer.c(Integer.valueOf(i2 + mode.hashCode()), porterDuffColorFilter);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return porterDuffColorFilter;
    }

    private Drawable d(Context context, long j) {
        synchronized (this) {
            setTrackDrawable<WeakReference<Drawable.ConstantState>> settrackdrawable = this.d.get(context);
            if (settrackdrawable == null) {
                return null;
            }
            WeakReference<Drawable.ConstantState> a2 = settrackdrawable.a(j, null);
            if (a2 != null) {
                Drawable.ConstantState constantState = a2.get();
                if (constantState != null) {
                    return constantState.newDrawable(context.getResources());
                }
                int e = setThumbTintList.e(settrackdrawable.d, settrackdrawable.a, j);
                if (e >= 0) {
                    Object[] objArr = settrackdrawable.b;
                    Object obj = objArr[e];
                    Object obj2 = setTrackDrawable.e;
                    if (obj != obj2) {
                        objArr[e] = obj2;
                        settrackdrawable.c = true;
                    }
                }
            }
            return null;
        }
    }

    public static SearchView e() {
        SearchView searchView;
        synchronized (SearchView.class) {
            try {
                if (b == null) {
                    SearchView searchView2 = new SearchView();
                    b = searchView2;
                    if (Build.VERSION.SDK_INT < 24) {
                        MediaMetadataCompat mediaMetadataCompat = new MediaMetadataCompat();
                        if (searchView2.f == null) {
                            searchView2.f = new setCollapseIcon<>();
                        }
                        searchView2.f.put("vector", mediaMetadataCompat);
                        SearchView$MediaBrowserCompat$CustomActionResultReceiver searchView$MediaBrowserCompat$CustomActionResultReceiver = new write() { // from class: o.SearchView$MediaBrowserCompat$CustomActionResultReceiver
                            @Override // o.SearchView.write
                            public final Drawable b(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
                                try {
                                    return getTranslateY.e(context, context.getResources(), xmlPullParser, attributeSet, theme);
                                } catch (Exception e) {
                                    Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e);
                                    return null;
                                }
                            }
                        };
                        if (searchView2.f == null) {
                            searchView2.f = new setCollapseIcon<>();
                        }
                        searchView2.f.put("animated-vector", searchView$MediaBrowserCompat$CustomActionResultReceiver);
                        read read2 = new read();
                        if (searchView2.f == null) {
                            searchView2.f = new setCollapseIcon<>();
                        }
                        searchView2.f.put("animated-selector", read2);
                        RemoteActionCompatParcelizer remoteActionCompatParcelizer = new RemoteActionCompatParcelizer();
                        if (searchView2.f == null) {
                            searchView2.f = new setCollapseIcon<>();
                        }
                        searchView2.f.put("drawable", remoteActionCompatParcelizer);
                    }
                }
                searchView = b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return searchView;
    }

    private boolean e(Context context, long j, Drawable drawable) {
        synchronized (this) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState == null) {
                return false;
            }
            setTrackDrawable<WeakReference<Drawable.ConstantState>> settrackdrawable = this.d.get(context);
            setTrackDrawable<WeakReference<Drawable.ConstantState>> settrackdrawable2 = settrackdrawable;
            if (settrackdrawable == null) {
                settrackdrawable2 = new setTrackDrawable<>();
                this.d.put(context, settrackdrawable2);
            }
            settrackdrawable2.c(j, new WeakReference<>(constantState));
            return true;
        }
    }

    public final Drawable c(Context context, int i) {
        Drawable e;
        synchronized (this) {
            e = e(context, i, false);
        }
        return e;
    }

    public final ColorStateList d(Context context, int i) {
        ColorStateList colorStateList;
        setTrackTintList<ColorStateList> settracktintlist;
        synchronized (this) {
            WeakHashMap<Context, setTrackTintList<ColorStateList>> weakHashMap = this.h;
            ColorStateList colorStateList2 = null;
            ColorStateList b2 = (weakHashMap == null || (settracktintlist = weakHashMap.get(context)) == null) ? null : settracktintlist.b(i);
            colorStateList = b2;
            if (b2 == null) {
                MediaDescriptionCompat mediaDescriptionCompat = this.e;
                if (mediaDescriptionCompat != null) {
                    colorStateList2 = mediaDescriptionCompat.a(context, i);
                }
                if (colorStateList2 != null) {
                    if (this.h == null) {
                        this.h = new WeakHashMap<>();
                    }
                    setTrackTintList<ColorStateList> settracktintlist2 = this.h.get(context);
                    setTrackTintList<ColorStateList> settracktintlist3 = settracktintlist2;
                    if (settracktintlist2 == null) {
                        settracktintlist3 = new setTrackTintList<>();
                        this.h.put(context, settracktintlist3);
                    }
                    settracktintlist3.a(i, colorStateList2);
                }
                colorStateList = colorStateList2;
            }
        }
        return colorStateList;
    }

    final boolean d(Context context, int i, Drawable drawable) {
        MediaDescriptionCompat mediaDescriptionCompat = this.e;
        return mediaDescriptionCompat != null && mediaDescriptionCompat.a(context, i, drawable);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0041, code lost:
        if (((r0 instanceof o.setTranslateX) || "android.graphics.drawable.VectorDrawable".equals(r0.getClass().getName())) != false) goto L_0x0059;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final android.graphics.drawable.Drawable e(android.content.Context r7, int r8, boolean r9) {
        /*
        // Method dump skipped, instructions count: 304
        */
        throw new UnsupportedOperationException("Method not decompiled: o.SearchView.e(android.content.Context, int, boolean):android.graphics.drawable.Drawable");
    }
}
