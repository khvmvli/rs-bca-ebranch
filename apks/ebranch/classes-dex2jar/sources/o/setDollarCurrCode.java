package o;

import android.accounts.Account;
import android.content.Context;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import o.realmGet$occupation;
/* loaded from: classes-dex2jar.jar:o/setDollarCurrCode.class */
public abstract class setDollarCurrCode<T extends IInterface> extends setCitizenValue<T> implements realmGet$name$MediaBrowserCompat$SearchResultReceiver, setJobValue {
    private final Set h;
    private final setDob i;
    private final Account j;

    @Deprecated
    public setDollarCurrCode(Context context, Looper looper, int i, setDob setdob, realmGet$occupation.IconCompatParcelizer iconCompatParcelizer, realmGet$occupation.read read) {
        this(context, looper, i, setdob, (realmGet$resCountry) iconCompatParcelizer, (realmGet$resProvince) read);
    }

    public setDollarCurrCode(Context context, Looper looper, int i, setDob setdob, realmGet$resCountry realmget_rescountry, realmGet$resProvince realmget_resprovince) {
        this(context, looper, setEmailAddr.a(context), realmGet$jobOthers.a(), i, setdob, (realmGet$resCountry) setFotoKtp.b(realmget_rescountry), (realmGet$resProvince) setFotoKtp.b(realmget_resprovince));
    }

    protected setDollarCurrCode(Context context, Looper looper, setEmailAddr setemailaddr, realmGet$jobOthers realmget_jobothers, int i, setDob setdob, realmGet$resCountry realmget_rescountry, realmGet$resProvince realmget_resprovince) {
        super(context, looper, setemailaddr, realmget_jobothers, i, realmget_rescountry == null ? null : new setJob(realmget_rescountry), realmget_resprovince == null ? null : new setKitasKitapExpDate(realmget_resprovince), setdob.a());
        this.i = setdob;
        this.j = setdob.c();
        this.h = b(setdob.b());
    }

    private final Set b(Set set) {
        Set<Scope> d = d(set);
        for (Scope scope : d) {
            if (!set.contains(scope)) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return d;
    }

    protected Set<Scope> d(Set<Scope> set) {
        return set;
    }

    @Override // o.realmGet$name$MediaBrowserCompat$SearchResultReceiver
    public Set<Scope> i() {
        return n() ? this.h : Collections.emptySet();
    }

    @Override // o.setCitizenValue
    public final Account r() {
        return this.j;
    }

    @Override // o.setCitizenValue
    protected Executor t() {
        return null;
    }

    @Override // o.setCitizenValue
    protected final Set<Scope> y() {
        return this.h;
    }
}
