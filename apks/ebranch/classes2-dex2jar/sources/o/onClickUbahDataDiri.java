package o;
/* loaded from: classes2-dex2jar.jar:o/onClickUbahDataDiri.class */
public final class onClickUbahDataDiri implements onClickUbahDataKontakDarurat<Number> {
    @Override // o.onClickUbahDataKontakDarurat
    public final /* synthetic */ Number e(float f, Number number, Number number2) {
        float floatValue = number.floatValue();
        return Float.valueOf(floatValue + (f * (number2.floatValue() - floatValue)));
    }
}
