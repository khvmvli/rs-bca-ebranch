package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import java.lang.ref.WeakReference;
import o.SearchView;
import o.setHasDecor;
/* loaded from: classes-dex2jar.jar:o/setImageResource.class */
public final class setImageResource {
    private static setImageResource d;
    private static final PorterDuff.Mode e = PorterDuff.Mode.SRC_IN;
    private SearchView b;

    public static void b() {
        synchronized (setImageResource.class) {
            try {
                if (d == null) {
                    setImageResource setimageresource = new setImageResource();
                    d = setimageresource;
                    setimageresource.b = SearchView.e();
                    SearchView searchView = d.b;
                    AnonymousClass2 r0 = new SearchView.MediaDescriptionCompat() { // from class: o.setImageResource.2
                        private final int[] b = {setHasDecor.RemoteActionCompatParcelizer.S, setHasDecor.RemoteActionCompatParcelizer.P, setHasDecor.RemoteActionCompatParcelizer.d};
                        private final int[] d = {setHasDecor.RemoteActionCompatParcelizer.l, setHasDecor.RemoteActionCompatParcelizer.A, setHasDecor.RemoteActionCompatParcelizer.q, setHasDecor.RemoteActionCompatParcelizer.k, setHasDecor.RemoteActionCompatParcelizer.r, setHasDecor.RemoteActionCompatParcelizer.t, setHasDecor.RemoteActionCompatParcelizer.s};
                        private final int[] c = {setHasDecor.RemoteActionCompatParcelizer.J, setHasDecor.RemoteActionCompatParcelizer.R, setHasDecor.RemoteActionCompatParcelizer.n, setHasDecor.RemoteActionCompatParcelizer.L, setHasDecor.RemoteActionCompatParcelizer.K, setHasDecor.RemoteActionCompatParcelizer.M, setHasDecor.RemoteActionCompatParcelizer.N};
                        private final int[] e = {setHasDecor.RemoteActionCompatParcelizer.y, setHasDecor.RemoteActionCompatParcelizer.j, setHasDecor.RemoteActionCompatParcelizer.u};
                        private final int[] j = {setHasDecor.RemoteActionCompatParcelizer.F, setHasDecor.RemoteActionCompatParcelizer.Q};
                        private final int[] a = {setHasDecor.RemoteActionCompatParcelizer.a, setHasDecor.RemoteActionCompatParcelizer.g, setHasDecor.RemoteActionCompatParcelizer.c, setHasDecor.RemoteActionCompatParcelizer.i};

                        private ColorStateList a(Context context) {
                            return b(context, setOnCloseListener.a(context, setHasDecor$MediaBrowserCompat$CustomActionResultReceiver.y));
                        }

                        private LayerDrawable a(SearchView searchView2, Context context, int i) {
                            BitmapDrawable bitmapDrawable;
                            BitmapDrawable bitmapDrawable2;
                            BitmapDrawable bitmapDrawable3;
                            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
                            Drawable c = searchView2.c(context, setHasDecor.RemoteActionCompatParcelizer.E);
                            Drawable c2 = searchView2.c(context, setHasDecor.RemoteActionCompatParcelizer.G);
                            if ((c instanceof BitmapDrawable) && c.getIntrinsicWidth() == dimensionPixelSize && c.getIntrinsicHeight() == dimensionPixelSize) {
                                bitmapDrawable = (BitmapDrawable) c;
                                bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
                            } else {
                                Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                                Canvas canvas = new Canvas(createBitmap);
                                c.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                                c.draw(canvas);
                                bitmapDrawable = new BitmapDrawable(createBitmap);
                                bitmapDrawable2 = new BitmapDrawable(createBitmap);
                            }
                            bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
                            if ((c2 instanceof BitmapDrawable) && c2.getIntrinsicWidth() == dimensionPixelSize && c2.getIntrinsicHeight() == dimensionPixelSize) {
                                bitmapDrawable3 = (BitmapDrawable) c2;
                            } else {
                                Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                                Canvas canvas2 = new Canvas(createBitmap2);
                                c2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                                c2.draw(canvas2);
                                bitmapDrawable3 = new BitmapDrawable(createBitmap2);
                            }
                            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
                            layerDrawable.setId(0, 16908288);
                            layerDrawable.setId(1, 16908303);
                            layerDrawable.setId(2, 16908301);
                            return layerDrawable;
                        }

                        private void a(Drawable drawable, int i, PorterDuff.Mode mode) {
                            Drawable drawable2 = drawable;
                            if (setOnFitSystemWindowsListener.c(drawable)) {
                                drawable2 = drawable.mutate();
                            }
                            PorterDuff.Mode mode2 = mode;
                            if (mode == null) {
                                mode2 = setImageResource.e;
                            }
                            drawable2.setColorFilter(setImageResource.d(i, mode2));
                        }

                        private ColorStateList b(Context context) {
                            return b(context, 0);
                        }

                        private ColorStateList b(Context context, int i) {
                            int a = setOnCloseListener.a(context, setHasDecor$MediaBrowserCompat$CustomActionResultReceiver.v);
                            int c = setOnCloseListener.c(context, setHasDecor$MediaBrowserCompat$CustomActionResultReceiver.y);
                            int[] iArr = setOnCloseListener.b;
                            int[] iArr2 = setOnCloseListener.j;
                            int a2 = isRound.a(a, i);
                            return new ColorStateList(new int[][]{iArr, iArr2, setOnCloseListener.a, setOnCloseListener.e}, new int[]{c, a2, isRound.a(a, i), i});
                        }

                        private ColorStateList d(Context context) {
                            int[][] iArr = new int[3];
                            int[] iArr2 = new int[3];
                            ColorStateList e2 = setOnCloseListener.e(context, setHasDecor$MediaBrowserCompat$CustomActionResultReceiver.A);
                            if (e2 == null || !e2.isStateful()) {
                                iArr[0] = setOnCloseListener.b;
                                iArr2[0] = setOnCloseListener.c(context, setHasDecor$MediaBrowserCompat$CustomActionResultReceiver.A);
                                iArr[1] = setOnCloseListener.c;
                                iArr2[1] = setOnCloseListener.a(context, setHasDecor$MediaBrowserCompat$CustomActionResultReceiver.w);
                                iArr[2] = setOnCloseListener.e;
                                iArr2[2] = setOnCloseListener.a(context, setHasDecor$MediaBrowserCompat$CustomActionResultReceiver.A);
                            } else {
                                int[] iArr3 = setOnCloseListener.b;
                                iArr[0] = iArr3;
                                iArr2[0] = e2.getColorForState(iArr3, 0);
                                iArr[1] = setOnCloseListener.c;
                                iArr2[1] = setOnCloseListener.a(context, setHasDecor$MediaBrowserCompat$CustomActionResultReceiver.w);
                                iArr[2] = setOnCloseListener.e;
                                iArr2[2] = e2.getDefaultColor();
                            }
                            return new ColorStateList(iArr, iArr2);
                        }

                        private ColorStateList e(Context context) {
                            return b(context, setOnCloseListener.a(context, setHasDecor$MediaBrowserCompat$CustomActionResultReceiver.t));
                        }

                        private boolean e(int[] iArr, int i) {
                            for (int i2 : iArr) {
                                if (i2 == i) {
                                    return true;
                                }
                            }
                            return false;
                        }

                        @Override // o.SearchView.MediaDescriptionCompat
                        public ColorStateList a(Context context, int i) {
                            if (i == setHasDecor.RemoteActionCompatParcelizer.f234o) {
                                return setPrimaryBackground.b(context, setHasDecor.read.d);
                            }
                            if (i == setHasDecor.RemoteActionCompatParcelizer.H) {
                                return setPrimaryBackground.b(context, setHasDecor.read.i);
                            }
                            if (i == setHasDecor.RemoteActionCompatParcelizer.I) {
                                return d(context);
                            }
                            if (i == setHasDecor.RemoteActionCompatParcelizer.h) {
                                return a(context);
                            }
                            if (i == setHasDecor.RemoteActionCompatParcelizer.b) {
                                return b(context);
                            }
                            if (i == setHasDecor.RemoteActionCompatParcelizer.e) {
                                return e(context);
                            }
                            if (i == setHasDecor.RemoteActionCompatParcelizer.z || i == setHasDecor.RemoteActionCompatParcelizer.B) {
                                return setPrimaryBackground.b(context, setHasDecor.read.f);
                            }
                            if (e(this.d, i)) {
                                return setOnCloseListener.e(context, setHasDecor$MediaBrowserCompat$CustomActionResultReceiver.u);
                            }
                            if (e(this.j, i)) {
                                return setPrimaryBackground.b(context, setHasDecor.read.b);
                            }
                            if (e(this.a, i)) {
                                return setPrimaryBackground.b(context, setHasDecor.read.e);
                            }
                            if (i == setHasDecor.RemoteActionCompatParcelizer.D) {
                                return setPrimaryBackground.b(context, setHasDecor.read.j);
                            }
                            return null;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:22:0x0086  */
                        /* JADX WARN: Removed duplicated region for block: B:29:0x00b4 A[RETURN] */
                        @Override // o.SearchView.MediaDescriptionCompat
                        /* Code decompiled incorrectly, please refer to instructions dump */
                        public boolean a(android.content.Context r5, int r6, android.graphics.drawable.Drawable r7) {
                            /*
                                r4 = this;
                                android.graphics.PorterDuff$Mode r0 = o.setImageResource.e()
                                r8 = r0
                                r0 = r4
                                r1 = r4
                                int[] r1 = r1.b
                                r2 = r6
                                boolean r0 = r0.e(r1, r2)
                                if (r0 == 0) goto L_0x0018
                                int r0 = o.setHasDecor$MediaBrowserCompat$CustomActionResultReceiver.u
                                r6 = r0
                                goto L_0x0073
                            L_0x0018:
                                r0 = r4
                                r1 = r4
                                int[] r1 = r1.c
                                r2 = r6
                                boolean r0 = r0.e(r1, r2)
                                if (r0 == 0) goto L_0x002b
                                int r0 = o.setHasDecor$MediaBrowserCompat$CustomActionResultReceiver.w
                                r6 = r0
                                goto L_0x0073
                            L_0x002b:
                                r0 = r4
                                r1 = r4
                                int[] r1 = r1.e
                                r2 = r6
                                boolean r0 = r0.e(r1, r2)
                                if (r0 == 0) goto L_0x003f
                                android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
                                r9 = r0
                                goto L_0x006b
                            L_0x003f:
                                r0 = r6
                                int r1 = o.setHasDecor.RemoteActionCompatParcelizer.p
                                if (r0 != r1) goto L_0x0055
                                r0 = 1109603123(0x42233333, float:40.8)
                                int r0 = java.lang.Math.round(r0)
                                r10 = r0
                                r0 = 16842800(0x1010030, float:2.3693693E-38)
                                r6 = r0
                                goto L_0x0076
                            L_0x0055:
                                r0 = r8
                                r9 = r0
                                r0 = r6
                                int r1 = o.setHasDecor.RemoteActionCompatParcelizer.m
                                if (r0 == r1) goto L_0x006b
                                r0 = -1
                                r11 = r0
                                r0 = 0
                                r6 = r0
                                r0 = 0
                                r10 = r0
                                goto L_0x0081
                            L_0x006b:
                                r0 = 16842801(0x1010031, float:2.3693695E-38)
                                r6 = r0
                                r0 = r9
                                r8 = r0
                            L_0x0073:
                                r0 = -1
                                r10 = r0
                            L_0x0076:
                                r0 = 1
                                r12 = r0
                                r0 = r10
                                r11 = r0
                                r0 = r12
                                r10 = r0
                            L_0x0081:
                                r0 = r10
                                if (r0 == 0) goto L_0x00b4
                                r0 = r7
                                r9 = r0
                                r0 = r7
                                boolean r0 = o.setOnFitSystemWindowsListener.c(r0)
                                if (r0 == 0) goto L_0x0096
                                r0 = r7
                                android.graphics.drawable.Drawable r0 = r0.mutate()
                                r9 = r0
                            L_0x0096:
                                r0 = r9
                                r1 = r5
                                r2 = r6
                                int r1 = o.setOnCloseListener.a(r1, r2)
                                r2 = r8
                                android.graphics.PorterDuffColorFilter r1 = o.setImageResource.d(r1, r2)
                                r0.setColorFilter(r1)
                                r0 = r11
                                r1 = -1
                                if (r0 == r1) goto L_0x00b2
                                r0 = r9
                                r1 = r11
                                r0.setAlpha(r1)
                            L_0x00b2:
                                r0 = 1
                                return r0
                            L_0x00b4:
                                r0 = 0
                                return r0
                            */
                            throw new UnsupportedOperationException("Method not decompiled: o.setImageResource.AnonymousClass2.a(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
                        }

                        @Override // o.SearchView.MediaDescriptionCompat
                        public Drawable c(SearchView searchView2, Context context, int i) {
                            if (i == setHasDecor.RemoteActionCompatParcelizer.f) {
                                return new LayerDrawable(new Drawable[]{searchView2.c(context, setHasDecor.RemoteActionCompatParcelizer.j), searchView2.c(context, setHasDecor.RemoteActionCompatParcelizer.n)});
                            }
                            if (i == setHasDecor.RemoteActionCompatParcelizer.v) {
                                return a(searchView2, context, setHasDecor.write.i);
                            }
                            if (i == setHasDecor.RemoteActionCompatParcelizer.w) {
                                return a(searchView2, context, setHasDecor.write.g);
                            }
                            if (i == setHasDecor.RemoteActionCompatParcelizer.x) {
                                return a(searchView2, context, setHasDecor.write.f235o);
                            }
                            return null;
                        }

                        @Override // o.SearchView.MediaDescriptionCompat
                        public PorterDuff.Mode d(int i) {
                            return i == setHasDecor.RemoteActionCompatParcelizer.I ? PorterDuff.Mode.MULTIPLY : null;
                        }

                        @Override // o.SearchView.MediaDescriptionCompat
                        public boolean d(Context context, int i, Drawable drawable) {
                            if (i == setHasDecor.RemoteActionCompatParcelizer.C) {
                                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                                a(layerDrawable.findDrawableByLayerId(16908288), setOnCloseListener.a(context, setHasDecor$MediaBrowserCompat$CustomActionResultReceiver.u), setImageResource.e);
                                a(layerDrawable.findDrawableByLayerId(16908303), setOnCloseListener.a(context, setHasDecor$MediaBrowserCompat$CustomActionResultReceiver.u), setImageResource.e);
                                a(layerDrawable.findDrawableByLayerId(16908301), setOnCloseListener.a(context, setHasDecor$MediaBrowserCompat$CustomActionResultReceiver.w), setImageResource.e);
                                return true;
                            } else if (i != setHasDecor.RemoteActionCompatParcelizer.v && i != setHasDecor.RemoteActionCompatParcelizer.w && i != setHasDecor.RemoteActionCompatParcelizer.x) {
                                return false;
                            } else {
                                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                                a(layerDrawable2.findDrawableByLayerId(16908288), setOnCloseListener.c(context, setHasDecor$MediaBrowserCompat$CustomActionResultReceiver.u), setImageResource.e);
                                a(layerDrawable2.findDrawableByLayerId(16908303), setOnCloseListener.a(context, setHasDecor$MediaBrowserCompat$CustomActionResultReceiver.w), setImageResource.e);
                                a(layerDrawable2.findDrawableByLayerId(16908301), setOnCloseListener.a(context, setHasDecor$MediaBrowserCompat$CustomActionResultReceiver.w), setImageResource.e);
                                return true;
                            }
                        }
                    };
                    synchronized (searchView) {
                        searchView.e = r0;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static setImageResource c() {
        setImageResource setimageresource;
        synchronized (setImageResource.class) {
            try {
                if (d == null) {
                    b();
                }
                setimageresource = d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return setimageresource;
    }

    public static PorterDuffColorFilter d(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter d2;
        synchronized (setImageResource.class) {
            try {
                d2 = SearchView.d(i, mode);
            } catch (Throwable th) {
                throw th;
            }
        }
        return d2;
    }

    public static void e(Drawable drawable, setImeOptions setimeoptions, int[] iArr) {
        SearchView.b(drawable, setimeoptions, iArr);
    }

    public final Drawable b(Context context, int i) {
        Drawable c;
        synchronized (this) {
            c = this.b.c(context, i);
        }
        return c;
    }

    public final ColorStateList c(Context context, int i) {
        ColorStateList d2;
        synchronized (this) {
            d2 = this.b.d(context, i);
        }
        return d2;
    }

    public final Drawable c(Context context, int i, boolean z) {
        Drawable e2;
        synchronized (this) {
            e2 = this.b.e(context, i, z);
        }
        return e2;
    }

    public final void e(Context context) {
        synchronized (this) {
            SearchView searchView = this.b;
            synchronized (searchView) {
                setTrackDrawable<WeakReference<Drawable.ConstantState>> settrackdrawable = searchView.d.get(context);
                if (settrackdrawable != null) {
                    settrackdrawable.b();
                }
            }
        }
    }
}
