package o;

import android.widget.ListView;
/* loaded from: classes-dex2jar.jar:o/getLayoutInflater.class */
public final class getLayoutInflater {
    public static void b(ListView listView, int i) {
        listView.scrollListBy(i);
    }

    public static boolean c(ListView listView, int i) {
        return listView.canScrollList(i);
    }
}
