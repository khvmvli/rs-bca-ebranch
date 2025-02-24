package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.stetho.dumpapp.Framer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import o.setMaxHeight;
import o.setMinWidth;
/* loaded from: classes-dex2jar.jar:o/setDesignInformation.class */
public class setDesignInformation {
    private static SparseIntArray b;
    private static final int[] d = {0, 4, 8};
    private HashMap<String, setType> e = new HashMap<>();
    boolean c = true;
    public HashMap<Integer, IconCompatParcelizer> a = new HashMap<>();

    /* loaded from: classes-dex2jar.jar:o/setDesignInformation$IconCompatParcelizer.class */
    public static final class IconCompatParcelizer {
        int b;
        public final read c = new read();
        public final write e = new write();
        public final RemoteActionCompatParcelizer d = new RemoteActionCompatParcelizer();
        public final setDesignInformation$MediaBrowserCompat$CustomActionResultReceiver f = new setDesignInformation$MediaBrowserCompat$CustomActionResultReceiver();
        public HashMap<String, setType> a = new HashMap<>();

        public void a(int i, setMinHeight$MediaBrowserCompat$CustomActionResultReceiver setminheight_mediabrowsercompat_customactionresultreceiver) {
            c(i, setminheight_mediabrowsercompat_customactionresultreceiver);
            this.c.d = setminheight_mediabrowsercompat_customactionresultreceiver.ar;
            this.f.b = setminheight_mediabrowsercompat_customactionresultreceiver.av;
            this.f.e = setminheight_mediabrowsercompat_customactionresultreceiver.at;
            this.f.j = setminheight_mediabrowsercompat_customactionresultreceiver.as;
            this.f.i = setminheight_mediabrowsercompat_customactionresultreceiver.au;
            this.f.g = setminheight_mediabrowsercompat_customactionresultreceiver.aw;
            this.f.f = setminheight_mediabrowsercompat_customactionresultreceiver.aB;
            this.f.h = setminheight_mediabrowsercompat_customactionresultreceiver.ay;
            this.f.k = setminheight_mediabrowsercompat_customactionresultreceiver.az;
            this.f.m = setminheight_mediabrowsercompat_customactionresultreceiver.ax;
            this.f.l = setminheight_mediabrowsercompat_customactionresultreceiver.aA;
            this.f.d = setminheight_mediabrowsercompat_customactionresultreceiver.ap;
            this.f.c = setminheight_mediabrowsercompat_customactionresultreceiver.aq;
        }

        public final void b(setMaxHeight.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
            remoteActionCompatParcelizer.F = this.d.H;
            remoteActionCompatParcelizer.N = this.d.G;
            remoteActionCompatParcelizer.ah = this.d.V;
            remoteActionCompatParcelizer.ag = this.d.U;
            remoteActionCompatParcelizer.am = this.d.ab;
            remoteActionCompatParcelizer.ak = this.d.ac;
            remoteActionCompatParcelizer.a = this.d.a;
            remoteActionCompatParcelizer.e = this.d.c;
            remoteActionCompatParcelizer.b = this.d.b;
            remoteActionCompatParcelizer.af = this.d.Z;
            remoteActionCompatParcelizer.ae = this.d.Y;
            remoteActionCompatParcelizer.p = this.d.m;
            remoteActionCompatParcelizer.f243o = this.d.k;
            remoteActionCompatParcelizer.leftMargin = this.d.E;
            remoteActionCompatParcelizer.rightMargin = this.d.X;
            remoteActionCompatParcelizer.topMargin = this.d.aa;
            remoteActionCompatParcelizer.bottomMargin = this.d.e;
            remoteActionCompatParcelizer.v = this.d.p;
            remoteActionCompatParcelizer.t = this.d.r;
            remoteActionCompatParcelizer.w = this.d.x;
            remoteActionCompatParcelizer.q = this.d.t;
            remoteActionCompatParcelizer.C = this.d.D;
            remoteActionCompatParcelizer.ai = this.d.ad;
            remoteActionCompatParcelizer.d = this.d.i;
            remoteActionCompatParcelizer.h = this.d.g;
            remoteActionCompatParcelizer.c = this.d.d;
            remoteActionCompatParcelizer.j = this.d.j;
            remoteActionCompatParcelizer.m = this.d.l;
            remoteActionCompatParcelizer.k = this.d.f220o;
            remoteActionCompatParcelizer.an = this.d.ag;
            remoteActionCompatParcelizer.B = this.d.F;
            remoteActionCompatParcelizer.aj = this.d.ae;
            remoteActionCompatParcelizer.z = this.d.z;
            remoteActionCompatParcelizer.g = this.d.h;
            remoteActionCompatParcelizer.f = this.d.f;
            remoteActionCompatParcelizer.J = this.d.af;
            remoteActionCompatParcelizer.L = this.d.y;
            remoteActionCompatParcelizer.K = this.d.ah;
            remoteActionCompatParcelizer.M = this.d.A;
            remoteActionCompatParcelizer.P = this.d.al;
            remoteActionCompatParcelizer.Q = this.d.C;
            remoteActionCompatParcelizer.R = this.d.am;
            remoteActionCompatParcelizer.S = this.d.B;
            remoteActionCompatParcelizer.T = this.d.W;
            remoteActionCompatParcelizer.y = this.d.w;
            remoteActionCompatParcelizer.x = this.d.u;
            remoteActionCompatParcelizer.u = this.d.v;
            remoteActionCompatParcelizer.width = this.d.S;
            remoteActionCompatParcelizer.height = this.d.M;
            if (this.d.N != null) {
                remoteActionCompatParcelizer.i = this.d.N;
            }
            remoteActionCompatParcelizer.setMarginStart(this.d.T);
            remoteActionCompatParcelizer.setMarginEnd(this.d.n);
            remoteActionCompatParcelizer.a();
        }

        void c(int i, setMaxHeight.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
            this.b = i;
            this.d.H = remoteActionCompatParcelizer.F;
            this.d.G = remoteActionCompatParcelizer.N;
            this.d.V = remoteActionCompatParcelizer.ah;
            this.d.U = remoteActionCompatParcelizer.ag;
            this.d.ab = remoteActionCompatParcelizer.am;
            this.d.ac = remoteActionCompatParcelizer.ak;
            this.d.a = remoteActionCompatParcelizer.a;
            this.d.c = remoteActionCompatParcelizer.e;
            this.d.b = remoteActionCompatParcelizer.b;
            this.d.Z = remoteActionCompatParcelizer.af;
            this.d.Y = remoteActionCompatParcelizer.ae;
            this.d.m = remoteActionCompatParcelizer.p;
            this.d.k = remoteActionCompatParcelizer.f243o;
            this.d.D = remoteActionCompatParcelizer.C;
            this.d.ad = remoteActionCompatParcelizer.ai;
            this.d.j = remoteActionCompatParcelizer.j;
            this.d.i = remoteActionCompatParcelizer.d;
            this.d.g = remoteActionCompatParcelizer.h;
            this.d.d = remoteActionCompatParcelizer.c;
            this.d.l = remoteActionCompatParcelizer.m;
            this.d.f220o = remoteActionCompatParcelizer.k;
            this.d.W = remoteActionCompatParcelizer.T;
            this.d.w = remoteActionCompatParcelizer.y;
            this.d.u = remoteActionCompatParcelizer.x;
            this.d.v = remoteActionCompatParcelizer.u;
            this.d.S = remoteActionCompatParcelizer.width;
            this.d.M = remoteActionCompatParcelizer.height;
            this.d.E = remoteActionCompatParcelizer.leftMargin;
            this.d.X = remoteActionCompatParcelizer.rightMargin;
            this.d.aa = remoteActionCompatParcelizer.topMargin;
            this.d.e = remoteActionCompatParcelizer.bottomMargin;
            this.d.ag = remoteActionCompatParcelizer.an;
            this.d.F = remoteActionCompatParcelizer.B;
            this.d.ae = remoteActionCompatParcelizer.aj;
            this.d.z = remoteActionCompatParcelizer.z;
            this.d.h = remoteActionCompatParcelizer.g;
            this.d.f = remoteActionCompatParcelizer.f;
            this.d.af = remoteActionCompatParcelizer.J;
            this.d.y = remoteActionCompatParcelizer.L;
            this.d.ah = remoteActionCompatParcelizer.K;
            this.d.A = remoteActionCompatParcelizer.M;
            this.d.al = remoteActionCompatParcelizer.P;
            this.d.C = remoteActionCompatParcelizer.Q;
            this.d.am = remoteActionCompatParcelizer.R;
            this.d.B = remoteActionCompatParcelizer.S;
            this.d.N = remoteActionCompatParcelizer.i;
            this.d.x = remoteActionCompatParcelizer.w;
            this.d.t = remoteActionCompatParcelizer.q;
            this.d.s = remoteActionCompatParcelizer.r;
            this.d.q = remoteActionCompatParcelizer.s;
            this.d.p = remoteActionCompatParcelizer.v;
            this.d.r = remoteActionCompatParcelizer.t;
            this.d.n = remoteActionCompatParcelizer.getMarginEnd();
            this.d.T = remoteActionCompatParcelizer.getMarginStart();
        }

        public final /* synthetic */ Object clone() throws CloneNotSupportedException {
            IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer();
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = iconCompatParcelizer.d;
            RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = this.d;
            remoteActionCompatParcelizer.P = remoteActionCompatParcelizer2.P;
            remoteActionCompatParcelizer.S = remoteActionCompatParcelizer2.S;
            remoteActionCompatParcelizer.I = remoteActionCompatParcelizer2.I;
            remoteActionCompatParcelizer.M = remoteActionCompatParcelizer2.M;
            remoteActionCompatParcelizer.u = remoteActionCompatParcelizer2.u;
            remoteActionCompatParcelizer.v = remoteActionCompatParcelizer2.v;
            remoteActionCompatParcelizer.w = remoteActionCompatParcelizer2.w;
            remoteActionCompatParcelizer.H = remoteActionCompatParcelizer2.H;
            remoteActionCompatParcelizer.G = remoteActionCompatParcelizer2.G;
            remoteActionCompatParcelizer.V = remoteActionCompatParcelizer2.V;
            remoteActionCompatParcelizer.U = remoteActionCompatParcelizer2.U;
            remoteActionCompatParcelizer.ab = remoteActionCompatParcelizer2.ab;
            remoteActionCompatParcelizer.ac = remoteActionCompatParcelizer2.ac;
            remoteActionCompatParcelizer.a = remoteActionCompatParcelizer2.a;
            remoteActionCompatParcelizer.c = remoteActionCompatParcelizer2.c;
            remoteActionCompatParcelizer.b = remoteActionCompatParcelizer2.b;
            remoteActionCompatParcelizer.Z = remoteActionCompatParcelizer2.Z;
            remoteActionCompatParcelizer.Y = remoteActionCompatParcelizer2.Y;
            remoteActionCompatParcelizer.m = remoteActionCompatParcelizer2.m;
            remoteActionCompatParcelizer.k = remoteActionCompatParcelizer2.k;
            remoteActionCompatParcelizer.D = remoteActionCompatParcelizer2.D;
            remoteActionCompatParcelizer.ad = remoteActionCompatParcelizer2.ad;
            remoteActionCompatParcelizer.j = remoteActionCompatParcelizer2.j;
            remoteActionCompatParcelizer.i = remoteActionCompatParcelizer2.i;
            remoteActionCompatParcelizer.g = remoteActionCompatParcelizer2.g;
            remoteActionCompatParcelizer.d = remoteActionCompatParcelizer2.d;
            remoteActionCompatParcelizer.l = remoteActionCompatParcelizer2.l;
            remoteActionCompatParcelizer.f220o = remoteActionCompatParcelizer2.f220o;
            remoteActionCompatParcelizer.W = remoteActionCompatParcelizer2.W;
            remoteActionCompatParcelizer.E = remoteActionCompatParcelizer2.E;
            remoteActionCompatParcelizer.X = remoteActionCompatParcelizer2.X;
            remoteActionCompatParcelizer.aa = remoteActionCompatParcelizer2.aa;
            remoteActionCompatParcelizer.e = remoteActionCompatParcelizer2.e;
            remoteActionCompatParcelizer.n = remoteActionCompatParcelizer2.n;
            remoteActionCompatParcelizer.T = remoteActionCompatParcelizer2.T;
            remoteActionCompatParcelizer.s = remoteActionCompatParcelizer2.s;
            remoteActionCompatParcelizer.x = remoteActionCompatParcelizer2.x;
            remoteActionCompatParcelizer.q = remoteActionCompatParcelizer2.q;
            remoteActionCompatParcelizer.t = remoteActionCompatParcelizer2.t;
            remoteActionCompatParcelizer.r = remoteActionCompatParcelizer2.r;
            remoteActionCompatParcelizer.p = remoteActionCompatParcelizer2.p;
            remoteActionCompatParcelizer.ag = remoteActionCompatParcelizer2.ag;
            remoteActionCompatParcelizer.F = remoteActionCompatParcelizer2.F;
            remoteActionCompatParcelizer.z = remoteActionCompatParcelizer2.z;
            remoteActionCompatParcelizer.ae = remoteActionCompatParcelizer2.ae;
            remoteActionCompatParcelizer.af = remoteActionCompatParcelizer2.af;
            remoteActionCompatParcelizer.y = remoteActionCompatParcelizer2.y;
            remoteActionCompatParcelizer.ah = remoteActionCompatParcelizer2.ah;
            remoteActionCompatParcelizer.A = remoteActionCompatParcelizer2.A;
            remoteActionCompatParcelizer.al = remoteActionCompatParcelizer2.al;
            remoteActionCompatParcelizer.C = remoteActionCompatParcelizer2.C;
            remoteActionCompatParcelizer.am = remoteActionCompatParcelizer2.am;
            remoteActionCompatParcelizer.B = remoteActionCompatParcelizer2.B;
            remoteActionCompatParcelizer.L = remoteActionCompatParcelizer2.L;
            remoteActionCompatParcelizer.K = remoteActionCompatParcelizer2.K;
            remoteActionCompatParcelizer.R = remoteActionCompatParcelizer2.R;
            remoteActionCompatParcelizer.N = remoteActionCompatParcelizer2.N;
            int[] iArr = remoteActionCompatParcelizer2.Q;
            if (iArr != null) {
                remoteActionCompatParcelizer.Q = Arrays.copyOf(iArr, iArr.length);
            } else {
                remoteActionCompatParcelizer.Q = null;
            }
            remoteActionCompatParcelizer.O = remoteActionCompatParcelizer2.O;
            remoteActionCompatParcelizer.h = remoteActionCompatParcelizer2.h;
            remoteActionCompatParcelizer.f = remoteActionCompatParcelizer2.f;
            remoteActionCompatParcelizer.J = remoteActionCompatParcelizer2.J;
            write write = iconCompatParcelizer.e;
            write write2 = this.e;
            write.e = write2.e;
            write.a = write2.a;
            write.j = write2.j;
            write.c = write2.c;
            write.d = write2.d;
            write.f = write2.f;
            write.b = write2.b;
            read read = iconCompatParcelizer.c;
            read read2 = this.c;
            read.a = read2.a;
            read.b = read2.b;
            read.d = read2.d;
            read.e = read2.e;
            read.c = read2.c;
            setDesignInformation$MediaBrowserCompat$CustomActionResultReceiver setdesigninformation_mediabrowsercompat_customactionresultreceiver = iconCompatParcelizer.f;
            setDesignInformation$MediaBrowserCompat$CustomActionResultReceiver setdesigninformation_mediabrowsercompat_customactionresultreceiver2 = this.f;
            setdesigninformation_mediabrowsercompat_customactionresultreceiver.a = setdesigninformation_mediabrowsercompat_customactionresultreceiver2.a;
            setdesigninformation_mediabrowsercompat_customactionresultreceiver.b = setdesigninformation_mediabrowsercompat_customactionresultreceiver2.b;
            setdesigninformation_mediabrowsercompat_customactionresultreceiver.e = setdesigninformation_mediabrowsercompat_customactionresultreceiver2.e;
            setdesigninformation_mediabrowsercompat_customactionresultreceiver.j = setdesigninformation_mediabrowsercompat_customactionresultreceiver2.j;
            setdesigninformation_mediabrowsercompat_customactionresultreceiver.i = setdesigninformation_mediabrowsercompat_customactionresultreceiver2.i;
            setdesigninformation_mediabrowsercompat_customactionresultreceiver.g = setdesigninformation_mediabrowsercompat_customactionresultreceiver2.g;
            setdesigninformation_mediabrowsercompat_customactionresultreceiver.f = setdesigninformation_mediabrowsercompat_customactionresultreceiver2.f;
            setdesigninformation_mediabrowsercompat_customactionresultreceiver.h = setdesigninformation_mediabrowsercompat_customactionresultreceiver2.h;
            setdesigninformation_mediabrowsercompat_customactionresultreceiver.k = setdesigninformation_mediabrowsercompat_customactionresultreceiver2.k;
            setdesigninformation_mediabrowsercompat_customactionresultreceiver.m = setdesigninformation_mediabrowsercompat_customactionresultreceiver2.m;
            setdesigninformation_mediabrowsercompat_customactionresultreceiver.l = setdesigninformation_mediabrowsercompat_customactionresultreceiver2.l;
            setdesigninformation_mediabrowsercompat_customactionresultreceiver.c = setdesigninformation_mediabrowsercompat_customactionresultreceiver2.c;
            setdesigninformation_mediabrowsercompat_customactionresultreceiver.d = setdesigninformation_mediabrowsercompat_customactionresultreceiver2.d;
            iconCompatParcelizer.b = this.b;
            return iconCompatParcelizer;
        }
    }

    /* loaded from: classes-dex2jar.jar:o/setDesignInformation$RemoteActionCompatParcelizer.class */
    public static final class RemoteActionCompatParcelizer {
        private static SparseIntArray aj;
        public int M;
        public String N;
        public String O;
        public int[] Q;
        public int S;
        public boolean P = false;
        public boolean I = false;
        public int u = -1;
        public int v = -1;
        public float w = -1.0f;
        public int H = -1;
        public int G = -1;
        public int V = -1;
        public int U = -1;
        public int ab = -1;
        public int ac = -1;
        public int a = -1;
        public int c = -1;
        public int b = -1;
        public int Z = -1;
        public int Y = -1;
        public int m = -1;
        public int k = -1;
        public float D = 0.5f;
        public float ad = 0.5f;
        public String j = null;
        public int i = -1;
        public int g = 0;
        public float d = 0.0f;
        public int l = -1;

        /* renamed from: o */
        public int f220o = -1;
        public int W = -1;
        public int E = -1;
        public int X = -1;
        public int aa = -1;
        public int e = -1;
        public int n = -1;
        public int T = -1;
        public int s = -1;
        public int x = -1;
        public int q = -1;
        public int t = -1;
        public int r = -1;
        public int p = -1;
        public float ag = -1.0f;
        public float F = -1.0f;
        public int z = 0;
        public int ae = 0;
        public int af = 0;
        public int y = 0;
        public int ah = -1;
        public int A = -1;
        public int al = -1;
        public int C = -1;
        public float am = 1.0f;
        public float B = 1.0f;
        public int L = -1;
        public int K = 0;
        public int R = -1;
        public boolean h = false;
        public boolean f = false;
        public boolean J = true;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            aj = sparseIntArray;
            sparseIntArray.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.dE, 24);
            aj.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.dG, 25);
            aj.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.dK, 28);
            aj.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.dH, 29);
            aj.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.dN, 35);
            aj.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.dM, 34);
            aj.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.dp, 4);
            aj.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.dq, 3);
            aj.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.dn, 1);
            aj.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.dS, 6);
            aj.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.dQ, 7);
            aj.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.dA, 17);
            aj.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.dz, 18);
            aj.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.dy, 19);
            aj.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.df, 26);
            aj.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.dJ, 31);
            aj.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.dO, 32);
            aj.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.dx, 10);
            aj.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.dv, 9);
            aj.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.dY, 13);
            aj.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.ed, 16);
            aj.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.dZ, 14);
            aj.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.dW, 11);
            aj.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.dV, 15);
            aj.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.dX, 12);
            aj.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.dU, 38);
            aj.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.dF, 37);
            aj.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.dB, 39);
            aj.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.dT, 40);
            aj.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.dD, 20);
            aj.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.dL, 36);
            aj.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.ds, 5);
            aj.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.dC, 76);
            aj.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.dP, 76);
            aj.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.dI, 76);
            aj.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.f1do, 76);
            aj.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.dm, 76);
            aj.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cX, 23);
            aj.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.dc, 27);
            aj.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.dd, 30);
            aj.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cY, 8);
            aj.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.dg, 33);
            aj.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.db, 2);
            aj.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.de, 22);
            aj.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cZ, 21);
            aj.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.dr, 61);
            aj.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.dt, 62);
            aj.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.du, 63);
            aj.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.dR, 69);
            aj.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.dw, 70);
            aj.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.dl, 71);
            aj.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.dh, 72);
            aj.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.dj, 73);
            aj.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.di, 74);
            aj.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.dk, 75);
        }

        public final void c(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.da);
            this.I = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                int i2 = aj.get(index);
                if (i2 == 80) {
                    this.h = obtainStyledAttributes.getBoolean(index, this.h);
                } else if (i2 != 81) {
                    switch (i2) {
                        case 1:
                            this.b = setDesignInformation.e(obtainStyledAttributes, index, this.b);
                            continue;
                        case 2:
                            this.e = obtainStyledAttributes.getDimensionPixelSize(index, this.e);
                            continue;
                        case 3:
                            this.c = setDesignInformation.e(obtainStyledAttributes, index, this.c);
                            continue;
                        case 4:
                            this.a = setDesignInformation.e(obtainStyledAttributes, index, this.a);
                            continue;
                        case 5:
                            this.j = obtainStyledAttributes.getString(index);
                            continue;
                        case 6:
                            this.l = obtainStyledAttributes.getDimensionPixelOffset(index, this.l);
                            continue;
                        case 7:
                            this.f220o = obtainStyledAttributes.getDimensionPixelOffset(index, this.f220o);
                            continue;
                        case 8:
                            this.n = obtainStyledAttributes.getDimensionPixelSize(index, this.n);
                            continue;
                        case 9:
                            this.k = setDesignInformation.e(obtainStyledAttributes, index, this.k);
                            continue;
                        case 10:
                            this.m = setDesignInformation.e(obtainStyledAttributes, index, this.m);
                            continue;
                        case 11:
                            this.t = obtainStyledAttributes.getDimensionPixelSize(index, this.t);
                            continue;
                        case 12:
                            this.r = obtainStyledAttributes.getDimensionPixelSize(index, this.r);
                            continue;
                        case 13:
                            this.s = obtainStyledAttributes.getDimensionPixelSize(index, this.s);
                            continue;
                        case 14:
                            this.q = obtainStyledAttributes.getDimensionPixelSize(index, this.q);
                            continue;
                        case 15:
                            this.p = obtainStyledAttributes.getDimensionPixelSize(index, this.p);
                            continue;
                        case 16:
                            this.x = obtainStyledAttributes.getDimensionPixelSize(index, this.x);
                            continue;
                        case 17:
                            this.u = obtainStyledAttributes.getDimensionPixelOffset(index, this.u);
                            continue;
                        case 18:
                            this.v = obtainStyledAttributes.getDimensionPixelOffset(index, this.v);
                            continue;
                        case 19:
                            this.w = obtainStyledAttributes.getFloat(index, this.w);
                            continue;
                        case 20:
                            this.D = obtainStyledAttributes.getFloat(index, this.D);
                            continue;
                        case 21:
                            this.M = obtainStyledAttributes.getLayoutDimension(index, this.M);
                            continue;
                        case 22:
                            this.S = obtainStyledAttributes.getLayoutDimension(index, this.S);
                            continue;
                        case 23:
                            this.E = obtainStyledAttributes.getDimensionPixelSize(index, this.E);
                            continue;
                        case 24:
                            this.H = setDesignInformation.e(obtainStyledAttributes, index, this.H);
                            continue;
                        case 25:
                            this.G = setDesignInformation.e(obtainStyledAttributes, index, this.G);
                            continue;
                        case 26:
                            this.W = obtainStyledAttributes.getInt(index, this.W);
                            continue;
                        case 27:
                            this.X = obtainStyledAttributes.getDimensionPixelSize(index, this.X);
                            continue;
                        case 28:
                            this.V = setDesignInformation.e(obtainStyledAttributes, index, this.V);
                            continue;
                        case 29:
                            this.U = setDesignInformation.e(obtainStyledAttributes, index, this.U);
                            continue;
                        case 30:
                            this.T = obtainStyledAttributes.getDimensionPixelSize(index, this.T);
                            continue;
                        case setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.bv:
                            this.Z = setDesignInformation.e(obtainStyledAttributes, index, this.Z);
                            continue;
                        case 32:
                            this.Y = setDesignInformation.e(obtainStyledAttributes, index, this.Y);
                            continue;
                        case Framer.ENTER_FRAME_PREFIX:
                            this.aa = obtainStyledAttributes.getDimensionPixelSize(index, this.aa);
                            continue;
                        case 34:
                            this.ac = setDesignInformation.e(obtainStyledAttributes, index, this.ac);
                            continue;
                        case setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.dD:
                            this.ab = setDesignInformation.e(obtainStyledAttributes, index, this.ab);
                            continue;
                        case setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.dB:
                            this.ad = obtainStyledAttributes.getFloat(index, this.ad);
                            continue;
                        case setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.dF:
                            this.F = obtainStyledAttributes.getFloat(index, this.F);
                            continue;
                        case setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.dC:
                            this.ag = obtainStyledAttributes.getFloat(index, this.ag);
                            continue;
                        case 39:
                            this.z = obtainStyledAttributes.getInt(index, this.z);
                            continue;
                        case 40:
                            this.ae = obtainStyledAttributes.getInt(index, this.ae);
                            continue;
                        default:
                            switch (i2) {
                                case 54:
                                    this.af = obtainStyledAttributes.getInt(index, this.af);
                                    continue;
                                case 55:
                                    this.y = obtainStyledAttributes.getInt(index, this.y);
                                    continue;
                                case 56:
                                    this.ah = obtainStyledAttributes.getDimensionPixelSize(index, this.ah);
                                    continue;
                                case 57:
                                    this.A = obtainStyledAttributes.getDimensionPixelSize(index, this.A);
                                    continue;
                                case 58:
                                    this.al = obtainStyledAttributes.getDimensionPixelSize(index, this.al);
                                    continue;
                                case 59:
                                    this.C = obtainStyledAttributes.getDimensionPixelSize(index, this.C);
                                    continue;
                                default:
                                    switch (i2) {
                                        case 61:
                                            this.i = setDesignInformation.e(obtainStyledAttributes, index, this.i);
                                            continue;
                                        case 62:
                                            this.g = obtainStyledAttributes.getDimensionPixelSize(index, this.g);
                                            continue;
                                        case 63:
                                            this.d = obtainStyledAttributes.getFloat(index, this.d);
                                            continue;
                                        default:
                                            switch (i2) {
                                                case 69:
                                                    this.am = obtainStyledAttributes.getFloat(index, 1.0f);
                                                    continue;
                                                case 70:
                                                    this.B = obtainStyledAttributes.getFloat(index, 1.0f);
                                                    continue;
                                                case 71:
                                                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                                    continue;
                                                case 72:
                                                    this.L = obtainStyledAttributes.getInt(index, this.L);
                                                    continue;
                                                case 73:
                                                    this.K = obtainStyledAttributes.getDimensionPixelSize(index, this.K);
                                                    continue;
                                                case 74:
                                                    this.O = obtainStyledAttributes.getString(index);
                                                    continue;
                                                case 75:
                                                    this.J = obtainStyledAttributes.getBoolean(index, this.J);
                                                    continue;
                                                case 76:
                                                    StringBuilder sb = new StringBuilder("unused attribute 0x");
                                                    sb.append(Integer.toHexString(index));
                                                    sb.append("   ");
                                                    sb.append(aj.get(index));
                                                    Log.w("ConstraintSet", sb.toString());
                                                    continue;
                                                case 77:
                                                    this.N = obtainStyledAttributes.getString(index);
                                                    continue;
                                                default:
                                                    StringBuilder sb2 = new StringBuilder("Unknown attribute 0x");
                                                    sb2.append(Integer.toHexString(index));
                                                    sb2.append("   ");
                                                    sb2.append(aj.get(index));
                                                    Log.w("ConstraintSet", sb2.toString());
                                                    continue;
                                                    continue;
                                                    continue;
                                                    continue;
                                            }
                                    }
                            }
                    }
                } else {
                    this.f = obtainStyledAttributes.getBoolean(index, this.f);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* loaded from: classes-dex2jar.jar:o/setDesignInformation$read.class */
    public static final class read {
        public boolean a = false;
        public int b = 0;
        public int c = 0;
        public float d = 1.0f;
        public float e = Float.NaN;

        public final void e(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.ey);
            this.a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.eu) {
                    this.d = obtainStyledAttributes.getFloat(index, this.d);
                } else if (index == setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.eD) {
                    this.b = obtainStyledAttributes.getInt(index, this.b);
                    this.b = setDesignInformation.d[this.b];
                } else if (index == setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.eA) {
                    this.c = obtainStyledAttributes.getInt(index, this.c);
                } else if (index == setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.eB) {
                    this.e = obtainStyledAttributes.getFloat(index, this.e);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* loaded from: classes-dex2jar.jar:o/setDesignInformation$write.class */
    public static final class write {
        private static SparseIntArray i;
        public boolean e = false;
        public int a = -1;
        public String j = null;
        public int c = -1;
        public int d = 0;
        public float b = Float.NaN;
        public float f = Float.NaN;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            i = sparseIntArray;
            sparseIntArray.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.es, 1);
            i.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.er, 2);
            i.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.eq, 3);
            i.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.el, 4);
            i.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.en, 5);
            i.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.ep, 6);
        }

        public final void c(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.eg);
            this.e = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                switch (i.get(index)) {
                    case 1:
                        this.f = obtainStyledAttributes.getFloat(index, this.f);
                        break;
                    case 2:
                        this.c = obtainStyledAttributes.getInt(index, this.c);
                        break;
                    case 3:
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            this.j = obtainStyledAttributes.getString(index);
                            break;
                        } else {
                            this.j = setTrackResource.a[obtainStyledAttributes.getInteger(index, 0)];
                            break;
                        }
                    case 4:
                        this.d = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.a = setDesignInformation.e(obtainStyledAttributes, index, this.a);
                        break;
                    case 6:
                        this.b = obtainStyledAttributes.getFloat(index, this.b);
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        b = sparseIntArray;
        sparseIntArray.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.bV, 25);
        b.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.bX, 26);
        b.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.ca, 29);
        b.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cc, 30);
        b.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cf, 36);
        b.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.ci, 35);
        b.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.bD, 4);
        b.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.bA, 3);
        b.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.bB, 1);
        b.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cp, 6);
        b.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.co, 7);
        b.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.bL, 17);
        b.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.bN, 18);
        b.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.bM, 19);
        b.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.be, 27);
        b.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cb, 32);
        b.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cd, 33);
        b.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.bK, 10);
        b.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.bF, 9);
        b.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cr, 13);
        b.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cw, 16);
        b.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cv, 14);
        b.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cs, 11);
        b.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cx, 15);
        b.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cq, 12);
        b.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cl, 40);
        b.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.bY, 39);
        b.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.bQ, 41);
        b.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.ch, 42);
        b.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.bR, 20);
        b.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cg, 37);
        b.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.bH, 5);
        b.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.bW, 82);
        b.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.ce, 82);
        b.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.bU, 82);
        b.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.bE, 82);
        b.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.bC, 82);
        b.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.ba, 24);
        b.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.bc, 28);
        b.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.bb, 31);
        b.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.aW, 8);
        b.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.bf, 34);
        b.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.aX, 2);
        b.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.bd, 23);
        b.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.aZ, 21);
        b.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.bq, 22);
        b.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.aR, 43);
        b.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.aS, 44);
        b.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.bi, 45);
        b.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.bj, 46);
        b.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.bk, 60);
        b.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.bg, 47);
        b.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.bh, 48);
        b.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.bm, 49);
        b.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.bl, 50);
        b.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.bn, 51);
        b.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.bo, 52);
        b.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.bp, 53);
        b.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cn, 54);
        b.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.bO, 55);
        b.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cj, 56);
        b.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.bT, 57);
        b.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.ck, 58);
        b.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.bS, 59);
        b.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.bJ, 61);
        b.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.bG, 62);
        b.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.bI, 63);
        b.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.bu, 64);
        b.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cz, 65);
        b.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.bw, 66);
        b.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cy, 67);
        b.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cu, 79);
        b.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.aY, 38);
        b.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.ct, 68);
        b.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cm, 69);
        b.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.bP, 70);
        b.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.bv, 71);
        b.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.br, 72);
        b.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.bs, 73);
        b.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.bx, 74);
        b.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.bt, 75);
        b.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cC, 76);
        b.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.bZ, 77);
        b.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cB, 78);
        b.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.by, 80);
        b.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.bz, 81);
    }

    public static void a(IconCompatParcelizer iconCompatParcelizer, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            if (!(index == setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.aY || setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.bb == index || setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.aW == index)) {
                iconCompatParcelizer.e.e = true;
                iconCompatParcelizer.d.I = true;
                iconCompatParcelizer.c.a = true;
                iconCompatParcelizer.f.a = true;
            }
            switch (b.get(index)) {
                case 1:
                    RemoteActionCompatParcelizer remoteActionCompatParcelizer = iconCompatParcelizer.d;
                    int resourceId = typedArray.getResourceId(index, iconCompatParcelizer.d.b);
                    int i2 = resourceId;
                    if (resourceId == -1) {
                        i2 = typedArray.getInt(index, -1);
                    }
                    remoteActionCompatParcelizer.b = i2;
                    break;
                case 2:
                    iconCompatParcelizer.d.e = typedArray.getDimensionPixelSize(index, iconCompatParcelizer.d.e);
                    break;
                case 3:
                    RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = iconCompatParcelizer.d;
                    int resourceId2 = typedArray.getResourceId(index, iconCompatParcelizer.d.c);
                    int i3 = resourceId2;
                    if (resourceId2 == -1) {
                        i3 = typedArray.getInt(index, -1);
                    }
                    remoteActionCompatParcelizer2.c = i3;
                    break;
                case 4:
                    RemoteActionCompatParcelizer remoteActionCompatParcelizer3 = iconCompatParcelizer.d;
                    int resourceId3 = typedArray.getResourceId(index, iconCompatParcelizer.d.a);
                    int i4 = resourceId3;
                    if (resourceId3 == -1) {
                        i4 = typedArray.getInt(index, -1);
                    }
                    remoteActionCompatParcelizer3.a = i4;
                    break;
                case 5:
                    iconCompatParcelizer.d.j = typedArray.getString(index);
                    break;
                case 6:
                    iconCompatParcelizer.d.l = typedArray.getDimensionPixelOffset(index, iconCompatParcelizer.d.l);
                    break;
                case 7:
                    iconCompatParcelizer.d.f220o = typedArray.getDimensionPixelOffset(index, iconCompatParcelizer.d.f220o);
                    break;
                case 8:
                    iconCompatParcelizer.d.n = typedArray.getDimensionPixelSize(index, iconCompatParcelizer.d.n);
                    break;
                case 9:
                    RemoteActionCompatParcelizer remoteActionCompatParcelizer4 = iconCompatParcelizer.d;
                    int resourceId4 = typedArray.getResourceId(index, iconCompatParcelizer.d.k);
                    int i5 = resourceId4;
                    if (resourceId4 == -1) {
                        i5 = typedArray.getInt(index, -1);
                    }
                    remoteActionCompatParcelizer4.k = i5;
                    break;
                case 10:
                    RemoteActionCompatParcelizer remoteActionCompatParcelizer5 = iconCompatParcelizer.d;
                    int resourceId5 = typedArray.getResourceId(index, iconCompatParcelizer.d.m);
                    int i6 = resourceId5;
                    if (resourceId5 == -1) {
                        i6 = typedArray.getInt(index, -1);
                    }
                    remoteActionCompatParcelizer5.m = i6;
                    break;
                case 11:
                    iconCompatParcelizer.d.t = typedArray.getDimensionPixelSize(index, iconCompatParcelizer.d.t);
                    break;
                case 12:
                    iconCompatParcelizer.d.r = typedArray.getDimensionPixelSize(index, iconCompatParcelizer.d.r);
                    break;
                case 13:
                    iconCompatParcelizer.d.s = typedArray.getDimensionPixelSize(index, iconCompatParcelizer.d.s);
                    break;
                case 14:
                    iconCompatParcelizer.d.q = typedArray.getDimensionPixelSize(index, iconCompatParcelizer.d.q);
                    break;
                case 15:
                    iconCompatParcelizer.d.p = typedArray.getDimensionPixelSize(index, iconCompatParcelizer.d.p);
                    break;
                case 16:
                    iconCompatParcelizer.d.x = typedArray.getDimensionPixelSize(index, iconCompatParcelizer.d.x);
                    break;
                case 17:
                    iconCompatParcelizer.d.u = typedArray.getDimensionPixelOffset(index, iconCompatParcelizer.d.u);
                    break;
                case 18:
                    iconCompatParcelizer.d.v = typedArray.getDimensionPixelOffset(index, iconCompatParcelizer.d.v);
                    break;
                case 19:
                    iconCompatParcelizer.d.w = typedArray.getFloat(index, iconCompatParcelizer.d.w);
                    break;
                case 20:
                    iconCompatParcelizer.d.D = typedArray.getFloat(index, iconCompatParcelizer.d.D);
                    break;
                case 21:
                    iconCompatParcelizer.d.M = typedArray.getLayoutDimension(index, iconCompatParcelizer.d.M);
                    break;
                case 22:
                    iconCompatParcelizer.c.b = typedArray.getInt(index, iconCompatParcelizer.c.b);
                    iconCompatParcelizer.c.b = d[iconCompatParcelizer.c.b];
                    break;
                case 23:
                    iconCompatParcelizer.d.S = typedArray.getLayoutDimension(index, iconCompatParcelizer.d.S);
                    break;
                case 24:
                    iconCompatParcelizer.d.E = typedArray.getDimensionPixelSize(index, iconCompatParcelizer.d.E);
                    break;
                case 25:
                    RemoteActionCompatParcelizer remoteActionCompatParcelizer6 = iconCompatParcelizer.d;
                    int resourceId6 = typedArray.getResourceId(index, iconCompatParcelizer.d.H);
                    int i7 = resourceId6;
                    if (resourceId6 == -1) {
                        i7 = typedArray.getInt(index, -1);
                    }
                    remoteActionCompatParcelizer6.H = i7;
                    break;
                case 26:
                    RemoteActionCompatParcelizer remoteActionCompatParcelizer7 = iconCompatParcelizer.d;
                    int resourceId7 = typedArray.getResourceId(index, iconCompatParcelizer.d.G);
                    int i8 = resourceId7;
                    if (resourceId7 == -1) {
                        i8 = typedArray.getInt(index, -1);
                    }
                    remoteActionCompatParcelizer7.G = i8;
                    break;
                case 27:
                    iconCompatParcelizer.d.W = typedArray.getInt(index, iconCompatParcelizer.d.W);
                    break;
                case 28:
                    iconCompatParcelizer.d.X = typedArray.getDimensionPixelSize(index, iconCompatParcelizer.d.X);
                    break;
                case 29:
                    RemoteActionCompatParcelizer remoteActionCompatParcelizer8 = iconCompatParcelizer.d;
                    int resourceId8 = typedArray.getResourceId(index, iconCompatParcelizer.d.V);
                    int i9 = resourceId8;
                    if (resourceId8 == -1) {
                        i9 = typedArray.getInt(index, -1);
                    }
                    remoteActionCompatParcelizer8.V = i9;
                    break;
                case 30:
                    RemoteActionCompatParcelizer remoteActionCompatParcelizer9 = iconCompatParcelizer.d;
                    int resourceId9 = typedArray.getResourceId(index, iconCompatParcelizer.d.U);
                    int i10 = resourceId9;
                    if (resourceId9 == -1) {
                        i10 = typedArray.getInt(index, -1);
                    }
                    remoteActionCompatParcelizer9.U = i10;
                    break;
                case setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.bv:
                    iconCompatParcelizer.d.T = typedArray.getDimensionPixelSize(index, iconCompatParcelizer.d.T);
                    break;
                case 32:
                    RemoteActionCompatParcelizer remoteActionCompatParcelizer10 = iconCompatParcelizer.d;
                    int resourceId10 = typedArray.getResourceId(index, iconCompatParcelizer.d.Z);
                    int i11 = resourceId10;
                    if (resourceId10 == -1) {
                        i11 = typedArray.getInt(index, -1);
                    }
                    remoteActionCompatParcelizer10.Z = i11;
                    break;
                case Framer.ENTER_FRAME_PREFIX:
                    RemoteActionCompatParcelizer remoteActionCompatParcelizer11 = iconCompatParcelizer.d;
                    int resourceId11 = typedArray.getResourceId(index, iconCompatParcelizer.d.Y);
                    int i12 = resourceId11;
                    if (resourceId11 == -1) {
                        i12 = typedArray.getInt(index, -1);
                    }
                    remoteActionCompatParcelizer11.Y = i12;
                    break;
                case 34:
                    iconCompatParcelizer.d.aa = typedArray.getDimensionPixelSize(index, iconCompatParcelizer.d.aa);
                    break;
                case setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.dD:
                    RemoteActionCompatParcelizer remoteActionCompatParcelizer12 = iconCompatParcelizer.d;
                    int resourceId12 = typedArray.getResourceId(index, iconCompatParcelizer.d.ac);
                    int i13 = resourceId12;
                    if (resourceId12 == -1) {
                        i13 = typedArray.getInt(index, -1);
                    }
                    remoteActionCompatParcelizer12.ac = i13;
                    break;
                case setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.dB:
                    RemoteActionCompatParcelizer remoteActionCompatParcelizer13 = iconCompatParcelizer.d;
                    int resourceId13 = typedArray.getResourceId(index, iconCompatParcelizer.d.ab);
                    int i14 = resourceId13;
                    if (resourceId13 == -1) {
                        i14 = typedArray.getInt(index, -1);
                    }
                    remoteActionCompatParcelizer13.ab = i14;
                    break;
                case setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.dF:
                    iconCompatParcelizer.d.ad = typedArray.getFloat(index, iconCompatParcelizer.d.ad);
                    break;
                case setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.dC:
                    iconCompatParcelizer.b = typedArray.getResourceId(index, iconCompatParcelizer.b);
                    break;
                case 39:
                    iconCompatParcelizer.d.F = typedArray.getFloat(index, iconCompatParcelizer.d.F);
                    break;
                case 40:
                    iconCompatParcelizer.d.ag = typedArray.getFloat(index, iconCompatParcelizer.d.ag);
                    break;
                case 41:
                    iconCompatParcelizer.d.z = typedArray.getInt(index, iconCompatParcelizer.d.z);
                    break;
                case 42:
                    iconCompatParcelizer.d.ae = typedArray.getInt(index, iconCompatParcelizer.d.ae);
                    break;
                case 43:
                    iconCompatParcelizer.c.d = typedArray.getFloat(index, iconCompatParcelizer.c.d);
                    break;
                case 44:
                    iconCompatParcelizer.f.c = true;
                    iconCompatParcelizer.f.d = typedArray.getDimension(index, iconCompatParcelizer.f.d);
                    break;
                case 45:
                    iconCompatParcelizer.f.e = typedArray.getFloat(index, iconCompatParcelizer.f.e);
                    break;
                case 46:
                    iconCompatParcelizer.f.j = typedArray.getFloat(index, iconCompatParcelizer.f.j);
                    break;
                case 47:
                    iconCompatParcelizer.f.i = typedArray.getFloat(index, iconCompatParcelizer.f.i);
                    break;
                case 48:
                    iconCompatParcelizer.f.g = typedArray.getFloat(index, iconCompatParcelizer.f.g);
                    break;
                case 49:
                    iconCompatParcelizer.f.f = typedArray.getDimension(index, iconCompatParcelizer.f.f);
                    break;
                case 50:
                    iconCompatParcelizer.f.h = typedArray.getDimension(index, iconCompatParcelizer.f.h);
                    break;
                case 51:
                    iconCompatParcelizer.f.k = typedArray.getDimension(index, iconCompatParcelizer.f.k);
                    break;
                case setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.S:
                    iconCompatParcelizer.f.m = typedArray.getDimension(index, iconCompatParcelizer.f.m);
                    break;
                case 53:
                    iconCompatParcelizer.f.l = typedArray.getDimension(index, iconCompatParcelizer.f.l);
                    break;
                case 54:
                    iconCompatParcelizer.d.af = typedArray.getInt(index, iconCompatParcelizer.d.af);
                    break;
                case 55:
                    iconCompatParcelizer.d.y = typedArray.getInt(index, iconCompatParcelizer.d.y);
                    break;
                case 56:
                    iconCompatParcelizer.d.ah = typedArray.getDimensionPixelSize(index, iconCompatParcelizer.d.ah);
                    break;
                case 57:
                    iconCompatParcelizer.d.A = typedArray.getDimensionPixelSize(index, iconCompatParcelizer.d.A);
                    break;
                case 58:
                    iconCompatParcelizer.d.al = typedArray.getDimensionPixelSize(index, iconCompatParcelizer.d.al);
                    break;
                case 59:
                    iconCompatParcelizer.d.C = typedArray.getDimensionPixelSize(index, iconCompatParcelizer.d.C);
                    break;
                case 60:
                    iconCompatParcelizer.f.b = typedArray.getFloat(index, iconCompatParcelizer.f.b);
                    break;
                case 61:
                    RemoteActionCompatParcelizer remoteActionCompatParcelizer14 = iconCompatParcelizer.d;
                    int resourceId14 = typedArray.getResourceId(index, iconCompatParcelizer.d.i);
                    int i15 = resourceId14;
                    if (resourceId14 == -1) {
                        i15 = typedArray.getInt(index, -1);
                    }
                    remoteActionCompatParcelizer14.i = i15;
                    break;
                case 62:
                    iconCompatParcelizer.d.g = typedArray.getDimensionPixelSize(index, iconCompatParcelizer.d.g);
                    break;
                case 63:
                    iconCompatParcelizer.d.d = typedArray.getFloat(index, iconCompatParcelizer.d.d);
                    break;
                case 64:
                    write write2 = iconCompatParcelizer.e;
                    int resourceId15 = typedArray.getResourceId(index, iconCompatParcelizer.e.a);
                    int i16 = resourceId15;
                    if (resourceId15 == -1) {
                        i16 = typedArray.getInt(index, -1);
                    }
                    write2.a = i16;
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        iconCompatParcelizer.e.j = typedArray.getString(index);
                        break;
                    } else {
                        iconCompatParcelizer.e.j = setTrackResource.a[typedArray.getInteger(index, 0)];
                        break;
                    }
                case 66:
                    iconCompatParcelizer.e.d = typedArray.getInt(index, 0);
                    break;
                case 67:
                    iconCompatParcelizer.e.f = typedArray.getFloat(index, iconCompatParcelizer.e.f);
                    break;
                case 68:
                    iconCompatParcelizer.c.e = typedArray.getFloat(index, iconCompatParcelizer.c.e);
                    break;
                case 69:
                    iconCompatParcelizer.d.am = typedArray.getFloat(index, 1.0f);
                    break;
                case 70:
                    iconCompatParcelizer.d.B = typedArray.getFloat(index, 1.0f);
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    iconCompatParcelizer.d.L = typedArray.getInt(index, iconCompatParcelizer.d.L);
                    break;
                case 73:
                    iconCompatParcelizer.d.K = typedArray.getDimensionPixelSize(index, iconCompatParcelizer.d.K);
                    break;
                case 74:
                    iconCompatParcelizer.d.O = typedArray.getString(index);
                    break;
                case 75:
                    iconCompatParcelizer.d.J = typedArray.getBoolean(index, iconCompatParcelizer.d.J);
                    break;
                case 76:
                    iconCompatParcelizer.e.c = typedArray.getInt(index, iconCompatParcelizer.e.c);
                    break;
                case 77:
                    iconCompatParcelizer.d.N = typedArray.getString(index);
                    break;
                case 78:
                    iconCompatParcelizer.c.c = typedArray.getInt(index, iconCompatParcelizer.c.c);
                    break;
                case 79:
                    iconCompatParcelizer.e.b = typedArray.getFloat(index, iconCompatParcelizer.e.b);
                    break;
                case 80:
                    iconCompatParcelizer.d.h = typedArray.getBoolean(index, iconCompatParcelizer.d.h);
                    break;
                case 81:
                    iconCompatParcelizer.d.f = typedArray.getBoolean(index, iconCompatParcelizer.d.f);
                    break;
                case 82:
                    StringBuilder sb = new StringBuilder("unused attribute 0x");
                    sb.append(Integer.toHexString(index));
                    sb.append("   ");
                    sb.append(b.get(index));
                    Log.w("ConstraintSet", sb.toString());
                    break;
                default:
                    StringBuilder sb2 = new StringBuilder("Unknown attribute 0x");
                    sb2.append(Integer.toHexString(index));
                    sb2.append("   ");
                    sb2.append(b.get(index));
                    Log.w("ConstraintSet", sb2.toString());
                    break;
            }
        }
    }

    private static int[] a(View view, String str) {
        int i;
        String[] split = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[split.length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < split.length) {
            String trim = split[i2].trim();
            try {
                i = setMinWidth.IconCompatParcelizer.class.getField(trim).getInt(null);
            } catch (Exception e) {
                i = 0;
            }
            int i4 = i;
            if (i == 0) {
                i4 = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            int i5 = i4;
            if (i4 == 0) {
                i5 = i4;
                if (view.isInEditMode()) {
                    i5 = i4;
                    if (view.getParent() instanceof setMaxHeight) {
                        Object c = ((setMaxHeight) view.getParent()).c(0, trim);
                        i5 = i4;
                        if (c != null) {
                            i5 = i4;
                            if (c instanceof Integer) {
                                i5 = ((Integer) c).intValue();
                            }
                        }
                    }
                }
            }
            iArr[i3] = i5;
            i2++;
            i3++;
        }
        int[] iArr2 = iArr;
        if (i3 != split.length) {
            iArr2 = Arrays.copyOf(iArr, i3);
        }
        return iArr2;
    }

    private static String b(int i) {
        switch (i) {
            case 1:
                return "left";
            case 2:
                return "right";
            case 3:
                return "top";
            case 4:
                return "bottom";
            case 5:
                return "baseline";
            case 6:
                return "start";
            case 7:
                return "end";
            default:
                return "undefined";
        }
    }

    static /* synthetic */ int e(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        int i3 = resourceId;
        if (resourceId == -1) {
            i3 = typedArray.getInt(i, -1);
        }
        return i3;
    }

    public IconCompatParcelizer a(int i) {
        if (!this.a.containsKey(Integer.valueOf(i))) {
            this.a.put(Integer.valueOf(i), new IconCompatParcelizer());
        }
        return this.a.get(Integer.valueOf(i));
    }

    public final void a(int i, int i2, int i3, int i4) {
        if (!this.a.containsKey(2131298372)) {
            this.a.put(2131298372, new IconCompatParcelizer());
        }
        IconCompatParcelizer iconCompatParcelizer = this.a.get(2131298372);
        switch (i2) {
            case 1:
                if (i4 == 1) {
                    iconCompatParcelizer.d.H = i3;
                    iconCompatParcelizer.d.G = -1;
                    return;
                } else if (i4 == 2) {
                    iconCompatParcelizer.d.G = i3;
                    iconCompatParcelizer.d.H = -1;
                    return;
                } else {
                    StringBuilder sb = new StringBuilder("left to ");
                    sb.append(b(i4));
                    sb.append(" undefined");
                    throw new IllegalArgumentException(sb.toString());
                }
            case 2:
                if (i4 == 1) {
                    iconCompatParcelizer.d.V = i3;
                    iconCompatParcelizer.d.U = -1;
                    return;
                } else if (i4 == 2) {
                    iconCompatParcelizer.d.U = i3;
                    iconCompatParcelizer.d.V = -1;
                    return;
                } else {
                    StringBuilder sb2 = new StringBuilder("right to ");
                    sb2.append(b(i4));
                    sb2.append(" undefined");
                    throw new IllegalArgumentException(sb2.toString());
                }
            case 3:
                if (i4 == 3) {
                    iconCompatParcelizer.d.ab = i3;
                    iconCompatParcelizer.d.ac = -1;
                    iconCompatParcelizer.d.b = -1;
                    return;
                } else if (i4 == 4) {
                    iconCompatParcelizer.d.ac = i3;
                    iconCompatParcelizer.d.ab = -1;
                    iconCompatParcelizer.d.b = -1;
                    return;
                } else {
                    StringBuilder sb3 = new StringBuilder("right to ");
                    sb3.append(b(i4));
                    sb3.append(" undefined");
                    throw new IllegalArgumentException(sb3.toString());
                }
            case 4:
                if (i4 == 4) {
                    iconCompatParcelizer.d.c = i3;
                    iconCompatParcelizer.d.a = -1;
                    iconCompatParcelizer.d.b = -1;
                    return;
                } else if (i4 == 3) {
                    iconCompatParcelizer.d.a = i3;
                    iconCompatParcelizer.d.c = -1;
                    iconCompatParcelizer.d.b = -1;
                    return;
                } else {
                    StringBuilder sb4 = new StringBuilder("right to ");
                    sb4.append(b(i4));
                    sb4.append(" undefined");
                    throw new IllegalArgumentException(sb4.toString());
                }
            case 5:
                if (i4 == 5) {
                    iconCompatParcelizer.d.b = i3;
                    iconCompatParcelizer.d.c = -1;
                    iconCompatParcelizer.d.a = -1;
                    iconCompatParcelizer.d.ab = -1;
                    iconCompatParcelizer.d.ac = -1;
                    return;
                }
                StringBuilder sb5 = new StringBuilder("right to ");
                sb5.append(b(i4));
                sb5.append(" undefined");
                throw new IllegalArgumentException(sb5.toString());
            case 6:
                if (i4 == 6) {
                    iconCompatParcelizer.d.Y = i3;
                    iconCompatParcelizer.d.Z = -1;
                    return;
                } else if (i4 == 7) {
                    iconCompatParcelizer.d.Z = i3;
                    iconCompatParcelizer.d.Y = -1;
                    return;
                } else {
                    StringBuilder sb6 = new StringBuilder("right to ");
                    sb6.append(b(i4));
                    sb6.append(" undefined");
                    throw new IllegalArgumentException(sb6.toString());
                }
            case 7:
                if (i4 == 7) {
                    iconCompatParcelizer.d.k = i3;
                    iconCompatParcelizer.d.m = -1;
                    return;
                } else if (i4 == 6) {
                    iconCompatParcelizer.d.m = i3;
                    iconCompatParcelizer.d.k = -1;
                    return;
                } else {
                    StringBuilder sb7 = new StringBuilder("right to ");
                    sb7.append(b(i4));
                    sb7.append(" undefined");
                    throw new IllegalArgumentException(sb7.toString());
                }
            default:
                StringBuilder sb8 = new StringBuilder();
                sb8.append(b(i2));
                sb8.append(" to ");
                sb8.append(b(i4));
                sb8.append(" unknown");
                throw new IllegalArgumentException(sb8.toString());
        }
    }

    public IconCompatParcelizer c(Context context, AttributeSet attributeSet) {
        IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.s);
        a(iconCompatParcelizer, obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        return iconCompatParcelizer;
    }

    public final void c(setMaxHeight setmaxheight) {
        int childCount = setmaxheight.getChildCount();
        this.a.clear();
        for (int i = 0; i < childCount; i++) {
            View childAt = setmaxheight.getChildAt(i);
            setMaxHeight.RemoteActionCompatParcelizer remoteActionCompatParcelizer = (setMaxHeight.RemoteActionCompatParcelizer) childAt.getLayoutParams();
            int id = childAt.getId();
            if (!this.c || id != -1) {
                if (!this.a.containsKey(Integer.valueOf(id))) {
                    this.a.put(Integer.valueOf(id), new IconCompatParcelizer());
                }
                IconCompatParcelizer iconCompatParcelizer = this.a.get(Integer.valueOf(id));
                iconCompatParcelizer.a = setType.e(this.e, childAt);
                iconCompatParcelizer.c(id, remoteActionCompatParcelizer);
                iconCompatParcelizer.c.b = childAt.getVisibility();
                iconCompatParcelizer.c.d = childAt.getAlpha();
                iconCompatParcelizer.f.b = childAt.getRotation();
                iconCompatParcelizer.f.e = childAt.getRotationX();
                iconCompatParcelizer.f.j = childAt.getRotationY();
                iconCompatParcelizer.f.i = childAt.getScaleX();
                iconCompatParcelizer.f.g = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (!(((double) pivotX) == 0.0d && ((double) pivotY) == 0.0d)) {
                    iconCompatParcelizer.f.f = pivotX;
                    iconCompatParcelizer.f.h = pivotY;
                }
                iconCompatParcelizer.f.k = childAt.getTranslationX();
                iconCompatParcelizer.f.m = childAt.getTranslationY();
                iconCompatParcelizer.f.l = childAt.getTranslationZ();
                if (iconCompatParcelizer.f.c) {
                    iconCompatParcelizer.f.d = childAt.getElevation();
                }
                if (childAt instanceof setTag) {
                    setTag settag = (setTag) childAt;
                    iconCompatParcelizer.d.J = settag.d.e;
                    iconCompatParcelizer.d.Q = settag.c();
                    iconCompatParcelizer.d.L = settag.b;
                    iconCompatParcelizer.d.K = settag.d.c;
                }
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }

    public final void d(int i, int i2, int i3, float f) {
        IconCompatParcelizer a = a(i);
        a.d.i = i2;
        a.d.g = i3;
        a.d.d = f;
    }

    public final void d(setMaxHeight setmaxheight) {
        d(setmaxheight, true);
        setmaxheight.setConstraintSet(null);
        setmaxheight.requestLayout();
    }

    public final void d(setMaxHeight setmaxheight, boolean z) {
        int childCount = setmaxheight.getChildCount();
        HashSet hashSet = new HashSet(this.a.keySet());
        for (int i = 0; i < childCount; i++) {
            View childAt = setmaxheight.getChildAt(i);
            int id = childAt.getId();
            if (!this.a.containsKey(Integer.valueOf(id))) {
                StringBuilder sb = new StringBuilder("id unknown ");
                sb.append(setTrackTintMode.d(childAt));
                Log.w("ConstraintSet", sb.toString());
            } else if (this.c && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            } else if (id != -1) {
                if (this.a.containsKey(Integer.valueOf(id))) {
                    hashSet.remove(Integer.valueOf(id));
                    IconCompatParcelizer iconCompatParcelizer = this.a.get(Integer.valueOf(id));
                    if (childAt instanceof setTag) {
                        iconCompatParcelizer.d.R = 1;
                    }
                    if (iconCompatParcelizer.d.R != -1 && iconCompatParcelizer.d.R == 1) {
                        setTag settag = (setTag) childAt;
                        settag.setId(id);
                        settag.setType(iconCompatParcelizer.d.L);
                        settag.setMargin(iconCompatParcelizer.d.K);
                        settag.setAllowsGoneWidget(iconCompatParcelizer.d.J);
                        if (iconCompatParcelizer.d.Q != null) {
                            settag.setReferencedIds(iconCompatParcelizer.d.Q);
                        } else if (iconCompatParcelizer.d.O != null) {
                            iconCompatParcelizer.d.Q = a(settag, iconCompatParcelizer.d.O);
                            settag.setReferencedIds(iconCompatParcelizer.d.Q);
                        }
                    }
                    setMaxHeight.RemoteActionCompatParcelizer remoteActionCompatParcelizer = (setMaxHeight.RemoteActionCompatParcelizer) childAt.getLayoutParams();
                    remoteActionCompatParcelizer.a();
                    iconCompatParcelizer.b(remoteActionCompatParcelizer);
                    setType.b(childAt, iconCompatParcelizer.a);
                    childAt.setLayoutParams(remoteActionCompatParcelizer);
                    if (iconCompatParcelizer.c.c == 0) {
                        childAt.setVisibility(iconCompatParcelizer.c.b);
                    }
                    childAt.setAlpha(iconCompatParcelizer.c.d);
                    childAt.setRotation(iconCompatParcelizer.f.b);
                    childAt.setRotationX(iconCompatParcelizer.f.e);
                    childAt.setRotationY(iconCompatParcelizer.f.j);
                    childAt.setScaleX(iconCompatParcelizer.f.i);
                    childAt.setScaleY(iconCompatParcelizer.f.g);
                    if (!Float.isNaN(iconCompatParcelizer.f.f)) {
                        childAt.setPivotX(iconCompatParcelizer.f.f);
                    }
                    if (!Float.isNaN(iconCompatParcelizer.f.h)) {
                        childAt.setPivotY(iconCompatParcelizer.f.h);
                    }
                    childAt.setTranslationX(iconCompatParcelizer.f.k);
                    childAt.setTranslationY(iconCompatParcelizer.f.m);
                    childAt.setTranslationZ(iconCompatParcelizer.f.l);
                    if (iconCompatParcelizer.f.c) {
                        childAt.setElevation(iconCompatParcelizer.f.d);
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder("WARNING NO CONSTRAINTS for view ");
                    sb2.append(id);
                    Log.v("ConstraintSet", sb2.toString());
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            IconCompatParcelizer iconCompatParcelizer2 = this.a.get(num);
            if (iconCompatParcelizer2.d.R != -1 && iconCompatParcelizer2.d.R == 1) {
                setTag settag2 = new setTag(setmaxheight.getContext());
                settag2.setId(num.intValue());
                if (iconCompatParcelizer2.d.Q != null) {
                    settag2.setReferencedIds(iconCompatParcelizer2.d.Q);
                } else if (iconCompatParcelizer2.d.O != null) {
                    iconCompatParcelizer2.d.Q = a(settag2, iconCompatParcelizer2.d.O);
                    settag2.setReferencedIds(iconCompatParcelizer2.d.Q);
                }
                settag2.setType(iconCompatParcelizer2.d.L);
                settag2.setMargin(iconCompatParcelizer2.d.K);
                setMaxHeight.RemoteActionCompatParcelizer e = setMaxHeight.e();
                settag2.a();
                iconCompatParcelizer2.b(e);
                setmaxheight.addView(settag2, e);
            }
            if (iconCompatParcelizer2.d.P) {
                View setoptimizationlevel = new setOptimizationLevel(setmaxheight.getContext());
                setoptimizationlevel.setId(num.intValue());
                setMaxHeight.RemoteActionCompatParcelizer e2 = setMaxHeight.e();
                iconCompatParcelizer2.b(e2);
                setmaxheight.addView(setoptimizationlevel, e2);
            }
        }
    }

    public final void e(Context context, int i) {
        c((setMaxHeight) LayoutInflater.from(context).inflate(i, (ViewGroup) null));
    }
}
