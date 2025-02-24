package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.TimeZone;
/* loaded from: classes2-dex2jar.jar:o/DaftarTransferBerhasilDiupdateDialog.class */
public final class DaftarTransferBerhasilDiupdateDialog implements Parcelable {
    public static final Parcelable.Creator<DaftarTransferBerhasilDiupdateDialog> CREATOR = new Parcelable.Creator<DaftarTransferBerhasilDiupdateDialog>() { // from class: o.DaftarTransferBerhasilDiupdateDialog.4
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ DaftarTransferBerhasilDiupdateDialog createFromParcel(Parcel parcel) {
            return new DaftarTransferBerhasilDiupdateDialog((DeskripsiPekerjaanDialog_ViewBinding) parcel.readParcelable(DeskripsiPekerjaanDialog_ViewBinding.class.getClassLoader()), (DeskripsiPekerjaanDialog_ViewBinding) parcel.readParcelable(DeskripsiPekerjaanDialog_ViewBinding.class.getClassLoader()), (read) parcel.readParcelable(read.class.getClassLoader()), (DeskripsiPekerjaanDialog_ViewBinding) parcel.readParcelable(DeskripsiPekerjaanDialog_ViewBinding.class.getClassLoader()), (byte) 0);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ DaftarTransferBerhasilDiupdateDialog[] newArray(int i) {
            return new DaftarTransferBerhasilDiupdateDialog[i];
        }
    };
    final DeskripsiPekerjaanDialog_ViewBinding a;
    DeskripsiPekerjaanDialog_ViewBinding b;
    final DeskripsiPekerjaanDialog_ViewBinding c;
    final read d;
    final int e;
    final int g;

    /* loaded from: classes2-dex2jar.jar:o/DaftarTransferBerhasilDiupdateDialog$RemoteActionCompatParcelizer.class */
    public static final class RemoteActionCompatParcelizer {
        static final long c;
        static final long e;
        long a;
        long b;
        Long d;
        read j;

        static {
            Calendar instance = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
            instance.clear();
            instance.set(1, 1900);
            instance.set(2, 0);
            long j = new DeskripsiPekerjaanDialog_ViewBinding(instance).i;
            Calendar instance2 = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
            instance2.clear();
            instance2.setTimeInMillis(j);
            e = ErrorGetRateBNDialog_ViewBinding.c(instance2).getTimeInMillis();
            Calendar instance3 = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
            instance3.clear();
            instance3.set(1, 2100);
            instance3.set(2, 11);
            long j2 = new DeskripsiPekerjaanDialog_ViewBinding(instance3).i;
            Calendar instance4 = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
            instance4.clear();
            instance4.setTimeInMillis(j2);
            c = ErrorGetRateBNDialog_ViewBinding.c(instance4).getTimeInMillis();
        }

        public RemoteActionCompatParcelizer() {
            this.a = e;
            this.b = c;
            this.j = new DeleteAccountSuccessDialog(Long.MIN_VALUE);
        }

        public RemoteActionCompatParcelizer(DaftarTransferBerhasilDiupdateDialog daftarTransferBerhasilDiupdateDialog) {
            this.a = e;
            this.b = c;
            this.j = new DeleteAccountSuccessDialog(Long.MIN_VALUE);
            this.a = daftarTransferBerhasilDiupdateDialog.c.i;
            this.b = daftarTransferBerhasilDiupdateDialog.a.i;
            this.d = Long.valueOf(daftarTransferBerhasilDiupdateDialog.b.i);
            this.j = daftarTransferBerhasilDiupdateDialog.d;
        }
    }

    /* loaded from: classes2-dex2jar.jar:o/DaftarTransferBerhasilDiupdateDialog$read.class */
    public interface read extends Parcelable {
        boolean b(long j);
    }

    private DaftarTransferBerhasilDiupdateDialog(DeskripsiPekerjaanDialog_ViewBinding deskripsiPekerjaanDialog_ViewBinding, DeskripsiPekerjaanDialog_ViewBinding deskripsiPekerjaanDialog_ViewBinding2, read read2, DeskripsiPekerjaanDialog_ViewBinding deskripsiPekerjaanDialog_ViewBinding3) {
        this.c = deskripsiPekerjaanDialog_ViewBinding;
        this.a = deskripsiPekerjaanDialog_ViewBinding2;
        this.b = deskripsiPekerjaanDialog_ViewBinding3;
        this.d = read2;
        if (deskripsiPekerjaanDialog_ViewBinding3 != null && deskripsiPekerjaanDialog_ViewBinding.e.compareTo(deskripsiPekerjaanDialog_ViewBinding3.e) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        } else if (deskripsiPekerjaanDialog_ViewBinding3 == null || deskripsiPekerjaanDialog_ViewBinding3.e.compareTo(deskripsiPekerjaanDialog_ViewBinding2.e) <= 0) {
            this.e = deskripsiPekerjaanDialog_ViewBinding.b(deskripsiPekerjaanDialog_ViewBinding2) + 1;
            this.g = (deskripsiPekerjaanDialog_ViewBinding2.g - deskripsiPekerjaanDialog_ViewBinding.g) + 1;
        } else {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
    }

    public /* synthetic */ DaftarTransferBerhasilDiupdateDialog(DeskripsiPekerjaanDialog_ViewBinding deskripsiPekerjaanDialog_ViewBinding, DeskripsiPekerjaanDialog_ViewBinding deskripsiPekerjaanDialog_ViewBinding2, read read2, DeskripsiPekerjaanDialog_ViewBinding deskripsiPekerjaanDialog_ViewBinding3, byte b) {
        this(deskripsiPekerjaanDialog_ViewBinding, deskripsiPekerjaanDialog_ViewBinding2, read2, deskripsiPekerjaanDialog_ViewBinding3);
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
        if (!(obj instanceof DaftarTransferBerhasilDiupdateDialog)) {
            return false;
        }
        DaftarTransferBerhasilDiupdateDialog daftarTransferBerhasilDiupdateDialog = (DaftarTransferBerhasilDiupdateDialog) obj;
        if (!this.c.equals(daftarTransferBerhasilDiupdateDialog.c) || !this.a.equals(daftarTransferBerhasilDiupdateDialog.a) || !onDetach.a(this.b, daftarTransferBerhasilDiupdateDialog.b) || !this.d.equals(daftarTransferBerhasilDiupdateDialog.d)) {
            z = false;
        }
        return z;
    }

    @Override // java.lang.Object
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.c, this.a, this.b, this.d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.c, 0);
        parcel.writeParcelable(this.a, 0);
        parcel.writeParcelable(this.b, 0);
        parcel.writeParcelable(this.d, 0);
    }
}
