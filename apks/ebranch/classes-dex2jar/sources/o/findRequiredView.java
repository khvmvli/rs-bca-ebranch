package o;
/* loaded from: classes-dex2jar.jar:o/findRequiredView.class */
public final class findRequiredView {
    public final boolean a;
    public final size b;
    public final write c;
    public final callbacks e;

    /* loaded from: classes-dex2jar.jar:o/findRequiredView$write.class */
    public enum write {
        MASK_MODE_ADD,
        MASK_MODE_SUBTRACT,
        MASK_MODE_INTERSECT,
        MASK_MODE_NONE
    }

    public findRequiredView(write write2, callbacks callbacks, size size, boolean z) {
        this.c = write2;
        this.e = callbacks;
        this.b = size;
        this.a = z;
    }
}
