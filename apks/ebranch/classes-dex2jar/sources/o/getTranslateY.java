package o;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import java.io.IOException;
import java.util.ArrayList;
import o.getPivotY;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes-dex2jar.jar:o/getTranslateY.class */
public class getTranslateY extends getScaleY implements getPivotY {
    final Drawable.Callback b;
    private Animator.AnimatorListener c;
    ArrayList<getPivotY.IconCompatParcelizer> d;
    private read e;
    private Context f;
    private ArgbEvaluator j;

    /* loaded from: classes-dex2jar.jar:o/getTranslateY$RemoteActionCompatParcelizer.class */
    static class RemoteActionCompatParcelizer extends Drawable.ConstantState {
        private final Drawable.ConstantState a;

        public RemoteActionCompatParcelizer(Drawable.ConstantState constantState) {
            this.a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            getTranslateY gettranslatey = new getTranslateY();
            gettranslatey.a = this.a.newDrawable();
            gettranslatey.a.setCallback(gettranslatey.b);
            return gettranslatey;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            getTranslateY gettranslatey = new getTranslateY();
            gettranslatey.a = this.a.newDrawable(resources);
            gettranslatey.a.setCallback(gettranslatey.b);
            return gettranslatey;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            getTranslateY gettranslatey = new getTranslateY();
            gettranslatey.a = this.a.newDrawable(resources, theme);
            gettranslatey.a.setCallback(gettranslatey.b);
            return gettranslatey;
        }
    }

    /* loaded from: classes-dex2jar.jar:o/getTranslateY$read.class */
    public static class read extends Drawable.ConstantState {
        AnimatorSet a;
        ArrayList<Animator> b;
        int c;
        setThumbTextPadding<Animator, String> d;
        setTranslateX e;

        public read(Context context, read read, Drawable.Callback callback, Resources resources) {
            if (read != null) {
                this.c = read.c;
                setTranslateX settranslatex = read.e;
                if (settranslatex != null) {
                    Drawable.ConstantState constantState = settranslatex.getConstantState();
                    if (resources != null) {
                        this.e = (setTranslateX) constantState.newDrawable(resources);
                    } else {
                        this.e = (setTranslateX) constantState.newDrawable();
                    }
                    setTranslateX settranslatex2 = (setTranslateX) this.e.mutate();
                    this.e = settranslatex2;
                    settranslatex2.setCallback(callback);
                    this.e.setBounds(read.e.getBounds());
                    this.e.e(false);
                }
                ArrayList<Animator> arrayList = read.b;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.b = new ArrayList<>(size);
                    this.d = new setThumbTextPadding<>(size);
                    for (int i = 0; i < size; i++) {
                        Animator animator = read.b.get(i);
                        Animator clone = animator.clone();
                        String str = read.d.get(animator);
                        clone.setTarget(this.e.d(str));
                        this.b.add(clone);
                        this.d.put(clone, str);
                    }
                    b();
                }
            }
        }

        public void b() {
            if (this.a == null) {
                this.a = new AnimatorSet();
            }
            this.a.playTogether(this.b);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.c;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    getTranslateY() {
        this(null, null, null);
    }

    private getTranslateY(Context context) {
        this(context, null, null);
    }

    private getTranslateY(Context context, read read2, Resources resources) {
        this.j = null;
        this.c = null;
        this.d = null;
        AnonymousClass2 r0 = new Drawable.Callback() { // from class: o.getTranslateY.2
            @Override // android.graphics.drawable.Drawable.Callback
            public void invalidateDrawable(Drawable drawable) {
                getTranslateY.this.invalidateSelf();
            }

            @Override // android.graphics.drawable.Drawable.Callback
            public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
                getTranslateY.this.scheduleSelf(runnable, j);
            }

            @Override // android.graphics.drawable.Drawable.Callback
            public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
                getTranslateY.this.unscheduleSelf(runnable);
            }
        };
        this.b = r0;
        this.f = context;
        if (read2 != null) {
            this.e = read2;
        } else {
            this.e = new read(context, read2, r0, resources);
        }
    }

    private void a(String str, Animator animator) {
        animator.setTarget(this.e.e.d(str));
        if (this.e.b == null) {
            this.e.b = new ArrayList<>();
            this.e.d = new setThumbTextPadding<>();
        }
        this.e.b.add(animator);
        this.e.d.put(animator, str);
    }

    public static getTranslateY e(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        getTranslateY gettranslatey = new getTranslateY(context);
        gettranslatey.inflate(resources, xmlPullParser, attributeSet, theme);
        return gettranslatey;
    }

    @Override // o.getScaleY, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        if (this.a != null) {
            getInsetsForType.c(this.a, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        if (this.a != null) {
            return getInsetsForType.b(this.a);
        }
        return false;
    }

    @Override // o.getScaleY, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        clearColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.a != null) {
            this.a.draw(canvas);
            return;
        }
        this.e.e.draw(canvas);
        if (this.e.a.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.a != null ? getInsetsForType.a(this.a) : this.e.e.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return this.a != null ? this.a.getChangingConfigurations() : getChangingConfigurations() | this.e.c;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.a != null ? getInsetsForType.e(this.a) : this.e.e.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.a == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new RemoteActionCompatParcelizer(this.a.getConstantState());
    }

    @Override // o.getScaleY, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.a != null ? this.a.getIntrinsicHeight() : this.e.e.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.a != null ? this.a.getIntrinsicWidth() : this.e.e.getIntrinsicWidth();
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
        return this.a != null ? this.a.getOpacity() : this.e.e.getOpacity();
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
        inflate(resources, xmlPullParser, attributeSet, null);
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        if (this.a != null) {
            getInsetsForType.e(this.a, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth();
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth + 1 || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    int[] iArr = getRotation.b;
                    TypedArray obtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
                    int resourceId = obtainAttributes.getResourceId(0, 0);
                    if (resourceId != 0) {
                        setTranslateX d = setTranslateX.d(resources, resourceId, theme);
                        d.e(false);
                        d.setCallback(this.b);
                        if (this.e.e != null) {
                            this.e.e.setCallback(null);
                        }
                        this.e.e = d;
                    }
                    obtainAttributes.recycle();
                } else if ("target".equals(name)) {
                    TypedArray obtainAttributes2 = resources.obtainAttributes(attributeSet, getRotation.a);
                    String string = obtainAttributes2.getString(0);
                    int resourceId2 = obtainAttributes2.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f;
                        if (context != null) {
                            a(string, setPivotX.c(context, resourceId2));
                        } else {
                            obtainAttributes2.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                    }
                    obtainAttributes2.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        this.e.b();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return this.a != null ? getInsetsForType.f(this.a) : this.e.e.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.a != null ? ((AnimatedVectorDrawable) this.a).isRunning() : this.e.a.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return this.a != null ? this.a.isStateful() : this.e.e.isStateful();
    }

    @Override // o.getScaleY, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (this.a != null) {
            this.a.mutate();
        }
        return this;
    }

    @Override // o.getScaleY, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        if (this.a != null) {
            this.a.setBounds(rect);
        } else {
            this.e.e.setBounds(rect);
        }
    }

    @Override // o.getScaleY, android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i) {
        return this.a != null ? this.a.setLevel(i) : this.e.e.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        return this.a != null ? this.a.setState(iArr) : this.e.e.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.a != null) {
            this.a.setAlpha(i);
        } else {
            this.e.e.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        if (this.a != null) {
            getInsetsForType.d(this.a, z);
        } else {
            this.e.e.setAutoMirrored(z);
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
        } else {
            this.e.e.setColorFilter(colorFilter);
        }
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
            this.e.e.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        if (this.a != null) {
            getInsetsForType.e(this.a, colorStateList);
        } else {
            this.e.e.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        if (this.a != null) {
            getInsetsForType.d(this.a, mode);
        } else {
            this.e.e.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        if (this.a != null) {
            return this.a.setVisible(z, z2);
        }
        this.e.e.setVisible(z, z2);
        return setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        if (this.a != null) {
            ((AnimatedVectorDrawable) this.a).start();
        } else if (!this.e.a.isStarted()) {
            this.e.a.start();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        if (this.a != null) {
            ((AnimatedVectorDrawable) this.a).stop();
        } else {
            this.e.a.end();
        }
    }
}
