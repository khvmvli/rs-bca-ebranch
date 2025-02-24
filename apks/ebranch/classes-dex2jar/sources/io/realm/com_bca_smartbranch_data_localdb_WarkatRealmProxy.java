package io.realm;

import com.bca.smartbranch.data.localdb.Warkat;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import io.realm.BaseRealm;
import io.realm.exceptions.RealmException;
import io.realm.internal.ColumnInfo;
import io.realm.internal.OsObject;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.Row;
import io.realm.internal.Table;
import io.realm.internal.objectstore.OsObjectBuilder;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import o.BN5PilihNomorOTPFragment_ViewBinding;
import o.CC18FormKartuKreditFragment_ViewBinding;
import o.CC21AFormKartuKreditFragment_ViewBinding;
import o.CC21BFormKartuKreditFragment;
import o.onChooseValueAgamaEvent;
import o.showPekerjaanDialog;
/* loaded from: classes-dex2jar.jar:io/realm/com_bca_smartbranch_data_localdb_WarkatRealmProxy.class */
public class com_bca_smartbranch_data_localdb_WarkatRealmProxy extends Warkat implements RealmObjectProxy, com_bca_smartbranch_data_localdb_WarkatRealmProxyInterface {
    private static final String NO_ALIAS;
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private WarkatColumnInfo columnInfo;
    private ProxyState<Warkat> proxyState;

    /* loaded from: classes-dex2jar.jar:io/realm/com_bca_smartbranch_data_localdb_WarkatRealmProxy$WarkatColumnInfo.class */
    public static final class WarkatColumnInfo extends ColumnInfo {
        long idColKey;
        long jatuhTempoColKey;
        long jenisWarkatColKey;
        long kodeBankColKey;
        long kodeJenisWarkatColKey;
        long localClearingCodeBankColKey;
        long namaBankColKey;
        long nominalColKey;
        long nomorWarkatColKey;

        public /* synthetic */ WarkatColumnInfo() {
        }

        WarkatColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        WarkatColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(9);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo("Warkat");
            this.idColKey = addColumnDetails("id", "id", objectSchemaInfo);
            this.nomorWarkatColKey = addColumnDetails("nomorWarkat", "nomorWarkat", objectSchemaInfo);
            this.namaBankColKey = addColumnDetails("namaBank", "namaBank", objectSchemaInfo);
            this.kodeBankColKey = addColumnDetails("kodeBank", "kodeBank", objectSchemaInfo);
            this.localClearingCodeBankColKey = addColumnDetails("localClearingCodeBank", "localClearingCodeBank", objectSchemaInfo);
            this.jenisWarkatColKey = addColumnDetails("jenisWarkat", "jenisWarkat", objectSchemaInfo);
            this.kodeJenisWarkatColKey = addColumnDetails("kodeJenisWarkat", "kodeJenisWarkat", objectSchemaInfo);
            this.nominalColKey = addColumnDetails("nominal", "nominal", objectSchemaInfo);
            this.jatuhTempoColKey = addColumnDetails("jatuhTempo", "jatuhTempo", objectSchemaInfo);
        }

        public final /* synthetic */ void a(BN5PilihNomorOTPFragment_ViewBinding bN5PilihNomorOTPFragment_ViewBinding, JsonReader jsonReader, CC21BFormKartuKreditFragment cC21BFormKartuKreditFragment) {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                int d = cC21BFormKartuKreditFragment.d(jsonReader);
                boolean z = jsonReader.peek() != JsonToken.NULL;
                if (d != 0) {
                    if (d != 16) {
                        if (d != 34) {
                            if (d != 46) {
                                if (d != 48) {
                                    if (d != 52) {
                                        if (d != 68) {
                                            if (d != 76) {
                                                if (d != 81) {
                                                    e(bN5PilihNomorOTPFragment_ViewBinding, jsonReader, d);
                                                } else if (z) {
                                                    this.kodeBankColKey = ((Long) bN5PilihNomorOTPFragment_ViewBinding.e(new showPekerjaanDialog(Long.class)).c(jsonReader)).longValue();
                                                } else {
                                                    jsonReader.nextNull();
                                                }
                                            } else if (z) {
                                                this.nominalColKey = ((Long) bN5PilihNomorOTPFragment_ViewBinding.e(new showPekerjaanDialog(Long.class)).c(jsonReader)).longValue();
                                            } else {
                                                jsonReader.nextNull();
                                            }
                                        } else if (z) {
                                            this.nomorWarkatColKey = ((Long) bN5PilihNomorOTPFragment_ViewBinding.e(new showPekerjaanDialog(Long.class)).c(jsonReader)).longValue();
                                        } else {
                                            jsonReader.nextNull();
                                        }
                                    } else if (z) {
                                        this.jatuhTempoColKey = ((Long) bN5PilihNomorOTPFragment_ViewBinding.e(new showPekerjaanDialog(Long.class)).c(jsonReader)).longValue();
                                    } else {
                                        jsonReader.nextNull();
                                    }
                                } else if (z) {
                                    this.jenisWarkatColKey = ((Long) bN5PilihNomorOTPFragment_ViewBinding.e(new showPekerjaanDialog(Long.class)).c(jsonReader)).longValue();
                                } else {
                                    jsonReader.nextNull();
                                }
                            } else if (z) {
                                this.idColKey = ((Long) bN5PilihNomorOTPFragment_ViewBinding.e(new showPekerjaanDialog(Long.class)).c(jsonReader)).longValue();
                            } else {
                                jsonReader.nextNull();
                            }
                        } else if (z) {
                            this.namaBankColKey = ((Long) bN5PilihNomorOTPFragment_ViewBinding.e(new showPekerjaanDialog(Long.class)).c(jsonReader)).longValue();
                        } else {
                            jsonReader.nextNull();
                        }
                    } else if (z) {
                        this.localClearingCodeBankColKey = ((Long) bN5PilihNomorOTPFragment_ViewBinding.e(new showPekerjaanDialog(Long.class)).c(jsonReader)).longValue();
                    } else {
                        jsonReader.nextNull();
                    }
                } else if (z) {
                    this.kodeJenisWarkatColKey = ((Long) bN5PilihNomorOTPFragment_ViewBinding.e(new showPekerjaanDialog(Long.class)).c(jsonReader)).longValue();
                } else {
                    jsonReader.nextNull();
                }
            }
            jsonReader.endObject();
        }

        public final /* synthetic */ void c(BN5PilihNomorOTPFragment_ViewBinding bN5PilihNomorOTPFragment_ViewBinding, JsonWriter jsonWriter, CC21AFormKartuKreditFragment_ViewBinding cC21AFormKartuKreditFragment_ViewBinding) {
            jsonWriter.beginObject();
            cC21AFormKartuKreditFragment_ViewBinding.d(jsonWriter, 68);
            Class cls = Long.TYPE;
            Long valueOf = Long.valueOf(this.idColKey);
            CC18FormKartuKreditFragment_ViewBinding.d(bN5PilihNomorOTPFragment_ViewBinding, cls, valueOf).d(jsonWriter, valueOf);
            cC21AFormKartuKreditFragment_ViewBinding.d(jsonWriter, 65);
            Class cls2 = Long.TYPE;
            Long valueOf2 = Long.valueOf(this.jatuhTempoColKey);
            CC18FormKartuKreditFragment_ViewBinding.d(bN5PilihNomorOTPFragment_ViewBinding, cls2, valueOf2).d(jsonWriter, valueOf2);
            cC21AFormKartuKreditFragment_ViewBinding.d(jsonWriter, 10);
            Class cls3 = Long.TYPE;
            Long valueOf3 = Long.valueOf(this.jenisWarkatColKey);
            CC18FormKartuKreditFragment_ViewBinding.d(bN5PilihNomorOTPFragment_ViewBinding, cls3, valueOf3).d(jsonWriter, valueOf3);
            cC21AFormKartuKreditFragment_ViewBinding.d(jsonWriter, 3);
            Class cls4 = Long.TYPE;
            Long valueOf4 = Long.valueOf(this.kodeBankColKey);
            CC18FormKartuKreditFragment_ViewBinding.d(bN5PilihNomorOTPFragment_ViewBinding, cls4, valueOf4).d(jsonWriter, valueOf4);
            cC21AFormKartuKreditFragment_ViewBinding.d(jsonWriter, 21);
            Class cls5 = Long.TYPE;
            Long valueOf5 = Long.valueOf(this.kodeJenisWarkatColKey);
            CC18FormKartuKreditFragment_ViewBinding.d(bN5PilihNomorOTPFragment_ViewBinding, cls5, valueOf5).d(jsonWriter, valueOf5);
            cC21AFormKartuKreditFragment_ViewBinding.d(jsonWriter, 69);
            Class cls6 = Long.TYPE;
            Long valueOf6 = Long.valueOf(this.localClearingCodeBankColKey);
            CC18FormKartuKreditFragment_ViewBinding.d(bN5PilihNomorOTPFragment_ViewBinding, cls6, valueOf6).d(jsonWriter, valueOf6);
            cC21AFormKartuKreditFragment_ViewBinding.d(jsonWriter, 24);
            Class cls7 = Long.TYPE;
            Long valueOf7 = Long.valueOf(this.namaBankColKey);
            CC18FormKartuKreditFragment_ViewBinding.d(bN5PilihNomorOTPFragment_ViewBinding, cls7, valueOf7).d(jsonWriter, valueOf7);
            cC21AFormKartuKreditFragment_ViewBinding.d(jsonWriter, 34);
            Class cls8 = Long.TYPE;
            Long valueOf8 = Long.valueOf(this.nominalColKey);
            CC18FormKartuKreditFragment_ViewBinding.d(bN5PilihNomorOTPFragment_ViewBinding, cls8, valueOf8).d(jsonWriter, valueOf8);
            cC21AFormKartuKreditFragment_ViewBinding.d(jsonWriter, 63);
            Class cls9 = Long.TYPE;
            Long valueOf9 = Long.valueOf(this.nomorWarkatColKey);
            CC18FormKartuKreditFragment_ViewBinding.d(bN5PilihNomorOTPFragment_ViewBinding, cls9, valueOf9).d(jsonWriter, valueOf9);
            d(bN5PilihNomorOTPFragment_ViewBinding, jsonWriter, cC21AFormKartuKreditFragment_ViewBinding);
            jsonWriter.endObject();
        }

        @Override // io.realm.internal.ColumnInfo
        public final ColumnInfo copy(boolean z) {
            return new WarkatColumnInfo(this, z);
        }

        @Override // io.realm.internal.ColumnInfo
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            WarkatColumnInfo warkatColumnInfo = (WarkatColumnInfo) columnInfo;
            WarkatColumnInfo warkatColumnInfo2 = (WarkatColumnInfo) columnInfo2;
            warkatColumnInfo2.idColKey = warkatColumnInfo.idColKey;
            warkatColumnInfo2.nomorWarkatColKey = warkatColumnInfo.nomorWarkatColKey;
            warkatColumnInfo2.namaBankColKey = warkatColumnInfo.namaBankColKey;
            warkatColumnInfo2.kodeBankColKey = warkatColumnInfo.kodeBankColKey;
            warkatColumnInfo2.localClearingCodeBankColKey = warkatColumnInfo.localClearingCodeBankColKey;
            warkatColumnInfo2.jenisWarkatColKey = warkatColumnInfo.jenisWarkatColKey;
            warkatColumnInfo2.kodeJenisWarkatColKey = warkatColumnInfo.kodeJenisWarkatColKey;
            warkatColumnInfo2.nominalColKey = warkatColumnInfo.nominalColKey;
            warkatColumnInfo2.jatuhTempoColKey = warkatColumnInfo.jatuhTempoColKey;
        }
    }

    public com_bca_smartbranch_data_localdb_WarkatRealmProxy() {
        this.proxyState.setConstructionFinished();
    }

    public static Warkat copy(Realm realm, WarkatColumnInfo warkatColumnInfo, Warkat warkat, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(warkat);
        if (realmObjectProxy != null) {
            return (Warkat) realmObjectProxy;
        }
        Warkat warkat2 = warkat;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(Warkat.class), set);
        osObjectBuilder.addInteger(warkatColumnInfo.idColKey, Long.valueOf(warkat2.realmGet$id()));
        osObjectBuilder.addString(warkatColumnInfo.nomorWarkatColKey, warkat2.realmGet$nomorWarkat());
        osObjectBuilder.addString(warkatColumnInfo.namaBankColKey, warkat2.realmGet$namaBank());
        osObjectBuilder.addString(warkatColumnInfo.kodeBankColKey, warkat2.realmGet$kodeBank());
        osObjectBuilder.addString(warkatColumnInfo.localClearingCodeBankColKey, warkat2.realmGet$localClearingCodeBank());
        osObjectBuilder.addString(warkatColumnInfo.jenisWarkatColKey, warkat2.realmGet$jenisWarkat());
        osObjectBuilder.addString(warkatColumnInfo.kodeJenisWarkatColKey, warkat2.realmGet$kodeJenisWarkat());
        osObjectBuilder.addDouble(warkatColumnInfo.nominalColKey, warkat2.realmGet$nominal());
        osObjectBuilder.addString(warkatColumnInfo.jatuhTempoColKey, warkat2.realmGet$jatuhTempo());
        com_bca_smartbranch_data_localdb_WarkatRealmProxy newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(warkat, newProxyInstance);
        return newProxyInstance;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0103  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static com.bca.smartbranch.data.localdb.Warkat copyOrUpdate(io.realm.Realm r7, io.realm.com_bca_smartbranch_data_localdb_WarkatRealmProxy.WarkatColumnInfo r8, com.bca.smartbranch.data.localdb.Warkat r9, boolean r10, java.util.Map<io.realm.RealmModel, io.realm.internal.RealmObjectProxy> r11, java.util.Set<io.realm.ImportFlag> r12) {
        /*
        // Method dump skipped, instructions count: 273
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.com_bca_smartbranch_data_localdb_WarkatRealmProxy.copyOrUpdate(io.realm.Realm, io.realm.com_bca_smartbranch_data_localdb_WarkatRealmProxy$WarkatColumnInfo, com.bca.smartbranch.data.localdb.Warkat, boolean, java.util.Map, java.util.Set):com.bca.smartbranch.data.localdb.Warkat");
    }

    public static WarkatColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new WarkatColumnInfo(osSchemaInfo);
    }

    public static Warkat createDetachedCopy(Warkat warkat, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        Warkat warkat2;
        if (i > i2 || warkat == null) {
            return null;
        }
        RealmObjectProxy.CacheData<RealmModel> cacheData = map.get(warkat);
        if (cacheData == null) {
            Warkat warkat3 = new Warkat();
            map.put(warkat, new RealmObjectProxy.CacheData<>(i, warkat3));
            warkat2 = warkat3;
        } else if (i >= cacheData.minDepth) {
            return (Warkat) cacheData.object;
        } else {
            warkat2 = (Warkat) cacheData.object;
            cacheData.minDepth = i;
        }
        Warkat warkat4 = warkat2;
        Warkat warkat5 = warkat;
        ((RealmObjectProxy) warkat).realmGet$proxyState().getRealm$realm();
        warkat4.realmSet$id(warkat5.realmGet$id());
        warkat4.realmSet$nomorWarkat(warkat5.realmGet$nomorWarkat());
        warkat4.realmSet$namaBank(warkat5.realmGet$namaBank());
        warkat4.realmSet$kodeBank(warkat5.realmGet$kodeBank());
        warkat4.realmSet$localClearingCodeBank(warkat5.realmGet$localClearingCodeBank());
        warkat4.realmSet$jenisWarkat(warkat5.realmGet$jenisWarkat());
        warkat4.realmSet$kodeJenisWarkat(warkat5.realmGet$kodeJenisWarkat());
        warkat4.realmSet$nominal(warkat5.realmGet$nominal());
        warkat4.realmSet$jatuhTempo(warkat5.realmGet$jatuhTempo());
        return warkat2;
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("", "Warkat", false, 9, 0);
        builder.addPersistedProperty("", "id", RealmFieldType.INTEGER, true, false, true);
        builder.addPersistedProperty("", "nomorWarkat", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "namaBank", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "kodeBank", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "localClearingCodeBank", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "jenisWarkat", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "kodeJenisWarkat", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "nominal", RealmFieldType.DOUBLE, false, false, false);
        builder.addPersistedProperty("", "jatuhTempo", RealmFieldType.STRING, false, false, false);
        return builder.build();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0220  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static com.bca.smartbranch.data.localdb.Warkat createOrUpdateUsingJsonObject(io.realm.Realm r7, org.json.JSONObject r8, boolean r9) throws org.json.JSONException {
        /*
        // Method dump skipped, instructions count: 580
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.com_bca_smartbranch_data_localdb_WarkatRealmProxy.createOrUpdateUsingJsonObject(io.realm.Realm, org.json.JSONObject, boolean):com.bca.smartbranch.data.localdb.Warkat");
    }

    public static Warkat createUsingJsonStream(Realm realm, android.util.JsonReader jsonReader) throws IOException {
        Warkat warkat = new Warkat();
        Warkat warkat2 = warkat;
        jsonReader.beginObject();
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("id")) {
                if (jsonReader.peek() != android.util.JsonToken.NULL) {
                    warkat2.realmSet$id(jsonReader.nextLong());
                    z = true;
                } else {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'id' to null.");
                }
            } else if (nextName.equals("nomorWarkat")) {
                if (jsonReader.peek() != android.util.JsonToken.NULL) {
                    warkat2.realmSet$nomorWarkat(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    warkat2.realmSet$nomorWarkat(null);
                }
            } else if (nextName.equals("namaBank")) {
                if (jsonReader.peek() != android.util.JsonToken.NULL) {
                    warkat2.realmSet$namaBank(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    warkat2.realmSet$namaBank(null);
                }
            } else if (nextName.equals("kodeBank")) {
                if (jsonReader.peek() != android.util.JsonToken.NULL) {
                    warkat2.realmSet$kodeBank(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    warkat2.realmSet$kodeBank(null);
                }
            } else if (nextName.equals("localClearingCodeBank")) {
                if (jsonReader.peek() != android.util.JsonToken.NULL) {
                    warkat2.realmSet$localClearingCodeBank(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    warkat2.realmSet$localClearingCodeBank(null);
                }
            } else if (nextName.equals("jenisWarkat")) {
                if (jsonReader.peek() != android.util.JsonToken.NULL) {
                    warkat2.realmSet$jenisWarkat(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    warkat2.realmSet$jenisWarkat(null);
                }
            } else if (nextName.equals("kodeJenisWarkat")) {
                if (jsonReader.peek() != android.util.JsonToken.NULL) {
                    warkat2.realmSet$kodeJenisWarkat(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    warkat2.realmSet$kodeJenisWarkat(null);
                }
            } else if (nextName.equals("nominal")) {
                if (jsonReader.peek() != android.util.JsonToken.NULL) {
                    warkat2.realmSet$nominal(Double.valueOf(jsonReader.nextDouble()));
                } else {
                    jsonReader.skipValue();
                    warkat2.realmSet$nominal(null);
                }
            } else if (!nextName.equals("jatuhTempo")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != android.util.JsonToken.NULL) {
                warkat2.realmSet$jatuhTempo(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
                warkat2.realmSet$jatuhTempo(null);
            }
        }
        jsonReader.endObject();
        if (z) {
            return (Warkat) realm.copyToRealmOrUpdate((Realm) warkat, new ImportFlag[0]);
        }
        throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static String getSimpleClassName() {
        return "Warkat";
    }

    public static long insert(Realm realm, Warkat warkat, Map<RealmModel, Long> map) {
        if ((warkat instanceof RealmObjectProxy) && !RealmObject.isFrozen(warkat)) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) warkat;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getObjectKey();
            }
        }
        Table table = realm.getTable(Warkat.class);
        long nativePtr = table.getNativePtr();
        WarkatColumnInfo warkatColumnInfo = (WarkatColumnInfo) realm.getSchema().getColumnInfo(Warkat.class);
        long j = warkatColumnInfo.idColKey;
        Warkat warkat2 = warkat;
        Long valueOf = Long.valueOf(warkat2.realmGet$id());
        long nativeFindFirstInt = valueOf != null ? Table.nativeFindFirstInt(nativePtr, j, warkat2.realmGet$id()) : -1;
        if (nativeFindFirstInt == -1) {
            nativeFindFirstInt = OsObject.createRowWithPrimaryKey(table, j, Long.valueOf(warkat2.realmGet$id()));
        } else {
            Table.throwDuplicatePrimaryKeyException(valueOf);
        }
        map.put(warkat, Long.valueOf(nativeFindFirstInt));
        String realmGet$nomorWarkat = warkat2.realmGet$nomorWarkat();
        if (realmGet$nomorWarkat != null) {
            Table.nativeSetString(nativePtr, warkatColumnInfo.nomorWarkatColKey, nativeFindFirstInt, realmGet$nomorWarkat, false);
        }
        String realmGet$namaBank = warkat2.realmGet$namaBank();
        if (realmGet$namaBank != null) {
            Table.nativeSetString(nativePtr, warkatColumnInfo.namaBankColKey, nativeFindFirstInt, realmGet$namaBank, false);
        }
        String realmGet$kodeBank = warkat2.realmGet$kodeBank();
        if (realmGet$kodeBank != null) {
            Table.nativeSetString(nativePtr, warkatColumnInfo.kodeBankColKey, nativeFindFirstInt, realmGet$kodeBank, false);
        }
        String realmGet$localClearingCodeBank = warkat2.realmGet$localClearingCodeBank();
        if (realmGet$localClearingCodeBank != null) {
            Table.nativeSetString(nativePtr, warkatColumnInfo.localClearingCodeBankColKey, nativeFindFirstInt, realmGet$localClearingCodeBank, false);
        }
        String realmGet$jenisWarkat = warkat2.realmGet$jenisWarkat();
        if (realmGet$jenisWarkat != null) {
            Table.nativeSetString(nativePtr, warkatColumnInfo.jenisWarkatColKey, nativeFindFirstInt, realmGet$jenisWarkat, false);
        }
        String realmGet$kodeJenisWarkat = warkat2.realmGet$kodeJenisWarkat();
        if (realmGet$kodeJenisWarkat != null) {
            Table.nativeSetString(nativePtr, warkatColumnInfo.kodeJenisWarkatColKey, nativeFindFirstInt, realmGet$kodeJenisWarkat, false);
        }
        Double realmGet$nominal = warkat2.realmGet$nominal();
        if (realmGet$nominal != null) {
            Table.nativeSetDouble(nativePtr, warkatColumnInfo.nominalColKey, nativeFindFirstInt, realmGet$nominal.doubleValue(), false);
        }
        String realmGet$jatuhTempo = warkat2.realmGet$jatuhTempo();
        if (realmGet$jatuhTempo != null) {
            Table.nativeSetString(nativePtr, warkatColumnInfo.jatuhTempoColKey, nativeFindFirstInt, realmGet$jatuhTempo, false);
        }
        return nativeFindFirstInt;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Table table = realm.getTable(Warkat.class);
        long nativePtr = table.getNativePtr();
        WarkatColumnInfo warkatColumnInfo = (WarkatColumnInfo) realm.getSchema().getColumnInfo(Warkat.class);
        long j = warkatColumnInfo.idColKey;
        while (it.hasNext()) {
            Warkat warkat = (Warkat) it.next();
            if (!map.containsKey(warkat)) {
                if ((warkat instanceof RealmObjectProxy) && !RealmObject.isFrozen(warkat)) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) warkat;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map.put(warkat, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getObjectKey()));
                    }
                }
                Warkat warkat2 = warkat;
                Long valueOf = Long.valueOf(warkat2.realmGet$id());
                long nativeFindFirstInt = valueOf != null ? Table.nativeFindFirstInt(nativePtr, j, warkat2.realmGet$id()) : -1;
                if (nativeFindFirstInt == -1) {
                    nativeFindFirstInt = OsObject.createRowWithPrimaryKey(table, j, Long.valueOf(warkat2.realmGet$id()));
                } else {
                    Table.throwDuplicatePrimaryKeyException(valueOf);
                }
                map.put(warkat, Long.valueOf(nativeFindFirstInt));
                String realmGet$nomorWarkat = warkat2.realmGet$nomorWarkat();
                if (realmGet$nomorWarkat != null) {
                    Table.nativeSetString(nativePtr, warkatColumnInfo.nomorWarkatColKey, nativeFindFirstInt, realmGet$nomorWarkat, false);
                }
                String realmGet$namaBank = warkat2.realmGet$namaBank();
                if (realmGet$namaBank != null) {
                    Table.nativeSetString(nativePtr, warkatColumnInfo.namaBankColKey, nativeFindFirstInt, realmGet$namaBank, false);
                }
                String realmGet$kodeBank = warkat2.realmGet$kodeBank();
                if (realmGet$kodeBank != null) {
                    Table.nativeSetString(nativePtr, warkatColumnInfo.kodeBankColKey, nativeFindFirstInt, realmGet$kodeBank, false);
                }
                String realmGet$localClearingCodeBank = warkat2.realmGet$localClearingCodeBank();
                if (realmGet$localClearingCodeBank != null) {
                    Table.nativeSetString(nativePtr, warkatColumnInfo.localClearingCodeBankColKey, nativeFindFirstInt, realmGet$localClearingCodeBank, false);
                }
                String realmGet$jenisWarkat = warkat2.realmGet$jenisWarkat();
                if (realmGet$jenisWarkat != null) {
                    Table.nativeSetString(nativePtr, warkatColumnInfo.jenisWarkatColKey, nativeFindFirstInt, realmGet$jenisWarkat, false);
                }
                String realmGet$kodeJenisWarkat = warkat2.realmGet$kodeJenisWarkat();
                if (realmGet$kodeJenisWarkat != null) {
                    Table.nativeSetString(nativePtr, warkatColumnInfo.kodeJenisWarkatColKey, nativeFindFirstInt, realmGet$kodeJenisWarkat, false);
                }
                Double realmGet$nominal = warkat2.realmGet$nominal();
                if (realmGet$nominal != null) {
                    Table.nativeSetDouble(nativePtr, warkatColumnInfo.nominalColKey, nativeFindFirstInt, realmGet$nominal.doubleValue(), false);
                }
                String realmGet$jatuhTempo = warkat2.realmGet$jatuhTempo();
                if (realmGet$jatuhTempo != null) {
                    Table.nativeSetString(nativePtr, warkatColumnInfo.jatuhTempoColKey, nativeFindFirstInt, realmGet$jatuhTempo, false);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v1, types: [long] */
    /* JADX WARN: Type inference failed for: r21v4 */
    /* JADX WARN: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static long insertOrUpdate(io.realm.Realm r10, com.bca.smartbranch.data.localdb.Warkat r11, java.util.Map<io.realm.RealmModel, java.lang.Long> r12) {
        /*
        // Method dump skipped, instructions count: 504
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.com_bca_smartbranch_data_localdb_WarkatRealmProxy.insertOrUpdate(io.realm.Realm, com.bca.smartbranch.data.localdb.Warkat, java.util.Map):long");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r23v0 */
    /* JADX WARN: Type inference failed for: r23v1, types: [long] */
    /* JADX WARN: Type inference failed for: r23v4 */
    /* JADX WARN: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static void insertOrUpdate(io.realm.Realm r10, java.util.Iterator<? extends io.realm.RealmModel> r11, java.util.Map<io.realm.RealmModel, java.lang.Long> r12) {
        /*
        // Method dump skipped, instructions count: 610
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.com_bca_smartbranch_data_localdb_WarkatRealmProxy.insertOrUpdate(io.realm.Realm, java.util.Iterator, java.util.Map):void");
    }

    static com_bca_smartbranch_data_localdb_WarkatRealmProxy newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo(Warkat.class), false, Collections.emptyList());
        com_bca_smartbranch_data_localdb_WarkatRealmProxy com_bca_smartbranch_data_localdb_warkatrealmproxy = new com_bca_smartbranch_data_localdb_WarkatRealmProxy();
        realmObjectContext.clear();
        return com_bca_smartbranch_data_localdb_warkatrealmproxy;
    }

    static Warkat update(Realm realm, WarkatColumnInfo warkatColumnInfo, Warkat warkat, Warkat warkat2, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        Warkat warkat3 = warkat2;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(Warkat.class), set);
        osObjectBuilder.addInteger(warkatColumnInfo.idColKey, Long.valueOf(warkat3.realmGet$id()));
        osObjectBuilder.addString(warkatColumnInfo.nomorWarkatColKey, warkat3.realmGet$nomorWarkat());
        osObjectBuilder.addString(warkatColumnInfo.namaBankColKey, warkat3.realmGet$namaBank());
        osObjectBuilder.addString(warkatColumnInfo.kodeBankColKey, warkat3.realmGet$kodeBank());
        osObjectBuilder.addString(warkatColumnInfo.localClearingCodeBankColKey, warkat3.realmGet$localClearingCodeBank());
        osObjectBuilder.addString(warkatColumnInfo.jenisWarkatColKey, warkat3.realmGet$jenisWarkat());
        osObjectBuilder.addString(warkatColumnInfo.kodeJenisWarkatColKey, warkat3.realmGet$kodeJenisWarkat());
        osObjectBuilder.addDouble(warkatColumnInfo.nominalColKey, warkat3.realmGet$nominal());
        osObjectBuilder.addString(warkatColumnInfo.jatuhTempoColKey, warkat3.realmGet$jatuhTempo());
        osObjectBuilder.updateExistingTopLevelObject();
        return warkat;
    }

    public final /* synthetic */ void b(BN5PilihNomorOTPFragment_ViewBinding bN5PilihNomorOTPFragment_ViewBinding, JsonWriter jsonWriter, CC21AFormKartuKreditFragment_ViewBinding cC21AFormKartuKreditFragment_ViewBinding) {
        jsonWriter.beginObject();
        if (this != this.columnInfo) {
            cC21AFormKartuKreditFragment_ViewBinding.d(jsonWriter, 52);
            WarkatColumnInfo warkatColumnInfo = this.columnInfo;
            CC18FormKartuKreditFragment_ViewBinding.d(bN5PilihNomorOTPFragment_ViewBinding, WarkatColumnInfo.class, warkatColumnInfo).d(jsonWriter, warkatColumnInfo);
        }
        if (this != this.proxyState) {
            cC21AFormKartuKreditFragment_ViewBinding.d(jsonWriter, 82);
            onChooseValueAgamaEvent onchoosevalueagamaevent = new onChooseValueAgamaEvent();
            ProxyState<Warkat> proxyState = this.proxyState;
            CC18FormKartuKreditFragment_ViewBinding.d(bN5PilihNomorOTPFragment_ViewBinding, onchoosevalueagamaevent, proxyState).d(jsonWriter, proxyState);
        }
        d(bN5PilihNomorOTPFragment_ViewBinding, jsonWriter, cC21AFormKartuKreditFragment_ViewBinding);
        jsonWriter.endObject();
    }

    public final /* synthetic */ void e(BN5PilihNomorOTPFragment_ViewBinding bN5PilihNomorOTPFragment_ViewBinding, JsonReader jsonReader, CC21BFormKartuKreditFragment cC21BFormKartuKreditFragment) {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int d = cC21BFormKartuKreditFragment.d(jsonReader);
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (d != 12) {
                if (d != 33) {
                    d(bN5PilihNomorOTPFragment_ViewBinding, jsonReader, d);
                } else if (z) {
                    this.proxyState = (ProxyState) bN5PilihNomorOTPFragment_ViewBinding.e(new onChooseValueAgamaEvent()).c(jsonReader);
                } else {
                    this.proxyState = null;
                    jsonReader.nextNull();
                }
            } else if (z) {
                this.columnInfo = (WarkatColumnInfo) bN5PilihNomorOTPFragment_ViewBinding.e(new showPekerjaanDialog(WarkatColumnInfo.class)).c(jsonReader);
            } else {
                this.columnInfo = null;
                jsonReader.nextNull();
            }
        }
        jsonReader.endObject();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com_bca_smartbranch_data_localdb_WarkatRealmProxy com_bca_smartbranch_data_localdb_warkatrealmproxy = (com_bca_smartbranch_data_localdb_WarkatRealmProxy) obj;
        BaseRealm realm$realm = this.proxyState.getRealm$realm();
        BaseRealm realm$realm2 = com_bca_smartbranch_data_localdb_warkatrealmproxy.proxyState.getRealm$realm();
        String path = realm$realm.getPath();
        String path2 = realm$realm2.getPath();
        if (path != null) {
            if (!path.equals(path2)) {
                return false;
            }
        } else if (path2 != null) {
            return false;
        }
        if (realm$realm.isFrozen() != realm$realm2.isFrozen() || !realm$realm.sharedRealm.getVersionID().equals(realm$realm2.sharedRealm.getVersionID())) {
            return false;
        }
        String name = this.proxyState.getRow$realm().getTable().getName();
        String name2 = com_bca_smartbranch_data_localdb_warkatrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name != null) {
            if (!name.equals(name2)) {
                return false;
            }
        } else if (name2 != null) {
            return false;
        }
        return this.proxyState.getRow$realm().getObjectKey() == com_bca_smartbranch_data_localdb_warkatrealmproxy.proxyState.getRow$realm().getObjectKey();
    }

    public int hashCode() {
        String path = this.proxyState.getRealm$realm().getPath();
        String name = this.proxyState.getRow$realm().getTable().getName();
        long objectKey = this.proxyState.getRow$realm().getObjectKey();
        int i = 0;
        int hashCode = path != null ? path.hashCode() : 0;
        if (name != null) {
            i = name.hashCode();
        }
        return ((((hashCode + 527) * 31) + i) * 31) + ((int) ((objectKey >>> 32) ^ objectKey));
    }

    @Override // io.realm.internal.RealmObjectProxy
    public void realm$injectObjectContext() {
        if (this.proxyState == null) {
            BaseRealm.RealmObjectContext realmObjectContext = BaseRealm.objectContext.get();
            this.columnInfo = (WarkatColumnInfo) realmObjectContext.getColumnInfo();
            ProxyState<Warkat> proxyState = new ProxyState<>(this);
            this.proxyState = proxyState;
            proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Warkat, io.realm.com_bca_smartbranch_data_localdb_WarkatRealmProxyInterface
    public long realmGet$id() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getLong(this.columnInfo.idColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Warkat, io.realm.com_bca_smartbranch_data_localdb_WarkatRealmProxyInterface
    public String realmGet$jatuhTempo() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.jatuhTempoColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Warkat, io.realm.com_bca_smartbranch_data_localdb_WarkatRealmProxyInterface
    public String realmGet$jenisWarkat() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.jenisWarkatColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Warkat, io.realm.com_bca_smartbranch_data_localdb_WarkatRealmProxyInterface
    public String realmGet$kodeBank() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.kodeBankColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Warkat, io.realm.com_bca_smartbranch_data_localdb_WarkatRealmProxyInterface
    public String realmGet$kodeJenisWarkat() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.kodeJenisWarkatColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Warkat, io.realm.com_bca_smartbranch_data_localdb_WarkatRealmProxyInterface
    public String realmGet$localClearingCodeBank() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.localClearingCodeBankColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Warkat, io.realm.com_bca_smartbranch_data_localdb_WarkatRealmProxyInterface
    public String realmGet$namaBank() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.namaBankColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Warkat, io.realm.com_bca_smartbranch_data_localdb_WarkatRealmProxyInterface
    public Double realmGet$nominal() {
        this.proxyState.getRealm$realm().checkIfValid();
        if (this.proxyState.getRow$realm().isNull(this.columnInfo.nominalColKey)) {
            return null;
        }
        return Double.valueOf(this.proxyState.getRow$realm().getDouble(this.columnInfo.nominalColKey));
    }

    @Override // com.bca.smartbranch.data.localdb.Warkat, io.realm.com_bca_smartbranch_data_localdb_WarkatRealmProxyInterface
    public String realmGet$nomorWarkat() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.nomorWarkatColKey);
    }

    @Override // io.realm.internal.RealmObjectProxy
    public ProxyState<?> realmGet$proxyState() {
        return this.proxyState;
    }

    @Override // com.bca.smartbranch.data.localdb.Warkat, io.realm.com_bca_smartbranch_data_localdb_WarkatRealmProxyInterface
    public void realmSet$id(long j) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            throw new RealmException("Primary key field 'id' cannot be changed after object was created.");
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Warkat, io.realm.com_bca_smartbranch_data_localdb_WarkatRealmProxyInterface
    public void realmSet$jatuhTempo(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.jatuhTempoColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.jatuhTempoColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.jatuhTempoColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.jatuhTempoColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Warkat, io.realm.com_bca_smartbranch_data_localdb_WarkatRealmProxyInterface
    public void realmSet$jenisWarkat(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.jenisWarkatColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.jenisWarkatColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.jenisWarkatColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.jenisWarkatColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Warkat, io.realm.com_bca_smartbranch_data_localdb_WarkatRealmProxyInterface
    public void realmSet$kodeBank(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.kodeBankColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.kodeBankColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.kodeBankColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.kodeBankColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Warkat, io.realm.com_bca_smartbranch_data_localdb_WarkatRealmProxyInterface
    public void realmSet$kodeJenisWarkat(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.kodeJenisWarkatColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.kodeJenisWarkatColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.kodeJenisWarkatColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.kodeJenisWarkatColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Warkat, io.realm.com_bca_smartbranch_data_localdb_WarkatRealmProxyInterface
    public void realmSet$localClearingCodeBank(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.localClearingCodeBankColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.localClearingCodeBankColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.localClearingCodeBankColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.localClearingCodeBankColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Warkat, io.realm.com_bca_smartbranch_data_localdb_WarkatRealmProxyInterface
    public void realmSet$namaBank(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.namaBankColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.namaBankColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.namaBankColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.namaBankColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Warkat, io.realm.com_bca_smartbranch_data_localdb_WarkatRealmProxyInterface
    public void realmSet$nominal(Double d) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (d == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.nominalColKey);
            } else {
                this.proxyState.getRow$realm().setDouble(this.columnInfo.nominalColKey, d.doubleValue());
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (d == null) {
                row$realm.getTable().setNull(this.columnInfo.nominalColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setDouble(this.columnInfo.nominalColKey, row$realm.getObjectKey(), d.doubleValue(), true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Warkat, io.realm.com_bca_smartbranch_data_localdb_WarkatRealmProxyInterface
    public void realmSet$nomorWarkat(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.nomorWarkatColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.nomorWarkatColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.nomorWarkatColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.nomorWarkatColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("Warkat = proxy[{id:");
        sb.append(realmGet$id());
        sb.append("},{nomorWarkat:");
        String str = "null";
        sb.append(realmGet$nomorWarkat() != null ? realmGet$nomorWarkat() : "null");
        sb.append("},{namaBank:");
        sb.append(realmGet$namaBank() != null ? realmGet$namaBank() : "null");
        sb.append("},{kodeBank:");
        sb.append(realmGet$kodeBank() != null ? realmGet$kodeBank() : "null");
        sb.append("},{localClearingCodeBank:");
        sb.append(realmGet$localClearingCodeBank() != null ? realmGet$localClearingCodeBank() : "null");
        sb.append("},{jenisWarkat:");
        sb.append(realmGet$jenisWarkat() != null ? realmGet$jenisWarkat() : "null");
        sb.append("},{kodeJenisWarkat:");
        sb.append(realmGet$kodeJenisWarkat() != null ? realmGet$kodeJenisWarkat() : "null");
        sb.append("},{nominal:");
        sb.append(realmGet$nominal() != null ? realmGet$nominal() : "null");
        sb.append("},{jatuhTempo:");
        if (realmGet$jatuhTempo() != null) {
            str = realmGet$jatuhTempo();
        }
        sb.append(str);
        sb.append("}]");
        return sb.toString();
    }
}
