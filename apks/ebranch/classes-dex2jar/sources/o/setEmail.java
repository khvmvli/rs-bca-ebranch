package o;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bca.smartbranch.data.localdb.Kliring;
import com.bca.smartbranch.data.localdb.Warkat;
import com.bca.smartbranch.fragment.BaseFragmentKotlin;
import com.facebook.stetho.server.http.HttpStatus;
import io.realm.Realm;
import io.realm.RealmList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes-dex2jar.jar:o/setEmail.class */
public final class setEmail extends BaseFragmentKotlin {
    public static final RemoteActionCompatParcelizer e = new RemoteActionCompatParcelizer((byte) 0);
    private ListBankPenerbitAdapter$ListBankPenerbitAdapterVH_ViewBinding b;
    private List<? extends EditText> g;
    private List<? extends TextView> h;

    /* renamed from: o */
    private List<? extends LogoutDialog_ViewBinding> f221o;
    private double t;
    public Map<Integer, View> c = new LinkedHashMap();
    private String k = "";
    private String m = "";
    private String p = "";
    private String n = "";
    private String l = "";
    private setMessage d = new setMessage();
    private String a = "";

    /* loaded from: classes-dex2jar.jar:o/setEmail$IconCompatParcelizer.class */
    public static final class IconCompatParcelizer implements TextWatcher {
        final /* synthetic */ ListBankPenerbitAdapter$ListBankPenerbitAdapterVH_ViewBinding d;

        /* loaded from: classes-dex2jar.jar:o/setEmail$IconCompatParcelizer$write.class */
        static final class write extends subscribeDraftTxnBerkalaEvent implements onClickInfo<String, Double, onCLickStatusNpwp> {
            final /* synthetic */ setEmail d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            write(setEmail setemail) {
                super(2);
                this.d = setemail;
            }

            @Override // o.onClickInfo
            public final /* synthetic */ onCLickStatusNpwp invoke(String str, Double d) {
                String str2 = str;
                double doubleValue = d.doubleValue();
                subscribeReservationRescheduleEvent.e(str2, "");
                this.d.a = str2;
                this.d.t = doubleValue;
                return onCLickStatusNpwp.e;
            }
        }

        IconCompatParcelizer(ListBankPenerbitAdapter$ListBankPenerbitAdapterVH_ViewBinding listBankPenerbitAdapter$ListBankPenerbitAdapterVH_ViewBinding) {
            setEmail.this = r4;
            this.d = listBankPenerbitAdapter$ListBankPenerbitAdapterVH_ViewBinding;
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            setEmail setemail = setEmail.this;
            LogoutDialog logoutDialog = this.d.e;
            subscribeReservationRescheduleEvent.d(logoutDialog, "");
            setemail.b((View) logoutDialog);
            setEmail.this.requireActivity();
            EditText editText = setEmail.d(setEmail.this).e;
            subscribeReservationRescheduleEvent.d(editText, "");
            subscribeUbahVisaCardEvent.e(editable, editText, this, new write(setEmail.this));
            this.d.r.setHintEnabled(String.valueOf(this.d.e.getText()).length() > 0);
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* loaded from: classes-dex2jar.jar:o/setEmail$RemoteActionCompatParcelizer.class */
    public static final class RemoteActionCompatParcelizer {
        private RemoteActionCompatParcelizer() {
        }

        public /* synthetic */ RemoteActionCompatParcelizer(byte b) {
            this();
        }
    }

    /* loaded from: classes-dex2jar.jar:o/setEmail$write.class */
    public static final class write implements TextWatcher {
        final /* synthetic */ ListBankPenerbitAdapter$ListBankPenerbitAdapterVH_ViewBinding b;

        public write(ListBankPenerbitAdapter$ListBankPenerbitAdapterVH_ViewBinding listBankPenerbitAdapter$ListBankPenerbitAdapterVH_ViewBinding) {
            setEmail.this = r4;
            this.b = listBankPenerbitAdapter$ListBankPenerbitAdapterVH_ViewBinding;
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            setEmail setemail = setEmail.this;
            EditText editText = this.b.f;
            subscribeReservationRescheduleEvent.d(editText, "");
            setemail.b(editText);
            this.b.t.setHintEnabled(this.b.f.getText().toString().length() > 0);
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    public static /* synthetic */ void a(setEmail setemail, View view) {
        subscribeReservationRescheduleEvent.e(setemail, "");
        ((subscribeUbahVisaCardEvent) setemail.requireActivity()).g(setemail.n);
    }

    private boolean a(EditText editText, int i, String str) {
        subscribeReservationRescheduleEvent.e(editText, "");
        subscribeReservationRescheduleEvent.e(str, "");
        subscribeUbahVisaCardEvent subscribeubahvisacardevent = (subscribeUbahVisaCardEvent) requireActivity();
        List<? extends TextView> list = this.h;
        List<? extends TextView> list2 = list;
        if (list == null) {
            subscribeReservationRescheduleEvent.e("");
            list2 = null;
        }
        List<? extends LogoutDialog_ViewBinding> list3 = this.f221o;
        List<? extends LogoutDialog_ViewBinding> list4 = list3;
        if (list3 == null) {
            subscribeReservationRescheduleEvent.e("");
            list4 = null;
        }
        List<? extends EditText> list5 = this.g;
        List<? extends EditText> list6 = list5;
        if (list5 == null) {
            subscribeReservationRescheduleEvent.e("");
            list6 = null;
        }
        return subscribeubahvisacardevent.d(list2, list4, list6, editText, i, str);
    }

    public static /* synthetic */ void b(ListBankPenerbitAdapter$ListBankPenerbitAdapterVH_ViewBinding listBankPenerbitAdapter$ListBankPenerbitAdapterVH_ViewBinding, View view, boolean z) {
        subscribeReservationRescheduleEvent.e(listBankPenerbitAdapter$ListBankPenerbitAdapterVH_ViewBinding, "");
        boolean z2 = true;
        if (z) {
            listBankPenerbitAdapter$ListBankPenerbitAdapterVH_ViewBinding.t.setHintEnabled(true);
            return;
        }
        LogoutDialog_ViewBinding logoutDialog_ViewBinding = listBankPenerbitAdapter$ListBankPenerbitAdapterVH_ViewBinding.t;
        if (listBankPenerbitAdapter$ListBankPenerbitAdapterVH_ViewBinding.f.getText().toString().length() <= 0) {
            z2 = false;
        }
        logoutDialog_ViewBinding.setHintEnabled(z2);
    }

    public static /* synthetic */ void b(setEmail setemail, int i, View view) {
        subscribeReservationRescheduleEvent.e(setemail, "");
        setemail.d(Integer.valueOf(i));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0089, code lost:
        if (r0 == null) goto L_0x008c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private final com.bca.smartbranch.data.localdb.Warkat c() {
        /*
            r4 = this;
            com.bca.smartbranch.data.localdb.Warkat r0 = new com.bca.smartbranch.data.localdb.Warkat
            r1 = r0
            r1.<init>()
            r5 = r0
            r0 = r5
            long r1 = android.os.SystemClock.currentThreadTimeMillis()
            r0.setId(r1)
            r0 = r4
            o.ListBankPenerbitAdapter$ListBankPenerbitAdapterVH_ViewBinding r0 = r0.b
            r6 = r0
            r0 = r6
            o.subscribeReservationRescheduleEvent.c(r0)
            r0 = r5
            r1 = r6
            android.widget.EditText r1 = r1.f
            android.text.Editable r1 = r1.getText()
            java.lang.String r1 = r1.toString()
            r0.setNomorWarkat(r1)
            r0 = r5
            r1 = r4
            java.lang.String r1 = r1.k
            r0.setNamaBank(r1)
            r0 = r5
            r1 = r4
            java.lang.String r1 = r1.m
            r0.setKodeBank(r1)
            r0 = r5
            r1 = r4
            java.lang.String r1 = r1.p
            r0.setLocalClearingCodeBank(r1)
            r0 = r5
            r1 = r4
            java.lang.String r1 = r1.n
            r0.setJenisWarkat(r1)
            r0 = r4
            java.lang.String r0 = r0.n
            java.lang.String r1 = "cek"
            r2 = 1
            boolean r0 = o.CheckOTPSessionPresenter.d(r0, r1, r2)
            if (r0 == 0) goto L_0x0059
            java.lang.String r0 = "00"
            r6 = r0
            goto L_0x005c
        L_0x0059:
            java.lang.String r0 = "10"
            r6 = r0
        L_0x005c:
            r0 = r5
            r1 = r6
            r0.setKodeJenisWarkat(r1)
            r0 = r5
            r1 = r4
            double r1 = r1.t
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            r0.setNominal(r1)
            r0 = r4
            o.getView r0 = r0.getActivity()
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L_0x0096
            r0 = r6
            o.subscribeUbahVisaCardEvent r0 = (o.subscribeUbahVisaCardEvent) r0
            com.bca.smartbranch.data.localdb.Kliring r0 = r0.m
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L_0x008c
            r0 = r6
            java.lang.String r0 = r0.getTanggalJatuhTempo()
            r7 = r0
            r0 = r7
            r6 = r0
            r0 = r7
            if (r0 != 0) goto L_0x008f
        L_0x008c:
            java.lang.String r0 = ""
            r6 = r0
        L_0x008f:
            r0 = r5
            r1 = r6
            r0.setJatuhTempo(r1)
            r0 = r5
            return r0
        L_0x0096:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r1 = r0
            java.lang.String r2 = "null cannot be cast to non-null type com.bca.smartbranch.activity.KliringActivity"
            r1.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setEmail.c():com.bca.smartbranch.data.localdb.Warkat");
    }

    public static /* synthetic */ void c(ListBankPenerbitAdapter$ListBankPenerbitAdapterVH_ViewBinding listBankPenerbitAdapter$ListBankPenerbitAdapterVH_ViewBinding, setEmail setemail, View view) {
        subscribeReservationRescheduleEvent.e(listBankPenerbitAdapter$ListBankPenerbitAdapterVH_ViewBinding, "");
        subscribeReservationRescheduleEvent.e(setemail, "");
        int i = listBankPenerbitAdapter$ListBankPenerbitAdapterVH_ViewBinding.i.b;
        if (i == 2 || i == 3) {
            setemail.d.e = HttpStatus.HTTP_INTERNAL_SERVER_ERROR;
            setMessage setmessage = setemail.d;
            setmessage.c = new RotateAnimation(-180.0f, 0.0f, 1, 0.5f, 1, 0.5f);
            setmessage.e(listBankPenerbitAdapter$ListBankPenerbitAdapterVH_ViewBinding.g);
            listBankPenerbitAdapter$ListBankPenerbitAdapterVH_ViewBinding.i.setExpanded(false, true);
            return;
        }
        setemail.d.e = HttpStatus.HTTP_INTERNAL_SERVER_ERROR;
        setMessage setmessage2 = setemail.d;
        setmessage2.c = new RotateAnimation(0.0f, -180.0f, 1, 0.5f, 1, 0.5f);
        setmessage2.e(listBankPenerbitAdapter$ListBankPenerbitAdapterVH_ViewBinding.g);
        listBankPenerbitAdapter$ListBankPenerbitAdapterVH_ViewBinding.i.setExpanded(true, true);
    }

    public static final /* synthetic */ ListBankPenerbitAdapter$ListBankPenerbitAdapterVH_ViewBinding d(setEmail setemail) {
        ListBankPenerbitAdapter$ListBankPenerbitAdapterVH_ViewBinding listBankPenerbitAdapter$ListBankPenerbitAdapterVH_ViewBinding = setemail.b;
        subscribeReservationRescheduleEvent.c(listBankPenerbitAdapter$ListBankPenerbitAdapterVH_ViewBinding);
        return listBankPenerbitAdapter$ListBankPenerbitAdapterVH_ViewBinding;
    }

    private final void d() {
        getPromotion.d(getContext());
        List<? extends TextView> list = this.h;
        List<? extends LogoutDialog_ViewBinding> list2 = null;
        List<? extends TextView> list3 = list;
        if (list == null) {
            subscribeReservationRescheduleEvent.e("");
            list3 = null;
        }
        for (TextView textView : list3) {
            textView.setVisibility(8);
        }
        list2 = this.f221o;
        if (list2 == null) {
            subscribeReservationRescheduleEvent.e("");
        }
        for (LogoutDialog_ViewBinding logoutDialog_ViewBinding : list2) {
            logoutDialog_ViewBinding.setBackgroundResource(2131230847);
        }
    }

    private final void d(Integer num) {
        RealmList<Warkat> listWarkat;
        RealmList<Warkat> listWarkat2;
        RealmList<Warkat> listWarkat3;
        LogoutDialog logoutDialog;
        EditText editText;
        EditText editText2;
        String str;
        EditText editText3;
        Editable text;
        EditText editText4;
        d();
        ArrayList arrayList = new ArrayList();
        ListBankPenerbitAdapter$ListBankPenerbitAdapterVH_ViewBinding listBankPenerbitAdapter$ListBankPenerbitAdapterVH_ViewBinding = this.b;
        subscribeReservationRescheduleEvent.c(listBankPenerbitAdapter$ListBankPenerbitAdapterVH_ViewBinding);
        boolean z = false;
        LogoutDialog logoutDialog2 = null;
        if (listBankPenerbitAdapter$ListBankPenerbitAdapterVH_ViewBinding.f.isShown()) {
            ListBankPenerbitAdapter$ListBankPenerbitAdapterVH_ViewBinding listBankPenerbitAdapter$ListBankPenerbitAdapterVH_ViewBinding2 = this.b;
            subscribeReservationRescheduleEvent.c(listBankPenerbitAdapter$ListBankPenerbitAdapterVH_ViewBinding2);
            if (listBankPenerbitAdapter$ListBankPenerbitAdapterVH_ViewBinding2.f.isEnabled()) {
                ListBankPenerbitAdapter$ListBankPenerbitAdapterVH_ViewBinding listBankPenerbitAdapter$ListBankPenerbitAdapterVH_ViewBinding3 = this.b;
                Editable text2 = (listBankPenerbitAdapter$ListBankPenerbitAdapterVH_ViewBinding3 == null || (editText4 = listBankPenerbitAdapter$ListBankPenerbitAdapterVH_ViewBinding3.f) == null) ? null : editText4.getText();
                if (text2 == null || text2.length() == 0) {
                    str = getString(2131821283);
                } else {
                    ListBankPenerbitAdapter$ListBankPenerbitAdapterVH_ViewBinding listBankPenerbitAdapter$ListBankPenerbitAdapterVH_ViewBinding4 = this.b;
                    str = ((listBankPenerbitAdapter$ListBankPenerbitAdapterVH_ViewBinding4 == null || (editText3 = listBankPenerbitAdapter$ListBankPenerbitAdapterVH_ViewBinding4.f) == null || (text = editText3.getText()) == null) ? 0 : text.length()) < 6 ? getString(2131821284) : "";
                }
                subscribeReservationRescheduleEvent.d(str, "");
                ListBankPenerbitAdapter$ListBankPenerbitAdapterVH_ViewBinding listBankPenerbitAdapter$ListBankPenerbitAdapterVH_ViewBinding5 = this.b;
                EditText editText5 = listBankPenerbitAdapter$ListBankPenerbitAdapterVH_ViewBinding5 != null ? listBankPenerbitAdapter$ListBankPenerbitAdapterVH_ViewBinding5.f : null;
                subscribeReservationRescheduleEvent.c(editText5);
                arrayList.add(Boolean.valueOf(a(editText5, 6, str)));
            }
        }
        ListBankPenerbitAdapter$ListBankPenerbitAdapterVH_ViewBinding listBankPenerbitAdapter$ListBankPenerbitAdapterVH_ViewBinding6 = this.b;
        subscribeReservationRescheduleEvent.c(listBankPenerbitAdapter$ListBankPenerbitAdapterVH_ViewBinding6);
        if (listBankPenerbitAdapter$ListBankPenerbitAdapterVH_ViewBinding6.b.isShown()) {
            ListBankPenerbitAdapter$ListBankPenerbitAdapterVH_ViewBinding listBankPenerbitAdapter$ListBankPenerbitAdapterVH_ViewBinding7 = this.b;
            subscribeReservationRescheduleEvent.c(listBankPenerbitAdapter$ListBankPenerbitAdapterVH_ViewBinding7);
            if (listBankPenerbitAdapter$ListBankPenerbitAdapterVH_ViewBinding7.b.isEnabled()) {
                ListBankPenerbitAdapter$ListBankPenerbitAdapterVH_ViewBinding listBankPenerbitAdapter$ListBankPenerbitAdapterVH_ViewBinding8 = this.b;
                Editable text3 = (listBankPenerbitAdapter$ListBankPenerbitAdapterVH_ViewBinding8 == null || (editText2 = listBankPenerbitAdapter$ListBankPenerbitAdapterVH_ViewBinding8.b) == null) ? null : editText2.getText();
                String string = text3 == null || text3.length() == 0 ? getString(2131821276) : "";
                subscribeReservationRescheduleEvent.d(string, "");
                ListBankPenerbitAdapter$ListBankPenerbitAdapterVH_ViewBinding listBankPenerbitAdapter$ListBankPenerbitAdapterVH_ViewBinding9 = this.b;
                EditText editText6 = listBankPenerbitAdapter$ListBankPenerbitAdapterVH_ViewBinding9 != null ? listBankPenerbitAdapter$ListBankPenerbitAdapterVH_ViewBinding9.b : null;
                subscribeReservationRescheduleEvent.c(editText6);
                arrayList.add(Boolean.valueOf(a(editText6, 1, string)));
            }
        }
        ListBankPenerbitAdapter$ListBankPenerbitAdapterVH_ViewBinding listBankPenerbitAdapter$ListBankPenerbitAdapterVH_ViewBinding10 = this.b;
        subscribeReservationRescheduleEvent.c(listBankPenerbitAdapter$ListBankPenerbitAdapterVH_ViewBinding10);
        if (listBankPenerbitAdapter$ListBankPenerbitAdapterVH_ViewBinding10.c.isShown()) {
            ListBankPenerbitAdapter$ListBankPenerbitAdapterVH_ViewBinding listBankPenerbitAdapter$ListBankPenerbitAdapterVH_ViewBinding11 = this.b;
            subscribeReservationRescheduleEvent.c(listBankPenerbitAdapter$ListBankPenerbitAdapterVH_ViewBinding11);
            if (listBankPenerbitAdapter$ListBankPenerbitAdapterVH_ViewBinding11.c.isEnabled()) {
                ListBankPenerbitAdapter$ListBankPenerbitAdapterVH_ViewBinding listBankPenerbitAdapter$ListBankPenerbitAdapterVH_ViewBinding12 = this.b;
                Editable text4 = (listBankPenerbitAdapter$ListBankPenerbitAdapterVH_ViewBinding12 == null || (editText = listBankPenerbitAdapter$ListBankPenerbitAdapterVH_ViewBinding12.c) == null) ? null : editText.getText();
                String string2 = text4 == null || text4.length() == 0 ? getString(2131821273) : "";
                subscribeReservationRescheduleEvent.d(string2, "");
                ListBankPenerbitAdapter$ListBankPenerbitAdapterVH_ViewBinding listBankPenerbitAdapter$ListBankPenerbitAdapterVH_ViewBinding13 = this.b;
                EditText editText7 = listBankPenerbitAdapter$ListBankPenerbitAdapterVH_ViewBinding13 != null ? listBankPenerbitAdapter$ListBankPenerbitAdapterVH_ViewBinding13.c : null;
                subscribeReservationRescheduleEvent.c(editText7);
                arrayList.add(Boolean.valueOf(a(editText7, 1, string2)));
            }
        }
        ListBankPenerbitAdapter$ListBankPenerbitAdapterVH_ViewBinding listBankPenerbitAdapter$ListBankPenerbitAdapterVH_ViewBinding14 = this.b;
        subscribeReservationRescheduleEvent.c(listBankPenerbitAdapter$ListBankPenerbitAdapterVH_ViewBinding14);
        if (listBankPenerbitAdapter$ListBankPenerbitAdapterVH_ViewBinding14.e.isShown()) {
            ListBankPenerbitAdapter$ListBankPenerbitAdapterVH_ViewBinding listBankPenerbitAdapter$ListBankPenerbitAdapterVH_ViewBinding15 = this.b;
            subscribeReservationRescheduleEvent.c(listBankPenerbitAdapter$ListBankPenerbitAdapterVH_ViewBinding15);
            if (listBankPenerbitAdapter$ListBankPenerbitAdapterVH_ViewBinding15.e.isEnabled()) {
                ListBankPenerbitAdapter$ListBankPenerbitAdapterVH_ViewBinding listBankPenerbitAdapter$ListBankPenerbitAdapterVH_ViewBinding16 = this.b;
                Editable text5 = (listBankPenerbitAdapter$ListBankPenerbitAdapterVH_ViewBinding16 == null || (logoutDialog = listBankPenerbitAdapter$ListBankPenerbitAdapterVH_ViewBinding16.e) == null) ? null : logoutDialog.getText();
                String string3 = text5 == null || text5.length() == 0 ? getString(2131821281) : this.t > 5.0E8d ? getString(2131821030) : "";
                subscribeReservationRescheduleEvent.d(string3, "");
                ListBankPenerbitAdapter$ListBankPenerbitAdapterVH_ViewBinding listBankPenerbitAdapter$ListBankPenerbitAdapterVH_ViewBinding17 = this.b;
                if (listBankPenerbitAdapter$ListBankPenerbitAdapterVH_ViewBinding17 != null) {
                    logoutDialog2 = listBankPenerbitAdapter$ListBankPenerbitAdapterVH_ViewBinding17.e;
                }
                subscribeReservationRescheduleEvent.c(logoutDialog2);
                arrayList.add(Boolean.valueOf(a((EditText) logoutDialog2, 1, string3)));
            }
        }
        ArrayList<Boolean> arrayList2 = arrayList;
        if (!arrayList2.isEmpty()) {
            for (Boolean bool : arrayList2) {
                if (!bool.booleanValue()) {
                    break;
                }
            }
        }
        z = true;
        if (z) {
            if (num == null) {
                ((subscribeUbahVisaCardEvent) requireActivity()).z.add(c());
                Kliring kliring = ((subscribeUbahVisaCardEvent) requireActivity()).m;
                if (!(kliring == null || (listWarkat3 = kliring.getListWarkat()) == null)) {
                    listWarkat3.add(c());
                }
            } else {
                ((subscribeUbahVisaCardEvent) requireActivity()).z.remove(num.intValue());
                ((subscribeUbahVisaCardEvent) requireActivity()).z.add(num.intValue(), c());
                Kliring kliring2 = ((subscribeUbahVisaCardEvent) requireActivity()).m;
                if (!(kliring2 == null || (listWarkat2 = kliring2.getListWarkat()) == null)) {
                    listWarkat2.remove(num.intValue());
                }
                Kliring kliring3 = ((subscribeUbahVisaCardEvent) requireActivity()).m;
                if (!(kliring3 == null || (listWarkat = kliring3.getListWarkat()) == null)) {
                    listWarkat.add(num.intValue(), c());
                }
            }
            ((subscribeUbahVisaCardEvent) requireActivity()).d(2131296811, new getImei(), "K2DataWarkatFragment");
        }
    }

    public static /* synthetic */ void d(setEmail setemail, View view) {
        subscribeReservationRescheduleEvent.e(setemail, "");
        ((subscribeUbahVisaCardEvent) setemail.requireActivity()).y();
    }

    public static /* synthetic */ void d(setEmail setemail, Realm realm) {
        subscribeReservationRescheduleEvent.e(setemail, "");
        subscribeUbahVisaCardEvent subscribeubahvisacardevent = (subscribeUbahVisaCardEvent) setemail.getActivity();
        if (subscribeubahvisacardevent != null) {
            RealmList<Warkat> realmList = new RealmList<>();
            ArrayList<Warkat> arrayList = subscribeubahvisacardevent.z;
            int i = 10;
            subscribeReservationRescheduleEvent.e(arrayList, "");
            if (arrayList instanceof Collection) {
                i = arrayList.size();
            }
            ArrayList arrayList2 = new ArrayList(i);
            for (Warkat warkat : arrayList) {
                arrayList2.add(Boolean.valueOf(realmList.add(warkat)));
            }
            Kliring kliring = subscribeubahvisacardevent.m;
            if (kliring != null) {
                kliring.setListWarkat(realmList);
            }
        }
    }

    public static /* synthetic */ void e(ListBankPenerbitAdapter$ListBankPenerbitAdapterVH_ViewBinding listBankPenerbitAdapter$ListBankPenerbitAdapterVH_ViewBinding, View view, boolean z) {
        double d;
        subscribeReservationRescheduleEvent.e(listBankPenerbitAdapter$ListBankPenerbitAdapterVH_ViewBinding, "");
        if (z) {
            listBankPenerbitAdapter$ListBankPenerbitAdapterVH_ViewBinding.r.setHintEnabled(true);
            return;
        }
        listBankPenerbitAdapter$ListBankPenerbitAdapterVH_ViewBinding.r.setHintEnabled(String.valueOf(listBankPenerbitAdapter$ListBankPenerbitAdapterVH_ViewBinding.e.getText()).length() > 0);
        String replace = String.valueOf(listBankPenerbitAdapter$ListBankPenerbitAdapterVH_ViewBinding.e.getText()).replace(",", "");
        LogoutDialog logoutDialog = listBankPenerbitAdapter$ListBankPenerbitAdapterVH_ViewBinding.e;
        String str = replace;
        boolean z2 = true;
        if (str != null) {
            z2 = str.length() == 0;
        }
        if (z2) {
            d = 0.0d;
        } else {
            subscribeReservationRescheduleEvent.d(replace, "");
            d = Double.parseDouble(replace);
        }
        logoutDialog.setText(getPromotion.a(String.valueOf(d)));
    }

    public static /* synthetic */ void e(setEmail setemail, View view) {
        subscribeReservationRescheduleEvent.e(setemail, "");
        setemail.d((Integer) null);
    }

    public final void b(View view) {
        subscribeReservationRescheduleEvent.e(view, "");
        List<? extends TextView> list = this.h;
        List<? extends EditText> list2 = null;
        List<? extends TextView> list3 = list;
        if (list == null) {
            subscribeReservationRescheduleEvent.e("");
            list3 = null;
        }
        List<? extends EditText> list4 = this.g;
        List<? extends EditText> list5 = list4;
        if (list4 == null) {
            subscribeReservationRescheduleEvent.e("");
            list5 = null;
        }
        subscribeReservationRescheduleEvent.e(list5, "");
        ((TextView) list3.get(list5.indexOf(view))).setVisibility(8);
        List<? extends LogoutDialog_ViewBinding> list6 = this.f221o;
        List<? extends LogoutDialog_ViewBinding> list7 = list6;
        if (list6 == null) {
            subscribeReservationRescheduleEvent.e("");
            list7 = null;
        }
        List<? extends EditText> list8 = this.g;
        List<? extends EditText> list9 = list8;
        if (list8 == null) {
            subscribeReservationRescheduleEvent.e("");
            list9 = null;
        }
        subscribeReservationRescheduleEvent.e(list9, "");
        ((LogoutDialog_ViewBinding) list7.get(list9.indexOf(view))).setBackgroundResource(2131230847);
        List<? extends LogoutDialog_ViewBinding> list10 = this.f221o;
        List<? extends LogoutDialog_ViewBinding> list11 = list10;
        if (list10 == null) {
            subscribeReservationRescheduleEvent.e("");
            list11 = null;
        }
        List<? extends EditText> list12 = this.g;
        List<? extends EditText> list13 = list12;
        if (list12 == null) {
            subscribeReservationRescheduleEvent.e("");
            list13 = null;
        }
        subscribeReservationRescheduleEvent.e(list13, "");
        EditText editText = ((LogoutDialog_ViewBinding) list11.get(list13.indexOf(view))).f;
        if (!(String.valueOf(editText != null ? editText.getText() : null).length() > 0)) {
            List<? extends LogoutDialog_ViewBinding> list14 = this.f221o;
            List<? extends LogoutDialog_ViewBinding> list15 = list14;
            if (list14 == null) {
                subscribeReservationRescheduleEvent.e("");
                list15 = null;
            }
            list2 = this.g;
            if (list2 == null) {
                subscribeReservationRescheduleEvent.e("");
            }
            subscribeReservationRescheduleEvent.e(list2, "");
            EditText editText2 = ((LogoutDialog_ViewBinding) list15.get(list2.indexOf(view))).f;
            if (editText2 != null) {
                editText2.setHintTextColor(getResources().getColor(2131099739));
            }
        }
    }

    @Override // com.bca.smartbranch.fragment.BaseFragmentKotlin
    public final void e() {
        this.c.clear();
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public final void onBackPressedEvent(clickOrangSamaDenganPemilik clickorangsamadenganpemilik) {
        getPromotion.d(getContext());
        subscribeUbahVisaCardEvent subscribeubahvisacardevent = (subscribeUbahVisaCardEvent) getActivity();
        boolean z = false;
        if (subscribeubahvisacardevent != null) {
            z = false;
            if (!subscribeubahvisacardevent.p) {
                z = true;
            }
        }
        if (z) {
            i().executeTransaction(new Realm.Transaction() { // from class: o.getTxnPurpose
                @Override // io.realm.Realm.Transaction
                public final void execute(Realm realm) {
                    setEmail.d(setEmail.this, realm);
                }
            });
        }
        ((subscribeUbahVisaCardEvent) requireActivity()).a(2131296811, new getImei(), "K2DataWarkatFragment");
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public final void onChooseBankTujuan(goDeleteAccount godeleteaccount) {
        subscribeReservationRescheduleEvent.e(godeleteaccount, "");
        ListBankPenerbitAdapter$ListBankPenerbitAdapterVH_ViewBinding listBankPenerbitAdapter$ListBankPenerbitAdapterVH_ViewBinding = this.b;
        subscribeReservationRescheduleEvent.c(listBankPenerbitAdapter$ListBankPenerbitAdapterVH_ViewBinding);
        listBankPenerbitAdapter$ListBankPenerbitAdapterVH_ViewBinding.b.setText(godeleteaccount.a);
        ListBankPenerbitAdapter$ListBankPenerbitAdapterVH_ViewBinding listBankPenerbitAdapter$ListBankPenerbitAdapterVH_ViewBinding2 = this.b;
        subscribeReservationRescheduleEvent.c(listBankPenerbitAdapter$ListBankPenerbitAdapterVH_ViewBinding2);
        listBankPenerbitAdapter$ListBankPenerbitAdapterVH_ViewBinding2.q.setHintEnabled(true);
        ListBankPenerbitAdapter$ListBankPenerbitAdapterVH_ViewBinding listBankPenerbitAdapter$ListBankPenerbitAdapterVH_ViewBinding3 = this.b;
        subscribeReservationRescheduleEvent.c(listBankPenerbitAdapter$ListBankPenerbitAdapterVH_ViewBinding3);
        EditText editText = listBankPenerbitAdapter$ListBankPenerbitAdapterVH_ViewBinding3.b;
        subscribeReservationRescheduleEvent.d(editText, "");
        b(editText);
        this.k = godeleteaccount.a;
        this.m = godeleteaccount.c;
        this.p = godeleteaccount.d;
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public final void onChooseJenisWarkat(onIsiFormReservasiEvent onisiformreservasievent) {
        subscribeReservationRescheduleEvent.e(onisiformreservasievent, "");
        ListBankPenerbitAdapter$ListBankPenerbitAdapterVH_ViewBinding listBankPenerbitAdapter$ListBankPenerbitAdapterVH_ViewBinding = this.b;
        subscribeReservationRescheduleEvent.c(listBankPenerbitAdapter$ListBankPenerbitAdapterVH_ViewBinding);
        listBankPenerbitAdapter$ListBankPenerbitAdapterVH_ViewBinding.c.setText(onisiformreservasievent.b);
        ListBankPenerbitAdapter$ListBankPenerbitAdapterVH_ViewBinding listBankPenerbitAdapter$ListBankPenerbitAdapterVH_ViewBinding2 = this.b;
        subscribeReservationRescheduleEvent.c(listBankPenerbitAdapter$ListBankPenerbitAdapterVH_ViewBinding2);
        listBankPenerbitAdapter$ListBankPenerbitAdapterVH_ViewBinding2.s.setHintEnabled(true);
        ListBankPenerbitAdapter$ListBankPenerbitAdapterVH_ViewBinding listBankPenerbitAdapter$ListBankPenerbitAdapterVH_ViewBinding3 = this.b;
        subscribeReservationRescheduleEvent.c(listBankPenerbitAdapter$ListBankPenerbitAdapterVH_ViewBinding3);
        EditText editText = listBankPenerbitAdapter$ListBankPenerbitAdapterVH_ViewBinding3.c;
        subscribeReservationRescheduleEvent.d(editText, "");
        b(editText);
        this.n = onisiformreservasievent.b;
        this.l = onisiformreservasievent.d;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        subscribeReservationRescheduleEvent.e(layoutInflater, "");
        documentProvider.b().c(this);
        View inflate = layoutInflater.inflate(2131493188, viewGroup, false);
        Button button = (Button) setRotation.a(inflate, 2131296415);
        int i = 2131297510;
        if (button != null) {
            setWeightSum setweightsum = (setWeightSum) setRotation.a(inflate, 2131296418);
            if (setweightsum != null) {
                EditText editText = (EditText) setRotation.a(inflate, 2131297005);
                if (editText != null) {
                    EditText editText2 = (EditText) setRotation.a(inflate, 2131297055);
                    if (editText2 != null) {
                        LogoutDialog a = setRotation.a(inflate, 2131297119);
                        if (a != null) {
                            EditText editText3 = (EditText) setRotation.a(inflate, 2131297129);
                            if (editText3 != null) {
                                setRequestHeaders a2 = setRotation.a(inflate, 2131297240);
                                if (a2 != null) {
                                    ImageView imageView = (ImageView) setRotation.a(inflate, 2131297359);
                                    if (imageView != null) {
                                        setDropDownHorizontalOffset setdropdownhorizontaloffset = (setDropDownHorizontalOffset) setRotation.a(inflate, 2131297405);
                                        if (setdropdownhorizontaloffset != null) {
                                            TextView textView = (TextView) setRotation.a(inflate, 2131297510);
                                            if (textView != null) {
                                                setWeightSum setweightsum2 = (setWeightSum) setRotation.a(inflate, 2131297697);
                                                if (setweightsum2 != null) {
                                                    RelativeLayout relativeLayout = (RelativeLayout) setRotation.a(inflate, 2131297830);
                                                    if (relativeLayout != null) {
                                                        TextView textView2 = (TextView) setRotation.a(inflate, 2131298086);
                                                        if (textView2 != null) {
                                                            View a3 = setRotation.a(inflate, 2131298087);
                                                            if (a3 != null) {
                                                                LogoutDialog_ViewBinding logoutDialog_ViewBinding = (LogoutDialog_ViewBinding) setRotation.a(inflate, 2131298553);
                                                                if (logoutDialog_ViewBinding != null) {
                                                                    LogoutDialog_ViewBinding logoutDialog_ViewBinding2 = (LogoutDialog_ViewBinding) setRotation.a(inflate, 2131298602);
                                                                    if (logoutDialog_ViewBinding2 != null) {
                                                                        LogoutDialog_ViewBinding logoutDialog_ViewBinding3 = (LogoutDialog_ViewBinding) setRotation.a(inflate, 2131298665);
                                                                        if (logoutDialog_ViewBinding3 != null) {
                                                                            LogoutDialog_ViewBinding logoutDialog_ViewBinding4 = (LogoutDialog_ViewBinding) setRotation.a(inflate, 2131298674);
                                                                            if (logoutDialog_ViewBinding4 != null) {
                                                                                TextView textView3 = (TextView) setRotation.a(inflate, 2131299029);
                                                                                if (textView3 != null) {
                                                                                    TextView textView4 = (TextView) setRotation.a(inflate, 2131299079);
                                                                                    if (textView4 != null) {
                                                                                        TextView textView5 = (TextView) setRotation.a(inflate, 2131299137);
                                                                                        if (textView5 != null) {
                                                                                            TextView textView6 = (TextView) setRotation.a(inflate, 2131299144);
                                                                                            if (textView6 != null) {
                                                                                                TextView textView7 = (TextView) setRotation.a(inflate, 2131299300);
                                                                                                if (textView7 != null) {
                                                                                                    ListBankPenerbitAdapter$ListBankPenerbitAdapterVH_ViewBinding listBankPenerbitAdapter$ListBankPenerbitAdapterVH_ViewBinding = new ListBankPenerbitAdapter$ListBankPenerbitAdapterVH_ViewBinding((setWeightSum) inflate, button, setweightsum, editText, editText2, a, editText3, a2, imageView, setdropdownhorizontaloffset, textView, setweightsum2, relativeLayout, textView2, a3, logoutDialog_ViewBinding, logoutDialog_ViewBinding2, logoutDialog_ViewBinding3, logoutDialog_ViewBinding4, textView3, textView4, textView5, textView6, textView7);
                                                                                                    this.b = listBankPenerbitAdapter$ListBankPenerbitAdapterVH_ViewBinding;
                                                                                                    subscribeReservationRescheduleEvent.c(listBankPenerbitAdapter$ListBankPenerbitAdapterVH_ViewBinding);
                                                                                                    setWeightSum setweightsum3 = listBankPenerbitAdapter$ListBankPenerbitAdapterVH_ViewBinding.f99o;
                                                                                                    subscribeReservationRescheduleEvent.d(setweightsum3, "");
                                                                                                    return setweightsum3;
                                                                                                }
                                                                                                i = 2131299300;
                                                                                            } else {
                                                                                                i = 2131299144;
                                                                                            }
                                                                                        } else {
                                                                                            i = 2131299137;
                                                                                        }
                                                                                    } else {
                                                                                        i = 2131299079;
                                                                                    }
                                                                                } else {
                                                                                    i = 2131299029;
                                                                                }
                                                                            } else {
                                                                                i = 2131298674;
                                                                            }
                                                                        } else {
                                                                            i = 2131298665;
                                                                        }
                                                                    } else {
                                                                        i = 2131298602;
                                                                    }
                                                                } else {
                                                                    i = 2131298553;
                                                                }
                                                            } else {
                                                                i = 2131298087;
                                                            }
                                                        } else {
                                                            i = 2131298086;
                                                        }
                                                    } else {
                                                        i = 2131297830;
                                                    }
                                                } else {
                                                    i = 2131297697;
                                                }
                                            }
                                        } else {
                                            i = 2131297405;
                                        }
                                    } else {
                                        i = 2131297359;
                                    }
                                } else {
                                    i = 2131297240;
                                }
                            } else {
                                i = 2131297129;
                            }
                        } else {
                            i = 2131297119;
                        }
                    } else {
                        i = 2131297055;
                    }
                } else {
                    i = 2131297005;
                }
            } else {
                i = 2131296418;
            }
        } else {
            i = 2131296415;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    @Override // com.bca.smartbranch.fragment.BaseFragmentKotlin, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        documentProvider.b().e(this);
        onDestroyView();
        this.b = null;
        this.c.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x007e, code lost:
        if (r0 == null) goto L_0x0081;
     */
    @Override // androidx.fragment.app.Fragment
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final void onViewCreated(android.view.View r11, android.os.Bundle r12) {
        /*
        // Method dump skipped, instructions count: 1103
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setEmail.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
