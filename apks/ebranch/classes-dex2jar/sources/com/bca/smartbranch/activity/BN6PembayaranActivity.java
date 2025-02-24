package com.bca.smartbranch.activity;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.graphics.drawable.TransitionDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ViewAnimator;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.OnClick;
import com.bca.smartbranch.data.api.response.SubmitBankNotesResponse;
import com.bca.smartbranch.dialog.InfoCaraPembayaranDialog;
import o.KeluarFormReservationDialog_ViewBinding;
import o.Stetho$Initializer$RealSocketHandlerFactory;
import o.onClickItem;
import o.setCardSlogan;
import o.setCurrencyName;
import o.setInputType;
import o.setMessage;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/BN6PembayaranActivity.class */
public class BN6PembayaranActivity extends BaseActivityPostLogin {
    private setMessage f = new setMessage();
    @BindView(2131297415)
    ImageView ivRincianPembelian;
    @BindView(2131297613)
    LinearLayout llDenom;
    @BindView(2131297676)
    LinearLayout llHeaderRincianPembelian;
    @BindView(2131297499)
    LinearLayout llLayoutRincianPembelian;
    @BindView(2131297766)
    LinearLayout llMain;
    private String n;
    private String p;
    private String q;
    private String r;
    private SubmitBankNotesResponse.SubmitBankNotesDataOutput s;
    private CountDownTimer t;
    @BindView(setCurrencyName.IconCompatParcelizer.ae)
    setInputType toolbar;
    @BindString(2131822242)
    String toolbarTitle;
    @BindView(2131298889)
    TextView tvDariRekening;
    @BindView(2131298917)
    TextView tvDenom;
    @BindView(2131298935)
    TextView tvDetik1;
    @BindView(2131298936)
    TextView tvDetik2;
    @BindView(2131299071)
    TextView tvErrorMessage;
    @BindView(2131299327)
    TextView tvJumlahPembelian;
    @BindView(2131299385)
    TextView tvKurs;
    @BindView(2131299400)
    TextView tvMataUang;
    @BindView(2131299406)
    TextView tvMenit1;
    @BindView(2131299407)
    TextView tvMenit2;
    @BindView(2131299574)
    TextView tvStatus;
    @BindView(2131299628)
    TextView tvTitleDenom;
    @BindView(2131299684)
    TextView tvTotalPembayaran;
    @BindView(2131299694)
    TextView tvTujuanPembelian;
    @BindView(2131299731)
    TextView tvVAAccount;
    @BindView(2131298790)
    TextView txtToolbarTitle;
    private String u;
    private String v;
    private String w;
    private String x;
    private String y;
    private ViewAnimator z;

    @OnClick({2131299566})
    public void copyNoRef() {
        ((ClipboardManager) getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", this.tvVAAccount.getText().toString().replace(" ", "")));
        KeluarFormReservationDialog_ViewBinding.a(null, this.llMain, "No. BCA Virtual Account telah disalin", -1).g();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0130, code lost:
        if (r0.equals("Kondisi") != false) goto L_0x01bb;
     */
    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final void d(android.os.Bundle r10) {
        /*
        // Method dump skipped, instructions count: 1095
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.BN6PembayaranActivity.d(android.os.Bundle):void");
    }

    @Override // o.MediaSessionCompat$QueueItem, android.app.Activity
    public void onBackPressed() {
        startActivity(new Intent(this, MainActivity.class));
        overridePendingTransition(2130772009, 2130772012);
    }

    @OnClick({2131297542})
    public void onClickBcaKlikpay() {
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://m.klikbca.com")));
    }

    @OnClick({2131297544})
    public void onClickBcaMobile() {
        try {
            startActivity(getPackageManager().getLaunchIntentForPackage("com.bca"));
        } catch (Exception e) {
            try {
                startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.bca")));
            } catch (ActivityNotFoundException e2) {
                startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=com.bca")));
            }
        }
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(2131558409, menu);
        return true;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin, o.setPadding, o.getView, android.app.Activity
    public void onDestroy() {
        onDestroy();
        CountDownTimer countDownTimer = this.t;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            onBackPressed();
            return true;
        } else if (menuItem.getItemId() != 2131298038) {
            return onOptionsItemSelected(menuItem);
        } else {
            startActivity(new Intent(this, MainActivity.class));
            overridePendingTransition(2130772009, 2130772012);
            return true;
        }
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onPaid(onClickItem onclickitem) {
        Intent intent = new Intent(this, BN7PengambilanNotificationActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("response", onclickitem.d);
        intent.putExtras(bundle);
        startActivity(intent);
        finish();
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final void p() {
        setCardSlogan.e().b = "BN6PembayaranActivity";
        this.j = "BN6PembayaranActivity";
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final int q() {
        return 2131492898;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final Activity r() {
        return this;
    }

    @OnClick({2131297415, 2131299560})
    public void showDetailPembayaran(View view) {
        TransitionDrawable transitionDrawable = (TransitionDrawable) this.llHeaderRincianPembelian.getBackground();
        transitionDrawable.setCrossFadeEnabled(true);
        if (this.llLayoutRincianPembelian.getVisibility() == 8) {
            this.f.c(this.llLayoutRincianPembelian);
            setMessage setmessage = this.f;
            ImageView imageView = this.ivRincianPembelian;
            setmessage.c = new RotateAnimation(0.0f, -180.0f, 1, 0.5f, 1, 0.5f);
            setmessage.e(imageView);
            transitionDrawable.startTransition(0);
            return;
        }
        setMessage setmessage2 = this.f;
        LinearLayout linearLayout = this.llLayoutRincianPembelian;
        setmessage2.a = linearLayout.getMeasuredHeight();
        setmessage2.b = 
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x006f: IPUT  
              (wrap: o.setMessage$1 : 0x006c: CONSTRUCTOR  (r1v4 o.setMessage$1 A[REMOVE]) = (r0v9 'setmessage2' o.setMessage), (r0v11 'linearLayout' android.widget.LinearLayout) call: o.setMessage.1.<init>(o.setMessage, android.view.View):void type: CONSTRUCTOR)
              (r0v9 'setmessage2' o.setMessage)
             o.setMessage.b android.view.animation.Animation in method: com.bca.smartbranch.activity.BN6PembayaranActivity.showDetailPembayaran(android.view.View):void, file: classes-dex2jar.jar:com/bca/smartbranch/activity/BN6PembayaranActivity.class
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:270)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:233)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:90)
            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:255)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:248)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:369)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:304)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:270)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: o.setMessage, state: GENERATED_AND_UNLOADED
            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:268)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:668)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:378)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:132)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:117)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:104)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:447)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:263)
            	... 19 more
            */
        /*
            this = this;
            r0 = r10
            android.widget.LinearLayout r0 = r0.llHeaderRincianPembelian
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            android.graphics.drawable.TransitionDrawable r0 = (android.graphics.drawable.TransitionDrawable) r0
            r11 = r0
            r0 = r11
            r1 = 1
            r0.setCrossFadeEnabled(r1)
            r0 = r10
            android.widget.LinearLayout r0 = r0.llLayoutRincianPembelian
            int r0 = r0.getVisibility()
            r1 = 8
            if (r0 != r1) goto L_0x0053
            r0 = r10
            o.setMessage r0 = r0.f
            r1 = r10
            android.widget.LinearLayout r1 = r1.llLayoutRincianPembelian
            r0.c(r1)
            r0 = r10
            o.setMessage r0 = r0.f
            r12 = r0
            r0 = r10
            android.widget.ImageView r0 = r0.ivRincianPembelian
            r13 = r0
            r0 = r12
            android.view.animation.RotateAnimation r1 = new android.view.animation.RotateAnimation
            r2 = r1
            r3 = 0
            r4 = -1020002304(0xffffffffc3340000, float:-180.0)
            r5 = 1
            r6 = 1056964608(0x3f000000, float:0.5)
            r7 = 1
            r8 = 1056964608(0x3f000000, float:0.5)
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r0.c = r1
            r0 = r12
            r1 = r13
            r0.e(r1)
            r0 = r11
            r1 = 0
            r0.startTransition(r1)
            return
        L_0x0053:
            r0 = r10
            o.setMessage r0 = r0.f
            r12 = r0
            r0 = r10
            android.widget.LinearLayout r0 = r0.llLayoutRincianPembelian
            r13 = r0
            r0 = r12
            r1 = r13
            int r1 = r1.getMeasuredHeight()
            r0.a = r1
            r0 = r12
            o.setMessage$1 r1 = new o.setMessage$1
            r2 = r1
            r3 = r12
            r4 = r13
            r2.<init>(r4)
            r0.b = r1
            r0 = r12
            r1 = r13
            r0.b(r1)
            r0 = r10
            o.setMessage r0 = r0.f
            r13 = r0
            r0 = r10
            android.widget.ImageView r0 = r0.ivRincianPembelian
            r12 = r0
            r0 = r13
            android.view.animation.RotateAnimation r1 = new android.view.animation.RotateAnimation
            r2 = r1
            r3 = -1020002304(0xffffffffc3340000, float:-180.0)
            r4 = 0
            r5 = 1
            r6 = 1056964608(0x3f000000, float:0.5)
            r7 = 1
            r8 = 1056964608(0x3f000000, float:0.5)
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r0.c = r1
            r0 = r13
            r1 = r12
            r0.e(r1)
            r0 = r11
            r1 = 0
            r0.reverseTransition(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.BN6PembayaranActivity.showDetailPembayaran(android.view.View):void");
    }

    @OnClick({2131297315})
    public void showDialogCaraPembayaran() {
        new InfoCaraPembayaranDialog().show(l(), "InfoCaraPembayaranDialog");
    }
}
