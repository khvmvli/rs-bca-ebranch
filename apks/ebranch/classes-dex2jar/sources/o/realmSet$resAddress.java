package o;

import android.util.Log;
import android.util.SparseArray;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import o.realmGet$occupation;
/* loaded from: classes-dex2jar.jar:o/realmSet$resAddress.class */
public final class realmSet$resAddress extends realmSet$resPhoneNumber {
    private final SparseArray c = new SparseArray();

    private realmSet$resAddress(realmGet$religionValue realmget_religionvalue) {
        super(realmget_religionvalue, realmGet$jobOthers.a());
        this.e.b("AutoManageHelper", this);
    }

    private final realmSet$religionValue a(int i) {
        if (this.c.size() <= i) {
            return null;
        }
        SparseArray sparseArray = this.c;
        return (realmSet$religionValue) sparseArray.get(sparseArray.keyAt(i));
    }

    public static realmSet$resAddress e(realmGet$resHouseStatus realmget_reshousestatus) {
        realmGet$religionValue d = d(realmget_reshousestatus);
        realmSet$resAddress realmset_resaddress = (realmSet$resAddress) d.e("AutoManageHelper", realmSet$resAddress.class);
        return realmset_resaddress != null ? realmset_resaddress : new realmSet$resAddress(d);
    }

    public final void a(int i, realmGet$occupation realmget_occupation, realmGet$occupation.read read) {
        setFotoKtp.a(realmget_occupation, "GoogleApiClient instance cannot be null");
        int indexOfKey = this.c.indexOfKey(i);
        setFotoKtp.c(indexOfKey < 0, "Already managing a GoogleApiClient with id " + i);
        realmSet$resHouseStatus realmset_reshousestatus = (realmSet$resHouseStatus) this.d.get();
        boolean z = this.a;
        String valueOf = String.valueOf(realmset_reshousestatus);
        Log.d("AutoManageHelper", "starting AutoManage for client " + i + " " + z + " " + valueOf);
        realmSet$religionValue realmset_religionvalue = new realmSet$religionValue(this, i, realmget_occupation, read);
        realmget_occupation.a(realmset_religionvalue);
        this.c.put(i, realmset_religionvalue);
        if (this.a && realmset_reshousestatus == null) {
            Log.d("AutoManageHelper", "connecting ".concat(realmget_occupation.toString()));
            realmget_occupation.d();
        }
    }

    @Override // o.realmSet$resPhoneNumber, o.realmGet$resAddress
    public final void b() {
        b();
        for (int i = 0; i < this.c.size(); i++) {
            realmSet$religionValue a = a(i);
            if (a != null) {
                a.c.a();
            }
        }
    }

    @Override // o.realmSet$resPhoneNumber, o.realmGet$resAddress
    public final void c() {
        c();
        SparseArray sparseArray = this.c;
        boolean z = this.a;
        String valueOf = String.valueOf(sparseArray);
        Log.d("AutoManageHelper", "onStart " + z + " " + valueOf);
        if (this.d.get() == null) {
            for (int i = 0; i < this.c.size(); i++) {
                realmSet$religionValue a = a(i);
                if (a != null) {
                    a.c.d();
                }
            }
        }
    }

    @Override // o.realmSet$resPhoneNumber
    protected final void c(realmGet$jobValue realmget_jobvalue, int i) {
        Log.w("AutoManageHelper", "Unresolved error while connecting client. Stopping auto-manage.");
        if (i < 0) {
            Log.wtf("AutoManageHelper", "AutoManageLifecycleHelper received onErrorResolutionFailed callback but no failing client ID is set", new Exception());
            return;
        }
        realmSet$religionValue realmset_religionvalue = (realmSet$religionValue) this.c.get(i);
        if (realmset_religionvalue != null) {
            d(i);
            realmGet$occupation.read read = realmset_religionvalue.b;
            if (read != null) {
                read.b(realmget_jobvalue);
            }
        }
    }

    public final void d(int i) {
        realmSet$religionValue realmset_religionvalue = (realmSet$religionValue) this.c.get(i);
        this.c.remove(i);
        if (realmset_religionvalue != null) {
            realmset_religionvalue.c.b(realmset_religionvalue);
            realmset_religionvalue.c.a();
        }
    }

    @Override // o.realmGet$resAddress
    public final void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        for (int i = 0; i < this.c.size(); i++) {
            realmSet$religionValue a = a(i);
            if (a != null) {
                printWriter.append((CharSequence) str).append("GoogleApiClient #").print(a.e);
                printWriter.println(":");
                a.c.c(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
            }
        }
    }

    @Override // o.realmSet$resPhoneNumber
    protected final void j() {
        for (int i = 0; i < this.c.size(); i++) {
            realmSet$religionValue a = a(i);
            if (a != null) {
                a.c.d();
            }
        }
    }
}
