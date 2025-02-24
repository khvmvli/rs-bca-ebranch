package o;

import java.util.Random;
/* loaded from: classes2-dex2jar.jar:o/TransaksiTundaFragment_ViewBinding.class */
public abstract class TransaksiTundaFragment_ViewBinding extends setImageUri {
    public abstract Random c();

    @Override // o.setImageUri
    public final int d() {
        return c().nextInt();
    }

    @Override // o.setImageUri
    public final int d(int i) {
        return ((-i) >> 31) & (c().nextInt() >>> (32 - i));
    }
}
