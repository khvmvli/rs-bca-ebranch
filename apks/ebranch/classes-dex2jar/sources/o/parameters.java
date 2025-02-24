package o;

import android.graphics.Path;
/* loaded from: classes-dex2jar.jar:o/parameters.class */
public final class parameters implements name {
    public final boolean a;
    public final Path.FillType b;
    public final get c;
    public final DebouncingOnClickListener$$ExternalSyntheticLambda0 d;
    public final returnType e;
    private final ImmutableList f;
    private final ImmutableList g;
    public final String h;
    public final size i;
    public final DebouncingOnClickListener$$ExternalSyntheticLambda0 j;

    public parameters(String str, returnType returntype, Path.FillType fillType, get get, size size, DebouncingOnClickListener$$ExternalSyntheticLambda0 debouncingOnClickListener$$ExternalSyntheticLambda0, DebouncingOnClickListener$$ExternalSyntheticLambda0 debouncingOnClickListener$$ExternalSyntheticLambda02, ImmutableList immutableList, ImmutableList immutableList2, boolean z) {
        this.e = returntype;
        this.b = fillType;
        this.c = get;
        this.i = size;
        this.j = debouncingOnClickListener$$ExternalSyntheticLambda0;
        this.d = debouncingOnClickListener$$ExternalSyntheticLambda02;
        this.h = str;
        this.f = immutableList;
        this.g = immutableList2;
        this.a = z;
    }

    @Override // o.name
    public final style e(setText settext, setPageColor setpagecolor) {
        return new findBindingConstructorForClass(settext, setpagecolor, this);
    }
}
