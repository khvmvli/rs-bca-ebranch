package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import o.DaftarTransferBerhasilDiupdateDialog;
/* loaded from: classes2-dex2jar.jar:o/DeleteAccountSuccessDialog.class */
public final class DeleteAccountSuccessDialog implements DaftarTransferBerhasilDiupdateDialog.read {
    public static final Parcelable.Creator<DeleteAccountSuccessDialog> CREATOR = new Parcelable.Creator<DeleteAccountSuccessDialog>() { // from class: o.DeleteAccountSuccessDialog.4
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ DeleteAccountSuccessDialog createFromParcel(Parcel parcel) {
            return new DeleteAccountSuccessDialog(parcel.readLong(), (byte) 0);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ DeleteAccountSuccessDialog[] newArray(int i) {
            return new DeleteAccountSuccessDialog[i];
        }
    };
    private final long c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DeleteAccountSuccessDialog(long j) {
        this.c = j;
    }

    /* synthetic */ DeleteAccountSuccessDialog(long j, byte b) {
        this(j);
    }

    @Override // o.DaftarTransferBerhasilDiupdateDialog.read
    public final boolean b(long j) {
        return j >= this.c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Object
    public final boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeleteAccountSuccessDialog)) {
            return false;
        }
        if (this.c != ((DeleteAccountSuccessDialog) obj).c) {
            z = false;
        }
        return z;
    }

    @Override // java.lang.Object
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.c);
    }
}
