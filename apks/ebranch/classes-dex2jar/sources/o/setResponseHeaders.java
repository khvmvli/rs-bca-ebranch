package o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.SoftReference;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import o.setRequestPayloadSize;
import org.joda.time.DateTimeZone;
import org.joda.time.tz.Provider;
/* loaded from: classes-dex2jar.jar:o/setResponseHeaders.class */
public final class setResponseHeaders extends BroadcastReceiver {

    /* loaded from: classes-dex2jar.jar:o/setResponseHeaders$com_github_ChuckerTeam_Chucker_library.class */
    public final class com_github_ChuckerTeam_Chucker_library implements Provider {
        private Context d;
        private final Map<String, Object> e;

        public com_github_ChuckerTeam_Chucker_library(Context context) throws IOException {
            if (context != null) {
                this.d = context.getApplicationContext();
                this.e = b(e("ZoneInfoMap"));
                return;
            }
            throw new IllegalArgumentException("Context must not be null");
        }

        /*  JADX ERROR: JadxRuntimeException in pass: SSATransform
            jadx.core.utils.exceptions.JadxRuntimeException: Not initialized variable reg: 6, insn: 0x0042: MOVE  (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r6 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:19:0x0042
            	at jadx.core.dex.visitors.ssa.SSATransform.renameVarsInBlock(SSATransform.java:171)
            	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:143)
            	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:60)
            	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:41)
            */
        private org.joda.time.DateTimeZone a(
        /*  JADX ERROR: JadxRuntimeException in pass: SSATransform
            jadx.core.utils.exceptions.JadxRuntimeException: Not initialized variable reg: 6, insn: 0x0042: MOVE  (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r6 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:19:0x0042
            	at jadx.core.dex.visitors.ssa.SSATransform.renameVarsInBlock(SSATransform.java:171)
            	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:143)
            	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:60)
            */
        /*  JADX ERROR: Method generation error
            jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r5v0 ??
            	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:228)
            	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:198)
            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:151)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:364)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:304)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:270)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            */

        private static void a(DataInputStream dataInputStream, Map<String, Object> map) throws IOException {
            int readUnsignedShort = dataInputStream.readUnsignedShort();
            String[] strArr = new String[readUnsignedShort];
            for (int i = 0; i < readUnsignedShort; i++) {
                strArr[i] = dataInputStream.readUTF().intern();
            }
            int readUnsignedShort2 = dataInputStream.readUnsignedShort();
            for (int i2 = 0; i2 < readUnsignedShort2; i2++) {
                try {
                    map.put(strArr[dataInputStream.readUnsignedShort()], strArr[dataInputStream.readUnsignedShort()]);
                } catch (ArrayIndexOutOfBoundsException e) {
                    throw new IOException("Corrupt zone info map");
                }
            }
        }

        private static Map<String, Object> b(InputStream inputStream) throws IOException {
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            try {
                a(dataInputStream, concurrentHashMap);
                concurrentHashMap.put("UTC", new SoftReference(DateTimeZone.UTC));
                return concurrentHashMap;
            } finally {
                try {
                    dataInputStream.close();
                } catch (IOException e) {
                }
            }
        }

        private InputStream e(String str) throws IOException {
            if (this.d != null) {
                String d = setResponseBody.d(str);
                int c = setResponseBody.c(setRequestPayloadSize.RemoteActionCompatParcelizer.class, d);
                if (c != 0) {
                    return this.d.getResources().openRawResource(c);
                }
                StringBuilder sb = new StringBuilder("Resource not found: \"");
                sb.append(str);
                sb.append("\" (resName: \"");
                sb.append(d);
                sb.append("\")");
                throw new IOException(sb.toString());
            }
            throw new RuntimeException("Need to call JodaTimeAndroid.init() before using joda-time-android");
        }

        @Override // org.joda.time.tz.Provider
        public final Set<String> getAvailableIDs() {
            return new TreeSet(this.e.keySet());
        }

        @Override // org.joda.time.tz.Provider
        public final DateTimeZone getZone(String str) {
            Object obj;
            while (str != null && (obj = this.e.get(str)) != null) {
                if (str.equals(obj)) {
                    return a(str);
                }
                if (obj instanceof SoftReference) {
                    DateTimeZone dateTimeZone = (DateTimeZone) ((SoftReference) obj).get();
                    return dateTimeZone != null ? dateTimeZone : a(str);
                }
                str = (String) obj;
            }
            return null;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String stringExtra = intent.getStringExtra("time-zone");
        try {
            DateTimeZone.setDefault(DateTimeZone.forTimeZone(TimeZone.getDefault()));
            StringBuilder sb = new StringBuilder("TIMEZONE_CHANGED received, changed default timezone to \"");
            sb.append(stringExtra);
            sb.append("\"");
            Log.d("joda-time-android", sb.toString());
        } catch (IllegalArgumentException e) {
            StringBuilder sb2 = new StringBuilder("Could not recognize timezone id \"");
            sb2.append(stringExtra);
            sb2.append("\"");
            Log.e("joda-time-android", sb2.toString(), e);
        }
    }
}
