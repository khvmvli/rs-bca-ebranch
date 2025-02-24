package o;
/* loaded from: classes-dex2jar.jar:o/CreateQueueReservationResponse$$Parcelable.class */
public interface CreateQueueReservationResponse$$Parcelable<T> {

    /* loaded from: classes-dex2jar.jar:o/CreateQueueReservationResponse$$Parcelable$IconCompatParcelizer.class */
    public interface IconCompatParcelizer<T> {
        void a(T t);

        void b(Exception exc);
    }

    void a();

    void a(setCategories setcategories, IconCompatParcelizer<? super T> iconCompatParcelizer);

    setNextCategoryCd b();

    void c();

    Class<T> e();
}
