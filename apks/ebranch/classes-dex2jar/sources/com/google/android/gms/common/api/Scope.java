package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import o.setCob;
import o.setFotoPribadi;
/* loaded from: classes-dex2jar.jar:com/google/android/gms/common/api/Scope.class */
public final class Scope extends setFotoPribadi implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new setCob();
    final int a;
    private final String c;

    public Scope(int i, String str) {
        if (!TextUtils.isEmpty(str)) {
            this.a = i;
            this.c = str;
            return;
        }
        throw new IllegalArgumentException("scopeUri must not be null or empty");
    }

    public Scope(String str) {
        this(1, str);
    }

    @Override // java.lang.Object
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.c.equals(((Scope) obj).c);
    }

    @Override // java.lang.Object
    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override // java.lang.Object
    public final String toString() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        parcel.writeInt(-45243);
        parcel.writeInt(0);
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(262145);
        parcel.writeInt(i2);
        String str = this.c;
        if (str != null) {
            parcel.writeInt(-65534);
            parcel.writeInt(0);
            int dataPosition2 = parcel.dataPosition();
            parcel.writeString(str);
            int dataPosition3 = parcel.dataPosition();
            parcel.setDataPosition(dataPosition2 - 4);
            parcel.writeInt(dataPosition3 - dataPosition2);
            parcel.setDataPosition(dataPosition3);
        }
        int dataPosition4 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition - 4);
        parcel.writeInt(dataPosition4 - dataPosition);
        parcel.setDataPosition(dataPosition4);
    }
}
