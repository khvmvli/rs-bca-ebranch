package o;
/* loaded from: classes-dex2jar.jar:o/CountriesORPresenter.class */
class CountriesORPresenter extends CountryStatePresenter {
    public static final boolean e(char c, char c2, boolean z) {
        if (c == c2) {
            return true;
        }
        if (!z) {
            return false;
        }
        char upperCase = Character.toUpperCase(c);
        char upperCase2 = Character.toUpperCase(c2);
        boolean z2 = true;
        if (upperCase != upperCase2) {
            z2 = Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
        }
        return z2;
    }
}
