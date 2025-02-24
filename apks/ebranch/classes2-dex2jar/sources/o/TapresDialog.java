package o;

import com.google.firebase.installations.InstallationTokenResult;
import com.google.firebase.installations.Utils;
import com.google.firebase.installations.local.PersistedInstallationEntry;
/* loaded from: classes2-dex2jar.jar:o/TapresDialog.class */
public final class TapresDialog implements clickedClose {
    private final Utils b;
    private final setJenisWarkat<InstallationTokenResult> c;

    public TapresDialog(Utils utils, setJenisWarkat<InstallationTokenResult> setjeniswarkat) {
        this.b = utils;
        this.c = setjeniswarkat;
    }

    @Override // o.clickedClose
    public final boolean a(PersistedInstallationEntry persistedInstallationEntry) {
        if (!persistedInstallationEntry.isRegistered() || this.b.isAuthTokenExpired(persistedInstallationEntry)) {
            return false;
        }
        setJenisWarkat<InstallationTokenResult> setjeniswarkat = this.c;
        setjeniswarkat.c.e(InstallationTokenResult.builder().setToken(persistedInstallationEntry.getAuthToken()).setTokenExpirationTimestamp(persistedInstallationEntry.getExpiresInSecs()).setTokenCreationTimestamp(persistedInstallationEntry.getTokenCreationEpochInSecs()).build());
        return true;
    }

    @Override // o.clickedClose
    public final boolean b(Exception exc) {
        this.c.c.a(exc);
        return true;
    }
}
