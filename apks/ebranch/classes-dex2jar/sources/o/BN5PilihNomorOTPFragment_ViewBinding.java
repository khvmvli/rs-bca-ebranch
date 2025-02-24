package o;

import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import o.CC10KTPFormKartuKreditFragment_ViewBinding;
/* loaded from: classes-dex2jar.jar:o/BN5PilihNomorOTPFragment_ViewBinding.class */
public class BN5PilihNomorOTPFragment_ViewBinding {
    public static final showPekerjaanDialog<?> a = new showPekerjaanDialog<>(Object.class);
    public final boolean b;
    public final ThreadLocal<Map<showPekerjaanDialog<?>, IconCompatParcelizer<?>>> c;
    public final List<onDismissUpdateDaftarTransfer> d;
    public final List<onDismissUpdateDaftarTransfer> e;
    public final int f;
    public final deleteDataPenerima g;
    public final onChooseStatusKewarganegaraan h;
    public final List<onDismissUpdateDaftarTransfer> i;
    public final String j;
    public final boolean k;
    public final onClickedPendidikanTerakhir l;
    public final Map<Type, BN5PilihNomorOTPFragment<?>> m;
    public final boolean n;

    /* renamed from: o */
    public final onSelectNomorOTP f75o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final onBankNameKUChangeEvent t;
    public final int u;
    public final Map<showPekerjaanDialog<?>, BN5VerifikasiOTPFragment_ViewBinding<?>> x;

    /* loaded from: classes-dex2jar.jar:o/BN5PilihNomorOTPFragment_ViewBinding$IconCompatParcelizer.class */
    public static final class IconCompatParcelizer<T> extends BN5VerifikasiOTPFragment_ViewBinding<T> {
        BN5VerifikasiOTPFragment_ViewBinding<T> b;

        IconCompatParcelizer() {
        }

        @Override // o.BN5VerifikasiOTPFragment_ViewBinding
        public final T c(JsonReader jsonReader) throws IOException {
            BN5VerifikasiOTPFragment_ViewBinding<T> bN5VerifikasiOTPFragment_ViewBinding = this.b;
            if (bN5VerifikasiOTPFragment_ViewBinding != null) {
                return bN5VerifikasiOTPFragment_ViewBinding.c(jsonReader);
            }
            throw new IllegalStateException();
        }

        @Override // o.BN5VerifikasiOTPFragment_ViewBinding
        public final void d(JsonWriter jsonWriter, T t) throws IOException {
            BN5VerifikasiOTPFragment_ViewBinding<T> bN5VerifikasiOTPFragment_ViewBinding = this.b;
            if (bN5VerifikasiOTPFragment_ViewBinding != null) {
                bN5VerifikasiOTPFragment_ViewBinding.d(jsonWriter, t);
                return;
            }
            throw new IllegalStateException();
        }
    }

    public BN5PilihNomorOTPFragment_ViewBinding() {
        this(deleteDataPenerima.c, onRequestOTP.IDENTITY, Collections.emptyMap(), false, false, false, true, false, false, false, onBankNameKUChangeEvent.DEFAULT, null, 2, 2, Collections.emptyList(), Collections.emptyList(), Collections.emptyList());
    }

    public BN5PilihNomorOTPFragment_ViewBinding(deleteDataPenerima deletedatapenerima, onSelectNomorOTP onselectnomorotp, Map<Type, BN5PilihNomorOTPFragment<?>> map, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, onBankNameKUChangeEvent onbanknamekuchangeevent, String str, int i, int i2, List<onDismissUpdateDaftarTransfer> list, List<onDismissUpdateDaftarTransfer> list2, List<onDismissUpdateDaftarTransfer> list3) {
        ArrayList arrayList = new ArrayList(list3);
        arrayList.add(new CC21AFormKartuKreditFragment());
        this.c = new ThreadLocal<>();
        this.x = new ConcurrentHashMap();
        this.g = deletedatapenerima;
        this.f75o = onselectnomorotp;
        this.m = map;
        onChooseStatusKewarganegaraan onchoosestatuskewarganegaraan = new onChooseStatusKewarganegaraan(map);
        this.h = onchoosestatuskewarganegaraan;
        this.p = z;
        this.b = z2;
        this.n = z3;
        this.k = z4;
        this.s = z5;
        this.q = z6;
        this.r = z7;
        this.t = onbanknamekuchangeevent;
        this.j = str;
        this.f = i;
        this.u = i2;
        this.d = list;
        this.e = list2;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(showStatusTempatTinggalDialog.I);
        arrayList2.add(onClickedStatusPerkawinan.a);
        arrayList2.add(deletedatapenerima);
        arrayList2.addAll(arrayList);
        arrayList2.add(showStatusTempatTinggalDialog.R);
        arrayList2.add(showStatusTempatTinggalDialog.z);
        arrayList2.add(showStatusTempatTinggalDialog.f294o);
        arrayList2.add(showStatusTempatTinggalDialog.m);
        arrayList2.add(showStatusTempatTinggalDialog.M);
        final BN5VerifikasiOTPFragment_ViewBinding r11 = onbanknamekuchangeevent == onBankNameKUChangeEvent.DEFAULT ? showStatusTempatTinggalDialog.F : new BN5VerifikasiOTPFragment_ViewBinding<Number>() { // from class: o.BN5PilihNomorOTPFragment_ViewBinding.1
            @Override // o.BN5VerifikasiOTPFragment_ViewBinding
            public final /* synthetic */ Number c(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() != JsonToken.NULL) {
                    return Long.valueOf(jsonReader.nextLong());
                }
                jsonReader.nextNull();
                return null;
            }

            @Override // o.BN5VerifikasiOTPFragment_ViewBinding
            public final /* synthetic */ void d(JsonWriter jsonWriter, Number number) throws IOException {
                Number number2 = number;
                if (number2 == null) {
                    jsonWriter.nullValue();
                } else {
                    jsonWriter.value(number2.toString());
                }
            }
        };
        arrayList2.add(showStatusTempatTinggalDialog.e(Long.TYPE, Long.class, r11));
        arrayList2.add(showStatusTempatTinggalDialog.e(Double.TYPE, Double.class, z7 ? showStatusTempatTinggalDialog.x : new BN5VerifikasiOTPFragment_ViewBinding<Number>() { // from class: o.BN5PilihNomorOTPFragment_ViewBinding.2
            @Override // o.BN5VerifikasiOTPFragment_ViewBinding
            public final /* synthetic */ Number c(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() != JsonToken.NULL) {
                    return Double.valueOf(jsonReader.nextDouble());
                }
                jsonReader.nextNull();
                return null;
            }

            @Override // o.BN5VerifikasiOTPFragment_ViewBinding
            public final /* synthetic */ void d(JsonWriter jsonWriter, Number number) throws IOException {
                Number number2 = number;
                if (number2 == null) {
                    jsonWriter.nullValue();
                    return;
                }
                BN5PilihNomorOTPFragment_ViewBinding.e(number2.doubleValue());
                jsonWriter.value(number2);
            }
        }));
        arrayList2.add(showStatusTempatTinggalDialog.e(Float.TYPE, Float.class, z7 ? showStatusTempatTinggalDialog.D : new BN5VerifikasiOTPFragment_ViewBinding<Number>() { // from class: o.BN5PilihNomorOTPFragment_ViewBinding.4
            @Override // o.BN5VerifikasiOTPFragment_ViewBinding
            public final /* synthetic */ Number c(JsonReader jsonReader) throws IOException {
                if (jsonReader.peek() != JsonToken.NULL) {
                    return Float.valueOf((float) jsonReader.nextDouble());
                }
                jsonReader.nextNull();
                return null;
            }

            @Override // o.BN5VerifikasiOTPFragment_ViewBinding
            public final /* synthetic */ void d(JsonWriter jsonWriter, Number number) throws IOException {
                Number number2 = number;
                if (number2 == null) {
                    jsonWriter.nullValue();
                    return;
                }
                BN5PilihNomorOTPFragment_ViewBinding.e((double) number2.floatValue());
                jsonWriter.value(number2);
            }
        }));
        arrayList2.add(showStatusTempatTinggalDialog.N);
        arrayList2.add(showStatusTempatTinggalDialog.g);
        arrayList2.add(showStatusTempatTinggalDialog.a);
        arrayList2.add(showStatusTempatTinggalDialog.e(AtomicLong.class, 
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x01c3: INVOKE  
              (r0v24 'arrayList2' java.util.ArrayList)
              (wrap: o.onDismissUpdateDaftarTransfer : 0x01c0: INVOKE  (r1v43 o.onDismissUpdateDaftarTransfer A[REMOVE]) = 
              (wrap: java.lang.Class : 0x01af: CONST_CLASS   java.util.concurrent.atomic.AtomicLong.class)
              (wrap: o.BN5VerifikasiOTPFragment_ViewBinding$2 : 0x01bd: CONSTRUCTOR  (r2v8 o.BN5VerifikasiOTPFragment_ViewBinding$2 A[REMOVE]) = 
              (wrap: o.BN5PilihNomorOTPFragment_ViewBinding$5 : 0x01ba: CONSTRUCTOR  (r4v0 o.BN5PilihNomorOTPFragment_ViewBinding$5 A[REMOVE]) = (r11v1 'r11' o.BN5VerifikasiOTPFragment_ViewBinding A[DONT_INLINE, SKIP_ARG]) call: o.BN5PilihNomorOTPFragment_ViewBinding.5.<init>(o.BN5VerifikasiOTPFragment_ViewBinding):void type: CONSTRUCTOR)
             call: o.BN5VerifikasiOTPFragment_ViewBinding.2.<init>(o.BN5VerifikasiOTPFragment_ViewBinding):void type: CONSTRUCTOR)
             type: STATIC call: o.showStatusTempatTinggalDialog.e(java.lang.Class, o.BN5VerifikasiOTPFragment_ViewBinding):o.onDismissUpdateDaftarTransfer)
             type: INTERFACE call: java.util.List.add(java.lang.Object):boolean in method: o.BN5PilihNomorOTPFragment_ViewBinding.<init>(o.deleteDataPenerima, o.onSelectNomorOTP, java.util.Map<java.lang.reflect.Type, o.BN5PilihNomorOTPFragment<?>>, boolean, boolean, boolean, boolean, boolean, boolean, boolean, o.onBankNameKUChangeEvent, java.lang.String, int, int, java.util.List<o.onDismissUpdateDaftarTransfer>, java.util.List<o.onDismissUpdateDaftarTransfer>, java.util.List<o.onDismissUpdateDaftarTransfer>):void, file: classes-dex2jar.jar:o/BN5PilihNomorOTPFragment_ViewBinding.class
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:270)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:233)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:90)
            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:255)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:248)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:369)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:304)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:270)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: o.BN5VerifikasiOTPFragment_ViewBinding, state: GENERATED_AND_UNLOADED
            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:268)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:668)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:378)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:132)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:117)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:104)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:974)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:799)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:382)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:132)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:117)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:104)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:974)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:799)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:382)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:263)
            	... 15 more
            */
        /*
        // Method dump skipped, instructions count: 816
        */
        throw new UnsupportedOperationException("Method not decompiled: o.BN5PilihNomorOTPFragment_ViewBinding.<init>(o.deleteDataPenerima, o.onSelectNomorOTP, java.util.Map, boolean, boolean, boolean, boolean, boolean, boolean, boolean, o.onBankNameKUChangeEvent, java.lang.String, int, int, java.util.List, java.util.List, java.util.List):void");
    }

    private <T> T a(JsonReader jsonReader, Type type) throws JsonIOException, JsonSyntaxException {
        boolean isLenient;
        EOFException e;
        try {
            isLenient = jsonReader.isLenient();
            boolean z = true;
            jsonReader.setLenient(true);
            try {
                try {
                    try {
                        jsonReader.peek();
                        try {
                            T c = e(new showPekerjaanDialog<>(type)).c(jsonReader);
                            jsonReader.setLenient(isLenient);
                            return c;
                        } catch (EOFException e2) {
                            e = e2;
                            z = false;
                            if (z) {
                                jsonReader.setLenient(isLenient);
                                return null;
                            }
                            throw new JsonSyntaxException(e);
                        }
                    } catch (EOFException e3) {
                        e = e3;
                    }
                } catch (IOException e4) {
                    throw new JsonSyntaxException(e4);
                }
            } catch (AssertionError e5) {
                StringBuilder sb = new StringBuilder("AssertionError (GSON 2.8.7): ");
                sb.append(e5.getMessage());
                AssertionError assertionError = new AssertionError(sb.toString());
                assertionError.initCause(e5);
                throw assertionError;
            } catch (IllegalStateException e6) {
                throw new JsonSyntaxException(e6);
            }
        } catch (Throwable th) {
            jsonReader.setLenient(isLenient);
            throw th;
        }
    }

    private void b(Object obj, Type type, JsonWriter jsonWriter) throws JsonIOException {
        boolean isLenient;
        boolean isHtmlSafe;
        boolean serializeNulls;
        try {
            BN5VerifikasiOTPFragment_ViewBinding e = e(new showPekerjaanDialog(type));
            isLenient = jsonWriter.isLenient();
            jsonWriter.setLenient(true);
            isHtmlSafe = jsonWriter.isHtmlSafe();
            jsonWriter.setHtmlSafe(this.k);
            serializeNulls = jsonWriter.getSerializeNulls();
            jsonWriter.setSerializeNulls(this.p);
            try {
                e.d(jsonWriter, obj);
                jsonWriter.setLenient(isLenient);
                jsonWriter.setHtmlSafe(isHtmlSafe);
                jsonWriter.setSerializeNulls(serializeNulls);
            } catch (IOException e2) {
                throw new JsonIOException(e2);
            } catch (AssertionError e3) {
                StringBuilder sb = new StringBuilder("AssertionError (GSON 2.8.7): ");
                sb.append(e3.getMessage());
                AssertionError assertionError = new AssertionError(sb.toString());
                assertionError.initCause(e3);
                throw assertionError;
            }
        } catch (Throwable th) {
            jsonWriter.setLenient(isLenient);
            jsonWriter.setHtmlSafe(isHtmlSafe);
            jsonWriter.setSerializeNulls(serializeNulls);
            throw th;
        }
    }

    private void c(BN5PilihRekeningFragment_ViewBinding bN5PilihRekeningFragment_ViewBinding, JsonWriter jsonWriter) throws JsonIOException {
        boolean isLenient;
        boolean isHtmlSafe;
        boolean serializeNulls;
        try {
            isLenient = jsonWriter.isLenient();
            jsonWriter.setLenient(true);
            isHtmlSafe = jsonWriter.isHtmlSafe();
            jsonWriter.setHtmlSafe(this.k);
            serializeNulls = jsonWriter.getSerializeNulls();
            jsonWriter.setSerializeNulls(this.p);
            try {
                try {
                    showStatusTempatTinggalDialog.H.d(jsonWriter, bN5PilihRekeningFragment_ViewBinding);
                    jsonWriter.setLenient(isLenient);
                    jsonWriter.setHtmlSafe(isHtmlSafe);
                    jsonWriter.setSerializeNulls(serializeNulls);
                } catch (IOException e) {
                    throw new JsonIOException(e);
                }
            } catch (AssertionError e2) {
                StringBuilder sb = new StringBuilder("AssertionError (GSON 2.8.7): ");
                sb.append(e2.getMessage());
                AssertionError assertionError = new AssertionError(sb.toString());
                assertionError.initCause(e2);
                throw assertionError;
            }
        } catch (Throwable th) {
            jsonWriter.setLenient(isLenient);
            jsonWriter.setHtmlSafe(isHtmlSafe);
            jsonWriter.setSerializeNulls(serializeNulls);
            throw th;
        }
    }

    static void e(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            StringBuilder sb = new StringBuilder();
            sb.append(d);
            sb.append(" is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public final String a(Object obj, Type type) {
        Writer stringWriter = new StringWriter();
        try {
            b(obj, type, c(stringWriter instanceof Writer ? stringWriter : new CC10KTPFormKartuKreditFragment_ViewBinding.IconCompatParcelizer(stringWriter)));
            return stringWriter.toString();
        } catch (IOException e) {
            throw new JsonIOException(e);
        }
    }

    public final <T> T b(Reader reader, Type type) throws JsonIOException, JsonSyntaxException {
        JsonReader jsonReader = new JsonReader(reader);
        jsonReader.setLenient(this.q);
        T t = (T) a(jsonReader, type);
        if (t != null) {
            try {
                if (jsonReader.peek() != JsonToken.END_DOCUMENT) {
                    throw new JsonIOException("JSON document was not fully consumed.");
                }
            } catch (MalformedJsonException e) {
                throw new JsonSyntaxException(e);
            } catch (IOException e2) {
                throw new JsonIOException(e2);
            }
        }
        return t;
    }

    public final String b(BN5PilihRekeningFragment_ViewBinding bN5PilihRekeningFragment_ViewBinding) {
        Writer stringWriter = new StringWriter();
        try {
            c(bN5PilihRekeningFragment_ViewBinding, c(stringWriter instanceof Writer ? stringWriter : new CC10KTPFormKartuKreditFragment_ViewBinding.IconCompatParcelizer(stringWriter)));
            return stringWriter.toString();
        } catch (IOException e) {
            throw new JsonIOException(e);
        }
    }

    public final JsonWriter c(Writer writer) throws IOException {
        if (this.n) {
            writer.write(")]}'\n");
        }
        JsonWriter jsonWriter = new JsonWriter(writer);
        if (this.s) {
            jsonWriter.setIndent("  ");
        }
        jsonWriter.setSerializeNulls(this.p);
        return jsonWriter;
    }

    public final <T> BN5VerifikasiOTPFragment_ViewBinding<T> d(onDismissUpdateDaftarTransfer ondismissupdatedaftartransfer, showPekerjaanDialog<T> showpekerjaandialog) {
        onDismissUpdateDaftarTransfer ondismissupdatedaftartransfer2 = ondismissupdatedaftartransfer;
        if (!this.i.contains(ondismissupdatedaftartransfer)) {
            ondismissupdatedaftartransfer2 = this.l;
        }
        boolean z = false;
        for (onDismissUpdateDaftarTransfer ondismissupdatedaftartransfer3 : this.i) {
            if (z) {
                BN5VerifikasiOTPFragment_ViewBinding<T> e = ondismissupdatedaftartransfer3.e(this, showpekerjaandialog);
                if (e != null) {
                    return e;
                }
            } else if (ondismissupdatedaftartransfer3 == ondismissupdatedaftartransfer2) {
                z = true;
            }
        }
        StringBuilder sb = new StringBuilder("GSON cannot serialize ");
        sb.append(showpekerjaandialog);
        throw new IllegalArgumentException(sb.toString());
    }

    public final <T> BN5VerifikasiOTPFragment_ViewBinding<T> e(showPekerjaanDialog<T> showpekerjaandialog) {
        boolean z;
        BN5VerifikasiOTPFragment_ViewBinding<T> e;
        BN5VerifikasiOTPFragment_ViewBinding<T> bN5VerifikasiOTPFragment_ViewBinding = (BN5VerifikasiOTPFragment_ViewBinding<T>) this.x.get(showpekerjaandialog == null ? a : showpekerjaandialog);
        if (bN5VerifikasiOTPFragment_ViewBinding != null) {
            return bN5VerifikasiOTPFragment_ViewBinding;
        }
        Map<showPekerjaanDialog<?>, IconCompatParcelizer<?>> map = this.c.get();
        if (map == null) {
            map = new HashMap<>();
            this.c.set(map);
            z = true;
        } else {
            z = false;
        }
        IconCompatParcelizer<?> iconCompatParcelizer = map.get(showpekerjaandialog);
        if (iconCompatParcelizer != null) {
            return iconCompatParcelizer;
        }
        try {
            IconCompatParcelizer<?> iconCompatParcelizer2 = new IconCompatParcelizer<>();
            map.put(showpekerjaandialog, iconCompatParcelizer2);
            Iterator<onDismissUpdateDaftarTransfer> it = this.i.iterator();
            do {
                if (it.hasNext()) {
                    e = it.next().e(this, showpekerjaandialog);
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("GSON (2.8.7) cannot handle ");
                    sb.append(showpekerjaandialog);
                    throw new IllegalArgumentException(sb.toString());
                }
            } while (e == null);
            if (iconCompatParcelizer2.b == null) {
                iconCompatParcelizer2.b = e;
                this.x.put(showpekerjaandialog, e);
                return e;
            }
            throw new AssertionError();
        } finally {
            map.remove(showpekerjaandialog);
            if (z) {
                this.c.remove();
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{serializeNulls:");
        sb.append(this.p);
        sb.append(",factories:");
        sb.append(this.i);
        sb.append(",instanceCreators:");
        sb.append(this.h);
        sb.append("}");
        return sb.toString();
    }
}
