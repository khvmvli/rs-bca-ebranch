package o;

import android.content.Context;
import android.util.Log;
import com.getkeepsafe.relinker.MissingLibraryException;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import o.getTnxStatus;
/* loaded from: classes-dex2jar.jar:o/getTypeReservation.class */
public final class getTypeReservation {
    protected final Set<String> a;
    protected boolean b;
    protected boolean c;
    protected final getTnxStatus.RemoteActionCompatParcelizer d;
    protected final getTnxStatus$MediaBrowserCompat$CustomActionResultReceiver e;

    public getTypeReservation() {
        this(new getTypeTransaction(), new setIsRepresentativeTransaction());
    }

    private getTypeReservation(getTnxStatus$MediaBrowserCompat$CustomActionResultReceiver gettnxstatus_mediabrowsercompat_customactionresultreceiver, getTnxStatus.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        this.a = new HashSet();
        this.e = gettnxstatus_mediabrowsercompat_customactionresultreceiver;
        this.d = remoteActionCompatParcelizer;
    }

    public void b(Context context, String str, String str2) {
        Throwable th;
        if (!this.a.contains(str) || this.c) {
            try {
                this.e.d(str);
                this.a.add(str);
            } catch (UnsatisfiedLinkError e) {
                Log.getStackTraceString(e);
                File d = d(context, str, str2);
                if (!d.exists() || this.c) {
                    boolean z = this.c;
                    e(context, str, str2);
                    this.d.a(context, this.e.d(), this.e.b(str), d, this);
                }
                try {
                    if (this.b) {
                        setTnxStatus settnxstatus = null;
                        try {
                            settnxstatus = new setTnxStatus(d);
                        } catch (Throwable th2) {
                            th = th2;
                        }
                        try {
                            List<String> c = settnxstatus.c();
                            settnxstatus.close();
                            for (String str3 : c) {
                                c(context, this.e.e(str3), (String) null, (getTnxStatus.IconCompatParcelizer) null);
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            settnxstatus.close();
                            throw th;
                        }
                    }
                } catch (IOException e2) {
                }
                this.e.a(d.getAbsolutePath());
                this.a.add(str);
            }
        }
    }

    private File d(Context context, String str, String str2) {
        String b = this.e.b(str);
        if (str2 == null || str2.length() == 0) {
            return new File(context.getDir("lib", 0), b);
        }
        File dir = context.getDir("lib", 0);
        StringBuilder sb = new StringBuilder();
        sb.append(b);
        sb.append(".");
        sb.append(str2);
        return new File(dir, sb.toString());
    }

    private void e(Context context, String str, String str2) {
        File dir = context.getDir("lib", 0);
        File d = d(context, str, str2);
        final String b = this.e.b(str);
        File[] listFiles = dir.listFiles(new FilenameFilter() { // from class: o.getTypeReservation.1
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str3) {
                return str3.startsWith(b);
            }
        });
        if (listFiles != null) {
            for (File file : listFiles) {
                if (this.c || !file.getAbsolutePath().equals(d.getAbsolutePath())) {
                    file.delete();
                }
            }
        }
    }

    public final void c(final Context context, final String str, final String str2, final getTnxStatus.IconCompatParcelizer iconCompatParcelizer) {
        if (context != null) {
            if (str == null || str.length() == 0) {
                throw new IllegalArgumentException("Given library is either null or empty");
            } else if (iconCompatParcelizer == null) {
                b(context, str, str2);
            } else {
                new Thread(new Runnable() { // from class: o.getTypeReservation.5
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            getTypeReservation.this.b(context, str, str2);
                        } catch (MissingLibraryException | UnsatisfiedLinkError e) {
                        }
                    }
                }).start();
            }
        } else {
            throw new IllegalArgumentException("Given context is null");
        }
    }
}
