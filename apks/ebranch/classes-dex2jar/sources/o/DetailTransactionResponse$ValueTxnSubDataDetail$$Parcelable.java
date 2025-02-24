package o;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import o.getTxnPurposeValue;
import o.onFindViewById;
import o.setBankStatesName;
/* loaded from: classes-dex2jar.jar:o/DetailTransactionResponse$ValueTxnSubDataDetail$$Parcelable.class */
public final class DetailTransactionResponse$ValueTxnSubDataDetail$$Parcelable {
    private final getTxnSourceValue<setCode, String> d = new getTxnSourceValue<>(1000);
    private final onFindViewById.write<write> c = getTxnPurposeValue.a(10, new getTxnPurposeValue.read<write>() { // from class: o.DetailTransactionResponse$ValueTxnSubDataDetail$$Parcelable.3
        private static write a() {
            try {
                return new write(MessageDigest.getInstance("SHA-256"));
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException(e);
            }
        }

        @Override // o.getTxnPurposeValue.read
        public final /* synthetic */ write b() {
            return a();
        }
    });

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/DetailTransactionResponse$ValueTxnSubDataDetail$$Parcelable$write.class */
    public static final class write implements getTxnPurposeValue.RemoteActionCompatParcelizer {
        private final setBankStatesName b = new setBankStatesName.write();
        final MessageDigest d;

        write(MessageDigest messageDigest) {
            this.d = messageDigest;
        }

        @Override // o.getTxnPurposeValue.RemoteActionCompatParcelizer
        public final setBankStatesName j_() {
            return this.b;
        }
    }

    private String a(setCode setcode) {
        write a = this.c.a();
        if (a != null) {
            write write2 = a;
            try {
                setcode.e(write2.d);
                return getTxnNotes2.a(write2.d.digest());
            } finally {
                this.c.c(write2);
            }
        } else {
            throw new NullPointerException("Argument must not be null");
        }
    }

    public final String c(setCode setcode) {
        String b;
        synchronized (this.d) {
            b = this.d.b((getTxnSourceValue<setCode, String>) setcode);
        }
        String str = b;
        if (b == null) {
            str = a(setcode);
        }
        synchronized (this.d) {
            this.d.e(setcode, str);
        }
        return str;
    }
}
