package o;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;
/* loaded from: classes2-dex2jar.jar:o/CategoryListDialog_ViewBinding.class */
public final class CategoryListDialog_ViewBinding {
    public static final int c = 2;
    public final Paint a;
    public final View b;
    public Drawable d;
    public final RemoteActionCompatParcelizer e;
    private boolean h;
    private boolean i;
    private DeleteAccountFailedDialog$MediaBrowserCompat$CustomActionResultReceiver j;
    private final Path g = new Path();
    private final Paint f = new Paint(7);

    /* loaded from: classes2-dex2jar.jar:o/CategoryListDialog_ViewBinding$RemoteActionCompatParcelizer.class */
    public interface RemoteActionCompatParcelizer {
        boolean b();

        void e(Canvas canvas);
    }

    public CategoryListDialog_ViewBinding(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        this.e = remoteActionCompatParcelizer;
        View view = (View) remoteActionCompatParcelizer;
        this.b = view;
        view.setWillNotDraw(false);
        Paint paint = new Paint(1);
        this.a = paint;
        paint.setColor(0);
    }

    private float a(DeleteAccountFailedDialog$MediaBrowserCompat$CustomActionResultReceiver deleteAccountFailedDialog$MediaBrowserCompat$CustomActionResultReceiver) {
        return HaloBCADialog_ViewBinding.a(deleteAccountFailedDialog$MediaBrowserCompat$CustomActionResultReceiver.b, deleteAccountFailedDialog$MediaBrowserCompat$CustomActionResultReceiver.a, 0.0f, 0.0f, (float) this.b.getWidth(), (float) this.b.getHeight());
    }

    private void d(Canvas canvas) {
        if ((this.h || this.d == null || this.j == null) ? false : true) {
            Rect bounds = this.d.getBounds();
            float width = this.j.b - (((float) bounds.width()) / 2.0f);
            float height = this.j.a - (((float) bounds.height()) / 2.0f);
            canvas.translate(width, height);
            this.d.draw(canvas);
            canvas.translate(-width, -height);
        }
    }

    private void e() {
        if (c == 1) {
            this.g.rewind();
            DeleteAccountFailedDialog$MediaBrowserCompat$CustomActionResultReceiver deleteAccountFailedDialog$MediaBrowserCompat$CustomActionResultReceiver = this.j;
            if (deleteAccountFailedDialog$MediaBrowserCompat$CustomActionResultReceiver != null) {
                this.g.addCircle(deleteAccountFailedDialog$MediaBrowserCompat$CustomActionResultReceiver.b, this.j.a, this.j.e, Path.Direction.CW);
            }
        }
        this.b.invalidate();
    }

    public final DeleteAccountFailedDialog$MediaBrowserCompat$CustomActionResultReceiver a() {
        DeleteAccountFailedDialog$MediaBrowserCompat$CustomActionResultReceiver deleteAccountFailedDialog$MediaBrowserCompat$CustomActionResultReceiver = this.j;
        if (deleteAccountFailedDialog$MediaBrowserCompat$CustomActionResultReceiver == null) {
            return null;
        }
        DeleteAccountFailedDialog$MediaBrowserCompat$CustomActionResultReceiver deleteAccountFailedDialog$MediaBrowserCompat$CustomActionResultReceiver2 = new DeleteAccountFailedDialog$MediaBrowserCompat$CustomActionResultReceiver(deleteAccountFailedDialog$MediaBrowserCompat$CustomActionResultReceiver);
        if (deleteAccountFailedDialog$MediaBrowserCompat$CustomActionResultReceiver2.e == Float.MAX_VALUE) {
            deleteAccountFailedDialog$MediaBrowserCompat$CustomActionResultReceiver2.e = a(deleteAccountFailedDialog$MediaBrowserCompat$CustomActionResultReceiver2);
        }
        return deleteAccountFailedDialog$MediaBrowserCompat$CustomActionResultReceiver2;
    }

    public final void b() {
        if (c == 0) {
            this.i = false;
            this.b.destroyDrawingCache();
            this.f.setShader(null);
            this.b.invalidate();
        }
    }

    public final void c() {
        if (c == 0) {
            this.h = true;
            this.i = false;
            this.b.buildDrawingCache();
            Bitmap drawingCache = this.b.getDrawingCache();
            Bitmap bitmap = drawingCache;
            if (drawingCache == null) {
                bitmap = drawingCache;
                if (this.b.getWidth() != 0) {
                    bitmap = drawingCache;
                    if (this.b.getHeight() != 0) {
                        bitmap = Bitmap.createBitmap(this.b.getWidth(), this.b.getHeight(), Bitmap.Config.ARGB_8888);
                        this.b.draw(new Canvas(bitmap));
                    }
                }
            }
            if (bitmap != null) {
                Paint paint = this.f;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
            }
            this.h = false;
            this.i = true;
        }
    }

    public final void c(Canvas canvas) {
        if (d()) {
            int i = c;
            if (i == 0) {
                canvas.drawCircle(this.j.b, this.j.a, this.j.e, this.f);
                boolean z = false;
                if (!this.h) {
                    z = false;
                    if (Color.alpha(this.a.getColor()) != 0) {
                        z = true;
                    }
                }
                if (z) {
                    canvas.drawCircle(this.j.b, this.j.a, this.j.e, this.a);
                }
            } else if (i == 1) {
                int save = canvas.save();
                canvas.clipPath(this.g);
                this.e.e(canvas);
                boolean z2 = false;
                if (!this.h) {
                    z2 = false;
                    if (Color.alpha(this.a.getColor()) != 0) {
                        z2 = true;
                    }
                }
                if (z2) {
                    canvas.drawRect(0.0f, 0.0f, (float) this.b.getWidth(), (float) this.b.getHeight(), this.a);
                }
                canvas.restoreToCount(save);
            } else if (i == 2) {
                this.e.e(canvas);
                boolean z3 = false;
                if (!this.h) {
                    z3 = false;
                    if (Color.alpha(this.a.getColor()) != 0) {
                        z3 = true;
                    }
                }
                if (z3) {
                    canvas.drawRect(0.0f, 0.0f, (float) this.b.getWidth(), (float) this.b.getHeight(), this.a);
                }
            } else {
                StringBuilder sb = new StringBuilder("Unsupported strategy ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
        } else {
            this.e.e(canvas);
            boolean z4 = false;
            if (!this.h) {
                z4 = false;
                if (Color.alpha(this.a.getColor()) != 0) {
                    z4 = true;
                }
            }
            if (z4) {
                canvas.drawRect(0.0f, 0.0f, (float) this.b.getWidth(), (float) this.b.getHeight(), this.a);
            }
        }
        d(canvas);
    }

    public final void d(DeleteAccountFailedDialog$MediaBrowserCompat$CustomActionResultReceiver deleteAccountFailedDialog$MediaBrowserCompat$CustomActionResultReceiver) {
        if (deleteAccountFailedDialog$MediaBrowserCompat$CustomActionResultReceiver == null) {
            this.j = null;
        } else {
            DeleteAccountFailedDialog$MediaBrowserCompat$CustomActionResultReceiver deleteAccountFailedDialog$MediaBrowserCompat$CustomActionResultReceiver2 = this.j;
            if (deleteAccountFailedDialog$MediaBrowserCompat$CustomActionResultReceiver2 == null) {
                this.j = new DeleteAccountFailedDialog$MediaBrowserCompat$CustomActionResultReceiver(deleteAccountFailedDialog$MediaBrowserCompat$CustomActionResultReceiver);
            } else {
                float f = deleteAccountFailedDialog$MediaBrowserCompat$CustomActionResultReceiver.b;
                float f2 = deleteAccountFailedDialog$MediaBrowserCompat$CustomActionResultReceiver.a;
                float f3 = deleteAccountFailedDialog$MediaBrowserCompat$CustomActionResultReceiver.e;
                deleteAccountFailedDialog$MediaBrowserCompat$CustomActionResultReceiver2.b = f;
                deleteAccountFailedDialog$MediaBrowserCompat$CustomActionResultReceiver2.a = f2;
                deleteAccountFailedDialog$MediaBrowserCompat$CustomActionResultReceiver2.e = f3;
            }
            if (deleteAccountFailedDialog$MediaBrowserCompat$CustomActionResultReceiver.e + 1.0E-4f >= a(deleteAccountFailedDialog$MediaBrowserCompat$CustomActionResultReceiver)) {
                this.j.e = Float.MAX_VALUE;
            }
        }
        e();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0044  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public boolean d() {
        /*
            r3 = this;
            r0 = r3
            o.DeleteAccountFailedDialog$MediaBrowserCompat$CustomActionResultReceiver r0 = r0.j
            r4 = r0
            r0 = 0
            r5 = r0
            r0 = r4
            if (r0 == 0) goto L_0x0025
            r0 = r4
            float r0 = r0.e
            r1 = 2139095039(0x7f7fffff, float:3.4028235E38)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x001a
            r0 = 1
            r6 = r0
            goto L_0x001c
        L_0x001a:
            r0 = 0
            r6 = r0
        L_0x001c:
            r0 = r6
            if (r0 != 0) goto L_0x0025
            r0 = 0
            r6 = r0
            goto L_0x0027
        L_0x0025:
            r0 = 1
            r6 = r0
        L_0x0027:
            int r0 = o.CategoryListDialog_ViewBinding.c
            if (r0 != 0) goto L_0x0044
            r0 = r5
            r7 = r0
            r0 = r6
            if (r0 != 0) goto L_0x0041
            r0 = r5
            r7 = r0
            r0 = r3
            boolean r0 = r0.i
            if (r0 == 0) goto L_0x0041
            r0 = 1
            r7 = r0
        L_0x0041:
            r0 = r7
            return r0
        L_0x0044:
            r0 = r6
            r1 = 1
            r0 = r0 ^ r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.CategoryListDialog_ViewBinding.d():boolean");
    }
}
