package o;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.stetho.dumpapp.Framer;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import o.setDesignInformation;
import o.setTitleMargin;
import o.setTitleMarginEnd;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes-dex2jar.jar:o/setMaxHeight.class */
public class setMaxHeight extends ViewGroup {
    private setOnConstraintsChanged k;
    SparseArray<View> b = new SparseArray<>();
    private ArrayList<setId> j = new ArrayList<>(4);
    protected setTitleMarginBottom f = new setTitleMarginBottom();
    private int s = 0;
    private int q = 0;
    private int r = Integer.MAX_VALUE;
    private int p = Integer.MAX_VALUE;
    protected boolean a = true;
    private int y = 257;
    private setDesignInformation m = null;
    protected setConstraintSet d = null;

    /* renamed from: o */
    private int f242o = -1;
    private HashMap<String, Integer> l = new HashMap<>();
    private int t = -1;
    private int n = -1;
    int h = -1;
    int e = -1;
    int i = 0;
    int c = 0;
    private SparseArray<setTitleMarginEnd> x = new SparseArray<>();
    setMaxHeight$MediaBrowserCompat$CustomActionResultReceiver g = new setMaxHeight$MediaBrowserCompat$CustomActionResultReceiver(this, this);
    private int u = 0;
    private int w = 0;

    /* renamed from: o.setMaxHeight$5 */
    /* loaded from: classes-dex2jar.jar:o/setMaxHeight$5.class */
    static final /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[setTitleMarginEnd.write.values().length];
            a = iArr;
            try {
                iArr[setTitleMarginEnd.write.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                a[setTitleMarginEnd.write.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                a[setTitleMarginEnd.write.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                a[setTitleMarginEnd.write.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
        }
    }

    /* loaded from: classes-dex2jar.jar:o/setMaxHeight$RemoteActionCompatParcelizer.class */
    public static class RemoteActionCompatParcelizer extends ViewGroup.MarginLayoutParams {
        boolean A;
        public float B;
        public float C;
        public boolean D;
        boolean E;
        public int F;
        boolean G;
        boolean H;
        boolean I;
        public int J;
        public int K;
        public int L;
        public int M;
        public int N;
        boolean O;
        public int P;
        public int Q;
        public float R;
        public float S;
        public int T;
        int U;
        int V;
        int W;
        int X;
        int Y;
        int Z;
        public int a;
        float aa;
        int ab;
        float ac;
        int ad;
        public int ae;
        public int af;
        public int ag;
        public int ah;
        public float ai;
        public int aj;
        public int ak;
        boolean al;
        public int am;
        public float an;
        setTitleMarginEnd ao;
        public int b;
        public float c;
        public int d;
        public int e;
        public boolean f;
        public boolean g;
        public int h;
        public String i;
        public String j;
        public int k;
        float l;
        public int m;
        int n;

        /* renamed from: o */
        public int f243o;
        public int p;
        public int q;
        public int r;
        public int s;
        public int t;
        public int u;
        public int v;
        public int w;
        public int x;
        public float y;
        public int z;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes-dex2jar.jar:o/setMaxHeight$RemoteActionCompatParcelizer$IconCompatParcelizer.class */
        public static final class IconCompatParcelizer {
            public static final SparseIntArray e;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                e = sparseIntArray;
                sparseIntArray.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.ah, 8);
                sparseIntArray.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.ad, 9);
                sparseIntArray.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.ae, 10);
                sparseIntArray.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.ag, 11);
                sparseIntArray.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.ar, 12);
                sparseIntArray.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.ak, 13);
                sparseIntArray.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.J, 14);
                sparseIntArray.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.N, 15);
                sparseIntArray.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.I, 16);
                sparseIntArray.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.M, 2);
                sparseIntArray.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.P, 3);
                sparseIntArray.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.L, 4);
                sparseIntArray.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.au, 49);
                sparseIntArray.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.as, 50);
                sparseIntArray.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.Q, 5);
                sparseIntArray.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.X, 6);
                sparseIntArray.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.W, 7);
                sparseIntArray.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.y, 1);
                sparseIntArray.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.am, 17);
                sparseIntArray.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.al, 18);
                sparseIntArray.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.S, 19);
                sparseIntArray.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.O, 20);
                sparseIntArray.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.ay, 21);
                sparseIntArray.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.aF, 22);
                sparseIntArray.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.aA, 23);
                sparseIntArray.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.az, 24);
                sparseIntArray.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.aB, 25);
                sparseIntArray.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.ax, 26);
                sparseIntArray.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.aa, 29);
                sparseIntArray.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.aq, 30);
                sparseIntArray.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.R, 44);
                sparseIntArray.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.ab, 45);
                sparseIntArray.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.an, 46);
                sparseIntArray.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.Y, 47);
                sparseIntArray.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.ap, 48);
                sparseIntArray.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.F, 27);
                sparseIntArray.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.H, 28);
                sparseIntArray.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.ao, 31);
                sparseIntArray.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.V, 32);
                sparseIntArray.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.aw, 33);
                sparseIntArray.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.av, 34);
                sparseIntArray.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.at, 35);
                sparseIntArray.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.T, 36);
                sparseIntArray.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.U, 37);
                sparseIntArray.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.ac, 38);
                sparseIntArray.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.Z, 39);
                sparseIntArray.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.aj, 40);
                sparseIntArray.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.af, 41);
                sparseIntArray.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.K, 42);
                sparseIntArray.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.G, 43);
                sparseIntArray.append(setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.ai, 51);
            }
        }

        public RemoteActionCompatParcelizer(int i, int i2) {
            super(i, i2);
            this.x = -1;
            this.u = -1;
            this.y = -1.0f;
            this.F = -1;
            this.N = -1;
            this.ah = -1;
            this.ag = -1;
            this.am = -1;
            this.ak = -1;
            this.a = -1;
            this.e = -1;
            this.b = -1;
            this.d = -1;
            this.h = 0;
            this.c = 0.0f;
            this.af = -1;
            this.ae = -1;
            this.p = -1;
            this.f243o = -1;
            this.r = -1;
            this.w = -1;
            this.s = -1;
            this.q = -1;
            this.v = -1;
            this.t = -1;
            this.C = 0.5f;
            this.ai = 0.5f;
            this.j = null;
            this.l = 0.0f;
            this.n = 1;
            this.B = -1.0f;
            this.an = -1.0f;
            this.z = 0;
            this.aj = 0;
            this.J = 0;
            this.L = 0;
            this.P = 0;
            this.Q = 0;
            this.K = 0;
            this.M = 0;
            this.R = 1.0f;
            this.S = 1.0f;
            this.m = -1;
            this.k = -1;
            this.T = -1;
            this.g = false;
            this.f = false;
            this.i = null;
            this.A = true;
            this.al = true;
            this.O = false;
            this.H = false;
            this.E = false;
            this.I = false;
            this.G = false;
            this.ab = -1;
            this.Y = -1;
            this.Z = -1;
            this.ad = -1;
            this.U = -1;
            this.W = -1;
            this.aa = 0.5f;
            this.ao = new setTitleMarginEnd();
            this.D = false;
        }

        public RemoteActionCompatParcelizer(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            int i;
            this.x = -1;
            this.u = -1;
            this.y = -1.0f;
            this.F = -1;
            this.N = -1;
            this.ah = -1;
            this.ag = -1;
            this.am = -1;
            this.ak = -1;
            this.a = -1;
            this.e = -1;
            this.b = -1;
            this.d = -1;
            this.h = 0;
            this.c = 0.0f;
            this.af = -1;
            this.ae = -1;
            this.p = -1;
            this.f243o = -1;
            this.r = -1;
            this.w = -1;
            this.s = -1;
            this.q = -1;
            this.v = -1;
            this.t = -1;
            this.C = 0.5f;
            this.ai = 0.5f;
            this.j = null;
            this.l = 0.0f;
            this.n = 1;
            this.B = -1.0f;
            this.an = -1.0f;
            this.z = 0;
            this.aj = 0;
            this.J = 0;
            this.L = 0;
            this.P = 0;
            this.Q = 0;
            this.K = 0;
            this.M = 0;
            this.R = 1.0f;
            this.S = 1.0f;
            this.m = -1;
            this.k = -1;
            this.T = -1;
            this.g = false;
            this.f = false;
            this.i = null;
            this.A = true;
            this.al = true;
            this.O = false;
            this.H = false;
            this.E = false;
            this.I = false;
            this.G = false;
            this.ab = -1;
            this.Y = -1;
            this.Z = -1;
            this.ad = -1;
            this.U = -1;
            this.W = -1;
            this.aa = 0.5f;
            this.ao = new setTitleMarginEnd();
            this.D = false;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.r);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                int i3 = IconCompatParcelizer.e.get(index);
                switch (i3) {
                    case 1:
                        this.T = obtainStyledAttributes.getInt(index, this.T);
                        break;
                    case 2:
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.d);
                        this.d = resourceId;
                        if (resourceId == -1) {
                            this.d = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        this.h = obtainStyledAttributes.getDimensionPixelSize(index, this.h);
                        break;
                    case 4:
                        float f = obtainStyledAttributes.getFloat(index, this.c) % 360.0f;
                        this.c = f;
                        if (f < 0.0f) {
                            this.c = (360.0f - f) % 360.0f;
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        this.x = obtainStyledAttributes.getDimensionPixelOffset(index, this.x);
                        break;
                    case 6:
                        this.u = obtainStyledAttributes.getDimensionPixelOffset(index, this.u);
                        break;
                    case 7:
                        this.y = obtainStyledAttributes.getFloat(index, this.y);
                        break;
                    case 8:
                        int resourceId2 = obtainStyledAttributes.getResourceId(index, this.F);
                        this.F = resourceId2;
                        if (resourceId2 == -1) {
                            this.F = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        int resourceId3 = obtainStyledAttributes.getResourceId(index, this.N);
                        this.N = resourceId3;
                        if (resourceId3 == -1) {
                            this.N = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        int resourceId4 = obtainStyledAttributes.getResourceId(index, this.ah);
                        this.ah = resourceId4;
                        if (resourceId4 == -1) {
                            this.ah = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        int resourceId5 = obtainStyledAttributes.getResourceId(index, this.ag);
                        this.ag = resourceId5;
                        if (resourceId5 == -1) {
                            this.ag = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        int resourceId6 = obtainStyledAttributes.getResourceId(index, this.am);
                        this.am = resourceId6;
                        if (resourceId6 == -1) {
                            this.am = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        int resourceId7 = obtainStyledAttributes.getResourceId(index, this.ak);
                        this.ak = resourceId7;
                        if (resourceId7 == -1) {
                            this.ak = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        int resourceId8 = obtainStyledAttributes.getResourceId(index, this.a);
                        this.a = resourceId8;
                        if (resourceId8 == -1) {
                            this.a = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        int resourceId9 = obtainStyledAttributes.getResourceId(index, this.e);
                        this.e = resourceId9;
                        if (resourceId9 == -1) {
                            this.e = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        int resourceId10 = obtainStyledAttributes.getResourceId(index, this.b);
                        this.b = resourceId10;
                        if (resourceId10 == -1) {
                            this.b = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        int resourceId11 = obtainStyledAttributes.getResourceId(index, this.af);
                        this.af = resourceId11;
                        if (resourceId11 == -1) {
                            this.af = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        int resourceId12 = obtainStyledAttributes.getResourceId(index, this.ae);
                        this.ae = resourceId12;
                        if (resourceId12 == -1) {
                            this.ae = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 19:
                        int resourceId13 = obtainStyledAttributes.getResourceId(index, this.p);
                        this.p = resourceId13;
                        if (resourceId13 == -1) {
                            this.p = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 20:
                        int resourceId14 = obtainStyledAttributes.getResourceId(index, this.f243o);
                        this.f243o = resourceId14;
                        if (resourceId14 == -1) {
                            this.f243o = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 21:
                        this.r = obtainStyledAttributes.getDimensionPixelSize(index, this.r);
                        break;
                    case 22:
                        this.w = obtainStyledAttributes.getDimensionPixelSize(index, this.w);
                        break;
                    case 23:
                        this.s = obtainStyledAttributes.getDimensionPixelSize(index, this.s);
                        break;
                    case 24:
                        this.q = obtainStyledAttributes.getDimensionPixelSize(index, this.q);
                        break;
                    case 25:
                        this.v = obtainStyledAttributes.getDimensionPixelSize(index, this.v);
                        break;
                    case 26:
                        this.t = obtainStyledAttributes.getDimensionPixelSize(index, this.t);
                        break;
                    case 27:
                        this.g = obtainStyledAttributes.getBoolean(index, this.g);
                        break;
                    case 28:
                        this.f = obtainStyledAttributes.getBoolean(index, this.f);
                        break;
                    case 29:
                        this.C = obtainStyledAttributes.getFloat(index, this.C);
                        break;
                    case 30:
                        this.ai = obtainStyledAttributes.getFloat(index, this.ai);
                        break;
                    case setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.bv:
                        int i4 = obtainStyledAttributes.getInt(index, 0);
                        this.J = i4;
                        if (i4 == 1) {
                            Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                            break;
                        } else {
                            break;
                        }
                    case 32:
                        int i5 = obtainStyledAttributes.getInt(index, 0);
                        this.L = i5;
                        if (i5 == 1) {
                            Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                            break;
                        } else {
                            break;
                        }
                    case Framer.ENTER_FRAME_PREFIX:
                        try {
                            this.P = obtainStyledAttributes.getDimensionPixelSize(index, this.P);
                            break;
                        } catch (Exception e) {
                            if (obtainStyledAttributes.getInt(index, this.P) == -2) {
                                this.P = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 34:
                        try {
                            this.K = obtainStyledAttributes.getDimensionPixelSize(index, this.K);
                            break;
                        } catch (Exception e2) {
                            if (obtainStyledAttributes.getInt(index, this.K) == -2) {
                                this.K = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.dD:
                        this.R = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.R));
                        this.J = 2;
                        break;
                    case setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.dB:
                        try {
                            this.Q = obtainStyledAttributes.getDimensionPixelSize(index, this.Q);
                            break;
                        } catch (Exception e3) {
                            if (obtainStyledAttributes.getInt(index, this.Q) == -2) {
                                this.Q = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.dF:
                        try {
                            this.M = obtainStyledAttributes.getDimensionPixelSize(index, this.M);
                            break;
                        } catch (Exception e4) {
                            if (obtainStyledAttributes.getInt(index, this.M) == -2) {
                                this.M = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.dC:
                        this.S = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.S));
                        this.L = 2;
                        break;
                    default:
                        switch (i3) {
                            case 44:
                                String string = obtainStyledAttributes.getString(index);
                                this.j = string;
                                this.l = Float.NaN;
                                this.n = -1;
                                if (string == null) {
                                    break;
                                } else {
                                    int length = string.length();
                                    int indexOf = this.j.indexOf(44);
                                    if (indexOf <= 0 || indexOf >= length - 1) {
                                        i = 0;
                                    } else {
                                        String substring = this.j.substring(0, indexOf);
                                        if (substring.equalsIgnoreCase("W")) {
                                            this.n = 0;
                                        } else if (substring.equalsIgnoreCase("H")) {
                                            this.n = 1;
                                        }
                                        i = indexOf + 1;
                                    }
                                    int indexOf2 = this.j.indexOf(58);
                                    if (indexOf2 >= 0 && indexOf2 < length - 1) {
                                        String substring2 = this.j.substring(i, indexOf2);
                                        String substring3 = this.j.substring(indexOf2 + 1);
                                        if (substring2.length() > 0 && substring3.length() > 0) {
                                            try {
                                                float parseFloat = Float.parseFloat(substring2);
                                                float parseFloat2 = Float.parseFloat(substring3);
                                                if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                                                    if (this.n == 1) {
                                                        this.l = Math.abs(parseFloat2 / parseFloat);
                                                        break;
                                                    } else {
                                                        this.l = Math.abs(parseFloat / parseFloat2);
                                                        break;
                                                    }
                                                }
                                            } catch (NumberFormatException e5) {
                                                break;
                                            }
                                        }
                                    } else {
                                        String substring4 = this.j.substring(i);
                                        if (substring4.length() <= 0) {
                                            break;
                                        } else {
                                            this.l = Float.parseFloat(substring4);
                                            continue;
                                        }
                                    }
                                }
                                break;
                            case 45:
                                this.B = obtainStyledAttributes.getFloat(index, this.B);
                                continue;
                            case 46:
                                this.an = obtainStyledAttributes.getFloat(index, this.an);
                                continue;
                            case 47:
                                this.z = obtainStyledAttributes.getInt(index, 0);
                                continue;
                            case 48:
                                this.aj = obtainStyledAttributes.getInt(index, 0);
                                continue;
                            case 49:
                                this.m = obtainStyledAttributes.getDimensionPixelOffset(index, this.m);
                                continue;
                            case 50:
                                this.k = obtainStyledAttributes.getDimensionPixelOffset(index, this.k);
                                continue;
                            case 51:
                                this.i = obtainStyledAttributes.getString(index);
                                continue;
                        }
                }
            }
            obtainStyledAttributes.recycle();
            a();
        }

        public RemoteActionCompatParcelizer(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.x = -1;
            this.u = -1;
            this.y = -1.0f;
            this.F = -1;
            this.N = -1;
            this.ah = -1;
            this.ag = -1;
            this.am = -1;
            this.ak = -1;
            this.a = -1;
            this.e = -1;
            this.b = -1;
            this.d = -1;
            this.h = 0;
            this.c = 0.0f;
            this.af = -1;
            this.ae = -1;
            this.p = -1;
            this.f243o = -1;
            this.r = -1;
            this.w = -1;
            this.s = -1;
            this.q = -1;
            this.v = -1;
            this.t = -1;
            this.C = 0.5f;
            this.ai = 0.5f;
            this.j = null;
            this.l = 0.0f;
            this.n = 1;
            this.B = -1.0f;
            this.an = -1.0f;
            this.z = 0;
            this.aj = 0;
            this.J = 0;
            this.L = 0;
            this.P = 0;
            this.Q = 0;
            this.K = 0;
            this.M = 0;
            this.R = 1.0f;
            this.S = 1.0f;
            this.m = -1;
            this.k = -1;
            this.T = -1;
            this.g = false;
            this.f = false;
            this.i = null;
            this.A = true;
            this.al = true;
            this.O = false;
            this.H = false;
            this.E = false;
            this.I = false;
            this.G = false;
            this.ab = -1;
            this.Y = -1;
            this.Z = -1;
            this.ad = -1;
            this.U = -1;
            this.W = -1;
            this.aa = 0.5f;
            this.ao = new setTitleMarginEnd();
            this.D = false;
        }

        public final void a() {
            this.H = false;
            this.A = true;
            this.al = true;
            if (this.width == -2 && this.g) {
                this.A = false;
                if (this.J == 0) {
                    this.J = 1;
                }
            }
            if (this.height == -2 && this.f) {
                this.al = false;
                if (this.L == 0) {
                    this.L = 1;
                }
            }
            if (this.width == 0 || this.width == -1) {
                this.A = false;
                if (this.width == 0 && this.J == 1) {
                    this.width = -2;
                    this.g = true;
                }
            }
            if (this.height == 0 || this.height == -1) {
                this.al = false;
                if (this.height == 0 && this.L == 1) {
                    this.height = -2;
                    this.f = true;
                }
            }
            if (this.y != -1.0f || this.x != -1 || this.u != -1) {
                this.H = true;
                this.A = true;
                this.al = true;
                if (!(this.ao instanceof setInflatedId)) {
                    this.ao = new setInflatedId();
                }
                ((setInflatedId) this.ao).s(this.T);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x00b0  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x00c4  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00d8  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00ea  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00f4  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0113  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0128  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        /* Code decompiled incorrectly, please refer to instructions dump */
        public void resolveLayoutDirection(int r5) {
            /*
            // Method dump skipped, instructions count: 599
            */
            throw new UnsupportedOperationException("Method not decompiled: o.setMaxHeight.RemoteActionCompatParcelizer.resolveLayoutDirection(int):void");
        }
    }

    public setMaxHeight(Context context) {
        super(context);
        a(null, 0, 0);
    }

    public setMaxHeight(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(attributeSet, 0, 0);
    }

    public setMaxHeight(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(attributeSet, i, 0);
    }

    private void a(AttributeSet attributeSet, int i, int i2) {
        this.f.s = this;
        this.f.d(this.g);
        this.b.put(getId(), this);
        this.m = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.r, i, 0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = obtainStyledAttributes.getIndex(i3);
                if (index == setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.x) {
                    this.s = obtainStyledAttributes.getDimensionPixelOffset(index, this.s);
                } else if (index == setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.u) {
                    this.q = obtainStyledAttributes.getDimensionPixelOffset(index, this.q);
                } else if (index == setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.v) {
                    this.r = obtainStyledAttributes.getDimensionPixelOffset(index, this.r);
                } else if (index == setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.q) {
                    this.p = obtainStyledAttributes.getDimensionPixelOffset(index, this.p);
                } else if (index == setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.aG) {
                    this.y = obtainStyledAttributes.getInt(index, this.y);
                } else if (index == setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.E) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            this.d = new setConstraintSet(getContext(), this, resourceId);
                        } catch (Resources.NotFoundException e) {
                            this.d = null;
                        }
                    }
                } else if (index == setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.A) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        setDesignInformation setdesigninformation = new setDesignInformation();
                        this.m = setdesigninformation;
                        Context context = getContext();
                        XmlResourceParser xml = context.getResources().getXml(resourceId2);
                        try {
                            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                                if (eventType == 0) {
                                    xml.getName();
                                } else if (eventType == 2) {
                                    String name = xml.getName();
                                    AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                                    setDesignInformation.IconCompatParcelizer iconCompatParcelizer = new setDesignInformation.IconCompatParcelizer();
                                    TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(asAttributeSet, setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.s);
                                    setDesignInformation.a(iconCompatParcelizer, obtainStyledAttributes2);
                                    obtainStyledAttributes2.recycle();
                                    if (name.equalsIgnoreCase("Guideline")) {
                                        iconCompatParcelizer.d.P = true;
                                    }
                                    setdesigninformation.a.put(Integer.valueOf(iconCompatParcelizer.b), iconCompatParcelizer);
                                }
                            }
                        } catch (IOException e2) {
                            e2.printStackTrace();
                        } catch (XmlPullParserException e3) {
                            e3.printStackTrace();
                        }
                    } catch (Resources.NotFoundException e4) {
                        this.m = null;
                    }
                    this.f242o = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f.k(this.y);
    }

    private boolean a() {
        boolean z;
        setTitleMarginEnd settitlemarginend;
        setTitleMarginEnd settitlemarginend2;
        setTitleMarginEnd settitlemarginend3;
        setTitleMarginEnd settitlemarginend4;
        setTitleMarginEnd settitlemarginend5;
        int childCount = getChildCount();
        int i = 0;
        while (true) {
            if (i >= childCount) {
                z = false;
                break;
            } else if (getChildAt(i).isLayoutRequested()) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z) {
            boolean isInEditMode = isInEditMode();
            int childCount2 = getChildCount();
            for (int i2 = 0; i2 < childCount2; i2++) {
                View childAt = getChildAt(i2);
                setTitleMarginEnd settitlemarginend6 = childAt == this ? this.f : childAt == null ? null : ((RemoteActionCompatParcelizer) childAt.getLayoutParams()).ao;
                if (settitlemarginend6 != null) {
                    settitlemarginend6.u();
                }
            }
            if (isInEditMode) {
                for (int i3 = 0; i3 < childCount2; i3++) {
                    View childAt2 = getChildAt(i3);
                    try {
                        String resourceName = getResources().getResourceName(childAt2.getId());
                        setDesignInformation(0, resourceName, Integer.valueOf(childAt2.getId()));
                        int indexOf = resourceName.indexOf(47);
                        String str = resourceName;
                        if (indexOf != -1) {
                            str = resourceName.substring(indexOf + 1);
                        }
                        int id = childAt2.getId();
                        if (id == 0) {
                            settitlemarginend5 = this.f;
                        } else {
                            View view = this.b.get(id);
                            View view2 = view;
                            if (view == null) {
                                View findViewById = findViewById(id);
                                view2 = findViewById;
                                if (findViewById != null) {
                                    view2 = findViewById;
                                    if (findViewById != this) {
                                        view2 = findViewById;
                                        if (findViewById.getParent() == this) {
                                            onViewAdded(findViewById);
                                            view2 = findViewById;
                                        }
                                    }
                                }
                            }
                            settitlemarginend5 = view2 == this ? this.f : view2 == null ? null : ((RemoteActionCompatParcelizer) view2.getLayoutParams()).ao;
                        }
                        settitlemarginend5.u = str;
                    } catch (Resources.NotFoundException e) {
                    }
                }
            }
            if (this.f242o != -1) {
                for (int i4 = 0; i4 < childCount2; i4++) {
                    View childAt3 = getChildAt(i4);
                    if (childAt3.getId() == this.f242o && (childAt3 instanceof setMinHeight)) {
                        setMinHeight setminheight = (setMinHeight) childAt3;
                        if (setminheight.c == null) {
                            setminheight.c = new setDesignInformation();
                        }
                        setDesignInformation setdesigninformation = setminheight.c;
                        int childCount3 = setminheight.getChildCount();
                        setdesigninformation.a.clear();
                        for (int i5 = 0; i5 < childCount3; i5++) {
                            View childAt4 = setminheight.getChildAt(i5);
                            setMinHeight$MediaBrowserCompat$CustomActionResultReceiver setminheight_mediabrowsercompat_customactionresultreceiver = (setMinHeight$MediaBrowserCompat$CustomActionResultReceiver) childAt4.getLayoutParams();
                            int id2 = childAt4.getId();
                            if (!setdesigninformation.c || id2 != -1) {
                                if (!setdesigninformation.a.containsKey(Integer.valueOf(id2))) {
                                    setdesigninformation.a.put(Integer.valueOf(id2), new setDesignInformation.IconCompatParcelizer());
                                }
                                setDesignInformation.IconCompatParcelizer iconCompatParcelizer = setdesigninformation.a.get(Integer.valueOf(id2));
                                if (childAt4 instanceof setId) {
                                    setId setid = (setId) childAt4;
                                    iconCompatParcelizer.a(id2, setminheight_mediabrowsercompat_customactionresultreceiver);
                                    if (setid instanceof setTag) {
                                        iconCompatParcelizer.d.R = 1;
                                        setTag settag = (setTag) setid;
                                        iconCompatParcelizer.d.L = settag.b;
                                        iconCompatParcelizer.d.Q = settag.c();
                                        iconCompatParcelizer.d.K = settag.d.c;
                                    }
                                }
                                iconCompatParcelizer.a(id2, setminheight_mediabrowsercompat_customactionresultreceiver);
                            } else {
                                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                            }
                        }
                        this.m = setminheight.c;
                    }
                }
            }
            setDesignInformation setdesigninformation2 = this.m;
            if (setdesigninformation2 != null) {
                setdesigninformation2.d(this, true);
            }
            this.f.aY.clear();
            int size = this.j.size();
            if (size > 0) {
                for (int i6 = 0; i6 < size; i6++) {
                    this.j.get(i6).b(this);
                }
            }
            for (int i7 = 0; i7 < childCount2; i7++) {
                View childAt5 = getChildAt(i7);
                if (childAt5 instanceof setElevation) {
                    setElevation setelevation = (setElevation) childAt5;
                    if (setelevation.e == -1 && !setelevation.isInEditMode()) {
                        setelevation.setVisibility(setelevation.b);
                    }
                    View findViewById2 = findViewById(setelevation.e);
                    setelevation.a = findViewById2;
                    if (findViewById2 != null) {
                        ((RemoteActionCompatParcelizer) findViewById2.getLayoutParams()).I = true;
                        setelevation.a.setVisibility(0);
                        setelevation.setVisibility(0);
                    }
                }
            }
            this.x.clear();
            this.x.put(0, this.f);
            this.x.put(getId(), this.f);
            for (int i8 = 0; i8 < childCount2; i8++) {
                View childAt6 = getChildAt(i8);
                this.x.put(childAt6.getId(), childAt6 == this ? this.f : childAt6 == null ? null : ((RemoteActionCompatParcelizer) childAt6.getLayoutParams()).ao);
            }
            for (int i9 = 0; i9 < childCount2; i9++) {
                View childAt7 = getChildAt(i9);
                setTitleMarginEnd settitlemarginend7 = childAt7 == this ? this.f : childAt7 == null ? null : ((RemoteActionCompatParcelizer) childAt7.getLayoutParams()).ao;
                if (settitlemarginend7 != null) {
                    RemoteActionCompatParcelizer remoteActionCompatParcelizer = (RemoteActionCompatParcelizer) childAt7.getLayoutParams();
                    setTitleMarginBottom settitlemarginbottom = this.f;
                    settitlemarginbottom.aY.add(settitlemarginend7);
                    if (settitlemarginend7.ac != null) {
                        ((setContentPadding) settitlemarginend7.ac).aY.remove(settitlemarginend7);
                        settitlemarginend7.u();
                    }
                    settitlemarginend7.ac = settitlemarginbottom;
                    SparseArray<setTitleMarginEnd> sparseArray = this.x;
                    remoteActionCompatParcelizer.a();
                    remoteActionCompatParcelizer.D = false;
                    settitlemarginend7.ap = childAt7.getVisibility();
                    if (remoteActionCompatParcelizer.I) {
                        settitlemarginend7.h = true;
                        settitlemarginend7.ap = 8;
                    }
                    settitlemarginend7.s = childAt7;
                    if (childAt7 instanceof setId) {
                        ((setId) childAt7).b(settitlemarginend7, this.f.aD);
                    }
                    if (remoteActionCompatParcelizer.H) {
                        setInflatedId setinflatedid = (setInflatedId) settitlemarginend7;
                        int i10 = remoteActionCompatParcelizer.V;
                        int i11 = remoteActionCompatParcelizer.X;
                        float f = remoteActionCompatParcelizer.ac;
                        if (f != -1.0f) {
                            setinflatedid.e(f);
                        } else if (i10 != -1) {
                            setinflatedid.k(i10);
                        } else if (i11 != -1) {
                            setinflatedid.l(i11);
                        }
                    } else {
                        int i12 = remoteActionCompatParcelizer.ab;
                        int i13 = remoteActionCompatParcelizer.Y;
                        int i14 = remoteActionCompatParcelizer.Z;
                        int i15 = remoteActionCompatParcelizer.ad;
                        int i16 = remoteActionCompatParcelizer.U;
                        int i17 = remoteActionCompatParcelizer.W;
                        float f2 = remoteActionCompatParcelizer.aa;
                        if (remoteActionCompatParcelizer.d != -1) {
                            setTitleMarginEnd settitlemarginend8 = sparseArray.get(remoteActionCompatParcelizer.d);
                            if (settitlemarginend8 != null) {
                                float f3 = remoteActionCompatParcelizer.c;
                                settitlemarginend7.b(setTitleMargin.write.CENTER).a(settitlemarginend8.b(setTitleMargin.write.CENTER), remoteActionCompatParcelizer.h, 0, true);
                                settitlemarginend7.p = f3;
                            }
                        } else {
                            if (i12 != -1) {
                                setTitleMarginEnd settitlemarginend9 = sparseArray.get(i12);
                                if (settitlemarginend9 != null) {
                                    settitlemarginend7.b(setTitleMargin.write.LEFT).a(settitlemarginend9.b(setTitleMargin.write.LEFT), remoteActionCompatParcelizer.leftMargin, i16, true);
                                }
                            } else if (!(i13 == -1 || (settitlemarginend4 = sparseArray.get(i13)) == null)) {
                                settitlemarginend7.b(setTitleMargin.write.LEFT).a(settitlemarginend4.b(setTitleMargin.write.RIGHT), remoteActionCompatParcelizer.leftMargin, i16, true);
                            }
                            if (i14 != -1) {
                                setTitleMarginEnd settitlemarginend10 = sparseArray.get(i14);
                                if (settitlemarginend10 != null) {
                                    settitlemarginend7.b(setTitleMargin.write.RIGHT).a(settitlemarginend10.b(setTitleMargin.write.LEFT), remoteActionCompatParcelizer.rightMargin, i17, true);
                                }
                            } else if (!(i15 == -1 || (settitlemarginend3 = sparseArray.get(i15)) == null)) {
                                settitlemarginend7.b(setTitleMargin.write.RIGHT).a(settitlemarginend3.b(setTitleMargin.write.RIGHT), remoteActionCompatParcelizer.rightMargin, i17, true);
                            }
                            if (remoteActionCompatParcelizer.am != -1) {
                                setTitleMarginEnd settitlemarginend11 = sparseArray.get(remoteActionCompatParcelizer.am);
                                if (settitlemarginend11 != null) {
                                    settitlemarginend7.b(setTitleMargin.write.TOP).a(settitlemarginend11.b(setTitleMargin.write.TOP), remoteActionCompatParcelizer.topMargin, remoteActionCompatParcelizer.w, true);
                                }
                            } else if (!(remoteActionCompatParcelizer.ak == -1 || (settitlemarginend2 = sparseArray.get(remoteActionCompatParcelizer.ak)) == null)) {
                                settitlemarginend7.b(setTitleMargin.write.TOP).a(settitlemarginend2.b(setTitleMargin.write.BOTTOM), remoteActionCompatParcelizer.topMargin, remoteActionCompatParcelizer.w, true);
                            }
                            if (remoteActionCompatParcelizer.a != -1) {
                                setTitleMarginEnd settitlemarginend12 = sparseArray.get(remoteActionCompatParcelizer.a);
                                if (settitlemarginend12 != null) {
                                    settitlemarginend7.b(setTitleMargin.write.BOTTOM).a(settitlemarginend12.b(setTitleMargin.write.TOP), remoteActionCompatParcelizer.bottomMargin, remoteActionCompatParcelizer.q, true);
                                }
                            } else if (!(remoteActionCompatParcelizer.e == -1 || (settitlemarginend = sparseArray.get(remoteActionCompatParcelizer.e)) == null)) {
                                settitlemarginend7.b(setTitleMargin.write.BOTTOM).a(settitlemarginend.b(setTitleMargin.write.BOTTOM), remoteActionCompatParcelizer.bottomMargin, remoteActionCompatParcelizer.q, true);
                            }
                            if (remoteActionCompatParcelizer.b != -1) {
                                View view3 = this.b.get(remoteActionCompatParcelizer.b);
                                setTitleMarginEnd settitlemarginend13 = sparseArray.get(remoteActionCompatParcelizer.b);
                                if (!(settitlemarginend13 == null || view3 == null || !(view3.getLayoutParams() instanceof RemoteActionCompatParcelizer))) {
                                    RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = (RemoteActionCompatParcelizer) view3.getLayoutParams();
                                    remoteActionCompatParcelizer.O = true;
                                    remoteActionCompatParcelizer2.O = true;
                                    settitlemarginend7.b(setTitleMargin.write.BASELINE).a(settitlemarginend13.b(setTitleMargin.write.BASELINE), 0, -1, true);
                                    settitlemarginend7.f = true;
                                    remoteActionCompatParcelizer2.ao.f = true;
                                    settitlemarginend7.b(setTitleMargin.write.TOP).c();
                                    settitlemarginend7.b(setTitleMargin.write.BOTTOM).c();
                                }
                            }
                            if (f2 >= 0.0f) {
                                settitlemarginend7.z = f2;
                            }
                            if (remoteActionCompatParcelizer.ai >= 0.0f) {
                                settitlemarginend7.ak = remoteActionCompatParcelizer.ai;
                            }
                        }
                        if (isInEditMode && !(remoteActionCompatParcelizer.m == -1 && remoteActionCompatParcelizer.k == -1)) {
                            settitlemarginend7.a(remoteActionCompatParcelizer.m, remoteActionCompatParcelizer.k);
                        }
                        if (remoteActionCompatParcelizer.A) {
                            settitlemarginend7.M[0] = setTitleMarginEnd.write.FIXED;
                            settitlemarginend7.n(remoteActionCompatParcelizer.width);
                            if (remoteActionCompatParcelizer.width == -2) {
                                settitlemarginend7.M[0] = setTitleMarginEnd.write.WRAP_CONTENT;
                            }
                        } else if (remoteActionCompatParcelizer.width == -1) {
                            if (remoteActionCompatParcelizer.g) {
                                settitlemarginend7.M[0] = setTitleMarginEnd.write.MATCH_CONSTRAINT;
                            } else {
                                settitlemarginend7.M[0] = setTitleMarginEnd.write.MATCH_PARENT;
                            }
                            settitlemarginend7.b(setTitleMargin.write.LEFT).c = remoteActionCompatParcelizer.leftMargin;
                            settitlemarginend7.b(setTitleMargin.write.RIGHT).c = remoteActionCompatParcelizer.rightMargin;
                        } else {
                            settitlemarginend7.M[0] = setTitleMarginEnd.write.MATCH_CONSTRAINT;
                            settitlemarginend7.n(0);
                        }
                        if (remoteActionCompatParcelizer.al) {
                            settitlemarginend7.M[1] = setTitleMarginEnd.write.FIXED;
                            settitlemarginend7.i(remoteActionCompatParcelizer.height);
                            if (remoteActionCompatParcelizer.height == -2) {
                                settitlemarginend7.M[1] = setTitleMarginEnd.write.WRAP_CONTENT;
                            }
                        } else if (remoteActionCompatParcelizer.height == -1) {
                            if (remoteActionCompatParcelizer.f) {
                                settitlemarginend7.M[1] = setTitleMarginEnd.write.MATCH_CONSTRAINT;
                            } else {
                                settitlemarginend7.M[1] = setTitleMarginEnd.write.MATCH_PARENT;
                            }
                            settitlemarginend7.b(setTitleMargin.write.TOP).c = remoteActionCompatParcelizer.topMargin;
                            settitlemarginend7.b(setTitleMargin.write.BOTTOM).c = remoteActionCompatParcelizer.bottomMargin;
                        } else {
                            settitlemarginend7.M[1] = setTitleMarginEnd.write.MATCH_CONSTRAINT;
                            settitlemarginend7.i(0);
                        }
                        settitlemarginend7.d(remoteActionCompatParcelizer.j);
                        settitlemarginend7.ar[0] = remoteActionCompatParcelizer.B;
                        settitlemarginend7.ar[1] = remoteActionCompatParcelizer.an;
                        settitlemarginend7.B = remoteActionCompatParcelizer.z;
                        settitlemarginend7.aj = remoteActionCompatParcelizer.aj;
                        int i18 = remoteActionCompatParcelizer.J;
                        int i19 = remoteActionCompatParcelizer.P;
                        int i20 = remoteActionCompatParcelizer.K;
                        float f4 = remoteActionCompatParcelizer.R;
                        settitlemarginend7.N = i18;
                        settitlemarginend7.S = i19;
                        int i21 = i20;
                        if (i20 == Integer.MAX_VALUE) {
                            i21 = 0;
                        }
                        settitlemarginend7.Q = i21;
                        settitlemarginend7.U = f4;
                        if (f4 > 0.0f && f4 < 1.0f && i18 == 0) {
                            settitlemarginend7.N = 2;
                        }
                        int i22 = remoteActionCompatParcelizer.L;
                        int i23 = remoteActionCompatParcelizer.Q;
                        int i24 = remoteActionCompatParcelizer.M;
                        float f5 = remoteActionCompatParcelizer.S;
                        settitlemarginend7.L = i22;
                        settitlemarginend7.O = i23;
                        int i25 = i24;
                        if (i24 == Integer.MAX_VALUE) {
                            i25 = 0;
                        }
                        settitlemarginend7.R = i25;
                        settitlemarginend7.P = f5;
                        if (f5 > 0.0f && f5 < 1.0f && i22 == 0) {
                            settitlemarginend7.L = 2;
                        }
                    }
                }
            }
        }
        return z;
    }

    private void c() {
        this.a = true;
        this.t = -1;
        this.n = -1;
        this.h = -1;
        this.e = -1;
        this.i = 0;
        this.c = 0;
    }

    private void c(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        int i5 = this.g.d;
        int resolveSizeAndState = resolveSizeAndState(i3 + this.g.h, i, 0);
        int resolveSizeAndState2 = resolveSizeAndState(i4 + i5, i2, 0);
        int min = Math.min(this.r, resolveSizeAndState & 16777215);
        int min2 = Math.min(this.p, resolveSizeAndState2 & 16777215);
        int i6 = min;
        if (z) {
            i6 = min | 16777216;
        }
        int i7 = min2;
        if (z2) {
            i7 = min2 | 16777216;
        }
        setMeasuredDimension(i6, i7);
        this.t = i6;
        this.n = i7;
    }

    private boolean d() {
        boolean z = true;
        if (!((getContext().getApplicationInfo().flags & 4194304) != 0) || 1 != getLayoutDirection()) {
            z = false;
        }
        return z;
    }

    public static RemoteActionCompatParcelizer e() {
        return new RemoteActionCompatParcelizer(-2, -2);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        addView(view, i, layoutParams);
    }

    public final Object c(int i, Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap<String, Integer> hashMap = this.l;
        if (hashMap == null || !hashMap.containsKey(str)) {
            return null;
        }
        return this.l.get(str);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof RemoteActionCompatParcelizer;
    }

    public final setTitleMarginEnd d(View view) {
        if (view == this) {
            return this.f;
        }
        return view == null ? null : ((RemoteActionCompatParcelizer) view.getLayoutParams()).ao;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<setId> arrayList = this.j;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                this.j.get(i);
            }
        }
        dispatchDraw(canvas);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = (float) getWidth();
            float height = (float) getHeight();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (!(childAt.getVisibility() == 8 || (tag = childAt.getTag()) == null || !(tag instanceof String))) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int parseInt4 = Integer.parseInt(split[3]);
                        int i3 = (int) ((((float) parseInt) / 1080.0f) * width);
                        int i4 = (int) ((((float) parseInt2) / 1920.0f) * height);
                        int i5 = (int) ((((float) parseInt3) / 1080.0f) * width);
                        int i6 = (int) ((((float) parseInt4) / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f = (float) i3;
                        float f2 = (float) i4;
                        float f3 = (float) (i3 + i5);
                        canvas.drawLine(f, f2, f3, f2, paint);
                        float f4 = (float) (i4 + i6);
                        canvas.drawLine(f3, f2, f3, f4, paint);
                        canvas.drawLine(f3, f4, f, f4, paint);
                        canvas.drawLine(f, f4, f, f2, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f, f2, f3, f4, paint);
                        canvas.drawLine(f, f4, f3, f2, paint);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void forceLayout() {
        c();
        forceLayout();
    }

    @Override // android.view.ViewGroup
    protected /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new RemoteActionCompatParcelizer(-2, -2);
    }

    @Override // android.view.ViewGroup
    public /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new RemoteActionCompatParcelizer(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new RemoteActionCompatParcelizer(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View view;
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = (RemoteActionCompatParcelizer) childAt.getLayoutParams();
            setTitleMarginEnd settitlemarginend = remoteActionCompatParcelizer.ao;
            if ((childAt.getVisibility() != 8 || remoteActionCompatParcelizer.H || remoteActionCompatParcelizer.E || remoteActionCompatParcelizer.G || isInEditMode) && !remoteActionCompatParcelizer.I) {
                int p = settitlemarginend.p();
                int t = settitlemarginend.t();
                int i6 = (settitlemarginend.ap == 8 ? 0 : settitlemarginend.aw) + p;
                int i7 = (settitlemarginend.ap == 8 ? 0 : settitlemarginend.v) + t;
                childAt.layout(p, t, i6, i7);
                if ((childAt instanceof setElevation) && (view = ((setElevation) childAt).a) != null) {
                    view.setVisibility(0);
                    view.layout(p, t, i6, i7);
                }
            }
        }
        int size = this.j.size();
        if (size > 0) {
            for (int i8 = 0; i8 < size; i8++) {
                this.j.get(i8).e();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x03ac, code lost:
        if (r18 != (r0.ap == 8 ? 0 : r0.v)) goto L_0x03b5;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0481  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0358  */
    @Override // android.view.View
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void onMeasure(int r12, int r13) {
        /*
        // Method dump skipped, instructions count: 1185
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setMaxHeight.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        onViewAdded(view);
        Object obj = view == this ? this.f : view == null ? null : ((RemoteActionCompatParcelizer) view.getLayoutParams()).ao;
        if ((view instanceof setOptimizationLevel) && !(obj instanceof setInflatedId)) {
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = (RemoteActionCompatParcelizer) view.getLayoutParams();
            remoteActionCompatParcelizer.ao = new setInflatedId();
            remoteActionCompatParcelizer.H = true;
            ((setInflatedId) remoteActionCompatParcelizer.ao).s(remoteActionCompatParcelizer.T);
        }
        if (view instanceof setId) {
            setId setid = (setId) view;
            setid.a();
            ((RemoteActionCompatParcelizer) view.getLayoutParams()).E = true;
            if (!this.j.contains(setid)) {
                this.j.add(setid);
            }
        }
        this.b.put(view.getId(), view);
        this.a = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        onViewRemoved(view);
        this.b.remove(view.getId());
        setTitleMarginEnd settitlemarginend = view == this ? this.f : view == null ? null : ((RemoteActionCompatParcelizer) view.getLayoutParams()).ao;
        this.f.aY.remove(settitlemarginend);
        settitlemarginend.u();
        this.j.remove(view);
        this.a = true;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        removeView(view);
    }

    @Override // android.view.ViewParent, android.view.View
    public void requestLayout() {
        c();
        requestLayout();
    }

    public void setConstraintSet(setDesignInformation setdesigninformation) {
        this.m = setdesigninformation;
    }

    public void setDesignInformation(int i, Object obj, Object obj2) {
        if (i == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.l == null) {
                this.l = new HashMap<>();
            }
            String str = (String) obj;
            int indexOf = str.indexOf("/");
            String str2 = str;
            if (indexOf != -1) {
                str2 = str.substring(indexOf + 1);
            }
            this.l.put(str2, Integer.valueOf(((Integer) obj2).intValue()));
        }
    }

    @Override // android.view.View
    public void setId(int i) {
        this.b.remove(getId());
        setId(i);
        this.b.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i != this.p) {
            this.p = i;
            requestLayout();
        }
    }

    public void setMaxWidth(int i) {
        if (i != this.r) {
            this.r = i;
            requestLayout();
        }
    }

    public void setMinHeight(int i) {
        if (i != this.q) {
            this.q = i;
            requestLayout();
        }
    }

    public void setMinWidth(int i) {
        if (i != this.s) {
            this.s = i;
            requestLayout();
        }
    }

    public void setOnConstraintsChanged(setOnConstraintsChanged setonconstraintschanged) {
        this.k = setonconstraintschanged;
        setConstraintSet setconstraintset = this.d;
        if (setconstraintset != null) {
            setconstraintset.d = setonconstraintschanged;
        }
    }

    public void setOptimizationLevel(int i) {
        this.y = i;
        this.f.k(i);
    }

    public void setState(int i, int i2, int i3) {
        int b;
        setConstraintSet setconstraintset = this.d;
        if (setconstraintset != null) {
            float f = (float) i2;
            float f2 = (float) i3;
            int i4 = setconstraintset.e;
            if (i4 == i) {
                setConstraintSet$MediaBrowserCompat$CustomActionResultReceiver valueAt = i == -1 ? setconstraintset.h.valueAt(0) : setconstraintset.h.get(i4);
                if ((setconstraintset.c == -1 || !valueAt.e.get(setconstraintset.c).b(f, f2)) && setconstraintset.c != (b = valueAt.b(f, f2))) {
                    setDesignInformation setdesigninformation = b == -1 ? setconstraintset.a : valueAt.e.get(b).e;
                    if (b != -1) {
                        valueAt.e.get(b);
                    }
                    if (setdesigninformation != null) {
                        setconstraintset.c = b;
                        setdesigninformation.d(setconstraintset.b);
                        if (setconstraintset.d == null) {
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            setconstraintset.e = i;
            setConstraintSet$MediaBrowserCompat$CustomActionResultReceiver setconstraintset_mediabrowsercompat_customactionresultreceiver = setconstraintset.h.get(i);
            int b2 = setconstraintset_mediabrowsercompat_customactionresultreceiver.b(f, f2);
            setDesignInformation setdesigninformation2 = b2 == -1 ? setconstraintset_mediabrowsercompat_customactionresultreceiver.a : setconstraintset_mediabrowsercompat_customactionresultreceiver.e.get(b2).e;
            if (b2 != -1) {
                setconstraintset_mediabrowsercompat_customactionresultreceiver.e.get(b2);
            }
            if (setdesigninformation2 == null) {
                StringBuilder sb = new StringBuilder("NO Constraint set found ! id=");
                sb.append(i);
                sb.append(", dim =");
                sb.append(f);
                sb.append(", ");
                sb.append(f2);
                Log.v("ConstraintLayoutStates", sb.toString());
                return;
            }
            setconstraintset.c = b2;
            setdesigninformation2.d(setconstraintset.b);
        }
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
