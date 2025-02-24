package o;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.model.ImmutableList;
/* loaded from: classes2-dex2jar.jar:o/StatusPerkawinanDialog.class */
public final class StatusPerkawinanDialog extends CrashlyticsReport.Session.Event.Application {
    private final int a;
    private final CrashlyticsReport.Session.Event.Application.Execution b;
    private final ImmutableList<CrashlyticsReport.CustomAttribute> c;
    private final Boolean d;
    private final ImmutableList<CrashlyticsReport.CustomAttribute> e;

    /* loaded from: classes2-dex2jar.jar:o/StatusPerkawinanDialog$RemoteActionCompatParcelizer.class */
    public static final class RemoteActionCompatParcelizer extends CrashlyticsReport.Session.Event.Application.Builder {
        private Boolean a;
        private ImmutableList<CrashlyticsReport.CustomAttribute> b;
        private ImmutableList<CrashlyticsReport.CustomAttribute> c;
        private Integer d;
        private CrashlyticsReport.Session.Event.Application.Execution e;

        public RemoteActionCompatParcelizer() {
        }

        private RemoteActionCompatParcelizer(CrashlyticsReport.Session.Event.Application application) {
            this.e = application.getExecution();
            this.c = application.getCustomAttributes();
            this.b = application.getInternalKeys();
            this.a = application.getBackground();
            this.d = Integer.valueOf(application.getUiOrientation());
        }

        /* synthetic */ RemoteActionCompatParcelizer(CrashlyticsReport.Session.Event.Application application, byte b) {
            this(application);
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder
        public final CrashlyticsReport.Session.Event.Application build() {
            String str = this.e == null ? " execution" : "";
            String str2 = str;
            if (this.d == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" uiOrientation");
                str2 = sb.toString();
            }
            if (str2.isEmpty()) {
                return new StatusPerkawinanDialog(this.e, this.c, this.b, this.a, this.d.intValue(), (byte) 0);
            }
            StringBuilder sb2 = new StringBuilder("Missing required properties:");
            sb2.append(str2);
            throw new IllegalStateException(sb2.toString());
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder
        public final CrashlyticsReport.Session.Event.Application.Builder setBackground(Boolean bool) {
            this.a = bool;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder
        public final CrashlyticsReport.Session.Event.Application.Builder setCustomAttributes(ImmutableList<CrashlyticsReport.CustomAttribute> immutableList) {
            this.c = immutableList;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder
        public final CrashlyticsReport.Session.Event.Application.Builder setExecution(CrashlyticsReport.Session.Event.Application.Execution execution) {
            if (execution != null) {
                this.e = execution;
                return this;
            }
            throw new NullPointerException("Null execution");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder
        public final CrashlyticsReport.Session.Event.Application.Builder setInternalKeys(ImmutableList<CrashlyticsReport.CustomAttribute> immutableList) {
            this.b = immutableList;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application.Builder
        public final CrashlyticsReport.Session.Event.Application.Builder setUiOrientation(int i) {
            this.d = Integer.valueOf(i);
            return this;
        }
    }

    private StatusPerkawinanDialog(CrashlyticsReport.Session.Event.Application.Execution execution, ImmutableList<CrashlyticsReport.CustomAttribute> immutableList, ImmutableList<CrashlyticsReport.CustomAttribute> immutableList2, Boolean bool, int i) {
        this.b = execution;
        this.e = immutableList;
        this.c = immutableList2;
        this.d = bool;
        this.a = i;
    }

    /* synthetic */ StatusPerkawinanDialog(CrashlyticsReport.Session.Event.Application.Execution execution, ImmutableList immutableList, ImmutableList immutableList2, Boolean bool, int i, byte b) {
        this(execution, immutableList, immutableList2, bool, i);
    }

    public final boolean equals(Object obj) {
        ImmutableList<CrashlyticsReport.CustomAttribute> immutableList;
        ImmutableList<CrashlyticsReport.CustomAttribute> immutableList2;
        Boolean bool;
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.Session.Event.Application)) {
            return false;
        }
        CrashlyticsReport.Session.Event.Application application = (CrashlyticsReport.Session.Event.Application) obj;
        if (!this.b.equals(application.getExecution()) || ((immutableList = this.e) != null ? !immutableList.equals(application.getCustomAttributes()) : application.getCustomAttributes() != null) || ((immutableList2 = this.c) != null ? !immutableList2.equals(application.getInternalKeys()) : application.getInternalKeys() != null) || ((bool = this.d) != null ? !bool.equals(application.getBackground()) : application.getBackground() != null) || this.a != application.getUiOrientation()) {
            z = false;
        }
        return z;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application
    public final Boolean getBackground() {
        return this.d;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application
    public final ImmutableList<CrashlyticsReport.CustomAttribute> getCustomAttributes() {
        return this.e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application
    public final CrashlyticsReport.Session.Event.Application.Execution getExecution() {
        return this.b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application
    public final ImmutableList<CrashlyticsReport.CustomAttribute> getInternalKeys() {
        return this.c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application
    public final int getUiOrientation() {
        return this.a;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        ImmutableList<CrashlyticsReport.CustomAttribute> immutableList = this.e;
        int i = 0;
        int hashCode2 = immutableList == null ? 0 : immutableList.hashCode();
        ImmutableList<CrashlyticsReport.CustomAttribute> immutableList2 = this.c;
        int hashCode3 = immutableList2 == null ? 0 : immutableList2.hashCode();
        Boolean bool = this.d;
        if (bool != null) {
            i = bool.hashCode();
        }
        return ((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ i) * 1000003) ^ this.a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.Application
    public final CrashlyticsReport.Session.Event.Application.Builder toBuilder() {
        return new RemoteActionCompatParcelizer(this, (byte) 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Application{execution=");
        sb.append(this.b);
        sb.append(", customAttributes=");
        sb.append(this.e);
        sb.append(", internalKeys=");
        sb.append(this.c);
        sb.append(", background=");
        sb.append(this.d);
        sb.append(", uiOrientation=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }
}
