package o;

import java.util.ArrayList;
/* loaded from: classes2-dex2jar.jar:o/Stetho$2.class */
public final class Stetho$2 extends finish {
    @Override // o.finish
    protected final String[] a(provide provide, String[] strArr, boolean z) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        boolean z2 = false;
        while (i < strArr.length) {
            String str = strArr[i];
            if ("--".equals(str)) {
                arrayList.add("--");
                z2 = true;
            } else if ("-".equals(str)) {
                arrayList.add("-");
            } else if (str.startsWith("-")) {
                String d = Stetho$DefaultDumperPluginsBuilder.d(str);
                if (provide.a(d)) {
                    arrayList.add(str);
                } else if (d.indexOf(61) != -1 && provide.a(d.substring(0, d.indexOf(61)))) {
                    arrayList.add(str.substring(0, str.indexOf(61)));
                    arrayList.add(str.substring(str.indexOf(61) + 1));
                } else if (provide.a(str.substring(0, 2))) {
                    arrayList.add(str.substring(0, 2));
                    arrayList.add(str.substring(2));
                } else {
                    arrayList.add(str);
                    z2 = z;
                }
            } else {
                arrayList.add(str);
            }
            int i2 = i;
            if (z2) {
                while (true) {
                    i++;
                    i2 = i;
                    if (i < strArr.length) {
                        arrayList.add(strArr[i]);
                    }
                }
            }
            i = i2 + 1;
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }
}
