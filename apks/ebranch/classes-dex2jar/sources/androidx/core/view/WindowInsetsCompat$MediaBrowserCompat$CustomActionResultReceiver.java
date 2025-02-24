package androidx.core.view;

import android.graphics.Insets;
import android.view.WindowInsets;
import androidx.core.view.WindowInsetsCompat;
import o.hashCode;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:androidx/core/view/WindowInsetsCompat$MediaBrowserCompat$CustomActionResultReceiver.class */
public class WindowInsetsCompat$MediaBrowserCompat$CustomActionResultReceiver extends WindowInsetsCompat.read {
    final WindowInsets.Builder b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public WindowInsetsCompat$MediaBrowserCompat$CustomActionResultReceiver() {
        this.b = new WindowInsets.Builder();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public WindowInsetsCompat$MediaBrowserCompat$CustomActionResultReceiver(WindowInsetsCompat windowInsetsCompat) {
        WindowInsets n = windowInsetsCompat.n();
        this.b = n != null ? new WindowInsets.Builder(n) : new WindowInsets.Builder();
    }

    @Override // androidx.core.view.WindowInsetsCompat.read
    void a(hashCode hashcode) {
        this.b.setSystemWindowInsets(Insets.of(hashcode.e, hashcode.a, hashcode.c, hashcode.d));
    }

    @Override // androidx.core.view.WindowInsetsCompat.read
    void b(hashCode hashcode) {
        this.b.setMandatorySystemGestureInsets(Insets.of(hashcode.e, hashcode.a, hashcode.c, hashcode.d));
    }

    @Override // androidx.core.view.WindowInsetsCompat.read
    void c(hashCode hashcode) {
        this.b.setStableInsets(Insets.of(hashcode.e, hashcode.a, hashcode.c, hashcode.d));
    }

    @Override // androidx.core.view.WindowInsetsCompat.read
    void d(hashCode hashcode) {
        this.b.setSystemGestureInsets(Insets.of(hashcode.e, hashcode.a, hashcode.c, hashcode.d));
    }

    @Override // androidx.core.view.WindowInsetsCompat.read
    WindowInsetsCompat e() {
        a();
        WindowInsetsCompat c = WindowInsetsCompat.c(this.b.build());
        c.a(this.d);
        return c;
    }

    @Override // androidx.core.view.WindowInsetsCompat.read
    void e(hashCode hashcode) {
        this.b.setTappableElementInsets(Insets.of(hashcode.e, hashcode.a, hashcode.c, hashcode.d));
    }
}
