package o;

import android.util.Base64;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
/* loaded from: classes-dex2jar.jar:o/getAnnualFeeBasicDisplayAmount.class */
public final class getAnnualFeeBasicDisplayAmount {
    public static boolean b(KeyStore keyStore, Signature signature) {
        Throwable e;
        try {
            keyStore.load(null);
            signature.initSign((PrivateKey) keyStore.getKey("ebranch_key_823627", null));
            return true;
        } catch (IOException e2) {
            e = e2;
            throw new RuntimeException("Failed to init Cipher", e);
        } catch (InvalidKeyException e3) {
            return false;
        } catch (KeyStoreException e4) {
            e = e4;
            throw new RuntimeException("Failed to init Cipher", e);
        } catch (NoSuchAlgorithmException e5) {
            e = e5;
            throw new RuntimeException("Failed to init Cipher", e);
        } catch (UnrecoverableKeyException e6) {
            e = e6;
            throw new RuntimeException("Failed to init Cipher", e);
        } catch (CertificateException e7) {
            e = e7;
            throw new RuntimeException("Failed to init Cipher", e);
        }
    }

    public static String e() {
        String str;
        try {
            KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
            instance.load(null);
            PublicKey publicKey = instance.getCertificate("ebranch_key_823627").getPublicKey();
            str = new StringBuilder(Base64.encodeToString(KeyFactory.getInstance(publicKey.getAlgorithm()).generatePublic(new X509EncodedKeySpec(publicKey.getEncoded())).getEncoded(), 2)).reverse().toString();
        } catch (IOException | NullPointerException | KeyStoreException | NoSuchAlgorithmException | CertificateException | InvalidKeySpecException e) {
            str = "";
        }
        return str;
    }
}
