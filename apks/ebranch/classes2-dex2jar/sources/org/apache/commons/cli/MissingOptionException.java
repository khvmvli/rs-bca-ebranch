package org.apache.commons.cli;

import java.util.Iterator;
import java.util.List;
/* loaded from: classes2-dex2jar.jar:org/apache/commons/cli/MissingOptionException.class */
public class MissingOptionException extends ParseException {
    private List e;

    private MissingOptionException(String str) {
        super(str);
    }

    public MissingOptionException(List list) {
        this(e(list));
        this.e = list;
    }

    private static String e(List list) {
        StringBuffer stringBuffer = new StringBuffer("Missing required option");
        stringBuffer.append(list.size() == 1 ? "" : "s");
        stringBuffer.append(": ");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            stringBuffer.append(it.next());
            if (it.hasNext()) {
                stringBuffer.append(", ");
            }
        }
        return stringBuffer.toString();
    }
}
