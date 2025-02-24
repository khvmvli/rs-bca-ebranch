package o;

import android.graphics.PointF;
import o.OnItemSelected;
/* loaded from: classes-dex2jar.jar:o/findRequiredViewAsType.class */
public final class findRequiredViewAsType implements name {
    public final boolean a;
    public final ImmutableList b;
    public final String c;
    public final ImmutableList d;
    public final ImmutableList e;
    public final ImmutableList f;
    public final RemoteActionCompatParcelizer g;
    public final ImmutableList h;
    public final ListenerMethod<PointF, PointF> i;
    public final ImmutableList j;

    /* loaded from: classes-dex2jar.jar:o/findRequiredViewAsType$RemoteActionCompatParcelizer.class */
    public enum RemoteActionCompatParcelizer {
        STAR(1),
        POLYGON(2);
        
        private final int d;

        RemoteActionCompatParcelizer(int i) {
            this.d = i;
        }

        public static RemoteActionCompatParcelizer b(int i) {
            RemoteActionCompatParcelizer[] values = values();
            for (RemoteActionCompatParcelizer remoteActionCompatParcelizer : values) {
                if (remoteActionCompatParcelizer.d == i) {
                    return remoteActionCompatParcelizer;
                }
            }
            return null;
        }
    }

    public findRequiredViewAsType(String str, RemoteActionCompatParcelizer remoteActionCompatParcelizer, ImmutableList immutableList, ListenerMethod<PointF, PointF> listenerMethod, ImmutableList immutableList2, ImmutableList immutableList3, ImmutableList immutableList4, ImmutableList immutableList5, ImmutableList immutableList6, boolean z) {
        this.c = str;
        this.g = remoteActionCompatParcelizer;
        this.h = immutableList;
        this.i = listenerMethod;
        this.j = immutableList2;
        this.d = immutableList3;
        this.e = immutableList4;
        this.b = immutableList5;
        this.f = immutableList6;
        this.a = z;
    }

    @Override // o.name
    public final style e(setText settext, setPageColor setpagecolor) {
        return new OnItemSelected.Callback(settext, setpagecolor, this);
    }
}
