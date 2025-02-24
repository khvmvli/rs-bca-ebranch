package o;

import android.database.Cursor;
import android.database.SQLException;
import android.os.CancellationSignal;
import android.util.Pair;
import java.io.Closeable;
import java.util.List;
/* loaded from: classes-dex2jar.jar:o/setOnScrollListener.class */
public interface setOnScrollListener extends Closeable {
    Recreator a(String str);

    void a();

    Cursor b(setRecycledViewPool setrecycledviewpool, CancellationSignal cancellationSignal);

    List<Pair<String, String>> b();

    void b(String str) throws SQLException;

    void c();

    Cursor d(String str);

    String d();

    void d(int i);

    Cursor e(setRecycledViewPool setrecycledviewpool);

    void e();

    boolean f();

    void g();

    boolean h();

    boolean i();
}
