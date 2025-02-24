package o;

import java.lang.reflect.AccessibleObject;
/* loaded from: classes-dex2jar.jar:o/CC14FormKartuKreditPekerjaanFragment_ViewBinding.class */
public abstract class CC14FormKartuKreditPekerjaanFragment_ViewBinding {
    private static final CC14FormKartuKreditPekerjaanFragment_ViewBinding a;

    static {
        a = ketentuanBankTransfer.a() < 9 ? new CC14FormKartuKreditPekerjaanFragment() : new onChooseValueFotoNPWP();
    }

    public static CC14FormKartuKreditPekerjaanFragment_ViewBinding c() {
        return a;
    }

    public abstract void a(AccessibleObject accessibleObject);
}
