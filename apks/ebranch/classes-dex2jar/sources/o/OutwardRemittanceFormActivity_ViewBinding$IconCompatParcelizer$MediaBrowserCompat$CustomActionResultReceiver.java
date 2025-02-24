package o;

import android.os.Parcel;
import android.os.Parcelable;
import o.OutwardRemittanceFormActivity_ViewBinding;
/* loaded from: classes-dex2jar.jar:o/OutwardRemittanceFormActivity_ViewBinding$IconCompatParcelizer$MediaBrowserCompat$CustomActionResultReceiver.class */
public final class OutwardRemittanceFormActivity_ViewBinding$IconCompatParcelizer$MediaBrowserCompat$CustomActionResultReceiver implements Parcelable.Creator<OutwardRemittanceFormActivity_ViewBinding.IconCompatParcelizer> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ OutwardRemittanceFormActivity_ViewBinding.IconCompatParcelizer createFromParcel(Parcel parcel) {
        subscribeReservationRescheduleEvent.e(parcel, "");
        return new OutwardRemittanceFormActivity_ViewBinding.IconCompatParcelizer(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ OutwardRemittanceFormActivity_ViewBinding.IconCompatParcelizer[] newArray(int i) {
        return new OutwardRemittanceFormActivity_ViewBinding.IconCompatParcelizer[i];
    }
}
