package o;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import o.setBcaDebitCardType;
import o.setCcOtherBankCreditCards;
/* loaded from: classes-dex2jar.jar:o/setBcaDebitCardType.class */
public abstract class setBcaDebitCardType<MessageType extends setBcaDebitCardType<MessageType, BuilderType>, BuilderType extends setCcOtherBankCreditCards<MessageType, BuilderType>> implements realmGet$cardDescription {
    protected int zzb = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void a(Iterable<T> iterable, List<? super T> list) {
        setNationality.c(iterable);
        if (iterable instanceof setReferalCode) {
            List<?> d = ((setReferalCode) iterable).d();
            setReferalCode setreferalcode = (setReferalCode) list;
            int size = list.size();
            for (Object obj : d) {
                if (obj == null) {
                    int size2 = setreferalcode.size();
                    StringBuilder sb = new StringBuilder(37);
                    sb.append("Element at index ");
                    sb.append(size2 - size);
                    sb.append(" is null.");
                    String sb2 = sb.toString();
                    int size3 = setreferalcode.size();
                    while (true) {
                        size3--;
                        if (size3 < size) {
                            break;
                        }
                        setreferalcode.remove(size3);
                    }
                    throw new NullPointerException(sb2);
                } else if (obj instanceof setCurrOfficePostCode) {
                    setreferalcode.b((setCurrOfficePostCode) obj);
                } else {
                    setreferalcode.add((String) obj);
                }
            }
        } else if (!(iterable instanceof realmSet$annualFeeAddOnAmount)) {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + iterable.size());
            }
            int size4 = list.size();
            for (T t : iterable) {
                if (t == 0) {
                    int size5 = list.size();
                    StringBuilder sb3 = new StringBuilder(37);
                    sb3.append("Element at index ");
                    sb3.append(size5 - size4);
                    sb3.append(" is null.");
                    String sb4 = sb3.toString();
                    int size6 = list.size();
                    while (true) {
                        size6--;
                        if (size6 < size4) {
                            break;
                        }
                        list.remove(size6);
                    }
                    throw new NullPointerException(sb4);
                }
                list.add(t);
            }
        } else {
            list.addAll(iterable);
        }
    }

    @Override // o.realmGet$cardDescription
    public final setCurrOfficePostCode aj() {
        try {
            int au = au();
            setCurrOfficePostCode setcurrofficepostcode = setCurrOfficePostCode.a;
            byte[] bArr = new byte[au];
            setCustomerName c = setCustomerName.c(bArr);
            d(c);
            c.b();
            return new setCurrOfficePhoneNumber(bArr);
        } catch (IOException e) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 72);
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ByteString threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    public int ak() {
        throw null;
    }

    public final byte[] am() {
        try {
            byte[] bArr = new byte[au()];
            setCustomerName c = setCustomerName.c(bArr);
            d(c);
            c.b();
            return bArr;
        } catch (IOException e) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 72);
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a byte array threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    public void g(int i) {
        throw null;
    }
}
