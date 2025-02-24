package o;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.util.concurrent.Callable;
import o.setScrollingTouchSlop;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/AudioAttributesImplApi21.class */
public class AudioAttributesImplApi21 implements setScrollingTouchSlop, FragmentManager$6 {
    private final File a;
    private final Callable<InputStream> b;
    private final Context c;
    Fragment$InstantiationException d;
    private final String e;
    private final setScrollingTouchSlop f;
    private final int h;
    private boolean j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AudioAttributesImplApi21(Context context, String str, File file, Callable<InputStream> callable, int i, setScrollingTouchSlop setscrollingtouchslop) {
        this.c = context;
        this.e = str;
        this.a = file;
        this.b = callable;
        this.h = i;
        this.f = setscrollingtouchslop;
    }

    private setScrollingTouchSlop d(File file) {
        try {
            int a = setChildDrawingOrderCallback.a(file);
            new setViewCacheExtension();
            setScrollingTouchSlop.RemoteActionCompatParcelizer.read read = new setScrollingTouchSlop.RemoteActionCompatParcelizer.read(this.c);
            read.d = file.getAbsolutePath();
            read.c = new setScrollingTouchSlop.write(Math.max(a, 1)) { // from class: o.AudioAttributesImplApi21.4
                @Override // o.setScrollingTouchSlop.write
                public final void a(setOnScrollListener setonscrolllistener) {
                }

                @Override // o.setScrollingTouchSlop.write
                public final void d(setOnScrollListener setonscrolllistener, int i, int i2) {
                }

                @Override // o.setScrollingTouchSlop.write
                public final void e(setOnScrollListener setonscrolllistener) {
                    if (this.d <= 0) {
                        setonscrolllistener.d(this.d);
                    }
                }
            };
            setScrollingTouchSlop.RemoteActionCompatParcelizer a2 = read.a();
            return new SavedStateRegistry$1(a2.c, a2.d, a2.b, a2.e);
        } catch (IOException e) {
            throw new RuntimeException("Malformed database file, unable to read version.", e);
        }
    }

    private void d(File file, boolean z) throws IOException {
        ReadableByteChannel readableByteChannel;
        if (this.e != null) {
            readableByteChannel = Channels.newChannel(this.c.getAssets().open(this.e));
        } else if (this.a != null) {
            readableByteChannel = new FileInputStream(this.a).getChannel();
        } else {
            Callable<InputStream> callable = this.b;
            if (callable != null) {
                try {
                    readableByteChannel = Channels.newChannel(callable.call());
                } catch (Exception e) {
                    throw new IOException("inputStreamCallable exception on call", e);
                }
            } else {
                throw new IllegalStateException("copyFromAssetPath, copyFromFile and copyFromInputStream are all null!");
            }
        }
        File createTempFile = File.createTempFile("room-copy-helper", ".tmp", this.c.getCacheDir());
        createTempFile.deleteOnExit();
        setClipToPadding.c(readableByteChannel, new FileOutputStream(createTempFile).getChannel());
        File parentFile = file.getParentFile();
        if (parentFile == null || parentFile.exists() || parentFile.mkdirs()) {
            Fragment$InstantiationException fragment$InstantiationException = this.d;
            if (!(fragment$InstantiationException == null || fragment$InstantiationException.f87o == null)) {
                setScrollingTouchSlop d = d(createTempFile);
                try {
                    if (z) {
                        d.e();
                    } else {
                        d.d();
                    }
                } finally {
                    d.close();
                }
            }
            if (!createTempFile.renameTo(file)) {
                StringBuilder sb = new StringBuilder("Failed to move intermediate file (");
                sb.append(createTempFile.getAbsolutePath());
                sb.append(") to destination (");
                sb.append(file.getAbsolutePath());
                sb.append(").");
                throw new IOException(sb.toString());
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder("Failed to create directories for ");
        sb2.append(file.getAbsolutePath());
        throw new IOException(sb2.toString());
    }

    private void d(boolean z) {
        String b = this.f.b();
        File databasePath = this.c.getDatabasePath(b);
        Fragment$InstantiationException fragment$InstantiationException = this.d;
        isLayoutSuppressed islayoutsuppressed = new isLayoutSuppressed(b, this.c.getFilesDir(), fragment$InstantiationException == null || fragment$InstantiationException.l);
        try {
            islayoutsuppressed.c.lock();
            if (islayoutsuppressed.e) {
                try {
                    FileChannel channel = new FileOutputStream(islayoutsuppressed.b).getChannel();
                    islayoutsuppressed.d = channel;
                    channel.lock();
                } catch (IOException e) {
                    throw new IllegalStateException("Unable to grab copy lock.", e);
                }
            }
            if (!databasePath.exists()) {
                try {
                    d(databasePath, z);
                    islayoutsuppressed.b();
                    return;
                } catch (IOException e2) {
                    throw new RuntimeException("Unable to copy database file.", e2);
                }
            } else if (this.d == null) {
                islayoutsuppressed.b();
                return;
            } else {
                try {
                    int a = setChildDrawingOrderCallback.a(databasePath);
                    int i = this.h;
                    if (a == i) {
                        islayoutsuppressed.b();
                        return;
                    } else if (this.d.b(a, i)) {
                        islayoutsuppressed.b();
                        return;
                    } else {
                        if (this.c.deleteDatabase(b)) {
                            try {
                                d(databasePath, z);
                            } catch (IOException e3) {
                                Log.w("ROOM", "Unable to copy database file.", e3);
                            }
                        } else {
                            StringBuilder sb = new StringBuilder("Failed to delete database file (");
                            sb.append(b);
                            sb.append(") for a copy destructive migration.");
                            Log.w("ROOM", sb.toString());
                        }
                        islayoutsuppressed.b();
                        return;
                    }
                } catch (IOException e4) {
                    Log.w("ROOM", "Unable to read database version.", e4);
                    islayoutsuppressed.b();
                    return;
                }
            }
        } catch (Throwable th) {
            islayoutsuppressed.b();
            throw th;
        }
        islayoutsuppressed.b();
        throw th;
    }

    @Override // o.FragmentManager$6
    public final setScrollingTouchSlop a() {
        return this.f;
    }

    @Override // o.setScrollingTouchSlop
    public final String b() {
        return this.f.b();
    }

    @Override // o.setScrollingTouchSlop
    public final void b(boolean z) {
        this.f.b(z);
    }

    @Override // o.setScrollingTouchSlop, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            this.f.close();
            this.j = false;
        }
    }

    @Override // o.setScrollingTouchSlop
    public final setOnScrollListener d() {
        setOnScrollListener d;
        synchronized (this) {
            if (!this.j) {
                d(false);
                this.j = true;
            }
            d = this.f.d();
        }
        return d;
    }

    @Override // o.setScrollingTouchSlop
    public final setOnScrollListener e() {
        setOnScrollListener e;
        synchronized (this) {
            if (!this.j) {
                d(true);
                this.j = true;
            }
            e = this.f.e();
        }
        return e;
    }
}
