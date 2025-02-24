package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import o.JenisPekerjaanDialog;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2-dex2jar.jar:o/MessageDialog_ViewBinding.class */
public class MessageDialog_ViewBinding extends setMaxHeight {
    private JenisKodeBankDialog j;
    private final Runnable n;

    /* renamed from: o  reason: collision with root package name */
    private int f41o;

    public MessageDialog_ViewBinding(Context context) {
        this(context, null);
    }

    public MessageDialog_ViewBinding(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MessageDialog_ViewBinding(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(BaseDialogKotlin$MediaBrowserCompat$MediaItem.p, (ViewGroup) this);
        JenisKodeBankDialog jenisKodeBankDialog = new JenisKodeBankDialog();
        this.j = jenisKodeBankDialog;
        JenisKartuDialog jenisKartuDialog = new JenisKartuDialog(0.5f);
        JenisPekerjaanDialog.RemoteActionCompatParcelizer remoteActionCompatParcelizer = new JenisPekerjaanDialog.RemoteActionCompatParcelizer(jenisKodeBankDialog.F.l);
        remoteActionCompatParcelizer.i = jenisKartuDialog;
        remoteActionCompatParcelizer.k = jenisKartuDialog;
        remoteActionCompatParcelizer.e = jenisKartuDialog;
        remoteActionCompatParcelizer.b = jenisKartuDialog;
        jenisKodeBankDialog.setShapeAppearanceModel(new JenisPekerjaanDialog(remoteActionCompatParcelizer, (byte) 0));
        this.j.c(ColorStateList.valueOf(-1));
        findFragmentByWho.b(this, this.j);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, BaseDialogKotlin$MediaSessionCompat$Token.fm, i, 0);
        this.f41o = obtainStyledAttributes.getDimensionPixelSize(BaseDialogKotlin$MediaSessionCompat$Token.fl, 0);
        this.n = new Runnable() { // from class: o.MessageDialog_ViewBinding.4
            @Override // java.lang.Runnable
            public final void run() {
                MessageDialog_ViewBinding.this.c();
            }
        };
        obtainStyledAttributes.recycle();
    }

    public final int a() {
        return this.f41o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        addView(view, i, layoutParams);
        if (view.getId() == -1) {
            view.setId(findFragmentByWho.e());
        }
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.n);
            handler.post(this.n);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected final void c() {
        int childCount = getChildCount();
        int i = 1;
        for (int i2 = 0; i2 < childCount; i2++) {
            i = i;
            if ("skip".equals(getChildAt(i2).getTag())) {
                i++;
            }
        }
        setDesignInformation setdesigninformation = new setDesignInformation();
        setdesigninformation.c(this);
        float f = 0.0f;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            f = f;
            if (childAt.getId() != BaseDialogKotlin$MediaBrowserCompat$ItemReceiver.e) {
                if ("skip".equals(childAt.getTag())) {
                    f = f;
                } else {
                    setdesigninformation.d(childAt.getId(), BaseDialogKotlin$MediaBrowserCompat$ItemReceiver.e, this.f41o, f);
                    f += 360.0f / ((float) (childCount - i));
                }
            }
        }
        setdesigninformation.d(this);
    }

    protected void onFinishInflate() {
        onFinishInflate();
        c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewRemoved(View view) {
        onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.n);
            handler.post(this.n);
        }
    }

    public void setBackgroundColor(int i) {
        this.j.c(ColorStateList.valueOf(i));
    }

    public void setRadius(int i) {
        this.f41o = i;
        c();
    }
}
