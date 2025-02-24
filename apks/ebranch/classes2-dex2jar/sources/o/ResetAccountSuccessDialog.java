package o;

import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import java.io.File;
import java.io.IOException;
/* loaded from: classes2-dex2jar.jar:o/ResetAccountSuccessDialog.class */
public class ResetAccountSuccessDialog {
    public final String a;
    public final FileStore c;

    public ResetAccountSuccessDialog(String str, FileStore fileStore) {
        this.a = str;
        this.c = fileStore;
    }

    public final boolean b() {
        boolean z;
        try {
            z = new File(this.c.getFilesDir(), this.a).createNewFile();
        } catch (IOException e) {
            Logger logger = Logger.getLogger();
            StringBuilder sb = new StringBuilder("Error creating marker: ");
            sb.append(this.a);
            logger.e(sb.toString(), e);
            z = false;
        }
        return z;
    }
}
