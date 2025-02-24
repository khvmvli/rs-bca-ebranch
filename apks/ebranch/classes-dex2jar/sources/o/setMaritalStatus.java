package o;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import o.setExpID;
/* loaded from: classes-dex2jar.jar:o/setMaritalStatus.class */
public final class setMaritalStatus extends setFotoPribadi {
    public static final Parcelable.Creator<setMaritalStatus> CREATOR = new setLastEducation();
    private final realmGet$jobValue a;
    final int b;
    final IBinder c;
    private final boolean d;
    private final boolean e;

    public setMaritalStatus(int i, IBinder iBinder, realmGet$jobValue realmget_jobvalue, boolean z, boolean z2) {
        this.b = i;
        this.c = iBinder;
        this.a = realmget_jobvalue;
        this.d = z;
        this.e = z2;
    }

    public final boolean a() {
        return this.e;
    }

    public final realmGet$jobValue c() {
        return this.a;
    }

    public final boolean d() {
        return this.d;
    }

    public final setExpID e() {
        IBinder iBinder = this.c;
        if (iBinder == null) {
            return null;
        }
        return setExpID.read.a(iBinder);
    }

    @Override // java.lang.Object
    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setMaritalStatus)) {
            return false;
        }
        setMaritalStatus setmaritalstatus = (setMaritalStatus) obj;
        return this.a.equals(setmaritalstatus.a) && setFlagIB.d(e(), setmaritalstatus.e());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int b = setHmAddress.b(parcel);
        setHmAddress.d(parcel, 1, this.b);
        setHmAddress.b(parcel, 2, this.c, false);
        setHmAddress.b(parcel, 3, (Parcelable) this.a, i, false);
        setHmAddress.b(parcel, 4, this.d);
        setHmAddress.b(parcel, 5, this.e);
        setHmAddress.e(parcel, b);
    }
}
