package o;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
/* loaded from: classes2-dex2jar.jar:o/FiturSignUpDialog_ViewBinding.class */
public final class FiturSignUpDialog_ViewBinding extends SparseArray<Parcelable> implements Parcelable {
    public static final Parcelable.Creator<FiturSignUpDialog_ViewBinding> CREATOR = new Parcelable.ClassLoaderCreator<FiturSignUpDialog_ViewBinding>() { // from class: o.FiturSignUpDialog_ViewBinding.4
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new FiturSignUpDialog_ViewBinding(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public final /* synthetic */ FiturSignUpDialog_ViewBinding createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new FiturSignUpDialog_ViewBinding(parcel, classLoader);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new FiturSignUpDialog_ViewBinding[i];
        }
    };

    public FiturSignUpDialog_ViewBinding() {
    }

    public FiturSignUpDialog_ViewBinding(Parcel parcel, ClassLoader classLoader) {
        int readInt = parcel.readInt();
        int[] iArr = new int[readInt];
        parcel.readIntArray(iArr);
        Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
        for (int i = 0; i < readInt; i++) {
            put(iArr[i], readParcelableArray[i]);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int size = size();
        int[] iArr = new int[size];
        Parcelable[] parcelableArr = new Parcelable[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = keyAt(i2);
            parcelableArr[i2] = valueAt(i2);
        }
        parcel.writeInt(size);
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i);
    }
}
