package o;

import java.util.List;
import java.util.Map;
/* loaded from: classes2-dex2jar.jar:o/setReceiverBankNameTeller.class */
final class setReceiverBankNameTeller implements Runnable {
    private final String a;
    private final byte[] b;
    private final Throwable c;
    private final int d;
    private final setEditable e;
    private final Map<String, List<String>> g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ setReceiverBankNameTeller(String str, setEditable seteditable, int i, Throwable th, byte[] bArr, Map map, setImage setimage) {
        setFotoKtp.b(seteditable);
        this.e = seteditable;
        this.d = i;
        this.c = th;
        this.b = bArr;
        this.a = str;
        this.g = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.e.c(this.a, this.d, this.c, this.b, this.g);
    }
}
