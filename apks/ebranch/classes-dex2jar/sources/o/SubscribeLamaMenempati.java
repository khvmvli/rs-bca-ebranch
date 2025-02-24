package o;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes-dex2jar.jar:o/SubscribeLamaMenempati.class */
public final class SubscribeLamaMenempati implements onDismissUpdateDaftarTransfer {
    private final onChooseStatusKewarganegaraan a;
    private final onSelectNomorOTP b;
    private final CC14FormKartuKreditPekerjaanFragment_ViewBinding c = CC14FormKartuKreditPekerjaanFragment_ViewBinding.c();
    private final deleteDataPenerima d;
    private final onClickedPendidikanTerakhir e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/SubscribeLamaMenempati$read.class */
    public static abstract class read {
        final boolean g;
        final String i;
        final boolean j;

        protected read(String str, boolean z, boolean z2) {
            this.i = str;
            this.g = z;
            this.j = z2;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract void a(JsonWriter jsonWriter, Object obj) throws IOException, IllegalAccessException;

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract void e(JsonReader jsonReader, Object obj) throws IOException, IllegalAccessException;

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract boolean e(Object obj) throws IOException, IllegalAccessException;
    }

    public SubscribeLamaMenempati(onChooseStatusKewarganegaraan onchoosestatuskewarganegaraan, onSelectNomorOTP onselectnomorotp, deleteDataPenerima deletedatapenerima, onClickedPendidikanTerakhir onclickedpendidikanterakhir) {
        this.a = onchoosestatuskewarganegaraan;
        this.b = onselectnomorotp;
        this.d = deletedatapenerima;
        this.e = onclickedpendidikanterakhir;
    }

    private List<String> a(Field field) {
        infoContactPersonDialogEvent infocontactpersondialogevent = (infoContactPersonDialogEvent) field.getAnnotation(infoContactPersonDialogEvent.class);
        if (infocontactpersondialogevent == null) {
            return Collections.singletonList(this.b.e(field));
        }
        String c = infocontactpersondialogevent.c();
        String[] e = infocontactpersondialogevent.e();
        if (e.length == 0) {
            return Collections.singletonList(c);
        }
        ArrayList arrayList = new ArrayList(e.length + 1);
        arrayList.add(c);
        for (String str : e) {
            arrayList.add(str);
        }
        return arrayList;
    }

    private Map<String, read> b(final BN5PilihNomorOTPFragment_ViewBinding bN5PilihNomorOTPFragment_ViewBinding, showPekerjaanDialog<?> showpekerjaandialog, Class<?> cls) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (cls.isInterface()) {
            return linkedHashMap;
        }
        Type type = showpekerjaandialog.e;
        while (cls != Object.class) {
            Field[] declaredFields = cls.getDeclaredFields();
            int i = 0;
            for (int length = declaredFields.length; i < length; length = length) {
                final Field field = declaredFields[i];
                boolean c = c(field, true);
                boolean c2 = c(field, false);
                if (c || c2) {
                    this.c.a(field);
                    Type a = ubahDataPenerima.a(showpekerjaandialog.e, cls, field.getGenericType());
                    List<String> a2 = a(field);
                    int size = a2.size();
                    read read2 = null;
                    for (int i2 = 0; i2 < size; i2++) {
                        String str = a2.get(i2);
                        if (i2 != 0) {
                            c = false;
                        }
                        final showPekerjaanDialog showpekerjaandialog2 = new showPekerjaanDialog(a);
                        Class cls2 = showpekerjaandialog2.d;
                        final boolean z = (cls2 instanceof Class) && cls2.isPrimitive();
                        onChooseWaktuPengiriman onchoosewaktupengiriman = (onChooseWaktuPengiriman) field.getAnnotation(onChooseWaktuPengiriman.class);
                        BN5VerifikasiOTPFragment_ViewBinding<?> b = onchoosewaktupengiriman != null ? onClickedPendidikanTerakhir.b(this.a, bN5PilihNomorOTPFragment_ViewBinding, showpekerjaandialog2, onchoosewaktupengiriman) : null;
                        final boolean z2 = b != null;
                        final BN5VerifikasiOTPFragment_ViewBinding<?> bN5VerifikasiOTPFragment_ViewBinding = b;
                        if (b == null) {
                            bN5VerifikasiOTPFragment_ViewBinding = bN5PilihNomorOTPFragment_ViewBinding.e(showpekerjaandialog2);
                        }
                        read2 = (read) linkedHashMap.put(str, new read(str, c, c2) { // from class: o.SubscribeLamaMenempati.3
                            @Override // o.SubscribeLamaMenempati.read
                            final void a(JsonWriter jsonWriter, Object obj) throws IOException, IllegalAccessException {
                                (z2 ? bN5VerifikasiOTPFragment_ViewBinding : new CC12FormKartuKreditFragment_ViewBinding(bN5PilihNomorOTPFragment_ViewBinding, bN5VerifikasiOTPFragment_ViewBinding, showpekerjaandialog2.e)).d(jsonWriter, field.get(obj));
                            }

                            @Override // o.SubscribeLamaMenempati.read
                            final void e(JsonReader jsonReader, Object obj) throws IOException, IllegalAccessException {
                                Object c3 = bN5VerifikasiOTPFragment_ViewBinding.c(jsonReader);
                                if (c3 != null || !z) {
                                    field.set(obj, c3);
                                }
                            }

                            @Override // o.SubscribeLamaMenempati.read
                            public final boolean e(Object obj) throws IOException, IllegalAccessException {
                                boolean z3 = false;
                                if (!this.g) {
                                    return false;
                                }
                                if (field.get(obj) != obj) {
                                    z3 = true;
                                }
                                return z3;
                            }
                        });
                        if (read2 == null) {
                        }
                    }
                    if (read2 != null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(type);
                        sb.append(" declares multiple JSON fields named ");
                        sb.append(read2.i);
                        throw new IllegalArgumentException(sb.toString());
                    }
                }
                i++;
            }
            showpekerjaandialog = new showPekerjaanDialog<>(ubahDataPenerima.a(showpekerjaandialog.e, cls, cls.getGenericSuperclass()));
            cls = showpekerjaandialog.d;
        }
        return linkedHashMap;
    }

    private boolean c(Field field, boolean z) {
        return e(field, z, this.d);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0118  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private static boolean e(java.lang.reflect.Field r5, boolean r6, o.deleteDataPenerima r7) {
        /*
        // Method dump skipped, instructions count: 286
        */
        throw new UnsupportedOperationException("Method not decompiled: o.SubscribeLamaMenempati.e(java.lang.reflect.Field, boolean, o.deleteDataPenerima):boolean");
    }

    @Override // o.onDismissUpdateDaftarTransfer
    public final <T> BN5VerifikasiOTPFragment_ViewBinding<T> e(BN5PilihNomorOTPFragment_ViewBinding bN5PilihNomorOTPFragment_ViewBinding, showPekerjaanDialog<T> showpekerjaandialog) {
        Class<? super T> cls = showpekerjaandialog.d;
        if (!Object.class.isAssignableFrom(cls)) {
            return null;
        }
        return new SubscribeLamaMenempati$MediaBrowserCompat$CustomActionResultReceiver(this.a.c(showpekerjaandialog), b(bN5PilihNomorOTPFragment_ViewBinding, showpekerjaandialog, cls));
    }
}
