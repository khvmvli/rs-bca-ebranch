package o;

import android.app.RemoteInput;
import android.os.Build;
import android.os.Bundle;
import java.util.Set;
/* loaded from: classes-dex2jar.jar:o/WindowInsetsCompat$Impl.class */
public final class WindowInsetsCompat$Impl {
    final Set<String> a;
    final CharSequence b;
    final CharSequence[] c;
    final boolean d;
    final Bundle e;
    final String f;
    private final int g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static RemoteInput[] b(WindowInsetsCompat$Impl[] windowInsetsCompat$ImplArr) {
        if (windowInsetsCompat$ImplArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[windowInsetsCompat$ImplArr.length];
        for (int i = 0; i < windowInsetsCompat$ImplArr.length; i++) {
            WindowInsetsCompat$Impl windowInsetsCompat$Impl = windowInsetsCompat$ImplArr[i];
            RemoteInput.Builder addExtras = new RemoteInput.Builder(windowInsetsCompat$Impl.f).setLabel(windowInsetsCompat$Impl.b).setChoices(windowInsetsCompat$Impl.c).setAllowFreeFormInput(windowInsetsCompat$Impl.d).addExtras(windowInsetsCompat$Impl.e);
            if (Build.VERSION.SDK_INT >= 29) {
                addExtras.setEditChoicesBeforeSending(windowInsetsCompat$Impl.g);
            }
            remoteInputArr[i] = addExtras.build();
        }
        return remoteInputArr;
    }
}
