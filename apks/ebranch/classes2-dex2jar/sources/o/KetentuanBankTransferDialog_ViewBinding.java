package o;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes2-dex2jar.jar:o/KetentuanBankTransferDialog_ViewBinding.class */
public final class KetentuanBankTransferDialog_ViewBinding extends getPopEnterAnim {
    public static final Parcelable.Creator<KetentuanBankTransferDialog_ViewBinding> CREATOR = new Parcelable.ClassLoaderCreator<KetentuanBankTransferDialog_ViewBinding>() { // from class: o.KetentuanBankTransferDialog_ViewBinding.5
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new KetentuanBankTransferDialog_ViewBinding(parcel, null, (byte) 0);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public final /* synthetic */ KetentuanBankTransferDialog_ViewBinding createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new KetentuanBankTransferDialog_ViewBinding(parcel, classLoader, (byte) 0);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new KetentuanBankTransferDialog_ViewBinding[i];
        }
    };
    public final setCollapseIcon<String, Bundle> e;

    private KetentuanBankTransferDialog_ViewBinding(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[readInt];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.e = new setCollapseIcon<>(readInt);
        for (int i = 0; i < readInt; i++) {
            this.e.put(strArr[i], bundleArr[i]);
        }
    }

    /* synthetic */ KetentuanBankTransferDialog_ViewBinding(Parcel parcel, ClassLoader classLoader, byte b) {
        this(parcel, classLoader);
    }

    public KetentuanBankTransferDialog_ViewBinding(Parcelable parcelable) {
        super(parcelable);
        this.e = new setCollapseIcon<>();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExtendableSavedState{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" states=");
        sb.append(this.e);
        sb.append("}");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        writeToParcel(parcel, i);
        int size = this.e.size();
        parcel.writeInt(size);
        String[] strArr = new String[size];
        Bundle[] bundleArr = new Bundle[size];
        for (int i2 = 0; i2 < size; i2++) {
            int i3 = i2 << 1;
            strArr[i2] = (String) this.e.h[i3];
            bundleArr[i2] = (Bundle) this.e.h[i3 + 1];
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }
}
