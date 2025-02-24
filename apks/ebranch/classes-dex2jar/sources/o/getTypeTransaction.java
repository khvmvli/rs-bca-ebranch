package o;

import android.os.Build;
/* loaded from: classes-dex2jar.jar:o/getTypeTransaction.class */
final class getTypeTransaction implements getTnxStatus$MediaBrowserCompat$CustomActionResultReceiver {
    @Override // o.getTnxStatus$MediaBrowserCompat$CustomActionResultReceiver
    public final void a(String str) {
        System.load(str);
    }

    @Override // o.getTnxStatus$MediaBrowserCompat$CustomActionResultReceiver
    public final String b(String str) {
        return (!str.startsWith("lib") || !str.endsWith(".so")) ? System.mapLibraryName(str) : str;
    }

    @Override // o.getTnxStatus$MediaBrowserCompat$CustomActionResultReceiver
    public final void d(String str) {
        System.loadLibrary(str);
    }

    @Override // o.getTnxStatus$MediaBrowserCompat$CustomActionResultReceiver
    public final String[] d() {
        if (Build.SUPPORTED_ABIS.length > 0) {
            return Build.SUPPORTED_ABIS;
        }
        String str = Build.CPU_ABI2;
        return !(str == null || str.length() == 0) ? new String[]{Build.CPU_ABI, Build.CPU_ABI2} : new String[]{Build.CPU_ABI};
    }

    @Override // o.getTnxStatus$MediaBrowserCompat$CustomActionResultReceiver
    public final String e(String str) {
        return str.substring(3, str.length() - 3);
    }
}
