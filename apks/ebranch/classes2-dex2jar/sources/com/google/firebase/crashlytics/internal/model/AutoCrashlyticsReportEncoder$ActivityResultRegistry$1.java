package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;
/* loaded from: classes2-dex2jar.jar:com/google/firebase/crashlytics/internal/model/AutoCrashlyticsReportEncoder$ActivityResultRegistry$1.class */
final class AutoCrashlyticsReportEncoder$ActivityResultRegistry$1 implements ObjectEncoder<CrashlyticsReport.Session.User> {
    static final AutoCrashlyticsReportEncoder$ActivityResultRegistry$1 a = new AutoCrashlyticsReportEncoder$ActivityResultRegistry$1();
    private static final FieldDescriptor b = FieldDescriptor.of("identifier");

    private AutoCrashlyticsReportEncoder$ActivityResultRegistry$1() {
    }

    @Override // o.TahapanXpresiDialog
    public final /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        objectEncoderContext.add(b, ((CrashlyticsReport.Session.User) obj).getIdentifier());
    }
}
