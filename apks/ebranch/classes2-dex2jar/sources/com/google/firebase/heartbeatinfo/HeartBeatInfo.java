package com.google.firebase.heartbeatinfo;

import java.util.List;
import o.setJatuhTempo;
/* loaded from: classes2-dex2jar.jar:com/google/firebase/heartbeatinfo/HeartBeatInfo.class */
public interface HeartBeatInfo {

    /* loaded from: classes2-dex2jar.jar:com/google/firebase/heartbeatinfo/HeartBeatInfo$HeartBeat.class */
    public enum HeartBeat {
        NONE(0),
        SDK(1),
        GLOBAL(2),
        COMBINED(3);
        
        private final int code;

        HeartBeat(int i) {
            this.code = i;
        }

        public final int getCode() {
            return this.code;
        }
    }

    setJatuhTempo<List<HeartBeatResult>> getAndClearStoredHeartBeatInfo();

    HeartBeat getHeartBeatCode(String str);

    setJatuhTempo<Void> storeHeartBeatInfo(String str);
}
