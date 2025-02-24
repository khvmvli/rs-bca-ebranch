package o;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.StateSet;
import o.setTitleOptional;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/setActionBarHideOffset$MediaBrowserCompat$CustomActionResultReceiver.class */
public class setActionBarHideOffset$MediaBrowserCompat$CustomActionResultReceiver extends setTitleOptional.RemoteActionCompatParcelizer {
    setTrackDrawable<Long> b;
    setTrackTintList<Integer> d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public setActionBarHideOffset$MediaBrowserCompat$CustomActionResultReceiver(setActionBarHideOffset$MediaBrowserCompat$CustomActionResultReceiver setactionbarhideoffset_mediabrowsercompat_customactionresultreceiver, setActionBarHideOffset setactionbarhideoffset, Resources resources) {
        super(setactionbarhideoffset_mediabrowsercompat_customactionresultreceiver, setactionbarhideoffset, resources);
        if (setactionbarhideoffset_mediabrowsercompat_customactionresultreceiver != null) {
            this.b = setactionbarhideoffset_mediabrowsercompat_customactionresultreceiver.b;
            this.d = setactionbarhideoffset_mediabrowsercompat_customactionresultreceiver.d;
            return;
        }
        this.b = new setTrackDrawable<>();
        this.d = new setTrackTintList<>();
    }

    private static long g(int i, int i2) {
        return ((long) i2) | (((long) i) << 32);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int a(int i) {
        int i2 = 0;
        if (i >= 0) {
            i2 = this.d.e(i, 0).intValue();
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int b(int i, int i2, Drawable drawable, boolean z) {
        int a = a(drawable);
        long g = g(i, i2);
        long j = z ? 8589934592L : 0;
        long j2 = (long) a;
        this.b.d(g, Long.valueOf(j2 | j));
        if (z) {
            this.b.d(g(i2, i), Long.valueOf(4294967296L | j2 | j));
        }
        return a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int c(int[] iArr) {
        int e = e(iArr);
        return e >= 0 ? e : e(StateSet.WILD_CARD);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int c(int[] iArr, Drawable drawable, int i) {
        int d = d(iArr, drawable);
        this.d.c(d, Integer.valueOf(i));
        return d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean c(int i, int i2) {
        return (this.b.a(g(i, i2), -1L).longValue() & 4294967296L) != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int d(int i, int i2) {
        return (int) this.b.a(g(i, i2), -1L).longValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.setTitleOptional.RemoteActionCompatParcelizer, o.setTransitioning.IconCompatParcelizer
    public void d() {
        this.b = this.b.clone();
        this.d = this.d.clone();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean e(int i, int i2) {
        return (this.b.a(g(i, i2), -1L).longValue() & 8589934592L) != 0;
    }

    @Override // o.setTitleOptional.RemoteActionCompatParcelizer, android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        return new setActionBarHideOffset(this, null);
    }

    @Override // o.setTitleOptional.RemoteActionCompatParcelizer, android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources) {
        return new setActionBarHideOffset(this, resources);
    }
}
