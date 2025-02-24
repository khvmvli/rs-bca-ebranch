package o;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
/* loaded from: classes-dex2jar.jar:o/setFlagReservation.class */
public final class setFlagReservation implements setEmergencyCloseStartDate<Drawable, byte[]> {
    private final setEmergencyCloseStartDate<Bitmap, byte[]> b;
    private final setValueArray c;
    private final setEmergencyCloseStartDate<getProvince, byte[]> e;

    public setFlagReservation(setValueArray setvaluearray, setEmergencyCloseStartDate<Bitmap, byte[]> setemergencyclosestartdate, setEmergencyCloseStartDate<getProvince, byte[]> setemergencyclosestartdate2) {
        this.c = setvaluearray;
        this.b = setemergencyclosestartdate;
        this.e = setemergencyclosestartdate2;
    }

    @Override // o.setEmergencyCloseStartDate
    public final setIbanFlag<byte[]> e(setIbanFlag<Drawable> setibanflag, CategoryResponse categoryResponse) {
        Drawable a = setibanflag.a();
        setIndonesian setindonesian = null;
        if (a instanceof BitmapDrawable) {
            setEmergencyCloseStartDate<Bitmap, byte[]> setemergencyclosestartdate = this.b;
            Bitmap bitmap = ((BitmapDrawable) a).getBitmap();
            setValueArray setvaluearray = this.c;
            if (bitmap != null) {
                setindonesian = new setIndonesian(bitmap, setvaluearray);
            }
            return setemergencyclosestartdate.e(setindonesian, categoryResponse);
        } else if (a instanceof getProvince) {
            return this.e.e(setibanflag, categoryResponse);
        } else {
            return null;
        }
    }
}
