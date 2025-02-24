package androidx.coordinatorlayout.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import o.getPopEnterAnim;
/* loaded from: classes-dex2jar.jar:androidx/coordinatorlayout/widget/CoordinatorLayout$MediaBrowserCompat$ItemReceiver.class */
protected final class CoordinatorLayout$MediaBrowserCompat$ItemReceiver extends getPopEnterAnim {
    public static final Parcelable.Creator<CoordinatorLayout$MediaBrowserCompat$ItemReceiver> CREATOR = new Parcelable.ClassLoaderCreator<CoordinatorLayout$MediaBrowserCompat$ItemReceiver>() { // from class: androidx.coordinatorlayout.widget.CoordinatorLayout$MediaBrowserCompat$ItemReceiver.2
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new CoordinatorLayout$MediaBrowserCompat$ItemReceiver(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public final /* synthetic */ CoordinatorLayout$MediaBrowserCompat$ItemReceiver createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new CoordinatorLayout$MediaBrowserCompat$ItemReceiver(parcel, classLoader);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new CoordinatorLayout$MediaBrowserCompat$ItemReceiver[i];
        }
    };
    SparseArray<Parcelable> c;

    public CoordinatorLayout$MediaBrowserCompat$ItemReceiver(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        int[] iArr = new int[readInt];
        parcel.readIntArray(iArr);
        Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
        this.c = new SparseArray<>(readInt);
        for (int i = 0; i < readInt; i++) {
            this.c.append(iArr[i], readParcelableArray[i]);
        }
    }

    public CoordinatorLayout$MediaBrowserCompat$ItemReceiver(Parcelable parcelable) {
        super(parcelable);
    }

    @Override // o.getPopEnterAnim, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        writeToParcel(parcel, i);
        SparseArray<Parcelable> sparseArray = this.c;
        int size = sparseArray != null ? sparseArray.size() : 0;
        parcel.writeInt(size);
        int[] iArr = new int[size];
        Parcelable[] parcelableArr = new Parcelable[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = this.c.keyAt(i2);
            parcelableArr[i2] = this.c.valueAt(i2);
        }
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i);
    }
}
