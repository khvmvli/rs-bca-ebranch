package o;

import java.io.ObjectStreamException;
import java.math.BigDecimal;
/* loaded from: classes-dex2jar.jar:o/fotoID.class */
public final class fotoID extends Number {
    private final String c;

    public fotoID(String str) {
        this.c = str;
    }

    private Object writeReplace() throws ObjectStreamException {
        return new BigDecimal(this.c);
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.c);
    }

    @Override // java.lang.Object
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fotoID)) {
            return false;
        }
        String str = this.c;
        String str2 = ((fotoID) obj).c;
        boolean z = true;
        if (str != str2) {
            z = str.equals(str2);
        }
        return z;
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.c);
    }

    @Override // java.lang.Object
    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override // java.lang.Number
    public final int intValue() {
        try {
            return Integer.parseInt(this.c);
        } catch (NumberFormatException e) {
            try {
                return (int) Long.parseLong(this.c);
            } catch (NumberFormatException e2) {
                return new BigDecimal(this.c).intValue();
            }
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        try {
            return Long.parseLong(this.c);
        } catch (NumberFormatException e) {
            return new BigDecimal(this.c).longValue();
        }
    }

    @Override // java.lang.Object
    public final String toString() {
        return this.c;
    }
}
