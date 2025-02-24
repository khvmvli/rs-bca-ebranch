package o;

import io.realm.internal.Property;
import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
/* loaded from: classes-dex2jar.jar:o/onClickUbahCabang.class */
public abstract class onClickUbahCabang implements Closeable {
    private static final String[] h = new String[Property.TYPE_ARRAY];
    boolean a;
    boolean c;
    int g;
    int[] d = new int[32];
    String[] e = new String[32];
    int[] b = new int[32];

    /* loaded from: classes-dex2jar.jar:o/onClickUbahCabang$RemoteActionCompatParcelizer.class */
    public enum RemoteActionCompatParcelizer {
        BEGIN_ARRAY,
        END_ARRAY,
        BEGIN_OBJECT,
        END_OBJECT,
        NAME,
        STRING,
        NUMBER,
        BOOLEAN,
        NULL,
        END_DOCUMENT
    }

    static {
        for (int i = 0; i <= 31; i++) {
            h[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = h;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public static onClickUbahCabang d(setTookMs settookms) {
        return new proses(settookms);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006a  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static /* synthetic */ void d(o.setScheme$com_github_ChuckerTeam_Chucker_library r5, java.lang.String r6) throws java.io.IOException {
        /*
            java.lang.String[] r0 = o.onClickUbahCabang.h
            r7 = r0
            r0 = r5
            r1 = 34
            o.setScheme$com_github_ChuckerTeam_Chucker_library r0 = r0.e(r1)
            r0 = r6
            int r0 = r0.length()
            r8 = r0
            r0 = 0
            r9 = r0
            r0 = 0
            r10 = r0
        L_0x0018:
            r0 = r9
            r1 = r8
            if (r0 >= r1) goto L_0x008f
            r0 = r6
            r1 = r9
            char r0 = r0.charAt(r1)
            r11 = r0
            r0 = r11
            r1 = 128(0x80, float:1.8E-43)
            if (r0 >= r1) goto L_0x0044
            r0 = r7
            r1 = r11
            r0 = r0[r1]
            r12 = r0
            r0 = r12
            r13 = r0
            r0 = r12
            if (r0 != 0) goto L_0x0063
            r0 = r10
            r14 = r0
            goto L_0x0085
        L_0x0044:
            r0 = r11
            r1 = 8232(0x2028, float:1.1535E-41)
            if (r0 != r1) goto L_0x0053
            java.lang.String r0 = "\\u2028"
            r13 = r0
            goto L_0x0063
        L_0x0053:
            r0 = r10
            r14 = r0
            r0 = r11
            r1 = 8233(0x2029, float:1.1537E-41)
            if (r0 != r1) goto L_0x0085
            java.lang.String r0 = "\\u2029"
            r13 = r0
        L_0x0063:
            r0 = r10
            r1 = r9
            if (r0 >= r1) goto L_0x0076
            r0 = r5
            r1 = r6
            r2 = r10
            r3 = r9
            o.setScheme$com_github_ChuckerTeam_Chucker_library r0 = r0.e(r1, r2, r3)
        L_0x0076:
            r0 = r5
            r1 = r13
            o.setScheme$com_github_ChuckerTeam_Chucker_library r0 = r0.e(r1)
            r0 = r9
            r1 = 1
            int r0 = r0 + r1
            r14 = r0
        L_0x0085:
            int r9 = r9 + 1
            r0 = r14
            r10 = r0
            goto L_0x0018
        L_0x008f:
            r0 = r10
            r1 = r8
            if (r0 >= r1) goto L_0x00a0
            r0 = r5
            r1 = r6
            r2 = r10
            r3 = r8
            o.setScheme$com_github_ChuckerTeam_Chucker_library r0 = r0.e(r1, r2, r3)
        L_0x00a0:
            r0 = r5
            r1 = 34
            o.setScheme$com_github_ChuckerTeam_Chucker_library r0 = r0.e(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.onClickUbahCabang.d(o.setScheme$com_github_ChuckerTeam_Chucker_library, java.lang.String):void");
    }

    public abstract int a(onClickUbahCabang$MediaBrowserCompat$CustomActionResultReceiver onclickubahcabang_mediabrowsercompat_customactionresultreceiver) throws IOException;

    public abstract void a() throws IOException;

    public abstract void b() throws IOException;

    public final String c() {
        int i = this.g;
        int[] iArr = this.d;
        String[] strArr = this.e;
        int[] iArr2 = this.b;
        StringBuilder sb = new StringBuilder("$");
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2];
            if (i3 == 1 || i3 == 2) {
                sb.append('[');
                sb.append(iArr2[i2]);
                sb.append(']');
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                sb.append('.');
                String str = strArr[i2];
                if (str != null) {
                    sb.append(str);
                }
            }
        }
        return sb.toString();
    }

    final onChooseCabangEvent c(String str) throws onChooseCabangEvent {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" at path ");
        sb.append(c());
        throw new onChooseCabangEvent(sb.toString());
    }

    public abstract void d() throws IOException;

    public abstract void e() throws IOException;

    final void e(int i) {
        int i2 = this.g;
        int[] iArr = this.d;
        if (i2 == iArr.length) {
            if (i2 != 256) {
                this.d = Arrays.copyOf(iArr, iArr.length << 1);
                String[] strArr = this.e;
                this.e = (String[]) Arrays.copyOf(strArr, strArr.length << 1);
                int[] iArr2 = this.b;
                this.b = Arrays.copyOf(iArr2, iArr2.length << 1);
            } else {
                StringBuilder sb = new StringBuilder("Nesting too deep at ");
                sb.append(c());
                throw new onGetBranchEvent(sb.toString());
            }
        }
        int[] iArr3 = this.d;
        int i3 = this.g;
        this.g = i3 + 1;
        iArr3[i3] = i;
    }

    public abstract String f() throws IOException;

    public abstract boolean g() throws IOException;

    public abstract double h() throws IOException;

    public abstract boolean i() throws IOException;

    public abstract int j() throws IOException;

    public abstract String k() throws IOException;

    public abstract void l() throws IOException;

    public abstract void m() throws IOException;

    public abstract RemoteActionCompatParcelizer n() throws IOException;
}
