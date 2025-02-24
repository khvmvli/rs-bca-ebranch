package o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.Glide;
import java.security.MessageDigest;
/* loaded from: classes-dex2jar.jar:o/GetBranchROResponse.class */
public final class GetBranchROResponse implements getReservationDate<Drawable> {
    private final getReservationDate<Bitmap> a;
    private final boolean c;

    /* loaded from: classes-dex2jar.jar:o/GetBranchROResponse$DetailBranch.class */
    public final class DetailBranch implements setIbanFlag<BitmapDrawable>, getAliasName {
        private final setIbanFlag<Bitmap> b;
        private final Resources c;

        public DetailBranch(Resources resources, setIbanFlag<Bitmap> setibanflag) {
            if (resources != null) {
                this.c = resources;
                if (setibanflag != null) {
                    this.b = setibanflag;
                    return;
                }
                throw new NullPointerException("Argument must not be null");
            }
            throw new NullPointerException("Argument must not be null");
        }

        @Override // o.setIbanFlag
        public final /* synthetic */ BitmapDrawable a() {
            return new BitmapDrawable(this.c, this.b.a());
        }

        @Override // o.setIbanFlag
        public final void b() {
            this.b.b();
        }

        @Override // o.getAliasName
        public final void c() {
            setIbanFlag<Bitmap> setibanflag = this.b;
            if (setibanflag instanceof getAliasName) {
                ((getAliasName) setibanflag).c();
            }
        }

        @Override // o.setIbanFlag
        public final int d() {
            return this.b.d();
        }

        @Override // o.setIbanFlag
        public final Class<BitmapDrawable> e() {
            return BitmapDrawable.class;
        }
    }

    public GetBranchROResponse(getReservationDate<Bitmap> getreservationdate, boolean z) {
        this.a = getreservationdate;
        this.c = z;
    }

    @Override // o.getReservationDate
    public final setIbanFlag<Drawable> c(Context context, setIbanFlag<Drawable> setibanflag, int i, int i2) {
        setValueArray setvaluearray = Glide.e(context).d;
        Drawable a = setibanflag.a();
        setIbanFlag<Bitmap> e = setBankKey.e(setvaluearray, a, i, i2);
        if (e != null) {
            setIbanFlag<Bitmap> c = this.a.c(context, e, i, i2);
            if (c.equals(e)) {
                c.b();
                return setibanflag;
            }
            Resources resources = context.getResources();
            if (c == null) {
                return null;
            }
            return new DetailBranch(resources, c);
        } else if (!this.c) {
            return setibanflag;
        } else {
            StringBuilder sb = new StringBuilder("Unable to convert ");
            sb.append(a);
            sb.append(" to a Bitmap");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    @Override // o.setCode
    public final void e(MessageDigest messageDigest) {
        this.a.e(messageDigest);
    }

    @Override // o.setCode
    public final boolean equals(Object obj) {
        if (obj instanceof GetBranchROResponse) {
            return this.a.equals(((GetBranchROResponse) obj).a);
        }
        return false;
    }

    @Override // o.setCode
    public final int hashCode() {
        return this.a.hashCode();
    }
}
