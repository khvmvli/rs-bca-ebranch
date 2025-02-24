package o;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import o.realmGet;
import o.setCitizenValue;
/* loaded from: classes2-dex2jar.jar:o/realmGet$eChannels.class */
public final class realmGet$eChannels implements ServiceConnection, setCitizenValue.IconCompatParcelizer, setCitizenValue.MediaBrowserCompat.CustomActionResultReceiver {
    private volatile boolean a;
    final /* synthetic */ realmGet$idType b;
    private volatile setCodeTransaksi c;

    public realmGet$eChannels(realmGet$idType realmget_idtype) {
        this.b = realmget_idtype;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [o.realmGet$idType, o.realmSet$RepresentativeName] */
    /* JADX WARN: Type inference failed for: r0v7, types: [o.realmGet$idType, o.realmSet$RepresentativeName] */
    public final void a(int i) {
        setFotoKtp.d("MeasurementServiceConnection.onConnectionSuspended");
        this.b.q.s_().h().b("Service connection suspended");
        this.b.q.o_().b(new Runnable() { // from class: o.realmGet$bankTransfers
            @Override // java.lang.Runnable
            /* Code decompiled incorrectly, please refer to instructions dump */
            public final void run() {
                /*
                    r6 = this;
                    r0 = r6
                    o.realmGet$eChannels r0 = o.realmGet$eChannels.this
                    o.realmGet$idType r0 = r0.b
                    r7 = r0
                    r0 = r7
                    o.realmGet$TxnPurpose r0 = r0.q
                    android.content.Context r0 = r0.t_()
                    r8 = r0
                    r0 = r6
                    o.realmGet$eChannels r0 = o.realmGet$eChannels.this
                    o.realmGet$idType r0 = r0.b
                    o.realmGet$TxnPurpose r0 = r0.q
                    o.setSetorans r0 = r0.n_()
                    r0 = r7
                    android.content.ComponentName r1 = new android.content.ComponentName
                    r2 = r1
                    r3 = r8
                    java.lang.String r4 = "com.google.android.gms.measurement.AppMeasurementService"
                    r2.<init>(r3, r4)
                    o.realmGet$idType.a(r0, r1)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: o.realmGet$bankTransfers.run():void");
            }
        });
    }

    public final void b() {
        if (this.c != null && (this.c.j() || this.c.f())) {
            this.c.e();
        }
        this.c = null;
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [o.realmGet$idType, o.realmSet$RepresentativeName] */
    public final void b(Bundle bundle) {
        setFotoKtp.d("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                setFotoKtp.b(this.c);
                this.b.q.o_().b(new Runnable((realmSet$isInputAtmPemrek) this.c.u()) { // from class: o.realmGet$email
                    final /* synthetic */ realmSet$isInputAtmPemrek b;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.b = r5;
                    }

                    /* JADX WARN: Type inference failed for: r0v15, types: [o.realmGet$idType, o.realmSet$RepresentativeName] */
                    @Override // java.lang.Runnable
                    public final void run() {
                        synchronized (realmGet$eChannels.this) {
                            realmGet$eChannels.this.a = false;
                            if (!realmGet$eChannels.this.b.g()) {
                                realmGet$eChannels.this.b.q.s_().h().b("Connected to remote service");
                                realmGet$eChannels.this.b.b(this.b);
                            }
                        }
                    }
                });
            } catch (DeadObjectException | IllegalStateException e) {
                this.c = null;
                this.a = false;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [o.realmGet$idType, o.realmSet$RepresentativeName] */
    public final void b(realmGet.jobValue jobvalue) {
        setFotoKtp.d("MeasurementServiceConnection.onConnectionFailed");
        setIsInputAtmPemrek s = this.b.q.s();
        if (s != null) {
            s.c().e("Service connection failed", jobvalue);
        }
        synchronized (this) {
            this.a = false;
            this.c = null;
        }
        this.b.q.o_().b(new Runnable() { // from class: o.realmGet$creditCards
            @Override // java.lang.Runnable
            public final void run() {
                realmGet$eChannels.this.b.c = null;
                realmGet$eChannels.this.b.v();
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [o.realmGet$idType, o.realmSet$RepresentativeName] */
    /* JADX WARN: Type inference failed for: r0v13, types: [o.realmGet$idType, o.realmSet$RepresentativeName] */
    /* JADX WARN: Type inference failed for: r0v22, types: [o.realmGet$idType, o.realmSet$RepresentativeName] */
    /* JADX WARN: Type inference failed for: r0v3, types: [o.realmGet$idType, o.realmSet$RepresentativeName] */
    public final void d(Intent intent) {
        this.b.r_();
        Context t_ = this.b.q.t_();
        getAlamatPengirim b = getAlamatPengirim.b();
        synchronized (this) {
            if (this.a) {
                this.b.q.s_().i().b("Connection attempt already in progress");
                return;
            }
            this.b.q.s_().i().b("Using local app measurement service");
            this.a = true;
            b.b(t_, intent, this.b.d, 129);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [o.realmGet$idType, o.realmSet$RepresentativeName] */
    /* JADX WARN: Type inference failed for: r0v17, types: [o.realmGet$idType, o.realmSet$RepresentativeName] */
    /* JADX WARN: Type inference failed for: r0v3, types: [o.realmGet$idType, o.realmSet$RepresentativeName] */
    /* JADX WARN: Type inference failed for: r0v32, types: [o.realmGet$idType, o.realmSet$RepresentativeName] */
    /* JADX WARN: Type inference failed for: r0v41, types: [o.realmGet$idType, o.realmSet$RepresentativeName] */
    public final void e() {
        this.b.r_();
        Context t_ = this.b.q.t_();
        synchronized (this) {
            if (this.a) {
                this.b.q.s_().i().b("Connection attempt already in progress");
            } else if (this.c == null || (!this.c.f() && !this.c.j())) {
                this.c = new setCodeTransaksi(t_, Looper.getMainLooper(), this, this);
                this.b.q.s_().i().b("Connecting to remote service");
                this.a = true;
                setFotoKtp.b(this.c);
                this.c.m();
            } else {
                this.b.q.s_().i().b("Already awaiting connection attempt");
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [o.realmGet$idType, o.realmSet$RepresentativeName] */
    /* JADX WARN: Type inference failed for: r0v20, types: [o.realmGet$idType, o.realmSet$RepresentativeName] */
    /* JADX WARN: Type inference failed for: r0v31, types: [o.realmGet$idType, o.realmSet$RepresentativeName] */
    /* JADX WARN: Type inference failed for: r0v46, types: [o.realmGet$idType, o.realmSet$RepresentativeName] */
    /* JADX WARN: Type inference failed for: r0v56, types: [o.realmGet$idType, o.realmSet$RepresentativeName] */
    /* JADX WARN: Type inference failed for: r1v4, types: [o.realmGet$idType, o.realmSet$RepresentativeName] */
    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        setFotoKtp.d("MeasurementServiceConnection.onServiceConnected");
        synchronized (this) {
            if (iBinder == null) {
                this.a = false;
                this.b.q.s_().b().b("Service connected with null binder");
                return;
            }
            r5 = null;
            realmSet$isInputAtmPemrek realmset_isinputatmpemrek = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    realmset_isinputatmpemrek = queryLocalInterface instanceof realmSet$isInputAtmPemrek ? (realmSet$isInputAtmPemrek) queryLocalInterface : new realmSet$noRekeningTeller(iBinder);
                    this.b.q.s_().i().b("Bound to IMeasurementService interface");
                } else {
                    this.b.q.s_().b().e("Got binder with a wrong descriptor", interfaceDescriptor);
                }
            } catch (RemoteException e) {
                this.b.q.s_().b().b("Service connect failed to get IMeasurementService");
            }
            if (realmset_isinputatmpemrek == null) {
                this.a = false;
                try {
                    getAlamatPengirim.b().d(this.b.q.t_(), this.b.d);
                } catch (IllegalArgumentException e2) {
                }
            } else {
                this.b.q.o_().b(new getVerified(this, realmset_isinputatmpemrek));
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [o.realmGet$idType, o.realmSet$RepresentativeName] */
    /* JADX WARN: Type inference failed for: r0v7, types: [o.realmGet$idType, o.realmSet$RepresentativeName] */
    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        setFotoKtp.d("MeasurementServiceConnection.onServiceDisconnected");
        this.b.q.s_().h().b("Service disconnected");
        this.b.q.o_().b(new Runnable(componentName) { // from class: o.realmGet$acctNo
            final /* synthetic */ ComponentName d;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.d = r5;
            }

            @Override // java.lang.Runnable
            public final void run() {
                realmGet$idType.a(realmGet$eChannels.this.b, this.d);
            }
        });
    }
}
