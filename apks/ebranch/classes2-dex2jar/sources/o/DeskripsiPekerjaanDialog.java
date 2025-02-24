package o;

import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
/* loaded from: classes2-dex2jar.jar:o/DeskripsiPekerjaanDialog.class */
final class DeskripsiPekerjaanDialog extends BaseAdapter {
    private static final int b;
    private final Calendar a;
    private final int d;
    private final int e;

    static {
        b = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
    }

    public DeskripsiPekerjaanDialog() {
        Calendar instance = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        instance.clear();
        this.a = instance;
        this.e = instance.getMaximum(7);
        this.d = instance.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.e;
    }

    @Override // android.widget.Adapter
    public final /* synthetic */ Object getItem(int i) {
        int i2 = this.e;
        if (i >= i2) {
            return null;
        }
        int i3 = i + this.d;
        int i4 = i3;
        if (i3 > i2) {
            i4 = i3 - i2;
        }
        return Integer.valueOf(i4);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(BaseDialogKotlin$MediaBrowserCompat$MediaItem.w, viewGroup, false);
        }
        Calendar calendar = this.a;
        int i2 = i + this.d;
        int i3 = this.e;
        int i4 = i2;
        if (i2 > i3) {
            i4 = i2 - i3;
        }
        calendar.set(7, i4);
        textView.setText(this.a.getDisplayName(7, b, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(BaseDialogKotlin$MediaBrowserCompat$SearchResultReceiver.p), this.a.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }
}
