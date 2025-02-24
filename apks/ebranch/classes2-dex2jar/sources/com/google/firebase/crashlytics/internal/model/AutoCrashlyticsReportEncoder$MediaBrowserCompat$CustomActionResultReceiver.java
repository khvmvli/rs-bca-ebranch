package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;
/* loaded from: classes2-dex2jar.jar:com/google/firebase/crashlytics/internal/model/AutoCrashlyticsReportEncoder$MediaBrowserCompat$CustomActionResultReceiver.class */
final class AutoCrashlyticsReportEncoder$MediaBrowserCompat$CustomActionResultReceiver implements ObjectEncoder<CrashlyticsReport.ApplicationExitInfo> {
    static final AutoCrashlyticsReportEncoder$MediaBrowserCompat$CustomActionResultReceiver d = new AutoCrashlyticsReportEncoder$MediaBrowserCompat$CustomActionResultReceiver();
    private static final FieldDescriptor e = FieldDescriptor.of("pid");
    private static final FieldDescriptor c = FieldDescriptor.of("processName");
    private static final FieldDescriptor h = FieldDescriptor.of("reasonCode");
    private static final FieldDescriptor b = FieldDescriptor.of("importance");
    private static final FieldDescriptor a = FieldDescriptor.of("pss");
    private static final FieldDescriptor j = FieldDescriptor.of("rss");
    private static final FieldDescriptor g = FieldDescriptor.of("timestamp");
    private static final FieldDescriptor i = FieldDescriptor.of("traceFile");

    private AutoCrashlyticsReportEncoder$MediaBrowserCompat$CustomActionResultReceiver() {
    }

    @Override // o.TahapanXpresiDialog
    public final /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        CrashlyticsReport.ApplicationExitInfo applicationExitInfo = (CrashlyticsReport.ApplicationExitInfo) obj;
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(e, applicationExitInfo.getPid());
        objectEncoderContext2.add(c, applicationExitInfo.getProcessName());
        objectEncoderContext2.add(h, applicationExitInfo.getReasonCode());
        objectEncoderContext2.add(b, applicationExitInfo.getImportance());
        objectEncoderContext2.add(a, applicationExitInfo.getPss());
        objectEncoderContext2.add(j, applicationExitInfo.getRss());
        objectEncoderContext2.add(g, applicationExitInfo.getTimestamp());
        objectEncoderContext2.add(i, applicationExitInfo.getTraceFile());
    }
}
