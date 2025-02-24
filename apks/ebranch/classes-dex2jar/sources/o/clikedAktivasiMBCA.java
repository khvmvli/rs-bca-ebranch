package o;

import android.graphics.PointF;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o.onClickUbahCabang;
/* loaded from: classes-dex2jar.jar:o/clikedAktivasiMBCA.class */
public final class clikedAktivasiMBCA implements onFormSuccess<getFloat> {
    public static final clikedAktivasiMBCA b = new clikedAktivasiMBCA();
    private static final onClickUbahCabang$MediaBrowserCompat$CustomActionResultReceiver d = onClickUbahCabang$MediaBrowserCompat$CustomActionResultReceiver.b("c", "v", "i", "o");

    private clikedAktivasiMBCA() {
    }

    @Override // o.onFormSuccess
    public final /* synthetic */ getFloat e(onClickUbahCabang onclickubahcabang, float f) throws IOException {
        if (onclickubahcabang.n() == onClickUbahCabang.RemoteActionCompatParcelizer.BEGIN_ARRAY) {
            onclickubahcabang.e();
        }
        onclickubahcabang.d();
        List<PointF> list = null;
        List<PointF> list2 = null;
        List<PointF> list3 = null;
        boolean z = false;
        while (onclickubahcabang.i()) {
            int a = onclickubahcabang.a(d);
            if (a == 0) {
                z = onclickubahcabang.g();
            } else if (a == 1) {
                list = onBatalTransaksiOrReservasiEvent.a(onclickubahcabang, f);
            } else if (a == 2) {
                list2 = onBatalTransaksiOrReservasiEvent.a(onclickubahcabang, f);
            } else if (a != 3) {
                onclickubahcabang.l();
                onclickubahcabang.m();
            } else {
                list3 = onBatalTransaksiOrReservasiEvent.a(onclickubahcabang, f);
            }
        }
        onclickubahcabang.b();
        if (onclickubahcabang.n() == onClickUbahCabang.RemoteActionCompatParcelizer.END_ARRAY) {
            onclickubahcabang.a();
        }
        if (list == null || list2 == null || list3 == null) {
            throw new IllegalArgumentException("Shape data was missing information.");
        } else if (list.isEmpty()) {
            return new getFloat(new PointF(), false, Collections.emptyList());
        } else {
            int size = list.size();
            PointF pointF = list.get(0);
            ArrayList arrayList = new ArrayList(size);
            for (int i = 1; i < size; i++) {
                PointF pointF2 = list.get(i);
                int i2 = i - 1;
                arrayList.add(new Unbinder$$ExternalSyntheticLambda0(BN6PembayaranActivity.e(list.get(i2), list3.get(i2)), BN6PembayaranActivity.e(pointF2, list2.get(i)), pointF2));
            }
            if (z) {
                PointF pointF3 = list.get(0);
                int i3 = size - 1;
                arrayList.add(new Unbinder$$ExternalSyntheticLambda0(BN6PembayaranActivity.e(list.get(i3), list3.get(i3)), BN6PembayaranActivity.e(pointF3, list2.get(0)), pointF3));
            }
            return new getFloat(pointF, z, arrayList);
        }
    }
}
