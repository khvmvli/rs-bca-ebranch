package androidx.media;

import java.util.Arrays;
/* loaded from: classes-dex2jar.jar:androidx/media/AudioAttributesImplBase.class */
class AudioAttributesImplBase implements AudioAttributesImpl {
    int b = 0;
    int c = 0;
    int d = 0;
    int e = -1;

    public boolean equals(Object obj) {
        int i;
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        boolean z = false;
        if (this.c == audioAttributesImplBase.c) {
            int i2 = this.d;
            int i3 = audioAttributesImplBase.d;
            int i4 = audioAttributesImplBase.e;
            if (i4 == -1) {
                i4 = AudioAttributesCompat.b(false, i3, audioAttributesImplBase.b);
            }
            if (i4 == 6) {
                i = i3 | 4;
            } else {
                i = i3;
                if (i4 == 7) {
                    i = i3 | 1;
                }
            }
            z = false;
            if (i2 == (i & 273)) {
                z = false;
                if (this.b == audioAttributesImplBase.b) {
                    z = false;
                    if (this.e == audioAttributesImplBase.e) {
                        z = true;
                    }
                }
            }
        }
        return z;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.c), Integer.valueOf(this.d), Integer.valueOf(this.b), Integer.valueOf(this.e)});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.e != -1) {
            sb.append(" stream=");
            sb.append(this.e);
            sb.append(" derived");
        }
        sb.append(" usage=");
        sb.append(AudioAttributesCompat.e(this.b));
        sb.append(" content=");
        sb.append(this.c);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.d).toUpperCase());
        return sb.toString();
    }
}
