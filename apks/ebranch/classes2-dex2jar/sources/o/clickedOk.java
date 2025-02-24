package o;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;
import o.setHasDecor;
/* loaded from: classes2-dex2jar.jar:o/clickedOk.class */
public class clickedOk extends setPopupBackgroundResource implements Checkable {
    private static final int[] d = {16842912};
    private boolean b;
    boolean c;
    private boolean e;

    /* loaded from: classes2-dex2jar.jar:o/clickedOk$RemoteActionCompatParcelizer.class */
    static final class RemoteActionCompatParcelizer extends getPopEnterAnim {
        public static final Parcelable.Creator<RemoteActionCompatParcelizer> CREATOR = new Parcelable.ClassLoaderCreator<RemoteActionCompatParcelizer>() { // from class: o.clickedOk.RemoteActionCompatParcelizer.4
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new RemoteActionCompatParcelizer(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final /* synthetic */ RemoteActionCompatParcelizer createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new RemoteActionCompatParcelizer(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new RemoteActionCompatParcelizer[i];
            }
        };
        boolean a;

        public RemoteActionCompatParcelizer(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.a = parcel.readInt() != 1 ? false : true;
        }

        public RemoteActionCompatParcelizer(Parcelable parcelable) {
            super(parcelable);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            writeToParcel(parcel, i);
            parcel.writeInt(this.a ? 1 : 0);
        }
    }

    public clickedOk(Context context) {
        this(context, null);
    }

    public clickedOk(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, setHasDecor.MediaBrowserCompat.CustomActionResultReceiver.F);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public clickedOk(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = true;
        this.b = true;
        findFragmentByWho.d(this, new onDismiss() { // from class: o.clickedOk.2
            public final void b(View view, getChildFragmentManager getchildfragmentmanager) {
                b(view, getchildfragmentmanager);
                getchildfragmentmanager.c(clickedOk.this.c);
                getchildfragmentmanager.e(clickedOk.this.isChecked());
            }

            public final void c(View view, AccessibilityEvent accessibilityEvent) {
                c(view, accessibilityEvent);
                accessibilityEvent.setChecked(clickedOk.this.isChecked());
            }
        });
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.e;
    }

    public int[] onCreateDrawableState(int i) {
        if (!this.e) {
            return onCreateDrawableState(i);
        }
        int[] iArr = d;
        return mergeDrawableStates(onCreateDrawableState(i + iArr.length), iArr);
    }

    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof RemoteActionCompatParcelizer)) {
            onRestoreInstanceState(parcelable);
            return;
        }
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = (RemoteActionCompatParcelizer) parcelable;
        onRestoreInstanceState(((getPopEnterAnim) remoteActionCompatParcelizer).d);
        setChecked(remoteActionCompatParcelizer.a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.os.Parcelable, o.clickedOk$RemoteActionCompatParcelizer] */
    /* JADX WARN: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump */
    protected android.os.Parcelable onSaveInstanceState() {
        /*
            r4 = this;
            o.clickedOk$RemoteActionCompatParcelizer r0 = new o.clickedOk$RemoteActionCompatParcelizer
            r1 = r0
            r2 = r4
            android.os.Parcelable r2 = r2.onSaveInstanceState()
            r1.<init>(r2)
            r5 = r0
            r0 = r5
            r1 = r4
            boolean r1 = r1.e
            r0.a = r1
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.clickedOk.onSaveInstanceState():android.os.Parcelable");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setCheckable(boolean z) {
        if (this.c != z) {
            this.c = z;
            sendAccessibilityEvent(0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (this.c && this.e != z) {
            this.e = z;
            refreshDrawableState();
            sendAccessibilityEvent(2048);
        }
    }

    public void setPressable(boolean z) {
        this.b = z;
    }

    public void setPressed(boolean z) {
        if (this.b) {
            setPressed(z);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.e);
    }
}
