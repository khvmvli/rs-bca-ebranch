package com.bca.smartbranch.data.api.response;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import o.ListUtil;
import o.copyToImmutableList;
import org.parceler.ParcelerRuntimeException;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/response/CardType$$Parcelable.class */
public class CardType$$Parcelable implements Parcelable, copyToImmutableList<CardType> {
    public static final Parcelable.Creator<CardType$$Parcelable> CREATOR = new Parcelable.Creator<CardType$$Parcelable>() { // from class: com.bca.smartbranch.data.api.response.CardType$$Parcelable.3
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ CardType$$Parcelable createFromParcel(Parcel parcel) {
            return new CardType$$Parcelable(CardType$$Parcelable.read(parcel, new ListUtil.FiveItemImmutableList()));
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ CardType$$Parcelable[] newArray(int i) {
            return new CardType$$Parcelable[i];
        }
    };
    private CardType cardType$$0;

    public CardType$$Parcelable(CardType cardType) {
        this.cardType$$0 = cardType;
    }

    public static CardType read(Parcel parcel, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        ArrayList arrayList;
        int readInt = parcel.readInt();
        boolean z = false;
        boolean z2 = true;
        if (readInt < fiveItemImmutableList.a.size()) {
            if (fiveItemImmutableList.a.get(readInt) == ListUtil.FiveItemImmutableList.c) {
                z = true;
            }
            if (!z) {
                return (CardType) fiveItemImmutableList.a.get(readInt);
            }
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
        fiveItemImmutableList.a.add(ListUtil.FiveItemImmutableList.c);
        int size = fiveItemImmutableList.a.size();
        CardType cardType = new CardType();
        fiveItemImmutableList.d(size - 1, cardType);
        ListUtil.e(CardType.class, cardType, "cardName", parcel.readString());
        ListUtil.e(CardType.class, cardType, "cardCode", parcel.readString());
        ListUtil.e(CardType.class, cardType, "cardType", parcel.readString());
        ListUtil.e(CardType.class, cardType, "incomeAmount", parcel.readString());
        ListUtil.e(CardType.class, cardType, "incomeDisplayAmount", parcel.readString());
        ListUtil.e(CardType.class, cardType, "annualFeeBasicDisplayAmount", parcel.readString());
        ListUtil.e(CardType.class, cardType, "cardImagePath", parcel.readString());
        ListUtil.e(CardType.class, cardType, "cardImageOrientation", parcel.readString());
        ListUtil.e(CardType.class, cardType, "cardDescription", parcel.readString());
        if (parcel.readInt() != 1) {
            z2 = false;
        }
        ListUtil.e(CardType.class, cardType, "isChecked", Boolean.valueOf(z2));
        int readInt2 = parcel.readInt();
        if (readInt2 < 0) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(readInt2);
            for (int i = 0; i < readInt2; i++) {
                arrayList.add(parcel.readString());
            }
        }
        ListUtil.e(CardType.class, cardType, "benefit", arrayList);
        ListUtil.e(CardType.class, cardType, "annualFeeAddOnAmount", parcel.readString());
        ListUtil.e(CardType.class, cardType, "cardID", parcel.readString());
        ListUtil.e(CardType.class, cardType, "annualFeeBasicAmount", parcel.readString());
        ListUtil.e(CardType.class, cardType, "cardGroupType", parcel.readString());
        ListUtil.e(CardType.class, cardType, "annualFeeAddOnDisplayAmount", parcel.readString());
        ListUtil.e(CardType.class, cardType, "cardSlogan", parcel.readString());
        ListUtil.e(CardType.class, cardType, "promotion", parcel.readString());
        fiveItemImmutableList.d(readInt, cardType);
        return cardType;
    }

    public static void write(CardType cardType, Parcel parcel, int i, ListUtil.FiveItemImmutableList fiveItemImmutableList) {
        int c = fiveItemImmutableList.c(cardType);
        if (c != -1) {
            parcel.writeInt(c);
            return;
        }
        fiveItemImmutableList.a.add(cardType);
        parcel.writeInt(fiveItemImmutableList.a.size() - 1);
        parcel.writeString((String) ListUtil.c(CardType.class, cardType, "cardName"));
        parcel.writeString((String) ListUtil.c(CardType.class, cardType, "cardCode"));
        parcel.writeString((String) ListUtil.c(CardType.class, cardType, "cardType"));
        parcel.writeString((String) ListUtil.c(CardType.class, cardType, "incomeAmount"));
        parcel.writeString((String) ListUtil.c(CardType.class, cardType, "incomeDisplayAmount"));
        parcel.writeString((String) ListUtil.c(CardType.class, cardType, "annualFeeBasicDisplayAmount"));
        parcel.writeString((String) ListUtil.c(CardType.class, cardType, "cardImagePath"));
        parcel.writeString((String) ListUtil.c(CardType.class, cardType, "cardImageOrientation"));
        parcel.writeString((String) ListUtil.c(CardType.class, cardType, "cardDescription"));
        parcel.writeInt(((Boolean) ListUtil.c(CardType.class, cardType, "isChecked")).booleanValue() ? 1 : 0);
        if (ListUtil.c(CardType.class, cardType, "benefit") == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(((List) ListUtil.c(CardType.class, cardType, "benefit")).size());
            for (String str : (List) ListUtil.c(CardType.class, cardType, "benefit")) {
                parcel.writeString(str);
            }
        }
        parcel.writeString((String) ListUtil.c(CardType.class, cardType, "annualFeeAddOnAmount"));
        parcel.writeString((String) ListUtil.c(CardType.class, cardType, "cardID"));
        parcel.writeString((String) ListUtil.c(CardType.class, cardType, "annualFeeBasicAmount"));
        parcel.writeString((String) ListUtil.c(CardType.class, cardType, "cardGroupType"));
        parcel.writeString((String) ListUtil.c(CardType.class, cardType, "annualFeeAddOnDisplayAmount"));
        parcel.writeString((String) ListUtil.c(CardType.class, cardType, "cardSlogan"));
        parcel.writeString((String) ListUtil.c(CardType.class, cardType, "promotion"));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public CardType getParcel() {
        return this.cardType$$0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        write(this.cardType$$0, parcel, i, new ListUtil.FiveItemImmutableList());
    }
}
