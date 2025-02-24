package o;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import o.getResourceEntryName;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/setSpeed.class */
public final class setSpeed {
    private static onClickUbahCabang$MediaBrowserCompat$CustomActionResultReceiver a = onClickUbahCabang$MediaBrowserCompat$CustomActionResultReceiver.b("nm", "g", "o", "t", "s", "e", "w", "lc", "lj", "ml", "hd", "d");
    private static final onClickUbahCabang$MediaBrowserCompat$CustomActionResultReceiver c = onClickUbahCabang$MediaBrowserCompat$CustomActionResultReceiver.b("p", "k");
    private static final onClickUbahCabang$MediaBrowserCompat$CustomActionResultReceiver d = onClickUbahCabang$MediaBrowserCompat$CustomActionResultReceiver.b("n", "v");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static arrayFilteringNull d(onClickUbahCabang onclickubahcabang, BindAnim bindAnim) throws IOException {
        ArrayList arrayList = new ArrayList();
        String str = null;
        returnType returntype = null;
        get get = null;
        DebouncingOnClickListener$$ExternalSyntheticLambda0 debouncingOnClickListener$$ExternalSyntheticLambda0 = null;
        DebouncingOnClickListener$$ExternalSyntheticLambda0 debouncingOnClickListener$$ExternalSyntheticLambda02 = null;
        ImmutableList immutableList = null;
        getResourceEntryName.RemoteActionCompatParcelizer remoteActionCompatParcelizer = null;
        getResourceEntryName.write write = null;
        float f = 0.0f;
        ImmutableList immutableList2 = null;
        boolean z = false;
        size size = null;
        while (onclickubahcabang.i()) {
            switch (onclickubahcabang.a(a)) {
                case 0:
                    str = onclickubahcabang.k();
                    size = size;
                    z = z;
                    f = f;
                    write = write;
                    remoteActionCompatParcelizer = remoteActionCompatParcelizer;
                    get = get;
                    returntype = returntype;
                    break;
                case 1:
                    onclickubahcabang.d();
                    int i = -1;
                    while (onclickubahcabang.i()) {
                        int a2 = onclickubahcabang.a(c);
                        if (a2 == 0) {
                            i = onclickubahcabang.j();
                        } else if (a2 != 1) {
                            onclickubahcabang.l();
                            onclickubahcabang.m();
                        } else {
                            get = setMinAndMaxProgress.b(onclickubahcabang, bindAnim, i);
                        }
                    }
                    onclickubahcabang.b();
                    str = str;
                    z = z;
                    break;
                case 2:
                    size = new size(saveQRCode.d(onclickubahcabang, bindAnim, 1.0f, setScale.a, false));
                    str = str;
                    z = z;
                    break;
                case 3:
                    returntype = onclickubahcabang.j() == 1 ? returnType.LINEAR : returnType.RADIAL;
                    str = str;
                    z = z;
                    break;
                case 4:
                    debouncingOnClickListener$$ExternalSyntheticLambda0 = new DebouncingOnClickListener$$ExternalSyntheticLambda0(saveQRCode.d(onclickubahcabang, bindAnim, copyNoRef.d(), AktivasiMBCAKlikBCAActivity.a, true));
                    continue;
                case 5:
                    debouncingOnClickListener$$ExternalSyntheticLambda02 = new DebouncingOnClickListener$$ExternalSyntheticLambda0(saveQRCode.d(onclickubahcabang, bindAnim, copyNoRef.d(), AktivasiMBCAKlikBCAActivity.a, true));
                    continue;
                case 6:
                    immutableList = setMinAndMaxProgress.c(onclickubahcabang, bindAnim);
                    continue;
                case 7:
                    remoteActionCompatParcelizer = getResourceEntryName.RemoteActionCompatParcelizer.values()[onclickubahcabang.j() - 1];
                    str = str;
                    z = z;
                    break;
                case 8:
                    write = getResourceEntryName.write.values()[onclickubahcabang.j() - 1];
                    str = str;
                    z = z;
                    break;
                case 9:
                    f = (float) onclickubahcabang.h();
                    str = str;
                    z = z;
                    break;
                case 10:
                    z = onclickubahcabang.g();
                    continue;
                case 11:
                    onclickubahcabang.e();
                    while (onclickubahcabang.i()) {
                        onclickubahcabang.d();
                        ImmutableList immutableList3 = null;
                        String str2 = null;
                        while (onclickubahcabang.i()) {
                            int a3 = onclickubahcabang.a(d);
                            if (a3 == 0) {
                                str2 = onclickubahcabang.k();
                            } else if (a3 != 1) {
                                onclickubahcabang.l();
                                onclickubahcabang.m();
                            } else {
                                immutableList3 = setMinAndMaxProgress.c(onclickubahcabang, bindAnim);
                            }
                        }
                        onclickubahcabang.b();
                        if (str2.equals("o")) {
                            immutableList2 = immutableList3;
                        } else if (str2.equals("d") || str2.equals("g")) {
                            bindAnim.f = true;
                            arrayList.add(immutableList3);
                        }
                    }
                    onclickubahcabang.a();
                    str = str;
                    returntype = returntype;
                    get = get;
                    remoteActionCompatParcelizer = remoteActionCompatParcelizer;
                    write = write;
                    f = f;
                    z = z;
                    size = size;
                    immutableList2 = immutableList2;
                    if (arrayList.size() == 1) {
                        arrayList.add(arrayList.get(0));
                        str = str;
                        returntype = returntype;
                        get = get;
                        remoteActionCompatParcelizer = remoteActionCompatParcelizer;
                        write = write;
                        f = f;
                        z = z;
                        size = size;
                        immutableList2 = immutableList2;
                        break;
                    }
                    break;
                default:
                    onclickubahcabang.l();
                    onclickubahcabang.m();
                    str = str;
                    returntype = returntype;
                    get = get;
                    remoteActionCompatParcelizer = remoteActionCompatParcelizer;
                    write = write;
                    f = f;
                    z = z;
                    size = size;
                    break;
            }
        }
        size size2 = size;
        if (size == null) {
            size2 = new size(Collections.singletonList(new onClickBcaKlikpay(100)));
        }
        return new arrayFilteringNull(str, returntype, get, size2, debouncingOnClickListener$$ExternalSyntheticLambda0, debouncingOnClickListener$$ExternalSyntheticLambda02, immutableList, remoteActionCompatParcelizer, write, f, arrayList, immutableList2, z);
    }
}
