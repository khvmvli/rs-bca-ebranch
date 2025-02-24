package o;

import java.io.PrintStream;
/* loaded from: classes-dex2jar.jar:o/realmSet$flagDaftarTransfer.class */
public final class realmSet$flagDaftarTransfer {
    static final realmSet$beritaPenerima c;

    static {
        Integer num;
        realmSet$beritaPenerima realmset_beritapenerima;
        try {
            Integer num2 = null;
            num = null;
            try {
                num2 = (Integer) Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
            } catch (Exception e) {
                System.err.println("Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception.");
                e.printStackTrace(System.err);
            }
            if (num2 != null && num2.intValue() >= 19) {
                realmset_beritapenerima = new realmSet$beritaPenerima() { // from class: o.realmSet$nominalPenerima
                    @Override // o.realmSet$beritaPenerima
                    public final void d(Throwable th, Throwable th2) {
                        th.addSuppressed(th2);
                    }
                };
                num = num2;
            } else if (!Boolean.getBoolean("com.google.devtools.build.android.desugar.runtime.twr_disable_mimic")) {
                realmset_beritapenerima = new realmSet$beritaPenerima() { // from class: o.realmSet$bankTujuanPenerima
                    private final realmSet$bankTujuanCode b = new realmSet$bankTujuanCode();

                    @Override // o.realmSet$beritaPenerima
                    public final void d(Throwable th, Throwable th2) {
                        if (th2 != th) {
                            this.b.c(th, true).add(th2);
                            return;
                        }
                        throw new IllegalArgumentException("Self suppression is not allowed.", th2);
                    }
                };
                num = num2;
            } else {
                realmset_beritapenerima = new realmSet$beritaPenerima() { // from class: o.realmSet$bankTujuanBIC
                    @Override // o.realmSet$beritaPenerima
                    public final void d(Throwable th, Throwable th2) {
                    }
                };
                num = num2;
            }
        } catch (Throwable th) {
            PrintStream printStream = System.err;
            String name = realmSet$bankTujuanBIC.class.getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 133);
            sb.append("An error has occurred when initializing the try-with-resources desuguring strategy. The default strategy ");
            sb.append(name);
            sb.append("will be used. The error is: ");
            printStream.println(sb.toString());
            th.printStackTrace(System.err);
            realmset_beritapenerima = new realmSet$beritaPenerima() { // from class: o.realmSet$bankTujuanBIC
                @Override // o.realmSet$beritaPenerima
                public final void d(Throwable th2, Throwable th22) {
                }
            };
        }
        c = realmset_beritapenerima;
        if (num != null) {
            num.intValue();
        }
    }

    public static void d(Throwable th, Throwable th2) {
        c.d(th, th2);
    }
}
