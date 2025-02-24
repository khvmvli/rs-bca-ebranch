package o;

import java.io.IOException;
import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/onChooseAvailableDate.class */
public final class onChooseAvailableDate {
    private static onClickUbahCabang$MediaBrowserCompat$CustomActionResultReceiver e = onClickUbahCabang$MediaBrowserCompat$CustomActionResultReceiver.b("nm", "hd", "it");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static setViewPager b(onClickUbahCabang onclickubahcabang, BindAnim bindAnim) throws IOException {
        ArrayList arrayList = new ArrayList();
        String str = null;
        boolean z = false;
        while (onclickubahcabang.i()) {
            int a = onclickubahcabang.a(e);
            if (a == 0) {
                str = onclickubahcabang.k();
            } else if (a == 1) {
                z = onclickubahcabang.g();
            } else if (a != 2) {
                onclickubahcabang.m();
            } else {
                onclickubahcabang.e();
                while (onclickubahcabang.i()) {
                    name a2 = setOutlineMasksAndMattes.a(onclickubahcabang, bindAnim);
                    if (a2 != null) {
                        arrayList.add(a2);
                    }
                }
                onclickubahcabang.a();
            }
        }
        return new setViewPager(str, arrayList, z);
    }
}
