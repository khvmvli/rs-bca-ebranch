package o;

import java.util.ArrayList;
import java.util.List;
import o.OnPageChange;
import o.setSnap;
/* loaded from: classes-dex2jar.jar:o/OnTouch.class */
public final class OnTouch implements style, OnPageChange$Callback$MediaBrowserCompat$CustomActionResultReceiver {
    public final OnPageChange.Callback<?, Float> a;
    public final OnPageChange.Callback<?, Float> b;
    public final boolean c;
    final List<OnPageChange$Callback$MediaBrowserCompat$CustomActionResultReceiver> d = new ArrayList();
    public final OnPageChange.Callback<?, Float> e;
    final setSnap.write i;
    private final String j;

    public OnTouch(setPageColor setpagecolor, setSnap setsnap) {
        this.j = setsnap.d;
        this.c = setsnap.c;
        this.i = setsnap.h;
        OnPageChange onPageChange = new OnPageChange(setsnap.a.c);
        this.a = onPageChange;
        OnPageChange onPageChange2 = new OnPageChange(setsnap.b.c);
        this.b = onPageChange2;
        OnPageChange onPageChange3 = new OnPageChange(setsnap.e.c);
        this.e = onPageChange3;
        setpagecolor.e.add(onPageChange);
        setpagecolor.e.add(onPageChange2);
        setpagecolor.e.add(onPageChange3);
        onPageChange.d.add(this);
        onPageChange2.d.add(this);
        onPageChange3.d.add(this);
    }

    @Override // o.OnPageChange$Callback$MediaBrowserCompat$CustomActionResultReceiver
    public final void a() {
        for (int i = 0; i < this.d.size(); i++) {
            this.d.get(i).a();
        }
    }

    @Override // o.style
    public final void b(List<style> list, List<style> list2) {
    }

    @Override // o.style
    public final String e() {
        return this.j;
    }
}
