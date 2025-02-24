package o;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import o.ParseException;
/* loaded from: classes-dex2jar.jar:o/ParseException$MediaBrowserCompat$CustomActionResultReceiver.class */
public class ParseException$MediaBrowserCompat$CustomActionResultReceiver {
    @Deprecated
    public int a;
    final Bundle b;
    public PendingIntent c;
    boolean d;
    public CharSequence e;
    private final WindowInsetsCompat$Impl[] f;
    private final boolean g;
    private boolean h;
    private IconCompat i;
    private final WindowInsetsCompat$Impl[] j;

    /* renamed from: o */
    private final int f124o;

    public ParseException$MediaBrowserCompat$CustomActionResultReceiver(int i, CharSequence charSequence, PendingIntent pendingIntent) {
        this(i != 0 ? IconCompat.c(null, "", i) : null, charSequence, pendingIntent);
    }

    public ParseException$MediaBrowserCompat$CustomActionResultReceiver(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
        this(iconCompat, charSequence, pendingIntent, new Bundle(), null, null, true, 0, true, false);
    }

    ParseException$MediaBrowserCompat$CustomActionResultReceiver(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, WindowInsetsCompat$Impl[] windowInsetsCompat$ImplArr, WindowInsetsCompat$Impl[] windowInsetsCompat$ImplArr2, boolean z, int i, boolean z2, boolean z3) {
        this.d = true;
        this.i = iconCompat;
        if (iconCompat != null && iconCompat.d() == 2) {
            this.a = iconCompat.e();
        }
        this.e = ParseException.RemoteActionCompatParcelizer.a(charSequence);
        this.c = pendingIntent;
        this.b = bundle == null ? new Bundle() : bundle;
        this.j = windowInsetsCompat$ImplArr;
        this.f = windowInsetsCompat$ImplArr2;
        this.h = z;
        this.f124o = i;
        this.d = z2;
        this.g = z3;
    }

    public WindowInsetsCompat$Impl[] a() {
        return this.j;
    }

    public boolean b() {
        return this.h;
    }

    public PendingIntent c() {
        return this.c;
    }

    public IconCompat d() {
        int i;
        if (this.i == null && (i = this.a) != 0) {
            this.i = IconCompat.c(null, "", i);
        }
        return this.i;
    }

    public Bundle e() {
        return this.b;
    }

    public int f() {
        return this.f124o;
    }

    public boolean g() {
        return this.d;
    }

    public CharSequence i() {
        return this.e;
    }

    public boolean j() {
        return this.g;
    }
}
