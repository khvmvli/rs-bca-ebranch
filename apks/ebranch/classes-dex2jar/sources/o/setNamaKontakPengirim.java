package o;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;
/* loaded from: classes-dex2jar.jar:o/setNamaKontakPengirim.class */
public final class setNamaKontakPengirim implements DynamiteModule.RemoteActionCompatParcelizer.IconCompatParcelizer {
    private final int a;

    public setNamaKontakPengirim(int i, int i2) {
        this.a = i;
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.RemoteActionCompatParcelizer.IconCompatParcelizer
    public final int d(Context context, String str) {
        return this.a;
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.RemoteActionCompatParcelizer.IconCompatParcelizer
    public final int d(Context context, String str, boolean z) {
        return 0;
    }
}
