package o;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bca.smartbranch.data.localdb.BankTransferPenerima;
import io.realm.RealmList;
import o.DetailTundaEChannelNotificationActivity;
/* loaded from: classes-dex2jar.jar:o/DetailTundaEChannelNotificationActivity.class */
public final class DetailTundaEChannelNotificationActivity extends setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver<write> {
    public RealmList<BankTransferPenerima> b;
    private Context e;

    /* loaded from: classes-dex2jar.jar:o/DetailTundaEChannelNotificationActivity$write.class */
    public static final class write extends setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable {
        TextView A;
        private LinearLayout B;
        private ImageView C;
        private LinearLayout D;
        ImageView q;
        ImageView t;
        TextView u;
        TextView v;
        TextView w;
        TextView x;
        TextView y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public write(View view) {
            super(view);
            subscribeReservationRescheduleEvent.e(view, "");
            View findViewById = view.findViewById(2131297766);
            subscribeReservationRescheduleEvent.d(findViewById, "");
            this.B = (LinearLayout) findViewById;
            View findViewById2 = view.findViewById(2131297417);
            subscribeReservationRescheduleEvent.d(findViewById2, "");
            this.C = (ImageView) findViewById2;
            View findViewById3 = view.findViewById(2131299615);
            subscribeReservationRescheduleEvent.d(findViewById3, "");
            this.A = (TextView) findViewById3;
            View findViewById4 = view.findViewById(2131297306);
            subscribeReservationRescheduleEvent.d(findViewById4, "");
            this.q = (ImageView) findViewById4;
            View findViewById5 = view.findViewById(2131297410);
            subscribeReservationRescheduleEvent.d(findViewById5, "");
            this.t = (ImageView) findViewById5;
            View findViewById6 = view.findViewById(2131297623);
            subscribeReservationRescheduleEvent.d(findViewById6, "");
            this.D = (LinearLayout) findViewById6;
            View findViewById7 = view.findViewById(2131299468);
            subscribeReservationRescheduleEvent.d(findViewById7, "");
            this.x = (TextView) findViewById7;
            View findViewById8 = view.findViewById(2131298837);
            subscribeReservationRescheduleEvent.d(findViewById8, "");
            this.w = (TextView) findViewById8;
            View findViewById9 = view.findViewById(2131299427);
            subscribeReservationRescheduleEvent.d(findViewById9, "");
            this.u = (TextView) findViewById9;
            View findViewById10 = view.findViewById(2131299485);
            subscribeReservationRescheduleEvent.d(findViewById10, "");
            this.v = (TextView) findViewById10;
            View findViewById11 = view.findViewById(2131298859);
            subscribeReservationRescheduleEvent.d(findViewById11, "");
            this.y = (TextView) findViewById11;
        }

        public static /* synthetic */ void b(write write, View view) {
            subscribeReservationRescheduleEvent.e(write, "");
            write.j();
        }

        public static /* synthetic */ boolean c(int i, MenuItem menuItem) {
            boolean z;
            int itemId = menuItem.getItemId();
            if (itemId == 2131298036) {
                documentProvider.b().d(new showDataTransaksiSetoran(i));
            } else if (itemId != 2131298042) {
                z = false;
                return z;
            } else {
                documentProvider.b().d(new ChooseVisaAdapter$ViewHolder_ViewBinding(i));
            }
            z = true;
            return z;
        }

        public static /* synthetic */ void e(write write, Context context, int i, View view) {
            subscribeReservationRescheduleEvent.e(write, "");
            subscribeReservationRescheduleEvent.e(context, "");
            subscribeReservationRescheduleEvent.e(context, "");
            setHoverListener sethoverlistener = new setHoverListener(context, write.t);
            new setUiOptions(sethoverlistener.b).inflate(2131558408, sethoverlistener.a);
            sethoverlistener.c = new DetailTundaEChannelNotificationActivity_ViewBinding(i);
            setBackgroundDrawable setbackgrounddrawable = new setBackgroundDrawable(context, sethoverlistener.a, write.t, false, 0, 2131886355);
            setbackgrounddrawable.e = true;
            setInitialActivityCount setinitialactivitycount = setbackgrounddrawable.c;
            if (setinitialactivitycount != null) {
                setinitialactivitycount.d(true);
            }
            setbackgrounddrawable.b = 8388613;
            setbackgrounddrawable.c();
        }

        public static /* synthetic */ void e(write write, View view) {
            subscribeReservationRescheduleEvent.e(write, "");
            write.j();
        }

        private void j() {
            setMessage setmessage = new setMessage();
            if (this.D.getVisibility() == 8) {
                setmessage.c(this.D);
                setmessage.c = new RotateAnimation(0.0f, -180.0f, 1, 0.5f, 1, 0.5f);
                setmessage.e(this.q);
                return;
            }
            LinearLayout linearLayout = this.D;
            setmessage.a = linearLayout.getMeasuredHeight();
            setmessage.b = 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x005b: IPUT  
                  (wrap: o.setMessage$1 : 0x0058: CONSTRUCTOR  (r1v4 o.setMessage$1 A[REMOVE]) = (r0v0 'setmessage' o.setMessage), (r0v6 'linearLayout' android.widget.LinearLayout) call: o.setMessage.1.<init>(o.setMessage, android.view.View):void type: CONSTRUCTOR)
                  (r0v0 'setmessage' o.setMessage)
                 o.setMessage.b android.view.animation.Animation in method: o.DetailTundaEChannelNotificationActivity.write.j():void, file: classes-dex2jar.jar:o/DetailTundaEChannelNotificationActivity$write.class
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
                o.setMessage r0 = new o.setMessage
                r1 = r0
                r1.<init>()
                r11 = r0
                r0 = r10
                android.widget.LinearLayout r0 = r0.D
                int r0 = r0.getVisibility()
                r1 = 8
                if (r0 != r1) goto L_0x0041
                r0 = r11
                r1 = r10
                android.widget.LinearLayout r1 = r1.D
                android.view.View r1 = (android.view.View) r1
                r0.c(r1)
                r0 = r10
                android.widget.ImageView r0 = r0.q
                android.view.View r0 = (android.view.View) r0
                r12 = r0
                r0 = r11
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
                r0 = r11
                r1 = r12
                r0.e(r1)
                return
            L_0x0041:
                r0 = r10
                android.widget.LinearLayout r0 = r0.D
                android.view.View r0 = (android.view.View) r0
                r12 = r0
                r0 = r11
                r1 = r12
                int r1 = r1.getMeasuredHeight()
                r0.a = r1
                r0 = r11
                o.setMessage$1 r1 = new o.setMessage$1
                r2 = r1
                r3 = r11
                r4 = r12
                r2.<init>(r4)
                r0.b = r1
                r0 = r11
                r1 = r12
                r0.b(r1)
                r0 = r10
                android.widget.ImageView r0 = r0.q
                android.view.View r0 = (android.view.View) r0
                r12 = r0
                r0 = r11
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
                r0 = r11
                r1 = r12
                r0.e(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.DetailTundaEChannelNotificationActivity.write.j():void");
        }
    }

    public DetailTundaEChannelNotificationActivity(Context context, RealmList<BankTransferPenerima> realmList) {
        subscribeReservationRescheduleEvent.e(context, "");
        subscribeReservationRescheduleEvent.e(realmList, "");
        this.e = context;
        this.b = realmList;
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final /* synthetic */ write a(ViewGroup viewGroup, int i) {
        subscribeReservationRescheduleEvent.e(viewGroup, "");
        View inflate = LayoutInflater.from(this.e).inflate(2131493298, viewGroup, false);
        subscribeReservationRescheduleEvent.d(inflate, "");
        return new write(inflate);
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final int c() {
        return this.b.size();
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final /* synthetic */ void e(write write2, int i) {
        write write3 = write2;
        subscribeReservationRescheduleEvent.e(write3, "");
        BankTransferPenerima bankTransferPenerima = this.b.get(i);
        if (bankTransferPenerima != null) {
            Context context = this.e;
            subscribeReservationRescheduleEvent.e(context, "");
            subscribeReservationRescheduleEvent.e(bankTransferPenerima, "");
            write3.x.setText(bankTransferPenerima.getNorekPenerima());
            write3.w.setText(bankTransferPenerima.getBankTujuanPenerima());
            write3.u.setText(bankTransferPenerima.getNamaPenerima());
            TextView textView = write3.v;
            StringBuilder sb = new StringBuilder();
            String nominalPenerima = bankTransferPenerima.getNominalPenerima();
            subscribeReservationRescheduleEvent.d(nominalPenerima, "");
            sb.append(getPromotion.j(CheckOTPSessionPresenter.a(nominalPenerima, ".", ",", false)));
            sb.append(" IDR");
            textView.setText(sb.toString());
            TextView textView2 = write3.y;
            StringBuilder sb2 = new StringBuilder();
            String biayaTransfer = bankTransferPenerima.getBiayaTransfer();
            subscribeReservationRescheduleEvent.d(biayaTransfer, "");
            sb2.append(getPromotion.b(CheckOTPSessionPresenter.a(biayaTransfer, ".", ",", false)));
            sb2.append(" IDR");
            textView2.setText(sb2.toString());
            TextView textView3 = write3.A;
            StringBuilder sb3 = new StringBuilder("Penerima ");
            sb3.append(i + 1);
            textView3.setText(sb3.toString());
            write3.A.setOnClickListener(new View.OnClickListener() { // from class: o.DetailTundaNotificationActivity
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    DetailTundaEChannelNotificationActivity.write.b(DetailTundaEChannelNotificationActivity.write.this, view);
                }
            });
            write3.q.setOnClickListener(new View.OnClickListener() { // from class: o.DetailTundaNotificationActivity_ViewBinding
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    DetailTundaEChannelNotificationActivity.write.e(DetailTundaEChannelNotificationActivity.write.this, view);
                }
            });
            write3.t.setOnClickListener(new View.OnClickListener(context, i) { // from class: o.DetailTundaNotificationBookedActivity
                public final /* synthetic */ Context a;
                public final /* synthetic */ int c;

                {
                    this.a = r5;
                    this.c = r6;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    DetailTundaEChannelNotificationActivity.write.e(DetailTundaEChannelNotificationActivity.write.this, this.a, this.c, view);
                }
            });
        }
    }
}
