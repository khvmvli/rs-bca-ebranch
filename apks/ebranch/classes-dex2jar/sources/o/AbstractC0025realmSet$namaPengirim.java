package o;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.Iterator;
import java.util.LinkedList;
import o.realmSet$hasManyPenerima;
/* renamed from: o.realmSet$namaPengirim */
/* loaded from: classes-dex2jar.jar:o/realmSet$namaPengirim.class */
public abstract class AbstractC0025realmSet$namaPengirim<T extends realmSet$hasManyPenerima> {
    private LinkedList a;
    private final realmSet$namaKontakPengirim b = new realmSet$namaKontakPengirim() { // from class: o.realmSet$noReff
        @Override // o.realmSet$namaKontakPengirim
        public final void a(realmSet$hasManyPenerima realmset_hasmanypenerima) {
            AbstractC0025realmSet$namaPengirim.this.c = realmset_hasmanypenerima;
            Iterator it = AbstractC0025realmSet$namaPengirim.this.a.iterator();
            while (it.hasNext()) {
                ((AbstractC0029realmSet$sumberDanaTransaksi) it.next()).b(AbstractC0025realmSet$namaPengirim.this.c);
            }
            AbstractC0025realmSet$namaPengirim.this.a.clear();
            AbstractC0025realmSet$namaPengirim.this.e = null;
        }
    };
    private realmSet$hasManyPenerima c;
    private Bundle e;

    private final void b(int i) {
        while (!this.a.isEmpty() && ((AbstractC0029realmSet$sumberDanaTransaksi) this.a.getLast()).b() >= i) {
            this.a.removeLast();
        }
    }

    public static void c(FrameLayout frameLayout) {
        realmGet$jobOthers a = realmGet$jobOthers.a();
        Context context = frameLayout.getContext();
        int d = a.d(context);
        String b = setHmRW.b(context, d);
        String a2 = setHmRW.a(context, d);
        LinearLayout linearLayout = new LinearLayout(frameLayout.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout);
        TextView textView = new TextView(frameLayout.getContext());
        textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        textView.setText(b);
        linearLayout.addView(textView);
        Intent a3 = a.a(context, d, null);
        if (a3 != null) {
            Button button = new Button(context);
            button.setId(16908313);
            button.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            button.setText(a2);
            linearLayout.addView(button);
            button.setOnClickListener(new View.OnClickListener(context, a3) { // from class: o.realmSet$penerimaList
                final /* synthetic */ Context a;
                final /* synthetic */ Intent e;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.a = r4;
                    this.e = r5;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    try {
                        this.a.startActivity(this.e);
                    } catch (ActivityNotFoundException e) {
                        Log.e("DeferredLifecycleHelper", "Failed to start resolution intent", e);
                    }
                }
            });
        }
    }

    private final void e(Bundle bundle, AbstractC0029realmSet$sumberDanaTransaksi realmset_sumberdanatransaksi) {
        realmSet$hasManyPenerima realmset_hasmanypenerima = this.c;
        if (realmset_hasmanypenerima != null) {
            realmset_sumberdanatransaksi.b(realmset_hasmanypenerima);
            return;
        }
        if (this.a == null) {
            this.a = new LinkedList();
        }
        this.a.add(realmset_sumberdanatransaksi);
        if (bundle != null) {
            Bundle bundle2 = this.e;
            if (bundle2 == null) {
                this.e = (Bundle) bundle.clone();
            } else {
                bundle2.putAll(bundle);
            }
        }
        d(this.b);
    }

    public void a() {
        realmSet$hasManyPenerima realmset_hasmanypenerima = this.c;
        if (realmset_hasmanypenerima != null) {
            realmset_hasmanypenerima.b();
        } else {
            b(2);
        }
    }

    protected void a(FrameLayout frameLayout) {
        c(frameLayout);
    }

    public void b() {
        realmSet$hasManyPenerima realmset_hasmanypenerima = this.c;
        if (realmset_hasmanypenerima != null) {
            realmset_hasmanypenerima.a();
        } else {
            b(1);
        }
    }

    public T c() {
        return (T) this.c;
    }

    public void c(Bundle bundle) {
        realmSet$hasManyPenerima realmset_hasmanypenerima = this.c;
        if (realmset_hasmanypenerima != null) {
            realmset_hasmanypenerima.c(bundle);
            return;
        }
        Bundle bundle2 = this.e;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
    }

    @ResultIgnorabilityUnspecified
    public View d(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        e(bundle, new AbstractC0029realmSet$sumberDanaTransaksi(frameLayout, layoutInflater, viewGroup, bundle) { // from class: o.realmSet$noWarkatTransaksi
            final /* synthetic */ FrameLayout a;
            final /* synthetic */ Bundle b;
            final /* synthetic */ ViewGroup c;
            final /* synthetic */ LayoutInflater e;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.a = r5;
                this.e = r6;
                this.c = r7;
                this.b = r8;
            }

            @Override // o.AbstractC0029realmSet$sumberDanaTransaksi
            public final int b() {
                return 2;
            }

            @Override // o.AbstractC0029realmSet$sumberDanaTransaksi
            public final void b(realmSet$hasManyPenerima realmset_hasmanypenerima) {
                this.a.removeAllViews();
                this.a.addView(AbstractC0025realmSet$namaPengirim.this.c.a(this.e, this.c, this.b));
            }
        });
        if (this.c == null) {
            a(frameLayout);
        }
        return frameLayout;
    }

    public void d() {
        realmSet$hasManyPenerima realmset_hasmanypenerima = this.c;
        if (realmset_hasmanypenerima != null) {
            realmset_hasmanypenerima.d();
        }
    }

    public void d(Activity activity, Bundle bundle, Bundle bundle2) {
        e(bundle2, new AbstractC0029realmSet$sumberDanaTransaksi(activity, bundle, bundle2) { // from class: o.realmSet$norekPengirim
            final /* synthetic */ Bundle a;
            final /* synthetic */ Activity b;
            final /* synthetic */ Bundle c;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.b = r5;
                this.c = r6;
                this.a = r7;
            }

            @Override // o.AbstractC0029realmSet$sumberDanaTransaksi
            public final int b() {
                return 0;
            }

            @Override // o.AbstractC0029realmSet$sumberDanaTransaksi
            public final void b(realmSet$hasManyPenerima realmset_hasmanypenerima) {
                AbstractC0025realmSet$namaPengirim.this.c.d(this.b, this.c, this.a);
            }
        });
    }

    public void d(Bundle bundle) {
        e(bundle, new AbstractC0029realmSet$sumberDanaTransaksi(bundle) { // from class: o.realmSet$noTelpKontakPengirim
            final /* synthetic */ Bundle b;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.b = r5;
            }

            @Override // o.AbstractC0029realmSet$sumberDanaTransaksi
            public final int b() {
                return 1;
            }

            @Override // o.AbstractC0029realmSet$sumberDanaTransaksi
            public final void b(realmSet$hasManyPenerima realmset_hasmanypenerima) {
                AbstractC0025realmSet$namaPengirim.this.c.e(this.b);
            }
        });
    }

    protected abstract void d(realmSet$namaKontakPengirim<T> realmset_namakontakpengirim);

    public void e() {
        realmSet$hasManyPenerima realmset_hasmanypenerima = this.c;
        if (realmset_hasmanypenerima != null) {
            realmset_hasmanypenerima.c();
        } else {
            b(5);
        }
    }

    public void g() {
        realmSet$hasManyPenerima realmset_hasmanypenerima = this.c;
        if (realmset_hasmanypenerima != null) {
            realmset_hasmanypenerima.j();
        } else {
            b(4);
        }
    }

    public void i() {
        e(null, new AbstractC0029realmSet$sumberDanaTransaksi() { // from class: o.realmSet$sumberDanaTransaksiCode
            @Override // o.AbstractC0029realmSet$sumberDanaTransaksi
            public final int b() {
                return 4;
            }

            @Override // o.AbstractC0029realmSet$sumberDanaTransaksi
            public final void b(realmSet$hasManyPenerima realmset_hasmanypenerima) {
                AbstractC0025realmSet$namaPengirim.this.c.h();
            }
        });
    }

    public void j() {
        e(null, new AbstractC0029realmSet$sumberDanaTransaksi() { // from class: o.realmSet$statusKewarganegaraanPengirim
            @Override // o.AbstractC0029realmSet$sumberDanaTransaksi
            public final int b() {
                return 5;
            }

            @Override // o.AbstractC0029realmSet$sumberDanaTransaksi
            public final void b(realmSet$hasManyPenerima realmset_hasmanypenerima) {
                AbstractC0025realmSet$namaPengirim.this.c.e();
            }
        });
    }
}
