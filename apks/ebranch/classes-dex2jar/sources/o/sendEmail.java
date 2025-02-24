package o;

import android.graphics.Rect;
import io.realm.CollectionUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o.Unbinder;
/* loaded from: classes-dex2jar.jar:o/sendEmail.class */
public final class sendEmail {
    private static final onClickUbahCabang$MediaBrowserCompat$CustomActionResultReceiver b = onClickUbahCabang$MediaBrowserCompat$CustomActionResultReceiver.b("w", "h", "ip", "op", "fr", "v", "layers", "assets", "fonts", "chars", "markers");
    static onClickUbahCabang$MediaBrowserCompat$CustomActionResultReceiver a = onClickUbahCabang$MediaBrowserCompat$CustomActionResultReceiver.b("id", "layers", "w", "h", "p", "u");
    private static final onClickUbahCabang$MediaBrowserCompat$CustomActionResultReceiver c = onClickUbahCabang$MediaBrowserCompat$CustomActionResultReceiver.b(CollectionUtils.LIST_TYPE);
    private static final onClickUbahCabang$MediaBrowserCompat$CustomActionResultReceiver d = onClickUbahCabang$MediaBrowserCompat$CustomActionResultReceiver.b("cm", "tm", "dr");

    public static BindAnim a(onClickUbahCabang onclickubahcabang) throws IOException {
        float d2 = copyNoRef.d();
        setTrackDrawable<setCentered> settrackdrawable = new setTrackDrawable<>();
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        setTrackTintList<Unbinder._CC> settracktintlist = new setTrackTintList<>();
        BindAnim bindAnim = new BindAnim();
        onclickubahcabang.d();
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        int i = 0;
        int i2 = 0;
        while (onclickubahcabang.i()) {
            switch (onclickubahcabang.a(b)) {
                case 0:
                    i = onclickubahcabang.j();
                    break;
                case 1:
                    i2 = onclickubahcabang.j();
                    break;
                case 2:
                    f = (float) onclickubahcabang.h();
                    break;
                case 3:
                    f2 = ((float) onclickubahcabang.h()) - 0.01f;
                    break;
                case 4:
                    f3 = (float) onclickubahcabang.h();
                    break;
                case 5:
                    String[] split = onclickubahcabang.k().split("\\.");
                    if (copyNoRef.e(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]), 4, 4, 0)) {
                        break;
                    } else {
                        AvailableBookingTimeActivity_ViewBinding.b("Lottie only supports bodymovin >= 4.4.0");
                        bindAnim.m.add("Lottie only supports bodymovin >= 4.4.0");
                        break;
                    }
                case 6:
                    d(onclickubahcabang, bindAnim, arrayList, settrackdrawable);
                    break;
                case 7:
                    a(onclickubahcabang, bindAnim, hashMap, hashMap2);
                    break;
                case 8:
                    c(onclickubahcabang, hashMap3);
                    break;
                case 9:
                    e(onclickubahcabang, bindAnim, settracktintlist);
                    break;
                case 10:
                    d(onclickubahcabang, arrayList2);
                    break;
                default:
                    onclickubahcabang.l();
                    onclickubahcabang.m();
                    break;
            }
        }
        bindAnim.c = new Rect(0, 0, (int) (((float) i) * d2), (int) (((float) i2) * d2));
        bindAnim.l = f;
        bindAnim.d = f2;
        bindAnim.a = f3;
        bindAnim.g = arrayList;
        bindAnim.j = settrackdrawable;
        bindAnim.k = hashMap;
        bindAnim.i = hashMap2;
        bindAnim.e = settracktintlist;
        bindAnim.b = hashMap3;
        bindAnim.h = arrayList2;
        return bindAnim;
    }

    private static void a(onClickUbahCabang onclickubahcabang, BindAnim bindAnim, Map<String, List<setCentered>> map, Map<String, BindColor> map2) throws IOException {
        onclickubahcabang.e();
        while (onclickubahcabang.i()) {
            ArrayList arrayList = new ArrayList();
            setTrackDrawable settrackdrawable = new setTrackDrawable();
            onclickubahcabang.d();
            String str = null;
            String str2 = null;
            String str3 = null;
            int i = 0;
            int i2 = 0;
            while (onclickubahcabang.i()) {
                int a2 = onclickubahcabang.a(a);
                if (a2 == 0) {
                    str = onclickubahcabang.k();
                } else if (a2 == 1) {
                    onclickubahcabang.e();
                    while (onclickubahcabang.i()) {
                        setCentered c2 = selesai.c(onclickubahcabang, bindAnim);
                        settrackdrawable.c(c2.f, c2);
                        arrayList.add(c2);
                    }
                    onclickubahcabang.a();
                } else if (a2 == 2) {
                    i = onclickubahcabang.j();
                } else if (a2 == 3) {
                    i2 = onclickubahcabang.j();
                } else if (a2 == 4) {
                    str2 = onclickubahcabang.k();
                } else if (a2 != 5) {
                    onclickubahcabang.l();
                    onclickubahcabang.m();
                } else {
                    str3 = onclickubahcabang.k();
                }
            }
            onclickubahcabang.b();
            if (str2 != null) {
                BindColor bindColor = new BindColor(i, i2, str, str2, str3);
                map2.put(bindColor.b, bindColor);
            } else {
                map.put(str, arrayList);
            }
        }
        onclickubahcabang.a();
    }

    private static void c(onClickUbahCabang onclickubahcabang, Map<String, ViewCollections> map) throws IOException {
        onclickubahcabang.d();
        while (onclickubahcabang.i()) {
            if (onclickubahcabang.a(c) != 0) {
                onclickubahcabang.l();
                onclickubahcabang.m();
            } else {
                onclickubahcabang.e();
                while (onclickubahcabang.i()) {
                    ViewCollections a2 = App.a(onclickubahcabang);
                    map.put(a2.b, a2);
                }
                onclickubahcabang.a();
            }
        }
        onclickubahcabang.b();
    }

    private static void d(onClickUbahCabang onclickubahcabang, List<C0013onClick> list) throws IOException {
        onclickubahcabang.e();
        while (onclickubahcabang.i()) {
            onclickubahcabang.d();
            String str = null;
            float f = 0.0f;
            float f2 = 0.0f;
            while (onclickubahcabang.i()) {
                int a2 = onclickubahcabang.a(d);
                if (a2 == 0) {
                    str = onclickubahcabang.k();
                } else if (a2 == 1) {
                    f = (float) onclickubahcabang.h();
                } else if (a2 != 2) {
                    onclickubahcabang.l();
                    onclickubahcabang.m();
                } else {
                    f2 = (float) onclickubahcabang.h();
                }
            }
            onclickubahcabang.b();
            list.add(new C0013onClick(str, f, f2));
        }
        onclickubahcabang.a();
    }

    private static void d(onClickUbahCabang onclickubahcabang, BindAnim bindAnim, List<setCentered> list, setTrackDrawable<setCentered> settrackdrawable) throws IOException {
        onclickubahcabang.e();
        int i = 0;
        while (onclickubahcabang.i()) {
            setCentered c2 = selesai.c(onclickubahcabang, bindAnim);
            int i2 = i;
            if (c2.g == setCentered$MediaBrowserCompat$CustomActionResultReceiver.IMAGE) {
                i2 = i + 1;
            }
            list.add(c2);
            settrackdrawable.c(c2.f, c2);
            i = i2;
            if (i2 > 4) {
                StringBuilder sb = new StringBuilder("You have ");
                sb.append(i2);
                sb.append(" images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
                AvailableBookingTimeActivity_ViewBinding.b(sb.toString());
                i = i2;
            }
        }
        onclickubahcabang.a();
    }

    private static void e(onClickUbahCabang onclickubahcabang, BindAnim bindAnim, setTrackTintList<Unbinder._CC> settracktintlist) throws IOException {
        onclickubahcabang.e();
        while (onclickubahcabang.i()) {
            Unbinder.-CC b2 = setProgress.b(onclickubahcabang, bindAnim);
            settracktintlist.c(b2.hashCode(), b2);
        }
        onclickubahcabang.a();
    }
}
