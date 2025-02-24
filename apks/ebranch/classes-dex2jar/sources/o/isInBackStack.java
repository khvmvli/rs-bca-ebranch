package o;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import o.isDetached;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/isInBackStack.class */
public final class isInBackStack implements Parcelable {
    public static final Parcelable.Creator<isInBackStack> CREATOR = new Parcelable.Creator<isInBackStack>() { // from class: o.isInBackStack.5
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ isInBackStack createFromParcel(Parcel parcel) {
            return new isInBackStack(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ isInBackStack[] newArray(int i) {
            return new isInBackStack[i];
        }
    };
    ArrayList<isDetached.RemoteActionCompatParcelizer> a;
    ArrayList<String> b;
    getTargetFragment[] c;
    ArrayList<isRemovingParent> d;
    int e;
    String f;
    ArrayList<String> h;
    ArrayList<Bundle> j;

    public isInBackStack() {
        this.f = null;
        this.h = new ArrayList<>();
        this.j = new ArrayList<>();
    }

    public isInBackStack(Parcel parcel) {
        this.f = null;
        this.h = new ArrayList<>();
        this.j = new ArrayList<>();
        this.d = parcel.createTypedArrayList(isRemovingParent.CREATOR);
        this.b = parcel.createStringArrayList();
        this.c = (getTargetFragment[]) parcel.createTypedArray(getTargetFragment.CREATOR);
        this.e = parcel.readInt();
        this.f = parcel.readString();
        this.h = parcel.createStringArrayList();
        this.j = parcel.createTypedArrayList(Bundle.CREATOR);
        this.a = parcel.createTypedArrayList(isDetached.RemoteActionCompatParcelizer.CREATOR);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.d);
        parcel.writeStringList(this.b);
        parcel.writeTypedArray(this.c, i);
        parcel.writeInt(this.e);
        parcel.writeString(this.f);
        parcel.writeStringList(this.h);
        parcel.writeTypedList(this.j);
        parcel.writeTypedList(this.a);
    }
}
