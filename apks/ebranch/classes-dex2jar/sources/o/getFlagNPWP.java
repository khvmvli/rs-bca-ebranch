package o;
/* loaded from: classes-dex2jar.jar:o/getFlagNPWP.class */
public final class getFlagNPWP {
    public static <TInput, TResult, TException extends Throwable> TResult a(int i, TInput tinput, getFotoNpwp<TInput, TResult, TException> getfotonpwp, getHmAddress<TInput, TResult> gethmaddress) throws Throwable {
        TResult e;
        int i2;
        int i3 = 5;
        do {
            e = getfotonpwp.e(tinput);
            tinput = gethmaddress.a(tinput, e);
            if (tinput == null) {
                break;
            }
            i2 = i3 - 1;
            i3 = i2;
        } while (i2 > 0);
        return e;
    }
}
