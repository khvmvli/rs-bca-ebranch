package o;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.Arrays;
import o.setFlagIB;
/* loaded from: classes-dex2jar.jar:o/realmGet$jobValue.class */
public final class realmGet$jobValue extends setFotoPribadi {
    public final int a;
    public final String b;
    public final PendingIntent c;
    final int d;
    public static final realmGet$jobValue e = new realmGet$jobValue(0);
    public static final Parcelable.Creator<realmGet$jobValue> CREATOR = new Parcelable.Creator() { // from class: o.realmGet$namaKontakPengirim
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            int a = SafeParcelReader.a(parcel);
            int i = 0;
            PendingIntent pendingIntent = null;
            String str = null;
            int i2 = 0;
            while (parcel.dataPosition() < a) {
                int b = SafeParcelReader.b(parcel);
                int b2 = SafeParcelReader.b(b);
                if (b2 == 1) {
                    i = SafeParcelReader.k(parcel, b);
                } else if (b2 == 2) {
                    i2 = SafeParcelReader.k(parcel, b);
                } else if (b2 == 3) {
                    pendingIntent = (PendingIntent) SafeParcelReader.b(parcel, b, PendingIntent.CREATOR);
                } else if (b2 != 4) {
                    SafeParcelReader.p(parcel, b);
                } else {
                    str = SafeParcelReader.b(parcel, b);
                }
            }
            SafeParcelReader.d(parcel, a);
            return new realmGet$jobValue(i, i2, pendingIntent, str);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new realmGet$jobValue[i];
        }
    };

    public realmGet$jobValue(int i) {
        this(i, null, null);
    }

    public realmGet$jobValue(int i, int i2, PendingIntent pendingIntent, String str) {
        this.d = i;
        this.a = i2;
        this.c = pendingIntent;
        this.b = str;
    }

    public realmGet$jobValue(int i, PendingIntent pendingIntent) {
        this(i, pendingIntent, null);
    }

    public realmGet$jobValue(int i, PendingIntent pendingIntent, String str) {
        this(1, i, pendingIntent, str);
    }

    public static String e(int i) {
        if (i == 99) {
            return "UNFINISHED";
        }
        if (i == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    default:
                        StringBuilder sb = new StringBuilder("UNKNOWN_ERROR_CODE(");
                        sb.append(i);
                        sb.append(")");
                        return sb.toString();
                }
        }
    }

    public final PendingIntent a() {
        return this.c;
    }

    public final boolean b() {
        return (this.a == 0 || this.c == null) ? false : true;
    }

    public final boolean c() {
        return this.a == 0;
    }

    public final int d() {
        return this.a;
    }

    @Override // java.lang.Object
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof realmGet$jobValue)) {
            return false;
        }
        realmGet$jobValue realmget_jobvalue = (realmGet$jobValue) obj;
        if (this.a != realmget_jobvalue.a) {
            return false;
        }
        PendingIntent pendingIntent = this.c;
        PendingIntent pendingIntent2 = realmget_jobvalue.c;
        if (!(pendingIntent == pendingIntent2 || (pendingIntent != null && pendingIntent.equals(pendingIntent2)))) {
            return false;
        }
        String str = this.b;
        String str2 = realmget_jobvalue.b;
        return str == str2 || (str != null && str.equals(str2));
    }

    @Override // java.lang.Object
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.c, this.b});
    }

    @Override // java.lang.Object
    public final String toString() {
        setFlagIB.IconCompatParcelizer iconCompatParcelizer = new setFlagIB.IconCompatParcelizer(this);
        iconCompatParcelizer.b("statusCode", e(this.a));
        iconCompatParcelizer.b("resolution", this.c);
        iconCompatParcelizer.b("message", this.b);
        return iconCompatParcelizer.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.d;
        parcel.writeInt(-45243);
        parcel.writeInt(0);
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(262145);
        parcel.writeInt(i2);
        int i3 = this.a;
        parcel.writeInt(262146);
        parcel.writeInt(i3);
        PendingIntent pendingIntent = this.c;
        if (pendingIntent != null) {
            parcel.writeInt(-65533);
            parcel.writeInt(0);
            int dataPosition2 = parcel.dataPosition();
            pendingIntent.writeToParcel(parcel, i);
            int dataPosition3 = parcel.dataPosition();
            parcel.setDataPosition(dataPosition2 - 4);
            parcel.writeInt(dataPosition3 - dataPosition2);
            parcel.setDataPosition(dataPosition3);
        }
        String str = this.b;
        if (str != null) {
            parcel.writeInt(-65532);
            parcel.writeInt(0);
            int dataPosition4 = parcel.dataPosition();
            parcel.writeString(str);
            int dataPosition5 = parcel.dataPosition();
            parcel.setDataPosition(dataPosition4 - 4);
            parcel.writeInt(dataPosition5 - dataPosition4);
            parcel.setDataPosition(dataPosition5);
        }
        int dataPosition6 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition - 4);
        parcel.writeInt(dataPosition6 - dataPosition);
        parcel.setDataPosition(dataPosition6);
    }
}
