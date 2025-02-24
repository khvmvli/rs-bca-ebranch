package o;

import com.google.firebase.installations.local.PersistedInstallationEntry;
/* loaded from: classes2-dex2jar.jar:o/Tarikan100JutaGuestDialog.class */
public final class Tarikan100JutaGuestDialog implements clickedClose {
    final setJenisWarkat<String> e;

    public Tarikan100JutaGuestDialog(setJenisWarkat<String> setjeniswarkat) {
        this.e = setjeniswarkat;
    }

    @Override // o.clickedClose
    public final boolean a(PersistedInstallationEntry persistedInstallationEntry) {
        if (!persistedInstallationEntry.isUnregistered() && !persistedInstallationEntry.isRegistered() && !persistedInstallationEntry.isErrored()) {
            return false;
        }
        setJenisWarkat<String> setjeniswarkat = this.e;
        setjeniswarkat.c.a(persistedInstallationEntry.getFirebaseInstallationId());
        return true;
    }

    @Override // o.clickedClose
    public final boolean b(Exception exc) {
        return false;
    }
}
