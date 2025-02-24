package o;
/* loaded from: classes-dex2jar.jar:o/realmGet$incomeAmount.class */
final class realmGet$incomeAmount implements realmGet$cardCode {
    private final String b;
    private final realmGet$cardDescription c;
    private final Object[] d;
    private final int e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public realmGet$incomeAmount(realmGet$cardDescription realmget_carddescription, String str, Object[] objArr) {
        char c;
        Throwable e;
        String str2;
        this.c = realmget_carddescription;
        this.b = str;
        this.d = objArr;
        int i = 1;
        try {
            c = str.charAt(0);
        } catch (StringIndexOutOfBoundsException e2) {
            char[] charArray = str.toCharArray();
            str = new String(charArray);
            try {
                c = str.charAt(0);
            } catch (StringIndexOutOfBoundsException e3) {
                try {
                    char[] cArr = new char[str.length()];
                    str.getChars(0, str.length(), cArr, 0);
                    str2 = new String(cArr);
                } catch (ArrayIndexOutOfBoundsException e4) {
                    e = e4;
                } catch (StringIndexOutOfBoundsException e5) {
                    e = e5;
                }
                try {
                    c = str2.charAt(0);
                    str = str2;
                } catch (ArrayIndexOutOfBoundsException | StringIndexOutOfBoundsException e6) {
                    e = e6;
                    str = str2;
                    throw new IllegalStateException(String.format("Failed parsing '%s' with charArray.length of %d", str, Integer.valueOf(charArray.length)), e);
                }
            }
        }
        if (c < 55296) {
            this.e = c;
            return;
        }
        int i2 = c & 8191;
        int i3 = 13;
        while (true) {
            char charAt = str.charAt(i);
            if (charAt >= 55296) {
                i2 |= (charAt & 8191) << i3;
                i3 += 13;
                i++;
            } else {
                this.e = (charAt << i3) | i2;
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String a() {
        return this.b;
    }

    @Override // o.realmGet$cardCode
    public final boolean b() {
        return (this.e & 2) == 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object[] c() {
        return this.d;
    }

    @Override // o.realmGet$cardCode
    public final int d() {
        return (this.e & 1) == 1 ? 1 : 2;
    }

    @Override // o.realmGet$cardCode
    public final realmGet$cardDescription e() {
        return this.c;
    }
}
