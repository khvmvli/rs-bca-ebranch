package com.facebook.stetho.inspector.helper;

import android.view.ViewDebug;
/* loaded from: classes-dex2jar.jar:com/facebook/stetho/inspector/helper/IntegerFormatter.class */
public class IntegerFormatter {
    private static IntegerFormatter cachedFormatter;

    /* loaded from: classes-dex2jar.jar:com/facebook/stetho/inspector/helper/IntegerFormatter$IntegerFormatterWithHex.class */
    static class IntegerFormatterWithHex extends IntegerFormatter {
        private IntegerFormatterWithHex() {
            super();
        }

        @Override // com.facebook.stetho.inspector.helper.IntegerFormatter
        public String format(Integer num, ViewDebug.ExportedProperty exportedProperty) {
            if (exportedProperty == null || !exportedProperty.formatToHexString()) {
                return format(num, exportedProperty);
            }
            StringBuilder sb = new StringBuilder("0x");
            sb.append(Integer.toHexString(num.intValue()));
            return sb.toString();
        }
    }

    private IntegerFormatter() {
    }

    public static IntegerFormatter getInstance() {
        if (cachedFormatter == null) {
            synchronized (IntegerFormatter.class) {
                try {
                    if (cachedFormatter == null) {
                        cachedFormatter = new IntegerFormatterWithHex();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return cachedFormatter;
    }

    public String format(Integer num, ViewDebug.ExportedProperty exportedProperty) {
        return String.valueOf(num);
    }
}
