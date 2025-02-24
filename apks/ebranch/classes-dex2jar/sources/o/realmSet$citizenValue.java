package o;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.api.Status;
import java.util.Set;
import o.realmGet$religionOthers;
/* loaded from: classes-dex2jar.jar:o/realmSet$citizenValue.class */
public final class realmSet$citizenValue implements realmSet$fotoNpwp {
    private final realmSet$hmPhoneCodeNumber a;
    private boolean c = false;

    public realmSet$citizenValue(realmSet$hmPhoneCodeNumber realmset_hmphonecodenumber) {
        this.a = realmset_hmphonecodenumber;
    }

    @Override // o.realmSet$fotoNpwp
    public final realmGet$religionOthers.write a(realmGet$religionOthers.write write) {
        try {
            this.a.g.h.b(write);
            realmSet$handPhoneNumber realmset_handphonenumber = this.a.g;
            realmGet$name$MediaBrowserCompat$SearchResultReceiver realmget_name_mediabrowsercompat_searchresultreceiver = (realmGet$name$MediaBrowserCompat$SearchResultReceiver) realmset_handphonenumber.d.get(write.d());
            setFotoKtp.a(realmget_name_mediabrowsercompat_searchresultreceiver, "Appropriate Api was not requested.");
            if (realmget_name_mediabrowsercompat_searchresultreceiver.j() || !this.a.e.containsKey(write.d())) {
                write.b((realmGet$religionOthers.write) realmget_name_mediabrowsercompat_searchresultreceiver);
            } else {
                write.a(new Status(17));
            }
        } catch (DeadObjectException e) {
            this.a.a(new realmSet$fotoPribadi(this) { // from class: o.realmSet$citizenOthers
                @Override // o.realmSet$fotoPribadi
                public final void d() {
                    realmSet$citizenValue.this.d(1);
                }
            });
        }
        return write;
    }

    public final void a() {
        if (this.c) {
            this.c = false;
            this.a.g.h.b();
            c();
        }
    }

    @Override // o.realmSet$fotoNpwp
    public final void b() {
        if (this.c) {
            this.c = false;
            this.a.a(new realmSet$fotoPribadi(this) { // from class: o.realmSet$citizen
                @Override // o.realmSet$fotoPribadi
                public final void d() {
                    realmSet$citizenValue.this.a.i.e((Bundle) null);
                }
            });
        }
    }

    @Override // o.realmSet$fotoNpwp
    public final void b(realmGet$jobValue realmget_jobvalue, realmGet$name realmget_name, boolean z) {
    }

    @Override // o.realmSet$fotoNpwp
    public final realmGet$religionOthers.write c(realmGet$religionOthers.write write) {
        a(write);
        return write;
    }

    @Override // o.realmSet$fotoNpwp
    public final boolean c() {
        if (this.c) {
            return false;
        }
        Set<realmSet$officePostCode> set = this.a.g.g;
        if (set == null || set.isEmpty()) {
            this.a.e((realmGet$jobValue) null);
            return true;
        }
        this.c = true;
        for (realmSet$officePostCode realmset_officepostcode : set) {
            realmset_officepostcode.b();
        }
        return false;
    }

    @Override // o.realmSet$fotoNpwp
    public final void d() {
    }

    @Override // o.realmSet$fotoNpwp
    public final void d(int i) {
        this.a.e((realmGet$jobValue) null);
        this.a.i.d(i, this.c);
    }

    @Override // o.realmSet$fotoNpwp
    public final void d(Bundle bundle) {
    }
}
