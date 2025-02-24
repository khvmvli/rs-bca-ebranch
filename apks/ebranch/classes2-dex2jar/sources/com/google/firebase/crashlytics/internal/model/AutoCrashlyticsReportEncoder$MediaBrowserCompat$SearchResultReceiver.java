package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;
/* loaded from: classes2-dex2jar.jar:com/google/firebase/crashlytics/internal/model/AutoCrashlyticsReportEncoder$MediaBrowserCompat$SearchResultReceiver.class */
final class AutoCrashlyticsReportEncoder$MediaBrowserCompat$SearchResultReceiver implements ObjectEncoder<CrashlyticsReport.Session.Application.Organization> {
    static final AutoCrashlyticsReportEncoder$MediaBrowserCompat$SearchResultReceiver e = new AutoCrashlyticsReportEncoder$MediaBrowserCompat$SearchResultReceiver();
    private static final FieldDescriptor a = FieldDescriptor.of("clsId");

    private AutoCrashlyticsReportEncoder$MediaBrowserCompat$SearchResultReceiver() {
    }

    @Override // o.TahapanXpresiDialog
    public final /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        objectEncoderContext.add(a, ((CrashlyticsReport.Session.Application.Organization) obj).getClsId());
    }
}
