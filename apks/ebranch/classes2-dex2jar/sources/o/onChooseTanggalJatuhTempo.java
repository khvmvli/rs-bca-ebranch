package o;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.widget.ImageView;
import com.squareup.picasso.Downloader;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import o.showDataAlamat;
/* loaded from: classes2-dex2jar.jar:o/onChooseTanggalJatuhTempo.class */
public class onChooseTanggalJatuhTempo {
    static final Handler c = new Handler(Looper.getMainLooper()) { // from class: o.onChooseTanggalJatuhTempo.3
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i = message.what;
            Object obj = null;
            if (i != 3) {
                if (i == 8) {
                    List list = (List) message.obj;
                    int size = list.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        onFocuscc279 onfocuscc279 = (onFocuscc279) list.get(i2);
                        onfocuscc279.n.b(onfocuscc279);
                    }
                } else if (i == 13) {
                    List list2 = (List) message.obj;
                    int size2 = list2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        showDataAlamat showdataalamat = (showDataAlamat) list2.get(i3);
                        onChooseTanggalJatuhTempo onchoosetanggaljatuhtempo = showdataalamat.g;
                        Bitmap c2 = CC27FormKartuKreditFragment_ViewBinding.a(showdataalamat.c) ? onchoosetanggaljatuhtempo.c(showdataalamat.d) : null;
                        if (c2 != null) {
                            onchoosetanggaljatuhtempo.d(c2, write.MEMORY, showdataalamat);
                            if (onchoosetanggaljatuhtempo.f) {
                                String b = showdataalamat.j.b();
                                StringBuilder sb = new StringBuilder("from ");
                                sb.append(write.MEMORY);
                                OR1DataPengirimFragment.b("Main", "completed", b, sb.toString());
                            }
                        } else {
                            onchoosetanggaljatuhtempo.e(showdataalamat);
                            if (onchoosetanggaljatuhtempo.f) {
                                OR1DataPengirimFragment.e("Main", "resumed", showdataalamat.j.b());
                            }
                        }
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder("Unknown handler message received: ");
                    sb2.append(message.what);
                    throw new AssertionError(sb2.toString());
                }
            } else {
                showDataAlamat showdataalamat2 = (showDataAlamat) message.obj;
                if (showdataalamat2.g.f) {
                    OR1DataPengirimFragment.b("Main", "canceled", showdataalamat2.j.b(), "target got garbage collected");
                }
                onChooseTanggalJatuhTempo onchoosetanggaljatuhtempo2 = showdataalamat2.g;
                Reference reference = showdataalamat2.n;
                if (reference != null) {
                    obj = reference.get();
                }
                onchoosetanggaljatuhtempo2.c(obj);
            }
        }
    };
    static volatile onChooseTanggalJatuhTempo e = null;
    final Context a;
    final showDataDiri b;
    final Bitmap.Config d;
    volatile boolean f;
    final ReferenceQueue<Object> g;
    final List<onChooseNomorRekening> h;
    final showDataLainnya i;
    boolean j;
    final MediaDescriptionCompat k;
    final onEditWarkatList l;
    final Map<Object, showDataAlamat> m;
    boolean n;

    /* renamed from: o */
    final Map<ImageView, showDataKartuTambahan2> f68o;
    private final RemoteActionCompatParcelizer q;
    private final onChooseTanggalJatuhTempo$MediaBrowserCompat$CustomActionResultReceiver s;

    /* loaded from: classes2-dex2jar.jar:o/onChooseTanggalJatuhTempo$IconCompatParcelizer.class */
    public static final class IconCompatParcelizer {
        boolean a;
        Downloader b;
        Bitmap.Config c;
        showDataDiri d;
        final Context e;
        boolean f;
        ExecutorService g;
        List<onChooseNomorRekening> h;
        MediaDescriptionCompat i;
        onChooseTanggalJatuhTempo$MediaBrowserCompat$CustomActionResultReceiver j;

        public IconCompatParcelizer(Context context) {
            if (context != null) {
                this.e = context.getApplicationContext();
                return;
            }
            throw new IllegalArgumentException("Context must not be null.");
        }
    }

    /* loaded from: classes2-dex2jar.jar:o/onChooseTanggalJatuhTempo$MediaDescriptionCompat.class */
    public interface MediaDescriptionCompat {
        public static final MediaDescriptionCompat a = new MediaDescriptionCompat() { // from class: o.onChooseTanggalJatuhTempo.MediaDescriptionCompat.3
            @Override // o.onChooseTanggalJatuhTempo.MediaDescriptionCompat
            public final CC9FormKartuKreditFragment_ViewBinding a(CC9FormKartuKreditFragment_ViewBinding cC9FormKartuKreditFragment_ViewBinding) {
                return cC9FormKartuKreditFragment_ViewBinding;
            }
        };

        CC9FormKartuKreditFragment_ViewBinding a(CC9FormKartuKreditFragment_ViewBinding cC9FormKartuKreditFragment_ViewBinding);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2-dex2jar.jar:o/onChooseTanggalJatuhTempo$RemoteActionCompatParcelizer.class */
    public static final class RemoteActionCompatParcelizer extends Thread {
        private final Handler d;
        private final ReferenceQueue<Object> e;

        RemoteActionCompatParcelizer(ReferenceQueue<Object> referenceQueue, Handler handler) {
            this.e = referenceQueue;
            this.d = handler;
            setDaemon(true);
            setName("Picasso-refQueue");
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            Process.setThreadPriority(10);
            while (true) {
                try {
                    showDataAlamat.IconCompatParcelizer iconCompatParcelizer = (showDataAlamat.IconCompatParcelizer) this.e.remove(1000);
                    Message obtainMessage = this.d.obtainMessage();
                    if (iconCompatParcelizer != null) {
                        obtainMessage.what = 3;
                        obtainMessage.obj = iconCompatParcelizer.e;
                        this.d.sendMessage(obtainMessage);
                    } else {
                        obtainMessage.recycle();
                    }
                } catch (InterruptedException e) {
                    return;
                } catch (Exception e2) {
                    this.d.post(new Runnable() { // from class: o.onChooseTanggalJatuhTempo.RemoteActionCompatParcelizer.3
                        @Override // java.lang.Runnable
                        public final void run() {
                            throw new RuntimeException(e2);
                        }
                    });
                    return;
                }
            }
        }
    }

    /* loaded from: classes2-dex2jar.jar:o/onChooseTanggalJatuhTempo$read.class */
    public enum read {
        LOW,
        NORMAL,
        HIGH
    }

    /* loaded from: classes2-dex2jar.jar:o/onChooseTanggalJatuhTempo$write.class */
    public enum write {
        MEMORY(-16711936),
        DISK(-16776961),
        NETWORK(-65536);
        
        final int e;

        write(int i) {
            this.e = i;
        }
    }

    onChooseTanggalJatuhTempo(Context context, showDataLainnya showdatalainnya, showDataDiri showdatadiri, onChooseTanggalJatuhTempo$MediaBrowserCompat$CustomActionResultReceiver onchoosetanggaljatuhtempo_mediabrowsercompat_customactionresultreceiver, MediaDescriptionCompat mediaDescriptionCompat, List<onChooseNomorRekening> list, onEditWarkatList oneditwarkatlist, Bitmap.Config config, boolean z, boolean z2) {
        this.a = context;
        this.i = showdatalainnya;
        this.b = showdatadiri;
        this.s = onchoosetanggaljatuhtempo_mediabrowsercompat_customactionresultreceiver;
        this.k = mediaDescriptionCompat;
        this.d = config;
        ArrayList arrayList = new ArrayList((list != null ? list.size() : 0) + 7);
        arrayList.add(new onDeleteWarkatList(context));
        if (list != null) {
            arrayList.addAll(list);
        }
        arrayList.add(new showDataCCPilihan(context));
        arrayList.add(new subscribeSexEvent(context));
        arrayList.add(new showDataFasilitas(context));
        arrayList.add(new onFocuscc278(context));
        arrayList.add(new showDataKontakDarurat(context));
        arrayList.add(new CC28FormKartuKreditFragment(showdatalainnya.f, oneditwarkatlist));
        this.h = Collections.unmodifiableList(arrayList);
        this.l = oneditwarkatlist;
        this.m = new WeakHashMap();
        this.f68o = new WeakHashMap();
        this.j = z;
        this.f = z2;
        ReferenceQueue<Object> referenceQueue = new ReferenceQueue<>();
        this.g = referenceQueue;
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = new RemoteActionCompatParcelizer(referenceQueue, c);
        this.q = remoteActionCompatParcelizer;
        remoteActionCompatParcelizer.start();
    }

    public static onChooseTanggalJatuhTempo d(Context context) {
        if (e == null) {
            synchronized (onChooseTanggalJatuhTempo.class) {
                try {
                    if (e == null) {
                        IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(context);
                        Context context2 = iconCompatParcelizer.e;
                        if (iconCompatParcelizer.b == null) {
                            iconCompatParcelizer.b = OR1DataPengirimFragment.c(context2);
                        }
                        if (iconCompatParcelizer.d == null) {
                            iconCompatParcelizer.d = new showDataKartuTambahan3(context2);
                        }
                        if (iconCompatParcelizer.g == null) {
                            iconCompatParcelizer.g = new showPasporPage();
                        }
                        if (iconCompatParcelizer.i == null) {
                            iconCompatParcelizer.i = MediaDescriptionCompat.a;
                        }
                        onEditWarkatList oneditwarkatlist = new onEditWarkatList(iconCompatParcelizer.d);
                        e = new onChooseTanggalJatuhTempo(context2, new showDataLainnya(context2, iconCompatParcelizer.g, c, iconCompatParcelizer.b, iconCompatParcelizer.d, oneditwarkatlist), iconCompatParcelizer.d, iconCompatParcelizer.j, iconCompatParcelizer.i, iconCompatParcelizer.h, oneditwarkatlist, iconCompatParcelizer.c, iconCompatParcelizer.a, iconCompatParcelizer.f);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return e;
    }

    public final showKtpPage a(String str) {
        if (str == null) {
            return new showKtpPage(this, null, 0);
        }
        if (str.trim().length() != 0) {
            return new showKtpPage(this, Uri.parse(str), 0);
        }
        throw new IllegalArgumentException("Path must not be empty.");
    }

    final void b(onFocuscc279 onfocuscc279) {
        showDataAlamat showdataalamat = onfocuscc279.d;
        List<showDataAlamat> list = onfocuscc279.b;
        boolean z = list != null && !list.isEmpty();
        boolean z2 = true;
        if (showdataalamat == null) {
            z2 = z;
        }
        if (z2) {
            CC9FormKartuKreditFragment_ViewBinding cC9FormKartuKreditFragment_ViewBinding = onfocuscc279.e;
            Exception exc = onfocuscc279.f;
            Bitmap bitmap = onfocuscc279.t;
            write write2 = onfocuscc279.j;
            if (showdataalamat != null) {
                d(bitmap, write2, showdataalamat);
            }
            if (z) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    d(bitmap, write2, list.get(i));
                }
            }
        }
    }

    public final Bitmap c(String str) {
        Bitmap e2 = this.b.e(str);
        if (e2 != null) {
            this.l.f.sendEmptyMessage(0);
        } else {
            this.l.f.sendEmptyMessage(1);
        }
        return e2;
    }

    public void c(Object obj) {
        showDataKartuTambahan2 remove;
        OR1DataPengirimFragment.a();
        showDataAlamat remove2 = this.m.remove(obj);
        if (remove2 != null) {
            remove2.e();
            Handler handler = this.i.i;
            handler.sendMessage(handler.obtainMessage(2, remove2));
        }
        if ((obj instanceof ImageView) && (remove = this.f68o.remove((ImageView) obj)) != null) {
            remove.d();
        }
    }

    void d(Bitmap bitmap, write write2, showDataAlamat showdataalamat) {
        if (!showdataalamat.e) {
            if (!showdataalamat.m) {
                Map<Object, showDataAlamat> map = this.m;
                Reference reference = showdataalamat.n;
                map.remove(reference == null ? null : reference.get());
            }
            if (bitmap == null) {
                showdataalamat.c();
                if (this.f) {
                    OR1DataPengirimFragment.e("Main", "errored", showdataalamat.j.b());
                }
            } else if (write2 != null) {
                showdataalamat.d(bitmap, write2);
                if (this.f) {
                    String b = showdataalamat.j.b();
                    StringBuilder sb = new StringBuilder("from ");
                    sb.append(write2);
                    OR1DataPengirimFragment.b("Main", "completed", b, sb.toString());
                }
            } else {
                throw new AssertionError("LoadedFrom cannot be null.");
            }
        }
    }

    public final void e(showDataAlamat showdataalamat) {
        Reference reference = showdataalamat.n;
        Object obj = reference == null ? null : reference.get();
        if (!(obj == null || this.m.get(obj) == showdataalamat)) {
            c(obj);
            this.m.put(obj, showdataalamat);
        }
        Handler handler = this.i.i;
        handler.sendMessage(handler.obtainMessage(1, showdataalamat));
    }
}
