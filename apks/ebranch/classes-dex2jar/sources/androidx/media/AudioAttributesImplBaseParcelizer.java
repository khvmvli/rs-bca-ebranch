package androidx.media;

import androidx.versionedparcelable.VersionedParcel;
/* loaded from: classes-dex2jar.jar:androidx/media/AudioAttributesImplBaseParcelizer.class */
public final class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(VersionedParcel versionedParcel) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.b = versionedParcel.e(audioAttributesImplBase.b, 1);
        audioAttributesImplBase.c = versionedParcel.e(audioAttributesImplBase.c, 2);
        audioAttributesImplBase.d = versionedParcel.e(audioAttributesImplBase.d, 3);
        audioAttributesImplBase.e = versionedParcel.e(audioAttributesImplBase.e, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, VersionedParcel versionedParcel) {
        versionedParcel.b(audioAttributesImplBase.b, 1);
        versionedParcel.b(audioAttributesImplBase.c, 2);
        versionedParcel.b(audioAttributesImplBase.d, 3);
        versionedParcel.b(audioAttributesImplBase.e, 4);
    }
}
