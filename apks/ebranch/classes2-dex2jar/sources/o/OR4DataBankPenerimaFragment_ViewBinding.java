package o;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import o.OR5DataPenerimaFragment;
import o.pilihJenisKodeBank;
import o.showInfoHubunganKeuanganOR;
/* loaded from: classes2-dex2jar.jar:o/OR4DataBankPenerimaFragment_ViewBinding.class */
public final class OR4DataBankPenerimaFragment_ViewBinding extends DialogFragment implements showInfoHubunganKeuanganOR.read, onChooseTipeTujuanTransaksiPenerima {
    private boolean A;
    private String B;
    private OR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver C;
    private OR5DataPenerimaFragment D;
    private int E;
    private TextView F;
    private Button G;
    private int H;
    private TextView I;
    private DialogInterface.OnDismissListener J;
    private String K;
    private int L;
    private DialogInterface.OnCancelListener M;
    private char N;
    private String O;
    private TextView P;
    private TextView Q;
    private TextView R;
    private String S;
    private String T;
    private String U;
    private boolean V;
    private int W;
    private String X;
    private boolean Y;
    private ArrayList<Integer> Z;
    pilihJenisMataUang a;
    private String aa;
    private write ab;
    private int ac;
    showInfoCodewordnOR b;
    boolean c;
    read d;
    showInfoHubunganKeuanganOR e;
    private int f;
    private boolean g;
    private String h;
    private View j;
    private String k;
    private Button l;
    private int m;
    private TextView n;

    /* renamed from: o */
    private int f43o;
    private boolean p;
    private OR4DataBankPenerimaFragment q;
    private String r;
    private boolean s;
    private String t;
    private TextView u;
    private boolean v;
    private boolean w;
    private TextView x;
    private String y;
    private int i = -1;
    private Locale z = Locale.getDefault();

    /* loaded from: classes2-dex2jar.jar:o/OR4DataBankPenerimaFragment_ViewBinding$IconCompatParcelizer.class */
    public final class IconCompatParcelizer implements View.OnKeyListener {
        private IconCompatParcelizer() {
            OR4DataBankPenerimaFragment_ViewBinding.this = r4;
        }

        /* synthetic */ IconCompatParcelizer(OR4DataBankPenerimaFragment_ViewBinding oR4DataBankPenerimaFragment_ViewBinding, byte b) {
            this();
        }

        @Override // android.view.View.OnKeyListener
        public final boolean onKey(View view, int i, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 1) {
                return OR4DataBankPenerimaFragment_ViewBinding.e(OR4DataBankPenerimaFragment_ViewBinding.this, i);
            }
            return false;
        }
    }

    /* loaded from: classes2-dex2jar.jar:o/OR4DataBankPenerimaFragment_ViewBinding$read.class */
    public interface read {
    }

    /* loaded from: classes2-dex2jar.jar:o/OR4DataBankPenerimaFragment_ViewBinding$write.class */
    public enum write {
        VERSION_1,
        VERSION_2
    }

    public OR4DataBankPenerimaFragment_ViewBinding() {
        OR4DataBankPenerimaFragment oR4DataBankPenerimaFragment = new OR4DataBankPenerimaFragment();
        this.q = oR4DataBankPenerimaFragment;
        this.b = oR4DataBankPenerimaFragment;
    }

    private int a(int i) {
        if (this.f == -1 || this.L == -1) {
            KeyCharacterMap load = KeyCharacterMap.load(-1);
            int i2 = 0;
            while (true) {
                if (i2 >= Math.max(this.h.length(), this.O.length())) {
                    break;
                }
                char charAt = this.h.toLowerCase(this.z).charAt(i2);
                char charAt2 = this.O.toLowerCase(this.z).charAt(i2);
                if (charAt != charAt2) {
                    KeyEvent[] events = load.getEvents(new char[]{charAt, charAt2});
                    if (events == null || events.length != 4) {
                        Log.e("TimePickerDialog", "Unable to find keycodes for AM and PM.");
                    } else {
                        this.f = events[0].getKeyCode();
                        this.L = events[2].getKeyCode();
                    }
                } else {
                    i2++;
                }
            }
        }
        if (i == 0) {
            return this.f;
        }
        if (i == 1) {
            return this.L;
        }
        return -1;
    }

    private void a(boolean z) {
        Boolean bool = Boolean.FALSE;
        int i = 0;
        if (z || !this.Z.isEmpty()) {
            Boolean[] boolArr = {bool, bool, bool};
            int[] c = c(boolArr);
            String str = "%2d";
            String str2 = boolArr[0].booleanValue() ? "%02d" : "%2d";
            String str3 = boolArr[1].booleanValue() ? "%02d" : "%2d";
            if (boolArr[1].booleanValue()) {
                str = "%02d";
            }
            int i2 = c[0];
            String replace = i2 == -1 ? this.t : String.format(str2, Integer.valueOf(i2)).replace(' ', this.N);
            int i3 = c[1];
            String replace2 = i3 == -1 ? this.t : String.format(str3, Integer.valueOf(i3)).replace(' ', this.N);
            String replace3 = c[2] == -1 ? this.t : String.format(str, Integer.valueOf(c[1])).replace(' ', this.N);
            this.x.setText(replace);
            this.u.setText(replace);
            this.x.setTextColor(this.ac);
            this.I.setText(replace2);
            this.F.setText(replace2);
            this.I.setTextColor(this.ac);
            this.Q.setText(replace3);
            this.P.setText(replace3);
            this.Q.setTextColor(this.ac);
            if (!this.A) {
                i(c[3]);
                return;
            }
            return;
        }
        int i4 = this.e.b.e;
        int i5 = this.e.b.b;
        int i6 = this.e.b.a;
        e(i4, true);
        e(i5);
        j(i6);
        if (!this.A) {
            if (i4 >= 12) {
                i = 1;
            }
            i(i);
        }
        c(this.e.b(), true, true, true);
        this.G.setEnabled(true);
    }

    private static int b(int i) {
        switch (i) {
            case 7:
                return 0;
            case 8:
                return 1;
            case 9:
                return 2;
            case 10:
                return 3;
            case 11:
                return 4;
            case 12:
                return 5;
            case 13:
                return 6;
            case 14:
                return 7;
            case 15:
                return 8;
            case 16:
                return 9;
            default:
                return -1;
        }
    }

    public void b(boolean z) {
        Boolean bool = Boolean.FALSE;
        this.w = false;
        if (!this.Z.isEmpty()) {
            int[] c = c(new Boolean[]{bool, bool, bool});
            this.e.setTime(new OR5DataPenerimaFragment(c[0], c[1], c[2]));
            if (!this.A) {
                this.e.setAmOrPm(c[3]);
            }
            this.Z.clear();
        }
        if (z) {
            a(false);
            this.e.a(true);
        }
    }

    public void c(int i, boolean z, boolean z2, boolean z3) {
        TextView textView;
        this.e.setCurrentItemShowing(i, z);
        if (i == 0) {
            int i2 = this.e.b.e;
            int i3 = i2;
            if (!this.A) {
                i3 = i2 % 12;
            }
            showInfoHubunganKeuanganOR showinfohubungankeuanganor = this.e;
            StringBuilder sb = new StringBuilder();
            sb.append(this.y);
            sb.append(": ");
            sb.append(i3);
            showinfohubungankeuanganor.setContentDescription(sb.toString());
            if (z3) {
                showInfoHubunganKeuanganOR showinfohubungankeuanganor2 = this.e;
                String str = this.X;
                if (!(showinfohubungankeuanganor2 == null || str == null)) {
                    showinfohubungankeuanganor2.announceForAccessibility(str);
                }
            }
            textView = this.x;
        } else if (i != 1) {
            int i4 = this.e.b.a;
            showInfoHubunganKeuanganOR showinfohubungankeuanganor3 = this.e;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.S);
            sb2.append(": ");
            sb2.append(i4);
            showinfohubungankeuanganor3.setContentDescription(sb2.toString());
            if (z3) {
                showInfoHubunganKeuanganOR showinfohubungankeuanganor4 = this.e;
                String str2 = this.T;
                if (!(showinfohubungankeuanganor4 == null || str2 == null)) {
                    showinfohubungankeuanganor4.announceForAccessibility(str2);
                }
            }
            textView = this.Q;
        } else {
            int i5 = this.e.b.b;
            showInfoHubunganKeuanganOR showinfohubungankeuanganor5 = this.e;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(this.B);
            sb3.append(": ");
            sb3.append(i5);
            showinfohubungankeuanganor5.setContentDescription(sb3.toString());
            if (z3) {
                showInfoHubunganKeuanganOR showinfohubungankeuanganor6 = this.e;
                String str3 = this.U;
                if (!(showinfohubungankeuanganor6 == null || str3 == null)) {
                    showinfohubungankeuanganor6.announceForAccessibility(str3);
                }
            }
            textView = this.I;
        }
        int i6 = i == 0 ? this.W : this.ac;
        int i7 = i == 1 ? this.W : this.ac;
        int i8 = i == 2 ? this.W : this.ac;
        this.x.setTextColor(i6);
        this.I.setTextColor(i7);
        this.Q.setTextColor(i8);
        ObjectAnimator d = pilihNegaraTujuan.d(textView, 0.85f, 1.1f);
        if (z2) {
            d.setStartDelay(300);
        }
        d.start();
    }

    private int[] c(Boolean[] boolArr) {
        int i;
        int i2;
        boolean z = this.A;
        Boolean bool = Boolean.TRUE;
        int i3 = -1;
        if (z || !k()) {
            i = -1;
            i2 = 1;
        } else {
            ArrayList<Integer> arrayList = this.Z;
            int intValue = arrayList.get(arrayList.size() - 1).intValue();
            i = intValue == a(0) ? 0 : intValue == a(1) ? 1 : -1;
            i2 = 2;
        }
        int i4 = this.v ? 2 : 0;
        int i5 = -1;
        int i6 = 0;
        for (int i7 = i2; i7 <= this.Z.size(); i7++) {
            ArrayList<Integer> arrayList2 = this.Z;
            int b = b(arrayList2.get(arrayList2.size() - i7).intValue());
            i6 = i6;
            if (this.v) {
                if (i7 == i2) {
                    i6 = b;
                } else {
                    i6 = i6;
                    if (i7 == i2 + 1) {
                        int i8 = i6 + (b * 10);
                        i6 = i8;
                        if (b == 0) {
                            boolArr[2] = bool;
                            i6 = i8;
                        }
                    }
                }
            }
            if (this.s) {
                int i9 = i2 + i4;
                if (i7 == i9) {
                    i3 = i3;
                    i5 = b;
                } else if (i7 == i9 + 1) {
                    int i10 = i5 + (b * 10);
                    i3 = i3;
                    i5 = i10;
                    if (b == 0) {
                        boolArr[1] = bool;
                        i3 = i3;
                        i5 = i10;
                    }
                } else {
                    if (i7 != i9 + 2) {
                        i3 = i3;
                        i5 = i5;
                        if (i7 == i9 + 3) {
                            int i11 = i3 + (b * 10);
                            i3 = i11;
                            i5 = i5;
                            if (b == 0) {
                                boolArr[0] = bool;
                                i3 = i11;
                                i5 = i5;
                            }
                        }
                    }
                    i3 = b;
                    i5 = i5;
                }
            } else {
                int i12 = i2 + i4;
                if (i7 != i12) {
                    i3 = i3;
                    i5 = i5;
                    if (i7 == i12 + 1) {
                        int i13 = i3 + (b * 10);
                        i3 = i13;
                        i5 = i5;
                        if (b == 0) {
                            boolArr[0] = bool;
                            i5 = i5;
                            i3 = i13;
                        }
                    }
                }
                i3 = b;
                i5 = i5;
            }
        }
        return new int[]{i3, i5, i6, i};
    }

    private boolean d(int i) {
        boolean z = this.s;
        int i2 = (!z || this.v) ? 6 : 4;
        int i3 = i2;
        if (!z) {
            i3 = i2;
            if (!this.v) {
                i3 = 2;
            }
        }
        if (this.A && this.Z.size() == i3) {
            return false;
        }
        if (!this.A && k()) {
            return false;
        }
        this.Z.add(Integer.valueOf(i));
        if (!m()) {
            f();
            return false;
        }
        int b = b(i);
        showInfoHubunganKeuanganOR showinfohubungankeuanganor = this.e;
        String format = String.format(this.z, "%d", Integer.valueOf(b));
        if (!(showinfohubungankeuanganor == null || format == null)) {
            showinfohubungankeuanganor.announceForAccessibility(format);
        }
        if (!k()) {
            return true;
        }
        if (!this.A && this.Z.size() <= i3 - 1) {
            ArrayList<Integer> arrayList = this.Z;
            arrayList.add(arrayList.size() - 1, 7);
            ArrayList<Integer> arrayList2 = this.Z;
            arrayList2.add(arrayList2.size() - 1, 7);
        }
        this.G.setEnabled(true);
        return true;
    }

    private void e(int i) {
        int i2 = i;
        if (i == 60) {
            i2 = 0;
        }
        String format = String.format(this.z, "%02d", Integer.valueOf(i2));
        showInfoHubunganKeuanganOR showinfohubungankeuanganor = this.e;
        if (!(showinfohubungankeuanganor == null || format == null)) {
            showinfohubungankeuanganor.announceForAccessibility(format);
        }
        this.I.setText(format);
        this.F.setText(format);
    }

    private void e(int i, boolean z) {
        String str;
        showInfoHubunganKeuanganOR showinfohubungankeuanganor;
        if (this.A) {
            str = "%02d";
        } else {
            int i2 = i % 12;
            str = "%d";
            i = i2;
            if (i2 == 0) {
                i = 12;
                str = "%d";
            }
        }
        String format = String.format(this.z, str, Integer.valueOf(i));
        this.x.setText(format);
        this.u.setText(format);
        if (z && (showinfohubungankeuanganor = this.e) != null && format != null) {
            showinfohubungankeuanganor.announceForAccessibility(format);
        }
    }

    static /* synthetic */ boolean e(OR4DataBankPenerimaFragment_ViewBinding oR4DataBankPenerimaFragment_ViewBinding, int i) {
        if (i == 111 || i == 4) {
            if (!oR4DataBankPenerimaFragment_ViewBinding.isCancelable()) {
                return true;
            }
            oR4DataBankPenerimaFragment_ViewBinding.dismiss();
            return true;
        } else if (i == 61) {
            if (!oR4DataBankPenerimaFragment_ViewBinding.w) {
                return false;
            }
            if (!oR4DataBankPenerimaFragment_ViewBinding.k()) {
                return true;
            }
            oR4DataBankPenerimaFragment_ViewBinding.b(true);
            return true;
        } else if (i == 66) {
            if (oR4DataBankPenerimaFragment_ViewBinding.w) {
                if (!oR4DataBankPenerimaFragment_ViewBinding.k()) {
                    return true;
                }
                oR4DataBankPenerimaFragment_ViewBinding.b(false);
            }
            if (oR4DataBankPenerimaFragment_ViewBinding.d != null) {
                int i2 = oR4DataBankPenerimaFragment_ViewBinding.e.b.e;
                int i3 = oR4DataBankPenerimaFragment_ViewBinding.e.b.b;
                int i4 = oR4DataBankPenerimaFragment_ViewBinding.e.b.a;
            }
            oR4DataBankPenerimaFragment_ViewBinding.dismiss();
            return true;
        } else if (i != 67) {
            if (!(i == 7 || i == 8 || i == 9 || i == 10 || i == 11 || i == 12 || i == 13 || i == 14 || i == 15 || i == 16)) {
                if (oR4DataBankPenerimaFragment_ViewBinding.A) {
                    return false;
                }
                if (!(i == oR4DataBankPenerimaFragment_ViewBinding.a(0) || i == oR4DataBankPenerimaFragment_ViewBinding.a(1))) {
                    return false;
                }
            }
            if (!oR4DataBankPenerimaFragment_ViewBinding.w) {
                if (oR4DataBankPenerimaFragment_ViewBinding.e == null) {
                    Log.e("TimePickerDialog", "Unable to initiate keyboard mode, TimePicker was null.");
                    return true;
                }
                oR4DataBankPenerimaFragment_ViewBinding.Z.clear();
                oR4DataBankPenerimaFragment_ViewBinding.g(i);
                return true;
            } else if (!oR4DataBankPenerimaFragment_ViewBinding.d(i)) {
                return true;
            } else {
                oR4DataBankPenerimaFragment_ViewBinding.a(false);
                return true;
            }
        } else if (!oR4DataBankPenerimaFragment_ViewBinding.w || oR4DataBankPenerimaFragment_ViewBinding.Z.isEmpty()) {
            return false;
        } else {
            int f = oR4DataBankPenerimaFragment_ViewBinding.f();
            String format = f == oR4DataBankPenerimaFragment_ViewBinding.a(0) ? oR4DataBankPenerimaFragment_ViewBinding.h : f == oR4DataBankPenerimaFragment_ViewBinding.a(1) ? oR4DataBankPenerimaFragment_ViewBinding.O : String.format(oR4DataBankPenerimaFragment_ViewBinding.z, "%d", Integer.valueOf(b(f)));
            showInfoHubunganKeuanganOR showinfohubungankeuanganor = oR4DataBankPenerimaFragment_ViewBinding.e;
            String format2 = String.format(oR4DataBankPenerimaFragment_ViewBinding.r, format);
            if (!(showinfohubungankeuanganor == null || format2 == null)) {
                showinfohubungankeuanganor.announceForAccessibility(format2);
            }
            oR4DataBankPenerimaFragment_ViewBinding.a(true);
            return false;
        }
    }

    private int f() {
        ArrayList<Integer> arrayList = this.Z;
        int intValue = arrayList.remove(arrayList.size() - 1).intValue();
        if (!k()) {
            this.G.setEnabled(false);
        }
        return intValue;
    }

    private void g() {
        this.C = new OR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver(new int[0]);
        boolean z = this.s;
        if (!z && this.A) {
            OR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver oR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver = new OR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver(7, 8);
            this.C.a.add(oR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver);
            oR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.a.add(new OR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver(7, 8, 9, 10, 11, 12, 13, 14, 15, 16));
            OR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver oR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver2 = new OR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver(9);
            this.C.a.add(oR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver2);
            oR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver2.a.add(new OR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver(7, 8, 9, 10));
        } else if (!z && !this.A) {
            OR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver oR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver3 = new OR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver(a(0), a(1));
            OR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver oR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver4 = new OR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver(8);
            this.C.a.add(oR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver4);
            oR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver4.a.add(oR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver3);
            OR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver oR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver5 = new OR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver(7, 8, 9);
            oR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver4.a.add(oR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver5);
            oR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver5.a.add(oR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver3);
            OR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver oR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver6 = new OR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver(9, 10, 11, 12, 13, 14, 15, 16);
            this.C.a.add(oR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver6);
            oR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver6.a.add(oR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver3);
        } else if (this.A) {
            OR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver oR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver7 = new OR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver(7, 8, 9, 10, 11, 12);
            OR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver oR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver8 = new OR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver(7, 8, 9, 10, 11, 12, 13, 14, 15, 16);
            oR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver7.a.add(oR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver8);
            if (this.v) {
                OR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver oR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver9 = new OR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver(7, 8, 9, 10, 11, 12);
                oR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver9.a.add(new OR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver(7, 8, 9, 10, 11, 12, 13, 14, 15, 16));
                oR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver8.a.add(oR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver9);
            }
            OR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver oR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver10 = new OR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver(7, 8);
            this.C.a.add(oR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver10);
            OR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver oR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver11 = new OR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver(7, 8, 9, 10, 11, 12);
            oR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver10.a.add(oR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver11);
            oR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver11.a.add(oR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver7);
            oR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver11.a.add(new OR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver(13, 14, 15, 16));
            OR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver oR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver12 = new OR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver(13, 14, 15, 16);
            oR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver10.a.add(oR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver12);
            oR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver12.a.add(oR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver7);
            OR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver oR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver13 = new OR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver(9);
            this.C.a.add(oR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver13);
            OR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver oR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver14 = new OR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver(7, 8, 9, 10);
            oR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver13.a.add(oR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver14);
            oR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver14.a.add(oR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver7);
            OR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver oR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver15 = new OR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver(11, 12);
            oR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver13.a.add(oR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver15);
            oR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver15.a.add(oR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver8);
            OR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver oR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver16 = new OR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver(10, 11, 12, 13, 14, 15, 16);
            this.C.a.add(oR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver16);
            oR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver16.a.add(oR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver7);
        } else {
            OR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver oR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver17 = new OR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver(a(0), a(1));
            OR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver oR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver18 = new OR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver(7, 8, 9, 10, 11, 12);
            OR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver oR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver19 = new OR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver(7, 8, 9, 10, 11, 12, 13, 14, 15, 16);
            oR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver19.a.add(oR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver17);
            oR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver18.a.add(oR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver19);
            OR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver oR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver20 = new OR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver(8);
            this.C.a.add(oR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver20);
            oR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver20.a.add(oR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver17);
            OR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver oR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver21 = new OR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver(7, 8, 9);
            oR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver20.a.add(oR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver21);
            oR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver21.a.add(oR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver17);
            OR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver oR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver22 = new OR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver(7, 8, 9, 10, 11, 12);
            oR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver21.a.add(oR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver22);
            oR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver22.a.add(oR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver17);
            OR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver oR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver23 = new OR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver(7, 8, 9, 10, 11, 12, 13, 14, 15, 16);
            oR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver22.a.add(oR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver23);
            oR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver23.a.add(oR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver17);
            if (this.v) {
                oR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver23.a.add(oR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver18);
            }
            OR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver oR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver24 = new OR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver(13, 14, 15, 16);
            oR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver21.a.add(oR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver24);
            oR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver24.a.add(oR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver17);
            if (this.v) {
                oR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver24.a.add(oR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver18);
            }
            OR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver oR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver25 = new OR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver(10, 11, 12);
            oR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver20.a.add(oR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver25);
            OR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver oR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver26 = new OR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver(7, 8, 9, 10, 11, 12, 13, 14, 15, 16);
            oR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver25.a.add(oR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver26);
            oR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver26.a.add(oR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver17);
            if (this.v) {
                oR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver26.a.add(oR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver18);
            }
            OR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver oR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver27 = new OR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver(9, 10, 11, 12, 13, 14, 15, 16);
            this.C.a.add(oR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver27);
            oR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver27.a.add(oR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver17);
            OR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver oR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver28 = new OR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver(7, 8, 9, 10, 11, 12);
            oR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver27.a.add(oR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver28);
            OR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver oR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver29 = new OR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver(7, 8, 9, 10, 11, 12, 13, 14, 15, 16);
            oR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver28.a.add(oR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver29);
            oR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver29.a.add(oR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver17);
            if (this.v) {
                oR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver29.a.add(oR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver18);
            }
        }
    }

    private void g(int i) {
        if (!this.e.a(false)) {
            return;
        }
        if (i == -1 || d(i)) {
            this.w = true;
            this.G.setEnabled(false);
            a(false);
        }
    }

    private void i(int i) {
        if (this.ab == write.VERSION_2) {
            if (i == 0) {
                this.n.setTextColor(this.W);
                this.R.setTextColor(this.ac);
                showInfoHubunganKeuanganOR showinfohubungankeuanganor = this.e;
                String str = this.h;
                if (showinfohubungankeuanganor != null && str != null) {
                    showinfohubungankeuanganor.announceForAccessibility(str);
                    return;
                }
                return;
            }
            this.n.setTextColor(this.ac);
            this.R.setTextColor(this.W);
            showInfoHubunganKeuanganOR showinfohubungankeuanganor2 = this.e;
            String str2 = this.O;
            if (showinfohubungankeuanganor2 != null && str2 != null) {
                showinfohubungankeuanganor2.announceForAccessibility(str2);
            }
        } else if (i == 0) {
            this.R.setText(this.h);
            showInfoHubunganKeuanganOR showinfohubungankeuanganor3 = this.e;
            String str3 = this.h;
            if (!(showinfohubungankeuanganor3 == null || str3 == null)) {
                showinfohubungankeuanganor3.announceForAccessibility(str3);
            }
            this.R.setContentDescription(this.h);
        } else if (i == 1) {
            this.R.setText(this.O);
            showInfoHubunganKeuanganOR showinfohubungankeuanganor4 = this.e;
            String str4 = this.O;
            if (!(showinfohubungankeuanganor4 == null || str4 == null)) {
                showinfohubungankeuanganor4.announceForAccessibility(str4);
            }
            this.R.setContentDescription(this.O);
        } else {
            this.R.setText(this.t);
        }
    }

    private void j(int i) {
        int i2 = i;
        if (i == 60) {
            i2 = 0;
        }
        String format = String.format(this.z, "%02d", Integer.valueOf(i2));
        showInfoHubunganKeuanganOR showinfohubungankeuanganor = this.e;
        if (!(showinfohubungankeuanganor == null || format == null)) {
            showinfohubungankeuanganor.announceForAccessibility(format);
        }
        this.Q.setText(format);
        this.P.setText(format);
    }

    public boolean k() {
        boolean z = this.A;
        Boolean bool = Boolean.FALSE;
        boolean z2 = false;
        if (z) {
            int[] c = c(new Boolean[]{bool, bool, bool});
            boolean z3 = false;
            if (c[0] >= 0) {
                int i = c[1];
                z3 = false;
                if (i >= 0) {
                    z3 = false;
                    if (i < 60) {
                        int i2 = c[2];
                        z3 = false;
                        if (i2 >= 0) {
                            z3 = i2 < 60;
                        }
                    }
                }
            }
            return z3;
        }
        if (this.Z.contains(Integer.valueOf(a(0))) || this.Z.contains(Integer.valueOf(a(1)))) {
            z2 = true;
        }
        return z2;
    }

    private boolean m() {
        OR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver oR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver = this.C;
        Iterator<Integer> it = this.Z.iterator();
        while (it.hasNext()) {
            OR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver d = oR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.d(it.next().intValue());
            oR4DataBankPenerimaFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver = d;
            if (d == null) {
                return false;
            }
        }
        return true;
    }

    @Override // o.onChooseTipeTujuanTransaksiPenerima
    public final boolean a() {
        return this.A;
    }

    @Override // o.showInfoHubunganKeuanganOR.read
    public final void b() {
        if (!k()) {
            this.Z.clear();
        }
        b(true);
    }

    @Override // o.onChooseTipeTujuanTransaksiPenerima
    public final int c() {
        return this.i;
    }

    @Override // o.showInfoHubunganKeuanganOR.read
    public final void c(int i) {
        if (this.g) {
            if (i == 0 && this.s) {
                c(1, true, true, false);
                StringBuilder sb = new StringBuilder();
                sb.append(this.X);
                sb.append(". ");
                sb.append(this.e.b.b);
                String obj = sb.toString();
                showInfoHubunganKeuanganOR showinfohubungankeuanganor = this.e;
                if (showinfohubungankeuanganor != null && obj != null) {
                    showinfohubungankeuanganor.announceForAccessibility(obj);
                }
            } else if (i == 1 && this.v) {
                c(2, true, true, false);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.U);
                sb2.append(". ");
                sb2.append(this.e.b.a);
                String obj2 = sb2.toString();
                showInfoHubunganKeuanganOR showinfohubungankeuanganor2 = this.e;
                if (showinfohubungankeuanganor2 != null && obj2 != null) {
                    showinfohubungankeuanganor2.announceForAccessibility(obj2);
                }
            }
        }
    }

    @Override // o.showInfoHubunganKeuanganOR.read
    public final void c(OR5DataPenerimaFragment oR5DataPenerimaFragment) {
        int i = 0;
        e(oR5DataPenerimaFragment.e, false);
        showInfoHubunganKeuanganOR showinfohubungankeuanganor = this.e;
        StringBuilder sb = new StringBuilder();
        sb.append(this.y);
        sb.append(": ");
        sb.append(oR5DataPenerimaFragment.e);
        showinfohubungankeuanganor.setContentDescription(sb.toString());
        e(oR5DataPenerimaFragment.b);
        showInfoHubunganKeuanganOR showinfohubungankeuanganor2 = this.e;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.B);
        sb2.append(": ");
        sb2.append(oR5DataPenerimaFragment.b);
        showinfohubungankeuanganor2.setContentDescription(sb2.toString());
        j(oR5DataPenerimaFragment.a);
        showInfoHubunganKeuanganOR showinfohubungankeuanganor3 = this.e;
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.S);
        sb3.append(": ");
        sb3.append(oR5DataPenerimaFragment.a);
        showinfohubungankeuanganor3.setContentDescription(sb3.toString());
        if (!this.A) {
            if (oR5DataPenerimaFragment.e < 12) {
                i = 1;
            }
            i(i ^ 1);
        }
    }

    @Override // o.onChooseTipeTujuanTransaksiPenerima
    public final OR5DataPenerimaFragment d(OR5DataPenerimaFragment oR5DataPenerimaFragment, OR5DataPenerimaFragment.IconCompatParcelizer iconCompatParcelizer) {
        return this.b.b(oR5DataPenerimaFragment, iconCompatParcelizer, this.v ? OR5DataPenerimaFragment.IconCompatParcelizer.SECOND : this.s ? OR5DataPenerimaFragment.IconCompatParcelizer.MINUTE : OR5DataPenerimaFragment.IconCompatParcelizer.HOUR);
    }

    @Override // o.onChooseTipeTujuanTransaksiPenerima
    public final boolean d() {
        return this.b.d();
    }

    @Override // o.onChooseTipeTujuanTransaksiPenerima
    public final boolean d(OR5DataPenerimaFragment oR5DataPenerimaFragment, int i) {
        return this.b.e(oR5DataPenerimaFragment, i, this.v ? OR5DataPenerimaFragment.IconCompatParcelizer.SECOND : this.s ? OR5DataPenerimaFragment.IconCompatParcelizer.MINUTE : OR5DataPenerimaFragment.IconCompatParcelizer.HOUR);
    }

    @Override // o.onChooseTipeTujuanTransaksiPenerima
    public final write e() {
        return this.ab;
    }

    @Override // o.onChooseTipeTujuanTransaksiPenerima
    public final boolean h() {
        return this.V;
    }

    @Override // o.onChooseTipeTujuanTransaksiPenerima
    public final void i() {
        if (this.c) {
            this.a.e();
        }
    }

    @Override // o.onChooseTipeTujuanTransaksiPenerima
    public final boolean j() {
        return this.b.e();
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        onCancel(dialogInterface);
        DialogInterface.OnCancelListener onCancelListener = this.M;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        onConfigurationChanged(configuration);
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup != null) {
            viewGroup.removeAllViewsInLayout();
            viewGroup.addView(onCreateView(getActivity().getLayoutInflater(), viewGroup, null));
        }
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public final void onCreate(Bundle bundle) {
        onCreate(bundle);
        if (bundle != null && bundle.containsKey("initial_time") && bundle.containsKey("is_24_hour_view")) {
            this.D = (OR5DataPenerimaFragment) bundle.getParcelable("initial_time");
            this.A = bundle.getBoolean("is_24_hour_view");
            this.w = bundle.getBoolean("in_kb_mode");
            this.aa = bundle.getString("dialog_title");
            this.V = bundle.getBoolean("theme_dark");
            this.Y = bundle.getBoolean("theme_dark_changed");
            this.i = bundle.getInt("accent");
            this.c = bundle.getBoolean("vibrate");
            this.p = bundle.getBoolean("dismiss");
            this.v = bundle.getBoolean("enable_seconds");
            this.s = bundle.getBoolean("enable_minutes");
            this.E = bundle.getInt("ok_resid");
            this.K = bundle.getString("ok_string");
            this.H = bundle.getInt("ok_color");
            this.m = bundle.getInt("cancel_resid");
            this.k = bundle.getString("cancel_string");
            this.f43o = bundle.getInt("cancel_color");
            this.ab = (write) bundle.getSerializable("version");
            this.b = (showInfoCodewordnOR) bundle.getParcelable("timepoint_limiter");
            this.z = (Locale) bundle.getSerializable("locale");
            showInfoCodewordnOR showinfocodewordnor = this.b;
            this.q = showinfocodewordnor instanceof OR4DataBankPenerimaFragment ? (OR4DataBankPenerimaFragment) showinfocodewordnor : new OR4DataBankPenerimaFragment();
        }
    }

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = onCreateDialog(bundle);
        onCreateDialog.requestWindowFeature(1);
        return onCreateDialog;
    }

    @Override // android.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(this.ab == write.VERSION_1 ? pilihJenisKodeBank.read.e : pilihJenisKodeBank.read.c, viewGroup, false);
        IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(this, (byte) 0);
        inflate.findViewById(pilihJenisKodeBank.RemoteActionCompatParcelizer.C).setOnKeyListener(iconCompatParcelizer);
        if (this.i == -1) {
            Activity activity = getActivity();
            TypedValue typedValue = new TypedValue();
            activity.getTheme().resolveAttribute(16843829, typedValue, true);
            this.i = typedValue.data;
        }
        if (!this.Y) {
            this.V = pilihNegaraTujuan.e(getActivity(), pilihJenisKodeBank$MediaBrowserCompat$CustomActionResultReceiver.b, this.V);
        }
        Resources resources = getResources();
        Activity activity2 = getActivity();
        this.y = resources.getString(pilihJenisKodeBank$MediaBrowserCompat$ItemReceiver.h);
        this.X = resources.getString(pilihJenisKodeBank$MediaBrowserCompat$ItemReceiver.t);
        this.B = resources.getString(pilihJenisKodeBank$MediaBrowserCompat$ItemReceiver.f82o);
        this.U = resources.getString(pilihJenisKodeBank$MediaBrowserCompat$ItemReceiver.u);
        this.S = resources.getString(pilihJenisKodeBank$MediaBrowserCompat$ItemReceiver.q);
        this.T = resources.getString(pilihJenisKodeBank$MediaBrowserCompat$ItemReceiver.v);
        this.W = copyWindowDataInto.a(activity2, pilihJenisKodeBank.IconCompatParcelizer.w);
        this.ac = copyWindowDataInto.a(activity2, pilihJenisKodeBank.IconCompatParcelizer.d);
        TextView textView = (TextView) inflate.findViewById(pilihJenisKodeBank.RemoteActionCompatParcelizer.f83o);
        this.x = textView;
        textView.setOnKeyListener(iconCompatParcelizer);
        this.u = (TextView) inflate.findViewById(pilihJenisKodeBank.RemoteActionCompatParcelizer.k);
        this.F = (TextView) inflate.findViewById(pilihJenisKodeBank.RemoteActionCompatParcelizer.t);
        TextView textView2 = (TextView) inflate.findViewById(pilihJenisKodeBank.RemoteActionCompatParcelizer.m);
        this.I = textView2;
        textView2.setOnKeyListener(iconCompatParcelizer);
        this.P = (TextView) inflate.findViewById(pilihJenisKodeBank.RemoteActionCompatParcelizer.x);
        TextView textView3 = (TextView) inflate.findViewById(pilihJenisKodeBank.RemoteActionCompatParcelizer.w);
        this.Q = textView3;
        textView3.setOnKeyListener(iconCompatParcelizer);
        TextView textView4 = (TextView) inflate.findViewById(pilihJenisKodeBank.RemoteActionCompatParcelizer.c);
        this.n = textView4;
        textView4.setOnKeyListener(iconCompatParcelizer);
        TextView textView5 = (TextView) inflate.findViewById(pilihJenisKodeBank.RemoteActionCompatParcelizer.s);
        this.R = textView5;
        textView5.setOnKeyListener(iconCompatParcelizer);
        this.j = inflate.findViewById(pilihJenisKodeBank.RemoteActionCompatParcelizer.e);
        String[] amPmStrings = new DateFormatSymbols(this.z).getAmPmStrings();
        this.h = amPmStrings[0];
        this.O = amPmStrings[1];
        this.a = new pilihJenisMataUang(getActivity());
        if (this.e != null) {
            this.D = new OR5DataPenerimaFragment(this.e.b.e, this.e.b.b, this.e.b.a);
        }
        this.D = this.b.b(this.D, null, this.v ? OR5DataPenerimaFragment.IconCompatParcelizer.SECOND : this.s ? OR5DataPenerimaFragment.IconCompatParcelizer.MINUTE : OR5DataPenerimaFragment.IconCompatParcelizer.HOUR);
        showInfoHubunganKeuanganOR showinfohubungankeuanganor = (showInfoHubunganKeuanganOR) inflate.findViewById(pilihJenisKodeBank.RemoteActionCompatParcelizer.B);
        this.e = showinfohubungankeuanganor;
        showinfohubungankeuanganor.setOnValueSelectedListener(this);
        this.e.setOnKeyListener(iconCompatParcelizer);
        this.e.a(getActivity(), this.z, this, this.D, this.A);
        c((bundle == null || !bundle.containsKey("current_item_showing")) ? 0 : bundle.getInt("current_item_showing"), false, true, true);
        this.e.invalidate();
        this.x.setOnClickListener(new View.OnClickListener() { // from class: o.OR4DataBankPenerimaFragment_ViewBinding.5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OR4DataBankPenerimaFragment_ViewBinding.this.c(0, true, false, true);
                OR4DataBankPenerimaFragment_ViewBinding oR4DataBankPenerimaFragment_ViewBinding = OR4DataBankPenerimaFragment_ViewBinding.this;
                if (oR4DataBankPenerimaFragment_ViewBinding.c) {
                    oR4DataBankPenerimaFragment_ViewBinding.a.e();
                }
            }
        });
        this.I.setOnClickListener(new View.OnClickListener() { // from class: o.OR4DataBankPenerimaFragment_ViewBinding.3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OR4DataBankPenerimaFragment_ViewBinding.this.c(1, true, false, true);
                OR4DataBankPenerimaFragment_ViewBinding oR4DataBankPenerimaFragment_ViewBinding = OR4DataBankPenerimaFragment_ViewBinding.this;
                if (oR4DataBankPenerimaFragment_ViewBinding.c) {
                    oR4DataBankPenerimaFragment_ViewBinding.a.e();
                }
            }
        });
        this.Q.setOnClickListener(new View.OnClickListener() { // from class: o.OR4DataBankPenerimaFragment_ViewBinding.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OR4DataBankPenerimaFragment_ViewBinding.this.c(2, true, false, true);
                OR4DataBankPenerimaFragment_ViewBinding oR4DataBankPenerimaFragment_ViewBinding = OR4DataBankPenerimaFragment_ViewBinding.this;
                if (oR4DataBankPenerimaFragment_ViewBinding.c) {
                    oR4DataBankPenerimaFragment_ViewBinding.a.e();
                }
            }
        });
        String string = activity2.getResources().getString(pilihJenisKodeBank$MediaBrowserCompat$ItemReceiver.d);
        Button button = (Button) inflate.findViewById(pilihJenisKodeBank.RemoteActionCompatParcelizer.p);
        this.G = button;
        button.setOnClickListener(new View.OnClickListener() { // from class: o.OR4DataBankPenerimaFragment_ViewBinding.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (!OR4DataBankPenerimaFragment_ViewBinding.this.w || !OR4DataBankPenerimaFragment_ViewBinding.this.k()) {
                    OR4DataBankPenerimaFragment_ViewBinding oR4DataBankPenerimaFragment_ViewBinding = OR4DataBankPenerimaFragment_ViewBinding.this;
                    if (oR4DataBankPenerimaFragment_ViewBinding.c) {
                        oR4DataBankPenerimaFragment_ViewBinding.a.e();
                    }
                } else {
                    OR4DataBankPenerimaFragment_ViewBinding.this.b(false);
                }
                OR4DataBankPenerimaFragment_ViewBinding oR4DataBankPenerimaFragment_ViewBinding2 = OR4DataBankPenerimaFragment_ViewBinding.this;
                if (oR4DataBankPenerimaFragment_ViewBinding2.d != null) {
                    int i = oR4DataBankPenerimaFragment_ViewBinding2.e.b.e;
                    int i2 = oR4DataBankPenerimaFragment_ViewBinding2.e.b.b;
                    int i3 = oR4DataBankPenerimaFragment_ViewBinding2.e.b.a;
                }
                OR4DataBankPenerimaFragment_ViewBinding.this.dismiss();
            }
        });
        this.G.setOnKeyListener(iconCompatParcelizer);
        this.G.setTypeface(onChooseNegaraTujuan.d(activity2, string));
        String str = this.K;
        if (str != null) {
            this.G.setText(str);
        } else {
            this.G.setText(this.E);
        }
        Button button2 = (Button) inflate.findViewById(pilihJenisKodeBank.RemoteActionCompatParcelizer.b);
        this.l = button2;
        button2.setOnClickListener(new View.OnClickListener() { // from class: o.OR4DataBankPenerimaFragment_ViewBinding.4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OR4DataBankPenerimaFragment_ViewBinding oR4DataBankPenerimaFragment_ViewBinding = OR4DataBankPenerimaFragment_ViewBinding.this;
                if (oR4DataBankPenerimaFragment_ViewBinding.c) {
                    oR4DataBankPenerimaFragment_ViewBinding.a.e();
                }
                if (OR4DataBankPenerimaFragment_ViewBinding.this.getDialog() != null) {
                    OR4DataBankPenerimaFragment_ViewBinding.this.getDialog().cancel();
                }
            }
        });
        this.l.setTypeface(onChooseNegaraTujuan.d(activity2, string));
        String str2 = this.k;
        if (str2 != null) {
            this.l.setText(str2);
        } else {
            this.l.setText(this.m);
        }
        this.l.setVisibility(isCancelable() ? 0 : 8);
        if (this.A) {
            this.j.setVisibility(8);
        } else {
            AnonymousClass10 r0 = new View.OnClickListener() { // from class: o.OR4DataBankPenerimaFragment_ViewBinding.10
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i;
                    if (!OR4DataBankPenerimaFragment_ViewBinding.this.b.d() && !OR4DataBankPenerimaFragment_ViewBinding.this.b.e()) {
                        OR4DataBankPenerimaFragment_ViewBinding oR4DataBankPenerimaFragment_ViewBinding = OR4DataBankPenerimaFragment_ViewBinding.this;
                        if (oR4DataBankPenerimaFragment_ViewBinding.c) {
                            oR4DataBankPenerimaFragment_ViewBinding.a.e();
                        }
                        int c = OR4DataBankPenerimaFragment_ViewBinding.this.e.c();
                        if (c == 0) {
                            i = 1;
                        } else {
                            i = c;
                            if (c == 1) {
                                i = 0;
                            }
                        }
                        OR4DataBankPenerimaFragment_ViewBinding.this.e.setAmOrPm(i);
                    }
                }
            };
            this.n.setVisibility(8);
            this.R.setVisibility(0);
            this.j.setOnClickListener(r0);
            if (this.ab == write.VERSION_2) {
                this.n.setText(this.h);
                this.R.setText(this.O);
                this.n.setVisibility(0);
            }
            i((this.D.e < 12 ? 1 : 0) ^ 1);
        }
        if (!this.v) {
            this.Q.setVisibility(8);
            inflate.findViewById(pilihJenisKodeBank.RemoteActionCompatParcelizer.y).setVisibility(8);
        }
        if (!this.s) {
            this.F.setVisibility(8);
            inflate.findViewById(pilihJenisKodeBank.RemoteActionCompatParcelizer.u).setVisibility(8);
        }
        if (getResources().getConfiguration().orientation == 2) {
            if (this.s || this.v) {
                boolean z = this.v;
                if (!z && this.A) {
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                    layoutParams.addRule(14);
                    layoutParams.addRule(2, pilihJenisKodeBank.RemoteActionCompatParcelizer.d);
                    ((TextView) inflate.findViewById(pilihJenisKodeBank.RemoteActionCompatParcelizer.u)).setLayoutParams(layoutParams);
                } else if (!z) {
                    RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
                    layoutParams2.addRule(14);
                    layoutParams2.addRule(2, pilihJenisKodeBank.RemoteActionCompatParcelizer.d);
                    ((TextView) inflate.findViewById(pilihJenisKodeBank.RemoteActionCompatParcelizer.u)).setLayoutParams(layoutParams2);
                    RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
                    layoutParams3.addRule(13);
                    layoutParams3.addRule(3, pilihJenisKodeBank.RemoteActionCompatParcelizer.d);
                    this.j.setLayoutParams(layoutParams3);
                } else if (this.A) {
                    RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
                    layoutParams4.addRule(14);
                    layoutParams4.addRule(2, pilihJenisKodeBank.RemoteActionCompatParcelizer.x);
                    ((TextView) inflate.findViewById(pilihJenisKodeBank.RemoteActionCompatParcelizer.u)).setLayoutParams(layoutParams4);
                    RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, -2);
                    layoutParams5.addRule(13);
                    this.P.setLayoutParams(layoutParams5);
                } else {
                    RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-2, -2);
                    layoutParams6.addRule(13);
                    this.P.setLayoutParams(layoutParams6);
                    RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(-2, -2);
                    layoutParams7.addRule(14);
                    layoutParams7.addRule(2, pilihJenisKodeBank.RemoteActionCompatParcelizer.x);
                    ((TextView) inflate.findViewById(pilihJenisKodeBank.RemoteActionCompatParcelizer.u)).setLayoutParams(layoutParams7);
                    RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(-2, -2);
                    layoutParams8.addRule(14);
                    layoutParams8.addRule(3, pilihJenisKodeBank.RemoteActionCompatParcelizer.x);
                    this.j.setLayoutParams(layoutParams8);
                }
            } else {
                RelativeLayout.LayoutParams layoutParams9 = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams9.addRule(2, pilihJenisKodeBank.RemoteActionCompatParcelizer.d);
                layoutParams9.addRule(14);
                this.u.setLayoutParams(layoutParams9);
                if (this.A) {
                    RelativeLayout.LayoutParams layoutParams10 = new RelativeLayout.LayoutParams(-2, -2);
                    layoutParams10.addRule(1, pilihJenisKodeBank.RemoteActionCompatParcelizer.k);
                    this.j.setLayoutParams(layoutParams10);
                }
            }
        } else if (this.A && !this.v && this.s) {
            RelativeLayout.LayoutParams layoutParams11 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams11.addRule(13);
            ((TextView) inflate.findViewById(pilihJenisKodeBank.RemoteActionCompatParcelizer.u)).setLayoutParams(layoutParams11);
        } else if (!this.s && !this.v) {
            RelativeLayout.LayoutParams layoutParams12 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams12.addRule(13);
            this.u.setLayoutParams(layoutParams12);
            if (!this.A) {
                RelativeLayout.LayoutParams layoutParams13 = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams13.addRule(1, pilihJenisKodeBank.RemoteActionCompatParcelizer.k);
                layoutParams13.addRule(4, pilihJenisKodeBank.RemoteActionCompatParcelizer.k);
                this.j.setLayoutParams(layoutParams13);
            }
        } else if (this.v) {
            View findViewById = inflate.findViewById(pilihJenisKodeBank.RemoteActionCompatParcelizer.u);
            RelativeLayout.LayoutParams layoutParams14 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams14.addRule(0, pilihJenisKodeBank.RemoteActionCompatParcelizer.t);
            layoutParams14.addRule(15, -1);
            findViewById.setLayoutParams(layoutParams14);
            if (!this.A) {
                RelativeLayout.LayoutParams layoutParams15 = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams15.addRule(13);
                this.F.setLayoutParams(layoutParams15);
            } else {
                RelativeLayout.LayoutParams layoutParams16 = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams16.addRule(1, pilihJenisKodeBank.RemoteActionCompatParcelizer.d);
                this.F.setLayoutParams(layoutParams16);
            }
        }
        this.g = true;
        e(this.D.e, true);
        e(this.D.b);
        j(this.D.a);
        this.t = resources.getString(pilihJenisKodeBank$MediaBrowserCompat$ItemReceiver.B);
        this.r = resources.getString(pilihJenisKodeBank$MediaBrowserCompat$ItemReceiver.f);
        this.N = this.t.charAt(0);
        this.L = -1;
        this.f = -1;
        g();
        if (this.w && bundle != null) {
            this.Z = bundle.getIntegerArrayList("typed_times");
            g(-1);
            this.x.invalidate();
        } else if (this.Z == null) {
            this.Z = new ArrayList<>();
        }
        TextView textView6 = (TextView) inflate.findViewById(pilihJenisKodeBank.RemoteActionCompatParcelizer.A);
        if (!this.aa.isEmpty()) {
            textView6.setVisibility(0);
            textView6.setText(this.aa.toUpperCase(this.z));
        }
        float[] fArr = new float[3];
        Color.colorToHSV(this.i, fArr);
        fArr[2] = fArr[2] * 0.8f;
        textView6.setBackgroundColor(Color.HSVToColor(fArr));
        inflate.findViewById(pilihJenisKodeBank.RemoteActionCompatParcelizer.z).setBackgroundColor(this.i);
        inflate.findViewById(pilihJenisKodeBank.RemoteActionCompatParcelizer.v).setBackgroundColor(this.i);
        int i = this.H;
        if (i != -1) {
            this.G.setTextColor(i);
        } else {
            this.G.setTextColor(this.i);
        }
        int i2 = this.f43o;
        if (i2 != -1) {
            this.l.setTextColor(i2);
        } else {
            this.l.setTextColor(this.i);
        }
        if (getDialog() == null) {
            inflate.findViewById(pilihJenisKodeBank.RemoteActionCompatParcelizer.n).setVisibility(8);
        }
        int a = copyWindowDataInto.a(activity2, pilihJenisKodeBank.IconCompatParcelizer.c);
        int a2 = copyWindowDataInto.a(activity2, pilihJenisKodeBank.IconCompatParcelizer.b);
        a2 = copyWindowDataInto.a(activity2, pilihJenisKodeBank.IconCompatParcelizer.r);
        a = copyWindowDataInto.a(activity2, pilihJenisKodeBank.IconCompatParcelizer.r);
        showInfoHubunganKeuanganOR showinfohubungankeuanganor2 = this.e;
        if (this.V) {
        }
        showinfohubungankeuanganor2.setBackgroundColor(a);
        View findViewById2 = inflate.findViewById(pilihJenisKodeBank.RemoteActionCompatParcelizer.C);
        if (this.V) {
        }
        findViewById2.setBackgroundColor(a2);
        return inflate;
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        onDismiss(dialogInterface);
        DialogInterface.OnDismissListener onDismissListener = this.J;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
    }

    @Override // android.app.Fragment
    public final void onPause() {
        onPause();
        pilihJenisMataUang pilihjenismatauang = this.a;
        pilihjenismatauang.a = null;
        pilihjenismatauang.e.getContentResolver().unregisterContentObserver(pilihjenismatauang.c);
        if (this.p) {
            dismiss();
        }
    }

    @Override // android.app.Fragment
    public final void onResume() {
        onResume();
        this.a.d();
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        showInfoHubunganKeuanganOR showinfohubungankeuanganor = this.e;
        if (showinfohubungankeuanganor != null) {
            bundle.putParcelable("initial_time", showinfohubungankeuanganor.b);
            bundle.putBoolean("is_24_hour_view", this.A);
            bundle.putInt("current_item_showing", this.e.b());
            bundle.putBoolean("in_kb_mode", this.w);
            if (this.w) {
                bundle.putIntegerArrayList("typed_times", this.Z);
            }
            bundle.putString("dialog_title", this.aa);
            bundle.putBoolean("theme_dark", this.V);
            bundle.putBoolean("theme_dark_changed", this.Y);
            bundle.putInt("accent", this.i);
            bundle.putBoolean("vibrate", this.c);
            bundle.putBoolean("dismiss", this.p);
            bundle.putBoolean("enable_seconds", this.v);
            bundle.putBoolean("enable_minutes", this.s);
            bundle.putInt("ok_resid", this.E);
            bundle.putString("ok_string", this.K);
            bundle.putInt("ok_color", this.H);
            bundle.putInt("cancel_resid", this.m);
            bundle.putString("cancel_string", this.k);
            bundle.putInt("cancel_color", this.f43o);
            bundle.putSerializable("version", this.ab);
            bundle.putParcelable("timepoint_limiter", this.b);
            bundle.putSerializable("locale", this.z);
        }
    }
}
