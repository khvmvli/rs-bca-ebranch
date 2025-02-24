package o;

import java.util.Collections;
import java.util.List;
/* loaded from: classes-dex2jar.jar:o/getAmountKliring.class */
public interface getAmountKliring<Model, Data> {

    /* loaded from: classes-dex2jar.jar:o/getAmountKliring$write.class */
    public static final class write<Data> {
        public final CreateQueueReservationResponse$$Parcelable<Data> a;
        public final setCode b;
        public final List<setCode> c;

        private write(setCode setcode, List<setCode> list, CreateQueueReservationResponse$$Parcelable<Data> createQueueReservationResponse$$Parcelable) {
            if (setcode != null) {
                this.b = setcode;
                if (list != null) {
                    this.c = list;
                    if (createQueueReservationResponse$$Parcelable != null) {
                        this.a = createQueueReservationResponse$$Parcelable;
                        return;
                    }
                    throw new NullPointerException("Argument must not be null");
                }
                throw new NullPointerException("Argument must not be null");
            }
            throw new NullPointerException("Argument must not be null");
        }

        public write(setCode setcode, CreateQueueReservationResponse$$Parcelable<Data> createQueueReservationResponse$$Parcelable) {
            this(setcode, Collections.emptyList(), createQueueReservationResponse$$Parcelable);
        }
    }

    boolean a(Model model);

    write<Data> c(Model model, int i, int i2, CategoryResponse categoryResponse);
}
