package o;

import android.content.Intent;
import com.google.android.gms.common.api.Scope;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Set;
import o.setCitizenValue;
/* loaded from: classes-dex2jar.jar:o/realmGet$name$MediaBrowserCompat$SearchResultReceiver.class */
public interface realmGet$name$MediaBrowserCompat$SearchResultReceiver extends realmGet$name$MediaBrowserCompat$CustomActionResultReceiver {
    int a();

    void a(setCitizenValue.RemoteActionCompatParcelizer remoteActionCompatParcelizer);

    void a(setExpID setexpid, Set<Scope> set);

    String b();

    void c(String str);

    void c(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    void c(setCitizenValue.write write);

    realmGet$job[] c();

    String d();

    void e();

    boolean f();

    boolean g();

    Intent h();

    Set<Scope> i();

    boolean j();

    boolean n();

    boolean o();
}
