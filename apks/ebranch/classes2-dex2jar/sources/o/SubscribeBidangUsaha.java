package o;
/* loaded from: classes2-dex2jar.jar:o/SubscribeBidangUsaha.class */
public final class SubscribeBidangUsaha implements onClickUbahDataKontakDarurat<Integer> {
    @Override // o.onClickUbahDataKontakDarurat
    public final /* synthetic */ Integer e(float f, Integer num, Integer num2) {
        int intValue = num.intValue();
        return Integer.valueOf((int) (((float) intValue) + (f * ((float) (num2.intValue() - intValue)))));
    }
}
