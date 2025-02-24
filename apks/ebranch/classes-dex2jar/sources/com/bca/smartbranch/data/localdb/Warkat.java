package com.bca.smartbranch.data.localdb;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;
import io.realm.com_bca_smartbranch_data_localdb_WarkatRealmProxyInterface;
import io.realm.internal.RealmObjectProxy;
import o.BN5PilihNomorOTPFragment_ViewBinding;
import o.CC18FormKartuKreditFragment_ViewBinding;
import o.CC21AFormKartuKreditFragment_ViewBinding;
import o.CC21BFormKartuKreditFragment;
import o.showPekerjaanDialog;
import org.parceler.Parcel;
@Parcel
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/localdb/Warkat.class */
public class Warkat extends RealmObject implements com_bca_smartbranch_data_localdb_WarkatRealmProxyInterface {
    @PrimaryKey
    private long id;
    private String jatuhTempo;
    private String jenisWarkat;
    private String kodeBank;
    private String kodeJenisWarkat;
    private String localClearingCodeBank;
    private String namaBank;
    private Double nominal;
    private String nomorWarkat;

    public Warkat() {
        if (this instanceof RealmObjectProxy) {
            ((RealmObjectProxy) this).realm$injectObjectContext();
        }
        realmSet$id(0);
        realmSet$nomorWarkat("");
        realmSet$namaBank("");
        realmSet$kodeBank("");
        realmSet$localClearingCodeBank("");
        realmSet$jenisWarkat("");
        realmSet$kodeJenisWarkat("");
        realmSet$jatuhTempo("");
    }

    public final /* synthetic */ void b(BN5PilihNomorOTPFragment_ViewBinding bN5PilihNomorOTPFragment_ViewBinding, JsonReader jsonReader, CC21BFormKartuKreditFragment cC21BFormKartuKreditFragment) {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            d(bN5PilihNomorOTPFragment_ViewBinding, jsonReader, cC21BFormKartuKreditFragment.d(jsonReader));
        }
        jsonReader.endObject();
    }

    public final /* synthetic */ void c(BN5PilihNomorOTPFragment_ViewBinding bN5PilihNomorOTPFragment_ViewBinding, JsonWriter jsonWriter, CC21AFormKartuKreditFragment_ViewBinding cC21AFormKartuKreditFragment_ViewBinding) {
        jsonWriter.beginObject();
        d(bN5PilihNomorOTPFragment_ViewBinding, jsonWriter, cC21AFormKartuKreditFragment_ViewBinding);
        jsonWriter.endObject();
    }

    public final /* synthetic */ void d(BN5PilihNomorOTPFragment_ViewBinding bN5PilihNomorOTPFragment_ViewBinding, JsonReader jsonReader, int i) {
        boolean z = jsonReader.peek() != JsonToken.NULL;
        if (i != 7) {
            if (i != 29) {
                if (i != 43) {
                    if (i != 45) {
                        if (i != 47) {
                            if (i != 59) {
                                if (i != 75) {
                                    if (i != 50) {
                                        if (i != 51) {
                                            jsonReader.peek();
                                            JsonToken jsonToken = JsonToken.NULL;
                                            jsonReader.skipValue();
                                        } else if (!z) {
                                            this.kodeJenisWarkat = null;
                                            jsonReader.nextNull();
                                        } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                                            this.kodeJenisWarkat = jsonReader.nextString();
                                        } else {
                                            this.kodeJenisWarkat = Boolean.toString(jsonReader.nextBoolean());
                                        }
                                    } else if (!z) {
                                        this.namaBank = null;
                                        jsonReader.nextNull();
                                    } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                                        this.namaBank = jsonReader.nextString();
                                    } else {
                                        this.namaBank = Boolean.toString(jsonReader.nextBoolean());
                                    }
                                } else if (z) {
                                    this.id = ((Long) bN5PilihNomorOTPFragment_ViewBinding.e(new showPekerjaanDialog(Long.class)).c(jsonReader)).longValue();
                                } else {
                                    jsonReader.nextNull();
                                }
                            } else if (!z) {
                                this.jatuhTempo = null;
                                jsonReader.nextNull();
                            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                                this.jatuhTempo = jsonReader.nextString();
                            } else {
                                this.jatuhTempo = Boolean.toString(jsonReader.nextBoolean());
                            }
                        } else if (!z) {
                            this.jenisWarkat = null;
                            jsonReader.nextNull();
                        } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                            this.jenisWarkat = jsonReader.nextString();
                        } else {
                            this.jenisWarkat = Boolean.toString(jsonReader.nextBoolean());
                        }
                    } else if (!z) {
                        this.localClearingCodeBank = null;
                        jsonReader.nextNull();
                    } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                        this.localClearingCodeBank = jsonReader.nextString();
                    } else {
                        this.localClearingCodeBank = Boolean.toString(jsonReader.nextBoolean());
                    }
                } else if (z) {
                    this.nominal = (Double) bN5PilihNomorOTPFragment_ViewBinding.e(new showPekerjaanDialog(Double.class)).c(jsonReader);
                } else {
                    this.nominal = null;
                    jsonReader.nextNull();
                }
            } else if (!z) {
                this.nomorWarkat = null;
                jsonReader.nextNull();
            } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
                this.nomorWarkat = jsonReader.nextString();
            } else {
                this.nomorWarkat = Boolean.toString(jsonReader.nextBoolean());
            }
        } else if (!z) {
            this.kodeBank = null;
            jsonReader.nextNull();
        } else if (jsonReader.peek() != JsonToken.BOOLEAN) {
            this.kodeBank = jsonReader.nextString();
        } else {
            this.kodeBank = Boolean.toString(jsonReader.nextBoolean());
        }
    }

    public final /* synthetic */ void d(BN5PilihNomorOTPFragment_ViewBinding bN5PilihNomorOTPFragment_ViewBinding, JsonWriter jsonWriter, CC21AFormKartuKreditFragment_ViewBinding cC21AFormKartuKreditFragment_ViewBinding) {
        cC21AFormKartuKreditFragment_ViewBinding.d(jsonWriter, 78);
        Class cls = Long.TYPE;
        Long valueOf = Long.valueOf(this.id);
        CC18FormKartuKreditFragment_ViewBinding.d(bN5PilihNomorOTPFragment_ViewBinding, cls, valueOf).d(jsonWriter, valueOf);
        if (this != this.jatuhTempo) {
            cC21AFormKartuKreditFragment_ViewBinding.d(jsonWriter, 5);
            jsonWriter.value(this.jatuhTempo);
        }
        if (this != this.jenisWarkat) {
            cC21AFormKartuKreditFragment_ViewBinding.d(jsonWriter, 9);
            jsonWriter.value(this.jenisWarkat);
        }
        if (this != this.kodeBank) {
            cC21AFormKartuKreditFragment_ViewBinding.d(jsonWriter, 49);
            jsonWriter.value(this.kodeBank);
        }
        if (this != this.kodeJenisWarkat) {
            cC21AFormKartuKreditFragment_ViewBinding.d(jsonWriter, 70);
            jsonWriter.value(this.kodeJenisWarkat);
        }
        if (this != this.localClearingCodeBank) {
            cC21AFormKartuKreditFragment_ViewBinding.d(jsonWriter, 11);
            jsonWriter.value(this.localClearingCodeBank);
        }
        if (this != this.namaBank) {
            cC21AFormKartuKreditFragment_ViewBinding.d(jsonWriter, 27);
            jsonWriter.value(this.namaBank);
        }
        if (this != this.nominal) {
            cC21AFormKartuKreditFragment_ViewBinding.d(jsonWriter, 47);
            Double d = this.nominal;
            CC18FormKartuKreditFragment_ViewBinding.d(bN5PilihNomorOTPFragment_ViewBinding, Double.class, d).d(jsonWriter, d);
        }
        if (this != this.nomorWarkat) {
            cC21AFormKartuKreditFragment_ViewBinding.d(jsonWriter, 1);
            jsonWriter.value(this.nomorWarkat);
        }
    }

    public long getId() {
        return realmGet$id();
    }

    public String getJatuhTempo() {
        return realmGet$jatuhTempo();
    }

    public String getJenisWarkat() {
        return realmGet$jenisWarkat();
    }

    public String getKodeBank() {
        return realmGet$kodeBank();
    }

    public String getKodeJenisWarkat() {
        return realmGet$kodeJenisWarkat();
    }

    public String getLocalClearingCodeBank() {
        return realmGet$localClearingCodeBank();
    }

    public String getNamaBank() {
        return realmGet$namaBank();
    }

    public Double getNominal() {
        return realmGet$nominal();
    }

    public String getNomorWarkat() {
        return realmGet$nomorWarkat();
    }

    @Override // io.realm.com_bca_smartbranch_data_localdb_WarkatRealmProxyInterface
    public long realmGet$id() {
        return this.id;
    }

    @Override // io.realm.com_bca_smartbranch_data_localdb_WarkatRealmProxyInterface
    public String realmGet$jatuhTempo() {
        return this.jatuhTempo;
    }

    @Override // io.realm.com_bca_smartbranch_data_localdb_WarkatRealmProxyInterface
    public String realmGet$jenisWarkat() {
        return this.jenisWarkat;
    }

    @Override // io.realm.com_bca_smartbranch_data_localdb_WarkatRealmProxyInterface
    public String realmGet$kodeBank() {
        return this.kodeBank;
    }

    @Override // io.realm.com_bca_smartbranch_data_localdb_WarkatRealmProxyInterface
    public String realmGet$kodeJenisWarkat() {
        return this.kodeJenisWarkat;
    }

    @Override // io.realm.com_bca_smartbranch_data_localdb_WarkatRealmProxyInterface
    public String realmGet$localClearingCodeBank() {
        return this.localClearingCodeBank;
    }

    @Override // io.realm.com_bca_smartbranch_data_localdb_WarkatRealmProxyInterface
    public String realmGet$namaBank() {
        return this.namaBank;
    }

    @Override // io.realm.com_bca_smartbranch_data_localdb_WarkatRealmProxyInterface
    public Double realmGet$nominal() {
        return this.nominal;
    }

    @Override // io.realm.com_bca_smartbranch_data_localdb_WarkatRealmProxyInterface
    public String realmGet$nomorWarkat() {
        return this.nomorWarkat;
    }

    @Override // io.realm.com_bca_smartbranch_data_localdb_WarkatRealmProxyInterface
    public void realmSet$id(long j) {
        this.id = j;
    }

    @Override // io.realm.com_bca_smartbranch_data_localdb_WarkatRealmProxyInterface
    public void realmSet$jatuhTempo(String str) {
        this.jatuhTempo = str;
    }

    @Override // io.realm.com_bca_smartbranch_data_localdb_WarkatRealmProxyInterface
    public void realmSet$jenisWarkat(String str) {
        this.jenisWarkat = str;
    }

    @Override // io.realm.com_bca_smartbranch_data_localdb_WarkatRealmProxyInterface
    public void realmSet$kodeBank(String str) {
        this.kodeBank = str;
    }

    @Override // io.realm.com_bca_smartbranch_data_localdb_WarkatRealmProxyInterface
    public void realmSet$kodeJenisWarkat(String str) {
        this.kodeJenisWarkat = str;
    }

    @Override // io.realm.com_bca_smartbranch_data_localdb_WarkatRealmProxyInterface
    public void realmSet$localClearingCodeBank(String str) {
        this.localClearingCodeBank = str;
    }

    @Override // io.realm.com_bca_smartbranch_data_localdb_WarkatRealmProxyInterface
    public void realmSet$namaBank(String str) {
        this.namaBank = str;
    }

    @Override // io.realm.com_bca_smartbranch_data_localdb_WarkatRealmProxyInterface
    public void realmSet$nominal(Double d) {
        this.nominal = d;
    }

    @Override // io.realm.com_bca_smartbranch_data_localdb_WarkatRealmProxyInterface
    public void realmSet$nomorWarkat(String str) {
        this.nomorWarkat = str;
    }

    public void setId(long j) {
        realmSet$id(j);
    }

    public void setJatuhTempo(String str) {
        realmSet$jatuhTempo(str);
    }

    public void setJenisWarkat(String str) {
        realmSet$jenisWarkat(str);
    }

    public void setKodeBank(String str) {
        realmSet$kodeBank(str);
    }

    public void setKodeJenisWarkat(String str) {
        realmSet$kodeJenisWarkat(str);
    }

    public void setLocalClearingCodeBank(String str) {
        realmSet$localClearingCodeBank(str);
    }

    public void setNamaBank(String str) {
        realmSet$namaBank(str);
    }

    public void setNominal(Double d) {
        realmSet$nominal(d);
    }

    public void setNomorWarkat(String str) {
        realmSet$nomorWarkat(str);
    }
}
