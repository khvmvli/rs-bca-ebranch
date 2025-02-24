package o;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.Glide;
/* loaded from: classes-dex2jar.jar:o/GetAcctOpeningCategoryDataResponse$Languange$$Parcelable.class */
public abstract class GetAcctOpeningCategoryDataResponse$Languange$$Parcelable implements getReservationDate<Bitmap> {
    @Override // o.getReservationDate
    public final setIbanFlag<Bitmap> c(Context context, setIbanFlag<Bitmap> setibanflag, int i, int i2) {
        if (getTxnNotes2.d(i, i2)) {
            setValueArray setvaluearray = Glide.e(context).d;
            Bitmap a = setibanflag.a();
            int i3 = i;
            if (i == Integer.MIN_VALUE) {
                i3 = a.getWidth();
            }
            int i4 = i2;
            if (i2 == Integer.MIN_VALUE) {
                i4 = a.getHeight();
            }
            Bitmap d = d(setvaluearray, a, i3, i4);
            if (!a.equals(d)) {
                setibanflag = d == null ? null : new setIndonesian(d, setvaluearray);
            }
            return setibanflag;
        }
        StringBuilder sb = new StringBuilder("Cannot apply transformation on width: ");
        sb.append(i);
        sb.append(" or height: ");
        sb.append(i2);
        sb.append(" less than or equal to zero and not Target.SIZE_ORIGINAL");
        throw new IllegalArgumentException(sb.toString());
    }

    protected abstract Bitmap d(setValueArray setvaluearray, Bitmap bitmap, int i, int i2);
}
