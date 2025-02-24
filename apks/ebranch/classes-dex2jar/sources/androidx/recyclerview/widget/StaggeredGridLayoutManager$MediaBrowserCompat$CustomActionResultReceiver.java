package androidx.recyclerview.widget;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.List;
/* loaded from: classes-dex2jar.jar:androidx/recyclerview/widget/StaggeredGridLayoutManager$MediaBrowserCompat$CustomActionResultReceiver.class */
public final class StaggeredGridLayoutManager$MediaBrowserCompat$CustomActionResultReceiver implements Parcelable {
    public static final Parcelable.Creator<StaggeredGridLayoutManager$MediaBrowserCompat$CustomActionResultReceiver> CREATOR = new Parcelable.Creator<StaggeredGridLayoutManager$MediaBrowserCompat$CustomActionResultReceiver>() { // from class: androidx.recyclerview.widget.StaggeredGridLayoutManager$MediaBrowserCompat$CustomActionResultReceiver.2
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ StaggeredGridLayoutManager$MediaBrowserCompat$CustomActionResultReceiver createFromParcel(Parcel parcel) {
            return new StaggeredGridLayoutManager$MediaBrowserCompat$CustomActionResultReceiver(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ StaggeredGridLayoutManager$MediaBrowserCompat$CustomActionResultReceiver[] newArray(int i) {
            return new StaggeredGridLayoutManager$MediaBrowserCompat$CustomActionResultReceiver[i];
        }
    };
    int a;
    List<StaggeredGridLayoutManager.RemoteActionCompatParcelizer.IconCompatParcelizer> b;
    boolean c;
    boolean d;
    boolean e;
    int[] f;
    int g;
    int[] h;
    int i;
    int j;

    public StaggeredGridLayoutManager$MediaBrowserCompat$CustomActionResultReceiver() {
    }

    StaggeredGridLayoutManager$MediaBrowserCompat$CustomActionResultReceiver(Parcel parcel) {
        this.a = parcel.readInt();
        this.i = parcel.readInt();
        int readInt = parcel.readInt();
        this.g = readInt;
        if (readInt > 0) {
            int[] iArr = new int[readInt];
            this.f = iArr;
            parcel.readIntArray(iArr);
        }
        int readInt2 = parcel.readInt();
        this.j = readInt2;
        if (readInt2 > 0) {
            int[] iArr2 = new int[readInt2];
            this.h = iArr2;
            parcel.readIntArray(iArr2);
        }
        boolean z = false;
        this.c = parcel.readInt() == 1;
        this.e = parcel.readInt() == 1;
        this.d = parcel.readInt() == 1 ? true : z;
        this.b = parcel.readArrayList(StaggeredGridLayoutManager.RemoteActionCompatParcelizer.IconCompatParcelizer.class.getClassLoader());
    }

    public StaggeredGridLayoutManager$MediaBrowserCompat$CustomActionResultReceiver(StaggeredGridLayoutManager$MediaBrowserCompat$CustomActionResultReceiver staggeredGridLayoutManager$MediaBrowserCompat$CustomActionResultReceiver) {
        this.g = staggeredGridLayoutManager$MediaBrowserCompat$CustomActionResultReceiver.g;
        this.a = staggeredGridLayoutManager$MediaBrowserCompat$CustomActionResultReceiver.a;
        this.i = staggeredGridLayoutManager$MediaBrowserCompat$CustomActionResultReceiver.i;
        this.f = staggeredGridLayoutManager$MediaBrowserCompat$CustomActionResultReceiver.f;
        this.j = staggeredGridLayoutManager$MediaBrowserCompat$CustomActionResultReceiver.j;
        this.h = staggeredGridLayoutManager$MediaBrowserCompat$CustomActionResultReceiver.h;
        this.c = staggeredGridLayoutManager$MediaBrowserCompat$CustomActionResultReceiver.c;
        this.e = staggeredGridLayoutManager$MediaBrowserCompat$CustomActionResultReceiver.e;
        this.d = staggeredGridLayoutManager$MediaBrowserCompat$CustomActionResultReceiver.d;
        this.b = staggeredGridLayoutManager$MediaBrowserCompat$CustomActionResultReceiver.b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.i);
        parcel.writeInt(this.g);
        if (this.g > 0) {
            parcel.writeIntArray(this.f);
        }
        parcel.writeInt(this.j);
        if (this.j > 0) {
            parcel.writeIntArray(this.h);
        }
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeList(this.b);
    }
}
