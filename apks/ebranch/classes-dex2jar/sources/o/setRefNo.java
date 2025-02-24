package o;

import android.text.TextUtils;
import java.net.URL;
import java.security.MessageDigest;
import o.FirebaseResponse;
/* loaded from: classes-dex2jar.jar:o/setRefNo.class */
public class setRefNo implements setCode {
    public final String a;
    public final FirebaseResponse.TxnDataDetail b;
    public String c;
    public URL d;
    private volatile byte[] g;
    public final URL h;
    private int j;

    public setRefNo(String str) {
        this(str, FirebaseResponse.TxnDataDetail.d);
    }

    private setRefNo(String str, FirebaseResponse.TxnDataDetail txnDataDetail) {
        this.h = null;
        if (!TextUtils.isEmpty(str)) {
            this.a = str;
            if (txnDataDetail != null) {
                this.b = txnDataDetail;
                return;
            }
            throw new NullPointerException("Argument must not be null");
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }

    public setRefNo(URL url) {
        this(url, FirebaseResponse.TxnDataDetail.d);
    }

    private setRefNo(URL url, FirebaseResponse.TxnDataDetail txnDataDetail) {
        if (url != null) {
            this.h = url;
            this.a = null;
            if (txnDataDetail != null) {
                this.b = txnDataDetail;
                return;
            }
            throw new NullPointerException("Argument must not be null");
        }
        throw new NullPointerException("Argument must not be null");
    }

    private String a() {
        String str = this.a;
        String str2 = str;
        if (str == null) {
            URL url = this.h;
            if (url != null) {
                str2 = url.toString();
            } else {
                throw new NullPointerException("Argument must not be null");
            }
        }
        return str2;
    }

    @Override // o.setCode
    public final void e(MessageDigest messageDigest) {
        if (this.g == null) {
            this.g = a().getBytes(e);
        }
        messageDigest.update(this.g);
    }

    @Override // o.setCode
    public boolean equals(Object obj) {
        boolean z = false;
        if (obj instanceof setRefNo) {
            setRefNo setrefno = (setRefNo) obj;
            String str = this.a;
            String str2 = str;
            if (str == null) {
                URL url = this.h;
                if (url != null) {
                    str2 = url.toString();
                } else {
                    throw new NullPointerException("Argument must not be null");
                }
            }
            String str3 = setrefno.a;
            String str4 = str3;
            if (str3 == null) {
                URL url2 = setrefno.h;
                if (url2 != null) {
                    str4 = url2.toString();
                } else {
                    throw new NullPointerException("Argument must not be null");
                }
            }
            z = false;
            if (str2.equals(str4)) {
                z = false;
                if (this.b.equals(setrefno.b)) {
                    z = true;
                }
            }
        }
        return z;
    }

    @Override // o.setCode
    public int hashCode() {
        if (this.j == 0) {
            int hashCode = a().hashCode();
            this.j = hashCode;
            this.j = (hashCode * 31) + this.b.hashCode();
        }
        return this.j;
    }

    public String toString() {
        return a();
    }
}
