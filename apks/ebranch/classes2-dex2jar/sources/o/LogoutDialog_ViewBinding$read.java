package o;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
/* loaded from: classes2-dex2jar.jar:o/LogoutDialog_ViewBinding$read.class */
final class LogoutDialog_ViewBinding$read extends getPopEnterAnim {
    public static final Parcelable.Creator<LogoutDialog_ViewBinding$read> CREATOR = new Parcelable.ClassLoaderCreator<LogoutDialog_ViewBinding$read>() { // from class: o.LogoutDialog_ViewBinding$read.5
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new LogoutDialog_ViewBinding$read(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public final /* synthetic */ LogoutDialog_ViewBinding$read createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new LogoutDialog_ViewBinding$read(parcel, classLoader);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new LogoutDialog_ViewBinding$read[i];
        }
    };
    CharSequence a;
    CharSequence c;
    CharSequence e;
    boolean h;
    CharSequence i;

    LogoutDialog_ViewBinding$read(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.h = parcel.readInt() != 1 ? false : true;
        this.a = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.e = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.i = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
    }

    LogoutDialog_ViewBinding$read(Parcelable parcelable) {
        super(parcelable);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextInputLayout.SavedState{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" error=");
        sb.append((Object) this.c);
        sb.append(" hint=");
        sb.append((Object) this.a);
        sb.append(" helperText=");
        sb.append((Object) this.e);
        sb.append(" placeholderText=");
        sb.append((Object) this.i);
        sb.append("}");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        writeToParcel(parcel, i);
        TextUtils.writeToParcel(this.c, parcel, i);
        parcel.writeInt(this.h ? 1 : 0);
        TextUtils.writeToParcel(this.a, parcel, i);
        TextUtils.writeToParcel(this.e, parcel, i);
        TextUtils.writeToParcel(this.i, parcel, i);
    }
}
