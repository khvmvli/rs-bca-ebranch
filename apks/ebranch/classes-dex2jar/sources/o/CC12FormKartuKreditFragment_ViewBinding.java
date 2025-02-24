package o;

import com.google.gson.stream.JsonReader;
import java.io.IOException;
import java.lang.reflect.Type;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/CC12FormKartuKreditFragment_ViewBinding.class */
public final class CC12FormKartuKreditFragment_ViewBinding<T> extends BN5VerifikasiOTPFragment_ViewBinding<T> {
    private final BN5PilihNomorOTPFragment_ViewBinding b;
    private final Type c;
    private final BN5VerifikasiOTPFragment_ViewBinding<T> e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CC12FormKartuKreditFragment_ViewBinding(BN5PilihNomorOTPFragment_ViewBinding bN5PilihNomorOTPFragment_ViewBinding, BN5VerifikasiOTPFragment_ViewBinding<T> bN5VerifikasiOTPFragment_ViewBinding, Type type) {
        this.b = bN5PilihNomorOTPFragment_ViewBinding;
        this.e = bN5VerifikasiOTPFragment_ViewBinding;
        this.c = type;
    }

    @Override // o.BN5VerifikasiOTPFragment_ViewBinding
    public final T c(JsonReader jsonReader) throws IOException {
        return this.e.c(jsonReader);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x002b, code lost:
        if ((r0 instanceof java.lang.Class) != false) goto L_0x002e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.reflect.Type] */
    /* JADX WARN: Unknown variable types count: 1 */
    @Override // o.BN5VerifikasiOTPFragment_ViewBinding
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final void d(com.google.gson.stream.JsonWriter r6, T r7) throws java.io.IOException {
        /*
            r5 = this;
            r0 = r5
            o.BN5VerifikasiOTPFragment_ViewBinding<T> r0 = r0.e
            r8 = r0
            r0 = r5
            java.lang.reflect.Type r0 = r0.c
            r9 = r0
            r0 = r9
            r10 = r0
            r0 = r7
            if (r0 == 0) goto L_0x0034
            r0 = r9
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            if (r0 == r1) goto L_0x002e
            r0 = r9
            boolean r0 = r0 instanceof java.lang.reflect.TypeVariable
            if (r0 != 0) goto L_0x002e
            r0 = r9
            r10 = r0
            r0 = r9
            boolean r0 = r0 instanceof java.lang.Class
            if (r0 == 0) goto L_0x0034
        L_0x002e:
            r0 = r7
            java.lang.Class r0 = r0.getClass()
            r10 = r0
        L_0x0034:
            r0 = r10
            r1 = r5
            java.lang.reflect.Type r1 = r1.c
            if (r0 == r1) goto L_0x006e
            r0 = r5
            o.BN5PilihNomorOTPFragment_ViewBinding r0 = r0.b
            o.showPekerjaanDialog r1 = new o.showPekerjaanDialog
            r2 = r1
            r3 = r10
            r2.<init>(r3)
            o.BN5VerifikasiOTPFragment_ViewBinding r0 = r0.e(r1)
            r10 = r0
            r0 = r10
            r8 = r0
            r0 = r10
            boolean r0 = r0 instanceof o.SubscribeLamaMenempati$MediaBrowserCompat$CustomActionResultReceiver
            if (r0 == 0) goto L_0x006e
            r0 = r5
            o.BN5VerifikasiOTPFragment_ViewBinding<T> r0 = r0.e
            r9 = r0
            r0 = r10
            r8 = r0
            r0 = r9
            boolean r0 = r0 instanceof o.SubscribeLamaMenempati$MediaBrowserCompat$CustomActionResultReceiver
            if (r0 != 0) goto L_0x006e
            r0 = r9
            r8 = r0
        L_0x006e:
            r0 = r8
            r1 = r6
            r2 = r7
            r0.d(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.CC12FormKartuKreditFragment_ViewBinding.d(com.google.gson.stream.JsonWriter, java.lang.Object):void");
    }
}
