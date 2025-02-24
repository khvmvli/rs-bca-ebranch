package o;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import o.setSlingshotDistance;
/* loaded from: classes-dex2jar.jar:o/getFillColor.class */
public class getFillColor extends setSlingshotDistance {
    int i;
    ArrayList<setSlingshotDistance> n = new ArrayList<>();
    private boolean l = true;
    boolean k = false;
    private int m = 0;

    public getFillColor() {
    }

    public getFillColor(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, setProgressViewOffset.g);
        c(isVisible.d(obtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionOrdering", 0, 0));
        obtainStyledAttributes.recycle();
    }

    @Override // o.setSlingshotDistance
    public final /* synthetic */ setSlingshotDistance a(TimeInterpolator timeInterpolator) {
        this.m |= 1;
        ArrayList<setSlingshotDistance> arrayList = this.n;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.n.get(i).a(timeInterpolator);
            }
        }
        return (getFillColor) a(timeInterpolator);
    }

    @Override // o.setSlingshotDistance
    public final /* synthetic */ setSlingshotDistance a(View view) {
        for (int i = 0; i < this.n.size(); i++) {
            this.n.get(i).a(view);
        }
        return (getFillColor) a(view);
    }

    @Override // o.setSlingshotDistance
    public final void a(getStrokeColor getstrokecolor) {
        if (e(getstrokecolor.a)) {
            Iterator<setSlingshotDistance> it = this.n.iterator();
            while (it.hasNext()) {
                setSlingshotDistance next = it.next();
                if (next.e(getstrokecolor.a)) {
                    next.a(getstrokecolor);
                    getstrokecolor.e.add(next);
                }
            }
        }
    }

    @Override // o.setSlingshotDistance
    public final String b(String str) {
        String b = b(str);
        for (int i = 0; i < this.n.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(b);
            sb.append("\n");
            setSlingshotDistance setslingshotdistance = this.n.get(i);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append("  ");
            sb.append(setslingshotdistance.b(sb2.toString()));
            b = sb.toString();
        }
        return b;
    }

    @Override // o.setSlingshotDistance
    public final /* synthetic */ setSlingshotDistance b(View view) {
        for (int i = 0; i < this.n.size(); i++) {
            this.n.get(i).b(view);
        }
        return (getFillColor) b(view);
    }

    @Override // o.setSlingshotDistance
    public final void b(ViewGroup viewGroup, getStrokeAlpha getstrokealpha, getStrokeAlpha getstrokealpha2, ArrayList<getStrokeColor> arrayList, ArrayList<getStrokeColor> arrayList2) {
        long g = g();
        int size = this.n.size();
        for (int i = 0; i < size; i++) {
            setSlingshotDistance setslingshotdistance = this.n.get(i);
            if (g > 0 && (this.l || i == 0)) {
                long g2 = setslingshotdistance.g();
                if (g2 > 0) {
                    setslingshotdistance.d(g2 + g);
                } else {
                    setslingshotdistance.d(g);
                }
            }
            setslingshotdistance.b(viewGroup, getstrokealpha, getstrokealpha2, arrayList, arrayList2);
        }
    }

    public final getFillColor c(int i) {
        if (i == 0) {
            this.l = true;
        } else if (i == 1) {
            this.l = false;
        } else {
            StringBuilder sb = new StringBuilder("Invalid parameter for TransitionSet ordering: ");
            sb.append(i);
            throw new AndroidRuntimeException(sb.toString());
        }
        return this;
    }

    @Override // o.setSlingshotDistance
    public final setSlingshotDistance c() {
        getFillColor getfillcolor = (getFillColor) clone();
        getfillcolor.n = new ArrayList<>();
        int size = this.n.size();
        for (int i = 0; i < size; i++) {
            setSlingshotDistance c = this.n.get(i).clone();
            getfillcolor.n.add(c);
            c.b = getfillcolor;
        }
        return getfillcolor;
    }

    @Override // o.setSlingshotDistance
    public final /* synthetic */ setSlingshotDistance c(long j) {
        ArrayList<setSlingshotDistance> arrayList;
        c(j);
        if (this.d >= 0 && (arrayList = this.n) != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.n.get(i).c(j);
            }
        }
        return this;
    }

    @Override // o.setSlingshotDistance
    public final /* bridge */ /* synthetic */ setSlingshotDistance c(setSlingshotDistance.read read) {
        return (getFillColor) c(read);
    }

    @Override // o.setSlingshotDistance
    public final void c(View view) {
        c(view);
        int size = this.n.size();
        for (int i = 0; i < size; i++) {
            this.n.get(i).c(view);
        }
    }

    @Override // o.setSlingshotDistance
    public final void c(getStrokeColor getstrokecolor) {
        c(getstrokecolor);
        int size = this.n.size();
        for (int i = 0; i < size; i++) {
            this.n.get(i).c(getstrokecolor);
        }
    }

    @Override // o.setSlingshotDistance
    public final void c(setSize setsize) {
        c(setsize);
        this.m |= 2;
        int size = this.n.size();
        for (int i = 0; i < size; i++) {
            this.n.get(i).c(setsize);
        }
    }

    @Override // o.setSlingshotDistance, java.lang.Object
    public /* synthetic */ Object clone() throws CloneNotSupportedException {
        return clone();
    }

    @Override // o.setSlingshotDistance
    public final /* bridge */ /* synthetic */ setSlingshotDistance d(long j) {
        return (getFillColor) d(j);
    }

    @Override // o.setSlingshotDistance
    public final void d(View view) {
        d(view);
        int size = this.n.size();
        for (int i = 0; i < size; i++) {
            this.n.get(i).d(view);
        }
    }

    @Override // o.setSlingshotDistance
    public final void d(getStrokeColor getstrokecolor) {
        if (e(getstrokecolor.a)) {
            Iterator<setSlingshotDistance> it = this.n.iterator();
            while (it.hasNext()) {
                setSlingshotDistance next = it.next();
                if (next.e(getstrokecolor.a)) {
                    next.d(getstrokecolor);
                    getstrokecolor.e.add(next);
                }
            }
        }
    }

    @Override // o.setSlingshotDistance
    public final void d(setSlingshotDistance$MediaBrowserCompat$CustomActionResultReceiver setslingshotdistance_mediabrowsercompat_customactionresultreceiver) {
        d(setslingshotdistance_mediabrowsercompat_customactionresultreceiver);
        this.m |= 8;
        int size = this.n.size();
        for (int i = 0; i < size; i++) {
            this.n.get(i).d(setslingshotdistance_mediabrowsercompat_customactionresultreceiver);
        }
    }

    public final getFillColor e(setSlingshotDistance setslingshotdistance) {
        this.n.add(setslingshotdistance);
        setslingshotdistance.b = this;
        if (this.d >= 0) {
            setslingshotdistance.c(this.d);
        }
        if ((this.m & 1) != 0) {
            setslingshotdistance.a(j());
        }
        if ((this.m & 2) != 0) {
            setslingshotdistance.c(this.a);
        }
        if ((this.m & 4) != 0) {
            setslingshotdistance.e(i());
        }
        if ((this.m & 8) != 0) {
            setslingshotdistance.d(d());
        }
        return this;
    }

    @Override // o.setSlingshotDistance
    public final /* bridge */ /* synthetic */ setSlingshotDistance e(setSlingshotDistance.read read) {
        return (getFillColor) e(read);
    }

    @Override // o.setSlingshotDistance
    public final void e() {
        e();
        int size = this.n.size();
        for (int i = 0; i < size; i++) {
            this.n.get(i).e();
        }
    }

    @Override // o.setSlingshotDistance
    public final void e(setProgressBackgroundColor setprogressbackgroundcolor) {
        e(setprogressbackgroundcolor);
        this.m |= 4;
        if (this.n != null) {
            for (int i = 0; i < this.n.size(); i++) {
                this.n.get(i).e(setprogressbackgroundcolor);
            }
        }
    }

    @Override // o.setSlingshotDistance
    public final void f() {
        if (this.n.isEmpty()) {
            h();
            b();
            return;
        }
        getFillColor$MediaBrowserCompat$CustomActionResultReceiver getfillcolor_mediabrowsercompat_customactionresultreceiver = new setRefreshing(this) { // from class: o.getFillColor$MediaBrowserCompat$CustomActionResultReceiver
            getFillColor a;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.a = r4;
            }

            @Override // o.setRefreshing, o.setSlingshotDistance.read
            public final void b() {
                if (!this.a.k) {
                    this.a.h();
                    this.a.k = true;
                }
            }

            @Override // o.setRefreshing, o.setSlingshotDistance.read
            public final void c(setSlingshotDistance setslingshotdistance) {
                this.a.i--;
                if (this.a.i == 0) {
                    this.a.k = false;
                    this.a.b();
                }
                setslingshotdistance.e(this);
            }
        };
        Iterator<setSlingshotDistance> it = this.n.iterator();
        while (it.hasNext()) {
            it.next().c(getfillcolor_mediabrowsercompat_customactionresultreceiver);
        }
        this.i = this.n.size();
        if (!this.l) {
            for (int i = 1; i < this.n.size(); i++) {
                final setSlingshotDistance setslingshotdistance = this.n.get(i);
                this.n.get(i - 1).c(new setRefreshing() { // from class: o.getFillColor.4
                    @Override // o.setRefreshing, o.setSlingshotDistance.read
                    public final void c(setSlingshotDistance setslingshotdistance2) {
                        setslingshotdistance.f();
                        setslingshotdistance2.e(this);
                    }
                });
            }
            setSlingshotDistance setslingshotdistance2 = this.n.get(0);
            if (setslingshotdistance2 != null) {
                setslingshotdistance2.f();
                return;
            }
            return;
        }
        Iterator<setSlingshotDistance> it2 = this.n.iterator();
        while (it2.hasNext()) {
            it2.next().f();
        }
    }
}
