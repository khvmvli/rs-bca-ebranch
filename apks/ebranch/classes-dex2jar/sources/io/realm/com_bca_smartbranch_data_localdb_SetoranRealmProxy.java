package io.realm;

import android.util.JsonReader;
import android.util.JsonToken;
import com.bca.smartbranch.data.localdb.Setoran;
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
/* loaded from: classes-dex2jar.jar:io/realm/com_bca_smartbranch_data_localdb_SetoranRealmProxy.class */
public class com_bca_smartbranch_data_localdb_SetoranRealmProxy extends Setoran implements RealmObjectProxy, com_bca_smartbranch_data_localdb_SetoranRealmProxyInterface {
    private static final String NO_ALIAS = "";
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private SetoranColumnInfo columnInfo;
    private ProxyState<Setoran> proxyState;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:io/realm/com_bca_smartbranch_data_localdb_SetoranRealmProxy$SetoranColumnInfo.class */
    public static final class SetoranColumnInfo extends ColumnInfo {
        long FlagDaftarTransferColKey;
        long FlagRepresentativeTransactionColKey;
        long FlagSameReceiverSenderDataColKey;
        long FlagSaveToSourceAccountListColKey;
        long FlagTxnBerkalaColKey;
        long ReceiverAccountColKey;
        long ReceiverAliasColKey;
        long ReceiverNameColKey;
        long RecurringEndDateColKey;
        long RecurringValueColKey;
        long RecurringVarColKey;
        long RepresentativeIdNumberColKey;
        long RepresentativeIdTypeColKey;
        long RepresentativeNameColKey;
        long RepresentativeRelationshipColKey;
        long SenderAddressColKey;
        long SenderEmailColKey;
        long SenderIdNumberColKey;
        long SenderIdTypeColKey;
        long SenderNameColKey;
        long SenderPhoneColKey;
        long SourceAccountOwnerTypeColKey;
        long TxnAmountColKey;
        long TxnNotesColKey;
        long TxnPurposeColKey;
        long TxnSourceColKey;
        long TypeColKey;
        long createdAtColKey;
        long currencyColKey;
        long currentPageColKey;
        long flagGuestColKey;
        long idColKey;
        long isLongFormColKey;
        long oldCustFlagColKey;
        long updatedAtColKey;

        SetoranColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        SetoranColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(35);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo("Setoran");
            this.idColKey = addColumnDetails("id", "id", objectSchemaInfo);
            this.currentPageColKey = addColumnDetails("currentPage", "currentPage", objectSchemaInfo);
            this.createdAtColKey = addColumnDetails("createdAt", "createdAt", objectSchemaInfo);
            this.updatedAtColKey = addColumnDetails("updatedAt", "updatedAt", objectSchemaInfo);
            this.flagGuestColKey = addColumnDetails("flagGuest", "flagGuest", objectSchemaInfo);
            this.oldCustFlagColKey = addColumnDetails("oldCustFlag", "oldCustFlag", objectSchemaInfo);
            this.isLongFormColKey = addColumnDetails("isLongForm", "isLongForm", objectSchemaInfo);
            this.FlagDaftarTransferColKey = addColumnDetails("FlagDaftarTransfer", "FlagDaftarTransfer", objectSchemaInfo);
            this.FlagTxnBerkalaColKey = addColumnDetails("FlagTxnBerkala", "FlagTxnBerkala", objectSchemaInfo);
            this.SenderNameColKey = addColumnDetails("SenderName", "SenderName", objectSchemaInfo);
            this.SenderIdTypeColKey = addColumnDetails("SenderIdType", "SenderIdType", objectSchemaInfo);
            this.SenderIdNumberColKey = addColumnDetails("SenderIdNumber", "SenderIdNumber", objectSchemaInfo);
            this.SenderAddressColKey = addColumnDetails("SenderAddress", "SenderAddress", objectSchemaInfo);
            this.SenderPhoneColKey = addColumnDetails("SenderPhone", "SenderPhone", objectSchemaInfo);
            this.SenderEmailColKey = addColumnDetails("SenderEmail", "SenderEmail", objectSchemaInfo);
            this.ReceiverNameColKey = addColumnDetails("ReceiverName", "ReceiverName", objectSchemaInfo);
            this.ReceiverAccountColKey = addColumnDetails("ReceiverAccount", "ReceiverAccount", objectSchemaInfo);
            this.ReceiverAliasColKey = addColumnDetails("ReceiverAlias", "ReceiverAlias", objectSchemaInfo);
            this.TxnAmountColKey = addColumnDetails("TxnAmount", "TxnAmount", objectSchemaInfo);
            this.TxnSourceColKey = addColumnDetails("TxnSource", "TxnSource", objectSchemaInfo);
            this.TxnPurposeColKey = addColumnDetails("TxnPurpose", "TxnPurpose", objectSchemaInfo);
            this.TxnNotesColKey = addColumnDetails("TxnNotes", "TxnNotes", objectSchemaInfo);
            this.RecurringVarColKey = addColumnDetails("RecurringVar", "RecurringVar", objectSchemaInfo);
            this.RecurringValueColKey = addColumnDetails("RecurringValue", "RecurringValue", objectSchemaInfo);
            this.RecurringEndDateColKey = addColumnDetails("RecurringEndDate", "RecurringEndDate", objectSchemaInfo);
            this.TypeColKey = addColumnDetails("Type", "Type", objectSchemaInfo);
            this.FlagSameReceiverSenderDataColKey = addColumnDetails("FlagSameReceiverSenderData", "FlagSameReceiverSenderData", objectSchemaInfo);
            this.SourceAccountOwnerTypeColKey = addColumnDetails("SourceAccountOwnerType", "SourceAccountOwnerType", objectSchemaInfo);
            this.FlagRepresentativeTransactionColKey = addColumnDetails("FlagRepresentativeTransaction", "FlagRepresentativeTransaction", objectSchemaInfo);
            this.RepresentativeIdTypeColKey = addColumnDetails("RepresentativeIdType", "RepresentativeIdType", objectSchemaInfo);
            this.RepresentativeIdNumberColKey = addColumnDetails("RepresentativeIdNumber", "RepresentativeIdNumber", objectSchemaInfo);
            this.RepresentativeNameColKey = addColumnDetails("RepresentativeName", "RepresentativeName", objectSchemaInfo);
            this.RepresentativeRelationshipColKey = addColumnDetails("RepresentativeRelationship", "RepresentativeRelationship", objectSchemaInfo);
            this.FlagSaveToSourceAccountListColKey = addColumnDetails("FlagSaveToSourceAccountList", "FlagSaveToSourceAccountList", objectSchemaInfo);
            this.currencyColKey = addColumnDetails("currency", "currency", objectSchemaInfo);
        }

        @Override // io.realm.internal.ColumnInfo
        public final ColumnInfo copy(boolean z) {
            return new SetoranColumnInfo(this, z);
        }

        @Override // io.realm.internal.ColumnInfo
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            SetoranColumnInfo setoranColumnInfo = (SetoranColumnInfo) columnInfo;
            SetoranColumnInfo setoranColumnInfo2 = (SetoranColumnInfo) columnInfo2;
            setoranColumnInfo2.idColKey = setoranColumnInfo.idColKey;
            setoranColumnInfo2.currentPageColKey = setoranColumnInfo.currentPageColKey;
            setoranColumnInfo2.createdAtColKey = setoranColumnInfo.createdAtColKey;
            setoranColumnInfo2.updatedAtColKey = setoranColumnInfo.updatedAtColKey;
            setoranColumnInfo2.flagGuestColKey = setoranColumnInfo.flagGuestColKey;
            setoranColumnInfo2.oldCustFlagColKey = setoranColumnInfo.oldCustFlagColKey;
            setoranColumnInfo2.isLongFormColKey = setoranColumnInfo.isLongFormColKey;
            setoranColumnInfo2.FlagDaftarTransferColKey = setoranColumnInfo.FlagDaftarTransferColKey;
            setoranColumnInfo2.FlagTxnBerkalaColKey = setoranColumnInfo.FlagTxnBerkalaColKey;
            setoranColumnInfo2.SenderNameColKey = setoranColumnInfo.SenderNameColKey;
            setoranColumnInfo2.SenderIdTypeColKey = setoranColumnInfo.SenderIdTypeColKey;
            setoranColumnInfo2.SenderIdNumberColKey = setoranColumnInfo.SenderIdNumberColKey;
            setoranColumnInfo2.SenderAddressColKey = setoranColumnInfo.SenderAddressColKey;
            setoranColumnInfo2.SenderPhoneColKey = setoranColumnInfo.SenderPhoneColKey;
            setoranColumnInfo2.SenderEmailColKey = setoranColumnInfo.SenderEmailColKey;
            setoranColumnInfo2.ReceiverNameColKey = setoranColumnInfo.ReceiverNameColKey;
            setoranColumnInfo2.ReceiverAccountColKey = setoranColumnInfo.ReceiverAccountColKey;
            setoranColumnInfo2.ReceiverAliasColKey = setoranColumnInfo.ReceiverAliasColKey;
            setoranColumnInfo2.TxnAmountColKey = setoranColumnInfo.TxnAmountColKey;
            setoranColumnInfo2.TxnSourceColKey = setoranColumnInfo.TxnSourceColKey;
            setoranColumnInfo2.TxnPurposeColKey = setoranColumnInfo.TxnPurposeColKey;
            setoranColumnInfo2.TxnNotesColKey = setoranColumnInfo.TxnNotesColKey;
            setoranColumnInfo2.RecurringVarColKey = setoranColumnInfo.RecurringVarColKey;
            setoranColumnInfo2.RecurringValueColKey = setoranColumnInfo.RecurringValueColKey;
            setoranColumnInfo2.RecurringEndDateColKey = setoranColumnInfo.RecurringEndDateColKey;
            setoranColumnInfo2.TypeColKey = setoranColumnInfo.TypeColKey;
            setoranColumnInfo2.FlagSameReceiverSenderDataColKey = setoranColumnInfo.FlagSameReceiverSenderDataColKey;
            setoranColumnInfo2.SourceAccountOwnerTypeColKey = setoranColumnInfo.SourceAccountOwnerTypeColKey;
            setoranColumnInfo2.FlagRepresentativeTransactionColKey = setoranColumnInfo.FlagRepresentativeTransactionColKey;
            setoranColumnInfo2.RepresentativeIdTypeColKey = setoranColumnInfo.RepresentativeIdTypeColKey;
            setoranColumnInfo2.RepresentativeIdNumberColKey = setoranColumnInfo.RepresentativeIdNumberColKey;
            setoranColumnInfo2.RepresentativeNameColKey = setoranColumnInfo.RepresentativeNameColKey;
            setoranColumnInfo2.RepresentativeRelationshipColKey = setoranColumnInfo.RepresentativeRelationshipColKey;
            setoranColumnInfo2.FlagSaveToSourceAccountListColKey = setoranColumnInfo.FlagSaveToSourceAccountListColKey;
            setoranColumnInfo2.currencyColKey = setoranColumnInfo.currencyColKey;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com_bca_smartbranch_data_localdb_SetoranRealmProxy() {
        this.proxyState.setConstructionFinished();
    }

    public static Setoran copy(Realm realm, SetoranColumnInfo setoranColumnInfo, Setoran setoran, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(setoran);
        if (realmObjectProxy != null) {
            return (Setoran) realmObjectProxy;
        }
        com_bca_smartbranch_data_localdb_SetoranRealmProxyInterface com_bca_smartbranch_data_localdb_setoranrealmproxyinterface = (com_bca_smartbranch_data_localdb_SetoranRealmProxyInterface) setoran;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(Setoran.class), set);
        osObjectBuilder.addInteger(setoranColumnInfo.idColKey, Long.valueOf(com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmGet$id()));
        osObjectBuilder.addString(setoranColumnInfo.currentPageColKey, com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmGet$currentPage());
        osObjectBuilder.addInteger(setoranColumnInfo.createdAtColKey, Long.valueOf(com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmGet$createdAt()));
        osObjectBuilder.addInteger(setoranColumnInfo.updatedAtColKey, Long.valueOf(com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmGet$updatedAt()));
        osObjectBuilder.addString(setoranColumnInfo.flagGuestColKey, com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmGet$flagGuest());
        osObjectBuilder.addString(setoranColumnInfo.oldCustFlagColKey, com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmGet$oldCustFlag());
        osObjectBuilder.addString(setoranColumnInfo.isLongFormColKey, com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmGet$isLongForm());
        osObjectBuilder.addString(setoranColumnInfo.FlagDaftarTransferColKey, com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmGet$FlagDaftarTransfer());
        osObjectBuilder.addString(setoranColumnInfo.FlagTxnBerkalaColKey, com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmGet$FlagTxnBerkala());
        osObjectBuilder.addString(setoranColumnInfo.SenderNameColKey, com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmGet$SenderName());
        osObjectBuilder.addString(setoranColumnInfo.SenderIdTypeColKey, com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmGet$SenderIdType());
        osObjectBuilder.addString(setoranColumnInfo.SenderIdNumberColKey, com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmGet$SenderIdNumber());
        osObjectBuilder.addString(setoranColumnInfo.SenderAddressColKey, com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmGet$SenderAddress());
        osObjectBuilder.addString(setoranColumnInfo.SenderPhoneColKey, com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmGet$SenderPhone());
        osObjectBuilder.addString(setoranColumnInfo.SenderEmailColKey, com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmGet$SenderEmail());
        osObjectBuilder.addString(setoranColumnInfo.ReceiverNameColKey, com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmGet$ReceiverName());
        osObjectBuilder.addString(setoranColumnInfo.ReceiverAccountColKey, com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmGet$ReceiverAccount());
        osObjectBuilder.addString(setoranColumnInfo.ReceiverAliasColKey, com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmGet$ReceiverAlias());
        osObjectBuilder.addString(setoranColumnInfo.TxnAmountColKey, com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmGet$TxnAmount());
        osObjectBuilder.addString(setoranColumnInfo.TxnSourceColKey, com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmGet$TxnSource());
        osObjectBuilder.addString(setoranColumnInfo.TxnPurposeColKey, com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmGet$TxnPurpose());
        osObjectBuilder.addString(setoranColumnInfo.TxnNotesColKey, com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmGet$TxnNotes());
        osObjectBuilder.addString(setoranColumnInfo.RecurringVarColKey, com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmGet$RecurringVar());
        osObjectBuilder.addString(setoranColumnInfo.RecurringValueColKey, com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmGet$RecurringValue());
        osObjectBuilder.addString(setoranColumnInfo.RecurringEndDateColKey, com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmGet$RecurringEndDate());
        osObjectBuilder.addString(setoranColumnInfo.TypeColKey, com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmGet$Type());
        osObjectBuilder.addString(setoranColumnInfo.FlagSameReceiverSenderDataColKey, com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmGet$FlagSameReceiverSenderData());
        osObjectBuilder.addString(setoranColumnInfo.SourceAccountOwnerTypeColKey, com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmGet$SourceAccountOwnerType());
        osObjectBuilder.addString(setoranColumnInfo.FlagRepresentativeTransactionColKey, com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmGet$FlagRepresentativeTransaction());
        osObjectBuilder.addString(setoranColumnInfo.RepresentativeIdTypeColKey, com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmGet$RepresentativeIdType());
        osObjectBuilder.addString(setoranColumnInfo.RepresentativeIdNumberColKey, com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmGet$RepresentativeIdNumber());
        osObjectBuilder.addString(setoranColumnInfo.RepresentativeNameColKey, com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmGet$RepresentativeName());
        osObjectBuilder.addString(setoranColumnInfo.RepresentativeRelationshipColKey, com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmGet$RepresentativeRelationship());
        osObjectBuilder.addString(setoranColumnInfo.FlagSaveToSourceAccountListColKey, com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmGet$FlagSaveToSourceAccountList());
        osObjectBuilder.addString(setoranColumnInfo.currencyColKey, com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmGet$currency());
        com_bca_smartbranch_data_localdb_SetoranRealmProxy newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(setoran, newProxyInstance);
        return newProxyInstance;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0104  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static com.bca.smartbranch.data.localdb.Setoran copyOrUpdate(io.realm.Realm r7, io.realm.com_bca_smartbranch_data_localdb_SetoranRealmProxy.SetoranColumnInfo r8, com.bca.smartbranch.data.localdb.Setoran r9, boolean r10, java.util.Map<io.realm.RealmModel, io.realm.internal.RealmObjectProxy> r11, java.util.Set<io.realm.ImportFlag> r12) {
        /*
        // Method dump skipped, instructions count: 274
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.com_bca_smartbranch_data_localdb_SetoranRealmProxy.copyOrUpdate(io.realm.Realm, io.realm.com_bca_smartbranch_data_localdb_SetoranRealmProxy$SetoranColumnInfo, com.bca.smartbranch.data.localdb.Setoran, boolean, java.util.Map, java.util.Set):com.bca.smartbranch.data.localdb.Setoran");
    }

    public static SetoranColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new SetoranColumnInfo(osSchemaInfo);
    }

    public static Setoran createDetachedCopy(Setoran setoran, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        Setoran setoran2;
        if (i > i2 || setoran == null) {
            return null;
        }
        RealmObjectProxy.CacheData<RealmModel> cacheData = map.get(setoran);
        if (cacheData == null) {
            Setoran setoran3 = new Setoran();
            map.put(setoran, new RealmObjectProxy.CacheData<>(i, setoran3));
            setoran2 = setoran3;
        } else if (i >= cacheData.minDepth) {
            return (Setoran) cacheData.object;
        } else {
            setoran2 = (Setoran) cacheData.object;
            cacheData.minDepth = i;
        }
        com_bca_smartbranch_data_localdb_SetoranRealmProxyInterface com_bca_smartbranch_data_localdb_setoranrealmproxyinterface = (com_bca_smartbranch_data_localdb_SetoranRealmProxyInterface) setoran2;
        com_bca_smartbranch_data_localdb_SetoranRealmProxyInterface com_bca_smartbranch_data_localdb_setoranrealmproxyinterface2 = (com_bca_smartbranch_data_localdb_SetoranRealmProxyInterface) setoran;
        ((RealmObjectProxy) setoran).realmGet$proxyState().getRealm$realm();
        com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmSet$id(com_bca_smartbranch_data_localdb_setoranrealmproxyinterface2.realmGet$id());
        com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmSet$currentPage(com_bca_smartbranch_data_localdb_setoranrealmproxyinterface2.realmGet$currentPage());
        com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmSet$createdAt(com_bca_smartbranch_data_localdb_setoranrealmproxyinterface2.realmGet$createdAt());
        com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmSet$updatedAt(com_bca_smartbranch_data_localdb_setoranrealmproxyinterface2.realmGet$updatedAt());
        com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmSet$flagGuest(com_bca_smartbranch_data_localdb_setoranrealmproxyinterface2.realmGet$flagGuest());
        com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmSet$oldCustFlag(com_bca_smartbranch_data_localdb_setoranrealmproxyinterface2.realmGet$oldCustFlag());
        com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmSet$isLongForm(com_bca_smartbranch_data_localdb_setoranrealmproxyinterface2.realmGet$isLongForm());
        com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmSet$FlagDaftarTransfer(com_bca_smartbranch_data_localdb_setoranrealmproxyinterface2.realmGet$FlagDaftarTransfer());
        com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmSet$FlagTxnBerkala(com_bca_smartbranch_data_localdb_setoranrealmproxyinterface2.realmGet$FlagTxnBerkala());
        com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmSet$SenderName(com_bca_smartbranch_data_localdb_setoranrealmproxyinterface2.realmGet$SenderName());
        com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmSet$SenderIdType(com_bca_smartbranch_data_localdb_setoranrealmproxyinterface2.realmGet$SenderIdType());
        com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmSet$SenderIdNumber(com_bca_smartbranch_data_localdb_setoranrealmproxyinterface2.realmGet$SenderIdNumber());
        com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmSet$SenderAddress(com_bca_smartbranch_data_localdb_setoranrealmproxyinterface2.realmGet$SenderAddress());
        com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmSet$SenderPhone(com_bca_smartbranch_data_localdb_setoranrealmproxyinterface2.realmGet$SenderPhone());
        com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmSet$SenderEmail(com_bca_smartbranch_data_localdb_setoranrealmproxyinterface2.realmGet$SenderEmail());
        com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmSet$ReceiverName(com_bca_smartbranch_data_localdb_setoranrealmproxyinterface2.realmGet$ReceiverName());
        com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmSet$ReceiverAccount(com_bca_smartbranch_data_localdb_setoranrealmproxyinterface2.realmGet$ReceiverAccount());
        com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmSet$ReceiverAlias(com_bca_smartbranch_data_localdb_setoranrealmproxyinterface2.realmGet$ReceiverAlias());
        com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmSet$TxnAmount(com_bca_smartbranch_data_localdb_setoranrealmproxyinterface2.realmGet$TxnAmount());
        com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmSet$TxnSource(com_bca_smartbranch_data_localdb_setoranrealmproxyinterface2.realmGet$TxnSource());
        com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmSet$TxnPurpose(com_bca_smartbranch_data_localdb_setoranrealmproxyinterface2.realmGet$TxnPurpose());
        com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmSet$TxnNotes(com_bca_smartbranch_data_localdb_setoranrealmproxyinterface2.realmGet$TxnNotes());
        com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmSet$RecurringVar(com_bca_smartbranch_data_localdb_setoranrealmproxyinterface2.realmGet$RecurringVar());
        com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmSet$RecurringValue(com_bca_smartbranch_data_localdb_setoranrealmproxyinterface2.realmGet$RecurringValue());
        com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmSet$RecurringEndDate(com_bca_smartbranch_data_localdb_setoranrealmproxyinterface2.realmGet$RecurringEndDate());
        com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmSet$Type(com_bca_smartbranch_data_localdb_setoranrealmproxyinterface2.realmGet$Type());
        com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmSet$FlagSameReceiverSenderData(com_bca_smartbranch_data_localdb_setoranrealmproxyinterface2.realmGet$FlagSameReceiverSenderData());
        com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmSet$SourceAccountOwnerType(com_bca_smartbranch_data_localdb_setoranrealmproxyinterface2.realmGet$SourceAccountOwnerType());
        com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmSet$FlagRepresentativeTransaction(com_bca_smartbranch_data_localdb_setoranrealmproxyinterface2.realmGet$FlagRepresentativeTransaction());
        com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmSet$RepresentativeIdType(com_bca_smartbranch_data_localdb_setoranrealmproxyinterface2.realmGet$RepresentativeIdType());
        com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmSet$RepresentativeIdNumber(com_bca_smartbranch_data_localdb_setoranrealmproxyinterface2.realmGet$RepresentativeIdNumber());
        com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmSet$RepresentativeName(com_bca_smartbranch_data_localdb_setoranrealmproxyinterface2.realmGet$RepresentativeName());
        com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmSet$RepresentativeRelationship(com_bca_smartbranch_data_localdb_setoranrealmproxyinterface2.realmGet$RepresentativeRelationship());
        com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmSet$FlagSaveToSourceAccountList(com_bca_smartbranch_data_localdb_setoranrealmproxyinterface2.realmGet$FlagSaveToSourceAccountList());
        com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmSet$currency(com_bca_smartbranch_data_localdb_setoranrealmproxyinterface2.realmGet$currency());
        return setoran2;
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("", "Setoran", false, 35, 0);
        builder.addPersistedProperty("", "id", RealmFieldType.INTEGER, true, false, true);
        builder.addPersistedProperty("", "currentPage", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "createdAt", RealmFieldType.INTEGER, false, false, true);
        builder.addPersistedProperty("", "updatedAt", RealmFieldType.INTEGER, false, false, true);
        builder.addPersistedProperty("", "flagGuest", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "oldCustFlag", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "isLongForm", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "FlagDaftarTransfer", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "FlagTxnBerkala", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "SenderName", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "SenderIdType", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "SenderIdNumber", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "SenderAddress", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "SenderPhone", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "SenderEmail", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "ReceiverName", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "ReceiverAccount", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "ReceiverAlias", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "TxnAmount", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "TxnSource", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "TxnPurpose", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "TxnNotes", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "RecurringVar", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "RecurringValue", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "RecurringEndDate", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "Type", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "FlagSameReceiverSenderData", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "SourceAccountOwnerType", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "FlagRepresentativeTransaction", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "RepresentativeIdType", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "RepresentativeIdNumber", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "RepresentativeName", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "RepresentativeRelationship", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "FlagSaveToSourceAccountList", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "currency", RealmFieldType.STRING, false, false, false);
        return builder.build();
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x04aa  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x04d5  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0500  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x052b  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0556  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0581  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x05ac  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x05d7  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0602  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x062d  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0658  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0683  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02d1  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static com.bca.smartbranch.data.localdb.Setoran createOrUpdateUsingJsonObject(io.realm.Realm r7, org.json.JSONObject r8, boolean r9) throws org.json.JSONException {
        /*
        // Method dump skipped, instructions count: 1703
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.com_bca_smartbranch_data_localdb_SetoranRealmProxy.createOrUpdateUsingJsonObject(io.realm.Realm, org.json.JSONObject, boolean):com.bca.smartbranch.data.localdb.Setoran");
    }

    public static Setoran createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        com_bca_smartbranch_data_localdb_SetoranRealmProxyInterface setoran = new Setoran();
        com_bca_smartbranch_data_localdb_SetoranRealmProxyInterface com_bca_smartbranch_data_localdb_setoranrealmproxyinterface = setoran;
        jsonReader.beginObject();
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("id")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmSet$id(jsonReader.nextLong());
                    z = true;
                } else {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'id' to null.");
                }
            } else if (nextName.equals("currentPage")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmSet$currentPage(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmSet$currentPage((String) null);
                }
            } else if (nextName.equals("createdAt")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmSet$createdAt(jsonReader.nextLong());
                } else {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'createdAt' to null.");
                }
            } else if (nextName.equals("updatedAt")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmSet$updatedAt(jsonReader.nextLong());
                } else {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'updatedAt' to null.");
                }
            } else if (nextName.equals("flagGuest")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmSet$flagGuest(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmSet$flagGuest((String) null);
                }
            } else if (nextName.equals("oldCustFlag")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmSet$oldCustFlag(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmSet$oldCustFlag((String) null);
                }
            } else if (nextName.equals("isLongForm")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmSet$isLongForm(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmSet$isLongForm((String) null);
                }
            } else if (nextName.equals("FlagDaftarTransfer")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmSet$FlagDaftarTransfer(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmSet$FlagDaftarTransfer((String) null);
                }
            } else if (nextName.equals("FlagTxnBerkala")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmSet$FlagTxnBerkala(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmSet$FlagTxnBerkala((String) null);
                }
            } else if (nextName.equals("SenderName")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmSet$SenderName(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmSet$SenderName((String) null);
                }
            } else if (nextName.equals("SenderIdType")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmSet$SenderIdType(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmSet$SenderIdType((String) null);
                }
            } else if (nextName.equals("SenderIdNumber")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmSet$SenderIdNumber(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmSet$SenderIdNumber((String) null);
                }
            } else if (nextName.equals("SenderAddress")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmSet$SenderAddress(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmSet$SenderAddress((String) null);
                }
            } else if (nextName.equals("SenderPhone")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmSet$SenderPhone(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmSet$SenderPhone((String) null);
                }
            } else if (nextName.equals("SenderEmail")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmSet$SenderEmail(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmSet$SenderEmail((String) null);
                }
            } else if (nextName.equals("ReceiverName")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmSet$ReceiverName(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmSet$ReceiverName((String) null);
                }
            } else if (nextName.equals("ReceiverAccount")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmSet$ReceiverAccount(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmSet$ReceiverAccount((String) null);
                }
            } else if (nextName.equals("ReceiverAlias")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmSet$ReceiverAlias(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmSet$ReceiverAlias((String) null);
                }
            } else if (nextName.equals("TxnAmount")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmSet$TxnAmount(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmSet$TxnAmount((String) null);
                }
            } else if (nextName.equals("TxnSource")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmSet$TxnSource(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmSet$TxnSource((String) null);
                }
            } else if (nextName.equals("TxnPurpose")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmSet$TxnPurpose(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmSet$TxnPurpose((String) null);
                }
            } else if (nextName.equals("TxnNotes")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmSet$TxnNotes(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmSet$TxnNotes((String) null);
                }
            } else if (nextName.equals("RecurringVar")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmSet$RecurringVar(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmSet$RecurringVar((String) null);
                }
            } else if (nextName.equals("RecurringValue")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmSet$RecurringValue(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmSet$RecurringValue((String) null);
                }
            } else if (nextName.equals("RecurringEndDate")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmSet$RecurringEndDate(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmSet$RecurringEndDate((String) null);
                }
            } else if (nextName.equals("Type")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmSet$Type(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmSet$Type((String) null);
                }
            } else if (nextName.equals("FlagSameReceiverSenderData")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmSet$FlagSameReceiverSenderData(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmSet$FlagSameReceiverSenderData((String) null);
                }
            } else if (nextName.equals("SourceAccountOwnerType")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmSet$SourceAccountOwnerType(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmSet$SourceAccountOwnerType((String) null);
                }
            } else if (nextName.equals("FlagRepresentativeTransaction")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmSet$FlagRepresentativeTransaction(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmSet$FlagRepresentativeTransaction((String) null);
                }
            } else if (nextName.equals("RepresentativeIdType")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmSet$RepresentativeIdType(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmSet$RepresentativeIdType((String) null);
                }
            } else if (nextName.equals("RepresentativeIdNumber")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmSet$RepresentativeIdNumber(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmSet$RepresentativeIdNumber((String) null);
                }
            } else if (nextName.equals("RepresentativeName")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmSet$RepresentativeName(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmSet$RepresentativeName((String) null);
                }
            } else if (nextName.equals("RepresentativeRelationship")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmSet$RepresentativeRelationship(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmSet$RepresentativeRelationship((String) null);
                }
            } else if (nextName.equals("FlagSaveToSourceAccountList")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmSet$FlagSaveToSourceAccountList(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmSet$FlagSaveToSourceAccountList((String) null);
                }
            } else if (!nextName.equals("currency")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() != JsonToken.NULL) {
                com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmSet$currency(jsonReader.nextString());
            } else {
                jsonReader.skipValue();
                com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmSet$currency((String) null);
            }
        }
        jsonReader.endObject();
        if (z) {
            return (Setoran) realm.copyToRealmOrUpdate((Realm) setoran, new ImportFlag[0]);
        }
        throw new IllegalArgumentException("JSON object doesn't have the primary key field 'id'.");
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static String getSimpleClassName() {
        return "Setoran";
    }

    public static long insert(Realm realm, Setoran setoran, Map<RealmModel, Long> map) {
        if ((setoran instanceof RealmObjectProxy) && !RealmObject.isFrozen(setoran)) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) setoran;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getObjectKey();
            }
        }
        Table table = realm.getTable(Setoran.class);
        long nativePtr = table.getNativePtr();
        SetoranColumnInfo setoranColumnInfo = (SetoranColumnInfo) realm.getSchema().getColumnInfo(Setoran.class);
        long j = setoranColumnInfo.idColKey;
        com_bca_smartbranch_data_localdb_SetoranRealmProxyInterface com_bca_smartbranch_data_localdb_setoranrealmproxyinterface = (com_bca_smartbranch_data_localdb_SetoranRealmProxyInterface) setoran;
        Long valueOf = Long.valueOf(com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmGet$id());
        long nativeFindFirstInt = valueOf != null ? Table.nativeFindFirstInt(nativePtr, j, com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmGet$id()) : -1;
        if (nativeFindFirstInt == -1) {
            nativeFindFirstInt = OsObject.createRowWithPrimaryKey(table, j, Long.valueOf(com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmGet$id()));
        } else {
            Table.throwDuplicatePrimaryKeyException(valueOf);
        }
        map.put(setoran, Long.valueOf(nativeFindFirstInt));
        String realmGet$currentPage = com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmGet$currentPage();
        if (realmGet$currentPage != null) {
            Table.nativeSetString(nativePtr, setoranColumnInfo.currentPageColKey, nativeFindFirstInt, realmGet$currentPage, false);
        }
        Table.nativeSetLong(nativePtr, setoranColumnInfo.createdAtColKey, nativeFindFirstInt, com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmGet$createdAt(), false);
        Table.nativeSetLong(nativePtr, setoranColumnInfo.updatedAtColKey, nativeFindFirstInt, com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmGet$updatedAt(), false);
        String realmGet$flagGuest = com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmGet$flagGuest();
        if (realmGet$flagGuest != null) {
            Table.nativeSetString(nativePtr, setoranColumnInfo.flagGuestColKey, nativeFindFirstInt, realmGet$flagGuest, false);
        }
        String realmGet$oldCustFlag = com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmGet$oldCustFlag();
        if (realmGet$oldCustFlag != null) {
            Table.nativeSetString(nativePtr, setoranColumnInfo.oldCustFlagColKey, nativeFindFirstInt, realmGet$oldCustFlag, false);
        }
        String realmGet$isLongForm = com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmGet$isLongForm();
        if (realmGet$isLongForm != null) {
            Table.nativeSetString(nativePtr, setoranColumnInfo.isLongFormColKey, nativeFindFirstInt, realmGet$isLongForm, false);
        }
        String realmGet$FlagDaftarTransfer = com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmGet$FlagDaftarTransfer();
        if (realmGet$FlagDaftarTransfer != null) {
            Table.nativeSetString(nativePtr, setoranColumnInfo.FlagDaftarTransferColKey, nativeFindFirstInt, realmGet$FlagDaftarTransfer, false);
        }
        String realmGet$FlagTxnBerkala = com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmGet$FlagTxnBerkala();
        if (realmGet$FlagTxnBerkala != null) {
            Table.nativeSetString(nativePtr, setoranColumnInfo.FlagTxnBerkalaColKey, nativeFindFirstInt, realmGet$FlagTxnBerkala, false);
        }
        String realmGet$SenderName = com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmGet$SenderName();
        if (realmGet$SenderName != null) {
            Table.nativeSetString(nativePtr, setoranColumnInfo.SenderNameColKey, nativeFindFirstInt, realmGet$SenderName, false);
        }
        String realmGet$SenderIdType = com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmGet$SenderIdType();
        if (realmGet$SenderIdType != null) {
            Table.nativeSetString(nativePtr, setoranColumnInfo.SenderIdTypeColKey, nativeFindFirstInt, realmGet$SenderIdType, false);
        }
        String realmGet$SenderIdNumber = com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmGet$SenderIdNumber();
        if (realmGet$SenderIdNumber != null) {
            Table.nativeSetString(nativePtr, setoranColumnInfo.SenderIdNumberColKey, nativeFindFirstInt, realmGet$SenderIdNumber, false);
        }
        String realmGet$SenderAddress = com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmGet$SenderAddress();
        if (realmGet$SenderAddress != null) {
            Table.nativeSetString(nativePtr, setoranColumnInfo.SenderAddressColKey, nativeFindFirstInt, realmGet$SenderAddress, false);
        }
        String realmGet$SenderPhone = com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmGet$SenderPhone();
        if (realmGet$SenderPhone != null) {
            Table.nativeSetString(nativePtr, setoranColumnInfo.SenderPhoneColKey, nativeFindFirstInt, realmGet$SenderPhone, false);
        }
        String realmGet$SenderEmail = com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmGet$SenderEmail();
        if (realmGet$SenderEmail != null) {
            Table.nativeSetString(nativePtr, setoranColumnInfo.SenderEmailColKey, nativeFindFirstInt, realmGet$SenderEmail, false);
        }
        String realmGet$ReceiverName = com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmGet$ReceiverName();
        if (realmGet$ReceiverName != null) {
            Table.nativeSetString(nativePtr, setoranColumnInfo.ReceiverNameColKey, nativeFindFirstInt, realmGet$ReceiverName, false);
        }
        String realmGet$ReceiverAccount = com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmGet$ReceiverAccount();
        if (realmGet$ReceiverAccount != null) {
            Table.nativeSetString(nativePtr, setoranColumnInfo.ReceiverAccountColKey, nativeFindFirstInt, realmGet$ReceiverAccount, false);
        }
        String realmGet$ReceiverAlias = com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmGet$ReceiverAlias();
        if (realmGet$ReceiverAlias != null) {
            Table.nativeSetString(nativePtr, setoranColumnInfo.ReceiverAliasColKey, nativeFindFirstInt, realmGet$ReceiverAlias, false);
        }
        String realmGet$TxnAmount = com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmGet$TxnAmount();
        if (realmGet$TxnAmount != null) {
            Table.nativeSetString(nativePtr, setoranColumnInfo.TxnAmountColKey, nativeFindFirstInt, realmGet$TxnAmount, false);
        }
        String realmGet$TxnSource = com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmGet$TxnSource();
        if (realmGet$TxnSource != null) {
            Table.nativeSetString(nativePtr, setoranColumnInfo.TxnSourceColKey, nativeFindFirstInt, realmGet$TxnSource, false);
        }
        String realmGet$TxnPurpose = com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmGet$TxnPurpose();
        if (realmGet$TxnPurpose != null) {
            Table.nativeSetString(nativePtr, setoranColumnInfo.TxnPurposeColKey, nativeFindFirstInt, realmGet$TxnPurpose, false);
        }
        String realmGet$TxnNotes = com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmGet$TxnNotes();
        if (realmGet$TxnNotes != null) {
            Table.nativeSetString(nativePtr, setoranColumnInfo.TxnNotesColKey, nativeFindFirstInt, realmGet$TxnNotes, false);
        }
        String realmGet$RecurringVar = com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmGet$RecurringVar();
        if (realmGet$RecurringVar != null) {
            Table.nativeSetString(nativePtr, setoranColumnInfo.RecurringVarColKey, nativeFindFirstInt, realmGet$RecurringVar, false);
        }
        String realmGet$RecurringValue = com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmGet$RecurringValue();
        if (realmGet$RecurringValue != null) {
            Table.nativeSetString(nativePtr, setoranColumnInfo.RecurringValueColKey, nativeFindFirstInt, realmGet$RecurringValue, false);
        }
        String realmGet$RecurringEndDate = com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmGet$RecurringEndDate();
        if (realmGet$RecurringEndDate != null) {
            Table.nativeSetString(nativePtr, setoranColumnInfo.RecurringEndDateColKey, nativeFindFirstInt, realmGet$RecurringEndDate, false);
        }
        String realmGet$Type = com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmGet$Type();
        if (realmGet$Type != null) {
            Table.nativeSetString(nativePtr, setoranColumnInfo.TypeColKey, nativeFindFirstInt, realmGet$Type, false);
        }
        String realmGet$FlagSameReceiverSenderData = com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmGet$FlagSameReceiverSenderData();
        if (realmGet$FlagSameReceiverSenderData != null) {
            Table.nativeSetString(nativePtr, setoranColumnInfo.FlagSameReceiverSenderDataColKey, nativeFindFirstInt, realmGet$FlagSameReceiverSenderData, false);
        }
        String realmGet$SourceAccountOwnerType = com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmGet$SourceAccountOwnerType();
        if (realmGet$SourceAccountOwnerType != null) {
            Table.nativeSetString(nativePtr, setoranColumnInfo.SourceAccountOwnerTypeColKey, nativeFindFirstInt, realmGet$SourceAccountOwnerType, false);
        }
        String realmGet$FlagRepresentativeTransaction = com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmGet$FlagRepresentativeTransaction();
        if (realmGet$FlagRepresentativeTransaction != null) {
            Table.nativeSetString(nativePtr, setoranColumnInfo.FlagRepresentativeTransactionColKey, nativeFindFirstInt, realmGet$FlagRepresentativeTransaction, false);
        }
        String realmGet$RepresentativeIdType = com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmGet$RepresentativeIdType();
        if (realmGet$RepresentativeIdType != null) {
            Table.nativeSetString(nativePtr, setoranColumnInfo.RepresentativeIdTypeColKey, nativeFindFirstInt, realmGet$RepresentativeIdType, false);
        }
        String realmGet$RepresentativeIdNumber = com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmGet$RepresentativeIdNumber();
        if (realmGet$RepresentativeIdNumber != null) {
            Table.nativeSetString(nativePtr, setoranColumnInfo.RepresentativeIdNumberColKey, nativeFindFirstInt, realmGet$RepresentativeIdNumber, false);
        }
        String realmGet$RepresentativeName = com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmGet$RepresentativeName();
        if (realmGet$RepresentativeName != null) {
            Table.nativeSetString(nativePtr, setoranColumnInfo.RepresentativeNameColKey, nativeFindFirstInt, realmGet$RepresentativeName, false);
        }
        String realmGet$RepresentativeRelationship = com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmGet$RepresentativeRelationship();
        if (realmGet$RepresentativeRelationship != null) {
            Table.nativeSetString(nativePtr, setoranColumnInfo.RepresentativeRelationshipColKey, nativeFindFirstInt, realmGet$RepresentativeRelationship, false);
        }
        String realmGet$FlagSaveToSourceAccountList = com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmGet$FlagSaveToSourceAccountList();
        if (realmGet$FlagSaveToSourceAccountList != null) {
            Table.nativeSetString(nativePtr, setoranColumnInfo.FlagSaveToSourceAccountListColKey, nativeFindFirstInt, realmGet$FlagSaveToSourceAccountList, false);
        }
        String realmGet$currency = com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmGet$currency();
        if (realmGet$currency != null) {
            Table.nativeSetString(nativePtr, setoranColumnInfo.currencyColKey, nativeFindFirstInt, realmGet$currency, false);
        }
        return nativeFindFirstInt;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Table table = realm.getTable(Setoran.class);
        long nativePtr = table.getNativePtr();
        SetoranColumnInfo setoranColumnInfo = (SetoranColumnInfo) realm.getSchema().getColumnInfo(Setoran.class);
        long j = setoranColumnInfo.idColKey;
        while (it.hasNext()) {
            com_bca_smartbranch_data_localdb_SetoranRealmProxyInterface com_bca_smartbranch_data_localdb_setoranrealmproxyinterface = (Setoran) it.next();
            if (!map.containsKey(com_bca_smartbranch_data_localdb_setoranrealmproxyinterface)) {
                if ((com_bca_smartbranch_data_localdb_setoranrealmproxyinterface instanceof RealmObjectProxy) && !RealmObject.isFrozen(com_bca_smartbranch_data_localdb_setoranrealmproxyinterface)) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) com_bca_smartbranch_data_localdb_setoranrealmproxyinterface;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map.put(com_bca_smartbranch_data_localdb_setoranrealmproxyinterface, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getObjectKey()));
                    }
                }
                com_bca_smartbranch_data_localdb_SetoranRealmProxyInterface com_bca_smartbranch_data_localdb_setoranrealmproxyinterface2 = com_bca_smartbranch_data_localdb_setoranrealmproxyinterface;
                Long valueOf = Long.valueOf(com_bca_smartbranch_data_localdb_setoranrealmproxyinterface2.realmGet$id());
                long nativeFindFirstInt = valueOf != null ? Table.nativeFindFirstInt(nativePtr, j, com_bca_smartbranch_data_localdb_setoranrealmproxyinterface2.realmGet$id()) : -1;
                if (nativeFindFirstInt == -1) {
                    nativeFindFirstInt = OsObject.createRowWithPrimaryKey(table, j, Long.valueOf(com_bca_smartbranch_data_localdb_setoranrealmproxyinterface2.realmGet$id()));
                } else {
                    Table.throwDuplicatePrimaryKeyException(valueOf);
                }
                map.put(com_bca_smartbranch_data_localdb_setoranrealmproxyinterface, Long.valueOf(nativeFindFirstInt));
                String realmGet$currentPage = com_bca_smartbranch_data_localdb_setoranrealmproxyinterface2.realmGet$currentPage();
                if (realmGet$currentPage != null) {
                    Table.nativeSetString(nativePtr, setoranColumnInfo.currentPageColKey, nativeFindFirstInt, realmGet$currentPage, false);
                }
                Table.nativeSetLong(nativePtr, setoranColumnInfo.createdAtColKey, nativeFindFirstInt, com_bca_smartbranch_data_localdb_setoranrealmproxyinterface2.realmGet$createdAt(), false);
                Table.nativeSetLong(nativePtr, setoranColumnInfo.updatedAtColKey, nativeFindFirstInt, com_bca_smartbranch_data_localdb_setoranrealmproxyinterface2.realmGet$updatedAt(), false);
                String realmGet$flagGuest = com_bca_smartbranch_data_localdb_setoranrealmproxyinterface2.realmGet$flagGuest();
                if (realmGet$flagGuest != null) {
                    Table.nativeSetString(nativePtr, setoranColumnInfo.flagGuestColKey, nativeFindFirstInt, realmGet$flagGuest, false);
                }
                String realmGet$oldCustFlag = com_bca_smartbranch_data_localdb_setoranrealmproxyinterface2.realmGet$oldCustFlag();
                if (realmGet$oldCustFlag != null) {
                    Table.nativeSetString(nativePtr, setoranColumnInfo.oldCustFlagColKey, nativeFindFirstInt, realmGet$oldCustFlag, false);
                }
                String realmGet$isLongForm = com_bca_smartbranch_data_localdb_setoranrealmproxyinterface2.realmGet$isLongForm();
                if (realmGet$isLongForm != null) {
                    Table.nativeSetString(nativePtr, setoranColumnInfo.isLongFormColKey, nativeFindFirstInt, realmGet$isLongForm, false);
                }
                String realmGet$FlagDaftarTransfer = com_bca_smartbranch_data_localdb_setoranrealmproxyinterface2.realmGet$FlagDaftarTransfer();
                if (realmGet$FlagDaftarTransfer != null) {
                    Table.nativeSetString(nativePtr, setoranColumnInfo.FlagDaftarTransferColKey, nativeFindFirstInt, realmGet$FlagDaftarTransfer, false);
                }
                String realmGet$FlagTxnBerkala = com_bca_smartbranch_data_localdb_setoranrealmproxyinterface2.realmGet$FlagTxnBerkala();
                if (realmGet$FlagTxnBerkala != null) {
                    Table.nativeSetString(nativePtr, setoranColumnInfo.FlagTxnBerkalaColKey, nativeFindFirstInt, realmGet$FlagTxnBerkala, false);
                }
                String realmGet$SenderName = com_bca_smartbranch_data_localdb_setoranrealmproxyinterface2.realmGet$SenderName();
                if (realmGet$SenderName != null) {
                    Table.nativeSetString(nativePtr, setoranColumnInfo.SenderNameColKey, nativeFindFirstInt, realmGet$SenderName, false);
                }
                String realmGet$SenderIdType = com_bca_smartbranch_data_localdb_setoranrealmproxyinterface2.realmGet$SenderIdType();
                if (realmGet$SenderIdType != null) {
                    Table.nativeSetString(nativePtr, setoranColumnInfo.SenderIdTypeColKey, nativeFindFirstInt, realmGet$SenderIdType, false);
                }
                String realmGet$SenderIdNumber = com_bca_smartbranch_data_localdb_setoranrealmproxyinterface2.realmGet$SenderIdNumber();
                if (realmGet$SenderIdNumber != null) {
                    Table.nativeSetString(nativePtr, setoranColumnInfo.SenderIdNumberColKey, nativeFindFirstInt, realmGet$SenderIdNumber, false);
                }
                String realmGet$SenderAddress = com_bca_smartbranch_data_localdb_setoranrealmproxyinterface2.realmGet$SenderAddress();
                if (realmGet$SenderAddress != null) {
                    Table.nativeSetString(nativePtr, setoranColumnInfo.SenderAddressColKey, nativeFindFirstInt, realmGet$SenderAddress, false);
                }
                String realmGet$SenderPhone = com_bca_smartbranch_data_localdb_setoranrealmproxyinterface2.realmGet$SenderPhone();
                if (realmGet$SenderPhone != null) {
                    Table.nativeSetString(nativePtr, setoranColumnInfo.SenderPhoneColKey, nativeFindFirstInt, realmGet$SenderPhone, false);
                }
                String realmGet$SenderEmail = com_bca_smartbranch_data_localdb_setoranrealmproxyinterface2.realmGet$SenderEmail();
                if (realmGet$SenderEmail != null) {
                    Table.nativeSetString(nativePtr, setoranColumnInfo.SenderEmailColKey, nativeFindFirstInt, realmGet$SenderEmail, false);
                }
                String realmGet$ReceiverName = com_bca_smartbranch_data_localdb_setoranrealmproxyinterface2.realmGet$ReceiverName();
                if (realmGet$ReceiverName != null) {
                    Table.nativeSetString(nativePtr, setoranColumnInfo.ReceiverNameColKey, nativeFindFirstInt, realmGet$ReceiverName, false);
                }
                String realmGet$ReceiverAccount = com_bca_smartbranch_data_localdb_setoranrealmproxyinterface2.realmGet$ReceiverAccount();
                if (realmGet$ReceiverAccount != null) {
                    Table.nativeSetString(nativePtr, setoranColumnInfo.ReceiverAccountColKey, nativeFindFirstInt, realmGet$ReceiverAccount, false);
                }
                String realmGet$ReceiverAlias = com_bca_smartbranch_data_localdb_setoranrealmproxyinterface2.realmGet$ReceiverAlias();
                if (realmGet$ReceiverAlias != null) {
                    Table.nativeSetString(nativePtr, setoranColumnInfo.ReceiverAliasColKey, nativeFindFirstInt, realmGet$ReceiverAlias, false);
                }
                String realmGet$TxnAmount = com_bca_smartbranch_data_localdb_setoranrealmproxyinterface2.realmGet$TxnAmount();
                if (realmGet$TxnAmount != null) {
                    Table.nativeSetString(nativePtr, setoranColumnInfo.TxnAmountColKey, nativeFindFirstInt, realmGet$TxnAmount, false);
                }
                String realmGet$TxnSource = com_bca_smartbranch_data_localdb_setoranrealmproxyinterface2.realmGet$TxnSource();
                if (realmGet$TxnSource != null) {
                    Table.nativeSetString(nativePtr, setoranColumnInfo.TxnSourceColKey, nativeFindFirstInt, realmGet$TxnSource, false);
                }
                String realmGet$TxnPurpose = com_bca_smartbranch_data_localdb_setoranrealmproxyinterface2.realmGet$TxnPurpose();
                if (realmGet$TxnPurpose != null) {
                    Table.nativeSetString(nativePtr, setoranColumnInfo.TxnPurposeColKey, nativeFindFirstInt, realmGet$TxnPurpose, false);
                }
                String realmGet$TxnNotes = com_bca_smartbranch_data_localdb_setoranrealmproxyinterface2.realmGet$TxnNotes();
                if (realmGet$TxnNotes != null) {
                    Table.nativeSetString(nativePtr, setoranColumnInfo.TxnNotesColKey, nativeFindFirstInt, realmGet$TxnNotes, false);
                }
                String realmGet$RecurringVar = com_bca_smartbranch_data_localdb_setoranrealmproxyinterface2.realmGet$RecurringVar();
                if (realmGet$RecurringVar != null) {
                    Table.nativeSetString(nativePtr, setoranColumnInfo.RecurringVarColKey, nativeFindFirstInt, realmGet$RecurringVar, false);
                }
                String realmGet$RecurringValue = com_bca_smartbranch_data_localdb_setoranrealmproxyinterface2.realmGet$RecurringValue();
                if (realmGet$RecurringValue != null) {
                    Table.nativeSetString(nativePtr, setoranColumnInfo.RecurringValueColKey, nativeFindFirstInt, realmGet$RecurringValue, false);
                }
                String realmGet$RecurringEndDate = com_bca_smartbranch_data_localdb_setoranrealmproxyinterface2.realmGet$RecurringEndDate();
                if (realmGet$RecurringEndDate != null) {
                    Table.nativeSetString(nativePtr, setoranColumnInfo.RecurringEndDateColKey, nativeFindFirstInt, realmGet$RecurringEndDate, false);
                }
                String realmGet$Type = com_bca_smartbranch_data_localdb_setoranrealmproxyinterface2.realmGet$Type();
                if (realmGet$Type != null) {
                    Table.nativeSetString(nativePtr, setoranColumnInfo.TypeColKey, nativeFindFirstInt, realmGet$Type, false);
                }
                String realmGet$FlagSameReceiverSenderData = com_bca_smartbranch_data_localdb_setoranrealmproxyinterface2.realmGet$FlagSameReceiverSenderData();
                if (realmGet$FlagSameReceiverSenderData != null) {
                    Table.nativeSetString(nativePtr, setoranColumnInfo.FlagSameReceiverSenderDataColKey, nativeFindFirstInt, realmGet$FlagSameReceiverSenderData, false);
                }
                String realmGet$SourceAccountOwnerType = com_bca_smartbranch_data_localdb_setoranrealmproxyinterface2.realmGet$SourceAccountOwnerType();
                if (realmGet$SourceAccountOwnerType != null) {
                    Table.nativeSetString(nativePtr, setoranColumnInfo.SourceAccountOwnerTypeColKey, nativeFindFirstInt, realmGet$SourceAccountOwnerType, false);
                }
                String realmGet$FlagRepresentativeTransaction = com_bca_smartbranch_data_localdb_setoranrealmproxyinterface2.realmGet$FlagRepresentativeTransaction();
                if (realmGet$FlagRepresentativeTransaction != null) {
                    Table.nativeSetString(nativePtr, setoranColumnInfo.FlagRepresentativeTransactionColKey, nativeFindFirstInt, realmGet$FlagRepresentativeTransaction, false);
                }
                String realmGet$RepresentativeIdType = com_bca_smartbranch_data_localdb_setoranrealmproxyinterface2.realmGet$RepresentativeIdType();
                if (realmGet$RepresentativeIdType != null) {
                    Table.nativeSetString(nativePtr, setoranColumnInfo.RepresentativeIdTypeColKey, nativeFindFirstInt, realmGet$RepresentativeIdType, false);
                }
                String realmGet$RepresentativeIdNumber = com_bca_smartbranch_data_localdb_setoranrealmproxyinterface2.realmGet$RepresentativeIdNumber();
                if (realmGet$RepresentativeIdNumber != null) {
                    Table.nativeSetString(nativePtr, setoranColumnInfo.RepresentativeIdNumberColKey, nativeFindFirstInt, realmGet$RepresentativeIdNumber, false);
                }
                String realmGet$RepresentativeName = com_bca_smartbranch_data_localdb_setoranrealmproxyinterface2.realmGet$RepresentativeName();
                if (realmGet$RepresentativeName != null) {
                    Table.nativeSetString(nativePtr, setoranColumnInfo.RepresentativeNameColKey, nativeFindFirstInt, realmGet$RepresentativeName, false);
                }
                String realmGet$RepresentativeRelationship = com_bca_smartbranch_data_localdb_setoranrealmproxyinterface2.realmGet$RepresentativeRelationship();
                if (realmGet$RepresentativeRelationship != null) {
                    Table.nativeSetString(nativePtr, setoranColumnInfo.RepresentativeRelationshipColKey, nativeFindFirstInt, realmGet$RepresentativeRelationship, false);
                }
                String realmGet$FlagSaveToSourceAccountList = com_bca_smartbranch_data_localdb_setoranrealmproxyinterface2.realmGet$FlagSaveToSourceAccountList();
                if (realmGet$FlagSaveToSourceAccountList != null) {
                    Table.nativeSetString(nativePtr, setoranColumnInfo.FlagSaveToSourceAccountListColKey, nativeFindFirstInt, realmGet$FlagSaveToSourceAccountList, false);
                }
                String realmGet$currency = com_bca_smartbranch_data_localdb_setoranrealmproxyinterface2.realmGet$currency();
                if (realmGet$currency != null) {
                    Table.nativeSetString(nativePtr, setoranColumnInfo.currencyColKey, nativeFindFirstInt, realmGet$currency, false);
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
    public static long insertOrUpdate(io.realm.Realm r10, com.bca.smartbranch.data.localdb.Setoran r11, java.util.Map<io.realm.RealmModel, java.lang.Long> r12) {
        /*
        // Method dump skipped, instructions count: 1473
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.com_bca_smartbranch_data_localdb_SetoranRealmProxy.insertOrUpdate(io.realm.Realm, com.bca.smartbranch.data.localdb.Setoran, java.util.Map):long");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r23v0 */
    /* JADX WARN: Type inference failed for: r23v1, types: [long] */
    /* JADX WARN: Type inference failed for: r23v4 */
    /* JADX WARN: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static void insertOrUpdate(io.realm.Realm r10, java.util.Iterator<? extends io.realm.RealmModel> r11, java.util.Map<io.realm.RealmModel, java.lang.Long> r12) {
        /*
        // Method dump skipped, instructions count: 1727
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.com_bca_smartbranch_data_localdb_SetoranRealmProxy.insertOrUpdate(io.realm.Realm, java.util.Iterator, java.util.Map):void");
    }

    static com_bca_smartbranch_data_localdb_SetoranRealmProxy newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo(Setoran.class), false, Collections.emptyList());
        com_bca_smartbranch_data_localdb_SetoranRealmProxy com_bca_smartbranch_data_localdb_setoranrealmproxy = new com_bca_smartbranch_data_localdb_SetoranRealmProxy();
        realmObjectContext.clear();
        return com_bca_smartbranch_data_localdb_setoranrealmproxy;
    }

    static Setoran update(Realm realm, SetoranColumnInfo setoranColumnInfo, Setoran setoran, Setoran setoran2, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        com_bca_smartbranch_data_localdb_SetoranRealmProxyInterface com_bca_smartbranch_data_localdb_setoranrealmproxyinterface = (com_bca_smartbranch_data_localdb_SetoranRealmProxyInterface) setoran2;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(Setoran.class), set);
        osObjectBuilder.addInteger(setoranColumnInfo.idColKey, Long.valueOf(com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmGet$id()));
        osObjectBuilder.addString(setoranColumnInfo.currentPageColKey, com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmGet$currentPage());
        osObjectBuilder.addInteger(setoranColumnInfo.createdAtColKey, Long.valueOf(com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmGet$createdAt()));
        osObjectBuilder.addInteger(setoranColumnInfo.updatedAtColKey, Long.valueOf(com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmGet$updatedAt()));
        osObjectBuilder.addString(setoranColumnInfo.flagGuestColKey, com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmGet$flagGuest());
        osObjectBuilder.addString(setoranColumnInfo.oldCustFlagColKey, com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmGet$oldCustFlag());
        osObjectBuilder.addString(setoranColumnInfo.isLongFormColKey, com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmGet$isLongForm());
        osObjectBuilder.addString(setoranColumnInfo.FlagDaftarTransferColKey, com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmGet$FlagDaftarTransfer());
        osObjectBuilder.addString(setoranColumnInfo.FlagTxnBerkalaColKey, com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmGet$FlagTxnBerkala());
        osObjectBuilder.addString(setoranColumnInfo.SenderNameColKey, com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmGet$SenderName());
        osObjectBuilder.addString(setoranColumnInfo.SenderIdTypeColKey, com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmGet$SenderIdType());
        osObjectBuilder.addString(setoranColumnInfo.SenderIdNumberColKey, com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmGet$SenderIdNumber());
        osObjectBuilder.addString(setoranColumnInfo.SenderAddressColKey, com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmGet$SenderAddress());
        osObjectBuilder.addString(setoranColumnInfo.SenderPhoneColKey, com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmGet$SenderPhone());
        osObjectBuilder.addString(setoranColumnInfo.SenderEmailColKey, com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmGet$SenderEmail());
        osObjectBuilder.addString(setoranColumnInfo.ReceiverNameColKey, com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmGet$ReceiverName());
        osObjectBuilder.addString(setoranColumnInfo.ReceiverAccountColKey, com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmGet$ReceiverAccount());
        osObjectBuilder.addString(setoranColumnInfo.ReceiverAliasColKey, com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmGet$ReceiverAlias());
        osObjectBuilder.addString(setoranColumnInfo.TxnAmountColKey, com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmGet$TxnAmount());
        osObjectBuilder.addString(setoranColumnInfo.TxnSourceColKey, com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmGet$TxnSource());
        osObjectBuilder.addString(setoranColumnInfo.TxnPurposeColKey, com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmGet$TxnPurpose());
        osObjectBuilder.addString(setoranColumnInfo.TxnNotesColKey, com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmGet$TxnNotes());
        osObjectBuilder.addString(setoranColumnInfo.RecurringVarColKey, com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmGet$RecurringVar());
        osObjectBuilder.addString(setoranColumnInfo.RecurringValueColKey, com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmGet$RecurringValue());
        osObjectBuilder.addString(setoranColumnInfo.RecurringEndDateColKey, com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmGet$RecurringEndDate());
        osObjectBuilder.addString(setoranColumnInfo.TypeColKey, com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmGet$Type());
        osObjectBuilder.addString(setoranColumnInfo.FlagSameReceiverSenderDataColKey, com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmGet$FlagSameReceiverSenderData());
        osObjectBuilder.addString(setoranColumnInfo.SourceAccountOwnerTypeColKey, com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmGet$SourceAccountOwnerType());
        osObjectBuilder.addString(setoranColumnInfo.FlagRepresentativeTransactionColKey, com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmGet$FlagRepresentativeTransaction());
        osObjectBuilder.addString(setoranColumnInfo.RepresentativeIdTypeColKey, com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmGet$RepresentativeIdType());
        osObjectBuilder.addString(setoranColumnInfo.RepresentativeIdNumberColKey, com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmGet$RepresentativeIdNumber());
        osObjectBuilder.addString(setoranColumnInfo.RepresentativeNameColKey, com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmGet$RepresentativeName());
        osObjectBuilder.addString(setoranColumnInfo.RepresentativeRelationshipColKey, com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmGet$RepresentativeRelationship());
        osObjectBuilder.addString(setoranColumnInfo.FlagSaveToSourceAccountListColKey, com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmGet$FlagSaveToSourceAccountList());
        osObjectBuilder.addString(setoranColumnInfo.currencyColKey, com_bca_smartbranch_data_localdb_setoranrealmproxyinterface.realmGet$currency());
        osObjectBuilder.updateExistingTopLevelObject();
        return setoran;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com_bca_smartbranch_data_localdb_SetoranRealmProxy com_bca_smartbranch_data_localdb_setoranrealmproxy = (com_bca_smartbranch_data_localdb_SetoranRealmProxy) obj;
        BaseRealm realm$realm = this.proxyState.getRealm$realm();
        BaseRealm realm$realm2 = com_bca_smartbranch_data_localdb_setoranrealmproxy.proxyState.getRealm$realm();
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
        String name2 = com_bca_smartbranch_data_localdb_setoranrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name != null) {
            if (!name.equals(name2)) {
                return false;
            }
        } else if (name2 != null) {
            return false;
        }
        return this.proxyState.getRow$realm().getObjectKey() == com_bca_smartbranch_data_localdb_setoranrealmproxy.proxyState.getRow$realm().getObjectKey();
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
            this.columnInfo = (SetoranColumnInfo) realmObjectContext.getColumnInfo();
            ProxyState<Setoran> proxyState = new ProxyState<>(this);
            this.proxyState = proxyState;
            proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Setoran
    public String realmGet$FlagDaftarTransfer() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.FlagDaftarTransferColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Setoran
    public String realmGet$FlagRepresentativeTransaction() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.FlagRepresentativeTransactionColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Setoran
    public String realmGet$FlagSameReceiverSenderData() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.FlagSameReceiverSenderDataColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Setoran
    public String realmGet$FlagSaveToSourceAccountList() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.FlagSaveToSourceAccountListColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Setoran
    public String realmGet$FlagTxnBerkala() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.FlagTxnBerkalaColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Setoran
    public String realmGet$ReceiverAccount() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.ReceiverAccountColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Setoran
    public String realmGet$ReceiverAlias() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.ReceiverAliasColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Setoran
    public String realmGet$ReceiverName() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.ReceiverNameColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Setoran
    public String realmGet$RecurringEndDate() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.RecurringEndDateColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Setoran
    public String realmGet$RecurringValue() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.RecurringValueColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Setoran
    public String realmGet$RecurringVar() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.RecurringVarColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Setoran
    public String realmGet$RepresentativeIdNumber() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.RepresentativeIdNumberColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Setoran
    public String realmGet$RepresentativeIdType() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.RepresentativeIdTypeColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Setoran
    public String realmGet$RepresentativeName() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.RepresentativeNameColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Setoran
    public String realmGet$RepresentativeRelationship() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.RepresentativeRelationshipColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Setoran
    public String realmGet$SenderAddress() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.SenderAddressColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Setoran
    public String realmGet$SenderEmail() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.SenderEmailColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Setoran
    public String realmGet$SenderIdNumber() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.SenderIdNumberColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Setoran
    public String realmGet$SenderIdType() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.SenderIdTypeColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Setoran
    public String realmGet$SenderName() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.SenderNameColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Setoran
    public String realmGet$SenderPhone() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.SenderPhoneColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Setoran
    public String realmGet$SourceAccountOwnerType() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.SourceAccountOwnerTypeColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Setoran
    public String realmGet$TxnAmount() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.TxnAmountColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Setoran
    public String realmGet$TxnNotes() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.TxnNotesColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Setoran
    public String realmGet$TxnPurpose() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.TxnPurposeColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Setoran
    public String realmGet$TxnSource() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.TxnSourceColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Setoran
    public String realmGet$Type() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.TypeColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Setoran
    public long realmGet$createdAt() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getLong(this.columnInfo.createdAtColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Setoran
    public String realmGet$currency() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.currencyColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Setoran
    public String realmGet$currentPage() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.currentPageColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Setoran
    public String realmGet$flagGuest() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.flagGuestColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Setoran
    public long realmGet$id() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getLong(this.columnInfo.idColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Setoran
    public String realmGet$isLongForm() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.isLongFormColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Setoran
    public String realmGet$oldCustFlag() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.oldCustFlagColKey);
    }

    @Override // io.realm.internal.RealmObjectProxy
    public ProxyState<?> realmGet$proxyState() {
        return this.proxyState;
    }

    @Override // com.bca.smartbranch.data.localdb.Setoran
    public long realmGet$updatedAt() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getLong(this.columnInfo.updatedAtColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.Setoran
    public void realmSet$FlagDaftarTransfer(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.FlagDaftarTransferColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.FlagDaftarTransferColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.FlagDaftarTransferColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.FlagDaftarTransferColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Setoran
    public void realmSet$FlagRepresentativeTransaction(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.FlagRepresentativeTransactionColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.FlagRepresentativeTransactionColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.FlagRepresentativeTransactionColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.FlagRepresentativeTransactionColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Setoran
    public void realmSet$FlagSameReceiverSenderData(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.FlagSameReceiverSenderDataColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.FlagSameReceiverSenderDataColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.FlagSameReceiverSenderDataColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.FlagSameReceiverSenderDataColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Setoran
    public void realmSet$FlagSaveToSourceAccountList(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.FlagSaveToSourceAccountListColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.FlagSaveToSourceAccountListColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.FlagSaveToSourceAccountListColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.FlagSaveToSourceAccountListColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Setoran
    public void realmSet$FlagTxnBerkala(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.FlagTxnBerkalaColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.FlagTxnBerkalaColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.FlagTxnBerkalaColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.FlagTxnBerkalaColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Setoran
    public void realmSet$ReceiverAccount(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.ReceiverAccountColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.ReceiverAccountColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.ReceiverAccountColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.ReceiverAccountColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Setoran
    public void realmSet$ReceiverAlias(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.ReceiverAliasColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.ReceiverAliasColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.ReceiverAliasColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.ReceiverAliasColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Setoran
    public void realmSet$ReceiverName(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.ReceiverNameColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.ReceiverNameColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.ReceiverNameColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.ReceiverNameColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Setoran
    public void realmSet$RecurringEndDate(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.RecurringEndDateColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.RecurringEndDateColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.RecurringEndDateColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.RecurringEndDateColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Setoran
    public void realmSet$RecurringValue(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.RecurringValueColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.RecurringValueColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.RecurringValueColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.RecurringValueColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Setoran
    public void realmSet$RecurringVar(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.RecurringVarColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.RecurringVarColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.RecurringVarColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.RecurringVarColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Setoran
    public void realmSet$RepresentativeIdNumber(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.RepresentativeIdNumberColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.RepresentativeIdNumberColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.RepresentativeIdNumberColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.RepresentativeIdNumberColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Setoran
    public void realmSet$RepresentativeIdType(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.RepresentativeIdTypeColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.RepresentativeIdTypeColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.RepresentativeIdTypeColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.RepresentativeIdTypeColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Setoran
    public void realmSet$RepresentativeName(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.RepresentativeNameColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.RepresentativeNameColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.RepresentativeNameColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.RepresentativeNameColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Setoran
    public void realmSet$RepresentativeRelationship(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.RepresentativeRelationshipColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.RepresentativeRelationshipColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.RepresentativeRelationshipColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.RepresentativeRelationshipColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Setoran
    public void realmSet$SenderAddress(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.SenderAddressColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.SenderAddressColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.SenderAddressColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.SenderAddressColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Setoran
    public void realmSet$SenderEmail(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.SenderEmailColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.SenderEmailColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.SenderEmailColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.SenderEmailColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Setoran
    public void realmSet$SenderIdNumber(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.SenderIdNumberColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.SenderIdNumberColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.SenderIdNumberColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.SenderIdNumberColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Setoran
    public void realmSet$SenderIdType(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.SenderIdTypeColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.SenderIdTypeColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.SenderIdTypeColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.SenderIdTypeColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Setoran
    public void realmSet$SenderName(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.SenderNameColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.SenderNameColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.SenderNameColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.SenderNameColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Setoran
    public void realmSet$SenderPhone(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.SenderPhoneColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.SenderPhoneColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.SenderPhoneColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.SenderPhoneColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Setoran
    public void realmSet$SourceAccountOwnerType(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.SourceAccountOwnerTypeColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.SourceAccountOwnerTypeColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.SourceAccountOwnerTypeColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.SourceAccountOwnerTypeColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Setoran
    public void realmSet$TxnAmount(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.TxnAmountColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.TxnAmountColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.TxnAmountColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.TxnAmountColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Setoran
    public void realmSet$TxnNotes(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.TxnNotesColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.TxnNotesColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.TxnNotesColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.TxnNotesColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Setoran
    public void realmSet$TxnPurpose(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.TxnPurposeColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.TxnPurposeColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.TxnPurposeColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.TxnPurposeColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Setoran
    public void realmSet$TxnSource(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.TxnSourceColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.TxnSourceColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.TxnSourceColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.TxnSourceColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Setoran
    public void realmSet$Type(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.TypeColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.TypeColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.TypeColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.TypeColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Setoran
    public void realmSet$createdAt(long j) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            this.proxyState.getRow$realm().setLong(this.columnInfo.createdAtColKey, j);
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            row$realm.getTable().setLong(this.columnInfo.createdAtColKey, row$realm.getObjectKey(), j, true);
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Setoran
    public void realmSet$currency(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.currencyColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.currencyColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.currencyColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.currencyColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Setoran
    public void realmSet$currentPage(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.currentPageColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.currentPageColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.currentPageColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.currentPageColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Setoran
    public void realmSet$flagGuest(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.flagGuestColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.flagGuestColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.flagGuestColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.flagGuestColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Setoran
    public void realmSet$id(long j) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            throw new RealmException("Primary key field 'id' cannot be changed after object was created.");
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Setoran
    public void realmSet$isLongForm(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.isLongFormColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.isLongFormColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.isLongFormColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.isLongFormColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Setoran
    public void realmSet$oldCustFlag(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.oldCustFlagColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.oldCustFlagColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.oldCustFlagColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.oldCustFlagColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.Setoran
    public void realmSet$updatedAt(long j) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            this.proxyState.getRow$realm().setLong(this.columnInfo.updatedAtColKey, j);
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            row$realm.getTable().setLong(this.columnInfo.updatedAtColKey, row$realm.getObjectKey(), j, true);
        }
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("Setoran = proxy[{id:");
        sb.append(realmGet$id());
        sb.append("},{currentPage:");
        String str = "null";
        sb.append(realmGet$currentPage() != null ? realmGet$currentPage() : "null");
        sb.append("},{createdAt:");
        sb.append(realmGet$createdAt());
        sb.append("},{updatedAt:");
        sb.append(realmGet$updatedAt());
        sb.append("},{flagGuest:");
        sb.append(realmGet$flagGuest() != null ? realmGet$flagGuest() : "null");
        sb.append("},{oldCustFlag:");
        sb.append(realmGet$oldCustFlag() != null ? realmGet$oldCustFlag() : "null");
        sb.append("},{isLongForm:");
        sb.append(realmGet$isLongForm() != null ? realmGet$isLongForm() : "null");
        sb.append("},{FlagDaftarTransfer:");
        sb.append(realmGet$FlagDaftarTransfer() != null ? realmGet$FlagDaftarTransfer() : "null");
        sb.append("},{FlagTxnBerkala:");
        sb.append(realmGet$FlagTxnBerkala() != null ? realmGet$FlagTxnBerkala() : "null");
        sb.append("},{SenderName:");
        sb.append(realmGet$SenderName() != null ? realmGet$SenderName() : "null");
        sb.append("},{SenderIdType:");
        sb.append(realmGet$SenderIdType() != null ? realmGet$SenderIdType() : "null");
        sb.append("},{SenderIdNumber:");
        sb.append(realmGet$SenderIdNumber() != null ? realmGet$SenderIdNumber() : "null");
        sb.append("},{SenderAddress:");
        sb.append(realmGet$SenderAddress() != null ? realmGet$SenderAddress() : "null");
        sb.append("},{SenderPhone:");
        sb.append(realmGet$SenderPhone() != null ? realmGet$SenderPhone() : "null");
        sb.append("},{SenderEmail:");
        sb.append(realmGet$SenderEmail() != null ? realmGet$SenderEmail() : "null");
        sb.append("},{ReceiverName:");
        sb.append(realmGet$ReceiverName() != null ? realmGet$ReceiverName() : "null");
        sb.append("},{ReceiverAccount:");
        sb.append(realmGet$ReceiverAccount() != null ? realmGet$ReceiverAccount() : "null");
        sb.append("},{ReceiverAlias:");
        sb.append(realmGet$ReceiverAlias() != null ? realmGet$ReceiverAlias() : "null");
        sb.append("},{TxnAmount:");
        sb.append(realmGet$TxnAmount() != null ? realmGet$TxnAmount() : "null");
        sb.append("},{TxnSource:");
        sb.append(realmGet$TxnSource() != null ? realmGet$TxnSource() : "null");
        sb.append("},{TxnPurpose:");
        sb.append(realmGet$TxnPurpose() != null ? realmGet$TxnPurpose() : "null");
        sb.append("},{TxnNotes:");
        sb.append(realmGet$TxnNotes() != null ? realmGet$TxnNotes() : "null");
        sb.append("},{RecurringVar:");
        sb.append(realmGet$RecurringVar() != null ? realmGet$RecurringVar() : "null");
        sb.append("},{RecurringValue:");
        sb.append(realmGet$RecurringValue() != null ? realmGet$RecurringValue() : "null");
        sb.append("},{RecurringEndDate:");
        sb.append(realmGet$RecurringEndDate() != null ? realmGet$RecurringEndDate() : "null");
        sb.append("},{Type:");
        sb.append(realmGet$Type() != null ? realmGet$Type() : "null");
        sb.append("},{FlagSameReceiverSenderData:");
        sb.append(realmGet$FlagSameReceiverSenderData() != null ? realmGet$FlagSameReceiverSenderData() : "null");
        sb.append("},{SourceAccountOwnerType:");
        sb.append(realmGet$SourceAccountOwnerType() != null ? realmGet$SourceAccountOwnerType() : "null");
        sb.append("},{FlagRepresentativeTransaction:");
        sb.append(realmGet$FlagRepresentativeTransaction() != null ? realmGet$FlagRepresentativeTransaction() : "null");
        sb.append("},{RepresentativeIdType:");
        sb.append(realmGet$RepresentativeIdType() != null ? realmGet$RepresentativeIdType() : "null");
        sb.append("},{RepresentativeIdNumber:");
        sb.append(realmGet$RepresentativeIdNumber() != null ? realmGet$RepresentativeIdNumber() : "null");
        sb.append("},{RepresentativeName:");
        sb.append(realmGet$RepresentativeName() != null ? realmGet$RepresentativeName() : "null");
        sb.append("},{RepresentativeRelationship:");
        sb.append(realmGet$RepresentativeRelationship() != null ? realmGet$RepresentativeRelationship() : "null");
        sb.append("},{FlagSaveToSourceAccountList:");
        sb.append(realmGet$FlagSaveToSourceAccountList() != null ? realmGet$FlagSaveToSourceAccountList() : "null");
        sb.append("},{currency:");
        if (realmGet$currency() != null) {
            str = realmGet$currency();
        }
        sb.append(str);
        sb.append("}]");
        return sb.toString();
    }
}
