package com.bca.smartbranch.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.OnClick;
import com.bca.smartbranch.activity.ReservasiSuccessAskNextActivity;
import com.bca.smartbranch.data.global.Reservation;
import com.bca.smartbranch.data.localdb.ReservasiOnline;
import com.bca.smartbranch.dialog.ExitTransaksiDialog;
import com.bca.smartbranch.presenter.GetHBPresenter;
import com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter;
import io.realm.Realm;
import io.realm.RealmResults;
import java.util.Iterator;
import o.InfoProductORActivity_ViewBinding;
import o.ListUtil;
import o.LoginSessionActivity_ViewBinding;
import o.OpenAccountSuccessActivity;
import o.Stetho$Initializer$RealSocketHandlerFactory;
import o.checkboxAgree;
import o.setCardSlogan;
import o.setCurrencyName;
import o.setInputType;
import retrofit2.Call;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/ReservasiSuccessAskNextActivity.class */
public class ReservasiSuccessAskNextActivity extends BaseActivityPostLogin implements GetHBPresenter.write, SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer {
    private Bundle f;
    @BindView(2131297766)
    LinearLayout llMain;
    private GetHBPresenter n;
    private SendEmailTransactionSuccessPresenter p;
    @BindView(setCurrencyName.IconCompatParcelizer.ae)
    setInputType toolbar;
    @BindView(2131298790)
    TextView txtToolbarTitle;

    public static /* synthetic */ void a(RealmResults realmResults) {
        Iterator<E> it = realmResults.iterator();
        while (it.hasNext()) {
            ((ReservasiOnline) it.next()).setHasDone(false);
        }
    }

    private void c(String str) {
        x();
        this.f.putString("email_success", str);
        Intent intent = new Intent(this, ReservasiROSuccessActivity.class);
        intent.putExtras(this.f);
        startActivity(intent);
    }

    @Override // com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer
    public final void a(String str) {
        c("");
    }

    @Override // com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer
    public final void a_(String str) {
        c("");
    }

    @Override // com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer
    public final void c_(String str) {
        c("");
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    public final void d(Bundle bundle) {
        d(bundle);
        this.f10o = false;
        b(this.toolbar);
        i();
        i().d(false);
        i().d("");
        GetHBPresenter getHBPresenter = new GetHBPresenter();
        this.n = getHBPresenter;
        getHBPresenter.e = this;
        SendEmailTransactionSuccessPresenter sendEmailTransactionSuccessPresenter = new SendEmailTransactionSuccessPresenter();
        this.p = sendEmailTransactionSuccessPresenter;
        sendEmailTransactionSuccessPresenter.b = this;
        Bundle extras = getIntent().getExtras();
        this.f = extras;
        Reservation reservation = (Reservation) ListUtil.OneItemImmutableList.a(extras.getParcelable("reservation_data"));
        if (reservation == null) {
            return;
        }
        if (reservation.getTxnType().equalsIgnoreCase("Transaksi CS")) {
            this.txtToolbarTitle.setText("Reservasi CS");
        } else if (reservation.getTxnType().equalsIgnoreCase("Transaksi Teller")) {
            this.txtToolbarTitle.setText("Reservasi Teller");
        } else {
            this.txtToolbarTitle.setText("");
        }
    }

    @Override // com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer
    public final void d_(String str) {
        c(str);
    }

    @Override // com.bca.smartbranch.presenter.SendEmailTransactionSuccessPresenter.RemoteActionCompatParcelizer
    public final void g_() {
        z();
    }

    @OnClick({2131296416})
    public void no(View view) {
        this.k.executeTransaction(new Realm.Transaction() { // from class: o.DetailBerhasilEChannelActivity_ViewBinding
            @Override // io.realm.Realm.Transaction
            public final void execute(Realm realm) {
                ReservasiSuccessAskNextActivity.a(RealmResults.this);
            }
        });
        this.p.c(new LoginSessionActivity_ViewBinding(this.m.getEmail(), this.f.getString("reff_number", "")));
    }

    @Override // o.MediaSessionCompat$QueueItem, android.app.Activity
    public void onBackPressed() {
        new ExitTransaksiDialog().show(l(), "ExitTransaksiDialog");
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin, o.setPadding, o.getView, android.app.Activity
    public void onDestroy() {
        onDestroy();
        GetHBPresenter getHBPresenter = this.n;
        Call<OpenAccountSuccessActivity<Object>> call = getHBPresenter.b;
        if (call != null) {
            call.cancel();
        }
        getHBPresenter.e = null;
        SendEmailTransactionSuccessPresenter sendEmailTransactionSuccessPresenter = this.p;
        Call<OpenAccountSuccessActivity<Object>> call2 = sendEmailTransactionSuccessPresenter.a;
        if (call2 != null) {
            call2.cancel();
        }
        sendEmailTransactionSuccessPresenter.b = null;
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public void onExitTransaction(checkboxAgree checkboxagree) {
        startActivity(new Intent(this, TransactionActivity.class));
        finishAffinity();
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final void p() {
        setCardSlogan.e().b = "ReservasiSuccessAskNextActivity";
        this.j = "ReservasiSuccessAskNextActivity";
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final int q() {
        return 2131492995;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final Activity r() {
        return this;
    }

    @OnClick({2131296462})
    public void yes(View view) {
        GetHBPresenter getHBPresenter = this.n;
        Call<OpenAccountSuccessActivity<Object>> e = getHBPresenter.apiService.e(new InfoProductORActivity_ViewBinding(this.h, this.m.getSessionId(), this.m.getImei()));
        getHBPresenter.b = e;
        e.enqueue(
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0038: INVOKE  
              (r0v5 'e' retrofit2.Call<o.OpenAccountSuccessActivity<java.lang.Object>>)
              (wrap: com.bca.smartbranch.presenter.GetHBPresenter$5 : 0x0035: CONSTRUCTOR  (r1v3 com.bca.smartbranch.presenter.GetHBPresenter$5 A[REMOVE]) = (r0v1 'getHBPresenter' com.bca.smartbranch.presenter.GetHBPresenter) call: com.bca.smartbranch.presenter.GetHBPresenter.5.<init>(com.bca.smartbranch.presenter.GetHBPresenter):void type: CONSTRUCTOR)
             type: INTERFACE call: retrofit2.Call.enqueue(retrofit2.Callback):void in method: com.bca.smartbranch.activity.ReservasiSuccessAskNextActivity.yes(android.view.View):void, file: classes-dex2jar.jar:com/bca/smartbranch/activity/ReservasiSuccessAskNextActivity.class
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:270)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:233)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:90)
            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
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
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bca.smartbranch.presenter.GetHBPresenter, state: GENERATED_AND_UNLOADED
            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:268)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:668)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:378)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:132)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:117)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:104)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:974)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:799)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:382)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:263)
            	... 15 more
            */
        /*
            this = this;
            r0 = r6
            com.bca.smartbranch.presenter.GetHBPresenter r0 = r0.n
            r7 = r0
            o.InfoProductORActivity_ViewBinding r0 = new o.InfoProductORActivity_ViewBinding
            r1 = r0
            r2 = r6
            java.lang.String r2 = r2.h
            r3 = r6
            com.bca.smartbranch.data.localdb.User r3 = r3.m
            java.lang.String r3 = r3.getSessionId()
            r4 = r6
            com.bca.smartbranch.data.localdb.User r4 = r4.m
            java.lang.String r4 = r4.getImei()
            r1.<init>(r2, r3, r4)
            r8 = r0
            r0 = r7
            o.setIncomeDisplayAmount r0 = r0.apiService
            r1 = r8
            retrofit2.Call r0 = r0.e(r1)
            r8 = r0
            r0 = r7
            r1 = r8
            r0.b = r1
            r0 = r8
            com.bca.smartbranch.presenter.GetHBPresenter$5 r1 = new com.bca.smartbranch.presenter.GetHBPresenter$5
            r2 = r1
            r3 = r7
            r2.<init>()
            r0.enqueue(r1)
            android.content.Intent r0 = new android.content.Intent
            r1 = r0
            r2 = r6
            java.lang.Class<com.bca.smartbranch.activity.ReservasiListChosenActivity> r3 = com.bca.smartbranch.activity.ReservasiListChosenActivity.class
            r1.<init>(r2, r3)
            r7 = r0
            r0 = r7
            r1 = r6
            android.os.Bundle r1 = r1.f
            android.content.Intent r0 = r0.putExtras(r1)
            r0 = r6
            r1 = r7
            r0.startActivity(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bca.smartbranch.activity.ReservasiSuccessAskNextActivity.yes(android.view.View):void");
    }
}
