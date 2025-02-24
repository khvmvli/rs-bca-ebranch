package o;
/* loaded from: classes-dex2jar.jar:o/getResPostCode.class */
public final class getResPostCode implements getExpID<getOfficeCity> {
    private final Page6JLFragment_ViewBinding<realmGet$businessField> a;
    private final Page6JLFragment_ViewBinding<getResSubDistrict> b;
    private final Page6JLFragment_ViewBinding<getOccupationValue> d;
    private final Page6JLFragment_ViewBinding<realmGet$businessField> e;

    public getResPostCode(Page6JLFragment_ViewBinding<realmGet$businessField> page6JLFragment_ViewBinding, Page6JLFragment_ViewBinding<realmGet$businessField> page6JLFragment_ViewBinding2, Page6JLFragment_ViewBinding<getOccupationValue> page6JLFragment_ViewBinding3, Page6JLFragment_ViewBinding<getResSubDistrict> page6JLFragment_ViewBinding4) {
        this.a = page6JLFragment_ViewBinding;
        this.e = page6JLFragment_ViewBinding2;
        this.d = page6JLFragment_ViewBinding3;
        this.b = page6JLFragment_ViewBinding4;
    }

    @Override // o.Page6JLFragment_ViewBinding
    public final /* synthetic */ Object c() {
        return new getOfficeCity(this.a.c(), this.e.c(), this.d.c(), this.b.c());
    }
}
