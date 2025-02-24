package o;

import java.util.Enumeration;
import java.util.List;
import java.util.ListIterator;
import java.util.Properties;
import org.apache.commons.cli.MissingArgumentException;
import org.apache.commons.cli.ParseException;
/* loaded from: classes2-dex2jar.jar:o/finish.class */
public abstract class finish implements Stetho$1 {
    private List a;
    private provide b;
    protected Stetho$3 e;

    private void c(getInspectorModules getinspectormodules, ListIterator listIterator) throws ParseException {
        while (true) {
            if (!listIterator.hasNext()) {
                break;
            }
            String str = (String) listIterator.next();
            if (this.b.a(str) && str.startsWith("-")) {
                listIterator.previous();
                break;
            }
            String str2 = str;
            try {
                if (str.startsWith("\"")) {
                    str2 = str.substring(1, str.length());
                }
                String str3 = str2;
                if (str2.endsWith("\"")) {
                    str3 = str2.substring(0, str2.length() - 1);
                }
                getinspectormodules.c(str3);
            } catch (RuntimeException e) {
                listIterator.previous();
            }
        }
        if (getinspectormodules.b() == null && !getinspectormodules.g) {
            throw new MissingArgumentException(getinspectormodules);
        }
    }

    private void d(Properties properties) {
        if (properties != null) {
            Enumeration<?> propertyNames = properties.propertyNames();
            while (propertyNames.hasMoreElements()) {
                String obj = propertyNames.nextElement().toString();
                Stetho$3 stetho$3 = this.e;
                if (!stetho$3.c.contains(stetho$3.e(obj))) {
                    getInspectorModules c = this.b.c(obj);
                    String property = properties.getProperty(obj);
                    int i = c.d;
                    if (i > 0 || i == -2) {
                        if (c.b() == null || c.b().length == 0) {
                            try {
                                c.c(property);
                            } catch (RuntimeException e) {
                            }
                        }
                    } else if (!"yes".equalsIgnoreCase(property) && !"true".equalsIgnoreCase(property) && !"1".equalsIgnoreCase(property)) {
                        return;
                    }
                    this.e.c.add(c);
                }
            }
        }
    }

    protected abstract String[] a(provide provide, String[] strArr, boolean z);

    /* JADX WARN: Removed duplicated region for block: B:70:0x01cc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0077 A[SYNTHETIC] */
    @Override // o.Stetho$1
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final o.Stetho$3 d(o.provide r6, java.lang.String[] r7, boolean r8) throws org.apache.commons.cli.ParseException {
        /*
        // Method dump skipped, instructions count: 545
        */
        throw new UnsupportedOperationException("Method not decompiled: o.finish.d(o.provide, java.lang.String[], boolean):o.Stetho$3");
    }
}
