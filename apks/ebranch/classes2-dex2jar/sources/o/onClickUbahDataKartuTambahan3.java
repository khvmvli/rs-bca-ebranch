package o;

import android.view.View;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes2-dex2jar.jar:o/onClickUbahDataKartuTambahan3.class */
public final class onClickUbahDataKartuTambahan3 extends onClickUbahDataPekerjaan {
    private static final Map<String, onClickUbahDataLainnya> m;
    private onClickUbahDataLainnya l;
    private Object n;

    /* renamed from: o  reason: collision with root package name */
    private String f75o;

    static {
        HashMap hashMap = new HashMap();
        m = hashMap;
        hashMap.put("alpha", onClickUbahDataKartuTambahan2.c);
        hashMap.put("pivotX", onClickUbahDataKartuTambahan2.e);
        hashMap.put("pivotY", onClickUbahDataKartuTambahan2.d);
        hashMap.put("translationX", onClickUbahDataKartuTambahan2.k);
        hashMap.put("translationY", onClickUbahDataKartuTambahan2.l);
        hashMap.put("rotation", onClickUbahDataKartuTambahan2.a);
        hashMap.put("rotationX", onClickUbahDataKartuTambahan2.b);
        hashMap.put("rotationY", onClickUbahDataKartuTambahan2.h);
        hashMap.put("scaleX", onClickUbahDataKartuTambahan2.j);
        hashMap.put("scaleY", onClickUbahDataKartuTambahan2.i);
        hashMap.put("scrollX", onClickUbahDataKartuTambahan2.f);
        hashMap.put("scrollY", onClickUbahDataKartuTambahan2.g);
        hashMap.put("x", onClickUbahDataKartuTambahan2.n);
        hashMap.put("y", onClickUbahDataKartuTambahan2.f74o);
    }

    @Override // o.onClickUbahDataPekerjaan, o.CC26BFormKartuKreditFragment_ViewBinding
    public final /* synthetic */ CC26BFormKartuKreditFragment_ViewBinding a() {
        return (onClickUbahDataKartuTambahan3) clone();
    }

    @Override // o.CC26BFormKartuKreditFragment_ViewBinding
    public final void a(Object obj) {
        Object obj2 = this.n;
        if (obj2 != obj) {
            this.n = obj;
            if (obj2 == null || obj == null || obj2.getClass() != obj.getClass()) {
                this.a = false;
            }
        }
    }

    @Override // o.onClickUbahDataPekerjaan
    public final void a(int... iArr) {
        if (this.h == null || this.h.length == 0) {
            onClickUbahDataLainnya onclickubahdatalainnya = this.l;
            if (onclickubahdatalainnya != null) {
                a(onClickUbahDataFasilitas.c(onclickubahdatalainnya, iArr));
            } else {
                a(onClickUbahDataFasilitas.b(this.f75o, iArr));
            }
        } else {
            a(iArr);
        }
    }

    public final void b(String str) {
        if (this.h != null) {
            onClickUbahDataFasilitas onclickubahdatafasilitas = this.h[0];
            String propertyName = onclickubahdatafasilitas.getPropertyName();
            onclickubahdatafasilitas.setPropertyName(str);
            this.k.remove(propertyName);
            this.k.put(str, onclickubahdatafasilitas);
        }
        this.f75o = str;
        this.a = false;
    }

    @Override // o.onClickUbahDataPekerjaan
    public final /* bridge */ /* synthetic */ onClickUbahDataPekerjaan c() {
        return (onClickUbahDataKartuTambahan3) clone();
    }

    @Override // o.onClickUbahDataPekerjaan
    final void c(float f) {
        c(f);
        int length = this.h.length;
        for (int i = 0; i < length; i++) {
            this.h[i].d(this.n);
        }
    }

    @Override // o.onClickUbahDataPekerjaan, o.CC26BFormKartuKreditFragment_ViewBinding, java.lang.Object
    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        return (onClickUbahDataKartuTambahan3) clone();
    }

    @Override // o.onClickUbahDataPekerjaan
    public final /* bridge */ /* synthetic */ onClickUbahDataPekerjaan d(long j) {
        d(j);
        return this;
    }

    @Override // o.onClickUbahDataPekerjaan, o.CC26BFormKartuKreditFragment_ViewBinding
    public final void d() {
        d();
    }

    @Override // o.onClickUbahDataPekerjaan
    final void e() {
        if (!this.a) {
            if (this.l == null && onClickedUbahCC272.c && (this.n instanceof View)) {
                Map<String, onClickUbahDataLainnya> map = m;
                if (map.containsKey(this.f75o)) {
                    onClickUbahDataLainnya onclickubahdatalainnya = map.get(this.f75o);
                    if (this.h != null) {
                        onClickUbahDataFasilitas onclickubahdatafasilitas = this.h[0];
                        String propertyName = onclickubahdatafasilitas.getPropertyName();
                        onclickubahdatafasilitas.setProperty(onclickubahdatalainnya);
                        this.k.remove(propertyName);
                        this.k.put(this.f75o, onclickubahdatafasilitas);
                    }
                    if (this.l != null) {
                        this.f75o = onclickubahdatalainnya.c;
                    }
                    this.l = onclickubahdatalainnya;
                    this.a = false;
                }
            }
            int length = this.h.length;
            for (int i = 0; i < length; i++) {
                this.h[i].a(this.n);
            }
            e();
        }
    }

    @Override // o.onClickUbahDataPekerjaan
    public final void e(float... fArr) {
        if (this.h == null || this.h.length == 0) {
            onClickUbahDataLainnya onclickubahdatalainnya = this.l;
            if (onclickubahdatalainnya != null) {
                a(onClickUbahDataFasilitas.e(onclickubahdatalainnya, fArr));
            } else {
                a(onClickUbahDataFasilitas.a(this.f75o, fArr));
            }
        } else {
            e(fArr);
        }
    }

    @Override // o.onClickUbahDataPekerjaan, java.lang.Object
    public final String toString() {
        StringBuilder sb = new StringBuilder("ObjectAnimator@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(", target ");
        sb.append(this.n);
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
