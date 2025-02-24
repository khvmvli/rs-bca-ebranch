package okhttp3.internal.publicsuffix;

import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import o.ChuckerDatabase;
import o.ChuckerDatabase_Impl;
import o.defaultInspectorModulesProvider;
import o.setTookMs;
import okhttp3.internal.Util;
import okhttp3.internal.platform.Platform;
/* loaded from: classes2-dex2jar.jar:okhttp3/internal/publicsuffix/PublicSuffixDatabase.class */
public final class PublicSuffixDatabase {
    private static final byte EXCEPTION_MARKER = 33;
    public static final String PUBLIC_SUFFIX_RESOURCE = "publicsuffixes.gz";
    private byte[] publicSuffixExceptionListBytes;
    private byte[] publicSuffixListBytes;
    private static final byte[] WILDCARD_LABEL = {42};
    private static final String[] EMPTY_RULE = new String[0];
    private static final String[] PREVAILING_RULE = {"*"};
    private static final PublicSuffixDatabase instance = new PublicSuffixDatabase();
    private final AtomicBoolean listRead = new AtomicBoolean(false);
    private final CountDownLatch readCompleteLatch = new CountDownLatch(1);

    private static String binarySearchBytes(byte[] bArr, byte[][] bArr2, int i) {
        String str;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int length = bArr.length;
        int i7 = 0;
        while (true) {
            if (i7 >= length) {
                str = null;
                break;
            }
            int i8 = (i7 + length) / 2;
            while (i8 >= 0 && bArr[i8] != 10) {
                i8--;
            }
            int i9 = i8 + 1;
            int i10 = 1;
            while (true) {
                i2 = i9 + i10;
                if (bArr[i2] == 10) {
                    break;
                }
                i10++;
            }
            int i11 = i2 - i9;
            int i12 = i;
            boolean z = false;
            int i13 = 0;
            int i14 = 0;
            while (true) {
                if (z) {
                    i3 = 46;
                    z = false;
                } else {
                    i3 = bArr2[i12][i13] & 255;
                }
                i4 = i3 - (bArr[i9 + i14] & 255);
                i5 = i13;
                i6 = i14;
                if (i4 != 0) {
                    break;
                }
                i14++;
                i13++;
                i5 = i13;
                i6 = i14;
                if (i14 == i11) {
                    break;
                } else if (bArr2[i12].length == i13) {
                    if (i12 == bArr2.length - 1) {
                        i5 = i13;
                        i6 = i14;
                        break;
                    }
                    i12++;
                    i13 = -1;
                    z = true;
                }
            }
            if (i4 >= 0) {
                if (i4 <= 0) {
                    int i15 = i11 - i6;
                    int length2 = bArr2[i12].length - i5;
                    while (true) {
                        i12++;
                        if (i12 >= bArr2.length) {
                            break;
                        }
                        length2 += bArr2[i12].length;
                    }
                    if (length2 >= i15) {
                        if (length2 <= i15) {
                            str = new String(bArr, i9, i11, Util.UTF_8);
                            break;
                        }
                    }
                }
                i7 = i2 + 1;
            }
            length = i9 - 1;
        }
        return str;
    }

    private String[] findMatchingRule(String[] strArr) {
        String str;
        String str2;
        int i = 0;
        if (this.listRead.get() || !this.listRead.compareAndSet(false, true)) {
            try {
                this.readCompleteLatch.await();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        } else {
            readTheListUninterruptibly();
        }
        synchronized (this) {
            if (this.publicSuffixListBytes == null) {
                throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.");
            }
        }
        int length = strArr.length;
        byte[][] bArr = new byte[length];
        for (int i2 = 0; i2 < strArr.length; i2++) {
            bArr[i2] = strArr[i2].getBytes(Util.UTF_8);
        }
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                str = null;
                break;
            }
            String binarySearchBytes = binarySearchBytes(this.publicSuffixListBytes, bArr, i3);
            str = binarySearchBytes;
            if (binarySearchBytes != null) {
                break;
            }
            i3++;
        }
        if (length > 1) {
            byte[][] bArr2 = (byte[][]) bArr.clone();
            for (int i4 = 0; i4 < bArr2.length - 1; i4++) {
                bArr2[i4] = WILDCARD_LABEL;
                String binarySearchBytes2 = binarySearchBytes(this.publicSuffixListBytes, bArr2, i4);
                str2 = binarySearchBytes2;
                if (binarySearchBytes2 != null) {
                    break;
                }
            }
        }
        str2 = null;
        String str3 = null;
        if (str2 != null) {
            while (true) {
                str3 = null;
                if (i >= length - 1) {
                    break;
                }
                str3 = binarySearchBytes(this.publicSuffixExceptionListBytes, bArr, i);
                if (str3 != null) {
                    break;
                }
                i++;
            }
        }
        if (str3 != null) {
            StringBuilder sb = new StringBuilder("!");
            sb.append(str3);
            return sb.toString().split("\\.");
        } else if (str == null && str2 == null) {
            return PREVAILING_RULE;
        } else {
            String[] split = str != null ? str.split("\\.") : EMPTY_RULE;
            String[] split2 = str2 != null ? str2.split("\\.") : EMPTY_RULE;
            String[] strArr2 = split;
            if (split.length <= split2.length) {
                strArr2 = split2;
            }
            return strArr2;
        }
    }

    public static PublicSuffixDatabase get() {
        return instance;
    }

    private void readTheList() throws IOException {
        InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream(PUBLIC_SUFFIX_RESOURCE);
        if (resourceAsStream != null) {
            setTookMs b = ChuckerDatabase.b((defaultInspectorModulesProvider) new ChuckerDatabase_Impl(ChuckerDatabase.d(resourceAsStream)));
            try {
                byte[] bArr = new byte[b.n()];
                b.a(bArr);
                byte[] bArr2 = new byte[b.n()];
                b.a(bArr2);
                synchronized (this) {
                    this.publicSuffixListBytes = bArr;
                    this.publicSuffixExceptionListBytes = bArr2;
                }
                this.readCompleteLatch.countDown();
            } finally {
                Util.closeQuietly(b);
            }
        }
    }

    private void readTheListUninterruptibly() {
        boolean z = false;
        while (true) {
            try {
                try {
                    try {
                        readTheList();
                        break;
                    } catch (IOException e) {
                        Platform.get().log(5, "Failed to read public suffix list", e);
                        if (z) {
                            Thread.currentThread().interrupt();
                            return;
                        }
                        return;
                    }
                } catch (InterruptedIOException e2) {
                    Thread.interrupted();
                    z = true;
                }
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public final String getEffectiveTldPlusOne(String str) {
        int i;
        int i2;
        if (str != null) {
            String[] split = IDN.toUnicode(str).split("\\.");
            String[] findMatchingRule = findMatchingRule(split);
            if (split.length == findMatchingRule.length && findMatchingRule[0].charAt(0) != '!') {
                return null;
            }
            if (findMatchingRule[0].charAt(0) == '!') {
                i2 = split.length;
                i = findMatchingRule.length;
            } else {
                i2 = split.length;
                i = findMatchingRule.length + 1;
            }
            StringBuilder sb = new StringBuilder();
            String[] split2 = str.split("\\.");
            for (int i3 = i2 - i; i3 < split2.length; i3++) {
                sb.append(split2[i3]);
                sb.append('.');
            }
            sb.deleteCharAt(sb.length() - 1);
            return sb.toString();
        }
        throw new NullPointerException("domain == null");
    }

    final void setListBytes(byte[] bArr, byte[] bArr2) {
        this.publicSuffixListBytes = bArr;
        this.publicSuffixExceptionListBytes = bArr2;
        this.listRead.set(true);
        this.readCompleteLatch.countDown();
    }
}
