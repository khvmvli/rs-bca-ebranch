package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import java.io.IOException;
/* loaded from: classes2-dex2jar.jar:com/google/firebase/crashlytics/internal/model/AutoCrashlyticsReportEncoder$MediaBrowserCompat$ItemReceiver.class */
final class AutoCrashlyticsReportEncoder$MediaBrowserCompat$ItemReceiver implements ObjectEncoder<CrashlyticsReport.Session.Device> {
    static final AutoCrashlyticsReportEncoder$MediaBrowserCompat$ItemReceiver a = new AutoCrashlyticsReportEncoder$MediaBrowserCompat$ItemReceiver();
    private static final FieldDescriptor e = FieldDescriptor.of("arch");
    private static final FieldDescriptor j = FieldDescriptor.of("model");
    private static final FieldDescriptor b = FieldDescriptor.of("cores");
    private static final FieldDescriptor f = FieldDescriptor.of("ram");
    private static final FieldDescriptor c = FieldDescriptor.of("diskSpace");
    private static final FieldDescriptor h = FieldDescriptor.of("simulator");
    private static final FieldDescriptor i = FieldDescriptor.of("state");
    private static final FieldDescriptor d = FieldDescriptor.of("manufacturer");
    private static final FieldDescriptor g = FieldDescriptor.of("modelClass");

    private AutoCrashlyticsReportEncoder$MediaBrowserCompat$ItemReceiver() {
    }

    @Override // o.TahapanXpresiDialog
    public final /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        CrashlyticsReport.Session.Device device = (CrashlyticsReport.Session.Device) obj;
        ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
        objectEncoderContext2.add(e, device.getArch());
        objectEncoderContext2.add(j, device.getModel());
        objectEncoderContext2.add(b, device.getCores());
        objectEncoderContext2.add(f, device.getRam());
        objectEncoderContext2.add(c, device.getDiskSpace());
        objectEncoderContext2.add(h, device.isSimulator());
        objectEncoderContext2.add(i, device.getState());
        objectEncoderContext2.add(d, device.getManufacturer());
        objectEncoderContext2.add(g, device.getModelClass());
    }
}
