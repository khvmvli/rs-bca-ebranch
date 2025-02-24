package o;

import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.text.format.DateUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.TimeZone;
import o.onChooseORProduct;
import o.pilihJenisKodeBank;
/* loaded from: classes2-dex2jar.jar:o/showInfoValueTodayOR.class */
public final class showInfoValueTodayOR extends DialogFragment implements View.OnClickListener, OR2PilihProductFragment {
    private static SimpleDateFormat g;
    private Locale A;
    private LinearLayout B;
    private int C;
    private int D;
    private String E;
    private DialogInterface.OnCancelListener F;
    private String G;
    private DialogInterface.OnDismissListener H;
    private read I;
    private boolean J;
    private TextView K;
    private TimeZone L;
    private boolean M;
    private TextView N;
    private int O;
    private write P;
    private String Q;
    private String R;
    private onChooseTujuanTransaksiOR S;
    private TextView W;
    public int a;
    public OR2PilihProductFragment_ViewBinding b;
    boolean c;
    public lewati d;
    pilihJenisMataUang e;
    private HashSet<Calendar> i;
    private int k;
    private showInfoValueTodayOR$MediaBrowserCompat$CustomActionResultReceiver l;
    private Calendar m;
    private boolean n;

    /* renamed from: o */
    private showInfoKursOR f97o;
    private int p;
    private int q;
    private OR2DataTransaksiAFragment_ViewBinding r;
    private String s;
    private TextView t;
    private boolean u;
    private int v;
    private HashSet<IconCompatParcelizer> w;
    private String x;
    private boolean y;
    private String z;
    private static SimpleDateFormat j = new SimpleDateFormat("yyyy", Locale.getDefault());
    private static SimpleDateFormat f = new SimpleDateFormat("MMM", Locale.getDefault());
    private static SimpleDateFormat h = new SimpleDateFormat("dd", Locale.getDefault());

    /* loaded from: classes2-dex2jar.jar:o/showInfoValueTodayOR$IconCompatParcelizer.class */
    public interface IconCompatParcelizer {
        void b();
    }

    /* loaded from: classes2-dex2jar.jar:o/showInfoValueTodayOR$read.class */
    public enum read {
        HORIZONTAL,
        VERTICAL
    }

    /* loaded from: classes2-dex2jar.jar:o/showInfoValueTodayOR$write.class */
    public enum write {
        VERSION_1,
        VERSION_2
    }

    public showInfoValueTodayOR() {
        TimeZone timeZone = this.L;
        Calendar instance = Calendar.getInstance(timeZone == null ? TimeZone.getDefault() : timeZone);
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.set(14, 0);
        this.m = instance;
        this.w = new HashSet<>();
        this.p = -1;
        this.O = this.m.getFirstDayOfWeek();
        this.i = new HashSet<>();
        this.M = false;
        this.J = false;
        this.a = -1;
        this.c = true;
        this.y = false;
        this.n = false;
        this.v = 0;
        this.D = pilihJenisKodeBank$MediaBrowserCompat$ItemReceiver.n;
        this.C = -1;
        this.q = pilihJenisKodeBank$MediaBrowserCompat$ItemReceiver.a;
        this.k = -1;
        this.A = Locale.getDefault();
        OR2PilihProductFragment_ViewBinding oR2PilihProductFragment_ViewBinding = new OR2PilihProductFragment_ViewBinding();
        this.b = oR2PilihProductFragment_ViewBinding;
        this.r = oR2PilihProductFragment_ViewBinding;
        this.u = true;
    }

    private void a(int i) {
        long timeInMillis = this.m.getTimeInMillis();
        if (i == 0) {
            if (this.P == write.VERSION_1) {
                ObjectAnimator d = pilihNegaraTujuan.d(this.B, 0.9f, 1.05f);
                if (this.u) {
                    d.setStartDelay(500);
                    this.u = false;
                }
                this.d.c.b();
                if (this.p != i) {
                    this.B.setSelected(true);
                    this.W.setSelected(false);
                    this.f97o.setDisplayedChild(0);
                    this.p = i;
                }
                d.start();
            } else {
                this.d.c.b();
                if (this.p != i) {
                    this.B.setSelected(true);
                    this.W.setSelected(false);
                    this.f97o.setDisplayedChild(0);
                    this.p = i;
                }
            }
            String formatDateTime = DateUtils.formatDateTime(getActivity(), timeInMillis, 16);
            showInfoKursOR showinfokursor = this.f97o;
            StringBuilder sb = new StringBuilder();
            sb.append(this.x);
            sb.append(": ");
            sb.append(formatDateTime);
            showinfokursor.setContentDescription(sb.toString());
            showInfoKursOR showinfokursor2 = this.f97o;
            String str = this.E;
            if (showinfokursor2 != null && str != null) {
                showinfokursor2.announceForAccessibility(str);
            }
        } else if (i == 1) {
            if (this.P == write.VERSION_1) {
                ObjectAnimator d2 = pilihNegaraTujuan.d(this.W, 0.85f, 1.1f);
                if (this.u) {
                    d2.setStartDelay(500);
                    this.u = false;
                }
                this.S.b();
                if (this.p != i) {
                    this.B.setSelected(false);
                    this.W.setSelected(true);
                    this.f97o.setDisplayedChild(1);
                    this.p = i;
                }
                d2.start();
            } else {
                this.S.b();
                if (this.p != i) {
                    this.B.setSelected(false);
                    this.W.setSelected(true);
                    this.f97o.setDisplayedChild(1);
                    this.p = i;
                }
            }
            String format = j.format(Long.valueOf(timeInMillis));
            showInfoKursOR showinfokursor3 = this.f97o;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.R);
            sb2.append(": ");
            sb2.append((Object) format);
            showinfokursor3.setContentDescription(sb2.toString());
            showInfoKursOR showinfokursor4 = this.f97o;
            String str2 = this.G;
            if (showinfokursor4 != null && str2 != null) {
                showinfokursor4.announceForAccessibility(str2);
            }
        }
    }

    public static showInfoValueTodayOR e(showInfoValueTodayOR$MediaBrowserCompat$CustomActionResultReceiver showinfovaluetodayor_mediabrowsercompat_customactionresultreceiver, int i, int i2, int i3) {
        showInfoValueTodayOR showinfovaluetodayor = new showInfoValueTodayOR();
        TimeZone timeZone = showinfovaluetodayor.L;
        TimeZone timeZone2 = timeZone;
        if (timeZone == null) {
            timeZone2 = TimeZone.getDefault();
        }
        Calendar instance = Calendar.getInstance(timeZone2);
        instance.set(1, i);
        instance.set(2, i2);
        instance.set(5, i3);
        showinfovaluetodayor.l = showinfovaluetodayor_mediabrowsercompat_customactionresultreceiver;
        Calendar calendar = (Calendar) instance.clone();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        showinfovaluetodayor.m = calendar;
        showinfovaluetodayor.I = null;
        TimeZone timeZone3 = calendar.getTimeZone();
        showinfovaluetodayor.L = timeZone3;
        showinfovaluetodayor.m.setTimeZone(timeZone3);
        j.setTimeZone(timeZone3);
        f.setTimeZone(timeZone3);
        h.setTimeZone(timeZone3);
        showinfovaluetodayor.P = Build.VERSION.SDK_INT < 23 ? write.VERSION_1 : write.VERSION_2;
        return showinfovaluetodayor;
    }

    private void e(boolean z) {
        this.W.setText(j.format(this.m.getTime()));
        if (this.P == write.VERSION_1) {
            TextView textView = this.t;
            if (textView != null) {
                String str = this.Q;
                if (str != null) {
                    textView.setText(str.toUpperCase(this.A));
                } else {
                    textView.setText(this.m.getDisplayName(7, 2, this.A).toUpperCase(this.A));
                }
            }
            this.K.setText(f.format(this.m.getTime()));
            this.N.setText(h.format(this.m.getTime()));
        }
        if (this.P == write.VERSION_2) {
            this.N.setText(g.format(this.m.getTime()));
            String str2 = this.Q;
            if (str2 != null) {
                this.t.setText(str2.toUpperCase(this.A));
            } else {
                this.t.setVisibility(8);
            }
        }
        long timeInMillis = this.m.getTimeInMillis();
        this.f97o.setDateMillis(timeInMillis);
        this.B.setContentDescription(DateUtils.formatDateTime(getActivity(), timeInMillis, 24));
        if (z) {
            String formatDateTime = DateUtils.formatDateTime(getActivity(), timeInMillis, 20);
            showInfoKursOR showinfokursor = this.f97o;
            if (showinfokursor != null && formatDateTime != null) {
                showinfokursor.announceForAccessibility(formatDateTime);
            }
        }
    }

    private void k() {
        Iterator<IconCompatParcelizer> it = this.w.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    @Override // o.OR2PilihProductFragment
    public final int a() {
        return this.a;
    }

    @Override // o.OR2PilihProductFragment
    public final int b() {
        return this.O;
    }

    @Override // o.OR2PilihProductFragment
    public final void b(IconCompatParcelizer iconCompatParcelizer) {
        this.w.add(iconCompatParcelizer);
    }

    @Override // o.OR2PilihProductFragment
    public final boolean b(int i, int i2, int i3) {
        return this.r.d(i, i2, i3);
    }

    @Override // o.OR2PilihProductFragment
    public final Calendar c() {
        return this.r.b();
    }

    @Override // o.OR2PilihProductFragment
    public final void c(int i, int i2, int i3) {
        this.m.set(1, i);
        this.m.set(2, i2);
        this.m.set(5, i3);
        k();
        e(true);
        if (this.n) {
            m();
            dismiss();
        }
    }

    @Override // o.OR2PilihProductFragment
    public final Locale d() {
        return this.A;
    }

    @Override // o.OR2PilihProductFragment
    public final void d(int i) {
        this.m.set(1, i);
        Calendar calendar = this.m;
        int i2 = calendar.get(5);
        int actualMaximum = calendar.getActualMaximum(5);
        if (i2 > actualMaximum) {
            calendar.set(5, actualMaximum);
        }
        this.m = this.r.c(calendar);
        k();
        a(0);
        e(true);
    }

    @Override // o.OR2PilihProductFragment
    public final boolean d(int i, int i2, int i3) {
        TimeZone timeZone = this.L;
        TimeZone timeZone2 = timeZone;
        if (timeZone == null) {
            timeZone2 = TimeZone.getDefault();
        }
        Calendar instance = Calendar.getInstance(timeZone2);
        instance.set(1, i);
        instance.set(2, i2);
        instance.set(5, i3);
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.set(14, 0);
        return this.i.contains(instance);
    }

    @Override // o.OR2PilihProductFragment
    public final int e() {
        return this.r.d();
    }

    @Override // o.OR2PilihProductFragment
    public final read f() {
        return this.I;
    }

    @Override // o.OR2PilihProductFragment
    public final Calendar g() {
        return this.r.c();
    }

    @Override // o.OR2PilihProductFragment
    public final onChooseORProduct.IconCompatParcelizer h() {
        Calendar calendar = this.m;
        TimeZone timeZone = this.L;
        TimeZone timeZone2 = timeZone;
        if (timeZone == null) {
            timeZone2 = TimeZone.getDefault();
        }
        return new onChooseORProduct.IconCompatParcelizer(calendar, timeZone2);
    }

    @Override // o.OR2PilihProductFragment
    public final TimeZone i() {
        TimeZone timeZone = this.L;
        TimeZone timeZone2 = timeZone;
        if (timeZone == null) {
            timeZone2 = TimeZone.getDefault();
        }
        return timeZone2;
    }

    @Override // o.OR2PilihProductFragment
    public final int j() {
        return this.r.a();
    }

    @Override // o.OR2PilihProductFragment
    public final boolean l() {
        return this.M;
    }

    public final void m() {
        showInfoValueTodayOR$MediaBrowserCompat$CustomActionResultReceiver showinfovaluetodayor_mediabrowsercompat_customactionresultreceiver = this.l;
        if (showinfovaluetodayor_mediabrowsercompat_customactionresultreceiver != null) {
            showinfovaluetodayor_mediabrowsercompat_customactionresultreceiver.d(this, this.m.get(1), this.m.get(2), this.m.get(5));
        }
    }

    @Override // o.OR2PilihProductFragment
    public final write n() {
        return this.P;
    }

    @Override // o.OR2PilihProductFragment
    public final void o() {
        if (this.c) {
            this.e.e();
        }
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        onCancel(dialogInterface);
        DialogInterface.OnCancelListener onCancelListener = this.F;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.c) {
            this.e.e();
        }
        if (view.getId() == pilihJenisKodeBank.RemoteActionCompatParcelizer.h) {
            a(1);
        } else if (view.getId() == pilihJenisKodeBank.RemoteActionCompatParcelizer.g) {
            a(0);
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
        getActivity().getWindow().setSoftInputMode(3);
        this.p = -1;
        if (bundle != null) {
            this.m.set(1, bundle.getInt("year"));
            this.m.set(2, bundle.getInt("month"));
            this.m.set(5, bundle.getInt("day"));
            this.v = bundle.getInt("default_view");
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DateFormat.getBestDateTimePattern(this.A, "EEEMMMdd"), this.A);
        g = simpleDateFormat;
        TimeZone timeZone = this.L;
        TimeZone timeZone2 = timeZone;
        if (timeZone == null) {
            timeZone2 = TimeZone.getDefault();
        }
        simpleDateFormat.setTimeZone(timeZone2);
    }

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = onCreateDialog(bundle);
        onCreateDialog.requestWindowFeature(1);
        return onCreateDialog;
    }

    /* JADX WARN: Type inference failed for: r0v107, types: [android.view.View, o.OR3DataTransaksiBFragment] */
    /* JADX WARN: Unknown variable types count: 1 */
    @Override // android.app.Fragment
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final android.view.View onCreateView(android.view.LayoutInflater r8, android.view.ViewGroup r9, android.os.Bundle r10) {
        /*
        // Method dump skipped, instructions count: 1234
        */
        throw new UnsupportedOperationException("Method not decompiled: o.showInfoValueTodayOR.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        onDismiss(dialogInterface);
        DialogInterface.OnDismissListener onDismissListener = this.H;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
    }

    @Override // android.app.Fragment
    public final void onPause() {
        onPause();
        pilihJenisMataUang pilihjenismatauang = this.e;
        pilihjenismatauang.a = null;
        pilihjenismatauang.e.getContentResolver().unregisterContentObserver(pilihjenismatauang.c);
        if (this.y) {
            dismiss();
        }
    }

    @Override // android.app.Fragment
    public final void onResume() {
        onResume();
        this.e.d();
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        int i;
        onSaveInstanceState(bundle);
        bundle.putInt("year", this.m.get(1));
        bundle.putInt("month", this.m.get(2));
        bundle.putInt("day", this.m.get(5));
        bundle.putInt("week_start", this.O);
        bundle.putInt("current_view", this.p);
        int i2 = this.p;
        if (i2 == 0) {
            i = OR3DataTransaksiBFragment.e(this.d.c.j());
        } else if (i2 == 1) {
            i = this.S.getFirstVisiblePosition();
            int i3 = 0;
            View childAt = this.S.getChildAt(0);
            if (childAt != null) {
                i3 = childAt.getTop();
            }
            bundle.putInt("list_position_offset", i3);
        } else {
            i = -1;
        }
        bundle.putInt("list_position", i);
        bundle.putSerializable("highlighted_days", this.i);
        bundle.putBoolean("theme_dark", this.M);
        bundle.putBoolean("theme_dark_changed", this.J);
        bundle.putInt("accent", this.a);
        bundle.putBoolean("vibrate", this.c);
        bundle.putBoolean("dismiss", this.y);
        bundle.putBoolean("auto_dismiss", this.n);
        bundle.putInt("default_view", this.v);
        bundle.putString("title", this.Q);
        bundle.putInt("ok_resid", this.D);
        bundle.putString("ok_string", this.z);
        bundle.putInt("ok_color", this.C);
        bundle.putInt("cancel_resid", this.q);
        bundle.putString("cancel_string", this.s);
        bundle.putInt("cancel_color", this.k);
        bundle.putSerializable("version", this.P);
        bundle.putSerializable("scrollorientation", this.I);
        bundle.putSerializable("timezone", this.L);
        bundle.putParcelable("daterangelimiter", this.r);
        bundle.putSerializable("locale", this.A);
    }
}
