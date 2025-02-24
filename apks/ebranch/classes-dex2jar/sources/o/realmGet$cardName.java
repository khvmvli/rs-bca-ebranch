package o;

import com.facebook.stetho.dumpapp.Framer;
import com.google.android.gms.internal.measurement.zzkn;
import io.realm.internal.Property;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;
/* loaded from: classes-dex2jar.jar:o/realmGet$cardName.class */
public final class realmGet$cardName<T> implements realmSet$annualFeeBasicDisplayAmount<T> {
    private static final int[] a = new int[0];
    private static final Unsafe c = realmGet$jobSector.b();
    private final int[] b;
    private final Object[] d;
    private final int e;
    private final int[] f;
    private final realmGet$cardDescription g;
    private final boolean h;
    private final int i;
    private final boolean j;
    private final setFlagAgreeDisclosure<?> k;
    private final realmSet$incomeDisplayAmount<?, ?> l;
    private final int m;
    private final setReferenceSalesCode n;

    /* renamed from: o */
    private final int f178o;
    private final realmGet$cardImagePath q;
    private final realmGet$annualFeeAddOnDisplayAmount t;

    /* JADX WARN: Multi-variable type inference failed */
    private realmGet$cardName(int[] iArr, int[] iArr2, Object[] objArr, int i, int i2, realmGet$cardDescription realmget_carddescription, boolean z, boolean z2, int[] iArr3, int i3, int i4, realmGet$cardImagePath realmget_cardimagepath, setReferenceSalesCode setreferencesalescode, realmSet$incomeDisplayAmount<?, ?> realmset_incomedisplayamount, setFlagAgreeDisclosure<?> setflagagreedisclosure, realmGet$annualFeeAddOnDisplayAmount realmget_annualfeeaddondisplayamount) {
        this.b = iArr;
        this.d = iArr2;
        this.e = objArr;
        this.i = i;
        this.h = realmget_carddescription;
        this.j = realmset_incomedisplayamount != 0 && realmset_incomedisplayamount.c((realmGet$cardDescription) i2);
        this.f = z2;
        this.f178o = iArr3;
        this.m = i3;
        this.q = i4;
        this.n = realmget_cardimagepath;
        this.l = setreferencesalescode;
        this.k = realmset_incomedisplayamount;
        this.g = i2;
        this.t = setflagagreedisclosure;
    }

    private static int a(int i) {
        return (i >>> 20) & 255;
    }

    private final int a(int i, int i2) {
        if (i < this.e || i > this.i) {
            return -1;
        }
        return c(i, i2);
    }

    private static <T> int a(T t, long j) {
        return ((Integer) realmGet$jobSector.f(t, j)).intValue();
    }

    private final int a(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, setCreditCardSupplements setcreditcardsupplements) throws IOException {
        Unsafe unsafe = c;
        long j2 = (long) (this.b[i8 + 2] & 1048575);
        switch (i7) {
            case 51:
                if (i5 == 1) {
                    unsafe.putObject(t, j, Double.valueOf(Double.longBitsToDouble(setCurrCompanyName.c(bArr, i))));
                    unsafe.putInt(t, j2, i4);
                    return i + 8;
                }
                break;
            case setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.S:
                if (i5 == 5) {
                    unsafe.putObject(t, j, Float.valueOf(Float.intBitsToFloat(setCurrCompanyName.e(bArr, i))));
                    unsafe.putInt(t, j2, i4);
                    return i + 4;
                }
                break;
            case 53:
            case 54:
                if (i5 == 0) {
                    int e = setCurrCompanyName.e(bArr, i, setcreditcardsupplements);
                    unsafe.putObject(t, j, Long.valueOf(setcreditcardsupplements.c));
                    unsafe.putInt(t, j2, i4);
                    return e;
                }
                break;
            case 55:
            case 62:
                if (i5 == 0) {
                    int c2 = setCurrCompanyName.c(bArr, i, setcreditcardsupplements);
                    unsafe.putObject(t, j, Integer.valueOf(setcreditcardsupplements.b));
                    unsafe.putInt(t, j2, i4);
                    return c2;
                }
                break;
            case 56:
            case 65:
                if (i5 == 1) {
                    unsafe.putObject(t, j, Long.valueOf(setCurrCompanyName.c(bArr, i)));
                    unsafe.putInt(t, j2, i4);
                    return i + 8;
                }
                break;
            case 57:
            case 64:
                if (i5 == 5) {
                    unsafe.putObject(t, j, Integer.valueOf(setCurrCompanyName.e(bArr, i)));
                    unsafe.putInt(t, j2, i4);
                    return i + 4;
                }
                break;
            case 58:
                if (i5 == 0) {
                    int e2 = setCurrCompanyName.e(bArr, i, setcreditcardsupplements);
                    unsafe.putObject(t, j, Boolean.valueOf(setcreditcardsupplements.c != 0));
                    unsafe.putInt(t, j2, i4);
                    return e2;
                }
                break;
            case 59:
                if (i5 == 2) {
                    i = setCurrCompanyName.c(bArr, i, setcreditcardsupplements);
                    int i9 = setcreditcardsupplements.b;
                    if (i9 == 0) {
                        unsafe.putObject(t, j, "");
                    } else if ((i6 & 536870912) == 0 || realmSet$supplementCardOptions.e(bArr, i, i + i9)) {
                        unsafe.putObject(t, j, new String(bArr, i, i9, setNationality.c));
                        i += i9;
                    } else {
                        throw zzkn.j();
                    }
                    unsafe.putInt(t, j2, i4);
                    break;
                }
                break;
            case 60:
                if (i5 == 2) {
                    i = setCurrCompanyName.c(b(i8), bArr, i, i2, setcreditcardsupplements);
                    Object object = unsafe.getInt(t, j2) == i4 ? unsafe.getObject(t, j) : null;
                    if (object == null) {
                        unsafe.putObject(t, j, setcreditcardsupplements.e);
                    } else {
                        unsafe.putObject(t, j, setNationality.b(object, setcreditcardsupplements.e));
                    }
                    unsafe.putInt(t, j2, i4);
                    break;
                }
                break;
            case 61:
                if (i5 == 2) {
                    int d = setCurrCompanyName.d(bArr, i, setcreditcardsupplements);
                    unsafe.putObject(t, j, setcreditcardsupplements.e);
                    unsafe.putInt(t, j2, i4);
                    return d;
                }
                break;
            case 63:
                if (i5 == 0) {
                    i = setCurrCompanyName.c(bArr, i, setcreditcardsupplements);
                    int i10 = setcreditcardsupplements.b;
                    setKrisFlyer i11 = i(i8);
                    if (i11 != null && !i11.c(i10)) {
                        e(t).b(i3, Long.valueOf((long) i10));
                        break;
                    } else {
                        unsafe.putObject(t, j, Integer.valueOf(i10));
                        unsafe.putInt(t, j2, i4);
                        break;
                    }
                }
                break;
            case 66:
                if (i5 == 0) {
                    int c3 = setCurrCompanyName.c(bArr, i, setcreditcardsupplements);
                    unsafe.putObject(t, j, Integer.valueOf(setEmergencyContactBCACardNumber.c(setcreditcardsupplements.b)));
                    unsafe.putInt(t, j2, i4);
                    return c3;
                }
                break;
            case 67:
                if (i5 == 0) {
                    int e3 = setCurrCompanyName.e(bArr, i, setcreditcardsupplements);
                    unsafe.putObject(t, j, Long.valueOf(setEmergencyContactBCACardNumber.a(setcreditcardsupplements.c)));
                    unsafe.putInt(t, j2, i4);
                    return e3;
                }
                break;
            case 68:
                if (i5 == 3) {
                    i = setCurrCompanyName.b(b(i8), bArr, i, i2, (i3 & -8) | 4, setcreditcardsupplements);
                    Object object2 = unsafe.getInt(t, j2) == i4 ? unsafe.getObject(t, j) : null;
                    if (object2 == null) {
                        unsafe.putObject(t, j, setcreditcardsupplements.e);
                    } else {
                        unsafe.putObject(t, j, setNationality.b(object2, setcreditcardsupplements.e));
                    }
                    unsafe.putInt(t, j2, i4);
                    break;
                }
                break;
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x094b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0318  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private final int a(T r9, byte[] r10, int r11, int r12, int r13, int r14, int r15, int r16, long r17, int r19, long r20, o.setCreditCardSupplements r22) throws java.io.IOException {
        /*
        // Method dump skipped, instructions count: 2384
        */
        throw new UnsupportedOperationException("Method not decompiled: o.realmGet$cardName.a(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, o.setCreditCardSupplements):int");
    }

    private final <K, V> int a(T t, byte[] bArr, int i, int i2, int i3, long j, setCreditCardSupplements setcreditcardsupplements) throws IOException {
        Unsafe unsafe = c;
        Object j2 = j(i3);
        Object object = unsafe.getObject(t, j);
        if (!((realmGet$annualFeeAddOnAmount) object).b()) {
            realmGet$annualFeeAddOnAmount<K, V> a2 = realmGet$annualFeeAddOnAmount.d().a();
            realmGet$annualFeeAddOnDisplayAmount.d(a2, object);
            unsafe.putObject(t, j, a2);
        }
        CreditCardOptions creditCardOptions = (CreditCardOptions) j2;
        throw null;
    }

    static <T> realmGet$cardName<T> a(realmGet$incomeAmount realmget_incomeamount, realmGet$cardImagePath realmget_cardimagepath, setReferenceSalesCode setreferencesalescode, realmSet$incomeDisplayAmount<?, ?> realmset_incomedisplayamount, setFlagAgreeDisclosure<?> setflagagreedisclosure, realmGet$annualFeeAddOnDisplayAmount realmget_annualfeeaddondisplayamount) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int[] iArr;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        Field field;
        char charAt;
        Field field2;
        Field field3;
        int i16;
        char charAt2;
        int i17;
        char charAt3;
        char charAt4;
        char charAt5;
        char charAt6;
        char charAt7;
        char charAt8;
        int i18;
        char charAt9;
        char charAt10;
        char charAt11;
        char charAt12;
        char charAt13;
        boolean z = realmget_incomeamount.d() == 2;
        String a2 = realmget_incomeamount.a();
        int length = a2.length();
        if (a2.charAt(0) >= 55296) {
            int i19 = 1;
            while (true) {
                int i20 = i19 + 1;
                i = i20;
                if (a2.charAt(i19) < 55296) {
                    break;
                }
                i19 = i20;
            }
        } else {
            i = 1;
        }
        int i21 = i + 1;
        char charAt14 = a2.charAt(i);
        int i22 = i21;
        int i23 = charAt14;
        if (charAt14 >= 55296) {
            int i24 = charAt14 & 8191;
            int i25 = 13;
            while (true) {
                i21++;
                charAt13 = a2.charAt(i21);
                if (charAt13 < 55296) {
                    break;
                }
                i24 |= (charAt13 & 8191) << i25;
                i25 += 13;
            }
            i23 = i24 | (charAt13 << i25);
            i22 = i21;
        }
        if (i23 == 0) {
            iArr = a;
            i6 = 0;
            i8 = 0;
            i7 = 0;
            i5 = 0;
            i4 = 0;
            i9 = 0;
            i3 = 0;
            i2 = i22;
        } else {
            int i26 = i22 + 1;
            char charAt15 = a2.charAt(i22);
            int i27 = charAt15;
            int i28 = i26;
            if (charAt15 >= 55296) {
                int i29 = charAt15 & 8191;
                int i30 = 13;
                while (true) {
                    i26++;
                    charAt12 = a2.charAt(i26);
                    if (charAt12 < 55296) {
                        break;
                    }
                    i29 |= (charAt12 & 8191) << i30;
                    i30 += 13;
                }
                i27 = i29 | (charAt12 << i30);
                i28 = i26;
            }
            int i31 = i28 + 1;
            char charAt16 = a2.charAt(i28);
            int i32 = charAt16;
            int i33 = i31;
            if (charAt16 >= 55296) {
                int i34 = charAt16 & 8191;
                int i35 = 13;
                while (true) {
                    i31++;
                    charAt11 = a2.charAt(i31);
                    if (charAt11 < 55296) {
                        break;
                    }
                    i34 |= (charAt11 & 8191) << i35;
                    i35 += 13;
                }
                i32 = i34 | (charAt11 << i35);
                i33 = i31;
            }
            int i36 = i33 + 1;
            char charAt17 = a2.charAt(i33);
            i7 = charAt17;
            int i37 = i36;
            if (charAt17 >= 55296) {
                int i38 = charAt17 & 8191;
                int i39 = 13;
                while (true) {
                    i36++;
                    charAt10 = a2.charAt(i36);
                    if (charAt10 < 55296) {
                        break;
                    }
                    i38 |= (charAt10 & 8191) << i39;
                    i39 += 13;
                }
                i7 = i38 | (charAt10 << i39);
                i37 = i36;
            }
            int i40 = i37 + 1;
            char charAt18 = a2.charAt(i37);
            i4 = charAt18;
            int i41 = i40;
            if (charAt18 >= 55296) {
                int i42 = charAt18 & 8191;
                int i43 = 13;
                int i44 = i40;
                while (true) {
                    i18 = i44 + 1;
                    charAt9 = a2.charAt(i44);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i42 |= (charAt9 & 8191) << i43;
                    i43 += 13;
                    i44 = i18;
                }
                i4 = i42 | (charAt9 << i43);
                i41 = i18;
            }
            int i45 = i41 + 1;
            char charAt19 = a2.charAt(i41);
            i5 = charAt19;
            int i46 = i45;
            if (charAt19 >= 55296) {
                int i47 = charAt19 & 8191;
                int i48 = 13;
                while (true) {
                    i45++;
                    charAt8 = a2.charAt(i45);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i47 |= (charAt8 & 8191) << i48;
                    i48 += 13;
                }
                i5 = i47 | (charAt8 << i48);
                i46 = i45;
            }
            int i49 = i46 + 1;
            char charAt20 = a2.charAt(i46);
            int i50 = charAt20;
            int i51 = i49;
            if (charAt20 >= 55296) {
                int i52 = charAt20 & 8191;
                int i53 = 13;
                while (true) {
                    i49++;
                    charAt7 = a2.charAt(i49);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i52 |= (charAt7 & 8191) << i53;
                    i53 += 13;
                }
                i50 = i52 | (charAt7 << i53);
                i51 = i49;
            }
            int i54 = i51 + 1;
            char charAt21 = a2.charAt(i51);
            int i55 = charAt21;
            int i56 = i54;
            if (charAt21 >= 55296) {
                int i57 = charAt21 & 8191;
                int i58 = 13;
                while (true) {
                    i54++;
                    charAt6 = a2.charAt(i54);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i57 |= (charAt6 & 8191) << i58;
                    i58 += 13;
                }
                i55 = i57 | (charAt6 << i58);
                i56 = i54;
            }
            int i59 = i56 + 1;
            char charAt22 = a2.charAt(i56);
            int i60 = charAt22;
            i2 = i59;
            if (charAt22 >= 55296) {
                int i61 = charAt22 & 8191;
                int i62 = 13;
                int i63 = i59;
                while (true) {
                    i2 = i63 + 1;
                    charAt5 = a2.charAt(i63);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i61 |= (charAt5 & 8191) << i62;
                    i62 += 13;
                    i63 = i2;
                }
                i60 = i61 | (charAt5 << i62);
            }
            iArr = new int[i60 + i50 + i55];
            i3 = i27 + i27 + i32;
            i9 = i60;
            i8 = i50;
            i6 = i27;
        }
        Unsafe unsafe = c;
        Object[] c2 = realmget_incomeamount.c();
        Class<?> cls = realmget_incomeamount.e().getClass();
        int[] iArr2 = new int[i5 * 3];
        Object[] objArr = new Object[i5 + i5];
        int i64 = i9 + i8;
        int i65 = i9;
        int i66 = i64;
        int i67 = 0;
        int i68 = 0;
        while (i2 < length) {
            int i69 = i2 + 1;
            char charAt23 = a2.charAt(i2);
            if (charAt23 >= 55296) {
                int i70 = charAt23 & 8191;
                int i71 = 13;
                while (true) {
                    i10 = i69 + 1;
                    charAt4 = a2.charAt(i69);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i70 |= (charAt4 & 8191) << i71;
                    i71 += 13;
                    i69 = i10;
                }
                i11 = i70 | (charAt4 << i71);
            } else {
                i10 = i69;
                i11 = charAt23;
            }
            int i72 = i10 + 1;
            int charAt24 = a2.charAt(i10);
            if (charAt24 >= 55296) {
                int i73 = charAt24 & 8191;
                int i74 = 13;
                while (true) {
                    i17 = i72 + 1;
                    charAt3 = a2.charAt(i72);
                    if (charAt3 < 55296) {
                        break;
                    }
                    i73 |= (charAt3 & 8191) << i74;
                    i74 += 13;
                    length = length;
                    i72 = i17;
                }
                charAt24 = i73 | (charAt3 << i74);
                i12 = i17;
            } else {
                i12 = i72;
                length = length;
            }
            int i75 = charAt24 & 255;
            i68 = i68;
            if ((charAt24 & 1024) != 0) {
                iArr[i68] = i67;
                i68++;
            }
            if (i75 >= 51) {
                int i76 = i12 + 1;
                char charAt25 = a2.charAt(i12);
                int i77 = charAt25;
                i2 = i76;
                if (charAt25 >= 55296) {
                    int i78 = charAt25 & 8191;
                    int i79 = 13;
                    while (true) {
                        i16 = i76 + 1;
                        charAt2 = a2.charAt(i76);
                        if (charAt2 < 55296) {
                            break;
                        }
                        i78 |= (charAt2 & 8191) << i79;
                        i79 += 13;
                        i76 = i16;
                    }
                    i77 = i78 | (charAt2 << i79);
                    i2 = i16;
                }
                int i80 = i75 - 51;
                if (i80 == 9 || i80 == 17) {
                    int i81 = i67 / 3;
                    i3++;
                    objArr[i81 + i81 + 1] = c2[i3];
                } else {
                    i3 = i3;
                    if (i80 == 12) {
                        i3 = i3;
                        if (!z) {
                            int i82 = i67 / 3;
                            i3++;
                            objArr[i82 + i82 + 1] = c2[i3];
                        }
                    }
                }
                int i83 = i77 + i77;
                Object obj = c2[i83];
                if (obj instanceof Field) {
                    field2 = (Field) obj;
                } else {
                    field2 = d(cls, (String) obj);
                    c2[i83] = field2;
                }
                i13 = (int) unsafe.objectFieldOffset(field2);
                int i84 = i83 + 1;
                Object obj2 = c2[i84];
                if (obj2 instanceof Field) {
                    field3 = (Field) obj2;
                } else {
                    field3 = d(cls, (String) obj2);
                    c2[i84] = field3;
                }
                i15 = (int) unsafe.objectFieldOffset(field3);
                i14 = 0;
            } else {
                int i85 = i3 + 1;
                Field d = d(cls, (String) c2[i3]);
                if (i75 == 9 || i75 == 17) {
                    int i86 = i67 / 3;
                    objArr[i86 + i86 + 1] = d.getType();
                    i3 = i85;
                } else if (i75 == 27 || i75 == 49) {
                    int i87 = i67 / 3;
                    i3 = i85 + 1;
                    objArr[i87 + i87 + 1] = c2[i85];
                } else if (i75 == 12 || i75 == 30 || i75 == 44) {
                    i3 = i85;
                    i65 = i65;
                    if (!z) {
                        int i88 = i67 / 3;
                        i3 = i85 + 1;
                        objArr[i88 + i88 + 1] = c2[i85];
                    }
                } else {
                    i3 = i85;
                    i65 = i65;
                    if (i75 == 50) {
                        int i89 = i65 + 1;
                        iArr[i65] = i67;
                        int i90 = i67 / 3;
                        int i91 = i90 + i90;
                        int i92 = i85 + 1;
                        objArr[i91] = c2[i85];
                        if ((charAt24 & 2048) != 0) {
                            i3 = i92 + 1;
                            objArr[i91 + 1] = c2[i92];
                            i65 = i89;
                        } else {
                            i65 = i89;
                            i3 = i92;
                        }
                    }
                }
                i13 = (int) unsafe.objectFieldOffset(d);
                if ((charAt24 & 4096) != 4096 || i75 > 17) {
                    i14 = 0;
                    i15 = 1048575;
                    i2 = i12;
                } else {
                    int i93 = i12 + 1;
                    int charAt26 = a2.charAt(i12);
                    if (charAt26 >= 55296) {
                        int i94 = charAt26 & 8191;
                        int i95 = 13;
                        while (true) {
                            i2 = i93 + 1;
                            charAt = a2.charAt(i93);
                            if (charAt < 55296) {
                                break;
                            }
                            i94 |= (charAt & 8191) << i95;
                            i95 += 13;
                            i93 = i2;
                        }
                        charAt26 = i94 | (charAt << i95);
                    } else {
                        i2 = i93;
                    }
                    int i96 = i6 + i6 + (charAt26 / 32);
                    Object obj3 = c2[i96];
                    if (obj3 instanceof Field) {
                        field = (Field) obj3;
                    } else {
                        field = d(cls, (String) obj3);
                        c2[i96] = field;
                    }
                    i15 = (int) unsafe.objectFieldOffset(field);
                    i14 = charAt26 % 32;
                }
                i66 = i66;
                if (i75 >= 18) {
                    i66 = i66;
                    if (i75 <= 49) {
                        iArr[i66] = i13;
                        i66++;
                    }
                }
            }
            int i97 = i67 + 1;
            iArr2[i67] = i11;
            int i98 = i97 + 1;
            iArr2[i97] = ((charAt24 & Property.TYPE_SET) != 0 ? 268435456 : 0) | ((charAt24 & Property.TYPE_DICTIONARY) != 0 ? 536870912 : 0) | (i75 << 20) | i13;
            iArr2[i98] = (i14 << 20) | i15;
            i67 = i98 + 1;
        }
        return new realmGet$cardName<>(iArr2, objArr, i7, i4, realmget_incomeamount.e(), z, false, iArr, i9, i64, realmget_cardimagepath, setreferencesalescode, realmset_incomedisplayamount, setflagagreedisclosure, realmget_annualfeeaddondisplayamount, null);
    }

    private static final void a(int i, Object obj, setEmergencyContactOfficeExt setemergencycontactofficeext) throws IOException {
        if (obj instanceof String) {
            setemergencycontactofficeext.b(i, (String) obj);
        } else {
            setemergencycontactofficeext.a(i, (setCurrOfficePostCode) obj);
        }
    }

    private static <T> float b(T t, long j) {
        return ((Float) realmGet$jobSector.f(t, j)).floatValue();
    }

    private final realmSet$annualFeeBasicDisplayAmount b(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        realmSet$annualFeeBasicDisplayAmount realmset_annualfeebasicdisplayamount = (realmSet$annualFeeBasicDisplayAmount) this.d[i3];
        if (realmset_annualfeebasicdisplayamount != null) {
            return realmset_annualfeebasicdisplayamount;
        }
        realmSet$annualFeeBasicDisplayAmount<T> b = realmGet$cardType.d().b((Class) this.d[i3 + 1]);
        this.d[i3] = b;
        return b;
    }

    private final void b(T t, int i) {
        int d = d(i);
        long j = (long) (1048575 & d);
        if (j != 1048575) {
            realmGet$jobSector.e(t, j, (1 << (d >>> 20)) | realmGet$jobSector.c(t, j));
        }
    }

    private final void b(T t, int i, int i2) {
        realmGet$jobSector.e(t, (long) (d(i2) & 1048575), i);
    }

    private final void b(T t, T t2, int i) {
        long e = (long) (e(i) & 1048575);
        if (e((realmGet$cardName<T>) t2, i)) {
            Object f = realmGet$jobSector.f(t, e);
            Object f2 = realmGet$jobSector.f(t2, e);
            if (f != null && f2 != null) {
                realmGet$jobSector.e(t, e, setNationality.b(f, f2));
                b((realmGet$cardName<T>) t, i);
            } else if (f2 != null) {
                realmGet$jobSector.e(t, e, f2);
                b((realmGet$cardName<T>) t, i);
            }
        }
    }

    private final <K, V> void b(setEmergencyContactOfficeExt setemergencycontactofficeext, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            CreditCardOptions creditCardOptions = (CreditCardOptions) j(i2);
            throw null;
        }
    }

    private final int c(int i) {
        if (i < this.e || i > this.i) {
            return -1;
        }
        return c(i, 0);
    }

    private final int c(int i, int i2) {
        int length = (this.b.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.b[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    private static <T> boolean c(T t, long j) {
        return ((Boolean) realmGet$jobSector.f(t, j)).booleanValue();
    }

    private final int d(int i) {
        return this.b[i + 2];
    }

    private static <T> long d(T t, long j) {
        return ((Long) realmGet$jobSector.f(t, j)).longValue();
    }

    private static Field d(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(name).length() + String.valueOf(arrays).length());
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            sb.append(" not found. Known fields are ");
            sb.append(arrays);
            throw new RuntimeException(sb.toString());
        }
    }

    private final void d(T t, T t2, int i) {
        int e = e(i);
        int i2 = this.b[i];
        long j = (long) (e & 1048575);
        if (d((realmGet$cardName<T>) t2, i2, i)) {
            Object f = d((realmGet$cardName<T>) t, i2, i) ? realmGet$jobSector.f(t, j) : null;
            Object f2 = realmGet$jobSector.f(t2, j);
            if (f != null && f2 != null) {
                realmGet$jobSector.e(t, j, setNationality.b(f, f2));
                b((realmGet$cardName<T>) t, i2, i);
            } else if (f2 != null) {
                realmGet$jobSector.e(t, j, f2);
                b((realmGet$cardName<T>) t, i2, i);
            }
        }
    }

    private final void d(T t, setEmergencyContactOfficeExt setemergencycontactofficeext) throws IOException {
        int i;
        int i2;
        if (!this.j) {
            int length = this.b.length;
            Unsafe unsafe = c;
            int i3 = 0;
            int i4 = 0;
            int i5 = 1048575;
            while (i3 < length) {
                int e = e(i3);
                int i6 = this.b[i3];
                int a2 = a(e);
                if (a2 <= 17) {
                    int i7 = this.b[i3 + 2];
                    int i8 = i7 & 1048575;
                    i = i4;
                    i5 = i5;
                    if (i8 != i5) {
                        i = unsafe.getInt(t, (long) i8);
                        i5 = i8;
                    }
                    i2 = 1 << (i7 >>> 20);
                } else {
                    i2 = 0;
                    i = i4;
                }
                long j = (long) (e & 1048575);
                switch (a2) {
                    case 0:
                        if ((i & i2) == 0) {
                            break;
                        } else {
                            setemergencycontactofficeext.a(i6, realmGet$jobSector.d(t, j));
                            break;
                        }
                    case 1:
                        if ((i & i2) == 0) {
                            break;
                        } else {
                            setemergencycontactofficeext.a(i6, realmGet$jobSector.a(t, j));
                            break;
                        }
                    case 2:
                        if ((i & i2) == 0) {
                            break;
                        } else {
                            setemergencycontactofficeext.a(i6, unsafe.getLong(t, j));
                            break;
                        }
                    case 3:
                        if ((i & i2) == 0) {
                            break;
                        } else {
                            setemergencycontactofficeext.d(i6, unsafe.getLong(t, j));
                            break;
                        }
                    case 4:
                        if ((i & i2) == 0) {
                            break;
                        } else {
                            setemergencycontactofficeext.d(i6, unsafe.getInt(t, j));
                            break;
                        }
                    case 5:
                        if ((i & i2) == 0) {
                            break;
                        } else {
                            setemergencycontactofficeext.c(i6, unsafe.getLong(t, j));
                            break;
                        }
                    case 6:
                        if ((i & i2) == 0) {
                            break;
                        } else {
                            setemergencycontactofficeext.a(i6, unsafe.getInt(t, j));
                            break;
                        }
                    case 7:
                        if ((i & i2) == 0) {
                            break;
                        } else {
                            setemergencycontactofficeext.b(i6, realmGet$jobSector.b(t, j));
                            break;
                        }
                    case 8:
                        if ((i & i2) == 0) {
                            break;
                        } else {
                            a(i6, unsafe.getObject(t, j), setemergencycontactofficeext);
                            break;
                        }
                    case 9:
                        if ((i & i2) == 0) {
                            break;
                        } else {
                            setemergencycontactofficeext.c(i6, unsafe.getObject(t, j), b(i3));
                            break;
                        }
                    case 10:
                        if ((i & i2) == 0) {
                            break;
                        } else {
                            setemergencycontactofficeext.a(i6, (setCurrOfficePostCode) unsafe.getObject(t, j));
                            break;
                        }
                    case 11:
                        if ((i & i2) == 0) {
                            break;
                        } else {
                            setemergencycontactofficeext.e(i6, unsafe.getInt(t, j));
                            break;
                        }
                    case 12:
                        if ((i & i2) == 0) {
                            break;
                        } else {
                            setemergencycontactofficeext.c(i6, unsafe.getInt(t, j));
                            break;
                        }
                    case 13:
                        if ((i & i2) == 0) {
                            break;
                        } else {
                            setemergencycontactofficeext.b(i6, unsafe.getInt(t, j));
                            break;
                        }
                    case 14:
                        if ((i & i2) == 0) {
                            break;
                        } else {
                            setemergencycontactofficeext.e(i6, unsafe.getLong(t, j));
                            break;
                        }
                    case 15:
                        if ((i & i2) == 0) {
                            break;
                        } else {
                            setemergencycontactofficeext.g(i6, unsafe.getInt(t, j));
                            break;
                        }
                    case 16:
                        if ((i & i2) == 0) {
                            break;
                        } else {
                            setemergencycontactofficeext.b(i6, unsafe.getLong(t, j));
                            break;
                        }
                    case 17:
                        if ((i & i2) == 0) {
                            break;
                        } else {
                            setemergencycontactofficeext.b(i6, unsafe.getObject(t, j), b(i3));
                            break;
                        }
                    case 18:
                        realmSet$annualFeeBasicAmount.b(this.b[i3], (List<Double>) ((List) unsafe.getObject(t, j)), setemergencycontactofficeext, false);
                        break;
                    case 19:
                        realmSet$annualFeeBasicAmount.c(this.b[i3], (List<Float>) ((List) unsafe.getObject(t, j)), setemergencycontactofficeext, false);
                        break;
                    case 20:
                        realmSet$annualFeeBasicAmount.a(this.b[i3], (List<Long>) ((List) unsafe.getObject(t, j)), setemergencycontactofficeext, false);
                        break;
                    case 21:
                        realmSet$annualFeeBasicAmount.d(this.b[i3], (List) unsafe.getObject(t, j), setemergencycontactofficeext, false);
                        break;
                    case 22:
                        realmSet$annualFeeBasicAmount.j(this.b[i3], (List) unsafe.getObject(t, j), setemergencycontactofficeext, false);
                        break;
                    case 23:
                        realmSet$annualFeeBasicAmount.h(this.b[i3], (List) unsafe.getObject(t, j), setemergencycontactofficeext, false);
                        break;
                    case 24:
                        realmSet$annualFeeBasicAmount.m(this.b[i3], (List) unsafe.getObject(t, j), setemergencycontactofficeext, false);
                        break;
                    case 25:
                        realmSet$annualFeeBasicAmount.o(this.b[i3], (List) unsafe.getObject(t, j), setemergencycontactofficeext, false);
                        break;
                    case 26:
                        realmSet$annualFeeBasicAmount.e(this.b[i3], (List) unsafe.getObject(t, j), setemergencycontactofficeext);
                        break;
                    case 27:
                        realmSet$annualFeeBasicAmount.b(this.b[i3], (List) unsafe.getObject(t, j), setemergencycontactofficeext, b(i3));
                        break;
                    case 28:
                        realmSet$annualFeeBasicAmount.d(this.b[i3], (List) unsafe.getObject(t, j), setemergencycontactofficeext);
                        break;
                    case 29:
                        realmSet$annualFeeBasicAmount.i(this.b[i3], (List) unsafe.getObject(t, j), setemergencycontactofficeext, false);
                        break;
                    case 30:
                        realmSet$annualFeeBasicAmount.n(this.b[i3], (List) unsafe.getObject(t, j), setemergencycontactofficeext, false);
                        break;
                    case setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.bv:
                        realmSet$annualFeeBasicAmount.k(this.b[i3], (List) unsafe.getObject(t, j), setemergencycontactofficeext, false);
                        break;
                    case 32:
                        realmSet$annualFeeBasicAmount.f(this.b[i3], (List) unsafe.getObject(t, j), setemergencycontactofficeext, false);
                        break;
                    case Framer.ENTER_FRAME_PREFIX:
                        realmSet$annualFeeBasicAmount.g(this.b[i3], (List) unsafe.getObject(t, j), setemergencycontactofficeext, false);
                        break;
                    case 34:
                        realmSet$annualFeeBasicAmount.e(this.b[i3], (List) unsafe.getObject(t, j), setemergencycontactofficeext, false);
                        break;
                    case setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.dD:
                        realmSet$annualFeeBasicAmount.b(this.b[i3], (List<Double>) ((List) unsafe.getObject(t, j)), setemergencycontactofficeext, true);
                        break;
                    case setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.dB:
                        realmSet$annualFeeBasicAmount.c(this.b[i3], (List<Float>) ((List) unsafe.getObject(t, j)), setemergencycontactofficeext, true);
                        break;
                    case setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.dF:
                        realmSet$annualFeeBasicAmount.a(this.b[i3], (List<Long>) ((List) unsafe.getObject(t, j)), setemergencycontactofficeext, true);
                        break;
                    case setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.dC:
                        realmSet$annualFeeBasicAmount.d(this.b[i3], (List) unsafe.getObject(t, j), setemergencycontactofficeext, true);
                        break;
                    case 39:
                        realmSet$annualFeeBasicAmount.j(this.b[i3], (List) unsafe.getObject(t, j), setemergencycontactofficeext, true);
                        break;
                    case 40:
                        realmSet$annualFeeBasicAmount.h(this.b[i3], (List) unsafe.getObject(t, j), setemergencycontactofficeext, true);
                        break;
                    case 41:
                        realmSet$annualFeeBasicAmount.m(this.b[i3], (List) unsafe.getObject(t, j), setemergencycontactofficeext, true);
                        break;
                    case 42:
                        realmSet$annualFeeBasicAmount.o(this.b[i3], (List) unsafe.getObject(t, j), setemergencycontactofficeext, true);
                        break;
                    case 43:
                        realmSet$annualFeeBasicAmount.i(this.b[i3], (List) unsafe.getObject(t, j), setemergencycontactofficeext, true);
                        break;
                    case 44:
                        realmSet$annualFeeBasicAmount.n(this.b[i3], (List) unsafe.getObject(t, j), setemergencycontactofficeext, true);
                        break;
                    case 45:
                        realmSet$annualFeeBasicAmount.k(this.b[i3], (List) unsafe.getObject(t, j), setemergencycontactofficeext, true);
                        break;
                    case 46:
                        realmSet$annualFeeBasicAmount.f(this.b[i3], (List) unsafe.getObject(t, j), setemergencycontactofficeext, true);
                        break;
                    case 47:
                        realmSet$annualFeeBasicAmount.g(this.b[i3], (List) unsafe.getObject(t, j), setemergencycontactofficeext, true);
                        break;
                    case 48:
                        realmSet$annualFeeBasicAmount.e(this.b[i3], (List) unsafe.getObject(t, j), setemergencycontactofficeext, true);
                        break;
                    case 49:
                        realmSet$annualFeeBasicAmount.c(this.b[i3], (List) unsafe.getObject(t, j), setemergencycontactofficeext, b(i3));
                        break;
                    case 50:
                        b(setemergencycontactofficeext, i6, unsafe.getObject(t, j), i3);
                        break;
                    case 51:
                        if (!d((realmGet$cardName<T>) t, i6, i3)) {
                            break;
                        } else {
                            setemergencycontactofficeext.a(i6, e(t, j));
                            break;
                        }
                    case setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.S:
                        if (!d((realmGet$cardName<T>) t, i6, i3)) {
                            break;
                        } else {
                            setemergencycontactofficeext.a(i6, b(t, j));
                            break;
                        }
                    case 53:
                        if (!d((realmGet$cardName<T>) t, i6, i3)) {
                            break;
                        } else {
                            setemergencycontactofficeext.a(i6, d(t, j));
                            break;
                        }
                    case 54:
                        if (!d((realmGet$cardName<T>) t, i6, i3)) {
                            break;
                        } else {
                            setemergencycontactofficeext.d(i6, d(t, j));
                            break;
                        }
                    case 55:
                        if (!d((realmGet$cardName<T>) t, i6, i3)) {
                            break;
                        } else {
                            setemergencycontactofficeext.d(i6, a(t, j));
                            break;
                        }
                    case 56:
                        if (!d((realmGet$cardName<T>) t, i6, i3)) {
                            break;
                        } else {
                            setemergencycontactofficeext.c(i6, d(t, j));
                            break;
                        }
                    case 57:
                        if (!d((realmGet$cardName<T>) t, i6, i3)) {
                            break;
                        } else {
                            setemergencycontactofficeext.a(i6, a(t, j));
                            break;
                        }
                    case 58:
                        if (!d((realmGet$cardName<T>) t, i6, i3)) {
                            break;
                        } else {
                            setemergencycontactofficeext.b(i6, c(t, j));
                            break;
                        }
                    case 59:
                        if (!d((realmGet$cardName<T>) t, i6, i3)) {
                            break;
                        } else {
                            a(i6, unsafe.getObject(t, j), setemergencycontactofficeext);
                            break;
                        }
                    case 60:
                        if (!d((realmGet$cardName<T>) t, i6, i3)) {
                            break;
                        } else {
                            setemergencycontactofficeext.c(i6, unsafe.getObject(t, j), b(i3));
                            break;
                        }
                    case 61:
                        if (!d((realmGet$cardName<T>) t, i6, i3)) {
                            break;
                        } else {
                            setemergencycontactofficeext.a(i6, (setCurrOfficePostCode) unsafe.getObject(t, j));
                            break;
                        }
                    case 62:
                        if (!d((realmGet$cardName<T>) t, i6, i3)) {
                            break;
                        } else {
                            setemergencycontactofficeext.e(i6, a(t, j));
                            break;
                        }
                    case 63:
                        if (!d((realmGet$cardName<T>) t, i6, i3)) {
                            break;
                        } else {
                            setemergencycontactofficeext.c(i6, a(t, j));
                            break;
                        }
                    case 64:
                        if (!d((realmGet$cardName<T>) t, i6, i3)) {
                            break;
                        } else {
                            setemergencycontactofficeext.b(i6, a(t, j));
                            break;
                        }
                    case 65:
                        if (!d((realmGet$cardName<T>) t, i6, i3)) {
                            break;
                        } else {
                            setemergencycontactofficeext.e(i6, d(t, j));
                            break;
                        }
                    case 66:
                        if (!d((realmGet$cardName<T>) t, i6, i3)) {
                            break;
                        } else {
                            setemergencycontactofficeext.g(i6, a(t, j));
                            break;
                        }
                    case 67:
                        if (!d((realmGet$cardName<T>) t, i6, i3)) {
                            break;
                        } else {
                            setemergencycontactofficeext.b(i6, d(t, j));
                            break;
                        }
                    case 68:
                        if (!d((realmGet$cardName<T>) t, i6, i3)) {
                            break;
                        } else {
                            setemergencycontactofficeext.b(i6, unsafe.getObject(t, j), b(i3));
                            break;
                        }
                }
                i3 += 3;
                i4 = i;
            }
            realmSet$incomeDisplayAmount<?, ?> realmset_incomedisplayamount = this.l;
            realmset_incomedisplayamount.c((realmSet$incomeDisplayAmount<?, ?>) realmset_incomedisplayamount.a(t), setemergencycontactofficeext);
            return;
        }
        this.k.a(t);
        throw null;
    }

    private final boolean d(T t, int i, int i2) {
        return realmGet$jobSector.c(t, (long) (d(i2) & 1048575)) == i;
    }

    private final boolean d(T t, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? e((realmGet$cardName<T>) t, i) : (i3 & i4) != 0;
    }

    private static <T> double e(T t, long j) {
        return ((Double) realmGet$jobSector.f(t, j)).doubleValue();
    }

    private final int e(int i) {
        return this.b[i + 1];
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x0483, code lost:
        if (r23 != r23) goto L_0x04d0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x04b0, code lost:
        if (r23 != r23) goto L_0x04d0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private final int e(T r17, byte[] r18, int r19, int r20, o.setCreditCardSupplements r21) throws java.io.IOException {
        /*
        // Method dump skipped, instructions count: 1270
        */
        throw new UnsupportedOperationException("Method not decompiled: o.realmGet$cardName.e(java.lang.Object, byte[], int, int, o.setCreditCardSupplements):int");
    }

    static getSupplementCardLimit e(Object obj) {
        setHmKecamatan sethmkecamatan = (setHmKecamatan) obj;
        getSupplementCardLimit getsupplementcardlimit = sethmkecamatan.zzc;
        getSupplementCardLimit getsupplementcardlimit2 = getsupplementcardlimit;
        if (getsupplementcardlimit == getSupplementCardLimit.a()) {
            getsupplementcardlimit2 = getSupplementCardLimit.d();
            sethmkecamatan.zzc = getsupplementcardlimit2;
        }
        return getsupplementcardlimit2;
    }

    public static <T> realmGet$cardName<T> e(Class<T> cls, realmGet$cardCode realmget_cardcode, realmGet$cardImagePath realmget_cardimagepath, setReferenceSalesCode setreferencesalescode, realmSet$incomeDisplayAmount<?, ?> realmset_incomedisplayamount, setFlagAgreeDisclosure<?> setflagagreedisclosure, realmGet$annualFeeAddOnDisplayAmount realmget_annualfeeaddondisplayamount) {
        if (realmget_cardcode instanceof realmGet$incomeAmount) {
            return a((realmGet$incomeAmount) realmget_cardcode, realmget_cardimagepath, setreferencesalescode, realmset_incomedisplayamount, setflagagreedisclosure, realmget_annualfeeaddondisplayamount);
        }
        realmSet$cardSlogan realmset_cardslogan = (realmSet$cardSlogan) realmget_cardcode;
        throw null;
    }

    private final boolean e(T t, int i) {
        int d = d(i);
        long j = (long) (d & 1048575);
        if (j != 1048575) {
            return (realmGet$jobSector.c(t, j) & (1 << (d >>> 20))) != 0;
        }
        int e = e(i);
        long j2 = (long) (e & 1048575);
        switch (a(e)) {
            case 0:
                return realmGet$jobSector.d(t, j2) != 0.0d;
            case 1:
                return realmGet$jobSector.a(t, j2) != 0.0f;
            case 2:
                return realmGet$jobSector.e(t, j2) != 0;
            case 3:
                return realmGet$jobSector.e(t, j2) != 0;
            case 4:
                return realmGet$jobSector.c(t, j2) != 0;
            case 5:
                return realmGet$jobSector.e(t, j2) != 0;
            case 6:
                return realmGet$jobSector.c(t, j2) != 0;
            case 7:
                return realmGet$jobSector.b(t, j2);
            case 8:
                Object f = realmGet$jobSector.f(t, j2);
                if (f instanceof String) {
                    return !((String) f).isEmpty();
                }
                if (f instanceof setCurrOfficePostCode) {
                    return !setCurrOfficePostCode.a.equals(f);
                }
                throw new IllegalArgumentException();
            case 9:
                return realmGet$jobSector.f(t, j2) != null;
            case 10:
                return !setCurrOfficePostCode.a.equals(realmGet$jobSector.f(t, j2));
            case 11:
                return realmGet$jobSector.c(t, j2) != 0;
            case 12:
                return realmGet$jobSector.c(t, j2) != 0;
            case 13:
                return realmGet$jobSector.c(t, j2) != 0;
            case 14:
                return realmGet$jobSector.e(t, j2) != 0;
            case 15:
                return realmGet$jobSector.c(t, j2) != 0;
            case 16:
                return realmGet$jobSector.e(t, j2) != 0;
            case 17:
                return realmGet$jobSector.f(t, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean e(Object obj, int i, realmSet$annualFeeBasicDisplayAmount realmset_annualfeebasicdisplayamount) {
        return realmset_annualfeebasicdisplayamount.d(realmGet$jobSector.f(obj, (long) (i & 1048575)));
    }

    private final boolean e(T t, T t2, int i) {
        return e((realmGet$cardName<T>) t, i) == e((realmGet$cardName<T>) t2, i);
    }

    private final int f(T t) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        Unsafe unsafe = c;
        int i15 = 0;
        for (int i16 = 0; i16 < this.b.length; i16 += 3) {
            int e = e(i16);
            int a2 = a(e);
            int i17 = this.b[i16];
            long j = (long) (e & 1048575);
            if (a2 >= setFlagPromotionCode.DOUBLE_LIST_PACKED.a() && a2 <= setFlagPromotionCode.SINT64_LIST_PACKED.a()) {
                int i18 = this.b[i16 + 2];
            }
            switch (a2) {
                case 0:
                    i15 = i15;
                    if (e((realmGet$cardName<T>) t, i16)) {
                        i2 = setCustomerName.h(i17 << 3);
                        i = i2 + 8;
                        i15 += i;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    i15 = i15;
                    if (e((realmGet$cardName<T>) t, i16)) {
                        i3 = setCustomerName.h(i17 << 3);
                        i = i3 + 4;
                        i15 += i;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    i15 = i15;
                    if (e((realmGet$cardName<T>) t, i16)) {
                        long e2 = realmGet$jobSector.e(t, j);
                        i5 = setCustomerName.h(i17 << 3);
                        i4 = setCustomerName.b(e2);
                        i15 += i5 + i4;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    i15 = i15;
                    if (e((realmGet$cardName<T>) t, i16)) {
                        long e3 = realmGet$jobSector.e(t, j);
                        i5 = setCustomerName.h(i17 << 3);
                        i4 = setCustomerName.b(e3);
                        i15 += i5 + i4;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    i15 = i15;
                    if (e((realmGet$cardName<T>) t, i16)) {
                        int c2 = realmGet$jobSector.c(t, j);
                        i8 = setCustomerName.h(i17 << 3);
                        i7 = setCustomerName.d(c2);
                        i6 = i8 + i7;
                        i15 += i6;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    i15 = i15;
                    if (e((realmGet$cardName<T>) t, i16)) {
                        i2 = setCustomerName.h(i17 << 3);
                        i = i2 + 8;
                        i15 += i;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    i15 = i15;
                    if (e((realmGet$cardName<T>) t, i16)) {
                        i3 = setCustomerName.h(i17 << 3);
                        i = i3 + 4;
                        i15 += i;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    i15 = i15;
                    if (e((realmGet$cardName<T>) t, i16)) {
                        i9 = setCustomerName.h(i17 << 3);
                        i = i9 + 1;
                        i15 += i;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    i15 = i15;
                    if (!e((realmGet$cardName<T>) t, i16)) {
                        break;
                    } else {
                        Object f = realmGet$jobSector.f(t, j);
                        if (f instanceof setCurrOfficePostCode) {
                            i12 = setCustomerName.h(i17 << 3);
                            i11 = ((setCurrOfficePostCode) f).b();
                            i10 = setCustomerName.h(i11);
                            i6 = i12 + i10 + i11;
                            i15 += i6;
                            break;
                        } else {
                            i8 = setCustomerName.h(i17 << 3);
                            i7 = setCustomerName.e((String) f);
                            i6 = i8 + i7;
                            i15 += i6;
                        }
                    }
                case 9:
                    i15 = i15;
                    if (e((realmGet$cardName<T>) t, i16)) {
                        i = realmSet$annualFeeBasicAmount.b(i17, realmGet$jobSector.f(t, j), b(i16));
                        i15 += i;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    i15 = i15;
                    if (e((realmGet$cardName<T>) t, i16)) {
                        setCurrOfficePostCode setcurrofficepostcode = (setCurrOfficePostCode) realmGet$jobSector.f(t, j);
                        i12 = setCustomerName.h(i17 << 3);
                        i11 = setcurrofficepostcode.b();
                        i10 = setCustomerName.h(i11);
                        i6 = i12 + i10 + i11;
                        i15 += i6;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    i15 = i15;
                    if (e((realmGet$cardName<T>) t, i16)) {
                        int c3 = realmGet$jobSector.c(t, j);
                        i8 = setCustomerName.h(i17 << 3);
                        i7 = setCustomerName.h(c3);
                        i6 = i8 + i7;
                        i15 += i6;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    i15 = i15;
                    if (e((realmGet$cardName<T>) t, i16)) {
                        int c4 = realmGet$jobSector.c(t, j);
                        i8 = setCustomerName.h(i17 << 3);
                        i7 = setCustomerName.d(c4);
                        i6 = i8 + i7;
                        i15 += i6;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    i15 = i15;
                    if (e((realmGet$cardName<T>) t, i16)) {
                        i3 = setCustomerName.h(i17 << 3);
                        i = i3 + 4;
                        i15 += i;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    i15 = i15;
                    if (e((realmGet$cardName<T>) t, i16)) {
                        i2 = setCustomerName.h(i17 << 3);
                        i = i2 + 8;
                        i15 += i;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    i15 = i15;
                    if (e((realmGet$cardName<T>) t, i16)) {
                        int c5 = realmGet$jobSector.c(t, j);
                        i8 = setCustomerName.h(i17 << 3);
                        i7 = setCustomerName.h((c5 + c5) ^ (c5 >> 31));
                        i6 = i8 + i7;
                        i15 += i6;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    i15 = i15;
                    if (e((realmGet$cardName<T>) t, i16)) {
                        long e4 = realmGet$jobSector.e(t, j);
                        i8 = setCustomerName.h(i17 << 3);
                        i7 = setCustomerName.b((e4 >> 63) ^ (e4 + e4));
                        i6 = i8 + i7;
                        i15 += i6;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    i15 = i15;
                    if (e((realmGet$cardName<T>) t, i16)) {
                        i = setCustomerName.c(i17, (realmGet$cardDescription) realmGet$jobSector.f(t, j), b(i16));
                        i15 += i;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    i = realmSet$annualFeeBasicAmount.j(i17, (List) realmGet$jobSector.f(t, j), false);
                    i15 += i;
                    break;
                case 19:
                    i = realmSet$annualFeeBasicAmount.g(i17, (List) realmGet$jobSector.f(t, j), false);
                    i15 += i;
                    break;
                case 20:
                    i = realmSet$annualFeeBasicAmount.d(i17, (List<Long>) ((List) realmGet$jobSector.f(t, j)), false);
                    i15 += i;
                    break;
                case 21:
                    i = realmSet$annualFeeBasicAmount.e(i17, (List<Long>) ((List) realmGet$jobSector.f(t, j)), false);
                    i15 += i;
                    break;
                case 22:
                    i = realmSet$annualFeeBasicAmount.c(i17, (List) realmGet$jobSector.f(t, j), false);
                    i15 += i;
                    break;
                case 23:
                    i = realmSet$annualFeeBasicAmount.j(i17, (List) realmGet$jobSector.f(t, j), false);
                    i15 += i;
                    break;
                case 24:
                    i = realmSet$annualFeeBasicAmount.g(i17, (List) realmGet$jobSector.f(t, j), false);
                    i15 += i;
                    break;
                case 25:
                    i = realmSet$annualFeeBasicAmount.i(i17, (List) realmGet$jobSector.f(t, j), false);
                    i15 += i;
                    break;
                case 26:
                    i = realmSet$annualFeeBasicAmount.c(i17, (List) realmGet$jobSector.f(t, j));
                    i15 += i;
                    break;
                case 27:
                    i = realmSet$annualFeeBasicAmount.a(i17, (List) realmGet$jobSector.f(t, j), b(i16));
                    i15 += i;
                    break;
                case 28:
                    i = realmSet$annualFeeBasicAmount.b(i17, (List) realmGet$jobSector.f(t, j));
                    i15 += i;
                    break;
                case 29:
                    i = realmSet$annualFeeBasicAmount.f(i17, (List) realmGet$jobSector.f(t, j), false);
                    i15 += i;
                    break;
                case 30:
                    i = realmSet$annualFeeBasicAmount.a(i17, (List<Integer>) ((List) realmGet$jobSector.f(t, j)), false);
                    i15 += i;
                    break;
                case setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.bv:
                    i = realmSet$annualFeeBasicAmount.g(i17, (List) realmGet$jobSector.f(t, j), false);
                    i15 += i;
                    break;
                case 32:
                    i = realmSet$annualFeeBasicAmount.j(i17, (List) realmGet$jobSector.f(t, j), false);
                    i15 += i;
                    break;
                case Framer.ENTER_FRAME_PREFIX:
                    i = realmSet$annualFeeBasicAmount.h(i17, (List) realmGet$jobSector.f(t, j), false);
                    i15 += i;
                    break;
                case 34:
                    i = realmSet$annualFeeBasicAmount.b(i17, (List<Long>) ((List) realmGet$jobSector.f(t, j)), false);
                    i15 += i;
                    break;
                case setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.dD:
                    int i19 = realmSet$annualFeeBasicAmount.i((List) unsafe.getObject(t, j));
                    i15 = i15;
                    if (i19 > 0) {
                        i14 = setCustomerName.a(i17);
                        i13 = setCustomerName.h(i19);
                        i7 = i19;
                        i8 = i14 + i13;
                        i6 = i8 + i7;
                        i15 += i6;
                        break;
                    } else {
                        break;
                    }
                case setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.dB:
                    int h = realmSet$annualFeeBasicAmount.h((List) unsafe.getObject(t, j));
                    i15 = i15;
                    if (h > 0) {
                        i14 = setCustomerName.a(i17);
                        i13 = setCustomerName.h(h);
                        i7 = h;
                        i8 = i14 + i13;
                        i6 = i8 + i7;
                        i15 += i6;
                        break;
                    } else {
                        break;
                    }
                case setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.dF:
                    int c6 = realmSet$annualFeeBasicAmount.c((List) unsafe.getObject(t, j));
                    i15 = i15;
                    if (c6 > 0) {
                        i14 = setCustomerName.a(i17);
                        i13 = setCustomerName.h(c6);
                        i7 = c6;
                        i8 = i14 + i13;
                        i6 = i8 + i7;
                        i15 += i6;
                        break;
                    } else {
                        break;
                    }
                case setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.dC:
                    int d = realmSet$annualFeeBasicAmount.d((List) unsafe.getObject(t, j));
                    i15 = i15;
                    if (d > 0) {
                        i14 = setCustomerName.a(i17);
                        i13 = setCustomerName.h(d);
                        i7 = d;
                        i8 = i14 + i13;
                        i6 = i8 + i7;
                        i15 += i6;
                        break;
                    } else {
                        break;
                    }
                case 39:
                    int e5 = realmSet$annualFeeBasicAmount.e((List) unsafe.getObject(t, j));
                    i15 = i15;
                    if (e5 > 0) {
                        i14 = setCustomerName.a(i17);
                        i13 = setCustomerName.h(e5);
                        i7 = e5;
                        i8 = i14 + i13;
                        i6 = i8 + i7;
                        i15 += i6;
                        break;
                    } else {
                        break;
                    }
                case 40:
                    int i20 = realmSet$annualFeeBasicAmount.i((List) unsafe.getObject(t, j));
                    i15 = i15;
                    if (i20 > 0) {
                        i14 = setCustomerName.a(i17);
                        i13 = setCustomerName.h(i20);
                        i7 = i20;
                        i8 = i14 + i13;
                        i6 = i8 + i7;
                        i15 += i6;
                        break;
                    } else {
                        break;
                    }
                case 41:
                    int h2 = realmSet$annualFeeBasicAmount.h((List) unsafe.getObject(t, j));
                    i15 = i15;
                    if (h2 > 0) {
                        i14 = setCustomerName.a(i17);
                        i13 = setCustomerName.h(h2);
                        i7 = h2;
                        i8 = i14 + i13;
                        i6 = i8 + i7;
                        i15 += i6;
                        break;
                    } else {
                        break;
                    }
                case 42:
                    int g = realmSet$annualFeeBasicAmount.g((List) unsafe.getObject(t, j));
                    i15 = i15;
                    if (g > 0) {
                        i14 = setCustomerName.a(i17);
                        i13 = setCustomerName.h(g);
                        i7 = g;
                        i8 = i14 + i13;
                        i6 = i8 + i7;
                        i15 += i6;
                        break;
                    } else {
                        break;
                    }
                case 43:
                    int f2 = realmSet$annualFeeBasicAmount.f((List) unsafe.getObject(t, j));
                    i15 = i15;
                    if (f2 > 0) {
                        i14 = setCustomerName.a(i17);
                        i13 = setCustomerName.h(f2);
                        i7 = f2;
                        i8 = i14 + i13;
                        i6 = i8 + i7;
                        i15 += i6;
                        break;
                    } else {
                        break;
                    }
                case 44:
                    int b = realmSet$annualFeeBasicAmount.b((List) unsafe.getObject(t, j));
                    i15 = i15;
                    if (b > 0) {
                        i14 = setCustomerName.a(i17);
                        i13 = setCustomerName.h(b);
                        i7 = b;
                        i8 = i14 + i13;
                        i6 = i8 + i7;
                        i15 += i6;
                        break;
                    } else {
                        break;
                    }
                case 45:
                    int h3 = realmSet$annualFeeBasicAmount.h((List) unsafe.getObject(t, j));
                    i15 = i15;
                    if (h3 > 0) {
                        i14 = setCustomerName.a(i17);
                        i13 = setCustomerName.h(h3);
                        i7 = h3;
                        i8 = i14 + i13;
                        i6 = i8 + i7;
                        i15 += i6;
                        break;
                    } else {
                        break;
                    }
                case 46:
                    int i21 = realmSet$annualFeeBasicAmount.i((List) unsafe.getObject(t, j));
                    i15 = i15;
                    if (i21 > 0) {
                        i14 = setCustomerName.a(i17);
                        i13 = setCustomerName.h(i21);
                        i7 = i21;
                        i8 = i14 + i13;
                        i6 = i8 + i7;
                        i15 += i6;
                        break;
                    } else {
                        break;
                    }
                case 47:
                    int j2 = realmSet$annualFeeBasicAmount.j((List) unsafe.getObject(t, j));
                    i15 = i15;
                    if (j2 > 0) {
                        i14 = setCustomerName.a(i17);
                        i13 = setCustomerName.h(j2);
                        i7 = j2;
                        i8 = i14 + i13;
                        i6 = i8 + i7;
                        i15 += i6;
                        break;
                    } else {
                        break;
                    }
                case 48:
                    int a3 = realmSet$annualFeeBasicAmount.a((List) unsafe.getObject(t, j));
                    i15 = i15;
                    if (a3 > 0) {
                        i14 = setCustomerName.a(i17);
                        i13 = setCustomerName.h(a3);
                        i7 = a3;
                        i8 = i14 + i13;
                        i6 = i8 + i7;
                        i15 += i6;
                        break;
                    } else {
                        break;
                    }
                case 49:
                    i = realmSet$annualFeeBasicAmount.d(i17, (List) realmGet$jobSector.f(t, j), b(i16));
                    i15 += i;
                    break;
                case 50:
                    realmGet$annualFeeAddOnDisplayAmount.d(i17, realmGet$jobSector.f(t, j), j(i16));
                    i15 = i15;
                    break;
                case 51:
                    i15 = i15;
                    if (d((realmGet$cardName<T>) t, i17, i16)) {
                        i2 = setCustomerName.h(i17 << 3);
                        i = i2 + 8;
                        i15 += i;
                        break;
                    } else {
                        break;
                    }
                case setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.S:
                    i15 = i15;
                    if (d((realmGet$cardName<T>) t, i17, i16)) {
                        i3 = setCustomerName.h(i17 << 3);
                        i = i3 + 4;
                        i15 += i;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    i15 = i15;
                    if (d((realmGet$cardName<T>) t, i17, i16)) {
                        long d2 = d(t, j);
                        i5 = setCustomerName.h(i17 << 3);
                        i4 = setCustomerName.b(d2);
                        i15 += i5 + i4;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    i15 = i15;
                    if (d((realmGet$cardName<T>) t, i17, i16)) {
                        long d3 = d(t, j);
                        i5 = setCustomerName.h(i17 << 3);
                        i4 = setCustomerName.b(d3);
                        i15 += i5 + i4;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    i15 = i15;
                    if (d((realmGet$cardName<T>) t, i17, i16)) {
                        int a4 = a(t, j);
                        i8 = setCustomerName.h(i17 << 3);
                        i7 = setCustomerName.d(a4);
                        i6 = i8 + i7;
                        i15 += i6;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    i15 = i15;
                    if (d((realmGet$cardName<T>) t, i17, i16)) {
                        i2 = setCustomerName.h(i17 << 3);
                        i = i2 + 8;
                        i15 += i;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    i15 = i15;
                    if (d((realmGet$cardName<T>) t, i17, i16)) {
                        i3 = setCustomerName.h(i17 << 3);
                        i = i3 + 4;
                        i15 += i;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    i15 = i15;
                    if (d((realmGet$cardName<T>) t, i17, i16)) {
                        i9 = setCustomerName.h(i17 << 3);
                        i = i9 + 1;
                        i15 += i;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    i15 = i15;
                    if (!d((realmGet$cardName<T>) t, i17, i16)) {
                        break;
                    } else {
                        Object f3 = realmGet$jobSector.f(t, j);
                        if (f3 instanceof setCurrOfficePostCode) {
                            i12 = setCustomerName.h(i17 << 3);
                            i11 = ((setCurrOfficePostCode) f3).b();
                            i10 = setCustomerName.h(i11);
                            i6 = i12 + i10 + i11;
                            i15 += i6;
                            break;
                        } else {
                            i8 = setCustomerName.h(i17 << 3);
                            i7 = setCustomerName.e((String) f3);
                            i6 = i8 + i7;
                            i15 += i6;
                        }
                    }
                case 60:
                    i15 = i15;
                    if (d((realmGet$cardName<T>) t, i17, i16)) {
                        i = realmSet$annualFeeBasicAmount.b(i17, realmGet$jobSector.f(t, j), b(i16));
                        i15 += i;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    i15 = i15;
                    if (d((realmGet$cardName<T>) t, i17, i16)) {
                        setCurrOfficePostCode setcurrofficepostcode2 = (setCurrOfficePostCode) realmGet$jobSector.f(t, j);
                        i12 = setCustomerName.h(i17 << 3);
                        i11 = setcurrofficepostcode2.b();
                        i10 = setCustomerName.h(i11);
                        i6 = i12 + i10 + i11;
                        i15 += i6;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    i15 = i15;
                    if (d((realmGet$cardName<T>) t, i17, i16)) {
                        int a5 = a(t, j);
                        i8 = setCustomerName.h(i17 << 3);
                        i7 = setCustomerName.h(a5);
                        i6 = i8 + i7;
                        i15 += i6;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    i15 = i15;
                    if (d((realmGet$cardName<T>) t, i17, i16)) {
                        int a6 = a(t, j);
                        i8 = setCustomerName.h(i17 << 3);
                        i7 = setCustomerName.d(a6);
                        i6 = i8 + i7;
                        i15 += i6;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    i15 = i15;
                    if (d((realmGet$cardName<T>) t, i17, i16)) {
                        i3 = setCustomerName.h(i17 << 3);
                        i = i3 + 4;
                        i15 += i;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    i15 = i15;
                    if (d((realmGet$cardName<T>) t, i17, i16)) {
                        i2 = setCustomerName.h(i17 << 3);
                        i = i2 + 8;
                        i15 += i;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    i15 = i15;
                    if (d((realmGet$cardName<T>) t, i17, i16)) {
                        int a7 = a(t, j);
                        i8 = setCustomerName.h(i17 << 3);
                        i7 = setCustomerName.h((a7 + a7) ^ (a7 >> 31));
                        i6 = i8 + i7;
                        i15 += i6;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    i15 = i15;
                    if (d((realmGet$cardName<T>) t, i17, i16)) {
                        long d4 = d(t, j);
                        i8 = setCustomerName.h(i17 << 3);
                        i7 = setCustomerName.b((d4 >> 63) ^ (d4 + d4));
                        i6 = i8 + i7;
                        i15 += i6;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    i15 = i15;
                    if (d((realmGet$cardName<T>) t, i17, i16)) {
                        i = setCustomerName.c(i17, (realmGet$cardDescription) realmGet$jobSector.f(t, j), b(i16));
                        i15 += i;
                        break;
                    } else {
                        break;
                    }
                default:
                    i15 = i15;
                    break;
            }
        }
        realmSet$incomeDisplayAmount<?, ?> realmset_incomedisplayamount = this.l;
        return i15 + realmset_incomedisplayamount.d(realmset_incomedisplayamount.a(t));
    }

    private final int h(T t) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        Unsafe unsafe = c;
        int i16 = 0;
        int i17 = 1048575;
        int i18 = 0;
        for (int i19 = 0; i19 < this.b.length; i19 += 3) {
            int e = e(i19);
            int i20 = this.b[i19];
            int a2 = a(e);
            if (a2 <= 17) {
                int i21 = this.b[i19 + 2];
                int i22 = i21 & 1048575;
                int i23 = 1 << (i21 >>> 20);
                i17 = i17;
                i = i23;
                if (i22 != i17) {
                    i18 = unsafe.getInt(t, (long) i22);
                    i17 = i22;
                    i = i23;
                }
            } else {
                i = 0;
                i17 = i17;
            }
            long j = (long) (e & 1048575);
            switch (a2) {
                case 0:
                    i16 = i16;
                    if ((i18 & i) != 0) {
                        i3 = setCustomerName.h(i20 << 3);
                        i2 = i3 + 8;
                        break;
                    } else {
                        continue;
                    }
                case 1:
                    i16 = i16;
                    if ((i18 & i) != 0) {
                        i4 = setCustomerName.h(i20 << 3);
                        i2 = i4 + 4;
                        break;
                    } else {
                        continue;
                    }
                case 2:
                    i16 = i16;
                    if ((i18 & i) != 0) {
                        long j2 = unsafe.getLong(t, j);
                        i6 = setCustomerName.h(i20 << 3);
                        i5 = setCustomerName.b(j2);
                        i2 = i6 + i5;
                        break;
                    } else {
                        continue;
                    }
                case 3:
                    i16 = i16;
                    if ((i18 & i) != 0) {
                        long j3 = unsafe.getLong(t, j);
                        i6 = setCustomerName.h(i20 << 3);
                        i5 = setCustomerName.b(j3);
                        i2 = i6 + i5;
                        break;
                    } else {
                        continue;
                    }
                case 4:
                    i16 = i16;
                    if ((i18 & i) != 0) {
                        int i24 = unsafe.getInt(t, j);
                        i8 = setCustomerName.h(i20 << 3);
                        i9 = setCustomerName.d(i24);
                        i7 = i8 + i9;
                        i16 += i7;
                    } else {
                        continue;
                    }
                case 5:
                    i16 = i16;
                    if ((i18 & i) != 0) {
                        i3 = setCustomerName.h(i20 << 3);
                        i2 = i3 + 8;
                        break;
                    } else {
                        continue;
                    }
                case 6:
                    i16 = i16;
                    if ((i18 & i) != 0) {
                        i4 = setCustomerName.h(i20 << 3);
                        i2 = i4 + 4;
                        break;
                    } else {
                        continue;
                    }
                case 7:
                    i16 = i16;
                    if ((i18 & i) != 0) {
                        i10 = setCustomerName.h(i20 << 3);
                        i2 = i10 + 1;
                        break;
                    } else {
                        continue;
                    }
                case 8:
                    i16 = i16;
                    if ((i18 & i) != 0) {
                        Object object = unsafe.getObject(t, j);
                        if (object instanceof setCurrOfficePostCode) {
                            i12 = setCustomerName.h(i20 << 3);
                            i13 = ((setCurrOfficePostCode) object).b();
                            i11 = setCustomerName.h(i13);
                            i7 = i12 + i11 + i13;
                            i16 += i7;
                        } else {
                            i8 = setCustomerName.h(i20 << 3);
                            i9 = setCustomerName.e((String) object);
                            i7 = i8 + i9;
                            i16 += i7;
                        }
                    } else {
                        continue;
                    }
                case 9:
                    i16 = i16;
                    if ((i18 & i) != 0) {
                        i2 = realmSet$annualFeeBasicAmount.b(i20, unsafe.getObject(t, j), b(i19));
                        break;
                    } else {
                        continue;
                    }
                case 10:
                    i16 = i16;
                    if ((i18 & i) != 0) {
                        setCurrOfficePostCode setcurrofficepostcode = (setCurrOfficePostCode) unsafe.getObject(t, j);
                        i12 = setCustomerName.h(i20 << 3);
                        i13 = setcurrofficepostcode.b();
                        i11 = setCustomerName.h(i13);
                        i7 = i12 + i11 + i13;
                        i16 += i7;
                    } else {
                        continue;
                    }
                case 11:
                    i16 = i16;
                    if ((i18 & i) != 0) {
                        int i25 = unsafe.getInt(t, j);
                        i8 = setCustomerName.h(i20 << 3);
                        i9 = setCustomerName.h(i25);
                        i7 = i8 + i9;
                        i16 += i7;
                    } else {
                        continue;
                    }
                case 12:
                    i16 = i16;
                    if ((i18 & i) != 0) {
                        int i26 = unsafe.getInt(t, j);
                        i8 = setCustomerName.h(i20 << 3);
                        i9 = setCustomerName.d(i26);
                        i7 = i8 + i9;
                        i16 += i7;
                    } else {
                        continue;
                    }
                case 13:
                    i16 = i16;
                    if ((i18 & i) != 0) {
                        i4 = setCustomerName.h(i20 << 3);
                        i2 = i4 + 4;
                        break;
                    } else {
                        continue;
                    }
                case 14:
                    i16 = i16;
                    if ((i18 & i) != 0) {
                        i3 = setCustomerName.h(i20 << 3);
                        i2 = i3 + 8;
                        break;
                    } else {
                        continue;
                    }
                case 15:
                    i16 = i16;
                    if ((i18 & i) != 0) {
                        int i27 = unsafe.getInt(t, j);
                        i8 = setCustomerName.h(i20 << 3);
                        i9 = setCustomerName.h((i27 + i27) ^ (i27 >> 31));
                        i7 = i8 + i9;
                        i16 += i7;
                    } else {
                        continue;
                    }
                case 16:
                    i16 = i16;
                    if ((i18 & i) != 0) {
                        long j4 = unsafe.getLong(t, j);
                        i8 = setCustomerName.h(i20 << 3);
                        i9 = setCustomerName.b((j4 + j4) ^ (j4 >> 63));
                        i7 = i8 + i9;
                        i16 += i7;
                    } else {
                        continue;
                    }
                case 17:
                    i16 = i16;
                    if ((i18 & i) != 0) {
                        i2 = setCustomerName.c(i20, (realmGet$cardDescription) unsafe.getObject(t, j), b(i19));
                        break;
                    } else {
                        continue;
                    }
                case 18:
                    i2 = realmSet$annualFeeBasicAmount.j(i20, (List) unsafe.getObject(t, j), false);
                    break;
                case 19:
                    i2 = realmSet$annualFeeBasicAmount.g(i20, (List) unsafe.getObject(t, j), false);
                    break;
                case 20:
                    i2 = realmSet$annualFeeBasicAmount.d(i20, (List<Long>) ((List) unsafe.getObject(t, j)), false);
                    break;
                case 21:
                    i2 = realmSet$annualFeeBasicAmount.e(i20, (List<Long>) ((List) unsafe.getObject(t, j)), false);
                    break;
                case 22:
                    i2 = realmSet$annualFeeBasicAmount.c(i20, (List) unsafe.getObject(t, j), false);
                    break;
                case 23:
                    i2 = realmSet$annualFeeBasicAmount.j(i20, (List) unsafe.getObject(t, j), false);
                    break;
                case 24:
                    i2 = realmSet$annualFeeBasicAmount.g(i20, (List) unsafe.getObject(t, j), false);
                    break;
                case 25:
                    i2 = realmSet$annualFeeBasicAmount.i(i20, (List) unsafe.getObject(t, j), false);
                    break;
                case 26:
                    i2 = realmSet$annualFeeBasicAmount.c(i20, (List) unsafe.getObject(t, j));
                    break;
                case 27:
                    i2 = realmSet$annualFeeBasicAmount.a(i20, (List) unsafe.getObject(t, j), b(i19));
                    break;
                case 28:
                    i2 = realmSet$annualFeeBasicAmount.b(i20, (List) unsafe.getObject(t, j));
                    break;
                case 29:
                    i2 = realmSet$annualFeeBasicAmount.f(i20, (List) unsafe.getObject(t, j), false);
                    break;
                case 30:
                    i2 = realmSet$annualFeeBasicAmount.a(i20, (List<Integer>) ((List) unsafe.getObject(t, j)), false);
                    break;
                case setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.bv:
                    i2 = realmSet$annualFeeBasicAmount.g(i20, (List) unsafe.getObject(t, j), false);
                    break;
                case 32:
                    i2 = realmSet$annualFeeBasicAmount.j(i20, (List) unsafe.getObject(t, j), false);
                    break;
                case Framer.ENTER_FRAME_PREFIX:
                    i2 = realmSet$annualFeeBasicAmount.h(i20, (List) unsafe.getObject(t, j), false);
                    break;
                case 34:
                    i2 = realmSet$annualFeeBasicAmount.b(i20, (List<Long>) ((List) unsafe.getObject(t, j)), false);
                    break;
                case setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.dD:
                    int i28 = realmSet$annualFeeBasicAmount.i((List) unsafe.getObject(t, j));
                    i16 = i16;
                    if (i28 > 0) {
                        i15 = setCustomerName.a(i20);
                        i14 = setCustomerName.h(i28);
                        i9 = i28;
                        i8 = i15 + i14;
                        i7 = i8 + i9;
                        i16 += i7;
                    } else {
                        continue;
                    }
                case setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.dB:
                    int h = realmSet$annualFeeBasicAmount.h((List) unsafe.getObject(t, j));
                    i16 = i16;
                    if (h > 0) {
                        i15 = setCustomerName.a(i20);
                        i14 = setCustomerName.h(h);
                        i9 = h;
                        i8 = i15 + i14;
                        i7 = i8 + i9;
                        i16 += i7;
                    } else {
                        continue;
                    }
                case setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.dF:
                    int c2 = realmSet$annualFeeBasicAmount.c((List) unsafe.getObject(t, j));
                    i16 = i16;
                    if (c2 > 0) {
                        i15 = setCustomerName.a(i20);
                        i14 = setCustomerName.h(c2);
                        i9 = c2;
                        i8 = i15 + i14;
                        i7 = i8 + i9;
                        i16 += i7;
                    } else {
                        continue;
                    }
                case setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.dC:
                    int d = realmSet$annualFeeBasicAmount.d((List) unsafe.getObject(t, j));
                    i16 = i16;
                    if (d > 0) {
                        i15 = setCustomerName.a(i20);
                        i14 = setCustomerName.h(d);
                        i9 = d;
                        i8 = i15 + i14;
                        i7 = i8 + i9;
                        i16 += i7;
                    } else {
                        continue;
                    }
                case 39:
                    int e2 = realmSet$annualFeeBasicAmount.e((List) unsafe.getObject(t, j));
                    i16 = i16;
                    if (e2 > 0) {
                        i15 = setCustomerName.a(i20);
                        i14 = setCustomerName.h(e2);
                        i9 = e2;
                        i8 = i15 + i14;
                        i7 = i8 + i9;
                        i16 += i7;
                    } else {
                        continue;
                    }
                case 40:
                    int i29 = realmSet$annualFeeBasicAmount.i((List) unsafe.getObject(t, j));
                    i16 = i16;
                    if (i29 > 0) {
                        i15 = setCustomerName.a(i20);
                        i14 = setCustomerName.h(i29);
                        i9 = i29;
                        i8 = i15 + i14;
                        i7 = i8 + i9;
                        i16 += i7;
                    } else {
                        continue;
                    }
                case 41:
                    int h2 = realmSet$annualFeeBasicAmount.h((List) unsafe.getObject(t, j));
                    i16 = i16;
                    if (h2 > 0) {
                        i15 = setCustomerName.a(i20);
                        i14 = setCustomerName.h(h2);
                        i9 = h2;
                        i8 = i15 + i14;
                        i7 = i8 + i9;
                        i16 += i7;
                    } else {
                        continue;
                    }
                case 42:
                    int g = realmSet$annualFeeBasicAmount.g((List) unsafe.getObject(t, j));
                    i16 = i16;
                    if (g > 0) {
                        i15 = setCustomerName.a(i20);
                        i14 = setCustomerName.h(g);
                        i9 = g;
                        i8 = i15 + i14;
                        i7 = i8 + i9;
                        i16 += i7;
                    } else {
                        continue;
                    }
                case 43:
                    int f = realmSet$annualFeeBasicAmount.f((List) unsafe.getObject(t, j));
                    i16 = i16;
                    if (f > 0) {
                        i15 = setCustomerName.a(i20);
                        i14 = setCustomerName.h(f);
                        i9 = f;
                        i8 = i15 + i14;
                        i7 = i8 + i9;
                        i16 += i7;
                    } else {
                        continue;
                    }
                case 44:
                    int b = realmSet$annualFeeBasicAmount.b((List) unsafe.getObject(t, j));
                    i16 = i16;
                    if (b > 0) {
                        i15 = setCustomerName.a(i20);
                        i14 = setCustomerName.h(b);
                        i9 = b;
                        i8 = i15 + i14;
                        i7 = i8 + i9;
                        i16 += i7;
                    } else {
                        continue;
                    }
                case 45:
                    int h3 = realmSet$annualFeeBasicAmount.h((List) unsafe.getObject(t, j));
                    i16 = i16;
                    if (h3 > 0) {
                        i15 = setCustomerName.a(i20);
                        i14 = setCustomerName.h(h3);
                        i9 = h3;
                        i8 = i15 + i14;
                        i7 = i8 + i9;
                        i16 += i7;
                    } else {
                        continue;
                    }
                case 46:
                    int i30 = realmSet$annualFeeBasicAmount.i((List) unsafe.getObject(t, j));
                    i16 = i16;
                    if (i30 > 0) {
                        i15 = setCustomerName.a(i20);
                        i14 = setCustomerName.h(i30);
                        i9 = i30;
                        i8 = i15 + i14;
                        i7 = i8 + i9;
                        i16 += i7;
                    } else {
                        continue;
                    }
                case 47:
                    int j5 = realmSet$annualFeeBasicAmount.j((List) unsafe.getObject(t, j));
                    i16 = i16;
                    if (j5 > 0) {
                        i15 = setCustomerName.a(i20);
                        i14 = setCustomerName.h(j5);
                        i9 = j5;
                        i8 = i15 + i14;
                        i7 = i8 + i9;
                        i16 += i7;
                    } else {
                        continue;
                    }
                case 48:
                    int a3 = realmSet$annualFeeBasicAmount.a((List) unsafe.getObject(t, j));
                    i16 = i16;
                    if (a3 > 0) {
                        i15 = setCustomerName.a(i20);
                        i14 = setCustomerName.h(a3);
                        i9 = a3;
                        i8 = i15 + i14;
                        i7 = i8 + i9;
                        i16 += i7;
                    } else {
                        continue;
                    }
                case 49:
                    i2 = realmSet$annualFeeBasicAmount.d(i20, (List) unsafe.getObject(t, j), b(i19));
                    break;
                case 50:
                    realmGet$annualFeeAddOnDisplayAmount.d(i20, unsafe.getObject(t, j), j(i19));
                    i16 = i16;
                    continue;
                case 51:
                    i16 = i16;
                    if (d((realmGet$cardName<T>) t, i20, i19)) {
                        i3 = setCustomerName.h(i20 << 3);
                        i2 = i3 + 8;
                        break;
                    } else {
                        continue;
                    }
                case setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.S:
                    i16 = i16;
                    if (d((realmGet$cardName<T>) t, i20, i19)) {
                        i4 = setCustomerName.h(i20 << 3);
                        i2 = i4 + 4;
                        break;
                    } else {
                        continue;
                    }
                case 53:
                    i16 = i16;
                    if (d((realmGet$cardName<T>) t, i20, i19)) {
                        long d2 = d(t, j);
                        i6 = setCustomerName.h(i20 << 3);
                        i5 = setCustomerName.b(d2);
                        i2 = i6 + i5;
                        break;
                    } else {
                        continue;
                    }
                case 54:
                    i16 = i16;
                    if (d((realmGet$cardName<T>) t, i20, i19)) {
                        long d3 = d(t, j);
                        i6 = setCustomerName.h(i20 << 3);
                        i5 = setCustomerName.b(d3);
                        i2 = i6 + i5;
                        break;
                    } else {
                        continue;
                    }
                case 55:
                    i16 = i16;
                    if (d((realmGet$cardName<T>) t, i20, i19)) {
                        int a4 = a(t, j);
                        i8 = setCustomerName.h(i20 << 3);
                        i9 = setCustomerName.d(a4);
                        i7 = i8 + i9;
                        i16 += i7;
                    } else {
                        continue;
                    }
                case 56:
                    i16 = i16;
                    if (d((realmGet$cardName<T>) t, i20, i19)) {
                        i3 = setCustomerName.h(i20 << 3);
                        i2 = i3 + 8;
                        break;
                    } else {
                        continue;
                    }
                case 57:
                    i16 = i16;
                    if (d((realmGet$cardName<T>) t, i20, i19)) {
                        i4 = setCustomerName.h(i20 << 3);
                        i2 = i4 + 4;
                        break;
                    } else {
                        continue;
                    }
                case 58:
                    i16 = i16;
                    if (d((realmGet$cardName<T>) t, i20, i19)) {
                        i10 = setCustomerName.h(i20 << 3);
                        i2 = i10 + 1;
                        break;
                    } else {
                        continue;
                    }
                case 59:
                    i16 = i16;
                    if (d((realmGet$cardName<T>) t, i20, i19)) {
                        Object object2 = unsafe.getObject(t, j);
                        if (object2 instanceof setCurrOfficePostCode) {
                            i12 = setCustomerName.h(i20 << 3);
                            i13 = ((setCurrOfficePostCode) object2).b();
                            i11 = setCustomerName.h(i13);
                            i7 = i12 + i11 + i13;
                            i16 += i7;
                        } else {
                            i8 = setCustomerName.h(i20 << 3);
                            i9 = setCustomerName.e((String) object2);
                            i7 = i8 + i9;
                            i16 += i7;
                        }
                    } else {
                        continue;
                    }
                case 60:
                    i16 = i16;
                    if (d((realmGet$cardName<T>) t, i20, i19)) {
                        i2 = realmSet$annualFeeBasicAmount.b(i20, unsafe.getObject(t, j), b(i19));
                        break;
                    } else {
                        continue;
                    }
                case 61:
                    i16 = i16;
                    if (d((realmGet$cardName<T>) t, i20, i19)) {
                        setCurrOfficePostCode setcurrofficepostcode2 = (setCurrOfficePostCode) unsafe.getObject(t, j);
                        i12 = setCustomerName.h(i20 << 3);
                        i13 = setcurrofficepostcode2.b();
                        i11 = setCustomerName.h(i13);
                        i7 = i12 + i11 + i13;
                        i16 += i7;
                    } else {
                        continue;
                    }
                case 62:
                    i16 = i16;
                    if (d((realmGet$cardName<T>) t, i20, i19)) {
                        int a5 = a(t, j);
                        i8 = setCustomerName.h(i20 << 3);
                        i9 = setCustomerName.h(a5);
                        i7 = i8 + i9;
                        i16 += i7;
                    } else {
                        continue;
                    }
                case 63:
                    i16 = i16;
                    if (d((realmGet$cardName<T>) t, i20, i19)) {
                        int a6 = a(t, j);
                        i8 = setCustomerName.h(i20 << 3);
                        i9 = setCustomerName.d(a6);
                        i7 = i8 + i9;
                        i16 += i7;
                    } else {
                        continue;
                    }
                case 64:
                    i16 = i16;
                    if (d((realmGet$cardName<T>) t, i20, i19)) {
                        i4 = setCustomerName.h(i20 << 3);
                        i2 = i4 + 4;
                        break;
                    } else {
                        continue;
                    }
                case 65:
                    i16 = i16;
                    if (d((realmGet$cardName<T>) t, i20, i19)) {
                        i3 = setCustomerName.h(i20 << 3);
                        i2 = i3 + 8;
                        break;
                    } else {
                        continue;
                    }
                case 66:
                    i16 = i16;
                    if (d((realmGet$cardName<T>) t, i20, i19)) {
                        int a7 = a(t, j);
                        i8 = setCustomerName.h(i20 << 3);
                        i9 = setCustomerName.h((a7 + a7) ^ (a7 >> 31));
                        i7 = i8 + i9;
                        i16 += i7;
                    } else {
                        continue;
                    }
                case 67:
                    i16 = i16;
                    if (d((realmGet$cardName<T>) t, i20, i19)) {
                        long d4 = d(t, j);
                        i8 = setCustomerName.h(i20 << 3);
                        i9 = setCustomerName.b((d4 + d4) ^ (d4 >> 63));
                        i7 = i8 + i9;
                        i16 += i7;
                    } else {
                        continue;
                    }
                case 68:
                    i16 = i16;
                    if (d((realmGet$cardName<T>) t, i20, i19)) {
                        i2 = setCustomerName.c(i20, (realmGet$cardDescription) unsafe.getObject(t, j), b(i19));
                        break;
                    } else {
                        continue;
                    }
                default:
                    i16 = i16;
                    continue;
            }
            i16 += i2;
        }
        realmSet$incomeDisplayAmount<?, ?> realmset_incomedisplayamount = this.l;
        int d5 = realmset_incomedisplayamount.d(realmset_incomedisplayamount.a(t));
        if (!this.j) {
            return i16 + d5;
        }
        this.k.a(t);
        throw null;
    }

    private final setKrisFlyer i(int i) {
        int i2 = i / 3;
        return (setKrisFlyer) this.d[i2 + i2 + 1];
    }

    private final Object j(int i) {
        int i2 = i / 3;
        return this.d[i2 + i2];
    }

    @Override // o.realmSet$annualFeeBasicDisplayAmount
    public final int a(T t) {
        int i;
        int i2;
        int length = this.b.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4 += 3) {
            int e = e(i4);
            int i5 = this.b[i4];
            long j = (long) (1048575 & e);
            int i6 = 37;
            switch (a(e)) {
                case 0:
                    i = i3 * 53;
                    i2 = setNationality.c(Double.doubleToLongBits(realmGet$jobSector.d(t, j)));
                    i3 = i + i2;
                    break;
                case 1:
                    i = i3 * 53;
                    i2 = Float.floatToIntBits(realmGet$jobSector.a(t, j));
                    i3 = i + i2;
                    break;
                case 2:
                    i = i3 * 53;
                    i2 = setNationality.c(realmGet$jobSector.e(t, j));
                    i3 = i + i2;
                    break;
                case 3:
                    i = i3 * 53;
                    i2 = setNationality.c(realmGet$jobSector.e(t, j));
                    i3 = i + i2;
                    break;
                case 4:
                    i = i3 * 53;
                    i2 = realmGet$jobSector.c(t, j);
                    i3 = i + i2;
                    break;
                case 5:
                    i = i3 * 53;
                    i2 = setNationality.c(realmGet$jobSector.e(t, j));
                    i3 = i + i2;
                    break;
                case 6:
                    i = i3 * 53;
                    i2 = realmGet$jobSector.c(t, j);
                    i3 = i + i2;
                    break;
                case 7:
                    i = i3 * 53;
                    i2 = setNationality.d(realmGet$jobSector.b(t, j));
                    i3 = i + i2;
                    break;
                case 8:
                    i = i3 * 53;
                    i2 = ((String) realmGet$jobSector.f(t, j)).hashCode();
                    i3 = i + i2;
                    break;
                case 9:
                    Object f = realmGet$jobSector.f(t, j);
                    if (f != null) {
                        i6 = f.hashCode();
                    }
                    i3 = (i3 * 53) + i6;
                    break;
                case 10:
                    i = i3 * 53;
                    i2 = realmGet$jobSector.f(t, j).hashCode();
                    i3 = i + i2;
                    break;
                case 11:
                    i = i3 * 53;
                    i2 = realmGet$jobSector.c(t, j);
                    i3 = i + i2;
                    break;
                case 12:
                    i = i3 * 53;
                    i2 = realmGet$jobSector.c(t, j);
                    i3 = i + i2;
                    break;
                case 13:
                    i = i3 * 53;
                    i2 = realmGet$jobSector.c(t, j);
                    i3 = i + i2;
                    break;
                case 14:
                    i = i3 * 53;
                    i2 = setNationality.c(realmGet$jobSector.e(t, j));
                    i3 = i + i2;
                    break;
                case 15:
                    i = i3 * 53;
                    i2 = realmGet$jobSector.c(t, j);
                    i3 = i + i2;
                    break;
                case 16:
                    i = i3 * 53;
                    i2 = setNationality.c(realmGet$jobSector.e(t, j));
                    i3 = i + i2;
                    break;
                case 17:
                    Object f2 = realmGet$jobSector.f(t, j);
                    if (f2 != null) {
                        i6 = f2.hashCode();
                    }
                    i3 = (i3 * 53) + i6;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.bv:
                case 32:
                case Framer.ENTER_FRAME_PREFIX:
                case 34:
                case setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.dD:
                case setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.dB:
                case setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.dF:
                case setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.dC:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i = i3 * 53;
                    i2 = realmGet$jobSector.f(t, j).hashCode();
                    i3 = i + i2;
                    break;
                case 50:
                    i = i3 * 53;
                    i2 = realmGet$jobSector.f(t, j).hashCode();
                    i3 = i + i2;
                    break;
                case 51:
                    i3 = i3;
                    if (d((realmGet$cardName<T>) t, i5, i4)) {
                        i = i3 * 53;
                        i2 = setNationality.c(Double.doubleToLongBits(e(t, j)));
                        i3 = i + i2;
                        break;
                    } else {
                        break;
                    }
                case setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.S:
                    i3 = i3;
                    if (d((realmGet$cardName<T>) t, i5, i4)) {
                        i = i3 * 53;
                        i2 = Float.floatToIntBits(b(t, j));
                        i3 = i + i2;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    i3 = i3;
                    if (d((realmGet$cardName<T>) t, i5, i4)) {
                        i = i3 * 53;
                        i2 = setNationality.c(d(t, j));
                        i3 = i + i2;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    i3 = i3;
                    if (d((realmGet$cardName<T>) t, i5, i4)) {
                        i = i3 * 53;
                        i2 = setNationality.c(d(t, j));
                        i3 = i + i2;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    i3 = i3;
                    if (d((realmGet$cardName<T>) t, i5, i4)) {
                        i = i3 * 53;
                        i2 = a(t, j);
                        i3 = i + i2;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    i3 = i3;
                    if (d((realmGet$cardName<T>) t, i5, i4)) {
                        i = i3 * 53;
                        i2 = setNationality.c(d(t, j));
                        i3 = i + i2;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    i3 = i3;
                    if (d((realmGet$cardName<T>) t, i5, i4)) {
                        i = i3 * 53;
                        i2 = a(t, j);
                        i3 = i + i2;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    i3 = i3;
                    if (d((realmGet$cardName<T>) t, i5, i4)) {
                        i = i3 * 53;
                        i2 = setNationality.d(c(t, j));
                        i3 = i + i2;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    i3 = i3;
                    if (d((realmGet$cardName<T>) t, i5, i4)) {
                        i = i3 * 53;
                        i2 = ((String) realmGet$jobSector.f(t, j)).hashCode();
                        i3 = i + i2;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    i3 = i3;
                    if (d((realmGet$cardName<T>) t, i5, i4)) {
                        i = i3 * 53;
                        i2 = realmGet$jobSector.f(t, j).hashCode();
                        i3 = i + i2;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    i3 = i3;
                    if (d((realmGet$cardName<T>) t, i5, i4)) {
                        i = i3 * 53;
                        i2 = realmGet$jobSector.f(t, j).hashCode();
                        i3 = i + i2;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    i3 = i3;
                    if (d((realmGet$cardName<T>) t, i5, i4)) {
                        i = i3 * 53;
                        i2 = a(t, j);
                        i3 = i + i2;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    i3 = i3;
                    if (d((realmGet$cardName<T>) t, i5, i4)) {
                        i = i3 * 53;
                        i2 = a(t, j);
                        i3 = i + i2;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    i3 = i3;
                    if (d((realmGet$cardName<T>) t, i5, i4)) {
                        i = i3 * 53;
                        i2 = a(t, j);
                        i3 = i + i2;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    i3 = i3;
                    if (d((realmGet$cardName<T>) t, i5, i4)) {
                        i = i3 * 53;
                        i2 = setNationality.c(d(t, j));
                        i3 = i + i2;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    i3 = i3;
                    if (d((realmGet$cardName<T>) t, i5, i4)) {
                        i = i3 * 53;
                        i2 = a(t, j);
                        i3 = i + i2;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    i3 = i3;
                    if (d((realmGet$cardName<T>) t, i5, i4)) {
                        i = i3 * 53;
                        i2 = setNationality.c(d(t, j));
                        i3 = i + i2;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    i3 = i3;
                    if (d((realmGet$cardName<T>) t, i5, i4)) {
                        i = i3 * 53;
                        i2 = realmGet$jobSector.f(t, j).hashCode();
                        i3 = i + i2;
                        break;
                    } else {
                        break;
                    }
                default:
                    i3 = i3;
                    break;
            }
        }
        int hashCode = this.l.a(t).hashCode();
        if (!this.j) {
            return (i3 * 53) + hashCode;
        }
        this.k.a(t);
        throw null;
    }

    @Override // o.realmSet$annualFeeBasicDisplayAmount
    public final boolean a(T t, T t2) {
        boolean z;
        int length = this.b.length;
        for (int i = 0; i < length; i += 3) {
            int e = e(i);
            long j = (long) (e & 1048575);
            switch (a(e)) {
                case 0:
                    if (!e(t, t2, i) || Double.doubleToLongBits(realmGet$jobSector.d(t, j)) != Double.doubleToLongBits(realmGet$jobSector.d(t2, j))) {
                        return false;
                    }
                    continue;
                    break;
                case 1:
                    if (!e(t, t2, i) || Float.floatToIntBits(realmGet$jobSector.a(t, j)) != Float.floatToIntBits(realmGet$jobSector.a(t2, j))) {
                        return false;
                    }
                    continue;
                    break;
                case 2:
                    if (!e(t, t2, i) || realmGet$jobSector.e(t, j) != realmGet$jobSector.e(t2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 3:
                    if (!e(t, t2, i) || realmGet$jobSector.e(t, j) != realmGet$jobSector.e(t2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 4:
                    if (!e(t, t2, i) || realmGet$jobSector.c(t, j) != realmGet$jobSector.c(t2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 5:
                    if (!e(t, t2, i) || realmGet$jobSector.e(t, j) != realmGet$jobSector.e(t2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 6:
                    if (!e(t, t2, i) || realmGet$jobSector.c(t, j) != realmGet$jobSector.c(t2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 7:
                    if (!e(t, t2, i) || realmGet$jobSector.b(t, j) != realmGet$jobSector.b(t2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 8:
                    if (!e(t, t2, i) || !realmSet$annualFeeBasicAmount.d(realmGet$jobSector.f(t, j), realmGet$jobSector.f(t2, j))) {
                        return false;
                    }
                    continue;
                    break;
                case 9:
                    if (!e(t, t2, i) || !realmSet$annualFeeBasicAmount.d(realmGet$jobSector.f(t, j), realmGet$jobSector.f(t2, j))) {
                        return false;
                    }
                    continue;
                    break;
                case 10:
                    if (!e(t, t2, i) || !realmSet$annualFeeBasicAmount.d(realmGet$jobSector.f(t, j), realmGet$jobSector.f(t2, j))) {
                        return false;
                    }
                    continue;
                    break;
                case 11:
                    if (!e(t, t2, i) || realmGet$jobSector.c(t, j) != realmGet$jobSector.c(t2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 12:
                    if (!e(t, t2, i) || realmGet$jobSector.c(t, j) != realmGet$jobSector.c(t2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 13:
                    if (!e(t, t2, i) || realmGet$jobSector.c(t, j) != realmGet$jobSector.c(t2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 14:
                    if (!e(t, t2, i) || realmGet$jobSector.e(t, j) != realmGet$jobSector.e(t2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 15:
                    if (!e(t, t2, i) || realmGet$jobSector.c(t, j) != realmGet$jobSector.c(t2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 16:
                    if (!e(t, t2, i) || realmGet$jobSector.e(t, j) != realmGet$jobSector.e(t2, j)) {
                        return false;
                    }
                    continue;
                    break;
                case 17:
                    if (!e(t, t2, i) || !realmSet$annualFeeBasicAmount.d(realmGet$jobSector.f(t, j), realmGet$jobSector.f(t2, j))) {
                        return false;
                    }
                    continue;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.bv:
                case 32:
                case Framer.ENTER_FRAME_PREFIX:
                case 34:
                case setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.dD:
                case setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.dB:
                case setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.dF:
                case setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.dC:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    z = realmSet$annualFeeBasicAmount.d(realmGet$jobSector.f(t, j), realmGet$jobSector.f(t2, j));
                    break;
                case 50:
                    z = realmSet$annualFeeBasicAmount.d(realmGet$jobSector.f(t, j), realmGet$jobSector.f(t2, j));
                    break;
                case 51:
                case setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.S:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long d = (long) (d(i) & 1048575);
                    if (realmGet$jobSector.c(t, d) != realmGet$jobSector.c(t2, d) || !realmSet$annualFeeBasicAmount.d(realmGet$jobSector.f(t, j), realmGet$jobSector.f(t2, j))) {
                        return false;
                    }
                    continue;
                    break;
                default:
            }
            if (!z) {
                return false;
            }
        }
        if (!this.l.a(t).equals(this.l.a(t2))) {
            return false;
        }
        if (!this.j) {
            return true;
        }
        this.k.a(t);
        this.k.a(t2);
        throw null;
    }

    @Override // o.realmSet$annualFeeBasicDisplayAmount
    public final void b(T t) {
        int i;
        int i2 = this.f178o;
        while (true) {
            i = this.m;
            if (i2 >= i) {
                break;
            }
            long e = (long) (e(this.f[i2]) & 1048575);
            Object f = realmGet$jobSector.f(t, e);
            if (f != null) {
                ((realmGet$annualFeeAddOnAmount) f).e();
                realmGet$jobSector.e(t, e, f);
            }
            i2++;
        }
        int length = this.f.length;
        for (int i3 = i; i3 < length; i3++) {
            this.n.e(t, (long) this.f[i3]);
        }
        this.l.c(t);
        if (this.j) {
            this.k.b(t);
        }
    }

    @Override // o.realmSet$annualFeeBasicDisplayAmount
    public final void b(T t, setEmergencyContactOfficeExt setemergencycontactofficeext) throws IOException {
        if (!this.h) {
            d((realmGet$cardName<T>) t, setemergencycontactofficeext);
        } else if (!this.j) {
            int length = this.b.length;
            for (int i = 0; i < length; i += 3) {
                int e = e(i);
                int i2 = this.b[i];
                switch (a(e)) {
                    case 0:
                        if (e((realmGet$cardName<T>) t, i)) {
                            setemergencycontactofficeext.a(i2, realmGet$jobSector.d(t, (long) (e & 1048575)));
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (e((realmGet$cardName<T>) t, i)) {
                            setemergencycontactofficeext.a(i2, realmGet$jobSector.a(t, (long) (e & 1048575)));
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (e((realmGet$cardName<T>) t, i)) {
                            setemergencycontactofficeext.a(i2, realmGet$jobSector.e(t, (long) (e & 1048575)));
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (e((realmGet$cardName<T>) t, i)) {
                            setemergencycontactofficeext.d(i2, realmGet$jobSector.e(t, (long) (e & 1048575)));
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (e((realmGet$cardName<T>) t, i)) {
                            setemergencycontactofficeext.d(i2, realmGet$jobSector.c(t, (long) (e & 1048575)));
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (e((realmGet$cardName<T>) t, i)) {
                            setemergencycontactofficeext.c(i2, realmGet$jobSector.e(t, (long) (e & 1048575)));
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (e((realmGet$cardName<T>) t, i)) {
                            setemergencycontactofficeext.a(i2, realmGet$jobSector.c(t, (long) (e & 1048575)));
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (e((realmGet$cardName<T>) t, i)) {
                            setemergencycontactofficeext.b(i2, realmGet$jobSector.b(t, (long) (e & 1048575)));
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (e((realmGet$cardName<T>) t, i)) {
                            a(i2, realmGet$jobSector.f(t, (long) (e & 1048575)), setemergencycontactofficeext);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        if (e((realmGet$cardName<T>) t, i)) {
                            setemergencycontactofficeext.c(i2, realmGet$jobSector.f(t, (long) (e & 1048575)), b(i));
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (e((realmGet$cardName<T>) t, i)) {
                            setemergencycontactofficeext.a(i2, (setCurrOfficePostCode) realmGet$jobSector.f(t, (long) (e & 1048575)));
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (e((realmGet$cardName<T>) t, i)) {
                            setemergencycontactofficeext.e(i2, realmGet$jobSector.c(t, (long) (e & 1048575)));
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (e((realmGet$cardName<T>) t, i)) {
                            setemergencycontactofficeext.c(i2, realmGet$jobSector.c(t, (long) (e & 1048575)));
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (e((realmGet$cardName<T>) t, i)) {
                            setemergencycontactofficeext.b(i2, realmGet$jobSector.c(t, (long) (e & 1048575)));
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (e((realmGet$cardName<T>) t, i)) {
                            setemergencycontactofficeext.e(i2, realmGet$jobSector.e(t, (long) (e & 1048575)));
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (e((realmGet$cardName<T>) t, i)) {
                            setemergencycontactofficeext.g(i2, realmGet$jobSector.c(t, (long) (e & 1048575)));
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (e((realmGet$cardName<T>) t, i)) {
                            setemergencycontactofficeext.b(i2, realmGet$jobSector.e(t, (long) (e & 1048575)));
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (e((realmGet$cardName<T>) t, i)) {
                            setemergencycontactofficeext.b(i2, realmGet$jobSector.f(t, (long) (e & 1048575)), b(i));
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        realmSet$annualFeeBasicAmount.b(this.b[i], (List<Double>) ((List) realmGet$jobSector.f(t, (long) (e & 1048575))), setemergencycontactofficeext, false);
                        break;
                    case 19:
                        realmSet$annualFeeBasicAmount.c(this.b[i], (List<Float>) ((List) realmGet$jobSector.f(t, (long) (e & 1048575))), setemergencycontactofficeext, false);
                        break;
                    case 20:
                        realmSet$annualFeeBasicAmount.a(this.b[i], (List<Long>) ((List) realmGet$jobSector.f(t, (long) (e & 1048575))), setemergencycontactofficeext, false);
                        break;
                    case 21:
                        realmSet$annualFeeBasicAmount.d(this.b[i], (List) realmGet$jobSector.f(t, (long) (e & 1048575)), setemergencycontactofficeext, false);
                        break;
                    case 22:
                        realmSet$annualFeeBasicAmount.j(this.b[i], (List) realmGet$jobSector.f(t, (long) (e & 1048575)), setemergencycontactofficeext, false);
                        break;
                    case 23:
                        realmSet$annualFeeBasicAmount.h(this.b[i], (List) realmGet$jobSector.f(t, (long) (e & 1048575)), setemergencycontactofficeext, false);
                        break;
                    case 24:
                        realmSet$annualFeeBasicAmount.m(this.b[i], (List) realmGet$jobSector.f(t, (long) (e & 1048575)), setemergencycontactofficeext, false);
                        break;
                    case 25:
                        realmSet$annualFeeBasicAmount.o(this.b[i], (List) realmGet$jobSector.f(t, (long) (e & 1048575)), setemergencycontactofficeext, false);
                        break;
                    case 26:
                        realmSet$annualFeeBasicAmount.e(this.b[i], (List) realmGet$jobSector.f(t, (long) (e & 1048575)), setemergencycontactofficeext);
                        break;
                    case 27:
                        realmSet$annualFeeBasicAmount.b(this.b[i], (List) realmGet$jobSector.f(t, (long) (e & 1048575)), setemergencycontactofficeext, b(i));
                        break;
                    case 28:
                        realmSet$annualFeeBasicAmount.d(this.b[i], (List) realmGet$jobSector.f(t, (long) (e & 1048575)), setemergencycontactofficeext);
                        break;
                    case 29:
                        realmSet$annualFeeBasicAmount.i(this.b[i], (List) realmGet$jobSector.f(t, (long) (e & 1048575)), setemergencycontactofficeext, false);
                        break;
                    case 30:
                        realmSet$annualFeeBasicAmount.n(this.b[i], (List) realmGet$jobSector.f(t, (long) (e & 1048575)), setemergencycontactofficeext, false);
                        break;
                    case setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.bv:
                        realmSet$annualFeeBasicAmount.k(this.b[i], (List) realmGet$jobSector.f(t, (long) (e & 1048575)), setemergencycontactofficeext, false);
                        break;
                    case 32:
                        realmSet$annualFeeBasicAmount.f(this.b[i], (List) realmGet$jobSector.f(t, (long) (e & 1048575)), setemergencycontactofficeext, false);
                        break;
                    case Framer.ENTER_FRAME_PREFIX:
                        realmSet$annualFeeBasicAmount.g(this.b[i], (List) realmGet$jobSector.f(t, (long) (e & 1048575)), setemergencycontactofficeext, false);
                        break;
                    case 34:
                        realmSet$annualFeeBasicAmount.e(this.b[i], (List) realmGet$jobSector.f(t, (long) (e & 1048575)), setemergencycontactofficeext, false);
                        break;
                    case setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.dD:
                        realmSet$annualFeeBasicAmount.b(this.b[i], (List<Double>) ((List) realmGet$jobSector.f(t, (long) (e & 1048575))), setemergencycontactofficeext, true);
                        break;
                    case setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.dB:
                        realmSet$annualFeeBasicAmount.c(this.b[i], (List<Float>) ((List) realmGet$jobSector.f(t, (long) (e & 1048575))), setemergencycontactofficeext, true);
                        break;
                    case setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.dF:
                        realmSet$annualFeeBasicAmount.a(this.b[i], (List<Long>) ((List) realmGet$jobSector.f(t, (long) (e & 1048575))), setemergencycontactofficeext, true);
                        break;
                    case setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.dC:
                        realmSet$annualFeeBasicAmount.d(this.b[i], (List) realmGet$jobSector.f(t, (long) (e & 1048575)), setemergencycontactofficeext, true);
                        break;
                    case 39:
                        realmSet$annualFeeBasicAmount.j(this.b[i], (List) realmGet$jobSector.f(t, (long) (e & 1048575)), setemergencycontactofficeext, true);
                        break;
                    case 40:
                        realmSet$annualFeeBasicAmount.h(this.b[i], (List) realmGet$jobSector.f(t, (long) (e & 1048575)), setemergencycontactofficeext, true);
                        break;
                    case 41:
                        realmSet$annualFeeBasicAmount.m(this.b[i], (List) realmGet$jobSector.f(t, (long) (e & 1048575)), setemergencycontactofficeext, true);
                        break;
                    case 42:
                        realmSet$annualFeeBasicAmount.o(this.b[i], (List) realmGet$jobSector.f(t, (long) (e & 1048575)), setemergencycontactofficeext, true);
                        break;
                    case 43:
                        realmSet$annualFeeBasicAmount.i(this.b[i], (List) realmGet$jobSector.f(t, (long) (e & 1048575)), setemergencycontactofficeext, true);
                        break;
                    case 44:
                        realmSet$annualFeeBasicAmount.n(this.b[i], (List) realmGet$jobSector.f(t, (long) (e & 1048575)), setemergencycontactofficeext, true);
                        break;
                    case 45:
                        realmSet$annualFeeBasicAmount.k(this.b[i], (List) realmGet$jobSector.f(t, (long) (e & 1048575)), setemergencycontactofficeext, true);
                        break;
                    case 46:
                        realmSet$annualFeeBasicAmount.f(this.b[i], (List) realmGet$jobSector.f(t, (long) (e & 1048575)), setemergencycontactofficeext, true);
                        break;
                    case 47:
                        realmSet$annualFeeBasicAmount.g(this.b[i], (List) realmGet$jobSector.f(t, (long) (e & 1048575)), setemergencycontactofficeext, true);
                        break;
                    case 48:
                        realmSet$annualFeeBasicAmount.e(this.b[i], (List) realmGet$jobSector.f(t, (long) (e & 1048575)), setemergencycontactofficeext, true);
                        break;
                    case 49:
                        realmSet$annualFeeBasicAmount.c(this.b[i], (List) realmGet$jobSector.f(t, (long) (e & 1048575)), setemergencycontactofficeext, b(i));
                        break;
                    case 50:
                        b(setemergencycontactofficeext, i2, realmGet$jobSector.f(t, (long) (e & 1048575)), i);
                        break;
                    case 51:
                        if (d((realmGet$cardName<T>) t, i2, i)) {
                            setemergencycontactofficeext.a(i2, e(t, (long) (e & 1048575)));
                            break;
                        } else {
                            break;
                        }
                    case setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.S:
                        if (d((realmGet$cardName<T>) t, i2, i)) {
                            setemergencycontactofficeext.a(i2, b(t, (long) (e & 1048575)));
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (d((realmGet$cardName<T>) t, i2, i)) {
                            setemergencycontactofficeext.a(i2, d(t, (long) (e & 1048575)));
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (d((realmGet$cardName<T>) t, i2, i)) {
                            setemergencycontactofficeext.d(i2, d(t, (long) (e & 1048575)));
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (d((realmGet$cardName<T>) t, i2, i)) {
                            setemergencycontactofficeext.d(i2, a(t, (long) (e & 1048575)));
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (d((realmGet$cardName<T>) t, i2, i)) {
                            setemergencycontactofficeext.c(i2, d(t, (long) (e & 1048575)));
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (d((realmGet$cardName<T>) t, i2, i)) {
                            setemergencycontactofficeext.a(i2, a(t, (long) (e & 1048575)));
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (d((realmGet$cardName<T>) t, i2, i)) {
                            setemergencycontactofficeext.b(i2, c(t, (long) (e & 1048575)));
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (d((realmGet$cardName<T>) t, i2, i)) {
                            a(i2, realmGet$jobSector.f(t, (long) (e & 1048575)), setemergencycontactofficeext);
                            break;
                        } else {
                            break;
                        }
                    case 60:
                        if (d((realmGet$cardName<T>) t, i2, i)) {
                            setemergencycontactofficeext.c(i2, realmGet$jobSector.f(t, (long) (e & 1048575)), b(i));
                            break;
                        } else {
                            break;
                        }
                    case 61:
                        if (d((realmGet$cardName<T>) t, i2, i)) {
                            setemergencycontactofficeext.a(i2, (setCurrOfficePostCode) realmGet$jobSector.f(t, (long) (e & 1048575)));
                            break;
                        } else {
                            break;
                        }
                    case 62:
                        if (d((realmGet$cardName<T>) t, i2, i)) {
                            setemergencycontactofficeext.e(i2, a(t, (long) (e & 1048575)));
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (d((realmGet$cardName<T>) t, i2, i)) {
                            setemergencycontactofficeext.c(i2, a(t, (long) (e & 1048575)));
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (d((realmGet$cardName<T>) t, i2, i)) {
                            setemergencycontactofficeext.b(i2, a(t, (long) (e & 1048575)));
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (d((realmGet$cardName<T>) t, i2, i)) {
                            setemergencycontactofficeext.e(i2, d(t, (long) (e & 1048575)));
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (d((realmGet$cardName<T>) t, i2, i)) {
                            setemergencycontactofficeext.g(i2, a(t, (long) (e & 1048575)));
                            break;
                        } else {
                            break;
                        }
                    case 67:
                        if (d((realmGet$cardName<T>) t, i2, i)) {
                            setemergencycontactofficeext.b(i2, d(t, (long) (e & 1048575)));
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (d((realmGet$cardName<T>) t, i2, i)) {
                            setemergencycontactofficeext.b(i2, realmGet$jobSector.f(t, (long) (e & 1048575)), b(i));
                            break;
                        } else {
                            break;
                        }
                }
            }
            realmSet$incomeDisplayAmount<?, ?> realmset_incomedisplayamount = this.l;
            realmset_incomedisplayamount.c((realmSet$incomeDisplayAmount<?, ?>) realmset_incomedisplayamount.a(t), setemergencycontactofficeext);
        } else {
            this.k.a(t);
            throw null;
        }
    }

    @Override // o.realmSet$annualFeeBasicDisplayAmount
    public final int c(T t) {
        return this.h ? f(t) : h(t);
    }

    @Override // o.realmSet$annualFeeBasicDisplayAmount
    public final void c(T t, byte[] bArr, int i, int i2, setCreditCardSupplements setcreditcardsupplements) throws IOException {
        if (this.h) {
            e(t, bArr, i, i2, setcreditcardsupplements);
        } else {
            e(t, bArr, i, i2, 0, setcreditcardsupplements);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.realmSet$annualFeeBasicDisplayAmount
    public final boolean d(T t) {
        int i = 1048575;
        int i2 = 0;
        for (int i3 = 0; i3 < this.f178o; i3++) {
            int i4 = this.f[i3];
            int i5 = this.b[i4];
            int e = e(i4);
            int i6 = this.b[i4 + 2];
            int i7 = i6 & 1048575;
            int i8 = 1 << (i6 >>> 20);
            if (i7 != i) {
                if (i7 != 1048575) {
                    i2 = c.getInt(t, (long) i7);
                }
                i = i7;
            }
            if (!((268435456 & e) == 0 || d(t, i4, i, i2, i8))) {
                return false;
            }
            int a2 = a(e);
            if (a2 != 9 && a2 != 17) {
                if (a2 != 27) {
                    if (a2 == 60 || a2 == 68) {
                        if (d((realmGet$cardName<T>) t, i5, i4) && !e(t, e, b(i4))) {
                            return false;
                        }
                    } else if (a2 != 49) {
                        if (a2 == 50 && !((realmGet$annualFeeAddOnAmount) realmGet$jobSector.f(t, (long) (e & 1048575))).isEmpty()) {
                            CreditCardOptions creditCardOptions = (CreditCardOptions) j(i4);
                            throw null;
                        }
                    }
                }
                List list = (List) realmGet$jobSector.f(t, (long) (e & 1048575));
                if (!list.isEmpty()) {
                    realmSet$annualFeeBasicDisplayAmount b = b(i4);
                    for (int i9 = 0; i9 < list.size(); i9++) {
                        if (!b.d(list.get(i9))) {
                            return false;
                        }
                    }
                    continue;
                } else {
                    continue;
                }
            } else if (d(t, i4, i, i2, i8) && !e(t, e, b(i4))) {
                return false;
            }
        }
        if (!this.j) {
            return true;
        }
        this.k.a(t);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:144:0x06ec, code lost:
        if (r32 == 1048575) goto L_0x06fa;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x06ef, code lost:
        r0.putInt(r18, (long) r32, r31);
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x06fa, code lost:
        r21 = r17.f178o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0706, code lost:
        if (r21 >= r17.m) goto L_0x0754;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0709, code lost:
        r0 = r17.f[r21];
        r0 = r17.b[r0];
        r0 = o.realmGet$jobSector.f(r18, (long) (r17.e(r0) & 1048575));
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x072d, code lost:
        if (r0 != null) goto L_0x0733;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0739, code lost:
        if (r17.i(r0) != null) goto L_0x0742;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x073c, code lost:
        r21 = r21 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0742, code lost:
        r0 = (o.realmGet$annualFeeAddOnAmount) r0;
        r0 = (o.CreditCardOptions) r17.j(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0753, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0756, code lost:
        if (r26 != 0) goto L_0x0766;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x075c, code lost:
        if (r19 != r20) goto L_0x0762;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0765, code lost:
        throw com.google.android.gms.internal.measurement.zzkn.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0769, code lost:
        if (r19 > r20) goto L_0x0775;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0770, code lost:
        if (r30 != r26) goto L_0x0775;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0774, code lost:
        return r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0778, code lost:
        throw com.google.android.gms.internal.measurement.zzkn.b();
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final int e(T r17, byte[] r18, int r19, int r20, int r21, o.setCreditCardSupplements r22) throws java.io.IOException {
        /*
        // Method dump skipped, instructions count: 1913
        */
        throw new UnsupportedOperationException("Method not decompiled: o.realmGet$cardName.e(java.lang.Object, byte[], int, int, int, o.setCreditCardSupplements):int");
    }

    @Override // o.realmSet$annualFeeBasicDisplayAmount
    public final T e() {
        return (T) ((setHmKecamatan) this.g).e(4, null, null);
    }

    @Override // o.realmSet$annualFeeBasicDisplayAmount
    public final void e(T t, T t2) {
        t2.getClass();
        for (int i = 0; i < this.b.length; i += 3) {
            int e = e(i);
            long j = (long) (1048575 & e);
            int i2 = this.b[i];
            switch (a(e)) {
                case 0:
                    if (e((realmGet$cardName<T>) t2, i)) {
                        realmGet$jobSector.c(t, j, realmGet$jobSector.d(t2, j));
                        b((realmGet$cardName<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (e((realmGet$cardName<T>) t2, i)) {
                        realmGet$jobSector.d(t, j, realmGet$jobSector.a(t2, j));
                        b((realmGet$cardName<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (e((realmGet$cardName<T>) t2, i)) {
                        realmGet$jobSector.b(t, j, realmGet$jobSector.e(t2, j));
                        b((realmGet$cardName<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (e((realmGet$cardName<T>) t2, i)) {
                        realmGet$jobSector.b(t, j, realmGet$jobSector.e(t2, j));
                        b((realmGet$cardName<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (e((realmGet$cardName<T>) t2, i)) {
                        realmGet$jobSector.e(t, j, realmGet$jobSector.c(t2, j));
                        b((realmGet$cardName<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (e((realmGet$cardName<T>) t2, i)) {
                        realmGet$jobSector.b(t, j, realmGet$jobSector.e(t2, j));
                        b((realmGet$cardName<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (e((realmGet$cardName<T>) t2, i)) {
                        realmGet$jobSector.e(t, j, realmGet$jobSector.c(t2, j));
                        b((realmGet$cardName<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (e((realmGet$cardName<T>) t2, i)) {
                        realmGet$jobSector.d(t, j, realmGet$jobSector.b(t2, j));
                        b((realmGet$cardName<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (e((realmGet$cardName<T>) t2, i)) {
                        realmGet$jobSector.e(t, j, realmGet$jobSector.f(t2, j));
                        b((realmGet$cardName<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    b(t, t2, i);
                    break;
                case 10:
                    if (e((realmGet$cardName<T>) t2, i)) {
                        realmGet$jobSector.e(t, j, realmGet$jobSector.f(t2, j));
                        b((realmGet$cardName<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (e((realmGet$cardName<T>) t2, i)) {
                        realmGet$jobSector.e(t, j, realmGet$jobSector.c(t2, j));
                        b((realmGet$cardName<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (e((realmGet$cardName<T>) t2, i)) {
                        realmGet$jobSector.e(t, j, realmGet$jobSector.c(t2, j));
                        b((realmGet$cardName<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (e((realmGet$cardName<T>) t2, i)) {
                        realmGet$jobSector.e(t, j, realmGet$jobSector.c(t2, j));
                        b((realmGet$cardName<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (e((realmGet$cardName<T>) t2, i)) {
                        realmGet$jobSector.b(t, j, realmGet$jobSector.e(t2, j));
                        b((realmGet$cardName<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (e((realmGet$cardName<T>) t2, i)) {
                        realmGet$jobSector.e(t, j, realmGet$jobSector.c(t2, j));
                        b((realmGet$cardName<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (e((realmGet$cardName<T>) t2, i)) {
                        realmGet$jobSector.b(t, j, realmGet$jobSector.e(t2, j));
                        b((realmGet$cardName<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    b(t, t2, i);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.bv:
                case 32:
                case Framer.ENTER_FRAME_PREFIX:
                case 34:
                case setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.dD:
                case setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.dB:
                case setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.dF:
                case setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.dC:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.n.b(t, t2, j);
                    break;
                case 50:
                    realmSet$annualFeeBasicAmount.a(this.t, t, t2, j);
                    break;
                case 51:
                case setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.S:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (d((realmGet$cardName<T>) t2, i2, i)) {
                        realmGet$jobSector.e(t, j, realmGet$jobSector.f(t2, j));
                        b((realmGet$cardName<T>) t, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    d(t, t2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (d((realmGet$cardName<T>) t2, i2, i)) {
                        realmGet$jobSector.e(t, j, realmGet$jobSector.f(t2, j));
                        b((realmGet$cardName<T>) t, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    d(t, t2, i);
                    break;
            }
        }
        realmSet$annualFeeBasicAmount.b(this.l, t, t2);
        if (this.j) {
            realmSet$annualFeeBasicAmount.e(this.k, t, t2);
        }
    }
}
