package o;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import o.isResumed;
import o.onRequestPermissionsResult;
/* loaded from: classes-dex2jar.jar:o/getTargetFragment.class */
public final class getTargetFragment implements Parcelable {
    public static final Parcelable.Creator<getTargetFragment> CREATOR = new Parcelable.Creator<getTargetFragment>() { // from class: o.getTargetFragment.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ getTargetFragment createFromParcel(Parcel parcel) {
            return new getTargetFragment(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ getTargetFragment[] newArray(int i) {
            return new getTargetFragment[i];
        }
    };
    final int a;
    final CharSequence b;
    final CharSequence c;
    final int[] d;
    final int e;
    final ArrayList<String> f;
    final int g;
    final String h;
    final int[] i;
    final int[] j;
    final ArrayList<String> k;
    final boolean l;
    final int m;
    final ArrayList<String> n;

    public getTargetFragment(Parcel parcel) {
        this.j = parcel.createIntArray();
        this.f = parcel.createStringArrayList();
        this.i = parcel.createIntArray();
        this.d = parcel.createIntArray();
        this.m = parcel.readInt();
        this.h = parcel.readString();
        this.g = parcel.readInt();
        this.a = parcel.readInt();
        this.b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.e = parcel.readInt();
        this.c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.n = parcel.createStringArrayList();
        this.k = parcel.createStringArrayList();
        this.l = parcel.readInt() != 0;
    }

    public getTargetFragment(getUserVisibleHint getuservisiblehint) {
        int size = getuservisiblehint.k.size();
        this.j = new int[size * 5];
        if (getuservisiblehint.c) {
            this.f = new ArrayList<>(size);
            this.i = new int[size];
            this.d = new int[size];
            int i = 0;
            int i2 = 0;
            while (i < size) {
                isResumed.read read = (isResumed.read) getuservisiblehint.k.get(i);
                int i3 = i2 + 1;
                this.j[i2] = read.e;
                this.f.add(read.d != null ? read.d.mWho : null);
                int i4 = i3 + 1;
                this.j[i3] = read.c;
                int i5 = i4 + 1;
                this.j[i4] = read.a;
                int i6 = i5 + 1;
                this.j[i5] = read.j;
                this.j[i6] = read.i;
                this.i[i] = read.g.ordinal();
                this.d[i] = read.b.ordinal();
                i++;
                i2 = i6 + 1;
            }
            this.m = getuservisiblehint.p;
            this.h = getuservisiblehint.n;
            this.g = getuservisiblehint.b;
            this.a = getuservisiblehint.i;
            this.b = getuservisiblehint.g;
            this.e = getuservisiblehint.f;
            this.c = getuservisiblehint.j;
            this.n = getuservisiblehint.s;
            this.k = getuservisiblehint.t;
            this.l = getuservisiblehint.q;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final getUserVisibleHint e(isDetached isdetached) {
        getUserVisibleHint getuservisiblehint = new getUserVisibleHint(isdetached);
        int i = 0;
        int i2 = 0;
        while (i < this.j.length) {
            isResumed.read read = new isResumed.read();
            int i3 = i + 1;
            read.e = this.j[i];
            if (isDetached.a(2)) {
                StringBuilder sb = new StringBuilder("Instantiate ");
                sb.append(getuservisiblehint);
                sb.append(" op #");
                sb.append(i2);
                sb.append(" base fragment #");
                sb.append(this.j[i3]);
                Log.v("FragmentManager", sb.toString());
            }
            String str = this.f.get(i2);
            Fragment fragment = null;
            if (str != null) {
                isRemoving isremoving = isdetached.h.c.get(str);
                if (isremoving != null) {
                    fragment = isremoving.e;
                }
                read.d = fragment;
            } else {
                read.d = null;
            }
            read.g = onRequestPermissionsResult.read.values()[this.i[i2]];
            read.b = onRequestPermissionsResult.read.values()[this.d[i2]];
            int i4 = i3 + 1;
            read.c = this.j[i3];
            int i5 = i4 + 1;
            read.a = this.j[i4];
            int i6 = i5 + 1;
            read.j = this.j[i5];
            read.i = this.j[i6];
            getuservisiblehint.f163o = read.c;
            getuservisiblehint.m = read.a;
            getuservisiblehint.l = read.j;
            getuservisiblehint.r = read.i;
            getuservisiblehint.e(read);
            i2++;
            i = i6 + 1;
        }
        getuservisiblehint.p = this.m;
        getuservisiblehint.n = this.h;
        getuservisiblehint.b = this.g;
        getuservisiblehint.c = true;
        getuservisiblehint.i = this.a;
        getuservisiblehint.g = this.b;
        getuservisiblehint.f = this.e;
        getuservisiblehint.j = this.c;
        getuservisiblehint.s = this.n;
        getuservisiblehint.t = this.k;
        getuservisiblehint.q = this.l;
        getuservisiblehint.d(1);
        return getuservisiblehint;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.j);
        parcel.writeStringList(this.f);
        parcel.writeIntArray(this.i);
        parcel.writeIntArray(this.d);
        parcel.writeInt(this.m);
        parcel.writeString(this.h);
        parcel.writeInt(this.g);
        parcel.writeInt(this.a);
        TextUtils.writeToParcel(this.b, parcel, 0);
        parcel.writeInt(this.e);
        TextUtils.writeToParcel(this.c, parcel, 0);
        parcel.writeStringList(this.n);
        parcel.writeStringList(this.k);
        parcel.writeInt(this.l ? 1 : 0);
    }
}
