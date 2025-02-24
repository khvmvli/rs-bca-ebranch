package o;

import android.media.browse.MediaBrowser;
import android.os.Parcel;
/* loaded from: classes-dex2jar.jar:o/read.class */
public class read {

    /* loaded from: classes-dex2jar.jar:o/read$RemoteActionCompatParcelizer.class */
    static class RemoteActionCompatParcelizer<T extends AbstractC0005read> extends MediaBrowser.ItemCallback {
        protected final T c;

        public RemoteActionCompatParcelizer(T t) {
            this.c = t;
        }

        @Override // android.media.browse.MediaBrowser.ItemCallback
        public void onError(String str) {
            this.c.b(str);
        }

        @Override // android.media.browse.MediaBrowser.ItemCallback
        public void onItemLoaded(MediaBrowser.MediaItem mediaItem) {
            if (mediaItem == null) {
                this.c.b(null);
                return;
            }
            Parcel obtain = Parcel.obtain();
            mediaItem.writeToParcel(obtain, 0);
            this.c.b(obtain);
        }
    }

    /* renamed from: o.read$read  reason: collision with other inner class name */
    /* loaded from: classes-dex2jar.jar:o/read$read.class */
    public interface AbstractC0005read {
        void b(Parcel parcel);

        void b(String str);
    }

    public static Object c(AbstractC0005read read) {
        return new RemoteActionCompatParcelizer(read);
    }
}
