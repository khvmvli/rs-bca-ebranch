package o;
/* loaded from: classes-dex2jar.jar:o/subscribeTransaksiBatalROEvent.class */
public final class subscribeTransaksiBatalROEvent implements TransaksiBerhasilFragment_ViewBinding {
    private final Class<?> d;
    private final String e;

    public subscribeTransaksiBatalROEvent(Class<?> cls, String str) {
        subscribeReservationRescheduleEvent.e(cls, "");
        subscribeReservationRescheduleEvent.e(str, "");
        this.d = cls;
        this.e = str;
    }

    @Override // o.TransaksiBerhasilFragment_ViewBinding
    public final Class<?> d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof subscribeTransaksiBatalROEvent) && subscribeReservationRescheduleEvent.b(this.d, ((subscribeTransaksiBatalROEvent) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.d.toString());
        sb.append(" (Kotlin reflection is not available)");
        return sb.toString();
    }
}
