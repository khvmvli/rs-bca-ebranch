package o;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import java.util.ArrayList;
import java.util.Objects;
import o.getDollarCurrCode;
import o.realmGet$acctType;
/* loaded from: classes-dex2jar.jar:o/getJob.class */
public final /* synthetic */ class getJob implements Runnable {
    public final /* synthetic */ getJobOthers a;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ TransaksiTundaDetail$$Parcelable d;
    public final /* synthetic */ int e;

    public /* synthetic */ getJob(getJobOthers getjobothers, TransaksiTundaDetail$$Parcelable transaksiTundaDetail$$Parcelable, int i, Runnable runnable) {
        this.a = getjobothers;
        this.d = transaksiTundaDetail$$Parcelable;
        this.e = i;
        this.c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Runnable runnable;
        getDollarCurrCode b;
        try {
            getJobOthers getjobothers = this.a;
            TransaksiTundaDetail$$Parcelable transaksiTundaDetail$$Parcelable = this.d;
            int i = this.e;
            runnable = this.c;
            try {
                realmGet$acctType realmget_accttype = getjobothers.i;
                getMaritalStatus getmaritalstatus = getjobothers.b;
                Objects.requireNonNull(getmaritalstatus);
                realmget_accttype.d(new realmGet$acctType.IconCompatParcelizer() { // from class: o.getIncomeSourceOthers
                    @Override // o.realmGet$acctType.IconCompatParcelizer
                    public final Object c() {
                        return Integer.valueOf(getMaritalStatus.this.c());
                    }
                });
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) getjobothers.c.getSystemService("connectivity")).getActiveNetworkInfo();
                if (!(activeNetworkInfo != null && activeNetworkInfo.isConnected())) {
                    getjobothers.i.d(new realmGet$acctType.IconCompatParcelizer(transaksiTundaDetail$$Parcelable, i) { // from class: o.getIncomeSource
                        public final /* synthetic */ TransaksiTundaDetail$$Parcelable b;
                        public final /* synthetic */ int e;

                        {
                            this.b = r5;
                            this.e = r6;
                        }

                        @Override // o.realmGet$acctType.IconCompatParcelizer
                        public final Object c() {
                            getJobOthers getjobothers2 = getJobOthers.this;
                            getjobothers2.g.d(this.b, this.e + 1);
                            return null;
                        }
                    });
                } else {
                    getFlagEKTP d = getjobothers.e.d(transaksiTundaDetail$$Parcelable.c());
                    Iterable<getNumberID> iterable = (Iterable) getjobothers.i.d(new realmGet$acctType.IconCompatParcelizer(transaksiTundaDetail$$Parcelable) { // from class: o.getIncomeSourceValue
                        public final /* synthetic */ TransaksiTundaDetail$$Parcelable a;

                        {
                            this.a = r5;
                        }

                        @Override // o.realmGet$acctType.IconCompatParcelizer
                        public final Object c() {
                            getJobOthers getjobothers2 = getJobOthers.this;
                            return getjobothers2.b.e(this.a);
                        }
                    });
                    if (iterable.iterator().hasNext()) {
                        if (d == null) {
                            getFlagMB.b("Uploader", "Unknown backend for %s, deleting event batch for it...", transaksiTundaDetail$$Parcelable);
                            b = new getCobIsoCode(getDollarCurrCode.RemoteActionCompatParcelizer.FATAL_ERROR, -1);
                        } else {
                            ArrayList arrayList = new ArrayList();
                            for (getNumberID getnumberid : iterable) {
                                arrayList.add(getnumberid.c());
                            }
                            b = d.b(new getEmailAddr$MediaBrowserCompat$CustomActionResultReceiver() { // from class: o.getCitizenValue$MediaBrowserCompat$CustomActionResultReceiver
                                private byte[] a;
                                private Iterable<setTransaksiTunda> d;

                                @Override // o.getEmailAddr$MediaBrowserCompat$CustomActionResultReceiver
                                public final getEmailAddr$MediaBrowserCompat$CustomActionResultReceiver a(byte[] bArr) {
                                    this.a = bArr;
                                    return this;
                                }

                                @Override // o.getEmailAddr$MediaBrowserCompat$CustomActionResultReceiver
                                public final getEmailAddr$MediaBrowserCompat$CustomActionResultReceiver d(Iterable<setTransaksiTunda> iterable2) {
                                    this.d = iterable2;
                                    return this;
                                }

                                @Override // o.getEmailAddr$MediaBrowserCompat$CustomActionResultReceiver
                                public final getEmailAddr e() {
                                    String str = this.d == null ? " events" : "";
                                    if (str.isEmpty()) {
                                        return new getCitizenValue(this.d, this.a, (byte) 0);
                                    }
                                    StringBuilder sb = new StringBuilder("Missing required properties:");
                                    sb.append(str);
                                    throw new IllegalStateException(sb.toString());
                                }
                            }.d(arrayList).a(transaksiTundaDetail$$Parcelable.b()).e());
                        }
                        getjobothers.i.d(new realmGet$acctType.IconCompatParcelizer(b, iterable, transaksiTundaDetail$$Parcelable, i) { // from class: o.getJobValue
                            public final /* synthetic */ int a;
                            public final /* synthetic */ Iterable b;
                            public final /* synthetic */ TransaksiTundaDetail$$Parcelable c;
                            public final /* synthetic */ getDollarCurrCode d;

                            {
                                this.d = r5;
                                this.b = r6;
                                this.c = r7;
                                this.a = r8;
                            }

                            @Override // o.realmGet$acctType.IconCompatParcelizer
                            public final Object c() {
                                getJobOthers getjobothers2 = getJobOthers.this;
                                getDollarCurrCode getdollarcurrcode = this.d;
                                Iterable<getNumberID> iterable2 = this.b;
                                TransaksiTundaDetail$$Parcelable transaksiTundaDetail$$Parcelable2 = this.c;
                                int i2 = this.a;
                                if (getdollarcurrcode.b() == getDollarCurrCode.RemoteActionCompatParcelizer.TRANSIENT_ERROR) {
                                    getjobothers2.b.b(iterable2);
                                    getjobothers2.g.d(transaksiTundaDetail$$Parcelable2, i2 + 1);
                                    return null;
                                }
                                getjobothers2.b.e(iterable2);
                                if (getdollarcurrcode.b() == getDollarCurrCode.RemoteActionCompatParcelizer.OK) {
                                    getjobothers2.b.d(transaksiTundaDetail$$Parcelable2, getjobothers2.a.c() + getdollarcurrcode.c());
                                }
                                if (!getjobothers2.b.d(transaksiTundaDetail$$Parcelable2)) {
                                    return null;
                                }
                                getjobothers2.g.b(transaksiTundaDetail$$Parcelable2, 1, true);
                                return null;
                            }
                        });
                    }
                }
            } catch (SynchronizationException e) {
                getjobothers.g.d(transaksiTundaDetail$$Parcelable, i + 1);
            }
        } finally {
            runnable.run();
        }
    }
}
