package com.google.firebase;

import com.google.android.gms.common.api.Status;
import o.realmGet;
/* loaded from: classes2-dex2jar.jar:com/google/firebase/FirebaseExceptionMapper.class */
public class FirebaseExceptionMapper implements realmGet.resSubDistrict {
    public final Exception getException(Status status) {
        if (status.h == 8) {
            String str = status.j;
            return new FirebaseException(str != null ? str : realmGet.maritalStatus.b(status.h));
        }
        String str2 = status.j;
        return new FirebaseApiNotAvailableException(str2 != null ? str2 : realmGet.maritalStatus.b(status.h));
    }
}
