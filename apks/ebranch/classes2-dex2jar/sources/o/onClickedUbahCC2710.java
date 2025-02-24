package o;
/* loaded from: classes2-dex2jar.jar:o/onClickedUbahCC2710.class */
public abstract class onClickedUbahCC2710<T> extends onClickUbahDataLainnya<T, Float> {
    public onClickedUbahCC2710(String str) {
        super(Float.class, str);
    }

    public abstract void a(T t, float f);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.onClickUbahDataLainnya
    public final /* synthetic */ void c(Object obj, Float f) {
        a(obj, f.floatValue());
    }
}
