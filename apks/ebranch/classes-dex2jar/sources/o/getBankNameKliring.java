package o;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o.FirebaseResponse;
/* loaded from: classes-dex2jar.jar:o/getBankNameKliring.class */
public final class getBankNameKliring implements FirebaseResponse.TxnDataDetail {
    private final Map<String, List<FirebaseResponse$$Parcelable>> c;
    private volatile Map<String, String> e;

    /* loaded from: classes-dex2jar.jar:o/getBankNameKliring$IconCompatParcelizer.class */
    public static final class IconCompatParcelizer {
        private static final Map<String, List<FirebaseResponse$$Parcelable>> c;
        private static final String e;
        boolean a = true;
        Map<String, List<FirebaseResponse$$Parcelable>> b = c;
        private boolean d = true;

        static {
            String property = System.getProperty("http.agent");
            if (!TextUtils.isEmpty(property)) {
                int length = property.length();
                StringBuilder sb = new StringBuilder(property.length());
                for (int i = 0; i < length; i++) {
                    char charAt = property.charAt(i);
                    if ((charAt > 31 || charAt == '\t') && charAt < 127) {
                        sb.append(charAt);
                    } else {
                        sb.append('?');
                    }
                }
                property = sb.toString();
            }
            e = property;
            HashMap hashMap = new HashMap(2);
            if (!TextUtils.isEmpty(property)) {
                hashMap.put("User-Agent", Collections.singletonList(new RemoteActionCompatParcelizer(property)));
            }
            c = Collections.unmodifiableMap(hashMap);
        }
    }

    /* loaded from: classes-dex2jar.jar:o/getBankNameKliring$RemoteActionCompatParcelizer.class */
    static final class RemoteActionCompatParcelizer implements FirebaseResponse$$Parcelable {
        private final String a;

        RemoteActionCompatParcelizer(String str) {
            this.a = str;
        }

        @Override // o.FirebaseResponse$$Parcelable
        public final String c() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof RemoteActionCompatParcelizer) {
                return this.a.equals(((RemoteActionCompatParcelizer) obj).a);
            }
            return false;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("StringHeaderFactory{value='");
            sb.append(this.a);
            sb.append("'}");
            return sb.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public getBankNameKliring(Map<String, List<FirebaseResponse$$Parcelable>> map) {
        this.c = Collections.unmodifiableMap(map);
    }

    private static String e(List<FirebaseResponse$$Parcelable> list) {
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            String c = list.get(i).c();
            if (!TextUtils.isEmpty(c)) {
                sb.append(c);
                if (i != list.size() - 1) {
                    sb.append(',');
                }
            }
        }
        return sb.toString();
    }

    @Override // o.FirebaseResponse.TxnDataDetail
    public final Map<String, String> d() {
        if (this.e == null) {
            synchronized (this) {
                if (this.e == null) {
                    HashMap hashMap = new HashMap();
                    for (Map.Entry<String, List<FirebaseResponse$$Parcelable>> entry : this.c.entrySet()) {
                        String e = e(entry.getValue());
                        if (!TextUtils.isEmpty(e)) {
                            hashMap.put(entry.getKey(), e);
                        }
                    }
                    this.e = Collections.unmodifiableMap(hashMap);
                }
            }
        }
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof getBankNameKliring) {
            return this.c.equals(((getBankNameKliring) obj).c);
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LazyHeaders{headers=");
        sb.append(this.c);
        sb.append('}');
        return sb.toString();
    }
}
