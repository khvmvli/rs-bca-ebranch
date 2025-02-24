package o;
/* loaded from: classes2-dex2jar.jar:o/CC28FormKartuKreditFragment_ViewBinding.class */
public enum CC28FormKartuKreditFragment_ViewBinding {
    NO_CACHE(1),
    NO_STORE(2),
    OFFLINE(4);
    
    final int a;

    CC28FormKartuKreditFragment_ViewBinding(int i) {
        this.a = i;
    }

    public static boolean a(int i) {
        return (i & OFFLINE.a) != 0;
    }

    public static boolean c(int i) {
        return (i & NO_STORE.a) == 0;
    }

    public static boolean e(int i) {
        return (i & NO_CACHE.a) == 0;
    }
}
