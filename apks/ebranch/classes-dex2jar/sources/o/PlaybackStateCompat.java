package o;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
/* loaded from: classes-dex2jar.jar:o/PlaybackStateCompat.class */
public final class PlaybackStateCompat {
    public volatile Context a;
    public final Set<ParcelableVolumeInfo> b = new CopyOnWriteArraySet();

    /* loaded from: classes-dex2jar.jar:o/PlaybackStateCompat$CustomAction.class */
    public interface CustomAction<O> {
        void a(O o2);
    }
}
