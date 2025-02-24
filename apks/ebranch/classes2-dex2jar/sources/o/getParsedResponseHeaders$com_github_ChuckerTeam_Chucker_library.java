package o;
/* loaded from: classes2-dex2jar.jar:o/getParsedResponseHeaders$com_github_ChuckerTeam_Chucker_library.class */
public final class getParsedResponseHeaders$com_github_ChuckerTeam_Chucker_library<T> {
    private Object[] b = new Object[16];
    public int c;
    public int d;

    private final void c() {
        Object[] objArr = this.b;
        int length = objArr.length;
        Object[] objArr2 = new Object[length << 1];
        Page6MLFragment.c(objArr, objArr2, 0, this.c, 0, 10);
        Object[] objArr3 = this.b;
        int length2 = objArr3.length;
        int i = this.c;
        Page6MLFragment.c(objArr3, objArr2, length2 - i, 0, i, 4);
        this.b = objArr2;
        this.c = 0;
        this.d = length;
    }

    public final T b() {
        int i = this.c;
        if (i == this.d) {
            return null;
        }
        Object[] objArr = this.b;
        T t = (T) objArr[i];
        objArr[i] = null;
        this.c = (i + 1) & (objArr.length - 1);
        if (t != null) {
            return t;
        }
        throw new NullPointerException("null cannot be cast to non-null type T of kotlinx.coroutines.internal.ArrayQueue");
    }

    public final void d(T t) {
        Object[] objArr = this.b;
        int i = this.d;
        objArr[i] = t;
        int length = (objArr.length - 1) & (i + 1);
        this.d = length;
        if (length == this.c) {
            c();
        }
    }
}
