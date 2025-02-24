package o;

import android.content.ComponentName;
import java.math.BigDecimal;
/* loaded from: classes-dex2jar.jar:o/setSupportButtonTintMode$MediaBrowserCompat$CustomActionResultReceiver.class */
public final class setSupportButtonTintMode$MediaBrowserCompat$CustomActionResultReceiver {
    public final ComponentName a;
    public final long c;
    public final float e;

    public setSupportButtonTintMode$MediaBrowserCompat$CustomActionResultReceiver(ComponentName componentName, long j, float f) {
        this.a = componentName;
        this.c = j;
        this.e = f;
    }

    public setSupportButtonTintMode$MediaBrowserCompat$CustomActionResultReceiver(String str, long j, float f) {
        this(ComponentName.unflattenFromString(str), j, f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        setSupportButtonTintMode$MediaBrowserCompat$CustomActionResultReceiver setsupportbuttontintmode_mediabrowsercompat_customactionresultreceiver = (setSupportButtonTintMode$MediaBrowserCompat$CustomActionResultReceiver) obj;
        ComponentName componentName = this.a;
        if (componentName == null) {
            if (setsupportbuttontintmode_mediabrowsercompat_customactionresultreceiver.a != null) {
                return false;
            }
        } else if (!componentName.equals(setsupportbuttontintmode_mediabrowsercompat_customactionresultreceiver.a)) {
            return false;
        }
        return this.c == setsupportbuttontintmode_mediabrowsercompat_customactionresultreceiver.c && Float.floatToIntBits(this.e) == Float.floatToIntBits(setsupportbuttontintmode_mediabrowsercompat_customactionresultreceiver.e);
    }

    public final int hashCode() {
        ComponentName componentName = this.a;
        int hashCode = componentName == null ? 0 : componentName.hashCode();
        long j = this.c;
        return ((((hashCode + 31) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + Float.floatToIntBits(this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[; activity:");
        sb.append(this.a);
        sb.append("; time:");
        sb.append(this.c);
        sb.append("; weight:");
        sb.append(new BigDecimal((double) this.e));
        sb.append("]");
        return sb.toString();
    }
}
