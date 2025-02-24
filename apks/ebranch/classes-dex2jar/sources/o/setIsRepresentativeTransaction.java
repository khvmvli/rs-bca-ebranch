package o;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.getkeepsafe.relinker.MissingLibraryException;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import o.getTnxStatus;
/* loaded from: classes-dex2jar.jar:o/setIsRepresentativeTransaction.class */
public final class setIsRepresentativeTransaction implements getTnxStatus.RemoteActionCompatParcelizer {
    private static long a(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[4096];
        long j = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                outputStream.flush();
                return j;
            }
            outputStream.write(bArr, 0, read);
            j += (long) read;
        }
    }

    private String[] a(Context context, String str) {
        StringBuilder sb = new StringBuilder("lib");
        sb.append(File.separatorChar);
        sb.append("([^\\");
        sb.append(File.separatorChar);
        sb.append("]*)");
        sb.append(File.separatorChar);
        sb.append(str);
        Pattern compile = Pattern.compile(sb.toString());
        HashSet hashSet = new HashSet();
        for (String str2 : c(context)) {
            try {
                Enumeration<? extends ZipEntry> entries = new ZipFile(new File(str2), 1).entries();
                while (entries.hasMoreElements()) {
                    Matcher matcher = compile.matcher(((ZipEntry) entries.nextElement()).getName());
                    if (matcher.matches()) {
                        hashSet.add(matcher.group(1));
                    }
                }
            } catch (IOException e) {
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    private setIsRepresentativeTransaction$MediaBrowserCompat$CustomActionResultReceiver c(Context context, String[] strArr, String str, getTypeReservation gettypereservation) {
        String[] c = c(context);
        int length = c.length;
        int i = 0;
        while (true) {
            ZipFile zipFile = null;
            if (i >= length) {
                return null;
            }
            String str2 = c[i];
            for (int i2 = 0; i2 < 5; i2++) {
                try {
                    zipFile = new ZipFile(new File(str2), 1);
                    break;
                } catch (IOException e) {
                }
            }
            if (zipFile != null) {
                for (int i3 = 0; i3 < 5; i3++) {
                    for (String str3 : strArr) {
                        StringBuilder sb = new StringBuilder("lib");
                        sb.append(File.separatorChar);
                        sb.append(str3);
                        sb.append(File.separatorChar);
                        sb.append(str);
                        ZipEntry entry = zipFile.getEntry(sb.toString());
                        if (entry != null) {
                            return new setIsRepresentativeTransaction$MediaBrowserCompat$CustomActionResultReceiver(zipFile, entry);
                        }
                    }
                }
                try {
                    zipFile.close();
                } catch (IOException e2) {
                }
            }
            i++;
        }
    }

    private static String[] c(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (applicationInfo.splitSourceDirs == null || applicationInfo.splitSourceDirs.length == 0) {
            return new String[]{applicationInfo.sourceDir};
        }
        String[] strArr = new String[applicationInfo.splitSourceDirs.length + 1];
        strArr[0] = applicationInfo.sourceDir;
        System.arraycopy(applicationInfo.splitSourceDirs, 0, strArr, 1, applicationInfo.splitSourceDirs.length);
        return strArr;
    }

    private static void e(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
            }
        }
    }

    @Override // o.getTnxStatus.RemoteActionCompatParcelizer
    public final void a(Context context, String[] strArr, String str, File file, getTypeReservation gettypereservation) {
        Throwable th;
        String[] strArr2;
        InputStream inputStream;
        FileOutputStream fileOutputStream;
        Throwable th2;
        long a;
        setIsRepresentativeTransaction$MediaBrowserCompat$CustomActionResultReceiver setisrepresentativetransaction_mediabrowsercompat_customactionresultreceiver = null;
        InputStream inputStream2 = null;
        try {
            setIsRepresentativeTransaction$MediaBrowserCompat$CustomActionResultReceiver c = c(context, strArr, str, gettypereservation);
            try {
                if (c != null) {
                    for (int i = 0; i < 5; i++) {
                        try {
                            if (file.exists() || file.createNewFile()) {
                                try {
                                    inputStream2 = c.b.getInputStream(c.a);
                                    try {
                                        fileOutputStream = new FileOutputStream(file);
                                        try {
                                            a = a(inputStream2, fileOutputStream);
                                            fileOutputStream.getFD().sync();
                                        } catch (FileNotFoundException | IOException e) {
                                            inputStream = inputStream2;
                                        } catch (Throwable th3) {
                                            th2 = th3;
                                            e(inputStream2);
                                            e(fileOutputStream);
                                            throw th2;
                                        }
                                    } catch (FileNotFoundException e2) {
                                        fileOutputStream = null;
                                        inputStream = inputStream2;
                                    } catch (IOException e3) {
                                        fileOutputStream = null;
                                        inputStream = inputStream2;
                                    } catch (Throwable th4) {
                                        th2 = th4;
                                        fileOutputStream = null;
                                    }
                                } catch (FileNotFoundException e4) {
                                    inputStream = null;
                                    fileOutputStream = null;
                                } catch (IOException e5) {
                                    inputStream = null;
                                    fileOutputStream = null;
                                } catch (Throwable th5) {
                                    th2 = th5;
                                    fileOutputStream = null;
                                }
                                if (a != file.length()) {
                                    inputStream = inputStream2;
                                    e(inputStream);
                                    e(fileOutputStream);
                                } else {
                                    e(inputStream2);
                                    e(fileOutputStream);
                                    file.setReadable(true, false);
                                    file.setExecutable(true, false);
                                    file.setWritable(true);
                                    if (c != null) {
                                        try {
                                            if (c.b != null) {
                                                c.b.close();
                                                return;
                                            }
                                            return;
                                        } catch (IOException e6) {
                                            return;
                                        }
                                    } else {
                                        return;
                                    }
                                }
                            }
                        } catch (IOException e7) {
                        }
                    }
                    if (c != null) {
                        try {
                            if (c.b != null) {
                                c.b.close();
                            }
                        } catch (IOException e8) {
                        }
                    }
                } else {
                    try {
                        strArr2 = a(context, str);
                    } catch (Exception e9) {
                        strArr2 = new String[]{e9.toString()};
                    }
                    throw new MissingLibraryException(str, strArr, strArr2);
                }
            } catch (Throwable th6) {
                th = th6;
                setisrepresentativetransaction_mediabrowsercompat_customactionresultreceiver = c;
                if (setisrepresentativetransaction_mediabrowsercompat_customactionresultreceiver != null) {
                    try {
                        if (setisrepresentativetransaction_mediabrowsercompat_customactionresultreceiver.b != null) {
                            setisrepresentativetransaction_mediabrowsercompat_customactionresultreceiver.b.close();
                        }
                    } catch (IOException e10) {
                    }
                }
                throw th;
            }
        } catch (Throwable th7) {
            th = th7;
        }
    }
}
