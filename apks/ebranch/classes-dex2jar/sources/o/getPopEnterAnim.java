package o;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes-dex2jar.jar:o/getPopEnterAnim.class */
public abstract class getPopEnterAnim implements Parcelable {
    public final Parcelable d;
    public static final getPopEnterAnim b = new getPopEnterAnim() { // from class: o.getPopEnterAnim.2
    };
    public static final Parcelable.Creator<getPopEnterAnim> CREATOR = new Parcelable.ClassLoaderCreator<getPopEnterAnim>() { // from class: o.getPopEnterAnim.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            if (parcel.readParcelable(null) == null) {
                return getPopEnterAnim.b;
            }
            throw new IllegalStateException("superState must be null");
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public final /* synthetic */ getPopEnterAnim createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return getPopEnterAnim.b;
            }
            throw new IllegalStateException("superState must be null");
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new getPopEnterAnim[i];
        }
    };

    private getPopEnterAnim() {
        this.d = null;
    }

    /* synthetic */ getPopEnterAnim(byte b2) {
        this();
    }

    public getPopEnterAnim(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.d = readParcelable == null ? b : readParcelable;
    }

    public getPopEnterAnim(Parcelable parcelable) {
        if (parcelable != null) {
            this.d = parcelable == b ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.d, i);
    }
}
