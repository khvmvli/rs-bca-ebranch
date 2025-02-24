package o;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import o.KetentuanORDialog_ViewBinding;
/* loaded from: classes2-dex2jar.jar:o/KetentuanORDialog_ViewBinding$MediaBrowserCompat$ItemReceiver.class */
public final class KetentuanORDialog_ViewBinding$MediaBrowserCompat$ItemReceiver {
    CharSequence c;
    Drawable d;
    View e;
    Object f;
    public KetentuanORDialog_ViewBinding.MediaDescriptionCompat g;
    public KetentuanORDialog_ViewBinding h;
    CharSequence j;
    public int i = -1;
    int a = 1;
    int b = -1;

    public final KetentuanORDialog_ViewBinding$MediaBrowserCompat$ItemReceiver a(CharSequence charSequence) {
        if (TextUtils.isEmpty(this.c) && !TextUtils.isEmpty(charSequence)) {
            this.g.setContentDescription(charSequence);
        }
        this.j = charSequence;
        KetentuanORDialog_ViewBinding.MediaDescriptionCompat mediaDescriptionCompat = this.g;
        if (mediaDescriptionCompat != null) {
            mediaDescriptionCompat.c();
        }
        return this;
    }

    public final boolean d() {
        KetentuanORDialog_ViewBinding ketentuanORDialog_ViewBinding = this.h;
        if (ketentuanORDialog_ViewBinding != null) {
            KetentuanORDialog_ViewBinding$MediaBrowserCompat$ItemReceiver ketentuanORDialog_ViewBinding$MediaBrowserCompat$ItemReceiver = ketentuanORDialog_ViewBinding.e;
            return (ketentuanORDialog_ViewBinding$MediaBrowserCompat$ItemReceiver != null ? ketentuanORDialog_ViewBinding$MediaBrowserCompat$ItemReceiver.i : -1) == this.i;
        }
        throw new IllegalArgumentException("Tab not attached to a TabLayout");
    }
}
