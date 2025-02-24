package io.realm;

import android.util.JsonReader;
import android.util.JsonToken;
import io.realm.RealmAny;
import io.realm.internal.OsList;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.android.JsonUtils;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes-dex2jar.jar:io/realm/ProxyUtils.class */
class ProxyUtils {
    ProxyUtils() {
    }

    static RealmAny copyOrUpdate(RealmAny realmAny, @Nonnull Realm realm, boolean z, @Nonnull Map<RealmModel, RealmObjectProxy> map, @Nonnull Set<ImportFlag> set) {
        if (realmAny == null) {
            return RealmAny.nullValue();
        }
        RealmAny realmAny2 = realmAny;
        if (realmAny.getType() == RealmAny.Type.OBJECT) {
            RealmModel asRealmModel = realmAny.asRealmModel(realmAny.getValueClass());
            RealmObjectProxy realmObjectProxy = map.get(asRealmModel);
            realmAny2 = realmObjectProxy != null ? RealmAny.valueOf((RealmModel) realmObjectProxy) : RealmAny.valueOf(realm.getConfiguration().getSchemaMediator().copyOrUpdate(realm, asRealmModel, z, map, set));
        }
        return realmAny2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    static <T extends RealmModel> RealmAny copyToRealmIfNeeded(ProxyState<T> proxyState, @Nullable RealmAny realmAny) {
        Realm realm = (Realm) proxyState.getRealm$realm();
        if (realmAny == null) {
            return RealmAny.nullValue();
        }
        RealmAny realmAny2 = realmAny;
        if (realmAny.getType() == RealmAny.Type.OBJECT) {
            RealmModel asRealmModel = realmAny.asRealmModel(RealmModel.class);
            if (realm.getSchema().getSchemaForClass((Class<? extends RealmModel>) asRealmModel.getClass()).isEmbedded()) {
                throw new IllegalArgumentException("Embedded objects are not supported by RealmAny.");
            } else if (!RealmObject.isManaged(asRealmModel)) {
                realmAny2 = realm.hasPrimaryKey(asRealmModel.getClass()) ? RealmAny.valueOf(realm.copyToRealmOrUpdate((Realm) asRealmModel, new ImportFlag[0])) : RealmAny.valueOf(realm.copyToRealm((Realm) asRealmModel, new ImportFlag[0]));
            } else {
                proxyState.checkValidObject(asRealmModel);
                realmAny2 = realmAny;
            }
        }
        return realmAny2;
    }

    static RealmAny createDetachedCopy(RealmAny realmAny, @Nonnull Realm realm, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        if (i > i2 || realmAny == null) {
            return RealmAny.nullValue();
        }
        RealmAny realmAny2 = realmAny;
        if (realmAny.getType() == RealmAny.Type.OBJECT) {
            realmAny2 = RealmAny.valueOf(realm.getConfiguration().getSchemaMediator().createDetachedCopy(realmAny.asRealmModel(realmAny.getValueClass()), i2 - 1, map));
        }
        return realmAny2;
    }

    static RealmAny createOrUpdateUsingJsonObject(RealmAny realmAny, @Nonnull Realm realm, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        if (i > i2 || realmAny == null) {
            return RealmAny.nullValue();
        }
        RealmAny realmAny2 = realmAny;
        if (realmAny.getType() == RealmAny.Type.OBJECT) {
            realmAny2 = RealmAny.valueOf(realm.getConfiguration().getSchemaMediator().createDetachedCopy(realmAny.asRealmModel(realmAny.getValueClass()), i2 - 1, map));
        }
        return realmAny2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <E> RealmList<E> createRealmListWithJsonStream(Class<E> cls, JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == null) {
            jsonReader.skipValue();
            return null;
        }
        jsonReader.beginArray();
        RealmList<E> realmList = new RealmList<>();
        if (cls == Boolean.class) {
            while (jsonReader.hasNext()) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    realmList.add(null);
                } else {
                    realmList.add(Boolean.valueOf(jsonReader.nextBoolean()));
                }
            }
        } else if (cls == Float.class) {
            while (jsonReader.hasNext()) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    realmList.add(null);
                } else {
                    realmList.add(Float.valueOf((float) jsonReader.nextDouble()));
                }
            }
        } else if (cls == Double.class) {
            while (jsonReader.hasNext()) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    realmList.add(null);
                } else {
                    realmList.add(Double.valueOf(jsonReader.nextDouble()));
                }
            }
        } else if (cls == String.class) {
            while (jsonReader.hasNext()) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    realmList.add(null);
                } else {
                    realmList.add(jsonReader.nextString());
                }
            }
        } else if (cls == byte[].class) {
            while (jsonReader.hasNext()) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    realmList.add(null);
                } else {
                    realmList.add(JsonUtils.stringToBytes(jsonReader.nextString()));
                }
            }
        } else if (cls == Date.class) {
            while (jsonReader.hasNext()) {
                JsonToken peek = jsonReader.peek();
                if (peek == JsonToken.NULL) {
                    jsonReader.skipValue();
                    realmList.add(null);
                } else if (peek == JsonToken.NUMBER) {
                    realmList.add(new Date(jsonReader.nextLong()));
                } else {
                    realmList.add(JsonUtils.stringToDate(jsonReader.nextString()));
                }
            }
        } else if (cls == Long.class) {
            while (jsonReader.hasNext()) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    realmList.add(null);
                } else {
                    realmList.add(Long.valueOf(jsonReader.nextLong()));
                }
            }
        } else if (cls == Integer.class) {
            while (jsonReader.hasNext()) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    realmList.add(null);
                } else {
                    realmList.add(Integer.valueOf((int) jsonReader.nextLong()));
                }
            }
        } else if (cls == Short.class) {
            while (jsonReader.hasNext()) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    realmList.add(null);
                } else {
                    realmList.add(Short.valueOf((short) ((int) jsonReader.nextLong())));
                }
            }
        } else if (cls == Byte.class) {
            while (jsonReader.hasNext()) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    realmList.add(null);
                } else {
                    realmList.add(Byte.valueOf((byte) ((int) jsonReader.nextLong())));
                }
            }
        } else if (cls == ObjectId.class) {
            while (jsonReader.hasNext()) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    realmList.add(null);
                } else {
                    realmList.add(new ObjectId(jsonReader.nextString()));
                }
            }
        } else if (cls == Decimal128.class) {
            while (jsonReader.hasNext()) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    realmList.add(null);
                } else {
                    realmList.add(Decimal128.c(jsonReader.nextString()));
                }
            }
        } else if (cls == UUID.class) {
            while (jsonReader.hasNext()) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    realmList.add(null);
                } else {
                    realmList.add(UUID.fromString(jsonReader.nextString()));
                }
            }
        } else if (cls == RealmAny.class) {
            while (jsonReader.hasNext()) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    realmList.add(RealmAny.nullValue());
                } else if (jsonReader.peek() == JsonToken.STRING) {
                    realmList.add(RealmAny.valueOf(jsonReader.nextString()));
                } else if (jsonReader.peek() == JsonToken.NUMBER) {
                    String nextString = jsonReader.nextString();
                    if (nextString.contains(".")) {
                        realmList.add(RealmAny.valueOf(Double.valueOf(Double.parseDouble(nextString))));
                    } else {
                        realmList.add(RealmAny.valueOf(Long.valueOf(Long.parseLong(nextString))));
                    }
                } else if (jsonReader.peek() == JsonToken.BOOLEAN) {
                    realmList.add(RealmAny.valueOf(Boolean.valueOf(jsonReader.nextBoolean())));
                }
            }
        } else if (cls == ObjectId.class) {
            while (jsonReader.hasNext()) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    realmList.add(null);
                } else {
                    realmList.add(new ObjectId(jsonReader.nextString()));
                }
            }
        } else if (cls == Decimal128.class) {
            while (jsonReader.hasNext()) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    realmList.add(null);
                } else {
                    realmList.add(Decimal128.c(jsonReader.nextString()));
                }
            }
        } else {
            throwWrongElementType(cls);
        }
        jsonReader.endArray();
        return realmList;
    }

    static RealmAny insert(RealmAny realmAny, @Nonnull Realm realm, @Nonnull Map<RealmModel, Long> map) {
        if (realmAny == null) {
            return RealmAny.nullValue();
        }
        RealmAny realmAny2 = realmAny;
        if (realmAny.getType() == RealmAny.Type.OBJECT) {
            Class<?> valueClass = realmAny.getValueClass();
            RealmModel asRealmModel = realmAny.asRealmModel(valueClass);
            Long l = map.get(asRealmModel);
            realmAny2 = l != null ? RealmAny.valueOf(l) : RealmAny.valueOf(realm.get((Class<RealmModel>) valueClass, (String) null, realm.getConfiguration().getSchemaMediator().insert(realm, asRealmModel, map)));
        }
        return realmAny2;
    }

    static RealmAny insertOrUpdate(RealmAny realmAny, @Nonnull Realm realm, @Nonnull Map<RealmModel, Long> map) {
        if (realmAny == null) {
            return RealmAny.nullValue();
        }
        RealmAny realmAny2 = realmAny;
        if (realmAny.getType() == RealmAny.Type.OBJECT) {
            Class<?> valueClass = realmAny.getValueClass();
            RealmModel asRealmModel = realmAny.asRealmModel(valueClass);
            Long l = map.get(asRealmModel);
            realmAny2 = l != null ? RealmAny.valueOf(l) : RealmAny.valueOf(realm.get((Class<RealmModel>) valueClass, (String) null, realm.getConfiguration().getSchemaMediator().insertOrUpdate(realm, asRealmModel, map)));
        }
        return realmAny2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <E> void setRealmListWithJsonObject(Realm realm, RealmList<E> realmList, JSONObject jSONObject, String str, boolean z) throws JSONException {
        RealmAny realmAny;
        if (jSONObject.has(str)) {
            OsList osList = realmList.getOsList();
            if (jSONObject.isNull(str)) {
                osList.removeAll();
                return;
            }
            JSONArray jSONArray = jSONObject.getJSONArray(str);
            osList.removeAll();
            int length = jSONArray.length();
            if (realmList.clazz == Boolean.class) {
                for (int i = 0; i < length; i++) {
                    if (jSONArray.isNull(i)) {
                        osList.addNull();
                    } else {
                        osList.addBoolean(jSONArray.getBoolean(i));
                    }
                }
            } else if (realmList.clazz == Float.class) {
                for (int i2 = 0; i2 < length; i2++) {
                    if (jSONArray.isNull(i2)) {
                        osList.addNull();
                    } else {
                        osList.addFloat((float) jSONArray.getDouble(i2));
                    }
                }
            } else if (realmList.clazz == Double.class) {
                for (int i3 = 0; i3 < length; i3++) {
                    if (jSONArray.isNull(i3)) {
                        osList.addNull();
                    } else {
                        osList.addDouble(jSONArray.getDouble(i3));
                    }
                }
            } else if (realmList.clazz == String.class) {
                for (int i4 = 0; i4 < length; i4++) {
                    if (jSONArray.isNull(i4)) {
                        osList.addNull();
                    } else {
                        osList.addString(jSONArray.getString(i4));
                    }
                }
            } else if (realmList.clazz == byte[].class) {
                for (int i5 = 0; i5 < length; i5++) {
                    if (jSONArray.isNull(i5)) {
                        osList.addNull();
                    } else {
                        osList.addBinary(JsonUtils.stringToBytes(jSONArray.getString(i5)));
                    }
                }
            } else if (realmList.clazz == Date.class) {
                for (int i6 = 0; i6 < length; i6++) {
                    if (jSONArray.isNull(i6)) {
                        osList.addNull();
                    } else {
                        Object obj = jSONArray.get(i6);
                        if (obj instanceof String) {
                            osList.addDate(JsonUtils.stringToDate((String) obj));
                        } else {
                            osList.addDate(new Date(jSONArray.getLong(i6)));
                        }
                    }
                }
            } else if (realmList.clazz == ObjectId.class) {
                for (int i7 = 0; i7 < length; i7++) {
                    if (jSONArray.isNull(i7)) {
                        osList.addNull();
                    } else {
                        Object obj2 = jSONArray.get(i7);
                        if (obj2 instanceof String) {
                            osList.addObjectId(new ObjectId((String) obj2));
                        } else {
                            osList.addObjectId((ObjectId) obj2);
                        }
                    }
                }
            } else if (realmList.clazz == Decimal128.class) {
                for (int i8 = 0; i8 < length; i8++) {
                    if (jSONArray.isNull(i8)) {
                        osList.addNull();
                    } else {
                        Object obj3 = jSONArray.get(i8);
                        if (!(obj3 instanceof Decimal128)) {
                            if (obj3 instanceof String) {
                                osList.addDecimal128(Decimal128.c((String) obj3));
                            } else if (obj3 instanceof Integer) {
                                osList.addDecimal128(new Decimal128((long) ((Integer) obj3).intValue()));
                            } else if (obj3 instanceof Long) {
                                osList.addDecimal128(new Decimal128(((Long) obj3).longValue()));
                            } else if (obj3 instanceof Double) {
                                osList.addDecimal128(new Decimal128(new BigDecimal(((Double) obj3).doubleValue())));
                            }
                        }
                        osList.addDecimal128((Decimal128) obj3);
                    }
                }
            } else if (realmList.clazz == UUID.class) {
                for (int i9 = 0; i9 < length; i9++) {
                    if (jSONArray.isNull(i9)) {
                        osList.addNull();
                    } else {
                        Object obj4 = jSONArray.get(i9);
                        if (obj4 instanceof UUID) {
                            osList.addUUID((UUID) obj4);
                        } else {
                            osList.addUUID(UUID.fromString((String) obj4));
                        }
                    }
                }
            } else if (realmList.clazz == RealmAny.class) {
                for (int i10 = 0; i10 < length; i10++) {
                    if (jSONArray.isNull(i10)) {
                        osList.addNull();
                    } else {
                        Object obj5 = jSONArray.get(i10);
                        if (obj5 instanceof String) {
                            realmAny = RealmAny.valueOf((String) obj5);
                        } else if (obj5 instanceof Integer) {
                            realmAny = RealmAny.valueOf((Integer) obj5);
                        } else if (obj5 instanceof Long) {
                            realmAny = RealmAny.valueOf((Long) obj5);
                        } else if (obj5 instanceof Double) {
                            realmAny = RealmAny.valueOf((Double) obj5);
                        } else if (obj5 instanceof Boolean) {
                            realmAny = RealmAny.valueOf((Boolean) obj5);
                        } else if (obj5 instanceof RealmAny) {
                            realmAny = copyOrUpdate((RealmAny) obj5, realm, z, new HashMap(), new HashSet());
                        } else {
                            throw new IllegalArgumentException(String.format("Unsupported JSON type: %s", obj5.getClass().getSimpleName()));
                        }
                        osList.addRealmAny(realmAny.getNativePtr());
                    }
                }
            } else {
                int i11 = 0;
                if (realmList.clazz != Long.class) {
                    i11 = 0;
                    if (realmList.clazz != Integer.class) {
                        i11 = 0;
                        if (realmList.clazz != Short.class) {
                            if (realmList.clazz == Byte.class) {
                                i11 = 0;
                            } else {
                                throwWrongElementType(realmList.clazz);
                                return;
                            }
                        }
                    }
                }
                while (i11 < length) {
                    if (jSONArray.isNull(i11)) {
                        osList.addNull();
                    } else {
                        osList.addLong(jSONArray.getLong(i11));
                    }
                    i11++;
                }
            }
        }
    }

    private static void throwWrongElementType(@Nullable Class cls) {
        throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Element type '%s' is not handled.", cls));
    }
}
