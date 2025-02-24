package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.errorprone.annotations.CheckReturnValue;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.Arrays;
import o.realmGet$jobValue;
import o.realmGet$maritalStatus;
import o.realmGet$oldCustFlag;
import o.setCitizenOthers;
import o.setFlagIB;
import o.setFotoPribadi;
/* loaded from: classes-dex2jar.jar:com/google/android/gms/common/api/Status.class */
public final class Status extends setFotoPribadi implements realmGet$oldCustFlag, ReflectedParcelable {
    public final int h;
    public final String j;
    public final PendingIntent m;

    /* renamed from: o */
    private final realmGet$jobValue f69o;
    public static final Status f = new Status(-1);
    public static final Status e = new Status(0);
    public static final Status d = new Status(14);
    public static final Status c = new Status(8);
    public static final Status g = new Status(15);
    public static final Status a = new Status(16);
    public static final Status i = new Status(17);
    public static final Status b = new Status(18);
    public static final Parcelable.Creator<Status> CREATOR = new setCitizenOthers();

    public Status(int i2) {
        this(i2, (String) null);
    }

    public Status(int i2, String str) {
        this(i2, str, (PendingIntent) null);
    }

    public Status(int i2, String str, PendingIntent pendingIntent) {
        this(i2, str, pendingIntent, null);
    }

    public Status(int i2, String str, PendingIntent pendingIntent, realmGet$jobValue realmget_jobvalue) {
        this.h = i2;
        this.j = str;
        this.m = pendingIntent;
        this.f69o = realmget_jobvalue;
    }

    public Status(realmGet$jobValue realmget_jobvalue, String str) {
        this(realmget_jobvalue, str, 17);
    }

    @Deprecated
    private Status(realmGet$jobValue realmget_jobvalue, String str, int i2) {
        this(17, str, realmget_jobvalue.c, realmget_jobvalue);
    }

    @ResultIgnorabilityUnspecified
    public final int a() {
        return this.h;
    }

    public final realmGet$jobValue b() {
        return this.f69o;
    }

    public final void c(Activity activity, int i2) throws IntentSender.SendIntentException {
        if (this.m != null) {
            PendingIntent pendingIntent = this.m;
            if (pendingIntent != null) {
                activity.startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
                return;
            }
            throw new NullPointerException("null reference");
        }
    }

    @CheckReturnValue
    public final boolean c() {
        return this.h <= 0;
    }

    @Override // o.realmGet$oldCustFlag
    public final Status e() {
        return this;
    }

    @Override // java.lang.Object
    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        if (this.h != status.h) {
            return false;
        }
        String str = this.j;
        String str2 = status.j;
        if (!(str == str2 || (str != null && str.equals(str2)))) {
            return false;
        }
        PendingIntent pendingIntent = this.m;
        PendingIntent pendingIntent2 = status.m;
        if (!(pendingIntent == pendingIntent2 || (pendingIntent != null && pendingIntent.equals(pendingIntent2)))) {
            return false;
        }
        realmGet$jobValue realmget_jobvalue = this.f69o;
        realmGet$jobValue realmget_jobvalue2 = status.f69o;
        return realmget_jobvalue == realmget_jobvalue2 || (realmget_jobvalue != null && realmget_jobvalue.equals(realmget_jobvalue2));
    }

    @Override // java.lang.Object
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.h), this.j, this.m, this.f69o});
    }

    @Override // java.lang.Object
    public final String toString() {
        setFlagIB.IconCompatParcelizer iconCompatParcelizer = new setFlagIB.IconCompatParcelizer(this);
        String str = this.j;
        if (str == null) {
            str = realmGet$maritalStatus.b(this.h);
        }
        iconCompatParcelizer.b("statusCode", str);
        iconCompatParcelizer.b("resolution", this.m);
        return iconCompatParcelizer.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(-45243);
        parcel.writeInt(0);
        int dataPosition = parcel.dataPosition();
        int i3 = this.h;
        parcel.writeInt(262145);
        parcel.writeInt(i3);
        String str = this.j;
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
        PendingIntent pendingIntent = this.m;
        if (pendingIntent != null) {
            parcel.writeInt(-65533);
            parcel.writeInt(0);
            int dataPosition4 = parcel.dataPosition();
            pendingIntent.writeToParcel(parcel, i2);
            int dataPosition5 = parcel.dataPosition();
            parcel.setDataPosition(dataPosition4 - 4);
            parcel.writeInt(dataPosition5 - dataPosition4);
            parcel.setDataPosition(dataPosition5);
        }
        realmGet$jobValue realmget_jobvalue = this.f69o;
        if (realmget_jobvalue != null) {
            parcel.writeInt(-65532);
            parcel.writeInt(0);
            int dataPosition6 = parcel.dataPosition();
            realmget_jobvalue.writeToParcel(parcel, i2);
            int dataPosition7 = parcel.dataPosition();
            parcel.setDataPosition(dataPosition6 - 4);
            parcel.writeInt(dataPosition7 - dataPosition6);
            parcel.setDataPosition(dataPosition7);
        }
        int dataPosition8 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition - 4);
        parcel.writeInt(dataPosition8 - dataPosition);
        parcel.setDataPosition(dataPosition8);
    }
}
