package io.realm;

import android.graphics.Color;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.JsonReader;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.bca.smartbranch.data.localdb.Account;
import com.bca.smartbranch.data.localdb.BankTransfer;
import com.bca.smartbranch.data.localdb.BankTransferPenerima;
import com.bca.smartbranch.data.localdb.CCOtherBankAccount;
import com.bca.smartbranch.data.localdb.CCOtherBankCreditCard;
import com.bca.smartbranch.data.localdb.Category;
import com.bca.smartbranch.data.localdb.CreditCard;
import com.bca.smartbranch.data.localdb.CreditCardOptions;
import com.bca.smartbranch.data.localdb.CreditCardSupplement;
import com.bca.smartbranch.data.localdb.EChannel;
import com.bca.smartbranch.data.localdb.KirimanUang;
import com.bca.smartbranch.data.localdb.Kliring;
import com.bca.smartbranch.data.localdb.ListFormTeller;
import com.bca.smartbranch.data.localdb.ReservasiOnline;
import com.bca.smartbranch.data.localdb.Setoran;
import com.bca.smartbranch.data.localdb.Tarikan;
import com.bca.smartbranch.data.localdb.User;
import com.bca.smartbranch.data.localdb.Warkat;
import io.realm.BaseRealm;
import io.realm.annotations.RealmModule;
import io.realm.com_bca_smartbranch_data_localdb_AccountRealmProxy;
import io.realm.com_bca_smartbranch_data_localdb_BankTransferPenerimaRealmProxy;
import io.realm.com_bca_smartbranch_data_localdb_BankTransferRealmProxy;
import io.realm.com_bca_smartbranch_data_localdb_CCOtherBankAccountRealmProxy;
import io.realm.com_bca_smartbranch_data_localdb_CCOtherBankCreditCardRealmProxy;
import io.realm.com_bca_smartbranch_data_localdb_CategoryRealmProxy;
import io.realm.com_bca_smartbranch_data_localdb_CreditCardOptionsRealmProxy;
import io.realm.com_bca_smartbranch_data_localdb_CreditCardRealmProxy;
import io.realm.com_bca_smartbranch_data_localdb_CreditCardSupplementRealmProxy;
import io.realm.com_bca_smartbranch_data_localdb_EChannelRealmProxy;
import io.realm.com_bca_smartbranch_data_localdb_KirimanUangRealmProxy;
import io.realm.com_bca_smartbranch_data_localdb_KliringRealmProxy;
import io.realm.com_bca_smartbranch_data_localdb_ListFormTellerRealmProxy;
import io.realm.com_bca_smartbranch_data_localdb_ReservasiOnlineRealmProxy;
import io.realm.com_bca_smartbranch_data_localdb_SetoranRealmProxy;
import io.realm.com_bca_smartbranch_data_localdb_TarikanRealmProxy;
import io.realm.com_bca_smartbranch_data_localdb_UserRealmProxy;
import io.realm.com_bca_smartbranch_data_localdb_WarkatRealmProxy;
import io.realm.internal.ColumnInfo;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.Property;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.RealmProxyMediator;
import io.realm.internal.Row;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o.CC23BFormKartuKreditFragment;
import o.CC25AFormKartuKreditFragment;
import o.setHasDecor$MediaBrowserCompat$MediaItem;
import o.setMinWidth$MediaBrowserCompat$CustomActionResultReceiver;
import org.json.JSONException;
import org.json.JSONObject;
@RealmModule
/* loaded from: classes-dex2jar.jar:io/realm/DefaultRealmModuleMediator.class */
class DefaultRealmModuleMediator extends RealmProxyMediator {
    private static final Set<Class<? extends RealmModel>> MODEL_CLASSES;
    private static boolean a = false;
    private static int b = 0;
    private static boolean c = false;
    private static int[] d;
    private static char[] e;
    private static int g = 0;
    private static int i = 1;

    static {
        try {
            b();
            HashSet hashSet = new HashSet(18);
            hashSet.add(Category.class);
            hashSet.add(Setoran.class);
            hashSet.add(CreditCard.class);
            hashSet.add(CreditCardOptions.class);
            hashSet.add(EChannel.class);
            hashSet.add(User.class);
            hashSet.add(Tarikan.class);
            hashSet.add(Account.class);
            hashSet.add(Kliring.class);
            hashSet.add(CCOtherBankCreditCard.class);
            hashSet.add(Warkat.class);
            hashSet.add(BankTransfer.class);
            hashSet.add(BankTransferPenerima.class);
            hashSet.add(CCOtherBankAccount.class);
            hashSet.add(KirimanUang.class);
            hashSet.add(ReservasiOnline.class);
            hashSet.add(ListFormTeller.class);
            hashSet.add(CreditCardSupplement.class);
            MODEL_CLASSES = Collections.unmodifiableSet(hashSet);
            i = (g + 41) % Property.TYPE_ARRAY;
        } catch (Exception e2) {
            throw e2;
        }
    }

    DefaultRealmModuleMediator() {
    }

    private static void a(int i2, int[] iArr, char[] cArr, byte[] bArr, Object[] objArr) {
        synchronized (CC25AFormKartuKreditFragment.d) {
            char[] cArr2 = e;
            int i3 = b;
            if (c) {
                int length = bArr.length;
                CC25AFormKartuKreditFragment.b = length;
                char[] cArr3 = new char[length];
                CC25AFormKartuKreditFragment.e = 0;
                while (CC25AFormKartuKreditFragment.e < CC25AFormKartuKreditFragment.b) {
                    cArr3[CC25AFormKartuKreditFragment.e] = (char) ((char) (cArr2[bArr[(CC25AFormKartuKreditFragment.b - 1) - CC25AFormKartuKreditFragment.e] + i2] - i3));
                    CC25AFormKartuKreditFragment.e++;
                }
                objArr[0] = new String(cArr3);
            } else if (a) {
                int length2 = cArr.length;
                CC25AFormKartuKreditFragment.b = length2;
                char[] cArr4 = new char[length2];
                CC25AFormKartuKreditFragment.e = 0;
                while (CC25AFormKartuKreditFragment.e < CC25AFormKartuKreditFragment.b) {
                    cArr4[CC25AFormKartuKreditFragment.e] = (char) ((char) (cArr2[cArr[(CC25AFormKartuKreditFragment.b - 1) - CC25AFormKartuKreditFragment.e] - i2] - i3));
                    CC25AFormKartuKreditFragment.e++;
                }
                objArr[0] = new String(cArr4);
            } else {
                int length3 = iArr.length;
                CC25AFormKartuKreditFragment.b = length3;
                char[] cArr5 = new char[length3];
                CC25AFormKartuKreditFragment.e = 0;
                while (CC25AFormKartuKreditFragment.e < CC25AFormKartuKreditFragment.b) {
                    cArr5[CC25AFormKartuKreditFragment.e] = (char) ((char) (cArr2[iArr[(CC25AFormKartuKreditFragment.b - 1) - CC25AFormKartuKreditFragment.e] - i2] - i3));
                    CC25AFormKartuKreditFragment.e++;
                }
                objArr[0] = new String(cArr5);
            }
        }
    }

    static void b() {
        d = new int[]{1000085983, -915942520, 1248204720, 1085225920, 1937312916, 1908116896, 1119501335, 1931740758, -1998948866, 52330464, -119818393, -1416266591, -784562682, 904963205, -747106680, -1251207334, 296348606, 336145664};
        c = true;
        e = new char[]{271, 283, 281, 218, 270, 269, 287, 286, 288, 282, 276, 272, 280, 248, 277, 242, 256, 273, 238, 279, 274, 259, 239, 251, 247, 275, 237, 289, 257, 241, 255};
        a = true;
        b = 172;
    }

    private static void c(int[] iArr, int i2, Object[] objArr) {
        String str;
        synchronized (CC23BFormKartuKreditFragment.c) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) d.clone();
            CC23BFormKartuKreditFragment.e = 0;
            while (CC23BFormKartuKreditFragment.e < iArr.length) {
                cArr[0] = (char) ((char) (iArr[CC23BFormKartuKreditFragment.e] >> 16));
                cArr[1] = (char) ((char) iArr[CC23BFormKartuKreditFragment.e]);
                cArr[2] = (char) ((char) (iArr[CC23BFormKartuKreditFragment.e + 1] >> 16));
                cArr[3] = (char) ((char) iArr[CC23BFormKartuKreditFragment.e + 1]);
                CC23BFormKartuKreditFragment.d = (cArr[0] << 16) + cArr[1];
                CC23BFormKartuKreditFragment.b = (cArr[2] << 16) + cArr[3];
                CC23BFormKartuKreditFragment.d(iArr2);
                for (int i3 = 0; i3 < 16; i3++) {
                    int i4 = CC23BFormKartuKreditFragment.d ^ iArr2[i3];
                    CC23BFormKartuKreditFragment.d = i4;
                    CC23BFormKartuKreditFragment.b = CC23BFormKartuKreditFragment.a(i4) ^ CC23BFormKartuKreditFragment.b;
                    int i5 = CC23BFormKartuKreditFragment.d;
                    CC23BFormKartuKreditFragment.d = CC23BFormKartuKreditFragment.b;
                    CC23BFormKartuKreditFragment.b = i5;
                }
                int i6 = CC23BFormKartuKreditFragment.d;
                CC23BFormKartuKreditFragment.d = CC23BFormKartuKreditFragment.b;
                CC23BFormKartuKreditFragment.b = i6;
                CC23BFormKartuKreditFragment.b = i6 ^ iArr2[16];
                CC23BFormKartuKreditFragment.d ^= iArr2[17];
                int i7 = CC23BFormKartuKreditFragment.d;
                int i8 = CC23BFormKartuKreditFragment.b;
                cArr[0] = (char) ((char) (CC23BFormKartuKreditFragment.d >>> 16));
                cArr[1] = (char) ((char) CC23BFormKartuKreditFragment.d);
                cArr[2] = (char) ((char) (CC23BFormKartuKreditFragment.b >>> 16));
                cArr[3] = (char) ((char) CC23BFormKartuKreditFragment.b);
                CC23BFormKartuKreditFragment.d(iArr2);
                cArr2[CC23BFormKartuKreditFragment.e << 1] = (char) cArr[0];
                cArr2[(CC23BFormKartuKreditFragment.e << 1) + 1] = (char) cArr[1];
                cArr2[(CC23BFormKartuKreditFragment.e << 1) + 2] = (char) cArr[2];
                cArr2[(CC23BFormKartuKreditFragment.e << 1) + 3] = (char) cArr[3];
                CC23BFormKartuKreditFragment.e += 2;
            }
            str = new String(cArr2, 0, i2);
        }
        objArr[0] = str;
    }

    @Override // io.realm.internal.RealmProxyMediator
    public <E extends RealmModel> E copyOrUpdate(Realm realm, E e2, boolean z, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        Class<?> cls;
        if (e2 instanceof RealmObjectProxy) {
            i = (g + 115) % Property.TYPE_ARRAY;
            cls = e2.getClass().getSuperclass();
        } else {
            cls = e2.getClass();
        }
        if ((cls.equals(Category.class) ? (char) 21 : 3) != 3) {
            return (E) ((RealmModel) cls.cast(com_bca_smartbranch_data_localdb_CategoryRealmProxy.copyOrUpdate(realm, (com_bca_smartbranch_data_localdb_CategoryRealmProxy.CategoryColumnInfo) realm.getSchema().getColumnInfo(Category.class), (Category) e2, z, map, set)));
        }
        boolean z2 = false;
        if (!(!cls.equals(Setoran.class))) {
            int i2 = g + 61;
            i = i2 % Property.TYPE_ARRAY;
            if (i2 % 2 != 0) {
                return (E) ((RealmModel) cls.cast(com_bca_smartbranch_data_localdb_SetoranRealmProxy.copyOrUpdate(realm, (com_bca_smartbranch_data_localdb_SetoranRealmProxy.SetoranColumnInfo) realm.getSchema().getColumnInfo(Setoran.class), (Setoran) e2, z, map, set)));
            }
            RealmModel realmModel = (RealmModel) cls.cast(com_bca_smartbranch_data_localdb_SetoranRealmProxy.copyOrUpdate(realm, (com_bca_smartbranch_data_localdb_SetoranRealmProxy.SetoranColumnInfo) realm.getSchema().getColumnInfo(Setoran.class), (Setoran) e2, z, map, set));
            throw new ArithmeticException("divide by zero");
        } else if (cls.equals(CreditCard.class)) {
            return (E) ((RealmModel) cls.cast(com_bca_smartbranch_data_localdb_CreditCardRealmProxy.copyOrUpdate(realm, (com_bca_smartbranch_data_localdb_CreditCardRealmProxy.CreditCardColumnInfo) realm.getSchema().getColumnInfo(CreditCard.class), (CreditCard) e2, z, map, set)));
        } else {
            if (cls.equals(CreditCardOptions.class)) {
                i = (g + 33) % Property.TYPE_ARRAY;
                return (E) ((RealmModel) cls.cast(com_bca_smartbranch_data_localdb_CreditCardOptionsRealmProxy.copyOrUpdate(realm, (com_bca_smartbranch_data_localdb_CreditCardOptionsRealmProxy.CreditCardOptionsColumnInfo) realm.getSchema().getColumnInfo(CreditCardOptions.class), (CreditCardOptions) e2, z, map, set)));
            }
            char c2 = 'Z';
            if ((cls.equals(EChannel.class) ? 3 : 'Z') == 3) {
                return (E) ((RealmModel) cls.cast(com_bca_smartbranch_data_localdb_EChannelRealmProxy.copyOrUpdate(realm, (com_bca_smartbranch_data_localdb_EChannelRealmProxy.EChannelColumnInfo) realm.getSchema().getColumnInfo(EChannel.class), (EChannel) e2, z, map, set)));
            }
            if ((cls.equals(User.class) ? 'B' : 20) == 'B') {
                int i3 = i + 53;
                g = i3 % Property.TYPE_ARRAY;
                if (i3 % 2 == 0) {
                    return (E) ((RealmModel) cls.cast(com_bca_smartbranch_data_localdb_UserRealmProxy.copyOrUpdate(realm, (com_bca_smartbranch_data_localdb_UserRealmProxy.UserColumnInfo) realm.getSchema().getColumnInfo(User.class), (User) e2, z, map, set)));
                }
                RealmModel realmModel2 = (RealmModel) cls.cast(com_bca_smartbranch_data_localdb_UserRealmProxy.copyOrUpdate(realm, (com_bca_smartbranch_data_localdb_UserRealmProxy.UserColumnInfo) realm.getSchema().getColumnInfo(User.class), (User) e2, z, map, set));
                throw new ArithmeticException("divide by zero");
            } else if (cls.equals(Tarikan.class)) {
                return (E) ((RealmModel) cls.cast(com_bca_smartbranch_data_localdb_TarikanRealmProxy.copyOrUpdate(realm, (com_bca_smartbranch_data_localdb_TarikanRealmProxy.TarikanColumnInfo) realm.getSchema().getColumnInfo(Tarikan.class), (Tarikan) e2, z, map, set)));
            } else {
                if (cls.equals(Account.class)) {
                    i = (g + setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cz) % Property.TYPE_ARRAY;
                    return (E) ((RealmModel) cls.cast(com_bca_smartbranch_data_localdb_AccountRealmProxy.copyOrUpdate(realm, (com_bca_smartbranch_data_localdb_AccountRealmProxy.AccountColumnInfo) realm.getSchema().getColumnInfo(Account.class), (Account) e2, z, map, set)));
                } else if (cls.equals(Kliring.class)) {
                    return (E) ((RealmModel) cls.cast(com_bca_smartbranch_data_localdb_KliringRealmProxy.copyOrUpdate(realm, (com_bca_smartbranch_data_localdb_KliringRealmProxy.KliringColumnInfo) realm.getSchema().getColumnInfo(Kliring.class), (Kliring) e2, z, map, set)));
                } else {
                    if (cls.equals(CCOtherBankCreditCard.class)) {
                        E e3 = (E) ((RealmModel) cls.cast(com_bca_smartbranch_data_localdb_CCOtherBankCreditCardRealmProxy.copyOrUpdate(realm, (com_bca_smartbranch_data_localdb_CCOtherBankCreditCardRealmProxy.CCOtherBankCreditCardColumnInfo) realm.getSchema().getColumnInfo(CCOtherBankCreditCard.class), (CCOtherBankCreditCard) e2, z, map, set)));
                        int i4 = i + 19;
                        g = i4 % Property.TYPE_ARRAY;
                        if (i4 % 2 == 0) {
                            return e3;
                        }
                        throw new ArithmeticException("divide by zero");
                    }
                    if (!(!cls.equals(Warkat.class))) {
                        return (E) ((RealmModel) cls.cast(com_bca_smartbranch_data_localdb_WarkatRealmProxy.copyOrUpdate(realm, (com_bca_smartbranch_data_localdb_WarkatRealmProxy.WarkatColumnInfo) realm.getSchema().getColumnInfo(Warkat.class), (Warkat) e2, z, map, set)));
                    }
                    if (cls.equals(BankTransfer.class)) {
                        return (E) ((RealmModel) cls.cast(com_bca_smartbranch_data_localdb_BankTransferRealmProxy.copyOrUpdate(realm, (com_bca_smartbranch_data_localdb_BankTransferRealmProxy.BankTransferColumnInfo) realm.getSchema().getColumnInfo(BankTransfer.class), (BankTransfer) e2, z, map, set)));
                    }
                    if (cls.equals(BankTransferPenerima.class)) {
                        z2 = true;
                    }
                    if (!z2) {
                        if (!cls.equals(CCOtherBankAccount.class)) {
                            c2 = 'J';
                        }
                        if (c2 != 'J') {
                            return (E) ((RealmModel) cls.cast(com_bca_smartbranch_data_localdb_CCOtherBankAccountRealmProxy.copyOrUpdate(realm, (com_bca_smartbranch_data_localdb_CCOtherBankAccountRealmProxy.CCOtherBankAccountColumnInfo) realm.getSchema().getColumnInfo(CCOtherBankAccount.class), (CCOtherBankAccount) e2, z, map, set)));
                        }
                        if (cls.equals(KirimanUang.class)) {
                            return (E) ((RealmModel) cls.cast(com_bca_smartbranch_data_localdb_KirimanUangRealmProxy.copyOrUpdate(realm, (com_bca_smartbranch_data_localdb_KirimanUangRealmProxy.KirimanUangColumnInfo) realm.getSchema().getColumnInfo(KirimanUang.class), (KirimanUang) e2, z, map, set)));
                        }
                        if (cls.equals(ReservasiOnline.class)) {
                            i = (g + setHasDecor$MediaBrowserCompat$MediaItem.aJ) % Property.TYPE_ARRAY;
                            return (E) ((RealmModel) cls.cast(com_bca_smartbranch_data_localdb_ReservasiOnlineRealmProxy.copyOrUpdate(realm, (com_bca_smartbranch_data_localdb_ReservasiOnlineRealmProxy.ReservasiOnlineColumnInfo) realm.getSchema().getColumnInfo(ReservasiOnline.class), (ReservasiOnline) e2, z, map, set)));
                        } else if (cls.equals(ListFormTeller.class)) {
                            g = (i + 91) % Property.TYPE_ARRAY;
                            try {
                                return (E) ((RealmModel) cls.cast(com_bca_smartbranch_data_localdb_ListFormTellerRealmProxy.copyOrUpdate(realm, (com_bca_smartbranch_data_localdb_ListFormTellerRealmProxy.ListFormTellerColumnInfo) realm.getSchema().getColumnInfo(ListFormTeller.class), (ListFormTeller) e2, z, map, set)));
                            } catch (Exception e4) {
                                throw e4;
                            }
                        } else {
                            if ((cls.equals(CreditCardSupplement.class) ? ' ' : '[') != '[') {
                                return (E) ((RealmModel) cls.cast(com_bca_smartbranch_data_localdb_CreditCardSupplementRealmProxy.copyOrUpdate(realm, (com_bca_smartbranch_data_localdb_CreditCardSupplementRealmProxy.CreditCardSupplementColumnInfo) realm.getSchema().getColumnInfo(CreditCardSupplement.class), (CreditCardSupplement) e2, z, map, set)));
                            }
                            throw getMissingProxyClassException((Class<? extends RealmModel>) cls);
                        }
                    } else {
                        i = (g + 93) % Property.TYPE_ARRAY;
                        return (E) ((RealmModel) cls.cast(com_bca_smartbranch_data_localdb_BankTransferPenerimaRealmProxy.copyOrUpdate(realm, (com_bca_smartbranch_data_localdb_BankTransferPenerimaRealmProxy.BankTransferPenerimaColumnInfo) realm.getSchema().getColumnInfo(BankTransferPenerima.class), (BankTransferPenerima) e2, z, map, set)));
                    }
                }
            }
        }
    }

    @Override // io.realm.internal.RealmProxyMediator
    public ColumnInfo createColumnInfo(Class<? extends RealmModel> cls, OsSchemaInfo osSchemaInfo) {
        g = (i + 39) % Property.TYPE_ARRAY;
        checkClass(cls);
        if (cls.equals(Category.class)) {
            return com_bca_smartbranch_data_localdb_CategoryRealmProxy.createColumnInfo(osSchemaInfo);
        }
        if (cls.equals(Setoran.class)) {
            return com_bca_smartbranch_data_localdb_SetoranRealmProxy.createColumnInfo(osSchemaInfo);
        }
        try {
            if (cls.equals(CreditCard.class)) {
                i = (g + 17) % Property.TYPE_ARRAY;
                com_bca_smartbranch_data_localdb_CreditCardRealmProxy.CreditCardColumnInfo createColumnInfo = com_bca_smartbranch_data_localdb_CreditCardRealmProxy.createColumnInfo(osSchemaInfo);
                i = (g + setHasDecor$MediaBrowserCompat$MediaItem.aD) % Property.TYPE_ARRAY;
                return createColumnInfo;
            } else if (cls.equals(CreditCardOptions.class)) {
                try {
                    return com_bca_smartbranch_data_localdb_CreditCardOptionsRealmProxy.createColumnInfo(osSchemaInfo);
                } catch (Exception e2) {
                    throw e2;
                }
            } else if (cls.equals(EChannel.class)) {
                int i2 = g + 43;
                i = i2 % Property.TYPE_ARRAY;
                if (i2 % 2 != 0) {
                    return com_bca_smartbranch_data_localdb_EChannelRealmProxy.createColumnInfo(osSchemaInfo);
                }
                com_bca_smartbranch_data_localdb_EChannelRealmProxy.createColumnInfo(osSchemaInfo);
                throw new NullPointerException();
            } else if (cls.equals(User.class)) {
                i = (g + setHasDecor$MediaBrowserCompat$MediaItem.aD) % Property.TYPE_ARRAY;
                return com_bca_smartbranch_data_localdb_UserRealmProxy.createColumnInfo(osSchemaInfo);
            } else if (cls.equals(Tarikan.class)) {
                return com_bca_smartbranch_data_localdb_TarikanRealmProxy.createColumnInfo(osSchemaInfo);
            } else {
                if (cls.equals(Account.class)) {
                    g = (i + 115) % Property.TYPE_ARRAY;
                    return com_bca_smartbranch_data_localdb_AccountRealmProxy.createColumnInfo(osSchemaInfo);
                }
                if ((cls.equals(Kliring.class) ? (char) 17 : 27) == 17) {
                    i = (g + 13) % Property.TYPE_ARRAY;
                    return com_bca_smartbranch_data_localdb_KliringRealmProxy.createColumnInfo(osSchemaInfo);
                } else if (cls.equals(CCOtherBankCreditCard.class)) {
                    return com_bca_smartbranch_data_localdb_CCOtherBankCreditCardRealmProxy.createColumnInfo(osSchemaInfo);
                } else {
                    if (cls.equals(Warkat.class)) {
                        return com_bca_smartbranch_data_localdb_WarkatRealmProxy.createColumnInfo(osSchemaInfo);
                    }
                    if (cls.equals(BankTransfer.class)) {
                        return com_bca_smartbranch_data_localdb_BankTransferRealmProxy.createColumnInfo(osSchemaInfo);
                    }
                    if ((cls.equals(BankTransferPenerima.class) ? 'M' : 'Z') != 'Z') {
                        return com_bca_smartbranch_data_localdb_BankTransferPenerimaRealmProxy.createColumnInfo(osSchemaInfo);
                    }
                    if (cls.equals(CCOtherBankAccount.class)) {
                        return com_bca_smartbranch_data_localdb_CCOtherBankAccountRealmProxy.createColumnInfo(osSchemaInfo);
                    }
                    if (cls.equals(KirimanUang.class)) {
                        return com_bca_smartbranch_data_localdb_KirimanUangRealmProxy.createColumnInfo(osSchemaInfo);
                    }
                    if (cls.equals(ReservasiOnline.class)) {
                        return com_bca_smartbranch_data_localdb_ReservasiOnlineRealmProxy.createColumnInfo(osSchemaInfo);
                    }
                    if (!(!cls.equals(ListFormTeller.class))) {
                        return com_bca_smartbranch_data_localdb_ListFormTellerRealmProxy.createColumnInfo(osSchemaInfo);
                    }
                    if (cls.equals(CreditCardSupplement.class)) {
                        return com_bca_smartbranch_data_localdb_CreditCardSupplementRealmProxy.createColumnInfo(osSchemaInfo);
                    }
                    throw getMissingProxyClassException(cls);
                }
            }
        } catch (Exception e3) {
            throw e3;
        }
    }

    @Override // io.realm.internal.RealmProxyMediator
    public <E extends RealmModel> E createDetachedCopy(E e2, int i2, Map<RealmModel, RealmObjectProxy.CacheData<RealmModel>> map) {
        int i3 = g + setHasDecor$MediaBrowserCompat$MediaItem.aD;
        i = i3 % Property.TYPE_ARRAY;
        char c2 = '8';
        if (i3 % 2 == 0) {
            e2.getClass().getSuperclass().equals(Category.class);
            throw new ArithmeticException("divide by zero");
        }
        Class<? super Object> superclass = e2.getClass().getSuperclass();
        if (!superclass.equals(Category.class)) {
            c2 = '/';
        }
        if (c2 != '/') {
            return (E) ((RealmModel) superclass.cast(com_bca_smartbranch_data_localdb_CategoryRealmProxy.createDetachedCopy((Category) e2, 0, i2, map)));
        }
        try {
            if (superclass.equals(Setoran.class)) {
                int i4 = g + setHasDecor$MediaBrowserCompat$MediaItem.aM;
                i = i4 % Property.TYPE_ARRAY;
                return !(i4 % 2 == 0) ? (E) ((RealmModel) superclass.cast(com_bca_smartbranch_data_localdb_SetoranRealmProxy.createDetachedCopy((Setoran) e2, 0, i2, map))) : (E) ((RealmModel) superclass.cast(com_bca_smartbranch_data_localdb_SetoranRealmProxy.createDetachedCopy((Setoran) e2, 0, i2, map)));
            }
            if (!(!superclass.equals(CreditCard.class))) {
                return (E) ((RealmModel) superclass.cast(com_bca_smartbranch_data_localdb_CreditCardRealmProxy.createDetachedCopy((CreditCard) e2, 0, i2, map)));
            }
            if (superclass.equals(CreditCardOptions.class)) {
                int i5 = i + setHasDecor$MediaBrowserCompat$MediaItem.aI;
                g = i5 % Property.TYPE_ARRAY;
                return i5 % 2 != 0 ? (E) ((RealmModel) superclass.cast(com_bca_smartbranch_data_localdb_CreditCardOptionsRealmProxy.createDetachedCopy((CreditCardOptions) e2, 1, i2, map))) : (E) ((RealmModel) superclass.cast(com_bca_smartbranch_data_localdb_CreditCardOptionsRealmProxy.createDetachedCopy((CreditCardOptions) e2, 0, i2, map)));
            }
            if (superclass.equals(EChannel.class)) {
                return (E) ((RealmModel) superclass.cast(com_bca_smartbranch_data_localdb_EChannelRealmProxy.createDetachedCopy((EChannel) e2, 0, i2, map)));
            }
            if (!(!superclass.equals(User.class))) {
                return (E) ((RealmModel) superclass.cast(com_bca_smartbranch_data_localdb_UserRealmProxy.createDetachedCopy((User) e2, 0, i2, map)));
            }
            if (superclass.equals(Tarikan.class)) {
                return (E) ((RealmModel) superclass.cast(com_bca_smartbranch_data_localdb_TarikanRealmProxy.createDetachedCopy((Tarikan) e2, 0, i2, map)));
            }
            try {
                if (superclass.equals(Account.class)) {
                    i = (g + 47) % Property.TYPE_ARRAY;
                    return (E) ((RealmModel) superclass.cast(com_bca_smartbranch_data_localdb_AccountRealmProxy.createDetachedCopy((Account) e2, 0, i2, map)));
                }
                if ((superclass.equals(Kliring.class) ? '3' : 6) == '3') {
                    E e3 = (E) ((RealmModel) superclass.cast(com_bca_smartbranch_data_localdb_KliringRealmProxy.createDetachedCopy((Kliring) e2, 0, i2, map)));
                    i = (g + 31) % Property.TYPE_ARRAY;
                    return e3;
                } else if (superclass.equals(CCOtherBankCreditCard.class)) {
                    return (E) ((RealmModel) superclass.cast(com_bca_smartbranch_data_localdb_CCOtherBankCreditCardRealmProxy.createDetachedCopy((CCOtherBankCreditCard) e2, 0, i2, map)));
                } else {
                    if (superclass.equals(Warkat.class)) {
                        return (E) ((RealmModel) superclass.cast(com_bca_smartbranch_data_localdb_WarkatRealmProxy.createDetachedCopy((Warkat) e2, 0, i2, map)));
                    }
                    if (superclass.equals(BankTransfer.class)) {
                        return (E) ((RealmModel) superclass.cast(com_bca_smartbranch_data_localdb_BankTransferRealmProxy.createDetachedCopy((BankTransfer) e2, 0, i2, map)));
                    }
                    if (superclass.equals(BankTransferPenerima.class)) {
                        return (E) ((RealmModel) superclass.cast(com_bca_smartbranch_data_localdb_BankTransferPenerimaRealmProxy.createDetachedCopy((BankTransferPenerima) e2, 0, i2, map)));
                    }
                    if (superclass.equals(CCOtherBankAccount.class)) {
                        g = (i + 41) % Property.TYPE_ARRAY;
                        return (E) ((RealmModel) superclass.cast(com_bca_smartbranch_data_localdb_CCOtherBankAccountRealmProxy.createDetachedCopy((CCOtherBankAccount) e2, 0, i2, map)));
                    } else if (superclass.equals(KirimanUang.class)) {
                        g = (i + 29) % Property.TYPE_ARRAY;
                        return (E) ((RealmModel) superclass.cast(com_bca_smartbranch_data_localdb_KirimanUangRealmProxy.createDetachedCopy((KirimanUang) e2, 0, i2, map)));
                    } else if (superclass.equals(ReservasiOnline.class)) {
                        int i6 = g + 9;
                        i = i6 % Property.TYPE_ARRAY;
                        return i6 % 2 == 0 ? (E) ((RealmModel) superclass.cast(com_bca_smartbranch_data_localdb_ReservasiOnlineRealmProxy.createDetachedCopy((ReservasiOnline) e2, 1, i2, map))) : (E) ((RealmModel) superclass.cast(com_bca_smartbranch_data_localdb_ReservasiOnlineRealmProxy.createDetachedCopy((ReservasiOnline) e2, 0, i2, map)));
                    } else if (superclass.equals(ListFormTeller.class)) {
                        return (E) ((RealmModel) superclass.cast(com_bca_smartbranch_data_localdb_ListFormTellerRealmProxy.createDetachedCopy((ListFormTeller) e2, 0, i2, map)));
                    } else {
                        if ((superclass.equals(CreditCardSupplement.class) ? '>' : 'O') != 'O') {
                            g = (i + setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.ct) % Property.TYPE_ARRAY;
                            return (E) ((RealmModel) superclass.cast(com_bca_smartbranch_data_localdb_CreditCardSupplementRealmProxy.createDetachedCopy((CreditCardSupplement) e2, 0, i2, map)));
                        }
                        throw getMissingProxyClassException((Class<? extends RealmModel>) superclass);
                    }
                }
            } catch (Exception e4) {
                throw e4;
            }
        } catch (Exception e5) {
            throw e5;
        }
    }

    @Override // io.realm.internal.RealmProxyMediator
    public <E extends RealmModel> E createOrUpdateUsingJsonObject(Class<E> cls, Realm realm, JSONObject jSONObject, boolean z) throws JSONException {
        E e2;
        checkClass(cls);
        if (cls.equals(Category.class)) {
            return cls.cast(com_bca_smartbranch_data_localdb_CategoryRealmProxy.createOrUpdateUsingJsonObject(realm, jSONObject, z));
        }
        try {
            if (cls.equals(Setoran.class)) {
                return cls.cast(com_bca_smartbranch_data_localdb_SetoranRealmProxy.createOrUpdateUsingJsonObject(realm, jSONObject, z));
            }
            if (cls.equals(CreditCard.class)) {
                return cls.cast(com_bca_smartbranch_data_localdb_CreditCardRealmProxy.createOrUpdateUsingJsonObject(realm, jSONObject, z));
            }
            char c2 = 'B';
            if ((cls.equals(CreditCardOptions.class) ? 'B' : '*') != '*') {
                int i2 = g + 85;
                i = i2 % Property.TYPE_ARRAY;
                if (i2 % 2 == 0) {
                    e2 = cls.cast(com_bca_smartbranch_data_localdb_CreditCardOptionsRealmProxy.createOrUpdateUsingJsonObject(realm, jSONObject, z));
                    Object[] objArr = null;
                    int length = objArr.length;
                } else {
                    e2 = cls.cast(com_bca_smartbranch_data_localdb_CreditCardOptionsRealmProxy.createOrUpdateUsingJsonObject(realm, jSONObject, z));
                }
                return e2;
            } else if (cls.equals(EChannel.class)) {
                return cls.cast(com_bca_smartbranch_data_localdb_EChannelRealmProxy.createOrUpdateUsingJsonObject(realm, jSONObject, z));
            } else {
                if (cls.equals(User.class)) {
                    return cls.cast(com_bca_smartbranch_data_localdb_UserRealmProxy.createOrUpdateUsingJsonObject(realm, jSONObject, z));
                }
                if (cls.equals(Tarikan.class)) {
                    return cls.cast(com_bca_smartbranch_data_localdb_TarikanRealmProxy.createOrUpdateUsingJsonObject(realm, jSONObject, z));
                }
                if (cls.equals(Account.class)) {
                    g = (i + setHasDecor$MediaBrowserCompat$MediaItem.aM) % Property.TYPE_ARRAY;
                    return cls.cast(com_bca_smartbranch_data_localdb_AccountRealmProxy.createOrUpdateUsingJsonObject(realm, jSONObject, z));
                }
                boolean z2 = true;
                if (cls.equals(Kliring.class)) {
                    return cls.cast(com_bca_smartbranch_data_localdb_KliringRealmProxy.createOrUpdateUsingJsonObject(realm, jSONObject, z));
                }
                if ((cls.equals(CCOtherBankCreditCard.class) ? 'E' : '8') == 'E') {
                    return cls.cast(com_bca_smartbranch_data_localdb_CCOtherBankCreditCardRealmProxy.createOrUpdateUsingJsonObject(realm, jSONObject, z));
                }
                if (!cls.equals(Warkat.class)) {
                    c2 = 'P';
                }
                if (c2 != 'P') {
                    return cls.cast(com_bca_smartbranch_data_localdb_WarkatRealmProxy.createOrUpdateUsingJsonObject(realm, jSONObject, z));
                }
                if (cls.equals(BankTransfer.class)) {
                    return cls.cast(com_bca_smartbranch_data_localdb_BankTransferRealmProxy.createOrUpdateUsingJsonObject(realm, jSONObject, z));
                }
                if (cls.equals(BankTransferPenerima.class)) {
                    z2 = false;
                }
                if (!z2) {
                    return cls.cast(com_bca_smartbranch_data_localdb_BankTransferPenerimaRealmProxy.createOrUpdateUsingJsonObject(realm, jSONObject, z));
                }
                if ((cls.equals(CCOtherBankAccount.class) ? '`' : ',') == '`') {
                    return cls.cast(com_bca_smartbranch_data_localdb_CCOtherBankAccountRealmProxy.createOrUpdateUsingJsonObject(realm, jSONObject, z));
                }
                if (cls.equals(KirimanUang.class)) {
                    return cls.cast(com_bca_smartbranch_data_localdb_KirimanUangRealmProxy.createOrUpdateUsingJsonObject(realm, jSONObject, z));
                }
                if (cls.equals(ReservasiOnline.class)) {
                    E cast = cls.cast(com_bca_smartbranch_data_localdb_ReservasiOnlineRealmProxy.createOrUpdateUsingJsonObject(realm, jSONObject, z));
                    int i3 = i + setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.ct;
                    g = i3 % Property.TYPE_ARRAY;
                    if ((i3 % 2 != 0 ? ';' : '(') == '(') {
                        return cast;
                    }
                    throw new NullPointerException();
                }
                if ((cls.equals(ListFormTeller.class) ? (char) 28 : 29) != 29) {
                    int i4 = i + 99;
                    g = i4 % Property.TYPE_ARRAY;
                    if (i4 % 2 == 0) {
                        return cls.cast(com_bca_smartbranch_data_localdb_ListFormTellerRealmProxy.createOrUpdateUsingJsonObject(realm, jSONObject, z));
                    }
                    E cast2 = cls.cast(com_bca_smartbranch_data_localdb_ListFormTellerRealmProxy.createOrUpdateUsingJsonObject(realm, jSONObject, z));
                    Object[] objArr2 = null;
                    int length2 = objArr2.length;
                    return cast2;
                } else if (cls.equals(CreditCardSupplement.class)) {
                    int i5 = g + 33;
                    i = i5 % Property.TYPE_ARRAY;
                    if (i5 % 2 != 0) {
                        return cls.cast(com_bca_smartbranch_data_localdb_CreditCardSupplementRealmProxy.createOrUpdateUsingJsonObject(realm, jSONObject, z));
                    }
                    cls.cast(com_bca_smartbranch_data_localdb_CreditCardSupplementRealmProxy.createOrUpdateUsingJsonObject(realm, jSONObject, z));
                    throw new ArithmeticException("divide by zero");
                } else {
                    throw getMissingProxyClassException(cls);
                }
            }
        } catch (Exception e3) {
            throw e3;
        }
    }

    @Override // io.realm.internal.RealmProxyMediator
    public <E extends RealmModel> E createUsingJsonStream(Class<E> cls, Realm realm, JsonReader jsonReader) throws IOException {
        i = (g + 61) % Property.TYPE_ARRAY;
        checkClass(cls);
        if (cls.equals(Category.class)) {
            return cls.cast(com_bca_smartbranch_data_localdb_CategoryRealmProxy.createUsingJsonStream(realm, jsonReader));
        }
        if (cls.equals(Setoran.class)) {
            i = (g + 99) % Property.TYPE_ARRAY;
            return cls.cast(com_bca_smartbranch_data_localdb_SetoranRealmProxy.createUsingJsonStream(realm, jsonReader));
        } else if (cls.equals(CreditCard.class)) {
            return cls.cast(com_bca_smartbranch_data_localdb_CreditCardRealmProxy.createUsingJsonStream(realm, jsonReader));
        } else {
            if (cls.equals(CreditCardOptions.class)) {
                return cls.cast(com_bca_smartbranch_data_localdb_CreditCardOptionsRealmProxy.createUsingJsonStream(realm, jsonReader));
            }
            if (cls.equals(EChannel.class)) {
                g = (i + 13) % Property.TYPE_ARRAY;
                return cls.cast(com_bca_smartbranch_data_localdb_EChannelRealmProxy.createUsingJsonStream(realm, jsonReader));
            } else if (cls.equals(User.class)) {
                E cast = cls.cast(com_bca_smartbranch_data_localdb_UserRealmProxy.createUsingJsonStream(realm, jsonReader));
                i = (g + 67) % Property.TYPE_ARRAY;
                return cast;
            } else {
                if (cls.equals(Tarikan.class)) {
                    return cls.cast(com_bca_smartbranch_data_localdb_TarikanRealmProxy.createUsingJsonStream(realm, jsonReader));
                }
                if (cls.equals(Account.class)) {
                    return cls.cast(com_bca_smartbranch_data_localdb_AccountRealmProxy.createUsingJsonStream(realm, jsonReader));
                }
                if (cls.equals(Kliring.class)) {
                    E cast2 = cls.cast(com_bca_smartbranch_data_localdb_KliringRealmProxy.createUsingJsonStream(realm, jsonReader));
                    g = (i + setHasDecor$MediaBrowserCompat$MediaItem.aM) % Property.TYPE_ARRAY;
                    return cast2;
                }
                if (!(!cls.equals(CCOtherBankCreditCard.class))) {
                    return cls.cast(com_bca_smartbranch_data_localdb_CCOtherBankCreditCardRealmProxy.createUsingJsonStream(realm, jsonReader));
                }
                if ((cls.equals(Warkat.class) ? 'V' : '.') != '.') {
                    return cls.cast(com_bca_smartbranch_data_localdb_WarkatRealmProxy.createUsingJsonStream(realm, jsonReader));
                }
                try {
                    if ((cls.equals(BankTransfer.class) ? ')' : 'K') != ')') {
                        if (!(!cls.equals(BankTransferPenerima.class))) {
                            return cls.cast(com_bca_smartbranch_data_localdb_BankTransferPenerimaRealmProxy.createUsingJsonStream(realm, jsonReader));
                        }
                        if (cls.equals(CCOtherBankAccount.class)) {
                            return cls.cast(com_bca_smartbranch_data_localdb_CCOtherBankAccountRealmProxy.createUsingJsonStream(realm, jsonReader));
                        }
                        if (cls.equals(KirimanUang.class)) {
                            int i2 = g + 89;
                            i = i2 % Property.TYPE_ARRAY;
                            if (i2 % 2 != 0) {
                                return cls.cast(com_bca_smartbranch_data_localdb_KirimanUangRealmProxy.createUsingJsonStream(realm, jsonReader));
                            }
                            cls.cast(com_bca_smartbranch_data_localdb_KirimanUangRealmProxy.createUsingJsonStream(realm, jsonReader));
                            throw new ArithmeticException("divide by zero");
                        } else if (cls.equals(ReservasiOnline.class)) {
                            try {
                                i = (g + 85) % Property.TYPE_ARRAY;
                                return cls.cast(com_bca_smartbranch_data_localdb_ReservasiOnlineRealmProxy.createUsingJsonStream(realm, jsonReader));
                            } catch (Exception e2) {
                                throw e2;
                            }
                        } else if (cls.equals(ListFormTeller.class)) {
                            return cls.cast(com_bca_smartbranch_data_localdb_ListFormTellerRealmProxy.createUsingJsonStream(realm, jsonReader));
                        } else {
                            if (cls.equals(CreditCardSupplement.class)) {
                                return cls.cast(com_bca_smartbranch_data_localdb_CreditCardSupplementRealmProxy.createUsingJsonStream(realm, jsonReader));
                            }
                            throw getMissingProxyClassException(cls);
                        }
                    } else {
                        i = (g + 11) % Property.TYPE_ARRAY;
                        return cls.cast(com_bca_smartbranch_data_localdb_BankTransferRealmProxy.createUsingJsonStream(realm, jsonReader));
                    }
                } catch (Exception e3) {
                    throw e3;
                }
            }
        }
    }

    @Override // io.realm.internal.RealmProxyMediator
    public Class<? extends RealmModel> getClazzImpl(String str) {
        Class<Warkat> cls;
        checkClassName(str);
        if (str.equals("Category")) {
            return Category.class;
        }
        if (str.equals("Setoran")) {
            return Setoran.class;
        }
        boolean z = false;
        if (str.equals("CreditCard")) {
            return CreditCard.class;
        }
        if ((str.equals("CreditCardOptions") ? '_' : 'E') != 'E') {
            return CreditCardOptions.class;
        }
        if (str.equals("EChannel")) {
            i = (g + setHasDecor$MediaBrowserCompat$MediaItem.aD) % Property.TYPE_ARRAY;
            return EChannel.class;
        }
        if ((str.equals("User") ? 'S' : ';') == 'S') {
            return User.class;
        }
        if (str.equals("Tarikan")) {
            return Tarikan.class;
        }
        if (str.equals("Account")) {
            try {
                i = (g + 71) % Property.TYPE_ARRAY;
                return Account.class;
            } catch (Exception e2) {
                throw e2;
            }
        } else if (str.equals("Kliring")) {
            return Kliring.class;
        } else {
            if (str.equals("CCOtherBankCreditCard")) {
                int i2 = i + 17;
                g = i2 % Property.TYPE_ARRAY;
                if (i2 % 2 == 0) {
                    return CCOtherBankCreditCard.class;
                }
                Object[] objArr = null;
                int length = objArr.length;
                return CCOtherBankCreditCard.class;
            } else if (str.equals("Warkat")) {
                int i3 = g + 49;
                i = i3 % Property.TYPE_ARRAY;
                if (i3 % 2 == 0) {
                    cls = Warkat.class;
                    Object[] objArr2 = null;
                    int length2 = objArr2.length;
                } else {
                    cls = Warkat.class;
                }
                return cls;
            } else if (str.equals("BankTransfer")) {
                return BankTransfer.class;
            } else {
                if (str.equals("BankTransferPenerima")) {
                    return BankTransferPenerima.class;
                }
                if (str.equals("CCOtherBankAccount")) {
                    return CCOtherBankAccount.class;
                }
                if (str.equals("KirimanUang")) {
                    return KirimanUang.class;
                }
                if (str.equals("ReservasiOnline")) {
                    int i4 = g + 113;
                    i = i4 % Property.TYPE_ARRAY;
                    if (i4 % 2 != 0) {
                        return ReservasiOnline.class;
                    }
                    throw new NullPointerException();
                }
                if (str.equals("ListFormTeller")) {
                    return ListFormTeller.class;
                }
                if (str.equals("CreditCardSupplement")) {
                    z = true;
                }
                if (z) {
                    return CreditCardSupplement.class;
                }
                throw getMissingProxyClassException(str);
            }
        }
    }

    @Override // io.realm.internal.RealmProxyMediator
    public Map<Class<? extends RealmModel>, OsObjectSchemaInfo> getExpectedObjectSchemaInfoMap() {
        HashMap hashMap = new HashMap(18);
        hashMap.put(Category.class, com_bca_smartbranch_data_localdb_CategoryRealmProxy.getExpectedObjectSchemaInfo());
        hashMap.put(Setoran.class, com_bca_smartbranch_data_localdb_SetoranRealmProxy.getExpectedObjectSchemaInfo());
        hashMap.put(CreditCard.class, com_bca_smartbranch_data_localdb_CreditCardRealmProxy.getExpectedObjectSchemaInfo());
        hashMap.put(CreditCardOptions.class, com_bca_smartbranch_data_localdb_CreditCardOptionsRealmProxy.getExpectedObjectSchemaInfo());
        hashMap.put(EChannel.class, com_bca_smartbranch_data_localdb_EChannelRealmProxy.getExpectedObjectSchemaInfo());
        hashMap.put(User.class, com_bca_smartbranch_data_localdb_UserRealmProxy.getExpectedObjectSchemaInfo());
        hashMap.put(Tarikan.class, com_bca_smartbranch_data_localdb_TarikanRealmProxy.getExpectedObjectSchemaInfo());
        hashMap.put(Account.class, com_bca_smartbranch_data_localdb_AccountRealmProxy.getExpectedObjectSchemaInfo());
        hashMap.put(Kliring.class, com_bca_smartbranch_data_localdb_KliringRealmProxy.getExpectedObjectSchemaInfo());
        hashMap.put(CCOtherBankCreditCard.class, com_bca_smartbranch_data_localdb_CCOtherBankCreditCardRealmProxy.getExpectedObjectSchemaInfo());
        hashMap.put(Warkat.class, com_bca_smartbranch_data_localdb_WarkatRealmProxy.getExpectedObjectSchemaInfo());
        hashMap.put(BankTransfer.class, com_bca_smartbranch_data_localdb_BankTransferRealmProxy.getExpectedObjectSchemaInfo());
        hashMap.put(BankTransferPenerima.class, com_bca_smartbranch_data_localdb_BankTransferPenerimaRealmProxy.getExpectedObjectSchemaInfo());
        hashMap.put(CCOtherBankAccount.class, com_bca_smartbranch_data_localdb_CCOtherBankAccountRealmProxy.getExpectedObjectSchemaInfo());
        hashMap.put(KirimanUang.class, com_bca_smartbranch_data_localdb_KirimanUangRealmProxy.getExpectedObjectSchemaInfo());
        hashMap.put(ReservasiOnline.class, com_bca_smartbranch_data_localdb_ReservasiOnlineRealmProxy.getExpectedObjectSchemaInfo());
        hashMap.put(ListFormTeller.class, com_bca_smartbranch_data_localdb_ListFormTellerRealmProxy.getExpectedObjectSchemaInfo());
        hashMap.put(CreditCardSupplement.class, com_bca_smartbranch_data_localdb_CreditCardSupplementRealmProxy.getExpectedObjectSchemaInfo());
        g = (i + 41) % Property.TYPE_ARRAY;
        return hashMap;
    }

    @Override // io.realm.internal.RealmProxyMediator
    public Set<Class<? extends RealmModel>> getModelClasses() {
        g = (i + 15) % Property.TYPE_ARRAY;
        Set<Class<? extends RealmModel>> set = MODEL_CLASSES;
        try {
            int i2 = i + 61;
            try {
                g = i2 % Property.TYPE_ARRAY;
                if ((i2 % 2 != 0 ? 22 : '.') != 22) {
                    return set;
                }
                Object[] objArr = null;
                int length = objArr.length;
                return set;
            } catch (Exception e2) {
                throw e2;
            }
        } catch (Exception e3) {
            throw e3;
        }
    }

    @Override // io.realm.internal.RealmProxyMediator
    public String getSimpleClassNameImpl(Class<? extends RealmModel> cls) {
        checkClass(cls);
        if (cls.equals(Category.class)) {
            g = (i + 53) % Property.TYPE_ARRAY;
            return "Category";
        } else if (cls.equals(Setoran.class)) {
            return "Setoran";
        } else {
            if (cls.equals(CreditCard.class)) {
                int i2 = g + 85;
                i = i2 % Property.TYPE_ARRAY;
                if (i2 % 2 != 0) {
                    return "CreditCard";
                }
                Object[] objArr = null;
                int length = objArr.length;
                return "CreditCard";
            }
            try {
                if (cls.equals(CreditCardOptions.class)) {
                    i = (g + 21) % Property.TYPE_ARRAY;
                    return "CreditCardOptions";
                } else if (cls.equals(EChannel.class)) {
                    int i3 = i + 69;
                    g = i3 % Property.TYPE_ARRAY;
                    if (i3 % 2 != 0) {
                        throw new NullPointerException();
                    }
                    i = (g + 77) % Property.TYPE_ARRAY;
                    return "EChannel";
                } else {
                    boolean z = true;
                    boolean z2 = true;
                    if (cls.equals(User.class)) {
                        int i4 = i + 7;
                        g = i4 % Property.TYPE_ARRAY;
                        if (i4 % 2 != 0) {
                            z2 = false;
                        }
                        if (z2) {
                            return "User";
                        }
                        Object[] objArr2 = null;
                        int length2 = objArr2.length;
                        return "User";
                    } else if (cls.equals(Tarikan.class)) {
                        return "Tarikan";
                    } else {
                        if (cls.equals(Account.class)) {
                            i = (g + 33) % Property.TYPE_ARRAY;
                            return "Account";
                        } else if (cls.equals(Kliring.class)) {
                            return "Kliring";
                        } else {
                            if (cls.equals(CCOtherBankCreditCard.class)) {
                                int i5 = g + setHasDecor$MediaBrowserCompat$MediaItem.aJ;
                                i = i5 % Property.TYPE_ARRAY;
                                if ((i5 % 2 == 0 ? 'C' : '\r') != 'C') {
                                    return "CCOtherBankCreditCard";
                                }
                                throw new ArithmeticException("divide by zero");
                            }
                            if (!cls.equals(Warkat.class)) {
                                z = false;
                            }
                            if (z) {
                                return "Warkat";
                            }
                            if (cls.equals(BankTransfer.class)) {
                                int i6 = i + 45;
                                g = i6 % Property.TYPE_ARRAY;
                                if (i6 % 2 == 0) {
                                    return "BankTransfer";
                                }
                                throw new ArithmeticException("divide by zero");
                            }
                            if ((cls.equals(BankTransferPenerima.class) ? '0' : '/') == '0') {
                                return "BankTransferPenerima";
                            }
                            if (cls.equals(CCOtherBankAccount.class)) {
                                return "CCOtherBankAccount";
                            }
                            if (cls.equals(KirimanUang.class)) {
                                i = (g + 83) % Property.TYPE_ARRAY;
                                return "KirimanUang";
                            } else if (cls.equals(ReservasiOnline.class)) {
                                return "ReservasiOnline";
                            } else {
                                if (cls.equals(ListFormTeller.class)) {
                                    return "ListFormTeller";
                                }
                                if (cls.equals(CreditCardSupplement.class)) {
                                    return "CreditCardSupplement";
                                }
                                throw getMissingProxyClassException(cls);
                            }
                        }
                    }
                }
            } catch (Exception e2) {
                throw e2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a8, code lost:
        if ((!r0) != true) goto L_0x019d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b7, code lost:
        if (com.bca.smartbranch.data.localdb.Account.class.isAssignableFrom(r4) == false) goto L_0x00ba;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c0, code lost:
        if (com.bca.smartbranch.data.localdb.Kliring.class.isAssignableFrom(r4) != false) goto L_0x00c9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c3, code lost:
        r5 = 'F';
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c9, code lost:
        r5 = 'K';
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00cf, code lost:
        if (r5 == 'K') goto L_0x019d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d8, code lost:
        if (com.bca.smartbranch.data.localdb.Warkat.class.isAssignableFrom(r4) != false) goto L_0x019d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00e1, code lost:
        if (com.bca.smartbranch.data.localdb.BankTransfer.class.isAssignableFrom(r4) != false) goto L_0x019d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e4, code lost:
        r0 = io.realm.DefaultRealmModuleMediator.g + 47;
        io.realm.DefaultRealmModuleMediator.i = r0 % io.realm.internal.Property.TYPE_ARRAY;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00f6, code lost:
        if ((r0 % 2) != 0) goto L_0x010f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00f9, code lost:
        r0 = com.bca.smartbranch.data.localdb.BankTransferPenerima.class.isAssignableFrom(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0101, code lost:
        r0 = null;
        r0 = r0.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0106, code lost:
        if (r0 != false) goto L_0x019d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0115, code lost:
        if (com.bca.smartbranch.data.localdb.BankTransferPenerima.class.isAssignableFrom(r4) != false) goto L_0x019d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x011f, code lost:
        io.realm.DefaultRealmModuleMediator.g = (io.realm.DefaultRealmModuleMediator.i + 9) % io.realm.internal.Property.TYPE_ARRAY;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x012d, code lost:
        if (com.bca.smartbranch.data.localdb.KirimanUang.class.isAssignableFrom(r4) != false) goto L_0x019d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0130, code lost:
        r0 = io.realm.DefaultRealmModuleMediator.i + o.setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cB;
        io.realm.DefaultRealmModuleMediator.g = r0 % io.realm.internal.Property.TYPE_ARRAY;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0142, code lost:
        if ((r0 % 2) == 0) goto L_0x0157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0145, code lost:
        com.bca.smartbranch.data.localdb.ReservasiOnline.class.isAssignableFrom(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0153, code lost:
        throw new java.lang.NullPointerException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x015d, code lost:
        if (com.bca.smartbranch.data.localdb.ReservasiOnline.class.isAssignableFrom(r4) != false) goto L_0x0166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0160, code lost:
        r5 = 31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0166, code lost:
        r5 = 'b';
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x016c, code lost:
        if (r5 == 31) goto L_0x0172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0178, code lost:
        if (com.bca.smartbranch.data.localdb.ListFormTeller.class.isAssignableFrom(r4) != false) goto L_0x0180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x017b, code lost:
        r5 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0180, code lost:
        r5 = 18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0185, code lost:
        if (r5 == 3) goto L_0x018b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0191, code lost:
        if (com.bca.smartbranch.data.localdb.CreditCardSupplement.class.isAssignableFrom(r4) != false) goto L_0x019d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0197, code lost:
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0199, code lost:
        throw r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x019a, code lost:
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x019c, code lost:
        throw r4;
     */
    @Override // io.realm.internal.RealmProxyMediator
    /* Code decompiled incorrectly, please refer to instructions dump */
    public boolean hasPrimaryKeyImpl(java.lang.Class<? extends io.realm.RealmModel> r4) {
        /*
        // Method dump skipped, instructions count: 417
        */
        throw new UnsupportedOperationException("Method not decompiled: io.realm.DefaultRealmModuleMediator.hasPrimaryKeyImpl(java.lang.Class):boolean");
    }

    @Override // io.realm.internal.RealmProxyMediator
    public long insert(Realm realm, RealmModel realmModel, Map<RealmModel, Long> map) {
        long j;
        int i2 = g + 71;
        i = i2 % Property.TYPE_ARRAY;
        boolean z = false;
        if (i2 % 2 == 0) {
            boolean z2 = realmModel instanceof RealmObjectProxy;
            throw new ArithmeticException("divide by zero");
        }
        Class<?> superclass = realmModel instanceof RealmObjectProxy ? realmModel.getClass().getSuperclass() : realmModel.getClass();
        if (superclass.equals(Category.class)) {
            i = (g + 91) % Property.TYPE_ARRAY;
            return com_bca_smartbranch_data_localdb_CategoryRealmProxy.insert(realm, (Category) realmModel, map);
        } else if (superclass.equals(Setoran.class)) {
            return com_bca_smartbranch_data_localdb_SetoranRealmProxy.insert(realm, (Setoran) realmModel, map);
        } else {
            try {
                if (superclass.equals(CreditCard.class)) {
                    return com_bca_smartbranch_data_localdb_CreditCardRealmProxy.insert(realm, (CreditCard) realmModel, map);
                }
                if (superclass.equals(CreditCardOptions.class)) {
                    int i3 = g + 37;
                    i = i3 % Property.TYPE_ARRAY;
                    if ((i3 % 2 == 0 ? (char) 14 : 26) == 26) {
                        return com_bca_smartbranch_data_localdb_CreditCardOptionsRealmProxy.insert(realm, (CreditCardOptions) realmModel, map);
                    }
                    com_bca_smartbranch_data_localdb_CreditCardOptionsRealmProxy.insert(realm, (CreditCardOptions) realmModel, map);
                    throw new NullPointerException();
                } else if (superclass.equals(EChannel.class)) {
                    return com_bca_smartbranch_data_localdb_EChannelRealmProxy.insert(realm, (EChannel) realmModel, map);
                } else {
                    try {
                        if (superclass.equals(User.class)) {
                            return com_bca_smartbranch_data_localdb_UserRealmProxy.insert(realm, (User) realmModel, map);
                        }
                        if (superclass.equals(Tarikan.class)) {
                            return com_bca_smartbranch_data_localdb_TarikanRealmProxy.insert(realm, (Tarikan) realmModel, map);
                        }
                        if (!(!superclass.equals(Account.class))) {
                            return com_bca_smartbranch_data_localdb_AccountRealmProxy.insert(realm, (Account) realmModel, map);
                        }
                        if (superclass.equals(Kliring.class)) {
                            int i4 = i + 31;
                            g = i4 % Property.TYPE_ARRAY;
                            if ((i4 % 2 != 0 ? 18 : 'H') != 18) {
                                j = com_bca_smartbranch_data_localdb_KliringRealmProxy.insert(realm, (Kliring) realmModel, map);
                            } else {
                                j = com_bca_smartbranch_data_localdb_KliringRealmProxy.insert(realm, (Kliring) realmModel, map);
                                Object[] objArr = null;
                                int length = objArr.length;
                            }
                            return j;
                        } else if (superclass.equals(CCOtherBankCreditCard.class)) {
                            return com_bca_smartbranch_data_localdb_CCOtherBankCreditCardRealmProxy.insert(realm, (CCOtherBankCreditCard) realmModel, map);
                        } else {
                            if (superclass.equals(Warkat.class)) {
                                int i5 = g + 81;
                                i = i5 % Property.TYPE_ARRAY;
                                if (i5 % 2 != 0) {
                                    z = true;
                                }
                                if (z) {
                                    return com_bca_smartbranch_data_localdb_WarkatRealmProxy.insert(realm, (Warkat) realmModel, map);
                                }
                                com_bca_smartbranch_data_localdb_WarkatRealmProxy.insert(realm, (Warkat) realmModel, map);
                                throw new NullPointerException();
                            } else if (superclass.equals(BankTransfer.class)) {
                                return com_bca_smartbranch_data_localdb_BankTransferRealmProxy.insert(realm, (BankTransfer) realmModel, map);
                            } else {
                                if (superclass.equals(BankTransferPenerima.class)) {
                                    return com_bca_smartbranch_data_localdb_BankTransferPenerimaRealmProxy.insert(realm, (BankTransferPenerima) realmModel, map);
                                }
                                if (!(!superclass.equals(CCOtherBankAccount.class))) {
                                    return com_bca_smartbranch_data_localdb_CCOtherBankAccountRealmProxy.insert(realm, (CCOtherBankAccount) realmModel, map);
                                }
                                if (superclass.equals(KirimanUang.class)) {
                                    return com_bca_smartbranch_data_localdb_KirimanUangRealmProxy.insert(realm, (KirimanUang) realmModel, map);
                                }
                                if (superclass.equals(ReservasiOnline.class)) {
                                    return com_bca_smartbranch_data_localdb_ReservasiOnlineRealmProxy.insert(realm, (ReservasiOnline) realmModel, map);
                                }
                                if (superclass.equals(ListFormTeller.class)) {
                                    return com_bca_smartbranch_data_localdb_ListFormTellerRealmProxy.insert(realm, (ListFormTeller) realmModel, map);
                                }
                                if (!(!superclass.equals(CreditCardSupplement.class))) {
                                    int i6 = g + 71;
                                    i = i6 % Property.TYPE_ARRAY;
                                    if (i6 % 2 != 0) {
                                        return com_bca_smartbranch_data_localdb_CreditCardSupplementRealmProxy.insert(realm, (CreditCardSupplement) realmModel, map);
                                    }
                                    com_bca_smartbranch_data_localdb_CreditCardSupplementRealmProxy.insert(realm, (CreditCardSupplement) realmModel, map);
                                    throw new ArithmeticException("divide by zero");
                                }
                                throw getMissingProxyClassException((Class<? extends RealmModel>) superclass);
                            }
                        }
                    } catch (Exception e2) {
                        throw e2;
                    }
                }
            } catch (Exception e3) {
                throw e3;
            }
        }
    }

    @Override // io.realm.internal.RealmProxyMediator
    public void insert(Realm realm, Collection<? extends RealmModel> collection) {
        Iterator<? extends RealmModel> it = collection.iterator();
        HashMap hashMap = new HashMap(collection.size());
        if (it.hasNext()) {
            RealmModel realmModel = (RealmModel) it.next();
            Class<?> superclass = realmModel instanceof RealmObjectProxy ? realmModel.getClass().getSuperclass() : realmModel.getClass();
            boolean z = false;
            if (superclass.equals(Category.class)) {
                com_bca_smartbranch_data_localdb_CategoryRealmProxy.insert(realm, (Category) realmModel, hashMap);
            } else if (superclass.equals(Setoran.class)) {
                com_bca_smartbranch_data_localdb_SetoranRealmProxy.insert(realm, (Setoran) realmModel, hashMap);
            } else {
                if (superclass.equals(CreditCard.class)) {
                    int i2 = i + setHasDecor$MediaBrowserCompat$MediaItem.aJ;
                    g = i2 % Property.TYPE_ARRAY;
                    if (i2 % 2 != 0) {
                        com_bca_smartbranch_data_localdb_CreditCardRealmProxy.insert(realm, (CreditCard) realmModel, hashMap);
                        Object[] objArr = null;
                        int length = objArr.length;
                    } else {
                        com_bca_smartbranch_data_localdb_CreditCardRealmProxy.insert(realm, (CreditCard) realmModel, hashMap);
                    }
                } else if (superclass.equals(CreditCardOptions.class)) {
                    com_bca_smartbranch_data_localdb_CreditCardOptionsRealmProxy.insert(realm, (CreditCardOptions) realmModel, hashMap);
                } else if (superclass.equals(EChannel.class)) {
                    com_bca_smartbranch_data_localdb_EChannelRealmProxy.insert(realm, (EChannel) realmModel, hashMap);
                } else {
                    try {
                        if (superclass.equals(User.class)) {
                            com_bca_smartbranch_data_localdb_UserRealmProxy.insert(realm, (User) realmModel, hashMap);
                        } else if (superclass.equals(Tarikan.class)) {
                            i = (g + 17) % Property.TYPE_ARRAY;
                            com_bca_smartbranch_data_localdb_TarikanRealmProxy.insert(realm, (Tarikan) realmModel, hashMap);
                        } else {
                            char c2 = '>';
                            if ((superclass.equals(Account.class) ? '>' : '*') != '*') {
                                com_bca_smartbranch_data_localdb_AccountRealmProxy.insert(realm, (Account) realmModel, hashMap);
                                i = (g + 89) % Property.TYPE_ARRAY;
                            } else if (superclass.equals(Kliring.class)) {
                                com_bca_smartbranch_data_localdb_KliringRealmProxy.insert(realm, (Kliring) realmModel, hashMap);
                            } else {
                                if (superclass.equals(CCOtherBankCreditCard.class)) {
                                    c2 = ']';
                                }
                                if (c2 == ']') {
                                    com_bca_smartbranch_data_localdb_CCOtherBankCreditCardRealmProxy.insert(realm, (CCOtherBankCreditCard) realmModel, hashMap);
                                } else if (superclass.equals(Warkat.class)) {
                                    int i3 = i + setHasDecor$MediaBrowserCompat$MediaItem.aI;
                                    g = i3 % Property.TYPE_ARRAY;
                                    if (i3 % 2 != 0) {
                                        com_bca_smartbranch_data_localdb_WarkatRealmProxy.insert(realm, (Warkat) realmModel, hashMap);
                                        throw new ArithmeticException("divide by zero");
                                    }
                                    com_bca_smartbranch_data_localdb_WarkatRealmProxy.insert(realm, (Warkat) realmModel, hashMap);
                                } else {
                                    if (superclass.equals(BankTransfer.class)) {
                                        com_bca_smartbranch_data_localdb_BankTransferRealmProxy.insert(realm, (BankTransfer) realmModel, hashMap);
                                    } else if (superclass.equals(BankTransferPenerima.class)) {
                                        com_bca_smartbranch_data_localdb_BankTransferPenerimaRealmProxy.insert(realm, (BankTransferPenerima) realmModel, hashMap);
                                    } else if (superclass.equals(CCOtherBankAccount.class)) {
                                        int i4 = i + 115;
                                        g = i4 % Property.TYPE_ARRAY;
                                        if (i4 % 2 != 0) {
                                            com_bca_smartbranch_data_localdb_CCOtherBankAccountRealmProxy.insert(realm, (CCOtherBankAccount) realmModel, hashMap);
                                            throw new ArithmeticException("divide by zero");
                                        }
                                        com_bca_smartbranch_data_localdb_CCOtherBankAccountRealmProxy.insert(realm, (CCOtherBankAccount) realmModel, hashMap);
                                    } else if (superclass.equals(KirimanUang.class)) {
                                        com_bca_smartbranch_data_localdb_KirimanUangRealmProxy.insert(realm, (KirimanUang) realmModel, hashMap);
                                    } else if (superclass.equals(ReservasiOnline.class)) {
                                        com_bca_smartbranch_data_localdb_ReservasiOnlineRealmProxy.insert(realm, (ReservasiOnline) realmModel, hashMap);
                                    } else if (superclass.equals(ListFormTeller.class)) {
                                        com_bca_smartbranch_data_localdb_ListFormTellerRealmProxy.insert(realm, (ListFormTeller) realmModel, hashMap);
                                    } else if (superclass.equals(CreditCardSupplement.class)) {
                                        com_bca_smartbranch_data_localdb_CreditCardSupplementRealmProxy.insert(realm, (CreditCardSupplement) realmModel, hashMap);
                                    } else {
                                        throw getMissingProxyClassException((Class<? extends RealmModel>) superclass);
                                    }
                                }
                            }
                        }
                    } catch (Exception e2) {
                        throw e2;
                    }
                }
            }
            if (!(!it.hasNext())) {
                int i5 = g + 81;
                i = i5 % Property.TYPE_ARRAY;
                if (i5 % 2 == 0) {
                    superclass.equals(Category.class);
                    throw new ArithmeticException("divide by zero");
                } else if (superclass.equals(Category.class)) {
                    com_bca_smartbranch_data_localdb_CategoryRealmProxy.insert(realm, it, hashMap);
                } else if (superclass.equals(Setoran.class)) {
                    com_bca_smartbranch_data_localdb_SetoranRealmProxy.insert(realm, it, hashMap);
                } else {
                    if ((superclass.equals(CreditCard.class) ? 'A' : 'R') == 'A') {
                        com_bca_smartbranch_data_localdb_CreditCardRealmProxy.insert(realm, it, hashMap);
                    } else if (superclass.equals(CreditCardOptions.class)) {
                        com_bca_smartbranch_data_localdb_CreditCardOptionsRealmProxy.insert(realm, it, hashMap);
                    } else if (superclass.equals(EChannel.class)) {
                        com_bca_smartbranch_data_localdb_EChannelRealmProxy.insert(realm, it, hashMap);
                    } else if (superclass.equals(User.class)) {
                        com_bca_smartbranch_data_localdb_UserRealmProxy.insert(realm, it, hashMap);
                    } else if (superclass.equals(Tarikan.class)) {
                        int i6 = i + 51;
                        g = i6 % Property.TYPE_ARRAY;
                        if (i6 % 2 != 0) {
                            com_bca_smartbranch_data_localdb_TarikanRealmProxy.insert(realm, it, hashMap);
                            Object[] objArr2 = null;
                            int length2 = objArr2.length;
                            return;
                        }
                        com_bca_smartbranch_data_localdb_TarikanRealmProxy.insert(realm, it, hashMap);
                    } else if (superclass.equals(Account.class)) {
                        com_bca_smartbranch_data_localdb_AccountRealmProxy.insert(realm, it, hashMap);
                    } else {
                        if (!(!superclass.equals(Kliring.class))) {
                            com_bca_smartbranch_data_localdb_KliringRealmProxy.insert(realm, it, hashMap);
                        } else if (superclass.equals(CCOtherBankCreditCard.class)) {
                            com_bca_smartbranch_data_localdb_CCOtherBankCreditCardRealmProxy.insert(realm, it, hashMap);
                        } else if (superclass.equals(Warkat.class)) {
                            com_bca_smartbranch_data_localdb_WarkatRealmProxy.insert(realm, it, hashMap);
                        } else if (superclass.equals(BankTransfer.class)) {
                            try {
                                com_bca_smartbranch_data_localdb_BankTransferRealmProxy.insert(realm, it, hashMap);
                                int i7 = g + 113;
                                i = i7 % Property.TYPE_ARRAY;
                                if (i7 % 2 == 0) {
                                    throw new NullPointerException();
                                }
                            } catch (Exception e3) {
                                throw e3;
                            }
                        } else {
                            if (!superclass.equals(BankTransferPenerima.class)) {
                                z = true;
                            }
                            if (!z) {
                                com_bca_smartbranch_data_localdb_BankTransferPenerimaRealmProxy.insert(realm, it, hashMap);
                            } else if (superclass.equals(CCOtherBankAccount.class)) {
                                g = (i + 55) % Property.TYPE_ARRAY;
                                com_bca_smartbranch_data_localdb_CCOtherBankAccountRealmProxy.insert(realm, it, hashMap);
                            } else if (superclass.equals(KirimanUang.class)) {
                                int i8 = g + 17;
                                i = i8 % Property.TYPE_ARRAY;
                                if (i8 % 2 == 0) {
                                    com_bca_smartbranch_data_localdb_KirimanUangRealmProxy.insert(realm, it, hashMap);
                                    throw new NullPointerException();
                                } else {
                                    com_bca_smartbranch_data_localdb_KirimanUangRealmProxy.insert(realm, it, hashMap);
                                }
                            } else if (superclass.equals(ReservasiOnline.class)) {
                                com_bca_smartbranch_data_localdb_ReservasiOnlineRealmProxy.insert(realm, it, hashMap);
                            } else if (superclass.equals(ListFormTeller.class)) {
                                com_bca_smartbranch_data_localdb_ListFormTellerRealmProxy.insert(realm, it, hashMap);
                            } else if (superclass.equals(CreditCardSupplement.class)) {
                                com_bca_smartbranch_data_localdb_CreditCardSupplementRealmProxy.insert(realm, it, hashMap);
                            } else {
                                throw getMissingProxyClassException((Class<? extends RealmModel>) superclass);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // io.realm.internal.RealmProxyMediator
    public long insertOrUpdate(Realm realm, RealmModel realmModel, Map<RealmModel, Long> map) {
        Class<?> cls = (realmModel instanceof RealmObjectProxy ? '\f' : '/') != '\f' ? realmModel.getClass() : realmModel.getClass().getSuperclass();
        if (cls.equals(Category.class)) {
            return com_bca_smartbranch_data_localdb_CategoryRealmProxy.insertOrUpdate(realm, (Category) realmModel, map);
        }
        char c2 = 29;
        if (cls.equals(Setoran.class)) {
            i = (g + 29) % Property.TYPE_ARRAY;
            return com_bca_smartbranch_data_localdb_SetoranRealmProxy.insertOrUpdate(realm, (Setoran) realmModel, map);
        }
        try {
            try {
                if ((cls.equals(CreditCard.class) ? 23 : 'B') != 'B') {
                    return com_bca_smartbranch_data_localdb_CreditCardRealmProxy.insertOrUpdate(realm, (CreditCard) realmModel, map);
                }
                if (cls.equals(CreditCardOptions.class)) {
                    return com_bca_smartbranch_data_localdb_CreditCardOptionsRealmProxy.insertOrUpdate(realm, (CreditCardOptions) realmModel, map);
                }
                if (cls.equals(EChannel.class)) {
                    g = (i + 45) % Property.TYPE_ARRAY;
                    return com_bca_smartbranch_data_localdb_EChannelRealmProxy.insertOrUpdate(realm, (EChannel) realmModel, map);
                } else if (cls.equals(User.class)) {
                    i = (g + 79) % Property.TYPE_ARRAY;
                    long insertOrUpdate = com_bca_smartbranch_data_localdb_UserRealmProxy.insertOrUpdate(realm, (User) realmModel, map);
                    i = (g + setHasDecor$MediaBrowserCompat$MediaItem.aM) % Property.TYPE_ARRAY;
                    return insertOrUpdate;
                } else if (cls.equals(Tarikan.class)) {
                    return com_bca_smartbranch_data_localdb_TarikanRealmProxy.insertOrUpdate(realm, (Tarikan) realmModel, map);
                } else {
                    if (!cls.equals(Account.class)) {
                        c2 = 28;
                    }
                    boolean z = false;
                    if (c2 != 28) {
                        int i2 = g + 111;
                        i = i2 % Property.TYPE_ARRAY;
                        if (i2 % 2 != 0) {
                            return com_bca_smartbranch_data_localdb_AccountRealmProxy.insertOrUpdate(realm, (Account) realmModel, map);
                        }
                        com_bca_smartbranch_data_localdb_AccountRealmProxy.insertOrUpdate(realm, (Account) realmModel, map);
                        throw new ArithmeticException("divide by zero");
                    } else if (cls.equals(Kliring.class)) {
                        int i3 = g + setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cB;
                        i = i3 % Property.TYPE_ARRAY;
                        if (i3 % 2 != 0) {
                            return com_bca_smartbranch_data_localdb_KliringRealmProxy.insertOrUpdate(realm, (Kliring) realmModel, map);
                        }
                        com_bca_smartbranch_data_localdb_KliringRealmProxy.insertOrUpdate(realm, (Kliring) realmModel, map);
                        throw new NullPointerException();
                    } else {
                        if (!cls.equals(CCOtherBankCreditCard.class)) {
                            z = true;
                        }
                        if (!z) {
                            i = (g + 9) % Property.TYPE_ARRAY;
                            return com_bca_smartbranch_data_localdb_CCOtherBankCreditCardRealmProxy.insertOrUpdate(realm, (CCOtherBankCreditCard) realmModel, map);
                        } else if (cls.equals(Warkat.class)) {
                            int i4 = g + setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.ct;
                            i = i4 % Property.TYPE_ARRAY;
                            if (i4 % 2 != 0) {
                                return com_bca_smartbranch_data_localdb_WarkatRealmProxy.insertOrUpdate(realm, (Warkat) realmModel, map);
                            }
                            com_bca_smartbranch_data_localdb_WarkatRealmProxy.insertOrUpdate(realm, (Warkat) realmModel, map);
                            throw new NullPointerException();
                        } else {
                            if ((cls.equals(BankTransfer.class) ? ';' : 'J') == ';') {
                                g = (i + 111) % Property.TYPE_ARRAY;
                                return com_bca_smartbranch_data_localdb_BankTransferRealmProxy.insertOrUpdate(realm, (BankTransfer) realmModel, map);
                            } else if (cls.equals(BankTransferPenerima.class)) {
                                return com_bca_smartbranch_data_localdb_BankTransferPenerimaRealmProxy.insertOrUpdate(realm, (BankTransferPenerima) realmModel, map);
                            } else {
                                if (cls.equals(CCOtherBankAccount.class)) {
                                    return com_bca_smartbranch_data_localdb_CCOtherBankAccountRealmProxy.insertOrUpdate(realm, (CCOtherBankAccount) realmModel, map);
                                }
                                if (cls.equals(KirimanUang.class)) {
                                    return com_bca_smartbranch_data_localdb_KirimanUangRealmProxy.insertOrUpdate(realm, (KirimanUang) realmModel, map);
                                }
                                if (cls.equals(ReservasiOnline.class)) {
                                    return com_bca_smartbranch_data_localdb_ReservasiOnlineRealmProxy.insertOrUpdate(realm, (ReservasiOnline) realmModel, map);
                                }
                                if (cls.equals(ListFormTeller.class)) {
                                    return com_bca_smartbranch_data_localdb_ListFormTellerRealmProxy.insertOrUpdate(realm, (ListFormTeller) realmModel, map);
                                }
                                if ((cls.equals(CreditCardSupplement.class) ? 'V' : 4) != 4) {
                                    i = (g + 113) % Property.TYPE_ARRAY;
                                    return com_bca_smartbranch_data_localdb_CreditCardSupplementRealmProxy.insertOrUpdate(realm, (CreditCardSupplement) realmModel, map);
                                }
                                throw getMissingProxyClassException((Class<? extends RealmModel>) cls);
                            }
                        }
                    }
                }
            } catch (Exception e2) {
                throw e2;
            }
        } catch (Exception e3) {
            throw e3;
        }
    }

    @Override // io.realm.internal.RealmProxyMediator
    public void insertOrUpdate(Realm realm, Collection<? extends RealmModel> collection) {
        Class<?> cls;
        Iterator<? extends RealmModel> it = collection.iterator();
        HashMap hashMap = new HashMap(collection.size());
        if (it.hasNext()) {
            int i2 = g + setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.ct;
            i = i2 % Property.TYPE_ARRAY;
            if (i2 % 2 == 0) {
                boolean z = ((RealmModel) it.next()) instanceof RealmObjectProxy;
                throw new NullPointerException();
            }
            RealmModel realmModel = (RealmModel) it.next();
            RealmModel realmModel2 = realmModel;
            if (realmModel instanceof RealmObjectProxy) {
                realmModel2 = realmModel;
                cls = realmModel2.getClass().getSuperclass();
            } else {
                cls = realmModel2.getClass();
            }
            boolean z2 = false;
            if (cls.equals(Category.class)) {
                com_bca_smartbranch_data_localdb_CategoryRealmProxy.insertOrUpdate(realm, (Category) realmModel2, hashMap);
            } else {
                if (cls.equals(Setoran.class)) {
                    com_bca_smartbranch_data_localdb_SetoranRealmProxy.insertOrUpdate(realm, (Setoran) realmModel2, hashMap);
                } else if (cls.equals(CreditCard.class)) {
                    com_bca_smartbranch_data_localdb_CreditCardRealmProxy.insertOrUpdate(realm, (CreditCard) realmModel2, hashMap);
                } else if (cls.equals(CreditCardOptions.class)) {
                    int i3 = i + 69;
                    g = i3 % Property.TYPE_ARRAY;
                    if (i3 % 2 != 0) {
                        com_bca_smartbranch_data_localdb_CreditCardOptionsRealmProxy.insertOrUpdate(realm, (CreditCardOptions) realmModel2, hashMap);
                        throw new ArithmeticException("divide by zero");
                    }
                    com_bca_smartbranch_data_localdb_CreditCardOptionsRealmProxy.insertOrUpdate(realm, (CreditCardOptions) realmModel2, hashMap);
                } else if (cls.equals(EChannel.class)) {
                    com_bca_smartbranch_data_localdb_EChannelRealmProxy.insertOrUpdate(realm, (EChannel) realmModel2, hashMap);
                } else if (cls.equals(User.class)) {
                    com_bca_smartbranch_data_localdb_UserRealmProxy.insertOrUpdate(realm, (User) realmModel2, hashMap);
                } else if (cls.equals(Tarikan.class)) {
                    try {
                        com_bca_smartbranch_data_localdb_TarikanRealmProxy.insertOrUpdate(realm, (Tarikan) realmModel2, hashMap);
                    } catch (Exception e2) {
                        throw e2;
                    }
                } else if (cls.equals(Account.class)) {
                    com_bca_smartbranch_data_localdb_AccountRealmProxy.insertOrUpdate(realm, (Account) realmModel2, hashMap);
                } else {
                    if (!(!cls.equals(Kliring.class))) {
                        com_bca_smartbranch_data_localdb_KliringRealmProxy.insertOrUpdate(realm, (Kliring) realmModel2, hashMap);
                    } else if (cls.equals(CCOtherBankCreditCard.class)) {
                        com_bca_smartbranch_data_localdb_CCOtherBankCreditCardRealmProxy.insertOrUpdate(realm, (CCOtherBankCreditCard) realmModel2, hashMap);
                    } else {
                        if ((cls.equals(Warkat.class) ? 'Z' : 'L') != 'L') {
                            com_bca_smartbranch_data_localdb_WarkatRealmProxy.insertOrUpdate(realm, (Warkat) realmModel2, hashMap);
                        } else if (cls.equals(BankTransfer.class)) {
                            com_bca_smartbranch_data_localdb_BankTransferRealmProxy.insertOrUpdate(realm, (BankTransfer) realmModel2, hashMap);
                        } else if (cls.equals(BankTransferPenerima.class)) {
                            com_bca_smartbranch_data_localdb_BankTransferPenerimaRealmProxy.insertOrUpdate(realm, (BankTransferPenerima) realmModel2, hashMap);
                        } else if (cls.equals(CCOtherBankAccount.class)) {
                            com_bca_smartbranch_data_localdb_CCOtherBankAccountRealmProxy.insertOrUpdate(realm, (CCOtherBankAccount) realmModel2, hashMap);
                        } else if (cls.equals(KirimanUang.class)) {
                            com_bca_smartbranch_data_localdb_KirimanUangRealmProxy.insertOrUpdate(realm, (KirimanUang) realmModel2, hashMap);
                        } else {
                            if ((cls.equals(ReservasiOnline.class) ? 'c' : '2') != '2') {
                                com_bca_smartbranch_data_localdb_ReservasiOnlineRealmProxy.insertOrUpdate(realm, (ReservasiOnline) realmModel2, hashMap);
                            } else {
                                if ((cls.equals(ListFormTeller.class) ? (char) 18 : 21) != 21) {
                                    i = (g + 69) % Property.TYPE_ARRAY;
                                    com_bca_smartbranch_data_localdb_ListFormTellerRealmProxy.insertOrUpdate(realm, (ListFormTeller) realmModel2, hashMap);
                                } else {
                                    if ((cls.equals(CreditCardSupplement.class) ? 6 : 'C') != 'C') {
                                        com_bca_smartbranch_data_localdb_CreditCardSupplementRealmProxy.insertOrUpdate(realm, (CreditCardSupplement) realmModel2, hashMap);
                                    } else {
                                        throw getMissingProxyClassException((Class<? extends RealmModel>) cls);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (it.hasNext()) {
                try {
                    if (cls.equals(Category.class)) {
                        int i4 = g + setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.ct;
                        i = i4 % Property.TYPE_ARRAY;
                        if (i4 % 2 == 0) {
                            com_bca_smartbranch_data_localdb_CategoryRealmProxy.insertOrUpdate(realm, it, hashMap);
                            throw new ArithmeticException("divide by zero");
                        } else {
                            com_bca_smartbranch_data_localdb_CategoryRealmProxy.insertOrUpdate(realm, it, hashMap);
                        }
                    } else {
                        char c2 = 'X';
                        if ((cls.equals(Setoran.class) ? 'X' : '_') != '_') {
                            com_bca_smartbranch_data_localdb_SetoranRealmProxy.insertOrUpdate(realm, it, hashMap);
                        } else if (cls.equals(CreditCard.class)) {
                            com_bca_smartbranch_data_localdb_CreditCardRealmProxy.insertOrUpdate(realm, it, hashMap);
                        } else {
                            if (!(!cls.equals(CreditCardOptions.class))) {
                                com_bca_smartbranch_data_localdb_CreditCardOptionsRealmProxy.insertOrUpdate(realm, it, hashMap);
                            } else if (cls.equals(EChannel.class)) {
                                com_bca_smartbranch_data_localdb_EChannelRealmProxy.insertOrUpdate(realm, it, hashMap);
                            } else if (cls.equals(User.class)) {
                                int i5 = g + 65;
                                i = i5 % Property.TYPE_ARRAY;
                                com_bca_smartbranch_data_localdb_UserRealmProxy.insertOrUpdate(realm, it, hashMap);
                                if (i5 % 2 == 0) {
                                    throw new NullPointerException();
                                }
                            } else if (cls.equals(Tarikan.class)) {
                                g = (i + setHasDecor$MediaBrowserCompat$MediaItem.aD) % Property.TYPE_ARRAY;
                                com_bca_smartbranch_data_localdb_TarikanRealmProxy.insertOrUpdate(realm, it, hashMap);
                            } else {
                                if (cls.equals(Account.class)) {
                                    c2 = 'L';
                                }
                                if (c2 == 'L') {
                                    com_bca_smartbranch_data_localdb_AccountRealmProxy.insertOrUpdate(realm, it, hashMap);
                                } else if (cls.equals(Kliring.class)) {
                                    int i6 = i + 71;
                                    g = i6 % Property.TYPE_ARRAY;
                                    if (i6 % 2 != 0) {
                                        com_bca_smartbranch_data_localdb_KliringRealmProxy.insertOrUpdate(realm, it, hashMap);
                                        Object[] objArr = null;
                                        int length = objArr.length;
                                        return;
                                    }
                                    com_bca_smartbranch_data_localdb_KliringRealmProxy.insertOrUpdate(realm, it, hashMap);
                                } else if (cls.equals(CCOtherBankCreditCard.class)) {
                                    i = (g + 27) % Property.TYPE_ARRAY;
                                    com_bca_smartbranch_data_localdb_CCOtherBankCreditCardRealmProxy.insertOrUpdate(realm, it, hashMap);
                                } else if (cls.equals(Warkat.class)) {
                                    g = (i + 75) % Property.TYPE_ARRAY;
                                    com_bca_smartbranch_data_localdb_WarkatRealmProxy.insertOrUpdate(realm, it, hashMap);
                                } else if (cls.equals(BankTransfer.class)) {
                                    com_bca_smartbranch_data_localdb_BankTransferRealmProxy.insertOrUpdate(realm, it, hashMap);
                                } else if (cls.equals(BankTransferPenerima.class)) {
                                    com_bca_smartbranch_data_localdb_BankTransferPenerimaRealmProxy.insertOrUpdate(realm, it, hashMap);
                                } else if (cls.equals(CCOtherBankAccount.class)) {
                                    com_bca_smartbranch_data_localdb_CCOtherBankAccountRealmProxy.insertOrUpdate(realm, it, hashMap);
                                } else if (cls.equals(KirimanUang.class)) {
                                    com_bca_smartbranch_data_localdb_KirimanUangRealmProxy.insertOrUpdate(realm, it, hashMap);
                                } else if (cls.equals(ReservasiOnline.class)) {
                                    com_bca_smartbranch_data_localdb_ReservasiOnlineRealmProxy.insertOrUpdate(realm, it, hashMap);
                                } else if (cls.equals(ListFormTeller.class)) {
                                    com_bca_smartbranch_data_localdb_ListFormTellerRealmProxy.insertOrUpdate(realm, it, hashMap);
                                } else {
                                    if (cls.equals(CreditCardSupplement.class)) {
                                        z2 = true;
                                    }
                                    if (z2) {
                                        com_bca_smartbranch_data_localdb_CreditCardSupplementRealmProxy.insertOrUpdate(realm, it, hashMap);
                                        return;
                                    }
                                    throw getMissingProxyClassException((Class<? extends RealmModel>) cls);
                                }
                            }
                        }
                    }
                } catch (Exception e3) {
                    throw e3;
                }
            }
        }
    }

    @Override // io.realm.internal.RealmProxyMediator
    public <E extends RealmModel> boolean isEmbedded(Class<E> cls) {
        int i2 = g + 85;
        i = i2 % Property.TYPE_ARRAY;
        if (i2 % 2 == 0) {
            cls.equals(Category.class);
            throw new NullPointerException();
        }
        try {
            if ((cls.equals(Category.class) ? 'O' : '<') != '<' || cls.equals(Setoran.class) || cls.equals(CreditCard.class) || cls.equals(CreditCardOptions.class) || cls.equals(EChannel.class)) {
                return false;
            }
            boolean z = true;
            if (cls.equals(User.class)) {
                int i3 = i + 45;
                g = i3 % Property.TYPE_ARRAY;
                return i3 % 2 != 0;
            } else if (cls.equals(Tarikan.class)) {
                return false;
            } else {
                if (!(!cls.equals(Account.class))) {
                    return false;
                }
                if ((cls.equals(Kliring.class) ? 26 : '1') != '1') {
                    int i4 = i + 3;
                    g = i4 % Property.TYPE_ARRAY;
                    return (i4 % 2 != 0 ? 'C' : 'W') == 'C';
                } else if (cls.equals(CCOtherBankCreditCard.class)) {
                    int i5 = g + 31;
                    i = i5 % Property.TYPE_ARRAY;
                    if (i5 % 2 == 0) {
                    }
                    return false;
                } else {
                    if ((cls.equals(Warkat.class) ? '(' : 'H') != 'H') {
                        return false;
                    }
                    if (cls.equals(BankTransfer.class)) {
                        i = (g + 53) % Property.TYPE_ARRAY;
                        return false;
                    } else if (cls.equals(BankTransferPenerima.class)) {
                        int i6 = i + 95;
                        g = i6 % Property.TYPE_ARRAY;
                        return (i6 % 2 != 0 ? (char) 1 : 17) == 1;
                    } else {
                        if (cls.equals(CCOtherBankAccount.class)) {
                            z = false;
                        }
                        if (!z || cls.equals(KirimanUang.class) || cls.equals(ReservasiOnline.class)) {
                            return false;
                        }
                        if (cls.equals(ListFormTeller.class) || cls.equals(CreditCardSupplement.class)) {
                            return false;
                        }
                        try {
                            throw getMissingProxyClassException(cls);
                        } catch (Exception e2) {
                            throw e2;
                        }
                    }
                }
            }
        } catch (Exception e3) {
            throw e3;
        }
    }

    @Override // io.realm.internal.RealmProxyMediator
    public <E extends RealmModel> E newInstance(Class<E> cls, Object obj, Row row, ColumnInfo columnInfo, boolean z, List<String> list) {
        try {
            try {
                g = (i + 69) % Property.TYPE_ARRAY;
                BaseRealm.RealmObjectContext realmObjectContext = BaseRealm.objectContext.get();
                try {
                    realmObjectContext.set((BaseRealm) obj, row, columnInfo, z, list);
                    checkClass(cls);
                    if (cls.equals(Category.class)) {
                        return cls.cast(new com_bca_smartbranch_data_localdb_CategoryRealmProxy());
                    }
                    if (cls.equals(Setoran.class)) {
                        E cast = cls.cast(new com_bca_smartbranch_data_localdb_SetoranRealmProxy());
                        realmObjectContext.clear();
                        int i2 = i + 97;
                        g = i2 % Property.TYPE_ARRAY;
                        if (i2 % 2 == 0) {
                            return cast;
                        }
                        throw new ArithmeticException("divide by zero");
                    } else if (cls.equals(CreditCard.class)) {
                        return cls.cast(new com_bca_smartbranch_data_localdb_CreditCardRealmProxy());
                    } else {
                        if (cls.equals(CreditCardOptions.class)) {
                            return cls.cast(new com_bca_smartbranch_data_localdb_CreditCardOptionsRealmProxy());
                        }
                        if (cls.equals(EChannel.class)) {
                            return cls.cast(new com_bca_smartbranch_data_localdb_EChannelRealmProxy());
                        }
                        if (cls.equals(User.class)) {
                            return cls.cast(new com_bca_smartbranch_data_localdb_UserRealmProxy());
                        }
                        if (cls.equals(Tarikan.class)) {
                            return cls.cast(new com_bca_smartbranch_data_localdb_TarikanRealmProxy());
                        }
                        if (cls.equals(Account.class)) {
                            return cls.cast(new com_bca_smartbranch_data_localdb_AccountRealmProxy());
                        }
                        if (cls.equals(Kliring.class)) {
                            return cls.cast(new com_bca_smartbranch_data_localdb_KliringRealmProxy());
                        }
                        if (cls.equals(CCOtherBankCreditCard.class)) {
                            return cls.cast(new com_bca_smartbranch_data_localdb_CCOtherBankCreditCardRealmProxy());
                        }
                        if (cls.equals(Warkat.class)) {
                            return cls.cast(new com_bca_smartbranch_data_localdb_WarkatRealmProxy());
                        }
                        if (cls.equals(BankTransfer.class)) {
                            return cls.cast(new com_bca_smartbranch_data_localdb_BankTransferRealmProxy());
                        }
                        if (cls.equals(BankTransferPenerima.class)) {
                            return cls.cast(new com_bca_smartbranch_data_localdb_BankTransferPenerimaRealmProxy());
                        }
                        if (cls.equals(CCOtherBankAccount.class)) {
                            return cls.cast(new com_bca_smartbranch_data_localdb_CCOtherBankAccountRealmProxy());
                        }
                        if (cls.equals(KirimanUang.class)) {
                            return cls.cast(new com_bca_smartbranch_data_localdb_KirimanUangRealmProxy());
                        }
                        if (cls.equals(ReservasiOnline.class)) {
                            return cls.cast(new com_bca_smartbranch_data_localdb_ReservasiOnlineRealmProxy());
                        }
                        if (cls.equals(ListFormTeller.class)) {
                            return cls.cast(new com_bca_smartbranch_data_localdb_ListFormTellerRealmProxy());
                        }
                        if (cls.equals(CreditCardSupplement.class)) {
                            return cls.cast(new com_bca_smartbranch_data_localdb_CreditCardSupplementRealmProxy());
                        }
                        throw getMissingProxyClassException(cls);
                    }
                } finally {
                    realmObjectContext.clear();
                }
            } catch (Exception e2) {
                throw e2;
            }
        } catch (Exception e3) {
            throw e3;
        }
    }

    @Override // io.realm.internal.RealmProxyMediator
    public boolean transformerApplied() {
        int i2 = i + setHasDecor$MediaBrowserCompat$MediaItem.aI;
        g = i2 % Property.TYPE_ARRAY;
        boolean z = i2 % 2 == 0;
        try {
            try {
                i = (g + 35) % Property.TYPE_ARRAY;
                return z;
            } catch (Exception e2) {
                throw e2;
            }
        } catch (Exception e3) {
            throw e3;
        }
    }

    @Override // io.realm.internal.RealmProxyMediator
    public <E extends RealmModel> void updateEmbeddedObject(Realm realm, E e2, E e3, Map<RealmModel, RealmObjectProxy> map, Set<ImportFlag> set) {
        Class<? super Object> superclass = e3.getClass().getSuperclass();
        if (superclass.equals(Category.class)) {
            Object[] objArr = new Object[1];
            c(new int[]{1071018105, -2130982905, 703971511, 738804006, -890144598, 1673338092, 1121122316, 935749207, -1098807135, 100155571, -1531181121, 910421017, -1175081305, -203137221, 1784383983, -902822117, -1653163319, 725512822, 938460449, 2081199542, -975628457, 1575153713}, ExpandableListView.getPackedPositionType(0) + 41, objArr);
            throw getNotEmbeddedClassException(((String) objArr[0]).intern());
        } else if (!superclass.equals(Setoran.class)) {
            if (!superclass.equals(CreditCard.class)) {
                int i2 = i + 57;
                g = i2 % Property.TYPE_ARRAY;
                if (i2 % 2 != 0) {
                    superclass.equals(CreditCardOptions.class);
                    throw new NullPointerException();
                } else if (superclass.equals(CreditCardOptions.class)) {
                    Object[] objArr2 = new Object[1];
                    c(new int[]{1071018105, -2130982905, 703971511, 738804006, -890144598, 1673338092, 1121122316, 935749207, -1098807135, 100155571, -1531181121, 910421017, -1175081305, -203137221, 1784383983, -902822117, -721491732, -258241463, -1867874672, 1992085549, 1276332499, -913803189, 63907534, -892481022, 602086677, 91206501}, Color.green(0) + 50, objArr2);
                    throw getNotEmbeddedClassException(((String) objArr2[0]).intern());
                } else if (!superclass.equals(EChannel.class)) {
                    int i3 = g + setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cB;
                    i = i3 % Property.TYPE_ARRAY;
                    if (i3 % 2 == 0) {
                        superclass.equals(User.class);
                        throw new NullPointerException();
                    } else if (superclass.equals(User.class)) {
                        Object[] objArr3 = new Object[1];
                        a(127 - ExpandableListView.getPackedPositionGroup(0), null, null, new byte[]{-120, -110, -121, -99, -124, -123, -116, -115, -122, -127, -126, -115, -124, -122, -119, -122, -116, -124, -117, -127, -118, -122, -120, -123, -119, -120, -122, -125, -121, -124, -122, -127, -123, -124, -125, -126, -127}, objArr3);
                        throw getNotEmbeddedClassException(((String) objArr3[0]).intern());
                    } else if (!superclass.equals(Tarikan.class)) {
                        if ((!superclass.equals(Account.class) ? 'F' : 'N') != 'N') {
                            i = (g + 113) % Property.TYPE_ARRAY;
                            if (superclass.equals(Kliring.class)) {
                                Object[] objArr4 = new Object[1];
                                a(127 - (ViewConfiguration.getLongPressTimeout() >> 16), null, null, new byte[]{-102, -118, -113, -120, -113, -115, -103, -124, -123, -116, -115, -122, -127, -126, -115, -124, -122, -119, -122, -116, -124, -117, -127, -118, -122, -120, -123, -119, -120, -122, -125, -121, -124, -122, -127, -123, -124, -125, -126, -127}, objArr4);
                                throw getNotEmbeddedClassException(((String) objArr4[0]).intern());
                            } else if (!superclass.equals(CCOtherBankCreditCard.class)) {
                                i = (g + setHasDecor$MediaBrowserCompat$MediaItem.aD) % Property.TYPE_ARRAY;
                                if ((!superclass.equals(Warkat.class) ? 'L' : 28) == 28) {
                                    Object[] objArr5 = new Object[1];
                                    a(127 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), null, null, new byte[]{-119, -122, -108, -120, -122, -106, -124, -123, -116, -115, -122, -127, -126, -115, -124, -122, -119, -122, -116, -124, -117, -127, -118, -122, -120, -123, -119, -120, -122, -125, -121, -124, -122, -127, -123, -124, -125, -126, -127}, objArr5);
                                    throw getNotEmbeddedClassException(((String) objArr5[0]).intern());
                                } else if (superclass.equals(BankTransfer.class)) {
                                    Object[] objArr6 = new Object[1];
                                    a(View.resolveSize(0, 0) + 127, null, null, new byte[]{-120, -110, -107, -121, -118, -122, -120, -111, -108, -118, -122, -109, -124, -123, -116, -115, -122, -127, -126, -115, -124, -122, -119, -122, -116, -124, -117, -127, -118, -122, -120, -123, -119, -120, -122, -125, -121, -124, -122, -127, -123, -124, -125, -126, -127}, objArr6);
                                    throw getNotEmbeddedClassException(((String) objArr6[0]).intern());
                                } else if (superclass.equals(BankTransferPenerima.class)) {
                                    Object[] objArr7 = new Object[1];
                                    c(new int[]{1071018105, -2130982905, 703971511, 738804006, -890144598, 1673338092, 1121122316, 935749207, -1098807135, 100155571, -1531181121, 910421017, -1175081305, -203137221, 1784383983, -902822117, 2068854641, 1532347109, -805163022, -1675445749, -930024373, 754737778, 1405965913, 1804332471, 174539185, 1335699059, -238212928, 455681222}, (ViewConfiguration.getWindowTouchSlop() >> 8) + 53, objArr7);
                                    throw getNotEmbeddedClassException(((String) objArr7[0]).intern());
                                } else if (superclass.equals(CCOtherBankAccount.class)) {
                                    Object[] objArr8 = new Object[1];
                                    c(new int[]{1071018105, -2130982905, 703971511, 738804006, -890144598, 1673338092, 1121122316, 935749207, -1098807135, 100155571, -1531181121, 910421017, -1175081305, -203137221, 1784383983, -902822117, 1053155617, -1439711653, -1852660071, -126563500, 1153185653, -897298891, 1722349765, -1413054558, 1041340453, 1220052794}, 51 - TextUtils.indexOf("", "", 0, 0), objArr8);
                                    throw getNotEmbeddedClassException(((String) objArr8[0]).intern());
                                } else if (superclass.equals(KirimanUang.class)) {
                                    Object[] objArr9 = new Object[1];
                                    c(new int[]{1071018105, -2130982905, 703971511, 738804006, -890144598, 1673338092, 1121122316, 935749207, -1098807135, 100155571, -1531181121, 910421017, -1175081305, -203137221, 1784383983, -902822117, 1020173140, 400258406, -1124461680, -839001339, -1539088189, 370964126}, 44 - TextUtils.getCapsMode("", 0, 0), objArr9);
                                    throw getNotEmbeddedClassException(((String) objArr9[0]).intern());
                                } else if (!superclass.equals(ReservasiOnline.class)) {
                                    if ((!superclass.equals(ListFormTeller.class) ? '@' : 'I') != 'I') {
                                        int i4 = i + setMinWidth$MediaBrowserCompat$CustomActionResultReceiver.cC;
                                        g = i4 % Property.TYPE_ARRAY;
                                        if (i4 % 2 != 0) {
                                            superclass.equals(CreditCardSupplement.class);
                                            throw new ArithmeticException("divide by zero");
                                        } else if (superclass.equals(CreditCardSupplement.class)) {
                                            Object[] objArr10 = new Object[1];
                                            c(new int[]{1071018105, -2130982905, 703971511, 738804006, -890144598, 1673338092, 1121122316, 935749207, -1098807135, 100155571, -1531181121, 910421017, -1175081305, -203137221, 1784383983, -902822117, -721491732, -258241463, -1867874672, 1992085549, 1452175140, -48198350, -768092890, 87674875, -1373857005, 494403037, 996660692, 1814260223}, 54 - (SystemClock.elapsedRealtimeNanos() > 0 ? 1 : (SystemClock.elapsedRealtimeNanos() == 0 ? 0 : -1)), objArr10);
                                            throw getNotEmbeddedClassException(((String) objArr10[0]).intern());
                                        } else {
                                            throw getMissingProxyClassException((Class<? extends RealmModel>) superclass);
                                        }
                                    } else {
                                        Object[] objArr11 = new Object[1];
                                        a(127 - Color.green(0), null, null, new byte[]{-120, -110, -115, -115, -110, -111, -125, -120, -126, -112, -119, -121, -113, -114, -124, -123, -116, -115, -122, -127, -126, -115, -124, -122, -119, -122, -116, -124, -117, -127, -118, -122, -120, -123, -119, -120, -122, -125, -121, -124, -122, -127, -123, -124, -125, -126, -127}, objArr11);
                                        throw getNotEmbeddedClassException(((String) objArr11[0]).intern());
                                    }
                                } else {
                                    Object[] objArr12 = new Object[1];
                                    c(new int[]{1071018105, -2130982905, 703971511, 738804006, -890144598, 1673338092, 1121122316, 935749207, -1098807135, 100155571, -1531181121, 910421017, -1175081305, -203137221, 1784383983, -902822117, 401582301, 931127079, -614454011, -447239837, 1538157200, -1066797610, -702940252, 1235950341}, 48 - TextUtils.getTrimmedLength(""), objArr12);
                                    throw getNotEmbeddedClassException(((String) objArr12[0]).intern());
                                }
                            } else {
                                Object[] objArr13 = new Object[1];
                                a(127 - (ViewConfiguration.getScrollBarSize() >> 8), null, null, new byte[]{-116, -120, -122, -105, -119, -113, -116, -110, -120, -105, -108, -118, -122, -109, -120, -110, -117, -119, -104, -105, -105, -124, -123, -116, -115, -122, -127, -126, -115, -124, -122, -119, -122, -116, -124, -117, -127, -118, -122, -120, -123, -119, -120, -122, -125, -121, -124, -122, -127, -123, -124, -125, -126, -127}, objArr13);
                                throw getNotEmbeddedClassException(((String) objArr13[0]).intern());
                            }
                        } else {
                            Object[] objArr14 = new Object[1];
                            a(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + Property.TYPE_ARRAY, null, null, new byte[]{-119, -118, -100, -126, -127, -127, -101, -124, -123, -116, -115, -122, -127, -126, -115, -124, -122, -119, -122, -116, -124, -117, -127, -118, -122, -120, -123, -119, -120, -122, -125, -121, -124, -122, -127, -123, -124, -125, -126, -127}, objArr14);
                            throw getNotEmbeddedClassException(((String) objArr14[0]).intern());
                        }
                    } else {
                        Object[] objArr15 = new Object[1];
                        a(127 - TextUtils.getTrimmedLength(""), null, null, new byte[]{-118, -122, -108, -113, -120, -122, -111, -124, -123, -116, -115, -122, -127, -126, -115, -124, -122, -119, -122, -116, -124, -117, -127, -118, -122, -120, -123, -119, -120, -122, -125, -121, -124, -122, -127, -123, -124, -125, -126, -127}, objArr15);
                        throw getNotEmbeddedClassException(((String) objArr15[0]).intern());
                    }
                } else {
                    Object[] objArr16 = new Object[1];
                    a((KeyEvent.getMaxKeyCode() >> 16) + 127, null, null, new byte[]{-115, -110, -118, -118, -122, -117, -105, -98, -124, -123, -116, -115, -122, -127, -126, -115, -124, -122, -119, -122, -116, -124, -117, -127, -118, -122, -120, -123, -119, -120, -122, -125, -121, -124, -122, -127, -123, -124, -125, -126, -127}, objArr16);
                    throw getNotEmbeddedClassException(((String) objArr16[0]).intern());
                }
            } else {
                Object[] objArr17 = new Object[1];
                a(setHasDecor$MediaBrowserCompat$MediaItem.aQ - TextUtils.lastIndexOf("", '0'), null, null, new byte[]{-116, -120, -122, -105, -119, -113, -116, -110, -120, -105, -124, -123, -116, -115, -122, -127, -126, -115, -124, -122, -119, -122, -116, -124, -117, -127, -118, -122, -120, -123, -119, -120, -122, -125, -121, -124, -122, -127, -123, -124, -125, -126, -127}, objArr17);
                throw getNotEmbeddedClassException(((String) objArr17[0]).intern());
            }
        } else {
            Object[] objArr18 = new Object[1];
            a(setHasDecor$MediaBrowserCompat$MediaItem.aQ - ((byte) KeyEvent.getModifierMetaStateMask()), null, null, new byte[]{-118, -122, -120, -126, -119, -110, -97, -124, -123, -116, -115, -122, -127, -126, -115, -124, -122, -119, -122, -116, -124, -117, -127, -118, -122, -120, -123, -119, -120, -122, -125, -121, -124, -122, -127, -123, -124, -125, -126, -127}, objArr18);
            throw getNotEmbeddedClassException(((String) objArr18[0]).intern());
        }
    }
}
