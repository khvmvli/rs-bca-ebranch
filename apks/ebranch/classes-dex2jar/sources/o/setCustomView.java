package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import o.setHasDecor;
/* loaded from: classes-dex2jar.jar:o/setCustomView.class */
public final class setCustomView extends Drawable {
    private static final float c = (float) Math.toRadians(45.0d);
    public float a;
    private float b;
    private float d;
    private float g;
    private float h;
    private float i;
    private final Paint j;
    private final int n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f215o;
    private final Path m = new Path();
    public boolean e = false;
    private int f = 2;

    public setCustomView(Context context) {
        Paint paint = new Paint();
        this.j = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.MITER);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, setHasDecor$MediaBrowserCompat$MediaItem.aW, setHasDecor$MediaBrowserCompat$CustomActionResultReceiver.B, setHasDecor.MediaDescriptionCompat.e);
        int color = obtainStyledAttributes.getColor(setHasDecor$MediaBrowserCompat$MediaItem.be, 0);
        if (color != this.j.getColor()) {
            this.j.setColor(color);
            invalidateSelf();
        }
        float dimension = obtainStyledAttributes.getDimension(setHasDecor$MediaBrowserCompat$MediaItem.bk, 0.0f);
        if (this.j.getStrokeWidth() != dimension) {
            this.j.setStrokeWidth(dimension);
            this.i = (float) (((double) (dimension / 2.0f)) * Math.cos((double) c));
            invalidateSelf();
        }
        boolean z = obtainStyledAttributes.getBoolean(setHasDecor$MediaBrowserCompat$MediaItem.bf, true);
        if (this.f215o != z) {
            this.f215o = z;
            invalidateSelf();
        }
        float round = (float) Math.round(obtainStyledAttributes.getDimension(setHasDecor$MediaBrowserCompat$MediaItem.bb, 0.0f));
        if (round != this.h) {
            this.h = round;
            invalidateSelf();
        }
        this.n = obtainStyledAttributes.getDimensionPixelSize(setHasDecor$MediaBrowserCompat$MediaItem.bc, 0);
        this.g = (float) Math.round(obtainStyledAttributes.getDimension(setHasDecor$MediaBrowserCompat$MediaItem.bd, 0.0f));
        this.b = (float) Math.round(obtainStyledAttributes.getDimension(setHasDecor$MediaBrowserCompat$MediaItem.aX, 0.0f));
        this.d = obtainStyledAttributes.getDimension(setHasDecor$MediaBrowserCompat$MediaItem.ba, 0.0f);
        obtainStyledAttributes.recycle();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
        if (o.getInsetsForType.c(r6) == 0) goto L_0x003c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002b, code lost:
        if (o.getInsetsForType.c(r6) == 1) goto L_0x003c;
     */
    @Override // android.graphics.drawable.Drawable
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final void draw(android.graphics.Canvas r7) {
        /*
        // Method dump skipped, instructions count: 493
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setCustomView.draw(android.graphics.Canvas):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.n;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.n;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (i != this.j.getAlpha()) {
            this.j.setAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.j.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
