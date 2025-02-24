package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes-dex2jar.jar:o/detailBCAFullPayment.class */
public final class detailBCAFullPayment implements Parcelable {
    public static final Parcelable.Creator<detailBCAFullPayment> CREATOR = new IconCompatParcelizer();
    @infoContactPersonDialogEvent(c = "total_page")
    private final Integer a;
    @infoContactPersonDialogEvent(c = "source_account_owner_list")
    public final ArrayList<read> d;

    /* loaded from: classes-dex2jar.jar:o/detailBCAFullPayment$IconCompatParcelizer.class */
    public static final class IconCompatParcelizer implements Parcelable.Creator<detailBCAFullPayment> {
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ detailBCAFullPayment createFromParcel(Parcel parcel) {
            subscribeReservationRescheduleEvent.e(parcel, "");
            ArrayList arrayList = null;
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                for (int i = 0; i != readInt; i++) {
                    arrayList.add(read.CREATOR.createFromParcel(parcel));
                }
            }
            return new detailBCAFullPayment(valueOf, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ detailBCAFullPayment[] newArray(int i) {
            return new detailBCAFullPayment[i];
        }
    }

    /* loaded from: classes-dex2jar.jar:o/detailBCAFullPayment$read.class */
    public static final class read implements Parcelable {
        public static final Parcelable.Creator<read> CREATOR = new RemoteActionCompatParcelizer();
        @infoContactPersonDialogEvent(c = "id_type")
        public final String a;
        @infoContactPersonDialogEvent(c = "phone_number")
        public final String b;
        @infoContactPersonDialogEvent(c = "id_num")
        public final String c;
        @infoContactPersonDialogEvent(c = "address")
        public final String d;
        @infoContactPersonDialogEvent(c = "name")
        public final String e;
        @infoContactPersonDialogEvent(c = "source_account_owner_id")
        public String h;

        /* loaded from: classes-dex2jar.jar:o/detailBCAFullPayment$read$RemoteActionCompatParcelizer.class */
        public static final class RemoteActionCompatParcelizer implements Parcelable.Creator<read> {
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ read createFromParcel(Parcel parcel) {
                subscribeReservationRescheduleEvent.e(parcel, "");
                return new read(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ read[] newArray(int i) {
                return new read[i];
            }
        }

        public read() {
            this(null, null, null, null, null, null, 63);
        }

        public read(String str, String str2, String str3, String str4, String str5, String str6) {
            this.h = str;
            this.e = str2;
            this.a = str3;
            this.c = str4;
            this.d = str5;
            this.b = str6;
        }

        public /* synthetic */ read(String str, String str2, String str3, String str4, String str5, String str6, int i) {
            this(null, null, null, null, null, null);
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
            if (!(obj instanceof read)) {
                return false;
            }
            read read = (read) obj;
            return subscribeReservationRescheduleEvent.b((Object) this.h, (Object) read.h) && subscribeReservationRescheduleEvent.b((Object) this.e, (Object) read.e) && subscribeReservationRescheduleEvent.b((Object) this.a, (Object) read.a) && subscribeReservationRescheduleEvent.b((Object) this.c, (Object) read.c) && subscribeReservationRescheduleEvent.b((Object) this.d, (Object) read.d) && subscribeReservationRescheduleEvent.b((Object) this.b, (Object) read.b);
        }

        @Override // java.lang.Object
        public final int hashCode() {
            String str = this.h;
            int i = 0;
            int hashCode = str == null ? 0 : str.hashCode();
            String str2 = this.e;
            int hashCode2 = str2 == null ? 0 : str2.hashCode();
            String str3 = this.a;
            int hashCode3 = str3 == null ? 0 : str3.hashCode();
            String str4 = this.c;
            int hashCode4 = str4 == null ? 0 : str4.hashCode();
            String str5 = this.d;
            int hashCode5 = str5 == null ? 0 : str5.hashCode();
            String str6 = this.b;
            if (str6 != null) {
                i = str6.hashCode();
            }
            return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + i;
        }

        @Override // java.lang.Object
        public final String toString() {
            StringBuilder sb = new StringBuilder("DaftarPemilikSumberDanaOutput(sourceAccountOwnerId=");
            sb.append(this.h);
            sb.append(", name=");
            sb.append(this.e);
            sb.append(", idType=");
            sb.append(this.a);
            sb.append(", idNum=");
            sb.append(this.c);
            sb.append(", address=");
            sb.append(this.d);
            sb.append(", phoneNumber=");
            sb.append(this.b);
            sb.append(')');
            return sb.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            subscribeReservationRescheduleEvent.e(parcel, "");
            parcel.writeString(this.h);
            parcel.writeString(this.e);
            parcel.writeString(this.a);
            parcel.writeString(this.c);
            parcel.writeString(this.d);
            parcel.writeString(this.b);
        }
    }

    public detailBCAFullPayment() {
        this(null, null, 3);
    }

    public detailBCAFullPayment(Integer num, ArrayList<read> arrayList) {
        this.a = num;
        this.d = arrayList;
    }

    private /* synthetic */ detailBCAFullPayment(Integer num, ArrayList arrayList, int i) {
        this(null, null);
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
        if (!(obj instanceof detailBCAFullPayment)) {
            return false;
        }
        detailBCAFullPayment detailbcafullpayment = (detailBCAFullPayment) obj;
        return subscribeReservationRescheduleEvent.b(this.a, detailbcafullpayment.a) && subscribeReservationRescheduleEvent.b(this.d, detailbcafullpayment.d);
    }

    @Override // java.lang.Object
    public final int hashCode() {
        Integer num = this.a;
        int i = 0;
        int hashCode = num == null ? 0 : num.hashCode();
        ArrayList<read> arrayList = this.d;
        if (arrayList != null) {
            i = arrayList.hashCode();
        }
        return (hashCode * 31) + i;
    }

    @Override // java.lang.Object
    public final String toString() {
        StringBuilder sb = new StringBuilder("DaftarPemilikSumberDanaResponse(totalPage=");
        sb.append(this.a);
        sb.append(", sourceAccountOwnerList=");
        sb.append(this.d);
        sb.append(')');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        subscribeReservationRescheduleEvent.e(parcel, "");
        Integer num = this.a;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        ArrayList<read> arrayList = this.d;
        if (arrayList == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(arrayList.size());
        Iterator<read> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }
}
