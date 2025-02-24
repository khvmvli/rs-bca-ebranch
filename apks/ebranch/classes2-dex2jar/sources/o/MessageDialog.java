package o;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
/* loaded from: classes2-dex2jar.jar:o/MessageDialog.class */
final class MessageDialog implements Parcelable {
    public static final Parcelable.Creator<MessageDialog> CREATOR = new Parcelable.Creator<MessageDialog>() { // from class: o.MessageDialog.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ MessageDialog createFromParcel(Parcel parcel) {
            return new MessageDialog(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ MessageDialog[] newArray(int i) {
            return new MessageDialog[i];
        }
    };
    final PaidExpiredBankNotesDialog a;
    final PaidExpiredBankNotesDialog b;
    int c;
    int d;
    final int e;
    int g;
    int i;

    public MessageDialog() {
        this(0);
    }

    private MessageDialog(int i) {
        this(0, 0, 10, 0);
    }

    private MessageDialog(int i, int i2, int i3, int i4) {
        this.c = i;
        this.d = i2;
        this.g = i3;
        this.e = i4;
        int i5 = 12;
        this.i = i >= 12 ? 1 : 0;
        this.a = new PaidExpiredBankNotesDialog(59);
        this.b = new PaidExpiredBankNotesDialog(i4 == 1 ? 24 : i5);
    }

    protected MessageDialog(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
    }

    public static String a(Resources resources, CharSequence charSequence, String str) {
        return String.format(resources.getConfiguration().locale, str, Integer.valueOf(Integer.parseInt(String.valueOf(charSequence))));
    }

    public final void b(int i) {
        if (this.e == 1) {
            this.c = i;
        } else {
            this.c = (i % 12) + (this.i != 1 ? 0 : 12);
        }
    }

    public final int d() {
        if (this.e == 1) {
            return this.c % 24;
        }
        int i = this.c;
        if (i % 12 == 0) {
            return 12;
        }
        int i2 = i;
        if (this.i == 1) {
            i2 = i - 12;
        }
        return i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void e(int i) {
        if (i != this.i) {
            this.i = i;
            int i2 = this.c;
            if (i2 < 12 && i == 1) {
                this.c = i2 + 12;
            } else if (i2 >= 12 && i == 0) {
                this.c = i2 - 12;
            }
        }
    }

    @Override // java.lang.Object
    public final boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessageDialog)) {
            return false;
        }
        MessageDialog messageDialog = (MessageDialog) obj;
        if (!(this.c == messageDialog.c && this.d == messageDialog.d && this.e == messageDialog.e && this.g == messageDialog.g)) {
            z = false;
        }
        return z;
    }

    @Override // java.lang.Object
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.e), Integer.valueOf(this.c), Integer.valueOf(this.d), Integer.valueOf(this.g)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.g);
        parcel.writeInt(this.e);
    }
}
