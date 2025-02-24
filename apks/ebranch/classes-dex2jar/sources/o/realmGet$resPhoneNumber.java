package o;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import com.google.android.gms.common.api.Scope;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Set;
import o.setCitizenValue;
/* loaded from: classes-dex2jar.jar:o/realmGet$resPhoneNumber.class */
public final class realmGet$resPhoneNumber implements realmGet$name$MediaBrowserCompat$SearchResultReceiver, ServiceConnection {
    private final ComponentName a;
    private final String b;
    private final Context c;
    private final String d;
    private final realmGet$resCountry e;
    private final Handler f;
    private boolean g;
    private final realmGet$resProvince h;
    private String i;
    private IBinder j;
    private String l;

    @Override // o.realmGet$name$MediaBrowserCompat$SearchResultReceiver
    public final int a() {
        return 0;
    }

    @Override // o.realmGet$name$MediaBrowserCompat$SearchResultReceiver
    public final void a(setCitizenValue.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        if (Thread.currentThread() == this.f.getLooper().getThread()) {
            if (j()) {
                try {
                    c("connect() called when already connected");
                } catch (Exception e) {
                }
            }
            try {
                Intent intent = new Intent();
                ComponentName componentName = this.a;
                if (componentName != null) {
                    intent.setComponent(componentName);
                } else {
                    intent.setPackage(this.d).setAction(this.b);
                }
                boolean bindService = this.c.bindService(intent, this, setEmailAddr.d());
                this.g = bindService;
                if (!bindService) {
                    this.j = null;
                    this.h.b(new realmGet$jobValue(16));
                }
            } catch (SecurityException e2) {
                this.g = false;
                this.j = null;
                throw e2;
            }
        } else {
            throw new IllegalStateException("This method should only run on the NonGmsServiceBrokerClient's handler thread.");
        }
    }

    @Override // o.realmGet$name$MediaBrowserCompat$SearchResultReceiver
    public final void a(setExpID setexpid, Set<Scope> set) {
    }

    @Override // o.realmGet$name$MediaBrowserCompat$SearchResultReceiver
    public final String b() {
        return this.i;
    }

    public final /* synthetic */ void b(IBinder iBinder) {
        this.g = false;
        this.j = iBinder;
        this.e.e(new Bundle());
    }

    public final void b(String str) {
        this.l = str;
    }

    @Override // o.realmGet$name$MediaBrowserCompat$SearchResultReceiver
    public final void c(String str) {
        if (Thread.currentThread() == this.f.getLooper().getThread()) {
            this.i = str;
            e();
            return;
        }
        throw new IllegalStateException("This method should only run on the NonGmsServiceBrokerClient's handler thread.");
    }

    @Override // o.realmGet$name$MediaBrowserCompat$SearchResultReceiver
    public final void c(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    @Override // o.realmGet$name$MediaBrowserCompat$SearchResultReceiver
    public final void c(setCitizenValue.write write) {
    }

    @Override // o.realmGet$name$MediaBrowserCompat$SearchResultReceiver
    public final realmGet$job[] c() {
        return new realmGet$job[0];
    }

    @Override // o.realmGet$name$MediaBrowserCompat$SearchResultReceiver
    public final String d() {
        String str = this.d;
        if (str != null) {
            return str;
        }
        ComponentName componentName = this.a;
        if (componentName != null) {
            return componentName.getPackageName();
        }
        throw new NullPointerException("null reference");
    }

    @Override // o.realmGet$name$MediaBrowserCompat$SearchResultReceiver
    public final void e() {
        if (Thread.currentThread() == this.f.getLooper().getThread()) {
            try {
                this.c.unbindService(this);
            } catch (IllegalArgumentException e) {
            }
            this.g = false;
            this.j = null;
            return;
        }
        throw new IllegalStateException("This method should only run on the NonGmsServiceBrokerClient's handler thread.");
    }

    @Override // o.realmGet$name$MediaBrowserCompat$SearchResultReceiver
    public final boolean f() {
        if (Thread.currentThread() == this.f.getLooper().getThread()) {
            return this.g;
        }
        throw new IllegalStateException("This method should only run on the NonGmsServiceBrokerClient's handler thread.");
    }

    @Override // o.realmGet$name$MediaBrowserCompat$SearchResultReceiver
    public final boolean g() {
        return false;
    }

    @Override // o.realmGet$name$MediaBrowserCompat$SearchResultReceiver
    public final Intent h() {
        return new Intent();
    }

    @Override // o.realmGet$name$MediaBrowserCompat$SearchResultReceiver
    public final Set<Scope> i() {
        return Collections.emptySet();
    }

    @Override // o.realmGet$name$MediaBrowserCompat$SearchResultReceiver
    public final boolean j() {
        if (Thread.currentThread() == this.f.getLooper().getThread()) {
            return this.j != null;
        }
        throw new IllegalStateException("This method should only run on the NonGmsServiceBrokerClient's handler thread.");
    }

    public final /* synthetic */ void m() {
        this.g = false;
        this.j = null;
        this.e.e(1);
    }

    @Override // o.realmGet$name$MediaBrowserCompat$SearchResultReceiver
    public final boolean n() {
        return false;
    }

    @Override // o.realmGet$name$MediaBrowserCompat$SearchResultReceiver
    public final boolean o() {
        return false;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f.post(new Runnable(iBinder) { // from class: o.realmSet$kitasKitapNumber
            public final /* synthetic */ IBinder b;

            {
                this.b = r5;
            }

            @Override // java.lang.Runnable
            public final void run() {
                realmGet$resPhoneNumber.this.b(this.b);
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f.post(new Runnable() { // from class: o.realmSet$lastEducation
            @Override // java.lang.Runnable
            public final void run() {
                realmGet$resPhoneNumber.this.m();
            }
        });
    }
}
