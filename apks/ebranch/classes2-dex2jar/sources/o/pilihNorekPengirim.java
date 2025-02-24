package o;

import java.io.Serializable;
/* loaded from: classes2-dex2jar.jar:o/pilihNorekPengirim.class */
public final class pilihNorekPengirim implements Serializable {
    public final OR6DataLainnyaFragment_ViewBinding a;
    private final boolean b;
    public final OR6DataLainnyaFragment_ViewBinding e;
    private static final pilihNorekPengirim d = new pilihNorekPengirim();
    private static final pilihNorekPengirim c = new pilihNorekPengirim(false);

    public pilihNorekPengirim() {
        this(true);
    }

    private pilihNorekPengirim(boolean z) {
        this.a = new OR6DataLainnyaFragment_ViewBinding("^(?:(\\d{9}[0-9X])|(?:(\\d{1,5})(?:\\-|\\s)(\\d{1,7})(?:\\-|\\s)(\\d{1,6})(?:\\-|\\s)([0-9X])))$", 10, OR6ReviewUbahFragment.b);
        this.e = new OR6DataLainnyaFragment_ViewBinding("^(978|979)(?:(\\d{10})|(?:(?:\\-|\\s)(\\d{1,5})(?:\\-|\\s)(\\d{1,7})(?:\\-|\\s)(\\d{1,6})(?:\\-|\\s)([0-9])))$", 13, ubahDataBankPenerima.b);
        this.b = z;
    }

    public static pilihNorekPengirim e() {
        return d;
    }
}
