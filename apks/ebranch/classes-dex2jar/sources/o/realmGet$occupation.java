package o;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import android.view.View;
import com.google.android.gms.common.api.Scope;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;
import o.realmGet;
import o.realmGet$name;
import o.realmGet$religionOthers;
@Deprecated
/* loaded from: classes-dex2jar.jar:o/realmGet$occupation.class */
public abstract class realmGet$occupation {
    private static final Set e = Collections.newSetFromMap(new WeakHashMap());

    @Deprecated
    /* loaded from: classes-dex2jar.jar:o/realmGet$occupation$IconCompatParcelizer.class */
    public interface IconCompatParcelizer extends realmGet$resCountry {
    }

    @Deprecated
    /* loaded from: classes-dex2jar.jar:o/realmGet$occupation$RemoteActionCompatParcelizer.class */
    public static final class RemoteActionCompatParcelizer {
        private Account e;
        private String f;
        private View g;
        private String h;
        private int j;
        private read l;
        private realmGet$resHouseStatus m;
        private final Context n;
        private Looper q;
        private final Set c = new HashSet();
        private final Set a = new HashSet();
        private final Map i = new setThumbTextPadding();

        /* renamed from: o */
        private final Map f181o = new setThumbTextPadding();
        private int k = -1;
        private realmGet$jobOthers s = realmGet$jobOthers.a;
        private realmGet$name.IconCompatParcelizer p = realmGet.localClearingCodeBank.c;
        public final ArrayList d = new ArrayList();
        public final ArrayList b = new ArrayList();

        public RemoteActionCompatParcelizer(Context context) {
            this.n = context;
            this.q = context.getMainLooper();
            this.f = context.getPackageName();
            this.h = context.getClass().getName();
        }

        @ResultIgnorabilityUnspecified
        public final realmGet$occupation a() {
            if (!this.f181o.isEmpty()) {
                setNoHandphone setnohandphone = setNoHandphone.b;
                if (this.f181o.containsKey(realmGet.localClearingCodeBank.i)) {
                    setnohandphone = (setNoHandphone) this.f181o.get(realmGet.localClearingCodeBank.i);
                }
                setDob setdob = new setDob(this.e, this.c, this.i, this.j, this.g, this.f, this.h, setnohandphone);
                Map map = setdob.b;
                setThumbTextPadding setthumbtextpadding = new setThumbTextPadding();
                setThumbTextPadding setthumbtextpadding2 = new setThumbTextPadding();
                ArrayList arrayList = new ArrayList();
                realmGet$name realmget_name = null;
                boolean z = false;
                for (realmGet$name realmget_name2 : this.f181o.keySet()) {
                    Object obj = this.f181o.get(realmget_name2);
                    boolean z2 = map.get(realmget_name2) != null;
                    setthumbtextpadding.put(realmget_name2, Boolean.valueOf(z2));
                    realmSet$sex realmset_sex = new realmSet$sex(realmget_name2, z2);
                    arrayList.add(realmset_sex);
                    realmGet$name.IconCompatParcelizer iconCompatParcelizer = realmget_name2.e;
                    if (iconCompatParcelizer != null) {
                        realmGet$name.IconCompatParcelizer iconCompatParcelizer2 = iconCompatParcelizer;
                        realmGet$name$MediaBrowserCompat$SearchResultReceiver a = iconCompatParcelizer2.a(this.n, this.q, setdob, obj, realmset_sex, realmset_sex);
                        setthumbtextpadding2.put(realmget_name2.d, a);
                        boolean z3 = z;
                        if (iconCompatParcelizer2.c() == 1) {
                            z3 = obj != null;
                        }
                        z = z3;
                        if (a.g()) {
                            if (realmget_name == null) {
                                realmget_name = realmget_name2;
                                z = z3;
                            } else {
                                String str = realmget_name2.b;
                                String str2 = realmget_name.b;
                                StringBuilder sb = new StringBuilder();
                                sb.append(str);
                                sb.append(" cannot be used with ");
                                sb.append(str2);
                                throw new IllegalStateException(sb.toString());
                            }
                        }
                    } else {
                        throw new NullPointerException("null reference");
                    }
                }
                if (realmget_name != null) {
                    if (!z) {
                        boolean z4 = this.e == null;
                        String str3 = realmget_name.b;
                        if (z4) {
                            boolean equals = this.c.equals(this.a);
                            String str4 = realmget_name.b;
                            if (!equals) {
                                throw new IllegalStateException(String.format("Must not set scopes in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead.", str4));
                            }
                        } else {
                            throw new IllegalStateException(String.format("Must not set an account in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead", str3));
                        }
                    } else {
                        String str5 = realmget_name.b;
                        StringBuilder sb2 = new StringBuilder("With using ");
                        sb2.append(str5);
                        sb2.append(", GamesOptions can only be specified within GoogleSignInOptions.Builder");
                        throw new IllegalStateException(sb2.toString());
                    }
                }
                realmSet$handPhoneNumber realmset_handphonenumber = new realmSet$handPhoneNumber(this.n, new ReentrantLock(), this.q, setdob, this.s, this.p, setthumbtextpadding, this.d, this.b, setthumbtextpadding2, this.k, realmSet$handPhoneNumber.a(setthumbtextpadding2.values(), true), arrayList);
                synchronized (realmGet$occupation.e) {
                    realmGet$occupation.e.add(realmset_handphonenumber);
                }
                if (this.k >= 0) {
                    realmSet$resAddress.e(this.m).a(this.k, realmset_handphonenumber, this.l);
                }
                return realmset_handphonenumber;
            }
            throw new IllegalArgumentException("must call addApi() to add at least one API");
        }

        public final RemoteActionCompatParcelizer e(realmGet$name<? extends realmGet$motherMaidenName> realmget_name) {
            if (realmget_name != null) {
                this.f181o.put(realmget_name, null);
                realmGet$name.IconCompatParcelizer iconCompatParcelizer = realmget_name.e;
                if (iconCompatParcelizer != null) {
                    List<Scope> b = iconCompatParcelizer.b(null);
                    this.a.addAll(b);
                    this.c.addAll(b);
                    return this;
                }
                throw new NullPointerException("Base client builder must not be null");
            }
            throw new NullPointerException("Api must not be null");
        }
    }

    @Deprecated
    /* loaded from: classes-dex2jar.jar:o/realmGet$occupation$read.class */
    public interface read extends realmGet$resProvince {
    }

    public abstract void a();

    public abstract void a(read read2);

    public abstract void b(read read2);

    @ResultIgnorabilityUnspecified
    public <A extends realmGet$name$MediaBrowserCompat$CustomActionResultReceiver, R extends realmGet$oldCustFlag, T extends realmGet$religionOthers.write<R, A>> T c(T t) {
        throw new UnsupportedOperationException();
    }

    public abstract void c(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public void c(realmSet$officePostCode realmset_officepostcode) {
        throw new UnsupportedOperationException();
    }

    public abstract boolean c();

    public abstract void d();

    public Looper e() {
        throw new UnsupportedOperationException();
    }

    @ResultIgnorabilityUnspecified
    public <A extends realmGet$name$MediaBrowserCompat$CustomActionResultReceiver, T extends realmGet$religionOthers.write<? extends realmGet$oldCustFlag, A>> T e(T t) {
        throw new UnsupportedOperationException();
    }

    public void e(realmSet$officePostCode realmset_officepostcode) {
        throw new UnsupportedOperationException();
    }
}
