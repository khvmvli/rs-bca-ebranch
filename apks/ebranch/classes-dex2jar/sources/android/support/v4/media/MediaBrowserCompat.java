package android.support.v4.media;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import o.MediaSessionCompat$Token;
import o.read;
/* loaded from: classes-dex2jar.jar:android/support/v4/media/MediaBrowserCompat.class */
public final class MediaBrowserCompat {
    static final boolean d = Log.isLoggable("MediaBrowserCompat", 3);

    /* loaded from: classes-dex2jar.jar:android/support/v4/media/MediaBrowserCompat$CustomActionResultReceiver.class */
    static class CustomActionResultReceiver extends MediaSessionCompat$Token {
        private final String c;
        private final IconCompatParcelizer d;
        private final Bundle j;

        @Override // o.MediaSessionCompat$Token
        public void c(int i, Bundle bundle) {
            if (this.d != null) {
                MediaSessionCompat.d(bundle);
                if (i == -1) {
                    this.d.e(this.c, this.j, bundle);
                } else if (i == 0) {
                    this.d.b(this.c, this.j, bundle);
                } else if (i != 1) {
                    StringBuilder sb = new StringBuilder("Unknown result code: ");
                    sb.append(i);
                    sb.append(" (extras=");
                    sb.append(this.j);
                    sb.append(", resultData=");
                    sb.append(bundle);
                    sb.append(")");
                    Log.w("MediaBrowserCompat", sb.toString());
                } else {
                    this.d.c(this.c, this.j, bundle);
                }
            }
        }
    }

    /* loaded from: classes-dex2jar.jar:android/support/v4/media/MediaBrowserCompat$IconCompatParcelizer.class */
    public static abstract class IconCompatParcelizer {
        public void b(String str, Bundle bundle, Bundle bundle2) {
        }

        public void c(String str, Bundle bundle, Bundle bundle2) {
        }

        public void e(String str, Bundle bundle, Bundle bundle2) {
        }
    }

    /* loaded from: classes-dex2jar.jar:android/support/v4/media/MediaBrowserCompat$ItemReceiver.class */
    static class ItemReceiver extends MediaSessionCompat$Token {
        private final String c;
        private final read d;

        @Override // o.MediaSessionCompat$Token
        public void c(int i, Bundle bundle) {
            MediaSessionCompat.d(bundle);
            if (i != 0 || bundle == null || !bundle.containsKey("media_item")) {
                this.d.d(this.c);
                return;
            }
            Parcelable parcelable = bundle.getParcelable("media_item");
            if (parcelable == null || (parcelable instanceof MediaItem)) {
                this.d.d((MediaItem) parcelable);
            } else {
                this.d.d(this.c);
            }
        }
    }

    /* loaded from: classes-dex2jar.jar:android/support/v4/media/MediaBrowserCompat$MediaItem.class */
    public static class MediaItem implements Parcelable {
        public static final Parcelable.Creator<MediaItem> CREATOR = new Parcelable.Creator<MediaItem>() { // from class: android.support.v4.media.MediaBrowserCompat.MediaItem.1
            /* renamed from: c */
            public final MediaItem createFromParcel(Parcel parcel) {
                return new MediaItem(parcel);
            }

            /* renamed from: c */
            public final MediaItem[] newArray(int i) {
                return new MediaItem[i];
            }
        };
        private final MediaDescriptionCompat a;
        private final int d;

        MediaItem(Parcel parcel) {
            this.d = parcel.readInt();
            this.a = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // java.lang.Object
        public String toString() {
            StringBuilder sb = new StringBuilder("MediaItem{mFlags=");
            sb.append(this.d);
            sb.append(", mDescription=");
            sb.append(this.a);
            sb.append('}');
            return sb.toString();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.d);
            this.a.writeToParcel(parcel, i);
        }
    }

    /* loaded from: classes-dex2jar.jar:android/support/v4/media/MediaBrowserCompat$SearchResultReceiver.class */
    static class SearchResultReceiver extends MediaSessionCompat$Token {
        private final Bundle c;
        private final write d;
        private final String g;

        @Override // o.MediaSessionCompat$Token
        public void c(int i, Bundle bundle) {
            ArrayList arrayList;
            MediaSessionCompat.d(bundle);
            if (i != 0 || bundle == null || !bundle.containsKey("search_results")) {
                this.d.b(this.g, this.c);
                return;
            }
            Parcelable[] parcelableArray = bundle.getParcelableArray("search_results");
            if (parcelableArray != null) {
                ArrayList arrayList2 = new ArrayList();
                int length = parcelableArray.length;
                int i2 = 0;
                while (true) {
                    arrayList = arrayList2;
                    if (i2 >= length) {
                        break;
                    }
                    arrayList2.add((MediaItem) parcelableArray[i2]);
                    i2++;
                }
            } else {
                arrayList = null;
            }
            this.d.c(this.g, this.c, arrayList);
        }
    }

    /* loaded from: classes-dex2jar.jar:android/support/v4/media/MediaBrowserCompat$read.class */
    public static abstract class read {
        final Object d;

        /* loaded from: classes-dex2jar.jar:android/support/v4/media/MediaBrowserCompat$read$RemoteActionCompatParcelizer.class */
        class RemoteActionCompatParcelizer implements read.AbstractC0005read {
            RemoteActionCompatParcelizer() {
            }

            @Override // o.read.AbstractC0005read
            public void b(Parcel parcel) {
                if (parcel == null) {
                    read.this.d((MediaItem) null);
                    return;
                }
                parcel.setDataPosition(0);
                MediaItem createFromParcel = MediaItem.CREATOR.createFromParcel(parcel);
                parcel.recycle();
                read.this.d(createFromParcel);
            }

            @Override // o.read.AbstractC0005read
            public void b(String str) {
                read.this.d(str);
            }
        }

        public read() {
            if (Build.VERSION.SDK_INT >= 23) {
                this.d = o.read.c(new RemoteActionCompatParcelizer());
            } else {
                this.d = null;
            }
        }

        public void d(MediaItem mediaItem) {
        }

        public void d(String str) {
        }
    }

    /* loaded from: classes-dex2jar.jar:android/support/v4/media/MediaBrowserCompat$write.class */
    public static abstract class write {
        public void b(String str, Bundle bundle) {
        }

        public void c(String str, Bundle bundle, List<MediaItem> list) {
        }
    }
}
