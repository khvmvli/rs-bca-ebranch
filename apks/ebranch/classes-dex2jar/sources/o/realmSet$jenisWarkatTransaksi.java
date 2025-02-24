package o;

import android.os.IBinder;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.lang.reflect.Field;
/* loaded from: classes-dex2jar.jar:o/realmSet$jenisWarkatTransaksi.class */
public final class realmSet$jenisWarkatTransaksi<T> extends realmSet$noHpKontakPengirim$MediaBrowserCompat$CustomActionResultReceiver {
    private final Object a;

    public realmSet$jenisWarkatTransaksi(Object obj) {
        this.a = obj;
    }

    public static <T> realmSet$noHpKontakPengirim d(T t) {
        return new realmSet$jenisWarkatTransaksi(t);
    }

    @ResultIgnorabilityUnspecified
    public static <T> T e(realmSet$noHpKontakPengirim realmset_nohpkontakpengirim) {
        if (realmset_nohpkontakpengirim instanceof realmSet$jenisWarkatTransaksi) {
            return (T) ((realmSet$jenisWarkatTransaksi) realmset_nohpkontakpengirim).a;
        }
        IBinder asBinder = realmset_nohpkontakpengirim.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i = 0;
        for (Field field2 : declaredFields) {
            i = i;
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i != 1) {
            int length = declaredFields.length;
            StringBuilder sb = new StringBuilder("Unexpected number of IObjectWrapper declared fields: ");
            sb.append(length);
            throw new IllegalArgumentException(sb.toString());
        } else if (field == null) {
            throw new NullPointerException("null reference");
        } else if (!field.isAccessible()) {
            field.setAccessible(true);
            try {
                return (T) field.get(asBinder);
            } catch (IllegalAccessException e) {
                throw new IllegalArgumentException("Could not access the field in remoteBinder.", e);
            } catch (NullPointerException e2) {
                throw new IllegalArgumentException("Binder object is null.", e2);
            }
        } else {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
    }
}
