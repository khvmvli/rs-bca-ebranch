package o;

import android.content.Context;
import android.icu.text.DateFormat;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.TimeZone;
/* loaded from: classes2-dex2jar.jar:o/DraftBerhasilDialog_ViewBinding.class */
public class DraftBerhasilDialog_ViewBinding extends BaseAdapter {
    static final int d;
    final DaftarTransferBerhasilDiupdateDialog a;
    DepositoDialog_ViewBinding b;
    final DeskripsiPekerjaanDialog_ViewBinding c;
    final DepositoDialog<?> e;
    Collection<Long> h;

    static {
        Calendar instance = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        instance.clear();
        d = instance.getMaximum(4);
    }

    public DraftBerhasilDialog_ViewBinding(DeskripsiPekerjaanDialog_ViewBinding deskripsiPekerjaanDialog_ViewBinding, DepositoDialog<?> depositoDialog, DaftarTransferBerhasilDiupdateDialog daftarTransferBerhasilDiupdateDialog) {
        this.c = deskripsiPekerjaanDialog_ViewBinding;
        this.e = depositoDialog;
        this.a = daftarTransferBerhasilDiupdateDialog;
        this.h = depositoDialog.d();
    }

    private void e(TextView textView, long j) {
        DeleteAccountFailedDialog_ViewBinding deleteAccountFailedDialog_ViewBinding;
        if (textView != null) {
            boolean z = false;
            if (this.a.d.b(j)) {
                textView.setEnabled(true);
                Iterator<Long> it = this.e.d().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    long longValue = it.next().longValue();
                    Calendar instance = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
                    instance.clear();
                    instance.setTimeInMillis(j);
                    long timeInMillis = ErrorGetRateBNDialog_ViewBinding.c(instance).getTimeInMillis();
                    Calendar instance2 = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
                    instance2.clear();
                    instance2.setTimeInMillis(longValue);
                    if (timeInMillis == ErrorGetRateBNDialog_ViewBinding.c(instance2).getTimeInMillis()) {
                        z = true;
                        break;
                    }
                }
                deleteAccountFailedDialog_ViewBinding = z ? this.b.e : ErrorGetRateBNDialog_ViewBinding.d().getTimeInMillis() == j ? this.b.j : this.b.c;
            } else {
                textView.setEnabled(false);
                deleteAccountFailedDialog_ViewBinding = this.b.b;
            }
            deleteAccountFailedDialog_ViewBinding.e(textView);
        }
    }

    /* renamed from: a */
    public final Long getItem(int i) {
        if (i < this.c.e() || i > (this.c.e() + this.c.c) - 1) {
            return null;
        }
        DeskripsiPekerjaanDialog_ViewBinding deskripsiPekerjaanDialog_ViewBinding = this.c;
        int e = deskripsiPekerjaanDialog_ViewBinding.e();
        Calendar c = ErrorGetRateBNDialog_ViewBinding.c(deskripsiPekerjaanDialog_ViewBinding.e);
        c.set(5, (i - e) + 1);
        return Long.valueOf(c.getTimeInMillis());
    }

    public void b(DetailTujuanBNDialog_ViewBinding detailTujuanBNDialog_ViewBinding, long j) {
        if (DeskripsiPekerjaanDialog_ViewBinding.a(j).equals(this.c)) {
            Calendar c = ErrorGetRateBNDialog_ViewBinding.c(this.c.e);
            c.setTimeInMillis(j);
            e((TextView) detailTujuanBNDialog_ViewBinding.getChildAt((detailTujuanBNDialog_ViewBinding.d().c.e() + (c.get(5) - 1)) - detailTujuanBNDialog_ViewBinding.getFirstVisiblePosition()), j);
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.c.c + this.c.e();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return (long) (i / this.c.d);
    }

    @Override // android.widget.Adapter
    public /* synthetic */ View getView(int i, View view, ViewGroup viewGroup) {
        String str;
        String str2;
        Context context = viewGroup.getContext();
        if (this.b == null) {
            this.b = new DepositoDialog_ViewBinding(context);
        }
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(BaseDialogKotlin$MediaBrowserCompat$MediaItem.u, viewGroup, false);
        }
        int e = i - this.c.e();
        if (e < 0 || e >= this.c.c) {
            textView.setVisibility(8);
            textView.setEnabled(false);
        } else {
            int i2 = e + 1;
            textView.setTag(this.c);
            textView.setText(String.format(textView.getResources().getConfiguration().locale, "%d", Integer.valueOf(i2)));
            Calendar c = ErrorGetRateBNDialog_ViewBinding.c(this.c.e);
            c.set(5, i2);
            long timeInMillis = c.getTimeInMillis();
            if (this.c.g == new DeskripsiPekerjaanDialog_ViewBinding(ErrorGetRateBNDialog_ViewBinding.d()).g) {
                Locale locale = Locale.getDefault();
                if (Build.VERSION.SDK_INT >= 24) {
                    DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("MMMEd", locale);
                    instanceForSkeleton.setTimeZone(android.icu.util.TimeZone.getTimeZone("UTC"));
                    str2 = instanceForSkeleton.format(new Date(timeInMillis));
                } else {
                    java.text.DateFormat dateInstance = java.text.DateFormat.getDateInstance(0, locale);
                    dateInstance.setTimeZone(TimeZone.getTimeZone("UTC"));
                    str2 = dateInstance.format(new Date(timeInMillis));
                }
                textView.setContentDescription(str2);
            } else {
                Locale locale2 = Locale.getDefault();
                if (Build.VERSION.SDK_INT >= 24) {
                    DateFormat instanceForSkeleton2 = DateFormat.getInstanceForSkeleton("yMMMEd", locale2);
                    instanceForSkeleton2.setTimeZone(android.icu.util.TimeZone.getTimeZone("UTC"));
                    str = instanceForSkeleton2.format(new Date(timeInMillis));
                } else {
                    java.text.DateFormat dateInstance2 = java.text.DateFormat.getDateInstance(0, locale2);
                    dateInstance2.setTimeZone(TimeZone.getTimeZone("UTC"));
                    str = dateInstance2.format(new Date(timeInMillis));
                }
                textView.setContentDescription(str);
            }
            textView.setVisibility(0);
            textView.setEnabled(true);
        }
        Long a = getItem(i);
        if (a == null) {
            return textView;
        }
        e(textView, a.longValue());
        return textView;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }
}
