package o;

import com.google.android.gms.internal.measurement.zzkn;
import com.google.android.gms.internal.measurement.zzmg;
import java.io.IOException;
import o.setFlagOtherCC;
import o.setHmKecamatan;
/* loaded from: classes-dex2jar.jar:o/setFlagOtherCC.class */
public class setFlagOtherCC<MessageType extends setHmKecamatan<MessageType, BuilderType>, BuilderType extends setFlagOtherCC<MessageType, BuilderType>> extends setCcOtherBankCreditCards<MessageType, BuilderType> {
    protected MessageType b;
    protected boolean c = false;
    private final MessageType d;

    public setFlagOtherCC(MessageType messagetype) {
        this.d = messagetype;
        this.b = (MessageType) ((setHmKecamatan) messagetype.e(4, null, null));
    }

    private static final void b(MessageType messagetype, MessageType messagetype2) {
        realmGet$cardType.d().b(messagetype.getClass()).e(messagetype, messagetype2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.setCcOtherBankCreditCards
    protected final /* synthetic */ setCcOtherBankCreditCards b(setBcaDebitCardType setbcadebitcardtype) {
        e((setHmKecamatan) setbcadebitcardtype);
        return this;
    }

    @Override // o.setCcOtherBankCreditCards
    public final /* synthetic */ setCcOtherBankCreditCards b(byte[] bArr, int i, int i2, setEmergencyContactPhoneNumber setemergencycontactphonenumber) throws zzkn {
        d(bArr, 0, i2, setemergencycontactphonenumber);
        return this;
    }

    @Override // o.setCcOtherBankCreditCards
    public final /* synthetic */ setCcOtherBankCreditCards d(byte[] bArr, int i, int i2) throws zzkn {
        d(bArr, 0, i2, setEmergencyContactPhoneNumber.c());
        return this;
    }

    public final BuilderType d(byte[] bArr, int i, int i2, setEmergencyContactPhoneNumber setemergencycontactphonenumber) throws zzkn {
        if (this.c) {
            u();
            this.c = false;
        }
        try {
            realmGet$cardType.d().b(this.b.getClass()).c(this.b, bArr, 0, i2, new setCreditCardSupplements(setemergencycontactphonenumber));
            return this;
        } catch (zzkn e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
        } catch (IndexOutOfBoundsException e3) {
            throw zzkn.a();
        }
    }

    public final BuilderType e(MessageType messagetype) {
        if (this.c) {
            u();
            this.c = false;
        }
        b(this.b, messagetype);
        return this;
    }

    @Override // o.realmGet$cardSlogan
    public final /* bridge */ /* synthetic */ realmGet$cardDescription l_() {
        return this.d;
    }

    public void u() {
        MessageType messagetype = (MessageType) ((setHmKecamatan) this.b.e(4, null, null));
        b(messagetype, this.b);
        this.b = messagetype;
    }

    public final MessageType v() {
        MessageType w = x();
        Boolean bool = Boolean.TRUE;
        boolean z = true;
        byte byteValue = ((Byte) w.e(1, null, null)).byteValue();
        if (byteValue != 1) {
            if (byteValue == 0) {
                z = false;
            } else {
                z = realmGet$cardType.d().b(w.getClass()).d(w);
                w.e(2, true != z ? null : w, null);
            }
        }
        if (z) {
            return w;
        }
        throw new zzmg(w);
    }

    /* renamed from: w */
    public MessageType x() {
        if (this.c) {
            return this.b;
        }
        MessageType messagetype = this.b;
        realmGet$cardType.d().b(messagetype.getClass()).b(messagetype);
        this.c = true;
        return this.b;
    }

    /* renamed from: y */
    public final BuilderType t() {
        BuilderType buildertype = (BuilderType) ((setFlagOtherCC) this.d.e(5, null, null));
        buildertype.e(x());
        return buildertype;
    }
}
