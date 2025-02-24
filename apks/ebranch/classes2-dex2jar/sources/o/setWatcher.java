package o;

import java.util.NoSuchElementException;
/* loaded from: classes2-dex2jar.jar:o/setWatcher.class */
public final class setWatcher extends clickSimpanNama {
    private int b;
    private final int c;
    private boolean d;
    private final int e;

    public setWatcher(int i, int i2, int i3) {
        this.e = i3;
        this.c = i2;
        boolean z = i3 <= 0 ? i >= i2 : i <= i2;
        this.d = z;
        this.b = !z ? i2 : i;
    }

    @Override // o.clickSimpanNama
    public final int c() {
        int i = this.b;
        if (i != this.c) {
            this.b = this.e + i;
        } else if (this.d) {
            this.d = false;
        } else {
            throw new NoSuchElementException();
        }
        return i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.d;
    }
}
