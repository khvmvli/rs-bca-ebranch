package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Calendar;
import java.util.HashSet;
import java.util.TimeZone;
import java.util.TreeSet;
/* loaded from: classes2-dex2jar.jar:o/OR2PilihProductFragment_ViewBinding.class */
public final class OR2PilihProductFragment_ViewBinding implements OR2DataTransaksiAFragment_ViewBinding {
    public static final Parcelable.Creator<OR2PilihProductFragment_ViewBinding> CREATOR = new Parcelable.Creator<OR2PilihProductFragment_ViewBinding>() { // from class: o.OR2PilihProductFragment_ViewBinding.4
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ OR2PilihProductFragment_ViewBinding createFromParcel(Parcel parcel) {
            return new OR2PilihProductFragment_ViewBinding(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ OR2PilihProductFragment_ViewBinding[] newArray(int i) {
            return new OR2PilihProductFragment_ViewBinding[i];
        }
    };
    private int a;
    public Calendar b;
    transient OR2PilihProductFragment c;
    private HashSet<Calendar> d;
    public Calendar e;
    private int g;
    private TreeSet<Calendar> i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public OR2PilihProductFragment_ViewBinding() {
        this.g = 1900;
        this.a = 2100;
        this.i = new TreeSet<>();
        this.d = new HashSet<>();
    }

    public OR2PilihProductFragment_ViewBinding(Parcel parcel) {
        this.g = 1900;
        this.a = 2100;
        this.i = new TreeSet<>();
        this.d = new HashSet<>();
        this.g = parcel.readInt();
        this.a = parcel.readInt();
        this.e = (Calendar) parcel.readSerializable();
        this.b = (Calendar) parcel.readSerializable();
        this.i = (TreeSet) parcel.readSerializable();
        this.d = (HashSet) parcel.readSerializable();
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
        if (r4.after(r0) == false) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private boolean a(java.util.Calendar r4) {
        /*
            r3 = this;
            r0 = r3
            java.util.Calendar r0 = r0.b
            r5 = r0
            r0 = 1
            r6 = r0
            r0 = r5
            if (r0 == 0) goto L_0x0016
            r0 = r6
            r7 = r0
            r0 = r4
            r1 = r5
            boolean r0 = r0.after(r1)
            if (r0 != 0) goto L_0x002b
        L_0x0016:
            r0 = r4
            r1 = 1
            int r0 = r0.get(r1)
            r1 = r3
            int r1 = r1.a
            if (r0 <= r1) goto L_0x0028
            r0 = r6
            r7 = r0
            goto L_0x002b
        L_0x0028:
            r0 = 0
            r7 = r0
        L_0x002b:
            r0 = r7
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.OR2PilihProductFragment_ViewBinding.a(java.util.Calendar):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
        if (r4.before(r0) == false) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private boolean d(java.util.Calendar r4) {
        /*
            r3 = this;
            r0 = r3
            java.util.Calendar r0 = r0.e
            r5 = r0
            r0 = 1
            r6 = r0
            r0 = r5
            if (r0 == 0) goto L_0x0016
            r0 = r6
            r7 = r0
            r0 = r4
            r1 = r5
            boolean r0 = r0.before(r1)
            if (r0 != 0) goto L_0x002b
        L_0x0016:
            r0 = r4
            r1 = 1
            int r0 = r0.get(r1)
            r1 = r3
            int r1 = r1.g
            if (r0 >= r1) goto L_0x0028
            r0 = r6
            r7 = r0
            goto L_0x002b
        L_0x0028:
            r0 = 0
            r7 = r0
        L_0x002b:
            r0 = r7
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.OR2PilihProductFragment_ViewBinding.d(java.util.Calendar):boolean");
    }

    private boolean e(Calendar calendar) {
        HashSet<Calendar> hashSet = this.d;
        boolean z = false;
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        if (hashSet.contains(calendar) || d(calendar) || a(calendar)) {
            z = true;
        }
        return z;
    }

    @Override // o.OR2DataTransaksiAFragment_ViewBinding
    public final int a() {
        if (!this.i.isEmpty()) {
            return this.i.first().get(1);
        }
        Calendar calendar = this.e;
        return (calendar == null || calendar.get(1) <= this.g) ? this.g : this.e.get(1);
    }

    @Override // o.OR2DataTransaksiAFragment_ViewBinding
    public final Calendar b() {
        if (!this.i.isEmpty()) {
            return (Calendar) this.i.last().clone();
        }
        Calendar calendar = this.b;
        if (calendar != null) {
            return (Calendar) calendar.clone();
        }
        OR2PilihProductFragment oR2PilihProductFragment = this.c;
        Calendar instance = Calendar.getInstance(oR2PilihProductFragment == null ? TimeZone.getDefault() : oR2PilihProductFragment.i());
        instance.set(1, this.a);
        instance.set(5, 31);
        instance.set(2, 11);
        return instance;
    }

    @Override // o.OR2DataTransaksiAFragment_ViewBinding
    public final Calendar c() {
        if (!this.i.isEmpty()) {
            return (Calendar) this.i.first().clone();
        }
        Calendar calendar = this.e;
        if (calendar != null) {
            return (Calendar) calendar.clone();
        }
        OR2PilihProductFragment oR2PilihProductFragment = this.c;
        Calendar instance = Calendar.getInstance(oR2PilihProductFragment == null ? TimeZone.getDefault() : oR2PilihProductFragment.i());
        instance.set(1, this.g);
        instance.set(5, 1);
        instance.set(2, 0);
        return instance;
    }

    @Override // o.OR2DataTransaksiAFragment_ViewBinding
    public final Calendar c(Calendar calendar) {
        if (!this.i.isEmpty()) {
            Calendar ceiling = this.i.ceiling(calendar);
            Calendar lower = this.i.lower(calendar);
            Calendar calendar2 = (ceiling != null || lower == null) ? (lower != null || ceiling == null) ? null : ceiling : lower;
            if (calendar2 != null || ceiling == null) {
                if (calendar2 != null) {
                    calendar = calendar2;
                }
                OR2PilihProductFragment oR2PilihProductFragment = this.c;
                calendar.setTimeZone(oR2PilihProductFragment == null ? TimeZone.getDefault() : oR2PilihProductFragment.i());
                return (Calendar) calendar.clone();
            }
            return Math.abs(calendar.getTimeInMillis() - lower.getTimeInMillis()) < Math.abs(ceiling.getTimeInMillis() - calendar.getTimeInMillis()) ? (Calendar) lower.clone() : (Calendar) ceiling.clone();
        }
        if (!this.d.isEmpty()) {
            Calendar c = d(calendar) ? c() : (Calendar) calendar.clone();
            Calendar b = a(calendar) ? b() : (Calendar) calendar.clone();
            while (e(c) && e(b)) {
                c.add(5, 1);
                b.add(5, -1);
            }
            if (!e(b)) {
                return b;
            }
            if (!e(c)) {
                return c;
            }
        }
        OR2PilihProductFragment oR2PilihProductFragment2 = this.c;
        TimeZone timeZone = oR2PilihProductFragment2 == null ? TimeZone.getDefault() : oR2PilihProductFragment2.i();
        if (d(calendar)) {
            Calendar calendar3 = this.e;
            if (calendar3 != null) {
                return (Calendar) calendar3.clone();
            }
            Calendar instance = Calendar.getInstance(timeZone);
            instance.set(1, this.g);
            instance.set(2, 0);
            instance.set(5, 1);
            instance.set(11, 0);
            instance.set(12, 0);
            instance.set(13, 0);
            instance.set(14, 0);
            return instance;
        }
        Calendar calendar4 = calendar;
        if (a(calendar)) {
            Calendar calendar5 = this.b;
            if (calendar5 != null) {
                return (Calendar) calendar5.clone();
            }
            calendar4 = Calendar.getInstance(timeZone);
            calendar4.set(1, this.a);
            calendar4.set(2, 11);
            calendar4.set(5, 31);
            calendar4.set(11, 0);
            calendar4.set(12, 0);
            calendar4.set(13, 0);
            calendar4.set(14, 0);
        }
        return calendar4;
    }

    @Override // o.OR2DataTransaksiAFragment_ViewBinding
    public final int d() {
        if (!this.i.isEmpty()) {
            return this.i.last().get(1);
        }
        Calendar calendar = this.b;
        return (calendar == null || calendar.get(1) >= this.a) ? this.a : this.b.get(1);
    }

    public final void d(Calendar[] calendarArr) {
        for (Calendar calendar : calendarArr) {
            HashSet<Calendar> hashSet = this.d;
            Calendar calendar2 = (Calendar) calendar.clone();
            calendar2.set(11, 0);
            calendar2.set(12, 0);
            calendar2.set(13, 0);
            calendar2.set(14, 0);
            hashSet.add(calendar2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00b1  */
    @Override // o.OR2DataTransaksiAFragment_ViewBinding
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final boolean d(int r5, int r6, int r7) {
        /*
            r4 = this;
            r0 = r4
            o.OR2PilihProductFragment r0 = r0.c
            r8 = r0
            r0 = r8
            if (r0 != 0) goto L_0x0013
            java.util.TimeZone r0 = java.util.TimeZone.getDefault()
            r8 = r0
            goto L_0x001c
        L_0x0013:
            r0 = r8
            java.util.TimeZone r0 = r0.i()
            r8 = r0
        L_0x001c:
            r0 = r8
            java.util.Calendar r0 = java.util.Calendar.getInstance(r0)
            r9 = r0
            r0 = 1
            r10 = r0
            r0 = r9
            r1 = 1
            r2 = r5
            r0.set(r1, r2)
            r0 = r9
            r1 = 2
            r2 = r6
            r0.set(r1, r2)
            r0 = r9
            r1 = 5
            r2 = r7
            r0.set(r1, r2)
            r0 = r9
            r1 = 11
            r2 = 0
            r0.set(r1, r2)
            r0 = r9
            r1 = 12
            r2 = 0
            r0.set(r1, r2)
            r0 = r9
            r1 = 13
            r2 = 0
            r0.set(r1, r2)
            r0 = r9
            r1 = 14
            r2 = 0
            r0.set(r1, r2)
            r0 = r10
            r11 = r0
            r0 = r4
            r1 = r9
            boolean r0 = r0.e(r1)
            if (r0 != 0) goto L_0x00b4
            r0 = r4
            java.util.TreeSet<java.util.Calendar> r0 = r0.i
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00a7
            r0 = r4
            java.util.TreeSet<java.util.Calendar> r0 = r0.i
            r8 = r0
            r0 = r9
            r1 = 11
            r2 = 0
            r0.set(r1, r2)
            r0 = r9
            r1 = 12
            r2 = 0
            r0.set(r1, r2)
            r0 = r9
            r1 = 13
            r2 = 0
            r0.set(r1, r2)
            r0 = r9
            r1 = 14
            r2 = 0
            r0.set(r1, r2)
            r0 = r8
            r1 = r9
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x00a7
            r0 = 0
            r5 = r0
            goto L_0x00a9
        L_0x00a7:
            r0 = 1
            r5 = r0
        L_0x00a9:
            r0 = r10
            r11 = r0
            r0 = r5
            if (r0 == 0) goto L_0x00b4
            r0 = 0
            r11 = r0
        L_0x00b4:
            r0 = r11
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.OR2PilihProductFragment_ViewBinding.d(int, int, int):boolean");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.g);
        parcel.writeInt(this.a);
        parcel.writeSerializable(this.e);
        parcel.writeSerializable(this.b);
        parcel.writeSerializable(this.i);
        parcel.writeSerializable(this.d);
    }
}
