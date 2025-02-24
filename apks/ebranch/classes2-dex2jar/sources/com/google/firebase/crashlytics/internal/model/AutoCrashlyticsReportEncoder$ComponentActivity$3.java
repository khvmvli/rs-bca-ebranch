package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;
/* loaded from: classes2-dex2jar.jar:com/google/firebase/crashlytics/internal/model/AutoCrashlyticsReportEncoder$ComponentActivity$3.class */
final class AutoCrashlyticsReportEncoder$ComponentActivity$3 implements ObjectEncoder<CrashlyticsReport.Session.Event> {
    static final AutoCrashlyticsReportEncoder$ComponentActivity$3 b = new AutoCrashlyticsReportEncoder$ComponentActivity$3();
    private static final FieldDescriptor c = FieldDescriptor.of("timestamp");
    private static final FieldDescriptor g = FieldDescriptor.of("type");
    private static final FieldDescriptor d = FieldDescriptor.of("app");
    private static final FieldDescriptor a = FieldDescriptor.of("device");
    private static final FieldDescriptor e = FieldDescriptor.of("log");

    private AutoCrashlyticsReportEncoder$ComponentActivity$3() {
    }

    @Override // o.TahapanXpresiDialog
    public final /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        CrashlyticsReport.Session.Event event = (CrashlyticsReport.Session.Event) obj;
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(c, event.getTimestamp());
        objectEncoderContext2.add(g, event.getType());
        objectEncoderContext2.add(d, event.getApp());
        objectEncoderContext2.add(a, event.getDevice());
        objectEncoderContext2.add(e, event.getLog());
    }
}
