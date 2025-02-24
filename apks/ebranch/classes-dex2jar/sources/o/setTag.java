package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
/* loaded from: classes-dex2jar.jar:o/setTag.class */
public class setTag extends setId {
    int b;
    setNavigationContentDescription d;
    private int j;

    public setTag(Context context) {
        super(context);
        setVisibility(8);
    }

    public setTag(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setVisibility(8);
    }

    public setTag(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.setId
    public final void a(AttributeSet attributeSet) {
        a(attributeSet);
        this.d = new setNavigationContentDescription();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.r);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.z) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.w) {
                    this.d.e = obtainStyledAttributes.getBoolean(index, true);
                } else if (index == setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.B) {
                    this.d.c = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.c = this.d;
        a();
    }

    @Override // o.setId
    public final void b(setTitleMarginEnd settitlemarginend, boolean z) {
        int i = this.b;
        this.j = i;
        if (z) {
            if (i == 5) {
                this.j = 1;
            } else if (i == 6) {
                this.j = 0;
            }
        } else if (i == 5) {
            this.j = 0;
        } else if (i == 6) {
            this.j = 1;
        }
        if (settitlemarginend instanceof setNavigationContentDescription) {
            ((setNavigationContentDescription) settitlemarginend).a = this.j;
        }
    }

    public void setAllowsGoneWidget(boolean z) {
        this.d.e = z;
    }

    public void setDpMargin(int i) {
        this.d.c = (int) ((((float) i) * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i) {
        this.d.c = i;
    }

    public void setType(int i) {
        this.b = i;
    }
}
