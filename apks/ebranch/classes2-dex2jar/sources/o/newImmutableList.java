package o;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import o.ListUtil;
/* loaded from: classes2-dex2jar.jar:o/newImmutableList.class */
final class newImmutableList implements ListUtil.FourItemImmutableList<ListUtil.OneItemImmutableList.RemoteActionCompatParcelizer> {
    private static final newImmutableList c = new newImmutableList();
    private final Map<Class, ListUtil.OneItemImmutableList.RemoteActionCompatParcelizer> b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2-dex2jar.jar:o/newImmutableList$IconCompatParcelizer.class */
    public static final class IconCompatParcelizer implements ListUtil.OneItemImmutableList.RemoteActionCompatParcelizer<Bundle> {
        private IconCompatParcelizer() {
        }

        /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }

        @Override // o.ListUtil.OneItemImmutableList.RemoteActionCompatParcelizer
        public final /* bridge */ /* synthetic */ Parcelable a(Bundle bundle) {
            return bundle;
        }
    }

    /* loaded from: classes2-dex2jar.jar:o/newImmutableList$ImmLeaksCleaner.class */
    public static final class ImmLeaksCleaner extends PlaybackStateCompat.CustomAction<IBinder> {
        private static final setLogger<IBinder> b = new setLogger<IBinder>() { // from class: o.newImmutableList.ImmLeaksCleaner.3
            @Override // o.setLogger
            public final /* synthetic */ void c(IBinder iBinder, Parcel parcel) {
                parcel.writeStrongBinder(iBinder);
            }

            @Override // o.setLogger
            public final /* synthetic */ IBinder e(Parcel parcel) {
                return parcel.readStrongBinder();
            }
        };
        public static final read CREATOR = new read((byte) 0);

        /* loaded from: classes2-dex2jar.jar:o/newImmutableList$ImmLeaksCleaner$read.class */
        static final class read implements Parcelable.Creator<ImmLeaksCleaner> {
            private read() {
            }

            /* synthetic */ read(byte b) {
                this();
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ ImmLeaksCleaner createFromParcel(Parcel parcel) {
                return new ImmLeaksCleaner(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ ImmLeaksCleaner[] newArray(int i) {
                return new ImmLeaksCleaner[i];
            }
        }

        public ImmLeaksCleaner(IBinder iBinder) {
            super(iBinder, b, (byte) 0);
        }

        public ImmLeaksCleaner(Parcel parcel) {
            super(parcel, (ListUtil.ThreeItemImmutableList) b, (byte) 0);
        }

        @Override // o.newImmutableList.PlaybackStateCompat.CustomAction, android.os.Parcelable
        public final /* bridge */ /* synthetic */ int describeContents() {
            return describeContents();
        }

        @Override // o.newImmutableList.PlaybackStateCompat.CustomAction, android.os.Parcelable
        public final /* bridge */ /* synthetic */ void writeToParcel(Parcel parcel, int i) {
            writeToParcel(parcel, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2-dex2jar.jar:o/newImmutableList$Keep.class */
    public static final class Keep implements ListUtil.OneItemImmutableList.RemoteActionCompatParcelizer<LinkedHashSet> {
        private Keep() {
        }

        /* synthetic */ Keep(byte b) {
            this();
        }

        @Override // o.ListUtil.OneItemImmutableList.RemoteActionCompatParcelizer
        public final /* synthetic */ Parcelable a(LinkedHashSet linkedHashSet) {
            return new setBackgroundResource(linkedHashSet);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2-dex2jar.jar:o/newImmutableList$MediaDescriptionCompat.class */
    public static final class MediaDescriptionCompat implements ListUtil.OneItemImmutableList.RemoteActionCompatParcelizer<Byte> {
        private MediaDescriptionCompat() {
        }

        /* synthetic */ MediaDescriptionCompat(byte b) {
            this();
        }

        @Override // o.ListUtil.OneItemImmutableList.RemoteActionCompatParcelizer
        public final /* synthetic */ Parcelable a(Byte b) {
            return new newImmutableList$MediaBrowserCompat$ItemReceiver(b);
        }
    }

    /* loaded from: classes2-dex2jar.jar:o/newImmutableList$MediaMetadataCompat.class */
    public static final class MediaMetadataCompat extends PlaybackStateCompat.CustomAction<byte[]> {
        private static final setLogger<byte[]> b = new setLogger<byte[]>() { // from class: o.newImmutableList.MediaMetadataCompat.1
            @Override // o.setLogger
            public final /* synthetic */ void c(byte[] bArr, Parcel parcel) {
                parcel.writeByteArray(bArr);
            }

            @Override // o.setLogger
            public final /* synthetic */ byte[] e(Parcel parcel) {
                return parcel.createByteArray();
            }
        };
        public static final write CREATOR = new write((byte) 0);

        /* loaded from: classes2-dex2jar.jar:o/newImmutableList$MediaMetadataCompat$write.class */
        static final class write implements Parcelable.Creator<MediaMetadataCompat> {
            private write() {
            }

            /* synthetic */ write(byte b) {
                this();
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ MediaMetadataCompat createFromParcel(Parcel parcel) {
                return new MediaMetadataCompat(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ MediaMetadataCompat[] newArray(int i) {
                return new MediaMetadataCompat[i];
            }
        }

        public MediaMetadataCompat(Parcel parcel) {
            super(parcel, (ListUtil.ThreeItemImmutableList) b, (byte) 0);
        }

        public MediaMetadataCompat(byte[] bArr) {
            super(bArr, b, (byte) 0);
        }

        @Override // o.newImmutableList.PlaybackStateCompat.CustomAction, android.os.Parcelable
        public final /* bridge */ /* synthetic */ int describeContents() {
            return describeContents();
        }

        @Override // o.newImmutableList.PlaybackStateCompat.CustomAction, android.os.Parcelable
        public final /* bridge */ /* synthetic */ void writeToParcel(Parcel parcel, int i) {
            writeToParcel(parcel, i);
        }
    }

    /* loaded from: classes2-dex2jar.jar:o/newImmutableList$ParcelableVolumeInfo.class */
    public static final class ParcelableVolumeInfo extends PlaybackStateCompat.CustomAction<Double> {
        private static final setLogger<Double> d = new setLogger<Double>() { // from class: o.newImmutableList.ParcelableVolumeInfo.2
            @Override // o.setLogger
            public final /* synthetic */ void c(Double d2, Parcel parcel) {
                parcel.writeDouble(d2.doubleValue());
            }

            @Override // o.setLogger
            public final /* synthetic */ Double e(Parcel parcel) {
                return Double.valueOf(parcel.readDouble());
            }
        };
        public static final write CREATOR = new write((byte) 0);

        /* loaded from: classes2-dex2jar.jar:o/newImmutableList$ParcelableVolumeInfo$write.class */
        static final class write implements Parcelable.Creator<ParcelableVolumeInfo> {
            private write() {
            }

            /* synthetic */ write(byte b) {
                this();
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ ParcelableVolumeInfo createFromParcel(Parcel parcel) {
                return new ParcelableVolumeInfo(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ ParcelableVolumeInfo[] newArray(int i) {
                return new ParcelableVolumeInfo[i];
            }
        }

        public ParcelableVolumeInfo(Parcel parcel) {
            super(parcel, (ListUtil.ThreeItemImmutableList) d, (byte) 0);
        }

        public ParcelableVolumeInfo(Double d2) {
            super(d2, d, (byte) 0);
        }

        @Override // o.newImmutableList.PlaybackStateCompat.CustomAction, android.os.Parcelable
        public final /* bridge */ /* synthetic */ int describeContents() {
            return describeContents();
        }

        @Override // o.newImmutableList.PlaybackStateCompat.CustomAction, android.os.Parcelable
        public final /* bridge */ /* synthetic */ void writeToParcel(Parcel parcel, int i) {
            writeToParcel(parcel, i);
        }
    }

    /* loaded from: classes2-dex2jar.jar:o/newImmutableList$PlaybackStateCompat.class */
    public static final class PlaybackStateCompat extends CustomAction<Float> {
        private static final setLogger<Float> e = new setLogger<Float>() { // from class: o.newImmutableList.PlaybackStateCompat.5
            @Override // o.setLogger
            public final /* synthetic */ void c(Float f, Parcel parcel) {
                parcel.writeFloat(f.floatValue());
            }

            @Override // o.setLogger
            public final /* synthetic */ Float e(Parcel parcel) {
                return Float.valueOf(parcel.readFloat());
            }
        };
        public static final read CREATOR = new read((byte) 0);

        /* loaded from: classes2-dex2jar.jar:o/newImmutableList$PlaybackStateCompat$CustomAction.class */
        public static class CustomAction<T> implements Parcelable, copyToImmutableList<T> {
            private final T c;
            private final ListUtil.ThreeItemImmutableList<T, T> d;

            private CustomAction(Parcel parcel, ListUtil.ThreeItemImmutableList<T, T> threeItemImmutableList) {
                this(threeItemImmutableList.d(parcel), threeItemImmutableList);
            }

            public /* synthetic */ CustomAction(Parcel parcel, ListUtil.ThreeItemImmutableList threeItemImmutableList, byte b) {
                this(parcel, threeItemImmutableList);
            }

            private CustomAction(T t, ListUtil.ThreeItemImmutableList<T, T> threeItemImmutableList) {
                this.d = threeItemImmutableList;
                this.c = t;
            }

            public /* synthetic */ CustomAction(Object obj, ListUtil.ThreeItemImmutableList threeItemImmutableList, byte b) {
                this(obj, threeItemImmutableList);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // o.copyToImmutableList
            public T getParcel() {
                return this.c;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
                this.d.d(this.c, parcel);
            }
        }

        /* loaded from: classes2-dex2jar.jar:o/newImmutableList$PlaybackStateCompat$read.class */
        static final class read implements Parcelable.Creator<PlaybackStateCompat> {
            private read() {
            }

            /* synthetic */ read(byte b) {
                this();
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ PlaybackStateCompat createFromParcel(Parcel parcel) {
                return new PlaybackStateCompat(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ PlaybackStateCompat[] newArray(int i) {
                return new PlaybackStateCompat[i];
            }
        }

        public PlaybackStateCompat(Parcel parcel) {
            super(parcel, (ListUtil.ThreeItemImmutableList) e, (byte) 0);
        }

        public PlaybackStateCompat(Float f) {
            super(f, e, (byte) 0);
        }

        @Override // o.newImmutableList.PlaybackStateCompat.CustomAction, android.os.Parcelable
        public final /* bridge */ /* synthetic */ int describeContents() {
            return describeContents();
        }

        @Override // o.newImmutableList.PlaybackStateCompat.CustomAction, android.os.Parcelable
        public final /* bridge */ /* synthetic */ void writeToParcel(Parcel parcel, int i) {
            writeToParcel(parcel, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2-dex2jar.jar:o/newImmutableList$RatingCompat.class */
    public static final class RatingCompat implements ListUtil.OneItemImmutableList.RemoteActionCompatParcelizer<Collection> {
        private RatingCompat() {
        }

        /* synthetic */ RatingCompat(byte b) {
            this();
        }

        @Override // o.ListUtil.OneItemImmutableList.RemoteActionCompatParcelizer
        public final /* synthetic */ Parcelable a(Collection collection) {
            return new newImmutableList$MediaSessionCompat$ResultReceiverWrapper(collection);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2-dex2jar.jar:o/newImmutableList$RemoteActionCompatParcelizer.class */
    public static final class RemoteActionCompatParcelizer implements ListUtil.OneItemImmutableList.RemoteActionCompatParcelizer<boolean[]> {
        private RemoteActionCompatParcelizer() {
        }

        /* synthetic */ RemoteActionCompatParcelizer(byte b) {
            this();
        }

        @Override // o.ListUtil.OneItemImmutableList.RemoteActionCompatParcelizer
        public final /* synthetic */ Parcelable a(boolean[] zArr) {
            return new read(zArr);
        }
    }

    /* loaded from: classes2-dex2jar.jar:o/newImmutableList$read.class */
    public static final class read extends PlaybackStateCompat.CustomAction<boolean[]> {
        private static final ListUtil.ImmutableArrayList a = new ListUtil.ImmutableArrayList();
        public static final RemoteActionCompatParcelizer CREATOR = new RemoteActionCompatParcelizer((byte) 0);

        /* loaded from: classes2-dex2jar.jar:o/newImmutableList$read$RemoteActionCompatParcelizer.class */
        static final class RemoteActionCompatParcelizer implements Parcelable.Creator<read> {
            private RemoteActionCompatParcelizer() {
            }

            /* synthetic */ RemoteActionCompatParcelizer(byte b) {
                this();
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ read createFromParcel(Parcel parcel) {
                return new read(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ read[] newArray(int i) {
                return new read[i];
            }
        }

        public read(Parcel parcel) {
            super(parcel, (ListUtil.ThreeItemImmutableList) a, (byte) 0);
        }

        public read(boolean[] zArr) {
            super(zArr, a, (byte) 0);
        }

        @Override // o.newImmutableList.PlaybackStateCompat.CustomAction, android.os.Parcelable
        public final /* bridge */ /* synthetic */ int describeContents() {
            return describeContents();
        }

        @Override // o.newImmutableList.PlaybackStateCompat.CustomAction, android.os.Parcelable
        public final /* bridge */ /* synthetic */ void writeToParcel(Parcel parcel, int i) {
            writeToParcel(parcel, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2-dex2jar.jar:o/newImmutableList$setActionBarHideOffset.class */
    public static final class setActionBarHideOffset implements ListUtil.OneItemImmutableList.RemoteActionCompatParcelizer<String> {
        private setActionBarHideOffset() {
        }

        /* synthetic */ setActionBarHideOffset(byte b) {
            this();
        }

        @Override // o.ListUtil.OneItemImmutableList.RemoteActionCompatParcelizer
        public final /* synthetic */ Parcelable a(String str) {
            return new setTabContainer(str, (byte) 0);
        }
    }

    /* loaded from: classes2-dex2jar.jar:o/newImmutableList$setBackgroundResource.class */
    public static final class setBackgroundResource extends PlaybackStateCompat.CustomAction<LinkedHashSet> {
        private static final isLoggable d = new isLoggable() { // from class: o.newImmutableList.setBackgroundResource.4
            @Override // o.d
            public final void a(Object obj, Parcel parcel) {
                parcel.writeParcelable(ListUtil.OneItemImmutableList.e(obj), 0);
            }

            @Override // o.d
            public final Object e(Parcel parcel) {
                return ListUtil.OneItemImmutableList.a(parcel.readParcelable(setBackgroundResource.class.getClassLoader()));
            }
        };
        public static final IconCompatParcelizer CREATOR = new IconCompatParcelizer((byte) 0);

        /* loaded from: classes2-dex2jar.jar:o/newImmutableList$setBackgroundResource$IconCompatParcelizer.class */
        static final class IconCompatParcelizer implements Parcelable.Creator<setBackgroundResource> {
            private IconCompatParcelizer() {
            }

            /* synthetic */ IconCompatParcelizer(byte b) {
                this();
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ setBackgroundResource createFromParcel(Parcel parcel) {
                return new setBackgroundResource(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ setBackgroundResource[] newArray(int i) {
                return new setBackgroundResource[i];
            }
        }

        public setBackgroundResource(Parcel parcel) {
            super(parcel, (ListUtil.ThreeItemImmutableList) d, (byte) 0);
        }

        public setBackgroundResource(LinkedHashSet linkedHashSet) {
            super(linkedHashSet, d, (byte) 0);
        }

        @Override // o.newImmutableList.PlaybackStateCompat.CustomAction, android.os.Parcelable
        public final /* bridge */ /* synthetic */ int describeContents() {
            return describeContents();
        }

        @Override // o.newImmutableList.PlaybackStateCompat.CustomAction, android.os.Parcelable
        public final /* bridge */ /* synthetic */ void writeToParcel(Parcel parcel, int i) {
            writeToParcel(parcel, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2-dex2jar.jar:o/newImmutableList$setCheckable.class */
    public static final class setCheckable implements ListUtil.OneItemImmutableList.RemoteActionCompatParcelizer<LinkedHashMap> {
        private setCheckable() {
        }

        /* synthetic */ setCheckable(byte b) {
            this();
        }

        @Override // o.ListUtil.OneItemImmutableList.RemoteActionCompatParcelizer
        public final /* synthetic */ Parcelable a(LinkedHashMap linkedHashMap) {
            return new newImmutableList$ComponentActivity$5(linkedHashMap);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2-dex2jar.jar:o/newImmutableList$setChecked.class */
    public static final class setChecked implements ListUtil.OneItemImmutableList.RemoteActionCompatParcelizer<LinkedList> {
        private setChecked() {
        }

        /* synthetic */ setChecked(byte b) {
            this();
        }

        @Override // o.ListUtil.OneItemImmutableList.RemoteActionCompatParcelizer
        public final /* synthetic */ Parcelable a(LinkedList linkedList) {
            return new setHasDecor(linkedList);
        }
    }

    /* loaded from: classes2-dex2jar.jar:o/newImmutableList$setContentHeight.class */
    public static final class setContentHeight implements ListUtil.OneItemImmutableList.RemoteActionCompatParcelizer<Parcelable> {
        @Override // o.ListUtil.OneItemImmutableList.RemoteActionCompatParcelizer
        public final /* synthetic */ Parcelable a(Parcelable parcelable) {
            return new setForceShowIcon(parcelable, (byte) 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2-dex2jar.jar:o/newImmutableList$setContentView.class */
    public static final class setContentView implements ListUtil.OneItemImmutableList.RemoteActionCompatParcelizer<Double> {
        private setContentView() {
        }

        /* synthetic */ setContentView(byte b) {
            this();
        }

        @Override // o.ListUtil.OneItemImmutableList.RemoteActionCompatParcelizer
        public final /* synthetic */ Parcelable a(Double d) {
            return new ParcelableVolumeInfo(d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2-dex2jar.jar:o/newImmutableList$setCustomView.class */
    public static final class setCustomView implements ListUtil.OneItemImmutableList.RemoteActionCompatParcelizer<Set> {
        private setCustomView() {
        }

        /* synthetic */ setCustomView(byte b) {
            this();
        }

        @Override // o.ListUtil.OneItemImmutableList.RemoteActionCompatParcelizer
        public final /* synthetic */ Parcelable a(Set set) {
            return new setSubtitle(set);
        }
    }

    /* loaded from: classes2-dex2jar.jar:o/newImmutableList$setExpandedFormat.class */
    public static final class setExpandedFormat extends PlaybackStateCompat.CustomAction<Long> {
        private static final setLogger<Long> a = new setLogger<Long>() { // from class: o.newImmutableList.setExpandedFormat.2
            @Override // o.setLogger
            public final /* synthetic */ void c(Long l, Parcel parcel) {
                parcel.writeLong(l.longValue());
            }

            @Override // o.setLogger
            public final /* synthetic */ Long e(Parcel parcel) {
                return Long.valueOf(parcel.readLong());
            }
        };
        public static final RemoteActionCompatParcelizer CREATOR = new RemoteActionCompatParcelizer((byte) 0);

        /* loaded from: classes2-dex2jar.jar:o/newImmutableList$setExpandedFormat$RemoteActionCompatParcelizer.class */
        static final class RemoteActionCompatParcelizer implements Parcelable.Creator<setExpandedFormat> {
            private RemoteActionCompatParcelizer() {
            }

            /* synthetic */ RemoteActionCompatParcelizer(byte b) {
                this();
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ setExpandedFormat createFromParcel(Parcel parcel) {
                return new setExpandedFormat(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ setExpandedFormat[] newArray(int i) {
                return new setExpandedFormat[i];
            }
        }

        public setExpandedFormat(Parcel parcel) {
            super(parcel, (ListUtil.ThreeItemImmutableList) a, (byte) 0);
        }

        public setExpandedFormat(Long l) {
            super(l, a, (byte) 0);
        }

        @Override // o.newImmutableList.PlaybackStateCompat.CustomAction, android.os.Parcelable
        public final /* bridge */ /* synthetic */ int describeContents() {
            return describeContents();
        }

        @Override // o.newImmutableList.PlaybackStateCompat.CustomAction, android.os.Parcelable
        public final /* bridge */ /* synthetic */ void writeToParcel(Parcel parcel, int i) {
            writeToParcel(parcel, i);
        }
    }

    /* loaded from: classes2-dex2jar.jar:o/newImmutableList$setForceShowIcon.class */
    public static final class setForceShowIcon implements Parcelable, copyToImmutableList<Parcelable> {
        public static final newImmutableList$setForceShowIcon$MediaBrowserCompat$CustomActionResultReceiver CREATOR = new newImmutableList$setForceShowIcon$MediaBrowserCompat$CustomActionResultReceiver((byte) 0);
        private Parcelable c;

        private setForceShowIcon(Parcel parcel) {
            this.c = parcel.readParcelable(setForceShowIcon.class.getClassLoader());
        }

        public /* synthetic */ setForceShowIcon(Parcel parcel, byte b) {
            this(parcel);
        }

        private setForceShowIcon(Parcelable parcelable) {
            this.c = parcelable;
        }

        /* synthetic */ setForceShowIcon(Parcelable parcelable, byte b) {
            this(parcelable);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // o.copyToImmutableList
        public final /* bridge */ /* synthetic */ Parcelable getParcel() {
            return this.c;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.c, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2-dex2jar.jar:o/newImmutableList$setGroupDividerEnabled.class */
    public static final class setGroupDividerEnabled implements ListUtil.OneItemImmutableList.RemoteActionCompatParcelizer<Set> {
        private setGroupDividerEnabled() {
        }

        /* synthetic */ setGroupDividerEnabled(byte b) {
            this();
        }

        @Override // o.ListUtil.OneItemImmutableList.RemoteActionCompatParcelizer
        public final /* synthetic */ Parcelable a(Set set) {
            return new setTitle(set);
        }
    }

    /* loaded from: classes2-dex2jar.jar:o/newImmutableList$setHasDecor.class */
    public static final class setHasDecor extends PlaybackStateCompat.CustomAction<LinkedList> {
        private static final log e = new log() { // from class: o.newImmutableList.setHasDecor.4
            @Override // o.d
            public final void a(Object obj, Parcel parcel) {
                parcel.writeParcelable(ListUtil.OneItemImmutableList.e(obj), 0);
            }

            @Override // o.d
            public final Object e(Parcel parcel) {
                return ListUtil.OneItemImmutableList.a(parcel.readParcelable(setHasDecor.class.getClassLoader()));
            }
        };
        public static final newImmutableList$setHasDecor$MediaBrowserCompat$CustomActionResultReceiver CREATOR = new newImmutableList$setHasDecor$MediaBrowserCompat$CustomActionResultReceiver((byte) 0);

        public setHasDecor(Parcel parcel) {
            super(parcel, (ListUtil.ThreeItemImmutableList) e, (byte) 0);
        }

        public setHasDecor(LinkedList linkedList) {
            super(linkedList, e, (byte) 0);
        }

        @Override // o.newImmutableList.PlaybackStateCompat.CustomAction, android.os.Parcelable
        public final /* bridge */ /* synthetic */ int describeContents() {
            return describeContents();
        }

        @Override // o.newImmutableList.PlaybackStateCompat.CustomAction, android.os.Parcelable
        public final /* bridge */ /* synthetic */ void writeToParcel(Parcel parcel, int i) {
            writeToParcel(parcel, i);
        }
    }

    /* loaded from: classes2-dex2jar.jar:o/newImmutableList$setIcon.class */
    public static final class setIcon extends PlaybackStateCompat.CustomAction<List> {
        private static final ListUtil.ImmutableList e = new ListUtil.ImmutableList() { // from class: o.newImmutableList.setIcon.1
            @Override // o.d
            public final void a(Object obj, Parcel parcel) {
                parcel.writeParcelable(ListUtil.OneItemImmutableList.e(obj), 0);
            }

            @Override // o.d
            public final Object e(Parcel parcel) {
                return ListUtil.OneItemImmutableList.a(parcel.readParcelable(setIcon.class.getClassLoader()));
            }
        };
        public static final RemoteActionCompatParcelizer CREATOR = new RemoteActionCompatParcelizer((byte) 0);

        /* loaded from: classes2-dex2jar.jar:o/newImmutableList$setIcon$RemoteActionCompatParcelizer.class */
        static final class RemoteActionCompatParcelizer implements Parcelable.Creator<setIcon> {
            private RemoteActionCompatParcelizer() {
            }

            /* synthetic */ RemoteActionCompatParcelizer(byte b) {
                this();
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ setIcon createFromParcel(Parcel parcel) {
                return new setIcon(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ setIcon[] newArray(int i) {
                return new setIcon[i];
            }
        }

        public setIcon(Parcel parcel) {
            super(parcel, (ListUtil.ThreeItemImmutableList) e, (byte) 0);
        }

        public setIcon(List list) {
            super(list, e, (byte) 0);
        }

        @Override // o.newImmutableList.PlaybackStateCompat.CustomAction, android.os.Parcelable
        public final /* bridge */ /* synthetic */ int describeContents() {
            return describeContents();
        }

        @Override // o.newImmutableList.PlaybackStateCompat.CustomAction, android.os.Parcelable
        public final /* bridge */ /* synthetic */ void writeToParcel(Parcel parcel, int i) {
            writeToParcel(parcel, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2-dex2jar.jar:o/newImmutableList$setItemInvoker.class */
    public static final class setItemInvoker implements ListUtil.OneItemImmutableList.RemoteActionCompatParcelizer<Long> {
        private setItemInvoker() {
        }

        /* synthetic */ setItemInvoker(byte b) {
            this();
        }

        @Override // o.ListUtil.OneItemImmutableList.RemoteActionCompatParcelizer
        public final /* synthetic */ Parcelable a(Long l) {
            return new setExpandedFormat(l);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2-dex2jar.jar:o/newImmutableList$setPadding.class */
    public static final class setPadding implements ListUtil.OneItemImmutableList.RemoteActionCompatParcelizer<List> {
        private setPadding() {
        }

        /* synthetic */ setPadding(byte b) {
            this();
        }

        @Override // o.ListUtil.OneItemImmutableList.RemoteActionCompatParcelizer
        public final /* synthetic */ Parcelable a(List list) {
            return new setIcon(list);
        }
    }

    /* loaded from: classes2-dex2jar.jar:o/newImmutableList$setPopupCallback.class */
    public static final class setPopupCallback extends PlaybackStateCompat.CustomAction<Map> {
        private static final formatThrowable c = new formatThrowable() { // from class: o.newImmutableList.setPopupCallback.4
            @Override // o.v
            public final Object a(Parcel parcel) {
                return ListUtil.OneItemImmutableList.a(parcel.readParcelable(setPopupCallback.class.getClassLoader()));
            }

            @Override // o.v
            public final void a(Object obj, Parcel parcel) {
                parcel.writeParcelable(ListUtil.OneItemImmutableList.e(obj), 0);
            }

            @Override // o.v
            public final Object c(Parcel parcel) {
                return ListUtil.OneItemImmutableList.a(parcel.readParcelable(setPopupCallback.class.getClassLoader()));
            }

            @Override // o.v
            public final void e(Object obj, Parcel parcel) {
                parcel.writeParcelable(ListUtil.OneItemImmutableList.e(obj), 0);
            }
        };
        public static final write CREATOR = new write((byte) 0);

        /* loaded from: classes2-dex2jar.jar:o/newImmutableList$setPopupCallback$write.class */
        static final class write implements Parcelable.Creator<setPopupCallback> {
            private write() {
            }

            /* synthetic */ write(byte b) {
                this();
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ setPopupCallback createFromParcel(Parcel parcel) {
                return new setPopupCallback(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ setPopupCallback[] newArray(int i) {
                return new setPopupCallback[i];
            }
        }

        public setPopupCallback(Parcel parcel) {
            super(parcel, (ListUtil.ThreeItemImmutableList) c, (byte) 0);
        }

        public setPopupCallback(Map map) {
            super(map, c, (byte) 0);
        }

        @Override // o.newImmutableList.PlaybackStateCompat.CustomAction, android.os.Parcelable
        public final /* bridge */ /* synthetic */ int describeContents() {
            return describeContents();
        }

        @Override // o.newImmutableList.PlaybackStateCompat.CustomAction, android.os.Parcelable
        public final /* bridge */ /* synthetic */ void writeToParcel(Parcel parcel, int i) {
            writeToParcel(parcel, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2-dex2jar.jar:o/newImmutableList$setPrimaryBackground.class */
    public static final class setPrimaryBackground implements ListUtil.OneItemImmutableList.RemoteActionCompatParcelizer<SparseArray> {
        private setPrimaryBackground() {
        }

        /* synthetic */ setPrimaryBackground(byte b) {
            this();
        }

        @Override // o.ListUtil.OneItemImmutableList.RemoteActionCompatParcelizer
        public final /* synthetic */ Parcelable a(SparseArray sparseArray) {
            return new setStackedBackground(sparseArray);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2-dex2jar.jar:o/newImmutableList$setShortcut.class */
    public static final class setShortcut implements ListUtil.OneItemImmutableList.RemoteActionCompatParcelizer<Map> {
        private setShortcut() {
        }

        /* synthetic */ setShortcut(byte b) {
            this();
        }

        @Override // o.ListUtil.OneItemImmutableList.RemoteActionCompatParcelizer
        public final /* synthetic */ Parcelable a(Map map) {
            return new setPopupCallback(map);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2-dex2jar.jar:o/newImmutableList$setSplitBackground.class */
    public static final class setSplitBackground implements ListUtil.OneItemImmutableList.RemoteActionCompatParcelizer<SparseBooleanArray> {
        private setSplitBackground() {
        }

        /* synthetic */ setSplitBackground(byte b) {
            this();
        }

        @Override // o.ListUtil.OneItemImmutableList.RemoteActionCompatParcelizer
        public final /* synthetic */ Parcelable a(SparseBooleanArray sparseBooleanArray) {
            return new setVisibility(sparseBooleanArray);
        }
    }

    /* loaded from: classes2-dex2jar.jar:o/newImmutableList$setStackedBackground.class */
    public static final class setStackedBackground extends PlaybackStateCompat.CustomAction<SparseArray> {
        private static final i e = new i() { // from class: o.newImmutableList.setStackedBackground.2
            @Override // o.i
            public final Object b(Parcel parcel) {
                return ListUtil.OneItemImmutableList.a(parcel.readParcelable(setStackedBackground.class.getClassLoader()));
            }

            @Override // o.i
            public final void b(Object obj, Parcel parcel) {
                parcel.writeParcelable(ListUtil.OneItemImmutableList.e(obj), 0);
            }
        };
        public static final IconCompatParcelizer CREATOR = new IconCompatParcelizer((byte) 0);

        /* loaded from: classes2-dex2jar.jar:o/newImmutableList$setStackedBackground$IconCompatParcelizer.class */
        static final class IconCompatParcelizer implements Parcelable.Creator<setStackedBackground> {
            private IconCompatParcelizer() {
            }

            /* synthetic */ IconCompatParcelizer(byte b) {
                this();
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ setStackedBackground createFromParcel(Parcel parcel) {
                return new setStackedBackground(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ setStackedBackground[] newArray(int i) {
                return new setStackedBackground[i];
            }
        }

        public setStackedBackground(Parcel parcel) {
            super(parcel, (ListUtil.ThreeItemImmutableList) e, (byte) 0);
        }

        public setStackedBackground(SparseArray sparseArray) {
            super(sparseArray, e, (byte) 0);
        }

        @Override // o.newImmutableList.PlaybackStateCompat.CustomAction, android.os.Parcelable
        public final /* bridge */ /* synthetic */ int describeContents() {
            return describeContents();
        }

        @Override // o.newImmutableList.PlaybackStateCompat.CustomAction, android.os.Parcelable
        public final /* bridge */ /* synthetic */ void writeToParcel(Parcel parcel, int i) {
            writeToParcel(parcel, i);
        }
    }

    /* loaded from: classes2-dex2jar.jar:o/newImmutableList$setSubtitle.class */
    public static final class setSubtitle extends PlaybackStateCompat.CustomAction<Set> {
        private static final format a = new format() { // from class: o.newImmutableList.setSubtitle.1
            @Override // o.d
            public final void a(Object obj, Parcel parcel) {
                parcel.writeParcelable(ListUtil.OneItemImmutableList.e(obj), 0);
            }

            @Override // o.d
            public final Object e(Parcel parcel) {
                return ListUtil.OneItemImmutableList.a(parcel.readParcelable(setSubtitle.class.getClassLoader()));
            }
        };
        public static final newImmutableList$setSubtitle$MediaBrowserCompat$CustomActionResultReceiver CREATOR = new newImmutableList$setSubtitle$MediaBrowserCompat$CustomActionResultReceiver((byte) 0);

        public setSubtitle(Parcel parcel) {
            super(parcel, (ListUtil.ThreeItemImmutableList) a, (byte) 0);
        }

        public setSubtitle(Set set) {
            super(set, a, (byte) 0);
        }

        @Override // o.newImmutableList.PlaybackStateCompat.CustomAction, android.os.Parcelable
        public final /* bridge */ /* synthetic */ int describeContents() {
            return describeContents();
        }

        @Override // o.newImmutableList.PlaybackStateCompat.CustomAction, android.os.Parcelable
        public final /* bridge */ /* synthetic */ void writeToParcel(Parcel parcel, int i) {
            writeToParcel(parcel, i);
        }
    }

    /* loaded from: classes2-dex2jar.jar:o/newImmutableList$setTabContainer.class */
    public static final class setTabContainer implements Parcelable, copyToImmutableList<String> {
        public static final IconCompatParcelizer CREATOR = new IconCompatParcelizer((byte) 0);
        private String c;

        /* loaded from: classes2-dex2jar.jar:o/newImmutableList$setTabContainer$IconCompatParcelizer.class */
        static final class IconCompatParcelizer implements Parcelable.Creator<setTabContainer> {
            private IconCompatParcelizer() {
            }

            /* synthetic */ IconCompatParcelizer(byte b) {
                this();
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ setTabContainer createFromParcel(Parcel parcel) {
                return new setTabContainer(parcel, (byte) 0);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ setTabContainer[] newArray(int i) {
                return new setTabContainer[i];
            }
        }

        private setTabContainer(Parcel parcel) {
            this.c = parcel.readString();
        }

        /* synthetic */ setTabContainer(Parcel parcel, byte b) {
            this(parcel);
        }

        private setTabContainer(String str) {
            this.c = str;
        }

        /* synthetic */ setTabContainer(String str, byte b) {
            this(str);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // o.copyToImmutableList
        public final /* bridge */ /* synthetic */ String getParcel() {
            return this.c;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.c);
        }
    }

    /* loaded from: classes2-dex2jar.jar:o/newImmutableList$setTitle.class */
    public static final class setTitle extends PlaybackStateCompat.CustomAction<Set> {
        private static final LogRedirector a = new LogRedirector() { // from class: o.newImmutableList.setTitle.5
            @Override // o.d
            public final void a(Object obj, Parcel parcel) {
                parcel.writeParcelable(ListUtil.OneItemImmutableList.e(obj), 0);
            }

            @Override // o.d
            public final Object e(Parcel parcel) {
                return ListUtil.OneItemImmutableList.a(parcel.readParcelable(setTitle.class.getClassLoader()));
            }
        };
        public static final read CREATOR = new read((byte) 0);

        /* loaded from: classes2-dex2jar.jar:o/newImmutableList$setTitle$read.class */
        static final class read implements Parcelable.Creator<setTitle> {
            private read() {
            }

            /* synthetic */ read(byte b) {
                this();
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ setTitle createFromParcel(Parcel parcel) {
                return new setTitle(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ setTitle[] newArray(int i) {
                return new setTitle[i];
            }
        }

        public setTitle(Parcel parcel) {
            super(parcel, (ListUtil.ThreeItemImmutableList) a, (byte) 0);
        }

        public setTitle(Set set) {
            super(set, a, (byte) 0);
        }

        @Override // o.newImmutableList.PlaybackStateCompat.CustomAction, android.os.Parcelable
        public final /* bridge */ /* synthetic */ int describeContents() {
            return describeContents();
        }

        @Override // o.newImmutableList.PlaybackStateCompat.CustomAction, android.os.Parcelable
        public final /* bridge */ /* synthetic */ void writeToParcel(Parcel parcel, int i) {
            writeToParcel(parcel, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2-dex2jar.jar:o/newImmutableList$setTitleOptional.class */
    public static final class setTitleOptional implements ListUtil.OneItemImmutableList.RemoteActionCompatParcelizer<Map> {
        private setTitleOptional() {
        }

        /* synthetic */ setTitleOptional(byte b) {
            this();
        }

        @Override // o.ListUtil.OneItemImmutableList.RemoteActionCompatParcelizer
        public final /* synthetic */ Parcelable a(Map map) {
            return new setTransitioning(map);
        }
    }

    /* loaded from: classes2-dex2jar.jar:o/newImmutableList$setTransitioning.class */
    public static final class setTransitioning extends PlaybackStateCompat.CustomAction<Map> {
        private static final LogUtil e = new LogUtil() { // from class: o.newImmutableList.setTransitioning.4
            @Override // o.v
            public final Object a(Parcel parcel) {
                return ListUtil.OneItemImmutableList.a(parcel.readParcelable(setPopupCallback.class.getClassLoader()));
            }

            @Override // o.v
            public final void a(Object obj, Parcel parcel) {
                parcel.writeParcelable(ListUtil.OneItemImmutableList.e(obj), 0);
            }

            @Override // o.v
            public final Object c(Parcel parcel) {
                return ListUtil.OneItemImmutableList.a(parcel.readParcelable(setPopupCallback.class.getClassLoader()));
            }

            @Override // o.v
            public final void e(Object obj, Parcel parcel) {
                parcel.writeParcelable(ListUtil.OneItemImmutableList.e(obj), 0);
            }
        };
        public static final read CREATOR = new read((byte) 0);

        /* loaded from: classes2-dex2jar.jar:o/newImmutableList$setTransitioning$read.class */
        static final class read implements Parcelable.Creator<setTransitioning> {
            private read() {
            }

            /* synthetic */ read(byte b) {
                this();
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ setTransitioning createFromParcel(Parcel parcel) {
                return new setTransitioning(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ setTransitioning[] newArray(int i) {
                return new setTransitioning[i];
            }
        }

        public setTransitioning(Parcel parcel) {
            super(parcel, (ListUtil.ThreeItemImmutableList) e, (byte) 0);
        }

        public setTransitioning(Map map) {
            super(map, e, (byte) 0);
        }

        @Override // o.newImmutableList.PlaybackStateCompat.CustomAction, android.os.Parcelable
        public final /* bridge */ /* synthetic */ int describeContents() {
            return describeContents();
        }

        @Override // o.newImmutableList.PlaybackStateCompat.CustomAction, android.os.Parcelable
        public final /* bridge */ /* synthetic */ void writeToParcel(Parcel parcel, int i) {
            writeToParcel(parcel, i);
        }
    }

    /* loaded from: classes2-dex2jar.jar:o/newImmutableList$setVisibility.class */
    public static final class setVisibility extends PlaybackStateCompat.CustomAction<SparseBooleanArray> {
        private static final setLogger<SparseBooleanArray> d = new setLogger<SparseBooleanArray>() { // from class: o.newImmutableList.setVisibility.5
            @Override // o.setLogger
            public final /* synthetic */ void c(SparseBooleanArray sparseBooleanArray, Parcel parcel) {
                parcel.writeSparseBooleanArray(sparseBooleanArray);
            }

            @Override // o.setLogger
            public final /* synthetic */ SparseBooleanArray e(Parcel parcel) {
                return parcel.readSparseBooleanArray();
            }
        };
        public static final write CREATOR = new write((byte) 0);

        /* loaded from: classes2-dex2jar.jar:o/newImmutableList$setVisibility$write.class */
        static final class write implements Parcelable.Creator<setVisibility> {
            private write() {
            }

            /* synthetic */ write(byte b) {
                this();
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ setVisibility createFromParcel(Parcel parcel) {
                return new setVisibility(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ setVisibility[] newArray(int i) {
                return new setVisibility[i];
            }
        }

        public setVisibility(Parcel parcel) {
            super(parcel, (ListUtil.ThreeItemImmutableList) d, (byte) 0);
        }

        public setVisibility(SparseBooleanArray sparseBooleanArray) {
            super(sparseBooleanArray, d, (byte) 0);
        }

        @Override // o.newImmutableList.PlaybackStateCompat.CustomAction, android.os.Parcelable
        public final /* bridge */ /* synthetic */ int describeContents() {
            return describeContents();
        }

        @Override // o.newImmutableList.PlaybackStateCompat.CustomAction, android.os.Parcelable
        public final /* bridge */ /* synthetic */ void writeToParcel(Parcel parcel, int i) {
            writeToParcel(parcel, i);
        }
    }

    /* loaded from: classes2-dex2jar.jar:o/newImmutableList$write.class */
    public static final class write extends PlaybackStateCompat.CustomAction<Boolean> {
        private static final setLogger<Boolean> d = new setLogger<Boolean>() { // from class: o.newImmutableList.write.5
            @Override // o.setLogger
            public final /* synthetic */ void c(Boolean bool, Parcel parcel) {
                parcel.writeBooleanArray(new boolean[]{bool.booleanValue()});
            }

            @Override // o.setLogger
            public final /* synthetic */ Boolean e(Parcel parcel) {
                return Boolean.valueOf(parcel.createBooleanArray()[0]);
            }
        };
        public static final RemoteActionCompatParcelizer CREATOR = new RemoteActionCompatParcelizer((byte) 0);

        /* loaded from: classes2-dex2jar.jar:o/newImmutableList$write$RemoteActionCompatParcelizer.class */
        static final class RemoteActionCompatParcelizer implements Parcelable.Creator<write> {
            private RemoteActionCompatParcelizer() {
            }

            /* synthetic */ RemoteActionCompatParcelizer(byte b) {
                this();
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ write createFromParcel(Parcel parcel) {
                return new write(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ write[] newArray(int i) {
                return new write[i];
            }
        }

        public write(Parcel parcel) {
            super(parcel, (ListUtil.ThreeItemImmutableList) d, (byte) 0);
        }

        public write(boolean z) {
            super(Boolean.valueOf(z), d, (byte) 0);
        }

        @Override // o.newImmutableList.PlaybackStateCompat.CustomAction, android.os.Parcelable
        public final /* bridge */ /* synthetic */ int describeContents() {
            return describeContents();
        }

        @Override // o.newImmutableList.PlaybackStateCompat.CustomAction, android.os.Parcelable
        public final /* bridge */ /* synthetic */ void writeToParcel(Parcel parcel, int i) {
            writeToParcel(parcel, i);
        }
    }

    private newImmutableList() {
        HashMap hashMap = new HashMap();
        this.b = hashMap;
        hashMap.put(Collection.class, new RatingCompat((byte) 0));
        hashMap.put(List.class, new setPadding((byte) 0));
        hashMap.put(ArrayList.class, new setPadding((byte) 0));
        hashMap.put(Set.class, new setGroupDividerEnabled((byte) 0));
        hashMap.put(HashSet.class, new setGroupDividerEnabled((byte) 0));
        hashMap.put(TreeSet.class, new setCustomView((byte) 0));
        hashMap.put(SparseArray.class, new setPrimaryBackground((byte) 0));
        hashMap.put(Map.class, new setShortcut((byte) 0));
        hashMap.put(HashMap.class, new setShortcut((byte) 0));
        hashMap.put(TreeMap.class, new setTitleOptional((byte) 0));
        hashMap.put(Integer.class, new newImmutableList$ComponentActivity$4((byte) 0));
        hashMap.put(Long.class, new setItemInvoker((byte) 0));
        hashMap.put(Double.class, new setContentView((byte) 0));
        hashMap.put(Float.class, new newImmutableList$ComponentActivity$3((byte) 0));
        hashMap.put(Byte.class, new MediaDescriptionCompat((byte) 0));
        hashMap.put(String.class, new setActionBarHideOffset((byte) 0));
        hashMap.put(Character.class, new newImmutableList$MediaSessionCompat$QueueItem((byte) 0));
        hashMap.put(Boolean.class, new newImmutableList$MediaBrowserCompat$CustomActionResultReceiver((byte) 0));
        hashMap.put(byte[].class, new newImmutableList$MediaBrowserCompat$MediaItem((byte) 0));
        hashMap.put(char[].class, new newImmutableList$MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver((byte) 0));
        hashMap.put(boolean[].class, new RemoteActionCompatParcelizer((byte) 0));
        hashMap.put(IBinder.class, new newImmutableList$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable((byte) 0));
        hashMap.put(Bundle.class, new IconCompatParcelizer((byte) 0));
        hashMap.put(SparseBooleanArray.class, new setSplitBackground((byte) 0));
        hashMap.put(LinkedList.class, new setChecked((byte) 0));
        hashMap.put(LinkedHashMap.class, new setCheckable((byte) 0));
        hashMap.put(SortedMap.class, new setTitleOptional((byte) 0));
        hashMap.put(SortedSet.class, new setCustomView((byte) 0));
        hashMap.put(LinkedHashSet.class, new Keep((byte) 0));
    }

    public static newImmutableList a() {
        return c;
    }

    @Override // o.ListUtil.FourItemImmutableList
    public final Map<Class, ListUtil.OneItemImmutableList.RemoteActionCompatParcelizer> c() {
        return this.b;
    }
}
