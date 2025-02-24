package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
/* loaded from: classes2-dex2jar.jar:o/JenisPekerjaanDialog.class */
public class JenisPekerjaanDialog {
    public static final IsiPernyataanDialog_ViewBinding b = new JenisKartuDialog(0.5f);
    public InfoNegaraORDialog_ViewBinding a;
    public IsiPernyataanDialog_ViewBinding c;
    JenisIdDialog_ViewBinding d;
    public InfoNegaraORDialog_ViewBinding e;
    JenisIdDialog_ViewBinding f;
    public InfoNegaraORDialog_ViewBinding g;
    JenisIdDialog_ViewBinding h;
    public IsiPernyataanDialog_ViewBinding i;
    public JenisIdDialog_ViewBinding j;
    public IsiPernyataanDialog_ViewBinding l;
    public IsiPernyataanDialog_ViewBinding m;

    /* renamed from: o */
    public InfoNegaraORDialog_ViewBinding f37o;

    /* loaded from: classes2-dex2jar.jar:o/JenisPekerjaanDialog$RemoteActionCompatParcelizer.class */
    public static final class RemoteActionCompatParcelizer {
        InfoNegaraORDialog_ViewBinding a;
        public IsiPernyataanDialog_ViewBinding b;
        InfoNegaraORDialog_ViewBinding c;
        JenisIdDialog_ViewBinding d;
        public IsiPernyataanDialog_ViewBinding e;
        JenisIdDialog_ViewBinding f;
        InfoNegaraORDialog_ViewBinding g;
        JenisIdDialog_ViewBinding h;
        public IsiPernyataanDialog_ViewBinding i;
        public JenisIdDialog_ViewBinding j;
        public IsiPernyataanDialog_ViewBinding k;
        InfoNegaraORDialog_ViewBinding l;

        public RemoteActionCompatParcelizer() {
            this.g = new JenisPekerjaanDialog_ViewBinding();
            this.l = new JenisPekerjaanDialog_ViewBinding();
            this.a = new JenisPekerjaanDialog_ViewBinding();
            this.c = new JenisPekerjaanDialog_ViewBinding();
            this.i = new InfoTarikanDialog_ViewBinding(0.0f);
            this.k = new InfoTarikanDialog_ViewBinding(0.0f);
            this.e = new InfoTarikanDialog_ViewBinding(0.0f);
            this.b = new InfoTarikanDialog_ViewBinding(0.0f);
            this.j = new JenisIdDialog_ViewBinding();
            this.f = new JenisIdDialog_ViewBinding();
            this.d = new JenisIdDialog_ViewBinding();
            this.h = new JenisIdDialog_ViewBinding();
        }

        public RemoteActionCompatParcelizer(JenisPekerjaanDialog jenisPekerjaanDialog) {
            this.g = new JenisPekerjaanDialog_ViewBinding();
            this.l = new JenisPekerjaanDialog_ViewBinding();
            this.a = new JenisPekerjaanDialog_ViewBinding();
            this.c = new JenisPekerjaanDialog_ViewBinding();
            this.i = new InfoTarikanDialog_ViewBinding(0.0f);
            this.k = new InfoTarikanDialog_ViewBinding(0.0f);
            this.e = new InfoTarikanDialog_ViewBinding(0.0f);
            this.b = new InfoTarikanDialog_ViewBinding(0.0f);
            this.j = new JenisIdDialog_ViewBinding();
            this.f = new JenisIdDialog_ViewBinding();
            this.d = new JenisIdDialog_ViewBinding();
            this.h = new JenisIdDialog_ViewBinding();
            this.g = jenisPekerjaanDialog.g;
            this.l = jenisPekerjaanDialog.f37o;
            this.a = jenisPekerjaanDialog.e;
            this.c = jenisPekerjaanDialog.a;
            this.i = jenisPekerjaanDialog.m;
            this.k = jenisPekerjaanDialog.l;
            this.e = jenisPekerjaanDialog.i;
            this.b = jenisPekerjaanDialog.c;
            this.j = jenisPekerjaanDialog.j;
            this.f = jenisPekerjaanDialog.h;
            this.d = jenisPekerjaanDialog.d;
            this.h = jenisPekerjaanDialog.f;
        }

        static float e(InfoNegaraORDialog_ViewBinding infoNegaraORDialog_ViewBinding) {
            if (infoNegaraORDialog_ViewBinding instanceof JenisPekerjaanDialog_ViewBinding) {
                return ((JenisPekerjaanDialog_ViewBinding) infoNegaraORDialog_ViewBinding).e;
            }
            if (infoNegaraORDialog_ViewBinding instanceof JenisIdDialog) {
                return ((JenisIdDialog) infoNegaraORDialog_ViewBinding).d;
            }
            return -1.0f;
        }
    }

    /* loaded from: classes2-dex2jar.jar:o/JenisPekerjaanDialog$read.class */
    public interface read {
        IsiPernyataanDialog_ViewBinding e(IsiPernyataanDialog_ViewBinding isiPernyataanDialog_ViewBinding);
    }

    public JenisPekerjaanDialog() {
        this.g = new JenisPekerjaanDialog_ViewBinding();
        this.f37o = new JenisPekerjaanDialog_ViewBinding();
        this.e = new JenisPekerjaanDialog_ViewBinding();
        this.a = new JenisPekerjaanDialog_ViewBinding();
        this.m = new InfoTarikanDialog_ViewBinding(0.0f);
        this.l = new InfoTarikanDialog_ViewBinding(0.0f);
        this.i = new InfoTarikanDialog_ViewBinding(0.0f);
        this.c = new InfoTarikanDialog_ViewBinding(0.0f);
        this.j = new JenisIdDialog_ViewBinding();
        this.h = new JenisIdDialog_ViewBinding();
        this.d = new JenisIdDialog_ViewBinding();
        this.f = new JenisIdDialog_ViewBinding();
    }

    private JenisPekerjaanDialog(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        this.g = remoteActionCompatParcelizer.g;
        this.f37o = remoteActionCompatParcelizer.l;
        this.e = remoteActionCompatParcelizer.a;
        this.a = remoteActionCompatParcelizer.c;
        this.m = remoteActionCompatParcelizer.i;
        this.l = remoteActionCompatParcelizer.k;
        this.i = remoteActionCompatParcelizer.e;
        this.c = remoteActionCompatParcelizer.b;
        this.j = remoteActionCompatParcelizer.j;
        this.h = remoteActionCompatParcelizer.f;
        this.d = remoteActionCompatParcelizer.d;
        this.f = remoteActionCompatParcelizer.h;
    }

    public /* synthetic */ JenisPekerjaanDialog(RemoteActionCompatParcelizer remoteActionCompatParcelizer, byte b2) {
        this(remoteActionCompatParcelizer);
    }

    private static IsiPernyataanDialog_ViewBinding a(TypedArray typedArray, int i, IsiPernyataanDialog_ViewBinding isiPernyataanDialog_ViewBinding) {
        TypedValue peekValue = typedArray.peekValue(i);
        return peekValue == null ? isiPernyataanDialog_ViewBinding : peekValue.type == 5 ? new InfoTarikanDialog_ViewBinding((float) TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics())) : peekValue.type == 6 ? new JenisKartuDialog(peekValue.getFraction(1.0f, 1.0f)) : isiPernyataanDialog_ViewBinding;
    }

    public static RemoteActionCompatParcelizer a(Context context, int i, int i2, IsiPernyataanDialog_ViewBinding isiPernyataanDialog_ViewBinding) {
        Context context2 = context;
        int i3 = i;
        if (i2 != 0) {
            context2 = new ContextThemeWrapper(context, i);
            i3 = i2;
        }
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(i3, BaseDialogKotlin$MediaSessionCompat$Token.fu);
        try {
            int i4 = obtainStyledAttributes.getInt(BaseDialogKotlin$MediaSessionCompat$Token.fs, 0);
            int i5 = obtainStyledAttributes.getInt(BaseDialogKotlin$MediaSessionCompat$Token.fy, i4);
            int i6 = obtainStyledAttributes.getInt(BaseDialogKotlin$MediaSessionCompat$Token.fz, i4);
            int i7 = obtainStyledAttributes.getInt(BaseDialogKotlin$MediaSessionCompat$Token.fA, i4);
            int i8 = obtainStyledAttributes.getInt(BaseDialogKotlin$MediaSessionCompat$Token.fw, i4);
            IsiPernyataanDialog_ViewBinding a = a(obtainStyledAttributes, BaseDialogKotlin$MediaSessionCompat$Token.fB, isiPernyataanDialog_ViewBinding);
            IsiPernyataanDialog_ViewBinding a2 = a(obtainStyledAttributes, BaseDialogKotlin$MediaSessionCompat$Token.fF, a);
            IsiPernyataanDialog_ViewBinding a3 = a(obtainStyledAttributes, BaseDialogKotlin$MediaSessionCompat$Token.fC, a);
            IsiPernyataanDialog_ViewBinding a4 = a(obtainStyledAttributes, BaseDialogKotlin$MediaSessionCompat$Token.fG, a);
            IsiPernyataanDialog_ViewBinding a5 = a(obtainStyledAttributes, BaseDialogKotlin$MediaSessionCompat$Token.fx, a);
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = new RemoteActionCompatParcelizer();
            InfoNegaraORDialog_ViewBinding a6 = JenisKartuDialog_ViewBinding.a(i5);
            remoteActionCompatParcelizer.g = a6;
            float e = RemoteActionCompatParcelizer.e(a6);
            if (e != -1.0f) {
                remoteActionCompatParcelizer.i = new InfoTarikanDialog_ViewBinding(e);
            }
            remoteActionCompatParcelizer.i = a2;
            InfoNegaraORDialog_ViewBinding a7 = JenisKartuDialog_ViewBinding.a(i6);
            remoteActionCompatParcelizer.l = a7;
            float e2 = RemoteActionCompatParcelizer.e(a7);
            if (e2 != -1.0f) {
                remoteActionCompatParcelizer.k = new InfoTarikanDialog_ViewBinding(e2);
            }
            remoteActionCompatParcelizer.k = a3;
            InfoNegaraORDialog_ViewBinding a8 = JenisKartuDialog_ViewBinding.a(i7);
            remoteActionCompatParcelizer.a = a8;
            float e3 = RemoteActionCompatParcelizer.e(a8);
            if (e3 != -1.0f) {
                remoteActionCompatParcelizer.e = new InfoTarikanDialog_ViewBinding(e3);
            }
            remoteActionCompatParcelizer.e = a4;
            InfoNegaraORDialog_ViewBinding a9 = JenisKartuDialog_ViewBinding.a(i8);
            remoteActionCompatParcelizer.c = a9;
            float e4 = RemoteActionCompatParcelizer.e(a9);
            if (e4 != -1.0f) {
                remoteActionCompatParcelizer.b = new InfoTarikanDialog_ViewBinding(e4);
            }
            remoteActionCompatParcelizer.b = a5;
            return remoteActionCompatParcelizer;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static RemoteActionCompatParcelizer d(Context context, AttributeSet attributeSet, int i, int i2, IsiPernyataanDialog_ViewBinding isiPernyataanDialog_ViewBinding) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, BaseDialogKotlin$MediaSessionCompat$Token.eg, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(BaseDialogKotlin$MediaSessionCompat$Token.ei, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(BaseDialogKotlin$MediaSessionCompat$Token.ef, 0);
        obtainStyledAttributes.recycle();
        return a(context, resourceId, resourceId2, isiPernyataanDialog_ViewBinding);
    }

    public static RemoteActionCompatParcelizer e(Context context, AttributeSet attributeSet, int i, int i2) {
        return d(context, attributeSet, i, i2, new InfoTarikanDialog_ViewBinding(0.0f));
    }

    public final boolean a(RectF rectF) {
        boolean z = this.f.getClass().equals(JenisIdDialog_ViewBinding.class) && this.h.getClass().equals(JenisIdDialog_ViewBinding.class) && this.j.getClass().equals(JenisIdDialog_ViewBinding.class) && this.d.getClass().equals(JenisIdDialog_ViewBinding.class);
        float e = this.m.e(rectF);
        boolean z2 = this.l.e(rectF) == e && this.c.e(rectF) == e && this.i.e(rectF) == e;
        boolean z3 = (this.f37o instanceof JenisPekerjaanDialog_ViewBinding) && (this.g instanceof JenisPekerjaanDialog_ViewBinding) && (this.e instanceof JenisPekerjaanDialog_ViewBinding) && (this.a instanceof JenisPekerjaanDialog_ViewBinding);
        boolean z4 = false;
        if (z) {
            z4 = false;
            if (z2) {
                z4 = z3;
            }
        }
        return z4;
    }
}
