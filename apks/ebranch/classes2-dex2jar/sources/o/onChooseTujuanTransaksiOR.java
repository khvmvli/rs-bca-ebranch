package o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.StateListDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import o.pilihJenisKodeBank;
import o.showInfoValueTodayOR;
/* loaded from: classes2-dex2jar.jar:o/onChooseTujuanTransaksiOR.class */
public final class onChooseTujuanTransaksiOR extends ListView implements AdapterView.OnItemClickListener, showInfoValueTodayOR.IconCompatParcelizer {
    onChooseSumberDanaOR a;
    final OR2PilihProductFragment b;
    private IconCompatParcelizer c;
    private int d;
    private int e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2-dex2jar.jar:o/onChooseTujuanTransaksiOR$IconCompatParcelizer.class */
    public final class IconCompatParcelizer extends BaseAdapter {
        private final int a;
        private final int d;

        IconCompatParcelizer(int i, int i2) {
            if (i <= i2) {
                this.d = i;
                this.a = i2;
                return;
            }
            throw new IllegalArgumentException("minYear > maxYear");
        }

        @Override // android.widget.Adapter
        public final int getCount() {
            return (this.a - this.d) + 1;
        }

        @Override // android.widget.Adapter
        public final Object getItem(int i) {
            return Integer.valueOf(this.d + i);
        }

        @Override // android.widget.Adapter
        public final long getItemId(int i) {
            return (long) i;
        }

        @Override // android.widget.Adapter
        public final View getView(int i, View view, ViewGroup viewGroup) {
            onChooseSumberDanaOR onchoosesumberdanaor;
            if (view != null) {
                onchoosesumberdanaor = (onChooseSumberDanaOR) view;
            } else {
                onchoosesumberdanaor = (onChooseSumberDanaOR) LayoutInflater.from(viewGroup.getContext()).inflate(pilihJenisKodeBank.read.j, viewGroup, false);
                onchoosesumberdanaor.setAccentColor(onChooseTujuanTransaksiOR.this.b.a(), onChooseTujuanTransaksiOR.this.b.l());
            }
            int i2 = this.d + i;
            boolean z = onChooseTujuanTransaksiOR.this.b.h().d == i2;
            onchoosesumberdanaor.setText(String.format(onChooseTujuanTransaksiOR.this.b.d(), "%d", Integer.valueOf(i2)));
            onchoosesumberdanaor.d = z;
            onchoosesumberdanaor.requestLayout();
            if (z) {
                onChooseTujuanTransaksiOR.this.a = onchoosesumberdanaor;
            }
            return onchoosesumberdanaor;
        }
    }

    public onChooseTujuanTransaksiOR(Context context, OR2PilihProductFragment oR2PilihProductFragment) {
        super(context);
        this.b = oR2PilihProductFragment;
        oR2PilihProductFragment.b(this);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        Resources resources = context.getResources();
        this.e = oR2PilihProductFragment.n() == showInfoValueTodayOR.write.VERSION_1 ? resources.getDimensionPixelOffset(pilihJenisKodeBank.write.c) : resources.getDimensionPixelOffset(pilihJenisKodeBank.write.d);
        this.d = resources.getDimensionPixelOffset(pilihJenisKodeBank.write.n);
        setVerticalFadingEdgeEnabled(true);
        setFadingEdgeLength(this.d / 3);
        IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(this.b.j(), this.b.e());
        this.c = iconCompatParcelizer;
        setAdapter((ListAdapter) iconCompatParcelizer);
        setOnItemClickListener(this);
        setSelector(new StateListDrawable());
        setDividerHeight(0);
        b();
    }

    @Override // o.showInfoValueTodayOR.IconCompatParcelizer
    public final void b() {
        this.c.notifyDataSetChanged();
        final int j = this.b.h().d - this.b.j();
        final int i = (this.e / 2) - (this.d / 2);
        post(new Runnable() { // from class: o.onChooseTujuanTransaksiOR.1
            @Override // java.lang.Runnable
            public final void run() {
                onChooseTujuanTransaksiOR.this.setSelectionFromTop(j, i);
                onChooseTujuanTransaksiOR.this.requestLayout();
            }
        });
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 4096) {
            accessibilityEvent.setFromIndex(0);
            accessibilityEvent.setToIndex(0);
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.b.o();
        onChooseSumberDanaOR onchoosesumberdanaor = (onChooseSumberDanaOR) view;
        if (onchoosesumberdanaor != null) {
            onChooseSumberDanaOR onchoosesumberdanaor2 = this.a;
            if (onchoosesumberdanaor != onchoosesumberdanaor2) {
                if (onchoosesumberdanaor2 != null) {
                    onchoosesumberdanaor2.d = false;
                    this.a.requestLayout();
                }
                onchoosesumberdanaor.d = true;
                onchoosesumberdanaor.requestLayout();
                this.a = onchoosesumberdanaor;
            }
            this.b.d(Integer.valueOf(onchoosesumberdanaor.getText().toString()).intValue());
            this.c.notifyDataSetChanged();
        }
    }
}
