package o;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
/* loaded from: classes-dex2jar.jar:o/MasterFundSourcePurposeResponse$$Parcelable.class */
public final class MasterFundSourcePurposeResponse$$Parcelable extends Drawable {
    public static final RemoteActionCompatParcelizer d = new RemoteActionCompatParcelizer((byte) 0);
    private final Paint e;

    /* loaded from: classes-dex2jar.jar:o/MasterFundSourcePurposeResponse$$Parcelable$RemoteActionCompatParcelizer.class */
    public static final class RemoteActionCompatParcelizer {
        private RemoteActionCompatParcelizer() {
        }

        public /* synthetic */ RemoteActionCompatParcelizer(byte b) {
            this();
        }

        public static MasterFundSourcePurposeResponse$$Parcelable b(Context context, int i, int i2, int i3) {
            subscribeReservationRescheduleEvent.e(context, "");
            return new MasterFundSourcePurposeResponse$$Parcelable(copyWindowDataInto.a(context, i), copyWindowDataInto.a(context, i2), context.getResources().getDimensionPixelSize(i3));
        }
    }

    public MasterFundSourcePurposeResponse$$Parcelable(int i, int i2, int i3) {
        Paint paint = new Paint();
        int i4 = i3 << 1;
        Bitmap createBitmap = Bitmap.createBitmap(i4, i4, Bitmap.Config.ARGB_8888);
        createBitmap.eraseColor(i);
        paint.setColor(i2);
        paint.setStyle(Paint.Style.FILL);
        Canvas canvas = new Canvas(createBitmap);
        Rect rect = new Rect(i3, 0, i4, i3);
        canvas.drawRect(rect, paint);
        rect.offsetTo(0, i3);
        canvas.drawRect(rect, paint);
        paint.reset();
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        paint.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
        this.e = paint;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        subscribeReservationRescheduleEvent.e(canvas, "");
        canvas.drawPaint(this.e);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.e.getColorFilter() == null ? -1 : -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.e.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.e.setColorFilter(colorFilter);
    }
}
