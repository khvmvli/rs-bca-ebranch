package o;
/* loaded from: classes-dex2jar.jar:o/setNextCategory.class */
public interface setNextCategory {

    /* loaded from: classes-dex2jar.jar:o/setNextCategory$RemoteActionCompatParcelizer.class */
    public enum RemoteActionCompatParcelizer {
        RUNNING(false),
        PAUSED(false),
        CLEARED(false),
        SUCCESS(true),
        FAILED(true);
        
        final boolean h;

        RemoteActionCompatParcelizer(boolean z) {
            this.h = z;
        }
    }

    boolean a(getNextCategory getnextcategory);

    void b(getNextCategory getnextcategory);

    @Override // o.getNextCategory
    boolean b();

    setNextCategory c();

    boolean c(getNextCategory getnextcategory);

    boolean d(getNextCategory getnextcategory);

    void i(getNextCategory getnextcategory);
}
