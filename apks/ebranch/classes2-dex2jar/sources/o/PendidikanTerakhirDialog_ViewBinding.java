package o;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import o.PendidikanTerakhirDialog;
import o.chooseSudahDatangKeCabang;
import o.setDesignInformation;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2-dex2jar.jar:o/PendidikanTerakhirDialog_ViewBinding.class */
public class PendidikanTerakhirDialog_ViewBinding extends setMaxHeight {
    final PendidikanTerakhirDialog j;
    final chooseBelumYakinBertransaksi k;
    read l;
    RemoteActionCompatParcelizer m;
    PendidikanTerakhirDialog_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver n;

    /* renamed from: o */
    final chooseBelumYakinBertransaksi f52o;
    final chooseSudahDatangKeCabang q;
    private final View.OnClickListener r;
    private final clickedPilih s;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2-dex2jar.jar:o/PendidikanTerakhirDialog_ViewBinding$RemoteActionCompatParcelizer.class */
    public interface RemoteActionCompatParcelizer {
        void e(int i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2-dex2jar.jar:o/PendidikanTerakhirDialog_ViewBinding$read.class */
    public interface read {
        void a(int i);
    }

    public PendidikanTerakhirDialog_ViewBinding(Context context) {
        this(context, null);
    }

    public PendidikanTerakhirDialog_ViewBinding(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [android.view.View, o.chooseBelumYakinBertransaksi] */
    /* JADX WARN: Type inference failed for: r0v21, types: [android.view.View, o.chooseBelumYakinBertransaksi] */
    /* JADX WARN: Type inference failed for: r0v23, types: [android.view.View, o.chooseBelumYakinBertransaksi] */
    /* JADX WARN: Type inference failed for: r0v25, types: [android.view.View, o.chooseBelumYakinBertransaksi] */
    /* JADX WARN: Type inference failed for: r0v27, types: [android.view.View, o.chooseBelumYakinBertransaksi] */
    /* JADX WARN: Type inference failed for: r0v29, types: [android.view.View, o.chooseBelumYakinBertransaksi] */
    public PendidikanTerakhirDialog_ViewBinding(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.r = new View.OnClickListener() { // from class: o.PendidikanTerakhirDialog_ViewBinding.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PendidikanTerakhirDialog_ViewBinding.this.l != null) {
                    PendidikanTerakhirDialog_ViewBinding.this.l.a(((Integer) view.getTag(BaseDialogKotlin$MediaBrowserCompat$ItemReceiver.S)).intValue());
                }
            }
        };
        LayoutInflater.from(context).inflate(BaseDialogKotlin$MediaBrowserCompat$MediaItem.s, (ViewGroup) this);
        this.s = (clickedPilih) findViewById(BaseDialogKotlin$MediaBrowserCompat$ItemReceiver.h);
        chooseSudahDatangKeCabang choosesudahdatangkecabang = (chooseSudahDatangKeCabang) findViewById(BaseDialogKotlin$MediaBrowserCompat$ItemReceiver.l);
        this.q = choosesudahdatangkecabang;
        choosesudahdatangkecabang.c.add(new chooseSudahDatangKeCabang.IconCompatParcelizer() { // from class: o.PendidikanTerakhirDialog_ViewBinding.5
            @Override // o.chooseSudahDatangKeCabang.IconCompatParcelizer
            public final void d(int i2, boolean z) {
                int i3 = i2 == BaseDialogKotlin$MediaBrowserCompat$ItemReceiver.n ? 1 : 0;
                if (PendidikanTerakhirDialog_ViewBinding.this.m != null && z) {
                    PendidikanTerakhirDialog_ViewBinding.this.m.e(i3);
                }
            }
        });
        this.f52o = (chooseBelumYakinBertransaksi) findViewById(BaseDialogKotlin$MediaBrowserCompat$ItemReceiver.t);
        this.k = (chooseBelumYakinBertransaksi) findViewById(BaseDialogKotlin$MediaBrowserCompat$ItemReceiver.s);
        this.j = (PendidikanTerakhirDialog) findViewById(BaseDialogKotlin$MediaBrowserCompat$ItemReceiver.k);
        final GestureDetector gestureDetector = new GestureDetector(getContext(), new GestureDetector.SimpleOnGestureListener() { // from class: o.PendidikanTerakhirDialog_ViewBinding.4
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public final boolean onDoubleTap(MotionEvent motionEvent) {
                boolean onDoubleTap = onDoubleTap(motionEvent);
                if (PendidikanTerakhirDialog_ViewBinding.this.n != null) {
                    PendidikanTerakhirDialog_ViewBinding.this.n.a();
                }
                return onDoubleTap;
            }
        });
        AnonymousClass1 r0 = new View.OnTouchListener() { // from class: o.PendidikanTerakhirDialog_ViewBinding.1
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (((Checkable) view).isChecked()) {
                    return gestureDetector.onTouchEvent(motionEvent);
                }
                return false;
            }
        };
        this.f52o.setOnTouchListener(r0);
        this.k.setOnTouchListener(r0);
        this.f52o.setTag(BaseDialogKotlin$MediaBrowserCompat$ItemReceiver.S, 12);
        this.k.setTag(BaseDialogKotlin$MediaBrowserCompat$ItemReceiver.S, 10);
        this.f52o.setOnClickListener(this.r);
        this.k.setOnClickListener(this.r);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void a() {
        if (this.q.getVisibility() == 0) {
            setDesignInformation setdesigninformation = new setDesignInformation();
            setdesigninformation.c(this);
            char c = 1;
            if (findFragmentByWho.k(this) == 0) {
                c = 2;
            }
            int i = BaseDialogKotlin$MediaBrowserCompat$ItemReceiver.i;
            if (setdesigninformation.a.containsKey(Integer.valueOf(i))) {
                setDesignInformation.IconCompatParcelizer iconCompatParcelizer = (setDesignInformation.IconCompatParcelizer) setdesigninformation.a.get(Integer.valueOf(i));
                switch (c) {
                    case 1:
                        iconCompatParcelizer.d.G = -1;
                        iconCompatParcelizer.d.H = -1;
                        iconCompatParcelizer.d.E = -1;
                        iconCompatParcelizer.d.s = -1;
                        break;
                    case 2:
                        iconCompatParcelizer.d.U = -1;
                        iconCompatParcelizer.d.V = -1;
                        iconCompatParcelizer.d.X = -1;
                        iconCompatParcelizer.d.q = -1;
                        break;
                    case 3:
                        iconCompatParcelizer.d.ac = -1;
                        iconCompatParcelizer.d.ab = -1;
                        iconCompatParcelizer.d.aa = -1;
                        iconCompatParcelizer.d.x = -1;
                        break;
                    case 4:
                        iconCompatParcelizer.d.a = -1;
                        iconCompatParcelizer.d.c = -1;
                        iconCompatParcelizer.d.e = -1;
                        iconCompatParcelizer.d.t = -1;
                        break;
                    case 5:
                        iconCompatParcelizer.d.b = -1;
                        break;
                    case 6:
                        iconCompatParcelizer.d.Z = -1;
                        iconCompatParcelizer.d.Y = -1;
                        iconCompatParcelizer.d.T = -1;
                        iconCompatParcelizer.d.p = -1;
                        break;
                    case 7:
                        iconCompatParcelizer.d.m = -1;
                        iconCompatParcelizer.d.k = -1;
                        iconCompatParcelizer.d.n = -1;
                        iconCompatParcelizer.d.r = -1;
                        break;
                    default:
                        throw new IllegalArgumentException("unknown constraint");
                }
            }
            setdesigninformation.d(this);
        }
    }

    protected void onAttachedToWindow() {
        onAttachedToWindow();
        a();
    }

    protected void onVisibilityChanged(View view, int i) {
        onVisibilityChanged(view, i);
        if (view == this && i == 0) {
            a();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.widget.CompoundButton, o.chooseBelumYakinBertransaksi] */
    /* JADX WARN: Type inference failed for: r0v6, types: [android.widget.CompoundButton, o.chooseBelumYakinBertransaksi] */
    /* JADX WARN: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void setActiveSelection(int r4) {
        /*
            r3 = this;
            r0 = r3
            o.chooseBelumYakinBertransaksi r0 = r0.f52o
            r5 = r0
            r0 = 1
            r6 = r0
            r0 = r4
            r1 = 12
            if (r0 != r1) goto L_0x0013
            r0 = 1
            r7 = r0
            goto L_0x0016
        L_0x0013:
            r0 = 0
            r7 = r0
        L_0x0016:
            r0 = r5
            r1 = r7
            r0.setChecked(r1)
            r0 = r3
            o.chooseBelumYakinBertransaksi r0 = r0.k
            r5 = r0
            r0 = r4
            r1 = 10
            if (r0 != r1) goto L_0x002d
            r0 = r6
            r7 = r0
            goto L_0x0030
        L_0x002d:
            r0 = 0
            r7 = r0
        L_0x0030:
            r0 = r5
            r1 = r7
            r0.setChecked(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.PendidikanTerakhirDialog_ViewBinding.setActiveSelection(int):void");
    }

    public void setAnimateOnTouchUp(boolean z) {
        this.j.setAnimateOnTouchUp(z);
    }

    public void setHandRotation(float f) {
        this.j.setHandRotation(f);
    }

    public void setHandRotation(float f, boolean z) {
        this.j.setHandRotation(f, z);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View, o.chooseBelumYakinBertransaksi] */
    public void setHourClickDelegate(onDismiss ondismiss) {
        findFragmentByWho.d((View) this.f52o, ondismiss);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View, o.chooseBelumYakinBertransaksi] */
    public void setMinuteHourDelegate(onDismiss ondismiss) {
        findFragmentByWho.d((View) this.k, ondismiss);
    }

    public void setOnActionUpListener(PendidikanTerakhirDialog.IconCompatParcelizer iconCompatParcelizer) {
        this.j.setOnActionUpListener(iconCompatParcelizer);
    }

    public void setValues(String[] strArr, int i) {
        this.s.setValues(strArr, i);
    }
}
