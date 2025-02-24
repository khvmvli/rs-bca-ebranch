package o;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.media.RingtoneManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import com.bca.smartbranch.activity.BN7PengambilanNotificationActivity;
import com.bca.smartbranch.activity.DetailBNBerhasilNotificationActivity;
import com.bca.smartbranch.activity.DetailBNPengembalianDanaNotificationActivity;
import com.bca.smartbranch.activity.DetailBerhasilBTNotificationActivity;
import com.bca.smartbranch.activity.DetailBerhasilEChannelNotificationActivity;
import com.bca.smartbranch.activity.DetailBerhasilKliringActivity;
import com.bca.smartbranch.activity.DetailBerhasilNotificationActivity;
import com.bca.smartbranch.activity.DetailBerhasilORNotificationActivity;
import com.bca.smartbranch.activity.DetailBerhasilRONotificationActivity;
import com.bca.smartbranch.activity.DetailBerhasilTarikanNotificationActivity;
import com.bca.smartbranch.activity.DetailBerhasilTellerNotificationActivity;
import com.bca.smartbranch.activity.DetailStatusPengajuanCCNotificationActivity;
import com.bca.smartbranch.activity.DetailTundaEChannelNotificationActivity;
import com.bca.smartbranch.activity.DetailTundaNotificationActivity;
import com.bca.smartbranch.activity.DetailTundaNotificationBookedActivity;
import com.bca.smartbranch.data.api.response.FirebaseResponse;
import com.bca.smartbranch.data.localdb.ReservasiOnline;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import java.util.ArrayList;
import java.util.Random;
import o.ListUtil;
import o.ParseException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: classes-dex2jar.jar:o/setPromotion.class */
public class setPromotion extends FirebaseMessagingService {
    /* JADX WARN: Multi-variable type inference failed */
    public void onMessageReceived(RemoteMessage remoteMessage) {
        JSONArray jSONArray;
        Class cls;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        if (remoteMessage.getData().size() > 0) {
            FirebaseResponse firebaseResponse = new FirebaseResponse();
            firebaseResponse.setType((String) remoteMessage.getData().get("Type"));
            firebaseResponse.setAlert((String) remoteMessage.getData().get("Alert"));
            firebaseResponse.setRefNo((String) remoteMessage.getData().get("RefNo"));
            firebaseResponse.setTitle(remoteMessage.getNotification().getTitle());
            try {
                jSONArray = new JSONArray((String) remoteMessage.getData().get("TxnDataDetail"));
            } catch (JSONException e) {
                Log.i("EBRANCH", String.valueOf(e));
                jSONArray = null;
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                FirebaseResponse.TxnDataDetail txnDataDetail = new FirebaseResponse.TxnDataDetail();
                txnDataDetail.setKey(optJSONObject.optString("Key"));
                txnDataDetail.setValue(optJSONObject.optString("Value"));
                JSONArray optJSONArray = optJSONObject.optJSONArray("ValueArray");
                if (optJSONArray != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                        FirebaseResponse.ValueTxnDataDetail valueTxnDataDetail = new FirebaseResponse.ValueTxnDataDetail();
                        JSONObject optJSONObject2 = optJSONArray.optJSONObject(i2);
                        try {
                            str = optJSONObject2.getString("TxnType");
                        } catch (JSONException e2) {
                            str = null;
                        }
                        try {
                            str2 = optJSONObject2.getString("AccountNumber");
                        } catch (JSONException e3) {
                            str2 = null;
                        }
                        try {
                            str3 = optJSONObject2.getString("BankName");
                        } catch (JSONException e4) {
                            str3 = null;
                        }
                        try {
                            str4 = optJSONObject2.getString("Amount");
                        } catch (JSONException e5) {
                            str4 = null;
                        }
                        try {
                            str5 = optJSONObject2.getString("ReceiverName");
                        } catch (JSONException e6) {
                            str5 = null;
                        }
                        try {
                            str6 = optJSONObject2.getString("warkat_number");
                        } catch (JSONException e7) {
                            str6 = null;
                        }
                        try {
                            str7 = optJSONObject2.getString("clearing_code");
                        } catch (JSONException e8) {
                            str7 = null;
                        }
                        try {
                            str8 = optJSONObject2.getString("warkat_type");
                        } catch (JSONException e9) {
                            str8 = null;
                        }
                        try {
                            str9 = optJSONObject2.getString("bank_name");
                        } catch (JSONException e10) {
                            str9 = null;
                        }
                        try {
                            str10 = optJSONObject2.getString("amount");
                        } catch (JSONException e11) {
                            str10 = null;
                        }
                        valueTxnDataDetail.setTxnType(str);
                        valueTxnDataDetail.setAccountNumber(str2);
                        valueTxnDataDetail.setBankName(str3);
                        valueTxnDataDetail.setAmount(str4);
                        valueTxnDataDetail.setReceiverName(str5);
                        valueTxnDataDetail.setWarkatNumber(str6);
                        valueTxnDataDetail.setClearingCode(str7);
                        valueTxnDataDetail.setWarkatType(str8);
                        valueTxnDataDetail.setBankNameKliring(str9);
                        valueTxnDataDetail.setAmountKliring(str10);
                        arrayList2.add(valueTxnDataDetail);
                    }
                    txnDataDetail.setValueArray(arrayList2);
                    jSONArray = jSONArray;
                    firebaseResponse = firebaseResponse;
                } else {
                    firebaseResponse = firebaseResponse;
                    jSONArray = jSONArray;
                }
                arrayList.add(txnDataDetail);
            }
            firebaseResponse.setTxnDataDetailList(arrayList);
            Parcelable e12 = ListUtil.OneItemImmutableList.e(firebaseResponse);
            Bundle bundle = new Bundle();
            bundle.putParcelable("response", e12);
            String type = firebaseResponse.getType();
            type.hashCode();
            int hashCode = type.hashCode();
            char c = 65535;
            switch (hashCode) {
                case 1537:
                    if (type.equals(ReservasiOnline.SETORAN_TUNAI)) {
                        c = 0;
                        break;
                    }
                    break;
                case 1538:
                    if (type.equals("02")) {
                        c = 1;
                        break;
                    }
                    break;
                case 1539:
                    if (type.equals(ReservasiOnline.PENGAJUAN_KARTU_KREDIT)) {
                        c = 2;
                        break;
                    }
                    break;
                default:
                    switch (hashCode) {
                        case 1541:
                            if (type.equals("05")) {
                                c = 3;
                                break;
                            }
                            break;
                        case 1542:
                            if (type.equals("06")) {
                                c = 4;
                                break;
                            }
                            break;
                        case 1543:
                            if (type.equals(ReservasiOnline.PEMBUKAAN_REKENING)) {
                                c = 5;
                                break;
                            }
                            break;
                        case 1544:
                            if (type.equals("08")) {
                                c = 6;
                                break;
                            }
                            break;
                        case 1545:
                            if (type.equals(ReservasiOnline.DEPOSITO)) {
                                c = 7;
                                break;
                            }
                            break;
                        default:
                            switch (hashCode) {
                                case 1567:
                                    if (type.equals(ReservasiOnline.LAYANAN_GIRO)) {
                                        c = '\b';
                                        break;
                                    }
                                    break;
                                case 1568:
                                    if (type.equals("11")) {
                                        c = '\t';
                                        break;
                                    }
                                    break;
                                case 1569:
                                    if (type.equals("12")) {
                                        c = '\n';
                                        break;
                                    }
                                    break;
                                case 1570:
                                    if (type.equals("13")) {
                                        c = 11;
                                        break;
                                    }
                                    break;
                                case 1571:
                                    if (type.equals("14")) {
                                        c = '\f';
                                        break;
                                    }
                                    break;
                                case 1572:
                                    if (type.equals("15")) {
                                        c = '\r';
                                        break;
                                    }
                                    break;
                                case 1573:
                                    if (type.equals(ReservasiOnline.PEMESANAN_MATA_UANG_ASING)) {
                                        c = 14;
                                        break;
                                    }
                                    break;
                                case 1574:
                                    if (type.equals(ReservasiOnline.INTERNET_MOBILE_BANKING)) {
                                        c = 15;
                                        break;
                                    }
                                    break;
                                case 1575:
                                    if (type.equals("18")) {
                                        c = 16;
                                        break;
                                    }
                                    break;
                            }
                    }
            }
            switch (c) {
                case 0:
                    cls = DetailBerhasilNotificationActivity.class;
                    break;
                case 1:
                    cls = DetailTundaNotificationActivity.class;
                    break;
                case 2:
                    cls = DetailTundaNotificationBookedActivity.class;
                    break;
                case 3:
                    cls = DetailBerhasilTellerNotificationActivity.class;
                    break;
                case 4:
                    cls = DetailStatusPengajuanCCNotificationActivity.class;
                    break;
                case 5:
                    cls = DetailBerhasilEChannelNotificationActivity.class;
                    break;
                case 6:
                    cls = DetailTundaEChannelNotificationActivity.class;
                    break;
                case 7:
                    documentProvider.b().d(new onClickItem(e12));
                    cls = BN7PengambilanNotificationActivity.class;
                    break;
                case '\b':
                    cls = DetailBNBerhasilNotificationActivity.class;
                    break;
                case '\t':
                    cls = DetailBNPengembalianDanaNotificationActivity.class;
                    break;
                case '\n':
                    cls = DetailBerhasilTarikanNotificationActivity.class;
                    break;
                case 11:
                    cls = DetailBerhasilRONotificationActivity.class;
                    break;
                case '\f':
                    cls = DetailBerhasilORNotificationActivity.class;
                    break;
                case '\r':
                case 14:
                case 15:
                    cls = DetailBerhasilBTNotificationActivity.class;
                    break;
                case 16:
                    cls = DetailBerhasilKliringActivity.class;
                    break;
                default:
                    cls = null;
                    break;
            }
            Intent intent = new Intent((Context) this, (Class<?>) cls);
            intent.putExtras(bundle);
            PendingIntent activity = Build.VERSION.SDK_INT >= 31 ? PendingIntent.getActivity(this, new Random().nextInt(), intent, 201326592) : PendingIntent.getActivity(this, new Random().nextInt(), intent, 134217728);
            String alert = firebaseResponse.getAlert();
            String title = firebaseResponse.getTitle();
            String string = getApplicationContext().getString(2131820699);
            ParseException.RemoteActionCompatParcelizer e13 = new ParseException.RemoteActionCompatParcelizer(this, string).d(BitmapFactory.decodeResource(getResources(), 2131623936)).b((CharSequence) title).d(alert).e(true).a(new ParseException.write().c(alert)).c(activity).e(RingtoneManager.getDefaultUri(2));
            e13.e(2131231057);
            NotificationManager notificationManager = (NotificationManager) getSystemService("notification");
            if (Build.VERSION.SDK_INT >= 26) {
                NotificationChannel notificationChannel = new NotificationChannel(string, title, 3);
                notificationChannel.setDescription(alert);
                notificationManager.createNotificationChannel(notificationChannel);
            }
            notificationManager.notify(new Random().nextInt(), e13.b());
        }
    }

    public void onNewToken(String str) {
        StringBuilder sb = new StringBuilder("Refreshed token: ");
        sb.append(str);
        Log.i("EBRANCH", sb.toString());
    }
}
