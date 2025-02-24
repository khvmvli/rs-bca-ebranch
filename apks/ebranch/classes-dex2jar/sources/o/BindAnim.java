package o;

import android.graphics.Rect;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import o.Unbinder;
/* loaded from: classes-dex2jar.jar:o/BindAnim.class */
public class BindAnim {
    public float a;
    public Map<String, ViewCollections> b;
    public Rect c;
    public float d;
    public setTrackTintList<Unbinder._CC> e;
    public boolean f;
    public List<setCentered> g;
    public List<C0013onClick> h;
    public Map<String, BindColor> i;
    public setTrackDrawable<setCentered> j;
    public Map<String, List<setCentered>> k;
    public float l;

    /* renamed from: o */
    public final BindFloat f77o = new BindFloat();
    public final HashSet<String> m = new HashSet<>();
    public int n = 0;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x005c, code lost:
        if (r0.substring(0, r0.length() - 1).equalsIgnoreCase(r6) != false) goto L_0x0065;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final o.C0013onClick e(java.lang.String r6) {
        /*
            r5 = this;
            r0 = r5
            java.util.List<o.onClick> r0 = r0.h
            int r0 = r0.size()
            r7 = r0
            r0 = 0
            r8 = r0
        L_0x000c:
            r0 = r8
            r1 = r7
            if (r0 >= r1) goto L_0x0073
            r0 = r5
            java.util.List<o.onClick> r0 = r0.h
            r1 = r8
            java.lang.Object r0 = r0.get(r1)
            o.onClick r0 = (o.C0013onClick) r0
            r9 = r0
            r0 = r9
            java.lang.String r0 = r0.a
            r1 = r6
            boolean r0 = r0.equalsIgnoreCase(r1)
            r10 = r0
            r0 = 1
            r11 = r0
            r0 = r10
            if (r0 == 0) goto L_0x0036
            goto L_0x0065
        L_0x0036:
            r0 = r9
            java.lang.String r0 = r0.a
            java.lang.String r1 = o.C0013onClick.b
            boolean r0 = r0.endsWith(r1)
            if (r0 == 0) goto L_0x0062
            r0 = r9
            java.lang.String r0 = r0.a
            r12 = r0
            r0 = r12
            r1 = 0
            r2 = r12
            int r2 = r2.length()
            r3 = 1
            int r2 = r2 - r3
            java.lang.String r0 = r0.substring(r1, r2)
            r1 = r6
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x0062
            goto L_0x0065
        L_0x0062:
            r0 = 0
            r11 = r0
        L_0x0065:
            r0 = r11
            if (r0 == 0) goto L_0x006d
            r0 = r9
            return r0
        L_0x006d:
            int r8 = r8 + 1
            goto L_0x000c
        L_0x0073:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.BindAnim.e(java.lang.String):o.onClick");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        for (setCentered setcentered : this.g) {
            sb.append(setcentered.d("\t"));
        }
        return sb.toString();
    }
}
