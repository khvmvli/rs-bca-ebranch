package o;
/* loaded from: classes-dex2jar.jar:o/getPhone.class */
public final class getPhone extends getFlagReservationCsoPrioritas<getProvince> {
    public getPhone(getProvince getprovince) {
        super(getprovince);
    }

    @Override // o.setIbanFlag
    public final void b() {
        ((getProvince) this.c).stop();
        ((getProvince) this.c).e();
    }

    @Override // o.getFlagReservationCsoPrioritas, o.getAliasName
    public final void c() {
        ((getProvince) this.c).d.a.e.prepareToDraw();
    }

    @Override // o.setIbanFlag
    public final int d() {
        getTimeZone gettimezone = ((getProvince) this.c).d.a;
        return gettimezone.h.c() + gettimezone.b;
    }

    @Override // o.setIbanFlag
    public final Class<getProvince> e() {
        return getProvince.class;
    }
}
