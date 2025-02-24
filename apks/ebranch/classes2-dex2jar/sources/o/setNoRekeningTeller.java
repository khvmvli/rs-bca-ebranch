package o;

import java.net.URL;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2-dex2jar.jar:o/setNoRekeningTeller.class */
public final class setNoRekeningTeller implements Runnable {
    final /* synthetic */ setReceiverNameTeller a;
    private final setEditable b;
    private final byte[] c;
    private final String d;
    private final URL e;
    private final Map<String, String> i;

    public setNoRekeningTeller(setReceiverNameTeller setreceivernameteller, String str, URL url, byte[] bArr, Map<String, String> map, setEditable seteditable) {
        this.a = setreceivernameteller;
        setFotoKtp.c(str);
        setFotoKtp.b(url);
        setFotoKtp.b(seteditable);
        this.e = url;
        this.c = bArr;
        this.b = seteditable;
        this.d = str;
        this.i = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01ed A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0261 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r15v12, types: [java.util.Map<java.lang.String, java.lang.String>, java.util.Map] */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v24, types: [java.util.Iterator] */
    /* JADX WARN: Type inference failed for: r16v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v26 */
    /* JADX WARN: Unknown variable types count: 2 */
    @Override // java.lang.Runnable
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final void run() {
        /*
        // Method dump skipped, instructions count: 701
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setNoRekeningTeller.run():void");
    }
}
