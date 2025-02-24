package o;

import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.common.UserMetadata;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes2-dex2jar.jar:o/onSelectTanggal.class */
final class onSelectTanggal {
    private static final Charset e = Charset.forName("UTF-8");
    private final File d;

    public onSelectTanggal(File file) {
        this.d = file;
    }

    private static Map<String, String> c(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String str2 = null;
            if (!jSONObject.isNull(next)) {
                str2 = jSONObject.optString(next, null);
            }
            hashMap.put(next, str2);
        }
        return hashMap;
    }

    private File e(String str) {
        File file = this.d;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("internal-keys.meta");
        return new File(file, sb.toString());
    }

    public final void a(String str, UserMetadata userMetadata) {
        Throwable th;
        Exception e2;
        String r0;
        File b = b(str);
        r6 = null;
        BufferedWriter bufferedWriter = null;
        try {
            try {
                r0 = new JSONObject() { // from class: o.onSelectTanggal.4
                    {
                        put("userId", UserMetadata.this.getUserId());
                    }
                }.toString();
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(b), e));
            } catch (Exception e3) {
                e2 = e3;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            bufferedWriter.write(r0);
            bufferedWriter.flush();
            CommonUtils.closeOrLog(bufferedWriter, "Failed to close user metadata file.");
        } catch (Exception e4) {
            e2 = e4;
            bufferedWriter = bufferedWriter;
            Logger.getLogger().e("Error serializing user metadata.", e2);
            CommonUtils.closeOrLog(bufferedWriter, "Failed to close user metadata file.");
        } catch (Throwable th3) {
            th = th3;
            CommonUtils.closeOrLog(bufferedWriter, "Failed to close user metadata file.");
            throw th;
        }
    }

    public final File b(String str) {
        File file = this.d;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("user.meta");
        return new File(file, sb.toString());
    }

    public final File d(String str) {
        File file = this.d;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("keys.meta");
        return new File(file, sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(String str, Map<String, String> map, boolean z) {
        Throwable th;
        Exception e2;
        String jSONObject;
        File e3 = z ? e(str) : d(str);
        r6 = null;
        BufferedWriter bufferedWriter = null;
        try {
            try {
                jSONObject = new JSONObject(map).toString();
                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(e3), e));
            } catch (Exception e4) {
                e2 = e4;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            bufferedWriter.write(jSONObject);
            bufferedWriter.flush();
            CommonUtils.closeOrLog(bufferedWriter, "Failed to close key/value metadata file.");
        } catch (Exception e5) {
            e2 = e5;
            bufferedWriter = bufferedWriter;
            Logger.getLogger().e("Error serializing key/value metadata.", e2);
            CommonUtils.closeOrLog(bufferedWriter, "Failed to close key/value metadata file.");
        } catch (Throwable th3) {
            th = th3;
            CommonUtils.closeOrLog(bufferedWriter, "Failed to close key/value metadata file.");
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Map<String, String> e(String str, boolean z) {
        Throwable th;
        Exception e2;
        File d = d(str);
        if (!d.exists()) {
            return Collections.emptyMap();
        }
        r10 = null;
        FileInputStream fileInputStream = null;
        try {
            try {
                fileInputStream = new FileInputStream(d);
            } catch (Exception e3) {
                e2 = e3;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            Map<String, String> c = c(CommonUtils.streamToString(fileInputStream));
            CommonUtils.closeOrLog(fileInputStream, "Failed to close user metadata file.");
            return c;
        } catch (Exception e4) {
            e2 = e4;
            fileInputStream = fileInputStream;
            Logger.getLogger().e("Error deserializing user metadata.", e2);
            CommonUtils.closeOrLog(fileInputStream, "Failed to close user metadata file.");
            return Collections.emptyMap();
        } catch (Throwable th3) {
            th = th3;
            CommonUtils.closeOrLog(fileInputStream, "Failed to close user metadata file.");
            throw th;
        }
    }
}
