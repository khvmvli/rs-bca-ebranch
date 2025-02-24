package o;

import java.net.URL;
import java.util.List;
import java.util.Map;
/* loaded from: classes2-dex2jar.jar:o/realmSet$Jumlah.class */
public final class realmSet$Jumlah implements Runnable {
    final /* synthetic */ setJumlah a;
    private final URL b;
    private final String c;
    private final realmGet$TxnNotes d;

    public realmSet$Jumlah(setJumlah setjumlah, String str, URL url, byte[] bArr, Map map, realmGet$TxnNotes realmget_txnnotes, byte[] bArr2) {
        this.a = setjumlah;
        setFotoKtp.c(str);
        setFotoKtp.b(url);
        setFotoKtp.b(realmget_txnnotes);
        this.b = url;
        this.d = realmget_txnnotes;
        this.c = str;
    }

    private final void d(int i, Exception exc, byte[] bArr, Map<String, List<String>> map) {
        this.a.q.o_().b(new Runnable(this, i, exc, bArr, map) { // from class: o.realmGet$Jumlah
            private final Map a;
            private final byte[] b;
            private final int c;
            private final Exception d;
            private final realmSet$Jumlah e;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.e = r4;
                this.c = r5;
                this.d = r6;
                this.b = r7;
                this.a = r8;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.e.a(this.c, this.d, this.b, this.a);
            }
        });
    }

    public final /* synthetic */ void a(int i, Exception exc, byte[] bArr, Map map) {
        this.d.b(this.c, i, exc, bArr, map);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x010f  */
    @Override // java.lang.Runnable
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final void run() {
        /*
        // Method dump skipped, instructions count: 287
        */
        throw new UnsupportedOperationException("Method not decompiled: o.realmSet$Jumlah.run():void");
    }
}
