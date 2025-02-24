package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes-dex2jar.jar:o/onClickDetail.class */
public final class onClickDetail implements Parcelable {
    public static final Parcelable.Creator<onClickDetail> CREATOR = new read();
    @infoContactPersonDialogEvent(c = "admin_fees")
    public final List<RemoteActionCompatParcelizer> a;

    /* loaded from: classes-dex2jar.jar:o/onClickDetail$RemoteActionCompatParcelizer.class */
    public static final class RemoteActionCompatParcelizer implements Parcelable {
        public static final Parcelable.Creator<RemoteActionCompatParcelizer> CREATOR = new IconCompatParcelizer();
        @infoContactPersonDialogEvent(c = "key")
        public final String b;
        @infoContactPersonDialogEvent(c = "value")
        public final String d;

        /* loaded from: classes-dex2jar.jar:o/onClickDetail$RemoteActionCompatParcelizer$IconCompatParcelizer.class */
        public static final class IconCompatParcelizer implements Parcelable.Creator<RemoteActionCompatParcelizer> {
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ RemoteActionCompatParcelizer createFromParcel(Parcel parcel) {
                subscribeReservationRescheduleEvent.e(parcel, "");
                return new RemoteActionCompatParcelizer(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ RemoteActionCompatParcelizer[] newArray(int i) {
                return new RemoteActionCompatParcelizer[i];
            }
        }

        public RemoteActionCompatParcelizer(String str, String str2) {
            this.b = str;
            this.d = str2;
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
            if (!(obj instanceof RemoteActionCompatParcelizer)) {
                return false;
            }
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = (RemoteActionCompatParcelizer) obj;
            return subscribeReservationRescheduleEvent.b((Object) this.b, (Object) remoteActionCompatParcelizer.b) && subscribeReservationRescheduleEvent.b((Object) this.d, (Object) remoteActionCompatParcelizer.d);
        }

        @Override // java.lang.Object
        public final int hashCode() {
            String str = this.b;
            int i = 0;
            int hashCode = str == null ? 0 : str.hashCode();
            String str2 = this.d;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return (hashCode * 31) + i;
        }

        @Override // java.lang.Object
        public final String toString() {
            StringBuilder sb = new StringBuilder("AdminFee(key=");
            sb.append(this.b);
            sb.append(", value=");
            sb.append(this.d);
            sb.append(')');
            return sb.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            subscribeReservationRescheduleEvent.e(parcel, "");
            parcel.writeString(this.b);
            parcel.writeString(this.d);
        }
    }

    /* loaded from: classes-dex2jar.jar:o/onClickDetail$read.class */
    public static final class read implements Parcelable.Creator<onClickDetail> {
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ onClickDetail createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            subscribeReservationRescheduleEvent.e(parcel, "");
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                for (int i = 0; i != readInt; i++) {
                    arrayList2.add(RemoteActionCompatParcelizer.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new onClickDetail(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ onClickDetail[] newArray(int i) {
            return new onClickDetail[i];
        }
    }

    public onClickDetail(List<RemoteActionCompatParcelizer> list) {
        this.a = list;
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
        return (obj instanceof onClickDetail) && subscribeReservationRescheduleEvent.b(this.a, ((onClickDetail) obj).a);
    }

    @Override // java.lang.Object
    public final int hashCode() {
        List<RemoteActionCompatParcelizer> list = this.a;
        return list == null ? 0 : list.hashCode();
    }

    @Override // java.lang.Object
    public final String toString() {
        StringBuilder sb = new StringBuilder("AdminFeesResponse(adminFees=");
        sb.append(this.a);
        sb.append(')');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        subscribeReservationRescheduleEvent.e(parcel, "");
        List<RemoteActionCompatParcelizer> list = this.a;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        for (RemoteActionCompatParcelizer remoteActionCompatParcelizer : list) {
            remoteActionCompatParcelizer.writeToParcel(parcel, i);
        }
    }
}
