package android.support.v4.media.session;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o.MediaBrowserCompat$ItemReceiver;
import o.MediaBrowserCompat$MediaItem;
/* loaded from: classes-dex2jar.jar:android/support/v4/media/session/MediaSessionCompat.class */
public class MediaSessionCompat {

    /* loaded from: classes-dex2jar.jar:android/support/v4/media/session/MediaSessionCompat$QueueItem.class */
    public static final class QueueItem implements Parcelable {
        public static final Parcelable.Creator<QueueItem> CREATOR = new Parcelable.Creator<QueueItem>() { // from class: android.support.v4.media.session.MediaSessionCompat.QueueItem.2
            /* renamed from: b */
            public final QueueItem[] newArray(int i) {
                return new QueueItem[i];
            }

            /* renamed from: e */
            public final QueueItem createFromParcel(Parcel parcel) {
                return new QueueItem(parcel);
            }
        };
        private final MediaDescriptionCompat b;
        private Object c;
        private final long e;

        QueueItem(Parcel parcel) {
            this.b = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            this.e = parcel.readLong();
        }

        private QueueItem(Object obj, MediaDescriptionCompat mediaDescriptionCompat, long j) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("Description cannot be null.");
            } else if (j != -1) {
                this.b = mediaDescriptionCompat;
                this.e = j;
                this.c = obj;
            } else {
                throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
            }
        }

        public static QueueItem b(Object obj) {
            if (obj != null) {
                return new QueueItem(obj, MediaDescriptionCompat.b(MediaBrowserCompat$MediaItem.RemoteActionCompatParcelizer.e(obj)), MediaBrowserCompat$MediaItem.RemoteActionCompatParcelizer.a(obj));
            }
            return null;
        }

        public static List<QueueItem> e(List<?> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            Iterator<?> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(b(it.next()));
            }
            return arrayList;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // java.lang.Object
        public final String toString() {
            StringBuilder sb = new StringBuilder("MediaSession.QueueItem {Description=");
            sb.append(this.b);
            sb.append(", Id=");
            sb.append(this.e);
            sb.append(" }");
            return sb.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.b.writeToParcel(parcel, i);
            parcel.writeLong(this.e);
        }
    }

    /* loaded from: classes-dex2jar.jar:android/support/v4/media/session/MediaSessionCompat$ResultReceiverWrapper.class */
    public static final class ResultReceiverWrapper implements Parcelable {
        public static final Parcelable.Creator<ResultReceiverWrapper> CREATOR = new Parcelable.Creator<ResultReceiverWrapper>() { // from class: android.support.v4.media.session.MediaSessionCompat.ResultReceiverWrapper.2
            /* renamed from: c */
            public final ResultReceiverWrapper createFromParcel(Parcel parcel) {
                return new ResultReceiverWrapper(parcel);
            }

            /* renamed from: c */
            public final ResultReceiverWrapper[] newArray(int i) {
                return new ResultReceiverWrapper[i];
            }
        };
        ResultReceiver b;

        ResultReceiverWrapper(Parcel parcel) {
            this.b = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.b.writeToParcel(parcel, i);
        }
    }

    /* loaded from: classes-dex2jar.jar:android/support/v4/media/session/MediaSessionCompat$Token.class */
    public static final class Token implements Parcelable {
        public static final Parcelable.Creator<Token> CREATOR = new Parcelable.Creator<Token>() { // from class: android.support.v4.media.session.MediaSessionCompat.Token.5
            /* renamed from: a */
            public final Token createFromParcel(Parcel parcel) {
                return new Token(parcel.readParcelable(null));
            }

            /* renamed from: a */
            public final Token[] newArray(int i) {
                return new Token[i];
            }
        };
        private MediaBrowserCompat$ItemReceiver a;
        private final Object c;
        private Bundle e;

        Token(Object obj) {
            this(obj, null, null);
        }

        Token(Object obj, MediaBrowserCompat$ItemReceiver mediaBrowserCompat$ItemReceiver, Bundle bundle) {
            this.c = obj;
            this.a = mediaBrowserCompat$ItemReceiver;
            this.e = bundle;
        }

        public final MediaBrowserCompat$ItemReceiver a() {
            return this.a;
        }

        public final void c(MediaBrowserCompat$ItemReceiver mediaBrowserCompat$ItemReceiver) {
            this.a = mediaBrowserCompat$ItemReceiver;
        }

        public final void d(Bundle bundle) {
            this.e = bundle;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // java.lang.Object
        public final boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Token)) {
                return false;
            }
            Token token = (Token) obj;
            Object obj2 = this.c;
            if (obj2 == null) {
                if (token.c != null) {
                    z = false;
                }
                return z;
            }
            Object obj3 = token.c;
            if (obj3 == null) {
                return false;
            }
            return obj2.equals(obj3);
        }

        @Override // java.lang.Object
        public final int hashCode() {
            Object obj = this.c;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable((Parcelable) this.c, i);
        }
    }

    public static void d(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MediaSessionCompat.class.getClassLoader());
        }
    }
}
