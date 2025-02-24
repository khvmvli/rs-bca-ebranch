package o;

import android.os.Bundle;
import android.widget.RemoteViews;
import o.ParseException;
/* loaded from: classes-dex2jar.jar:o/ParseException$MediaBrowserCompat$SearchResultReceiver.class */
public abstract class ParseException$MediaBrowserCompat$SearchResultReceiver {
    CharSequence a;
    boolean b = false;
    protected ParseException.RemoteActionCompatParcelizer d;
    CharSequence e;

    public RemoteViews a(OperationCanceledException operationCanceledException) {
        return null;
    }

    public RemoteViews b(OperationCanceledException operationCanceledException) {
        return null;
    }

    public void b(Bundle bundle) {
        if (this.b) {
            bundle.putCharSequence("android.summaryText", this.a);
        }
        CharSequence charSequence = this.e;
        if (charSequence != null) {
            bundle.putCharSequence("android.title.big", charSequence);
        }
        String e = e();
        if (e != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", e);
        }
    }

    public RemoteViews c(OperationCanceledException operationCanceledException) {
        return null;
    }

    public void d(ParseException.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        if (this.d != remoteActionCompatParcelizer) {
            this.d = remoteActionCompatParcelizer;
            if (remoteActionCompatParcelizer != null) {
                remoteActionCompatParcelizer.a(this);
            }
        }
    }

    protected String e() {
        return null;
    }

    public void e(OperationCanceledException operationCanceledException) {
    }
}
