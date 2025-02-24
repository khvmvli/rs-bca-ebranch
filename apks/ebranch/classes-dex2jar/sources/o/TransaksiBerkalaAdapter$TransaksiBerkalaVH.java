package o;

import com.bca.smartbranch.fragment.BN3PilihCabangFragment;
import java.lang.ref.WeakReference;
import o.LogRedirector;
/* loaded from: classes-dex2jar.jar:o/TransaksiBerkalaAdapter$TransaksiBerkalaVH.class */
public final class TransaksiBerkalaAdapter$TransaksiBerkalaVH {
    private static final String[] d = {"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"};

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/TransaksiBerkalaAdapter$TransaksiBerkalaVH$RemoteActionCompatParcelizer.class */
    public static final class RemoteActionCompatParcelizer implements LogRedirector.Logger {
        private final WeakReference<BN3PilihCabangFragment> b;

        private RemoteActionCompatParcelizer(BN3PilihCabangFragment bN3PilihCabangFragment) {
            this.b = new WeakReference<>(bN3PilihCabangFragment);
        }

        /* synthetic */ RemoteActionCompatParcelizer(BN3PilihCabangFragment bN3PilihCabangFragment, byte b) {
            this(bN3PilihCabangFragment);
        }

        public final void a() {
            BN3PilihCabangFragment bN3PilihCabangFragment = this.b.get();
            if (bN3PilihCabangFragment != null) {
                bN3PilihCabangFragment.requestPermissions(TransaksiBerkalaAdapter$TransaksiBerkalaVH.d, 2);
            }
        }
    }

    public static void b(BN3PilihCabangFragment bN3PilihCabangFragment) {
        getView requireActivity = bN3PilihCabangFragment.requireActivity();
        String[] strArr = d;
        if (Predicate.c(requireActivity, strArr)) {
            bN3PilihCabangFragment.j();
        } else if (Predicate.e(bN3PilihCabangFragment, strArr)) {
            BN3PilihCabangFragment.a((LogRedirector.Logger) new RemoteActionCompatParcelizer(bN3PilihCabangFragment, (byte) 0));
        } else {
            bN3PilihCabangFragment.requestPermissions(strArr, 2);
        }
    }

    public static void c(BN3PilihCabangFragment bN3PilihCabangFragment, int i, int[] iArr) {
        if (i != 2) {
            return;
        }
        if (Predicate.c(iArr)) {
            bN3PilihCabangFragment.j();
        } else {
            bN3PilihCabangFragment.getActivity().onBackPressed();
        }
    }
}
