package o;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.Arrays;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2-dex2jar.jar:o/MasaBerlakuKTPDialog_ViewBinding.class */
public class MasaBerlakuKTPDialog_ViewBinding extends FrameLayout implements Checkable {
    final LogoutDialog_ViewBinding a;
    final chooseBelumYakinBertransaksi b;
    private TextView c;
    private final EditText d;
    private TextWatcher e;

    public MasaBerlakuKTPDialog_ViewBinding(Context context) {
        this(context, null);
    }

    public MasaBerlakuKTPDialog_ViewBinding(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [android.view.View, o.chooseBelumYakinBertransaksi] */
    /* JADX WARN: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public MasaBerlakuKTPDialog_ViewBinding(android.content.Context r6, android.util.AttributeSet r7, int r8) {
        /*
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            r0.<init>(r1, r2, r3)
            r0 = r6
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            r7 = r0
            r0 = r7
            int r1 = o.BaseDialogKotlin$MediaBrowserCompat$MediaItem.t
            r2 = r5
            r3 = 0
            android.view.View r0 = r0.inflate(r1, r2, r3)
            o.chooseBelumYakinBertransaksi r0 = (o.chooseBelumYakinBertransaksi) r0
            r6 = r0
            r0 = r5
            r1 = r6
            r0.b = r1
            r0 = r7
            int r1 = o.BaseDialogKotlin$MediaBrowserCompat$MediaItem.r
            r2 = r5
            r3 = 0
            android.view.View r0 = r0.inflate(r1, r2, r3)
            o.LogoutDialog_ViewBinding r0 = (o.LogoutDialog_ViewBinding) r0
            r9 = r0
            r0 = r5
            r1 = r9
            r0.a = r1
            r0 = r9
            android.widget.EditText r0 = r0.f
            r10 = r0
            r0 = r5
            r1 = r10
            r0.d = r1
            r0 = r10
            r1 = 4
            r0.setVisibility(r1)
            o.MasaBerlakuKTPDialog_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver r0 = new o.MasaBerlakuKTPDialog_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver
            r1 = r0
            r2 = r5
            r3 = 0
            r1.<init>(r2, r3)
            r7 = r0
            r0 = r5
            r1 = r7
            r0.e = r1
            r0 = r10
            r1 = r7
            r0.addTextChangedListener(r1)
            r0 = r5
            r0.b()
            r0 = r5
            r1 = r6
            r0.addView(r1)
            r0 = r5
            r1 = r9
            r0.addView(r1)
            r0 = r5
            r1 = r5
            int r2 = o.BaseDialogKotlin$MediaBrowserCompat$ItemReceiver.r
            android.view.View r1 = r1.findViewById(r2)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.c = r1
            r0 = r10
            r1 = 0
            r0.setSaveEnabled(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.MasaBerlakuKTPDialog_ViewBinding.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    private void b() {
        if (Build.VERSION.SDK_INT >= 24) {
            this.d.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
        }
    }

    public final void d(InputFilter inputFilter) {
        InputFilter[] filters = this.d.getFilters();
        InputFilter[] inputFilterArr = (InputFilter[]) Arrays.copyOf(filters, filters.length + 1);
        inputFilterArr[filters.length] = inputFilter;
        this.d.setFilters(inputFilterArr);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.widget.CompoundButton, o.chooseBelumYakinBertransaksi] */
    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.b.isChecked();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        onConfigurationChanged(configuration);
        b();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.widget.CompoundButton, o.chooseBelumYakinBertransaksi] */
    /* JADX WARN: Type inference failed for: r0v8, types: [android.view.View, o.chooseBelumYakinBertransaksi] */
    /* JADX WARN: Unknown variable types count: 1 */
    @Override // android.widget.Checkable
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void setChecked(boolean r4) {
        /*
            r3 = this;
            r0 = r3
            o.chooseBelumYakinBertransaksi r0 = r0.b
            r1 = r4
            r0.setChecked(r1)
            r0 = r3
            android.widget.EditText r0 = r0.d
            r5 = r0
            r0 = 0
            r6 = r0
            r0 = r4
            if (r0 == 0) goto L_0x0019
            r0 = 0
            r7 = r0
            goto L_0x001c
        L_0x0019:
            r0 = 4
            r7 = r0
        L_0x001c:
            r0 = r5
            r1 = r7
            r0.setVisibility(r1)
            r0 = r3
            o.chooseBelumYakinBertransaksi r0 = r0.b
            r5 = r0
            r0 = r6
            r7 = r0
            r0 = r4
            if (r0 == 0) goto L_0x0032
            r0 = 8
            r7 = r0
        L_0x0032:
            r0 = r5
            r1 = r7
            r0.setVisibility(r1)
            r0 = r3
            boolean r0 = r0.isChecked()
            if (r0 == 0) goto L_0x0066
            r0 = r3
            android.widget.EditText r0 = r0.d
            boolean r0 = r0.requestFocus()
            r0 = r3
            android.widget.EditText r0 = r0.d
            android.text.Editable r0 = r0.getText()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0066
            r0 = r3
            android.widget.EditText r0 = r0.d
            r5 = r0
            r0 = r5
            r1 = r5
            android.text.Editable r1 = r1.getText()
            int r1 = r1.length()
            r0.setSelection(r1)
        L_0x0066:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.MasaBerlakuKTPDialog_ViewBinding.setChecked(boolean):void");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View, o.chooseBelumYakinBertransaksi] */
    public void setChipDelegate(onDismiss ondismiss) {
        findFragmentByWho.d((View) this.b, ondismiss);
    }

    public void setCursorVisible(boolean z) {
        this.d.setCursorVisible(z);
    }

    public void setHelperText(CharSequence charSequence) {
        this.c.setText(charSequence);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View, o.chooseBelumYakinBertransaksi] */
    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.b.setOnClickListener(onClickListener);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View, o.chooseBelumYakinBertransaksi] */
    @Override // android.view.View
    public void setTag(int i, Object obj) {
        this.b.setTag(i, obj);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.widget.TextView, o.chooseBelumYakinBertransaksi] */
    public void setText(CharSequence charSequence) {
        this.b.setText(MessageDialog.a(getResources(), charSequence, "%02d"));
        if (!TextUtils.isEmpty(this.d.getText())) {
            this.d.removeTextChangedListener(this.e);
            this.d.setText((CharSequence) null);
            this.d.addTextChangedListener(this.e);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.widget.CompoundButton, o.chooseBelumYakinBertransaksi] */
    @Override // android.widget.Checkable
    public void toggle() {
        this.b.toggle();
    }
}
