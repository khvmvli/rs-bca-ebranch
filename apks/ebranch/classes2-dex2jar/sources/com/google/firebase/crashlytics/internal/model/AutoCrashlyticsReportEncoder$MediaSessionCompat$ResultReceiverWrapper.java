package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;
/* loaded from: classes2-dex2jar.jar:com/google/firebase/crashlytics/internal/model/AutoCrashlyticsReportEncoder$MediaSessionCompat$ResultReceiverWrapper.class */
final class AutoCrashlyticsReportEncoder$MediaSessionCompat$ResultReceiverWrapper implements ObjectEncoder<CrashlyticsReport.Session.Event.Application.Execution> {
    static final AutoCrashlyticsReportEncoder$MediaSessionCompat$ResultReceiverWrapper e = new AutoCrashlyticsReportEncoder$MediaSessionCompat$ResultReceiverWrapper();
    private static final FieldDescriptor h = FieldDescriptor.of("threads");
    private static final FieldDescriptor a = FieldDescriptor.of("exception");
    private static final FieldDescriptor b = FieldDescriptor.of("appExitInfo");
    private static final FieldDescriptor d = FieldDescriptor.of("signal");
    private static final FieldDescriptor c = FieldDescriptor.of("binaries");

    private AutoCrashlyticsReportEncoder$MediaSessionCompat$ResultReceiverWrapper() {
    }

    @Override // o.TahapanXpresiDialog
    public final /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        CrashlyticsReport.Session.Event.Application.Execution execution = (CrashlyticsReport.Session.Event.Application.Execution) obj;
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(h, execution.getThreads());
        objectEncoderContext2.add(a, execution.getException());
        objectEncoderContext2.add(b, execution.getAppExitInfo());
        objectEncoderContext2.add(d, execution.getSignal());
        objectEncoderContext2.add(c, execution.getBinaries());
    }
}
