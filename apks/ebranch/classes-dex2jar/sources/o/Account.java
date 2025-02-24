package o;

import android.content.Context;
import java.io.Closeable;
import java.io.IOException;
@onChooseValueDescPekerjaan
/* loaded from: classes-dex2jar.jar:o/Account.class */
public abstract class Account implements Closeable {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/Account$read.class */
    public interface read {
        Account b();

        read d(Context context);
    }

    public abstract getCitizen b();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        e().close();
    }

    abstract getMaritalStatus e();
}
