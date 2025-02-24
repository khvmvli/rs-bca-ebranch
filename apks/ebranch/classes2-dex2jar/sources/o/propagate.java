package o;

import android.os.Bundle;
import android.util.Log;
/* loaded from: classes2-dex2jar.jar:o/propagate.class */
public abstract class propagate<T> {
    protected final Stetho$PluginBuilder a;

    /* JADX INFO: Access modifiers changed from: protected */
    public final T b(ArrayListAccumulator arrayListAccumulator, boolean z, Bundle bundle) {
        int i;
        if (arrayListAccumulator.e()) {
            return null;
        }
        Bundle bundle2 = bundle != null ? (Bundle) bundle.clone() : new Bundle();
        if (!bundle2.containsKey("de.greenrobot.eventbus.errordialog.title")) {
            bundle2.putString("de.greenrobot.eventbus.errordialog.title", this.a.f.getString(this.a.c));
        }
        if (!bundle2.containsKey("de.greenrobot.eventbus.errordialog.message")) {
            Stetho$PluginBuilder stetho$PluginBuilder = this.a;
            Throwable th = arrayListAccumulator.a;
            Integer d = stetho$PluginBuilder.i.d(th);
            if (d != null) {
                i = d.intValue();
            } else {
                String str = documentProvider.a;
                StringBuilder sb = new StringBuilder("No specific message ressource ID found for ");
                sb.append(th);
                Log.d(str, sb.toString());
                i = stetho$PluginBuilder.d;
            }
            bundle2.putString("de.greenrobot.eventbus.errordialog.message", this.a.f.getString(i));
        }
        if (!bundle2.containsKey("de.greenrobot.eventbus.errordialog.finish_after_dialog")) {
            bundle2.putBoolean("de.greenrobot.eventbus.errordialog.finish_after_dialog", z);
        }
        if (!bundle2.containsKey("de.greenrobot.eventbus.errordialog.event_type_on_close") && this.a.b != null) {
            bundle2.putSerializable("de.greenrobot.eventbus.errordialog.event_type_on_close", this.a.b);
        }
        if (!bundle2.containsKey("de.greenrobot.eventbus.errordialog.icon_id") && this.a.e != 0) {
            bundle2.putInt("de.greenrobot.eventbus.errordialog.icon_id", this.a.e);
        }
        return d();
    }

    protected abstract T d();
}
