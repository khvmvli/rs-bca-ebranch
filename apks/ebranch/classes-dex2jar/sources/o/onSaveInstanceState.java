package o;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import java.util.Locale;
/* loaded from: classes-dex2jar.jar:o/onSaveInstanceState.class */
public final class onSaveInstanceState {
    final int a;
    final Bundle b;
    final Uri c;
    final ClipData d;
    final int e;

    /* loaded from: classes-dex2jar.jar:o/onSaveInstanceState$read.class */
    public static final class read {
        Uri a;
        ClipData b;
        int c;
        int d;
        Bundle e;

        public read(ClipData clipData, int i) {
            this.b = clipData;
            this.c = i;
        }

        public final read c(int i) {
            this.d = i;
            return this;
        }

        public final read c(Bundle bundle) {
            this.e = bundle;
            return this;
        }

        public final read e(Uri uri) {
            this.a = uri;
            return this;
        }

        public final onSaveInstanceState e() {
            return new onSaveInstanceState(this);
        }
    }

    onSaveInstanceState(read read2) {
        this.d = read2.b;
        int i = read2.c;
        if (i < 0) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", "source", 0, 3));
        } else if (i <= 3) {
            this.a = i;
            int i2 = read2.d;
            if ((i2 & 1) == i2) {
                this.e = i2;
                this.c = read2.a;
                this.b = read2.e;
                return;
            }
            StringBuilder sb = new StringBuilder("Requested flags 0x");
            sb.append(Integer.toHexString(i2));
            sb.append(", but only 0x");
            sb.append(Integer.toHexString(1));
            sb.append(" are allowed");
            throw new IllegalArgumentException(sb.toString());
        } else {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", "source", 0, 3));
        }
    }

    static String d(int i) {
        return (i & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i);
    }

    static String e(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? String.valueOf(i) : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP";
    }

    public final int c() {
        return this.a;
    }

    public final int d() {
        return this.e;
    }

    public final ClipData e() {
        return this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
        sb.append(this.d);
        sb.append(", source=");
        sb.append(e(this.a));
        sb.append(", flags=");
        sb.append(d(this.e));
        sb.append(", linkUri=");
        sb.append(this.c);
        sb.append(", extras=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
