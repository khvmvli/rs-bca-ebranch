package o;

import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/copyRootViewBounds.class */
public class copyRootViewBounds {
    private static final Object b = new Object();
    private static final Object a = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Bundle a(ParseException$MediaBrowserCompat$CustomActionResultReceiver parseException$MediaBrowserCompat$CustomActionResultReceiver) {
        Bundle bundle = new Bundle();
        IconCompat d = parseException$MediaBrowserCompat$CustomActionResultReceiver.d();
        bundle.putInt("icon", d != null ? d.e() : 0);
        bundle.putCharSequence("title", parseException$MediaBrowserCompat$CustomActionResultReceiver.i());
        bundle.putParcelable("actionIntent", parseException$MediaBrowserCompat$CustomActionResultReceiver.c());
        Bundle bundle2 = parseException$MediaBrowserCompat$CustomActionResultReceiver.e() != null ? new Bundle(parseException$MediaBrowserCompat$CustomActionResultReceiver.e()) : new Bundle();
        bundle2.putBoolean("android.support.allowGeneratedReplies", parseException$MediaBrowserCompat$CustomActionResultReceiver.b());
        bundle.putBundle("extras", bundle2);
        bundle.putParcelableArray("remoteInputs", a(parseException$MediaBrowserCompat$CustomActionResultReceiver.a()));
        bundle.putBoolean("showsUserInterface", parseException$MediaBrowserCompat$CustomActionResultReceiver.g());
        bundle.putInt("semanticAction", parseException$MediaBrowserCompat$CustomActionResultReceiver.f());
        return bundle;
    }

    private static Bundle[] a(WindowInsetsCompat$Impl[] windowInsetsCompat$ImplArr) {
        if (windowInsetsCompat$ImplArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[windowInsetsCompat$ImplArr.length];
        for (int i = 0; i < windowInsetsCompat$ImplArr.length; i++) {
            bundleArr[i] = b(windowInsetsCompat$ImplArr[i]);
        }
        return bundleArr;
    }

    private static Bundle b(WindowInsetsCompat$Impl windowInsetsCompat$Impl) {
        Bundle bundle = new Bundle();
        bundle.putString("resultKey", windowInsetsCompat$Impl.f);
        bundle.putCharSequence("label", windowInsetsCompat$Impl.b);
        bundle.putCharSequenceArray("choices", windowInsetsCompat$Impl.c);
        bundle.putBoolean("allowFreeFormInput", windowInsetsCompat$Impl.d);
        bundle.putBundle("extras", windowInsetsCompat$Impl.e);
        Set<String> set = windowInsetsCompat$Impl.a;
        if (set != null && !set.isEmpty()) {
            ArrayList<String> arrayList = new ArrayList<>(set.size());
            for (String str : set) {
                arrayList.add(str);
            }
            bundle.putStringArrayList("allowedDataTypes", arrayList);
        }
        return bundle;
    }
}
