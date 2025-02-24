package o;
/* loaded from: classes2-dex2jar.jar:o/onClickedHubungan.class */
public final class onClickedHubungan {
    public final CC16FormKartuKreditFragment a;
    public final int[] d;

    public onClickedHubungan(CC16FormKartuKreditFragment cC16FormKartuKreditFragment, int[] iArr) {
        if (iArr.length != 0) {
            this.a = cC16FormKartuKreditFragment;
            int length = iArr.length;
            if (length <= 1 || iArr[0] != 0) {
                this.d = iArr;
                return;
            }
            int i = 1;
            while (i < length && iArr[i] == 0) {
                i++;
            }
            if (i == length) {
                this.d = new int[]{0};
                return;
            }
            int i2 = length - i;
            int[] iArr2 = new int[i2];
            this.d = iArr2;
            System.arraycopy(iArr, i, iArr2, 0, i2);
            return;
        }
        throw new IllegalArgumentException();
    }

    private onClickedHubungan a(onClickedHubungan onclickedhubungan) {
        if (this.a.equals(onclickedhubungan.a)) {
            boolean z = true;
            if (this.d[0] == 0) {
                return onclickedhubungan;
            }
            if (onclickedhubungan.d[0] != 0) {
                z = false;
            }
            if (z) {
                return this;
            }
            int[] iArr = this.d;
            int[] iArr2 = onclickedhubungan.d;
            int[] iArr3 = iArr;
            int[] iArr4 = iArr2;
            if (iArr.length <= iArr2.length) {
                iArr3 = iArr2;
                iArr4 = iArr;
            }
            int[] iArr5 = new int[iArr3.length];
            int length = iArr3.length - iArr4.length;
            System.arraycopy(iArr3, 0, iArr5, 0, length);
            for (int i = length; i < iArr3.length; i++) {
                iArr5[i] = CC16FormKartuKreditFragment.b(iArr4[i - length], iArr3[i]);
            }
            return new onClickedHubungan(this.a, iArr5);
        }
        throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
    }

    public final onClickedHubungan[] c(onClickedHubungan onclickedhubungan) {
        onClickedHubungan onclickedhubungan2;
        if (this.a.equals(onclickedhubungan.a)) {
            if (!(onclickedhubungan.d[0] == 0)) {
                onClickedHubungan onclickedhubungan3 = this.a.m;
                int[] iArr = onclickedhubungan.d;
                int i = iArr[(iArr.length - 1) - (iArr.length - 1)];
                CC16FormKartuKreditFragment cC16FormKartuKreditFragment = this.a;
                if (i != 0) {
                    int i2 = cC16FormKartuKreditFragment.j[(cC16FormKartuKreditFragment.k - cC16FormKartuKreditFragment.n[i]) - 1];
                    onClickedHubungan onclickedhubungan4 = this;
                    while (true) {
                        int[] iArr2 = onclickedhubungan4.d;
                        if (iArr2.length - 1 >= onclickedhubungan.d.length - 1) {
                            if (iArr2[0] == 0) {
                                break;
                            }
                            int[] iArr3 = onclickedhubungan4.d;
                            int length = (iArr3.length - 1) - (onclickedhubungan.d.length - 1);
                            int d = this.a.d(iArr3[(iArr3.length - 1) - (iArr3.length - 1)], i2);
                            onClickedHubungan e = onclickedhubungan.e(length, d);
                            CC16FormKartuKreditFragment cC16FormKartuKreditFragment2 = this.a;
                            if (length >= 0) {
                                if (d == 0) {
                                    onclickedhubungan2 = cC16FormKartuKreditFragment2.m;
                                } else {
                                    int[] iArr4 = new int[length + 1];
                                    iArr4[0] = d;
                                    onclickedhubungan2 = new onClickedHubungan(cC16FormKartuKreditFragment2, iArr4);
                                }
                                onclickedhubungan3 = onclickedhubungan3.a(onclickedhubungan2);
                                onclickedhubungan4 = onclickedhubungan4.a(e);
                            } else {
                                throw new IllegalArgumentException();
                            }
                        } else {
                            break;
                        }
                    }
                    return new onClickedHubungan[]{onclickedhubungan3, onclickedhubungan4};
                }
                throw new ArithmeticException();
            }
            throw new IllegalArgumentException("Divide by 0");
        }
        throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
    }

    public final onClickedHubungan e(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        } else if (i2 == 0) {
            return this.a.m;
        } else {
            int length = this.d.length;
            int[] iArr = new int[i + length];
            for (int i3 = 0; i3 < length; i3++) {
                iArr[i3] = this.a.d(this.d[i3], i2);
            }
            return new onClickedHubungan(this.a, iArr);
        }
    }

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder((this.d.length - 1) << 3);
        for (int length = this.d.length - 1; length >= 0; length--) {
            int[] iArr = this.d;
            int i2 = iArr[(iArr.length - 1) - length];
            if (i2 != 0) {
                if (i2 < 0) {
                    sb.append(" - ");
                    i = -i2;
                } else {
                    i = i2;
                    if (sb.length() > 0) {
                        sb.append(" + ");
                        i = i2;
                    }
                }
                if (length == 0 || i != 1) {
                    CC16FormKartuKreditFragment cC16FormKartuKreditFragment = this.a;
                    if (i != 0) {
                        int i3 = cC16FormKartuKreditFragment.n[i];
                        if (i3 == 0) {
                            sb.append('1');
                        } else if (i3 == 1) {
                            sb.append('a');
                        } else {
                            sb.append("a^");
                            sb.append(i3);
                        }
                    } else {
                        throw new IllegalArgumentException();
                    }
                }
                if (length != 0) {
                    if (length == 1) {
                        sb.append('x');
                    } else {
                        sb.append("x^");
                        sb.append(length);
                    }
                }
            }
        }
        return sb.toString();
    }
}
