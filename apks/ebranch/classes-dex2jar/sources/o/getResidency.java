package o;

import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import o.onFindViewById;
import o.setPhoneID;
/* loaded from: classes-dex2jar.jar:o/getResidency.class */
public final class getResidency<Data, ResourceType, Transcode> {
    private final onFindViewById.write<List<Throwable>> a;
    private final Class<Data> b;
    private final List<? extends setPhoneID<Data, ResourceType, Transcode>> c;
    private final String d;

    public getResidency(Class<Data> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<setPhoneID<Data, ResourceType, Transcode>> list, onFindViewById.write<List<Throwable>> write) {
        this.b = cls;
        this.a = write;
        if (!list.isEmpty()) {
            this.c = list;
            StringBuilder sb = new StringBuilder("Failed LoadPath{");
            sb.append(cls.getSimpleName());
            sb.append("->");
            sb.append(cls2.getSimpleName());
            sb.append("->");
            sb.append(cls3.getSimpleName());
            sb.append("}");
            this.d = sb.toString();
            return;
        }
        throw new IllegalArgumentException("Must not be empty.");
    }

    private setIbanFlag<Transcode> b(setReservationTime<Data> setreservationtime, CategoryResponse categoryResponse, int i, int i2, setPhoneID.RemoteActionCompatParcelizer<ResourceType> remoteActionCompatParcelizer, List<Throwable> list) throws GlideException {
        setIbanFlag<Transcode> setibanflag;
        int size = this.c.size();
        setIbanFlag<Transcode> setibanflag2 = null;
        int i3 = 0;
        while (true) {
            setibanflag = setibanflag2;
            if (i3 >= size) {
                break;
            }
            setPhoneID setphoneid = (setPhoneID) this.c.get(i3);
            try {
                setibanflag2 = setphoneid.e.e(remoteActionCompatParcelizer.d(setphoneid.e(setreservationtime, i, i2, categoryResponse)), categoryResponse);
            } catch (GlideException e) {
                list.add(e);
            }
            if (setibanflag2 != null) {
                setibanflag = setibanflag2;
                break;
            }
            i3++;
        }
        if (setibanflag != null) {
            return setibanflag;
        }
        throw new GlideException(this.d, new ArrayList(list));
    }

    public final setIbanFlag<Transcode> b(setReservationTime<Data> setreservationtime, CategoryResponse categoryResponse, int i, int i2, setPhoneID.RemoteActionCompatParcelizer<ResourceType> remoteActionCompatParcelizer) throws GlideException {
        List<Throwable> a = this.a.a();
        if (a != null) {
            List<Throwable> list = a;
            try {
                return b(setreservationtime, categoryResponse, i, i2, remoteActionCompatParcelizer, list);
            } finally {
                this.a.c(list);
            }
        } else {
            throw new NullPointerException("Argument must not be null");
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LoadPath{decodePaths=");
        sb.append(Arrays.toString(this.c.toArray()));
        sb.append('}');
        return sb.toString();
    }
}
