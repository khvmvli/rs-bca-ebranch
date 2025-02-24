package com.tozny.crypto.android;

import android.os.Build;
import android.os.Process;
import android.util.Base64;
import com.facebook.stetho.common.Utf8Charset;
import io.realm.internal.Property;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
/* loaded from: classes-dex2jar.jar:com/tozny/crypto/android/AesCbcWithIntegrity.class */
public final class AesCbcWithIntegrity {
    static final AtomicBoolean d = new AtomicBoolean(false);

    /* loaded from: classes-dex2jar.jar:com/tozny/crypto/android/AesCbcWithIntegrity$PrngFixes.class */
    public static final class PrngFixes {
        private static final byte[] b = b();

        private PrngFixes() {
        }

        private static String a() {
            try {
                return (String) Build.class.getField("SERIAL").get(null);
            } catch (Exception e) {
                return null;
            }
        }

        private static byte[] b() {
            StringBuilder sb = new StringBuilder();
            String str = Build.FINGERPRINT;
            if (str != null) {
                sb.append(str);
            }
            String a = a();
            if (a != null) {
                sb.append(a);
            }
            try {
                return sb.toString().getBytes(Utf8Charset.NAME);
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException("UTF-8 encoding not supported");
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static byte[] c() {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                dataOutputStream.writeLong(System.currentTimeMillis());
                dataOutputStream.writeLong(System.nanoTime());
                dataOutputStream.writeInt(Process.myPid());
                dataOutputStream.writeInt(Process.myUid());
                dataOutputStream.write(b);
                dataOutputStream.close();
                return byteArrayOutputStream.toByteArray();
            } catch (IOException e) {
                throw new SecurityException("Failed to generate seed", e);
            }
        }

        public static void e() {
        }
    }

    /* loaded from: classes-dex2jar.jar:com/tozny/crypto/android/AesCbcWithIntegrity$read.class */
    public static final class read {
        final byte[] c;
        final byte[] d;
        final byte[] e;

        public read(String str) {
            String[] split = str.split(":");
            if (split.length == 3) {
                this.c = Base64.decode(split[0], 2);
                this.e = Base64.decode(split[1], 2);
                this.d = Base64.decode(split[2], 2);
                return;
            }
            throw new IllegalArgumentException("Cannot parse iv:ciphertext:mac");
        }

        public read(byte[] bArr, byte[] bArr2, byte[] bArr3) {
            byte[] bArr4 = new byte[bArr.length];
            this.d = bArr4;
            System.arraycopy(bArr, 0, bArr4, 0, bArr.length);
            byte[] bArr5 = new byte[bArr2.length];
            this.c = bArr5;
            System.arraycopy(bArr2, 0, bArr5, 0, bArr2.length);
            byte[] bArr6 = new byte[bArr3.length];
            this.e = bArr6;
            System.arraycopy(bArr3, 0, bArr6, 0, bArr3.length);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            read read = (read) obj;
            return Arrays.equals(this.d, read.d) && Arrays.equals(this.c, read.c) && Arrays.equals(this.e, read.e);
        }

        public final int hashCode() {
            return ((((Arrays.hashCode(this.d) + 31) * 31) + Arrays.hashCode(this.c)) * 31) + Arrays.hashCode(this.e);
        }

        public final String toString() {
            String encodeToString = Base64.encodeToString(this.c, 2);
            String encodeToString2 = Base64.encodeToString(this.d, 2);
            String encodeToString3 = Base64.encodeToString(this.e, 2);
            StringBuilder sb = new StringBuilder();
            sb.append(encodeToString);
            sb.append(":");
            sb.append(encodeToString3);
            sb.append(":");
            sb.append(encodeToString2);
            return String.format(sb.toString(), new Object[0]);
        }
    }

    /* loaded from: classes-dex2jar.jar:com/tozny/crypto/android/AesCbcWithIntegrity$write.class */
    public static final class write {
        SecretKey b;
        SecretKey c;

        public write(SecretKey secretKey, SecretKey secretKey2) {
            this.c = secretKey;
            this.b = secretKey2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            write write = (write) obj;
            return this.b.equals(write.b) && this.c.equals(write.c);
        }

        public final int hashCode() {
            return ((this.c.hashCode() + 31) * 31) + this.b.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(Base64.encodeToString(this.c.getEncoded(), 2));
            sb.append(":");
            sb.append(Base64.encodeToString(this.b.getEncoded(), 2));
            return sb.toString();
        }
    }

    private static void a() {
        AtomicBoolean atomicBoolean = d;
        if (!atomicBoolean.get()) {
            synchronized (PrngFixes.class) {
                try {
                    if (!atomicBoolean.get()) {
                        PrngFixes.e();
                        atomicBoolean.set(true);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static write c(String str, byte[] bArr) throws GeneralSecurityException {
        a();
        byte[] encoded = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1").generateSecret(new PBEKeySpec(str.toCharArray(), bArr, 10000, 384)).getEncoded();
        byte[] bArr2 = new byte[16];
        System.arraycopy(encoded, 0, bArr2, 0, 16);
        byte[] bArr3 = new byte[32];
        System.arraycopy(encoded, 16, bArr3, 0, 32);
        return new write(new SecretKeySpec(bArr2, "AES"), new SecretKeySpec(bArr3, "HmacSHA256"));
    }

    private static byte[] c(read read2, write write2) throws GeneralSecurityException {
        boolean z;
        byte[] bArr = read2.c;
        byte[] bArr2 = read2.d;
        byte[] bArr3 = new byte[bArr.length + bArr2.length];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        SecretKey secretKey = write2.b;
        Mac instance = Mac.getInstance("HmacSHA256");
        instance.init(secretKey);
        byte[] doFinal = instance.doFinal(bArr3);
        byte[] bArr4 = read2.e;
        if (doFinal.length != bArr4.length) {
            z = false;
        } else {
            int i = 0;
            for (int i2 = 0; i2 < doFinal.length; i2++) {
                i |= doFinal[i2] ^ bArr4[i2];
            }
            z = false;
            if (i == 0) {
                z = true;
            }
        }
        if (z) {
            Cipher instance2 = Cipher.getInstance("AES/CBC/PKCS5Padding");
            instance2.init(2, write2.c, new IvParameterSpec(read2.c));
            return instance2.doFinal(read2.d);
        }
        throw new GeneralSecurityException("MAC stored in civ does not match computed MAC.");
    }

    public static read d(String str, write write2) throws UnsupportedEncodingException, GeneralSecurityException {
        byte[] bytes = str.getBytes(Utf8Charset.NAME);
        byte[] e = e(16);
        Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
        instance.init(1, write2.c, new IvParameterSpec(e));
        byte[] iv = instance.getIV();
        byte[] doFinal = instance.doFinal(bytes);
        byte[] bArr = new byte[iv.length + doFinal.length];
        System.arraycopy(iv, 0, bArr, 0, iv.length);
        System.arraycopy(doFinal, 0, bArr, iv.length, doFinal.length);
        SecretKey secretKey = write2.b;
        Mac instance2 = Mac.getInstance("HmacSHA256");
        instance2.init(secretKey);
        return new read(doFinal, iv, instance2.doFinal(bArr));
    }

    public static write d(String str) throws InvalidKeyException {
        String[] split = str.split(":");
        if (split.length == 2) {
            byte[] decode = Base64.decode(split[0], 2);
            if (decode.length == 16) {
                byte[] decode2 = Base64.decode(split[1], 2);
                if (decode2.length == 32) {
                    return new write(new SecretKeySpec(decode, 0, decode.length, "AES"), new SecretKeySpec(decode2, "HmacSHA256"));
                }
                throw new InvalidKeyException("Base64 decoded key is not 256 bytes");
            }
            throw new InvalidKeyException("Base64 decoded key is not 128 bytes");
        }
        throw new IllegalArgumentException("Cannot parse aesKey:hmacKey");
    }

    public static write e() throws GeneralSecurityException {
        a();
        KeyGenerator instance = KeyGenerator.getInstance("AES");
        instance.init(Property.TYPE_ARRAY);
        return new write(instance.generateKey(), new SecretKeySpec(e(32), "HmacSHA256"));
    }

    public static String e(read read2, write write2) throws UnsupportedEncodingException, GeneralSecurityException {
        return new String(c(read2, write2), Utf8Charset.NAME);
    }

    private static byte[] e(int i) throws GeneralSecurityException {
        a();
        byte[] bArr = new byte[i];
        SecureRandom.getInstance("SHA1PRNG").nextBytes(bArr);
        return bArr;
    }
}
