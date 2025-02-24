package o;

import java.util.List;
import o.getResourceEntryName;
/* loaded from: classes-dex2jar.jar:o/arrayFilteringNull.class */
public final class arrayFilteringNull implements name {
    public final ImmutableList a;
    public final get b;
    public final DebouncingOnClickListener$$ExternalSyntheticLambda0 c;
    public final returnType d;
    public final getResourceEntryName.RemoteActionCompatParcelizer e;
    public final getResourceEntryName.write f;
    public final List<ImmutableList> g;
    public final String h;
    public final float i;
    public final boolean j;
    public final ImmutableList k;
    public final size n;

    /* renamed from: o */
    public final DebouncingOnClickListener$$ExternalSyntheticLambda0 f133o;

    public arrayFilteringNull(String str, returnType returntype, get get, size size, DebouncingOnClickListener$$ExternalSyntheticLambda0 debouncingOnClickListener$$ExternalSyntheticLambda0, DebouncingOnClickListener$$ExternalSyntheticLambda0 debouncingOnClickListener$$ExternalSyntheticLambda02, ImmutableList immutableList, getResourceEntryName.RemoteActionCompatParcelizer remoteActionCompatParcelizer, getResourceEntryName.write write, float f, List<ImmutableList> list, ImmutableList immutableList2, boolean z) {
        this.h = str;
        this.d = returntype;
        this.b = get;
        this.n = size;
        this.f133o = debouncingOnClickListener$$ExternalSyntheticLambda0;
        this.c = debouncingOnClickListener$$ExternalSyntheticLambda02;
        this.k = immutableList;
        this.e = remoteActionCompatParcelizer;
        this.f = write;
        this.i = f;
        this.g = list;
        this.a = immutableList2;
        this.j = z;
    }

    @Override // o.name
    public final style e(setText settext, setPageColor setpagecolor) {
        return new OnEditorAction(settext, setpagecolor, this);
    }
}
