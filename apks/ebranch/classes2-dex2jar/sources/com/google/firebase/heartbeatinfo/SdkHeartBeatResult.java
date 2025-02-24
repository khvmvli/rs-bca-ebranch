package com.google.firebase.heartbeatinfo;

import o.TahapanBerjangkaDialog_ViewBinding;
/* loaded from: classes2-dex2jar.jar:com/google/firebase/heartbeatinfo/SdkHeartBeatResult.class */
public abstract class SdkHeartBeatResult implements Comparable<SdkHeartBeatResult> {
    public static SdkHeartBeatResult create(String str, long j) {
        return new TahapanBerjangkaDialog_ViewBinding(str, j);
    }

    public int compareTo(SdkHeartBeatResult sdkHeartBeatResult) {
        return getMillis() < sdkHeartBeatResult.getMillis() ? -1 : 1;
    }

    public abstract long getMillis();

    public abstract String getSdkName();
}
