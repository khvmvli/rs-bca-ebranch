package o;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Handler;
import android.text.format.DateUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.Locale;
import o.OR4DataBankPenerimaFragment_ViewBinding;
import o.OR5DataPenerimaFragment;
import o.onChooseNegaraBagian;
import o.pilihJenisKodeBank;
/* loaded from: classes2-dex2jar.jar:o/showInfoHubunganKeuanganOR.class */
public class showInfoHubunganKeuanganOR extends FrameLayout implements View.OnTouchListener {
    private onChooseNegaraBagian C;
    private AnimatorSet D;
    private final int a;
    OR5DataPenerimaFragment b;
    private AccessibilityManager c;
    private pilihTujuanTransaksi e;
    private int f;
    private onChooseTipeTujuanTransaksiPenerima g;
    private boolean i;
    private checkRendy j;
    private View k;
    private float l;
    private float n;

    /* renamed from: o  reason: collision with root package name */
    private int f96o;
    private OR3DataTransaksiBFragment_ViewBinding p;
    private onChooseNegaraBagian q;
    private boolean s;
    private OR3DataTransaksiBFragment_ViewBinding u;
    private OR3DataTransaksiBFragment_ViewBinding v;
    private onChooseNegaraBagian w;
    private read y;
    private int[] z;
    private int r = -1;
    private Handler m = new Handler();
    private final int d = ViewConfiguration.getTapTimeout();
    private boolean h = false;
    private OR5DataPenerimaFragment x = null;
    private boolean t = true;
    private boolean A = false;

    /* loaded from: classes2-dex2jar.jar:o/showInfoHubunganKeuanganOR$read.class */
    public interface read {
        void b();

        void c(int i);

        void c(OR5DataPenerimaFragment oR5DataPenerimaFragment);
    }

    public showInfoHubunganKeuanganOR(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnTouchListener(this);
        this.a = ViewConfiguration.get(context).getScaledTouchSlop();
        checkRendy checkrendy = new checkRendy(context);
        this.j = checkrendy;
        addView(checkrendy);
        pilihTujuanTransaksi pilihtujuantransaksi = new pilihTujuanTransaksi(context);
        this.e = pilihtujuantransaksi;
        addView(pilihtujuantransaksi);
        OR3DataTransaksiBFragment_ViewBinding oR3DataTransaksiBFragment_ViewBinding = new OR3DataTransaksiBFragment_ViewBinding(context);
        this.p = oR3DataTransaksiBFragment_ViewBinding;
        addView(oR3DataTransaksiBFragment_ViewBinding);
        OR3DataTransaksiBFragment_ViewBinding oR3DataTransaksiBFragment_ViewBinding2 = new OR3DataTransaksiBFragment_ViewBinding(context);
        this.v = oR3DataTransaksiBFragment_ViewBinding2;
        addView(oR3DataTransaksiBFragment_ViewBinding2);
        OR3DataTransaksiBFragment_ViewBinding oR3DataTransaksiBFragment_ViewBinding3 = new OR3DataTransaksiBFragment_ViewBinding(context);
        this.u = oR3DataTransaksiBFragment_ViewBinding3;
        addView(oR3DataTransaksiBFragment_ViewBinding3);
        onChooseNegaraBagian onchoosenegarabagian = new onChooseNegaraBagian(context);
        this.q = onchoosenegarabagian;
        addView(onchoosenegarabagian);
        onChooseNegaraBagian onchoosenegarabagian2 = new onChooseNegaraBagian(context);
        this.w = onchoosenegarabagian2;
        addView(onchoosenegarabagian2);
        onChooseNegaraBagian onchoosenegarabagian3 = new onChooseNegaraBagian(context);
        this.C = onchoosenegarabagian3;
        addView(onchoosenegarabagian3);
        e();
        View view = new View(context);
        this.k = view;
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.k.setBackgroundColor(copyWindowDataInto.a(context, pilihJenisKodeBank.IconCompatParcelizer.t));
        this.k.setVisibility(4);
        addView(this.k);
        this.c = (AccessibilityManager) context.getSystemService("accessibility");
    }

    private static int b(int i, int i2) {
        int i3;
        int i4 = (i / 30) * 30;
        int i5 = i4 + 30;
        if (i2 != 1) {
            if (i2 == -1) {
                i3 = i4;
                if (i == i4) {
                    i3 = i4 - 30;
                }
            } else if (i - i4 < i5 - i) {
                i3 = i4;
            }
            return i3;
        }
        i3 = i5;
        return i3;
    }

    private void b(int i) {
        int i2 = 0;
        int i3 = i == 0 ? 1 : 0;
        int i4 = i == 1 ? 1 : 0;
        if (i == 2) {
            i2 = 1;
        }
        float f = (float) i3;
        this.q.setAlpha(f);
        this.p.setAlpha(f);
        float f2 = (float) i4;
        this.w.setAlpha(f2);
        this.v.setAlpha(f2);
        float f3 = (float) i2;
        this.C.setAlpha(f3);
        this.u.setAlpha(f3);
    }

    private boolean d(int i) {
        boolean z = true;
        boolean z2 = i <= 12 && i != 0;
        boolean z3 = z2;
        if (this.g.e() != OR4DataBankPenerimaFragment_ViewBinding.write.VERSION_1) {
            z3 = !z2;
        }
        if (!this.s || !z3) {
            z = false;
        }
        return z;
    }

    private int e(float f, float f2, boolean z, Boolean[] boolArr) {
        int b = b();
        if (b == 0) {
            return this.p.d(f, f2, z, boolArr);
        }
        if (b == 1) {
            return this.v.d(f, f2, z, boolArr);
        }
        if (b != 2) {
            return -1;
        }
        return this.u.d(f, f2, z, boolArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0081, code lost:
        if (r8 == false) goto L_0x00af;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008b, code lost:
        if (r7 == 0) goto L_0x008e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ac, code lost:
        if (r0 == 2) goto L_0x00af;
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x015c  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public o.OR5DataPenerimaFragment e(int r7, boolean r8, boolean r9) {
        /*
        // Method dump skipped, instructions count: 569
        */
        throw new UnsupportedOperationException("Method not decompiled: o.showInfoHubunganKeuanganOR.e(int, boolean, boolean):o.OR5DataPenerimaFragment");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public OR5DataPenerimaFragment e(OR5DataPenerimaFragment oR5DataPenerimaFragment, int i) {
        return i != 0 ? i != 1 ? this.g.d(oR5DataPenerimaFragment, OR5DataPenerimaFragment.IconCompatParcelizer.MINUTE) : this.g.d(oR5DataPenerimaFragment, OR5DataPenerimaFragment.IconCompatParcelizer.HOUR) : this.g.d(oR5DataPenerimaFragment, (OR5DataPenerimaFragment.IconCompatParcelizer) null);
    }

    private void e() {
        this.z = new int[361];
        int i = 0;
        int i2 = 8;
        int i3 = 1;
        for (int i4 = 0; i4 < 361; i4++) {
            this.z[i4] = i;
            if (i3 == i2) {
                i += 6;
                i2 = i == 360 ? 7 : i % 30 == 0 ? 14 : 4;
                i3 = 1;
            } else {
                i3++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(OR5DataPenerimaFragment oR5DataPenerimaFragment, boolean z, int i) {
        if (i == 0) {
            int i2 = oR5DataPenerimaFragment.e;
            boolean d = d(i2);
            int i3 = i2 % 12;
            int i4 = (i3 * 360) / 12;
            boolean z2 = this.s;
            if (!z2) {
                i2 = i3;
            }
            int i5 = i2;
            if (!z2) {
                i5 = i2;
                if (i2 == 0) {
                    i5 = i2 + 12;
                }
            }
            this.p.setSelection(i4, d, z);
            this.q.e = i5;
            if (oR5DataPenerimaFragment.b != this.b.b) {
                this.v.setSelection(oR5DataPenerimaFragment.b * 6, d, z);
                this.w.e = oR5DataPenerimaFragment.b;
            }
            if (oR5DataPenerimaFragment.a != this.b.a) {
                this.u.setSelection(oR5DataPenerimaFragment.a * 6, d, z);
                this.C.e = oR5DataPenerimaFragment.a;
            }
        } else if (i == 1) {
            this.v.setSelection(oR5DataPenerimaFragment.b * 6, false, z);
            this.w.e = oR5DataPenerimaFragment.b;
            if (oR5DataPenerimaFragment.a != this.b.a) {
                this.u.setSelection(oR5DataPenerimaFragment.a * 6, false, z);
                this.C.e = oR5DataPenerimaFragment.a;
            }
        } else if (i == 2) {
            this.u.setSelection(oR5DataPenerimaFragment.a * 6, false, z);
            this.C.e = oR5DataPenerimaFragment.a;
        }
        int b = b();
        if (b == 0) {
            this.p.invalidate();
            this.q.invalidate();
        } else if (b == 1) {
            this.v.invalidate();
            this.w.invalidate();
        } else if (b == 2) {
            this.u.invalidate();
            this.C.invalidate();
        }
    }

    public final void a(Context context, Locale locale, onChooseTipeTujuanTransaksiPenerima onchoosetipetujuantransaksipenerima, OR5DataPenerimaFragment oR5DataPenerimaFragment, boolean z) {
        String[] strArr;
        if (this.A) {
            Log.e("RadialPickerLayout", "Time has already been initialized.");
            return;
        }
        this.g = onchoosetipetujuantransaksipenerima;
        this.s = this.c.isTouchExplorationEnabled() || z;
        checkRendy checkrendy = this.j;
        onChooseTipeTujuanTransaksiPenerima onchoosetipetujuantransaksipenerima2 = this.g;
        if (checkrendy.f) {
            Log.e("CircleView", "CircleView may only be initialized once.");
        } else {
            Resources resources = context.getResources();
            checkrendy.d = copyWindowDataInto.a(context, onchoosetipetujuantransaksipenerima2.h() ? pilihJenisKodeBank.IconCompatParcelizer.f : pilihJenisKodeBank.IconCompatParcelizer.h);
            checkrendy.e = onchoosetipetujuantransaksipenerima2.c();
            checkrendy.h.setAntiAlias(true);
            boolean a = onchoosetipetujuantransaksipenerima2.a();
            checkrendy.a = a;
            if (a || onchoosetipetujuantransaksipenerima2.e() != OR4DataBankPenerimaFragment_ViewBinding.write.VERSION_1) {
                checkrendy.b = Float.parseFloat(resources.getString(pilihJenisKodeBank$MediaBrowserCompat$ItemReceiver.b));
            } else {
                checkrendy.b = Float.parseFloat(resources.getString(pilihJenisKodeBank$MediaBrowserCompat$ItemReceiver.e));
                checkrendy.c = Float.parseFloat(resources.getString(pilihJenisKodeBank$MediaBrowserCompat$ItemReceiver.c));
            }
            checkrendy.f = true;
        }
        this.j.invalidate();
        if (!this.s && this.g.e() == OR4DataBankPenerimaFragment_ViewBinding.write.VERSION_1) {
            pilihTujuanTransaksi pilihtujuantransaksi = this.e;
            onChooseTipeTujuanTransaksiPenerima onchoosetipetujuantransaksipenerima3 = this.g;
            int i = oR5DataPenerimaFragment.e < 12 ? 1 : 0;
            if (pilihtujuantransaksi.h) {
                Log.e("AmPmCirclesView", "AmPmCirclesView may only be initialized once.");
            } else {
                Resources resources2 = context.getResources();
                if (onchoosetipetujuantransaksipenerima3.h()) {
                    pilihtujuantransaksi.s = copyWindowDataInto.a(context, pilihJenisKodeBank.IconCompatParcelizer.f);
                    pilihtujuantransaksi.j = copyWindowDataInto.a(context, pilihJenisKodeBank.IconCompatParcelizer.w);
                    pilihtujuantransaksi.c = copyWindowDataInto.a(context, pilihJenisKodeBank.IconCompatParcelizer.l);
                    pilihtujuantransaksi.l = 255;
                } else {
                    pilihtujuantransaksi.s = copyWindowDataInto.a(context, pilihJenisKodeBank.IconCompatParcelizer.w);
                    pilihtujuantransaksi.j = copyWindowDataInto.a(context, pilihJenisKodeBank.IconCompatParcelizer.a);
                    pilihtujuantransaksi.c = copyWindowDataInto.a(context, pilihJenisKodeBank.IconCompatParcelizer.i);
                    pilihtujuantransaksi.l = 255;
                }
                int c = onchoosetipetujuantransaksipenerima3.c();
                pilihtujuantransaksi.n = c;
                float[] fArr = new float[3];
                Color.colorToHSV(c, fArr);
                fArr[2] = fArr[2] * 0.8f;
                pilihtujuantransaksi.m = Color.HSVToColor(fArr);
                pilihtujuantransaksi.b = copyWindowDataInto.a(context, pilihJenisKodeBank.IconCompatParcelizer.w);
                pilihtujuantransaksi.g.setTypeface(Typeface.create(resources2.getString(pilihJenisKodeBank$MediaBrowserCompat$ItemReceiver.p), 0));
                pilihtujuantransaksi.g.setAntiAlias(true);
                pilihtujuantransaksi.g.setTextAlign(Paint.Align.CENTER);
                pilihtujuantransaksi.i = Float.parseFloat(resources2.getString(pilihJenisKodeBank$MediaBrowserCompat$ItemReceiver.e));
                pilihtujuantransaksi.d = Float.parseFloat(resources2.getString(pilihJenisKodeBank$MediaBrowserCompat$ItemReceiver.c));
                String[] amPmStrings = new DateFormatSymbols(locale).getAmPmStrings();
                pilihtujuantransaksi.f = amPmStrings[0];
                pilihtujuantransaksi.f86o = amPmStrings[1];
                pilihtujuantransaksi.e = onchoosetipetujuantransaksipenerima3.d();
                pilihtujuantransaksi.k = onchoosetipetujuantransaksipenerima3.j();
                pilihtujuantransaksi.setAmOrPm(i ^ 1);
                pilihtujuantransaksi.a = -1;
                pilihtujuantransaksi.h = true;
            }
            this.e.invalidate();
        }
        AnonymousClass2 r0 = new onChooseNegaraBagian.read() { // from class: o.showInfoHubunganKeuanganOR.2
            @Override // o.onChooseNegaraBagian.read
            public final boolean b(int i2) {
                return !showInfoHubunganKeuanganOR.this.g.d(new OR5DataPenerimaFragment(showInfoHubunganKeuanganOR.this.b.e, showInfoHubunganKeuanganOR.this.b.b, i2), 2);
            }
        };
        AnonymousClass4 r02 = new onChooseNegaraBagian.read() { // from class: o.showInfoHubunganKeuanganOR.4
            @Override // o.onChooseNegaraBagian.read
            public final boolean b(int i2) {
                return !showInfoHubunganKeuanganOR.this.g.d(new OR5DataPenerimaFragment(showInfoHubunganKeuanganOR.this.b.e, i2, showInfoHubunganKeuanganOR.this.b.a), 1);
            }
        };
        AnonymousClass1 r03 = new onChooseNegaraBagian.read() { // from class: o.showInfoHubunganKeuanganOR.1
            @Override // o.onChooseNegaraBagian.read
            public final boolean b(int i2) {
                int i3;
                int i4;
                OR5DataPenerimaFragment oR5DataPenerimaFragment2 = new OR5DataPenerimaFragment(i2, showInfoHubunganKeuanganOR.this.b.b, showInfoHubunganKeuanganOR.this.b.a);
                if (!showInfoHubunganKeuanganOR.this.s && showInfoHubunganKeuanganOR.this.c() == 1 && (i4 = oR5DataPenerimaFragment2.e) < 12) {
                    oR5DataPenerimaFragment2.e = (i4 + 12) % 24;
                }
                if (!showInfoHubunganKeuanganOR.this.s && showInfoHubunganKeuanganOR.this.c() == 0 && (i3 = oR5DataPenerimaFragment2.e) >= 12) {
                    oR5DataPenerimaFragment2.e = i3 % 12;
                }
                return !showInfoHubunganKeuanganOR.this.g.d(oR5DataPenerimaFragment2, 0);
            }
        };
        int[] iArr = {12, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        String[] strArr2 = new String[12];
        String[] strArr3 = new String[12];
        String[] strArr4 = new String[12];
        String[] strArr5 = new String[12];
        for (int i2 = 0; i2 < 12; i2++) {
            strArr2[i2] = z ? String.format(locale, "%02d", Integer.valueOf(new int[]{0, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23}[i2])) : String.format(locale, "%d", Integer.valueOf(iArr[i2]));
            strArr3[i2] = String.format(locale, "%d", Integer.valueOf(iArr[i2]));
            strArr4[i2] = String.format(locale, "%02d", Integer.valueOf(new int[]{0, 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55}[i2]));
            strArr5[i2] = String.format(locale, "%02d", Integer.valueOf(new int[]{0, 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55}[i2]));
        }
        if (this.g.e() == OR4DataBankPenerimaFragment_ViewBinding.write.VERSION_2) {
            strArr = strArr2;
        } else {
            strArr = strArr3;
            strArr3 = strArr2;
        }
        onChooseNegaraBagian onchoosenegarabagian = this.q;
        if (!z) {
            strArr = null;
        }
        onchoosenegarabagian.b(context, strArr3, strArr, this.g, (onChooseNegaraBagian.read) r03, true);
        onChooseNegaraBagian onchoosenegarabagian2 = this.q;
        int i3 = oR5DataPenerimaFragment.e;
        int i4 = i3;
        if (!z) {
            i4 = iArr[i3 % 12];
        }
        onchoosenegarabagian2.e = i4;
        this.q.invalidate();
        this.w.b(context, strArr4, (String[]) null, this.g, (onChooseNegaraBagian.read) r02, false);
        this.w.e = oR5DataPenerimaFragment.b;
        this.w.invalidate();
        this.C.b(context, strArr5, (String[]) null, this.g, (onChooseNegaraBagian.read) r0, false);
        this.C.e = oR5DataPenerimaFragment.a;
        this.C.invalidate();
        this.b = oR5DataPenerimaFragment;
        this.p.d(context, this.g, z, true, (oR5DataPenerimaFragment.e % 12) * 30, d(oR5DataPenerimaFragment.e));
        this.v.d(context, this.g, false, false, oR5DataPenerimaFragment.b * 6, false);
        this.u.d(context, this.g, false, false, oR5DataPenerimaFragment.a * 6, false);
        this.A = true;
    }

    public final boolean a(boolean z) {
        int i = 0;
        if (this.i && !z) {
            return false;
        }
        this.t = z;
        View view = this.k;
        if (z) {
            i = 4;
        }
        view.setVisibility(i);
        return true;
    }

    public final int b() {
        int i = this.f;
        int i2 = i;
        if (i != 0) {
            i2 = i;
            if (i != 1) {
                i2 = i;
                if (i != 2) {
                    StringBuilder sb = new StringBuilder("Current item showing was unfortunately set to ");
                    sb.append(this.f);
                    Log.e("RadialPickerLayout", sb.toString());
                    i2 = -1;
                }
            }
        }
        return i2;
    }

    public final int c() {
        boolean z = false;
        if (this.b.e < 12) {
            return 0;
        }
        if (this.b.e < 12) {
            z = true;
        }
        return z ^ true ? 1 : -1;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() != 32) {
            return dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        accessibilityEvent.getText().clear();
        Calendar instance = Calendar.getInstance();
        instance.set(10, this.b.e);
        instance.set(12, this.b.b);
        instance.set(13, this.b.a);
        accessibilityEvent.getText().add(DateUtils.formatDateTime(getContext(), instance.getTimeInMillis(), this.s ? 129 : 1));
        return true;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int i;
        int e;
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        final Boolean[] boolArr = {Boolean.FALSE};
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    return false;
                }
                if (!this.t) {
                    Log.e("RadialPickerLayout", "Input was disabled, but received ACTION_MOVE.");
                    return true;
                }
                float abs = Math.abs(y - this.n);
                float abs2 = Math.abs(x - this.l);
                if (!this.h) {
                    float f = (float) this.a;
                    if (abs2 <= f && abs <= f) {
                        return false;
                    }
                }
                int i2 = this.r;
                if (i2 == 0 || i2 == 1) {
                    this.m.removeCallbacksAndMessages(null);
                    if (this.e.e(x, y) == this.r) {
                        return false;
                    }
                    this.e.setAmOrPmPressed(-1);
                    this.e.invalidate();
                } else if (this.f96o == -1) {
                    return false;
                } else {
                    this.h = true;
                    this.m.removeCallbacksAndMessages(null);
                    int e2 = e(x, y, true, boolArr);
                    if (e2 == -1) {
                        return true;
                    }
                    OR5DataPenerimaFragment e3 = e(e(e2, boolArr[0].booleanValue(), false), b());
                    e(e3, true, b());
                    if (e3 == null) {
                        return true;
                    }
                    OR5DataPenerimaFragment oR5DataPenerimaFragment = this.x;
                    if (oR5DataPenerimaFragment != null && oR5DataPenerimaFragment.equals(e3)) {
                        return true;
                    }
                    this.g.i();
                    this.x = e3;
                    this.y.c(e3);
                    return true;
                }
            } else if (!this.t) {
                Log.d("RadialPickerLayout", "Input was disabled, but received ACTION_UP.");
                this.y.b();
                return true;
            } else {
                this.m.removeCallbacksAndMessages(null);
                this.i = false;
                int i3 = this.r;
                if (i3 == 0 || i3 == 1) {
                    int e4 = this.e.e(x, y);
                    this.e.setAmOrPmPressed(-1);
                    this.e.invalidate();
                    if (e4 == this.r) {
                        this.e.setAmOrPm(e4);
                        if (c() != e4) {
                            OR5DataPenerimaFragment oR5DataPenerimaFragment2 = new OR5DataPenerimaFragment(this.b);
                            int i4 = this.r;
                            if (i4 == 0) {
                                int i5 = oR5DataPenerimaFragment2.e;
                                if (i5 >= 12) {
                                    oR5DataPenerimaFragment2.e = i5 % 12;
                                }
                            } else if (i4 == 1 && (i = oR5DataPenerimaFragment2.e) < 12) {
                                oR5DataPenerimaFragment2.e = (i + 12) % 24;
                            }
                            OR5DataPenerimaFragment e5 = e(oR5DataPenerimaFragment2, 0);
                            e(e5, false, 0);
                            this.b = e5;
                            this.y.c(e5);
                        }
                    }
                } else {
                    if (!(this.f96o == -1 || (e = e(x, y, this.h, boolArr)) == -1)) {
                        OR5DataPenerimaFragment e6 = e(e(e, boolArr[0].booleanValue(), !this.h), b());
                        e(e6, false, b());
                        this.b = e6;
                        this.y.c(e6);
                        this.y.c(b());
                    }
                    this.h = false;
                    return true;
                }
            }
            this.r = -1;
            return false;
        } else if (!this.t) {
            return true;
        } else {
            this.l = x;
            this.n = y;
            this.x = null;
            this.h = false;
            this.i = true;
            if (this.s || this.g.e() != OR4DataBankPenerimaFragment_ViewBinding.write.VERSION_1) {
                this.r = -1;
            } else {
                this.r = this.e.e(x, y);
            }
            int i6 = this.r;
            if (i6 == 0 || i6 == 1) {
                this.g.i();
                this.f96o = -1;
                this.m.postDelayed(new Runnable() { // from class: o.showInfoHubunganKeuanganOR.5
                    @Override // java.lang.Runnable
                    public final void run() {
                        showInfoHubunganKeuanganOR.this.e.setAmOrPmPressed(showInfoHubunganKeuanganOR.this.r);
                        showInfoHubunganKeuanganOR.this.e.invalidate();
                    }
                }, (long) this.d);
                return true;
            }
            int e7 = e(x, y, this.c.isTouchExplorationEnabled(), boolArr);
            this.f96o = e7;
            if (this.g.d(e(e7, boolArr[0].booleanValue(), false), b())) {
                this.f96o = -1;
            }
            if (this.f96o == -1) {
                return true;
            }
            this.g.i();
            this.m.postDelayed(new Runnable() { // from class: o.showInfoHubunganKeuanganOR.3
                @Override // java.lang.Runnable
                public final void run() {
                    showInfoHubunganKeuanganOR.this.h = true;
                    showInfoHubunganKeuanganOR showinfohubungankeuanganor = showInfoHubunganKeuanganOR.this;
                    showinfohubungankeuanganor.x = showinfohubungankeuanganor.e(showinfohubungankeuanganor.f96o, boolArr[0].booleanValue(), false);
                    showInfoHubunganKeuanganOR showinfohubungankeuanganor2 = showInfoHubunganKeuanganOR.this;
                    showinfohubungankeuanganor2.x = showinfohubungankeuanganor2.e(showinfohubungankeuanganor2.x, showInfoHubunganKeuanganOR.this.b());
                    showInfoHubunganKeuanganOR showinfohubungankeuanganor3 = showInfoHubunganKeuanganOR.this;
                    showinfohubungankeuanganor3.e(showinfohubungankeuanganor3.x, true, showInfoHubunganKeuanganOR.this.b());
                    showInfoHubunganKeuanganOR.this.y.c(showInfoHubunganKeuanganOR.this.x);
                }
            }, (long) this.d);
            return true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0131  */
    @Override // android.view.View
    /* Code decompiled incorrectly, please refer to instructions dump */
    public boolean performAccessibilityAction(int r7, android.os.Bundle r8) {
        /*
        // Method dump skipped, instructions count: 366
        */
        throw new UnsupportedOperationException("Method not decompiled: o.showInfoHubunganKeuanganOR.performAccessibilityAction(int, android.os.Bundle):boolean");
    }

    public void setAmOrPm(int i) {
        int i2;
        this.e.setAmOrPm(i);
        this.e.invalidate();
        OR5DataPenerimaFragment oR5DataPenerimaFragment = new OR5DataPenerimaFragment(this.b);
        if (i == 0) {
            int i3 = oR5DataPenerimaFragment.e;
            if (i3 >= 12) {
                oR5DataPenerimaFragment.e = i3 % 12;
            }
        } else if (i == 1 && (i2 = oR5DataPenerimaFragment.e) < 12) {
            oR5DataPenerimaFragment.e = (i2 + 12) % 24;
        }
        OR5DataPenerimaFragment e = e(oR5DataPenerimaFragment, 0);
        e(e, false, 0);
        this.b = e;
        this.y.c(e);
    }

    public void setCurrentItemShowing(int i, boolean z) {
        if (i == 0 || i == 1 || i == 2) {
            int b = b();
            this.f = i;
            e(this.b, true, i);
            if (!z || i == b) {
                b(i);
                return;
            }
            ObjectAnimator[] objectAnimatorArr = new ObjectAnimator[4];
            if (i == 1 && b == 0) {
                objectAnimatorArr[0] = this.q.b();
                objectAnimatorArr[1] = this.p.d();
                objectAnimatorArr[2] = this.w.d();
                objectAnimatorArr[3] = this.v.c();
            } else if (i == 0 && b == 1) {
                objectAnimatorArr[0] = this.q.d();
                objectAnimatorArr[1] = this.p.c();
                objectAnimatorArr[2] = this.w.b();
                objectAnimatorArr[3] = this.v.d();
            } else if (i == 1 && b == 2) {
                objectAnimatorArr[0] = this.C.b();
                objectAnimatorArr[1] = this.u.d();
                objectAnimatorArr[2] = this.w.d();
                objectAnimatorArr[3] = this.v.c();
            } else if (i == 0 && b == 2) {
                objectAnimatorArr[0] = this.C.b();
                objectAnimatorArr[1] = this.u.d();
                objectAnimatorArr[2] = this.q.d();
                objectAnimatorArr[3] = this.p.c();
            } else if (i == 2 && b == 1) {
                objectAnimatorArr[0] = this.C.d();
                objectAnimatorArr[1] = this.u.c();
                objectAnimatorArr[2] = this.w.b();
                objectAnimatorArr[3] = this.v.d();
            } else if (i == 2 && b == 0) {
                objectAnimatorArr[0] = this.C.d();
                objectAnimatorArr[1] = this.u.c();
                objectAnimatorArr[2] = this.q.b();
                objectAnimatorArr[3] = this.p.d();
            }
            if (objectAnimatorArr[0] == null || objectAnimatorArr[1] == null || objectAnimatorArr[2] == null || objectAnimatorArr[3] == null) {
                b(i);
                return;
            }
            AnimatorSet animatorSet = this.D;
            if (animatorSet != null && animatorSet.isRunning()) {
                this.D.end();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.D = animatorSet2;
            animatorSet2.playTogether(objectAnimatorArr);
            this.D.start();
            return;
        }
        StringBuilder sb = new StringBuilder("TimePicker does not support view at index ");
        sb.append(i);
        Log.e("RadialPickerLayout", sb.toString());
    }

    public void setOnValueSelectedListener(read read2) {
        this.y = read2;
    }

    public void setTime(OR5DataPenerimaFragment oR5DataPenerimaFragment) {
        OR5DataPenerimaFragment e = e(oR5DataPenerimaFragment, 0);
        this.b = e;
        e(e, false, 0);
    }
}
