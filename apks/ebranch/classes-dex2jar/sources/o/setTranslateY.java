package o;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import androidx.versionedparcelable.VersionedParcel;
import java.lang.reflect.Method;
/* loaded from: classes-dex2jar.jar:o/setTranslateY.class */
public final class setTranslateY extends VersionedParcel {
    private final int a;
    private int e;
    private final SparseIntArray f;
    private int g;
    private final Parcel h;
    private int i;
    private final int j;
    private final String n;

    public setTranslateY(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new setThumbTextPadding(), new setThumbTextPadding(), new setThumbTextPadding());
    }

    private setTranslateY(Parcel parcel, int i, int i2, String str, setThumbTextPadding<String, Method> setthumbtextpadding, setThumbTextPadding<String, Method> setthumbtextpadding2, setThumbTextPadding<String, Class> setthumbtextpadding3) {
        super(setthumbtextpadding, setthumbtextpadding2, setthumbtextpadding3);
        this.f = new SparseIntArray();
        this.e = -1;
        this.g = -1;
        this.h = parcel;
        this.j = i;
        this.a = i2;
        this.i = i;
        this.n = str;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final CharSequence a() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.h);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void a(int i) {
        c();
        this.e = i;
        this.f.put(i, this.h.dataPosition());
        this.h.writeInt(0);
        this.h.writeInt(i);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void a(String str) {
        this.h.writeString(str);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void a(boolean z) {
        this.h.writeInt(z ? 1 : 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void a(byte[] bArr) {
        if (bArr != null) {
            this.h.writeInt(bArr.length);
            this.h.writeByteArray(bArr);
            return;
        }
        this.h.writeInt(-1);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void b(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.h, 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final byte[] b() {
        int readInt = this.h.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.h.readByteArray(bArr);
        return bArr;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void c() {
        int i = this.e;
        if (i >= 0) {
            int i2 = this.f.get(i);
            int dataPosition = this.h.dataPosition();
            this.h.setDataPosition(i2);
            this.h.writeInt(dataPosition - i2);
            this.h.setDataPosition(dataPosition);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void d(Parcelable parcelable) {
        this.h.writeParcelable(parcelable, 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final boolean d() {
        return this.h.readInt() != 0;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final boolean d(int i) {
        while (true) {
            boolean z = false;
            if (this.i < this.a) {
                int i2 = this.g;
                if (i2 == i) {
                    return true;
                }
                if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                    return false;
                }
                this.h.setDataPosition(this.i);
                int readInt = this.h.readInt();
                this.g = this.h.readInt();
                this.i += readInt;
            } else {
                if (this.g == i) {
                    z = true;
                }
                return z;
            }
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final VersionedParcel e() {
        Parcel parcel = this.h;
        int dataPosition = parcel.dataPosition();
        int i = this.i;
        int i2 = i;
        if (i == this.j) {
            i2 = this.a;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.n);
        sb.append("  ");
        return new setTranslateY(parcel, dataPosition, i2, sb.toString(), this.b, this.d, this.c);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final void e(int i) {
        this.h.writeInt(i);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final String g() {
        return this.h.readString();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final <T extends Parcelable> T h() {
        return (T) this.h.readParcelable(getClass().getClassLoader());
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public final int i() {
        return this.h.readInt();
    }
}
