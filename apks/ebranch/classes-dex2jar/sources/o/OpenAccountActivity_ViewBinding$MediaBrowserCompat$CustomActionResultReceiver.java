package o;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes-dex2jar.jar:o/OpenAccountActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.class */
public final class OpenAccountActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver implements Parcelable {
    public static final Parcelable.Creator<OpenAccountActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver> CREATOR = new write();
    @infoContactPersonDialogEvent(c = "local_clearing_code")
    public final String a;
    @infoContactPersonDialogEvent(c = "bic_code")
    public final String d;
    @infoContactPersonDialogEvent(c = "bank_nm")
    public final String e;

    /* loaded from: classes-dex2jar.jar:o/OpenAccountActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver$write.class */
    public static final class write implements Parcelable.Creator<OpenAccountActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver> {
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ OpenAccountActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver createFromParcel(Parcel parcel) {
            subscribeReservationRescheduleEvent.e(parcel, "");
            return new OpenAccountActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ OpenAccountActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver[] newArray(int i) {
            return new OpenAccountActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver[i];
        }
    }

    public OpenAccountActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver(String str, String str2, String str3) {
        subscribeReservationRescheduleEvent.e(str, "");
        subscribeReservationRescheduleEvent.e(str2, "");
        subscribeReservationRescheduleEvent.e(str3, "");
        this.d = str;
        this.e = str2;
        this.a = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Object
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OpenAccountActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver)) {
            return false;
        }
        OpenAccountActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver openAccountActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver = (OpenAccountActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver) obj;
        return subscribeReservationRescheduleEvent.b((Object) this.d, (Object) openAccountActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.d) && subscribeReservationRescheduleEvent.b((Object) this.e, (Object) openAccountActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.e) && subscribeReservationRescheduleEvent.b((Object) this.a, (Object) openAccountActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.a);
    }

    @Override // java.lang.Object
    public final int hashCode() {
        return (((this.d.hashCode() * 31) + this.e.hashCode()) * 31) + this.a.hashCode();
    }

    @Override // java.lang.Object
    public final String toString() {
        StringBuilder sb = new StringBuilder("Bank(bicCode=");
        sb.append(this.d);
        sb.append(", bankNm=");
        sb.append(this.e);
        sb.append(", localClearingCode=");
        sb.append(this.a);
        sb.append(')');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        subscribeReservationRescheduleEvent.e(parcel, "");
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.a);
    }
}
