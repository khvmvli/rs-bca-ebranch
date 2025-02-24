package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes-dex2jar.jar:android/support/v4/media/RatingCompat.class */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new Parcelable.Creator<RatingCompat>() { // from class: android.support.v4.media.RatingCompat.4
        /* renamed from: c */
        public final RatingCompat createFromParcel(Parcel parcel) {
            return new RatingCompat(parcel.readInt(), parcel.readFloat());
        }

        /* renamed from: c */
        public final RatingCompat[] newArray(int i) {
            return new RatingCompat[i];
        }
    };
    private final float a;
    private final int d;

    RatingCompat(int i, float f) {
        this.d = i;
        this.a = f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return this.d;
    }

    @Override // java.lang.Object
    public final String toString() {
        StringBuilder sb = new StringBuilder("Rating:style=");
        sb.append(this.d);
        sb.append(" rating=");
        float f = this.a;
        sb.append(f < 0.0f ? "unrated" : String.valueOf(f));
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.d);
        parcel.writeFloat(this.a);
    }
}
