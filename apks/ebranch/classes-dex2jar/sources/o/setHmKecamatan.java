package o;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import o.setFlagOtherCC;
import o.setHmKecamatan;
/* loaded from: classes-dex2jar.jar:o/setHmKecamatan.class */
public abstract class setHmKecamatan<MessageType extends setHmKecamatan<MessageType, BuilderType>, BuilderType extends setFlagOtherCC<MessageType, BuilderType>> extends setBcaDebitCardType<MessageType, BuilderType> {
    private static final Map<Object, setHmKecamatan<?, ?>> zza = new ConcurrentHashMap();
    protected getSupplementCardLimit zzc = getSupplementCardLimit.a();
    protected int zzd = -1;

    public static <T extends setHmKecamatan> void a(Class<T> cls, T t) {
        zza.put(cls, t);
    }

    protected static setIdentityCardImg ai() {
        return setIdentityCardNumber.e();
    }

    protected static setNpwpImg al() {
        return setTotalDependent.e();
    }

    public static <E> setMonthlyIncome<E> aq() {
        return realmGet$incomeDisplayAmount.e();
    }

    protected static Object b(realmGet$cardDescription realmget_carddescription, String str, Object[] objArr) {
        return new realmGet$incomeAmount(realmget_carddescription, str, objArr);
    }

    public static Object c(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }

    public static setNpwpImg c(setNpwpImg setnpwpimg) {
        int size = setnpwpimg.size();
        return setnpwpimg.a(size == 0 ? 10 : size + size);
    }

    public static <T extends setHmKecamatan> T d(Class<T> cls) {
        Map<Object, setHmKecamatan<?, ?>> map = zza;
        setHmKecamatan<?, ?> sethmkecamatan = map.get(cls);
        setHmKecamatan<?, ?> sethmkecamatan2 = sethmkecamatan;
        if (sethmkecamatan == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                sethmkecamatan2 = map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        setHmKecamatan<?, ?> sethmkecamatan3 = sethmkecamatan2;
        if (sethmkecamatan2 == null) {
            sethmkecamatan3 = (setHmKecamatan) ((setHmKecamatan) realmGet$jobSector.e(cls)).e(6, null, null);
            if (sethmkecamatan3 != null) {
                map.put(cls, sethmkecamatan3);
            } else {
                throw new IllegalStateException();
            }
        }
        return sethmkecamatan3;
    }

    public static <E> setMonthlyIncome<E> d(setMonthlyIncome<E> setmonthlyincome) {
        int size = setmonthlyincome.size();
        return setmonthlyincome.e(size == 0 ? 10 : size + size);
    }

    @Override // o.setBcaDebitCardType
    public final int ak() {
        return this.zzd;
    }

    public final BuilderType an() {
        BuilderType buildertype = (BuilderType) ((setFlagOtherCC) e(5, null, null));
        buildertype.e(this);
        return buildertype;
    }

    @Override // o.realmGet$cardDescription
    public final /* synthetic */ realmGet$cardGroupType ao() {
        setFlagOtherCC setflagothercc = (setFlagOtherCC) e(5, null, null);
        setflagothercc.e(this);
        return setflagothercc;
    }

    @Override // o.realmGet$cardDescription
    public final /* synthetic */ realmGet$cardGroupType ap() {
        return (setFlagOtherCC) e(5, null, null);
    }

    public final <MessageType extends setHmKecamatan<MessageType, BuilderType>, BuilderType extends setFlagOtherCC<MessageType, BuilderType>> BuilderType ar() {
        return (BuilderType) ((setFlagOtherCC) e(5, null, null));
    }

    @Override // o.realmGet$cardDescription
    public final int au() {
        int i = this.zzd;
        int i2 = i;
        if (i == -1) {
            i2 = realmGet$cardType.d().b(getClass()).c(this);
            this.zzd = i2;
        }
        return i2;
    }

    @Override // o.realmGet$cardDescription
    public final void d(setCustomerName setcustomername) throws IOException {
        realmGet$cardType.d().b(getClass()).b(this, setEmergencyContactOfficeExt.c(setcustomername));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract Object e(int i, Object obj, Object obj2);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return realmGet$cardType.d().b(getClass()).a(this, (setHmKecamatan) obj);
        }
        return false;
    }

    @Override // o.setBcaDebitCardType
    public final void g(int i) {
        this.zzd = i;
    }

    public final int hashCode() {
        int i = this.zzb;
        if (i != 0) {
            return i;
        }
        int a = realmGet$cardType.d().b(getClass()).a(this);
        this.zzb = a;
        return a;
    }

    @Override // o.realmGet$cardSlogan
    public final /* synthetic */ realmGet$cardDescription l_() {
        return (setHmKecamatan) e(6, null, null);
    }

    public final String toString() {
        return realmGet$cardImageOrientation.e(this, toString());
    }
}
