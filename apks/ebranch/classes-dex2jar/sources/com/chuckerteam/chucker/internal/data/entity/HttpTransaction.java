package com.chuckerteam.chucker.internal.data.entity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import o.BN5PilihNomorOTPFragment_ViewBinding;
import o.CheckOTPSessionPresenter;
import o.GetTxnTellerDetailResponse$TxnDetail$WarkatTunda$$Parcelable;
import o.StockListBNResponse;
import o.SubmitBankNotesResponse;
import o.getDescriptions;
import o.onSelectNoRek;
import o.showPekerjaanDialog;
import o.subscribeDraftEvent;
import o.subscribeReservationRescheduleEvent;
import okhttp3.Headers;
import okhttp3.HttpUrl;
/* loaded from: classes-dex2jar.jar:com/chuckerteam/chucker/internal/data/entity/HttpTransaction.class */
public final class HttpTransaction {
    private String error;
    private String host;
    private long id;
    private boolean isRequestBodyPlainText;
    private boolean isResponseBodyPlainText;
    private String method;
    private String path;
    private String protocol;
    private String requestBody;
    private String requestContentType;
    private Long requestDate;
    private String requestHeaders;
    private Long requestPayloadSize;
    private String responseBody;
    private String responseCipherSuite;
    private Integer responseCode;
    private String responseContentType;
    private Long responseDate;
    private String responseHeaders;
    private byte[] responseImageData;
    private String responseMessage;
    private Long responsePayloadSize;
    private String responseTlsVersion;
    private String scheme;
    private Long tookMs;
    private String url;

    /* loaded from: classes-dex2jar.jar:com/chuckerteam/chucker/internal/data/entity/HttpTransaction$IconCompatParcelizer.class */
    public static final class IconCompatParcelizer extends showPekerjaanDialog<List<? extends GetTxnTellerDetailResponse$TxnDetail$WarkatTunda$$Parcelable>> {
        IconCompatParcelizer() {
        }
    }

    /* loaded from: classes-dex2jar.jar:com/chuckerteam/chucker/internal/data/entity/HttpTransaction$read.class */
    public enum read {
        Requested,
        Complete,
        Failed
    }

    public HttpTransaction() {
        this(0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, null, 16842753, null);
    }

    public HttpTransaction(long j, Long l, Long l2, Long l3, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Long l4, String str9, String str10, String str11, boolean z, Integer num, String str12, String str13, Long l5, String str14, String str15, String str16, boolean z2, byte[] bArr) {
        this.id = j;
        this.requestDate = l;
        this.responseDate = l2;
        this.tookMs = l3;
        this.protocol = str;
        this.method = str2;
        this.url = str3;
        this.host = str4;
        this.path = str5;
        this.scheme = str6;
        this.responseTlsVersion = str7;
        this.responseCipherSuite = str8;
        this.requestPayloadSize = l4;
        this.requestContentType = str9;
        this.requestHeaders = str10;
        this.requestBody = str11;
        this.isRequestBodyPlainText = z;
        this.responseCode = num;
        this.responseMessage = str12;
        this.error = str13;
        this.responsePayloadSize = l5;
        this.responseContentType = str14;
        this.responseHeaders = str15;
        this.responseBody = str16;
        this.isResponseBodyPlainText = z2;
        this.responseImageData = bArr;
    }

    public /* synthetic */ HttpTransaction(long j, Long l, Long l2, Long l3, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Long l4, String str9, String str10, String str11, boolean z, Integer num, String str12, String str13, Long l5, String str14, String str15, String str16, boolean z2, byte[] bArr, int i, subscribeDraftEvent subscribedraftevent) {
        this((i & 1) != 0 ? 0 : j, l, l2, l3, str, str2, str3, str4, str5, str6, str7, str8, l4, str9, str10, str11, (i & 65536) != 0 ? true : z, num, str12, str13, l5, str14, str15, str16, (i & 16777216) != 0 ? true : z2, bArr);
    }

    public final String formatBody$com_github_ChuckerTeam_Chucker_library(String str, String str2) {
        String str3;
        subscribeReservationRescheduleEvent.e(str, "");
        String str4 = str2;
        if (str4 == null || CheckOTPSessionPresenter.a(str4)) {
            str3 = str;
        } else if (CheckOTPSessionPresenter.d((CharSequence) str4, (CharSequence) "json", true)) {
            StockListBNResponse.StockBranch stockBranch = StockListBNResponse.StockBranch.d;
            str3 = StockListBNResponse.StockBranch.b(str);
        } else if (CheckOTPSessionPresenter.d((CharSequence) str4, (CharSequence) "xml", true)) {
            StockListBNResponse.StockBranch stockBranch2 = StockListBNResponse.StockBranch.d;
            str3 = StockListBNResponse.StockBranch.a(str);
        } else {
            str3 = str;
            if (CheckOTPSessionPresenter.d((CharSequence) str4, (CharSequence) "x-www-form-urlencoded", true)) {
                StockListBNResponse.StockBranch stockBranch3 = StockListBNResponse.StockBranch.d;
                str3 = StockListBNResponse.StockBranch.d(str);
            }
        }
        return str3;
    }

    public final String formatBytes$com_github_ChuckerTeam_Chucker_library(long j) {
        StockListBNResponse.StockBranch stockBranch = StockListBNResponse.StockBranch.d;
        return StockListBNResponse.StockBranch.c(j, true);
    }

    public final String getDurationString$com_github_ChuckerTeam_Chucker_library() {
        String str;
        Long l = this.tookMs;
        if (l != null) {
            long longValue = l.longValue();
            StringBuilder sb = new StringBuilder();
            sb.append(longValue);
            sb.append(" ms");
            str = sb.toString();
        } else {
            str = null;
        }
        return str;
    }

    public final String getError() {
        return this.error;
    }

    public final String getFormattedPath$com_github_ChuckerTeam_Chucker_library(boolean z) {
        String str = this.url;
        HttpUrl httpUrl = str != null ? HttpUrl.get(str) : null;
        if (httpUrl == null) {
            return "";
        }
        getDescriptions.read read2 = getDescriptions.d;
        subscribeReservationRescheduleEvent.e(httpUrl, "");
        return (z ? getDescriptions.read.c(httpUrl) : getDescriptions.read.a(httpUrl)).b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
        if (r0 == null) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final java.lang.String getFormattedRequestBody$com_github_ChuckerTeam_Chucker_library() {
        /*
            r4 = this;
            r0 = r4
            java.lang.String r0 = r0.requestBody
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L_0x0019
            r0 = r4
            r1 = r5
            r2 = r4
            java.lang.String r2 = r2.requestContentType
            java.lang.String r0 = r0.formatBody$com_github_ChuckerTeam_Chucker_library(r1, r2)
            r6 = r0
            r0 = r6
            r5 = r0
            r0 = r6
            if (r0 != 0) goto L_0x001c
        L_0x0019:
            java.lang.String r0 = ""
            r5 = r0
        L_0x001c:
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.chuckerteam.chucker.internal.data.entity.HttpTransaction.getFormattedRequestBody$com_github_ChuckerTeam_Chucker_library():java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
        if (r0 == null) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final java.lang.String getFormattedResponseBody$com_github_ChuckerTeam_Chucker_library() {
        /*
            r4 = this;
            r0 = r4
            java.lang.String r0 = r0.responseBody
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L_0x0019
            r0 = r4
            r1 = r5
            r2 = r4
            java.lang.String r2 = r2.responseContentType
            java.lang.String r0 = r0.formatBody$com_github_ChuckerTeam_Chucker_library(r1, r2)
            r6 = r0
            r0 = r6
            r5 = r0
            r0 = r6
            if (r0 != 0) goto L_0x001c
        L_0x0019:
            java.lang.String r0 = ""
            r5 = r0
        L_0x001c:
            r0 = r5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.chuckerteam.chucker.internal.data.entity.HttpTransaction.getFormattedResponseBody$com_github_ChuckerTeam_Chucker_library():java.lang.String");
    }

    public final String getFormattedUrl$com_github_ChuckerTeam_Chucker_library(boolean z) {
        String str = this.url;
        HttpUrl httpUrl = str != null ? HttpUrl.get(str) : null;
        if (httpUrl == null) {
            return "";
        }
        getDescriptions.read read2 = getDescriptions.d;
        subscribeReservationRescheduleEvent.e(httpUrl, "");
        return (z ? getDescriptions.read.c(httpUrl) : getDescriptions.read.a(httpUrl)).e();
    }

    public final String getHost$com_github_ChuckerTeam_Chucker_library() {
        return this.host;
    }

    public final long getId$com_github_ChuckerTeam_Chucker_library() {
        return this.id;
    }

    public final String getMethod() {
        return this.method;
    }

    public final String getNotificationText$com_github_ChuckerTeam_Chucker_library() {
        String str;
        int i = HttpTransaction$MediaBrowserCompat$CustomActionResultReceiver.c[getStatus$com_github_ChuckerTeam_Chucker_library().ordinal()];
        if (i == 1) {
            StringBuilder sb = new StringBuilder(" ! ! !  ");
            sb.append(this.method);
            sb.append(' ');
            sb.append(this.path);
            str = sb.toString();
        } else if (i != 2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.responseCode);
            sb2.append(' ');
            sb2.append(this.method);
            sb2.append(' ');
            sb2.append(this.path);
            str = sb2.toString();
        } else {
            StringBuilder sb3 = new StringBuilder(" . . .  ");
            sb3.append(this.method);
            sb3.append(' ');
            sb3.append(this.path);
            str = sb3.toString();
        }
        return str;
    }

    public final List<GetTxnTellerDetailResponse$TxnDetail$WarkatTunda$$Parcelable> getParsedRequestHeaders$com_github_ChuckerTeam_Chucker_library() {
        return null;
    }

    public final List<GetTxnTellerDetailResponse$TxnDetail$WarkatTunda$$Parcelable> getParsedResponseHeaders$com_github_ChuckerTeam_Chucker_library() {
        SubmitBankNotesResponse.SubmitBankNotesDataOutput submitBankNotesDataOutput = SubmitBankNotesResponse.SubmitBankNotesDataOutput.b;
        BN5PilihNomorOTPFragment_ViewBinding c = SubmitBankNotesResponse.SubmitBankNotesDataOutput.c();
        String str = this.responseHeaders;
        return (List) (str == null ? null : c.b(new StringReader(str), new IconCompatParcelizer().e));
    }

    public final String getPath$com_github_ChuckerTeam_Chucker_library() {
        return this.path;
    }

    public final String getProtocol() {
        return this.protocol;
    }

    public final String getRequestBody() {
        return this.requestBody;
    }

    public final String getRequestContentType() {
        return this.requestContentType;
    }

    public final Long getRequestDate() {
        return this.requestDate;
    }

    public final String getRequestDateString$com_github_ChuckerTeam_Chucker_library() {
        Long l = this.requestDate;
        return l != null ? new Date(l.longValue()).toString() : null;
    }

    public final String getRequestHeaders() {
        return this.requestHeaders;
    }

    public final String getRequestHeadersString$com_github_ChuckerTeam_Chucker_library(boolean z) {
        StockListBNResponse.StockBranch stockBranch = StockListBNResponse.StockBranch.d;
        return StockListBNResponse.StockBranch.d(getParsedRequestHeaders$com_github_ChuckerTeam_Chucker_library(), z);
    }

    public final Long getRequestPayloadSize() {
        return this.requestPayloadSize;
    }

    public final String getRequestSizeString$com_github_ChuckerTeam_Chucker_library() {
        Long l = this.requestPayloadSize;
        return formatBytes$com_github_ChuckerTeam_Chucker_library(l != null ? l.longValue() : 0);
    }

    public final String getResponseBody() {
        return this.responseBody;
    }

    public final String getResponseCipherSuite() {
        return this.responseCipherSuite;
    }

    public final Integer getResponseCode() {
        return this.responseCode;
    }

    public final String getResponseContentType() {
        return this.responseContentType;
    }

    public final Long getResponseDate() {
        return this.responseDate;
    }

    public final String getResponseDateString$com_github_ChuckerTeam_Chucker_library() {
        Long l = this.responseDate;
        return l != null ? new Date(l.longValue()).toString() : null;
    }

    public final String getResponseHeaders$com_github_ChuckerTeam_Chucker_library() {
        return this.responseHeaders;
    }

    public final String getResponseHeadersString$com_github_ChuckerTeam_Chucker_library(boolean z) {
        StockListBNResponse.StockBranch stockBranch = StockListBNResponse.StockBranch.d;
        return StockListBNResponse.StockBranch.d(getParsedResponseHeaders$com_github_ChuckerTeam_Chucker_library(), z);
    }

    public final Bitmap getResponseImageBitmap$com_github_ChuckerTeam_Chucker_library() {
        byte[] bArr = this.responseImageData;
        return bArr != null ? BitmapFactory.decodeByteArray(bArr, 0, bArr.length) : null;
    }

    public final byte[] getResponseImageData() {
        return this.responseImageData;
    }

    public final String getResponseMessage() {
        return this.responseMessage;
    }

    public final Long getResponsePayloadSize() {
        return this.responsePayloadSize;
    }

    public final String getResponseSizeString$com_github_ChuckerTeam_Chucker_library() {
        Long l = this.responsePayloadSize;
        return l != null ? formatBytes$com_github_ChuckerTeam_Chucker_library(l.longValue()) : null;
    }

    public final String getResponseSummaryText$com_github_ChuckerTeam_Chucker_library() {
        String str;
        int i = HttpTransaction$MediaBrowserCompat$CustomActionResultReceiver.c[getStatus$com_github_ChuckerTeam_Chucker_library().ordinal()];
        if (i == 1) {
            str = this.error;
        } else if (i != 2) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.responseCode);
            sb.append(' ');
            sb.append(this.responseMessage);
            str = sb.toString();
        } else {
            str = null;
        }
        return str;
    }

    public final String getResponseTlsVersion() {
        return this.responseTlsVersion;
    }

    public final String getScheme$com_github_ChuckerTeam_Chucker_library() {
        return this.scheme;
    }

    public final read getStatus$com_github_ChuckerTeam_Chucker_library() {
        return this.error != null ? read.Failed : this.responseCode == null ? read.Requested : read.Complete;
    }

    public final Long getTookMs() {
        return this.tookMs;
    }

    public final String getTotalSizeString$com_github_ChuckerTeam_Chucker_library() {
        Long l = this.requestPayloadSize;
        long j = 0;
        long longValue = l != null ? l.longValue() : 0;
        Long l2 = this.responsePayloadSize;
        if (l2 != null) {
            j = l2.longValue();
        }
        return formatBytes$com_github_ChuckerTeam_Chucker_library(longValue + j);
    }

    public final String getUrl$com_github_ChuckerTeam_Chucker_library() {
        return this.url;
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x0193, code lost:
        if (r10 == false) goto L_0x0198;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final boolean hasTheSameContent$com_github_ChuckerTeam_Chucker_library(com.chuckerteam.chucker.internal.data.entity.HttpTransaction r6) {
        /*
        // Method dump skipped, instructions count: 410
        */
        throw new UnsupportedOperationException("Method not decompiled: com.chuckerteam.chucker.internal.data.entity.HttpTransaction.hasTheSameContent$com_github_ChuckerTeam_Chucker_library(com.chuckerteam.chucker.internal.data.entity.HttpTransaction):boolean");
    }

    public final boolean isRequestBodyPlainText() {
        return this.isRequestBodyPlainText;
    }

    public final boolean isResponseBodyPlainText() {
        return this.isResponseBodyPlainText;
    }

    public final boolean isSsl$com_github_ChuckerTeam_Chucker_library() {
        return CheckOTPSessionPresenter.d(this.scheme, "https", true);
    }

    public final HttpTransaction populateUrl(HttpUrl httpUrl) {
        subscribeReservationRescheduleEvent.e(httpUrl, "");
        getDescriptions.read read2 = getDescriptions.d;
        subscribeReservationRescheduleEvent.e(httpUrl, "");
        getDescriptions a = getDescriptions.read.a(httpUrl);
        this.url = a.e();
        this.host = a.b;
        this.path = a.b();
        this.scheme = a.a;
        return this;
    }

    public final void setError(String str) {
        this.error = str;
    }

    public final void setHost$com_github_ChuckerTeam_Chucker_library(String str) {
        this.host = str;
    }

    public final void setId$com_github_ChuckerTeam_Chucker_library(long j) {
        this.id = j;
    }

    public final void setMethod(String str) {
        this.method = str;
    }

    public final void setPath$com_github_ChuckerTeam_Chucker_library(String str) {
        this.path = str;
    }

    public final void setProtocol(String str) {
        this.protocol = str;
    }

    public final void setRequestBody(String str) {
        this.requestBody = str;
    }

    public final void setRequestBodyPlainText(boolean z) {
        this.isRequestBodyPlainText = z;
    }

    public final void setRequestContentType(String str) {
        this.requestContentType = str;
    }

    public final void setRequestDate(Long l) {
        this.requestDate = l;
    }

    public final void setRequestHeaders(String str) {
        this.requestHeaders = str;
    }

    public final void setRequestHeaders(Headers headers) {
        subscribeReservationRescheduleEvent.e(headers, "");
        setRequestHeaders$com_github_ChuckerTeam_Chucker_library(toHttpHeaderList$com_github_ChuckerTeam_Chucker_library(headers));
    }

    public final void setRequestHeaders$com_github_ChuckerTeam_Chucker_library(List<GetTxnTellerDetailResponse$TxnDetail$WarkatTunda$$Parcelable> list) {
        subscribeReservationRescheduleEvent.e(list, "");
        SubmitBankNotesResponse.SubmitBankNotesDataOutput submitBankNotesDataOutput = SubmitBankNotesResponse.SubmitBankNotesDataOutput.b;
        BN5PilihNomorOTPFragment_ViewBinding c = SubmitBankNotesResponse.SubmitBankNotesDataOutput.c();
        this.requestHeaders = list == null ? c.b(onSelectNoRek.b) : c.a(list, list.getClass());
    }

    public final void setRequestPayloadSize(Long l) {
        this.requestPayloadSize = l;
    }

    public final void setResponseBody(String str) {
        this.responseBody = str;
    }

    public final void setResponseBodyPlainText(boolean z) {
        this.isResponseBodyPlainText = z;
    }

    public final void setResponseCipherSuite(String str) {
        this.responseCipherSuite = str;
    }

    public final void setResponseCode(Integer num) {
        this.responseCode = num;
    }

    public final void setResponseContentType(String str) {
        this.responseContentType = str;
    }

    public final void setResponseDate(Long l) {
        this.responseDate = l;
    }

    public final void setResponseHeaders(Headers headers) {
        subscribeReservationRescheduleEvent.e(headers, "");
        setResponseHeaders$com_github_ChuckerTeam_Chucker_library(toHttpHeaderList$com_github_ChuckerTeam_Chucker_library(headers));
    }

    public final void setResponseHeaders$com_github_ChuckerTeam_Chucker_library(String str) {
        this.responseHeaders = str;
    }

    public final void setResponseHeaders$com_github_ChuckerTeam_Chucker_library(List<GetTxnTellerDetailResponse$TxnDetail$WarkatTunda$$Parcelable> list) {
        subscribeReservationRescheduleEvent.e(list, "");
        SubmitBankNotesResponse.SubmitBankNotesDataOutput submitBankNotesDataOutput = SubmitBankNotesResponse.SubmitBankNotesDataOutput.b;
        BN5PilihNomorOTPFragment_ViewBinding c = SubmitBankNotesResponse.SubmitBankNotesDataOutput.c();
        this.responseHeaders = list == null ? c.b(onSelectNoRek.b) : c.a(list, list.getClass());
    }

    public final void setResponseImageData(byte[] bArr) {
        this.responseImageData = bArr;
    }

    public final void setResponseMessage(String str) {
        this.responseMessage = str;
    }

    public final void setResponsePayloadSize(Long l) {
        this.responsePayloadSize = l;
    }

    public final void setResponseTlsVersion(String str) {
        this.responseTlsVersion = str;
    }

    public final void setScheme$com_github_ChuckerTeam_Chucker_library(String str) {
        this.scheme = str;
    }

    public final void setTookMs(Long l) {
        this.tookMs = l;
    }

    public final void setUrl$com_github_ChuckerTeam_Chucker_library(String str) {
        this.url = str;
    }

    public final List<GetTxnTellerDetailResponse$TxnDetail$WarkatTunda$$Parcelable> toHttpHeaderList$com_github_ChuckerTeam_Chucker_library(Headers headers) {
        subscribeReservationRescheduleEvent.e(headers, "");
        ArrayList arrayList = new ArrayList();
        int size = headers.size();
        for (int i = 0; i < size; i++) {
            String name = headers.name(i);
            subscribeReservationRescheduleEvent.d(name, "");
            String value = headers.value(i);
            subscribeReservationRescheduleEvent.d(value, "");
            arrayList.add(new GetTxnTellerDetailResponse$TxnDetail$WarkatTunda$$Parcelable(name, value));
        }
        return arrayList;
    }
}
