package com.google.firebase.crashlytics.internal.send;

import android.content.Context;
import com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform;
import java.nio.charset.Charset;
import o.Account;
import o.getBanknoteCondition;
import o.getCitizen;
import o.getFlagRating;
import o.getStatus;
import o.getStatusType;
import o.getSubToken;
import o.getTransaksiTundaDetailList;
import o.getTxbDate;
import o.isDraft;
import o.setJatuhTempo;
import o.setJenisWarkat;
/* loaded from: classes2-dex2jar.jar:com/google/firebase/crashlytics/internal/send/DataTransportCrashlyticsReportSender.class */
public class DataTransportCrashlyticsReportSender {
    private static final String CRASHLYTICS_TRANSPORT_NAME;
    private final getSubToken<CrashlyticsReport> transport;
    private final getStatus<CrashlyticsReport, byte[]> transportTransform;
    private static final CrashlyticsReportJsonTransform TRANSFORM = new CrashlyticsReportJsonTransform();
    private static final String CRASHLYTICS_ENDPOINT = mergeStrings("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");
    private static final String CRASHLYTICS_API_KEY = mergeStrings("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");
    private static final getStatus<CrashlyticsReport, byte[]> DEFAULT_TRANSFORM = new getStatus() { // from class: com.google.firebase.crashlytics.internal.send.DataTransportCrashlyticsReportSender$$ExternalSyntheticLambda0
        public final Object apply(Object obj) {
            return DataTransportCrashlyticsReportSender.TRANSFORM.reportToJson((CrashlyticsReport) obj).getBytes(Charset.forName("UTF-8"));
        }
    };

    DataTransportCrashlyticsReportSender(getSubToken<CrashlyticsReport> getsubtoken, getStatus<CrashlyticsReport, byte[]> getstatus) {
        this.transport = getsubtoken;
        this.transportTransform = getstatus;
    }

    public static DataTransportCrashlyticsReportSender create(Context context) {
        getCitizen.e(context);
        Account account = getCitizen.e;
        if (account != null) {
            getStatusType a = account.b().a(new isDraft(CRASHLYTICS_ENDPOINT, CRASHLYTICS_API_KEY));
            getFlagRating getflagrating = new getFlagRating("json");
            getStatus<CrashlyticsReport, byte[]> getstatus = DEFAULT_TRANSFORM;
            return new DataTransportCrashlyticsReportSender(a.b(CRASHLYTICS_TRANSPORT_NAME, getflagrating, getstatus), getstatus);
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static /* synthetic */ void lambda$sendReport$1(setJenisWarkat setjeniswarkat, CrashlyticsReportWithSessionId crashlyticsReportWithSessionId, Exception exc) {
        if (exc != null) {
            setjeniswarkat.c.a(exc);
        } else {
            setjeniswarkat.c.a(crashlyticsReportWithSessionId);
        }
    }

    private static String mergeStrings(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str.length() + str2.length());
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            if (str2.length() > i) {
                sb.append(str2.charAt(i));
            }
        }
        return sb.toString();
    }

    public setJatuhTempo<CrashlyticsReportWithSessionId> sendReport(CrashlyticsReportWithSessionId crashlyticsReportWithSessionId) {
        CrashlyticsReport report = crashlyticsReportWithSessionId.getReport();
        setJenisWarkat setjeniswarkat = new setJenisWarkat();
        this.transport.d(new getBanknoteCondition((Integer) null, report, getTxbDate.d), new getTransaksiTundaDetailList(setjeniswarkat, crashlyticsReportWithSessionId) { // from class: com.google.firebase.crashlytics.internal.send.DataTransportCrashlyticsReportSender$$ExternalSyntheticLambda1
            public final /* synthetic */ setJenisWarkat f$0;
            public final /* synthetic */ CrashlyticsReportWithSessionId f$1;

            {
                this.f$0 = r4;
                this.f$1 = r5;
            }

            public final void onSchedule(Exception exc) {
                DataTransportCrashlyticsReportSender.lambda$sendReport$1(this.f$0, this.f$1, exc);
            }
        });
        return setjeniswarkat.c;
    }
}
