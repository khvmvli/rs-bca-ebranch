package io.realm;

import io.realm.RealmAny;
import io.realm.internal.OsObjectStore;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.RealmProxyMediator;
import io.realm.internal.Util;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import javax.annotation.Nullable;
/* loaded from: classes-dex2jar.jar:io/realm/CollectionUtils.class */
public class CollectionUtils {
    public static final String DICTIONARY_TYPE;
    public static final String LIST_TYPE;
    public static final String SET_TYPE;

    public static boolean checkCanObjectBeCopied(BaseRealm baseRealm, RealmModel realmModel, String str, String str2) {
        if (!(realmModel instanceof RealmObjectProxy)) {
            return true;
        }
        RealmObjectProxy realmObjectProxy = (RealmObjectProxy) realmModel;
        if (realmObjectProxy instanceof DynamicRealmObject) {
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() == baseRealm) {
                String type = ((DynamicRealmObject) realmModel).getType();
                if (str.equals(RealmAny.class.getCanonicalName()) || str.equals(type)) {
                    return false;
                }
                throw new IllegalArgumentException(String.format(Locale.US, "The object has a different type from %s's. Type of the %s is '%s', type of object is '%s'.", str2, str2, str, type));
            } else if (baseRealm.threadId == realmObjectProxy.realmGet$proxyState().getRealm$realm().threadId) {
                throw new IllegalArgumentException("Cannot pass DynamicRealmObject between Realm instances.");
            } else {
                throw new IllegalStateException("Cannot pass an object to a Realm instance created in another thread.");
            }
        } else if (realmObjectProxy.realmGet$proxyState().getRow$realm() == null || !realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(baseRealm.getPath())) {
            return true;
        } else {
            if (baseRealm == realmObjectProxy.realmGet$proxyState().getRealm$realm()) {
                return false;
            }
            throw new IllegalArgumentException("Cannot pass an object from another Realm instance.");
        }
    }

    public static void checkForAddRemoveListener(BaseRealm baseRealm, @Nullable Object obj, boolean z) {
        if (!z || obj != null) {
            baseRealm.checkIfValid();
            baseRealm.sharedRealm.capabilities.checkCanDeliverNotification("Listeners cannot be used on current thread.");
            return;
        }
        throw new IllegalArgumentException("Listener should not be null");
    }

    public static <E extends RealmModel> E copyToRealm(BaseRealm baseRealm, E e) {
        Realm realm = (Realm) baseRealm;
        return OsObjectStore.getPrimaryKeyForObject(realm.getSharedRealm(), realm.getConfiguration().getSchemaMediator().getSimpleClassName(e.getClass())) != null ? (E) realm.copyToRealmOrUpdate((Realm) e, new ImportFlag[0]) : (E) realm.copyToRealm((Realm) e, new ImportFlag[0]);
    }

    public static RealmAny copyToRealmIfNeeded(BaseRealm baseRealm, RealmAny realmAny) {
        if (realmAny.getType() != RealmAny.Type.OBJECT) {
            return realmAny;
        }
        Class<?> valueClass = realmAny.getValueClass();
        RealmModel asRealmModel = realmAny.asRealmModel(valueClass);
        if (asRealmModel instanceof RealmObjectProxy) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) asRealmModel;
            if (realmObjectProxy instanceof DynamicRealmObject) {
                if (realmObjectProxy.realmGet$proxyState().getRealm$realm() == baseRealm) {
                    return realmAny;
                }
                if (baseRealm.threadId == realmObjectProxy.realmGet$proxyState().getRealm$realm().threadId) {
                    throw new IllegalArgumentException("Cannot copy DynamicRealmObject between Realm instances.");
                }
                throw new IllegalStateException("Cannot copy an object to a Realm instance created in another thread.");
            } else if (baseRealm.getSchema().getSchemaForClass((Class<? extends RealmModel>) valueClass).isEmbedded()) {
                throw new IllegalArgumentException("Embedded objects are not supported by RealmAny.");
            } else if (realmObjectProxy.realmGet$proxyState().getRow$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(baseRealm.getPath())) {
                if (baseRealm == realmObjectProxy.realmGet$proxyState().getRealm$realm()) {
                    return realmAny;
                }
                throw new IllegalArgumentException("Cannot copy an object from another Realm instance.");
            }
        }
        return RealmAny.valueOf(copyToRealm(baseRealm, asRealmModel));
    }

    static boolean isClassForRealmModel(Class<?> cls) {
        return RealmModel.class.isAssignableFrom(cls);
    }

    public static boolean isEmbedded(BaseRealm baseRealm, RealmModel realmModel) {
        if (baseRealm instanceof Realm) {
            return baseRealm.getSchema().getSchemaForClass((Class<? extends RealmModel>) realmModel.getClass()).isEmbedded();
        }
        return baseRealm.getSchema().getSchemaForClass(((DynamicRealmObject) realmModel).getType()).isEmbedded();
    }

    public static void updateEmbeddedObject(Realm realm, RealmModel realmModel, long j) {
        RealmProxyMediator schemaMediator = realm.getConfiguration().getSchemaMediator();
        Class<? extends RealmModel> originalModelClass = Util.getOriginalModelClass(realmModel.getClass());
        schemaMediator.updateEmbeddedObject(realm, realmModel, schemaMediator.newInstance(originalModelClass, realm, realm.getTable(originalModelClass).getUncheckedRow(j), realm.getSchema().getColumnInfo(originalModelClass), true, Collections.EMPTY_LIST), new HashMap(), Collections.EMPTY_SET);
    }
}
