package o;

import android.os.Parcel;
import android.os.Parcelable;
import o.ListUtil;
import o.newImmutableList;
/* loaded from: classes2-dex2jar.jar:o/newImmutableList$MediaSessionCompat$Token.class */
public final class newImmutableList$MediaSessionCompat$Token extends newImmutableList.PlaybackStateCompat.CustomAction<Character> {
    private static final setLogger<Character> d = new setLogger<Character>() { // from class: o.newImmutableList$MediaSessionCompat$Token.4
        @Override // o.setLogger
        public final /* synthetic */ void c(Character ch, Parcel parcel) {
            parcel.writeCharArray(new char[]{ch.charValue()});
        }

        @Override // o.setLogger
        public final /* synthetic */ Character e(Parcel parcel) {
            return Character.valueOf(parcel.createCharArray()[0]);
        }
    };
    public static final read CREATOR = new read((byte) 0);

    /* loaded from: classes2-dex2jar.jar:o/newImmutableList$MediaSessionCompat$Token$read.class */
    static final class read implements Parcelable.Creator<newImmutableList$MediaSessionCompat$Token> {
        private read() {
        }

        /* synthetic */ read(byte b) {
            this();
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ newImmutableList$MediaSessionCompat$Token createFromParcel(Parcel parcel) {
            return new newImmutableList$MediaSessionCompat$Token(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ newImmutableList$MediaSessionCompat$Token[] newArray(int i) {
            return new newImmutableList$MediaSessionCompat$Token[i];
        }
    }

    public newImmutableList$MediaSessionCompat$Token(Parcel parcel) {
        super(parcel, (ListUtil.ThreeItemImmutableList) d, (byte) 0);
    }

    public newImmutableList$MediaSessionCompat$Token(Character ch) {
        super(ch, d, (byte) 0);
    }

    @Override // o.newImmutableList.PlaybackStateCompat.CustomAction, android.os.Parcelable
    public final /* bridge */ /* synthetic */ int describeContents() {
        return describeContents();
    }

    @Override // o.newImmutableList.PlaybackStateCompat.CustomAction, android.os.Parcelable
    public final /* bridge */ /* synthetic */ void writeToParcel(Parcel parcel, int i) {
        writeToParcel(parcel, i);
    }
}
