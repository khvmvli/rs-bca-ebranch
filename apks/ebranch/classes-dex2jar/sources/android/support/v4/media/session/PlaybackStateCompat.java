package android.support.v4.media.session;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import o.MediaDescriptionCompat;
import o.MediaMetadataCompat;
/* loaded from: classes-dex2jar.jar:android/support/v4/media/session/PlaybackStateCompat.class */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new Parcelable.Creator<PlaybackStateCompat>() { // from class: android.support.v4.media.session.PlaybackStateCompat.4
        /* renamed from: e */
        public final PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        /* renamed from: e */
        public final PlaybackStateCompat[] newArray(int i) {
            return new PlaybackStateCompat[i];
        }
    };
    final int a;
    List<CustomAction> b;
    final long c;
    final long d;
    final long e;
    final float f;
    final int g;
    final Bundle h;
    final long i;
    final CharSequence j;
    private Object m;

    /* renamed from: o  reason: collision with root package name */
    final long f2o;

    /* loaded from: classes-dex2jar.jar:android/support/v4/media/session/PlaybackStateCompat$CustomAction.class */
    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new Parcelable.Creator<CustomAction>() { // from class: android.support.v4.media.session.PlaybackStateCompat.CustomAction.1
            /* renamed from: a */
            public final CustomAction[] newArray(int i) {
                return new CustomAction[i];
            }

            /* renamed from: e */
            public final CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }
        };
        private final int a;
        private final String b;
        private final CharSequence c;
        private Object d;
        private final Bundle e;

        CustomAction(Parcel parcel) {
            this.b = parcel.readString();
            this.c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.a = parcel.readInt();
            this.e = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }

        CustomAction(String str, CharSequence charSequence, int i, Bundle bundle) {
            this.b = str;
            this.c = charSequence;
            this.a = i;
            this.e = bundle;
        }

        public static CustomAction b(Object obj) {
            if (obj == null) {
                return null;
            }
            CustomAction customAction = new CustomAction(MediaDescriptionCompat.write.d(obj), MediaDescriptionCompat.write.c(obj), MediaDescriptionCompat.write.b(obj), MediaDescriptionCompat.write.e(obj));
            customAction.d = obj;
            return customAction;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // java.lang.Object
        public final String toString() {
            StringBuilder sb = new StringBuilder("Action:mName='");
            sb.append((Object) this.c);
            sb.append(", mIcon=");
            sb.append(this.a);
            sb.append(", mExtras=");
            sb.append(this.e);
            return sb.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.b);
            TextUtils.writeToParcel(this.c, parcel, i);
            parcel.writeInt(this.a);
            parcel.writeBundle(this.e);
        }
    }

    PlaybackStateCompat(int i, long j, long j2, float f, long j3, int i2, CharSequence charSequence, long j4, List<CustomAction> list, long j5, Bundle bundle) {
        this.g = i;
        this.i = j;
        this.c = j2;
        this.f = f;
        this.e = j3;
        this.a = i2;
        this.j = charSequence;
        this.f2o = j4;
        this.b = new ArrayList(list);
        this.d = j5;
        this.h = bundle;
    }

    PlaybackStateCompat(Parcel parcel) {
        this.g = parcel.readInt();
        this.i = parcel.readLong();
        this.f = parcel.readFloat();
        this.f2o = parcel.readLong();
        this.c = parcel.readLong();
        this.e = parcel.readLong();
        this.j = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.b = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.d = parcel.readLong();
        this.h = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.a = parcel.readInt();
    }

    public static PlaybackStateCompat a(Object obj) {
        ArrayList arrayList;
        PlaybackStateCompat playbackStateCompat = null;
        Bundle bundle = null;
        if (obj != null) {
            List<Object> c = MediaDescriptionCompat.c(obj);
            if (c != null) {
                arrayList = new ArrayList(c.size());
                for (Object obj2 : c) {
                    arrayList.add(CustomAction.b(obj2));
                }
            } else {
                arrayList = null;
            }
            if (Build.VERSION.SDK_INT >= 22) {
                bundle = MediaMetadataCompat.d(obj);
            }
            playbackStateCompat = new PlaybackStateCompat(MediaDescriptionCompat.h(obj), MediaDescriptionCompat.j(obj), MediaDescriptionCompat.d(obj), MediaDescriptionCompat.g(obj), MediaDescriptionCompat.e(obj), 0, MediaDescriptionCompat.b(obj), MediaDescriptionCompat.f(obj), arrayList, MediaDescriptionCompat.a(obj), bundle);
            playbackStateCompat.m = obj;
        }
        return playbackStateCompat;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Object
    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaybackState {state=");
        sb.append(this.g);
        sb.append(", position=");
        sb.append(this.i);
        sb.append(", buffered position=");
        sb.append(this.c);
        sb.append(", speed=");
        sb.append(this.f);
        sb.append(", updated=");
        sb.append(this.f2o);
        sb.append(", actions=");
        sb.append(this.e);
        sb.append(", error code=");
        sb.append(this.a);
        sb.append(", error message=");
        sb.append(this.j);
        sb.append(", custom actions=");
        sb.append(this.b);
        sb.append(", active item id=");
        sb.append(this.d);
        sb.append("}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.g);
        parcel.writeLong(this.i);
        parcel.writeFloat(this.f);
        parcel.writeLong(this.f2o);
        parcel.writeLong(this.c);
        parcel.writeLong(this.e);
        TextUtils.writeToParcel(this.j, parcel, i);
        parcel.writeTypedList(this.b);
        parcel.writeLong(this.d);
        parcel.writeBundle(this.h);
        parcel.writeInt(this.a);
    }
}
