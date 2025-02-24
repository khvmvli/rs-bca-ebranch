package androidx.media;

import android.media.AudioAttributes;
/* loaded from: classes-dex2jar.jar:androidx/media/AudioAttributesImplApi21.class */
class AudioAttributesImplApi21 implements AudioAttributesImpl {
    int b = -1;
    AudioAttributes e;

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplApi21)) {
            return false;
        }
        return this.e.equals(((AudioAttributesImplApi21) obj).e);
    }

    public int hashCode() {
        return this.e.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AudioAttributesCompat: audioattributes=");
        sb.append(this.e);
        return sb.toString();
    }
}
