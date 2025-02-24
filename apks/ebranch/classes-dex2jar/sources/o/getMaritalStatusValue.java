package o;

import java.util.concurrent.Executor;
/* loaded from: classes-dex2jar.jar:o/getMaritalStatusValue.class */
public final class getMaritalStatusValue implements getExpID<getKitasKitapNumber> {
    private final Page6JLFragment_ViewBinding<Executor> a;
    private final Page6JLFragment_ViewBinding<realmGet$acctType> b;
    private final Page6JLFragment_ViewBinding<getLastEducation> d;
    private final Page6JLFragment_ViewBinding<getMaritalStatus> e;

    public getMaritalStatusValue(Page6JLFragment_ViewBinding<Executor> page6JLFragment_ViewBinding, Page6JLFragment_ViewBinding<getMaritalStatus> page6JLFragment_ViewBinding2, Page6JLFragment_ViewBinding<getLastEducation> page6JLFragment_ViewBinding3, Page6JLFragment_ViewBinding<realmGet$acctType> page6JLFragment_ViewBinding4) {
        this.a = page6JLFragment_ViewBinding;
        this.e = page6JLFragment_ViewBinding2;
        this.d = page6JLFragment_ViewBinding3;
        this.b = page6JLFragment_ViewBinding4;
    }

    @Override // o.Page6JLFragment_ViewBinding
    public final /* synthetic */ Object c() {
        return new getKitasKitapNumber(this.a.c(), this.e.c(), this.d.c(), this.b.c());
    }
}
