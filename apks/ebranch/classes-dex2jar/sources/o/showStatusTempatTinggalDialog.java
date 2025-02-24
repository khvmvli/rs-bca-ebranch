package o;

import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URL;
import java.sql.Timestamp;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import o.BN5VerifikasiOTPFragment_ViewBinding;
/* loaded from: classes-dex2jar.jar:o/showStatusTempatTinggalDialog.class */
public final class showStatusTempatTinggalDialog {
    public static final BN5VerifikasiOTPFragment_ViewBinding<InetAddress> A;
    public static final onDismissUpdateDaftarTransfer B;
    public static final BN5VerifikasiOTPFragment_ViewBinding<Number> C;
    public static final onDismissUpdateDaftarTransfer E;
    public static final BN5VerifikasiOTPFragment_ViewBinding<Locale> G;
    public static final BN5VerifikasiOTPFragment_ViewBinding<BN5PilihRekeningFragment_ViewBinding> H;
    public static final onDismissUpdateDaftarTransfer I;
    public static final BN5VerifikasiOTPFragment_ViewBinding<Number> J;
    public static final BN5VerifikasiOTPFragment_ViewBinding<Number> K;
    public static final BN5VerifikasiOTPFragment_ViewBinding<String> L;
    public static final onDismissUpdateDaftarTransfer M;
    public static final onDismissUpdateDaftarTransfer N;
    public static final BN5VerifikasiOTPFragment_ViewBinding<StringBuilder> O;
    public static final onDismissUpdateDaftarTransfer P;
    public static final onDismissUpdateDaftarTransfer Q;
    public static final onDismissUpdateDaftarTransfer R;
    public static final BN5VerifikasiOTPFragment_ViewBinding<StringBuffer> S;
    public static final onDismissUpdateDaftarTransfer T;
    public static final BN5VerifikasiOTPFragment_ViewBinding<URI> U;
    public static final onDismissUpdateDaftarTransfer W;
    public static final BN5VerifikasiOTPFragment_ViewBinding<URL> X;
    public static final onDismissUpdateDaftarTransfer Y;
    public static final onDismissUpdateDaftarTransfer a;
    public static final BN5VerifikasiOTPFragment_ViewBinding<UUID> aa;
    public static final BN5VerifikasiOTPFragment_ViewBinding<AtomicBoolean> b;
    public static final onDismissUpdateDaftarTransfer c;
    public static final BN5VerifikasiOTPFragment_ViewBinding<AtomicInteger> d;
    public static final BN5VerifikasiOTPFragment_ViewBinding<AtomicIntegerArray> e;
    public static final onDismissUpdateDaftarTransfer g;
    public static final onDismissUpdateDaftarTransfer h;
    public static final BN5VerifikasiOTPFragment_ViewBinding<BitSet> j;
    public static final BN5VerifikasiOTPFragment_ViewBinding<Boolean> l;
    public static final onDismissUpdateDaftarTransfer m;
    public static final BN5VerifikasiOTPFragment_ViewBinding<Number> n;

    /* renamed from: o */
    public static final onDismissUpdateDaftarTransfer f294o;
    public static final BN5VerifikasiOTPFragment_ViewBinding<Calendar> p;
    public static final onDismissUpdateDaftarTransfer q;
    public static final BN5VerifikasiOTPFragment_ViewBinding<Character> r;
    public static final BN5VerifikasiOTPFragment_ViewBinding<Class> s;
    public static final onDismissUpdateDaftarTransfer t;
    public static final BN5VerifikasiOTPFragment_ViewBinding<Currency> u;
    public static final onDismissUpdateDaftarTransfer v;
    public static final onDismissUpdateDaftarTransfer y;
    public static final onDismissUpdateDaftarTransfer z;
    public static final BN5VerifikasiOTPFragment_ViewBinding<Boolean> k = new BN5VerifikasiOTPFragment_ViewBinding<Boolean>() { // from class: o.showStatusTempatTinggalDialog.28
        @Override // o.BN5VerifikasiOTPFragment_ViewBinding
        public final /* synthetic */ Boolean c(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() != JsonToken.NULL) {
                return Boolean.valueOf(jsonReader.nextString());
            }
            jsonReader.nextNull();
            return null;
        }

        @Override // o.BN5VerifikasiOTPFragment_ViewBinding
        public final /* synthetic */ void d(JsonWriter jsonWriter, Boolean bool) throws IOException {
            Boolean bool2 = bool;
            jsonWriter.value(bool2 == null ? "null" : bool2.toString());
        }
    };
    public static final BN5VerifikasiOTPFragment_ViewBinding<Number> F = new BN5VerifikasiOTPFragment_ViewBinding<Number>() { // from class: o.showStatusTempatTinggalDialog.2
        private static Number e(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            try {
                return Long.valueOf(jsonReader.nextLong());
            } catch (NumberFormatException e2) {
                throw new JsonSyntaxException(e2);
            }
        }

        @Override // o.BN5VerifikasiOTPFragment_ViewBinding
        public final /* synthetic */ Number c(JsonReader jsonReader) throws IOException {
            return e(jsonReader);
        }

        @Override // o.BN5VerifikasiOTPFragment_ViewBinding
        public final /* synthetic */ void d(JsonWriter jsonWriter, Number number) throws IOException {
            jsonWriter.value(number);
        }
    };
    public static final BN5VerifikasiOTPFragment_ViewBinding<Number> D = new BN5VerifikasiOTPFragment_ViewBinding<Number>() { // from class: o.showStatusTempatTinggalDialog.4
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
            jsonWriter.value(number);
        }
    };
    public static final BN5VerifikasiOTPFragment_ViewBinding<Number> x = new BN5VerifikasiOTPFragment_ViewBinding<Number>() { // from class: o.showStatusTempatTinggalDialog.1
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
            jsonWriter.value(number);
        }
    };
    public static final BN5VerifikasiOTPFragment_ViewBinding<BigDecimal> f = new BN5VerifikasiOTPFragment_ViewBinding<BigDecimal>() { // from class: o.showStatusTempatTinggalDialog.7
        private static BigDecimal a(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            try {
                return new BigDecimal(jsonReader.nextString());
            } catch (NumberFormatException e2) {
                throw new JsonSyntaxException(e2);
            }
        }

        @Override // o.BN5VerifikasiOTPFragment_ViewBinding
        public final /* synthetic */ BigDecimal c(JsonReader jsonReader) throws IOException {
            return a(jsonReader);
        }

        @Override // o.BN5VerifikasiOTPFragment_ViewBinding
        public final /* synthetic */ void d(JsonWriter jsonWriter, BigDecimal bigDecimal) throws IOException {
            jsonWriter.value(bigDecimal);
        }
    };
    public static final BN5VerifikasiOTPFragment_ViewBinding<BigInteger> i = new BN5VerifikasiOTPFragment_ViewBinding<BigInteger>() { // from class: o.showStatusTempatTinggalDialog.9
        private static BigInteger b(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            try {
                return new BigInteger(jsonReader.nextString());
            } catch (NumberFormatException e2) {
                throw new JsonSyntaxException(e2);
            }
        }

        @Override // o.BN5VerifikasiOTPFragment_ViewBinding
        public final /* synthetic */ BigInteger c(JsonReader jsonReader) throws IOException {
            return b(jsonReader);
        }

        @Override // o.BN5VerifikasiOTPFragment_ViewBinding
        public final /* synthetic */ void d(JsonWriter jsonWriter, BigInteger bigInteger) throws IOException {
            jsonWriter.value(bigInteger);
        }
    };
    public static final onDismissUpdateDaftarTransfer V = new onDismissUpdateDaftarTransfer() { // from class: o.showStatusTempatTinggalDialog.20
        @Override // o.onDismissUpdateDaftarTransfer
        public final <T> BN5VerifikasiOTPFragment_ViewBinding<T> e(BN5PilihNomorOTPFragment_ViewBinding bN5PilihNomorOTPFragment_ViewBinding, showPekerjaanDialog<T> showpekerjaandialog) {
            if (showpekerjaandialog.d != Timestamp.class) {
                return null;
            }
            final BN5VerifikasiOTPFragment_ViewBinding<T> e2 = bN5PilihNomorOTPFragment_ViewBinding.e(new showPekerjaanDialog<>(Date.class));
            return new BN5VerifikasiOTPFragment_ViewBinding<Timestamp>() { // from class: o.showStatusTempatTinggalDialog.20.3
                @Override // o.BN5VerifikasiOTPFragment_ViewBinding
                public final /* synthetic */ Timestamp c(JsonReader jsonReader) throws IOException {
                    Date date = (Date) e2.c(jsonReader);
                    return date != null ? new Timestamp(date.getTime()) : null;
                }

                @Override // o.BN5VerifikasiOTPFragment_ViewBinding
                public final /* bridge */ /* synthetic */ void d(JsonWriter jsonWriter, Timestamp timestamp) throws IOException {
                    e2.d(jsonWriter, timestamp);
                }
            };
        }
    };
    public static final onDismissUpdateDaftarTransfer w = new onDismissUpdateDaftarTransfer() { // from class: o.showStatusTempatTinggalDialog.23
        @Override // o.onDismissUpdateDaftarTransfer
        public final <T> BN5VerifikasiOTPFragment_ViewBinding<T> e(BN5PilihNomorOTPFragment_ViewBinding bN5PilihNomorOTPFragment_ViewBinding, showPekerjaanDialog<T> showpekerjaandialog) {
            Class<? super T> cls = showpekerjaandialog.d;
            if (!Enum.class.isAssignableFrom(cls) || cls == Enum.class) {
                return null;
            }
            Class<? super Object> cls2 = cls;
            if (!cls.isEnum()) {
                cls2 = cls.getSuperclass();
            }
            return new showStatusTempatTinggalDialog$MediaBrowserCompat$CustomActionResultReceiver(cls2);
        }
    };

    static {
        final BN5VerifikasiOTPFragment_ViewBinding.AnonymousClass2 r0 = 
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x000b: CONSTRUCTOR  (r0v0 'r0' o.BN5VerifikasiOTPFragment_ViewBinding$2) = 
              (wrap: o.showStatusTempatTinggalDialog$3 : 0x0008: CONSTRUCTOR  (r2v0 o.showStatusTempatTinggalDialog$3 A[REMOVE]) =  call: o.showStatusTempatTinggalDialog.3.<init>():void type: CONSTRUCTOR)
             call: o.BN5VerifikasiOTPFragment_ViewBinding.2.<init>(o.BN5VerifikasiOTPFragment_ViewBinding):void type: CONSTRUCTOR in method: o.showStatusTempatTinggalDialog.<clinit>():void, file: classes-dex2jar.jar:o/showStatusTempatTinggalDialog.class
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
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:263)
            	... 15 more
            */
        /*
        // Method dump skipped, instructions count: 704
        */
        throw new UnsupportedOperationException("Method not decompiled: o.showStatusTempatTinggalDialog.m1195clinit():void");
    }

    public static <TT> onDismissUpdateDaftarTransfer e(final Class<TT> cls, final Class<TT> cls2, final BN5VerifikasiOTPFragment_ViewBinding<? super TT> bN5VerifikasiOTPFragment_ViewBinding) {
        return new onDismissUpdateDaftarTransfer() { // from class: o.showStatusTempatTinggalDialog.29
            @Override // o.onDismissUpdateDaftarTransfer
            public final <T> BN5VerifikasiOTPFragment_ViewBinding<T> e(BN5PilihNomorOTPFragment_ViewBinding bN5PilihNomorOTPFragment_ViewBinding, showPekerjaanDialog<T> showpekerjaandialog) {
                Class<? super T> cls3 = showpekerjaandialog.d;
                return (cls3 == cls || cls3 == cls2) ? bN5VerifikasiOTPFragment_ViewBinding : null;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Factory[type=");
                sb.append(cls2.getName());
                sb.append("+");
                sb.append(cls.getName());
                sb.append(",adapter=");
                sb.append(bN5VerifikasiOTPFragment_ViewBinding);
                sb.append("]");
                return sb.toString();
            }
        };
    }

    public static <TT> onDismissUpdateDaftarTransfer e(final Class<TT> cls, final BN5VerifikasiOTPFragment_ViewBinding<TT> bN5VerifikasiOTPFragment_ViewBinding) {
        return new onDismissUpdateDaftarTransfer() { // from class: o.showStatusTempatTinggalDialog.21
            @Override // o.onDismissUpdateDaftarTransfer
            public final <T> BN5VerifikasiOTPFragment_ViewBinding<T> e(BN5PilihNomorOTPFragment_ViewBinding bN5PilihNomorOTPFragment_ViewBinding, showPekerjaanDialog<T> showpekerjaandialog) {
                return showpekerjaandialog.d == cls ? bN5VerifikasiOTPFragment_ViewBinding : null;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Factory[type=");
                sb.append(cls.getName());
                sb.append(",adapter=");
                sb.append(bN5VerifikasiOTPFragment_ViewBinding);
                sb.append("]");
                return sb.toString();
            }
        };
    }
}
