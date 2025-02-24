package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* loaded from: classes-dex2jar.jar:o/onClickMenu.class */
public final class onClickMenu implements Parcelable {
    @infoContactPersonDialogEvent(c = "bank_list")
    public final List<write> c;
    public static final read a = new read((byte) 0);
    public static final Parcelable.Creator<onClickMenu> CREATOR = new RemoteActionCompatParcelizer();

    /* loaded from: classes-dex2jar.jar:o/onClickMenu$RemoteActionCompatParcelizer.class */
    public static final class RemoteActionCompatParcelizer implements Parcelable.Creator<onClickMenu> {
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ onClickMenu createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            subscribeReservationRescheduleEvent.e(parcel, "");
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                for (int i = 0; i != readInt; i++) {
                    arrayList2.add(write.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new onClickMenu(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ onClickMenu[] newArray(int i) {
            return new onClickMenu[i];
        }
    }

    /* loaded from: classes-dex2jar.jar:o/onClickMenu$read.class */
    public static final class read {
        private read() {
        }

        public /* synthetic */ read(byte b) {
            this();
        }

        public static List<OpenAccountActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver> e(List<write> list) {
            subscribeReservationRescheduleEvent.e(list, "");
            ArrayList arrayList = new ArrayList();
            arrayList.clear();
            List<write> list2 = list;
            subscribeReservationRescheduleEvent.e(list2, "");
            ArrayList arrayList2 = new ArrayList(list2 instanceof Collection ? list2.size() : 10);
            for (write write : list2) {
                arrayList2.add(Boolean.valueOf(arrayList.add(new OpenAccountActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver(write.b, write.c, write.e))));
            }
            return arrayList;
        }
    }

    /* loaded from: classes-dex2jar.jar:o/onClickMenu$write.class */
    public static final class write implements Parcelable {
        public static final Parcelable.Creator<write> CREATOR = new RemoteActionCompatParcelizer();
        @infoContactPersonDialogEvent(c = "bank_short_name")
        final String b;
        @infoContactPersonDialogEvent(c = "bank_name")
        final String c;
        @infoContactPersonDialogEvent(c = "bank_clearing_code")
        final String e;

        /* loaded from: classes-dex2jar.jar:o/onClickMenu$write$RemoteActionCompatParcelizer.class */
        public static final class RemoteActionCompatParcelizer implements Parcelable.Creator<write> {
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ write createFromParcel(Parcel parcel) {
                subscribeReservationRescheduleEvent.e(parcel, "");
                return new write(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ write[] newArray(int i) {
                return new write[i];
            }
        }

        public write(String str, String str2, String str3) {
            subscribeReservationRescheduleEvent.e(str, "");
            subscribeReservationRescheduleEvent.e(str2, "");
            subscribeReservationRescheduleEvent.e(str3, "");
            this.b = str;
            this.c = str2;
            this.e = str3;
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
            if (!(obj instanceof write)) {
                return false;
            }
            write write = (write) obj;
            return subscribeReservationRescheduleEvent.b((Object) this.b, (Object) write.b) && subscribeReservationRescheduleEvent.b((Object) this.c, (Object) write.c) && subscribeReservationRescheduleEvent.b((Object) this.e, (Object) write.e);
        }

        @Override // java.lang.Object
        public final int hashCode() {
            return (((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + this.e.hashCode();
        }

        @Override // java.lang.Object
        public final String toString() {
            StringBuilder sb = new StringBuilder("BankNew(bicCode=");
            sb.append(this.b);
            sb.append(", bankNm=");
            sb.append(this.c);
            sb.append(", localClearingCode=");
            sb.append(this.e);
            sb.append(')');
            return sb.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            subscribeReservationRescheduleEvent.e(parcel, "");
            parcel.writeString(this.b);
            parcel.writeString(this.c);
            parcel.writeString(this.e);
        }
    }

    public onClickMenu() {
        this(null, 1);
    }

    public onClickMenu(List<write> list) {
        this.c = list;
    }

    public /* synthetic */ onClickMenu(List list, int i) {
        this(new ArrayList());
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
        return (obj instanceof onClickMenu) && subscribeReservationRescheduleEvent.b(this.c, ((onClickMenu) obj).c);
    }

    @Override // java.lang.Object
    public final int hashCode() {
        List<write> list = this.c;
        return list == null ? 0 : list.hashCode();
    }

    @Override // java.lang.Object
    public final String toString() {
        StringBuilder sb = new StringBuilder("BankListLocalResponse(listBankNew=");
        sb.append(this.c);
        sb.append(')');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        subscribeReservationRescheduleEvent.e(parcel, "");
        List<write> list = this.c;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        for (write write2 : list) {
            write2.writeToParcel(parcel, i);
        }
    }
}
