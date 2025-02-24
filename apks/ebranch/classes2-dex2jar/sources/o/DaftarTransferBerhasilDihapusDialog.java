package o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import java.util.ArrayList;
import o.BaseDialogKotlin;
import o.getChildFragmentManager;
/* loaded from: classes2-dex2jar.jar:o/DaftarTransferBerhasilDihapusDialog.class */
public class DaftarTransferBerhasilDihapusDialog extends clickedBatal {
    private static final int i = BaseDialogKotlin.MediaDescriptionCompat.s;
    boolean a;
    final read b;
    boolean c;
    boolean d;
    int e;
    private IconCompatParcelizer f;
    private DaftarTransferBerhasilDihapusDialog$MediaBrowserCompat$CustomActionResultReceiver g;
    private int h;
    private int j;

    /* loaded from: classes2-dex2jar.jar:o/DaftarTransferBerhasilDihapusDialog$IconCompatParcelizer.class */
    public interface IconCompatParcelizer {
    }

    /* loaded from: classes2-dex2jar.jar:o/DaftarTransferBerhasilDihapusDialog$RemoteActionCompatParcelizer.class */
    public static final class RemoteActionCompatParcelizer extends ViewGroup.MarginLayoutParams {
        public RemoteActionCompatParcelizer(int i, int i2) {
            super(-2, -2);
        }

        public RemoteActionCompatParcelizer(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public RemoteActionCompatParcelizer(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2-dex2jar.jar:o/DaftarTransferBerhasilDihapusDialog$read.class */
    public final class read implements CompoundButton.OnCheckedChangeListener {
        private read() {
            DaftarTransferBerhasilDihapusDialog.this = r4;
        }

        /* synthetic */ read(DaftarTransferBerhasilDihapusDialog daftarTransferBerhasilDihapusDialog, byte b) {
            this();
        }

        /* JADX WARN: Type inference failed for: r0v44, types: [android.widget.CompoundButton, o.chooseBelumYakinBertransaksi] */
        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (!DaftarTransferBerhasilDihapusDialog.this.c) {
                DaftarTransferBerhasilDihapusDialog daftarTransferBerhasilDihapusDialog = DaftarTransferBerhasilDihapusDialog.this;
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < daftarTransferBerhasilDihapusDialog.getChildCount(); i++) {
                    View childAt = daftarTransferBerhasilDihapusDialog.getChildAt(i);
                    if ((childAt instanceof chooseBelumYakinBertransaksi) && ((chooseBelumYakinBertransaksi) childAt).isChecked()) {
                        arrayList.add(Integer.valueOf(childAt.getId()));
                        if (daftarTransferBerhasilDihapusDialog.a) {
                            break;
                        }
                    }
                }
                if (!arrayList.isEmpty() || !DaftarTransferBerhasilDihapusDialog.this.d) {
                    int id = compoundButton.getId();
                    if (z) {
                        if (!(DaftarTransferBerhasilDihapusDialog.this.e == -1 || DaftarTransferBerhasilDihapusDialog.this.e == id || !DaftarTransferBerhasilDihapusDialog.this.a)) {
                            DaftarTransferBerhasilDihapusDialog daftarTransferBerhasilDihapusDialog2 = DaftarTransferBerhasilDihapusDialog.this;
                            DaftarTransferBerhasilDihapusDialog.c(daftarTransferBerhasilDihapusDialog2, daftarTransferBerhasilDihapusDialog2.e, false);
                        }
                        DaftarTransferBerhasilDihapusDialog.this.e = id;
                    } else if (DaftarTransferBerhasilDihapusDialog.this.e == id) {
                        DaftarTransferBerhasilDihapusDialog.this.e = -1;
                    }
                } else {
                    DaftarTransferBerhasilDihapusDialog.c(DaftarTransferBerhasilDihapusDialog.this, compoundButton.getId(), true);
                    DaftarTransferBerhasilDihapusDialog.this.e = compoundButton.getId();
                }
            }
        }
    }

    public DaftarTransferBerhasilDihapusDialog(Context context) {
        this(context, null);
    }

    public DaftarTransferBerhasilDihapusDialog(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, BaseDialogKotlin$MediaBrowserCompat$CustomActionResultReceiver.g);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public DaftarTransferBerhasilDihapusDialog(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
        // Method dump skipped, instructions count: 203
        */
        throw new UnsupportedOperationException("Method not decompiled: o.DaftarTransferBerhasilDihapusDialog.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [android.widget.CompoundButton, o.chooseBelumYakinBertransaksi] */
    static /* synthetic */ void c(DaftarTransferBerhasilDihapusDialog daftarTransferBerhasilDihapusDialog, int i2, boolean z) {
        View findViewById = daftarTransferBerhasilDihapusDialog.findViewById(i2);
        if (findViewById instanceof chooseBelumYakinBertransaksi) {
            daftarTransferBerhasilDihapusDialog.c = true;
            ((chooseBelumYakinBertransaksi) findViewById).setChecked(z);
            daftarTransferBerhasilDihapusDialog.c = false;
        }
    }

    /* JADX WARN: Type inference failed for: r0v19, types: [android.widget.CompoundButton, o.chooseBelumYakinBertransaksi] */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.widget.CompoundButton, android.view.View, o.chooseBelumYakinBertransaksi] */
    /* JADX WARN: Unknown variable types count: 1 */
    @Override // android.view.ViewGroup
    /* Code decompiled incorrectly, please refer to instructions dump */
    public void addView(android.view.View r6, int r7, android.view.ViewGroup.LayoutParams r8) {
        /*
            r5 = this;
            r0 = r6
            boolean r0 = r0 instanceof o.chooseBelumYakinBertransaksi
            if (r0 == 0) goto L_0x0054
            r0 = r6
            o.chooseBelumYakinBertransaksi r0 = (o.chooseBelumYakinBertransaksi) r0
            r9 = r0
            r0 = r9
            boolean r0 = r0.isChecked()
            if (r0 == 0) goto L_0x0054
            r0 = r5
            int r0 = r0.e
            r10 = r0
            r0 = r10
            r1 = -1
            if (r0 == r1) goto L_0x004b
            r0 = r5
            boolean r0 = r0.a
            if (r0 == 0) goto L_0x004b
            r0 = r5
            r1 = r10
            android.view.View r0 = r0.findViewById(r1)
            r11 = r0
            r0 = r11
            boolean r0 = r0 instanceof o.chooseBelumYakinBertransaksi
            if (r0 == 0) goto L_0x004b
            r0 = r5
            r1 = 1
            r0.c = r1
            r0 = r11
            o.chooseBelumYakinBertransaksi r0 = (o.chooseBelumYakinBertransaksi) r0
            r1 = 0
            r0.setChecked(r1)
            r0 = r5
            r1 = 0
            r0.c = r1
        L_0x004b:
            r0 = r5
            r1 = r9
            int r1 = r1.getId()
            r0.e = r1
        L_0x0054:
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            r0.addView(r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.DaftarTransferBerhasilDihapusDialog.addView(android.view.View, int, android.view.ViewGroup$LayoutParams):void");
    }

    @Override // o.clickedBatal
    public final boolean c() {
        return c();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return checkLayoutParams(layoutParams) && (layoutParams instanceof RemoteActionCompatParcelizer);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new RemoteActionCompatParcelizer(-2, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new RemoteActionCompatParcelizer(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new RemoteActionCompatParcelizer(layoutParams);
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [android.widget.CompoundButton, o.chooseBelumYakinBertransaksi] */
    @Override // android.view.View
    protected void onFinishInflate() {
        onFinishInflate();
        int i2 = this.e;
        if (i2 != -1) {
            View findViewById = findViewById(i2);
            if (findViewById instanceof chooseBelumYakinBertransaksi) {
                this.c = true;
                ((chooseBelumYakinBertransaksi) findViewById).setChecked(true);
                this.c = false;
            }
            this.e = this.e;
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i2;
        onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        getChildFragmentManager d = getChildFragmentManager.d(accessibilityNodeInfo);
        if (c()) {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                i2 = i4;
                if (i3 >= getChildCount()) {
                    break;
                }
                i4 = i4;
                if (getChildAt(i3) instanceof chooseBelumYakinBertransaksi) {
                    i4++;
                }
                i3++;
            }
        } else {
            i2 = -1;
        }
        d.c(getChildFragmentManager.MediaBrowserCompat.CustomActionResultReceiver.b(b(), i2, false, this.a ? 1 : 2));
    }

    public void setChipSpacing(int i2) {
        setChipSpacingHorizontal(i2);
        setChipSpacingVertical(i2);
    }

    public void setChipSpacingHorizontal(int i2) {
        if (this.h != i2) {
            this.h = i2;
            d(i2);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i2) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i2));
    }

    public void setChipSpacingResource(int i2) {
        setChipSpacing(getResources().getDimensionPixelOffset(i2));
    }

    public void setChipSpacingVertical(int i2) {
        if (this.j != i2) {
            this.j = i2;
            c(i2);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i2) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i2));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i2) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    public void setOnCheckedChangeListener(IconCompatParcelizer iconCompatParcelizer) {
        this.f = iconCompatParcelizer;
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.g.c = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z) {
        this.d = z;
    }

    @Deprecated
    public void setShowDividerHorizontal(int i2) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i2) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    public void setSingleLine(int i2) {
        setSingleLine(getResources().getBoolean(i2));
    }

    @Override // o.clickedBatal
    public void setSingleLine(boolean z) {
        setSingleLine(z);
    }

    public void setSingleSelection(int i2) {
        setSingleSelection(getResources().getBoolean(i2));
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [android.widget.CompoundButton, o.chooseBelumYakinBertransaksi] */
    public void setSingleSelection(boolean z) {
        if (this.a != z) {
            this.a = z;
            this.c = true;
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                View childAt = getChildAt(i2);
                if (childAt instanceof chooseBelumYakinBertransaksi) {
                    ((chooseBelumYakinBertransaksi) childAt).setChecked(false);
                }
            }
            this.c = false;
            this.e = -1;
        }
    }
}
