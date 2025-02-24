package o;
/* loaded from: classes2-dex2jar.jar:o/onUpdateWarkat.class */
public final class onUpdateWarkat implements onUpdatePenerimaData {
    private String c;

    public onUpdateWarkat() {
        this(null, 1);
    }

    public onUpdateWarkat(String str) {
        subscribeReservationRescheduleEvent.e(str, "");
        this.c = str;
    }

    public /* synthetic */ onUpdateWarkat(String str, int i) {
        this("Can't be empty!");
    }

    @Override // o.onUpdatePenerimaData
    public final boolean d(String str) {
        subscribeReservationRescheduleEvent.e(str, "");
        return !(str.length() == 0);
    }

    @Override // o.onUpdatePenerimaData
    public final String e() {
        return this.c;
    }
}
