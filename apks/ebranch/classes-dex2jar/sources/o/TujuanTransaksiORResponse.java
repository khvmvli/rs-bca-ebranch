package o;

import android.content.Context;
import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
import java.util.Iterator;
import java.util.List;
import o.StockListBNResponse;
/* loaded from: classes-dex2jar.jar:o/TujuanTransaksiORResponse.class */
public final class TujuanTransaksiORResponse implements TujuanTransaksiORResponse$$Parcelable {
    private final boolean a;
    private final HttpTransaction e;

    /* loaded from: classes-dex2jar.jar:o/TujuanTransaksiORResponse$TujuanTransaksiOR.class */
    public final class TujuanTransaksiOR implements TujuanTransaksiORResponse$$Parcelable {
        private final HttpTransaction b;

        public TujuanTransaksiOR(HttpTransaction httpTransaction) {
            subscribeReservationRescheduleEvent.e(httpTransaction, "");
            this.b = httpTransaction;
        }

        @Override // o.TujuanTransaksiORResponse$$Parcelable
        public final defaultInspectorModulesProvider b(Context context) {
            boolean z;
            subscribeReservationRescheduleEvent.e(context, "");
            setResponseContentType setresponsecontenttype = new setResponseContentType();
            StringBuilder sb = new StringBuilder("curl -X ");
            sb.append(this.b.getMethod());
            setresponsecontenttype.d(sb.toString());
            List<GetTxnTellerDetailResponse$TxnDetail$WarkatTunda$$Parcelable> parsedRequestHeaders$com_github_ChuckerTeam_Chucker_library = this.b.getParsedRequestHeaders$com_github_ChuckerTeam_Chucker_library();
            if (parsedRequestHeaders$com_github_ChuckerTeam_Chucker_library != null) {
                Iterator<T> it = parsedRequestHeaders$com_github_ChuckerTeam_Chucker_library.iterator();
                boolean z2 = false;
                while (true) {
                    z = z2;
                    if (!it.hasNext()) {
                        break;
                    }
                    GetTxnTellerDetailResponse$TxnDetail$WarkatTunda$$Parcelable getTxnTellerDetailResponse$TxnDetail$WarkatTunda$$Parcelable = (GetTxnTellerDetailResponse$TxnDetail$WarkatTunda$$Parcelable) it.next();
                    z2 = z2;
                    if (CheckOTPSessionPresenter.d("Accept-Encoding", getTxnTellerDetailResponse$TxnDetail$WarkatTunda$$Parcelable.e, true)) {
                        z2 = z2;
                        if (CheckOTPSessionPresenter.d("gzip", getTxnTellerDetailResponse$TxnDetail$WarkatTunda$$Parcelable.d, true)) {
                            z2 = true;
                        }
                    }
                    StringBuilder sb2 = new StringBuilder(" -H \"");
                    sb2.append(getTxnTellerDetailResponse$TxnDetail$WarkatTunda$$Parcelable.e);
                    sb2.append(": ");
                    sb2.append(getTxnTellerDetailResponse$TxnDetail$WarkatTunda$$Parcelable.d);
                    sb2.append('\"');
                    setresponsecontenttype.d(sb2.toString());
                }
            } else {
                z = false;
            }
            String requestBody = this.b.getRequestBody();
            String str = requestBody;
            boolean z3 = true;
            if (str != null) {
                z3 = str.length() == 0;
            }
            if (!z3) {
                StringBuilder sb3 = new StringBuilder(" --data $'");
                sb3.append(CheckOTPSessionPresenter.a(requestBody, "\n", "\\n", false));
                sb3.append('\'');
                setresponsecontenttype.d(sb3.toString());
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append(z ? " --compressed " : " ");
            sb4.append(this.b.getFormattedUrl$com_github_ChuckerTeam_Chucker_library(false));
            setresponsecontenttype.d(sb4.toString());
            return setresponsecontenttype;
        }
    }

    public TujuanTransaksiORResponse(HttpTransaction httpTransaction, boolean z) {
        subscribeReservationRescheduleEvent.e(httpTransaction, "");
        this.e = httpTransaction;
        this.a = z;
    }

    @Override // o.TujuanTransaksiORResponse$$Parcelable
    public final defaultInspectorModulesProvider b(Context context) {
        String str;
        String str2;
        subscribeReservationRescheduleEvent.e(context, "");
        setResponseContentType setresponsecontenttype = new setResponseContentType();
        StringBuilder sb = new StringBuilder();
        sb.append(context.getString(setCurrencyName$MediaBrowserCompat$ItemReceiver.Q));
        sb.append(": ");
        sb.append(this.e.getFormattedUrl$com_github_ChuckerTeam_Chucker_library(this.a));
        sb.append('\n');
        setresponsecontenttype.d(sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(context.getString(setCurrencyName$MediaBrowserCompat$ItemReceiver.s));
        sb2.append(": ");
        sb2.append(this.e.getMethod());
        sb2.append('\n');
        setresponsecontenttype.d(sb2.toString());
        StringBuilder sb3 = new StringBuilder();
        sb3.append(context.getString(setCurrencyName$MediaBrowserCompat$ItemReceiver.w));
        sb3.append(": ");
        sb3.append(this.e.getProtocol());
        sb3.append('\n');
        setresponsecontenttype.d(sb3.toString());
        StringBuilder sb4 = new StringBuilder();
        sb4.append(context.getString(setCurrencyName$MediaBrowserCompat$ItemReceiver.J));
        sb4.append(": ");
        sb4.append(this.e.getStatus$com_github_ChuckerTeam_Chucker_library());
        sb4.append('\n');
        setresponsecontenttype.d(sb4.toString());
        StringBuilder sb5 = new StringBuilder();
        sb5.append(context.getString(setCurrencyName$MediaBrowserCompat$ItemReceiver.A));
        sb5.append(": ");
        sb5.append(this.e.getResponseSummaryText$com_github_ChuckerTeam_Chucker_library());
        sb5.append('\n');
        setresponsecontenttype.d(sb5.toString());
        int i = this.e.isSsl$com_github_ChuckerTeam_Chucker_library() ? setCurrencyName$MediaBrowserCompat$ItemReceiver.V : setCurrencyName$MediaBrowserCompat$ItemReceiver.p;
        StringBuilder sb6 = new StringBuilder();
        sb6.append(context.getString(setCurrencyName$MediaBrowserCompat$ItemReceiver.L));
        sb6.append(": ");
        sb6.append(context.getString(i));
        sb6.append('\n');
        setresponsecontenttype.d(sb6.toString());
        setresponsecontenttype.d("\n");
        StringBuilder sb7 = new StringBuilder();
        sb7.append(context.getString(setCurrencyName$MediaBrowserCompat$ItemReceiver.C));
        sb7.append(": ");
        sb7.append(this.e.getRequestDateString$com_github_ChuckerTeam_Chucker_library());
        sb7.append('\n');
        setresponsecontenttype.d(sb7.toString());
        StringBuilder sb8 = new StringBuilder();
        sb8.append(context.getString(setCurrencyName$MediaBrowserCompat$ItemReceiver.B));
        sb8.append(": ");
        sb8.append(this.e.getResponseDateString$com_github_ChuckerTeam_Chucker_library());
        sb8.append('\n');
        setresponsecontenttype.d(sb8.toString());
        StringBuilder sb9 = new StringBuilder();
        sb9.append(context.getString(setCurrencyName$MediaBrowserCompat$ItemReceiver.j));
        sb9.append(": ");
        sb9.append(this.e.getDurationString$com_github_ChuckerTeam_Chucker_library());
        sb9.append('\n');
        setresponsecontenttype.d(sb9.toString());
        setresponsecontenttype.d("\n");
        StringBuilder sb10 = new StringBuilder();
        sb10.append(context.getString(setCurrencyName$MediaBrowserCompat$ItemReceiver.y));
        sb10.append(": ");
        sb10.append(this.e.getRequestSizeString$com_github_ChuckerTeam_Chucker_library());
        sb10.append('\n');
        setresponsecontenttype.d(sb10.toString());
        StringBuilder sb11 = new StringBuilder();
        sb11.append(context.getString(setCurrencyName$MediaBrowserCompat$ItemReceiver.z));
        sb11.append(": ");
        sb11.append(this.e.getResponseSizeString$com_github_ChuckerTeam_Chucker_library());
        sb11.append('\n');
        setresponsecontenttype.d(sb11.toString());
        StringBuilder sb12 = new StringBuilder();
        sb12.append(context.getString(setCurrencyName$MediaBrowserCompat$ItemReceiver.O));
        sb12.append(": ");
        sb12.append(this.e.getTotalSizeString$com_github_ChuckerTeam_Chucker_library());
        sb12.append('\n');
        setresponsecontenttype.d(sb12.toString());
        setresponsecontenttype.d("\n");
        StringBuilder sb13 = new StringBuilder("---------- ");
        sb13.append(context.getString(setCurrencyName$MediaBrowserCompat$ItemReceiver.u));
        sb13.append(" ----------\n\n");
        setresponsecontenttype.d(sb13.toString());
        StockListBNResponse.StockBranch stockBranch = StockListBNResponse.StockBranch.d;
        boolean z = false;
        String d = StockListBNResponse.StockBranch.d(this.e.getParsedRequestHeaders$com_github_ChuckerTeam_Chucker_library(), false);
        if (!CheckOTPSessionPresenter.a(d)) {
            setresponsecontenttype.d(d);
            setresponsecontenttype.d("\n");
        }
        if (this.e.isRequestBodyPlainText()) {
            String requestBody = this.e.getRequestBody();
            str = requestBody == null || CheckOTPSessionPresenter.a(requestBody) ? context.getString(setCurrencyName$MediaBrowserCompat$ItemReceiver.e) : this.e.getFormattedRequestBody$com_github_ChuckerTeam_Chucker_library();
        } else {
            str = context.getString(setCurrencyName$MediaBrowserCompat$ItemReceiver.c);
        }
        setresponsecontenttype.d(str);
        setresponsecontenttype.d("\n\n");
        StringBuilder sb14 = new StringBuilder("---------- ");
        sb14.append(context.getString(setCurrencyName$MediaBrowserCompat$ItemReceiver.A));
        sb14.append(" ----------\n\n");
        setresponsecontenttype.d(sb14.toString());
        StockListBNResponse.StockBranch stockBranch2 = StockListBNResponse.StockBranch.d;
        String d2 = StockListBNResponse.StockBranch.d(this.e.getParsedResponseHeaders$com_github_ChuckerTeam_Chucker_library(), false);
        if (!CheckOTPSessionPresenter.a(d2)) {
            setresponsecontenttype.d(d2);
            setresponsecontenttype.d("\n");
        }
        if (this.e.isResponseBodyPlainText()) {
            String responseBody = this.e.getResponseBody();
            if (responseBody == null || CheckOTPSessionPresenter.a(responseBody)) {
                z = true;
            }
            str2 = z ? context.getString(setCurrencyName$MediaBrowserCompat$ItemReceiver.e) : this.e.getFormattedResponseBody$com_github_ChuckerTeam_Chucker_library();
        } else {
            str2 = context.getString(setCurrencyName$MediaBrowserCompat$ItemReceiver.c);
        }
        setresponsecontenttype.d(str2);
        return setresponsecontenttype;
    }
}
