package o;

import com.google.android.gms.internal.measurement.zzkn;
import o.setBcaDebitCardType;
import o.setCcOtherBankCreditCards;
/* loaded from: classes-dex2jar.jar:o/setCcOtherBankCreditCards.class */
public abstract class setCcOtherBankCreditCards<MessageType extends setBcaDebitCardType<MessageType, BuilderType>, BuilderType extends setCcOtherBankCreditCards<MessageType, BuilderType>> implements realmGet$cardGroupType {
    @Override // o.realmGet$cardGroupType
    public final /* synthetic */ realmGet$cardGroupType a(byte[] bArr) throws zzkn {
        return d(bArr, 0, bArr.length);
    }

    protected abstract BuilderType b(MessageType messagetype);

    public BuilderType b(byte[] bArr, int i, int i2, setEmergencyContactPhoneNumber setemergencycontactphonenumber) throws zzkn {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.realmGet$cardGroupType
    public final /* synthetic */ realmGet$cardGroupType d(realmGet$cardDescription realmget_carddescription) {
        if (l_().getClass().isInstance(realmget_carddescription)) {
            return b((setBcaDebitCardType) realmget_carddescription);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    @Override // o.realmGet$cardGroupType
    public final /* synthetic */ realmGet$cardGroupType d(byte[] bArr, setEmergencyContactPhoneNumber setemergencycontactphonenumber) throws zzkn {
        return b(bArr, 0, bArr.length, setemergencycontactphonenumber);
    }

    public BuilderType d(byte[] bArr, int i, int i2) throws zzkn {
        throw null;
    }

    /* renamed from: t */
    public abstract BuilderType clone();
}
