package o;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes2-dex2jar.jar:o/getInspectorModules.class */
public class getInspectorModules implements Cloneable, Serializable {
    public String a;
    String b;
    int d;
    public String e;
    boolean f;
    boolean g;
    private char h;
    private Object i;
    String c = "arg";
    List j = new ArrayList();

    public getInspectorModules(String str, String str2, boolean z, String str3) throws IllegalArgumentException {
        this.d = -1;
        provideIfDesired.e(str);
        this.e = str;
        this.a = str2;
        if (z) {
            this.d = 1;
        }
        this.b = str3;
    }

    private void d(String str) {
        if (this.d <= 0 || this.j.size() <= this.d - 1) {
            this.j.add(str);
            return;
        }
        throw new RuntimeException("Cannot add value, list full.");
    }

    public final String[] b() {
        String[] strArr;
        if (this.j.isEmpty()) {
            strArr = null;
        } else {
            List list = this.j;
            strArr = (String[]) list.toArray(new String[list.size()]);
        }
        return strArr;
    }

    public final void c(String str) {
        if (this.d != -1) {
            String str2 = str;
            if (this.h > 0) {
                char c = this.h;
                int indexOf = str.indexOf(c);
                while (true) {
                    str2 = str;
                    if (indexOf == -1) {
                        break;
                    } else if (this.j.size() == this.d - 1) {
                        str2 = str;
                        break;
                    } else {
                        d(str.substring(0, indexOf));
                        str = str.substring(indexOf + 1);
                        indexOf = str.indexOf(c);
                    }
                }
            }
            d(str2);
            return;
        }
        throw new RuntimeException("NO_ARGS_ALLOWED");
    }

    @Override // java.lang.Object
    public Object clone() {
        try {
            getInspectorModules getinspectormodules = (getInspectorModules) clone();
            getinspectormodules.j = new ArrayList(this.j);
            return getinspectormodules;
        } catch (CloneNotSupportedException e) {
            StringBuffer stringBuffer = new StringBuffer("A CloneNotSupportedException was thrown: ");
            stringBuffer.append(e.getMessage());
            throw new RuntimeException(stringBuffer.toString());
        }
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        getInspectorModules getinspectormodules = (getInspectorModules) obj;
        String str = this.e;
        if (str != null) {
            if (!str.equals(getinspectormodules.e)) {
                return false;
            }
        } else if (getinspectormodules.e != null) {
            return false;
        }
        String str2 = this.a;
        String str3 = getinspectormodules.a;
        return str2 != null ? str2.equals(str3) : str3 == null;
    }

    @Override // java.lang.Object
    public int hashCode() {
        String str = this.e;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.a;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return (hashCode * 31) + i;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("[ option: ");
        stringBuffer.append(this.e);
        if (this.a != null) {
            stringBuffer.append(" ");
            stringBuffer.append(this.a);
        }
        stringBuffer.append(" ");
        int i = this.d;
        boolean z = false;
        if (i > 1 || i == -2) {
            stringBuffer.append("[ARG...]");
        } else {
            int i2 = this.d;
            if (i2 > 0 || i2 == -2) {
                z = true;
            }
            if (z) {
                stringBuffer.append(" [ARG]");
            }
        }
        stringBuffer.append(" :: ");
        stringBuffer.append(this.b);
        if (this.i != null) {
            stringBuffer.append(" :: ");
            stringBuffer.append(this.i);
        }
        stringBuffer.append(" ]");
        return stringBuffer.toString();
    }
}
