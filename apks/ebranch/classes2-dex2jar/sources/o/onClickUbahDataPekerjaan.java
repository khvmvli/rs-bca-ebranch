package o;

import android.os.Handler;
import android.os.Message;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import java.util.HashMap;
import o.CC26BFormKartuKreditFragment_ViewBinding;
/* loaded from: classes2-dex2jar.jar:o/onClickUbahDataPekerjaan.class */
public class onClickUbahDataPekerjaan extends CC26BFormKartuKreditFragment_ViewBinding {
    long f;
    onClickUbahDataFasilitas[] h;
    HashMap<String, onClickUbahDataFasilitas> k;
    private long y;
    private static ThreadLocal<write> m = new ThreadLocal<>();
    private static final ThreadLocal<ArrayList<onClickUbahDataPekerjaan>> l = new ThreadLocal<ArrayList<onClickUbahDataPekerjaan>>() { // from class: o.onClickUbahDataPekerjaan.5
        @Override // java.lang.ThreadLocal
        protected final /* synthetic */ ArrayList<onClickUbahDataPekerjaan> initialValue() {
            return new ArrayList<>();
        }
    };
    private static final ThreadLocal<ArrayList<onClickUbahDataPekerjaan>> p = new ThreadLocal<ArrayList<onClickUbahDataPekerjaan>>() { // from class: o.onClickUbahDataPekerjaan.3
        @Override // java.lang.ThreadLocal
        protected final /* synthetic */ ArrayList<onClickUbahDataPekerjaan> initialValue() {
            return new ArrayList<>();
        }
    };
    private static final ThreadLocal<ArrayList<onClickUbahDataPekerjaan>> n = new ThreadLocal<ArrayList<onClickUbahDataPekerjaan>>() { // from class: o.onClickUbahDataPekerjaan.4
        @Override // java.lang.ThreadLocal
        protected final /* synthetic */ ArrayList<onClickUbahDataPekerjaan> initialValue() {
            return new ArrayList<>();
        }
    };
    private static final ThreadLocal<ArrayList<onClickUbahDataPekerjaan>> t = new ThreadLocal<ArrayList<onClickUbahDataPekerjaan>>() { // from class: o.onClickUbahDataPekerjaan.1
        @Override // java.lang.ThreadLocal
        protected final /* synthetic */ ArrayList<onClickUbahDataPekerjaan> initialValue() {
            return new ArrayList<>();
        }
    };
    private static final ThreadLocal<ArrayList<onClickUbahDataPekerjaan>> w = new ThreadLocal<ArrayList<onClickUbahDataPekerjaan>>() { // from class: o.onClickUbahDataPekerjaan.2
        @Override // java.lang.ThreadLocal
        protected final /* synthetic */ ArrayList<onClickUbahDataPekerjaan> initialValue() {
            return new ArrayList<>();
        }
    };

    /* renamed from: o  reason: collision with root package name */
    private static final Interpolator f76o = new AccelerateDecelerateInterpolator();
    private static final onClickUbahDataKontakDarurat r = new SubscribeBidangUsaha();
    private static final onClickUbahDataKontakDarurat s = new onClickUbahDataDiri();
    private static long q = 10;
    long j = -1;
    private boolean z = false;
    private int x = 0;
    private float v = 0.0f;
    private boolean D = false;
    int b = 0;
    private boolean C = false;
    private boolean A = false;
    boolean a = false;
    private long u = 300;
    long g = 0;
    int c = 0;
    int i = 1;
    Interpolator e = f76o;
    private ArrayList<Object> B = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2-dex2jar.jar:o/onClickUbahDataPekerjaan$write.class */
    public static final class write extends Handler {
        private write() {
        }

        /* synthetic */ write(byte b) {
            this();
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            boolean z;
            ArrayList arrayList = (ArrayList) onClickUbahDataPekerjaan.l.get();
            ArrayList arrayList2 = (ArrayList) onClickUbahDataPekerjaan.n.get();
            int i = message.what;
            if (i == 0) {
                ArrayList arrayList3 = (ArrayList) onClickUbahDataPekerjaan.p.get();
                z = arrayList.size() <= 0 && arrayList2.size() <= 0;
                while (arrayList3.size() > 0) {
                    ArrayList arrayList4 = (ArrayList) arrayList3.clone();
                    arrayList3.clear();
                    int size = arrayList4.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        onClickUbahDataPekerjaan onclickubahdatapekerjaan = (onClickUbahDataPekerjaan) arrayList4.get(i2);
                        if (onclickubahdatapekerjaan.g == 0) {
                            onClickUbahDataPekerjaan.d(onclickubahdatapekerjaan);
                        } else {
                            arrayList2.add(onclickubahdatapekerjaan);
                        }
                    }
                }
            } else if (i == 1) {
                z = true;
            } else {
                return;
            }
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            ArrayList arrayList5 = (ArrayList) onClickUbahDataPekerjaan.w.get();
            ArrayList arrayList6 = (ArrayList) onClickUbahDataPekerjaan.t.get();
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                onClickUbahDataPekerjaan onclickubahdatapekerjaan2 = (onClickUbahDataPekerjaan) arrayList2.get(i3);
                if (onClickUbahDataPekerjaan.a(onclickubahdatapekerjaan2, currentAnimationTimeMillis)) {
                    arrayList5.add(onclickubahdatapekerjaan2);
                }
            }
            int size3 = arrayList5.size();
            if (size3 > 0) {
                for (int i4 = 0; i4 < size3; i4++) {
                    onClickUbahDataPekerjaan onclickubahdatapekerjaan3 = (onClickUbahDataPekerjaan) arrayList5.get(i4);
                    onClickUbahDataPekerjaan.d(onclickubahdatapekerjaan3);
                    onclickubahdatapekerjaan3.C = true;
                    arrayList2.remove(onclickubahdatapekerjaan3);
                }
                arrayList5.clear();
            }
            int size4 = arrayList.size();
            int i5 = 0;
            while (i5 < size4) {
                onClickUbahDataPekerjaan onclickubahdatapekerjaan4 = (onClickUbahDataPekerjaan) arrayList.get(i5);
                if (onclickubahdatapekerjaan4.b(currentAnimationTimeMillis)) {
                    arrayList6.add(onclickubahdatapekerjaan4);
                }
                if (arrayList.size() == size4) {
                    i5++;
                } else {
                    size4--;
                    arrayList6.remove(onclickubahdatapekerjaan4);
                }
            }
            if (arrayList6.size() > 0) {
                for (int i6 = 0; i6 < arrayList6.size(); i6++) {
                    onClickUbahDataPekerjaan.e((onClickUbahDataPekerjaan) arrayList6.get(i6));
                }
                arrayList6.clear();
            }
            if (!z) {
                return;
            }
            if (!arrayList.isEmpty() || !arrayList2.isEmpty()) {
                sendEmptyMessageDelayed(1, Math.max(0L, onClickUbahDataPekerjaan.q - (AnimationUtils.currentAnimationTimeMillis() - currentAnimationTimeMillis)));
            }
        }
    }

    static /* synthetic */ boolean a(onClickUbahDataPekerjaan onclickubahdatapekerjaan, long j) {
        if (!onclickubahdatapekerjaan.D) {
            onclickubahdatapekerjaan.D = true;
            onclickubahdatapekerjaan.y = j;
            return false;
        }
        long j2 = j - onclickubahdatapekerjaan.y;
        long j3 = onclickubahdatapekerjaan.g;
        if (j2 <= j3) {
            return false;
        }
        onclickubahdatapekerjaan.f = j - (j2 - j3);
        onclickubahdatapekerjaan.b = 1;
        return true;
    }

    public static onClickUbahDataPekerjaan b(float... fArr) {
        onClickUbahDataPekerjaan onclickubahdatapekerjaan = new onClickUbahDataPekerjaan();
        onclickubahdatapekerjaan.e(fArr);
        return onclickubahdatapekerjaan;
    }

    static /* synthetic */ void d(onClickUbahDataPekerjaan onclickubahdatapekerjaan) {
        onclickubahdatapekerjaan.e();
        l.get().add(onclickubahdatapekerjaan);
        if (onclickubahdatapekerjaan.g > 0 && onclickubahdatapekerjaan.d != null) {
            ArrayList arrayList = (ArrayList) onclickubahdatapekerjaan.d.clone();
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((CC26BFormKartuKreditFragment_ViewBinding.RemoteActionCompatParcelizer) arrayList.get(i)).c(onclickubahdatapekerjaan);
            }
        }
    }

    static /* synthetic */ void e(onClickUbahDataPekerjaan onclickubahdatapekerjaan) {
        l.get().remove(onclickubahdatapekerjaan);
        p.get().remove(onclickubahdatapekerjaan);
        n.get().remove(onclickubahdatapekerjaan);
        onclickubahdatapekerjaan.b = 0;
        if (onclickubahdatapekerjaan.C && onclickubahdatapekerjaan.d != null) {
            ArrayList arrayList = (ArrayList) onclickubahdatapekerjaan.d.clone();
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((CC26BFormKartuKreditFragment_ViewBinding.RemoteActionCompatParcelizer) arrayList.get(i)).b(onclickubahdatapekerjaan);
            }
        }
        onclickubahdatapekerjaan.C = false;
        onclickubahdatapekerjaan.A = false;
    }

    public void a(int... iArr) {
        if (iArr != null && iArr.length != 0) {
            onClickUbahDataFasilitas[] onclickubahdatafasilitasArr = this.h;
            if (onclickubahdatafasilitasArr == null || onclickubahdatafasilitasArr.length == 0) {
                a(onClickUbahDataFasilitas.b("", iArr));
            } else {
                onclickubahdatafasilitasArr[0].setIntValues(iArr);
            }
            this.a = false;
        }
    }

    public final void a(onClickUbahDataFasilitas... onclickubahdatafasilitasArr) {
        this.h = onclickubahdatafasilitasArr;
        this.k = new HashMap<>(1);
        for (int i = 0; i <= 0; i++) {
            onClickUbahDataFasilitas onclickubahdatafasilitas = onclickubahdatafasilitasArr[0];
            this.k.put(onclickubahdatafasilitas.getPropertyName(), onclickubahdatafasilitas);
        }
        this.a = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0101  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    final boolean b(long r7) {
        /*
        // Method dump skipped, instructions count: 272
        */
        throw new UnsupportedOperationException("Method not decompiled: o.onClickUbahDataPekerjaan.b(long):boolean");
    }

    /* renamed from: c */
    public onClickUbahDataPekerjaan clone() {
        onClickUbahDataPekerjaan onclickubahdatapekerjaan = (onClickUbahDataPekerjaan) clone();
        ArrayList<Object> arrayList = this.B;
        if (arrayList != null) {
            onclickubahdatapekerjaan.B = new ArrayList<>();
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                onclickubahdatapekerjaan.B.add(arrayList.get(i));
            }
        }
        onclickubahdatapekerjaan.j = -1;
        onclickubahdatapekerjaan.z = false;
        onclickubahdatapekerjaan.x = 0;
        onclickubahdatapekerjaan.a = false;
        onclickubahdatapekerjaan.b = 0;
        onclickubahdatapekerjaan.D = false;
        onClickUbahDataFasilitas[] onclickubahdatafasilitasArr = this.h;
        if (onclickubahdatafasilitasArr != null) {
            int length = onclickubahdatafasilitasArr.length;
            onclickubahdatapekerjaan.h = new onClickUbahDataFasilitas[length];
            onclickubahdatapekerjaan.k = new HashMap<>(length);
            for (int i2 = 0; i2 < length; i2++) {
                onClickUbahDataFasilitas a = onclickubahdatafasilitasArr[i2].clone();
                onclickubahdatapekerjaan.h[i2] = a;
                onclickubahdatapekerjaan.k.put(a.getPropertyName(), a);
            }
        }
        return onclickubahdatapekerjaan;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(float f) {
        float interpolation = this.e.getInterpolation(f);
        this.v = interpolation;
        int length = this.h.length;
        for (int i = 0; i < length; i++) {
            this.h[i].b(interpolation);
        }
        ArrayList<Object> arrayList = this.B;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.B.get(i2);
            }
        }
    }

    public onClickUbahDataPekerjaan d(long j) {
        if (j >= 0) {
            this.u = j;
            return this;
        }
        StringBuilder sb = new StringBuilder("Animators cannot have negative duration: ");
        sb.append(j);
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [long] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Unknown variable types count: 1 */
    @Override // o.CC26BFormKartuKreditFragment_ViewBinding
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void d() {
        /*
        // Method dump skipped, instructions count: 249
        */
        throw new UnsupportedOperationException("Method not decompiled: o.onClickUbahDataPekerjaan.d():void");
    }

    @Override // o.CC26BFormKartuKreditFragment_ViewBinding
    public final void d(Interpolator interpolator) {
        if (interpolator != null) {
            this.e = interpolator;
        } else {
            this.e = new LinearInterpolator();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e() {
        if (!this.a) {
            int length = this.h.length;
            for (int i = 0; i < length; i++) {
                onClickUbahDataFasilitas onclickubahdatafasilitas = this.h[i];
                if (onclickubahdatafasilitas.a == null) {
                    Class cls = onclickubahdatafasilitas.f;
                    onclickubahdatafasilitas.a = cls == Integer.class ? onClickUbahDataFasilitas.b : cls == Float.class ? onClickUbahDataFasilitas.d : null;
                }
                onClickUbahDataKontakDarurat onclickubahdatakontakdarurat = onclickubahdatafasilitas.a;
                if (onclickubahdatakontakdarurat != null) {
                    onclickubahdatafasilitas.e.b = onclickubahdatakontakdarurat;
                }
            }
            this.a = true;
        }
    }

    public void e(float... fArr) {
        if (fArr != null && fArr.length != 0) {
            onClickUbahDataFasilitas[] onclickubahdatafasilitasArr = this.h;
            if (onclickubahdatafasilitasArr == null || onclickubahdatafasilitasArr.length == 0) {
                a(onClickUbahDataFasilitas.a("", fArr));
            } else {
                onclickubahdatafasilitasArr[0].setFloatValues(fArr);
            }
            this.a = false;
        }
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder sb = new StringBuilder("ValueAnimator@");
        sb.append(Integer.toHexString(hashCode()));
        String obj = sb.toString();
        String str = obj;
        if (this.h != null) {
            int i = 0;
            while (true) {
                str = obj;
                if (i >= this.h.length) {
                    break;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(obj);
                sb2.append("\n    ");
                sb2.append(this.h[i].toString());
                obj = sb2.toString();
                i++;
            }
        }
        return str;
    }
}
