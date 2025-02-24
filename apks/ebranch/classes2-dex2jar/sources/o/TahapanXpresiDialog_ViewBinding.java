package o;

import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.heartbeatinfo.HeartBeatResult;
/* loaded from: classes2-dex2jar.jar:o/TahapanXpresiDialog_ViewBinding.class */
public final class TahapanXpresiDialog_ViewBinding extends HeartBeatResult {
    private final long a;
    private final HeartBeatInfo.HeartBeat d;
    private final String e;

    public TahapanXpresiDialog_ViewBinding(String str, long j, HeartBeatInfo.HeartBeat heartBeat) {
        if (str != null) {
            this.e = str;
            this.a = j;
            if (heartBeat != null) {
                this.d = heartBeat;
                return;
            }
            throw new NullPointerException("Null heartBeat");
        }
        throw new NullPointerException("Null sdkName");
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HeartBeatResult)) {
            return false;
        }
        HeartBeatResult heartBeatResult = (HeartBeatResult) obj;
        if (!this.e.equals(heartBeatResult.getSdkName()) || this.a != heartBeatResult.getMillis() || !this.d.equals(heartBeatResult.getHeartBeat())) {
            z = false;
        }
        return z;
    }

    @Override // com.google.firebase.heartbeatinfo.HeartBeatResult
    public final HeartBeatInfo.HeartBeat getHeartBeat() {
        return this.d;
    }

    @Override // com.google.firebase.heartbeatinfo.HeartBeatResult
    public final long getMillis() {
        return this.a;
    }

    @Override // com.google.firebase.heartbeatinfo.HeartBeatResult
    public final String getSdkName() {
        return this.e;
    }

    public final int hashCode() {
        int hashCode = this.e.hashCode();
        long j = this.a;
        return ((((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HeartBeatResult{sdkName=");
        sb.append(this.e);
        sb.append(", millis=");
        sb.append(this.a);
        sb.append(", heartBeat=");
        sb.append(this.d);
        sb.append("}");
        return sb.toString();
    }
}
