package o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.squareup.picasso.Downloader;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import o.CC28FormKartuKreditFragment;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2-dex2jar.jar:o/showDataLainnya.class */
public final class showDataLainnya {
    final Context a;
    boolean b;
    final showDataLainnya$MediaBrowserCompat$CustomActionResultReceiver d;
    final showDataDiri e;
    final Downloader f;
    final Handler g;
    final Handler i;
    final ExecutorService k;
    final RemoteActionCompatParcelizer l;
    final boolean n;
    final onEditWarkatList p;
    final Map<String, onFocuscc279> h = new LinkedHashMap();
    final Map<Object, showDataAlamat> j = new WeakHashMap();
    final Map<Object, showDataAlamat> m = new WeakHashMap();

    /* renamed from: o  reason: collision with root package name */
    final Set<Object> f94o = new HashSet();
    final List<onFocuscc279> c = new ArrayList(4);

    /* loaded from: classes2-dex2jar.jar:o/showDataLainnya$IconCompatParcelizer.class */
    static final class IconCompatParcelizer extends Handler {
        private final showDataLainnya d;

        public IconCompatParcelizer(Looper looper, showDataLainnya showdatalainnya) {
            super(looper);
            this.d = showdatalainnya;
        }

        @Override // android.os.Handler
        public final void handleMessage(final Message message) {
            boolean z = false;
            switch (message.what) {
                case 1:
                    this.d.a((showDataAlamat) message.obj, true);
                    return;
                case 2:
                    this.d.b((showDataAlamat) message.obj);
                    return;
                case 3:
                case 8:
                default:
                    onChooseTanggalJatuhTempo.c.post(new Runnable() { // from class: o.showDataLainnya.IconCompatParcelizer.4
                        @Override // java.lang.Runnable
                        public final void run() {
                            StringBuilder sb = new StringBuilder("Unknown handler message received: ");
                            sb.append(message.what);
                            throw new AssertionError(sb.toString());
                        }
                    });
                    return;
                case 4:
                    onFocuscc279 onfocuscc279 = (onFocuscc279) message.obj;
                    showDataLainnya showdatalainnya = this.d;
                    if (CC27FormKartuKreditFragment_ViewBinding.c(onfocuscc279.f80o)) {
                        showdatalainnya.e.d(onfocuscc279.g, onfocuscc279.t);
                    }
                    showdatalainnya.h.remove(onfocuscc279.g);
                    showdatalainnya.c(onfocuscc279);
                    if (onfocuscc279.n.f) {
                        OR1DataPengirimFragment.b("Dispatcher", "batched", OR1DataPengirimFragment.b(onfocuscc279), "for completion");
                        return;
                    }
                    return;
                case 5:
                    this.d.b((onFocuscc279) message.obj);
                    return;
                case 6:
                    this.d.d((onFocuscc279) message.obj, false);
                    return;
                case 7:
                    showDataLainnya showdatalainnya2 = this.d;
                    ArrayList arrayList = new ArrayList(showdatalainnya2.c);
                    showdatalainnya2.c.clear();
                    Handler handler = showdatalainnya2.g;
                    handler.sendMessage(handler.obtainMessage(8, arrayList));
                    showDataLainnya.b(arrayList);
                    return;
                case 9:
                    this.d.a((NetworkInfo) message.obj);
                    return;
                case 10:
                    showDataLainnya showdatalainnya3 = this.d;
                    if (message.arg1 == 1) {
                        z = true;
                    }
                    showdatalainnya3.b = z;
                    return;
                case 11:
                    this.d.c(message.obj);
                    return;
                case 12:
                    Object obj = message.obj;
                    showDataLainnya showdatalainnya4 = this.d;
                    if (showdatalainnya4.f94o.remove(obj)) {
                        Iterator<showDataAlamat> it = showdatalainnya4.m.values().iterator();
                        ArrayList arrayList2 = null;
                        while (it.hasNext()) {
                            showDataAlamat next = it.next();
                            if (next.f.equals(obj)) {
                                ArrayList arrayList3 = arrayList2;
                                if (arrayList2 == null) {
                                    arrayList3 = new ArrayList();
                                }
                                arrayList3.add(next);
                                it.remove();
                                arrayList2 = arrayList3;
                            }
                        }
                        if (arrayList2 != null) {
                            Handler handler2 = showdatalainnya4.g;
                            handler2.sendMessage(handler2.obtainMessage(13, arrayList2));
                            return;
                        }
                        return;
                    }
                    return;
            }
        }
    }

    /* loaded from: classes2-dex2jar.jar:o/showDataLainnya$RemoteActionCompatParcelizer.class */
    static final class RemoteActionCompatParcelizer extends BroadcastReceiver {
        final showDataLainnya d;

        RemoteActionCompatParcelizer(showDataLainnya showdatalainnya) {
            this.d = showdatalainnya;
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (intent != null) {
                String action = intent.getAction();
                if ("android.intent.action.AIRPLANE_MODE".equals(action)) {
                    if (intent.hasExtra("state")) {
                        showDataLainnya showdatalainnya = this.d;
                        boolean booleanExtra = intent.getBooleanExtra("state", false);
                        Handler handler = showdatalainnya.i;
                        handler.sendMessage(handler.obtainMessage(10, booleanExtra ? 1 : 0, 0));
                    }
                } else if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
                    ConnectivityManager connectivityManager = (ConnectivityManager) OR1DataPengirimFragment.c(context, "connectivity");
                    showDataLainnya showdatalainnya2 = this.d;
                    NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                    Handler handler2 = showdatalainnya2.i;
                    handler2.sendMessage(handler2.obtainMessage(9, activeNetworkInfo));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public showDataLainnya(Context context, ExecutorService executorService, Handler handler, Downloader downloader, showDataDiri showdatadiri, onEditWarkatList oneditwarkatlist) {
        showDataLainnya$MediaBrowserCompat$CustomActionResultReceiver showdatalainnya_mediabrowsercompat_customactionresultreceiver = new HandlerThread() { // from class: o.showDataLainnya$MediaBrowserCompat$CustomActionResultReceiver
        };
        this.d = showdatalainnya_mediabrowsercompat_customactionresultreceiver;
        showdatalainnya_mediabrowsercompat_customactionresultreceiver.start();
        OR1DataPengirimFragment.d(showdatalainnya_mediabrowsercompat_customactionresultreceiver.getLooper());
        this.a = context;
        this.k = executorService;
        this.i = new IconCompatParcelizer(showdatalainnya_mediabrowsercompat_customactionresultreceiver.getLooper(), this);
        this.f = downloader;
        this.g = handler;
        this.e = showdatadiri;
        this.p = oneditwarkatlist;
        this.b = OR1DataPengirimFragment.a(context);
        this.n = OR1DataPengirimFragment.a(context, "android.permission.ACCESS_NETWORK_STATE");
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = new RemoteActionCompatParcelizer(this);
        this.l = remoteActionCompatParcelizer;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.AIRPLANE_MODE");
        if (remoteActionCompatParcelizer.d.n) {
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        }
        remoteActionCompatParcelizer.d.a.registerReceiver(remoteActionCompatParcelizer, intentFilter);
    }

    static void b(List<onFocuscc279> list) {
        if (!list.isEmpty() && list.get(0).n.f) {
            StringBuilder sb = new StringBuilder();
            for (onFocuscc279 onfocuscc279 : list) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(OR1DataPengirimFragment.b(onfocuscc279));
            }
            OR1DataPengirimFragment.e("Dispatcher", "delivered", sb.toString());
        }
    }

    private void d(showDataAlamat showdataalamat) {
        Reference reference = showdataalamat.n;
        Object obj = reference == null ? null : reference.get();
        if (obj != null) {
            showdataalamat.m = true;
            this.j.put(obj, showdataalamat);
        }
    }

    private void e(onFocuscc279 onfocuscc279) {
        showDataAlamat showdataalamat = onfocuscc279.d;
        if (showdataalamat != null) {
            d(showdataalamat);
        }
        List<showDataAlamat> list = onfocuscc279.b;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                d(list.get(i));
            }
        }
    }

    final void a(NetworkInfo networkInfo) {
        ExecutorService executorService = this.k;
        if (executorService instanceof showPasporPage) {
            showPasporPage showpasporpage = (showPasporPage) executorService;
            if (networkInfo != null && networkInfo.isConnectedOrConnecting()) {
                int type = networkInfo.getType();
                if (type == 0) {
                    int subtype = networkInfo.getSubtype();
                    switch (subtype) {
                        case 1:
                        case 2:
                            showpasporpage.setCorePoolSize(1);
                            showpasporpage.setMaximumPoolSize(1);
                            break;
                        default:
                            switch (subtype) {
                                case 12:
                                    break;
                                case 13:
                                case 14:
                                case 15:
                                    showpasporpage.setCorePoolSize(3);
                                    showpasporpage.setMaximumPoolSize(3);
                                    break;
                                default:
                                    showpasporpage.setCorePoolSize(3);
                                    showpasporpage.setMaximumPoolSize(3);
                                    break;
                            }
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            showpasporpage.setCorePoolSize(2);
                            showpasporpage.setMaximumPoolSize(2);
                            break;
                    }
                } else if (type == 1 || type == 6 || type == 9) {
                    showpasporpage.setCorePoolSize(4);
                    showpasporpage.setMaximumPoolSize(4);
                } else {
                    showpasporpage.setCorePoolSize(3);
                    showpasporpage.setMaximumPoolSize(3);
                }
            } else {
                showpasporpage.setCorePoolSize(3);
                showpasporpage.setMaximumPoolSize(3);
            }
        }
        if (networkInfo != null && networkInfo.isConnected() && !this.j.isEmpty()) {
            Iterator<showDataAlamat> it = this.j.values().iterator();
            while (it.hasNext()) {
                showDataAlamat next = it.next();
                it.remove();
                if (next.g.f) {
                    OR1DataPengirimFragment.e("Dispatcher", "replaying", next.j.b());
                }
                a(next, false);
            }
        }
    }

    final void a(showDataAlamat showdataalamat, boolean z) {
        Object obj = null;
        Object obj2 = null;
        if (this.f94o.contains(showdataalamat.f)) {
            Map<Object, showDataAlamat> map = this.m;
            Reference reference = showdataalamat.n;
            if (reference != null) {
                obj2 = reference.get();
            }
            map.put(obj2, showdataalamat);
            if (showdataalamat.g.f) {
                String b = showdataalamat.j.b();
                StringBuilder sb = new StringBuilder("because tag '");
                sb.append(showdataalamat.f);
                sb.append("' is paused");
                OR1DataPengirimFragment.b("Dispatcher", "paused", b, sb.toString());
                return;
            }
            return;
        }
        onFocuscc279 onfocuscc279 = this.h.get(showdataalamat.d);
        if (onfocuscc279 != null) {
            onfocuscc279.b(showdataalamat);
        } else if (!this.k.isShutdown()) {
            onFocuscc279 e = onFocuscc279.e(showdataalamat.g, this, this.e, this.p, showdataalamat);
            e.h = this.k.submit(e);
            this.h.put(showdataalamat.d, e);
            if (z) {
                Map<Object, showDataAlamat> map2 = this.j;
                Reference reference2 = showdataalamat.n;
                if (reference2 != null) {
                    obj = reference2.get();
                }
                map2.remove(obj);
            }
            if (showdataalamat.g.f) {
                OR1DataPengirimFragment.e("Dispatcher", "enqueued", showdataalamat.j.b());
            }
        } else if (showdataalamat.g.f) {
            OR1DataPengirimFragment.b("Dispatcher", "ignored", showdataalamat.j.b(), "because shut down");
        }
    }

    final void b(onFocuscc279 onfocuscc279) {
        boolean z;
        Future<?> future = onfocuscc279.h;
        boolean z2 = true;
        if (!(future != null && future.isCancelled())) {
            if (this.k.isShutdown()) {
                d(onfocuscc279, false);
                return;
            }
            NetworkInfo activeNetworkInfo = this.n ? ((ConnectivityManager) OR1DataPengirimFragment.c(this.a, "connectivity")).getActiveNetworkInfo() : null;
            boolean z3 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
            int i = onfocuscc279.r;
            if (!(i > 0)) {
                z = false;
            } else {
                onfocuscc279.r = i - 1;
                z = onfocuscc279.k.c(activeNetworkInfo);
            }
            boolean b = onfocuscc279.k.b();
            if (!z) {
                if (!this.n || !b) {
                    z2 = false;
                }
                d(onfocuscc279, z2);
                if (z2) {
                    e(onfocuscc279);
                }
            } else if (!this.n || z3) {
                if (onfocuscc279.n.f) {
                    OR1DataPengirimFragment.e("Dispatcher", "retrying", OR1DataPengirimFragment.b(onfocuscc279));
                }
                if (onfocuscc279.f instanceof CC28FormKartuKreditFragment.IconCompatParcelizer) {
                    onfocuscc279.m |= CC28FormKartuKreditFragment_ViewBinding.NO_CACHE.a;
                }
                onfocuscc279.h = this.k.submit(onfocuscc279);
            } else {
                d(onfocuscc279, b);
                if (b) {
                    e(onfocuscc279);
                }
            }
        }
    }

    final void b(showDataAlamat showdataalamat) {
        String str = showdataalamat.d;
        onFocuscc279 onfocuscc279 = this.h.get(str);
        if (onfocuscc279 != null) {
            onfocuscc279.e(showdataalamat);
            if (onfocuscc279.a()) {
                this.h.remove(str);
                if (showdataalamat.g.f) {
                    OR1DataPengirimFragment.e("Dispatcher", "canceled", showdataalamat.j.b());
                }
            }
        }
        boolean contains = this.f94o.contains(showdataalamat.f);
        Object obj = null;
        if (contains) {
            Map<Object, showDataAlamat> map = this.m;
            Reference reference = showdataalamat.n;
            map.remove(reference == null ? null : reference.get());
            if (showdataalamat.g.f) {
                OR1DataPengirimFragment.b("Dispatcher", "canceled", showdataalamat.j.b(), "because paused request got canceled");
            }
        }
        Map<Object, showDataAlamat> map2 = this.j;
        Reference reference2 = showdataalamat.n;
        if (reference2 != null) {
            obj = reference2.get();
        }
        showDataAlamat remove = map2.remove(obj);
        if (remove != null && remove.g.f) {
            OR1DataPengirimFragment.b("Dispatcher", "canceled", remove.j.b(), "from replaying");
        }
    }

    final void c(Object obj) {
        if (this.f94o.add(obj)) {
            Iterator<onFocuscc279> it = this.h.values().iterator();
            while (it.hasNext()) {
                onFocuscc279 next = it.next();
                boolean z = next.n.f;
                showDataAlamat showdataalamat = next.d;
                List<showDataAlamat> list = next.b;
                boolean z2 = list != null && !list.isEmpty();
                if (showdataalamat != null || z2) {
                    if (showdataalamat != null && showdataalamat.f.equals(obj)) {
                        next.e(showdataalamat);
                        Map<Object, showDataAlamat> map = this.m;
                        Reference reference = showdataalamat.n;
                        map.put(reference == null ? null : reference.get(), showdataalamat);
                        if (z) {
                            String b = showdataalamat.j.b();
                            StringBuilder sb = new StringBuilder("because tag '");
                            sb.append(obj);
                            sb.append("' was paused");
                            OR1DataPengirimFragment.b("Dispatcher", "paused", b, sb.toString());
                        }
                    }
                    if (z2) {
                        for (int size = list.size() - 1; size >= 0; size--) {
                            showDataAlamat showdataalamat2 = list.get(size);
                            if (showdataalamat2.f.equals(obj)) {
                                next.e(showdataalamat2);
                                Map<Object, showDataAlamat> map2 = this.m;
                                Reference reference2 = showdataalamat2.n;
                                map2.put(reference2 == null ? null : reference2.get(), showdataalamat2);
                                if (z) {
                                    String b2 = showdataalamat2.j.b();
                                    StringBuilder sb2 = new StringBuilder("because tag '");
                                    sb2.append(obj);
                                    sb2.append("' was paused");
                                    OR1DataPengirimFragment.b("Dispatcher", "paused", b2, sb2.toString());
                                }
                            }
                        }
                    }
                    if (next.a()) {
                        it.remove();
                        if (z) {
                            OR1DataPengirimFragment.b("Dispatcher", "canceled", OR1DataPengirimFragment.b(next), "all actions paused");
                        }
                    }
                }
            }
        }
    }

    void c(onFocuscc279 onfocuscc279) {
        Future<?> future = onfocuscc279.h;
        if (!(future != null && future.isCancelled())) {
            this.c.add(onfocuscc279);
            if (!this.i.hasMessages(7)) {
                this.i.sendEmptyMessageDelayed(7, 200);
            }
        }
    }

    final void d(onFocuscc279 onfocuscc279, boolean z) {
        if (onfocuscc279.n.f) {
            OR1DataPengirimFragment.b("Dispatcher", "batched", OR1DataPengirimFragment.b(onfocuscc279), "for error".concat(z ? " (will replay)" : ""));
        }
        this.h.remove(onfocuscc279.g);
        c(onfocuscc279);
    }
}
