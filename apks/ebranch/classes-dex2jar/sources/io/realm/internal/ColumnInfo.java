package io.realm.internal;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import io.realm.RealmFieldType;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;
import o.BN5PilihNomorOTPFragment_ViewBinding;
import o.CC18FormKartuKreditFragment_ViewBinding;
import o.CC21AFormKartuKreditFragment_ViewBinding;
import o.CC21BFormKartuKreditFragment;
import o.onChooseValuePendidikanEvent;
import o.onChooseValuePerkawinanEvent;
import o.onClickKodePos;
import o.showPekerjaanDialog;
/* loaded from: classes-dex2jar.jar:io/realm/internal/ColumnInfo.class */
public abstract class ColumnInfo {
    private Map<String, ColumnDetails> columnKeysFromColumnNames;
    private Map<String, ColumnDetails> columnkeysFromJavaFieldNames;
    private Map<String, String> javaFieldNameToInternalNames;
    private boolean mutable;

    /* loaded from: classes-dex2jar.jar:io/realm/internal/ColumnInfo$ColumnDetails.class */
    public static final class ColumnDetails {
        public long columnKey;
        public RealmFieldType columnType;
        public String linkedClassName;

        public /* synthetic */ ColumnDetails() {
        }

        private ColumnDetails(long j, RealmFieldType realmFieldType, @Nullable String str) {
            this.columnKey = j;
            this.columnType = realmFieldType;
            this.linkedClassName = str;
        }

        ColumnDetails(Property property) {
            this(property.getColumnKey(), property.getType(), property.getLinkedObjectName());
        }

        public final /* synthetic */ void c(BN5PilihNomorOTPFragment_ViewBinding bN5PilihNomorOTPFragment_ViewBinding, JsonWriter jsonWriter, CC21AFormKartuKreditFragment_ViewBinding cC21AFormKartuKreditFragment_ViewBinding) {
            jsonWriter.beginObject();
            cC21AFormKartuKreditFragment_ViewBinding.d(jsonWriter, 25);
            Class cls = Long.TYPE;
            Long valueOf = Long.valueOf(this.columnKey);
            CC18FormKartuKreditFragment_ViewBinding.d(bN5PilihNomorOTPFragment_ViewBinding, cls, valueOf).d(jsonWriter, valueOf);
            if (this != this.columnType) {
                cC21AFormKartuKreditFragment_ViewBinding.d(jsonWriter, 41);
                RealmFieldType realmFieldType = this.columnType;
                CC18FormKartuKreditFragment_ViewBinding.d(bN5PilihNomorOTPFragment_ViewBinding, RealmFieldType.class, realmFieldType).d(jsonWriter, realmFieldType);
            }
            if (this != this.linkedClassName) {
                cC21AFormKartuKreditFragment_ViewBinding.d(jsonWriter, 22);
                jsonWriter.value(this.linkedClassName);
            }
            jsonWriter.endObject();
        }

        public final /* synthetic */ void e(BN5PilihNomorOTPFragment_ViewBinding bN5PilihNomorOTPFragment_ViewBinding, JsonReader jsonReader, CC21BFormKartuKreditFragment cC21BFormKartuKreditFragment) {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                int d = cC21BFormKartuKreditFragment.d(jsonReader);
                boolean z = jsonReader.peek() != JsonToken.NULL;
                if (d != 1) {
                    if (d != 64) {
                        if (d != 77) {
                            jsonReader.skipValue();
                        } else if (z) {
                            this.columnKey = ((Long) bN5PilihNomorOTPFragment_ViewBinding.e(new showPekerjaanDialog(Long.class)).c(jsonReader)).longValue();
                        } else {
                            jsonReader.nextNull();
                        }
                    } else if (z) {
                        this.linkedClassName = jsonReader.peek() != JsonToken.BOOLEAN ? jsonReader.nextString() : Boolean.toString(jsonReader.nextBoolean());
                    } else {
                        this.linkedClassName = null;
                        jsonReader.nextNull();
                    }
                } else if (z) {
                    this.columnType = (RealmFieldType) bN5PilihNomorOTPFragment_ViewBinding.e(new showPekerjaanDialog(RealmFieldType.class)).c(jsonReader);
                } else {
                    this.columnType = null;
                    jsonReader.nextNull();
                }
            }
            jsonReader.endObject();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ColumnDetails[");
            sb.append(this.columnKey);
            sb.append(", ");
            sb.append(this.columnType);
            sb.append(", ");
            sb.append(this.linkedClassName);
            sb.append("]");
            return sb.toString();
        }
    }

    public /* synthetic */ ColumnInfo() {
    }

    public ColumnInfo(int i) {
        this(i, true);
    }

    private ColumnInfo(int i, boolean z) {
        this.columnkeysFromJavaFieldNames = new HashMap(i);
        this.columnKeysFromColumnNames = new HashMap(i);
        this.javaFieldNameToInternalNames = new HashMap(i);
        this.mutable = z;
    }

    public ColumnInfo(@Nullable ColumnInfo columnInfo, boolean z) {
        this(columnInfo == null ? 0 : columnInfo.columnkeysFromJavaFieldNames.size(), z);
        if (columnInfo != null) {
            this.columnkeysFromJavaFieldNames.putAll(columnInfo.columnkeysFromJavaFieldNames);
        }
    }

    protected final void addBacklinkDetails(OsSchemaInfo osSchemaInfo, String str, String str2, String str3) {
        this.columnkeysFromJavaFieldNames.put(str, new ColumnDetails(osSchemaInfo.getObjectSchemaInfo(str2).getProperty(str3).getColumnKey(), RealmFieldType.LINKING_OBJECTS, str2));
    }

    protected final long addColumnDetails(String str, String str2, OsObjectSchemaInfo osObjectSchemaInfo) {
        Property property = osObjectSchemaInfo.getProperty(str2);
        ColumnDetails columnDetails = new ColumnDetails(property);
        this.columnkeysFromJavaFieldNames.put(str, columnDetails);
        this.columnKeysFromColumnNames.put(str2, columnDetails);
        this.javaFieldNameToInternalNames.put(str, str2);
        return property.getColumnKey();
    }

    protected abstract ColumnInfo copy(boolean z);

    protected abstract void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2);

    public void copyFrom(ColumnInfo columnInfo) {
        if (!this.mutable) {
            throw new UnsupportedOperationException("Attempt to modify an immutable ColumnInfo");
        } else if (columnInfo != null) {
            this.columnkeysFromJavaFieldNames.clear();
            this.columnkeysFromJavaFieldNames.putAll(columnInfo.columnkeysFromJavaFieldNames);
            this.columnKeysFromColumnNames.clear();
            this.columnKeysFromColumnNames.putAll(columnInfo.columnKeysFromColumnNames);
            this.javaFieldNameToInternalNames.clear();
            this.javaFieldNameToInternalNames.putAll(columnInfo.javaFieldNameToInternalNames);
            copy(columnInfo, this);
        } else {
            throw new NullPointerException("Attempt to copy null ColumnInfo");
        }
    }

    public final /* synthetic */ void d(BN5PilihNomorOTPFragment_ViewBinding bN5PilihNomorOTPFragment_ViewBinding, JsonWriter jsonWriter, CC21AFormKartuKreditFragment_ViewBinding cC21AFormKartuKreditFragment_ViewBinding) {
        if (this != this.columnKeysFromColumnNames) {
            cC21AFormKartuKreditFragment_ViewBinding.d(jsonWriter, 14);
            onChooseValuePendidikanEvent onchoosevaluependidikanevent = new onChooseValuePendidikanEvent();
            Map<String, ColumnDetails> map = this.columnKeysFromColumnNames;
            CC18FormKartuKreditFragment_ViewBinding.d(bN5PilihNomorOTPFragment_ViewBinding, onchoosevaluependidikanevent, map).d(jsonWriter, map);
        }
        if (this != this.columnkeysFromJavaFieldNames) {
            cC21AFormKartuKreditFragment_ViewBinding.d(jsonWriter, 20);
            onChooseValuePerkawinanEvent onchoosevalueperkawinanevent = new onChooseValuePerkawinanEvent();
            Map<String, ColumnDetails> map2 = this.columnkeysFromJavaFieldNames;
            CC18FormKartuKreditFragment_ViewBinding.d(bN5PilihNomorOTPFragment_ViewBinding, onchoosevalueperkawinanevent, map2).d(jsonWriter, map2);
        }
        if (this != this.javaFieldNameToInternalNames) {
            cC21AFormKartuKreditFragment_ViewBinding.d(jsonWriter, 6);
            onClickKodePos onclickkodepos = new onClickKodePos();
            Map<String, String> map3 = this.javaFieldNameToInternalNames;
            CC18FormKartuKreditFragment_ViewBinding.d(bN5PilihNomorOTPFragment_ViewBinding, onclickkodepos, map3).d(jsonWriter, map3);
        }
        cC21AFormKartuKreditFragment_ViewBinding.d(jsonWriter, 57);
        jsonWriter.value(this.mutable);
    }

    public final /* synthetic */ void e(BN5PilihNomorOTPFragment_ViewBinding bN5PilihNomorOTPFragment_ViewBinding, JsonReader jsonReader, int i) {
        boolean z = jsonReader.peek() != JsonToken.NULL;
        if (i != 6) {
            if (i != 18) {
                if (i != 37) {
                    if (i != 79) {
                        jsonReader.skipValue();
                    } else if (z) {
                        this.javaFieldNameToInternalNames = (Map) bN5PilihNomorOTPFragment_ViewBinding.e(new onClickKodePos()).c(jsonReader);
                    } else {
                        this.javaFieldNameToInternalNames = null;
                        jsonReader.nextNull();
                    }
                } else if (z) {
                    this.mutable = ((Boolean) bN5PilihNomorOTPFragment_ViewBinding.e(new showPekerjaanDialog(Boolean.class)).c(jsonReader)).booleanValue();
                } else {
                    jsonReader.nextNull();
                }
            } else if (z) {
                this.columnkeysFromJavaFieldNames = (Map) bN5PilihNomorOTPFragment_ViewBinding.e(new onChooseValuePerkawinanEvent()).c(jsonReader);
            } else {
                this.columnkeysFromJavaFieldNames = null;
                jsonReader.nextNull();
            }
        } else if (z) {
            this.columnKeysFromColumnNames = (Map) bN5PilihNomorOTPFragment_ViewBinding.e(new onChooseValuePendidikanEvent()).c(jsonReader);
        } else {
            this.columnKeysFromColumnNames = null;
            jsonReader.nextNull();
        }
    }

    @Nullable
    public ColumnDetails getColumnDetails(String str) {
        return this.columnkeysFromJavaFieldNames.get(str);
    }

    public long getColumnKey(String str) {
        ColumnDetails columnDetails = this.columnkeysFromJavaFieldNames.get(str);
        return columnDetails == null ? -1 : columnDetails.columnKey;
    }

    public Map<String, ColumnDetails> getColumnKeysMap() {
        return this.columnkeysFromJavaFieldNames;
    }

    @Nullable
    public String getInternalFieldName(String str) {
        return this.javaFieldNameToInternalNames.get(str);
    }

    public final boolean isMutable() {
        return this.mutable;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ColumnInfo[");
        StringBuilder sb2 = new StringBuilder("mutable=");
        sb2.append(this.mutable);
        sb.append(sb2.toString());
        sb.append(",");
        boolean z = false;
        if (this.columnkeysFromJavaFieldNames != null) {
            sb.append("JavaFieldNames=[");
            boolean z2 = false;
            for (Map.Entry<String, ColumnDetails> entry : this.columnkeysFromJavaFieldNames.entrySet()) {
                if (z2) {
                    sb.append(",");
                }
                sb.append(entry.getKey());
                sb.append("->");
                sb.append(entry.getValue());
                z2 = true;
            }
            sb.append("]");
        }
        if (this.columnKeysFromColumnNames != null) {
            sb.append(", InternalFieldNames=[");
            for (Map.Entry<String, ColumnDetails> entry2 : this.columnKeysFromColumnNames.entrySet()) {
                if (z) {
                    sb.append(",");
                }
                sb.append(entry2.getKey());
                sb.append("->");
                sb.append(entry2.getValue());
                z = true;
            }
            sb.append("]");
        }
        sb.append("]");
        return sb.toString();
    }
}
