package o;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.messaging.Constants;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2-dex2jar.jar:o/WaktuHabisDialog.class */
public final class WaktuHabisDialog {
    final SharedPreferences a;
    private final Executor h;
    final ArrayDeque<String> d = new ArrayDeque<>();
    private boolean c = false;
    final String e = "topic_operation_queue";
    final String b = ",";

    private WaktuHabisDialog(SharedPreferences sharedPreferences, Executor executor) {
        this.a = sharedPreferences;
        this.h = executor;
    }

    public static WaktuHabisDialog a(SharedPreferences sharedPreferences, Executor executor) {
        WaktuHabisDialog waktuHabisDialog = new WaktuHabisDialog(sharedPreferences, executor);
        synchronized (waktuHabisDialog.d) {
            waktuHabisDialog.d.clear();
            String string = waktuHabisDialog.a.getString(waktuHabisDialog.e, "");
            if (!TextUtils.isEmpty(string) && string.contains(waktuHabisDialog.b)) {
                String[] split = string.split(waktuHabisDialog.b, -1);
                int length = split.length;
                int i = 0;
                if (length == 0) {
                    Log.e(Constants.TAG, "Corrupted queue. Please check the queue contents and item separator provided");
                    i = 0;
                }
                while (i < length) {
                    String str = split[i];
                    if (!TextUtils.isEmpty(str)) {
                        waktuHabisDialog.d.add(str);
                    }
                    i++;
                }
            }
        }
        return waktuHabisDialog;
    }

    private boolean d(boolean z) {
        boolean z2 = z;
        if (z) {
            z2 = z;
            if (!this.c) {
                this.h.execute(new Runnable(this) { // from class: o.WaktuHabisDialog_ViewBinding
                    private final WaktuHabisDialog b;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.b = r4;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        WaktuHabisDialog waktuHabisDialog = this.b;
                        synchronized (waktuHabisDialog.d) {
                            SharedPreferences.Editor edit = waktuHabisDialog.a.edit();
                            String str = waktuHabisDialog.e;
                            StringBuilder sb = new StringBuilder();
                            Iterator<String> it = waktuHabisDialog.d.iterator();
                            while (it.hasNext()) {
                                sb.append(it.next());
                                sb.append(waktuHabisDialog.b);
                            }
                            edit.putString(str, sb.toString()).commit();
                        }
                    }
                });
                z2 = true;
            }
        }
        return z2;
    }

    public final boolean c(String str) {
        boolean add;
        if (TextUtils.isEmpty(str) || str.contains(this.b)) {
            return false;
        }
        synchronized (this.d) {
            add = this.d.add(str);
            d(add);
        }
        return add;
    }

    public final String e() {
        String peek;
        synchronized (this.d) {
            peek = this.d.peek();
        }
        return peek;
    }

    public final boolean e(Object obj) {
        boolean remove;
        synchronized (this.d) {
            remove = this.d.remove(obj);
            d(remove);
        }
        return remove;
    }
}
