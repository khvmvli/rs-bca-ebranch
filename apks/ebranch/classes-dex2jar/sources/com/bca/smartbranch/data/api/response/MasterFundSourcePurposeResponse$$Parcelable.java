package com.bca.smartbranch.data.api.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.bca.smartbranch.data.api.response.MasterFundSourcePurposeResponse;
import java.util.ArrayList;
import java.util.List;
import o.ListUtil;
import o.copyToImmutableList;
import org.parceler.ParcelerRuntimeException;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/response/MasterFundSourcePurposeResponse$$Parcelable.class */
public class MasterFundSourcePurposeResponse$$Parcelable implements Parcelable, copyToImmutableList<MasterFundSourcePurposeResponse> {
    public static final Parcelable.Creator<MasterFundSourcePurposeResponse$$Parcelable> CREATOR = new Parcelable.Creator<MasterFundSourcePurposeResponse$$Parcelable>() { // from class: com.bca.smartbranch.data.api.response.MasterFundSourcePurposeResponse$$Parcelable.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ MasterFundSourcePurposeResponse$$Parcelable createFromParcel(Parcel parcel) {
            return new MasterFundSourcePurposeResponse$$Parcelable(MasterFundSourcePurposeResponse$$Parcelable.read(parcel, new ListUtil.FiveItemImmutableList()));
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ MasterFundSourcePurposeResponse$$Parcelable[] newArray(int i) {
            return new MasterFundSourcePurposeResponse$$Parcelable[i];
        }
    };
    private MasterFundSourcePurposeResponse masterFundSourcePurposeResponse$$0;

    public MasterFundSourcePurposeResponse$$Parcelable(MasterFundSourcePurposeResponse masterFundSourcePurposeResponse) {
        this.masterFundSourcePurposeResponse$$0 = masterFundSourcePurposeResponse;
    }

    public static MasterFundSourcePurposeResponse read(Parcel parcel, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        String[] strArr;
        ArrayList arrayList;
        int readInt = parcel.readInt();
        int i = 0;
        boolean z = false;
        if (readInt < fiveItemImmutableList.a.size()) {
            if (fiveItemImmutableList.a.get(readInt) == ListUtil.FiveItemImmutableList.c) {
                z = true;
            }
            if (!z) {
                return (MasterFundSourcePurposeResponse) fiveItemImmutableList.a.get(readInt);
            }
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
        fiveItemImmutableList.a.add(ListUtil.FiveItemImmutableList.c);
        int size = fiveItemImmutableList.a.size();
        MasterFundSourcePurposeResponse masterFundSourcePurposeResponse = new MasterFundSourcePurposeResponse();
        fiveItemImmutableList.d(size - 1, masterFundSourcePurposeResponse);
        int readInt2 = parcel.readInt();
        String[] strArr2 = null;
        if (readInt2 >= 0) {
            String[] strArr3 = new String[readInt2];
            int i2 = 0;
            while (true) {
                strArr = strArr3;
                if (i2 >= readInt2) {
                    break;
                }
                strArr3[i2] = parcel.readString();
                i2++;
            }
        } else {
            strArr = null;
        }
        ListUtil.e(MasterFundSourcePurposeResponse.class, masterFundSourcePurposeResponse, "transactionPurpose", strArr);
        int readInt3 = parcel.readInt();
        if (readInt3 >= 0) {
            ArrayList arrayList2 = new ArrayList(readInt3);
            int i3 = 0;
            while (true) {
                arrayList = arrayList2;
                if (i3 >= readInt3) {
                    break;
                }
                arrayList2.add(MasterFundSourcePurposeResponse$Category$$Parcelable.read(parcel, fiveItemImmutableList));
                i3++;
            }
        } else {
            arrayList = null;
        }
        ListUtil.e(MasterFundSourcePurposeResponse.class, masterFundSourcePurposeResponse, "categories", arrayList);
        int readInt4 = parcel.readInt();
        if (readInt4 >= 0) {
            String[] strArr4 = new String[readInt4];
            while (true) {
                strArr2 = strArr4;
                if (i >= readInt4) {
                    break;
                }
                strArr4[i] = parcel.readString();
                i++;
            }
        }
        ListUtil.e(MasterFundSourcePurposeResponse.class, masterFundSourcePurposeResponse, "fundSource", strArr2);
        fiveItemImmutableList.d(readInt, masterFundSourcePurposeResponse);
        return masterFundSourcePurposeResponse;
    }

    public static void write(MasterFundSourcePurposeResponse masterFundSourcePurposeResponse, Parcel parcel, int i, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int c = fiveItemImmutableList.c(masterFundSourcePurposeResponse);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        fiveItemImmutableList.a.add(masterFundSourcePurposeResponse);
        parcel.writeInt(fiveItemImmutableList.a.size() - 1);
        if (ListUtil.c(MasterFundSourcePurposeResponse.class, masterFundSourcePurposeResponse, "transactionPurpose") == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(((String[]) ListUtil.c(MasterFundSourcePurposeResponse.class, masterFundSourcePurposeResponse, "transactionPurpose")).length);
            for (String str : (String[]) ListUtil.c(MasterFundSourcePurposeResponse.class, masterFundSourcePurposeResponse, "transactionPurpose")) {
                parcel.writeString(str);
            }
        }
        if (ListUtil.c(MasterFundSourcePurposeResponse.class, masterFundSourcePurposeResponse, "categories") == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(((List) ListUtil.c(MasterFundSourcePurposeResponse.class, masterFundSourcePurposeResponse, "categories")).size());
            for (MasterFundSourcePurposeResponse.Category category : (List) ListUtil.c(MasterFundSourcePurposeResponse.class, masterFundSourcePurposeResponse, "categories")) {
                MasterFundSourcePurposeResponse$Category$$Parcelable.write(category, parcel, i, fiveItemImmutableList);
            }
        }
        if (ListUtil.c(MasterFundSourcePurposeResponse.class, masterFundSourcePurposeResponse, "fundSource") == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(((String[]) ListUtil.c(MasterFundSourcePurposeResponse.class, masterFundSourcePurposeResponse, "fundSource")).length);
        for (String str2 : (String[]) ListUtil.c(MasterFundSourcePurposeResponse.class, masterFundSourcePurposeResponse, "fundSource")) {
            parcel.writeString(str2);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public MasterFundSourcePurposeResponse getParcel() {
        return this.masterFundSourcePurposeResponse$$0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        write(this.masterFundSourcePurposeResponse$$0, parcel, i, new ListUtil.FiveItemImmutableList());
    }
}
