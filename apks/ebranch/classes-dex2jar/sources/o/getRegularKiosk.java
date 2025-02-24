package o;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.Glide;
import java.security.MessageDigest;
/* loaded from: classes-dex2jar.jar:o/getRegularKiosk.class */
public final class getRegularKiosk implements getReservationDate<getProvince> {
    private final getReservationDate<Bitmap> c;

    public getRegularKiosk(getReservationDate<Bitmap> getreservationdate) {
        if (getreservationdate != null) {
            this.c = getreservationdate;
            return;
        }
        throw new NullPointerException("Argument must not be null");
    }

    @Override // o.getReservationDate
    public final setIbanFlag<getProvince> c(Context context, setIbanFlag<getProvince> setibanflag, int i, int i2) {
        getProvince a = setibanflag.a();
        setIbanFlag<Bitmap> setindonesian = new setIndonesian(a.d.a.e, Glide.e(context).d);
        setIbanFlag<Bitmap> c = this.c.c(context, setindonesian, i, i2);
        if (!setindonesian.equals(c)) {
            setindonesian.b();
        }
        Bitmap a2 = c.a();
        a.d.a.a(this.c, a2);
        return setibanflag;
    }

    @Override // o.setCode
    public final void e(MessageDigest messageDigest) {
        this.c.e(messageDigest);
    }

    @Override // o.setCode
    public final boolean equals(Object obj) {
        if (obj instanceof getRegularKiosk) {
            return this.c.equals(((getRegularKiosk) obj).c);
        }
        return false;
    }

    @Override // o.setCode
    public final int hashCode() {
        return this.c.hashCode();
    }
}
