package o;

import android.text.TextUtils;
import android.util.Log;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
/* loaded from: classes2-dex2jar.jar:o/setIsInputAtmPemrek.class */
public final class setIsInputAtmPemrek extends realmSet$RepresentativeRelationship {
    private String a;
    private char d = (char) 0;
    private long b = -1;
    private final setCodeCurrencyTeller c = new setCodeCurrencyTeller(this, 6, false, false);
    private final setCodeCurrencyTeller e = new setCodeCurrencyTeller(this, 6, true, false);
    private final setCodeCurrencyTeller j = new setCodeCurrencyTeller(this, 6, false, true);
    private final setCodeCurrencyTeller f = new setCodeCurrencyTeller(this, 5, false, false);
    private final setCodeCurrencyTeller i = new setCodeCurrencyTeller(this, 5, true, false);
    private final setCodeCurrencyTeller h = new setCodeCurrencyTeller(this, 5, false, true);
    private final setCodeCurrencyTeller g = new setCodeCurrencyTeller(this, 4, false, false);
    private final setCodeCurrencyTeller n = new setCodeCurrencyTeller(this, 3, false, false);

    /* renamed from: o */
    private final setCodeCurrencyTeller f93o = new setCodeCurrencyTeller(this, 2, false, false);

    public setIsInputAtmPemrek(realmGet$TxnPurpose realmget_txnpurpose) {
        super(realmget_txnpurpose);
    }

    public static Object d(String str) {
        if (str == null) {
            return null;
        }
        return new setHasDone(str);
    }

    private static String e(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf(46);
        return lastIndexOf == -1 ? str : str.substring(0, lastIndexOf);
    }

    static String e(boolean z, Object obj) {
        String className;
        String str = "";
        if (obj == null) {
            return "";
        }
        Object obj2 = obj;
        if (obj instanceof Integer) {
            obj2 = Long.valueOf((long) ((Integer) obj).intValue());
        }
        int i = 0;
        if (obj2 instanceof Long) {
            if (!z) {
                return String.valueOf(obj2);
            }
            Long l = (Long) obj2;
            if (Math.abs(l.longValue()) < 100) {
                return String.valueOf(obj2);
            }
            if (String.valueOf(obj2).charAt(0) == '-') {
                str = "-";
            }
            String valueOf = String.valueOf(Math.abs(l.longValue()));
            long round = Math.round(Math.pow(10.0d, (double) (valueOf.length() - 1)));
            long round2 = Math.round(Math.pow(10.0d, (double) valueOf.length()) - 1.0d);
            StringBuilder sb = new StringBuilder(str.length() + 43 + str.length());
            sb.append(str);
            sb.append(round);
            sb.append("...");
            sb.append(str);
            sb.append(round2);
            return sb.toString();
        } else if (obj2 instanceof Boolean) {
            return String.valueOf(obj2);
        } else {
            if (!(obj2 instanceof Throwable)) {
                return obj2 instanceof setHasDone ? ((setHasDone) obj2).b : z ? "-" : String.valueOf(obj2);
            }
            Throwable th = (Throwable) obj2;
            StringBuilder sb2 = new StringBuilder(z ? th.getClass().getName() : th.toString());
            String e = e(realmGet$TxnPurpose.class.getCanonicalName());
            StackTraceElement[] stackTrace = th.getStackTrace();
            int length = stackTrace.length;
            while (true) {
                if (i >= length) {
                    break;
                }
                StackTraceElement stackTraceElement = stackTrace[i];
                if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && e(className).equals(e)) {
                    sb2.append(": ");
                    sb2.append(stackTraceElement);
                    break;
                }
                i++;
            }
            return sb2.toString();
        }
    }

    public static String e(boolean z, String str, Object obj, Object obj2, Object obj3) {
        String str2 = "";
        String str3 = str;
        if (str == null) {
            str3 = "";
        }
        String e = e(z, obj);
        String e2 = e(z, obj2);
        String e3 = e(z, obj3);
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str3)) {
            sb.append(str3);
            str2 = ": ";
        }
        String str4 = ", ";
        String str5 = str2;
        if (!TextUtils.isEmpty(e)) {
            sb.append(str2);
            sb.append(e);
            str5 = ", ";
        }
        if (!TextUtils.isEmpty(e2)) {
            sb.append(str5);
            sb.append(e2);
        } else {
            str4 = str5;
        }
        if (!TextUtils.isEmpty(e3)) {
            sb.append(str4);
            sb.append(e3);
        }
        return sb.toString();
    }

    public final setCodeCurrencyTeller a() {
        return this.j;
    }

    public final setCodeCurrencyTeller b() {
        return this.c;
    }

    public final setCodeCurrencyTeller c() {
        return this.f;
    }

    public final setCodeCurrencyTeller d() {
        return this.e;
    }

    public final void d(int i, boolean z, boolean z2, String str, Object obj, Object obj2, Object obj3) {
        if (!z && Log.isLoggable(m(), i)) {
            Log.println(i, m(), e(false, str, obj, obj2, obj3));
        }
        if (!z2 && i >= 5) {
            setFotoKtp.b(str);
            realmGet$SenderIdType y = this.q.y();
            if (y == null) {
                Log.println(6, m(), "Scheduler not set. Not logging error/warn");
            } else if (!y.p()) {
                Log.println(6, m(), "Scheduler not initialized. Not logging error/warn");
            } else {
                if (i >= 9) {
                    i = 8;
                }
                y.b(new Runnable(i, str, obj, obj2, obj3) { // from class: o.realmSet$systemAppId
                    final /* synthetic */ int a;
                    final /* synthetic */ Object b;
                    final /* synthetic */ String c;
                    final /* synthetic */ Object d;
                    final /* synthetic */ Object e;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.a = r5;
                        this.c = r6;
                        this.e = r7;
                        this.d = r8;
                        this.b = r9;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        realmGet$FlagRepresentativeTransaction q = setIsInputAtmPemrek.this.q.q();
                        if (q.p()) {
                            if (setIsInputAtmPemrek.this.d == 0) {
                                if (setIsInputAtmPemrek.this.q.t().h()) {
                                    setIsInputAtmPemrek setisinputatmpemrek = setIsInputAtmPemrek.this;
                                    setisinputatmpemrek.q.n_();
                                    setisinputatmpemrek.d = 'C';
                                } else {
                                    setIsInputAtmPemrek setisinputatmpemrek2 = setIsInputAtmPemrek.this;
                                    setisinputatmpemrek2.q.n_();
                                    setisinputatmpemrek2.d = 'c';
                                }
                            }
                            if (setIsInputAtmPemrek.this.b < 0) {
                                setIsInputAtmPemrek setisinputatmpemrek3 = setIsInputAtmPemrek.this;
                                setisinputatmpemrek3.q.t().e();
                                setisinputatmpemrek3.b = 42004;
                            }
                            char charAt = "01VDIWEA?".charAt(this.a);
                            char c = setIsInputAtmPemrek.this.d;
                            long j = setIsInputAtmPemrek.this.b;
                            String e = setIsInputAtmPemrek.e(true, this.c, this.e, this.d, this.b);
                            StringBuilder sb = new StringBuilder(String.valueOf(e).length() + 24);
                            sb.append("2");
                            sb.append(charAt);
                            sb.append(c);
                            sb.append(j);
                            sb.append(":");
                            sb.append(e);
                            String sb2 = sb.toString();
                            String str2 = sb2;
                            if (sb2.length() > 1024) {
                                str2 = this.c.substring(0, 1024);
                            }
                            setTypeTransksi settypetransksi = q.d;
                            if (settypetransksi != null) {
                                settypetransksi.d(str2, 1);
                                return;
                            }
                            return;
                        }
                        Log.println(6, setIsInputAtmPemrek.this.m(), "Persisted config not initialized. Not logging error/warn");
                    }
                });
            }
        }
    }

    @Override // o.realmSet$RepresentativeRelationship
    protected final boolean e() {
        return false;
    }

    public final setCodeCurrencyTeller f() {
        return this.h;
    }

    public final setCodeCurrencyTeller g() {
        return this.g;
    }

    public final setCodeCurrencyTeller h() {
        return this.n;
    }

    public final setCodeCurrencyTeller i() {
        return this.f93o;
    }

    public final setCodeCurrencyTeller j() {
        return this.i;
    }

    @EnsuresNonNull({"logTagDoNotUseDirectly"})
    public final String m() {
        String str;
        synchronized (this) {
            if (this.a == null) {
                if (this.q.A() != null) {
                    this.a = this.q.A();
                } else {
                    this.a = this.q.t().a();
                }
            }
            setFotoKtp.b(this.a);
            str = this.a;
        }
        return str;
    }
}
