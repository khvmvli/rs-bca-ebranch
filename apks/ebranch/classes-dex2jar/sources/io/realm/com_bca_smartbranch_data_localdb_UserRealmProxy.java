package io.realm;

import android.util.JsonReader;
import android.util.JsonToken;
import com.bca.smartbranch.data.localdb.Account;
import com.bca.smartbranch.data.localdb.BankTransfer;
import com.bca.smartbranch.data.localdb.CreditCard;
import com.bca.smartbranch.data.localdb.EChannel;
import com.bca.smartbranch.data.localdb.KirimanUang;
import com.bca.smartbranch.data.localdb.Kliring;
import com.bca.smartbranch.data.localdb.Setoran;
import com.bca.smartbranch.data.localdb.Tarikan;
import com.bca.smartbranch.data.localdb.User;
import io.realm.BaseRealm;
import io.realm.com_bca_smartbranch_data_localdb_AccountRealmProxy;
import io.realm.com_bca_smartbranch_data_localdb_BankTransferRealmProxy;
import io.realm.com_bca_smartbranch_data_localdb_CreditCardRealmProxy;
import io.realm.com_bca_smartbranch_data_localdb_EChannelRealmProxy;
import io.realm.com_bca_smartbranch_data_localdb_KirimanUangRealmProxy;
import io.realm.com_bca_smartbranch_data_localdb_KliringRealmProxy;
import io.realm.com_bca_smartbranch_data_localdb_SetoranRealmProxy;
import io.realm.com_bca_smartbranch_data_localdb_TarikanRealmProxy;
import io.realm.exceptions.RealmException;
import io.realm.internal.ColumnInfo;
import io.realm.internal.OsList;
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
/* loaded from: classes-dex2jar.jar:io/realm/com_bca_smartbranch_data_localdb_UserRealmProxy.class */
public class com_bca_smartbranch_data_localdb_UserRealmProxy extends User implements RealmObjectProxy, com_bca_smartbranch_data_localdb_UserRealmProxyInterface {
    private static final String NO_ALIAS = "";
    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();
    private RealmList<Account> accountsRealmList;
    private RealmList<BankTransfer> bankTransfersRealmList;
    private UserColumnInfo columnInfo;
    private RealmList<CreditCard> creditCardsRealmList;
    private RealmList<EChannel> eChannelsRealmList;
    private RealmList<KirimanUang> kirimanUangsRealmList;
    private RealmList<Kliring> kliringsRealmList;
    private ProxyState<User> proxyState;
    private RealmList<Setoran> setoransRealmList;
    private RealmList<Tarikan> tarikansRealmList;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:io/realm/com_bca_smartbranch_data_localdb_UserRealmProxy$UserColumnInfo.class */
    public static final class UserColumnInfo extends ColumnInfo {
        long accountsColKey;
        long acctNoColKey;
        long bankTransfersColKey;
        long creditCardsColKey;
        long eChannelsColKey;
        long emailColKey;
        long idNumColKey;
        long idTypeColKey;
        long imeiColKey;
        long isFlagContactKUColKey;
        long isMemberColKey;
        long kirimanUangsColKey;
        long kliringsColKey;
        long membershipColKey;
        long nameColKey;
        long noHandphoneColKey;
        long sessionIdColKey;
        long setoransColKey;
        long tarikansColKey;
        long userPhotoColKey;
        long verifiedColKey;

        UserColumnInfo(ColumnInfo columnInfo, boolean z) {
            super(columnInfo, z);
            copy(columnInfo, this);
        }

        UserColumnInfo(OsSchemaInfo osSchemaInfo) {
            super(21);
            OsObjectSchemaInfo objectSchemaInfo = osSchemaInfo.getObjectSchemaInfo("User");
            this.emailColKey = addColumnDetails("email", "email", objectSchemaInfo);
            this.nameColKey = addColumnDetails("name", "name", objectSchemaInfo);
            this.noHandphoneColKey = addColumnDetails("noHandphone", "noHandphone", objectSchemaInfo);
            this.acctNoColKey = addColumnDetails("acctNo", "acctNo", objectSchemaInfo);
            this.sessionIdColKey = addColumnDetails("sessionId", "sessionId", objectSchemaInfo);
            this.isMemberColKey = addColumnDetails("isMember", "isMember", objectSchemaInfo);
            this.verifiedColKey = addColumnDetails("verified", "verified", objectSchemaInfo);
            this.idTypeColKey = addColumnDetails("idType", "idType", objectSchemaInfo);
            this.idNumColKey = addColumnDetails("idNum", "idNum", objectSchemaInfo);
            this.userPhotoColKey = addColumnDetails("userPhoto", "userPhoto", objectSchemaInfo);
            this.imeiColKey = addColumnDetails("imei", "imei", objectSchemaInfo);
            this.membershipColKey = addColumnDetails("membership", "membership", objectSchemaInfo);
            this.isFlagContactKUColKey = addColumnDetails("isFlagContactKU", "isFlagContactKU", objectSchemaInfo);
            this.accountsColKey = addColumnDetails("accounts", "accounts", objectSchemaInfo);
            this.setoransColKey = addColumnDetails("setorans", "setorans", objectSchemaInfo);
            this.tarikansColKey = addColumnDetails("tarikans", "tarikans", objectSchemaInfo);
            this.kirimanUangsColKey = addColumnDetails("kirimanUangs", "kirimanUangs", objectSchemaInfo);
            this.kliringsColKey = addColumnDetails("klirings", "klirings", objectSchemaInfo);
            this.creditCardsColKey = addColumnDetails("creditCards", "creditCards", objectSchemaInfo);
            this.eChannelsColKey = addColumnDetails("eChannels", "eChannels", objectSchemaInfo);
            this.bankTransfersColKey = addColumnDetails("bankTransfers", "bankTransfers", objectSchemaInfo);
        }

        @Override // io.realm.internal.ColumnInfo
        public final ColumnInfo copy(boolean z) {
            return new UserColumnInfo(this, z);
        }

        @Override // io.realm.internal.ColumnInfo
        public final void copy(ColumnInfo columnInfo, ColumnInfo columnInfo2) {
            UserColumnInfo userColumnInfo = (UserColumnInfo) columnInfo;
            UserColumnInfo userColumnInfo2 = (UserColumnInfo) columnInfo2;
            userColumnInfo2.emailColKey = userColumnInfo.emailColKey;
            userColumnInfo2.nameColKey = userColumnInfo.nameColKey;
            userColumnInfo2.noHandphoneColKey = userColumnInfo.noHandphoneColKey;
            userColumnInfo2.acctNoColKey = userColumnInfo.acctNoColKey;
            userColumnInfo2.sessionIdColKey = userColumnInfo.sessionIdColKey;
            userColumnInfo2.isMemberColKey = userColumnInfo.isMemberColKey;
            userColumnInfo2.verifiedColKey = userColumnInfo.verifiedColKey;
            userColumnInfo2.idTypeColKey = userColumnInfo.idTypeColKey;
            userColumnInfo2.idNumColKey = userColumnInfo.idNumColKey;
            userColumnInfo2.userPhotoColKey = userColumnInfo.userPhotoColKey;
            userColumnInfo2.imeiColKey = userColumnInfo.imeiColKey;
            userColumnInfo2.membershipColKey = userColumnInfo.membershipColKey;
            userColumnInfo2.isFlagContactKUColKey = userColumnInfo.isFlagContactKUColKey;
            userColumnInfo2.accountsColKey = userColumnInfo.accountsColKey;
            userColumnInfo2.setoransColKey = userColumnInfo.setoransColKey;
            userColumnInfo2.tarikansColKey = userColumnInfo.tarikansColKey;
            userColumnInfo2.kirimanUangsColKey = userColumnInfo.kirimanUangsColKey;
            userColumnInfo2.kliringsColKey = userColumnInfo.kliringsColKey;
            userColumnInfo2.creditCardsColKey = userColumnInfo.creditCardsColKey;
            userColumnInfo2.eChannelsColKey = userColumnInfo.eChannelsColKey;
            userColumnInfo2.bankTransfersColKey = userColumnInfo.bankTransfersColKey;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com_bca_smartbranch_data_localdb_UserRealmProxy() {
        this.proxyState.setConstructionFinished();
    }

    public static User copy(Realm realm, UserColumnInfo userColumnInfo, User user, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        RealmObjectProxy realmObjectProxy = map.get(user);
        if (realmObjectProxy != null) {
            return (User) realmObjectProxy;
        }
        com_bca_smartbranch_data_localdb_UserRealmProxyInterface com_bca_smartbranch_data_localdb_userrealmproxyinterface = (com_bca_smartbranch_data_localdb_UserRealmProxyInterface) user;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(User.class), set);
        osObjectBuilder.addString(userColumnInfo.emailColKey, com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmGet$email());
        osObjectBuilder.addString(userColumnInfo.nameColKey, com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmGet$name());
        osObjectBuilder.addString(userColumnInfo.noHandphoneColKey, com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmGet$noHandphone());
        osObjectBuilder.addString(userColumnInfo.acctNoColKey, com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmGet$acctNo());
        osObjectBuilder.addString(userColumnInfo.sessionIdColKey, com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmGet$sessionId());
        osObjectBuilder.addBoolean(userColumnInfo.isMemberColKey, Boolean.valueOf(com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmGet$isMember()));
        osObjectBuilder.addString(userColumnInfo.verifiedColKey, com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmGet$verified());
        osObjectBuilder.addString(userColumnInfo.idTypeColKey, com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmGet$idType());
        osObjectBuilder.addString(userColumnInfo.idNumColKey, com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmGet$idNum());
        osObjectBuilder.addString(userColumnInfo.userPhotoColKey, com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmGet$userPhoto());
        osObjectBuilder.addString(userColumnInfo.imeiColKey, com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmGet$imei());
        osObjectBuilder.addString(userColumnInfo.membershipColKey, com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmGet$membership());
        osObjectBuilder.addBoolean(userColumnInfo.isFlagContactKUColKey, Boolean.valueOf(com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmGet$isFlagContactKU()));
        com_bca_smartbranch_data_localdb_UserRealmProxy newProxyInstance = newProxyInstance(realm, osObjectBuilder.createNewObject());
        map.put(user, newProxyInstance);
        RealmList realmGet$accounts = com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmGet$accounts();
        if (realmGet$accounts != null) {
            RealmList realmGet$accounts2 = newProxyInstance.realmGet$accounts();
            realmGet$accounts2.clear();
            for (int i = 0; i < realmGet$accounts.size(); i++) {
                Account account = (Account) realmGet$accounts.get(i);
                Account account2 = (Account) map.get(account);
                if (account2 != null) {
                    realmGet$accounts2.add(account2);
                } else {
                    realmGet$accounts2.add(com_bca_smartbranch_data_localdb_AccountRealmProxy.copyOrUpdate(realm, (com_bca_smartbranch_data_localdb_AccountRealmProxy.AccountColumnInfo) realm.getSchema().getColumnInfo(Account.class), account, z, map, set));
                }
            }
        }
        RealmList realmGet$setorans = com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmGet$setorans();
        if (realmGet$setorans != null) {
            RealmList realmGet$setorans2 = newProxyInstance.realmGet$setorans();
            realmGet$setorans2.clear();
            for (int i2 = 0; i2 < realmGet$setorans.size(); i2++) {
                Setoran setoran = (Setoran) realmGet$setorans.get(i2);
                Setoran setoran2 = (Setoran) map.get(setoran);
                if (setoran2 != null) {
                    realmGet$setorans2.add(setoran2);
                } else {
                    realmGet$setorans2.add(com_bca_smartbranch_data_localdb_SetoranRealmProxy.copyOrUpdate(realm, (com_bca_smartbranch_data_localdb_SetoranRealmProxy.SetoranColumnInfo) realm.getSchema().getColumnInfo(Setoran.class), setoran, z, map, set));
                }
            }
        }
        RealmList realmGet$tarikans = com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmGet$tarikans();
        if (realmGet$tarikans != null) {
            RealmList realmGet$tarikans2 = newProxyInstance.realmGet$tarikans();
            realmGet$tarikans2.clear();
            for (int i3 = 0; i3 < realmGet$tarikans.size(); i3++) {
                Tarikan tarikan = (Tarikan) realmGet$tarikans.get(i3);
                Tarikan tarikan2 = (Tarikan) map.get(tarikan);
                if (tarikan2 != null) {
                    realmGet$tarikans2.add(tarikan2);
                } else {
                    realmGet$tarikans2.add(com_bca_smartbranch_data_localdb_TarikanRealmProxy.copyOrUpdate(realm, (com_bca_smartbranch_data_localdb_TarikanRealmProxy.TarikanColumnInfo) realm.getSchema().getColumnInfo(Tarikan.class), tarikan, z, map, set));
                }
            }
        }
        RealmList realmGet$kirimanUangs = com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmGet$kirimanUangs();
        if (realmGet$kirimanUangs != null) {
            RealmList realmGet$kirimanUangs2 = newProxyInstance.realmGet$kirimanUangs();
            realmGet$kirimanUangs2.clear();
            for (int i4 = 0; i4 < realmGet$kirimanUangs.size(); i4++) {
                KirimanUang kirimanUang = (KirimanUang) realmGet$kirimanUangs.get(i4);
                KirimanUang kirimanUang2 = (KirimanUang) map.get(kirimanUang);
                if (kirimanUang2 != null) {
                    realmGet$kirimanUangs2.add(kirimanUang2);
                } else {
                    realmGet$kirimanUangs2.add(com_bca_smartbranch_data_localdb_KirimanUangRealmProxy.copyOrUpdate(realm, (com_bca_smartbranch_data_localdb_KirimanUangRealmProxy.KirimanUangColumnInfo) realm.getSchema().getColumnInfo(KirimanUang.class), kirimanUang, z, map, set));
                }
            }
        }
        RealmList realmGet$klirings = com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmGet$klirings();
        if (realmGet$klirings != null) {
            RealmList realmGet$klirings2 = newProxyInstance.realmGet$klirings();
            realmGet$klirings2.clear();
            for (int i5 = 0; i5 < realmGet$klirings.size(); i5++) {
                Kliring kliring = (Kliring) realmGet$klirings.get(i5);
                Kliring kliring2 = (Kliring) map.get(kliring);
                if (kliring2 != null) {
                    realmGet$klirings2.add(kliring2);
                } else {
                    realmGet$klirings2.add(com_bca_smartbranch_data_localdb_KliringRealmProxy.copyOrUpdate(realm, (com_bca_smartbranch_data_localdb_KliringRealmProxy.KliringColumnInfo) realm.getSchema().getColumnInfo(Kliring.class), kliring, z, map, set));
                }
            }
        }
        RealmList realmGet$creditCards = com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmGet$creditCards();
        if (realmGet$creditCards != null) {
            RealmList realmGet$creditCards2 = newProxyInstance.realmGet$creditCards();
            realmGet$creditCards2.clear();
            for (int i6 = 0; i6 < realmGet$creditCards.size(); i6++) {
                CreditCard creditCard = (CreditCard) realmGet$creditCards.get(i6);
                CreditCard creditCard2 = (CreditCard) map.get(creditCard);
                if (creditCard2 != null) {
                    realmGet$creditCards2.add(creditCard2);
                } else {
                    realmGet$creditCards2.add(com_bca_smartbranch_data_localdb_CreditCardRealmProxy.copyOrUpdate(realm, (com_bca_smartbranch_data_localdb_CreditCardRealmProxy.CreditCardColumnInfo) realm.getSchema().getColumnInfo(CreditCard.class), creditCard, z, map, set));
                }
            }
        }
        RealmList realmGet$eChannels = com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmGet$eChannels();
        if (realmGet$eChannels != null) {
            RealmList realmGet$eChannels2 = newProxyInstance.realmGet$eChannels();
            realmGet$eChannels2.clear();
            for (int i7 = 0; i7 < realmGet$eChannels.size(); i7++) {
                EChannel eChannel = (EChannel) realmGet$eChannels.get(i7);
                EChannel eChannel2 = (EChannel) map.get(eChannel);
                if (eChannel2 != null) {
                    realmGet$eChannels2.add(eChannel2);
                } else {
                    realmGet$eChannels2.add(com_bca_smartbranch_data_localdb_EChannelRealmProxy.copyOrUpdate(realm, (com_bca_smartbranch_data_localdb_EChannelRealmProxy.EChannelColumnInfo) realm.getSchema().getColumnInfo(EChannel.class), eChannel, z, map, set));
                }
            }
        }
        RealmList realmGet$bankTransfers = com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmGet$bankTransfers();
        if (realmGet$bankTransfers != null) {
            RealmList realmGet$bankTransfers2 = newProxyInstance.realmGet$bankTransfers();
            realmGet$bankTransfers2.clear();
            for (int i8 = 0; i8 < realmGet$bankTransfers.size(); i8++) {
                BankTransfer bankTransfer = (BankTransfer) realmGet$bankTransfers.get(i8);
                BankTransfer bankTransfer2 = (BankTransfer) map.get(bankTransfer);
                if (bankTransfer2 != null) {
                    realmGet$bankTransfers2.add(bankTransfer2);
                } else {
                    realmGet$bankTransfers2.add(com_bca_smartbranch_data_localdb_BankTransferRealmProxy.copyOrUpdate(realm, (com_bca_smartbranch_data_localdb_BankTransferRealmProxy.BankTransferColumnInfo) realm.getSchema().getColumnInfo(BankTransfer.class), bankTransfer, z, map, set));
                }
            }
        }
        return newProxyInstance;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x011d  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static com.bca.smartbranch.data.localdb.User copyOrUpdate(io.realm.Realm r7, io.realm.com_bca_smartbranch_data_localdb_UserRealmProxy.UserColumnInfo r8, com.bca.smartbranch.data.localdb.User r9, boolean r10, java.util.Map<io.realm.RealmModel, io.realm.internal.RealmObjectProxy> r11, java.util.Set<io.realm.ImportFlag> r12) {
        /*
        // Method dump skipped, instructions count: 299
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.com_bca_smartbranch_data_localdb_UserRealmProxy.copyOrUpdate(io.realm.Realm, io.realm.com_bca_smartbranch_data_localdb_UserRealmProxy$UserColumnInfo, com.bca.smartbranch.data.localdb.User, boolean, java.util.Map, java.util.Set):com.bca.smartbranch.data.localdb.User");
    }

    public static UserColumnInfo createColumnInfo(OsSchemaInfo osSchemaInfo) {
        return new UserColumnInfo(osSchemaInfo);
    }

    public static User createDetachedCopy(User user, int i, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        User user2;
        if (i > i2 || user == null) {
            return null;
        }
        RealmObjectProxy.CacheData<RealmModel> cacheData = map.get(user);
        if (cacheData == null) {
            user2 = new User();
            map.put(user, new RealmObjectProxy.CacheData<>(i, user2));
        } else if (i >= cacheData.minDepth) {
            return (User) cacheData.object;
        } else {
            user2 = (User) cacheData.object;
            cacheData.minDepth = i;
        }
        com_bca_smartbranch_data_localdb_UserRealmProxyInterface com_bca_smartbranch_data_localdb_userrealmproxyinterface = (com_bca_smartbranch_data_localdb_UserRealmProxyInterface) user2;
        com_bca_smartbranch_data_localdb_UserRealmProxyInterface com_bca_smartbranch_data_localdb_userrealmproxyinterface2 = (com_bca_smartbranch_data_localdb_UserRealmProxyInterface) user;
        ((RealmObjectProxy) user).realmGet$proxyState().getRealm$realm();
        com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmSet$email(com_bca_smartbranch_data_localdb_userrealmproxyinterface2.realmGet$email());
        com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmSet$name(com_bca_smartbranch_data_localdb_userrealmproxyinterface2.realmGet$name());
        com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmSet$noHandphone(com_bca_smartbranch_data_localdb_userrealmproxyinterface2.realmGet$noHandphone());
        com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmSet$acctNo(com_bca_smartbranch_data_localdb_userrealmproxyinterface2.realmGet$acctNo());
        com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmSet$sessionId(com_bca_smartbranch_data_localdb_userrealmproxyinterface2.realmGet$sessionId());
        com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmSet$isMember(com_bca_smartbranch_data_localdb_userrealmproxyinterface2.realmGet$isMember());
        com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmSet$verified(com_bca_smartbranch_data_localdb_userrealmproxyinterface2.realmGet$verified());
        com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmSet$idType(com_bca_smartbranch_data_localdb_userrealmproxyinterface2.realmGet$idType());
        com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmSet$idNum(com_bca_smartbranch_data_localdb_userrealmproxyinterface2.realmGet$idNum());
        com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmSet$userPhoto(com_bca_smartbranch_data_localdb_userrealmproxyinterface2.realmGet$userPhoto());
        com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmSet$imei(com_bca_smartbranch_data_localdb_userrealmproxyinterface2.realmGet$imei());
        com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmSet$membership(com_bca_smartbranch_data_localdb_userrealmproxyinterface2.realmGet$membership());
        com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmSet$isFlagContactKU(com_bca_smartbranch_data_localdb_userrealmproxyinterface2.realmGet$isFlagContactKU());
        if (i == i2) {
            com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmSet$accounts((RealmList) null);
        } else {
            RealmList realmGet$accounts = com_bca_smartbranch_data_localdb_userrealmproxyinterface2.realmGet$accounts();
            RealmList realmList = new RealmList();
            com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmSet$accounts(realmList);
            int size = realmGet$accounts.size();
            for (int i3 = 0; i3 < size; i3++) {
                realmList.add(com_bca_smartbranch_data_localdb_AccountRealmProxy.createDetachedCopy((Account) realmGet$accounts.get(i3), i + 1, i2, map));
            }
        }
        if (i == i2) {
            com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmSet$setorans((RealmList) null);
        } else {
            RealmList realmGet$setorans = com_bca_smartbranch_data_localdb_userrealmproxyinterface2.realmGet$setorans();
            RealmList realmList2 = new RealmList();
            com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmSet$setorans(realmList2);
            int size2 = realmGet$setorans.size();
            for (int i4 = 0; i4 < size2; i4++) {
                realmList2.add(com_bca_smartbranch_data_localdb_SetoranRealmProxy.createDetachedCopy((Setoran) realmGet$setorans.get(i4), i + 1, i2, map));
            }
        }
        if (i == i2) {
            com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmSet$tarikans((RealmList) null);
        } else {
            RealmList realmGet$tarikans = com_bca_smartbranch_data_localdb_userrealmproxyinterface2.realmGet$tarikans();
            RealmList realmList3 = new RealmList();
            com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmSet$tarikans(realmList3);
            int size3 = realmGet$tarikans.size();
            for (int i5 = 0; i5 < size3; i5++) {
                realmList3.add(com_bca_smartbranch_data_localdb_TarikanRealmProxy.createDetachedCopy((Tarikan) realmGet$tarikans.get(i5), i + 1, i2, map));
            }
        }
        if (i == i2) {
            com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmSet$kirimanUangs((RealmList) null);
        } else {
            RealmList realmGet$kirimanUangs = com_bca_smartbranch_data_localdb_userrealmproxyinterface2.realmGet$kirimanUangs();
            RealmList realmList4 = new RealmList();
            com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmSet$kirimanUangs(realmList4);
            int size4 = realmGet$kirimanUangs.size();
            for (int i6 = 0; i6 < size4; i6++) {
                realmList4.add(com_bca_smartbranch_data_localdb_KirimanUangRealmProxy.createDetachedCopy((KirimanUang) realmGet$kirimanUangs.get(i6), i + 1, i2, map));
            }
        }
        if (i == i2) {
            com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmSet$klirings((RealmList) null);
        } else {
            RealmList realmGet$klirings = com_bca_smartbranch_data_localdb_userrealmproxyinterface2.realmGet$klirings();
            RealmList realmList5 = new RealmList();
            com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmSet$klirings(realmList5);
            int size5 = realmGet$klirings.size();
            for (int i7 = 0; i7 < size5; i7++) {
                realmList5.add(com_bca_smartbranch_data_localdb_KliringRealmProxy.createDetachedCopy((Kliring) realmGet$klirings.get(i7), i + 1, i2, map));
            }
        }
        if (i == i2) {
            com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmSet$creditCards((RealmList) null);
        } else {
            RealmList realmGet$creditCards = com_bca_smartbranch_data_localdb_userrealmproxyinterface2.realmGet$creditCards();
            RealmList realmList6 = new RealmList();
            com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmSet$creditCards(realmList6);
            int size6 = realmGet$creditCards.size();
            for (int i8 = 0; i8 < size6; i8++) {
                realmList6.add(com_bca_smartbranch_data_localdb_CreditCardRealmProxy.createDetachedCopy((CreditCard) realmGet$creditCards.get(i8), i + 1, i2, map));
            }
        }
        if (i == i2) {
            com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmSet$eChannels((RealmList) null);
        } else {
            RealmList realmGet$eChannels = com_bca_smartbranch_data_localdb_userrealmproxyinterface2.realmGet$eChannels();
            RealmList realmList7 = new RealmList();
            com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmSet$eChannels(realmList7);
            int size7 = realmGet$eChannels.size();
            for (int i9 = 0; i9 < size7; i9++) {
                realmList7.add(com_bca_smartbranch_data_localdb_EChannelRealmProxy.createDetachedCopy((EChannel) realmGet$eChannels.get(i9), i + 1, i2, map));
            }
        }
        if (i == i2) {
            com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmSet$bankTransfers((RealmList) null);
        } else {
            RealmList realmGet$bankTransfers = com_bca_smartbranch_data_localdb_userrealmproxyinterface2.realmGet$bankTransfers();
            RealmList realmList8 = new RealmList();
            com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmSet$bankTransfers(realmList8);
            int size8 = realmGet$bankTransfers.size();
            for (int i10 = 0; i10 < size8; i10++) {
                realmList8.add(com_bca_smartbranch_data_localdb_BankTransferRealmProxy.createDetachedCopy((BankTransfer) realmGet$bankTransfers.get(i10), i + 1, i2, map));
            }
        }
        return user2;
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("", "User", false, 21, 0);
        builder.addPersistedProperty("", "email", RealmFieldType.STRING, true, false, false);
        builder.addPersistedProperty("", "name", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "noHandphone", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "acctNo", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "sessionId", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "isMember", RealmFieldType.BOOLEAN, false, false, true);
        builder.addPersistedProperty("", "verified", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "idType", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "idNum", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "userPhoto", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "imei", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "membership", RealmFieldType.STRING, false, false, false);
        builder.addPersistedProperty("", "isFlagContactKU", RealmFieldType.BOOLEAN, false, false, true);
        builder.addPersistedLinkProperty("", "accounts", RealmFieldType.LIST, "Account");
        builder.addPersistedLinkProperty("", "setorans", RealmFieldType.LIST, "Setoran");
        builder.addPersistedLinkProperty("", "tarikans", RealmFieldType.LIST, "Tarikan");
        builder.addPersistedLinkProperty("", "kirimanUangs", RealmFieldType.LIST, "KirimanUang");
        builder.addPersistedLinkProperty("", "klirings", RealmFieldType.LIST, "Kliring");
        builder.addPersistedLinkProperty("", "creditCards", RealmFieldType.LIST, "CreditCard");
        builder.addPersistedLinkProperty("", "eChannels", RealmFieldType.LIST, "EChannel");
        builder.addPersistedLinkProperty("", "bankTransfers", RealmFieldType.LIST, "BankTransfer");
        return builder.build();
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x04d3  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0530  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x058e  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x05ec  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x064a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02d6  */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static com.bca.smartbranch.data.localdb.User createOrUpdateUsingJsonObject(io.realm.Realm r7, org.json.JSONObject r8, boolean r9) throws org.json.JSONException {
        /*
        // Method dump skipped, instructions count: 1694
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.com_bca_smartbranch_data_localdb_UserRealmProxy.createOrUpdateUsingJsonObject(io.realm.Realm, org.json.JSONObject, boolean):com.bca.smartbranch.data.localdb.User");
    }

    public static User createUsingJsonStream(Realm realm, JsonReader jsonReader) throws IOException {
        com_bca_smartbranch_data_localdb_UserRealmProxyInterface user = new User();
        com_bca_smartbranch_data_localdb_UserRealmProxyInterface com_bca_smartbranch_data_localdb_userrealmproxyinterface = user;
        jsonReader.beginObject();
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("email")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmSet$email(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmSet$email((String) null);
                }
                z = true;
            } else if (nextName.equals("name")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmSet$name(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmSet$name((String) null);
                }
            } else if (nextName.equals("noHandphone")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmSet$noHandphone(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmSet$noHandphone((String) null);
                }
            } else if (nextName.equals("acctNo")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmSet$acctNo(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmSet$acctNo((String) null);
                }
            } else if (nextName.equals("sessionId")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmSet$sessionId(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmSet$sessionId((String) null);
                }
            } else if (nextName.equals("isMember")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmSet$isMember(jsonReader.nextBoolean());
                } else {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'isMember' to null.");
                }
            } else if (nextName.equals("verified")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmSet$verified(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmSet$verified((String) null);
                }
            } else if (nextName.equals("idType")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmSet$idType(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmSet$idType((String) null);
                }
            } else if (nextName.equals("idNum")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmSet$idNum(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmSet$idNum((String) null);
                }
            } else if (nextName.equals("userPhoto")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmSet$userPhoto(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmSet$userPhoto((String) null);
                }
            } else if (nextName.equals("imei")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmSet$imei(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmSet$imei((String) null);
                }
            } else if (nextName.equals("membership")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmSet$membership(jsonReader.nextString());
                } else {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmSet$membership((String) null);
                }
            } else if (nextName.equals("isFlagContactKU")) {
                if (jsonReader.peek() != JsonToken.NULL) {
                    com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmSet$isFlagContactKU(jsonReader.nextBoolean());
                } else {
                    jsonReader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'isFlagContactKU' to null.");
                }
            } else if (nextName.equals("accounts")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmSet$accounts((RealmList) null);
                } else {
                    com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmSet$accounts(new RealmList());
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmGet$accounts().add(com_bca_smartbranch_data_localdb_AccountRealmProxy.createUsingJsonStream(realm, jsonReader));
                    }
                    jsonReader.endArray();
                }
            } else if (nextName.equals("setorans")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmSet$setorans((RealmList) null);
                } else {
                    com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmSet$setorans(new RealmList());
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmGet$setorans().add(com_bca_smartbranch_data_localdb_SetoranRealmProxy.createUsingJsonStream(realm, jsonReader));
                    }
                    jsonReader.endArray();
                }
            } else if (nextName.equals("tarikans")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmSet$tarikans((RealmList) null);
                } else {
                    com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmSet$tarikans(new RealmList());
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmGet$tarikans().add(com_bca_smartbranch_data_localdb_TarikanRealmProxy.createUsingJsonStream(realm, jsonReader));
                    }
                    jsonReader.endArray();
                }
            } else if (nextName.equals("kirimanUangs")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmSet$kirimanUangs((RealmList) null);
                } else {
                    com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmSet$kirimanUangs(new RealmList());
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmGet$kirimanUangs().add(com_bca_smartbranch_data_localdb_KirimanUangRealmProxy.createUsingJsonStream(realm, jsonReader));
                    }
                    jsonReader.endArray();
                }
            } else if (nextName.equals("klirings")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmSet$klirings((RealmList) null);
                } else {
                    com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmSet$klirings(new RealmList());
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmGet$klirings().add(com_bca_smartbranch_data_localdb_KliringRealmProxy.createUsingJsonStream(realm, jsonReader));
                    }
                    jsonReader.endArray();
                }
            } else if (nextName.equals("creditCards")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmSet$creditCards((RealmList) null);
                } else {
                    com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmSet$creditCards(new RealmList());
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmGet$creditCards().add(com_bca_smartbranch_data_localdb_CreditCardRealmProxy.createUsingJsonStream(realm, jsonReader));
                    }
                    jsonReader.endArray();
                }
            } else if (nextName.equals("eChannels")) {
                if (jsonReader.peek() == JsonToken.NULL) {
                    jsonReader.skipValue();
                    com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmSet$eChannels((RealmList) null);
                } else {
                    com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmSet$eChannels(new RealmList());
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmGet$eChannels().add(com_bca_smartbranch_data_localdb_EChannelRealmProxy.createUsingJsonStream(realm, jsonReader));
                    }
                    jsonReader.endArray();
                }
            } else if (!nextName.equals("bankTransfers")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.skipValue();
                com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmSet$bankTransfers((RealmList) null);
            } else {
                com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmSet$bankTransfers(new RealmList());
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmGet$bankTransfers().add(com_bca_smartbranch_data_localdb_BankTransferRealmProxy.createUsingJsonStream(realm, jsonReader));
                }
                jsonReader.endArray();
            }
        }
        jsonReader.endObject();
        if (z) {
            return (User) realm.copyToRealmOrUpdate((Realm) user, new ImportFlag[0]);
        }
        throw new IllegalArgumentException("JSON object doesn't have the primary key field 'email'.");
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static String getSimpleClassName() {
        return "User";
    }

    public static long insert(Realm realm, User user, Map<RealmModel, Long> map) {
        if ((user instanceof RealmObjectProxy) && !RealmObject.isFrozen(user)) {
            RealmObjectProxy realmObjectProxy = (RealmObjectProxy) user;
            if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                return realmObjectProxy.realmGet$proxyState().getRow$realm().getObjectKey();
            }
        }
        Table table = realm.getTable(User.class);
        long nativePtr = table.getNativePtr();
        UserColumnInfo userColumnInfo = (UserColumnInfo) realm.getSchema().getColumnInfo(User.class);
        long j = userColumnInfo.emailColKey;
        com_bca_smartbranch_data_localdb_UserRealmProxyInterface com_bca_smartbranch_data_localdb_userrealmproxyinterface = (com_bca_smartbranch_data_localdb_UserRealmProxyInterface) user;
        String realmGet$email = com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmGet$email();
        long nativeFindFirstNull = realmGet$email == null ? Table.nativeFindFirstNull(nativePtr, j) : Table.nativeFindFirstString(nativePtr, j, realmGet$email);
        if (nativeFindFirstNull == -1) {
            nativeFindFirstNull = OsObject.createRowWithPrimaryKey(table, j, realmGet$email);
        } else {
            Table.throwDuplicatePrimaryKeyException(realmGet$email);
        }
        map.put(user, Long.valueOf(nativeFindFirstNull));
        String realmGet$name = com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(nativePtr, userColumnInfo.nameColKey, nativeFindFirstNull, realmGet$name, false);
        }
        String realmGet$noHandphone = com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmGet$noHandphone();
        if (realmGet$noHandphone != null) {
            Table.nativeSetString(nativePtr, userColumnInfo.noHandphoneColKey, nativeFindFirstNull, realmGet$noHandphone, false);
        }
        String realmGet$acctNo = com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmGet$acctNo();
        if (realmGet$acctNo != null) {
            Table.nativeSetString(nativePtr, userColumnInfo.acctNoColKey, nativeFindFirstNull, realmGet$acctNo, false);
        }
        String realmGet$sessionId = com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmGet$sessionId();
        if (realmGet$sessionId != null) {
            Table.nativeSetString(nativePtr, userColumnInfo.sessionIdColKey, nativeFindFirstNull, realmGet$sessionId, false);
        }
        Table.nativeSetBoolean(nativePtr, userColumnInfo.isMemberColKey, nativeFindFirstNull, com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmGet$isMember(), false);
        String realmGet$verified = com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmGet$verified();
        if (realmGet$verified != null) {
            Table.nativeSetString(nativePtr, userColumnInfo.verifiedColKey, nativeFindFirstNull, realmGet$verified, false);
        }
        String realmGet$idType = com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmGet$idType();
        if (realmGet$idType != null) {
            Table.nativeSetString(nativePtr, userColumnInfo.idTypeColKey, nativeFindFirstNull, realmGet$idType, false);
        }
        String realmGet$idNum = com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmGet$idNum();
        if (realmGet$idNum != null) {
            Table.nativeSetString(nativePtr, userColumnInfo.idNumColKey, nativeFindFirstNull, realmGet$idNum, false);
        }
        String realmGet$userPhoto = com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmGet$userPhoto();
        if (realmGet$userPhoto != null) {
            Table.nativeSetString(nativePtr, userColumnInfo.userPhotoColKey, nativeFindFirstNull, realmGet$userPhoto, false);
        }
        String realmGet$imei = com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmGet$imei();
        if (realmGet$imei != null) {
            Table.nativeSetString(nativePtr, userColumnInfo.imeiColKey, nativeFindFirstNull, realmGet$imei, false);
        }
        String realmGet$membership = com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmGet$membership();
        if (realmGet$membership != null) {
            Table.nativeSetString(nativePtr, userColumnInfo.membershipColKey, nativeFindFirstNull, realmGet$membership, false);
        }
        Table.nativeSetBoolean(nativePtr, userColumnInfo.isFlagContactKUColKey, nativeFindFirstNull, com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmGet$isFlagContactKU(), false);
        RealmList realmGet$accounts = com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmGet$accounts();
        if (realmGet$accounts != null) {
            OsList osList = new OsList(table.getUncheckedRow(nativeFindFirstNull), userColumnInfo.accountsColKey);
            Iterator<E> it = realmGet$accounts.iterator();
            while (it.hasNext()) {
                Account account = (Account) it.next();
                Long l = map.get(account);
                Long l2 = l;
                if (l == null) {
                    l2 = Long.valueOf(com_bca_smartbranch_data_localdb_AccountRealmProxy.insert(realm, account, map));
                }
                osList.addRow(l2.longValue());
            }
        }
        RealmList realmGet$setorans = com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmGet$setorans();
        if (realmGet$setorans != null) {
            OsList osList2 = new OsList(table.getUncheckedRow(nativeFindFirstNull), userColumnInfo.setoransColKey);
            Iterator<E> it2 = realmGet$setorans.iterator();
            while (it2.hasNext()) {
                Setoran setoran = (Setoran) it2.next();
                Long l3 = map.get(setoran);
                Long l4 = l3;
                if (l3 == null) {
                    l4 = Long.valueOf(com_bca_smartbranch_data_localdb_SetoranRealmProxy.insert(realm, setoran, map));
                }
                osList2.addRow(l4.longValue());
            }
        }
        RealmList realmGet$tarikans = com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmGet$tarikans();
        if (realmGet$tarikans != null) {
            OsList osList3 = new OsList(table.getUncheckedRow(nativeFindFirstNull), userColumnInfo.tarikansColKey);
            Iterator<E> it3 = realmGet$tarikans.iterator();
            while (it3.hasNext()) {
                Tarikan tarikan = (Tarikan) it3.next();
                Long l5 = map.get(tarikan);
                Long l6 = l5;
                if (l5 == null) {
                    l6 = Long.valueOf(com_bca_smartbranch_data_localdb_TarikanRealmProxy.insert(realm, tarikan, map));
                }
                osList3.addRow(l6.longValue());
            }
        }
        RealmList realmGet$kirimanUangs = com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmGet$kirimanUangs();
        if (realmGet$kirimanUangs != null) {
            OsList osList4 = new OsList(table.getUncheckedRow(nativeFindFirstNull), userColumnInfo.kirimanUangsColKey);
            Iterator<E> it4 = realmGet$kirimanUangs.iterator();
            while (it4.hasNext()) {
                KirimanUang kirimanUang = (KirimanUang) it4.next();
                Long l7 = map.get(kirimanUang);
                Long l8 = l7;
                if (l7 == null) {
                    l8 = Long.valueOf(com_bca_smartbranch_data_localdb_KirimanUangRealmProxy.insert(realm, kirimanUang, map));
                }
                osList4.addRow(l8.longValue());
            }
        }
        RealmList realmGet$klirings = com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmGet$klirings();
        if (realmGet$klirings != null) {
            OsList osList5 = new OsList(table.getUncheckedRow(nativeFindFirstNull), userColumnInfo.kliringsColKey);
            Iterator<E> it5 = realmGet$klirings.iterator();
            while (it5.hasNext()) {
                Kliring kliring = (Kliring) it5.next();
                Long l9 = map.get(kliring);
                Long l10 = l9;
                if (l9 == null) {
                    l10 = Long.valueOf(com_bca_smartbranch_data_localdb_KliringRealmProxy.insert(realm, kliring, map));
                }
                osList5.addRow(l10.longValue());
            }
        }
        RealmList realmGet$creditCards = com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmGet$creditCards();
        if (realmGet$creditCards != null) {
            OsList osList6 = new OsList(table.getUncheckedRow(nativeFindFirstNull), userColumnInfo.creditCardsColKey);
            Iterator<E> it6 = realmGet$creditCards.iterator();
            while (it6.hasNext()) {
                CreditCard creditCard = (CreditCard) it6.next();
                Long l11 = map.get(creditCard);
                Long l12 = l11;
                if (l11 == null) {
                    l12 = Long.valueOf(com_bca_smartbranch_data_localdb_CreditCardRealmProxy.insert(realm, creditCard, map));
                }
                osList6.addRow(l12.longValue());
            }
        }
        RealmList realmGet$eChannels = com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmGet$eChannels();
        if (realmGet$eChannels != null) {
            OsList osList7 = new OsList(table.getUncheckedRow(nativeFindFirstNull), userColumnInfo.eChannelsColKey);
            Iterator<E> it7 = realmGet$eChannels.iterator();
            while (it7.hasNext()) {
                EChannel eChannel = (EChannel) it7.next();
                Long l13 = map.get(eChannel);
                Long l14 = l13;
                if (l13 == null) {
                    l14 = Long.valueOf(com_bca_smartbranch_data_localdb_EChannelRealmProxy.insert(realm, eChannel, map));
                }
                osList7.addRow(l14.longValue());
            }
        }
        RealmList realmGet$bankTransfers = com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmGet$bankTransfers();
        if (realmGet$bankTransfers != null) {
            OsList osList8 = new OsList(table.getUncheckedRow(nativeFindFirstNull), userColumnInfo.bankTransfersColKey);
            Iterator<E> it8 = realmGet$bankTransfers.iterator();
            while (it8.hasNext()) {
                BankTransfer bankTransfer = (BankTransfer) it8.next();
                Long l15 = map.get(bankTransfer);
                Long l16 = l15;
                if (l15 == null) {
                    l16 = Long.valueOf(com_bca_smartbranch_data_localdb_BankTransferRealmProxy.insert(realm, bankTransfer, map));
                }
                osList8.addRow(l16.longValue());
            }
        }
        return nativeFindFirstNull;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> it, Map<RealmModel, Long> map) {
        Table table = realm.getTable(User.class);
        long nativePtr = table.getNativePtr();
        UserColumnInfo userColumnInfo = (UserColumnInfo) realm.getSchema().getColumnInfo(User.class);
        long j = userColumnInfo.emailColKey;
        while (it.hasNext()) {
            com_bca_smartbranch_data_localdb_UserRealmProxyInterface com_bca_smartbranch_data_localdb_userrealmproxyinterface = (User) it.next();
            if (!map.containsKey(com_bca_smartbranch_data_localdb_userrealmproxyinterface)) {
                if ((com_bca_smartbranch_data_localdb_userrealmproxyinterface instanceof RealmObjectProxy) && !RealmObject.isFrozen(com_bca_smartbranch_data_localdb_userrealmproxyinterface)) {
                    RealmObjectProxy realmObjectProxy = (RealmObjectProxy) com_bca_smartbranch_data_localdb_userrealmproxyinterface;
                    if (realmObjectProxy.realmGet$proxyState().getRealm$realm() != null && realmObjectProxy.realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                        map.put(com_bca_smartbranch_data_localdb_userrealmproxyinterface, Long.valueOf(realmObjectProxy.realmGet$proxyState().getRow$realm().getObjectKey()));
                    }
                }
                com_bca_smartbranch_data_localdb_UserRealmProxyInterface com_bca_smartbranch_data_localdb_userrealmproxyinterface2 = com_bca_smartbranch_data_localdb_userrealmproxyinterface;
                String realmGet$email = com_bca_smartbranch_data_localdb_userrealmproxyinterface2.realmGet$email();
                long nativeFindFirstNull = realmGet$email == null ? Table.nativeFindFirstNull(nativePtr, j) : Table.nativeFindFirstString(nativePtr, j, realmGet$email);
                if (nativeFindFirstNull == -1) {
                    nativeFindFirstNull = OsObject.createRowWithPrimaryKey(table, j, realmGet$email);
                } else {
                    Table.throwDuplicatePrimaryKeyException(realmGet$email);
                }
                map.put(com_bca_smartbranch_data_localdb_userrealmproxyinterface, Long.valueOf(nativeFindFirstNull));
                String realmGet$name = com_bca_smartbranch_data_localdb_userrealmproxyinterface2.realmGet$name();
                if (realmGet$name != null) {
                    Table.nativeSetString(nativePtr, userColumnInfo.nameColKey, nativeFindFirstNull, realmGet$name, false);
                }
                String realmGet$noHandphone = com_bca_smartbranch_data_localdb_userrealmproxyinterface2.realmGet$noHandphone();
                if (realmGet$noHandphone != null) {
                    Table.nativeSetString(nativePtr, userColumnInfo.noHandphoneColKey, nativeFindFirstNull, realmGet$noHandphone, false);
                }
                String realmGet$acctNo = com_bca_smartbranch_data_localdb_userrealmproxyinterface2.realmGet$acctNo();
                if (realmGet$acctNo != null) {
                    Table.nativeSetString(nativePtr, userColumnInfo.acctNoColKey, nativeFindFirstNull, realmGet$acctNo, false);
                }
                String realmGet$sessionId = com_bca_smartbranch_data_localdb_userrealmproxyinterface2.realmGet$sessionId();
                if (realmGet$sessionId != null) {
                    Table.nativeSetString(nativePtr, userColumnInfo.sessionIdColKey, nativeFindFirstNull, realmGet$sessionId, false);
                }
                Table.nativeSetBoolean(nativePtr, userColumnInfo.isMemberColKey, nativeFindFirstNull, com_bca_smartbranch_data_localdb_userrealmproxyinterface2.realmGet$isMember(), false);
                String realmGet$verified = com_bca_smartbranch_data_localdb_userrealmproxyinterface2.realmGet$verified();
                if (realmGet$verified != null) {
                    Table.nativeSetString(nativePtr, userColumnInfo.verifiedColKey, nativeFindFirstNull, realmGet$verified, false);
                }
                String realmGet$idType = com_bca_smartbranch_data_localdb_userrealmproxyinterface2.realmGet$idType();
                if (realmGet$idType != null) {
                    Table.nativeSetString(nativePtr, userColumnInfo.idTypeColKey, nativeFindFirstNull, realmGet$idType, false);
                }
                String realmGet$idNum = com_bca_smartbranch_data_localdb_userrealmproxyinterface2.realmGet$idNum();
                if (realmGet$idNum != null) {
                    Table.nativeSetString(nativePtr, userColumnInfo.idNumColKey, nativeFindFirstNull, realmGet$idNum, false);
                }
                String realmGet$userPhoto = com_bca_smartbranch_data_localdb_userrealmproxyinterface2.realmGet$userPhoto();
                if (realmGet$userPhoto != null) {
                    Table.nativeSetString(nativePtr, userColumnInfo.userPhotoColKey, nativeFindFirstNull, realmGet$userPhoto, false);
                }
                String realmGet$imei = com_bca_smartbranch_data_localdb_userrealmproxyinterface2.realmGet$imei();
                if (realmGet$imei != null) {
                    Table.nativeSetString(nativePtr, userColumnInfo.imeiColKey, nativeFindFirstNull, realmGet$imei, false);
                }
                String realmGet$membership = com_bca_smartbranch_data_localdb_userrealmproxyinterface2.realmGet$membership();
                if (realmGet$membership != null) {
                    Table.nativeSetString(nativePtr, userColumnInfo.membershipColKey, nativeFindFirstNull, realmGet$membership, false);
                }
                Table.nativeSetBoolean(nativePtr, userColumnInfo.isFlagContactKUColKey, nativeFindFirstNull, com_bca_smartbranch_data_localdb_userrealmproxyinterface2.realmGet$isFlagContactKU(), false);
                RealmList realmGet$accounts = com_bca_smartbranch_data_localdb_userrealmproxyinterface2.realmGet$accounts();
                if (realmGet$accounts != null) {
                    OsList osList = new OsList(table.getUncheckedRow(nativeFindFirstNull), userColumnInfo.accountsColKey);
                    Iterator<E> it2 = realmGet$accounts.iterator();
                    while (it2.hasNext()) {
                        Account account = (Account) it2.next();
                        Long l = map.get(account);
                        Long l2 = l;
                        if (l == null) {
                            l2 = Long.valueOf(com_bca_smartbranch_data_localdb_AccountRealmProxy.insert(realm, account, map));
                        }
                        osList.addRow(l2.longValue());
                    }
                }
                RealmList realmGet$setorans = com_bca_smartbranch_data_localdb_userrealmproxyinterface2.realmGet$setorans();
                if (realmGet$setorans != null) {
                    OsList osList2 = new OsList(table.getUncheckedRow(nativeFindFirstNull), userColumnInfo.setoransColKey);
                    Iterator<E> it3 = realmGet$setorans.iterator();
                    while (it3.hasNext()) {
                        Setoran setoran = (Setoran) it3.next();
                        Long l3 = map.get(setoran);
                        Long l4 = l3;
                        if (l3 == null) {
                            l4 = Long.valueOf(com_bca_smartbranch_data_localdb_SetoranRealmProxy.insert(realm, setoran, map));
                        }
                        osList2.addRow(l4.longValue());
                    }
                }
                RealmList realmGet$tarikans = com_bca_smartbranch_data_localdb_userrealmproxyinterface2.realmGet$tarikans();
                if (realmGet$tarikans != null) {
                    OsList osList3 = new OsList(table.getUncheckedRow(nativeFindFirstNull), userColumnInfo.tarikansColKey);
                    Iterator<E> it4 = realmGet$tarikans.iterator();
                    while (it4.hasNext()) {
                        Tarikan tarikan = (Tarikan) it4.next();
                        Long l5 = map.get(tarikan);
                        Long l6 = l5;
                        if (l5 == null) {
                            l6 = Long.valueOf(com_bca_smartbranch_data_localdb_TarikanRealmProxy.insert(realm, tarikan, map));
                        }
                        osList3.addRow(l6.longValue());
                    }
                }
                RealmList realmGet$kirimanUangs = com_bca_smartbranch_data_localdb_userrealmproxyinterface2.realmGet$kirimanUangs();
                if (realmGet$kirimanUangs != null) {
                    OsList osList4 = new OsList(table.getUncheckedRow(nativeFindFirstNull), userColumnInfo.kirimanUangsColKey);
                    Iterator<E> it5 = realmGet$kirimanUangs.iterator();
                    while (it5.hasNext()) {
                        KirimanUang kirimanUang = (KirimanUang) it5.next();
                        Long l7 = map.get(kirimanUang);
                        Long l8 = l7;
                        if (l7 == null) {
                            l8 = Long.valueOf(com_bca_smartbranch_data_localdb_KirimanUangRealmProxy.insert(realm, kirimanUang, map));
                        }
                        osList4.addRow(l8.longValue());
                    }
                }
                RealmList realmGet$klirings = com_bca_smartbranch_data_localdb_userrealmproxyinterface2.realmGet$klirings();
                if (realmGet$klirings != null) {
                    OsList osList5 = new OsList(table.getUncheckedRow(nativeFindFirstNull), userColumnInfo.kliringsColKey);
                    Iterator<E> it6 = realmGet$klirings.iterator();
                    while (it6.hasNext()) {
                        Kliring kliring = (Kliring) it6.next();
                        Long l9 = map.get(kliring);
                        Long l10 = l9;
                        if (l9 == null) {
                            l10 = Long.valueOf(com_bca_smartbranch_data_localdb_KliringRealmProxy.insert(realm, kliring, map));
                        }
                        osList5.addRow(l10.longValue());
                    }
                }
                RealmList realmGet$creditCards = com_bca_smartbranch_data_localdb_userrealmproxyinterface2.realmGet$creditCards();
                if (realmGet$creditCards != null) {
                    OsList osList6 = new OsList(table.getUncheckedRow(nativeFindFirstNull), userColumnInfo.creditCardsColKey);
                    Iterator<E> it7 = realmGet$creditCards.iterator();
                    while (it7.hasNext()) {
                        CreditCard creditCard = (CreditCard) it7.next();
                        Long l11 = map.get(creditCard);
                        Long l12 = l11;
                        if (l11 == null) {
                            l12 = Long.valueOf(com_bca_smartbranch_data_localdb_CreditCardRealmProxy.insert(realm, creditCard, map));
                        }
                        osList6.addRow(l12.longValue());
                    }
                }
                RealmList realmGet$eChannels = com_bca_smartbranch_data_localdb_userrealmproxyinterface2.realmGet$eChannels();
                if (realmGet$eChannels != null) {
                    OsList osList7 = new OsList(table.getUncheckedRow(nativeFindFirstNull), userColumnInfo.eChannelsColKey);
                    Iterator<E> it8 = realmGet$eChannels.iterator();
                    while (it8.hasNext()) {
                        EChannel eChannel = (EChannel) it8.next();
                        Long l13 = map.get(eChannel);
                        Long l14 = l13;
                        if (l13 == null) {
                            l14 = Long.valueOf(com_bca_smartbranch_data_localdb_EChannelRealmProxy.insert(realm, eChannel, map));
                        }
                        osList7.addRow(l14.longValue());
                    }
                }
                RealmList realmGet$bankTransfers = com_bca_smartbranch_data_localdb_userrealmproxyinterface2.realmGet$bankTransfers();
                if (realmGet$bankTransfers != null) {
                    OsList osList8 = new OsList(table.getUncheckedRow(nativeFindFirstNull), userColumnInfo.bankTransfersColKey);
                    Iterator<E> it9 = realmGet$bankTransfers.iterator();
                    while (it9.hasNext()) {
                        BankTransfer bankTransfer = (BankTransfer) it9.next();
                        Long l15 = map.get(bankTransfer);
                        Long l16 = l15;
                        if (l15 == null) {
                            l16 = Long.valueOf(com_bca_smartbranch_data_localdb_BankTransferRealmProxy.insert(realm, bankTransfer, map));
                        }
                        osList8.addRow(l16.longValue());
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r22v0 */
    /* JADX WARN: Type inference failed for: r22v1, types: [long] */
    /* JADX WARN: Type inference failed for: r22v4 */
    /* JADX WARN: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static long insertOrUpdate(io.realm.Realm r9, com.bca.smartbranch.data.localdb.User r10, java.util.Map<io.realm.RealmModel, java.lang.Long> r11) {
        /*
        // Method dump skipped, instructions count: 2295
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.com_bca_smartbranch_data_localdb_UserRealmProxy.insertOrUpdate(io.realm.Realm, com.bca.smartbranch.data.localdb.User, java.util.Map):long");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [long] */
    /* JADX WARN: Type inference failed for: r13v1, types: [long] */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r23v0 */
    /* JADX WARN: Type inference failed for: r23v1, types: [long] */
    /* JADX WARN: Type inference failed for: r23v4 */
    /* JADX WARN: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static void insertOrUpdate(io.realm.Realm r9, java.util.Iterator<? extends io.realm.RealmModel> r10, java.util.Map<io.realm.RealmModel, java.lang.Long> r11) {
        /*
        // Method dump skipped, instructions count: 2495
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.com_bca_smartbranch_data_localdb_UserRealmProxy.insertOrUpdate(io.realm.Realm, java.util.Iterator, java.util.Map):void");
    }

    static com_bca_smartbranch_data_localdb_UserRealmProxy newProxyInstance(BaseRealm baseRealm, Row row) {
        BaseRealm.RealmObjectContext realmObjectContext = BaseRealm.objectContext.get();
        realmObjectContext.set(baseRealm, row, baseRealm.getSchema().getColumnInfo(User.class), false, Collections.emptyList());
        com_bca_smartbranch_data_localdb_UserRealmProxy com_bca_smartbranch_data_localdb_userrealmproxy = new com_bca_smartbranch_data_localdb_UserRealmProxy();
        realmObjectContext.clear();
        return com_bca_smartbranch_data_localdb_userrealmproxy;
    }

    static User update(Realm realm, UserColumnInfo userColumnInfo, User user, User user2, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        com_bca_smartbranch_data_localdb_UserRealmProxyInterface com_bca_smartbranch_data_localdb_userrealmproxyinterface = (com_bca_smartbranch_data_localdb_UserRealmProxyInterface) user2;
        OsObjectBuilder osObjectBuilder = new OsObjectBuilder(realm.getTable(User.class), set);
        osObjectBuilder.addString(userColumnInfo.emailColKey, com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmGet$email());
        osObjectBuilder.addString(userColumnInfo.nameColKey, com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmGet$name());
        osObjectBuilder.addString(userColumnInfo.noHandphoneColKey, com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmGet$noHandphone());
        osObjectBuilder.addString(userColumnInfo.acctNoColKey, com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmGet$acctNo());
        osObjectBuilder.addString(userColumnInfo.sessionIdColKey, com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmGet$sessionId());
        osObjectBuilder.addBoolean(userColumnInfo.isMemberColKey, Boolean.valueOf(com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmGet$isMember()));
        osObjectBuilder.addString(userColumnInfo.verifiedColKey, com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmGet$verified());
        osObjectBuilder.addString(userColumnInfo.idTypeColKey, com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmGet$idType());
        osObjectBuilder.addString(userColumnInfo.idNumColKey, com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmGet$idNum());
        osObjectBuilder.addString(userColumnInfo.userPhotoColKey, com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmGet$userPhoto());
        osObjectBuilder.addString(userColumnInfo.imeiColKey, com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmGet$imei());
        osObjectBuilder.addString(userColumnInfo.membershipColKey, com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmGet$membership());
        osObjectBuilder.addBoolean(userColumnInfo.isFlagContactKUColKey, Boolean.valueOf(com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmGet$isFlagContactKU()));
        RealmList realmGet$accounts = com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmGet$accounts();
        if (realmGet$accounts != null) {
            RealmList realmList = new RealmList();
            for (int i = 0; i < realmGet$accounts.size(); i++) {
                Account account = (Account) realmGet$accounts.get(i);
                Account account2 = (Account) map.get(account);
                if (account2 != null) {
                    realmList.add(account2);
                } else {
                    realmList.add(com_bca_smartbranch_data_localdb_AccountRealmProxy.copyOrUpdate(realm, (com_bca_smartbranch_data_localdb_AccountRealmProxy.AccountColumnInfo) realm.getSchema().getColumnInfo(Account.class), account, true, map, set));
                }
            }
            osObjectBuilder.addObjectList(userColumnInfo.accountsColKey, realmList);
        } else {
            osObjectBuilder.addObjectList(userColumnInfo.accountsColKey, new RealmList());
        }
        RealmList realmGet$setorans = com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmGet$setorans();
        if (realmGet$setorans != null) {
            RealmList realmList2 = new RealmList();
            for (int i2 = 0; i2 < realmGet$setorans.size(); i2++) {
                Setoran setoran = (Setoran) realmGet$setorans.get(i2);
                Setoran setoran2 = (Setoran) map.get(setoran);
                if (setoran2 != null) {
                    realmList2.add(setoran2);
                } else {
                    realmList2.add(com_bca_smartbranch_data_localdb_SetoranRealmProxy.copyOrUpdate(realm, (com_bca_smartbranch_data_localdb_SetoranRealmProxy.SetoranColumnInfo) realm.getSchema().getColumnInfo(Setoran.class), setoran, true, map, set));
                }
            }
            osObjectBuilder.addObjectList(userColumnInfo.setoransColKey, realmList2);
        } else {
            osObjectBuilder.addObjectList(userColumnInfo.setoransColKey, new RealmList());
        }
        RealmList realmGet$tarikans = com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmGet$tarikans();
        if (realmGet$tarikans != null) {
            RealmList realmList3 = new RealmList();
            for (int i3 = 0; i3 < realmGet$tarikans.size(); i3++) {
                Tarikan tarikan = (Tarikan) realmGet$tarikans.get(i3);
                Tarikan tarikan2 = (Tarikan) map.get(tarikan);
                if (tarikan2 != null) {
                    realmList3.add(tarikan2);
                } else {
                    realmList3.add(com_bca_smartbranch_data_localdb_TarikanRealmProxy.copyOrUpdate(realm, (com_bca_smartbranch_data_localdb_TarikanRealmProxy.TarikanColumnInfo) realm.getSchema().getColumnInfo(Tarikan.class), tarikan, true, map, set));
                }
            }
            osObjectBuilder.addObjectList(userColumnInfo.tarikansColKey, realmList3);
        } else {
            osObjectBuilder.addObjectList(userColumnInfo.tarikansColKey, new RealmList());
        }
        RealmList realmGet$kirimanUangs = com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmGet$kirimanUangs();
        if (realmGet$kirimanUangs != null) {
            RealmList realmList4 = new RealmList();
            for (int i4 = 0; i4 < realmGet$kirimanUangs.size(); i4++) {
                KirimanUang kirimanUang = (KirimanUang) realmGet$kirimanUangs.get(i4);
                KirimanUang kirimanUang2 = (KirimanUang) map.get(kirimanUang);
                if (kirimanUang2 != null) {
                    realmList4.add(kirimanUang2);
                } else {
                    realmList4.add(com_bca_smartbranch_data_localdb_KirimanUangRealmProxy.copyOrUpdate(realm, (com_bca_smartbranch_data_localdb_KirimanUangRealmProxy.KirimanUangColumnInfo) realm.getSchema().getColumnInfo(KirimanUang.class), kirimanUang, true, map, set));
                }
            }
            osObjectBuilder.addObjectList(userColumnInfo.kirimanUangsColKey, realmList4);
        } else {
            osObjectBuilder.addObjectList(userColumnInfo.kirimanUangsColKey, new RealmList());
        }
        RealmList realmGet$klirings = com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmGet$klirings();
        if (realmGet$klirings != null) {
            RealmList realmList5 = new RealmList();
            for (int i5 = 0; i5 < realmGet$klirings.size(); i5++) {
                Kliring kliring = (Kliring) realmGet$klirings.get(i5);
                Kliring kliring2 = (Kliring) map.get(kliring);
                if (kliring2 != null) {
                    realmList5.add(kliring2);
                } else {
                    realmList5.add(com_bca_smartbranch_data_localdb_KliringRealmProxy.copyOrUpdate(realm, (com_bca_smartbranch_data_localdb_KliringRealmProxy.KliringColumnInfo) realm.getSchema().getColumnInfo(Kliring.class), kliring, true, map, set));
                }
            }
            osObjectBuilder.addObjectList(userColumnInfo.kliringsColKey, realmList5);
        } else {
            osObjectBuilder.addObjectList(userColumnInfo.kliringsColKey, new RealmList());
        }
        RealmList realmGet$creditCards = com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmGet$creditCards();
        if (realmGet$creditCards != null) {
            RealmList realmList6 = new RealmList();
            for (int i6 = 0; i6 < realmGet$creditCards.size(); i6++) {
                CreditCard creditCard = (CreditCard) realmGet$creditCards.get(i6);
                CreditCard creditCard2 = (CreditCard) map.get(creditCard);
                if (creditCard2 != null) {
                    realmList6.add(creditCard2);
                } else {
                    realmList6.add(com_bca_smartbranch_data_localdb_CreditCardRealmProxy.copyOrUpdate(realm, (com_bca_smartbranch_data_localdb_CreditCardRealmProxy.CreditCardColumnInfo) realm.getSchema().getColumnInfo(CreditCard.class), creditCard, true, map, set));
                }
            }
            osObjectBuilder.addObjectList(userColumnInfo.creditCardsColKey, realmList6);
        } else {
            osObjectBuilder.addObjectList(userColumnInfo.creditCardsColKey, new RealmList());
        }
        RealmList realmGet$eChannels = com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmGet$eChannels();
        if (realmGet$eChannels != null) {
            RealmList realmList7 = new RealmList();
            for (int i7 = 0; i7 < realmGet$eChannels.size(); i7++) {
                EChannel eChannel = (EChannel) realmGet$eChannels.get(i7);
                EChannel eChannel2 = (EChannel) map.get(eChannel);
                if (eChannel2 != null) {
                    realmList7.add(eChannel2);
                } else {
                    realmList7.add(com_bca_smartbranch_data_localdb_EChannelRealmProxy.copyOrUpdate(realm, (com_bca_smartbranch_data_localdb_EChannelRealmProxy.EChannelColumnInfo) realm.getSchema().getColumnInfo(EChannel.class), eChannel, true, map, set));
                }
            }
            osObjectBuilder.addObjectList(userColumnInfo.eChannelsColKey, realmList7);
        } else {
            osObjectBuilder.addObjectList(userColumnInfo.eChannelsColKey, new RealmList());
        }
        RealmList realmGet$bankTransfers = com_bca_smartbranch_data_localdb_userrealmproxyinterface.realmGet$bankTransfers();
        if (realmGet$bankTransfers != null) {
            RealmList realmList8 = new RealmList();
            for (int i8 = 0; i8 < realmGet$bankTransfers.size(); i8++) {
                BankTransfer bankTransfer = (BankTransfer) realmGet$bankTransfers.get(i8);
                BankTransfer bankTransfer2 = (BankTransfer) map.get(bankTransfer);
                if (bankTransfer2 != null) {
                    realmList8.add(bankTransfer2);
                } else {
                    realmList8.add(com_bca_smartbranch_data_localdb_BankTransferRealmProxy.copyOrUpdate(realm, (com_bca_smartbranch_data_localdb_BankTransferRealmProxy.BankTransferColumnInfo) realm.getSchema().getColumnInfo(BankTransfer.class), bankTransfer, true, map, set));
                }
            }
            osObjectBuilder.addObjectList(userColumnInfo.bankTransfersColKey, realmList8);
        } else {
            osObjectBuilder.addObjectList(userColumnInfo.bankTransfersColKey, new RealmList());
        }
        osObjectBuilder.updateExistingTopLevelObject();
        return user;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com_bca_smartbranch_data_localdb_UserRealmProxy com_bca_smartbranch_data_localdb_userrealmproxy = (com_bca_smartbranch_data_localdb_UserRealmProxy) obj;
        BaseRealm realm$realm = this.proxyState.getRealm$realm();
        BaseRealm realm$realm2 = com_bca_smartbranch_data_localdb_userrealmproxy.proxyState.getRealm$realm();
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
        String name2 = com_bca_smartbranch_data_localdb_userrealmproxy.proxyState.getRow$realm().getTable().getName();
        if (name != null) {
            if (!name.equals(name2)) {
                return false;
            }
        } else if (name2 != null) {
            return false;
        }
        return this.proxyState.getRow$realm().getObjectKey() == com_bca_smartbranch_data_localdb_userrealmproxy.proxyState.getRow$realm().getObjectKey();
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
            this.columnInfo = (UserColumnInfo) realmObjectContext.getColumnInfo();
            ProxyState<User> proxyState = new ProxyState<>(this);
            this.proxyState = proxyState;
            proxyState.setRealm$realm(realmObjectContext.getRealm());
            this.proxyState.setRow$realm(realmObjectContext.getRow());
            this.proxyState.setAcceptDefaultValue$realm(realmObjectContext.getAcceptDefaultValue());
            this.proxyState.setExcludeFields$realm(realmObjectContext.getExcludeFields());
        }
    }

    @Override // com.bca.smartbranch.data.localdb.User
    public RealmList<Account> realmGet$accounts() {
        this.proxyState.getRealm$realm().checkIfValid();
        RealmList<Account> realmList = this.accountsRealmList;
        if (realmList != null) {
            return realmList;
        }
        RealmList<Account> realmList2 = new RealmList<>(Account.class, this.proxyState.getRow$realm().getModelList(this.columnInfo.accountsColKey), this.proxyState.getRealm$realm());
        this.accountsRealmList = realmList2;
        return realmList2;
    }

    @Override // com.bca.smartbranch.data.localdb.User
    public String realmGet$acctNo() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.acctNoColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.User
    public RealmList<BankTransfer> realmGet$bankTransfers() {
        this.proxyState.getRealm$realm().checkIfValid();
        RealmList<BankTransfer> realmList = this.bankTransfersRealmList;
        if (realmList != null) {
            return realmList;
        }
        RealmList<BankTransfer> realmList2 = new RealmList<>(BankTransfer.class, this.proxyState.getRow$realm().getModelList(this.columnInfo.bankTransfersColKey), this.proxyState.getRealm$realm());
        this.bankTransfersRealmList = realmList2;
        return realmList2;
    }

    @Override // com.bca.smartbranch.data.localdb.User
    public RealmList<CreditCard> realmGet$creditCards() {
        this.proxyState.getRealm$realm().checkIfValid();
        RealmList<CreditCard> realmList = this.creditCardsRealmList;
        if (realmList != null) {
            return realmList;
        }
        RealmList<CreditCard> realmList2 = new RealmList<>(CreditCard.class, this.proxyState.getRow$realm().getModelList(this.columnInfo.creditCardsColKey), this.proxyState.getRealm$realm());
        this.creditCardsRealmList = realmList2;
        return realmList2;
    }

    @Override // com.bca.smartbranch.data.localdb.User
    public RealmList<EChannel> realmGet$eChannels() {
        this.proxyState.getRealm$realm().checkIfValid();
        RealmList<EChannel> realmList = this.eChannelsRealmList;
        if (realmList != null) {
            return realmList;
        }
        RealmList<EChannel> realmList2 = new RealmList<>(EChannel.class, this.proxyState.getRow$realm().getModelList(this.columnInfo.eChannelsColKey), this.proxyState.getRealm$realm());
        this.eChannelsRealmList = realmList2;
        return realmList2;
    }

    @Override // com.bca.smartbranch.data.localdb.User
    public String realmGet$email() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.emailColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.User
    public String realmGet$idNum() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.idNumColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.User
    public String realmGet$idType() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.idTypeColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.User
    public String realmGet$imei() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.imeiColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.User
    public boolean realmGet$isFlagContactKU() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getBoolean(this.columnInfo.isFlagContactKUColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.User
    public boolean realmGet$isMember() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getBoolean(this.columnInfo.isMemberColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.User
    public RealmList<KirimanUang> realmGet$kirimanUangs() {
        this.proxyState.getRealm$realm().checkIfValid();
        RealmList<KirimanUang> realmList = this.kirimanUangsRealmList;
        if (realmList != null) {
            return realmList;
        }
        RealmList<KirimanUang> realmList2 = new RealmList<>(KirimanUang.class, this.proxyState.getRow$realm().getModelList(this.columnInfo.kirimanUangsColKey), this.proxyState.getRealm$realm());
        this.kirimanUangsRealmList = realmList2;
        return realmList2;
    }

    @Override // com.bca.smartbranch.data.localdb.User
    public RealmList<Kliring> realmGet$klirings() {
        this.proxyState.getRealm$realm().checkIfValid();
        RealmList<Kliring> realmList = this.kliringsRealmList;
        if (realmList != null) {
            return realmList;
        }
        RealmList<Kliring> realmList2 = new RealmList<>(Kliring.class, this.proxyState.getRow$realm().getModelList(this.columnInfo.kliringsColKey), this.proxyState.getRealm$realm());
        this.kliringsRealmList = realmList2;
        return realmList2;
    }

    @Override // com.bca.smartbranch.data.localdb.User
    public String realmGet$membership() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.membershipColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.User
    public String realmGet$name() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.nameColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.User
    public String realmGet$noHandphone() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.noHandphoneColKey);
    }

    @Override // io.realm.internal.RealmObjectProxy
    public ProxyState<?> realmGet$proxyState() {
        return this.proxyState;
    }

    @Override // com.bca.smartbranch.data.localdb.User
    public String realmGet$sessionId() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.sessionIdColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.User
    public RealmList<Setoran> realmGet$setorans() {
        this.proxyState.getRealm$realm().checkIfValid();
        RealmList<Setoran> realmList = this.setoransRealmList;
        if (realmList != null) {
            return realmList;
        }
        RealmList<Setoran> realmList2 = new RealmList<>(Setoran.class, this.proxyState.getRow$realm().getModelList(this.columnInfo.setoransColKey), this.proxyState.getRealm$realm());
        this.setoransRealmList = realmList2;
        return realmList2;
    }

    @Override // com.bca.smartbranch.data.localdb.User
    public RealmList<Tarikan> realmGet$tarikans() {
        this.proxyState.getRealm$realm().checkIfValid();
        RealmList<Tarikan> realmList = this.tarikansRealmList;
        if (realmList != null) {
            return realmList;
        }
        RealmList<Tarikan> realmList2 = new RealmList<>(Tarikan.class, this.proxyState.getRow$realm().getModelList(this.columnInfo.tarikansColKey), this.proxyState.getRealm$realm());
        this.tarikansRealmList = realmList2;
        return realmList2;
    }

    @Override // com.bca.smartbranch.data.localdb.User
    public String realmGet$userPhoto() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.userPhotoColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.User
    public String realmGet$verified() {
        this.proxyState.getRealm$realm().checkIfValid();
        return this.proxyState.getRow$realm().getString(this.columnInfo.verifiedColKey);
    }

    @Override // com.bca.smartbranch.data.localdb.User
    public void realmSet$accounts(RealmList<Account> realmList) {
        RealmList<Account> realmList2 = realmList;
        if (this.proxyState.isUnderConstruction()) {
            if (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains("accounts")) {
                realmList2 = realmList;
                if (realmList != null) {
                    realmList2 = realmList;
                    if (!realmList.isManaged()) {
                        Realm realm = (Realm) this.proxyState.getRealm$realm();
                        realmList2 = new RealmList<>();
                        Iterator<Account> it = realmList.iterator();
                        while (it.hasNext()) {
                            Account next = it.next();
                            if (next == null || RealmObject.isManaged(next)) {
                                realmList2.add(next);
                            } else {
                                realmList2.add((Account) realm.copyToRealmOrUpdate((Realm) next, new ImportFlag[0]));
                            }
                        }
                    }
                }
            } else {
                return;
            }
        }
        this.proxyState.getRealm$realm().checkIfValid();
        OsList modelList = this.proxyState.getRow$realm().getModelList(this.columnInfo.accountsColKey);
        if (realmList2 == null || ((long) realmList2.size()) != modelList.size()) {
            modelList.removeAll();
            if (realmList2 != null) {
                int size = realmList2.size();
                for (int i = 0; i < size; i++) {
                    Account account = realmList2.get(i);
                    this.proxyState.checkValidObject(account);
                    modelList.addRow(((RealmObjectProxy) account).realmGet$proxyState().getRow$realm().getObjectKey());
                }
                return;
            }
            return;
        }
        int size2 = realmList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            Account account2 = realmList2.get(i2);
            this.proxyState.checkValidObject(account2);
            modelList.setRow((long) i2, ((RealmObjectProxy) account2).realmGet$proxyState().getRow$realm().getObjectKey());
        }
    }

    @Override // com.bca.smartbranch.data.localdb.User
    public void realmSet$acctNo(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.acctNoColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.acctNoColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.acctNoColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.acctNoColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.User
    public void realmSet$bankTransfers(RealmList<BankTransfer> realmList) {
        RealmList<BankTransfer> realmList2 = realmList;
        if (this.proxyState.isUnderConstruction()) {
            if (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains("bankTransfers")) {
                realmList2 = realmList;
                if (realmList != null) {
                    realmList2 = realmList;
                    if (!realmList.isManaged()) {
                        Realm realm = (Realm) this.proxyState.getRealm$realm();
                        realmList2 = new RealmList<>();
                        Iterator<BankTransfer> it = realmList.iterator();
                        while (it.hasNext()) {
                            BankTransfer next = it.next();
                            if (next == null || RealmObject.isManaged(next)) {
                                realmList2.add(next);
                            } else {
                                realmList2.add((BankTransfer) realm.copyToRealmOrUpdate((Realm) next, new ImportFlag[0]));
                            }
                        }
                    }
                }
            } else {
                return;
            }
        }
        this.proxyState.getRealm$realm().checkIfValid();
        OsList modelList = this.proxyState.getRow$realm().getModelList(this.columnInfo.bankTransfersColKey);
        if (realmList2 == null || ((long) realmList2.size()) != modelList.size()) {
            modelList.removeAll();
            if (realmList2 != null) {
                int size = realmList2.size();
                for (int i = 0; i < size; i++) {
                    BankTransfer bankTransfer = realmList2.get(i);
                    this.proxyState.checkValidObject(bankTransfer);
                    modelList.addRow(((RealmObjectProxy) bankTransfer).realmGet$proxyState().getRow$realm().getObjectKey());
                }
                return;
            }
            return;
        }
        int size2 = realmList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            BankTransfer bankTransfer2 = realmList2.get(i2);
            this.proxyState.checkValidObject(bankTransfer2);
            modelList.setRow((long) i2, ((RealmObjectProxy) bankTransfer2).realmGet$proxyState().getRow$realm().getObjectKey());
        }
    }

    @Override // com.bca.smartbranch.data.localdb.User
    public void realmSet$creditCards(RealmList<CreditCard> realmList) {
        RealmList<CreditCard> realmList2 = realmList;
        if (this.proxyState.isUnderConstruction()) {
            if (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains("creditCards")) {
                realmList2 = realmList;
                if (realmList != null) {
                    realmList2 = realmList;
                    if (!realmList.isManaged()) {
                        Realm realm = (Realm) this.proxyState.getRealm$realm();
                        realmList2 = new RealmList<>();
                        Iterator<CreditCard> it = realmList.iterator();
                        while (it.hasNext()) {
                            CreditCard next = it.next();
                            if (next == null || RealmObject.isManaged(next)) {
                                realmList2.add(next);
                            } else {
                                realmList2.add((CreditCard) realm.copyToRealmOrUpdate((Realm) next, new ImportFlag[0]));
                            }
                        }
                    }
                }
            } else {
                return;
            }
        }
        this.proxyState.getRealm$realm().checkIfValid();
        OsList modelList = this.proxyState.getRow$realm().getModelList(this.columnInfo.creditCardsColKey);
        if (realmList2 == null || ((long) realmList2.size()) != modelList.size()) {
            modelList.removeAll();
            if (realmList2 != null) {
                int size = realmList2.size();
                for (int i = 0; i < size; i++) {
                    CreditCard creditCard = realmList2.get(i);
                    this.proxyState.checkValidObject(creditCard);
                    modelList.addRow(((RealmObjectProxy) creditCard).realmGet$proxyState().getRow$realm().getObjectKey());
                }
                return;
            }
            return;
        }
        int size2 = realmList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            CreditCard creditCard2 = realmList2.get(i2);
            this.proxyState.checkValidObject(creditCard2);
            modelList.setRow((long) i2, ((RealmObjectProxy) creditCard2).realmGet$proxyState().getRow$realm().getObjectKey());
        }
    }

    @Override // com.bca.smartbranch.data.localdb.User
    public void realmSet$eChannels(RealmList<EChannel> realmList) {
        RealmList<EChannel> realmList2 = realmList;
        if (this.proxyState.isUnderConstruction()) {
            if (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains("eChannels")) {
                realmList2 = realmList;
                if (realmList != null) {
                    realmList2 = realmList;
                    if (!realmList.isManaged()) {
                        Realm realm = (Realm) this.proxyState.getRealm$realm();
                        realmList2 = new RealmList<>();
                        Iterator<EChannel> it = realmList.iterator();
                        while (it.hasNext()) {
                            EChannel next = it.next();
                            if (next == null || RealmObject.isManaged(next)) {
                                realmList2.add(next);
                            } else {
                                realmList2.add((EChannel) realm.copyToRealmOrUpdate((Realm) next, new ImportFlag[0]));
                            }
                        }
                    }
                }
            } else {
                return;
            }
        }
        this.proxyState.getRealm$realm().checkIfValid();
        OsList modelList = this.proxyState.getRow$realm().getModelList(this.columnInfo.eChannelsColKey);
        if (realmList2 == null || ((long) realmList2.size()) != modelList.size()) {
            modelList.removeAll();
            if (realmList2 != null) {
                int size = realmList2.size();
                for (int i = 0; i < size; i++) {
                    EChannel eChannel = realmList2.get(i);
                    this.proxyState.checkValidObject(eChannel);
                    modelList.addRow(((RealmObjectProxy) eChannel).realmGet$proxyState().getRow$realm().getObjectKey());
                }
                return;
            }
            return;
        }
        int size2 = realmList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            EChannel eChannel2 = realmList2.get(i2);
            this.proxyState.checkValidObject(eChannel2);
            modelList.setRow((long) i2, ((RealmObjectProxy) eChannel2).realmGet$proxyState().getRow$realm().getObjectKey());
        }
    }

    @Override // com.bca.smartbranch.data.localdb.User
    public void realmSet$email(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            throw new RealmException("Primary key field 'email' cannot be changed after object was created.");
        }
    }

    @Override // com.bca.smartbranch.data.localdb.User
    public void realmSet$idNum(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.idNumColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.idNumColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.idNumColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.idNumColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.User
    public void realmSet$idType(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.idTypeColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.idTypeColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.idTypeColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.idTypeColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.User
    public void realmSet$imei(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.imeiColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.imeiColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.imeiColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.imeiColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.User
    public void realmSet$isFlagContactKU(boolean z) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            this.proxyState.getRow$realm().setBoolean(this.columnInfo.isFlagContactKUColKey, z);
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            row$realm.getTable().setBoolean(this.columnInfo.isFlagContactKUColKey, row$realm.getObjectKey(), z, true);
        }
    }

    @Override // com.bca.smartbranch.data.localdb.User
    public void realmSet$isMember(boolean z) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            this.proxyState.getRow$realm().setBoolean(this.columnInfo.isMemberColKey, z);
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            row$realm.getTable().setBoolean(this.columnInfo.isMemberColKey, row$realm.getObjectKey(), z, true);
        }
    }

    @Override // com.bca.smartbranch.data.localdb.User
    public void realmSet$kirimanUangs(RealmList<KirimanUang> realmList) {
        RealmList<KirimanUang> realmList2 = realmList;
        if (this.proxyState.isUnderConstruction()) {
            if (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains("kirimanUangs")) {
                realmList2 = realmList;
                if (realmList != null) {
                    realmList2 = realmList;
                    if (!realmList.isManaged()) {
                        Realm realm = (Realm) this.proxyState.getRealm$realm();
                        realmList2 = new RealmList<>();
                        Iterator<KirimanUang> it = realmList.iterator();
                        while (it.hasNext()) {
                            KirimanUang next = it.next();
                            if (next == null || RealmObject.isManaged(next)) {
                                realmList2.add(next);
                            } else {
                                realmList2.add((KirimanUang) realm.copyToRealmOrUpdate((Realm) next, new ImportFlag[0]));
                            }
                        }
                    }
                }
            } else {
                return;
            }
        }
        this.proxyState.getRealm$realm().checkIfValid();
        OsList modelList = this.proxyState.getRow$realm().getModelList(this.columnInfo.kirimanUangsColKey);
        if (realmList2 == null || ((long) realmList2.size()) != modelList.size()) {
            modelList.removeAll();
            if (realmList2 != null) {
                int size = realmList2.size();
                for (int i = 0; i < size; i++) {
                    KirimanUang kirimanUang = realmList2.get(i);
                    this.proxyState.checkValidObject(kirimanUang);
                    modelList.addRow(((RealmObjectProxy) kirimanUang).realmGet$proxyState().getRow$realm().getObjectKey());
                }
                return;
            }
            return;
        }
        int size2 = realmList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            KirimanUang kirimanUang2 = realmList2.get(i2);
            this.proxyState.checkValidObject(kirimanUang2);
            modelList.setRow((long) i2, ((RealmObjectProxy) kirimanUang2).realmGet$proxyState().getRow$realm().getObjectKey());
        }
    }

    @Override // com.bca.smartbranch.data.localdb.User
    public void realmSet$klirings(RealmList<Kliring> realmList) {
        RealmList<Kliring> realmList2 = realmList;
        if (this.proxyState.isUnderConstruction()) {
            if (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains("klirings")) {
                realmList2 = realmList;
                if (realmList != null) {
                    realmList2 = realmList;
                    if (!realmList.isManaged()) {
                        Realm realm = (Realm) this.proxyState.getRealm$realm();
                        realmList2 = new RealmList<>();
                        Iterator<Kliring> it = realmList.iterator();
                        while (it.hasNext()) {
                            Kliring next = it.next();
                            if (next == null || RealmObject.isManaged(next)) {
                                realmList2.add(next);
                            } else {
                                realmList2.add((Kliring) realm.copyToRealmOrUpdate((Realm) next, new ImportFlag[0]));
                            }
                        }
                    }
                }
            } else {
                return;
            }
        }
        this.proxyState.getRealm$realm().checkIfValid();
        OsList modelList = this.proxyState.getRow$realm().getModelList(this.columnInfo.kliringsColKey);
        if (realmList2 == null || ((long) realmList2.size()) != modelList.size()) {
            modelList.removeAll();
            if (realmList2 != null) {
                int size = realmList2.size();
                for (int i = 0; i < size; i++) {
                    Kliring kliring = realmList2.get(i);
                    this.proxyState.checkValidObject(kliring);
                    modelList.addRow(((RealmObjectProxy) kliring).realmGet$proxyState().getRow$realm().getObjectKey());
                }
                return;
            }
            return;
        }
        int size2 = realmList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            Kliring kliring2 = realmList2.get(i2);
            this.proxyState.checkValidObject(kliring2);
            modelList.setRow((long) i2, ((RealmObjectProxy) kliring2).realmGet$proxyState().getRow$realm().getObjectKey());
        }
    }

    @Override // com.bca.smartbranch.data.localdb.User
    public void realmSet$membership(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.membershipColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.membershipColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.membershipColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.membershipColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.User
    public void realmSet$name(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.nameColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.nameColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.nameColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.nameColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.User
    public void realmSet$noHandphone(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.noHandphoneColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.noHandphoneColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.noHandphoneColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.noHandphoneColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.User
    public void realmSet$sessionId(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.sessionIdColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.sessionIdColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.sessionIdColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.sessionIdColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.User
    public void realmSet$setorans(RealmList<Setoran> realmList) {
        RealmList<Setoran> realmList2 = realmList;
        if (this.proxyState.isUnderConstruction()) {
            if (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains("setorans")) {
                realmList2 = realmList;
                if (realmList != null) {
                    realmList2 = realmList;
                    if (!realmList.isManaged()) {
                        Realm realm = (Realm) this.proxyState.getRealm$realm();
                        realmList2 = new RealmList<>();
                        Iterator<Setoran> it = realmList.iterator();
                        while (it.hasNext()) {
                            Setoran next = it.next();
                            if (next == null || RealmObject.isManaged(next)) {
                                realmList2.add(next);
                            } else {
                                realmList2.add((Setoran) realm.copyToRealmOrUpdate((Realm) next, new ImportFlag[0]));
                            }
                        }
                    }
                }
            } else {
                return;
            }
        }
        this.proxyState.getRealm$realm().checkIfValid();
        OsList modelList = this.proxyState.getRow$realm().getModelList(this.columnInfo.setoransColKey);
        if (realmList2 == null || ((long) realmList2.size()) != modelList.size()) {
            modelList.removeAll();
            if (realmList2 != null) {
                int size = realmList2.size();
                for (int i = 0; i < size; i++) {
                    Setoran setoran = realmList2.get(i);
                    this.proxyState.checkValidObject(setoran);
                    modelList.addRow(((RealmObjectProxy) setoran).realmGet$proxyState().getRow$realm().getObjectKey());
                }
                return;
            }
            return;
        }
        int size2 = realmList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            Setoran setoran2 = realmList2.get(i2);
            this.proxyState.checkValidObject(setoran2);
            modelList.setRow((long) i2, ((RealmObjectProxy) setoran2).realmGet$proxyState().getRow$realm().getObjectKey());
        }
    }

    @Override // com.bca.smartbranch.data.localdb.User
    public void realmSet$tarikans(RealmList<Tarikan> realmList) {
        RealmList<Tarikan> realmList2 = realmList;
        if (this.proxyState.isUnderConstruction()) {
            if (this.proxyState.getAcceptDefaultValue$realm() && !this.proxyState.getExcludeFields$realm().contains("tarikans")) {
                realmList2 = realmList;
                if (realmList != null) {
                    realmList2 = realmList;
                    if (!realmList.isManaged()) {
                        Realm realm = (Realm) this.proxyState.getRealm$realm();
                        realmList2 = new RealmList<>();
                        Iterator<Tarikan> it = realmList.iterator();
                        while (it.hasNext()) {
                            Tarikan next = it.next();
                            if (next == null || RealmObject.isManaged(next)) {
                                realmList2.add(next);
                            } else {
                                realmList2.add((Tarikan) realm.copyToRealmOrUpdate((Realm) next, new ImportFlag[0]));
                            }
                        }
                    }
                }
            } else {
                return;
            }
        }
        this.proxyState.getRealm$realm().checkIfValid();
        OsList modelList = this.proxyState.getRow$realm().getModelList(this.columnInfo.tarikansColKey);
        if (realmList2 == null || ((long) realmList2.size()) != modelList.size()) {
            modelList.removeAll();
            if (realmList2 != null) {
                int size = realmList2.size();
                for (int i = 0; i < size; i++) {
                    Tarikan tarikan = realmList2.get(i);
                    this.proxyState.checkValidObject(tarikan);
                    modelList.addRow(((RealmObjectProxy) tarikan).realmGet$proxyState().getRow$realm().getObjectKey());
                }
                return;
            }
            return;
        }
        int size2 = realmList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            Tarikan tarikan2 = realmList2.get(i2);
            this.proxyState.checkValidObject(tarikan2);
            modelList.setRow((long) i2, ((RealmObjectProxy) tarikan2).realmGet$proxyState().getRow$realm().getObjectKey());
        }
    }

    @Override // com.bca.smartbranch.data.localdb.User
    public void realmSet$userPhoto(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.userPhotoColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.userPhotoColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.userPhotoColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.userPhotoColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    @Override // com.bca.smartbranch.data.localdb.User
    public void realmSet$verified(String str) {
        if (!this.proxyState.isUnderConstruction()) {
            this.proxyState.getRealm$realm().checkIfValid();
            if (str == null) {
                this.proxyState.getRow$realm().setNull(this.columnInfo.verifiedColKey);
            } else {
                this.proxyState.getRow$realm().setString(this.columnInfo.verifiedColKey, str);
            }
        } else if (this.proxyState.getAcceptDefaultValue$realm()) {
            Row row$realm = this.proxyState.getRow$realm();
            if (str == null) {
                row$realm.getTable().setNull(this.columnInfo.verifiedColKey, row$realm.getObjectKey(), true);
            } else {
                row$realm.getTable().setString(this.columnInfo.verifiedColKey, row$realm.getObjectKey(), str, true);
            }
        }
    }

    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder sb = new StringBuilder("User = proxy[{email:");
        String str = "null";
        sb.append(realmGet$email() != null ? realmGet$email() : "null");
        sb.append("},{name:");
        sb.append(realmGet$name() != null ? realmGet$name() : "null");
        sb.append("},{noHandphone:");
        sb.append(realmGet$noHandphone() != null ? realmGet$noHandphone() : "null");
        sb.append("},{acctNo:");
        sb.append(realmGet$acctNo() != null ? realmGet$acctNo() : "null");
        sb.append("},{sessionId:");
        sb.append(realmGet$sessionId() != null ? realmGet$sessionId() : "null");
        sb.append("},{isMember:");
        sb.append(realmGet$isMember());
        sb.append("},{verified:");
        sb.append(realmGet$verified() != null ? realmGet$verified() : "null");
        sb.append("},{idType:");
        sb.append(realmGet$idType() != null ? realmGet$idType() : "null");
        sb.append("},{idNum:");
        sb.append(realmGet$idNum() != null ? realmGet$idNum() : "null");
        sb.append("},{userPhoto:");
        sb.append(realmGet$userPhoto() != null ? realmGet$userPhoto() : "null");
        sb.append("},{imei:");
        sb.append(realmGet$imei() != null ? realmGet$imei() : "null");
        sb.append("},{membership:");
        if (realmGet$membership() != null) {
            str = realmGet$membership();
        }
        sb.append(str);
        sb.append("},{isFlagContactKU:");
        sb.append(realmGet$isFlagContactKU());
        sb.append("},{accounts:RealmList<Account>[");
        sb.append(realmGet$accounts().size());
        sb.append("]},{setorans:RealmList<Setoran>[");
        sb.append(realmGet$setorans().size());
        sb.append("]},{tarikans:RealmList<Tarikan>[");
        sb.append(realmGet$tarikans().size());
        sb.append("]},{kirimanUangs:RealmList<KirimanUang>[");
        sb.append(realmGet$kirimanUangs().size());
        sb.append("]},{klirings:RealmList<Kliring>[");
        sb.append(realmGet$klirings().size());
        sb.append("]},{creditCards:RealmList<CreditCard>[");
        sb.append(realmGet$creditCards().size());
        sb.append("]},{eChannels:RealmList<EChannel>[");
        sb.append(realmGet$eChannels().size());
        sb.append("]},{bankTransfers:RealmList<BankTransfer>[");
        sb.append(realmGet$bankTransfers().size());
        sb.append("]}]");
        return sb.toString();
    }
}
