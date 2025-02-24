package o;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.Iterator;
/* loaded from: classes-dex2jar.jar:o/realmGet$nomorRekening.class */
public final class realmGet$nomorRekening extends setFotoPribadi implements Iterable<String> {
    public static final Parcelable.Creator<realmGet$nomorRekening> CREATOR = new Parcelable.Creator<realmGet$nomorRekening>() { // from class: o.realmGet$sequenceId
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ realmGet$nomorRekening createFromParcel(Parcel parcel) {
            int a = SafeParcelReader.a(parcel);
            Bundle bundle = null;
            while (parcel.dataPosition() < a) {
                int b = SafeParcelReader.b(parcel);
                if (SafeParcelReader.b(b) != 2) {
                    SafeParcelReader.p(parcel, b);
                } else {
                    bundle = SafeParcelReader.c(parcel, b);
                }
            }
            SafeParcelReader.d(parcel, a);
            return new realmGet$nomorRekening(bundle);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ realmGet$nomorRekening[] newArray(int i) {
            return new realmGet$nomorRekening[i];
        }
    };
    private final Bundle d;

    public realmGet$nomorRekening(Bundle bundle) {
        this.d = bundle;
    }

    final String a(String str) {
        return this.d.getString(str);
    }

    final Long b(String str) {
        return Long.valueOf(this.d.getLong("value"));
    }

    final Double c(String str) {
        return Double.valueOf(this.d.getDouble("value"));
    }

    public final int d() {
        return this.d.size();
    }

    final Object d(String str) {
        return this.d.get(str);
    }

    public final Bundle e() {
        return new Bundle(this.d);
    }

    @Override // java.lang.Iterable
    public final Iterator<String> iterator() {
        return new Iterator<String>() { // from class: o.realmGet$tanggalJatuhTempo
            final Iterator<String> c;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.c = realmGet$nomorRekening.this.d.keySet().iterator();
            }

            /* renamed from: e */
            public final String next() {
                return this.c.next();
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                return this.c.hasNext();
            }

            @Override // java.util.Iterator
            public final void remove() {
                throw new UnsupportedOperationException("Remove not supported");
            }
        };
    }

    @Override // java.lang.Object
    public final String toString() {
        return this.d.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int b = setHmAddress.b(parcel);
        setHmAddress.a(parcel, 2, e(), false);
        setHmAddress.e(parcel, b);
    }
}
