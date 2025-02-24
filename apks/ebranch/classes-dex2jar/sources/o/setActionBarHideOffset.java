package o;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import java.io.IOException;
import o.setHasNonEmbeddedTabs;
import o.setTransitioning;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes-dex2jar.jar:o/setActionBarHideOffset.class */
public class setActionBarHideOffset extends setTitleOptional implements getVisibleInsets {
    private setActionBarHideOffset$MediaBrowserCompat$CustomActionResultReceiver a;
    private setActionBarHideOffset$MediaBrowserCompat$MediaItem b;
    private int c;
    private boolean d;
    private int e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/setActionBarHideOffset$IconCompatParcelizer.class */
    public static class IconCompatParcelizer implements TimeInterpolator {
        private int b;
        private int[] d;
        private int e;

        IconCompatParcelizer(AnimationDrawable animationDrawable, boolean z) {
            c(animationDrawable, z);
        }

        int c() {
            return this.b;
        }

        int c(AnimationDrawable animationDrawable, boolean z) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.e = numberOfFrames;
            int[] iArr = this.d;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.d = new int[numberOfFrames];
            }
            int[] iArr2 = this.d;
            int i = 0;
            for (int i2 = 0; i2 < numberOfFrames; i2++) {
                int duration = animationDrawable.getDuration(z ? (numberOfFrames - i2) - 1 : i2);
                iArr2[i2] = duration;
                i += duration;
            }
            this.b = i;
            return i;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            int i;
            int i2 = (int) ((f * ((float) this.b)) + 0.5f);
            int i3 = this.e;
            int[] iArr = this.d;
            int i4 = 0;
            while (i4 < i3 && i2 >= (i = iArr[i4])) {
                i2 -= i;
                i4++;
            }
            return (((float) i4) / ((float) i3)) + (i4 < i3 ? ((float) i2) / ((float) this.b) : 0.0f);
        }
    }

    /* loaded from: classes-dex2jar.jar:o/setActionBarHideOffset$RemoteActionCompatParcelizer.class */
    public static class RemoteActionCompatParcelizer extends setActionBarHideOffset$MediaBrowserCompat$MediaItem {
        private final boolean b;
        private final ObjectAnimator d;

        RemoteActionCompatParcelizer(AnimationDrawable animationDrawable, boolean z, boolean z2) {
            super();
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            int i = z ? numberOfFrames - 1 : 0;
            int i2 = z ? 0 : numberOfFrames - 1;
            IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(animationDrawable, z);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i, i2);
            ofInt.setAutoCancel(true);
            ofInt.setDuration((long) iconCompatParcelizer.c());
            ofInt.setInterpolator(iconCompatParcelizer);
            this.b = z2;
            this.d = ofInt;
        }

        @Override // o.setActionBarHideOffset$MediaBrowserCompat$MediaItem
        public void a() {
            this.d.reverse();
        }

        @Override // o.setActionBarHideOffset$MediaBrowserCompat$MediaItem
        public void b() {
            this.d.cancel();
        }

        @Override // o.setActionBarHideOffset$MediaBrowserCompat$MediaItem
        public void c() {
            this.d.start();
        }

        @Override // o.setActionBarHideOffset$MediaBrowserCompat$MediaItem
        public boolean e() {
            return this.b;
        }
    }

    /* loaded from: classes-dex2jar.jar:o/setActionBarHideOffset$read.class */
    public static class read extends setActionBarHideOffset$MediaBrowserCompat$MediaItem {
        private final Animatable c;

        read(Animatable animatable) {
            super();
            this.c = animatable;
        }

        @Override // o.setActionBarHideOffset$MediaBrowserCompat$MediaItem
        public void b() {
            this.c.stop();
        }

        @Override // o.setActionBarHideOffset$MediaBrowserCompat$MediaItem
        public void c() {
            this.c.start();
        }
    }

    /* loaded from: classes-dex2jar.jar:o/setActionBarHideOffset$write.class */
    public static class write extends setActionBarHideOffset$MediaBrowserCompat$MediaItem {
        private final getTranslateY b;

        write(getTranslateY gettranslatey) {
            super();
            this.b = gettranslatey;
        }

        @Override // o.setActionBarHideOffset$MediaBrowserCompat$MediaItem
        public void b() {
            this.b.stop();
        }

        @Override // o.setActionBarHideOffset$MediaBrowserCompat$MediaItem
        public void c() {
            this.b.start();
        }
    }

    public setActionBarHideOffset() {
        this(null, null);
    }

    public setActionBarHideOffset(setActionBarHideOffset$MediaBrowserCompat$CustomActionResultReceiver setactionbarhideoffset_mediabrowsercompat_customactionresultreceiver, Resources resources) {
        super(null);
        this.e = -1;
        this.c = -1;
        e(new setActionBarHideOffset$MediaBrowserCompat$CustomActionResultReceiver(setactionbarhideoffset_mediabrowsercompat_customactionresultreceiver, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    public static setActionBarHideOffset a(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws IOException, XmlPullParserException {
        String name = xmlPullParser.getName();
        if (name.equals("animated-selector")) {
            setActionBarHideOffset setactionbarhideoffset = new setActionBarHideOffset();
            setactionbarhideoffset.c(context, resources, xmlPullParser, attributeSet, theme);
            return setactionbarhideoffset;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(xmlPullParser.getPositionDescription());
        sb.append(": invalid animated-selector tag ");
        sb.append(name);
        throw new XmlPullParserException(sb.toString());
    }

    private int b(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        int[] iArr = setHasNonEmbeddedTabs.write.h;
        TypedArray obtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        int resourceId = obtainAttributes.getResourceId(setHasNonEmbeddedTabs.write.j, 0);
        int resourceId2 = obtainAttributes.getResourceId(setHasNonEmbeddedTabs.write.i, -1);
        Drawable c = resourceId2 > 0 ? SearchView.e().c(context, resourceId2) : null;
        obtainAttributes.recycle();
        int[] d = d(attributeSet);
        Drawable drawable = c;
        if (c == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next == 2) {
                drawable = xmlPullParser.getName().equals("vector") ? setTranslateX.a(resources, xmlPullParser, attributeSet, theme) : Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(xmlPullParser.getPositionDescription());
                sb.append(": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
                throw new XmlPullParserException(sb.toString());
            }
        }
        if (drawable != null) {
            return this.a.c(d, drawable, resourceId);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(xmlPullParser.getPositionDescription());
        sb2.append(": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
        throw new XmlPullParserException(sb2.toString());
    }

    private void c() {
        onStateChange(getState());
    }

    private void d(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next != 1) {
                int depth2 = xmlPullParser.getDepth();
                if (depth2 < depth && next == 3) {
                    return;
                }
                if (next == 2 && depth2 <= depth) {
                    if (xmlPullParser.getName().equals("item")) {
                        b(context, resources, xmlPullParser, attributeSet, theme);
                    } else if (xmlPullParser.getName().equals("transition")) {
                        e(context, resources, xmlPullParser, attributeSet, theme);
                    }
                }
            } else {
                return;
            }
        }
    }

    private void d(TypedArray typedArray) {
        setActionBarHideOffset$MediaBrowserCompat$CustomActionResultReceiver setactionbarhideoffset_mediabrowsercompat_customactionresultreceiver = this.a;
        setactionbarhideoffset_mediabrowsercompat_customactionresultreceiver.c |= typedArray.getChangingConfigurations();
        setactionbarhideoffset_mediabrowsercompat_customactionresultreceiver.a(typedArray.getBoolean(setHasNonEmbeddedTabs.write.f, setactionbarhideoffset_mediabrowsercompat_customactionresultreceiver.L));
        setactionbarhideoffset_mediabrowsercompat_customactionresultreceiver.b(typedArray.getBoolean(setHasNonEmbeddedTabs.write.d, setactionbarhideoffset_mediabrowsercompat_customactionresultreceiver.r));
        setactionbarhideoffset_mediabrowsercompat_customactionresultreceiver.c(typedArray.getInt(setHasNonEmbeddedTabs.write.a, setactionbarhideoffset_mediabrowsercompat_customactionresultreceiver.y));
        setactionbarhideoffset_mediabrowsercompat_customactionresultreceiver.b(typedArray.getInt(setHasNonEmbeddedTabs.write.e, setactionbarhideoffset_mediabrowsercompat_customactionresultreceiver.w));
        setDither(typedArray.getBoolean(setHasNonEmbeddedTabs.write.b, setactionbarhideoffset_mediabrowsercompat_customactionresultreceiver.t));
    }

    private boolean d(int i) {
        int i2;
        int d;
        setActionBarHideOffset$MediaBrowserCompat$MediaItem setactionbarhideoffset_mediabrowsercompat_mediaitem;
        setActionBarHideOffset$MediaBrowserCompat$MediaItem setactionbarhideoffset_mediabrowsercompat_mediaitem2 = this.b;
        if (setactionbarhideoffset_mediabrowsercompat_mediaitem2 == null) {
            i2 = a();
        } else if (i == this.e) {
            return true;
        } else {
            if (i != this.c || !setactionbarhideoffset_mediabrowsercompat_mediaitem2.e()) {
                i2 = this.e;
                setactionbarhideoffset_mediabrowsercompat_mediaitem2.b();
            } else {
                setactionbarhideoffset_mediabrowsercompat_mediaitem2.a();
                this.e = this.c;
                this.c = i;
                return true;
            }
        }
        this.b = null;
        this.c = -1;
        this.e = -1;
        setActionBarHideOffset$MediaBrowserCompat$CustomActionResultReceiver setactionbarhideoffset_mediabrowsercompat_customactionresultreceiver = this.a;
        int a = setactionbarhideoffset_mediabrowsercompat_customactionresultreceiver.a(i2);
        int a2 = setactionbarhideoffset_mediabrowsercompat_customactionresultreceiver.a(i);
        if (a2 == 0 || a == 0 || (d = setactionbarhideoffset_mediabrowsercompat_customactionresultreceiver.d(a, a2)) < 0) {
            return false;
        }
        boolean e = setactionbarhideoffset_mediabrowsercompat_customactionresultreceiver.e(a, a2);
        e(d);
        Drawable current = getCurrent();
        if (current instanceof AnimationDrawable) {
            setactionbarhideoffset_mediabrowsercompat_mediaitem = new RemoteActionCompatParcelizer((AnimationDrawable) current, setactionbarhideoffset_mediabrowsercompat_customactionresultreceiver.c(a, a2), e);
        } else if (current instanceof getTranslateY) {
            setactionbarhideoffset_mediabrowsercompat_mediaitem = new write((getTranslateY) current);
        } else if (!(current instanceof Animatable)) {
            return false;
        } else {
            setactionbarhideoffset_mediabrowsercompat_mediaitem = new read((Animatable) current);
        }
        setactionbarhideoffset_mediabrowsercompat_mediaitem.c();
        this.b = setactionbarhideoffset_mediabrowsercompat_mediaitem;
        this.c = i2;
        this.e = i;
        return true;
    }

    private int e(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        int[] iArr = setHasNonEmbeddedTabs.write.l;
        TypedArray obtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        int resourceId = obtainAttributes.getResourceId(setHasNonEmbeddedTabs.write.k, -1);
        int resourceId2 = obtainAttributes.getResourceId(setHasNonEmbeddedTabs.write.n, -1);
        int resourceId3 = obtainAttributes.getResourceId(setHasNonEmbeddedTabs.write.f236o, -1);
        Drawable c = resourceId3 > 0 ? SearchView.e().c(context, resourceId3) : null;
        boolean z = obtainAttributes.getBoolean(setHasNonEmbeddedTabs.write.m, false);
        obtainAttributes.recycle();
        Drawable drawable = c;
        if (c == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next == 2) {
                drawable = xmlPullParser.getName().equals("animated-vector") ? getTranslateY.e(context, resources, xmlPullParser, attributeSet, theme) : Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(xmlPullParser.getPositionDescription());
                sb.append(": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
                throw new XmlPullParserException(sb.toString());
            }
        }
        if (drawable == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(xmlPullParser.getPositionDescription());
            sb2.append(": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
            throw new XmlPullParserException(sb2.toString());
        } else if (resourceId != -1 && resourceId2 != -1) {
            return this.a.b(resourceId, resourceId2, drawable, z);
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(xmlPullParser.getPositionDescription());
            sb3.append(": <transition> tag requires 'fromId' & 'toId' attributes");
            throw new XmlPullParserException(sb3.toString());
        }
    }

    @Override // o.setTitleOptional, o.setTransitioning, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        applyTheme(theme);
    }

    /* renamed from: b */
    public setActionBarHideOffset$MediaBrowserCompat$CustomActionResultReceiver e() {
        return new setActionBarHideOffset$MediaBrowserCompat$CustomActionResultReceiver(this.a, this, null);
    }

    @Override // o.setTitleOptional
    public void c(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int[] iArr = setHasNonEmbeddedTabs.write.c;
        TypedArray obtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        setVisible(obtainAttributes.getBoolean(setHasNonEmbeddedTabs.write.g, true), true);
        d(obtainAttributes);
        a(resources);
        obtainAttributes.recycle();
        d(context, resources, xmlPullParser, attributeSet, theme);
        c();
    }

    @Override // o.setTransitioning, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean canApplyTheme() {
        return canApplyTheme();
    }

    @Override // o.setTransitioning, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void draw(Canvas canvas) {
        draw(canvas);
    }

    @Override // o.setTitleOptional, o.setTransitioning
    public void e(setTransitioning.IconCompatParcelizer iconCompatParcelizer) {
        e(iconCompatParcelizer);
        if (iconCompatParcelizer instanceof setActionBarHideOffset$MediaBrowserCompat$CustomActionResultReceiver) {
            this.a = (setActionBarHideOffset$MediaBrowserCompat$CustomActionResultReceiver) iconCompatParcelizer;
        }
    }

    @Override // o.setTransitioning, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getAlpha() {
        return getAlpha();
    }

    @Override // o.setTransitioning, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getChangingConfigurations() {
        return getChangingConfigurations();
    }

    @Override // o.setTransitioning, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return getCurrent();
    }

    @Override // o.setTransitioning, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void getHotspotBounds(Rect rect) {
        getHotspotBounds(rect);
    }

    @Override // o.setTransitioning, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getIntrinsicHeight() {
        return getIntrinsicHeight();
    }

    @Override // o.setTransitioning, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getIntrinsicWidth() {
        return getIntrinsicWidth();
    }

    @Override // o.setTransitioning, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return getMinimumHeight();
    }

    @Override // o.setTransitioning, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return getMinimumWidth();
    }

    @Override // o.setTransitioning, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getOpacity() {
        return getOpacity();
    }

    @Override // o.setTransitioning, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void getOutline(Outline outline) {
        getOutline(outline);
    }

    @Override // o.setTransitioning, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return getPadding(rect);
    }

    @Override // o.setTransitioning, android.graphics.drawable.Drawable.Callback
    public /* bridge */ /* synthetic */ void invalidateDrawable(Drawable drawable) {
        invalidateDrawable(drawable);
    }

    @Override // o.setTransitioning, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean isAutoMirrored() {
        return isAutoMirrored();
    }

    @Override // o.setTitleOptional, o.setTransitioning, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // o.setTransitioning, android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        jumpToCurrentState();
        setActionBarHideOffset$MediaBrowserCompat$MediaItem setactionbarhideoffset_mediabrowsercompat_mediaitem = this.b;
        if (setactionbarhideoffset_mediabrowsercompat_mediaitem != null) {
            setactionbarhideoffset_mediabrowsercompat_mediaitem.b();
            this.b = null;
            e(this.e);
            this.e = -1;
            this.c = -1;
        }
    }

    @Override // o.setTitleOptional, o.setTransitioning, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.d && mutate() == this) {
            this.a.d();
            this.d = true;
        }
        return this;
    }

    @Override // o.setTransitioning, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean onLayoutDirectionChanged(int i) {
        return onLayoutDirectionChanged(i);
    }

    @Override // o.setTitleOptional, o.setTransitioning, android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        int c = this.a.c(iArr);
        boolean z = c != a() && (d(c) || e(c));
        Drawable current = getCurrent();
        boolean z2 = z;
        if (current != null) {
            z2 = z | current.setState(iArr);
        }
        return z2;
    }

    @Override // o.setTransitioning, android.graphics.drawable.Drawable.Callback
    public /* bridge */ /* synthetic */ void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleDrawable(drawable, runnable, j);
    }

    @Override // o.setTransitioning, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAlpha(int i) {
        setAlpha(i);
    }

    @Override // o.setTransitioning, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAutoMirrored(boolean z) {
        setAutoMirrored(z);
    }

    @Override // o.setTransitioning, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(ColorFilter colorFilter) {
        setColorFilter(colorFilter);
    }

    @Override // o.setTransitioning, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setDither(boolean z) {
        setDither(z);
    }

    @Override // o.setTransitioning, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        setHotspot(f, f2);
    }

    @Override // o.setTransitioning, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        setHotspotBounds(i, i2, i3, i4);
    }

    @Override // o.setTransitioning, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setTintList(ColorStateList colorStateList) {
        setTintList(colorStateList);
    }

    @Override // o.setTransitioning, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setTintMode(PorterDuff.Mode mode) {
        setTintMode(mode);
    }

    @Override // o.setTransitioning, android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = setVisible(z, z2);
        setActionBarHideOffset$MediaBrowserCompat$MediaItem setactionbarhideoffset_mediabrowsercompat_mediaitem = this.b;
        if (setactionbarhideoffset_mediabrowsercompat_mediaitem != null && (visible || z2)) {
            if (z) {
                setactionbarhideoffset_mediabrowsercompat_mediaitem.c();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }

    @Override // o.setTransitioning, android.graphics.drawable.Drawable.Callback
    public /* bridge */ /* synthetic */ void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleDrawable(drawable, runnable);
    }
}
