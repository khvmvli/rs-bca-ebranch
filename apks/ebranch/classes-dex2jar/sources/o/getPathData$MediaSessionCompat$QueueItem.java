package o;

import android.view.View;
import java.util.Comparator;
import o.getPathData;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/getPathData$MediaSessionCompat$QueueItem.class */
public final class getPathData$MediaSessionCompat$QueueItem implements Comparator<View> {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(View view, View view2) {
        getPathData.RemoteActionCompatParcelizer remoteActionCompatParcelizer = (getPathData.RemoteActionCompatParcelizer) view.getLayoutParams();
        getPathData.RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = (getPathData.RemoteActionCompatParcelizer) view2.getLayoutParams();
        if (remoteActionCompatParcelizer.d == remoteActionCompatParcelizer2.d) {
            return remoteActionCompatParcelizer.c - remoteActionCompatParcelizer2.c;
        }
        return remoteActionCompatParcelizer.d ? 1 : -1;
    }
}
