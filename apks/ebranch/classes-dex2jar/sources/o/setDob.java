package o;

import android.accounts.Account;
import android.view.View;
import com.google.android.gms.common.api.Scope;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;
/* loaded from: classes-dex2jar.jar:o/setDob.class */
public final class setDob {
    public final String a;
    public final Map b;
    public final setNoHandphone c;
    @Nullable
    public final Account d;
    public Integer e;
    private final Set f;
    private final String g;
    private final Set h;
    private final int i;
    @Nullable
    private final View j;

    /* loaded from: classes-dex2jar.jar:o/setDob$read.class */
    public static final class read {
        private String a;
        private setThumbTintMode b;
        @Nullable
        private Account c;
        private String d;
        private final setNoHandphone e = setNoHandphone.b;

        public final read b(@Nullable Account account) {
            this.c = account;
            return this;
        }

        public final read b(String str) {
            this.a = str;
            return this;
        }

        public final read b(Collection collection) {
            if (this.b == null) {
                this.b = new setThumbTintMode();
            }
            this.b.addAll(collection);
            return this;
        }

        public final setDob c() {
            return new setDob(this.c, this.b, null, 0, null, this.d, this.a, this.e);
        }

        public final read e(String str) {
            this.d = str;
            return this;
        }
    }

    public setDob(@Nullable Account account, Set set, Map map, int i, @Nullable View view, String str, String str2, @Nullable setNoHandphone setnohandphone) {
        this.d = account;
        Set emptySet = set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
        this.h = emptySet;
        Map emptyMap = map == null ? Collections.emptyMap() : map;
        this.b = emptyMap;
        this.j = view;
        this.i = i;
        this.a = str;
        this.g = str2;
        this.c = setnohandphone == null ? setNoHandphone.b : setnohandphone;
        HashSet hashSet = new HashSet(emptySet);
        for (setHmProvince sethmprovince : emptyMap.values()) {
            hashSet.addAll(sethmprovince.e);
        }
        this.f = Collections.unmodifiableSet(hashSet);
    }

    public final String a() {
        return this.g;
    }

    public final Set<Scope> b() {
        return this.f;
    }

    public final Account c() {
        return this.d;
    }

    public final void c(Integer num) {
        this.e = num;
    }

    public final setNoHandphone d() {
        return this.c;
    }

    public final Set<Scope> e() {
        return this.h;
    }

    public final Map j() {
        return this.b;
    }
}
