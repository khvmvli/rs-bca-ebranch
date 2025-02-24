package o;

import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes2-dex2jar.jar:o/realmSet$typeTransksi.class */
public final class realmSet$typeTransksi extends realmSet$RepresentativeRelationship {
    protected static final AtomicReference<String[]> e = new AtomicReference<>();
    protected static final AtomicReference<String[]> d = new AtomicReference<>();
    protected static final AtomicReference<String[]> a = new AtomicReference<>();

    public realmSet$typeTransksi(realmGet$TxnPurpose realmget_txnpurpose) {
        super(realmget_txnpurpose);
    }

    private static final String b(String str, String[] strArr, String[] strArr2, AtomicReference<String[]> atomicReference) {
        String str2;
        setFotoKtp.b(strArr);
        setFotoKtp.b(strArr2);
        setFotoKtp.b(atomicReference);
        setFotoKtp.b(strArr.length == strArr2.length);
        for (int i = 0; i < strArr.length; i++) {
            if (setAcctNo.c(str, strArr[i])) {
                synchronized (atomicReference) {
                    String[] strArr3 = atomicReference.get();
                    String[] strArr4 = strArr3;
                    if (strArr3 == null) {
                        strArr4 = new String[strArr2.length];
                        atomicReference.set(strArr4);
                    }
                    String str3 = strArr4[i];
                    str2 = str3;
                    if (str3 == null) {
                        str2 = strArr2[i] + "(" + strArr[i] + ")";
                        strArr4[i] = str2;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    public final String b(String str) {
        if (str == null) {
            return null;
        }
        return !c() ? str : b(str, realmSet$SenderName.d, realmSet$SenderName.b, e);
    }

    public final String c(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (!c()) {
            return bundle.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sb.length() != 8) {
                sb.append(", ");
            }
            sb.append(c(str));
            sb.append("=");
            Object obj = bundle.get(str);
            sb.append(obj instanceof Bundle ? e(new Object[]{obj}) : obj instanceof Object[] ? e((Object[]) obj) : obj instanceof ArrayList ? e(((ArrayList) obj).toArray()) : String.valueOf(obj));
        }
        sb.append("}]");
        return sb.toString();
    }

    public final String c(String str) {
        if (str == null) {
            return null;
        }
        return !c() ? str : b(str, realmSet$SenderIdNumber.a, realmSet$SenderIdNumber.b, d);
    }

    public final boolean c() {
        this.q.n_();
        return this.q.B() && Log.isLoggable(this.q.s_().m(), 3);
    }

    public final String e(String str) {
        if (str == null) {
            return null;
        }
        if (!c()) {
            return str;
        }
        if (!str.startsWith("_exp_")) {
            return b(str, realmSet$SenderPhone.c, realmSet$SenderPhone.e, a);
        }
        return "experiment_id(" + str + ")";
    }

    protected final String e(Object[] objArr) {
        if (objArr == null) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (Object obj : objArr) {
            String c = obj instanceof Bundle ? c((Bundle) obj) : String.valueOf(obj);
            if (c != null) {
                if (sb.length() != 1) {
                    sb.append(", ");
                }
                sb.append(c);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // o.realmSet$RepresentativeRelationship
    protected final boolean e() {
        return false;
    }
}
