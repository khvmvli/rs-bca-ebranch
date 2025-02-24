package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;
import o.OR5DataPenerimaFragment;
import org.joda.time.DateTimeConstants;
/* loaded from: classes2-dex2jar.jar:o/OR4DataBankPenerimaFragment.class */
final class OR4DataBankPenerimaFragment implements showInfoCodewordnOR {
    public static final Parcelable.Creator<OR4DataBankPenerimaFragment> CREATOR = new Parcelable.Creator<OR4DataBankPenerimaFragment>() { // from class: o.OR4DataBankPenerimaFragment.2
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ OR4DataBankPenerimaFragment createFromParcel(Parcel parcel) {
            return new OR4DataBankPenerimaFragment(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ OR4DataBankPenerimaFragment[] newArray(int i) {
            return new OR4DataBankPenerimaFragment[i];
        }
    };
    private TreeSet<OR5DataPenerimaFragment> a;
    private TreeSet<OR5DataPenerimaFragment> b;
    private OR5DataPenerimaFragment c;
    private OR5DataPenerimaFragment d;
    private TreeSet<OR5DataPenerimaFragment> e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public OR4DataBankPenerimaFragment() {
        this.e = new TreeSet<>();
        this.a = new TreeSet<>();
        this.b = new TreeSet<>();
    }

    public OR4DataBankPenerimaFragment(Parcel parcel) {
        this.e = new TreeSet<>();
        this.a = new TreeSet<>();
        this.b = new TreeSet<>();
        this.c = (OR5DataPenerimaFragment) parcel.readParcelable(OR5DataPenerimaFragment.class.getClassLoader());
        this.d = (OR5DataPenerimaFragment) parcel.readParcelable(OR5DataPenerimaFragment.class.getClassLoader());
        this.e.addAll(Arrays.asList(parcel.createTypedArray(OR5DataPenerimaFragment.CREATOR)));
        this.a.addAll(Arrays.asList(parcel.createTypedArray(OR5DataPenerimaFragment.CREATOR)));
        TreeSet<OR5DataPenerimaFragment> treeSet = this.e;
        TreeSet<OR5DataPenerimaFragment> treeSet2 = this.a;
        TreeSet<OR5DataPenerimaFragment> treeSet3 = new TreeSet<>((SortedSet<OR5DataPenerimaFragment>) treeSet);
        treeSet3.removeAll(treeSet2);
        this.b = treeSet3;
    }

    private OR5DataPenerimaFragment e(OR5DataPenerimaFragment oR5DataPenerimaFragment, OR5DataPenerimaFragment.IconCompatParcelizer iconCompatParcelizer, OR5DataPenerimaFragment.IconCompatParcelizer iconCompatParcelizer2) {
        OR5DataPenerimaFragment oR5DataPenerimaFragment2 = new OR5DataPenerimaFragment(oR5DataPenerimaFragment);
        OR5DataPenerimaFragment oR5DataPenerimaFragment3 = new OR5DataPenerimaFragment(oR5DataPenerimaFragment);
        int i = iconCompatParcelizer2 == OR5DataPenerimaFragment.IconCompatParcelizer.MINUTE ? 60 : 1;
        int i2 = 0;
        if (iconCompatParcelizer2 == OR5DataPenerimaFragment.IconCompatParcelizer.SECOND) {
            i = DateTimeConstants.SECONDS_PER_HOUR;
            i2 = 0;
        }
        while (i2 < i * 24) {
            int i3 = i2 + 1;
            oR5DataPenerimaFragment2.a(iconCompatParcelizer2, 1);
            oR5DataPenerimaFragment3.a(iconCompatParcelizer2, -1);
            if (iconCompatParcelizer == null || oR5DataPenerimaFragment2.c(iconCompatParcelizer) == oR5DataPenerimaFragment.c(iconCompatParcelizer)) {
                OR5DataPenerimaFragment ceiling = this.a.ceiling(oR5DataPenerimaFragment2);
                OR5DataPenerimaFragment floor = this.a.floor(oR5DataPenerimaFragment2);
                if (!oR5DataPenerimaFragment2.e(ceiling, iconCompatParcelizer2) && !oR5DataPenerimaFragment2.e(floor, iconCompatParcelizer2)) {
                    return oR5DataPenerimaFragment2;
                }
            }
            if (iconCompatParcelizer == null || oR5DataPenerimaFragment3.c(iconCompatParcelizer) == oR5DataPenerimaFragment.c(iconCompatParcelizer)) {
                OR5DataPenerimaFragment ceiling2 = this.a.ceiling(oR5DataPenerimaFragment3);
                OR5DataPenerimaFragment floor2 = this.a.floor(oR5DataPenerimaFragment3);
                if (!oR5DataPenerimaFragment3.e(ceiling2, iconCompatParcelizer2) && !oR5DataPenerimaFragment3.e(floor2, iconCompatParcelizer2)) {
                    return oR5DataPenerimaFragment3;
                }
            }
            i2 = i3;
            if (iconCompatParcelizer != null) {
                i2 = i3;
                if (oR5DataPenerimaFragment3.c(iconCompatParcelizer) != oR5DataPenerimaFragment.c(iconCompatParcelizer)) {
                    i2 = i3;
                    if (oR5DataPenerimaFragment2.c(iconCompatParcelizer) != oR5DataPenerimaFragment.c(iconCompatParcelizer)) {
                        break;
                    }
                } else {
                    continue;
                }
            }
        }
        return oR5DataPenerimaFragment;
    }

    @Override // o.showInfoCodewordnOR
    public final OR5DataPenerimaFragment b(OR5DataPenerimaFragment oR5DataPenerimaFragment, OR5DataPenerimaFragment.IconCompatParcelizer iconCompatParcelizer, OR5DataPenerimaFragment.IconCompatParcelizer iconCompatParcelizer2) {
        OR5DataPenerimaFragment oR5DataPenerimaFragment2 = this.c;
        if (oR5DataPenerimaFragment2 != null && oR5DataPenerimaFragment2.hashCode() - oR5DataPenerimaFragment.hashCode() > 0) {
            return this.c;
        }
        OR5DataPenerimaFragment oR5DataPenerimaFragment3 = this.d;
        if (oR5DataPenerimaFragment3 != null && oR5DataPenerimaFragment3.hashCode() - oR5DataPenerimaFragment.hashCode() < 0) {
            return this.d;
        }
        if (iconCompatParcelizer == OR5DataPenerimaFragment.IconCompatParcelizer.SECOND) {
            return oR5DataPenerimaFragment;
        }
        if (!this.b.isEmpty()) {
            OR5DataPenerimaFragment floor = this.b.floor(oR5DataPenerimaFragment);
            OR5DataPenerimaFragment ceiling = this.b.ceiling(oR5DataPenerimaFragment);
            if (floor == null || ceiling == null) {
                OR5DataPenerimaFragment oR5DataPenerimaFragment4 = floor;
                if (floor == null) {
                    oR5DataPenerimaFragment4 = ceiling;
                }
                return iconCompatParcelizer == null ? oR5DataPenerimaFragment4 : oR5DataPenerimaFragment4.e != oR5DataPenerimaFragment.e ? oR5DataPenerimaFragment : (iconCompatParcelizer != OR5DataPenerimaFragment.IconCompatParcelizer.MINUTE || oR5DataPenerimaFragment4.b == oR5DataPenerimaFragment.b) ? oR5DataPenerimaFragment4 : oR5DataPenerimaFragment;
            }
            if (iconCompatParcelizer == OR5DataPenerimaFragment.IconCompatParcelizer.HOUR) {
                if (floor.e != oR5DataPenerimaFragment.e && ceiling.e == oR5DataPenerimaFragment.e) {
                    return ceiling;
                }
                if (floor.e == oR5DataPenerimaFragment.e && ceiling.e != oR5DataPenerimaFragment.e) {
                    return floor;
                }
                if (!(floor.e == oR5DataPenerimaFragment.e || ceiling.e == oR5DataPenerimaFragment.e)) {
                    return oR5DataPenerimaFragment;
                }
            }
            if (iconCompatParcelizer == OR5DataPenerimaFragment.IconCompatParcelizer.MINUTE) {
                if (floor.e != oR5DataPenerimaFragment.e && ceiling.e != oR5DataPenerimaFragment.e) {
                    return oR5DataPenerimaFragment;
                }
                if (floor.e != oR5DataPenerimaFragment.e && ceiling.e == oR5DataPenerimaFragment.e) {
                    OR5DataPenerimaFragment oR5DataPenerimaFragment5 = oR5DataPenerimaFragment;
                    if (ceiling.b == oR5DataPenerimaFragment.b) {
                        oR5DataPenerimaFragment5 = ceiling;
                    }
                    return oR5DataPenerimaFragment5;
                } else if (floor.e == oR5DataPenerimaFragment.e && ceiling.e != oR5DataPenerimaFragment.e) {
                    OR5DataPenerimaFragment oR5DataPenerimaFragment6 = oR5DataPenerimaFragment;
                    if (floor.b == oR5DataPenerimaFragment.b) {
                        oR5DataPenerimaFragment6 = floor;
                    }
                    return oR5DataPenerimaFragment6;
                } else if (floor.b != oR5DataPenerimaFragment.b && ceiling.b == oR5DataPenerimaFragment.b) {
                    return ceiling;
                } else {
                    if (floor.b == oR5DataPenerimaFragment.b && ceiling.b != oR5DataPenerimaFragment.b) {
                        return floor;
                    }
                    if (!(floor.b == oR5DataPenerimaFragment.b || ceiling.b == oR5DataPenerimaFragment.b)) {
                        return oR5DataPenerimaFragment;
                    }
                }
            }
            OR5DataPenerimaFragment oR5DataPenerimaFragment7 = floor;
            if (Math.abs(oR5DataPenerimaFragment.hashCode() - floor.hashCode()) >= Math.abs(oR5DataPenerimaFragment.hashCode() - ceiling.hashCode())) {
                oR5DataPenerimaFragment7 = ceiling;
            }
            return oR5DataPenerimaFragment7;
        }
        OR5DataPenerimaFragment oR5DataPenerimaFragment8 = oR5DataPenerimaFragment;
        if (!this.a.isEmpty()) {
            if (iconCompatParcelizer != null && iconCompatParcelizer == iconCompatParcelizer2) {
                return oR5DataPenerimaFragment;
            }
            if (iconCompatParcelizer2 == OR5DataPenerimaFragment.IconCompatParcelizer.SECOND) {
                return !this.a.contains(oR5DataPenerimaFragment) ? oR5DataPenerimaFragment : e(oR5DataPenerimaFragment, iconCompatParcelizer, iconCompatParcelizer2);
            }
            if (iconCompatParcelizer2 == OR5DataPenerimaFragment.IconCompatParcelizer.MINUTE) {
                return (oR5DataPenerimaFragment.e(this.a.ceiling(oR5DataPenerimaFragment), OR5DataPenerimaFragment.IconCompatParcelizer.MINUTE) || oR5DataPenerimaFragment.e(this.a.floor(oR5DataPenerimaFragment), OR5DataPenerimaFragment.IconCompatParcelizer.MINUTE)) ? e(oR5DataPenerimaFragment, iconCompatParcelizer, iconCompatParcelizer2) : oR5DataPenerimaFragment;
            }
            oR5DataPenerimaFragment8 = oR5DataPenerimaFragment;
            if (iconCompatParcelizer2 == OR5DataPenerimaFragment.IconCompatParcelizer.HOUR) {
                OR5DataPenerimaFragment ceiling2 = this.a.ceiling(oR5DataPenerimaFragment);
                OR5DataPenerimaFragment floor2 = this.a.floor(oR5DataPenerimaFragment);
                boolean e = oR5DataPenerimaFragment.e(ceiling2, OR5DataPenerimaFragment.IconCompatParcelizer.HOUR);
                boolean e2 = oR5DataPenerimaFragment.e(floor2, OR5DataPenerimaFragment.IconCompatParcelizer.HOUR);
                if (!e && !e2) {
                    return oR5DataPenerimaFragment;
                }
                oR5DataPenerimaFragment8 = e(oR5DataPenerimaFragment, iconCompatParcelizer, iconCompatParcelizer2);
            }
        }
        return oR5DataPenerimaFragment8;
    }

    @Override // o.showInfoCodewordnOR
    public final boolean d() {
        OR5DataPenerimaFragment oR5DataPenerimaFragment = new OR5DataPenerimaFragment(12);
        OR5DataPenerimaFragment oR5DataPenerimaFragment2 = this.c;
        boolean z = true;
        if (oR5DataPenerimaFragment2 != null && oR5DataPenerimaFragment2.hashCode() - oR5DataPenerimaFragment.hashCode() >= 0) {
            return true;
        }
        if (this.b.isEmpty()) {
            return false;
        }
        if (this.b.first().hashCode() - oR5DataPenerimaFragment.hashCode() < 0) {
            z = false;
        }
        return z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // o.showInfoCodewordnOR
    public final boolean e() {
        OR5DataPenerimaFragment oR5DataPenerimaFragment = new OR5DataPenerimaFragment(12);
        OR5DataPenerimaFragment oR5DataPenerimaFragment2 = this.d;
        boolean z = true;
        if (oR5DataPenerimaFragment2 != null && oR5DataPenerimaFragment2.hashCode() - oR5DataPenerimaFragment.hashCode() < 0) {
            return true;
        }
        if (this.b.isEmpty()) {
            return false;
        }
        if (this.b.last().hashCode() - oR5DataPenerimaFragment.hashCode() >= 0) {
            z = false;
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00dc, code lost:
        if (r7.e(r0, o.OR5DataPenerimaFragment.IconCompatParcelizer.HOUR) != false) goto L_0x00df;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01d8, code lost:
        if (r0 != false) goto L_0x01db;
     */
    @Override // o.showInfoCodewordnOR
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final boolean e(o.OR5DataPenerimaFragment r7, int r8, o.OR5DataPenerimaFragment.IconCompatParcelizer r9) {
        /*
        // Method dump skipped, instructions count: 557
        */
        throw new UnsupportedOperationException("Method not decompiled: o.OR4DataBankPenerimaFragment.e(o.OR5DataPenerimaFragment, int, o.OR5DataPenerimaFragment$IconCompatParcelizer):boolean");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.c, i);
        parcel.writeParcelable(this.d, i);
        TreeSet<OR5DataPenerimaFragment> treeSet = this.e;
        parcel.writeTypedArray((Parcelable[]) treeSet.toArray(new OR5DataPenerimaFragment[treeSet.size()]), i);
        TreeSet<OR5DataPenerimaFragment> treeSet2 = this.a;
        parcel.writeTypedArray((Parcelable[]) treeSet2.toArray(new OR5DataPenerimaFragment[treeSet2.size()]), i);
    }
}
