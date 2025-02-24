package com.tozny.crypto.android;

import java.security.Provider;
/* loaded from: classes2-dex2jar.jar:com/tozny/crypto/android/AesCbcWithIntegrity$PrngFixes$LinuxPRNGSecureRandomProvider.class */
class AesCbcWithIntegrity$PrngFixes$LinuxPRNGSecureRandomProvider extends Provider {
    public AesCbcWithIntegrity$PrngFixes$LinuxPRNGSecureRandomProvider() {
        super("LinuxPRNG", 1.0d, "A Linux-specific random number provider that uses /dev/urandom");
        put("SecureRandom.SHA1PRNG", AesCbcWithIntegrity$PrngFixes$LinuxPRNGSecureRandom.class.getName());
        put("SecureRandom.SHA1PRNG ImplementedIn", "Software");
    }
}
