package o;

import o.setTargetFragment;
/* loaded from: classes-dex2jar.jar:o/toString.class */
public final /* synthetic */ class toString implements setSwitchMinWidth {
    public final /* synthetic */ setTargetFragment.RemoteActionCompatParcelizer b;
    public final /* synthetic */ setSwitchMinWidth d;

    public /* synthetic */ toString(setTargetFragment.RemoteActionCompatParcelizer remoteActionCompatParcelizer, setSwitchMinWidth setswitchminwidth) {
        this.b = remoteActionCompatParcelizer;
        this.d = setswitchminwidth;
    }

    @Override // o.setSwitchMinWidth
    public final Object c(Object obj) {
        setTargetFragment.RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.b;
        setSwitchMinWidth setswitchminwidth = this.d;
        Recreator a = ((setOnScrollListener) obj).a(remoteActionCompatParcelizer.d);
        int i = 0;
        while (i < remoteActionCompatParcelizer.a.size()) {
            int i2 = i + 1;
            Object obj2 = remoteActionCompatParcelizer.a.get(i);
            if (obj2 == null) {
                a.b(i2);
            } else if (obj2 instanceof Long) {
                a.d(i2, ((Long) obj2).longValue());
            } else if (obj2 instanceof Double) {
                a.b(i2, ((Double) obj2).doubleValue());
            } else if (obj2 instanceof String) {
                a.a(i2, (String) obj2);
            } else if (obj2 instanceof byte[]) {
                a.d(i2, (byte[]) obj2);
            }
            i = i2;
        }
        return setswitchminwidth.c(a);
    }
}
