package o;

import o.OnPageChange;
/* loaded from: classes-dex2jar.jar:o/onClickBcaMobile.class */
public class onClickBcaMobile<T> {
    public OnPageChange.Callback<?, ?> c;
    protected T d;
    public final onPaid<T> e;

    public onClickBcaMobile() {
        this.e = new onPaid<>();
        this.d = null;
    }

    public onClickBcaMobile(T t) {
        this.e = new onPaid<>();
        this.d = t;
    }

    public T b(onPaid<T> onpaid) {
        return this.d;
    }
}
