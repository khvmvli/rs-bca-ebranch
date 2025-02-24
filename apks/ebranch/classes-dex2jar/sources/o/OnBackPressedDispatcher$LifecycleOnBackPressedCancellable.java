package o;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes-dex2jar.jar:o/OnBackPressedDispatcher$LifecycleOnBackPressedCancellable.class */
public final class OnBackPressedDispatcher$LifecycleOnBackPressedCancellable implements Parcelable {
    public static final Parcelable.Creator<OnBackPressedDispatcher$LifecycleOnBackPressedCancellable> CREATOR = new Parcelable.Creator<OnBackPressedDispatcher$LifecycleOnBackPressedCancellable>() { // from class: o.OnBackPressedDispatcher$LifecycleOnBackPressedCancellable.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ OnBackPressedDispatcher$LifecycleOnBackPressedCancellable createFromParcel(Parcel parcel) {
            return new OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ OnBackPressedDispatcher$LifecycleOnBackPressedCancellable[] newArray(int i) {
            return new OnBackPressedDispatcher$LifecycleOnBackPressedCancellable[i];
        }
    };
    public final int a;
    public final int b;
    public final Intent c;
    public final IntentSender e;

    /* loaded from: classes-dex2jar.jar:o/OnBackPressedDispatcher$LifecycleOnBackPressedCancellable$RemoteActionCompatParcelizer.class */
    public static final class RemoteActionCompatParcelizer {
        public int a;
        public int b;
        public IntentSender c;
        public Intent d;

        public RemoteActionCompatParcelizer(IntentSender intentSender) {
            this.c = intentSender;
        }
    }

    public OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(IntentSender intentSender, Intent intent, int i, int i2) {
        this.e = intentSender;
        this.c = intent;
        this.b = i;
        this.a = i2;
    }

    OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(Parcel parcel) {
        this.e = (IntentSender) parcel.readParcelable(IntentSender.class.getClassLoader());
        this.c = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
        this.b = parcel.readInt();
        this.a = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.e, i);
        parcel.writeParcelable(this.c, i);
        parcel.writeInt(this.b);
        parcel.writeInt(this.a);
    }
}
