package o;

import android.content.Context;
/* loaded from: classes2-dex2jar.jar:o/onClickProvinsi.class */
public final class onClickProvinsi extends onClickKota {
    private read c;

    /* loaded from: classes2-dex2jar.jar:o/onClickProvinsi$read.class */
    public interface read {
        void e(byte[] bArr);
    }

    public onClickProvinsi(Context context, read read2) {
        super(context);
        this.c = read2;
    }

    @Override // o.onClickKota
    public final void e(byte[] bArr) {
        read read2 = this.c;
        if (read2 != null) {
            read2.e(bArr);
        }
    }
}
