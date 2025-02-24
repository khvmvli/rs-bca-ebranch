package o;

import android.util.Log;
import com.bumptech.glide.load.engine.GlideException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import o.onFindViewById;
/* loaded from: classes-dex2jar.jar:o/setPhoneID.class */
public final class setPhoneID<DataType, ResourceType, Transcode> {
    private final List<? extends CategoryResponse$$Parcelable<DataType, ResourceType>> a;
    private final String b;
    private final onFindViewById.write<List<Throwable>> c;
    private final Class<DataType> d;
    final setEmergencyCloseStartDate<ResourceType, Transcode> e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/setPhoneID$RemoteActionCompatParcelizer.class */
    public interface RemoteActionCompatParcelizer<ResourceType> {
        setIbanFlag<ResourceType> d(setIbanFlag<ResourceType> setibanflag);
    }

    public setPhoneID(Class<DataType> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<? extends CategoryResponse$$Parcelable<DataType, ResourceType>> list, setEmergencyCloseStartDate<ResourceType, Transcode> setemergencyclosestartdate, onFindViewById.write<List<Throwable>> write) {
        this.d = cls;
        this.a = list;
        this.e = setemergencyclosestartdate;
        this.c = write;
        StringBuilder sb = new StringBuilder("Failed DecodePath{");
        sb.append(cls.getSimpleName());
        sb.append("->");
        sb.append(cls2.getSimpleName());
        sb.append("->");
        sb.append(cls3.getSimpleName());
        sb.append("}");
        this.b = sb.toString();
    }

    private setIbanFlag<ResourceType> d(setReservationTime<DataType> setreservationtime, int i, int i2, CategoryResponse categoryResponse, List<Throwable> list) throws GlideException {
        setIbanFlag<ResourceType> setibanflag;
        int size = this.a.size();
        setIbanFlag<ResourceType> setibanflag2 = null;
        int i3 = 0;
        while (true) {
            setibanflag = setibanflag2;
            if (i3 >= size) {
                break;
            }
            CategoryResponse$$Parcelable categoryResponse$$Parcelable = (CategoryResponse$$Parcelable) this.a.get(i3);
            setIbanFlag<ResourceType> setibanflag3 = setibanflag2;
            try {
                if (categoryResponse$$Parcelable.a(setreservationtime.a(), categoryResponse)) {
                    setibanflag3 = categoryResponse$$Parcelable.d(setreservationtime.a(), i, i2, categoryResponse);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e) {
                if (Log.isLoggable("DecodePath", 2)) {
                    StringBuilder sb = new StringBuilder("Failed to decode data for ");
                    sb.append(categoryResponse$$Parcelable);
                    Log.v("DecodePath", sb.toString(), e);
                }
                list.add(e);
                setibanflag3 = setibanflag2;
            }
            setibanflag = setibanflag3;
            if (setibanflag3 != null) {
                break;
            }
            i3++;
            setibanflag2 = setibanflag3;
        }
        if (setibanflag != null) {
            return setibanflag;
        }
        throw new GlideException(this.b, new ArrayList(list));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public setIbanFlag<ResourceType> e(setReservationTime<DataType> setreservationtime, int i, int i2, CategoryResponse categoryResponse) throws GlideException {
        List<Throwable> a = this.c.a();
        if (a != null) {
            List<Throwable> list = a;
            try {
                return d(setreservationtime, i, i2, categoryResponse, list);
            } finally {
                this.c.c(list);
            }
        } else {
            throw new NullPointerException("Argument must not be null");
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DecodePath{ dataClass=");
        sb.append(this.d);
        sb.append(", decoders=");
        sb.append(this.a);
        sb.append(", transcoder=");
        sb.append(this.e);
        sb.append('}');
        return sb.toString();
    }
}
