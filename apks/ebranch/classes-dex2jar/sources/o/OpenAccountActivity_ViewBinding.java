package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes-dex2jar.jar:o/OpenAccountActivity_ViewBinding.class */
public final class OpenAccountActivity_ViewBinding implements Parcelable {
    public static final Parcelable.Creator<OpenAccountActivity_ViewBinding> CREATOR = new read();
    @infoContactPersonDialogEvent(c = "list_bank")
    public final List<OpenAccountActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver> e;

    /* loaded from: classes-dex2jar.jar:o/OpenAccountActivity_ViewBinding$read.class */
    public static final class read implements Parcelable.Creator<OpenAccountActivity_ViewBinding> {
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ OpenAccountActivity_ViewBinding createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            subscribeReservationRescheduleEvent.e(parcel, "");
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                for (int i = 0; i != readInt; i++) {
                    arrayList2.add(OpenAccountActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new OpenAccountActivity_ViewBinding(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ OpenAccountActivity_ViewBinding[] newArray(int i) {
            return new OpenAccountActivity_ViewBinding[i];
        }
    }

    public OpenAccountActivity_ViewBinding() {
        this(null, 1);
    }

    public OpenAccountActivity_ViewBinding(List<OpenAccountActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver> list) {
        this.e = list;
    }

    private /* synthetic */ OpenAccountActivity_ViewBinding(List list, int i) {
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
        return (obj instanceof OpenAccountActivity_ViewBinding) && subscribeReservationRescheduleEvent.b(this.e, ((OpenAccountActivity_ViewBinding) obj).e);
    }

    @Override // java.lang.Object
    public final int hashCode() {
        List<OpenAccountActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver> list = this.e;
        return list == null ? 0 : list.hashCode();
    }

    @Override // java.lang.Object
    public final String toString() {
        StringBuilder sb = new StringBuilder("BankListResponse(listBank=");
        sb.append(this.e);
        sb.append(')');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        subscribeReservationRescheduleEvent.e(parcel, "");
        List<OpenAccountActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver> list = this.e;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        for (OpenAccountActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver openAccountActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver : list) {
            openAccountActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.writeToParcel(parcel, i);
        }
    }
}
