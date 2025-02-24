package o;

import io.realm.internal.Property;
import java.util.List;
/* loaded from: classes-dex2jar.jar:o/realmSet$bcaAccountNumber.class */
public final class realmSet$bcaAccountNumber extends setHmKecamatan<realmSet$bcaAccountNumber, realmSet$birthDate> {
    public static final /* synthetic */ int zza;
    private static final realmSet$bcaAccountNumber zzaa;
    private long zzB;
    private int zzC;
    private boolean zzF;
    private int zzI;
    private int zzJ;
    private int zzK;
    private long zzM;
    private long zzN;
    private int zzQ;
    private realmSet$currCompanyName zzS;
    private long zzU;
    private long zzV;
    private int zzY;
    private boolean zzZ;
    private int zze;
    private int zzf;
    private int zzg;
    private long zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private int zzs;
    private long zzw;
    private long zzx;
    private boolean zzz;
    private setMonthlyIncome<realmGet$selectedCardOptions> zzh = aq();
    private setMonthlyIncome<realmSet$currOfficeCity> zzi = aq();
    private String zzo = "";
    private String zzp = "";
    private String zzq = "";
    private String zzr = "";
    private String zzt = "";
    private String zzu = "";
    private String zzv = "";
    private String zzy = "";
    private String zzA = "";
    private String zzD = "";
    private String zzE = "";
    private setMonthlyIncome<realmGet$referenceBranchCode> zzG = aq();
    private String zzH = "";
    private String zzL = "";
    private String zzO = "";
    private String zzP = "";
    private String zzR = "";
    private setIdentityCardImg zzT = ai();
    private String zzW = "";
    private String zzX = "";

    static {
        realmSet$bcaAccountNumber realmset_bcaaccountnumber = new realmSet$bcaAccountNumber();
        zzaa = realmset_bcaaccountnumber;
        setHmKecamatan.a(realmSet$bcaAccountNumber.class, realmset_bcaaccountnumber);
    }

    private realmSet$bcaAccountNumber() {
    }

    public static /* synthetic */ void a(realmSet$bcaAccountNumber realmset_bcaaccountnumber) {
        realmset_bcaaccountnumber.zze &= -2097153;
        realmset_bcaaccountnumber.zzD = zzaa.zzD;
    }

    public static /* synthetic */ void a(realmSet$bcaAccountNumber realmset_bcaaccountnumber, int i) {
        realmset_bcaaccountnumber.zze |= 1048576;
        realmset_bcaaccountnumber.zzC = i;
    }

    public static /* synthetic */ void a(realmSet$bcaAccountNumber realmset_bcaaccountnumber, long j) {
        realmset_bcaaccountnumber.zze |= 32;
        realmset_bcaaccountnumber.zzn = j;
    }

    public static /* synthetic */ void a(realmSet$bcaAccountNumber realmset_bcaaccountnumber, Iterable iterable) {
        setIdentityCardImg setidentitycardimg = realmset_bcaaccountnumber.zzT;
        if (!setidentitycardimg.c()) {
            int size = setidentitycardimg.size();
            realmset_bcaaccountnumber.zzT = setidentitycardimg.c(size == 0 ? 10 : size + size);
        }
        setBcaDebitCardType.a(iterable, realmset_bcaaccountnumber.zzT);
    }

    public static /* synthetic */ void a(realmSet$bcaAccountNumber realmset_bcaaccountnumber, String str) {
        str.getClass();
        realmset_bcaaccountnumber.zze |= Property.TYPE_DICTIONARY;
        realmset_bcaaccountnumber.zzr = str;
    }

    public static /* synthetic */ void a(realmSet$bcaAccountNumber realmset_bcaaccountnumber, realmSet$currOfficeCity realmset_currofficecity) {
        realmset_currofficecity.getClass();
        realmset_bcaaccountnumber.av();
        realmset_bcaaccountnumber.zzi.add(realmset_currofficecity);
    }

    public static /* synthetic */ void a(realmSet$bcaAccountNumber realmset_bcaaccountnumber, boolean z) {
        realmset_bcaaccountnumber.zze |= 131072;
        realmset_bcaaccountnumber.zzz = z;
    }

    private final void as() {
        setMonthlyIncome<realmGet$selectedCardOptions> setmonthlyincome = this.zzh;
        if (!setmonthlyincome.c()) {
            this.zzh = setHmKecamatan.d(setmonthlyincome);
        }
    }

    private final void av() {
        setMonthlyIncome<realmSet$currOfficeCity> setmonthlyincome = this.zzi;
        if (!setmonthlyincome.c()) {
            this.zzi = setHmKecamatan.d(setmonthlyincome);
        }
    }

    public static /* synthetic */ void b(realmSet$bcaAccountNumber realmset_bcaaccountnumber) {
        realmset_bcaaccountnumber.zze &= -65537;
        realmset_bcaaccountnumber.zzy = zzaa.zzy;
    }

    public static /* synthetic */ void b(realmSet$bcaAccountNumber realmset_bcaaccountnumber, int i) {
        realmset_bcaaccountnumber.av();
        realmset_bcaaccountnumber.zzi.remove(i);
    }

    public static /* synthetic */ void b(realmSet$bcaAccountNumber realmset_bcaaccountnumber, int i, realmSet$currOfficeCity realmset_currofficecity) {
        realmset_currofficecity.getClass();
        realmset_bcaaccountnumber.av();
        realmset_bcaaccountnumber.zzi.set(i, realmset_currofficecity);
    }

    public static /* synthetic */ void b(realmSet$bcaAccountNumber realmset_bcaaccountnumber, long j) {
        realmset_bcaaccountnumber.zze |= 16384;
        realmset_bcaaccountnumber.zzw = j;
    }

    public static /* synthetic */ void b(realmSet$bcaAccountNumber realmset_bcaaccountnumber, String str) {
        str.getClass();
        realmset_bcaaccountnumber.zze |= Property.TYPE_ARRAY;
        realmset_bcaaccountnumber.zzp = str;
    }

    public static /* synthetic */ void c(realmSet$bcaAccountNumber realmset_bcaaccountnumber) {
        realmset_bcaaccountnumber.zze &= -33;
        realmset_bcaaccountnumber.zzn = 0;
    }

    public static /* synthetic */ void c(realmSet$bcaAccountNumber realmset_bcaaccountnumber, int i) {
        realmset_bcaaccountnumber.zze |= 1;
        realmset_bcaaccountnumber.zzg = 1;
    }

    public static /* synthetic */ void c(realmSet$bcaAccountNumber realmset_bcaaccountnumber, int i, realmGet$selectedCardOptions realmget_selectedcardoptions) {
        realmget_selectedcardoptions.getClass();
        realmset_bcaaccountnumber.as();
        realmset_bcaaccountnumber.zzh.set(i, realmget_selectedcardoptions);
    }

    public static /* synthetic */ void c(realmSet$bcaAccountNumber realmset_bcaaccountnumber, long j) {
        realmset_bcaaccountnumber.zze |= 32768;
        realmset_bcaaccountnumber.zzx = 42004;
    }

    public static /* synthetic */ void c(realmSet$bcaAccountNumber realmset_bcaaccountnumber, Iterable iterable) {
        realmset_bcaaccountnumber.as();
        setBcaDebitCardType.a(iterable, realmset_bcaaccountnumber.zzh);
    }

    public static /* synthetic */ void c(realmSet$bcaAccountNumber realmset_bcaaccountnumber, String str) {
        str.getClass();
        realmset_bcaaccountnumber.zze |= 2048;
        realmset_bcaaccountnumber.zzt = str;
    }

    public static /* synthetic */ void d(realmSet$bcaAccountNumber realmset_bcaaccountnumber) {
        realmset_bcaaccountnumber.zze &= -131073;
        realmset_bcaaccountnumber.zzz = false;
    }

    public static /* synthetic */ void d(realmSet$bcaAccountNumber realmset_bcaaccountnumber, int i) {
        realmset_bcaaccountnumber.zze |= 1024;
        realmset_bcaaccountnumber.zzs = i;
    }

    public static /* synthetic */ void d(realmSet$bcaAccountNumber realmset_bcaaccountnumber, long j) {
        realmset_bcaaccountnumber.zze |= 524288;
        realmset_bcaaccountnumber.zzB = j;
    }

    public static /* synthetic */ void d(realmSet$bcaAccountNumber realmset_bcaaccountnumber, Iterable iterable) {
        realmset_bcaaccountnumber.av();
        setBcaDebitCardType.a(iterable, realmset_bcaaccountnumber.zzi);
    }

    public static /* synthetic */ void d(realmSet$bcaAccountNumber realmset_bcaaccountnumber, String str) {
        realmset_bcaaccountnumber.zze |= 64;
        realmset_bcaaccountnumber.zzo = "android";
    }

    public static /* synthetic */ void d(realmSet$bcaAccountNumber realmset_bcaaccountnumber, realmGet$selectedCardOptions realmget_selectedcardoptions) {
        realmget_selectedcardoptions.getClass();
        realmset_bcaaccountnumber.as();
        realmset_bcaaccountnumber.zzh.add(realmget_selectedcardoptions);
    }

    public static /* synthetic */ void d(realmSet$bcaAccountNumber realmset_bcaaccountnumber, realmSet$currCompanyName realmset_currcompanyname) {
        realmset_currcompanyname.getClass();
        realmset_bcaaccountnumber.zzS = realmset_currcompanyname;
        realmset_bcaaccountnumber.zzf |= 8;
    }

    public static /* synthetic */ void d(realmSet$bcaAccountNumber realmset_bcaaccountnumber, boolean z) {
        realmset_bcaaccountnumber.zze |= 8388608;
        realmset_bcaaccountnumber.zzF = z;
    }

    public static realmSet$birthDate e() {
        return zzaa.ar();
    }

    public static /* synthetic */ void e(realmSet$bcaAccountNumber realmset_bcaaccountnumber) {
        realmset_bcaaccountnumber.zze &= -262145;
        realmset_bcaaccountnumber.zzA = zzaa.zzA;
    }

    public static /* synthetic */ void e(realmSet$bcaAccountNumber realmset_bcaaccountnumber, int i) {
        realmset_bcaaccountnumber.as();
        realmset_bcaaccountnumber.zzh.remove(i);
    }

    public static /* synthetic */ void e(realmSet$bcaAccountNumber realmset_bcaaccountnumber, long j) {
        realmset_bcaaccountnumber.zze |= 2;
        realmset_bcaaccountnumber.zzj = j;
    }

    public static /* synthetic */ void e(realmSet$bcaAccountNumber realmset_bcaaccountnumber, Iterable iterable) {
        setMonthlyIncome<realmGet$referenceBranchCode> setmonthlyincome = realmset_bcaaccountnumber.zzG;
        if (!setmonthlyincome.c()) {
            realmset_bcaaccountnumber.zzG = setHmKecamatan.d(setmonthlyincome);
        }
        setBcaDebitCardType.a(iterable, realmset_bcaaccountnumber.zzG);
    }

    public static /* synthetic */ void e(realmSet$bcaAccountNumber realmset_bcaaccountnumber, String str) {
        str.getClass();
        realmset_bcaaccountnumber.zze |= Property.TYPE_SET;
        realmset_bcaaccountnumber.zzq = str;
    }

    public static /* synthetic */ void f(realmSet$bcaAccountNumber realmset_bcaaccountnumber) {
        realmset_bcaaccountnumber.zze &= Integer.MAX_VALUE;
        realmset_bcaaccountnumber.zzO = zzaa.zzO;
    }

    public static /* synthetic */ void f(realmSet$bcaAccountNumber realmset_bcaaccountnumber, long j) {
        realmset_bcaaccountnumber.zze |= 16;
        realmset_bcaaccountnumber.zzm = j;
    }

    public static /* synthetic */ void f(realmSet$bcaAccountNumber realmset_bcaaccountnumber, String str) {
        str.getClass();
        realmset_bcaaccountnumber.zze |= 65536;
        realmset_bcaaccountnumber.zzy = str;
    }

    public static /* synthetic */ void g(realmSet$bcaAccountNumber realmset_bcaaccountnumber, int i) {
        realmset_bcaaccountnumber.zze |= 33554432;
        realmset_bcaaccountnumber.zzI = i;
    }

    public static /* synthetic */ void g(realmSet$bcaAccountNumber realmset_bcaaccountnumber, long j) {
        realmset_bcaaccountnumber.zze |= 536870912;
        realmset_bcaaccountnumber.zzM = j;
    }

    public static /* synthetic */ void g(realmSet$bcaAccountNumber realmset_bcaaccountnumber, String str) {
        realmset_bcaaccountnumber.zze |= 2097152;
        realmset_bcaaccountnumber.zzD = str;
    }

    public static /* synthetic */ void h(realmSet$bcaAccountNumber realmset_bcaaccountnumber, long j) {
        realmset_bcaaccountnumber.zze |= 1073741824;
        realmset_bcaaccountnumber.zzN = j;
    }

    public static /* synthetic */ void h(realmSet$bcaAccountNumber realmset_bcaaccountnumber, String str) {
        str.getClass();
        realmset_bcaaccountnumber.zze |= 8192;
        realmset_bcaaccountnumber.zzv = str;
    }

    public static /* synthetic */ void i(realmSet$bcaAccountNumber realmset_bcaaccountnumber) {
        realmset_bcaaccountnumber.zze &= -268435457;
        realmset_bcaaccountnumber.zzL = zzaa.zzL;
    }

    public static /* synthetic */ void i(realmSet$bcaAccountNumber realmset_bcaaccountnumber, int i) {
        realmset_bcaaccountnumber.zzf |= 2;
        realmset_bcaaccountnumber.zzQ = i;
    }

    public static /* synthetic */ void i(realmSet$bcaAccountNumber realmset_bcaaccountnumber, long j) {
        realmset_bcaaccountnumber.zze |= 8;
        realmset_bcaaccountnumber.zzl = j;
    }

    public static /* synthetic */ void i(realmSet$bcaAccountNumber realmset_bcaaccountnumber, String str) {
        str.getClass();
        realmset_bcaaccountnumber.zze |= 262144;
        realmset_bcaaccountnumber.zzA = str;
    }

    public static /* synthetic */ void j(realmSet$bcaAccountNumber realmset_bcaaccountnumber) {
        realmset_bcaaccountnumber.zze &= -17;
        realmset_bcaaccountnumber.zzm = 0;
    }

    public static /* synthetic */ void j(realmSet$bcaAccountNumber realmset_bcaaccountnumber, long j) {
        realmset_bcaaccountnumber.zze |= 4;
        realmset_bcaaccountnumber.zzk = j;
    }

    public static /* synthetic */ void j(realmSet$bcaAccountNumber realmset_bcaaccountnumber, String str) {
        str.getClass();
        realmset_bcaaccountnumber.zze |= 4096;
        realmset_bcaaccountnumber.zzu = str;
    }

    public static /* synthetic */ void k(realmSet$bcaAccountNumber realmset_bcaaccountnumber, String str) {
        str.getClass();
        realmset_bcaaccountnumber.zzf |= 4;
        realmset_bcaaccountnumber.zzR = str;
    }

    public static /* synthetic */ void l(realmSet$bcaAccountNumber realmset_bcaaccountnumber, long j) {
        realmset_bcaaccountnumber.zzf |= 32;
        realmset_bcaaccountnumber.zzV = j;
    }

    public static /* synthetic */ void l(realmSet$bcaAccountNumber realmset_bcaaccountnumber, String str) {
        str.getClass();
        realmset_bcaaccountnumber.zzf |= 64;
        realmset_bcaaccountnumber.zzW = str;
    }

    public static /* synthetic */ void m(realmSet$bcaAccountNumber realmset_bcaaccountnumber, String str) {
        str.getClass();
        realmset_bcaaccountnumber.zze |= 4194304;
        realmset_bcaaccountnumber.zzE = str;
    }

    public static /* synthetic */ void n(realmSet$bcaAccountNumber realmset_bcaaccountnumber, String str) {
        str.getClass();
        realmset_bcaaccountnumber.zzf |= Property.TYPE_ARRAY;
        realmset_bcaaccountnumber.zzX = str;
    }

    public static /* synthetic */ void o(realmSet$bcaAccountNumber realmset_bcaaccountnumber, long j) {
        realmset_bcaaccountnumber.zzf |= 16;
        realmset_bcaaccountnumber.zzU = j;
    }

    public static /* synthetic */ void o(realmSet$bcaAccountNumber realmset_bcaaccountnumber, String str) {
        str.getClass();
        realmset_bcaaccountnumber.zze |= 16777216;
        realmset_bcaaccountnumber.zzH = str;
    }

    public final boolean A() {
        return (this.zze & 1073741824) != 0;
    }

    public final String B() {
        return this.zzO;
    }

    public final long C() {
        return this.zzM;
    }

    public final boolean D() {
        return (this.zze & 1) != 0;
    }

    public final boolean E() {
        return (this.zzf & 2) != 0;
    }

    public final int F() {
        return this.zzQ;
    }

    public final String G() {
        return this.zzR;
    }

    public final boolean H() {
        return (this.zzf & 16) != 0;
    }

    public final long I() {
        return this.zzU;
    }

    public final String J() {
        return this.zzW;
    }

    public final List<realmGet$selectedCardOptions> K() {
        return this.zzh;
    }

    public final int L() {
        return this.zzg;
    }

    public final String M() {
        return this.zzX;
    }

    public final boolean N() {
        return (this.zzf & Property.TYPE_ARRAY) != 0;
    }

    public final List<realmSet$currOfficeCity> O() {
        return this.zzi;
    }

    public final int P() {
        return this.zzh.size();
    }

    public final long Q() {
        return this.zzj;
    }

    public final boolean R() {
        return (this.zze & 2) != 0;
    }

    public final int S() {
        return this.zzi.size();
    }

    public final boolean T() {
        return (this.zze & 8) != 0;
    }

    public final boolean U() {
        return (this.zze & 4) != 0;
    }

    public final long V() {
        return this.zzk;
    }

    public final long W() {
        return this.zzl;
    }

    public final boolean X() {
        return (this.zze & 16) != 0;
    }

    public final String Y() {
        return this.zzo;
    }

    public final long Z() {
        return this.zzn;
    }

    public final String a() {
        return this.zzu;
    }

    public final realmGet$selectedCardOptions a(int i) {
        return this.zzh.get(i);
    }

    public final String aa() {
        return this.zzp;
    }

    public final long ab() {
        return this.zzm;
    }

    public final boolean ac() {
        return (this.zze & 32) != 0;
    }

    public final boolean ad() {
        return (this.zze & 1024) != 0;
    }

    public final String ae() {
        return this.zzt;
    }

    public final String af() {
        return this.zzq;
    }

    public final String ag() {
        return this.zzr;
    }

    public final int ah() {
        return this.zzs;
    }

    public final realmSet$currOfficeCity c(int i) {
        return this.zzi.get(i);
    }

    public final boolean c() {
        return (this.zze & 16384) != 0;
    }

    public final String d() {
        return this.zzv;
    }

    @Override // o.setHmKecamatan
    public final Object e(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return b(zzaa, "\u0001.��\u0002\u00017.��\u0004��\u0001င��\u0002\u001b\u0003\u001b\u0004ဂ\u0001\u0005ဂ\u0002\u0006ဂ\u0003\u0007ဂ\u0005\bဈ\u0006\tဈ\u0007\nဈ\b\u000bဈ\t\fင\n\rဈ\u000b\u000eဈ\f\u0010ဈ\r\u0011ဂ\u000e\u0012ဂ\u000f\u0013ဈ\u0010\u0014ဇ\u0011\u0015ဈ\u0012\u0016ဂ\u0013\u0017င\u0014\u0018ဈ\u0015\u0019ဈ\u0016\u001aဂ\u0004\u001cဇ\u0017\u001d\u001b\u001eဈ\u0018\u001fင\u0019 င\u001a!င\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဈ\u001f&ဈ 'င!)ဈ\",ဉ#-\u001d.ဂ$/ဂ%2ဈ&4ဈ'5ဌ(7ဇ)", new Object[]{"zze", "zzf", "zzg", "zzh", realmGet$selectedCardOptions.class, "zzi", realmSet$currOfficeCity.class, "zzj", "zzk", "zzl", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", "zzE", "zzm", "zzF", "zzG", realmGet$referenceBranchCode.class, "zzH", "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzR", "zzS", "zzT", "zzU", "zzV", "zzW", "zzX", "zzY", realmGet$referenceSalesName.b(), "zzZ"});
        } else if (i2 == 3) {
            return new realmSet$bcaAccountNumber();
        } else {
            if (i2 == 4) {
                return new realmSet$birthDate(null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzaa;
        }
    }

    public final boolean f() {
        return (this.zze & 131072) != 0;
    }

    public final long g() {
        return this.zzx;
    }

    public final long h() {
        return this.zzw;
    }

    public final String i() {
        return this.zzy;
    }

    public final boolean j() {
        return (this.zze & 32768) != 0;
    }

    public final boolean k() {
        return (this.zze & 1048576) != 0;
    }

    public final boolean l() {
        return (this.zze & 524288) != 0;
    }

    public final long m() {
        return this.zzB;
    }

    public final String n() {
        return this.zzA;
    }

    public final boolean o() {
        return this.zzz;
    }

    public final String p() {
        return this.zzD;
    }

    public final int q() {
        return this.zzC;
    }

    public final String r() {
        return this.zzE;
    }

    public final boolean s() {
        return this.zzF;
    }

    public final boolean t() {
        return (this.zze & 8388608) != 0;
    }

    public final int u() {
        return this.zzI;
    }

    public final boolean v() {
        return (this.zze & 536870912) != 0;
    }

    public final boolean w() {
        return (this.zze & 33554432) != 0;
    }

    public final String x() {
        return this.zzH;
    }

    public final List<realmGet$referenceBranchCode> y() {
        return this.zzG;
    }

    public final long z() {
        return this.zzN;
    }
}
