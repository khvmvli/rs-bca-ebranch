package o;

import android.util.Log;
/* loaded from: classes2-dex2jar.jar:o/CC26AFormKartuKreditFragment.class */
final class CC26AFormKartuKreditFragment implements CC25CFormKartuKreditFragment_ViewBinding {
    CC26AFormKartuKreditFragment() {
    }

    @Override // o.CC25CFormKartuKreditFragment_ViewBinding
    public final void a(String str) {
        Log.w("RxFingerprint", str);
    }

    @Override // o.CC25CFormKartuKreditFragment_ViewBinding
    public final void d(String str, Throwable th) {
        Log.e("RxFingerprint", str, th);
    }
}
