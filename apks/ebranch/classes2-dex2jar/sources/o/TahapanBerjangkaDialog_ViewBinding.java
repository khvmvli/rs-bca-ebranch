package o;

import com.google.firebase.heartbeatinfo.SdkHeartBeatResult;
/* loaded from: classes2-dex2jar.jar:o/TahapanBerjangkaDialog_ViewBinding.class */
public final class TahapanBerjangkaDialog_ViewBinding extends SdkHeartBeatResult {
    private final long c;
    private final String d;

    public TahapanBerjangkaDialog_ViewBinding(String str, long j) {
        if (str != null) {
            this.d = str;
            this.c = j;
            return;
        }
        throw new NullPointerException("Null sdkName");
    }

    @Override // java.lang.Object
    public final boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SdkHeartBeatResult)) {
            return false;
        }
        SdkHeartBeatResult sdkHeartBeatResult = (SdkHeartBeatResult) obj;
        if (!this.d.equals(sdkHeartBeatResult.getSdkName()) || this.c != sdkHeartBeatResult.getMillis()) {
            z = false;
        }
        return z;
    }

    @Override // com.google.firebase.heartbeatinfo.SdkHeartBeatResult
    public final long getMillis() {
        return this.c;
    }

    @Override // com.google.firebase.heartbeatinfo.SdkHeartBeatResult
    public final String getSdkName() {
        return this.d;
    }

    @Override // java.lang.Object
    public final int hashCode() {
        int hashCode = this.d.hashCode();
        long j = this.c;
        return ((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    @Override // java.lang.Object
    public final String toString() {
        StringBuilder sb = new StringBuilder("SdkHeartBeatResult{sdkName=");
        sb.append(this.d);
        sb.append(", millis=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }
}
