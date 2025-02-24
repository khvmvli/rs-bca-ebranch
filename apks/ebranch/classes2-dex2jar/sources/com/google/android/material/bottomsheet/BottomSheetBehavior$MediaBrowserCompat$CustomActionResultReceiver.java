package com.google.android.material.bottomsheet;

import android.os.Parcel;
import android.os.Parcelable;
import o.getPopEnterAnim;
/* loaded from: classes2-dex2jar.jar:com/google/android/material/bottomsheet/BottomSheetBehavior$MediaBrowserCompat$CustomActionResultReceiver.class */
protected final class BottomSheetBehavior$MediaBrowserCompat$CustomActionResultReceiver extends getPopEnterAnim {
    public static final Parcelable.Creator<BottomSheetBehavior$MediaBrowserCompat$CustomActionResultReceiver> CREATOR = new Parcelable.ClassLoaderCreator<BottomSheetBehavior$MediaBrowserCompat$CustomActionResultReceiver>() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior$MediaBrowserCompat$CustomActionResultReceiver.5
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new BottomSheetBehavior$MediaBrowserCompat$CustomActionResultReceiver(parcel, (ClassLoader) null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public final /* synthetic */ BottomSheetBehavior$MediaBrowserCompat$CustomActionResultReceiver createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new BottomSheetBehavior$MediaBrowserCompat$CustomActionResultReceiver(parcel, classLoader);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new BottomSheetBehavior$MediaBrowserCompat$CustomActionResultReceiver[i];
        }
    };
    boolean a;
    int c;
    boolean e;
    boolean f;
    final int i;

    public BottomSheetBehavior$MediaBrowserCompat$CustomActionResultReceiver(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.i = parcel.readInt();
        this.c = parcel.readInt();
        boolean z = false;
        this.a = parcel.readInt() == 1;
        this.e = parcel.readInt() == 1;
        this.f = parcel.readInt() == 1 ? true : z;
    }

    public BottomSheetBehavior$MediaBrowserCompat$CustomActionResultReceiver(Parcelable parcelable, BottomSheetBehavior<?> bottomSheetBehavior) {
        super(parcelable);
        this.i = bottomSheetBehavior.u;
        this.c = bottomSheetBehavior.w;
        this.a = bottomSheetBehavior.h;
        this.e = bottomSheetBehavior.n;
        this.f = bottomSheetBehavior.y;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        writeToParcel(parcel, i);
        parcel.writeInt(this.i);
        parcel.writeInt(this.c);
        parcel.writeInt(this.a ? 1 : 0);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeInt(this.f ? 1 : 0);
    }
}
