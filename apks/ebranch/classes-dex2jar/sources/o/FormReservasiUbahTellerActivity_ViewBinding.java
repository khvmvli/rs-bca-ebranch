package o;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.RotateAnimation;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Space;
import android.widget.TextView;
import com.bca.smartbranch.data.localdb.KliringTemp;
import com.bca.smartbranch.data.localdb.User;
import com.bca.smartbranch.data.localdb.WarkatTemp;
import java.util.ArrayList;
/* loaded from: classes-dex2jar.jar:o/FormReservasiUbahTellerActivity_ViewBinding.class */
public final class FormReservasiUbahTellerActivity_ViewBinding extends setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver<setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable> {
    public static final FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver e = new FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver((byte) 0);
    public int b;
    public boolean f;
    public boolean h;
    public User i;
    public boolean j;
    private int k;
    private final Context m;
    public ArrayList<Object> g = new ArrayList<>();

    /* renamed from: o */
    private int f86o = 1;

    /* loaded from: classes-dex2jar.jar:o/FormReservasiUbahTellerActivity_ViewBinding$IconCompatParcelizer.class */
    public static final class IconCompatParcelizer extends setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable {
        private final ListKotaAdapter$ListKotaAdapterVH_ViewBinding q;
        private final Context t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IconCompatParcelizer(Context context, ListKotaAdapter$ListKotaAdapterVH_ViewBinding listKotaAdapter$ListKotaAdapterVH_ViewBinding) {
            super(listKotaAdapter$ListKotaAdapterVH_ViewBinding.d);
            subscribeReservationRescheduleEvent.e(context, "");
            subscribeReservationRescheduleEvent.e(listKotaAdapter$ListKotaAdapterVH_ViewBinding, "");
            this.t = context;
            this.q = listKotaAdapter$ListKotaAdapterVH_ViewBinding;
        }
    }

    /* loaded from: classes-dex2jar.jar:o/FormReservasiUbahTellerActivity_ViewBinding$RemoteActionCompatParcelizer.class */
    public static final class RemoteActionCompatParcelizer extends setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable {
        boolean q;
        final Context t;
        final ListKotaAdapter$ListKotaAdapterVH u;
        public KliringTemp w;

        /* loaded from: classes-dex2jar.jar:o/FormReservasiUbahTellerActivity_ViewBinding$RemoteActionCompatParcelizer$IconCompatParcelizer.class */
        public static final class IconCompatParcelizer implements TextWatcher {
            public IconCompatParcelizer() {
                RemoteActionCompatParcelizer.this = r4;
            }

            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver formReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver = FormReservasiUbahTellerActivity_ViewBinding.e;
                Context context = RemoteActionCompatParcelizer.this.t;
                LogoutDialog_ViewBinding logoutDialog_ViewBinding = RemoteActionCompatParcelizer.this.u.F;
                subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding, "");
                FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.a(context, logoutDialog_ViewBinding);
                RemoteActionCompatParcelizer.this.u.F.setBackgroundResource(2131230847);
                TextView textView = RemoteActionCompatParcelizer.this.u.P;
                subscribeReservationRescheduleEvent.d(textView, "");
                textView.setVisibility(8);
                FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver formReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver2 = FormReservasiUbahTellerActivity_ViewBinding.e;
                String valueOf = String.valueOf(editable);
                subscribeReservationRescheduleEvent.e("nomorHandphone", "");
                documentProvider.b().d(new onChooseCameraEvent("nomorHandphone", valueOf));
            }

            @Override // android.text.TextWatcher
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        }

        /* loaded from: classes-dex2jar.jar:o/FormReservasiUbahTellerActivity_ViewBinding$RemoteActionCompatParcelizer$MediaDescriptionCompat.class */
        public static final class MediaDescriptionCompat extends getIncomeAmount {
            MediaDescriptionCompat() {
                RemoteActionCompatParcelizer.this = r4;
            }

            @Override // o.getIncomeAmount
            public final void b(View view) {
                FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver formReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver = FormReservasiUbahTellerActivity_ViewBinding.e;
                Context context = RemoteActionCompatParcelizer.this.t;
                LogoutDialog_ViewBinding logoutDialog_ViewBinding = RemoteActionCompatParcelizer.this.u.C;
                subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding, "");
                FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.a(context, logoutDialog_ViewBinding);
                RemoteActionCompatParcelizer.this.u.C.setBackgroundResource(2131230847);
                TextView textView = RemoteActionCompatParcelizer.this.u.R;
                subscribeReservationRescheduleEvent.d(textView, "");
                textView.setVisibility(8);
                FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver formReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver2 = FormReservasiUbahTellerActivity_ViewBinding.e;
                String obj = RemoteActionCompatParcelizer.this.u.s.getText().toString();
                subscribeReservationRescheduleEvent.e("tanggalJatuhTempo", "");
                documentProvider.b().d(new onChooseCameraEvent("tanggalJatuhTempo", obj));
            }
        }

        /* loaded from: classes-dex2jar.jar:o/FormReservasiUbahTellerActivity_ViewBinding$RemoteActionCompatParcelizer$MediaMetadataCompat.class */
        public static final class MediaMetadataCompat extends getIncomeAmount {
            MediaMetadataCompat() {
                RemoteActionCompatParcelizer.this = r4;
            }

            @Override // o.getIncomeAmount
            public final void b(View view) {
                FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver formReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver = FormReservasiUbahTellerActivity_ViewBinding.e;
                Context context = RemoteActionCompatParcelizer.this.t;
                LogoutDialog_ViewBinding logoutDialog_ViewBinding = RemoteActionCompatParcelizer.this.u.E;
                subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding, "");
                FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.a(context, logoutDialog_ViewBinding);
                RemoteActionCompatParcelizer.this.u.E.setBackgroundResource(2131230847);
                TextView textView = RemoteActionCompatParcelizer.this.u.W;
                subscribeReservationRescheduleEvent.d(textView, "");
                textView.setVisibility(8);
                FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver formReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver2 = FormReservasiUbahTellerActivity_ViewBinding.e;
                String obj = RemoteActionCompatParcelizer.this.u.t.getText().toString();
                subscribeReservationRescheduleEvent.e("tujuanTransaksi", "");
                documentProvider.b().d(new onChooseCameraEvent("tujuanTransaksi", obj));
            }
        }

        /* renamed from: o.FormReservasiUbahTellerActivity_ViewBinding$RemoteActionCompatParcelizer$RemoteActionCompatParcelizer */
        /* loaded from: classes-dex2jar.jar:o/FormReservasiUbahTellerActivity_ViewBinding$RemoteActionCompatParcelizer$RemoteActionCompatParcelizer.class */
        public static final class C0001RemoteActionCompatParcelizer implements TextWatcher {
            public C0001RemoteActionCompatParcelizer() {
                RemoteActionCompatParcelizer.this = r4;
            }

            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver formReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver = FormReservasiUbahTellerActivity_ViewBinding.e;
                Context context = RemoteActionCompatParcelizer.this.t;
                LogoutDialog_ViewBinding logoutDialog_ViewBinding = RemoteActionCompatParcelizer.this.u.I;
                subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding, "");
                FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.a(context, logoutDialog_ViewBinding);
                RemoteActionCompatParcelizer.this.u.I.setBackgroundResource(2131230847);
                TextView textView = RemoteActionCompatParcelizer.this.u.X;
                subscribeReservationRescheduleEvent.d(textView, "");
                textView.setVisibility(8);
                FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver formReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver2 = FormReservasiUbahTellerActivity_ViewBinding.e;
                String valueOf = String.valueOf(editable);
                subscribeReservationRescheduleEvent.e("penerimaDana", "");
                documentProvider.b().d(new onChooseCameraEvent("penerimaDana", valueOf));
            }

            @Override // android.text.TextWatcher
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        }

        /* loaded from: classes-dex2jar.jar:o/FormReservasiUbahTellerActivity_ViewBinding$RemoteActionCompatParcelizer$read.class */
        public static final class read implements TextWatcher {
            public read() {
                RemoteActionCompatParcelizer.this = r4;
            }

            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver formReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver = FormReservasiUbahTellerActivity_ViewBinding.e;
                Context context = RemoteActionCompatParcelizer.this.t;
                LogoutDialog_ViewBinding logoutDialog_ViewBinding = RemoteActionCompatParcelizer.this.u.z;
                subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding, "");
                FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.a(context, logoutDialog_ViewBinding);
                RemoteActionCompatParcelizer.this.u.z.setBackgroundResource(2131230847);
                TextView textView = RemoteActionCompatParcelizer.this.u.L;
                subscribeReservationRescheduleEvent.d(textView, "");
                textView.setVisibility(8);
                FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver formReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver2 = FormReservasiUbahTellerActivity_ViewBinding.e;
                String valueOf = String.valueOf(editable);
                subscribeReservationRescheduleEvent.e("nomorRekening", "");
                documentProvider.b().d(new onChooseCameraEvent("nomorRekening", valueOf));
            }

            @Override // android.text.TextWatcher
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        }

        /* loaded from: classes-dex2jar.jar:o/FormReservasiUbahTellerActivity_ViewBinding$RemoteActionCompatParcelizer$write.class */
        public static final class write implements TextWatcher {
            public write() {
                RemoteActionCompatParcelizer.this = r4;
            }

            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver formReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver = FormReservasiUbahTellerActivity_ViewBinding.e;
                Context context = RemoteActionCompatParcelizer.this.t;
                LogoutDialog_ViewBinding logoutDialog_ViewBinding = RemoteActionCompatParcelizer.this.u.B;
                subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding, "");
                FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.a(context, logoutDialog_ViewBinding);
                RemoteActionCompatParcelizer.this.u.B.setBackgroundResource(2131230847);
                TextView textView = RemoteActionCompatParcelizer.this.u.O;
                subscribeReservationRescheduleEvent.d(textView, "");
                textView.setVisibility(8);
                FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver formReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver2 = FormReservasiUbahTellerActivity_ViewBinding.e;
                String valueOf = String.valueOf(editable);
                subscribeReservationRescheduleEvent.e("kodeNegara", "");
                documentProvider.b().d(new onChooseCameraEvent("kodeNegara", valueOf));
            }

            @Override // android.text.TextWatcher
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RemoteActionCompatParcelizer(Context context, ListKotaAdapter$ListKotaAdapterVH listKotaAdapter$ListKotaAdapterVH) {
            super(listKotaAdapter$ListKotaAdapterVH.v);
            subscribeReservationRescheduleEvent.e(context, "");
            subscribeReservationRescheduleEvent.e(listKotaAdapter$ListKotaAdapterVH, "");
            this.t = context;
            this.u = listKotaAdapter$ListKotaAdapterVH;
            documentProvider.b().c(this);
        }

        public static /* synthetic */ void b(RemoteActionCompatParcelizer remoteActionCompatParcelizer, User user, boolean z, boolean z2, View view) {
            subscribeReservationRescheduleEvent.e(remoteActionCompatParcelizer, "");
            remoteActionCompatParcelizer.q = true;
            setTypeface settypeface = remoteActionCompatParcelizer.u.n;
            subscribeReservationRescheduleEvent.d(settypeface, "");
            settypeface.setVisibility(8);
            remoteActionCompatParcelizer.u.y.setExpanded(true, true);
            remoteActionCompatParcelizer.c(user, z, z2);
        }

        private final void c(User user, boolean z, boolean z2) {
            Space space = this.u.w;
            subscribeReservationRescheduleEvent.d(space, "");
            space.setVisibility(0);
            FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver formReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver = FormReservasiUbahTellerActivity_ViewBinding.e;
            LogoutDialog_ViewBinding logoutDialog_ViewBinding = this.u.z;
            subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding, "");
            LinearLayout linearLayout = this.u.d;
            subscribeReservationRescheduleEvent.d(linearLayout, "");
            FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.b(logoutDialog_ViewBinding, linearLayout, true);
            FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver formReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver2 = FormReservasiUbahTellerActivity_ViewBinding.e;
            LogoutDialog_ViewBinding logoutDialog_ViewBinding2 = this.u.B;
            subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding2, "");
            LinearLayout linearLayout2 = this.u.e;
            subscribeReservationRescheduleEvent.d(linearLayout2, "");
            FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.b(logoutDialog_ViewBinding2, linearLayout2, true);
            FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver formReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver3 = FormReservasiUbahTellerActivity_ViewBinding.e;
            LogoutDialog_ViewBinding logoutDialog_ViewBinding3 = this.u.F;
            subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding3, "");
            LinearLayout linearLayout3 = this.u.h;
            subscribeReservationRescheduleEvent.d(linearLayout3, "");
            FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.b(logoutDialog_ViewBinding3, linearLayout3, true);
            FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver formReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver4 = FormReservasiUbahTellerActivity_ViewBinding.e;
            LogoutDialog_ViewBinding logoutDialog_ViewBinding4 = this.u.C;
            subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding4, "");
            LinearLayout linearLayout4 = this.u.c;
            subscribeReservationRescheduleEvent.d(linearLayout4, "");
            FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.b(logoutDialog_ViewBinding4, linearLayout4, true);
            FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver formReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver5 = FormReservasiUbahTellerActivity_ViewBinding.e;
            LogoutDialog_ViewBinding logoutDialog_ViewBinding5 = this.u.A;
            subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding5, "");
            LinearLayout linearLayout5 = this.u.a;
            subscribeReservationRescheduleEvent.d(linearLayout5, "");
            FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.b(logoutDialog_ViewBinding5, linearLayout5, true);
            FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver formReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver6 = FormReservasiUbahTellerActivity_ViewBinding.e;
            LogoutDialog_ViewBinding logoutDialog_ViewBinding6 = this.u.G;
            subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding6, "");
            LinearLayout linearLayout6 = this.u.j;
            subscribeReservationRescheduleEvent.d(linearLayout6, "");
            FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.b(logoutDialog_ViewBinding6, linearLayout6, true);
            FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver formReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver7 = FormReservasiUbahTellerActivity_ViewBinding.e;
            LogoutDialog_ViewBinding logoutDialog_ViewBinding7 = this.u.E;
            subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding7, "");
            LinearLayout linearLayout7 = this.u.g;
            subscribeReservationRescheduleEvent.d(linearLayout7, "");
            FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.b(logoutDialog_ViewBinding7, linearLayout7, true);
            LinearLayout linearLayout8 = this.u.i;
            subscribeReservationRescheduleEvent.d(linearLayout8, "");
            linearLayout8.setVisibility(8);
            FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver formReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver8 = FormReservasiUbahTellerActivity_ViewBinding.e;
            Context context = this.t;
            LogoutDialog_ViewBinding logoutDialog_ViewBinding8 = this.u.D;
            subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding8, "");
            EditText editText = this.u.f117o;
            subscribeReservationRescheduleEvent.d(editText, "");
            FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.e(context, logoutDialog_ViewBinding8, editText, true, false);
            FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver formReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver9 = FormReservasiUbahTellerActivity_ViewBinding.e;
            LogoutDialog_ViewBinding logoutDialog_ViewBinding9 = this.u.D;
            subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding9, "");
            LinearLayout linearLayout9 = this.u.b;
            subscribeReservationRescheduleEvent.d(linearLayout9, "");
            FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.b(logoutDialog_ViewBinding9, linearLayout9, true);
            FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver formReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver10 = FormReservasiUbahTellerActivity_ViewBinding.e;
            Context context2 = this.t;
            LogoutDialog_ViewBinding logoutDialog_ViewBinding10 = this.u.I;
            subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding10, "");
            EditText editText2 = this.u.r;
            subscribeReservationRescheduleEvent.d(editText2, "");
            FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.e(context2, logoutDialog_ViewBinding10, editText2, true, true);
            FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver formReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver11 = FormReservasiUbahTellerActivity_ViewBinding.e;
            LogoutDialog_ViewBinding logoutDialog_ViewBinding11 = this.u.I;
            subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding11, "");
            LinearLayout linearLayout10 = this.u.f;
            subscribeReservationRescheduleEvent.d(linearLayout10, "");
            FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.b(logoutDialog_ViewBinding11, linearLayout10, true);
            FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver formReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver12 = FormReservasiUbahTellerActivity_ViewBinding.e;
            Context context3 = this.t;
            LogoutDialog_ViewBinding logoutDialog_ViewBinding12 = this.u.z;
            subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding12, "");
            EditText editText3 = this.u.l;
            subscribeReservationRescheduleEvent.d(editText3, "");
            FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.e(context3, logoutDialog_ViewBinding12, editText3, true, true);
            FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver formReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver13 = FormReservasiUbahTellerActivity_ViewBinding.e;
            Context context4 = this.t;
            LogoutDialog_ViewBinding logoutDialog_ViewBinding13 = this.u.B;
            subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding13, "");
            EditText editText4 = this.u.m;
            subscribeReservationRescheduleEvent.d(editText4, "");
            FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.e(context4, logoutDialog_ViewBinding13, editText4, true, true);
            FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver formReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver14 = FormReservasiUbahTellerActivity_ViewBinding.e;
            Context context5 = this.t;
            LogoutDialog_ViewBinding logoutDialog_ViewBinding14 = this.u.F;
            subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding14, "");
            EditText editText5 = this.u.p;
            subscribeReservationRescheduleEvent.d(editText5, "");
            FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.e(context5, logoutDialog_ViewBinding14, editText5, true, true);
            FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver formReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver15 = FormReservasiUbahTellerActivity_ViewBinding.e;
            Context context6 = this.t;
            LogoutDialog_ViewBinding logoutDialog_ViewBinding15 = this.u.C;
            subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding15, "");
            EditText editText6 = this.u.s;
            subscribeReservationRescheduleEvent.d(editText6, "");
            FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.e(context6, logoutDialog_ViewBinding15, editText6, true, false);
            FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver formReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver16 = FormReservasiUbahTellerActivity_ViewBinding.e;
            Context context7 = this.t;
            LogoutDialog_ViewBinding logoutDialog_ViewBinding16 = this.u.A;
            subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding16, "");
            EditText editText7 = this.u.k;
            subscribeReservationRescheduleEvent.d(editText7, "");
            FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.e(context7, logoutDialog_ViewBinding16, editText7, true, true);
            FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver formReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver17 = FormReservasiUbahTellerActivity_ViewBinding.e;
            Context context8 = this.t;
            LogoutDialog_ViewBinding logoutDialog_ViewBinding17 = this.u.G;
            subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding17, "");
            EditText editText8 = this.u.q;
            subscribeReservationRescheduleEvent.d(editText8, "");
            FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.e(context8, logoutDialog_ViewBinding17, editText8, true, false);
            FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver formReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver18 = FormReservasiUbahTellerActivity_ViewBinding.e;
            Context context9 = this.t;
            LogoutDialog_ViewBinding logoutDialog_ViewBinding18 = this.u.E;
            subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding18, "");
            EditText editText9 = this.u.t;
            subscribeReservationRescheduleEvent.d(editText9, "");
            FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.e(context9, logoutDialog_ViewBinding18, editText9, true, false);
            FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver formReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver19 = FormReservasiUbahTellerActivity_ViewBinding.e;
            EditText editText10 = this.u.l;
            subscribeReservationRescheduleEvent.d(editText10, "");
            FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.d(user, editText10);
            if (z || z2) {
                FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver formReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver20 = FormReservasiUbahTellerActivity_ViewBinding.e;
                Context context10 = this.t;
                LogoutDialog_ViewBinding logoutDialog_ViewBinding19 = this.u.D;
                subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding19, "");
                FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.d(context10, logoutDialog_ViewBinding19);
                FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver formReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver21 = FormReservasiUbahTellerActivity_ViewBinding.e;
                Context context11 = this.t;
                LogoutDialog_ViewBinding logoutDialog_ViewBinding20 = this.u.I;
                subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding20, "");
                FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.d(context11, logoutDialog_ViewBinding20);
            }
        }

        public static /* synthetic */ void e(RemoteActionCompatParcelizer remoteActionCompatParcelizer, User user, boolean z, boolean z2, setMessage setmessage, View view) {
            subscribeReservationRescheduleEvent.e(remoteActionCompatParcelizer, "");
            subscribeReservationRescheduleEvent.e(setmessage, "");
            if (remoteActionCompatParcelizer.q) {
                remoteActionCompatParcelizer.c(user, z, z2);
            } else {
                Space space = remoteActionCompatParcelizer.u.w;
                subscribeReservationRescheduleEvent.d(space, "");
                space.setVisibility(8);
                FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver formReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver = FormReservasiUbahTellerActivity_ViewBinding.e;
                LogoutDialog_ViewBinding logoutDialog_ViewBinding = remoteActionCompatParcelizer.u.I;
                subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding, "");
                LinearLayout linearLayout = remoteActionCompatParcelizer.u.f;
                subscribeReservationRescheduleEvent.d(linearLayout, "");
                FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.b(logoutDialog_ViewBinding, linearLayout, false);
                FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver formReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver2 = FormReservasiUbahTellerActivity_ViewBinding.e;
                LogoutDialog_ViewBinding logoutDialog_ViewBinding2 = remoteActionCompatParcelizer.u.z;
                subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding2, "");
                LinearLayout linearLayout2 = remoteActionCompatParcelizer.u.d;
                subscribeReservationRescheduleEvent.d(linearLayout2, "");
                FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.b(logoutDialog_ViewBinding2, linearLayout2, false);
                FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver formReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver3 = FormReservasiUbahTellerActivity_ViewBinding.e;
                LogoutDialog_ViewBinding logoutDialog_ViewBinding3 = remoteActionCompatParcelizer.u.B;
                subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding3, "");
                LinearLayout linearLayout3 = remoteActionCompatParcelizer.u.e;
                subscribeReservationRescheduleEvent.d(linearLayout3, "");
                FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.b(logoutDialog_ViewBinding3, linearLayout3, false);
                FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver formReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver4 = FormReservasiUbahTellerActivity_ViewBinding.e;
                LogoutDialog_ViewBinding logoutDialog_ViewBinding4 = remoteActionCompatParcelizer.u.F;
                subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding4, "");
                LinearLayout linearLayout4 = remoteActionCompatParcelizer.u.h;
                subscribeReservationRescheduleEvent.d(linearLayout4, "");
                FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.b(logoutDialog_ViewBinding4, linearLayout4, false);
                FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver formReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver5 = FormReservasiUbahTellerActivity_ViewBinding.e;
                LogoutDialog_ViewBinding logoutDialog_ViewBinding5 = remoteActionCompatParcelizer.u.C;
                subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding5, "");
                LinearLayout linearLayout5 = remoteActionCompatParcelizer.u.c;
                subscribeReservationRescheduleEvent.d(linearLayout5, "");
                FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.b(logoutDialog_ViewBinding5, linearLayout5, false);
                FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver formReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver6 = FormReservasiUbahTellerActivity_ViewBinding.e;
                LogoutDialog_ViewBinding logoutDialog_ViewBinding6 = remoteActionCompatParcelizer.u.A;
                subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding6, "");
                LinearLayout linearLayout6 = remoteActionCompatParcelizer.u.a;
                subscribeReservationRescheduleEvent.d(linearLayout6, "");
                FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.b(logoutDialog_ViewBinding6, linearLayout6, false);
                FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver formReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver7 = FormReservasiUbahTellerActivity_ViewBinding.e;
                LogoutDialog_ViewBinding logoutDialog_ViewBinding7 = remoteActionCompatParcelizer.u.D;
                subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding7, "");
                LinearLayout linearLayout7 = remoteActionCompatParcelizer.u.b;
                subscribeReservationRescheduleEvent.d(linearLayout7, "");
                FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.b(logoutDialog_ViewBinding7, linearLayout7, false);
                FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver formReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver8 = FormReservasiUbahTellerActivity_ViewBinding.e;
                LogoutDialog_ViewBinding logoutDialog_ViewBinding8 = remoteActionCompatParcelizer.u.G;
                subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding8, "");
                LinearLayout linearLayout8 = remoteActionCompatParcelizer.u.j;
                subscribeReservationRescheduleEvent.d(linearLayout8, "");
                FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.b(logoutDialog_ViewBinding8, linearLayout8, false);
                FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver formReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver9 = FormReservasiUbahTellerActivity_ViewBinding.e;
                LogoutDialog_ViewBinding logoutDialog_ViewBinding9 = remoteActionCompatParcelizer.u.E;
                subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding9, "");
                LinearLayout linearLayout9 = remoteActionCompatParcelizer.u.g;
                subscribeReservationRescheduleEvent.d(linearLayout9, "");
                FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.b(logoutDialog_ViewBinding9, linearLayout9, false);
                LinearLayout linearLayout10 = remoteActionCompatParcelizer.u.i;
                subscribeReservationRescheduleEvent.d(linearLayout10, "");
                linearLayout10.setVisibility(0);
                FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver formReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver10 = FormReservasiUbahTellerActivity_ViewBinding.e;
                Context context = remoteActionCompatParcelizer.t;
                LogoutDialog_ViewBinding logoutDialog_ViewBinding10 = remoteActionCompatParcelizer.u.I;
                subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding10, "");
                EditText editText = remoteActionCompatParcelizer.u.r;
                subscribeReservationRescheduleEvent.d(editText, "");
                FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.e(context, logoutDialog_ViewBinding10, editText, false, true);
                FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver formReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver11 = FormReservasiUbahTellerActivity_ViewBinding.e;
                Context context2 = remoteActionCompatParcelizer.t;
                LogoutDialog_ViewBinding logoutDialog_ViewBinding11 = remoteActionCompatParcelizer.u.z;
                subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding11, "");
                EditText editText2 = remoteActionCompatParcelizer.u.l;
                subscribeReservationRescheduleEvent.d(editText2, "");
                FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.e(context2, logoutDialog_ViewBinding11, editText2, false, true);
                FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver formReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver12 = FormReservasiUbahTellerActivity_ViewBinding.e;
                Context context3 = remoteActionCompatParcelizer.t;
                LogoutDialog_ViewBinding logoutDialog_ViewBinding12 = remoteActionCompatParcelizer.u.B;
                subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding12, "");
                EditText editText3 = remoteActionCompatParcelizer.u.m;
                subscribeReservationRescheduleEvent.d(editText3, "");
                FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.e(context3, logoutDialog_ViewBinding12, editText3, false, true);
                FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver formReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver13 = FormReservasiUbahTellerActivity_ViewBinding.e;
                Context context4 = remoteActionCompatParcelizer.t;
                LogoutDialog_ViewBinding logoutDialog_ViewBinding13 = remoteActionCompatParcelizer.u.F;
                subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding13, "");
                EditText editText4 = remoteActionCompatParcelizer.u.p;
                subscribeReservationRescheduleEvent.d(editText4, "");
                FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.e(context4, logoutDialog_ViewBinding13, editText4, false, true);
                FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver formReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver14 = FormReservasiUbahTellerActivity_ViewBinding.e;
                Context context5 = remoteActionCompatParcelizer.t;
                LogoutDialog_ViewBinding logoutDialog_ViewBinding14 = remoteActionCompatParcelizer.u.C;
                subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding14, "");
                EditText editText5 = remoteActionCompatParcelizer.u.s;
                subscribeReservationRescheduleEvent.d(editText5, "");
                FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.e(context5, logoutDialog_ViewBinding14, editText5, false, false);
                FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver formReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver15 = FormReservasiUbahTellerActivity_ViewBinding.e;
                Context context6 = remoteActionCompatParcelizer.t;
                LogoutDialog_ViewBinding logoutDialog_ViewBinding15 = remoteActionCompatParcelizer.u.A;
                subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding15, "");
                EditText editText6 = remoteActionCompatParcelizer.u.k;
                subscribeReservationRescheduleEvent.d(editText6, "");
                FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.e(context6, logoutDialog_ViewBinding15, editText6, false, true);
                FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver formReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver16 = FormReservasiUbahTellerActivity_ViewBinding.e;
                Context context7 = remoteActionCompatParcelizer.t;
                LogoutDialog_ViewBinding logoutDialog_ViewBinding16 = remoteActionCompatParcelizer.u.D;
                subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding16, "");
                EditText editText7 = remoteActionCompatParcelizer.u.f117o;
                subscribeReservationRescheduleEvent.d(editText7, "");
                FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.e(context7, logoutDialog_ViewBinding16, editText7, false, false);
                FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver formReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver17 = FormReservasiUbahTellerActivity_ViewBinding.e;
                Context context8 = remoteActionCompatParcelizer.t;
                LogoutDialog_ViewBinding logoutDialog_ViewBinding17 = remoteActionCompatParcelizer.u.G;
                subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding17, "");
                EditText editText8 = remoteActionCompatParcelizer.u.q;
                subscribeReservationRescheduleEvent.d(editText8, "");
                FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.e(context8, logoutDialog_ViewBinding17, editText8, false, false);
                FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver formReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver18 = FormReservasiUbahTellerActivity_ViewBinding.e;
                Context context9 = remoteActionCompatParcelizer.t;
                LogoutDialog_ViewBinding logoutDialog_ViewBinding18 = remoteActionCompatParcelizer.u.E;
                subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding18, "");
                EditText editText9 = remoteActionCompatParcelizer.u.t;
                subscribeReservationRescheduleEvent.d(editText9, "");
                FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.e(context9, logoutDialog_ViewBinding18, editText9, false, false);
            }
            int i = remoteActionCompatParcelizer.u.y.b;
            if (!(i == 2 || i == 3)) {
                setmessage.c = new RotateAnimation(0.0f, -180.0f, 1, 0.5f, 1, 0.5f);
                setmessage.e(remoteActionCompatParcelizer.u.x);
                remoteActionCompatParcelizer.u.y.setExpanded(true, true);
                return;
            }
            setmessage.c = new RotateAnimation(-180.0f, 0.0f, 1, 0.5f, 1, 0.5f);
            setmessage.e(remoteActionCompatParcelizer.u.x);
            remoteActionCompatParcelizer.u.y.setExpanded(false, true);
        }

        @Stetho$Initializer$RealSocketHandlerFactory
        public final void onConfirmationFormReset(togglePINLama togglepinlama) {
            subscribeReservationRescheduleEvent.e(togglepinlama, "");
            String str = togglepinlama.a;
            switch (str.hashCode()) {
                case -1843639952:
                    if (str.equals("nomorHandphone")) {
                        this.u.F.setBackgroundResource(2131230870);
                        TextView textView = this.u.P;
                        subscribeReservationRescheduleEvent.d(textView, "");
                        textView.setVisibility(0);
                        this.u.P.setText(togglepinlama.b);
                        FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver formReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver = FormReservasiUbahTellerActivity_ViewBinding.e;
                        Context context = this.t;
                        LogoutDialog_ViewBinding logoutDialog_ViewBinding = this.u.F;
                        subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding, "");
                        FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.a(context, logoutDialog_ViewBinding);
                        return;
                    }
                    return;
                case -1544141433:
                    if (str.equals("beritaAcara")) {
                        FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver formReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver2 = FormReservasiUbahTellerActivity_ViewBinding.e;
                        Context context2 = this.t;
                        LogoutDialog_ViewBinding logoutDialog_ViewBinding2 = this.u.A;
                        subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding2, "");
                        FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.a(context2, logoutDialog_ViewBinding2);
                        return;
                    }
                    return;
                case -1375230092:
                    if (str.equals("sumberDana")) {
                        this.u.G.setBackgroundResource(2131230870);
                        TextView textView2 = this.u.S;
                        subscribeReservationRescheduleEvent.d(textView2, "");
                        textView2.setVisibility(0);
                        this.u.S.setText(togglepinlama.b);
                        FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver formReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver3 = FormReservasiUbahTellerActivity_ViewBinding.e;
                        Context context3 = this.t;
                        LogoutDialog_ViewBinding logoutDialog_ViewBinding3 = this.u.G;
                        subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding3, "");
                        FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.a(context3, logoutDialog_ViewBinding3);
                        return;
                    }
                    return;
                case -1035071941:
                    if (str.equals("sumberDanaReset")) {
                        EditText editText = this.u.G.f;
                        if (editText != null) {
                            editText.setText(togglepinlama.c);
                        }
                        this.u.G.setBackgroundResource(2131230847);
                        TextView textView3 = this.u.S;
                        subscribeReservationRescheduleEvent.d(textView3, "");
                        textView3.setVisibility(8);
                        FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver formReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver4 = FormReservasiUbahTellerActivity_ViewBinding.e;
                        Context context4 = this.t;
                        LogoutDialog_ViewBinding logoutDialog_ViewBinding4 = this.u.G;
                        subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding4, "");
                        FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.a(context4, logoutDialog_ViewBinding4);
                        return;
                    }
                    return;
                case -769765537:
                    if (str.equals("nomorRekeningReset")) {
                        EditText editText2 = this.u.z.f;
                        if (editText2 != null) {
                            editText2.setText(togglepinlama.c);
                        }
                        FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver formReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver5 = FormReservasiUbahTellerActivity_ViewBinding.e;
                        Context context5 = this.t;
                        LogoutDialog_ViewBinding logoutDialog_ViewBinding5 = this.u.z;
                        subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding5, "");
                        FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.a(context5, logoutDialog_ViewBinding5);
                        this.u.z.setBackgroundResource(2131230847);
                        TextView textView4 = this.u.L;
                        subscribeReservationRescheduleEvent.d(textView4, "");
                        textView4.setVisibility(8);
                        return;
                    }
                    return;
                case -202009385:
                    if (str.equals("tanggalJatuhTempo")) {
                        this.u.C.setBackgroundResource(2131230870);
                        TextView textView5 = this.u.R;
                        subscribeReservationRescheduleEvent.d(textView5, "");
                        textView5.setVisibility(0);
                        this.u.R.setText(togglepinlama.b);
                        FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver formReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver6 = FormReservasiUbahTellerActivity_ViewBinding.e;
                        Context context6 = this.t;
                        LogoutDialog_ViewBinding logoutDialog_ViewBinding6 = this.u.C;
                        subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding6, "");
                        FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.a(context6, logoutDialog_ViewBinding6);
                        return;
                    }
                    return;
                case 190070736:
                    if (str.equals("nomorRekening")) {
                        this.u.z.setBackgroundResource(2131230870);
                        TextView textView6 = this.u.L;
                        subscribeReservationRescheduleEvent.d(textView6, "");
                        textView6.setVisibility(0);
                        this.u.L.setText(togglepinlama.b);
                        FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver formReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver7 = FormReservasiUbahTellerActivity_ViewBinding.e;
                        Context context7 = this.t;
                        LogoutDialog_ViewBinding logoutDialog_ViewBinding7 = this.u.z;
                        subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding7, "");
                        FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.a(context7, logoutDialog_ViewBinding7);
                        return;
                    }
                    return;
                case 790606161:
                    if (str.equals("tipeNasabahReset")) {
                        EditText editText3 = this.u.D.f;
                        if (editText3 != null) {
                            editText3.setText(togglepinlama.c);
                        }
                        this.u.D.setBackgroundResource(2131230847);
                        TextView textView7 = this.u.Q;
                        subscribeReservationRescheduleEvent.d(textView7, "");
                        textView7.setVisibility(8);
                        FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver formReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver8 = FormReservasiUbahTellerActivity_ViewBinding.e;
                        Context context8 = this.t;
                        LogoutDialog_ViewBinding logoutDialog_ViewBinding8 = this.u.D;
                        subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding8, "");
                        FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.a(context8, logoutDialog_ViewBinding8);
                        EditText editText4 = this.u.G.f;
                        if (editText4 != null) {
                            editText4.setText((CharSequence) null);
                        }
                        this.u.G.setBackgroundResource(2131230847);
                        TextView textView8 = this.u.S;
                        subscribeReservationRescheduleEvent.d(textView8, "");
                        textView8.setVisibility(8);
                        FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver formReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver9 = FormReservasiUbahTellerActivity_ViewBinding.e;
                        Context context9 = this.t;
                        LogoutDialog_ViewBinding logoutDialog_ViewBinding9 = this.u.G;
                        subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding9, "");
                        FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.a(context9, logoutDialog_ViewBinding9);
                        return;
                    }
                    return;
                case 1039926968:
                    if (str.equals("tanggalJatuhTempoReset")) {
                        EditText editText5 = this.u.C.f;
                        if (editText5 != null) {
                            editText5.setText(getAnnualFeeBasicAmount.b(togglepinlama.c));
                        }
                        FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver formReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver10 = FormReservasiUbahTellerActivity_ViewBinding.e;
                        Context context10 = this.t;
                        LogoutDialog_ViewBinding logoutDialog_ViewBinding10 = this.u.C;
                        subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding10, "");
                        FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.a(context10, logoutDialog_ViewBinding10);
                        this.u.C.setBackgroundResource(2131230847);
                        TextView textView9 = this.u.R;
                        subscribeReservationRescheduleEvent.d(textView9, "");
                        textView9.setVisibility(8);
                        return;
                    }
                    return;
                case 1185748487:
                    if (str.equals("penerimaDana")) {
                        this.u.I.setBackgroundResource(2131230870);
                        TextView textView10 = this.u.X;
                        subscribeReservationRescheduleEvent.d(textView10, "");
                        textView10.setVisibility(0);
                        this.u.X.setText(togglepinlama.b);
                        FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver formReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver11 = FormReservasiUbahTellerActivity_ViewBinding.e;
                        Context context11 = this.t;
                        LogoutDialog_ViewBinding logoutDialog_ViewBinding11 = this.u.I;
                        subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding11, "");
                        FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.a(context11, logoutDialog_ViewBinding11);
                        return;
                    }
                    return;
                case 1303768734:
                    if (str.equals("tipeNasabah")) {
                        this.u.D.setBackgroundResource(2131230870);
                        TextView textView11 = this.u.Q;
                        subscribeReservationRescheduleEvent.d(textView11, "");
                        textView11.setVisibility(0);
                        this.u.Q.setText(togglepinlama.b);
                        FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver formReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver12 = FormReservasiUbahTellerActivity_ViewBinding.e;
                        Context context12 = this.t;
                        LogoutDialog_ViewBinding logoutDialog_ViewBinding12 = this.u.D;
                        subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding12, "");
                        FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.a(context12, logoutDialog_ViewBinding12);
                        return;
                    }
                    return;
                case 1352605167:
                    if (str.equals("tujuanTransaksi")) {
                        this.u.E.setBackgroundResource(2131230870);
                        TextView textView12 = this.u.W;
                        subscribeReservationRescheduleEvent.d(textView12, "");
                        textView12.setVisibility(0);
                        this.u.W.setText(togglepinlama.b);
                        FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver formReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver13 = FormReservasiUbahTellerActivity_ViewBinding.e;
                        Context context13 = this.t;
                        LogoutDialog_ViewBinding logoutDialog_ViewBinding13 = this.u.E;
                        subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding13, "");
                        FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.a(context13, logoutDialog_ViewBinding13);
                        return;
                    }
                    return;
                case 1406430368:
                    if (str.equals("tujuanTransaksiReset")) {
                        EditText editText6 = this.u.E.f;
                        if (editText6 != null) {
                            editText6.setText(togglepinlama.c);
                        }
                        this.u.E.setBackgroundResource(2131230847);
                        TextView textView13 = this.u.W;
                        subscribeReservationRescheduleEvent.d(textView13, "");
                        textView13.setVisibility(8);
                        FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver formReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver14 = FormReservasiUbahTellerActivity_ViewBinding.e;
                        Context context14 = this.t;
                        LogoutDialog_ViewBinding logoutDialog_ViewBinding14 = this.u.E;
                        subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding14, "");
                        FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.a(context14, logoutDialog_ViewBinding14);
                        return;
                    }
                    return;
                case 1644356613:
                    if (str.equals("kodeNegara")) {
                        this.u.B.setBackgroundResource(2131230870);
                        TextView textView14 = this.u.O;
                        subscribeReservationRescheduleEvent.d(textView14, "");
                        textView14.setVisibility(0);
                        this.u.O.setText(togglepinlama.b);
                        FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver formReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver15 = FormReservasiUbahTellerActivity_ViewBinding.e;
                        Context context15 = this.t;
                        LogoutDialog_ViewBinding logoutDialog_ViewBinding15 = this.u.B;
                        subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding15, "");
                        FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.a(context15, logoutDialog_ViewBinding15);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    /* loaded from: classes-dex2jar.jar:o/FormReservasiUbahTellerActivity_ViewBinding$read.class */
    public static final class read extends setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable {
        final Context q;
        int t = -1;
        boolean u;
        final ListNegaraAdapter$ListNegaraAdapterVH x;

        /* loaded from: classes-dex2jar.jar:o/FormReservasiUbahTellerActivity_ViewBinding$read$RemoteActionCompatParcelizer.class */
        public static final class RemoteActionCompatParcelizer extends getIncomeAmount {
            final /* synthetic */ WarkatTemp d;

            RemoteActionCompatParcelizer(WarkatTemp warkatTemp) {
                read.this = r4;
                this.d = warkatTemp;
            }

            @Override // o.getIncomeAmount
            public final void b(View view) {
                EditText editText = read.this.x.l.f;
                if (editText != null) {
                    editText.setHintTextColor(read.this.q.getResources().getColor(2131099731));
                }
                read.this.x.l.setBackgroundResource(2131230847);
                TextView textView = read.this.x.t;
                subscribeReservationRescheduleEvent.d(textView, "");
                textView.setVisibility(8);
                FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver formReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver = FormReservasiUbahTellerActivity_ViewBinding.e;
                String valueOf = String.valueOf(view);
                long j = this.d.a;
                read read = read.this;
                setOnStartEnterTransitionListener setonstartentertransitionlistener = read.h;
                int e = setonstartentertransitionlistener == null ? -1 : setonstartentertransitionlistener.e(read);
                subscribeReservationRescheduleEvent.e("jenisWarkat", "");
                documentProvider.b().d(new AgamaAdapter$AgamaVH(j, e - 1, "jenisWarkat", valueOf));
            }
        }

        /* renamed from: o.FormReservasiUbahTellerActivity_ViewBinding$read$read */
        /* loaded from: classes-dex2jar.jar:o/FormReservasiUbahTellerActivity_ViewBinding$read$read.class */
        public static final class C0002read implements TextWatcher {
            final /* synthetic */ WarkatTemp c;

            public C0002read(WarkatTemp warkatTemp) {
                read.this = r4;
                this.c = warkatTemp;
            }

            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver formReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver = FormReservasiUbahTellerActivity_ViewBinding.e;
                Context context = read.this.q;
                LogoutDialog_ViewBinding logoutDialog_ViewBinding = read.this.x.r;
                subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding, "");
                FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.a(context, logoutDialog_ViewBinding);
                read.this.x.r.setBackgroundResource(2131230847);
                TextView textView = read.this.x.u;
                subscribeReservationRescheduleEvent.d(textView, "");
                textView.setVisibility(8);
                FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver formReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver2 = FormReservasiUbahTellerActivity_ViewBinding.e;
                String valueOf = String.valueOf(editable);
                long j = this.c.a;
                read read = read.this;
                setOnStartEnterTransitionListener setonstartentertransitionlistener = read.h;
                int e = setonstartentertransitionlistener == null ? -1 : setonstartentertransitionlistener.e(read);
                subscribeReservationRescheduleEvent.e("nomorWarkat", "");
                documentProvider.b().d(new AgamaAdapter$AgamaVH(j, e - 1, "nomorWarkat", valueOf));
            }

            @Override // android.text.TextWatcher
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        }

        /* loaded from: classes-dex2jar.jar:o/FormReservasiUbahTellerActivity_ViewBinding$read$write.class */
        public static final class write extends getIncomeAmount {
            final /* synthetic */ WarkatTemp d;

            write(WarkatTemp warkatTemp) {
                read.this = r4;
                this.d = warkatTemp;
            }

            @Override // o.getIncomeAmount
            public final void b(View view) {
                EditText editText = read.this.x.q.f;
                if (editText != null) {
                    editText.setHintTextColor(read.this.q.getResources().getColor(2131099731));
                }
                read.this.x.q.setBackgroundResource(2131230847);
                TextView textView = read.this.x.s;
                subscribeReservationRescheduleEvent.d(textView, "");
                textView.setVisibility(8);
                FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver formReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver = FormReservasiUbahTellerActivity_ViewBinding.e;
                String valueOf = String.valueOf(view);
                long j = this.d.a;
                read read = read.this;
                setOnStartEnterTransitionListener setonstartentertransitionlistener = read.h;
                int e = setonstartentertransitionlistener == null ? -1 : setonstartentertransitionlistener.e(read);
                subscribeReservationRescheduleEvent.e("bankWarkat", "");
                documentProvider.b().d(new AgamaAdapter$AgamaVH(j, e - 1, "bankWarkat", valueOf));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public read(Context context, ListNegaraAdapter$ListNegaraAdapterVH listNegaraAdapter$ListNegaraAdapterVH) {
            super(listNegaraAdapter$ListNegaraAdapterVH.m);
            subscribeReservationRescheduleEvent.e(context, "");
            subscribeReservationRescheduleEvent.e(listNegaraAdapter$ListNegaraAdapterVH, "");
            this.q = context;
            this.x = listNegaraAdapter$ListNegaraAdapterVH;
            documentProvider.b().c(this);
        }

        public static /* synthetic */ void b(read read, WarkatTemp warkatTemp, boolean z, View view) {
            subscribeReservationRescheduleEvent.e(read, "");
            read.u = true;
            setTypeface settypeface = read.x.e;
            subscribeReservationRescheduleEvent.d(settypeface, "");
            settypeface.setVisibility(8);
            read.x.j.setExpanded(true, true);
            read.c(warkatTemp, read.q, z);
        }

        private final void c(WarkatTemp warkatTemp, Context context, boolean z) {
            if (warkatTemp != null) {
                Space space = this.x.k;
                subscribeReservationRescheduleEvent.d(space, "");
                space.setVisibility(0);
                FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver formReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver = FormReservasiUbahTellerActivity_ViewBinding.e;
                LogoutDialog_ViewBinding logoutDialog_ViewBinding = this.x.r;
                subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding, "");
                LinearLayout linearLayout = this.x.b;
                subscribeReservationRescheduleEvent.d(linearLayout, "");
                FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.b(logoutDialog_ViewBinding, linearLayout, true);
                FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver formReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver2 = FormReservasiUbahTellerActivity_ViewBinding.e;
                LogoutDialog_ViewBinding logoutDialog_ViewBinding2 = this.x.q;
                subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding2, "");
                LinearLayout linearLayout2 = this.x.d;
                subscribeReservationRescheduleEvent.d(linearLayout2, "");
                FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.b(logoutDialog_ViewBinding2, linearLayout2, true);
                FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver formReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver3 = FormReservasiUbahTellerActivity_ViewBinding.e;
                LogoutDialog_ViewBinding logoutDialog_ViewBinding3 = this.x.l;
                subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding3, "");
                LinearLayout linearLayout3 = this.x.a;
                subscribeReservationRescheduleEvent.d(linearLayout3, "");
                FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.b(logoutDialog_ViewBinding3, linearLayout3, true);
                FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver formReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver4 = FormReservasiUbahTellerActivity_ViewBinding.e;
                LogoutDialog_ViewBinding logoutDialog_ViewBinding4 = this.x.p;
                subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding4, "");
                LinearLayout linearLayout4 = this.x.c;
                subscribeReservationRescheduleEvent.d(linearLayout4, "");
                FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.b(logoutDialog_ViewBinding4, linearLayout4, true);
                FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver formReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver5 = FormReservasiUbahTellerActivity_ViewBinding.e;
                Context context2 = this.q;
                LogoutDialog_ViewBinding logoutDialog_ViewBinding5 = this.x.r;
                subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding5, "");
                EditText editText = this.x.g;
                subscribeReservationRescheduleEvent.d(editText, "");
                FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.e(context2, logoutDialog_ViewBinding5, editText, true, true);
                FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver formReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver6 = FormReservasiUbahTellerActivity_ViewBinding.e;
                Context context3 = this.q;
                LogoutDialog_ViewBinding logoutDialog_ViewBinding6 = this.x.q;
                subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding6, "");
                EditText editText2 = this.x.h;
                subscribeReservationRescheduleEvent.d(editText2, "");
                FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.e(context3, logoutDialog_ViewBinding6, editText2, true, false);
                FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver formReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver7 = FormReservasiUbahTellerActivity_ViewBinding.e;
                Context context4 = this.q;
                LogoutDialog_ViewBinding logoutDialog_ViewBinding7 = this.x.l;
                subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding7, "");
                EditText editText3 = this.x.f;
                subscribeReservationRescheduleEvent.d(editText3, "");
                FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.e(context4, logoutDialog_ViewBinding7, editText3, true, false);
                FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver formReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver8 = FormReservasiUbahTellerActivity_ViewBinding.e;
                LogoutDialog_ViewBinding logoutDialog_ViewBinding8 = this.x.p;
                subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding8, "");
                Context context5 = this.x.m.getContext();
                subscribeReservationRescheduleEvent.d(context5, "");
                FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.d(logoutDialog_ViewBinding8, context5);
                if (z) {
                    FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver formReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver9 = FormReservasiUbahTellerActivity_ViewBinding.e;
                    LogoutDialog_ViewBinding logoutDialog_ViewBinding9 = this.x.p;
                    subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding9, "");
                    FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.d(context, logoutDialog_ViewBinding9);
                }
            }
        }

        public static /* synthetic */ void e(read read, WarkatTemp warkatTemp, boolean z, setMessage setmessage, View view) {
            subscribeReservationRescheduleEvent.e(read, "");
            subscribeReservationRescheduleEvent.e(setmessage, "");
            if (read.u) {
                read.c(warkatTemp, read.q, z);
            } else if (warkatTemp != null) {
                Space space = read.x.k;
                subscribeReservationRescheduleEvent.d(space, "");
                space.setVisibility(8);
                FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver formReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver = FormReservasiUbahTellerActivity_ViewBinding.e;
                LogoutDialog_ViewBinding logoutDialog_ViewBinding = read.x.r;
                subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding, "");
                LinearLayout linearLayout = read.x.b;
                subscribeReservationRescheduleEvent.d(linearLayout, "");
                FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.b(logoutDialog_ViewBinding, linearLayout, false);
                FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver formReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver2 = FormReservasiUbahTellerActivity_ViewBinding.e;
                LogoutDialog_ViewBinding logoutDialog_ViewBinding2 = read.x.q;
                subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding2, "");
                LinearLayout linearLayout2 = read.x.d;
                subscribeReservationRescheduleEvent.d(linearLayout2, "");
                FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.b(logoutDialog_ViewBinding2, linearLayout2, false);
                FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver formReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver3 = FormReservasiUbahTellerActivity_ViewBinding.e;
                LogoutDialog_ViewBinding logoutDialog_ViewBinding3 = read.x.l;
                subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding3, "");
                LinearLayout linearLayout3 = read.x.a;
                subscribeReservationRescheduleEvent.d(linearLayout3, "");
                FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.b(logoutDialog_ViewBinding3, linearLayout3, false);
                FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver formReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver4 = FormReservasiUbahTellerActivity_ViewBinding.e;
                LogoutDialog_ViewBinding logoutDialog_ViewBinding4 = read.x.p;
                subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding4, "");
                LinearLayout linearLayout4 = read.x.c;
                subscribeReservationRescheduleEvent.d(linearLayout4, "");
                FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.b(logoutDialog_ViewBinding4, linearLayout4, false);
                FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver formReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver5 = FormReservasiUbahTellerActivity_ViewBinding.e;
                Context context = read.q;
                LogoutDialog_ViewBinding logoutDialog_ViewBinding5 = read.x.r;
                subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding5, "");
                EditText editText = read.x.g;
                subscribeReservationRescheduleEvent.d(editText, "");
                FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.e(context, logoutDialog_ViewBinding5, editText, false, true);
                FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver formReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver6 = FormReservasiUbahTellerActivity_ViewBinding.e;
                Context context2 = read.q;
                LogoutDialog_ViewBinding logoutDialog_ViewBinding6 = read.x.q;
                subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding6, "");
                EditText editText2 = read.x.h;
                subscribeReservationRescheduleEvent.d(editText2, "");
                FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.e(context2, logoutDialog_ViewBinding6, editText2, false, false);
                FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver formReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver7 = FormReservasiUbahTellerActivity_ViewBinding.e;
                Context context3 = read.q;
                LogoutDialog_ViewBinding logoutDialog_ViewBinding7 = read.x.l;
                subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding7, "");
                EditText editText3 = read.x.f;
                subscribeReservationRescheduleEvent.d(editText3, "");
                FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.e(context3, logoutDialog_ViewBinding7, editText3, false, false);
                FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver formReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver8 = FormReservasiUbahTellerActivity_ViewBinding.e;
                Context context4 = read.q;
                LogoutDialog_ViewBinding logoutDialog_ViewBinding8 = read.x.p;
                subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding8, "");
                EditText editText4 = read.x.i;
                subscribeReservationRescheduleEvent.d(editText4, "");
                FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.e(context4, logoutDialog_ViewBinding8, editText4, false, true);
            }
            int i = read.x.j.b;
            if (!(i == 2 || i == 3)) {
                setmessage.c = new RotateAnimation(0.0f, -180.0f, 1, 0.5f, 1, 0.5f);
                setmessage.e(read.x.n);
                read.x.j.setExpanded(true, true);
                return;
            }
            setmessage.c = new RotateAnimation(-180.0f, 0.0f, 1, 0.5f, 1, 0.5f);
            setmessage.e(read.x.n);
            read.x.j.setExpanded(false, true);
        }

        @Stetho$Initializer$RealSocketHandlerFactory
        public final void onConfirmationFormReset(togglePINLama togglepinlama) {
            subscribeReservationRescheduleEvent.e(togglepinlama, "");
            String str = togglepinlama.a;
            switch (str.hashCode()) {
                case -1596721732:
                    if (str.equals("jenisWarkatReset") && togglepinlama.d == this.t) {
                        EditText editText = this.x.l.f;
                        if (editText != null) {
                            editText.setText(togglepinlama.c);
                        }
                        TextView textView = this.x.t;
                        subscribeReservationRescheduleEvent.d(textView, "");
                        textView.setVisibility(8);
                        FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver formReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver = FormReservasiUbahTellerActivity_ViewBinding.e;
                        Context context = this.q;
                        LogoutDialog_ViewBinding logoutDialog_ViewBinding = this.x.l;
                        subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding, "");
                        FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.a(context, logoutDialog_ViewBinding);
                        return;
                    }
                    return;
                case -1243786413:
                    if (str.equals("jenisWarkat") && togglepinlama.d == this.t) {
                        this.x.l.setBackgroundResource(2131230870);
                        TextView textView2 = this.x.t;
                        subscribeReservationRescheduleEvent.d(textView2, "");
                        textView2.setVisibility(0);
                        this.x.t.setText(togglepinlama.b);
                        FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver formReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver2 = FormReservasiUbahTellerActivity_ViewBinding.e;
                        Context context2 = this.q;
                        LogoutDialog_ViewBinding logoutDialog_ViewBinding2 = this.x.l;
                        subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding2, "");
                        FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.a(context2, logoutDialog_ViewBinding2);
                        return;
                    }
                    return;
                case -638562726:
                    if (str.equals("totalWarkat") && togglepinlama.d == this.t) {
                        this.x.p.setBackgroundResource(2131230870);
                        TextView textView3 = this.x.y;
                        subscribeReservationRescheduleEvent.d(textView3, "");
                        textView3.setVisibility(0);
                        this.x.y.setText(togglepinlama.b);
                        return;
                    }
                    return;
                case -272787683:
                    if (str.equals("warkatBankReset") && togglepinlama.d == this.t) {
                        EditText editText2 = this.x.q.f;
                        if (editText2 != null) {
                            editText2.setText(togglepinlama.c);
                        }
                        TextView textView4 = this.x.s;
                        subscribeReservationRescheduleEvent.d(textView4, "");
                        textView4.setVisibility(8);
                        FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver formReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver3 = FormReservasiUbahTellerActivity_ViewBinding.e;
                        Context context3 = this.q;
                        LogoutDialog_ViewBinding logoutDialog_ViewBinding3 = this.x.q;
                        subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding3, "");
                        FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.a(context3, logoutDialog_ViewBinding3);
                        return;
                    }
                    return;
                case 185163602:
                    if (str.equals("bankWarkat") && togglepinlama.d == this.t) {
                        this.x.q.setBackgroundResource(2131230870);
                        TextView textView5 = this.x.s;
                        subscribeReservationRescheduleEvent.d(textView5, "");
                        textView5.setVisibility(0);
                        this.x.s.setText(togglepinlama.b);
                        FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver formReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver4 = FormReservasiUbahTellerActivity_ViewBinding.e;
                        Context context4 = this.q;
                        LogoutDialog_ViewBinding logoutDialog_ViewBinding4 = this.x.q;
                        subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding4, "");
                        FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.a(context4, logoutDialog_ViewBinding4);
                        return;
                    }
                    return;
                case 980085893:
                    if (str.equals("nomorWarkat") && togglepinlama.d == this.t) {
                        this.x.r.setBackgroundResource(2131230870);
                        TextView textView6 = this.x.u;
                        subscribeReservationRescheduleEvent.d(textView6, "");
                        textView6.setVisibility(0);
                        this.x.u.setText(togglepinlama.b);
                        FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver formReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver5 = FormReservasiUbahTellerActivity_ViewBinding.e;
                        Context context5 = this.q;
                        LogoutDialog_ViewBinding logoutDialog_ViewBinding5 = this.x.r;
                        subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding5, "");
                        FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.a(context5, logoutDialog_ViewBinding5);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    /* loaded from: classes-dex2jar.jar:o/FormReservasiUbahTellerActivity_ViewBinding$write.class */
    public static final class write extends setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable {
        final ListNegaraAdapter$ListNegaraAdapterVH_ViewBinding t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public write(ListNegaraAdapter$ListNegaraAdapterVH_ViewBinding listNegaraAdapter$ListNegaraAdapterVH_ViewBinding) {
            super(listNegaraAdapter$ListNegaraAdapterVH_ViewBinding.i);
            subscribeReservationRescheduleEvent.e(listNegaraAdapter$ListNegaraAdapterVH_ViewBinding, "");
            this.t = listNegaraAdapter$ListNegaraAdapterVH_ViewBinding;
        }

        public static /* synthetic */ void e(write write, setMessage setmessage, View view) {
            subscribeReservationRescheduleEvent.e(write, "");
            subscribeReservationRescheduleEvent.e(setmessage, "");
            int i = write.t.d.b;
            if (!(i == 2 || i == 3)) {
                setmessage.c = new RotateAnimation(0.0f, -180.0f, 1, 0.5f, 1, 0.5f);
                setmessage.e(write.t.a);
                write.t.d.setExpanded(true, true);
                return;
            }
            setmessage.c = new RotateAnimation(-180.0f, 0.0f, 1, 0.5f, 1, 0.5f);
            setmessage.e(write.t.a);
            write.t.d.setExpanded(false, true);
        }

        public final void c(double d) {
            TextView textView = this.t.j;
            if (d == 0.0d) {
                textView.setText(String.valueOf(getPromotion.a(String.valueOf(d))));
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(getPromotion.a(String.valueOf(d)));
            sb.append(" IDR");
            textView.setText(sb.toString());
        }
    }

    public FormReservasiUbahTellerActivity_ViewBinding(Context context) {
        subscribeReservationRescheduleEvent.e(context, "");
        this.m = context;
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable a(ViewGroup viewGroup, int i) {
        int i2;
        int i3;
        subscribeReservationRescheduleEvent.e(viewGroup, "");
        if (i == this.k) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(2131493309, viewGroup, false);
            TextView textView = (TextView) setRotation.a(inflate, 2131297508);
            if (textView != null) {
                ListKotaAdapter$ListKotaAdapterVH_ViewBinding listKotaAdapter$ListKotaAdapterVH_ViewBinding = new ListKotaAdapter$ListKotaAdapterVH_ViewBinding((setMaxHeight) inflate, textView);
                subscribeReservationRescheduleEvent.d(listKotaAdapter$ListKotaAdapterVH_ViewBinding, "");
                return new IconCompatParcelizer(this.m, listKotaAdapter$ListKotaAdapterVH_ViewBinding);
            }
            throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(2131297508)));
        }
        int i4 = 2131299636;
        if (i == this.f86o) {
            View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(2131493308, viewGroup, false);
            LinearLayout linearLayout = (LinearLayout) setRotation.a(inflate2, 2131296354);
            if (linearLayout != null) {
                LinearLayout linearLayout2 = (LinearLayout) setRotation.a(inflate2, 2131296355);
                if (linearLayout2 != null) {
                    LinearLayout linearLayout3 = (LinearLayout) setRotation.a(inflate2, 2131296356);
                    if (linearLayout3 != null) {
                        LinearLayout linearLayout4 = (LinearLayout) setRotation.a(inflate2, 2131296357);
                        if (linearLayout4 != null) {
                            LinearLayout linearLayout5 = (LinearLayout) setRotation.a(inflate2, 2131296358);
                            if (linearLayout5 != null) {
                                LinearLayout linearLayout6 = (LinearLayout) setRotation.a(inflate2, 2131296359);
                                if (linearLayout6 != null) {
                                    LinearLayout linearLayout7 = (LinearLayout) setRotation.a(inflate2, 2131296361);
                                    if (linearLayout7 != null) {
                                        LinearLayout linearLayout8 = (LinearLayout) setRotation.a(inflate2, 2131296362);
                                        if (linearLayout8 != null) {
                                            LinearLayout linearLayout9 = (LinearLayout) setRotation.a(inflate2, 2131296364);
                                            if (linearLayout9 != null) {
                                                LinearLayout linearLayout10 = (LinearLayout) setRotation.a(inflate2, 2131296366);
                                                if (linearLayout10 != null) {
                                                    setTypeface settypeface = (setTypeface) setRotation.a(inflate2, 2131296457);
                                                    if (settypeface != null) {
                                                        EditText editText = (EditText) setRotation.a(inflate2, 2131296924);
                                                        if (editText != null) {
                                                            EditText editText2 = (EditText) setRotation.a(inflate2, 2131296954);
                                                            if (editText2 != null) {
                                                                EditText editText3 = (EditText) setRotation.a(inflate2, 2131296971);
                                                                if (editText3 != null) {
                                                                    EditText editText4 = (EditText) setRotation.a(inflate2, 2131296972);
                                                                    if (editText4 != null) {
                                                                        EditText editText5 = (EditText) setRotation.a(inflate2, 2131296975);
                                                                        if (editText5 != null) {
                                                                            EditText editText6 = (EditText) setRotation.a(inflate2, 2131296986);
                                                                            if (editText6 != null) {
                                                                                EditText editText7 = (EditText) setRotation.a(inflate2, 2131297094);
                                                                                if (editText7 != null) {
                                                                                    EditText editText8 = (EditText) setRotation.a(inflate2, 2131297165);
                                                                                    if (editText8 != null) {
                                                                                        EditText editText9 = (EditText) setRotation.a(inflate2, 2131297225);
                                                                                        if (editText9 != null) {
                                                                                            setRequestHeaders a = setRotation.a(inflate2, 2131297240);
                                                                                            if (a != null) {
                                                                                                setDropDownHorizontalOffset setdropdownhorizontaloffset = (setDropDownHorizontalOffset) setRotation.a(inflate2, 2131297303);
                                                                                                if (setdropdownhorizontaloffset != null) {
                                                                                                    LinearLayout linearLayout11 = (LinearLayout) setRotation.a(inflate2, 2131297484);
                                                                                                    if (linearLayout11 != null) {
                                                                                                        Space space = (Space) setRotation.a(inflate2, 2131298391);
                                                                                                        i3 = 2131298391;
                                                                                                        if (space != null) {
                                                                                                            i3 = 2131298473;
                                                                                                            LogoutDialog_ViewBinding logoutDialog_ViewBinding = (LogoutDialog_ViewBinding) setRotation.a(inflate2, 2131298473);
                                                                                                            if (logoutDialog_ViewBinding != null) {
                                                                                                                i3 = 2131298504;
                                                                                                                LogoutDialog_ViewBinding logoutDialog_ViewBinding2 = (LogoutDialog_ViewBinding) setRotation.a(inflate2, 2131298504);
                                                                                                                if (logoutDialog_ViewBinding2 != null) {
                                                                                                                    i3 = 2131298522;
                                                                                                                    LogoutDialog_ViewBinding logoutDialog_ViewBinding3 = (LogoutDialog_ViewBinding) setRotation.a(inflate2, 2131298522);
                                                                                                                    if (logoutDialog_ViewBinding3 != null) {
                                                                                                                        i3 = 2131298523;
                                                                                                                        LogoutDialog_ViewBinding logoutDialog_ViewBinding4 = (LogoutDialog_ViewBinding) setRotation.a(inflate2, 2131298523);
                                                                                                                        if (logoutDialog_ViewBinding4 != null) {
                                                                                                                            i3 = 2131298526;
                                                                                                                            LogoutDialog_ViewBinding logoutDialog_ViewBinding5 = (LogoutDialog_ViewBinding) setRotation.a(inflate2, 2131298526);
                                                                                                                            if (logoutDialog_ViewBinding5 != null) {
                                                                                                                                i3 = 2131298535;
                                                                                                                                LogoutDialog_ViewBinding logoutDialog_ViewBinding6 = (LogoutDialog_ViewBinding) setRotation.a(inflate2, 2131298535);
                                                                                                                                if (logoutDialog_ViewBinding6 != null) {
                                                                                                                                    i3 = 2131298640;
                                                                                                                                    LogoutDialog_ViewBinding logoutDialog_ViewBinding7 = (LogoutDialog_ViewBinding) setRotation.a(inflate2, 2131298640);
                                                                                                                                    if (logoutDialog_ViewBinding7 != null) {
                                                                                                                                        i3 = 2131298701;
                                                                                                                                        LogoutDialog_ViewBinding logoutDialog_ViewBinding8 = (LogoutDialog_ViewBinding) setRotation.a(inflate2, 2131298701);
                                                                                                                                        if (logoutDialog_ViewBinding8 != null) {
                                                                                                                                            i3 = 2131298756;
                                                                                                                                            LogoutDialog_ViewBinding logoutDialog_ViewBinding9 = (LogoutDialog_ViewBinding) setRotation.a(inflate2, 2131298756);
                                                                                                                                            if (logoutDialog_ViewBinding9 != null) {
                                                                                                                                                i3 = 2131298809;
                                                                                                                                                TextView textView2 = (TextView) setRotation.a(inflate2, 2131298809);
                                                                                                                                                if (textView2 != null) {
                                                                                                                                                    i3 = 2131298847;
                                                                                                                                                    TextView textView3 = (TextView) setRotation.a(inflate2, 2131298847);
                                                                                                                                                    if (textView3 != null) {
                                                                                                                                                        i3 = 2131298887;
                                                                                                                                                        TextView textView4 = (TextView) setRotation.a(inflate2, 2131298887);
                                                                                                                                                        if (textView4 != null) {
                                                                                                                                                            i3 = 2131298888;
                                                                                                                                                            TextView textView5 = (TextView) setRotation.a(inflate2, 2131298888);
                                                                                                                                                            if (textView5 != null) {
                                                                                                                                                                i3 = 2131298949;
                                                                                                                                                                TextView textView6 = (TextView) setRotation.a(inflate2, 2131298949);
                                                                                                                                                                if (textView6 != null) {
                                                                                                                                                                    i3 = 2131298953;
                                                                                                                                                                    TextView textView7 = (TextView) setRotation.a(inflate2, 2131298953);
                                                                                                                                                                    if (textView7 != null) {
                                                                                                                                                                        i3 = 2131299001;
                                                                                                                                                                        TextView textView8 = (TextView) setRotation.a(inflate2, 2131299001);
                                                                                                                                                                        if (textView8 != null) {
                                                                                                                                                                            i3 = 2131299002;
                                                                                                                                                                            TextView textView9 = (TextView) setRotation.a(inflate2, 2131299002);
                                                                                                                                                                            if (textView9 != null) {
                                                                                                                                                                                i3 = 2131299005;
                                                                                                                                                                                TextView textView10 = (TextView) setRotation.a(inflate2, 2131299005);
                                                                                                                                                                                if (textView10 != null) {
                                                                                                                                                                                    i3 = 2131299012;
                                                                                                                                                                                    TextView textView11 = (TextView) setRotation.a(inflate2, 2131299012);
                                                                                                                                                                                    if (textView11 != null) {
                                                                                                                                                                                        i3 = 2131299158;
                                                                                                                                                                                        TextView textView12 = (TextView) setRotation.a(inflate2, 2131299158);
                                                                                                                                                                                        if (textView12 != null) {
                                                                                                                                                                                            i3 = 2131299169;
                                                                                                                                                                                            TextView textView13 = (TextView) setRotation.a(inflate2, 2131299169);
                                                                                                                                                                                            if (textView13 != null) {
                                                                                                                                                                                                i3 = 2131299225;
                                                                                                                                                                                                TextView textView14 = (TextView) setRotation.a(inflate2, 2131299225);
                                                                                                                                                                                                if (textView14 != null) {
                                                                                                                                                                                                    i3 = 2131299264;
                                                                                                                                                                                                    TextView textView15 = (TextView) setRotation.a(inflate2, 2131299264);
                                                                                                                                                                                                    if (textView15 != null) {
                                                                                                                                                                                                        i3 = 2131299453;
                                                                                                                                                                                                        TextView textView16 = (TextView) setRotation.a(inflate2, 2131299453);
                                                                                                                                                                                                        if (textView16 != null) {
                                                                                                                                                                                                            i3 = 2131299547;
                                                                                                                                                                                                            TextView textView17 = (TextView) setRotation.a(inflate2, 2131299547);
                                                                                                                                                                                                            if (textView17 != null) {
                                                                                                                                                                                                                setTypeface settypeface2 = (setTypeface) setRotation.a(inflate2, 2131299636);
                                                                                                                                                                                                                if (settypeface2 != null) {
                                                                                                                                                                                                                    i3 = 2131299687;
                                                                                                                                                                                                                    TextView textView18 = (TextView) setRotation.a(inflate2, 2131299687);
                                                                                                                                                                                                                    if (textView18 != null) {
                                                                                                                                                                                                                        i3 = 2131299754;
                                                                                                                                                                                                                        RelativeLayout relativeLayout = (RelativeLayout) setRotation.a(inflate2, 2131299754);
                                                                                                                                                                                                                        if (relativeLayout != null) {
                                                                                                                                                                                                                            i3 = 2131299756;
                                                                                                                                                                                                                            LinearLayout linearLayout12 = (LinearLayout) setRotation.a(inflate2, 2131299756);
                                                                                                                                                                                                                            if (linearLayout12 != null) {
                                                                                                                                                                                                                                i3 = 2131299757;
                                                                                                                                                                                                                                RelativeLayout relativeLayout2 = (RelativeLayout) setRotation.a(inflate2, 2131299757);
                                                                                                                                                                                                                                if (relativeLayout2 != null) {
                                                                                                                                                                                                                                    i3 = 2131299759;
                                                                                                                                                                                                                                    RelativeLayout relativeLayout3 = (RelativeLayout) setRotation.a(inflate2, 2131299759);
                                                                                                                                                                                                                                    if (relativeLayout3 != null) {
                                                                                                                                                                                                                                        i3 = 2131299760;
                                                                                                                                                                                                                                        RelativeLayout relativeLayout4 = (RelativeLayout) setRotation.a(inflate2, 2131299760);
                                                                                                                                                                                                                                        if (relativeLayout4 != null) {
                                                                                                                                                                                                                                            i3 = 2131299774;
                                                                                                                                                                                                                                            LinearLayout linearLayout13 = (LinearLayout) setRotation.a(inflate2, 2131299774);
                                                                                                                                                                                                                                            if (linearLayout13 != null) {
                                                                                                                                                                                                                                                i3 = 2131299775;
                                                                                                                                                                                                                                                RelativeLayout relativeLayout5 = (RelativeLayout) setRotation.a(inflate2, 2131299775);
                                                                                                                                                                                                                                                if (relativeLayout5 != null) {
                                                                                                                                                                                                                                                    i3 = 2131299780;
                                                                                                                                                                                                                                                    RelativeLayout relativeLayout6 = (RelativeLayout) setRotation.a(inflate2, 2131299780);
                                                                                                                                                                                                                                                    if (relativeLayout6 != null) {
                                                                                                                                                                                                                                                        ListKotaAdapter$ListKotaAdapterVH listKotaAdapter$ListKotaAdapterVH = new ListKotaAdapter$ListKotaAdapterVH((setMaxHeight) inflate2, linearLayout, linearLayout2, linearLayout3, linearLayout4, linearLayout5, linearLayout6, linearLayout7, linearLayout8, linearLayout9, linearLayout10, settypeface, editText, editText2, editText3, editText4, editText5, editText6, editText7, editText8, editText9, a, setdropdownhorizontaloffset, linearLayout11, space, logoutDialog_ViewBinding, logoutDialog_ViewBinding2, logoutDialog_ViewBinding3, logoutDialog_ViewBinding4, logoutDialog_ViewBinding5, logoutDialog_ViewBinding6, logoutDialog_ViewBinding7, logoutDialog_ViewBinding8, logoutDialog_ViewBinding9, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13, textView14, textView15, textView16, textView17, settypeface2, textView18, relativeLayout, linearLayout12, relativeLayout2, relativeLayout3, relativeLayout4, linearLayout13, relativeLayout5, relativeLayout6);
                                                                                                                                                                                                                                                        subscribeReservationRescheduleEvent.d(listKotaAdapter$ListKotaAdapterVH, "");
                                                                                                                                                                                                                                                        return new RemoteActionCompatParcelizer(this.m, listKotaAdapter$ListKotaAdapterVH);
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                } else {
                                                                                                                                                                                                                    i3 = 2131299636;
                                                                                                                                                                                                                }
                                                                                                                                                                                                            }
                                                                                                                                                                                                        }
                                                                                                                                                                                                    }
                                                                                                                                                                                                }
                                                                                                                                                                                            }
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    } else {
                                                                                                        i3 = 2131297484;
                                                                                                    }
                                                                                                } else {
                                                                                                    i3 = 2131297303;
                                                                                                }
                                                                                            } else {
                                                                                                i3 = 2131297240;
                                                                                            }
                                                                                        } else {
                                                                                            i3 = 2131297225;
                                                                                        }
                                                                                    } else {
                                                                                        i3 = 2131297165;
                                                                                    }
                                                                                } else {
                                                                                    i3 = 2131297094;
                                                                                }
                                                                            } else {
                                                                                i3 = 2131296986;
                                                                            }
                                                                        } else {
                                                                            i3 = 2131296975;
                                                                        }
                                                                    } else {
                                                                        i3 = 2131296972;
                                                                    }
                                                                } else {
                                                                    i3 = 2131296971;
                                                                }
                                                            } else {
                                                                i3 = 2131296954;
                                                            }
                                                        } else {
                                                            i3 = 2131296924;
                                                        }
                                                    } else {
                                                        i3 = 2131296457;
                                                    }
                                                } else {
                                                    i3 = 2131296366;
                                                }
                                            } else {
                                                i3 = 2131296364;
                                            }
                                        } else {
                                            i3 = 2131296362;
                                        }
                                    } else {
                                        i3 = 2131296361;
                                    }
                                } else {
                                    i3 = 2131296359;
                                }
                            } else {
                                i3 = 2131296358;
                            }
                        } else {
                            i3 = 2131296357;
                        }
                    } else {
                        i3 = 2131296356;
                    }
                } else {
                    i3 = 2131296355;
                }
            } else {
                i3 = 2131296354;
            }
            throw new NullPointerException("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(i3)));
        } else if (i == this.b) {
            View inflate3 = LayoutInflater.from(viewGroup.getContext()).inflate(2131493313, viewGroup, false);
            LinearLayout linearLayout14 = (LinearLayout) setRotation.a(inflate3, 2131296365);
            if (linearLayout14 != null) {
                setRequestHeaders a2 = setRotation.a(inflate3, 2131297240);
                if (a2 != null) {
                    View a3 = setRotation.a(inflate3, 2131297274);
                    if (a3 != null) {
                        ImageView imageView = (ImageView) setRotation.a(inflate3, 2131297303);
                        if (imageView != null) {
                            LinearLayout linearLayout15 = (LinearLayout) setRotation.a(inflate3, 2131297484);
                            if (linearLayout15 != null) {
                                setTypeface settypeface3 = (setTypeface) setRotation.a(inflate3, 2131299636);
                                if (settypeface3 != null) {
                                    i4 = 2131299681;
                                    TextView textView19 = (TextView) setRotation.a(inflate3, 2131299681);
                                    if (textView19 != null) {
                                        ListNegaraAdapter$ListNegaraAdapterVH_ViewBinding listNegaraAdapter$ListNegaraAdapterVH_ViewBinding = new ListNegaraAdapter$ListNegaraAdapterVH_ViewBinding((setMaxHeight) inflate3, linearLayout14, a2, a3, imageView, linearLayout15, settypeface3, textView19);
                                        subscribeReservationRescheduleEvent.d(listNegaraAdapter$ListNegaraAdapterVH_ViewBinding, "");
                                        return new write(listNegaraAdapter$ListNegaraAdapterVH_ViewBinding);
                                    }
                                }
                            } else {
                                i4 = 2131297484;
                            }
                        } else {
                            i4 = 2131297303;
                        }
                    } else {
                        i4 = 2131297274;
                    }
                } else {
                    i4 = 2131297240;
                }
            } else {
                i4 = 2131296365;
            }
            throw new NullPointerException("Missing required view with ID: ".concat(inflate3.getResources().getResourceName(i4)));
        } else {
            View inflate4 = LayoutInflater.from(viewGroup.getContext()).inflate(2131493311, viewGroup, false);
            LinearLayout linearLayout16 = (LinearLayout) setRotation.a(inflate4, 2131296360);
            if (linearLayout16 != null) {
                LinearLayout linearLayout17 = (LinearLayout) setRotation.a(inflate4, 2131296363);
                if (linearLayout17 != null) {
                    LinearLayout linearLayout18 = (LinearLayout) setRotation.a(inflate4, 2131296367);
                    if (linearLayout18 != null) {
                        LinearLayout linearLayout19 = (LinearLayout) setRotation.a(inflate4, 2131296368);
                        if (linearLayout19 != null) {
                            setTypeface settypeface4 = (setTypeface) setRotation.a(inflate4, 2131296457);
                            if (settypeface4 != null) {
                                EditText editText10 = (EditText) setRotation.a(inflate4, 2131297005);
                                if (editText10 != null) {
                                    EditText editText11 = (EditText) setRotation.a(inflate4, 2131297129);
                                    if (editText11 != null) {
                                        EditText editText12 = (EditText) setRotation.a(inflate4, 2131297235);
                                        if (editText12 != null) {
                                            EditText editText13 = (EditText) setRotation.a(inflate4, 2131297236);
                                            if (editText13 != null) {
                                                setRequestHeaders a4 = setRotation.a(inflate4, 2131297240);
                                                if (a4 != null) {
                                                    setDropDownHorizontalOffset setdropdownhorizontaloffset2 = (setDropDownHorizontalOffset) setRotation.a(inflate4, 2131297303);
                                                    if (setdropdownhorizontaloffset2 != null) {
                                                        LinearLayout linearLayout20 = (LinearLayout) setRotation.a(inflate4, 2131297484);
                                                        if (linearLayout20 != null) {
                                                            Space space2 = (Space) setRotation.a(inflate4, 2131298391);
                                                            i2 = 2131298391;
                                                            if (space2 != null) {
                                                                i2 = 2131298553;
                                                                LogoutDialog_ViewBinding logoutDialog_ViewBinding10 = (LogoutDialog_ViewBinding) setRotation.a(inflate4, 2131298553);
                                                                if (logoutDialog_ViewBinding10 != null) {
                                                                    i2 = 2131298674;
                                                                    LogoutDialog_ViewBinding logoutDialog_ViewBinding11 = (LogoutDialog_ViewBinding) setRotation.a(inflate4, 2131298674);
                                                                    if (logoutDialog_ViewBinding11 != null) {
                                                                        i2 = 2131298766;
                                                                        LogoutDialog_ViewBinding logoutDialog_ViewBinding12 = (LogoutDialog_ViewBinding) setRotation.a(inflate4, 2131298766);
                                                                        if (logoutDialog_ViewBinding12 != null) {
                                                                            i2 = 2131298767;
                                                                            LogoutDialog_ViewBinding logoutDialog_ViewBinding13 = (LogoutDialog_ViewBinding) setRotation.a(inflate4, 2131298767);
                                                                            if (logoutDialog_ViewBinding13 != null) {
                                                                                i2 = 2131299029;
                                                                                TextView textView20 = (TextView) setRotation.a(inflate4, 2131299029);
                                                                                if (textView20 != null) {
                                                                                    i2 = 2131299079;
                                                                                    TextView textView21 = (TextView) setRotation.a(inflate4, 2131299079);
                                                                                    if (textView21 != null) {
                                                                                        i2 = 2131299144;
                                                                                        TextView textView22 = (TextView) setRotation.a(inflate4, 2131299144);
                                                                                        if (textView22 != null) {
                                                                                            i2 = 2131299221;
                                                                                            TextView textView23 = (TextView) setRotation.a(inflate4, 2131299221);
                                                                                            if (textView23 != null) {
                                                                                                i2 = 2131299314;
                                                                                                TextView textView24 = (TextView) setRotation.a(inflate4, 2131299314);
                                                                                                if (textView24 != null) {
                                                                                                    i2 = 2131299485;
                                                                                                    TextView textView25 = (TextView) setRotation.a(inflate4, 2131299485);
                                                                                                    if (textView25 != null) {
                                                                                                        i2 = 2131299496;
                                                                                                        TextView textView26 = (TextView) setRotation.a(inflate4, 2131299496);
                                                                                                        if (textView26 != null) {
                                                                                                            setTypeface settypeface5 = (setTypeface) setRotation.a(inflate4, 2131299636);
                                                                                                            if (settypeface5 != null) {
                                                                                                                i2 = 2131299740;
                                                                                                                TextView textView27 = (TextView) setRotation.a(inflate4, 2131299740);
                                                                                                                if (textView27 != null) {
                                                                                                                    ListNegaraAdapter$ListNegaraAdapterVH listNegaraAdapter$ListNegaraAdapterVH = new ListNegaraAdapter$ListNegaraAdapterVH((setMaxHeight) inflate4, linearLayout16, linearLayout17, linearLayout18, linearLayout19, settypeface4, editText10, editText11, editText12, editText13, a4, setdropdownhorizontaloffset2, linearLayout20, space2, logoutDialog_ViewBinding10, logoutDialog_ViewBinding11, logoutDialog_ViewBinding12, logoutDialog_ViewBinding13, textView20, textView21, textView22, textView23, textView24, textView25, textView26, settypeface5, textView27);
                                                                                                                    subscribeReservationRescheduleEvent.d(listNegaraAdapter$ListNegaraAdapterVH, "");
                                                                                                                    return new read(this.m, listNegaraAdapter$ListNegaraAdapterVH);
                                                                                                                }
                                                                                                            } else {
                                                                                                                i2 = 2131299636;
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            i2 = 2131297484;
                                                        }
                                                    } else {
                                                        i2 = 2131297303;
                                                    }
                                                } else {
                                                    i2 = 2131297240;
                                                }
                                            } else {
                                                i2 = 2131297236;
                                            }
                                        } else {
                                            i2 = 2131297235;
                                        }
                                    } else {
                                        i2 = 2131297129;
                                    }
                                } else {
                                    i2 = 2131297005;
                                }
                            } else {
                                i2 = 2131296457;
                            }
                        } else {
                            i2 = 2131296368;
                        }
                    } else {
                        i2 = 2131296367;
                    }
                } else {
                    i2 = 2131296363;
                }
            } else {
                i2 = 2131296360;
            }
            throw new NullPointerException("Missing required view with ID: ".concat(inflate4.getResources().getResourceName(i2)));
        }
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final int c() {
        return this.g.size();
    }

    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    public final int d(int i) {
        int i2;
        String str = ((ConfirmMastercardAdapter$ViewHolder) this.g.get(i)).b;
        int hashCode = str.hashCode();
        if (hashCode == -1131663437) {
            i2 = i;
            if (str.equals("Penerima Data")) {
                i2 = this.f86o;
            }
        } else if (hashCode != -26123630) {
            i2 = i;
            if (hashCode == 80818744) {
                i2 = i;
                if (str.equals("Title")) {
                    i2 = this.k;
                }
            }
        } else {
            i2 = i;
            if (str.equals("Total Warkat")) {
                i2 = this.b;
            }
        }
        return i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:183:0x08d7, code lost:
        if ((r0.p.length() == 0) != false) goto L_0x08da;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x0936, code lost:
        if ((r0.l.length() == 0) != false) goto L_0x0939;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x0995, code lost:
        if ((r0.t.length() == 0) != false) goto L_0x0998;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x0ac6, code lost:
        if ((r0.c.length() == 0) != false) goto L_0x0ac9;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x05cb  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x05d4  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0565  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x058a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x05ad  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x05b6  */
    @Override // o.setOnStartEnterTransitionListener$MediaBrowserCompat$CustomActionResultReceiver
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final void e(o.setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable r10, int r11) {
        /*
        // Method dump skipped, instructions count: 3452
        */
        throw new UnsupportedOperationException("Method not decompiled: o.FormReservasiUbahTellerActivity_ViewBinding.e(o.setOnStartEnterTransitionListener$OnBackPressedDispatcher$LifecycleOnBackPressedCancellable, int):void");
    }
}
