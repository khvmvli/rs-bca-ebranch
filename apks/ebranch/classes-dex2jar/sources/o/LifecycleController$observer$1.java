package o;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import o.FullLifecycleObserverAdapter;
import o.findFragmentById;
import o.setOnApplyWindowInsetsListener$MediaBrowserCompat$CustomActionResultReceiver;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/LifecycleController$observer$1.class */
public final class LifecycleController$observer$1 {
    final Context b;
    final FullLifecycleObserverAdapter c;
    int d;
    final Executor e;
    setOnApplyWindowInsetsListener g;
    final FullLifecycleObserverAdapter.IconCompatParcelizer h;
    final String i;
    final ServiceConnection j;
    final findFragmentById a = new findFragmentById.write() { // from class: o.LifecycleController$observer$1.1
        @Override // o.findFragmentById
        public final void d(final String[] strArr) {
            LifecycleController$observer$1.this.e.execute(new Runnable() { // from class: o.LifecycleController.observer.1.1.5
                @Override // java.lang.Runnable
                public final void run() {
                    Set<String> set;
                    FullLifecycleObserverAdapter fullLifecycleObserverAdapter = LifecycleController$observer$1.this.c;
                    String[] strArr2 = strArr;
                    synchronized (fullLifecycleObserverAdapter.j) {
                        Iterator<Map.Entry<FullLifecycleObserverAdapter.IconCompatParcelizer, FullLifecycleObserverAdapter$MediaBrowserCompat$CustomActionResultReceiver>> it = fullLifecycleObserverAdapter.j.iterator();
                        while (it.hasNext()) {
                            Map.Entry<FullLifecycleObserverAdapter.IconCompatParcelizer, FullLifecycleObserverAdapter$MediaBrowserCompat$CustomActionResultReceiver> next = it.next();
                            if (!next.getKey().c()) {
                                FullLifecycleObserverAdapter$MediaBrowserCompat$CustomActionResultReceiver value = next.getValue();
                                if (value.b.length == 1) {
                                    int length = strArr2.length;
                                    int i = 0;
                                    while (true) {
                                        set = null;
                                        if (i >= length) {
                                            break;
                                        } else if (strArr2[i].equalsIgnoreCase(value.b[0])) {
                                            set = value.e;
                                            break;
                                        } else {
                                            i++;
                                        }
                                    }
                                } else {
                                    HashSet hashSet = new HashSet();
                                    for (String str : strArr2) {
                                        String[] strArr3 = value.b;
                                        int length2 = strArr3.length;
                                        int i2 = 0;
                                        while (true) {
                                            if (i2 < length2) {
                                                String str2 = strArr3[i2];
                                                if (str2.equalsIgnoreCase(str)) {
                                                    hashSet.add(str2);
                                                    break;
                                                }
                                                i2++;
                                            }
                                        }
                                    }
                                    set = null;
                                    if (hashSet.size() > 0) {
                                        set = hashSet;
                                    }
                                }
                                if (set != null) {
                                    value.c.c(set);
                                }
                            }
                        }
                    }
                }
            });
        }
    };

    /* renamed from: o  reason: collision with root package name */
    final AtomicBoolean f98o = new AtomicBoolean(false);
    final Runnable k = new Runnable() { // from class: o.LifecycleController$observer$1.5
        @Override // java.lang.Runnable
        public final void run() {
            try {
                setOnApplyWindowInsetsListener setonapplywindowinsetslistener = LifecycleController$observer$1.this.g;
                if (setonapplywindowinsetslistener != null) {
                    LifecycleController$observer$1 lifecycleController$observer$1 = LifecycleController$observer$1.this;
                    lifecycleController$observer$1.d = setonapplywindowinsetslistener.c(lifecycleController$observer$1.a, LifecycleController$observer$1.this.i);
                    LifecycleController$observer$1.this.c.a(LifecycleController$observer$1.this.h);
                }
            } catch (RemoteException e) {
                Log.w("ROOM", "Cannot register multi-instance invalidation callback", e);
            }
        }
    };
    final Runnable f = new Runnable() { // from class: o.LifecycleController$observer$1.2
        @Override // java.lang.Runnable
        public final void run() {
            LifecycleController$observer$1.this.c.b(LifecycleController$observer$1.this.h);
        }
    };

    /* JADX INFO: Access modifiers changed from: package-private */
    public LifecycleController$observer$1(Context context, String str, Intent intent, FullLifecycleObserverAdapter fullLifecycleObserverAdapter, Executor executor) {
        AnonymousClass3 r0 = new ServiceConnection() { // from class: o.LifecycleController$observer$1.3
            @Override // android.content.ServiceConnection
            public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                setOnApplyWindowInsetsListener setonapplywindowinsetslistener;
                LifecycleController$observer$1 lifecycleController$observer$1 = LifecycleController$observer$1.this;
                if (iBinder == null) {
                    setonapplywindowinsetslistener = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationService");
                    setonapplywindowinsetslistener = (queryLocalInterface == null || !(queryLocalInterface instanceof setOnApplyWindowInsetsListener)) ? new setOnApplyWindowInsetsListener$MediaBrowserCompat$CustomActionResultReceiver.read(iBinder) : (setOnApplyWindowInsetsListener) queryLocalInterface;
                }
                lifecycleController$observer$1.g = setonapplywindowinsetslistener;
                LifecycleController$observer$1.this.e.execute(LifecycleController$observer$1.this.k);
            }

            @Override // android.content.ServiceConnection
            public final void onServiceDisconnected(ComponentName componentName) {
                LifecycleController$observer$1.this.e.execute(LifecycleController$observer$1.this.f);
                LifecycleController$observer$1.this.g = null;
            }
        };
        this.j = r0;
        Context applicationContext = context.getApplicationContext();
        this.b = applicationContext;
        this.i = str;
        this.c = fullLifecycleObserverAdapter;
        this.e = executor;
        this.h = new FullLifecycleObserverAdapter.IconCompatParcelizer((String[]) fullLifecycleObserverAdapter.g.keySet().toArray(new String[0])) { // from class: o.LifecycleController$observer$1.4
            @Override // o.FullLifecycleObserverAdapter.IconCompatParcelizer
            public final void c(Set<String> set) {
                if (!LifecycleController$observer$1.this.f98o.get()) {
                    try {
                        setOnApplyWindowInsetsListener setonapplywindowinsetslistener = LifecycleController$observer$1.this.g;
                        if (setonapplywindowinsetslistener != null) {
                            setonapplywindowinsetslistener.c(LifecycleController$observer$1.this.d, (String[]) set.toArray(new String[0]));
                        }
                    } catch (RemoteException e) {
                        Log.w("ROOM", "Cannot broadcast invalidation", e);
                    }
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // o.FullLifecycleObserverAdapter.IconCompatParcelizer
            public final boolean c() {
                return true;
            }
        };
        applicationContext.bindService(intent, r0, 1);
    }
}
