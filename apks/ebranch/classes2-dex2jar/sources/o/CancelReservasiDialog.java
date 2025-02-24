package o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import o.BaseDialogKotlin;
import o.GuestWarningDialog_ViewBinding;
import o.JenisPekerjaanDialog;
/* loaded from: classes2-dex2jar.jar:o/CancelReservasiDialog.class */
public final class CancelReservasiDialog extends Drawable implements GuestWarningDialog_ViewBinding.IconCompatParcelizer {
    private static final int b = BaseDialogKotlin.MediaDescriptionCompat.m;
    private static final int g = BaseDialogKotlin$MediaBrowserCompat$CustomActionResultReceiver.a;
    public WeakReference<FrameLayout> a;
    public int c;
    public final IconCompatParcelizer d;
    public final WeakReference<Context> e;
    private final Rect f;
    private WeakReference<View> h;
    private float i;
    private float j;
    private final float k;
    private float l;
    private float m;
    private final float n;

    /* renamed from: o  reason: collision with root package name */
    private final float f20o;
    private final JenisKodeBankDialog q;
    private final GuestWarningDialog_ViewBinding r;
    private float t;

    /* loaded from: classes2-dex2jar.jar:o/CancelReservasiDialog$IconCompatParcelizer.class */
    public static final class IconCompatParcelizer implements Parcelable {
        public static final Parcelable.Creator<IconCompatParcelizer> CREATOR = new Parcelable.Creator<IconCompatParcelizer>() { // from class: o.CancelReservasiDialog.IconCompatParcelizer.2
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ IconCompatParcelizer createFromParcel(Parcel parcel) {
                return new IconCompatParcelizer(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ IconCompatParcelizer[] newArray(int i) {
                return new IconCompatParcelizer[i];
            }
        };
        int a;
        int b;
        public int c;
        int d;
        int e;
        public CharSequence f;
        public int g;
        public int h;
        int i;
        int j;
        private boolean l;
        private int m;
        private int n;

        /* renamed from: o  reason: collision with root package name */
        private int f21o;

        protected IconCompatParcelizer(Parcel parcel) {
            this.d = 255;
            this.h = -1;
            this.m = parcel.readInt();
            this.n = parcel.readInt();
            this.d = parcel.readInt();
            this.h = parcel.readInt();
            this.f21o = parcel.readInt();
            this.f = parcel.readString();
            this.g = parcel.readInt();
            this.e = parcel.readInt();
            this.i = parcel.readInt();
            this.j = parcel.readInt();
            this.a = parcel.readInt();
            this.b = parcel.readInt();
            this.l = parcel.readInt() != 0;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.m);
            parcel.writeInt(this.n);
            parcel.writeInt(this.d);
            parcel.writeInt(this.h);
            parcel.writeInt(this.f21o);
            parcel.writeString(this.f.toString());
            parcel.writeInt(this.g);
            parcel.writeInt(this.e);
            parcel.writeInt(this.i);
            parcel.writeInt(this.j);
            parcel.writeInt(this.a);
            parcel.writeInt(this.b);
            parcel.writeInt(this.l ? 1 : 0);
        }
    }

    private String e() {
        boolean z = true;
        int i = 0;
        if ((!(this.d.h != -1) ? 0 : this.d.h) <= this.c) {
            NumberFormat instance = NumberFormat.getInstance();
            if (this.d.h == -1) {
                z = false;
            }
            if (z) {
                i = this.d.h;
            }
            return instance.format((long) i);
        }
        Context context = this.e.get();
        return context == null ? "" : context.getString(BaseDialogKotlin$MediaBrowserCompat$SearchResultReceiver.q, Integer.valueOf(this.c), "+");
    }

    public final int a() {
        if (!(this.d.h != -1)) {
            return 0;
        }
        return this.d.h;
    }

    public final void b(final View view, FrameLayout frameLayout) {
        float f;
        WeakReference<FrameLayout> weakReference;
        this.h = new WeakReference<>(view);
        if (!cancelReservationOnly.d || frameLayout != null) {
            this.a = new WeakReference<>(frameLayout);
        } else {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if ((viewGroup == null || viewGroup.getId() != BaseDialogKotlin$MediaBrowserCompat$ItemReceiver.I) && ((weakReference = this.a) == null || weakReference.get() != viewGroup)) {
                ViewGroup viewGroup2 = (ViewGroup) view.getParent();
                viewGroup2.setClipChildren(false);
                viewGroup2.setClipToPadding(false);
                final FrameLayout frameLayout2 = new FrameLayout(view.getContext());
                frameLayout2.setId(BaseDialogKotlin$MediaBrowserCompat$ItemReceiver.I);
                frameLayout2.setClipChildren(false);
                frameLayout2.setClipToPadding(false);
                frameLayout2.setLayoutParams(view.getLayoutParams());
                frameLayout2.setMinimumWidth(view.getWidth());
                frameLayout2.setMinimumHeight(view.getHeight());
                int indexOfChild = viewGroup.indexOfChild(view);
                viewGroup.removeViewAt(indexOfChild);
                view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                frameLayout2.addView(view);
                viewGroup.addView(frameLayout2, indexOfChild);
                this.a = new WeakReference<>(frameLayout2);
                frameLayout2.post(new Runnable() { // from class: o.CancelReservasiDialog.5
                    @Override // java.lang.Runnable
                    public final void run() {
                        CancelReservasiDialog.this.b(view, frameLayout2);
                    }
                });
            }
        }
        if (!cancelReservationOnly.d) {
            ViewGroup viewGroup3 = (ViewGroup) view.getParent();
            viewGroup3.setClipChildren(false);
            viewGroup3.setClipToPadding(false);
        }
        Context context = this.e.get();
        WeakReference<View> weakReference2 = this.h;
        FrameLayout frameLayout3 = null;
        View view2 = weakReference2 != null ? weakReference2.get() : null;
        if (!(context == null || view2 == null)) {
            Rect rect = new Rect();
            rect.set(this.f);
            Rect rect2 = new Rect();
            view2.getDrawingRect(rect2);
            WeakReference<FrameLayout> weakReference3 = this.a;
            if (weakReference3 != null) {
                frameLayout3 = weakReference3.get();
            }
            if (frameLayout3 != null || cancelReservationOnly.d) {
                ViewGroup viewGroup4 = frameLayout3;
                if (frameLayout3 == null) {
                    viewGroup4 = (ViewGroup) view2.getParent();
                }
                viewGroup4.offsetDescendantRectToMyCoords(view2, rect2);
            }
            int i = this.d.j + this.d.b;
            int i2 = this.d.e;
            if (i2 == 8388691 || i2 == 8388693) {
                this.j = (float) (rect2.bottom - i);
            } else {
                this.j = (float) (rect2.top + i);
            }
            boolean z = true;
            if (a() <= 9) {
                float f2 = !(this.d.h != -1) ? this.n : this.k;
                this.m = f2;
                this.l = f2;
                this.t = f2;
            } else {
                float f3 = this.k;
                this.m = f3;
                this.l = f3;
                String e = e();
                GuestWarningDialog_ViewBinding guestWarningDialog_ViewBinding = this.r;
                if (!guestWarningDialog_ViewBinding.j) {
                    f = guestWarningDialog_ViewBinding.c;
                } else {
                    f = e == null ? 0.0f : guestWarningDialog_ViewBinding.e.measureText((CharSequence) e, 0, e.length());
                    guestWarningDialog_ViewBinding.c = f;
                    guestWarningDialog_ViewBinding.j = false;
                }
                this.t = (f / 2.0f) + this.f20o;
            }
            Resources resources = context.getResources();
            if (this.d.h == -1) {
                z = false;
            }
            int dimensionPixelSize = resources.getDimensionPixelSize(z ? BaseDialogKotlin.read.H : BaseDialogKotlin.read.I);
            int i3 = this.d.i + this.d.a;
            int i4 = this.d.e;
            if (i4 == 8388659 || i4 == 8388691) {
                this.i = findFragmentByWho.k(view2) == 0 ? (((float) rect2.left) - this.t) + ((float) dimensionPixelSize) + ((float) i3) : ((((float) rect2.right) + this.t) - ((float) dimensionPixelSize)) - ((float) i3);
            } else {
                this.i = findFragmentByWho.k(view2) == 0 ? ((((float) rect2.right) + this.t) - ((float) dimensionPixelSize)) - ((float) i3) : (((float) rect2.left) - this.t) + ((float) dimensionPixelSize) + ((float) i3);
            }
            Rect rect3 = this.f;
            float f4 = this.i;
            float f5 = this.j;
            float f6 = this.t;
            float f7 = this.l;
            rect3.set((int) (f4 - f6), (int) (f5 - f7), (int) (f4 + f6), (int) (f5 + f7));
            JenisKodeBankDialog jenisKodeBankDialog = this.q;
            float f8 = this.m;
            JenisPekerjaanDialog.RemoteActionCompatParcelizer remoteActionCompatParcelizer = new JenisPekerjaanDialog.RemoteActionCompatParcelizer(jenisKodeBankDialog.F.l);
            remoteActionCompatParcelizer.i = new InfoTarikanDialog_ViewBinding(f8);
            remoteActionCompatParcelizer.k = new InfoTarikanDialog_ViewBinding(f8);
            remoteActionCompatParcelizer.e = new InfoTarikanDialog_ViewBinding(f8);
            remoteActionCompatParcelizer.b = new InfoTarikanDialog_ViewBinding(f8);
            jenisKodeBankDialog.setShapeAppearanceModel(new JenisPekerjaanDialog(remoteActionCompatParcelizer, (byte) 0));
            if (!rect.equals(this.f)) {
                this.q.setBounds(this.f);
            }
        }
        invalidateSelf();
    }

    @Override // o.GuestWarningDialog_ViewBinding.IconCompatParcelizer
    public final void d() {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (!getBounds().isEmpty() && getAlpha() != 0 && isVisible()) {
            this.q.draw(canvas);
            if (this.d.h != -1) {
                Rect rect = new Rect();
                String e = e();
                this.r.e.getTextBounds(e, 0, e.length(), rect);
                canvas.drawText(e, this.i, this.j + ((float) (rect.height() / 2)), this.r.e);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.d.d;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return false;
    }

    @Override // android.graphics.drawable.Drawable, o.GuestWarningDialog_ViewBinding.IconCompatParcelizer
    public final boolean onStateChange(int[] iArr) {
        return onStateChange(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.d.d = i;
        this.r.e.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
