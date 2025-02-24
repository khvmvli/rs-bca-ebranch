package o;

import android.text.SpannableStringBuilder;
import java.util.Locale;
/* loaded from: classes-dex2jar.jar:o/dismissAllowingStateLoss.class */
public final class dismissAllowingStateLoss {
    static final dismissAllowingStateLoss b;
    static final isCancelable c;
    static final dismissAllowingStateLoss d;
    private static final String e = Character.toString(8206);
    private static final String i = Character.toString(8207);
    public final isCancelable a;
    private final int f;
    private final boolean j;

    /* loaded from: classes-dex2jar.jar:o/dismissAllowingStateLoss$IconCompatParcelizer.class */
    public static final class IconCompatParcelizer {
        boolean d = dismissAllowingStateLoss.c(Locale.getDefault());
        isCancelable c = dismissAllowingStateLoss.c;
        int e = 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/dismissAllowingStateLoss$RemoteActionCompatParcelizer.class */
    public static final class RemoteActionCompatParcelizer {
        private static final byte[] i = new byte[1792];
        final int a;
        final CharSequence b;
        char c;
        final boolean d = false;
        int e;

        static {
            for (int i2 = 0; i2 < 1792; i2++) {
                i[i2] = Character.getDirectionality(i2);
            }
        }

        RemoteActionCompatParcelizer(CharSequence charSequence, boolean z) {
            this.b = charSequence;
            this.a = charSequence.length();
        }

        private byte a() {
            char charAt;
            int i2 = this.e;
            while (true) {
                int i3 = this.e;
                if (i3 <= 0) {
                    break;
                }
                CharSequence charSequence = this.b;
                int i4 = i3 - 1;
                this.e = i4;
                char charAt2 = charSequence.charAt(i4);
                this.c = (char) charAt2;
                if (charAt2 != '<') {
                    if (charAt2 == '>') {
                        break;
                    } else if (charAt2 == '\"' || charAt2 == '\'') {
                        do {
                            int i5 = this.e;
                            if (i5 > 0) {
                                CharSequence charSequence2 = this.b;
                                int i6 = i5 - 1;
                                this.e = i6;
                                charAt = charSequence2.charAt(i6);
                                this.c = (char) charAt;
                            }
                        } while (charAt != charAt2);
                    }
                } else {
                    return 12;
                }
            }
            this.e = i2;
            this.c = (char) 62;
            return 13;
        }

        static byte c(char c) {
            return c < 1792 ? i[c] : Character.getDirectionality(c);
        }

        private byte d() {
            char charAt;
            int i2 = this.e;
            do {
                int i3 = this.e;
                if (i3 <= 0) {
                    break;
                }
                CharSequence charSequence = this.b;
                int i4 = i3 - 1;
                this.e = i4;
                charAt = charSequence.charAt(i4);
                this.c = (char) charAt;
                if (charAt == '&') {
                    return 12;
                }
            } while (charAt != ';');
            this.e = i2;
            this.c = (char) 59;
            return 13;
        }

        final byte b() {
            char charAt = this.b.charAt(this.e - 1);
            this.c = charAt;
            if (Character.isLowSurrogate(charAt)) {
                int codePointBefore = Character.codePointBefore(this.b, this.e);
                this.e -= Character.charCount(codePointBefore);
                return Character.getDirectionality(codePointBefore);
            }
            this.e--;
            char c = this.c;
            byte directionality = c < 1792 ? i[c] : Character.getDirectionality(c);
            byte b = directionality;
            if (this.d) {
                char c2 = this.c;
                if (c2 == '>') {
                    b = a();
                } else {
                    b = directionality;
                    if (c2 == ';') {
                        b = d();
                    }
                }
            }
            return b;
        }
    }

    static {
        isCancelable iscancelable = getTheme.a;
        c = iscancelable;
        b = new dismissAllowingStateLoss(false, 2, iscancelable);
        d = new dismissAllowingStateLoss(true, 2, iscancelable);
    }

    dismissAllowingStateLoss(boolean z, int i2, isCancelable iscancelable) {
        this.j = z;
        this.f = i2;
        this.a = iscancelable;
    }

    private static int b(CharSequence charSequence) {
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = new RemoteActionCompatParcelizer(charSequence, false);
        remoteActionCompatParcelizer.e = remoteActionCompatParcelizer.a;
        int i2 = 0;
        int i3 = 0;
        while (remoteActionCompatParcelizer.e > 0) {
            byte b2 = remoteActionCompatParcelizer.b();
            if (b2 != 0) {
                if (b2 == 1 || b2 == 2) {
                    if (i2 == 0) {
                        return 1;
                    }
                    if (i3 == 0) {
                        i3 = i2;
                    }
                } else if (b2 != 9) {
                    switch (b2) {
                        case 14:
                        case 15:
                            if (i3 == i2) {
                                return -1;
                            }
                            i2--;
                            break;
                        case 16:
                        case 17:
                            if (i3 == i2) {
                                return 1;
                            }
                            i2--;
                            break;
                        case 18:
                            i2++;
                            break;
                        default:
                            if (i3 != 0) {
                                break;
                            } else {
                                i3 = i2;
                                break;
                            }
                    }
                } else {
                    continue;
                }
            } else if (i2 == 0) {
                return -1;
            } else {
                if (i3 == 0) {
                    i3 = i2;
                }
            }
        }
        return 0;
    }

    private String b(CharSequence charSequence, isCancelable iscancelable) {
        boolean d2 = iscancelable.d(charSequence, 0, charSequence.length());
        return (this.j || (!d2 && d(charSequence) != 1)) ? this.j ? (!d2 || d(charSequence) == -1) ? i : "" : "" : e;
    }

    private String c(CharSequence charSequence, isCancelable iscancelable) {
        boolean d2 = iscancelable.d(charSequence, 0, charSequence.length());
        return (this.j || (!d2 && b(charSequence) != 1)) ? this.j ? (!d2 || b(charSequence) == -1) ? i : "" : "" : e;
    }

    static boolean c(Locale locale) {
        boolean z = true;
        if (onCreate.a(locale) != 1) {
            z = false;
        }
        return z;
    }

    private static int d(CharSequence charSequence) {
        byte b2;
        char charAt;
        char charAt2;
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = new RemoteActionCompatParcelizer(charSequence, false);
        remoteActionCompatParcelizer.e = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (remoteActionCompatParcelizer.e < remoteActionCompatParcelizer.a && i2 == 0) {
            char charAt3 = remoteActionCompatParcelizer.b.charAt(remoteActionCompatParcelizer.e);
            remoteActionCompatParcelizer.c = charAt3;
            if (Character.isHighSurrogate(charAt3)) {
                int codePointAt = Character.codePointAt(remoteActionCompatParcelizer.b, remoteActionCompatParcelizer.e);
                remoteActionCompatParcelizer.e += Character.charCount(codePointAt);
                b2 = Character.getDirectionality(codePointAt);
            } else {
                remoteActionCompatParcelizer.e++;
                byte c2 = RemoteActionCompatParcelizer.c(remoteActionCompatParcelizer.c);
                b2 = 12;
                b2 = c2;
                if (remoteActionCompatParcelizer.d) {
                    char c3 = remoteActionCompatParcelizer.c;
                    if (c3 == '<') {
                        int i5 = remoteActionCompatParcelizer.e;
                        while (true) {
                            int i6 = remoteActionCompatParcelizer.e;
                            if (i6 < remoteActionCompatParcelizer.a) {
                                CharSequence charSequence2 = remoteActionCompatParcelizer.b;
                                remoteActionCompatParcelizer.e = i6 + 1;
                                char charAt4 = charSequence2.charAt(i6);
                                remoteActionCompatParcelizer.c = (char) charAt4;
                                if (charAt4 != '>') {
                                    if (charAt4 == '\"' || charAt4 == '\'') {
                                        do {
                                            int i7 = remoteActionCompatParcelizer.e;
                                            if (i7 < remoteActionCompatParcelizer.a) {
                                                CharSequence charSequence3 = remoteActionCompatParcelizer.b;
                                                remoteActionCompatParcelizer.e = i7 + 1;
                                                charAt2 = charSequence3.charAt(i7);
                                                remoteActionCompatParcelizer.c = (char) charAt2;
                                            }
                                        } while (charAt2 != charAt4);
                                    }
                                }
                            } else {
                                remoteActionCompatParcelizer.e = i5;
                                remoteActionCompatParcelizer.c = (char) 60;
                                b2 = 13;
                            }
                        }
                    } else {
                        b2 = c2;
                        if (c3 == '&') {
                            do {
                                int i8 = remoteActionCompatParcelizer.e;
                                if (i8 < remoteActionCompatParcelizer.a) {
                                    CharSequence charSequence4 = remoteActionCompatParcelizer.b;
                                    remoteActionCompatParcelizer.e = i8 + 1;
                                    charAt = charSequence4.charAt(i8);
                                    remoteActionCompatParcelizer.c = (char) charAt;
                                }
                                b2 = 12;
                            } while (charAt != ';');
                            b2 = 12;
                        }
                    }
                }
            }
            if (b2 != 0) {
                if (b2 == 1 || b2 == 2) {
                    if (i4 == 0) {
                        return 1;
                    }
                } else if (b2 != 9) {
                    switch (b2) {
                        case 14:
                        case 15:
                            i4++;
                            i3 = -1;
                            break;
                        case 16:
                        case 17:
                            i4++;
                            i3 = 1;
                            break;
                        case 18:
                            i4--;
                            i3 = 0;
                            break;
                    }
                }
            } else if (i4 == 0) {
                return -1;
            }
            i2 = i4;
        }
        if (i2 == 0) {
            return 0;
        }
        if (i3 != 0) {
            return i3;
        }
        while (remoteActionCompatParcelizer.e > 0) {
            switch (remoteActionCompatParcelizer.b()) {
                case 14:
                case 15:
                    if (i2 == i4) {
                        return -1;
                    }
                    break;
                case 16:
                case 17:
                    if (i2 == i4) {
                        return 1;
                    }
                    break;
                case 18:
                    i4++;
                    continue;
            }
            i4--;
        }
        return 0;
    }

    public static dismissAllowingStateLoss d() {
        IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer();
        if (iconCompatParcelizer.e != 2 || iconCompatParcelizer.c != c) {
            return new dismissAllowingStateLoss(iconCompatParcelizer.d, iconCompatParcelizer.e, iconCompatParcelizer.c);
        }
        return iconCompatParcelizer.d ? d : b;
    }

    public final String d(String str) {
        isCancelable iscancelable = this.a;
        if (str == null) {
            return null;
        }
        return e(str, iscancelable, true).toString();
    }

    public final CharSequence e(CharSequence charSequence, isCancelable iscancelable, boolean z) {
        if (charSequence == null) {
            return null;
        }
        boolean z2 = false;
        boolean d2 = iscancelable.d(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if ((this.f & 2) != 0) {
            z2 = true;
        }
        if (z2 && z) {
            spannableStringBuilder.append((CharSequence) b(charSequence, d2 ? getTheme.g : getTheme.c));
        }
        if (d2 != this.j) {
            spannableStringBuilder.append(d2 ? (char) 8235 : 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z) {
            spannableStringBuilder.append((CharSequence) c(charSequence, d2 ? getTheme.g : getTheme.c));
        }
        return spannableStringBuilder;
    }
}
