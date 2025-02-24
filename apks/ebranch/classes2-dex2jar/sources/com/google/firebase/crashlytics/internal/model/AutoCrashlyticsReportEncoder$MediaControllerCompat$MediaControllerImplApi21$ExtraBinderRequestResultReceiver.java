package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;
/* loaded from: classes2-dex2jar.jar:com/google/firebase/crashlytics/internal/model/AutoCrashlyticsReportEncoder$MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver.class */
final class AutoCrashlyticsReportEncoder$MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver implements ObjectEncoder<CrashlyticsReport.Session.Event.Application.Execution.BinaryImage> {
    static final AutoCrashlyticsReportEncoder$MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver d = new AutoCrashlyticsReportEncoder$MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver();
    private static final FieldDescriptor a = FieldDescriptor.of("baseAddress");
    private static final FieldDescriptor e = FieldDescriptor.of("size");
    private static final FieldDescriptor c = FieldDescriptor.of("name");
    private static final FieldDescriptor b = FieldDescriptor.of("uuid");

    private AutoCrashlyticsReportEncoder$MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver() {
    }

    @Override // o.TahapanXpresiDialog
    public final /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        CrashlyticsReport.Session.Event.Application.Execution.BinaryImage binaryImage = (CrashlyticsReport.Session.Event.Application.Execution.BinaryImage) obj;
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(a, binaryImage.getBaseAddress());
        objectEncoderContext2.add(e, binaryImage.getSize());
        objectEncoderContext2.add(c, binaryImage.getName());
        objectEncoderContext2.add(b, binaryImage.getUuidUtf8Bytes());
    }
}
