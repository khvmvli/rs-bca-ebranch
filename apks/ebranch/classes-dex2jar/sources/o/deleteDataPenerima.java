package o;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
/* loaded from: classes-dex2jar.jar:o/deleteDataPenerima.class */
public final class deleteDataPenerima implements onDismissUpdateDaftarTransfer, Cloneable {
    public static final deleteDataPenerima c = new deleteDataPenerima();
    public boolean b;
    public double h = -1.0d;
    public int e = 136;
    public boolean f = true;
    public List<BN2PembelianFragment_ViewBinding> a = Collections.emptyList();
    public List<BN2PembelianFragment_ViewBinding> d = Collections.emptyList();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public deleteDataPenerima clone() {
        try {
            return (deleteDataPenerima) clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public static boolean b(Class<?> cls) {
        return !Enum.class.isAssignableFrom(cls) && (cls.isAnonymousClass() || cls.isLocalClass());
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a3 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public boolean a(java.lang.Class<?> r6) {
        /*
        // Method dump skipped, instructions count: 206
        */
        throw new UnsupportedOperationException("Method not decompiled: o.deleteDataPenerima.a(java.lang.Class):boolean");
    }

    public boolean b(onChooseSumberDana onchoosesumberdana, konfirmasiDeleteDataPenerima konfirmasideletedatapenerima) {
        boolean z = false;
        if (onchoosesumberdana == null || onchoosesumberdana.c() <= this.h) {
            z = false;
            if (konfirmasideletedatapenerima == null || konfirmasideletedatapenerima.c() > this.h) {
                z = true;
            }
        }
        return z;
    }

    @Override // o.onDismissUpdateDaftarTransfer
    public final <T> BN5VerifikasiOTPFragment_ViewBinding<T> e(final BN5PilihNomorOTPFragment_ViewBinding bN5PilihNomorOTPFragment_ViewBinding, final showPekerjaanDialog<T> showpekerjaandialog) {
        Class<? super T> cls = showpekerjaandialog.d;
        boolean a = a(cls);
        final boolean z = a || e((Class<?>) cls, true);
        final boolean z2 = a || e((Class<?>) cls, false);
        if (z || z2) {
            return new BN5VerifikasiOTPFragment_ViewBinding<T>() { // from class: o.deleteDataPenerima.3
                private BN5VerifikasiOTPFragment_ViewBinding<T> h;

                /* JADX WARN: Multi-variable type inference failed */
                private BN5VerifikasiOTPFragment_ViewBinding<T> c() {
                    BN5VerifikasiOTPFragment_ViewBinding bN5VerifikasiOTPFragment_ViewBinding = this.h;
                    BN5VerifikasiOTPFragment_ViewBinding bN5VerifikasiOTPFragment_ViewBinding2 = bN5VerifikasiOTPFragment_ViewBinding;
                    if (bN5VerifikasiOTPFragment_ViewBinding == null) {
                        BN5VerifikasiOTPFragment_ViewBinding d = bN5PilihNomorOTPFragment_ViewBinding.d(deleteDataPenerima.this, showpekerjaandialog);
                        this.h = d;
                        bN5VerifikasiOTPFragment_ViewBinding2 = d;
                    }
                    return bN5VerifikasiOTPFragment_ViewBinding2;
                }

                /* JADX WARN: Type inference failed for: r0v4, types: [T, java.lang.Object] */
                @Override // o.BN5VerifikasiOTPFragment_ViewBinding
                public final T c(JsonReader jsonReader) throws IOException {
                    if (!z2) {
                        return c().c(jsonReader);
                    }
                    jsonReader.skipValue();
                    return null;
                }

                @Override // o.BN5VerifikasiOTPFragment_ViewBinding
                public final void d(JsonWriter jsonWriter, T t) throws IOException {
                    if (z) {
                        jsonWriter.nullValue();
                    } else {
                        c().d(jsonWriter, t);
                    }
                }
            };
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0020, code lost:
        if (((r4.getModifiers() & 8) != 0) == false) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public boolean e(java.lang.Class<?> r4) {
        /*
            r3 = this;
            r0 = r4
            boolean r0 = r0.isMemberClass()
            r5 = r0
            r0 = 1
            r6 = r0
            r0 = r5
            if (r0 == 0) goto L_0x0026
            r0 = r4
            int r0 = r0.getModifiers()
            r1 = 8
            r0 = r0 & r1
            if (r0 == 0) goto L_0x001b
            r0 = 1
            r7 = r0
            goto L_0x001e
        L_0x001b:
            r0 = 0
            r7 = r0
        L_0x001e:
            r0 = r7
            if (r0 != 0) goto L_0x0026
            goto L_0x0028
        L_0x0026:
            r0 = 0
            r6 = r0
        L_0x0028:
            r0 = r6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.deleteDataPenerima.e(java.lang.Class):boolean");
    }

    public boolean e(Class<?> cls, boolean z) {
        for (BN2PembelianFragment_ViewBinding bN2PembelianFragment_ViewBinding : z ? this.a : this.d) {
            if (bN2PembelianFragment_ViewBinding.b()) {
                return true;
            }
        }
        return false;
    }
}
