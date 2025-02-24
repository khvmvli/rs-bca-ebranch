package com.tozny.crypto.android;

import com.tozny.crypto.android.AesCbcWithIntegrity;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.security.SecureRandomSpi;
/* loaded from: classes2-dex2jar.jar:com/tozny/crypto/android/AesCbcWithIntegrity$PrngFixes$LinuxPRNGSecureRandom.class */
public class AesCbcWithIntegrity$PrngFixes$LinuxPRNGSecureRandom extends SecureRandomSpi {
    private static final File URANDOM_FILE = new File("/dev/urandom");
    private static final Object sLock = new Object();
    private static DataInputStream sUrandomIn;
    private static OutputStream sUrandomOut;
    private boolean mSeeded;

    private DataInputStream getUrandomInputStream() {
        DataInputStream dataInputStream;
        synchronized (sLock) {
            if (sUrandomIn == null) {
                try {
                    sUrandomIn = new DataInputStream(new FileInputStream(URANDOM_FILE));
                } catch (IOException e) {
                    StringBuilder sb = new StringBuilder("Failed to open ");
                    sb.append(URANDOM_FILE);
                    sb.append(" for reading");
                    throw new SecurityException(sb.toString(), e);
                }
            }
            dataInputStream = sUrandomIn;
        }
        return dataInputStream;
    }

    private OutputStream getUrandomOutputStream() throws IOException {
        OutputStream outputStream;
        synchronized (sLock) {
            if (sUrandomOut == null) {
                sUrandomOut = new FileOutputStream(URANDOM_FILE);
            }
            outputStream = sUrandomOut;
        }
        return outputStream;
    }

    @Override // java.security.SecureRandomSpi
    protected byte[] engineGenerateSeed(int i) {
        byte[] bArr = new byte[i];
        engineNextBytes(bArr);
        return bArr;
    }

    @Override // java.security.SecureRandomSpi
    protected void engineNextBytes(byte[] bArr) {
        DataInputStream urandomInputStream;
        if (!this.mSeeded) {
            engineSetSeed(AesCbcWithIntegrity.PrngFixes.d());
        }
        try {
            synchronized (sLock) {
                urandomInputStream = getUrandomInputStream();
            }
            synchronized (urandomInputStream) {
                urandomInputStream.readFully(bArr);
            }
        } catch (IOException e) {
            StringBuilder sb = new StringBuilder("Failed to read from ");
            sb.append(URANDOM_FILE);
            throw new SecurityException(sb.toString(), e);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Try blocks wrapping queue limit reached! Please report as an issue!
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectExcHandlers(BlockExceptionHandler.java:88)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.process(BlockExceptionHandler.java:58)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.independentBlockTreeMod(BlockProcessor.java:452)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:51)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    @Override // java.security.SecureRandomSpi
    protected void engineSetSeed(byte[] r4) {
        /*
            r3 = this;
            java.lang.Object r0 = com.tozny.crypto.android.AesCbcWithIntegrity$PrngFixes$LinuxPRNGSecureRandom.sLock     // Catch: IOException -> 0x0022, all -> 0x001e
            r5 = r0
            r0 = r5
            monitor-enter(r0)     // Catch: IOException -> 0x0022, all -> 0x001e
            r0 = r3
            java.io.OutputStream r0 = r0.getUrandomOutputStream()     // Catch: all -> 0x0019
            r6 = r0
            r0 = r5
            monitor-exit(r0)
            r0 = r6
            r1 = r4
            r0.write(r1)     // Catch: IOException -> 0x0022, all -> 0x001e
            r0 = r6
            r0.flush()     // Catch: IOException -> 0x0022, all -> 0x001e
            goto L_0x0049
        L_0x0019:
            r4 = move-exception
            r0 = r5
            monitor-exit(r0)
            r0 = r4
            throw r0     // Catch: IOException -> 0x0022, all -> 0x001e
        L_0x001e:
            r4 = move-exception
            goto L_0x004f
        L_0x0022:
            r4 = move-exception
            java.lang.Class<com.tozny.crypto.android.AesCbcWithIntegrity$PrngFixes> r0 = com.tozny.crypto.android.AesCbcWithIntegrity.PrngFixes.class
            java.lang.String r0 = r0.getSimpleName()     // Catch: all -> 0x001e
            r4 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: all -> 0x001e
            r5 = r0
            r0 = r5
            r0.<init>()     // Catch: all -> 0x001e
            r0 = r5
            java.lang.String r1 = "Failed to mix seed into "
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: all -> 0x001e
            r0 = r5
            java.io.File r1 = com.tozny.crypto.android.AesCbcWithIntegrity$PrngFixes$LinuxPRNGSecureRandom.URANDOM_FILE     // Catch: all -> 0x001e
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: all -> 0x001e
            r0 = r4
            r1 = r5
            java.lang.String r1 = r1.toString()     // Catch: all -> 0x001e
            int r0 = android.util.Log.w(r0, r1)     // Catch: all -> 0x001e
        L_0x0049:
            r0 = r3
            r1 = 1
            r0.mSeeded = r1
            return
        L_0x004f:
            r0 = r3
            r1 = 1
            r0.mSeeded = r1
            r0 = r4
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tozny.crypto.android.AesCbcWithIntegrity$PrngFixes$LinuxPRNGSecureRandom.engineSetSeed(byte[]):void");
    }
}
