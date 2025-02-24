package o;

import android.os.Parcel;
import android.os.Parcelable;
import org.joda.time.DateTimeConstants;
/* loaded from: classes2-dex2jar.jar:o/OR5DataPenerimaFragment.class */
public class OR5DataPenerimaFragment implements Parcelable, Comparable<OR5DataPenerimaFragment> {
    public static final Parcelable.Creator<OR5DataPenerimaFragment> CREATOR = new Parcelable.Creator<OR5DataPenerimaFragment>() { // from class: o.OR5DataPenerimaFragment.2
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ OR5DataPenerimaFragment createFromParcel(Parcel parcel) {
            return new OR5DataPenerimaFragment(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ OR5DataPenerimaFragment[] newArray(int i) {
            return new OR5DataPenerimaFragment[i];
        }
    };
    int a;
    int b;
    int e;

    /* renamed from: o.OR5DataPenerimaFragment$5  reason: invalid class name */
    /* loaded from: classes2-dex2jar.jar:o/OR5DataPenerimaFragment$5.class */
    static final /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] e;

        static {
            int[] iArr = new int[IconCompatParcelizer.values().length];
            e = iArr;
            try {
                iArr[IconCompatParcelizer.SECOND.ordinal()] = 1;
            } catch (NoSuchFieldError e2) {
            }
            try {
                e[IconCompatParcelizer.MINUTE.ordinal()] = 2;
            } catch (NoSuchFieldError e3) {
            }
            try {
                e[IconCompatParcelizer.HOUR.ordinal()] = 3;
            } catch (NoSuchFieldError e4) {
            }
        }
    }

    /* loaded from: classes2-dex2jar.jar:o/OR5DataPenerimaFragment$IconCompatParcelizer.class */
    public enum IconCompatParcelizer {
        HOUR,
        MINUTE,
        SECOND
    }

    public OR5DataPenerimaFragment(int i) {
        this(12, 0);
    }

    public OR5DataPenerimaFragment(int i, int i2) {
        this(i, i2, 0);
    }

    public OR5DataPenerimaFragment(int i, int i2, int i3) {
        this.e = i % 24;
        this.b = i2 % 60;
        this.a = i3 % 60;
    }

    public OR5DataPenerimaFragment(Parcel parcel) {
        this.e = parcel.readInt();
        this.b = parcel.readInt();
        this.a = parcel.readInt();
    }

    public OR5DataPenerimaFragment(OR5DataPenerimaFragment oR5DataPenerimaFragment) {
        this(oR5DataPenerimaFragment.e, oR5DataPenerimaFragment.b, oR5DataPenerimaFragment.a);
    }

    public final void a(IconCompatParcelizer iconCompatParcelizer, int i) {
        int i2 = i;
        if (iconCompatParcelizer == IconCompatParcelizer.MINUTE) {
            i2 = i * 60;
        }
        int i3 = i2;
        if (iconCompatParcelizer == IconCompatParcelizer.HOUR) {
            i3 = i2 * DateTimeConstants.SECONDS_PER_HOUR;
        }
        int i4 = i3 + (this.e * DateTimeConstants.SECONDS_PER_HOUR) + (this.b * 60) + this.a;
        int i5 = AnonymousClass5.e[iconCompatParcelizer.ordinal()];
        if (i5 == 1) {
            this.a = (i4 % DateTimeConstants.SECONDS_PER_HOUR) % 60;
        } else if (i5 != 2) {
            if (i5 != 3) {
                return;
            }
            this.e = (i4 / DateTimeConstants.SECONDS_PER_HOUR) % 24;
        }
        this.b = (i4 % DateTimeConstants.SECONDS_PER_HOUR) / 60;
        this.e = (i4 / DateTimeConstants.SECONDS_PER_HOUR) % 24;
    }

    public final int c(IconCompatParcelizer iconCompatParcelizer) {
        int i = AnonymousClass5.e[iconCompatParcelizer.ordinal()];
        return i != 1 ? i != 2 ? this.e : this.b : this.a;
    }

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(OR5DataPenerimaFragment oR5DataPenerimaFragment) {
        return hashCode() - oR5DataPenerimaFragment.hashCode();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
        if (r0 == 3) goto L_0x0054;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
        r8 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0070, code lost:
        if (r4.e == r3.e) goto L_0x0027;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0065  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final boolean e(o.OR5DataPenerimaFragment r4, o.OR5DataPenerimaFragment.IconCompatParcelizer r5) {
        /*
            r3 = this;
            r0 = 0
            r6 = r0
            r0 = r4
            if (r0 != 0) goto L_0x0008
            r0 = 0
            return r0
        L_0x0008:
            int[] r0 = o.OR5DataPenerimaFragment.AnonymousClass5.e
            r1 = r5
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r7 = r0
            r0 = r7
            r1 = 1
            if (r0 == r1) goto L_0x002d
            r0 = r7
            r1 = 2
            if (r0 == r1) goto L_0x003e
            r0 = r7
            r1 = 3
            if (r0 != r1) goto L_0x0027
            goto L_0x0054
        L_0x0027:
            r0 = 1
            r8 = r0
            goto L_0x0076
        L_0x002d:
            r0 = r4
            int r0 = r0.a
            r1 = r3
            int r1 = r1.a
            if (r0 == r1) goto L_0x003e
            r0 = 0
            r7 = r0
            goto L_0x0041
        L_0x003e:
            r0 = 1
            r7 = r0
        L_0x0041:
            r0 = r7
            if (r0 == 0) goto L_0x005a
            r0 = r4
            int r0 = r0.b
            r1 = r3
            int r1 = r1.b
            if (r0 == r1) goto L_0x0054
            goto L_0x005a
        L_0x0054:
            r0 = 1
            r7 = r0
            goto L_0x005d
        L_0x005a:
            r0 = 0
            r7 = r0
        L_0x005d:
            r0 = r6
            r8 = r0
            r0 = r7
            if (r0 == 0) goto L_0x0076
            r0 = r6
            r8 = r0
            r0 = r4
            int r0 = r0.e
            r1 = r3
            int r1 = r1.e
            if (r0 != r1) goto L_0x0076
            goto L_0x0027
        L_0x0076:
            r0 = r8
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.OR5DataPenerimaFragment.e(o.OR5DataPenerimaFragment, o.OR5DataPenerimaFragment$IconCompatParcelizer):boolean");
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        if (hashCode() != ((OR5DataPenerimaFragment) obj).hashCode()) {
            z = false;
        }
        return z;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return (this.e * DateTimeConstants.SECONDS_PER_HOUR) + (this.b * 60) + this.a;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder sb = new StringBuilder("");
        sb.append(this.e);
        sb.append("h ");
        sb.append(this.b);
        sb.append("m ");
        sb.append(this.a);
        sb.append("s");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.e);
        parcel.writeInt(this.b);
        parcel.writeInt(this.a);
    }
}
