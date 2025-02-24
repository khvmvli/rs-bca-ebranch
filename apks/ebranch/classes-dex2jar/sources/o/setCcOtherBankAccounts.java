package o;

import java.io.PrintStream;
/* loaded from: classes-dex2jar.jar:o/setCcOtherBankAccounts.class */
public final class setCcOtherBankAccounts {
    static final realmSet$referenceBranchCode a;

    static {
        Integer num;
        realmSet$referenceBranchCode realmset_referencebranchcode;
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
                realmset_referencebranchcode = new setAutodebetPercentage();
                num = num2;
            } else if (!Boolean.getBoolean("com.google.devtools.build.android.desugar.runtime.twr_disable_mimic")) {
                realmset_referencebranchcode = new setBcaAccountNumber();
                num = num2;
            } else {
                realmset_referencebranchcode = new setAutodebetAccountNumber();
                num = num2;
            }
        } catch (Throwable th) {
            PrintStream printStream = System.err;
            String name = setAutodebetAccountNumber.class.getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 133);
            sb.append("An error has occurred when initializing the try-with-resources desuguring strategy. The default strategy ");
            sb.append(name);
            sb.append("will be used. The error is: ");
            printStream.println(sb.toString());
            th.printStackTrace(System.err);
            realmset_referencebranchcode = new setAutodebetAccountNumber();
        }
        a = realmset_referencebranchcode;
        if (num != null) {
            num.intValue();
        }
    }

    public static void c(Throwable th, Throwable th2) {
        a.d(th, th2);
    }
}
