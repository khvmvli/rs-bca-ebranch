package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;
import o.RemoteActionCompatParcelizer;
import o.setThumbTextPadding;
/* loaded from: classes-dex2jar.jar:android/support/v4/media/MediaMetadataCompat.class */
public final class MediaMetadataCompat implements Parcelable {
    static final setThumbTextPadding<String, Integer> e;
    final Bundle b;
    private Object h;
    private static final String[] a = {"android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.ALBUM", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.WRITER", "android.media.metadata.AUTHOR", "android.media.metadata.COMPOSER"};
    private static final String[] c = {"android.media.metadata.DISPLAY_ICON", "android.media.metadata.ART", "android.media.metadata.ALBUM_ART"};
    private static final String[] d = {"android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.ART_URI", "android.media.metadata.ALBUM_ART_URI"};
    public static final Parcelable.Creator<MediaMetadataCompat> CREATOR = new Parcelable.Creator<MediaMetadataCompat>() { // from class: android.support.v4.media.MediaMetadataCompat.2
        /* renamed from: d */
        public final MediaMetadataCompat[] newArray(int i) {
            return new MediaMetadataCompat[i];
        }

        /* renamed from: e */
        public final MediaMetadataCompat createFromParcel(Parcel parcel) {
            return new MediaMetadataCompat(parcel);
        }
    };

    static {
        setThumbTextPadding<String, Integer> setthumbtextpadding = new setThumbTextPadding<>();
        e = setthumbtextpadding;
        setthumbtextpadding.put("android.media.metadata.TITLE", 1);
        setthumbtextpadding.put("android.media.metadata.ARTIST", 1);
        setthumbtextpadding.put("android.media.metadata.DURATION", 0);
        setthumbtextpadding.put("android.media.metadata.ALBUM", 1);
        setthumbtextpadding.put("android.media.metadata.AUTHOR", 1);
        setthumbtextpadding.put("android.media.metadata.WRITER", 1);
        setthumbtextpadding.put("android.media.metadata.COMPOSER", 1);
        setthumbtextpadding.put("android.media.metadata.COMPILATION", 1);
        setthumbtextpadding.put("android.media.metadata.DATE", 1);
        setthumbtextpadding.put("android.media.metadata.YEAR", 0);
        setthumbtextpadding.put("android.media.metadata.GENRE", 1);
        setthumbtextpadding.put("android.media.metadata.TRACK_NUMBER", 0);
        setthumbtextpadding.put("android.media.metadata.NUM_TRACKS", 0);
        setthumbtextpadding.put("android.media.metadata.DISC_NUMBER", 0);
        setthumbtextpadding.put("android.media.metadata.ALBUM_ARTIST", 1);
        setthumbtextpadding.put("android.media.metadata.ART", 2);
        setthumbtextpadding.put("android.media.metadata.ART_URI", 1);
        setthumbtextpadding.put("android.media.metadata.ALBUM_ART", 2);
        setthumbtextpadding.put("android.media.metadata.ALBUM_ART_URI", 1);
        setthumbtextpadding.put("android.media.metadata.USER_RATING", 3);
        setthumbtextpadding.put("android.media.metadata.RATING", 3);
        setthumbtextpadding.put("android.media.metadata.DISPLAY_TITLE", 1);
        setthumbtextpadding.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        setthumbtextpadding.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        setthumbtextpadding.put("android.media.metadata.DISPLAY_ICON", 2);
        setthumbtextpadding.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        setthumbtextpadding.put("android.media.metadata.MEDIA_ID", 1);
        setthumbtextpadding.put("android.media.metadata.BT_FOLDER_TYPE", 0);
        setthumbtextpadding.put("android.media.metadata.MEDIA_URI", 1);
        setthumbtextpadding.put("android.media.metadata.ADVERTISEMENT", 0);
        setthumbtextpadding.put("android.media.metadata.DOWNLOAD_STATUS", 0);
    }

    MediaMetadataCompat(Parcel parcel) {
        this.b = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
    }

    public static MediaMetadataCompat d(Object obj) {
        if (obj == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        RemoteActionCompatParcelizer.c(obj, obtain, 0);
        obtain.setDataPosition(0);
        MediaMetadataCompat createFromParcel = CREATOR.createFromParcel(obtain);
        obtain.recycle();
        createFromParcel.h = obj;
        return createFromParcel;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.b);
    }
}
