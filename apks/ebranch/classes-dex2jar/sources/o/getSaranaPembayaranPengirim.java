package o;

import android.os.SystemClock;
/* loaded from: classes-dex2jar.jar:o/getSaranaPembayaranPengirim.class */
public final class getSaranaPembayaranPengirim implements getNoTelpKontakPengirim {
    public static final getSaranaPembayaranPengirim d = new getSaranaPembayaranPengirim();

    private getSaranaPembayaranPengirim() {
    }

    public static getNoTelpKontakPengirim a() {
        return d;
    }

    @Override // o.getNoTelpKontakPengirim
    public final long b() {
        return SystemClock.elapsedRealtime();
    }

    @Override // o.getNoTelpKontakPengirim
    public final long c() {
        return System.nanoTime();
    }

    @Override // o.getNoTelpKontakPengirim
    public final long e() {
        return System.currentTimeMillis();
    }
}
