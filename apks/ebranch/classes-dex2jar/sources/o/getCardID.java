package o;

import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.CancellationSignal;
/* loaded from: classes-dex2jar.jar:o/getCardID.class */
public final class getCardID extends FingerprintManager.AuthenticationCallback {
    private IconCompatParcelizer b;
    public CancellationSignal c;
    public Context d;
    public FingerprintManager e;

    /* loaded from: classes-dex2jar.jar:o/getCardID$IconCompatParcelizer.class */
    public interface IconCompatParcelizer {
        void a();

        void c();

        void e();
    }

    public getCardID(Context context, IconCompatParcelizer iconCompatParcelizer, FingerprintManager fingerprintManager) {
        this.d = context;
        this.b = iconCompatParcelizer;
        this.e = fingerprintManager;
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationError(int i, CharSequence charSequence) {
        onAuthenticationError(i, charSequence);
        this.b.e();
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationFailed() {
        onAuthenticationFailed();
        this.b.a();
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationHelp(int i, CharSequence charSequence) {
        onAuthenticationHelp(i, charSequence);
    }

    @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
    public final void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
        onAuthenticationSucceeded(authenticationResult);
        this.b.c();
    }
}
