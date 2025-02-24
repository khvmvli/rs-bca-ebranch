package o;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.format.DateUtils;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;
/* loaded from: classes2-dex2jar.jar:o/DeskripsiPekerjaanDialog_ViewBinding.class */
final class DeskripsiPekerjaanDialog_ViewBinding implements Comparable<DeskripsiPekerjaanDialog_ViewBinding>, Parcelable {
    public static final Parcelable.Creator<DeskripsiPekerjaanDialog_ViewBinding> CREATOR = new Parcelable.Creator<DeskripsiPekerjaanDialog_ViewBinding>() { // from class: o.DeskripsiPekerjaanDialog_ViewBinding.2
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ DeskripsiPekerjaanDialog_ViewBinding createFromParcel(Parcel parcel) {
            return DeskripsiPekerjaanDialog_ViewBinding.a(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ DeskripsiPekerjaanDialog_ViewBinding[] newArray(int i) {
            return new DeskripsiPekerjaanDialog_ViewBinding[i];
        }
    };
    final int a;
    String b;
    final int c;
    final int d;
    final Calendar e;
    final int g;
    final long i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DeskripsiPekerjaanDialog_ViewBinding(Calendar calendar) {
        calendar.set(5, 1);
        Calendar c = ErrorGetRateBNDialog_ViewBinding.c(calendar);
        this.e = c;
        this.a = c.get(2);
        this.g = c.get(1);
        this.d = c.getMaximum(7);
        this.c = c.getActualMaximum(5);
        this.i = c.getTimeInMillis();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static DeskripsiPekerjaanDialog_ViewBinding a(int i, int i2) {
        Calendar instance = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        instance.clear();
        instance.set(1, i);
        instance.set(2, i2);
        return new DeskripsiPekerjaanDialog_ViewBinding(instance);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static DeskripsiPekerjaanDialog_ViewBinding a(long j) {
        Calendar instance = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        instance.clear();
        instance.setTimeInMillis(j);
        return new DeskripsiPekerjaanDialog_ViewBinding(instance);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int b(DeskripsiPekerjaanDialog_ViewBinding deskripsiPekerjaanDialog_ViewBinding) {
        if (this.e instanceof GregorianCalendar) {
            return ((deskripsiPekerjaanDialog_ViewBinding.g - this.g) * 12) + (deskripsiPekerjaanDialog_ViewBinding.a - this.a);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(DeskripsiPekerjaanDialog_ViewBinding deskripsiPekerjaanDialog_ViewBinding) {
        return this.e.compareTo(deskripsiPekerjaanDialog_ViewBinding.e);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int e() {
        int firstDayOfWeek = this.e.get(7) - this.e.getFirstDayOfWeek();
        int i = firstDayOfWeek;
        if (firstDayOfWeek < 0) {
            i = firstDayOfWeek + this.d;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String e(Context context) {
        if (this.b == null) {
            long timeInMillis = this.e.getTimeInMillis();
            this.b = DateUtils.formatDateTime(context, timeInMillis - ((long) TimeZone.getDefault().getOffset(timeInMillis)), 36);
        }
        return this.b;
    }

    @Override // java.lang.Object
    public final boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeskripsiPekerjaanDialog_ViewBinding)) {
            return false;
        }
        DeskripsiPekerjaanDialog_ViewBinding deskripsiPekerjaanDialog_ViewBinding = (DeskripsiPekerjaanDialog_ViewBinding) obj;
        if (!(this.a == deskripsiPekerjaanDialog_ViewBinding.a && this.g == deskripsiPekerjaanDialog_ViewBinding.g)) {
            z = false;
        }
        return z;
    }

    @Override // java.lang.Object
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.g)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.g);
        parcel.writeInt(this.a);
    }
}
