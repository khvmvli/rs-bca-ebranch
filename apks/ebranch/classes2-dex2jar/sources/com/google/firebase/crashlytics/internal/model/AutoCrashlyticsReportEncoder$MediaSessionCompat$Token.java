package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;
/* loaded from: classes2-dex2jar.jar:com/google/firebase/crashlytics/internal/model/AutoCrashlyticsReportEncoder$MediaSessionCompat$Token.class */
final class AutoCrashlyticsReportEncoder$MediaSessionCompat$Token implements ObjectEncoder<CrashlyticsReport.Session.Event.Application.Execution.Exception> {
    static final AutoCrashlyticsReportEncoder$MediaSessionCompat$Token a = new AutoCrashlyticsReportEncoder$MediaSessionCompat$Token();
    private static final FieldDescriptor g = FieldDescriptor.of("type");
    private static final FieldDescriptor e = FieldDescriptor.of("reason");
    private static final FieldDescriptor b = FieldDescriptor.of("frames");
    private static final FieldDescriptor d = FieldDescriptor.of("causedBy");
    private static final FieldDescriptor c = FieldDescriptor.of("overflowCount");

    private AutoCrashlyticsReportEncoder$MediaSessionCompat$Token() {
    }

    @Override // o.TahapanXpresiDialog
    public final /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        CrashlyticsReport.Session.Event.Application.Execution.Exception exception = (CrashlyticsReport.Session.Event.Application.Execution.Exception) obj;
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(g, exception.getType());
        objectEncoderContext2.add(e, exception.getReason());
        objectEncoderContext2.add(b, exception.getFrames());
        objectEncoderContext2.add(d, exception.getCausedBy());
        objectEncoderContext2.add(c, exception.getOverflowCount());
    }
}
