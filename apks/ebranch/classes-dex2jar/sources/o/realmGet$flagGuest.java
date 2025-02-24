package o;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.cloudmessaging.zzp;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/realmGet$flagGuest.class */
public final class realmGet$flagGuest implements ServiceConnection {
    final SparseArray<realmGet$hmCountry<?>> a;
    final Queue<realmGet$hmCountry<?>> b;
    int c;
    final Messenger d;
    realmGet$hmCity e;
    final /* synthetic */ realmGet$flagNPWP h;

    private realmGet$flagGuest(realmGet$flagNPWP realmget_flagnpwp) {
        this.h = realmget_flagnpwp;
        this.c = 0;
        this.d = new Messenger(new getBankTujuanOfficeCode(Looper.getMainLooper(), new Handler.Callback(this) { // from class: o.realmGet$handPhoneNumber
            private final realmGet$flagGuest a;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.a = r4;
            }

            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.a.d(message);
            }
        }));
        this.b = new ArrayDeque();
        this.a = new SparseArray<>();
    }

    public final void b() {
        synchronized (this) {
            if (this.c == 1) {
                c(1, "Timed out while binding");
            }
        }
    }

    public final void c(int i) {
        synchronized (this) {
            realmGet$hmCountry<?> realmget_hmcountry = this.a.get(i);
            if (realmget_hmcountry != null) {
                StringBuilder sb = new StringBuilder(31);
                sb.append("Timing out request: ");
                sb.append(i);
                Log.w("MessengerIpcClient", sb.toString());
                this.a.remove(i);
                realmget_hmcountry.b(new zzp(3, "Timed out waiting for response"));
                e();
            }
        }
    }

    public final void c(int i, String str) {
        synchronized (this) {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                String valueOf = String.valueOf(str);
                Log.d("MessengerIpcClient", valueOf.length() != 0 ? "Disconnected: ".concat(valueOf) : new String("Disconnected: "));
            }
            int i2 = this.c;
            if (i2 == 0) {
                throw new IllegalStateException();
            } else if (i2 == 1 || i2 == 2) {
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Unbinding service");
                }
                this.c = 4;
                getAlamatPengirim.b().d(this.h.a, this);
                zzp zzp = new zzp(i, str);
                for (realmGet$hmCountry<?> realmget_hmcountry : this.b) {
                    realmget_hmcountry.b(zzp);
                }
                this.b.clear();
                for (int i3 = 0; i3 < this.a.size(); i3++) {
                    this.a.valueAt(i3).b(zzp);
                }
                this.a.clear();
            } else if (i2 == 3) {
                this.c = 4;
            } else if (i2 != 4) {
                int i4 = this.c;
                StringBuilder sb = new StringBuilder(26);
                sb.append("Unknown state: ");
                sb.append(i4);
                throw new IllegalStateException(sb.toString());
            }
        }
    }

    public final void d() {
        this.h.b.execute(new Runnable(this) { // from class: o.realmGet$fotoNpwp
            private final realmGet$flagGuest d;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.d = r4;
            }

            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x005b: INVOKE  
                  (wrap: java.util.concurrent.ScheduledExecutorService : 0x0042: ONE_ARG  (r0v21 java.util.concurrent.ScheduledExecutorService A[REMOVE]) = 
                  (wrap: java.util.concurrent.ScheduledExecutorService : 0x0001: IGET  
                  (wrap: o.realmGet$flagNPWP : 0x003f: IGET  (r0v20 o.realmGet$flagNPWP A[REMOVE]) = (r0v1 'realmget_flagguest' o.realmGet$flagGuest) o.realmGet$flagGuest.h o.realmGet$flagNPWP)
                 o.realmGet$flagNPWP.b java.util.concurrent.ScheduledExecutorService)
                )
                  (wrap: o.realmGet$hmAddress : 0x004f: CONSTRUCTOR  (r0v22 o.realmGet$hmAddress A[REMOVE]) = (r0v1 'realmget_flagguest' o.realmGet$flagGuest), (r0v16 'poll' o.realmGet$hmCountry<?>) call: o.realmGet$hmAddress.<init>(o.realmGet$flagGuest, o.realmGet$hmCountry):void type: CONSTRUCTOR)
                  (30 long)
                  (wrap: java.util.concurrent.TimeUnit : 0x0058: SGET  (r3v0 java.util.concurrent.TimeUnit A[REMOVE]) =  java.util.concurrent.TimeUnit.SECONDS java.util.concurrent.TimeUnit)
                 type: INTERFACE call: java.util.concurrent.ScheduledExecutorService.schedule(java.lang.Runnable, long, java.util.concurrent.TimeUnit):java.util.concurrent.ScheduledFuture in method: o.realmGet$fotoNpwp.run():void, file: classes-dex2jar.jar:o/realmGet$fotoNpwp.class
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:270)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:233)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:90)
                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:79)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:122)
                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:137)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:79)
                	at jadx.core.codegen.RegionGen.makeSynchronizedRegion(RegionGen.java:239)
                	at jadx.core.dex.regions.SynchronizedRegion.generate(SynchronizedRegion.java:44)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:79)
                	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:174)
                	at jadx.core.dex.regions.loops.LoopRegion.generate(LoopRegion.java:173)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:255)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:248)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:369)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:304)
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: o.realmGet$hmAddress, state: NOT_LOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:268)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:668)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:378)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:132)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:117)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:104)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:974)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:799)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:382)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:263)
                	... 34 more
                */
            @Override // java.lang.Runnable
            public final void run() {
                /*
                // Method dump skipped, instructions count: 276
                */
                throw new UnsupportedOperationException("Method not decompiled: o.realmGet$fotoNpwp.run():void");
            }
        });
    }

    public final boolean d(Message message) {
        int i = message.arg1;
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            StringBuilder sb = new StringBuilder(41);
            sb.append("Received response to request: ");
            sb.append(i);
            Log.d("MessengerIpcClient", sb.toString());
        }
        synchronized (this) {
            realmGet$hmCountry<?> realmget_hmcountry = this.a.get(i);
            if (realmget_hmcountry == null) {
                StringBuilder sb2 = new StringBuilder(50);
                sb2.append("Received response for unknown request: ");
                sb2.append(i);
                Log.w("MessengerIpcClient", sb2.toString());
                return true;
            }
            this.a.remove(i);
            e();
            Bundle data = message.getData();
            if (data.getBoolean("unsupported", false)) {
                realmget_hmcountry.b(new zzp(4, "Not supported by GmsCore"));
                return true;
            }
            realmget_hmcountry.d(data);
            return true;
        }
    }

    public final boolean d(realmGet$hmCountry<?> realmget_hmcountry) {
        synchronized (this) {
            int i = this.c;
            if (i == 0) {
                this.b.add(realmget_hmcountry);
                setFotoKtp.a(this.c == 0);
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Starting bind to GmsCore");
                }
                this.c = 1;
                Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                intent.setPackage("com.google.android.gms");
                if (!getAlamatPengirim.b().b(this.h.a, intent, this, 1)) {
                    c(0, "Unable to bind to service");
                } else {
                    this.h.b.schedule(new Runnable(this) { // from class: o.realmGet$handPhoneCountryCodeNumber
                        private final realmGet$flagGuest a;

                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            this.a = r4;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.a.b();
                        }
                    }, 30, TimeUnit.SECONDS);
                }
                return true;
            } else if (i == 1) {
                this.b.add(realmget_hmcountry);
                return true;
            } else if (i == 2) {
                this.b.add(realmget_hmcountry);
                d();
                return true;
            } else if (i == 3 || i == 4) {
                return false;
            } else {
                int i2 = this.c;
                StringBuilder sb = new StringBuilder(26);
                sb.append("Unknown state: ");
                sb.append(i2);
                throw new IllegalStateException(sb.toString());
            }
        }
    }

    public final void e() {
        synchronized (this) {
            if (this.c == 2 && this.b.isEmpty() && this.a.size() == 0) {
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
                }
                this.c = 3;
                getAlamatPengirim.b().d(this.h.a, this);
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        this.h.b.execute(new Runnable(this, iBinder) { // from class: o.realmGet$fotoKtp
            private final realmGet$flagGuest b;
            private final IBinder d;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.b = r4;
                this.d = r5;
            }

            @Override // java.lang.Runnable
            public final void run() {
                realmGet$flagGuest realmget_flagguest = this.b;
                IBinder iBinder2 = this.d;
                synchronized (realmget_flagguest) {
                    if (iBinder2 == null) {
                        realmget_flagguest.c(0, "Null service connection");
                        return;
                    }
                    try {
                        realmget_flagguest.e = new realmGet$hmCity(iBinder2);
                        realmget_flagguest.c = 2;
                        realmget_flagguest.d();
                    } catch (RemoteException e) {
                        realmget_flagguest.c(0, e.getMessage());
                    }
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        this.h.b.execute(new Runnable(this) { // from class: o.realmGet$hmPhoneCodeNumber
            private final realmGet$flagGuest e;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.e = r4;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.e.c(2, "Service disconnected");
            }
        });
    }
}
