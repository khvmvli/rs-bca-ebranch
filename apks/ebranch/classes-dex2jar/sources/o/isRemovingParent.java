package o;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import io.realm.internal.Property;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/isRemovingParent.class */
public final class isRemovingParent implements Parcelable {
    public static final Parcelable.Creator<isRemovingParent> CREATOR = new Parcelable.Creator<isRemovingParent>() { // from class: o.isRemovingParent.3
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ isRemovingParent createFromParcel(Parcel parcel) {
            return new isRemovingParent(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ isRemovingParent[] newArray(int i) {
            return new isRemovingParent[i];
        }
    };
    final String a;
    final Bundle b;
    final int c;
    final int d;
    final boolean e;
    final boolean f;
    final boolean g;
    final boolean h;
    final boolean i;
    final int j;
    final String k;
    final String m;

    /* renamed from: o  reason: collision with root package name */
    Bundle f162o;

    isRemovingParent(Parcel parcel) {
        this.a = parcel.readString();
        this.m = parcel.readString();
        boolean z = true;
        this.f = parcel.readInt() != 0;
        this.c = parcel.readInt();
        this.d = parcel.readInt();
        this.k = parcel.readString();
        this.i = parcel.readInt() != 0;
        this.g = parcel.readInt() != 0;
        this.e = parcel.readInt() != 0;
        this.b = parcel.readBundle();
        if (parcel.readInt() == 0) {
            z = false;
        }
        this.h = z;
        this.f162o = parcel.readBundle();
        this.j = parcel.readInt();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public isRemovingParent(Fragment fragment) {
        this.a = fragment.getClass().getName();
        this.m = fragment.mWho;
        this.f = fragment.mFromLayout;
        this.c = fragment.mFragmentId;
        this.d = fragment.mContainerId;
        this.k = fragment.mTag;
        this.i = fragment.mRetainInstance;
        this.g = fragment.mRemoving;
        this.e = fragment.mDetached;
        this.b = fragment.mArguments;
        this.h = fragment.mHidden;
        this.j = fragment.mMaxState.ordinal();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Object
    public final String toString() {
        StringBuilder sb = new StringBuilder((int) Property.TYPE_ARRAY);
        sb.append("FragmentState{");
        sb.append(this.a);
        sb.append(" (");
        sb.append(this.m);
        sb.append(")}:");
        if (this.f) {
            sb.append(" fromLayout");
        }
        if (this.d != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.d));
        }
        String str = this.k;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.k);
        }
        if (this.i) {
            sb.append(" retainInstance");
        }
        if (this.g) {
            sb.append(" removing");
        }
        if (this.e) {
            sb.append(" detached");
        }
        if (this.h) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.m);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeString(this.k);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeBundle(this.b);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeBundle(this.f162o);
        parcel.writeInt(this.j);
    }
}
