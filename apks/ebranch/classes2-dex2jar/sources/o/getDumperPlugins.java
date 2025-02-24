package o;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
/* loaded from: classes2-dex2jar.jar:o/getDumperPlugins.class */
public final class getDumperPlugins {
    public int h = 74;
    public int e = 1;
    public int a = 3;
    public String j = "usage: ";
    public String d = System.getProperty("line.separator");
    public String f = "-";
    public String b = "--";
    public String c = "arg";
    protected Comparator i = new write((byte) 0);

    /* loaded from: classes2-dex2jar.jar:o/getDumperPlugins$write.class */
    static final class write implements Comparator {
        private write() {
        }

        /* synthetic */ write(byte b) {
            this();
        }

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            getInspectorModules getinspectormodules = (getInspectorModules) obj;
            getInspectorModules getinspectormodules2 = (getInspectorModules) obj2;
            String str = getinspectormodules.e;
            String str2 = str;
            if (str == null) {
                str2 = getinspectormodules.a;
            }
            String str3 = getinspectormodules2.e;
            String str4 = str3;
            if (str3 == null) {
                str4 = getinspectormodules2.a;
            }
            return str2.compareToIgnoreCase(str4);
        }
    }

    private static String a(String str) {
        String str2 = str;
        if (str != null) {
            if (str.length() == 0) {
                str2 = str;
            } else {
                int length = str.length();
                while (length > 0 && Character.isWhitespace(str.charAt(length - 1))) {
                    length--;
                }
                str2 = str.substring(0, length);
            }
        }
        return str2;
    }

    private StringBuffer a(StringBuffer stringBuffer, int i, int i2, String str) {
        int c = c(str, i, 0);
        if (c == -1) {
            stringBuffer.append(a(str));
            return stringBuffer;
        }
        stringBuffer.append(a(str.substring(0, c)));
        stringBuffer.append(this.d);
        int i3 = i2;
        if (i2 >= i) {
            i3 = 1;
        }
        String e = e(i3);
        int i4 = c;
        while (true) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append(e);
            stringBuffer2.append(str.substring(i4).trim());
            str = stringBuffer2.toString();
            int c2 = c(str, i, 0);
            if (c2 == -1) {
                stringBuffer.append(str);
                return stringBuffer;
            }
            i4 = c2;
            if (str.length() > i) {
                i4 = c2;
                if (c2 == i3 - 1) {
                    i4 = i;
                }
            }
            stringBuffer.append(a(str.substring(0, i4)));
            stringBuffer.append(this.d);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
        if (r0 > r5) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private static int c(java.lang.String r4, int r5, int r6) {
        /*
            r0 = r4
            r1 = 10
            r2 = 0
            int r0 = r0.indexOf(r1, r2)
            r7 = r0
            r0 = -1
            r8 = r0
            r0 = r7
            r1 = -1
            if (r0 == r1) goto L_0x0017
            r0 = r7
            r6 = r0
            r0 = r7
            r1 = r5
            if (r0 <= r1) goto L_0x0029
        L_0x0017:
            r0 = r4
            r1 = 9
            r2 = 0
            int r0 = r0.indexOf(r1, r2)
            r6 = r0
            r0 = r6
            r1 = -1
            if (r0 == r1) goto L_0x002d
            r0 = r6
            r1 = r5
            if (r0 > r1) goto L_0x002d
        L_0x0029:
            r0 = r6
            r1 = 1
            int r0 = r0 + r1
            return r0
        L_0x002d:
            r0 = r5
            r1 = r4
            int r1 = r1.length()
            if (r0 < r1) goto L_0x0037
            r0 = -1
            return r0
        L_0x0037:
            r0 = r5
            r6 = r0
        L_0x0039:
            r0 = r6
            if (r0 < 0) goto L_0x005b
            r0 = r4
            r1 = r6
            char r0 = r0.charAt(r1)
            r7 = r0
            r0 = r7
            r1 = 32
            if (r0 == r1) goto L_0x005b
            r0 = r7
            r1 = 10
            if (r0 == r1) goto L_0x005b
            r0 = r7
            r1 = 13
            if (r0 == r1) goto L_0x005b
            int r6 = r6 + -1
            goto L_0x0039
        L_0x005b:
            r0 = r6
            if (r0 <= 0) goto L_0x0061
            r0 = r6
            return r0
        L_0x0061:
            r0 = r5
            r1 = r4
            int r1 = r1.length()
            if (r0 > r1) goto L_0x0087
            r0 = r4
            r1 = r5
            char r0 = r0.charAt(r1)
            r6 = r0
            r0 = r6
            r1 = 32
            if (r0 == r1) goto L_0x0087
            r0 = r6
            r1 = 10
            if (r0 == r1) goto L_0x0087
            r0 = r6
            r1 = 13
            if (r0 == r1) goto L_0x0087
            int r5 = r5 + 1
            goto L_0x0061
        L_0x0087:
            r0 = r5
            r1 = r4
            int r1 = r1.length()
            if (r0 != r1) goto L_0x0095
            r0 = r8
            r5 = r0
            goto L_0x0095
        L_0x0095:
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getDumperPlugins.c(java.lang.String, int, int):int");
    }

    private static String e(int i) {
        StringBuffer stringBuffer = new StringBuffer(i);
        for (int i2 = 0; i2 < i; i2++) {
            stringBuffer.append(' ');
        }
        return stringBuffer.toString();
    }

    private StringBuffer e(StringBuffer stringBuffer, int i, provide provide, int i2, int i3) {
        String e = e(i2);
        String e2 = e(i3);
        ArrayList arrayList = new ArrayList();
        ArrayList<getInspectorModules> arrayList2 = new ArrayList(provide.e.values());
        Collections.sort(arrayList2, this.i);
        int i4 = 0;
        int i5 = 0;
        for (getInspectorModules getinspectormodules : arrayList2) {
            StringBuffer stringBuffer2 = new StringBuffer(8);
            boolean z = true;
            if (getinspectormodules.e == null) {
                stringBuffer2.append(e);
                StringBuffer stringBuffer3 = new StringBuffer("   ");
                stringBuffer3.append(this.b);
                stringBuffer2.append(stringBuffer3.toString());
                stringBuffer2.append(getinspectormodules.a);
            } else {
                stringBuffer2.append(e);
                stringBuffer2.append(this.f);
                stringBuffer2.append(getinspectormodules.e);
                if (getinspectormodules.a != null) {
                    stringBuffer2.append(',');
                    stringBuffer2.append(this.b);
                    stringBuffer2.append(getinspectormodules.a);
                }
            }
            int i6 = getinspectormodules.d;
            if (i6 > 0 || i6 == -2) {
                String str = getinspectormodules.c;
                if (str == null || str.length() <= 0) {
                    z = false;
                }
                if (z) {
                    stringBuffer2.append(" <");
                    stringBuffer2.append(getinspectormodules.c);
                    stringBuffer2.append(">");
                } else {
                    stringBuffer2.append(' ');
                }
            }
            arrayList.add(stringBuffer2);
            if (stringBuffer2.length() > i5) {
                i5 = stringBuffer2.length();
            }
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            getInspectorModules getinspectormodules2 = (getInspectorModules) it.next();
            StringBuffer stringBuffer4 = new StringBuffer(arrayList.get(i4).toString());
            if (stringBuffer4.length() < i5) {
                stringBuffer4.append(e(i5 - stringBuffer4.length()));
            }
            stringBuffer4.append(e2);
            if (getinspectormodules2.b != null) {
                stringBuffer4.append(getinspectormodules2.b);
            }
            a(stringBuffer, i, i5 + i3, stringBuffer4.toString());
            if (it.hasNext()) {
                stringBuffer.append(this.d);
            }
            i4++;
        }
        return stringBuffer;
    }

    public final void c(PrintWriter printWriter, int i, provide provide, int i2, int i3) {
        StringBuffer stringBuffer = new StringBuffer();
        e(stringBuffer, i, provide, i2, i3);
        printWriter.println(stringBuffer.toString());
    }
}
