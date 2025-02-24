package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import o.setHmAddress;
/* loaded from: classes2-dex2jar.jar:com/google/firebase/messaging/RemoteMessageCreator.class */
public class RemoteMessageCreator implements Parcelable.Creator<RemoteMessage> {
    public static final int CONTENT_DESCRIPTION = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void writeToParcel(RemoteMessage remoteMessage, Parcel parcel, int i) {
        parcel.writeInt(-45243);
        parcel.writeInt(0);
        int dataPosition = parcel.dataPosition();
        setHmAddress.a(parcel, 2, remoteMessage.bundle, false);
        setHmAddress.e(parcel, dataPosition);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public RemoteMessage createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 2) {
                SafeParcelReader.p(parcel, readInt);
            } else {
                bundle = SafeParcelReader.c(parcel, readInt);
            }
        }
        SafeParcelReader.d(parcel, a);
        return new RemoteMessage(bundle);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public RemoteMessage[] newArray(int i) {
        return new RemoteMessage[i];
    }
}
