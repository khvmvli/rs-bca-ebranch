package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;
/* loaded from: classes2-dex2jar.jar:com/google/firebase/crashlytics/internal/model/AutoCrashlyticsReportEncoder$MediaSessionCompat$QueueItem.class */
final class AutoCrashlyticsReportEncoder$MediaSessionCompat$QueueItem implements ObjectEncoder<CrashlyticsReport.Session.Event.Application.Execution.Signal> {
    static final AutoCrashlyticsReportEncoder$MediaSessionCompat$QueueItem c = new AutoCrashlyticsReportEncoder$MediaSessionCompat$QueueItem();
    private static final FieldDescriptor e = FieldDescriptor.of("name");
    private static final FieldDescriptor d = FieldDescriptor.of("code");
    private static final FieldDescriptor a = FieldDescriptor.of("address");

    private AutoCrashlyticsReportEncoder$MediaSessionCompat$QueueItem() {
    }

    @Override // o.TahapanXpresiDialog
    public final /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        CrashlyticsReport.Session.Event.Application.Execution.Signal signal = (CrashlyticsReport.Session.Event.Application.Execution.Signal) obj;
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(e, signal.getName());
        objectEncoderContext2.add(d, signal.getCode());
        objectEncoderContext2.add(a, signal.getAddress());
    }
}
