package o;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes-dex2jar.jar:o/getCreditCardSupplements.class */
public final class getCreditCardSupplements implements getCustomerFullName {
    private final Double b;

    public getCreditCardSupplements(Double d) {
        if (d == null) {
            this.b = Double.valueOf(Double.NaN);
        } else {
            this.b = d;
        }
    }

    @Override // o.getCustomerFullName
    public final Double a() {
        return this.b;
    }

    @Override // o.getCustomerFullName
    public final Boolean b() {
        return Boolean.valueOf(!Double.isNaN(this.b.doubleValue()) && this.b.doubleValue() != 0.0d);
    }

    @Override // o.getCustomerFullName
    public final Iterator<getCustomerFullName> c() {
        return null;
    }

    @Override // o.getCustomerFullName
    public final getCustomerFullName c(String str, realmSet$ccOtherBankCreditCards realmset_ccotherbankcreditcards, List<getCustomerFullName> list) {
        if ("toString".equals(str)) {
            return new getEmergencyContactMobileNumber(d());
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", d(), str));
    }

    @Override // o.getCustomerFullName
    public final String d() {
        if (Double.isNaN(this.b.doubleValue())) {
            return "NaN";
        }
        if (Double.isInfinite(this.b.doubleValue())) {
            return this.b.doubleValue() > 0.0d ? "Infinity" : "-Infinity";
        }
        BigDecimal stripTrailingZeros = BigDecimal.valueOf(this.b.doubleValue()).stripTrailingZeros();
        DecimalFormat decimalFormat = new DecimalFormat("0E0");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        decimalFormat.setMinimumFractionDigits((stripTrailingZeros.scale() > 0 ? stripTrailingZeros.precision() : stripTrailingZeros.scale()) - 1);
        String format = decimalFormat.format(stripTrailingZeros);
        int indexOf = format.indexOf("E");
        String str = format;
        if (indexOf > 0) {
            int parseInt = Integer.parseInt(format.substring(indexOf + 1));
            str = ((parseInt >= 0 || parseInt <= -7) && (parseInt < 0 || parseInt >= 21)) ? format.replace("E-", "e-").replace("E", "e+") : stripTrailingZeros.toPlainString();
        }
        return str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof getCreditCardSupplements)) {
            return false;
        }
        return this.b.equals(((getCreditCardSupplements) obj).b);
    }

    @Override // o.getCustomerFullName
    public final getCustomerFullName h() {
        return new getCreditCardSupplements(this.b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return d();
    }
}
