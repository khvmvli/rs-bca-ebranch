package o;

import android.content.ContentResolver;
import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;
/* loaded from: classes-dex2jar.jar:o/CustDataResponse.class */
public final class CustDataResponse {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/CustDataResponse$Account.class */
    public final class Account {
        private static final setTxnStatus b = new setTxnStatus();
        private final DetailTransactionResponse a;
        private final ContentResolver c;
        private final List<ImageHeaderParser> d;
        private final getPhoneList e;
        private final setTxnStatus i;

        public Account(List<ImageHeaderParser> list, getPhoneList getphonelist, DetailTransactionResponse detailTransactionResponse, ContentResolver contentResolver) {
            this(list, b, getphonelist, detailTransactionResponse, contentResolver);
        }

        private Account(List<ImageHeaderParser> list, setTxnStatus settxnstatus, getPhoneList getphonelist, DetailTransactionResponse detailTransactionResponse, ContentResolver contentResolver) {
            this.i = settxnstatus;
            this.e = getphonelist;
            this.a = detailTransactionResponse;
            this.c = contentResolver;
            this.d = list;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: SSATransform
            jadx.core.utils.exceptions.JadxRuntimeException: Not initialized variable reg: 8, insn: 0x0035: MOVE  (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r8 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:16:0x0035
            	at jadx.core.dex.visitors.ssa.SSATransform.renameVarsInBlock(SSATransform.java:171)
            	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:143)
            	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:60)
            	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:41)
            */
        private java.lang.String a(
        /*  JADX ERROR: JadxRuntimeException in pass: SSATransform
            jadx.core.utils.exceptions.JadxRuntimeException: Not initialized variable reg: 8, insn: 0x0035: MOVE  (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r8 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:16:0x0035
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

        /*  JADX ERROR: JadxRuntimeException in pass: SSATransform
            jadx.core.utils.exceptions.JadxRuntimeException: Not initialized variable reg: 8, insn: 0x0082: MOVE  (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r8 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:30:0x0082
            	at jadx.core.dex.visitors.ssa.SSATransform.renameVarsInBlock(SSATransform.java:171)
            	at jadx.core.dex.visitors.ssa.SSATransform.renameVariables(SSATransform.java:143)
            	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:60)
            	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:41)
            */
        final int c(
        /*  JADX ERROR: JadxRuntimeException in pass: SSATransform
            jadx.core.utils.exceptions.JadxRuntimeException: Not initialized variable reg: 8, insn: 0x0082: MOVE  (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r8 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:30:0x0082
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

        public final InputStream d(Uri uri) throws FileNotFoundException {
            String a = a(uri);
            if (TextUtils.isEmpty(a)) {
                return null;
            }
            File file = new File(a);
            if (!(file.exists() && 0 < file.length())) {
                return null;
            }
            Uri fromFile = Uri.fromFile(file);
            try {
                return this.c.openInputStream(fromFile);
            } catch (NullPointerException e) {
                StringBuilder sb = new StringBuilder("NPE opening uri: ");
                sb.append(uri);
                sb.append(" -> ");
                sb.append(fromFile);
                throw ((FileNotFoundException) new FileNotFoundException(sb.toString()).initCause(e));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/CustDataResponse$Phone.class */
    public interface Phone {
        boolean b();

        void d();
    }

    public static boolean a(int i, int i2) {
        return i != Integer.MIN_VALUE && i2 != Integer.MIN_VALUE && i <= 512 && i2 <= 384;
    }

    public static boolean a(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }
}
