package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;
import java.io.IOException;
import o.SimpanDraftAndHitServiceDialog;
import o.SimpanDraftDialog;
import o.SimpanDraftDialog_ViewBinding;
import o.StatusKewarganegaraanDialog_ViewBinding;
import o.StatusNPWPDialog;
import o.StatusNPWPDialog_ViewBinding;
import o.StatusPendudukDialog;
import o.StatusPendudukDialog_ViewBinding;
import o.StatusPerkawinanDialog;
import o.StatusPerkawinanDialog_ViewBinding;
import o.StatusTempatTinggalDialog;
import o.StatusTempatTinggalDialog_ViewBinding;
import o.SuccessUpdateProfileDialog;
import o.SuccessUpdateProfileDialog_ViewBinding;
import o.SumberDanaDialog;
import o.SumberDanaDialog_ViewBinding;
import o.SumberDanaORDialog;
import o.SumberDanaORDialog_ViewBinding;
import o.SumberPenghasilanDialog;
import o.SuratPernyataanBNDialog_ViewBinding;
import o.TahapanBCADialog;
/* loaded from: classes2-dex2jar.jar:com/google/firebase/crashlytics/internal/model/AutoCrashlyticsReportEncoder.class */
public final class AutoCrashlyticsReportEncoder implements Configurator {
    public static final int CODEGEN_VERSION = 2;
    public static final Configurator CONFIG = new AutoCrashlyticsReportEncoder();

    /* loaded from: classes2-dex2jar.jar:com/google/firebase/crashlytics/internal/model/AutoCrashlyticsReportEncoder$IconCompatParcelizer.class */
    static final class IconCompatParcelizer implements ObjectEncoder<CrashlyticsReport> {
        static final IconCompatParcelizer e = new IconCompatParcelizer();
        private static final FieldDescriptor g = FieldDescriptor.of("sdkVersion");
        private static final FieldDescriptor b = FieldDescriptor.of("gmpAppId");
        private static final FieldDescriptor i = FieldDescriptor.of("platform");
        private static final FieldDescriptor d = FieldDescriptor.of("installationUuid");
        private static final FieldDescriptor a = FieldDescriptor.of("buildVersion");
        private static final FieldDescriptor c = FieldDescriptor.of("displayVersion");
        private static final FieldDescriptor h = FieldDescriptor.of("session");
        private static final FieldDescriptor f = FieldDescriptor.of("ndkPayload");

        private IconCompatParcelizer() {
        }

        @Override // o.TahapanXpresiDialog
        public final /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
            CrashlyticsReport crashlyticsReport = (CrashlyticsReport) obj;
            ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
            objectEncoderContext2.add(g, crashlyticsReport.getSdkVersion());
            objectEncoderContext2.add(b, crashlyticsReport.getGmpAppId());
            objectEncoderContext2.add(i, crashlyticsReport.getPlatform());
            objectEncoderContext2.add(d, crashlyticsReport.getInstallationUuid());
            objectEncoderContext2.add(a, crashlyticsReport.getBuildVersion());
            objectEncoderContext2.add(c, crashlyticsReport.getDisplayVersion());
            objectEncoderContext2.add(h, crashlyticsReport.getSession());
            objectEncoderContext2.add(f, crashlyticsReport.getNdkPayload());
        }
    }

    /* loaded from: classes2-dex2jar.jar:com/google/firebase/crashlytics/internal/model/AutoCrashlyticsReportEncoder$MediaDescriptionCompat.class */
    static final class MediaDescriptionCompat implements ObjectEncoder<CrashlyticsReport.Session> {
        static final MediaDescriptionCompat d = new MediaDescriptionCompat();
        private static final FieldDescriptor h = FieldDescriptor.of("generator");
        private static final FieldDescriptor g = FieldDescriptor.of("identifier");
        private static final FieldDescriptor k = FieldDescriptor.of("startedAt");
        private static final FieldDescriptor c = FieldDescriptor.of("endedAt");
        private static final FieldDescriptor a = FieldDescriptor.of("crashed");
        private static final FieldDescriptor b = FieldDescriptor.of("app");
        private static final FieldDescriptor n = FieldDescriptor.of("user");
        private static final FieldDescriptor j = FieldDescriptor.of("os");
        private static final FieldDescriptor e = FieldDescriptor.of("device");
        private static final FieldDescriptor f = FieldDescriptor.of("events");
        private static final FieldDescriptor i = FieldDescriptor.of("generatorType");

        private MediaDescriptionCompat() {
        }

        @Override // o.TahapanXpresiDialog
        public final /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
            CrashlyticsReport.Session session = (CrashlyticsReport.Session) obj;
            ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
            objectEncoderContext2.add(h, session.getGenerator());
            objectEncoderContext2.add(g, session.getIdentifierUtf8Bytes());
            objectEncoderContext2.add(k, session.getStartedAt());
            objectEncoderContext2.add(c, session.getEndedAt());
            objectEncoderContext2.add(a, session.isCrashed());
            objectEncoderContext2.add(b, session.getApp());
            objectEncoderContext2.add(n, session.getUser());
            objectEncoderContext2.add(j, session.getOs());
            objectEncoderContext2.add(e, session.getDevice());
            objectEncoderContext2.add(f, session.getEvents());
            objectEncoderContext2.add(i, session.getGeneratorType());
        }
    }

    /* loaded from: classes2-dex2jar.jar:com/google/firebase/crashlytics/internal/model/AutoCrashlyticsReportEncoder$MediaMetadataCompat.class */
    static final class MediaMetadataCompat implements ObjectEncoder<CrashlyticsReport.Session.Application> {
        static final MediaMetadataCompat e = new MediaMetadataCompat();
        private static final FieldDescriptor b = FieldDescriptor.of("identifier");
        private static final FieldDescriptor f = FieldDescriptor.of("version");
        private static final FieldDescriptor c = FieldDescriptor.of("displayVersion");
        private static final FieldDescriptor h = FieldDescriptor.of("organization");
        private static final FieldDescriptor j = FieldDescriptor.of("installationUuid");
        private static final FieldDescriptor d = FieldDescriptor.of("developmentPlatform");
        private static final FieldDescriptor a = FieldDescriptor.of("developmentPlatformVersion");

        private MediaMetadataCompat() {
        }

        @Override // o.TahapanXpresiDialog
        public final /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
            CrashlyticsReport.Session.Application application = (CrashlyticsReport.Session.Application) obj;
            ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
            objectEncoderContext2.add(b, application.getIdentifier());
            objectEncoderContext2.add(f, application.getVersion());
            objectEncoderContext2.add(c, application.getDisplayVersion());
            objectEncoderContext2.add(h, application.getOrganization());
            objectEncoderContext2.add(j, application.getInstallationUuid());
            objectEncoderContext2.add(d, application.getDevelopmentPlatform());
            objectEncoderContext2.add(a, application.getDevelopmentPlatformVersion());
        }
    }

    /* loaded from: classes2-dex2jar.jar:com/google/firebase/crashlytics/internal/model/AutoCrashlyticsReportEncoder$ParcelableVolumeInfo.class */
    static final class ParcelableVolumeInfo implements ObjectEncoder<CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame> {
        static final ParcelableVolumeInfo b = new ParcelableVolumeInfo();
        private static final FieldDescriptor d = FieldDescriptor.of("pc");
        private static final FieldDescriptor i = FieldDescriptor.of("symbol");
        private static final FieldDescriptor c = FieldDescriptor.of("file");
        private static final FieldDescriptor a = FieldDescriptor.of("offset");
        private static final FieldDescriptor e = FieldDescriptor.of("importance");

        private ParcelableVolumeInfo() {
        }

        @Override // o.TahapanXpresiDialog
        public final /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
            CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame frame = (CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame) obj;
            ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
            objectEncoderContext2.add(d, frame.getPc());
            objectEncoderContext2.add(i, frame.getSymbol());
            objectEncoderContext2.add(c, frame.getFile());
            objectEncoderContext2.add(a, frame.getOffset());
            objectEncoderContext2.add(e, frame.getImportance());
        }
    }

    /* loaded from: classes2-dex2jar.jar:com/google/firebase/crashlytics/internal/model/AutoCrashlyticsReportEncoder$PlaybackStateCompat.class */
    static final class PlaybackStateCompat implements ObjectEncoder<CrashlyticsReport.Session.OperatingSystem> {
        static final PlaybackStateCompat b = new PlaybackStateCompat();
        private static final FieldDescriptor c = FieldDescriptor.of("platform");
        private static final FieldDescriptor d = FieldDescriptor.of("version");
        private static final FieldDescriptor e = FieldDescriptor.of("buildVersion");
        private static final FieldDescriptor a = FieldDescriptor.of("jailbroken");

        /* loaded from: classes2-dex2jar.jar:com/google/firebase/crashlytics/internal/model/AutoCrashlyticsReportEncoder$PlaybackStateCompat$CustomAction.class */
        static final class CustomAction implements ObjectEncoder<CrashlyticsReport.Session.Event.Log> {
            static final CustomAction d = new CustomAction();
            private static final FieldDescriptor e = FieldDescriptor.of(FirebaseAnalytics.Param.CONTENT);

            private CustomAction() {
            }

            @Override // o.TahapanXpresiDialog
            public final /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
                objectEncoderContext.add(e, ((CrashlyticsReport.Session.Event.Log) obj).getContent());
            }
        }

        private PlaybackStateCompat() {
        }

        @Override // o.TahapanXpresiDialog
        public final /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
            CrashlyticsReport.Session.OperatingSystem operatingSystem = (CrashlyticsReport.Session.OperatingSystem) obj;
            ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
            objectEncoderContext2.add(c, operatingSystem.getPlatform());
            objectEncoderContext2.add(d, operatingSystem.getVersion());
            objectEncoderContext2.add(e, operatingSystem.getBuildVersion());
            objectEncoderContext2.add(a, operatingSystem.isJailbroken());
        }
    }

    /* loaded from: classes2-dex2jar.jar:com/google/firebase/crashlytics/internal/model/AutoCrashlyticsReportEncoder$RatingCompat.class */
    static final class RatingCompat implements ObjectEncoder<CrashlyticsReport.Session.Event.Application.Execution.Thread> {
        static final RatingCompat b = new RatingCompat();
        private static final FieldDescriptor a = FieldDescriptor.of("name");
        private static final FieldDescriptor d = FieldDescriptor.of("importance");
        private static final FieldDescriptor c = FieldDescriptor.of("frames");

        private RatingCompat() {
        }

        @Override // o.TahapanXpresiDialog
        public final /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
            CrashlyticsReport.Session.Event.Application.Execution.Thread thread = (CrashlyticsReport.Session.Event.Application.Execution.Thread) obj;
            ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
            objectEncoderContext2.add(a, thread.getName());
            objectEncoderContext2.add(d, thread.getImportance());
            objectEncoderContext2.add(c, thread.getFrames());
        }
    }

    /* loaded from: classes2-dex2jar.jar:com/google/firebase/crashlytics/internal/model/AutoCrashlyticsReportEncoder$RemoteActionCompatParcelizer.class */
    static final class RemoteActionCompatParcelizer implements ObjectEncoder<CrashlyticsReport.FilesPayload.File> {
        static final RemoteActionCompatParcelizer a = new RemoteActionCompatParcelizer();
        private static final FieldDescriptor e = FieldDescriptor.of("filename");
        private static final FieldDescriptor b = FieldDescriptor.of("contents");

        private RemoteActionCompatParcelizer() {
        }

        @Override // o.TahapanXpresiDialog
        public final /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
            CrashlyticsReport.FilesPayload.File file = (CrashlyticsReport.FilesPayload.File) obj;
            ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
            objectEncoderContext2.add(e, file.getFilename());
            objectEncoderContext2.add(b, file.getContents());
        }
    }

    /* loaded from: classes2-dex2jar.jar:com/google/firebase/crashlytics/internal/model/AutoCrashlyticsReportEncoder$read.class */
    static final class read implements ObjectEncoder<CrashlyticsReport.FilesPayload> {
        static final read e = new read();
        private static final FieldDescriptor b = FieldDescriptor.of("files");
        private static final FieldDescriptor a = FieldDescriptor.of("orgId");

        private read() {
        }

        @Override // o.TahapanXpresiDialog
        public final /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
            CrashlyticsReport.FilesPayload filesPayload = (CrashlyticsReport.FilesPayload) obj;
            ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
            objectEncoderContext2.add(b, filesPayload.getFiles());
            objectEncoderContext2.add(a, filesPayload.getOrgId());
        }
    }

    /* loaded from: classes2-dex2jar.jar:com/google/firebase/crashlytics/internal/model/AutoCrashlyticsReportEncoder$setContentView.class */
    static final class setContentView implements ObjectEncoder<CrashlyticsReport.Session.Event.Device> {
        static final setContentView a = new setContentView();
        private static final FieldDescriptor d = FieldDescriptor.of("batteryLevel");
        private static final FieldDescriptor b = FieldDescriptor.of("batteryVelocity");
        private static final FieldDescriptor g = FieldDescriptor.of("proximityOn");
        private static final FieldDescriptor c = FieldDescriptor.of("orientation");
        private static final FieldDescriptor i = FieldDescriptor.of("ramUsed");
        private static final FieldDescriptor e = FieldDescriptor.of("diskUsed");

        private setContentView() {
        }

        @Override // o.TahapanXpresiDialog
        public final /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
            CrashlyticsReport.Session.Event.Device device = (CrashlyticsReport.Session.Event.Device) obj;
            ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
            objectEncoderContext2.add(d, device.getBatteryLevel());
            objectEncoderContext2.add(b, device.getBatteryVelocity());
            objectEncoderContext2.add(g, device.isProximityOn());
            objectEncoderContext2.add(c, device.getOrientation());
            objectEncoderContext2.add(i, device.getRamUsed());
            objectEncoderContext2.add(e, device.getDiskUsed());
        }
    }

    /* loaded from: classes2-dex2jar.jar:com/google/firebase/crashlytics/internal/model/AutoCrashlyticsReportEncoder$write.class */
    static final class write implements ObjectEncoder<CrashlyticsReport.CustomAttribute> {
        static final write b = new write();
        private static final FieldDescriptor c = FieldDescriptor.of("key");
        private static final FieldDescriptor d = FieldDescriptor.of(FirebaseAnalytics.Param.VALUE);

        private write() {
        }

        @Override // o.TahapanXpresiDialog
        public final /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
            CrashlyticsReport.CustomAttribute customAttribute = (CrashlyticsReport.CustomAttribute) obj;
            ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
            objectEncoderContext2.add(c, customAttribute.getKey());
            objectEncoderContext2.add(d, customAttribute.getValue());
        }
    }

    private AutoCrashlyticsReportEncoder() {
    }

    @Override // com.google.firebase.encoders.config.Configurator
    public final void configure(EncoderConfig<?> encoderConfig) {
        encoderConfig.registerEncoder(CrashlyticsReport.class, IconCompatParcelizer.e);
        encoderConfig.registerEncoder(SimpanDraftDialog_ViewBinding.class, IconCompatParcelizer.e);
        encoderConfig.registerEncoder(CrashlyticsReport.Session.class, MediaDescriptionCompat.d);
        encoderConfig.registerEncoder(StatusPendudukDialog_ViewBinding.class, MediaDescriptionCompat.d);
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Application.class, MediaMetadataCompat.e);
        encoderConfig.registerEncoder(StatusKewarganegaraanDialog_ViewBinding.class, MediaMetadataCompat.e);
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Application.Organization.class, AutoCrashlyticsReportEncoder$MediaBrowserCompat$SearchResultReceiver.e);
        encoderConfig.registerEncoder(StatusNPWPDialog.class, AutoCrashlyticsReportEncoder$MediaBrowserCompat$SearchResultReceiver.e);
        encoderConfig.registerEncoder(CrashlyticsReport.Session.User.class, AutoCrashlyticsReportEncoder$ActivityResultRegistry$1.a);
        encoderConfig.registerEncoder(TahapanBCADialog.class, AutoCrashlyticsReportEncoder$ActivityResultRegistry$1.a);
        encoderConfig.registerEncoder(CrashlyticsReport.Session.OperatingSystem.class, PlaybackStateCompat.b);
        encoderConfig.registerEncoder(SumberPenghasilanDialog.class, PlaybackStateCompat.b);
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Device.class, AutoCrashlyticsReportEncoder$MediaBrowserCompat$ItemReceiver.a);
        encoderConfig.registerEncoder(StatusTempatTinggalDialog_ViewBinding.class, AutoCrashlyticsReportEncoder$MediaBrowserCompat$ItemReceiver.a);
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Event.class, AutoCrashlyticsReportEncoder$ComponentActivity$3.b);
        encoderConfig.registerEncoder(SuccessUpdateProfileDialog.class, AutoCrashlyticsReportEncoder$ComponentActivity$3.b);
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Event.Application.class, AutoCrashlyticsReportEncoder$MediaBrowserCompat$MediaItem.c);
        encoderConfig.registerEncoder(StatusPerkawinanDialog.class, AutoCrashlyticsReportEncoder$MediaBrowserCompat$MediaItem.c);
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Event.Application.Execution.class, AutoCrashlyticsReportEncoder$MediaSessionCompat$ResultReceiverWrapper.e);
        encoderConfig.registerEncoder(StatusPerkawinanDialog_ViewBinding.class, AutoCrashlyticsReportEncoder$MediaSessionCompat$ResultReceiverWrapper.e);
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Event.Application.Execution.Thread.class, RatingCompat.b);
        encoderConfig.registerEncoder(SumberDanaDialog.class, RatingCompat.b);
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.class, ParcelableVolumeInfo.b);
        encoderConfig.registerEncoder(SumberDanaORDialog_ViewBinding.class, ParcelableVolumeInfo.b);
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Event.Application.Execution.Exception.class, AutoCrashlyticsReportEncoder$MediaSessionCompat$Token.a);
        encoderConfig.registerEncoder(SumberDanaDialog_ViewBinding.class, AutoCrashlyticsReportEncoder$MediaSessionCompat$Token.a);
        encoderConfig.registerEncoder(CrashlyticsReport.ApplicationExitInfo.class, AutoCrashlyticsReportEncoder$MediaBrowserCompat$CustomActionResultReceiver.d);
        encoderConfig.registerEncoder(SimpanDraftAndHitServiceDialog.class, AutoCrashlyticsReportEncoder$MediaBrowserCompat$CustomActionResultReceiver.d);
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Event.Application.Execution.Signal.class, AutoCrashlyticsReportEncoder$MediaSessionCompat$QueueItem.c);
        encoderConfig.registerEncoder(SuccessUpdateProfileDialog_ViewBinding.class, AutoCrashlyticsReportEncoder$MediaSessionCompat$QueueItem.c);
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.class, AutoCrashlyticsReportEncoder$MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver.d);
        encoderConfig.registerEncoder(StatusTempatTinggalDialog.class, AutoCrashlyticsReportEncoder$MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver.d);
        encoderConfig.registerEncoder(CrashlyticsReport.CustomAttribute.class, write.b);
        encoderConfig.registerEncoder(SimpanDraftDialog.class, write.b);
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Event.Device.class, setContentView.a);
        encoderConfig.registerEncoder(SumberDanaORDialog.class, setContentView.a);
        encoderConfig.registerEncoder(CrashlyticsReport.Session.Event.Log.class, PlaybackStateCompat.CustomAction.d);
        encoderConfig.registerEncoder(SuratPernyataanBNDialog_ViewBinding.class, PlaybackStateCompat.CustomAction.d);
        encoderConfig.registerEncoder(CrashlyticsReport.FilesPayload.class, read.e);
        encoderConfig.registerEncoder(StatusPendudukDialog.class, read.e);
        encoderConfig.registerEncoder(CrashlyticsReport.FilesPayload.File.class, RemoteActionCompatParcelizer.a);
        encoderConfig.registerEncoder(StatusNPWPDialog_ViewBinding.class, RemoteActionCompatParcelizer.a);
    }
}
