package o;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayDeque;
import o.isConsumed;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes-dex2jar.jar:o/setTranslateX.class */
public class setTranslateX extends getScaleY {
    static final PorterDuff.Mode c = PorterDuff.Mode.SRC_IN;
    private Drawable.ConstantState b;
    private boolean d;
    private ColorFilter e;
    private final Rect f;
    private boolean g;
    private PorterDuffColorFilter h;
    private final Matrix i;
    private final float[] j;
    private MediaMetadataCompat n;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/setTranslateX$IconCompatParcelizer.class */
    public static abstract class IconCompatParcelizer extends RemoteActionCompatParcelizer {
        int k;
        int m;
        String n;

        /* renamed from: o */
        protected isConsumed.IconCompatParcelizer[] f284o;

        public IconCompatParcelizer() {
            super();
            this.f284o = null;
            this.k = 0;
        }

        public IconCompatParcelizer(IconCompatParcelizer iconCompatParcelizer) {
            super();
            this.f284o = null;
            this.k = 0;
            this.n = iconCompatParcelizer.n;
            this.m = iconCompatParcelizer.m;
            this.f284o = isConsumed.a(iconCompatParcelizer.f284o);
        }

        public boolean c() {
            return false;
        }

        public void d(Path path) {
            path.reset();
            isConsumed.IconCompatParcelizer[] iconCompatParcelizerArr = this.f284o;
            if (iconCompatParcelizerArr != null) {
                isConsumed.IconCompatParcelizer.b(iconCompatParcelizerArr, path);
            }
        }

        public isConsumed.IconCompatParcelizer[] getPathData() {
            return this.f284o;
        }

        public String getPathName() {
            return this.n;
        }

        public void setPathData(isConsumed.IconCompatParcelizer[] iconCompatParcelizerArr) {
            if (!isConsumed.d(this.f284o, iconCompatParcelizerArr)) {
                this.f284o = isConsumed.a(iconCompatParcelizerArr);
                return;
            }
            isConsumed.IconCompatParcelizer[] iconCompatParcelizerArr2 = this.f284o;
            for (int i = 0; i < iconCompatParcelizerArr.length; i++) {
                iconCompatParcelizerArr2[i].a = (char) iconCompatParcelizerArr[i].a;
                for (int i2 = 0; i2 < iconCompatParcelizerArr[i].c.length; i2++) {
                    iconCompatParcelizerArr2[i].c[i2] = iconCompatParcelizerArr[i].c[i2];
                }
            }
        }
    }

    /* loaded from: classes-dex2jar.jar:o/setTranslateX$MediaDescriptionCompat.class */
    public static class MediaDescriptionCompat extends Drawable.ConstantState {
        private final Drawable.ConstantState d;

        public MediaDescriptionCompat(Drawable.ConstantState constantState) {
            this.d = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.d.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.d.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            setTranslateX settranslatex = new setTranslateX();
            settranslatex.a = (VectorDrawable) this.d.newDrawable();
            return settranslatex;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            setTranslateX settranslatex = new setTranslateX();
            settranslatex.a = (VectorDrawable) this.d.newDrawable(resources);
            return settranslatex;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            setTranslateX settranslatex = new setTranslateX();
            settranslatex.a = (VectorDrawable) this.d.newDrawable(resources, theme);
            return settranslatex;
        }
    }

    /* loaded from: classes-dex2jar.jar:o/setTranslateX$MediaMetadataCompat.class */
    public static class MediaMetadataCompat extends Drawable.ConstantState {
        boolean a;
        Bitmap b;
        int c;
        boolean d;
        boolean e;
        Paint f;
        int g;
        ColorStateList h;
        PorterDuff.Mode i;
        ColorStateList j;
        setTranslateX$MediaBrowserCompat$MediaItem n;

        /* renamed from: o */
        PorterDuff.Mode f287o;

        public MediaMetadataCompat() {
            this.h = null;
            this.f287o = setTranslateX.c;
            this.n = new setTranslateX$MediaBrowserCompat$MediaItem();
        }

        public MediaMetadataCompat(MediaMetadataCompat mediaMetadataCompat) {
            this.h = null;
            this.f287o = setTranslateX.c;
            if (mediaMetadataCompat != null) {
                this.g = mediaMetadataCompat.g;
                this.n = new setTranslateX$MediaBrowserCompat$MediaItem(mediaMetadataCompat.n);
                if (mediaMetadataCompat.n.e != null) {
                    this.n.e = new Paint(mediaMetadataCompat.n.e);
                }
                if (mediaMetadataCompat.n.f != null) {
                    this.n.f = new Paint(mediaMetadataCompat.n.f);
                }
                this.h = mediaMetadataCompat.h;
                this.f287o = mediaMetadataCompat.f287o;
                this.a = mediaMetadataCompat.a;
            }
        }

        public boolean a() {
            return !this.d && this.j == this.h && this.i == this.f287o && this.e == this.a && this.c == this.n.getRootAlpha();
        }

        public boolean a(int i, int i2) {
            return i == this.b.getWidth() && i2 == this.b.getHeight();
        }

        public void b(int i, int i2) {
            this.b.eraseColor(0);
            this.n.b(new Canvas(this.b), i, i2, null);
        }

        public boolean c() {
            return this.n.d();
        }

        public boolean c(int[] iArr) {
            boolean e = this.n.e(iArr);
            this.d |= e;
            return e;
        }

        public void d(int i, int i2) {
            if (this.b == null || !a(i, i2)) {
                this.b = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                this.d = true;
            }
        }

        public boolean d() {
            return this.n.getRootAlpha() < 255;
        }

        public Paint e(ColorFilter colorFilter) {
            if (!d() && colorFilter == null) {
                return null;
            }
            if (this.f == null) {
                Paint paint = new Paint();
                this.f = paint;
                paint.setFilterBitmap(true);
            }
            this.f.setAlpha(this.n.getRootAlpha());
            this.f.setColorFilter(colorFilter);
            return this.f;
        }

        public void e() {
            this.j = this.h;
            this.i = this.f287o;
            this.c = this.n.getRootAlpha();
            this.e = this.a;
            this.d = false;
        }

        public void e(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.b, (Rect) null, rect, e(colorFilter));
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.g;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new setTranslateX(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new setTranslateX(this);
        }
    }

    /* loaded from: classes-dex2jar.jar:o/setTranslateX$RemoteActionCompatParcelizer.class */
    public static abstract class RemoteActionCompatParcelizer {
        private RemoteActionCompatParcelizer() {
        }

        public boolean a(int[] iArr) {
            return false;
        }

        public boolean d() {
            return false;
        }
    }

    /* loaded from: classes-dex2jar.jar:o/setTranslateX$read.class */
    public static class read extends IconCompatParcelizer {
        getSystemWindowInsets a;
        float b;
        float c;
        Paint.Cap d;
        getSystemWindowInsets e;
        float f;
        float g;
        Paint.Join h;
        float i;
        float j;
        float l;
        private int[] r;

        read() {
            this.f = 0.0f;
            this.c = 1.0f;
            this.b = 1.0f;
            this.l = 0.0f;
            this.j = 1.0f;
            this.g = 0.0f;
            this.d = Paint.Cap.BUTT;
            this.h = Paint.Join.MITER;
            this.i = 4.0f;
        }

        public read(read read) {
            super(read);
            this.f = 0.0f;
            this.c = 1.0f;
            this.b = 1.0f;
            this.l = 0.0f;
            this.j = 1.0f;
            this.g = 0.0f;
            this.d = Paint.Cap.BUTT;
            this.h = Paint.Join.MITER;
            this.i = 4.0f;
            this.r = read.r;
            this.a = read.a;
            this.f = read.f;
            this.c = read.c;
            this.e = read.e;
            this.k = read.k;
            this.b = read.b;
            this.l = read.l;
            this.j = read.j;
            this.g = read.g;
            this.d = read.d;
            this.h = read.h;
            this.i = read.i;
        }

        private void a(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.r = null;
            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.n = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.f284o = isConsumed.b(string2);
                }
                this.e = isVisible.a(typedArray, xmlPullParser, theme, "fillColor", 1, 0);
                this.b = isVisible.e(typedArray, xmlPullParser, "fillAlpha", 12, this.b);
                this.d = e(isVisible.d(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.d);
                this.h = b(isVisible.d(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.h);
                this.i = isVisible.e(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.i);
                this.a = isVisible.a(typedArray, xmlPullParser, theme, "strokeColor", 3, 0);
                this.c = isVisible.e(typedArray, xmlPullParser, "strokeAlpha", 11, this.c);
                this.f = isVisible.e(typedArray, xmlPullParser, "strokeWidth", 4, this.f);
                this.j = isVisible.e(typedArray, xmlPullParser, "trimPathEnd", 6, this.j);
                this.g = isVisible.e(typedArray, xmlPullParser, "trimPathOffset", 7, this.g);
                this.l = isVisible.e(typedArray, xmlPullParser, "trimPathStart", 5, this.l);
                this.k = isVisible.d(typedArray, xmlPullParser, "fillType", 13, this.k);
            }
        }

        private Paint.Join b(int i, Paint.Join join) {
            return i != 0 ? i != 1 ? i != 2 ? join : Paint.Join.BEVEL : Paint.Join.ROUND : Paint.Join.MITER;
        }

        private Paint.Cap e(int i, Paint.Cap cap) {
            return i != 0 ? i != 1 ? i != 2 ? cap : Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        }

        @Override // o.setTranslateX.RemoteActionCompatParcelizer
        public boolean a(int[] iArr) {
            return this.a.c(iArr) | this.e.c(iArr);
        }

        public void c(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            int[] iArr = getRotation.k;
            TypedArray obtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
            a(obtainAttributes, xmlPullParser, theme);
            obtainAttributes.recycle();
        }

        @Override // o.setTranslateX.RemoteActionCompatParcelizer
        public boolean d() {
            return this.e.a() || this.a.a();
        }

        float getFillAlpha() {
            return this.b;
        }

        int getFillColor() {
            return this.e.d();
        }

        float getStrokeAlpha() {
            return this.c;
        }

        int getStrokeColor() {
            return this.a.d();
        }

        float getStrokeWidth() {
            return this.f;
        }

        float getTrimPathEnd() {
            return this.j;
        }

        float getTrimPathOffset() {
            return this.g;
        }

        float getTrimPathStart() {
            return this.l;
        }

        void setFillAlpha(float f) {
            this.b = f;
        }

        void setFillColor(int i) {
            this.e.a(i);
        }

        void setStrokeAlpha(float f) {
            this.c = f;
        }

        void setStrokeColor(int i) {
            this.a.a(i);
        }

        void setStrokeWidth(float f) {
            this.f = f;
        }

        void setTrimPathEnd(float f) {
            this.j = f;
        }

        void setTrimPathOffset(float f) {
            this.g = f;
        }

        void setTrimPathStart(float f) {
            this.l = f;
        }
    }

    /* loaded from: classes-dex2jar.jar:o/setTranslateX$write.class */
    public static class write extends IconCompatParcelizer {
        write() {
        }

        public write(write write) {
            super(write);
        }

        private void d(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.n = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f284o = isConsumed.b(string2);
            }
            this.k = isVisible.d(typedArray, xmlPullParser, "fillType", 2, 0);
        }

        public void b(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                int[] iArr = getRotation.g;
                TypedArray obtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
                d(obtainAttributes, xmlPullParser);
                obtainAttributes.recycle();
            }
        }

        @Override // o.setTranslateX.IconCompatParcelizer
        public boolean c() {
            return true;
        }
    }

    setTranslateX() {
        this.d = true;
        this.j = new float[9];
        this.i = new Matrix();
        this.f = new Rect();
        this.n = new MediaMetadataCompat();
    }

    setTranslateX(MediaMetadataCompat mediaMetadataCompat) {
        this.d = true;
        this.j = new float[9];
        this.i = new Matrix();
        this.f = new Rect();
        this.n = mediaMetadataCompat;
        this.h = a(this.h, mediaMetadataCompat.h, mediaMetadataCompat.f287o);
    }

    public static setTranslateX a(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        setTranslateX settranslatex = new setTranslateX();
        settranslatex.inflate(resources, xmlPullParser, attributeSet, theme);
        return settranslatex;
    }

    public static int b(int i, float f) {
        return (((int) (((float) Color.alpha(i)) * f)) << 24) | (16777215 & i);
    }

    private void b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        MediaMetadataCompat mediaMetadataCompat = this.n;
        setTranslateX$MediaBrowserCompat$MediaItem settranslatex_mediabrowsercompat_mediaitem = mediaMetadataCompat.n;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(settranslatex_mediabrowsercompat_mediaitem.g);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth();
        boolean z = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth + 1 || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                setTranslateX$MediaBrowserCompat$CustomActionResultReceiver settranslatex_mediabrowsercompat_customactionresultreceiver = (setTranslateX$MediaBrowserCompat$CustomActionResultReceiver) arrayDeque.peek();
                if ("path".equals(name)) {
                    read read2 = new read();
                    read2.c(resources, attributeSet, theme, xmlPullParser);
                    settranslatex_mediabrowsercompat_customactionresultreceiver.e.add(read2);
                    if (read2.getPathName() != null) {
                        settranslatex_mediabrowsercompat_mediaitem.i.put(read2.getPathName(), read2);
                    }
                    mediaMetadataCompat.g = read2.m | mediaMetadataCompat.g;
                    z = false;
                } else if ("clip-path".equals(name)) {
                    write write2 = new write();
                    write2.b(resources, attributeSet, theme, xmlPullParser);
                    settranslatex_mediabrowsercompat_customactionresultreceiver.e.add(write2);
                    if (write2.getPathName() != null) {
                        settranslatex_mediabrowsercompat_mediaitem.i.put(write2.getPathName(), write2);
                    }
                    mediaMetadataCompat.g = write2.m | mediaMetadataCompat.g;
                    z = z;
                } else {
                    z = z;
                    if ("group".equals(name)) {
                        setTranslateX$MediaBrowserCompat$CustomActionResultReceiver settranslatex_mediabrowsercompat_customactionresultreceiver2 = new setTranslateX$MediaBrowserCompat$CustomActionResultReceiver();
                        settranslatex_mediabrowsercompat_customactionresultreceiver2.d(resources, attributeSet, theme, xmlPullParser);
                        settranslatex_mediabrowsercompat_customactionresultreceiver.e.add(settranslatex_mediabrowsercompat_customactionresultreceiver2);
                        arrayDeque.push(settranslatex_mediabrowsercompat_customactionresultreceiver2);
                        if (settranslatex_mediabrowsercompat_customactionresultreceiver2.getGroupName() != null) {
                            settranslatex_mediabrowsercompat_mediaitem.i.put(settranslatex_mediabrowsercompat_customactionresultreceiver2.getGroupName(), settranslatex_mediabrowsercompat_customactionresultreceiver2);
                        }
                        mediaMetadataCompat.g = settranslatex_mediabrowsercompat_customactionresultreceiver2.c | mediaMetadataCompat.g;
                        z = z;
                    }
                }
            } else {
                z = z;
                if (eventType == 3) {
                    z = z;
                    if ("group".equals(xmlPullParser.getName())) {
                        arrayDeque.pop();
                        z = z;
                    }
                }
            }
            eventType = xmlPullParser.next();
        }
        if (z) {
            throw new XmlPullParserException("no path defined");
        }
    }

    public static setTranslateX d(Resources resources, int i, Resources.Theme theme) {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            setTranslateX settranslatex = new setTranslateX();
            settranslatex.a = inset.a(resources, i, theme);
            settranslatex.b = new MediaDescriptionCompat(settranslatex.a.getConstantState());
            return settranslatex;
        }
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
                return a(resources, xml, asAttributeSet, theme);
            }
            throw new XmlPullParserException("No start tag found");
        } catch (IOException e) {
            Log.e("VectorDrawableCompat", "parser error", e);
            return null;
        } catch (XmlPullParserException e2) {
            Log.e("VectorDrawableCompat", "parser error", e2);
            return null;
        }
    }

    private static PorterDuff.Mode e(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    private void e(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) throws XmlPullParserException {
        ColorStateList colorStateList;
        MediaMetadataCompat mediaMetadataCompat = this.n;
        setTranslateX$MediaBrowserCompat$MediaItem settranslatex_mediabrowsercompat_mediaitem = mediaMetadataCompat.n;
        mediaMetadataCompat.f287o = e(isVisible.d(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "tint") != null) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(1, typedValue);
            if (typedValue.type != 2) {
                colorStateList = (typedValue.type < 28 || typedValue.type > 31) ? getTappableElementInsets.b(typedArray.getResources(), typedArray.getResourceId(1, 0), theme) : ColorStateList.valueOf(typedValue.data);
            } else {
                StringBuilder sb = new StringBuilder("Failed to resolve attribute at index ");
                sb.append(1);
                sb.append(": ");
                sb.append(typedValue);
                throw new UnsupportedOperationException(sb.toString());
            }
        } else {
            colorStateList = null;
        }
        if (colorStateList != null) {
            mediaMetadataCompat.h = colorStateList;
        }
        mediaMetadataCompat.a = isVisible.e(typedArray, xmlPullParser, "autoMirrored", 5, mediaMetadataCompat.a);
        settranslatex_mediabrowsercompat_mediaitem.m = isVisible.e(typedArray, xmlPullParser, "viewportWidth", 7, settranslatex_mediabrowsercompat_mediaitem.m);
        settranslatex_mediabrowsercompat_mediaitem.j = isVisible.e(typedArray, xmlPullParser, "viewportHeight", 8, settranslatex_mediabrowsercompat_mediaitem.j);
        if (settranslatex_mediabrowsercompat_mediaitem.m <= 0.0f) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(typedArray.getPositionDescription());
            sb2.append("<vector> tag requires viewportWidth > 0");
            throw new XmlPullParserException(sb2.toString());
        } else if (settranslatex_mediabrowsercompat_mediaitem.j > 0.0f) {
            settranslatex_mediabrowsercompat_mediaitem.d = typedArray.getDimension(3, settranslatex_mediabrowsercompat_mediaitem.d);
            settranslatex_mediabrowsercompat_mediaitem.c = typedArray.getDimension(2, settranslatex_mediabrowsercompat_mediaitem.c);
            if (settranslatex_mediabrowsercompat_mediaitem.d <= 0.0f) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(typedArray.getPositionDescription());
                sb3.append("<vector> tag requires width > 0");
                throw new XmlPullParserException(sb3.toString());
            } else if (settranslatex_mediabrowsercompat_mediaitem.c > 0.0f) {
                settranslatex_mediabrowsercompat_mediaitem.setAlpha(isVisible.e(typedArray, xmlPullParser, "alpha", 4, settranslatex_mediabrowsercompat_mediaitem.getAlpha()));
                String string = typedArray.getString(0);
                if (string != null) {
                    settranslatex_mediabrowsercompat_mediaitem.h = string;
                    settranslatex_mediabrowsercompat_mediaitem.i.put(string, settranslatex_mediabrowsercompat_mediaitem);
                }
            } else {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(typedArray.getPositionDescription());
                sb4.append("<vector> tag requires height > 0");
                throw new XmlPullParserException(sb4.toString());
            }
        } else {
            StringBuilder sb5 = new StringBuilder();
            sb5.append(typedArray.getPositionDescription());
            sb5.append("<vector> tag requires viewportHeight > 0");
            throw new XmlPullParserException(sb5.toString());
        }
    }

    private boolean e() {
        boolean z = true;
        if (!isAutoMirrored() || getInsetsForType.c(this) != 1) {
            z = false;
        }
        return z;
    }

    PorterDuffColorFilter a(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // o.getScaleY, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        applyTheme(theme);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        if (this.a == null) {
            return false;
        }
        getInsetsForType.b(this.a);
        return false;
    }

    @Override // o.getScaleY, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        clearColorFilter();
    }

    public Object d(String str) {
        return this.n.n.i.get(str);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.a != null) {
            this.a.draw(canvas);
            return;
        }
        copyBounds(this.f);
        if (this.f.width() > 0 && this.f.height() > 0) {
            ColorFilter colorFilter = this.e;
            ColorFilter colorFilter2 = colorFilter;
            if (colorFilter == null) {
                colorFilter2 = this.h;
            }
            canvas.getMatrix(this.i);
            this.i.getValues(this.j);
            float abs = Math.abs(this.j[0]);
            float abs2 = Math.abs(this.j[4]);
            float abs3 = Math.abs(this.j[1]);
            float abs4 = Math.abs(this.j[3]);
            if (!(abs3 == 0.0f && abs4 == 0.0f)) {
                abs = 1.0f;
                abs2 = 1.0f;
            }
            int width = (int) (((float) this.f.width()) * abs);
            int height = (int) (((float) this.f.height()) * abs2);
            int min = Math.min(2048, width);
            int min2 = Math.min(2048, height);
            if (min > 0 && min2 > 0) {
                int save = canvas.save();
                canvas.translate((float) this.f.left, (float) this.f.top);
                if (e()) {
                    canvas.translate((float) this.f.width(), 0.0f);
                    canvas.scale(-1.0f, 1.0f);
                }
                this.f.offsetTo(0, 0);
                this.n.d(min, min2);
                if (!this.d) {
                    this.n.b(min, min2);
                } else if (!this.n.a()) {
                    this.n.b(min, min2);
                    this.n.e();
                }
                this.n.e(canvas, colorFilter2, this.f);
                canvas.restoreToCount(save);
            }
        }
    }

    public void e(boolean z) {
        this.d = z;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.a != null ? getInsetsForType.a(this.a) : this.n.n.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return this.a != null ? this.a.getChangingConfigurations() : getChangingConfigurations() | this.n.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.a != null ? getInsetsForType.e(this.a) : this.e;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.a != null && Build.VERSION.SDK_INT >= 24) {
            return new MediaDescriptionCompat(this.a.getConstantState());
        }
        this.n.g = getChangingConfigurations();
        return this.n;
    }

    @Override // o.getScaleY, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.a != null ? this.a.getIntrinsicHeight() : (int) this.n.n.c;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.a != null ? this.a.getIntrinsicWidth() : (int) this.n.n.d;
    }

    @Override // o.getScaleY, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return getMinimumHeight();
    }

    @Override // o.getScaleY, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        if (this.a != null) {
            return this.a.getOpacity();
        }
        return -3;
    }

    @Override // o.getScaleY, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return getPadding(rect);
    }

    @Override // o.getScaleY, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return getState();
    }

    @Override // o.getScaleY, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        if (this.a != null) {
            this.a.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        if (this.a != null) {
            getInsetsForType.e(this.a, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        MediaMetadataCompat mediaMetadataCompat = this.n;
        mediaMetadataCompat.n = new setTranslateX$MediaBrowserCompat$MediaItem();
        int[] iArr = getRotation.f156o;
        TypedArray obtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        e(obtainAttributes, xmlPullParser, theme);
        obtainAttributes.recycle();
        mediaMetadataCompat.g = getChangingConfigurations();
        mediaMetadataCompat.d = true;
        b(resources, xmlPullParser, attributeSet, theme);
        this.h = a(this.h, mediaMetadataCompat.h, mediaMetadataCompat.f287o);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        if (this.a != null) {
            this.a.invalidateSelf();
        } else {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return this.a != null ? getInsetsForType.f(this.a) : this.n.a;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        MediaMetadataCompat mediaMetadataCompat;
        if (this.a != null) {
            return this.a.isStateful();
        }
        return isStateful() || ((mediaMetadataCompat = this.n) != null && (mediaMetadataCompat.c() || (this.n.h != null && this.n.h.isStateful())));
    }

    @Override // o.getScaleY, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (this.a != null) {
            this.a.mutate();
            return this;
        }
        if (!this.g && mutate() == this) {
            this.n = new MediaMetadataCompat(this.n);
            this.g = true;
        }
        return this;
    }

    @Override // o.getScaleY, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        if (this.a != null) {
            this.a.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        if (this.a != null) {
            return this.a.setState(iArr);
        }
        MediaMetadataCompat mediaMetadataCompat = this.n;
        boolean z = true;
        if (mediaMetadataCompat.h == null || mediaMetadataCompat.f287o == null) {
            z = false;
        } else {
            this.h = a(this.h, mediaMetadataCompat.h, mediaMetadataCompat.f287o);
            invalidateSelf();
            z = true;
        }
        if (mediaMetadataCompat.c() && mediaMetadataCompat.c(iArr)) {
            invalidateSelf();
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable, long j) {
        if (this.a != null) {
            this.a.scheduleSelf(runnable, j);
        } else {
            scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.a != null) {
            this.a.setAlpha(i);
        } else if (this.n.n.getRootAlpha() != i) {
            this.n.n.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        if (this.a != null) {
            getInsetsForType.d(this.a, z);
        } else {
            this.n.a = z;
        }
    }

    @Override // o.getScaleY, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i) {
        setChangingConfigurations(i);
    }

    @Override // o.getScaleY, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i, PorterDuff.Mode mode) {
        setColorFilter(i, mode);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.a != null) {
            this.a.setColorFilter(colorFilter);
            return;
        }
        this.e = colorFilter;
        invalidateSelf();
    }

    @Override // o.getScaleY, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        setFilterBitmap(z);
    }

    @Override // o.getScaleY, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        setHotspot(f, f2);
    }

    @Override // o.getScaleY, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        setHotspotBounds(i, i2, i3, i4);
    }

    @Override // o.getScaleY, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i) {
        if (this.a != null) {
            getInsetsForType.b(this.a, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        if (this.a != null) {
            getInsetsForType.e(this.a, colorStateList);
            return;
        }
        MediaMetadataCompat mediaMetadataCompat = this.n;
        if (mediaMetadataCompat.h != colorStateList) {
            mediaMetadataCompat.h = colorStateList;
            this.h = a(this.h, colorStateList, mediaMetadataCompat.f287o);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        if (this.a != null) {
            getInsetsForType.d(this.a, mode);
            return;
        }
        MediaMetadataCompat mediaMetadataCompat = this.n;
        if (mediaMetadataCompat.f287o != mode) {
            mediaMetadataCompat.f287o = mode;
            this.h = a(this.h, mediaMetadataCompat.h, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        return this.a != null ? this.a.setVisible(z, z2) : setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
        if (this.a != null) {
            this.a.unscheduleSelf(runnable);
        } else {
            unscheduleSelf(runnable);
        }
    }
}
