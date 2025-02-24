package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;
/* loaded from: classes2-dex2jar.jar:com/google/firebase/crashlytics/internal/model/AutoCrashlyticsReportEncoder$MediaBrowserCompat$MediaItem.class */
final class AutoCrashlyticsReportEncoder$MediaBrowserCompat$MediaItem implements ObjectEncoder<CrashlyticsReport.Session.Event.Application> {
    static final AutoCrashlyticsReportEncoder$MediaBrowserCompat$MediaItem c = new AutoCrashlyticsReportEncoder$MediaBrowserCompat$MediaItem();
    private static final FieldDescriptor e = FieldDescriptor.of("execution");
    private static final FieldDescriptor a = FieldDescriptor.of("customAttributes");
    private static final FieldDescriptor d = FieldDescriptor.of("internalKeys");
    private static final FieldDescriptor b = FieldDescriptor.of("background");
    private static final FieldDescriptor j = FieldDescriptor.of("uiOrientation");

    private AutoCrashlyticsReportEncoder$MediaBrowserCompat$MediaItem() {
    }

    @Override // o.TahapanXpresiDialog
    public final /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        CrashlyticsReport.Session.Event.Application application = (CrashlyticsReport.Session.Event.Application) obj;
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(e, application.getExecution());
        objectEncoderContext2.add(a, application.getCustomAttributes());
        objectEncoderContext2.add(d, application.getInternalKeys());
        objectEncoderContext2.add(b, application.getBackground());
        objectEncoderContext2.add(j, application.getUiOrientation());
    }
}
