package o;

import o.CreateQueueReservationResponse$$Parcelable;
import o.getAmountKliring;
/* loaded from: classes-dex2jar.jar:o/getCategoryName.class */
public final class getCategoryName<Model> implements getAmountKliring<Model, Model> {
    private static final getCategoryName<?> a = new getCategoryName<>();

    /* loaded from: classes-dex2jar.jar:o/getCategoryName$read.class */
    static final class read<Model> implements CreateQueueReservationResponse$$Parcelable<Model> {
        private final Model a;

        read(Model model) {
            this.a = model;
        }

        @Override // o.CreateQueueReservationResponse$$Parcelable
        public final void a() {
        }

        @Override // o.CreateQueueReservationResponse$$Parcelable
        public final void a(setCategories setcategories, CreateQueueReservationResponse$$Parcelable.IconCompatParcelizer<? super Model> iconCompatParcelizer) {
            iconCompatParcelizer.a((Model) this.a);
        }

        @Override // o.CreateQueueReservationResponse$$Parcelable
        public final setNextCategoryCd b() {
            return setNextCategoryCd.LOCAL;
        }

        @Override // o.CreateQueueReservationResponse$$Parcelable
        public final void c() {
        }

        @Override // o.CreateQueueReservationResponse$$Parcelable
        public final Class<Model> e() {
            return (Class<Model>) this.a.getClass();
        }
    }

    public static <T> getCategoryName<T> b() {
        return (getCategoryName<T>) a;
    }

    @Override // o.getAmountKliring
    public final boolean a(Model model) {
        return true;
    }

    @Override // o.getAmountKliring
    public final getAmountKliring.write<Model> c(Model model, int i, int i2, CategoryResponse categoryResponse) {
        return new getAmountKliring.write<>(new getReceiverPhone(model), new read(model));
    }
}
