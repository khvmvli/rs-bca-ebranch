package o;

import android.graphics.Color;
import android.graphics.Rect;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import o.ListenerClass;
import o.setCentered;
/* loaded from: classes-dex2jar.jar:o/selesai.class */
public final class selesai {
    private static final onClickUbahCabang$MediaBrowserCompat$CustomActionResultReceiver b = onClickUbahCabang$MediaBrowserCompat$CustomActionResultReceiver.b("nm", "ind", "refId", "ty", "parent", "sw", "sh", "sc", "ks", "tt", "masksProperties", "shapes", "t", "ef", "sr", "st", "w", "h", "ip", "op", "tm", "cl", "hd");
    private static final onClickUbahCabang$MediaBrowserCompat$CustomActionResultReceiver c = onClickUbahCabang$MediaBrowserCompat$CustomActionResultReceiver.b("d", "a");
    private static final onClickUbahCabang$MediaBrowserCompat$CustomActionResultReceiver d = onClickUbahCabang$MediaBrowserCompat$CustomActionResultReceiver.b("ty", "nm");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.selesai$5 */
    /* loaded from: classes-dex2jar.jar:o/selesai$5.class */
    public static final /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] e;

        static {
            int[] iArr = new int[setCentered.read.values().length];
            e = iArr;
            try {
                iArr[setCentered.read.LUMA.ordinal()] = 1;
            } catch (NoSuchFieldError e2) {
            }
            try {
                e[setCentered.read.LUMA_INVERTED.ordinal()] = 2;
            } catch (NoSuchFieldError e3) {
            }
        }
    }

    public static setCentered b(BindAnim bindAnim) {
        Rect rect = bindAnim.c;
        return new setCentered(Collections.emptyList(), bindAnim, "__container", -1, setCentered$MediaBrowserCompat$CustomActionResultReceiver.PRE_COMP, -1, null, Collections.emptyList(), new type(), 0, 0, 0, 0.0f, 0.0f, rect.width(), rect.height(), null, null, Collections.emptyList(), setCentered.read.NONE, null, false, null, null);
    }

    public static setCentered c(onClickUbahCabang onclickubahcabang, BindAnim bindAnim) throws IOException {
        setCentered.read read = setCentered.read.NONE;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        onclickubahcabang.d();
        Float valueOf = Float.valueOf(1.0f);
        Float valueOf2 = Float.valueOf(0.0f);
        String str = null;
        setCentered$MediaBrowserCompat$CustomActionResultReceiver setcentered_mediabrowsercompat_customactionresultreceiver = null;
        String str2 = null;
        type type = null;
        C0038setter setter = null;
        remover remover = null;
        ImmutableList immutableList = null;
        ListenerClass.NONE none = null;
        setSafeMode setsafemode = null;
        long j = -1;
        float f = 0.0f;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        float f2 = 1.0f;
        float f3 = 0.0f;
        int i4 = 0;
        int i5 = 0;
        boolean z = false;
        float f4 = 0.0f;
        long j2 = 0;
        String str3 = "UNSET";
        while (onclickubahcabang.i()) {
            switch (onclickubahcabang.a(b)) {
                case 0:
                    str3 = onclickubahcabang.k();
                    break;
                case 1:
                    j2 = (long) onclickubahcabang.j();
                    break;
                case 2:
                    str2 = onclickubahcabang.k();
                    break;
                case 3:
                    int j3 = onclickubahcabang.j();
                    if (j3 >= setCentered$MediaBrowserCompat$CustomActionResultReceiver.UNKNOWN.ordinal()) {
                        setcentered_mediabrowsercompat_customactionresultreceiver = setCentered$MediaBrowserCompat$CustomActionResultReceiver.UNKNOWN;
                        break;
                    } else {
                        setcentered_mediabrowsercompat_customactionresultreceiver = setCentered$MediaBrowserCompat$CustomActionResultReceiver.values()[j3];
                        break;
                    }
                case 4:
                    j = (long) onclickubahcabang.j();
                    break;
                case 5:
                    i = (int) (((float) onclickubahcabang.j()) * copyNoRef.d());
                    break;
                case 6:
                    i2 = (int) (((float) onclickubahcabang.j()) * copyNoRef.d());
                    break;
                case 7:
                    i3 = Color.parseColor(onclickubahcabang.k());
                    break;
                case 8:
                    type = setMinAndMaxFrame.d(onclickubahcabang, bindAnim);
                    break;
                case 9:
                    int j4 = onclickubahcabang.j();
                    if (j4 < setCentered.read.values().length) {
                        read = setCentered.read.values()[j4];
                        int i6 = AnonymousClass5.e[read.ordinal()];
                        if (i6 == 1) {
                            AvailableBookingTimeActivity_ViewBinding.b("Unsupported matte type: Luma");
                            bindAnim.m.add("Unsupported matte type: Luma");
                        } else if (i6 == 2) {
                            AvailableBookingTimeActivity_ViewBinding.b("Unsupported matte type: Luma Inverted");
                            bindAnim.m.add("Unsupported matte type: Luma Inverted");
                        }
                        bindAnim.n++;
                        break;
                    } else {
                        StringBuilder sb = new StringBuilder("Unsupported matte type: ");
                        sb.append(j4);
                        String obj = sb.toString();
                        AvailableBookingTimeActivity_ViewBinding.b(obj);
                        bindAnim.m.add(obj);
                        break;
                    }
                case 10:
                    onclickubahcabang.e();
                    while (onclickubahcabang.i()) {
                        arrayList.add(showWebView.c(onclickubahcabang, bindAnim));
                    }
                    bindAnim.n += arrayList.size();
                    onclickubahcabang.a();
                    break;
                case 11:
                    onclickubahcabang.e();
                    while (onclickubahcabang.i()) {
                        name a = setOutlineMasksAndMattes.a(onclickubahcabang, bindAnim);
                        if (a != null) {
                            arrayList2.add(a);
                        }
                    }
                    onclickubahcabang.a();
                    break;
                case 12:
                    onclickubahcabang.d();
                    while (onclickubahcabang.i()) {
                        int a2 = onclickubahcabang.a(c);
                        if (a2 == 0) {
                            setter = new C0038setter(saveQRCode.d(onclickubahcabang, bindAnim, 1.0f, setRepeatMode.b, false));
                        } else if (a2 != 1) {
                            onclickubahcabang.l();
                            onclickubahcabang.m();
                        } else {
                            onclickubahcabang.e();
                            if (onclickubahcabang.i()) {
                                remover = setMaxFrame.c(onclickubahcabang, bindAnim);
                            }
                            while (onclickubahcabang.i()) {
                                onclickubahcabang.m();
                            }
                            onclickubahcabang.a();
                        }
                    }
                    onclickubahcabang.b();
                    break;
                case 13:
                    onclickubahcabang.e();
                    ArrayList arrayList3 = new ArrayList();
                    while (onclickubahcabang.i()) {
                        onclickubahcabang.d();
                        while (onclickubahcabang.i()) {
                            int a3 = onclickubahcabang.a(d);
                            if (a3 == 0) {
                                int j5 = onclickubahcabang.j();
                                if (j5 == 29) {
                                    none = setMinProgress.b(onclickubahcabang, bindAnim);
                                } else {
                                    none = none;
                                    if (j5 == 25) {
                                        setsafemode = new setRepeatCount().b(onclickubahcabang, bindAnim);
                                        none = none;
                                    }
                                }
                            } else if (a3 != 1) {
                                onclickubahcabang.l();
                                onclickubahcabang.m();
                                none = none;
                            } else {
                                arrayList3.add(onclickubahcabang.k());
                                none = none;
                            }
                        }
                        onclickubahcabang.b();
                    }
                    onclickubahcabang.a();
                    StringBuilder sb2 = new StringBuilder("Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: ");
                    sb2.append(arrayList3);
                    String obj2 = sb2.toString();
                    AvailableBookingTimeActivity_ViewBinding.b(obj2);
                    bindAnim.m.add(obj2);
                    break;
                case 14:
                    f2 = (float) onclickubahcabang.h();
                    break;
                case 15:
                    f3 = (float) onclickubahcabang.h();
                    break;
                case 16:
                    i4 = (int) (((float) onclickubahcabang.j()) * copyNoRef.d());
                    break;
                case 17:
                    i5 = (int) (((float) onclickubahcabang.j()) * copyNoRef.d());
                    break;
                case 18:
                    f = (float) onclickubahcabang.h();
                    break;
                case 19:
                    f4 = (float) onclickubahcabang.h();
                    break;
                case 20:
                    immutableList = setMinAndMaxProgress.e(onclickubahcabang, bindAnim, false);
                    break;
                case 21:
                    str = onclickubahcabang.k();
                    break;
                case 22:
                    z = onclickubahcabang.g();
                    break;
                default:
                    onclickubahcabang.l();
                    onclickubahcabang.m();
                    break;
            }
        }
        onclickubahcabang.b();
        ArrayList arrayList4 = new ArrayList();
        if (f > 0.0f) {
            arrayList4.add(new onClickBcaKlikpay(bindAnim, valueOf2, valueOf2, null, 0.0f, Float.valueOf(f)));
        }
        float f5 = f4;
        if (f4 <= 0.0f) {
            f5 = bindAnim.d;
        }
        arrayList4.add(new onClickBcaKlikpay(bindAnim, valueOf, valueOf, null, f, Float.valueOf(f5)));
        arrayList4.add(new onClickBcaKlikpay(bindAnim, valueOf2, valueOf2, null, f5, Float.valueOf(Float.MAX_VALUE)));
        if (str3.endsWith(".ai") || "ai".equals(str)) {
            AvailableBookingTimeActivity_ViewBinding.b("Convert your Illustrator layers to shape layers.");
            bindAnim.m.add("Convert your Illustrator layers to shape layers.");
        }
        return new setCentered(arrayList2, bindAnim, str3, j2, setcentered_mediabrowsercompat_customactionresultreceiver, j, str2, arrayList, type, i, i2, i3, f2, f3, i4, i5, setter, remover, arrayList4, read, immutableList, z, none, setsafemode);
    }
}
