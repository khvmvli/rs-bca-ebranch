package io.realm.internal;

import io.realm.ObjectChangeSet;
import io.realm.RealmModel;
import io.realm.internal.ObserverPairList;
import io.realm.internal.OsObject;
/* loaded from: classes2-dex2jar.jar:io/realm/internal/OsObject$Callback.class */
class OsObject$Callback implements ObserverPairList.Callback<OsObject.ObjectObserverPair> {
    private final String[] changedFields;

    OsObject$Callback(String[] strArr) {
        this.changedFields = strArr;
    }

    private ObjectChangeSet createChangeSet() {
        String[] strArr = this.changedFields;
        boolean z = strArr == null;
        if (z) {
            strArr = new String[0];
        }
        return new ObjectChangeSet(strArr, z) { // from class: io.realm.internal.OsObject$OsObjectChangeSet
            final String[] changedFields;
            final boolean deleted;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.changedFields = r4;
                this.deleted = r5;
            }

            public String[] getChangedFields() {
                return this.changedFields;
            }

            public boolean isDeleted() {
                return this.deleted;
            }

            public boolean isFieldChanged(String str) {
                for (String str2 : this.changedFields) {
                    if (str2.equals(str)) {
                        return true;
                    }
                }
                return false;
            }
        };
    }

    public void onCalled(OsObject.ObjectObserverPair objectObserverPair, Object obj) {
        objectObserverPair.onChange((RealmModel) obj, createChangeSet());
    }
}
