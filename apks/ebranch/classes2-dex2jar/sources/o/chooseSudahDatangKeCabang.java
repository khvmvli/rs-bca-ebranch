package o;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeMap;
import o.BaseDialogKotlin;
import o.CancelReservasiDialog_ViewBinding;
import o.JenisPekerjaanDialog;
import o.getChildFragmentManager;
/* loaded from: classes2-dex2jar.jar:o/chooseSudahDatangKeCabang.class */
public class chooseSudahDatangKeCabang extends LinearLayout {
    private static final int e = BaseDialogKotlin.MediaDescriptionCompat.w;
    private static final String j;
    boolean a;
    int b;
    public final LinkedHashSet<IconCompatParcelizer> c;
    boolean d;
    private Integer[] f;
    private final List<write> g;
    private final RemoteActionCompatParcelizer h;
    private final Comparator<CancelReservasiDialog_ViewBinding> i;
    private final chooseSudahDatangKeCabang$MediaBrowserCompat$CustomActionResultReceiver l;

    /* renamed from: o */
    private boolean f60o;

    /* loaded from: classes2-dex2jar.jar:o/chooseSudahDatangKeCabang$IconCompatParcelizer.class */
    public interface IconCompatParcelizer {
        void d(int i, boolean z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2-dex2jar.jar:o/chooseSudahDatangKeCabang$RemoteActionCompatParcelizer.class */
    public final class RemoteActionCompatParcelizer implements CancelReservasiDialog_ViewBinding.RemoteActionCompatParcelizer {
        private RemoteActionCompatParcelizer() {
            chooseSudahDatangKeCabang.this = r4;
        }

        /* synthetic */ RemoteActionCompatParcelizer(chooseSudahDatangKeCabang choosesudahdatangkecabang, byte b) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.CancelReservasiDialog_ViewBinding.RemoteActionCompatParcelizer
        public final void c(CancelReservasiDialog_ViewBinding cancelReservasiDialog_ViewBinding, boolean z) {
            if (!chooseSudahDatangKeCabang.this.d) {
                if (chooseSudahDatangKeCabang.this.a) {
                    chooseSudahDatangKeCabang.this.b = z ? cancelReservasiDialog_ViewBinding.getId() : -1;
                }
                if (chooseSudahDatangKeCabang.this.d(cancelReservasiDialog_ViewBinding.getId(), z)) {
                    chooseSudahDatangKeCabang.this.a(cancelReservasiDialog_ViewBinding.getId(), cancelReservasiDialog_ViewBinding.isChecked());
                }
                chooseSudahDatangKeCabang.this.invalidate();
            }
        }
    }

    /* loaded from: classes2-dex2jar.jar:o/chooseSudahDatangKeCabang$write.class */
    public static final class write {
        static final IsiPernyataanDialog_ViewBinding b = new InfoTarikanDialog_ViewBinding(0.0f);
        IsiPernyataanDialog_ViewBinding a;
        IsiPernyataanDialog_ViewBinding c;
        IsiPernyataanDialog_ViewBinding d;
        IsiPernyataanDialog_ViewBinding e;

        write(IsiPernyataanDialog_ViewBinding isiPernyataanDialog_ViewBinding, IsiPernyataanDialog_ViewBinding isiPernyataanDialog_ViewBinding2, IsiPernyataanDialog_ViewBinding isiPernyataanDialog_ViewBinding3, IsiPernyataanDialog_ViewBinding isiPernyataanDialog_ViewBinding4) {
            this.a = isiPernyataanDialog_ViewBinding;
            this.e = isiPernyataanDialog_ViewBinding3;
            this.d = isiPernyataanDialog_ViewBinding4;
            this.c = isiPernyataanDialog_ViewBinding2;
        }
    }

    public chooseSudahDatangKeCabang(Context context) {
        this(context, null);
    }

    public chooseSudahDatangKeCabang(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, BaseDialogKotlin$MediaBrowserCompat$CustomActionResultReceiver.C);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public chooseSudahDatangKeCabang(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r0 = o.chooseSudahDatangKeCabang.e
            r11 = r0
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            android.content.Context r1 = o.MataUangDialog_ViewBinding.a(r1, r2, r3, r4)
            r2 = r9
            r3 = r10
            r0.<init>(r1, r2, r3)
            r0 = r7
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = r1
            r2.<init>()
            r0.g = r1
            r0 = r7
            o.chooseSudahDatangKeCabang$RemoteActionCompatParcelizer r1 = new o.chooseSudahDatangKeCabang$RemoteActionCompatParcelizer
            r2 = r1
            r3 = r7
            r4 = 0
            r2.<init>(r3, r4)
            r0.h = r1
            r0 = r7
            o.chooseSudahDatangKeCabang$MediaBrowserCompat$CustomActionResultReceiver r1 = new o.chooseSudahDatangKeCabang$MediaBrowserCompat$CustomActionResultReceiver
            r2 = r1
            r3 = r7
            r4 = 0
            r2.<init>(r3, r4)
            r0.l = r1
            r0 = r7
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r2 = r1
            r2.<init>()
            r0.c = r1
            r0 = r7
            o.chooseSudahDatangKeCabang$3 r1 = new o.chooseSudahDatangKeCabang$3
            r2 = r1
            r3 = r7
            r2.<init>()
            r0.i = r1
            r0 = r7
            r1 = 0
            r0.d = r1
            r0 = r7
            android.content.Context r0 = r0.getContext()
            r1 = r9
            int[] r2 = o.BaseDialogKotlin$MediaSessionCompat$Token.cY
            r3 = r10
            r4 = r11
            r5 = 0
            int[] r5 = new int[r5]
            android.content.res.TypedArray r0 = o.GuestWarningWebViewDialog_ViewBinding.c(r0, r1, r2, r3, r4, r5)
            r8 = r0
            r0 = r7
            r1 = r8
            int r2 = o.BaseDialogKotlin$MediaSessionCompat$Token.dd
            r3 = 0
            boolean r1 = r1.getBoolean(r2, r3)
            r0.setSingleSelection(r1)
            r0 = r7
            r1 = r8
            int r2 = o.BaseDialogKotlin$MediaSessionCompat$Token.db
            r3 = -1
            int r1 = r1.getResourceId(r2, r3)
            r0.b = r1
            r0 = r7
            r1 = r8
            int r2 = o.BaseDialogKotlin$MediaSessionCompat$Token.cX
            r3 = 0
            boolean r1 = r1.getBoolean(r2, r3)
            r0.f60o = r1
            r0 = r7
            r1 = 1
            r0.setChildrenDrawingOrderEnabled(r1)
            r0 = r8
            r0.recycle()
            r0 = r7
            r1 = 1
            o.findFragmentByWho.j(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.chooseSudahDatangKeCabang.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [o.CancelReservasiDialog_ViewBinding, android.view.View] */
    /* JADX WARN: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private void a() {
        /*
            r6 = this;
            r0 = r6
            int r0 = r0.getChildCount()
            r7 = r0
            r0 = r6
            int r0 = r0.b()
            r8 = r0
            r0 = r6
            int r0 = r0.e()
            r9 = r0
            r0 = 0
            r10 = r0
        L_0x0012:
            r0 = r10
            r1 = r7
            if (r0 >= r1) goto L_0x005d
            r0 = r6
            r1 = r10
            android.view.View r0 = r0.getChildAt(r1)
            o.CancelReservasiDialog_ViewBinding r0 = (o.CancelReservasiDialog_ViewBinding) r0
            r11 = r0
            r0 = r11
            int r0 = r0.getVisibility()
            r1 = 8
            if (r0 == r1) goto L_0x0057
            o.JenisPekerjaanDialog$RemoteActionCompatParcelizer r0 = new o.JenisPekerjaanDialog$RemoteActionCompatParcelizer
            r1 = r0
            r2 = r11
            o.JenisPekerjaanDialog r2 = r2.a()
            r1.<init>(r2)
            r12 = r0
            r0 = r12
            r1 = r6
            r2 = r10
            r3 = r8
            r4 = r9
            o.chooseSudahDatangKeCabang$write r1 = r1.e(r2, r3, r4)
            d(r0, r1)
            r0 = r11
            o.JenisPekerjaanDialog r1 = new o.JenisPekerjaanDialog
            r2 = r1
            r3 = r12
            r4 = 0
            r2.<init>(r3, r4)
            r0.setShapeAppearanceModel(r1)
        L_0x0057:
            int r10 = r10 + 1
            goto L_0x0012
        L_0x005d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.chooseSudahDatangKeCabang.a():void");
    }

    private int b() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (getChildAt(i).getVisibility() != 8) {
                return i;
            }
        }
        return -1;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [o.CancelReservasiDialog_ViewBinding, android.view.View] */
    /* JADX WARN: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private java.util.List<java.lang.Integer> c() {
        /*
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r4 = r0
            r0 = 0
            r5 = r0
        L_0x000a:
            r0 = r5
            r1 = r3
            int r1 = r1.getChildCount()
            if (r0 >= r1) goto L_0x0036
            r0 = r3
            r1 = r5
            android.view.View r0 = r0.getChildAt(r1)
            o.CancelReservasiDialog_ViewBinding r0 = (o.CancelReservasiDialog_ViewBinding) r0
            r6 = r0
            r0 = r6
            boolean r0 = r0.isChecked()
            if (r0 == 0) goto L_0x0030
            r0 = r4
            r1 = r6
            int r1 = r1.getId()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            boolean r0 = r0.add(r1)
        L_0x0030:
            int r5 = r5 + 1
            goto L_0x000a
        L_0x0036:
            r0 = r4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.chooseSudahDatangKeCabang.c():java.util.List");
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [o.CancelReservasiDialog_ViewBinding, android.view.View] */
    /* JADX WARN: Type inference failed for: r0v27, types: [o.CancelReservasiDialog_ViewBinding, android.view.View] */
    /* JADX WARN: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private void d() {
        /*
        // Method dump skipped, instructions count: 280
        */
        throw new UnsupportedOperationException("Method not decompiled: o.chooseSudahDatangKeCabang.d():void");
    }

    private static void d(JenisPekerjaanDialog.RemoteActionCompatParcelizer remoteActionCompatParcelizer, write write2) {
        if (write2 == null) {
            remoteActionCompatParcelizer.i = new InfoTarikanDialog_ViewBinding(0.0f);
            remoteActionCompatParcelizer.k = new InfoTarikanDialog_ViewBinding(0.0f);
            remoteActionCompatParcelizer.e = new InfoTarikanDialog_ViewBinding(0.0f);
            remoteActionCompatParcelizer.b = new InfoTarikanDialog_ViewBinding(0.0f);
            return;
        }
        remoteActionCompatParcelizer.i = write2.a;
        remoteActionCompatParcelizer.b = write2.c;
        remoteActionCompatParcelizer.k = write2.e;
        remoteActionCompatParcelizer.e = write2.d;
    }

    private int e() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (getChildAt(childCount).getVisibility() != 8) {
                return childCount;
            }
        }
        return -1;
    }

    private write e(int i, int i2, int i3) {
        write write2;
        write write3;
        write write4 = this.g.get(i);
        if (i2 == i3) {
            return write4;
        }
        boolean z = false;
        boolean z2 = false;
        boolean z3 = getOrientation() == 0;
        if (i == i2) {
            if (z3) {
                if (findFragmentByWho.k(this) == 1) {
                    z2 = true;
                }
                if (z2) {
                    IsiPernyataanDialog_ViewBinding isiPernyataanDialog_ViewBinding = write.b;
                    write3 = new write(isiPernyataanDialog_ViewBinding, isiPernyataanDialog_ViewBinding, write4.e, write4.d);
                } else {
                    IsiPernyataanDialog_ViewBinding isiPernyataanDialog_ViewBinding2 = write4.a;
                    IsiPernyataanDialog_ViewBinding isiPernyataanDialog_ViewBinding3 = write4.c;
                    IsiPernyataanDialog_ViewBinding isiPernyataanDialog_ViewBinding4 = write.b;
                    write3 = new write(isiPernyataanDialog_ViewBinding2, isiPernyataanDialog_ViewBinding3, isiPernyataanDialog_ViewBinding4, isiPernyataanDialog_ViewBinding4);
                }
            } else {
                IsiPernyataanDialog_ViewBinding isiPernyataanDialog_ViewBinding5 = write4.a;
                IsiPernyataanDialog_ViewBinding isiPernyataanDialog_ViewBinding6 = write.b;
                write3 = new write(isiPernyataanDialog_ViewBinding5, isiPernyataanDialog_ViewBinding6, write4.e, isiPernyataanDialog_ViewBinding6);
            }
            return write3;
        } else if (i != i3) {
            return null;
        } else {
            if (z3) {
                if (findFragmentByWho.k(this) == 1) {
                    z = true;
                }
                if (z) {
                    IsiPernyataanDialog_ViewBinding isiPernyataanDialog_ViewBinding7 = write4.a;
                    IsiPernyataanDialog_ViewBinding isiPernyataanDialog_ViewBinding8 = write4.c;
                    IsiPernyataanDialog_ViewBinding isiPernyataanDialog_ViewBinding9 = write.b;
                    write2 = new write(isiPernyataanDialog_ViewBinding7, isiPernyataanDialog_ViewBinding8, isiPernyataanDialog_ViewBinding9, isiPernyataanDialog_ViewBinding9);
                } else {
                    IsiPernyataanDialog_ViewBinding isiPernyataanDialog_ViewBinding10 = write.b;
                    write2 = new write(isiPernyataanDialog_ViewBinding10, isiPernyataanDialog_ViewBinding10, write4.e, write4.d);
                }
            } else {
                IsiPernyataanDialog_ViewBinding isiPernyataanDialog_ViewBinding11 = write.b;
                write2 = new write(isiPernyataanDialog_ViewBinding11, write4.c, isiPernyataanDialog_ViewBinding11, write4.d);
            }
            return write2;
        }
    }

    void a(int i, boolean z) {
        Iterator<IconCompatParcelizer> it = this.c.iterator();
        while (it.hasNext()) {
            it.next().d(i, z);
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [o.CancelReservasiDialog_ViewBinding, android.widget.TextView, android.view.View] */
    /* JADX WARN: Unknown variable types count: 1 */
    @Override // android.view.ViewGroup
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void addView(android.view.View r9, int r10, android.view.ViewGroup.LayoutParams r11) {
        /*
            r8 = this;
            r0 = r9
            boolean r0 = r0 instanceof o.CancelReservasiDialog_ViewBinding
            if (r0 != 0) goto L_0x0012
            java.lang.String r0 = o.chooseSudahDatangKeCabang.j
            java.lang.String r1 = "Child views must be of type MaterialButton."
            int r0 = android.util.Log.e(r0, r1)
            return
        L_0x0012:
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r0.addView(r1, r2, r3)
            r0 = r9
            o.CancelReservasiDialog_ViewBinding r0 = (o.CancelReservasiDialog_ViewBinding) r0
            r9 = r0
            r0 = r9
            int r0 = r0.getId()
            r1 = -1
            if (r0 != r1) goto L_0x002d
            r0 = r9
            int r1 = o.findFragmentByWho.e()
            r0.setId(r1)
        L_0x002d:
            r0 = r9
            r1 = 1
            r0.setMaxLines(r1)
            r0 = r9
            android.text.TextUtils$TruncateAt r1 = android.text.TextUtils.TruncateAt.END
            r0.setEllipsize(r1)
            r0 = r9
            r1 = 1
            r0.setCheckable(r1)
            r0 = r8
            o.chooseSudahDatangKeCabang$RemoteActionCompatParcelizer r0 = r0.h
            r11 = r0
            r0 = r9
            java.util.LinkedHashSet<o.CancelReservasiDialog_ViewBinding$RemoteActionCompatParcelizer> r0 = r0.c
            r1 = r11
            boolean r0 = r0.add(r1)
            r0 = r9
            r1 = r8
            o.chooseSudahDatangKeCabang$MediaBrowserCompat$CustomActionResultReceiver r1 = r1.l
            r0.b = r1
            r0 = r9
            r1 = 1
            r0.a(r1)
            r0 = r9
            boolean r0 = r0.isChecked()
            if (r0 == 0) goto L_0x007a
            r0 = r8
            r1 = r9
            int r1 = r1.getId()
            r2 = 1
            boolean r0 = r0.d(r1, r2)
            r0 = r9
            int r0 = r0.getId()
            r10 = r0
            r0 = r8
            r1 = r10
            r0.b = r1
            r0 = r8
            r1 = r10
            r2 = 1
            r0.a(r1, r2)
        L_0x007a:
            r0 = r9
            o.JenisPekerjaanDialog r0 = r0.a()
            r11 = r0
            r0 = r8
            java.util.List<o.chooseSudahDatangKeCabang$write> r0 = r0.g
            o.chooseSudahDatangKeCabang$write r1 = new o.chooseSudahDatangKeCabang$write
            r2 = r1
            r3 = r11
            o.IsiPernyataanDialog_ViewBinding r3 = r3.m
            r4 = r11
            o.IsiPernyataanDialog_ViewBinding r4 = r4.c
            r5 = r11
            o.IsiPernyataanDialog_ViewBinding r5 = r5.l
            r6 = r11
            o.IsiPernyataanDialog_ViewBinding r6 = r6.i
            r2.<init>(r3, r4, r5, r6)
            boolean r0 = r0.add(r1)
            r0 = r9
            o.chooseSudahDatangKeCabang$5 r1 = new o.chooseSudahDatangKeCabang$5
            r2 = r1
            r3 = r8
            r2.<init>()
            o.findFragmentByWho.d(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.chooseSudahDatangKeCabang.addView(android.view.View, int, android.view.ViewGroup$LayoutParams):void");
    }

    public final void d(int i) {
        CancelReservasiDialog_ViewBinding cancelReservasiDialog_ViewBinding;
        if (i != this.b && (cancelReservasiDialog_ViewBinding = (CancelReservasiDialog_ViewBinding) findViewById(i)) != null) {
            cancelReservasiDialog_ViewBinding.setChecked(true);
        }
    }

    boolean d(int i, boolean z) {
        List<Integer> c = c();
        if (this.f60o && c.isEmpty()) {
            View findViewById = findViewById(i);
            if (findViewById instanceof CancelReservasiDialog_ViewBinding) {
                this.d = true;
                ((CancelReservasiDialog_ViewBinding) findViewById).setChecked(true);
                this.d = false;
            }
            this.b = i;
            return false;
        } else if (!z || !this.a) {
            return true;
        } else {
            c.remove(Integer.valueOf(i));
            for (Integer num : c) {
                int intValue = num.intValue();
                View findViewById2 = findViewById(intValue);
                if (findViewById2 instanceof CancelReservasiDialog_ViewBinding) {
                    this.d = true;
                    ((CancelReservasiDialog_ViewBinding) findViewById2).setChecked(false);
                    this.d = false;
                }
                a(intValue, false);
            }
            return true;
        }
    }

    @Override // android.view.View, android.view.ViewGroup
    protected void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.i);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            treeMap.put((CancelReservasiDialog_ViewBinding) getChildAt(i), Integer.valueOf(i));
        }
        this.f = (Integer[]) treeMap.values().toArray(new Integer[0]);
        dispatchDraw(canvas);
    }

    @Override // android.widget.LinearLayout, android.view.View, android.view.ViewGroup
    public CharSequence getAccessibilityClassName() {
        return chooseSudahDatangKeCabang.class.getName();
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i, int i2) {
        Integer[] numArr = this.f;
        if (numArr != null && i2 < numArr.length) {
            return numArr[i2].intValue();
        }
        Log.w(j, "Child order wasn't updated");
        return i2;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        CancelReservasiDialog_ViewBinding cancelReservasiDialog_ViewBinding;
        onFinishInflate();
        int i = this.b;
        if (i != -1 && (cancelReservasiDialog_ViewBinding = (CancelReservasiDialog_ViewBinding) findViewById(i)) != null) {
            cancelReservasiDialog_ViewBinding.setChecked(true);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        getChildFragmentManager d = getChildFragmentManager.d(accessibilityNodeInfo);
        int i = 0;
        int i2 = 0;
        while (true) {
            boolean z = true;
            if (i >= getChildCount()) {
                break;
            }
            i2 = i2;
            if (getChildAt(i) instanceof CancelReservasiDialog_ViewBinding) {
                if (getChildAt(i).getVisibility() == 8) {
                    z = false;
                }
                i2 = i2;
                if (z) {
                    i2++;
                }
            }
            i++;
        }
        d.c(getChildFragmentManager.MediaBrowserCompat.CustomActionResultReceiver.b(1, i2, false, this.a ? 1 : 2));
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        a();
        d();
        onMeasure(i, i2);
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        onViewRemoved(view);
        if (view instanceof CancelReservasiDialog_ViewBinding) {
            CancelReservasiDialog_ViewBinding cancelReservasiDialog_ViewBinding = (CancelReservasiDialog_ViewBinding) view;
            cancelReservasiDialog_ViewBinding.c.remove(this.h);
            cancelReservasiDialog_ViewBinding.b = null;
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.g.remove(indexOfChild);
        }
        a();
        d();
    }

    public void setSelectionRequired(boolean z) {
        this.f60o = z;
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [o.CancelReservasiDialog_ViewBinding, android.view.View] */
    /* JADX WARN: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void setSingleSelection(boolean r5) {
        /*
            r4 = this;
            r0 = r4
            boolean r0 = r0.a
            r1 = r5
            if (r0 == r1) goto L_0x0049
            r0 = r4
            r1 = r5
            r0.a = r1
            r0 = r4
            r1 = 1
            r0.d = r1
            r0 = 0
            r6 = r0
        L_0x0014:
            r0 = r6
            r1 = r4
            int r1 = r1.getChildCount()
            if (r0 >= r1) goto L_0x0039
            r0 = r4
            r1 = r6
            android.view.View r0 = r0.getChildAt(r1)
            o.CancelReservasiDialog_ViewBinding r0 = (o.CancelReservasiDialog_ViewBinding) r0
            r7 = r0
            r0 = r7
            r1 = 0
            r0.setChecked(r1)
            r0 = r4
            r1 = r7
            int r1 = r1.getId()
            r2 = 0
            r0.a(r1, r2)
            int r6 = r6 + 1
            goto L_0x0014
        L_0x0039:
            r0 = r4
            r1 = 0
            r0.d = r1
            r0 = r4
            r1 = -1
            r0.b = r1
            r0 = r4
            r1 = -1
            r2 = 1
            r0.a(r1, r2)
        L_0x0049:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.chooseSudahDatangKeCabang.setSingleSelection(boolean):void");
    }
}
