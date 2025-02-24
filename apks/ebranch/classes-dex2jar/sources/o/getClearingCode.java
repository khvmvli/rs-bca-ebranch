package o;

import android.app.Activity;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bca.smartbranch.data.api.response.GetCustAcctListResponse;
import com.bca.smartbranch.data.localdb.Kliring;
import com.bca.smartbranch.data.localdb.User;
import com.bca.smartbranch.dialog.MessageDialog;
import com.bca.smartbranch.dialog.PilihRekeningDialog;
import com.bca.smartbranch.fragment.BaseFragmentKotlin;
import com.bca.smartbranch.fragment.KliringInfoBiayaFragment;
import io.realm.Realm;
import io.realm.RealmQuery;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes-dex2jar.jar:o/getClearingCode.class */
public final class getClearingCode extends BaseFragmentKotlin {
    public static final RemoteActionCompatParcelizer e = new RemoteActionCompatParcelizer((byte) 0);
    private ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH a;
    private List<? extends EditText> b;
    public Map<Integer, View> c = new LinkedHashMap();
    private List<? extends TextView> d;
    private List<? extends LogoutDialog_ViewBinding> g;

    /* loaded from: classes-dex2jar.jar:o/getClearingCode$IconCompatParcelizer.class */
    public static final class IconCompatParcelizer implements TextWatcher {
        public IconCompatParcelizer() {
            getClearingCode.this = r4;
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            getClearingCode.a(getClearingCode.this).r.setHintEnabled(String.valueOf(editable).length() > 0);
            getClearingCode getclearingcode = getClearingCode.this;
            ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH = getclearingcode.a;
            EditText editText = listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH != null ? listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH.a : null;
            subscribeReservationRescheduleEvent.c(editText);
            getclearingcode.e(editText);
            getView activity = getClearingCode.this.getActivity();
            if (activity != null) {
                Kliring kliring = ((subscribeUbahVisaCardEvent) activity).m;
                if (kliring != null) {
                    kliring.setKodeNegara(String.valueOf(editable));
                    return;
                }
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.bca.smartbranch.activity.KliringActivity");
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* loaded from: classes-dex2jar.jar:o/getClearingCode$MediaDescriptionCompat.class */
    public static final class MediaDescriptionCompat implements TextWatcher {
        MediaDescriptionCompat() {
            getClearingCode.this = r4;
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            String valueOf = String.valueOf(editable);
            getClearingCode.a(getClearingCode.this).v.setHintEnabled(valueOf.length() > 0);
            getClearingCode getclearingcode = getClearingCode.this;
            ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH = getclearingcode.a;
            EditText editText = listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH != null ? listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH.i : null;
            subscribeReservationRescheduleEvent.c(editText);
            getclearingcode.e(editText);
            getView activity = getClearingCode.this.getActivity();
            if (activity != null) {
                Kliring kliring = ((subscribeUbahVisaCardEvent) activity).m;
                if (kliring != null) {
                    kliring.setNomorHp(valueOf);
                    return;
                }
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.bca.smartbranch.activity.KliringActivity");
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* loaded from: classes-dex2jar.jar:o/getClearingCode$MediaMetadataCompat.class */
    public static final class MediaMetadataCompat extends getIncomeAmount {
        MediaMetadataCompat() {
            getClearingCode.this = r4;
        }

        @Override // o.getIncomeAmount
        public final void b(View view) {
            ((subscribeUbahVisaCardEvent) getClearingCode.this.requireActivity()).w();
        }
    }

    /* loaded from: classes-dex2jar.jar:o/getClearingCode$RatingCompat.class */
    public static final class RatingCompat extends getIncomeAmount {
        RatingCompat() {
            getClearingCode.this = r4;
        }

        @Override // o.getIncomeAmount
        public final void b(View view) {
            getClearingCode.d(getClearingCode.this);
        }
    }

    /* loaded from: classes-dex2jar.jar:o/getClearingCode$RemoteActionCompatParcelizer.class */
    public static final class RemoteActionCompatParcelizer {
        private RemoteActionCompatParcelizer() {
        }

        public /* synthetic */ RemoteActionCompatParcelizer(byte b) {
            this();
        }
    }

    /* loaded from: classes-dex2jar.jar:o/getClearingCode$read.class */
    public static final class read implements TextWatcher {
        public read() {
            getClearingCode.this = r4;
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            getClearingCode.a(getClearingCode.this).w.setHintEnabled(String.valueOf(editable).length() > 0);
            getClearingCode getclearingcode = getClearingCode.this;
            ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH = getclearingcode.a;
            EditText editText = listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH != null ? listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH.f : null;
            subscribeReservationRescheduleEvent.c(editText);
            getclearingcode.e(editText);
            getView activity = getClearingCode.this.getActivity();
            if (activity != null) {
                Kliring kliring = ((subscribeUbahVisaCardEvent) activity).m;
                if (kliring != null) {
                    kliring.setNamaPenerima(String.valueOf(editable));
                    return;
                }
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.bca.smartbranch.activity.KliringActivity");
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* loaded from: classes-dex2jar.jar:o/getClearingCode$write.class */
    public static final class write implements TextWatcher {
        public write() {
            getClearingCode.this = r4;
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            getClearingCode.a(getClearingCode.this).s.setHintEnabled(String.valueOf(editable).length() > 0);
            getClearingCode getclearingcode = getClearingCode.this;
            ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH = getclearingcode.a;
            EditText editText = listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH != null ? listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH.c : null;
            subscribeReservationRescheduleEvent.c(editText);
            getclearingcode.e(editText);
            getView activity = getClearingCode.this.getActivity();
            if (activity != null) {
                Kliring kliring = ((subscribeUbahVisaCardEvent) activity).m;
                if (kliring != null) {
                    kliring.setNomorRekening(String.valueOf(editable));
                    return;
                }
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.bca.smartbranch.activity.KliringActivity");
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    public static final /* synthetic */ ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH a(getClearingCode getclearingcode) {
        ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH = getclearingcode.a;
        subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH);
        return listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH;
    }

    private final void a(View view, LogoutDialog_ViewBinding logoutDialog_ViewBinding, String str, boolean z) {
        TextView textView = (TextView) view;
        boolean z2 = false;
        if (z) {
            textView.setEnabled(false);
            textView.setClickable(false);
            textView.setTextColor(textView.getResources().getColor(2131099739));
            logoutDialog_ViewBinding.setHintEnabled(false);
            logoutDialog_ViewBinding.setDefaultHintTextColor(ColorStateList.valueOf(copyWindowDataInto.a(requireContext(), 2131099739)));
        }
        if (str.length() == 0) {
            z2 = true;
        }
        logoutDialog_ViewBinding.setHintEnabled(!z2);
        textView.setHintTextColor(textView.getResources().getColor(2131099739));
        EditText editText = logoutDialog_ViewBinding.f;
        if (editText != null) {
            editText.setHintTextColor(textView.getResources().getColor(2131099739));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0063, code lost:
        if ((r0.length() > 0) == true) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static /* synthetic */ void a(o.getClearingCode r3, android.view.View r4, boolean r5) {
        /*
            r0 = r3
            java.lang.String r1 = ""
            o.subscribeReservationRescheduleEvent.e(r0, r1)
            r0 = r3
            o.ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH r0 = r0.a
            r4 = r0
            r0 = r4
            if (r0 == 0) goto L_0x0017
            r0 = r4
            o.LogoutDialog_ViewBinding r0 = r0.w
            r4 = r0
            goto L_0x0019
        L_0x0017:
            r0 = 0
            r4 = r0
        L_0x0019:
            r0 = r4
            if (r0 == 0) goto L_0x006e
            r0 = 0
            r6 = r0
            r0 = r5
            if (r0 == 0) goto L_0x0028
        L_0x0023:
            r0 = 1
            r5 = r0
            goto L_0x0069
        L_0x0028:
            r0 = r3
            o.ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH r0 = r0.a
            r3 = r0
            r0 = r6
            r5 = r0
            r0 = r3
            if (r0 == 0) goto L_0x0069
            r0 = r3
            android.widget.EditText r0 = r0.f
            r3 = r0
            r0 = r6
            r5 = r0
            r0 = r3
            if (r0 == 0) goto L_0x0069
            r0 = r3
            android.text.Editable r0 = r0.getText()
            r3 = r0
            r0 = r6
            r5 = r0
            r0 = r3
            if (r0 == 0) goto L_0x0069
            r0 = r3
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x005b
            r0 = 1
            r7 = r0
            goto L_0x005e
        L_0x005b:
            r0 = 0
            r7 = r0
        L_0x005e:
            r0 = r6
            r5 = r0
            r0 = r7
            r1 = 1
            if (r0 != r1) goto L_0x0069
            goto L_0x0023
        L_0x0069:
            r0 = r4
            r1 = r5
            r0.setHintEnabled(r1)
        L_0x006e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getClearingCode.a(o.getClearingCode, android.view.View, boolean):void");
    }

    public static /* synthetic */ void a(getClearingCode getclearingcode, Realm realm) {
        Kliring kliring;
        subscribeReservationRescheduleEvent.e(getclearingcode, "");
        RealmQuery where = getclearingcode.i().where(Kliring.class);
        subscribeUbahVisaCardEvent subscribeubahvisacardevent = (subscribeUbahVisaCardEvent) getclearingcode.requireActivity();
        Kliring kliring2 = (Kliring) where.equalTo("id", (subscribeubahvisacardevent == null || (kliring = subscribeubahvisacardevent.m) == null) ? null : Long.valueOf(kliring.getId())).findFirst();
        if (kliring2 != null && kliring2.isValid()) {
            kliring2.deleteFromRealm();
            documentProvider.b().d(new BahasaLayananAdapter$BahasaLayananVH());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003d, code lost:
        if (((java.lang.Boolean) ((o.subscribeUbahVisaCardEvent) r0).u.d()).booleanValue() == false) goto L_0x005e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    private final boolean a() {
        /*
            r4 = this;
            r0 = r4
            com.bca.smartbranch.data.localdb.User r0 = r0.g()
            java.lang.String r0 = r0.getVerified()
            java.lang.String r1 = "Y"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x005e
            r0 = r4
            o.getView r0 = r0.getActivity()
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L_0x0053
            r0 = r5
            o.subscribeUbahVisaCardEvent r0 = (o.subscribeUbahVisaCardEvent) r0
            com.bca.smartbranch.data.localdb.Kliring r0 = r0.f
            if (r0 == 0) goto L_0x004e
            r0 = r4
            o.getView r0 = r0.getActivity()
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L_0x0043
            r0 = r5
            o.subscribeUbahVisaCardEvent r0 = (o.subscribeUbahVisaCardEvent) r0
            o.onChooseValueSumberPenghasilan r0 = r0.u
            java.lang.Object r0 = r0.d()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x004e
            goto L_0x005e
        L_0x0043:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r1 = r0
            java.lang.String r2 = "null cannot be cast to non-null type com.bca.smartbranch.activity.KliringActivity"
            r1.<init>(r2)
            throw r0
        L_0x004e:
            r0 = 0
            r6 = r0
            goto L_0x0060
        L_0x0053:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r1 = r0
            java.lang.String r2 = "null cannot be cast to non-null type com.bca.smartbranch.activity.KliringActivity"
            r1.<init>(r2)
            throw r0
        L_0x005e:
            r0 = 1
            r6 = r0
        L_0x0060:
            r0 = r6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getClearingCode.a():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0063, code lost:
        if ((r0.length() > 0) == true) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static /* synthetic */ void b(o.getClearingCode r3, android.view.View r4, boolean r5) {
        /*
            r0 = r3
            java.lang.String r1 = ""
            o.subscribeReservationRescheduleEvent.e(r0, r1)
            r0 = r3
            o.ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH r0 = r0.a
            r4 = r0
            r0 = r4
            if (r0 == 0) goto L_0x0017
            r0 = r4
            o.LogoutDialog_ViewBinding r0 = r0.v
            r4 = r0
            goto L_0x0019
        L_0x0017:
            r0 = 0
            r4 = r0
        L_0x0019:
            r0 = r4
            if (r0 == 0) goto L_0x006e
            r0 = 0
            r6 = r0
            r0 = r5
            if (r0 == 0) goto L_0x0028
        L_0x0023:
            r0 = 1
            r5 = r0
            goto L_0x0069
        L_0x0028:
            r0 = r3
            o.ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH r0 = r0.a
            r3 = r0
            r0 = r6
            r5 = r0
            r0 = r3
            if (r0 == 0) goto L_0x0069
            r0 = r3
            android.widget.EditText r0 = r0.i
            r3 = r0
            r0 = r6
            r5 = r0
            r0 = r3
            if (r0 == 0) goto L_0x0069
            r0 = r3
            android.text.Editable r0 = r0.getText()
            r3 = r0
            r0 = r6
            r5 = r0
            r0 = r3
            if (r0 == 0) goto L_0x0069
            r0 = r3
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x005b
            r0 = 1
            r7 = r0
            goto L_0x005e
        L_0x005b:
            r0 = 0
            r7 = r0
        L_0x005e:
            r0 = r6
            r5 = r0
            r0 = r7
            r1 = 1
            if (r0 != r1) goto L_0x0069
            goto L_0x0023
        L_0x0069:
            r0 = r4
            r1 = r5
            r0.setHintEnabled(r1)
        L_0x006e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getClearingCode.b(o.getClearingCode, android.view.View, boolean):void");
    }

    private boolean b(EditText editText, int i, String str) {
        subscribeReservationRescheduleEvent.e(editText, "");
        subscribeReservationRescheduleEvent.e(str, "");
        subscribeUbahVisaCardEvent subscribeubahvisacardevent = (subscribeUbahVisaCardEvent) requireActivity();
        List<? extends TextView> list = this.d;
        List<? extends TextView> list2 = list;
        if (list == null) {
            subscribeReservationRescheduleEvent.e("");
            list2 = null;
        }
        List<? extends LogoutDialog_ViewBinding> list3 = this.g;
        List<? extends LogoutDialog_ViewBinding> list4 = list3;
        if (list3 == null) {
            subscribeReservationRescheduleEvent.e("");
            list4 = null;
        }
        List<? extends EditText> list5 = this.b;
        List<? extends EditText> list6 = list5;
        if (list5 == null) {
            subscribeReservationRescheduleEvent.e("");
            list6 = null;
        }
        return subscribeubahvisacardevent.d(list2, list4, list6, editText, i, str);
    }

    private static void c(ResetAccountActivity_ViewBinding resetAccountActivity_ViewBinding) {
        documentProvider.b().d(resetAccountActivity_ViewBinding);
    }

    public static final /* synthetic */ void c(getClearingCode getclearingcode) {
        Bundle bundle = new Bundle();
        bundle.putString("MessageDialogContent", getclearingcode.getString(2131821729));
        MessageDialog messageDialog = new MessageDialog();
        messageDialog.setArguments(bundle);
        messageDialog.show(getclearingcode.getParentFragmentManager(), "MessageDialog");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0063, code lost:
        if ((r0.length() > 0) == true) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static /* synthetic */ void c(o.getClearingCode r3, android.view.View r4, boolean r5) {
        /*
            r0 = r3
            java.lang.String r1 = ""
            o.subscribeReservationRescheduleEvent.e(r0, r1)
            r0 = r3
            o.ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH r0 = r0.a
            r4 = r0
            r0 = r4
            if (r0 == 0) goto L_0x0017
            r0 = r4
            o.LogoutDialog_ViewBinding r0 = r0.q
            r4 = r0
            goto L_0x0019
        L_0x0017:
            r0 = 0
            r4 = r0
        L_0x0019:
            r0 = r4
            if (r0 == 0) goto L_0x006e
            r0 = 0
            r6 = r0
            r0 = r5
            if (r0 == 0) goto L_0x0028
        L_0x0023:
            r0 = 1
            r5 = r0
            goto L_0x0069
        L_0x0028:
            r0 = r3
            o.ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH r0 = r0.a
            r3 = r0
            r0 = r6
            r5 = r0
            r0 = r3
            if (r0 == 0) goto L_0x0069
            r0 = r3
            android.widget.EditText r0 = r0.e
            r3 = r0
            r0 = r6
            r5 = r0
            r0 = r3
            if (r0 == 0) goto L_0x0069
            r0 = r3
            android.text.Editable r0 = r0.getText()
            r3 = r0
            r0 = r6
            r5 = r0
            r0 = r3
            if (r0 == 0) goto L_0x0069
            r0 = r3
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x005b
            r0 = 1
            r7 = r0
            goto L_0x005e
        L_0x005b:
            r0 = 0
            r7 = r0
        L_0x005e:
            r0 = r6
            r5 = r0
            r0 = r7
            r1 = 1
            if (r0 != r1) goto L_0x0069
            goto L_0x0023
        L_0x0069:
            r0 = r4
            r1 = r5
            r0.setHintEnabled(r1)
        L_0x006e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getClearingCode.c(o.getClearingCode, android.view.View, boolean):void");
    }

    public static final /* synthetic */ void d(getClearingCode getclearingcode) {
        int i;
        EditText editText;
        EditText editText2;
        EditText editText3;
        EditText editText4;
        String str;
        EditText editText5;
        EditText editText6;
        EditText editText7;
        EditText editText8;
        EditText editText9;
        EditText editText10;
        String str2;
        EditText editText11;
        Editable text;
        EditText editText12;
        EditText editText13;
        getPromotion.d(getclearingcode.getContext());
        List<? extends TextView> list = getclearingcode.d;
        EditText editText14 = null;
        List<? extends TextView> list2 = list;
        if (list == null) {
            subscribeReservationRescheduleEvent.e("");
            list2 = null;
        }
        Iterator<? extends TextView> it = list2.iterator();
        while (true) {
            i = 8;
            if (!it.hasNext()) {
                break;
            }
            ((TextView) it.next()).setVisibility(8);
        }
        List<? extends LogoutDialog_ViewBinding> list3 = getclearingcode.g;
        List<? extends LogoutDialog_ViewBinding> list4 = list3;
        if (list3 == null) {
            subscribeReservationRescheduleEvent.e("");
            list4 = null;
        }
        for (LogoutDialog_ViewBinding logoutDialog_ViewBinding : list4) {
            logoutDialog_ViewBinding.setBackgroundResource(2131230847);
        }
        ArrayList arrayList = new ArrayList();
        ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH = getclearingcode.a;
        subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH);
        boolean z = false;
        if (listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH.f.isShown()) {
            ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH2 = getclearingcode.a;
            subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH2);
            if (listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH2.f.isEnabled()) {
                ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH3 = getclearingcode.a;
                Editable text2 = (listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH3 == null || (editText13 = listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH3.f) == null) ? null : editText13.getText();
                String string = text2 == null || text2.length() == 0 ? getclearingcode.getString(2131821277) : "";
                subscribeReservationRescheduleEvent.d(string, "");
                ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH4 = getclearingcode.a;
                EditText editText15 = listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH4 != null ? listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH4.f : null;
                subscribeReservationRescheduleEvent.c(editText15);
                arrayList.add(Boolean.valueOf(getclearingcode.b(editText15, 1, string)));
            }
        }
        ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH5 = getclearingcode.a;
        subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH5);
        if (listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH5.c.isShown()) {
            ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH6 = getclearingcode.a;
            subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH6);
            if (listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH6.c.isEnabled()) {
                ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH7 = getclearingcode.a;
                Editable text3 = (listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH7 == null || (editText12 = listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH7.c) == null) ? null : editText12.getText();
                if (text3 == null || text3.length() == 0) {
                    str2 = getclearingcode.getString(2131821280);
                } else {
                    ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH8 = getclearingcode.a;
                    str2 = ((listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH8 == null || (editText11 = listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH8.c) == null || (text = editText11.getText()) == null) ? 0 : text.length()) < 10 ? getclearingcode.getString(2131821279) : "";
                }
                subscribeReservationRescheduleEvent.d(str2, "");
                ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH9 = getclearingcode.a;
                EditText editText16 = listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH9 != null ? listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH9.c : null;
                subscribeReservationRescheduleEvent.c(editText16);
                arrayList.add(Boolean.valueOf(getclearingcode.b(editText16, 10, str2)));
            }
        }
        ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH10 = getclearingcode.a;
        subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH10);
        if (listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH10.a.isShown()) {
            ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH11 = getclearingcode.a;
            subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH11);
            if (listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH11.a.isEnabled()) {
                ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH12 = getclearingcode.a;
                Editable text4 = (listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH12 == null || (editText10 = listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH12.a) == null) ? null : editText10.getText();
                String string2 = text4 == null || text4.length() == 0 ? getclearingcode.getString(2131821275) : "";
                subscribeReservationRescheduleEvent.d(string2, "");
                ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH13 = getclearingcode.a;
                EditText editText17 = listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH13 != null ? listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH13.a : null;
                subscribeReservationRescheduleEvent.c(editText17);
                arrayList.add(Boolean.valueOf(getclearingcode.b(editText17, 1, string2)));
            }
        }
        ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH14 = getclearingcode.a;
        subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH14);
        if (listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH14.i.isShown()) {
            ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH15 = getclearingcode.a;
            subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH15);
            if (listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH15.i.isEnabled()) {
                ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH16 = getclearingcode.a;
                Editable text5 = (listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH16 == null || (editText9 = listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH16.i) == null) ? null : editText9.getText();
                if (text5 == null || text5.length() == 0) {
                    str = getclearingcode.getString(2131821278);
                } else {
                    ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH17 = getclearingcode.a;
                    Editable text6 = (listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH17 == null || (editText8 = listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH17.i) == null) ? null : editText8.getText();
                    subscribeReservationRescheduleEvent.c(text6);
                    if (text6.length() < 6) {
                        str = getclearingcode.getString(2131820905);
                    } else {
                        ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH18 = getclearingcode.a;
                        String valueOf = String.valueOf((listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH18 == null || (editText7 = listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH18.i) == null) ? null : editText7.getText());
                        if (valueOf == null ? false : !valueOf.matches("[0-9]+")) {
                            str = getclearingcode.getString(2131820962);
                        } else {
                            ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH19 = getclearingcode.a;
                            if (getPromotion.f(String.valueOf((listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH19 == null || (editText6 = listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH19.i) == null) ? null : editText6.getText()))) {
                                str = getclearingcode.getString(2131820903);
                            } else {
                                ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH20 = getclearingcode.a;
                                Boolean l = getPromotion.l(String.valueOf((listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH20 == null || (editText5 = listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH20.i) == null) ? null : editText5.getText()));
                                subscribeReservationRescheduleEvent.d(l, "");
                                str = l.booleanValue() ? getclearingcode.getString(2131820903) : "";
                            }
                        }
                    }
                }
                subscribeReservationRescheduleEvent.d(str, "");
                ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH21 = getclearingcode.a;
                EditText editText18 = listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH21 != null ? listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH21.i : null;
                subscribeReservationRescheduleEvent.c(editText18);
                arrayList.add(Boolean.valueOf(getclearingcode.b(editText18, 6, str)));
            }
        }
        ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH22 = getclearingcode.a;
        subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH22);
        if (listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH22.e.isShown()) {
            ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH23 = getclearingcode.a;
            subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH23);
            if (listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH23.e.isEnabled()) {
                arrayList.add(Boolean.TRUE);
            }
        }
        ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH24 = getclearingcode.a;
        subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH24);
        if (listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH24.j.isShown()) {
            ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH25 = getclearingcode.a;
            subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH25);
            if (listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH25.j.isEnabled()) {
                ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH26 = getclearingcode.a;
                Editable text7 = (listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH26 == null || (editText4 = listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH26.j) == null) ? null : editText4.getText();
                String string3 = text7 == null || text7.length() == 0 ? getclearingcode.getString(2131821272) : "";
                subscribeReservationRescheduleEvent.d(string3, "");
                ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH27 = getclearingcode.a;
                EditText editText19 = listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH27 != null ? listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH27.j : null;
                subscribeReservationRescheduleEvent.c(editText19);
                arrayList.add(Boolean.valueOf(getclearingcode.b(editText19, 1, string3)));
            }
        }
        ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH28 = getclearingcode.a;
        subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH28);
        if (listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH28.h.isShown()) {
            ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH29 = getclearingcode.a;
            subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH29);
            if (listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH29.h.isEnabled()) {
                ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH30 = getclearingcode.a;
                subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH30);
                LogoutDialog_ViewBinding logoutDialog_ViewBinding2 = listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH30.u;
                subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding2, "");
                LogoutDialog_ViewBinding logoutDialog_ViewBinding3 = logoutDialog_ViewBinding2;
                ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH31 = getclearingcode.a;
                subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH31);
                Editable text8 = listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH31.h.getText();
                logoutDialog_ViewBinding3.setVisibility((text8 == null || text8.length() == 0) ^ true ? 0 : 8);
                ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH32 = getclearingcode.a;
                subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH32);
                LogoutDialog_ViewBinding logoutDialog_ViewBinding4 = listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH32.C;
                subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding4, "");
                LogoutDialog_ViewBinding logoutDialog_ViewBinding5 = logoutDialog_ViewBinding4;
                ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH33 = getclearingcode.a;
                subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH33);
                Editable text9 = listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH33.h.getText();
                if (!(text9 == null || text9.length() == 0)) {
                    i = 0;
                }
                logoutDialog_ViewBinding5.setVisibility(i);
                ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH34 = getclearingcode.a;
                Editable text10 = (listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH34 == null || (editText3 = listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH34.h) == null) ? null : editText3.getText();
                String string4 = text10 == null || text10.length() == 0 ? getclearingcode.getString(2131821285) : "";
                subscribeReservationRescheduleEvent.d(string4, "");
                ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH35 = getclearingcode.a;
                EditText editText20 = listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH35 != null ? listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH35.h : null;
                subscribeReservationRescheduleEvent.c(editText20);
                arrayList.add(Boolean.valueOf(getclearingcode.b(editText20, 1, string4)));
            }
        }
        ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH36 = getclearingcode.a;
        subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH36);
        if (listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH36.g.isShown()) {
            ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH37 = getclearingcode.a;
            subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH37);
            if (listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH37.g.isEnabled()) {
                ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH38 = getclearingcode.a;
                Editable text11 = (listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH38 == null || (editText2 = listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH38.g) == null) ? null : editText2.getText();
                String string5 = text11 == null || text11.length() == 0 ? getclearingcode.getString(2131821274) : "";
                subscribeReservationRescheduleEvent.d(string5, "");
                ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH39 = getclearingcode.a;
                EditText editText21 = listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH39 != null ? listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH39.g : null;
                subscribeReservationRescheduleEvent.c(editText21);
                arrayList.add(Boolean.valueOf(getclearingcode.b(editText21, 1, string5)));
            }
        }
        ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH40 = getclearingcode.a;
        subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH40);
        if (listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH40.k.isShown()) {
            ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH41 = getclearingcode.a;
            subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH41);
            if (listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH41.k.isEnabled()) {
                ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH42 = getclearingcode.a;
                Editable text12 = (listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH42 == null || (editText = listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH42.k) == null) ? null : editText.getText();
                String string6 = text12 == null || text12.length() == 0 ? getclearingcode.getString(2131821286) : "";
                subscribeReservationRescheduleEvent.d(string6, "");
                ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH43 = getclearingcode.a;
                if (listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH43 != null) {
                    editText14 = listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH43.k;
                }
                subscribeReservationRescheduleEvent.c(editText14);
                arrayList.add(Boolean.valueOf(getclearingcode.b(editText14, 1, string6)));
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
            getView activity = getclearingcode.getActivity();
            if (activity != null) {
                ((subscribeUbahVisaCardEvent) activity).r();
                getView activity2 = getclearingcode.getActivity();
                if (activity2 != null) {
                    ((subscribeUbahVisaCardEvent) activity2).d(2131296811, new getImei(), "K2DataWarkatFragment");
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type com.bca.smartbranch.activity.KliringActivity");
            }
            throw new NullPointerException("null cannot be cast to non-null type com.bca.smartbranch.activity.KliringActivity");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0063, code lost:
        if ((r0.length() > 0) == true) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static /* synthetic */ void d(o.getClearingCode r3, android.view.View r4, boolean r5) {
        /*
            r0 = r3
            java.lang.String r1 = ""
            o.subscribeReservationRescheduleEvent.e(r0, r1)
            r0 = r3
            o.ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH r0 = r0.a
            r4 = r0
            r0 = r4
            if (r0 == 0) goto L_0x0017
            r0 = r4
            o.LogoutDialog_ViewBinding r0 = r0.s
            r4 = r0
            goto L_0x0019
        L_0x0017:
            r0 = 0
            r4 = r0
        L_0x0019:
            r0 = r4
            if (r0 == 0) goto L_0x006e
            r0 = 0
            r6 = r0
            r0 = r5
            if (r0 == 0) goto L_0x0028
        L_0x0023:
            r0 = 1
            r5 = r0
            goto L_0x0069
        L_0x0028:
            r0 = r3
            o.ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH r0 = r0.a
            r3 = r0
            r0 = r6
            r5 = r0
            r0 = r3
            if (r0 == 0) goto L_0x0069
            r0 = r3
            android.widget.EditText r0 = r0.c
            r3 = r0
            r0 = r6
            r5 = r0
            r0 = r3
            if (r0 == 0) goto L_0x0069
            r0 = r3
            android.text.Editable r0 = r0.getText()
            r3 = r0
            r0 = r6
            r5 = r0
            r0 = r3
            if (r0 == 0) goto L_0x0069
            r0 = r3
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x005b
            r0 = 1
            r7 = r0
            goto L_0x005e
        L_0x005b:
            r0 = 0
            r7 = r0
        L_0x005e:
            r0 = r6
            r5 = r0
            r0 = r7
            r1 = 1
            if (r0 != r1) goto L_0x0069
            goto L_0x0023
        L_0x0069:
            r0 = r4
            r1 = r5
            r0.setHintEnabled(r1)
        L_0x006e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getClearingCode.d(o.getClearingCode, android.view.View, boolean):void");
    }

    public static final /* synthetic */ void e(getClearingCode getclearingcode) {
        String str;
        List<GetCustAcctListResponse.AccountData> accountList;
        GetCustAcctListResponse.AccountData accountData;
        Bundle bundle = new Bundle();
        bundle.putString("PilihRekeningDialogTitle", getclearingcode.requireActivity().getResources().getString(2131822258));
        PilihRekeningDialog pilihRekeningDialog = new PilihRekeningDialog();
        pilihRekeningDialog.e = ((subscribeUbahVisaCardEvent) getclearingcode.requireActivity()).v;
        pilihRekeningDialog.setArguments(bundle);
        ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH = getclearingcode.a;
        subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH);
        Editable text = listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH.c.getText();
        if (text == null || text.length() == 0) {
            GetCustAcctListResponse getCustAcctListResponse = ((subscribeUbahVisaCardEvent) getclearingcode.requireActivity()).v;
            str = (getCustAcctListResponse == null || (accountList = getCustAcctListResponse.getAccountList()) == null || (accountData = accountList.get(0)) == null) ? null : accountData.getAccountNumber();
        } else {
            ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH2 = getclearingcode.a;
            subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH2);
            str = listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH2.c.getText().toString();
        }
        pilihRekeningDialog.c = str;
        pilihRekeningDialog.show(getclearingcode.getParentFragmentManager(), "PilihRekeningDialog");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0063, code lost:
        if ((r0.length() > 0) == true) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static /* synthetic */ void e(o.getClearingCode r3, android.view.View r4, boolean r5) {
        /*
            r0 = r3
            java.lang.String r1 = ""
            o.subscribeReservationRescheduleEvent.e(r0, r1)
            r0 = r3
            o.ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH r0 = r0.a
            r4 = r0
            r0 = r4
            if (r0 == 0) goto L_0x0017
            r0 = r4
            o.LogoutDialog_ViewBinding r0 = r0.r
            r4 = r0
            goto L_0x0019
        L_0x0017:
            r0 = 0
            r4 = r0
        L_0x0019:
            r0 = r4
            if (r0 == 0) goto L_0x006e
            r0 = 0
            r6 = r0
            r0 = r5
            if (r0 == 0) goto L_0x0028
        L_0x0023:
            r0 = 1
            r5 = r0
            goto L_0x0069
        L_0x0028:
            r0 = r3
            o.ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH r0 = r0.a
            r3 = r0
            r0 = r6
            r5 = r0
            r0 = r3
            if (r0 == 0) goto L_0x0069
            r0 = r3
            android.widget.EditText r0 = r0.a
            r3 = r0
            r0 = r6
            r5 = r0
            r0 = r3
            if (r0 == 0) goto L_0x0069
            r0 = r3
            android.text.Editable r0 = r0.getText()
            r3 = r0
            r0 = r6
            r5 = r0
            r0 = r3
            if (r0 == 0) goto L_0x0069
            r0 = r3
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x005b
            r0 = 1
            r7 = r0
            goto L_0x005e
        L_0x005b:
            r0 = 0
            r7 = r0
        L_0x005e:
            r0 = r6
            r5 = r0
            r0 = r7
            r1 = 1
            if (r0 != r1) goto L_0x0069
            goto L_0x0023
        L_0x0069:
            r0 = r4
            r1 = r5
            r0.setHintEnabled(r1)
        L_0x006e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getClearingCode.e(o.getClearingCode, android.view.View, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0063, code lost:
        if ((r0.length() > 0) == true) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static /* synthetic */ void i(o.getClearingCode r3, android.view.View r4, boolean r5) {
        /*
            r0 = r3
            java.lang.String r1 = ""
            o.subscribeReservationRescheduleEvent.e(r0, r1)
            r0 = r3
            o.ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH r0 = r0.a
            r4 = r0
            r0 = r4
            if (r0 == 0) goto L_0x0017
            r0 = r4
            o.LogoutDialog_ViewBinding r0 = r0.C
            r4 = r0
            goto L_0x0019
        L_0x0017:
            r0 = 0
            r4 = r0
        L_0x0019:
            r0 = r4
            if (r0 == 0) goto L_0x006e
            r0 = 0
            r6 = r0
            r0 = r5
            if (r0 == 0) goto L_0x0028
        L_0x0023:
            r0 = 1
            r5 = r0
            goto L_0x0069
        L_0x0028:
            r0 = r3
            o.ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH r0 = r0.a
            r3 = r0
            r0 = r6
            r5 = r0
            r0 = r3
            if (r0 == 0) goto L_0x0069
            r0 = r3
            android.widget.EditText r0 = r0.k
            r3 = r0
            r0 = r6
            r5 = r0
            r0 = r3
            if (r0 == 0) goto L_0x0069
            r0 = r3
            android.text.Editable r0 = r0.getText()
            r3 = r0
            r0 = r6
            r5 = r0
            r0 = r3
            if (r0 == 0) goto L_0x0069
            r0 = r3
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x005b
            r0 = 1
            r7 = r0
            goto L_0x005e
        L_0x005b:
            r0 = 0
            r7 = r0
        L_0x005e:
            r0 = r6
            r5 = r0
            r0 = r7
            r1 = 1
            if (r0 != r1) goto L_0x0069
            goto L_0x0023
        L_0x0069:
            r0 = r4
            r1 = r5
            r0.setHintEnabled(r1)
        L_0x006e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getClearingCode.i(o.getClearingCode, android.view.View, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0063, code lost:
        if ((r0.length() > 0) == true) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static /* synthetic */ void j(o.getClearingCode r3, android.view.View r4, boolean r5) {
        /*
            r0 = r3
            java.lang.String r1 = ""
            o.subscribeReservationRescheduleEvent.e(r0, r1)
            r0 = r3
            o.ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH r0 = r0.a
            r4 = r0
            r0 = r4
            if (r0 == 0) goto L_0x0017
            r0 = r4
            o.LogoutDialog_ViewBinding r0 = r0.u
            r4 = r0
            goto L_0x0019
        L_0x0017:
            r0 = 0
            r4 = r0
        L_0x0019:
            r0 = r4
            if (r0 == 0) goto L_0x006e
            r0 = 0
            r6 = r0
            r0 = r5
            if (r0 == 0) goto L_0x0028
        L_0x0023:
            r0 = 1
            r5 = r0
            goto L_0x0069
        L_0x0028:
            r0 = r3
            o.ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH r0 = r0.a
            r3 = r0
            r0 = r6
            r5 = r0
            r0 = r3
            if (r0 == 0) goto L_0x0069
            r0 = r3
            android.widget.EditText r0 = r0.g
            r3 = r0
            r0 = r6
            r5 = r0
            r0 = r3
            if (r0 == 0) goto L_0x0069
            r0 = r3
            android.text.Editable r0 = r0.getText()
            r3 = r0
            r0 = r6
            r5 = r0
            r0 = r3
            if (r0 == 0) goto L_0x0069
            r0 = r3
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x005b
            r0 = 1
            r7 = r0
            goto L_0x005e
        L_0x005b:
            r0 = 0
            r7 = r0
        L_0x005e:
            r0 = r6
            r5 = r0
            r0 = r7
            r1 = 1
            if (r0 != r1) goto L_0x0069
            goto L_0x0023
        L_0x0069:
            r0 = r4
            r1 = r5
            r0.setHintEnabled(r1)
        L_0x006e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getClearingCode.j(o.getClearingCode, android.view.View, boolean):void");
    }

    @Override // com.bca.smartbranch.fragment.BaseFragmentKotlin
    public final void e() {
        this.c.clear();
    }

    public final void e(View view) {
        subscribeReservationRescheduleEvent.e(view, "");
        List<? extends TextView> list = this.d;
        List<? extends EditText> list2 = null;
        List<? extends TextView> list3 = list;
        if (list == null) {
            subscribeReservationRescheduleEvent.e("");
            list3 = null;
        }
        List<? extends EditText> list4 = this.b;
        List<? extends EditText> list5 = list4;
        if (list4 == null) {
            subscribeReservationRescheduleEvent.e("");
            list5 = null;
        }
        subscribeReservationRescheduleEvent.e(list5, "");
        ((TextView) list3.get(list5.indexOf(view))).setVisibility(8);
        List<? extends LogoutDialog_ViewBinding> list6 = this.g;
        List<? extends LogoutDialog_ViewBinding> list7 = list6;
        if (list6 == null) {
            subscribeReservationRescheduleEvent.e("");
            list7 = null;
        }
        List<? extends EditText> list8 = this.b;
        List<? extends EditText> list9 = list8;
        if (list8 == null) {
            subscribeReservationRescheduleEvent.e("");
            list9 = null;
        }
        subscribeReservationRescheduleEvent.e(list9, "");
        ((LogoutDialog_ViewBinding) list7.get(list9.indexOf(view))).setBackgroundResource(2131230847);
        List<? extends LogoutDialog_ViewBinding> list10 = this.g;
        List<? extends LogoutDialog_ViewBinding> list11 = list10;
        if (list10 == null) {
            subscribeReservationRescheduleEvent.e("");
            list11 = null;
        }
        List<? extends EditText> list12 = this.b;
        List<? extends EditText> list13 = list12;
        if (list12 == null) {
            subscribeReservationRescheduleEvent.e("");
            list13 = null;
        }
        subscribeReservationRescheduleEvent.e(list13, "");
        EditText editText = ((LogoutDialog_ViewBinding) list11.get(list13.indexOf(view))).f;
        if (!(String.valueOf(editText != null ? editText.getText() : null).length() > 0)) {
            List<? extends LogoutDialog_ViewBinding> list14 = this.g;
            List<? extends LogoutDialog_ViewBinding> list15 = list14;
            if (list14 == null) {
                subscribeReservationRescheduleEvent.e("");
                list15 = null;
            }
            list2 = this.b;
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

    @Stetho$Initializer$RealSocketHandlerFactory
    public final void onBackPressedEvent(clickOrangSamaDenganPemilik clickorangsamadenganpemilik) {
        getPromotion.d(requireContext());
        subscribeUbahVisaCardEvent subscribeubahvisacardevent = (subscribeUbahVisaCardEvent) requireActivity();
        boolean z = false;
        if (subscribeubahvisacardevent != null) {
            z = false;
            if (!subscribeubahvisacardevent.p) {
                z = true;
            }
        }
        if (z) {
            i().executeTransaction(new Realm.Transaction() { // from class: o.setWarkat_type
                @Override // io.realm.Realm.Transaction
                public final void execute(Realm realm) {
                    getClearingCode.a(getClearingCode.this, realm);
                }
            });
        }
        setOnHierarchyChangeListener.a((Activity) requireActivity());
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public final void onChooseSumberDana(ReservasiROSuccessActivity reservasiROSuccessActivity) {
        subscribeReservationRescheduleEvent.e(reservasiROSuccessActivity, "");
        ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH = this.a;
        EditText editText = listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH != null ? listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH.c : null;
        subscribeReservationRescheduleEvent.c(editText);
        e(editText);
        String str = reservasiROSuccessActivity.d;
        subscribeReservationRescheduleEvent.d(str, "");
        if (!(str.length() == 0)) {
            ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH2 = this.a;
            subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH2);
            listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH2.s.setVisibility(0);
            String str2 = reservasiROSuccessActivity.d;
            subscribeReservationRescheduleEvent.d(str2, "");
            Object[] array = CheckOTPSessionPresenter.d((CharSequence) str2, new String[]{"-"}, false, 0).toArray(new String[0]);
            subscribeReservationRescheduleEvent.c(array);
            String[] strArr = (String[]) array;
            ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH3 = this.a;
            subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH3);
            EditText editText2 = listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH3.c;
            String str3 = strArr[0];
            int length = str3.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                boolean z2 = subscribeReservationRescheduleEvent.d(str3.charAt(!z ? i : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    }
                    length--;
                } else if (!z2) {
                    z = true;
                } else {
                    i++;
                }
            }
            editText2.setText(str3.subSequence(i, length + 1).toString());
            getView activity = getActivity();
            if (activity != null) {
                Kliring kliring = ((subscribeUbahVisaCardEvent) activity).m;
                if (kliring != null) {
                    String str4 = strArr[0];
                    int length2 = str4.length() - 1;
                    int i2 = 0;
                    boolean z3 = false;
                    while (i2 <= length2) {
                        boolean z4 = subscribeReservationRescheduleEvent.d(str4.charAt(!z3 ? i2 : length2), 32) <= 0;
                        if (z3) {
                            if (!z4) {
                                break;
                            }
                            length2--;
                        } else if (!z4) {
                            z3 = true;
                        } else {
                            i2++;
                        }
                    }
                    kliring.setNomorRekening(str4.subSequence(i2, length2 + 1).toString());
                }
                if (CheckOTPSessionPresenter.d((CharSequence) strArr[1], (CharSequence) "GIRO", true)) {
                    getView activity2 = getActivity();
                    if (activity2 != null) {
                        Kliring kliring2 = ((subscribeUbahVisaCardEvent) activity2).m;
                        if (kliring2 != null) {
                            kliring2.setAccType("GIRO");
                        }
                        getView activity3 = getActivity();
                        if (activity3 != null) {
                            Kliring kliring3 = ((subscribeUbahVisaCardEvent) activity3).m;
                            if (kliring3 != null) {
                                kliring3.setSaranaPembayaranPengirim("Cek BCA");
                            }
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type com.bca.smartbranch.activity.KliringActivity");
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type com.bca.smartbranch.activity.KliringActivity");
                    }
                } else {
                    getView activity4 = getActivity();
                    if (activity4 != null) {
                        Kliring kliring4 = ((subscribeUbahVisaCardEvent) activity4).m;
                        if (kliring4 != null) {
                            kliring4.setAccType("NONGIRO");
                        }
                        getView activity5 = getActivity();
                        if (activity5 != null) {
                            Kliring kliring5 = ((subscribeUbahVisaCardEvent) activity5).m;
                            if (kliring5 != null) {
                                kliring5.setSaranaPembayaranPengirim("");
                            }
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type com.bca.smartbranch.activity.KliringActivity");
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type com.bca.smartbranch.activity.KliringActivity");
                    }
                }
                ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH4 = this.a;
                subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH4);
                listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH4.s.setHintEnabled(true);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.bca.smartbranch.activity.KliringActivity");
        }
        ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH5 = this.a;
        subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH5);
        listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH5.s.setHintEnabled(false);
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public final void onChooseSumberDana(ReservasiTellerOActivity_ViewBinding reservasiTellerOActivity_ViewBinding) {
        subscribeReservationRescheduleEvent.e(reservasiTellerOActivity_ViewBinding, "");
        ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH = this.a;
        subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH);
        listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH.u.setHintEnabled(true);
        ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH2 = this.a;
        subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH2);
        listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH2.g.setText(reservasiTellerOActivity_ViewBinding.a);
        getView activity = getActivity();
        if (activity != null) {
            Kliring kliring = ((subscribeUbahVisaCardEvent) activity).m;
            if (kliring != null) {
                kliring.setSumberDana(reservasiTellerOActivity_ViewBinding.a);
            }
            getView activity2 = getActivity();
            if (activity2 != null) {
                Kliring kliring2 = ((subscribeUbahVisaCardEvent) activity2).m;
                if (kliring2 != null) {
                    kliring2.setSumberDanaCode(reservasiTellerOActivity_ViewBinding.d);
                }
                ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH3 = this.a;
                subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH3);
                EditText editText = listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH3.g;
                subscribeReservationRescheduleEvent.d(editText, "");
                e(editText);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.bca.smartbranch.activity.KliringActivity");
        }
        throw new NullPointerException("null cannot be cast to non-null type com.bca.smartbranch.activity.KliringActivity");
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public final void onChooseTanggalJatuhTempo(ReservasiTellerOActivity reservasiTellerOActivity) {
        EditText editText;
        subscribeReservationRescheduleEvent.e(reservasiTellerOActivity, "");
        getView activity = getActivity();
        if (activity != null) {
            Kliring kliring = ((subscribeUbahVisaCardEvent) activity).m;
            if (kliring != null) {
                kliring.setTanggalJatuhTempo(reservasiTellerOActivity.b);
            }
            ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH = this.a;
            EditText editText2 = null;
            LogoutDialog_ViewBinding logoutDialog_ViewBinding = listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH != null ? listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH.y : null;
            if (logoutDialog_ViewBinding != null) {
                logoutDialog_ViewBinding.setHintEnabled(true);
            }
            ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH2 = this.a;
            if (!(listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH2 == null || (editText = listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH2.j) == null)) {
                editText.setText(getAnnualFeeBasicAmount.b(reservasiTellerOActivity.b));
            }
            ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH3 = this.a;
            if (listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH3 != null) {
                editText2 = listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH3.j;
            }
            subscribeReservationRescheduleEvent.c(editText2);
            e(editText2);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.bca.smartbranch.activity.KliringActivity");
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public final void onChooseTipeNasabah(ResetAccountActivity_ViewBinding resetAccountActivity_ViewBinding) {
        subscribeReservationRescheduleEvent.e(resetAccountActivity_ViewBinding, "");
        boolean b = subscribeReservationRescheduleEvent.b((Object) resetAccountActivity_ViewBinding.b, (Object) "auto_select");
        String str = null;
        String str2 = null;
        boolean z = false;
        boolean z2 = false;
        if (b) {
            ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH = this.a;
            subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH);
            EditText editText = listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH.h;
            subscribeReservationRescheduleEvent.d(editText, "");
            e(editText);
            ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH2 = this.a;
            subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH2);
            listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH2.x.setHintEnabled(true);
            ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH3 = this.a;
            subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH3);
            listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH3.h.setText(resetAccountActivity_ViewBinding.c);
            getView activity = getActivity();
            if (activity != null) {
                Kliring kliring = ((subscribeUbahVisaCardEvent) activity).m;
                if (kliring != null) {
                    kliring.setTipeNasabah(resetAccountActivity_ViewBinding.c);
                }
                getView activity2 = getActivity();
                if (activity2 != null) {
                    Kliring kliring2 = ((subscribeUbahVisaCardEvent) activity2).m;
                    if (kliring2 != null) {
                        kliring2.setTipeNasabahId(String.valueOf(resetAccountActivity_ViewBinding.d));
                    }
                    ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH4 = this.a;
                    subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH4);
                    LogoutDialog_ViewBinding logoutDialog_ViewBinding = listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH4.u;
                    subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding, "");
                    logoutDialog_ViewBinding.setVisibility(0);
                    ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH5 = this.a;
                    subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH5);
                    LogoutDialog_ViewBinding logoutDialog_ViewBinding2 = listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH5.u;
                    getView activity3 = getActivity();
                    if (activity3 != null) {
                        Kliring kliring3 = ((subscribeUbahVisaCardEvent) activity3).m;
                        String sumberDana = kliring3 != null ? kliring3.getSumberDana() : null;
                        logoutDialog_ViewBinding2.setHintEnabled(!(sumberDana == null || sumberDana.length() == 0));
                        ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH6 = this.a;
                        subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH6);
                        EditText editText2 = listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH6.g;
                        getView activity4 = getActivity();
                        if (activity4 != null) {
                            Kliring kliring4 = ((subscribeUbahVisaCardEvent) activity4).m;
                            editText2.setText(kliring4 != null ? kliring4.getSumberDana() : null);
                            ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH7 = this.a;
                            subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH7);
                            LogoutDialog_ViewBinding logoutDialog_ViewBinding3 = listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH7.C;
                            subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding3, "");
                            logoutDialog_ViewBinding3.setVisibility(0);
                            ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH8 = this.a;
                            subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH8);
                            LogoutDialog_ViewBinding logoutDialog_ViewBinding4 = listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH8.C;
                            getView activity5 = getActivity();
                            if (activity5 != null) {
                                Kliring kliring5 = ((subscribeUbahVisaCardEvent) activity5).m;
                                String tujuanTransaksi = kliring5 != null ? kliring5.getTujuanTransaksi() : null;
                                if (tujuanTransaksi == null || tujuanTransaksi.length() == 0) {
                                    z2 = true;
                                }
                                logoutDialog_ViewBinding4.setHintEnabled(!z2);
                                ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH9 = this.a;
                                subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH9);
                                EditText editText3 = listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH9.k;
                                getView activity6 = getActivity();
                                if (activity6 != null) {
                                    Kliring kliring6 = ((subscribeUbahVisaCardEvent) activity6).m;
                                    if (kliring6 != null) {
                                        str2 = kliring6.getTujuanTransaksi();
                                    }
                                    editText3.setText(str2);
                                } else {
                                    throw new NullPointerException("null cannot be cast to non-null type com.bca.smartbranch.activity.KliringActivity");
                                }
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type com.bca.smartbranch.activity.KliringActivity");
                            }
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type com.bca.smartbranch.activity.KliringActivity");
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type com.bca.smartbranch.activity.KliringActivity");
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type com.bca.smartbranch.activity.KliringActivity");
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type com.bca.smartbranch.activity.KliringActivity");
            }
        } else {
            ((subscribeUbahVisaCardEvent) requireActivity()).e(resetAccountActivity_ViewBinding.d);
            ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH10 = this.a;
            subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH10);
            EditText editText4 = listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH10.h;
            subscribeReservationRescheduleEvent.d(editText4, "");
            e(editText4);
            ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH11 = this.a;
            subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH11);
            listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH11.x.setHintEnabled(true);
            ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH12 = this.a;
            subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH12);
            listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH12.h.setText(resetAccountActivity_ViewBinding.c);
            getView activity7 = getActivity();
            if (activity7 != null) {
                Kliring kliring7 = ((subscribeUbahVisaCardEvent) activity7).m;
                if (kliring7 != null) {
                    kliring7.setTipeNasabah(resetAccountActivity_ViewBinding.c);
                }
                getView activity8 = getActivity();
                if (activity8 != null) {
                    Kliring kliring8 = ((subscribeUbahVisaCardEvent) activity8).m;
                    if (kliring8 != null) {
                        kliring8.setTipeNasabahId(String.valueOf(resetAccountActivity_ViewBinding.d));
                    }
                    ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH13 = this.a;
                    subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH13);
                    LogoutDialog_ViewBinding logoutDialog_ViewBinding5 = listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH13.u;
                    subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding5, "");
                    logoutDialog_ViewBinding5.setVisibility(0);
                    ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH14 = this.a;
                    subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH14);
                    listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH14.u.setHintEnabled(false);
                    ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH15 = this.a;
                    subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH15);
                    listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH15.g.setText("");
                    ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH16 = this.a;
                    subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH16);
                    LogoutDialog_ViewBinding logoutDialog_ViewBinding6 = listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH16.C;
                    subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding6, "");
                    logoutDialog_ViewBinding6.setVisibility(0);
                    ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH17 = this.a;
                    subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH17);
                    LogoutDialog_ViewBinding logoutDialog_ViewBinding7 = listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH17.C;
                    getView activity9 = getActivity();
                    if (activity9 != null) {
                        Kliring kliring9 = ((subscribeUbahVisaCardEvent) activity9).m;
                        if (kliring9 != null) {
                            str = kliring9.getTujuanTransaksi();
                        }
                        String str3 = str;
                        if (str3 == null || str3.length() == 0) {
                            z = true;
                        }
                        logoutDialog_ViewBinding7.setHintEnabled(!z);
                        getView activity10 = getActivity();
                        if (activity10 != null) {
                            Kliring kliring10 = ((subscribeUbahVisaCardEvent) activity10).m;
                            if (kliring10 != null) {
                                kliring10.setSumberDana("");
                            }
                            getView activity11 = getActivity();
                            if (activity11 != null) {
                                Kliring kliring11 = ((subscribeUbahVisaCardEvent) activity11).m;
                                if (kliring11 != null) {
                                    kliring11.setSumberDanaCode("");
                                }
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type com.bca.smartbranch.activity.KliringActivity");
                            }
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type com.bca.smartbranch.activity.KliringActivity");
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type com.bca.smartbranch.activity.KliringActivity");
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type com.bca.smartbranch.activity.KliringActivity");
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type com.bca.smartbranch.activity.KliringActivity");
            }
        }
        ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH18 = this.a;
        subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH18);
        EditText editText5 = listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH18.g;
        subscribeReservationRescheduleEvent.d(editText5, "");
        e(editText5);
        ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH19 = this.a;
        subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH19);
        EditText editText6 = listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH19.k;
        subscribeReservationRescheduleEvent.d(editText6, "");
        e(editText6);
    }

    @Stetho$Initializer$RealSocketHandlerFactory
    public final void onChooseTujuanTransaksi(SyaratKetentuanActivity syaratKetentuanActivity) {
        subscribeReservationRescheduleEvent.e(syaratKetentuanActivity, "");
        ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH = this.a;
        subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH);
        listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH.C.setHintEnabled(true);
        ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH2 = this.a;
        subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH2);
        listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH2.k.setText(syaratKetentuanActivity.c);
        getView activity = getActivity();
        if (activity != null) {
            Kliring kliring = ((subscribeUbahVisaCardEvent) activity).m;
            if (kliring != null) {
                kliring.setTujuanTransaksi(syaratKetentuanActivity.c);
            }
            getView activity2 = getActivity();
            if (activity2 != null) {
                Kliring kliring2 = ((subscribeUbahVisaCardEvent) activity2).m;
                if (kliring2 != null) {
                    kliring2.setTujuanTransaksiCode(syaratKetentuanActivity.a);
                }
                ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH3 = this.a;
                subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH3);
                EditText editText = listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH3.k;
                subscribeReservationRescheduleEvent.d(editText, "");
                e(editText);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.bca.smartbranch.activity.KliringActivity");
        }
        throw new NullPointerException("null cannot be cast to non-null type com.bca.smartbranch.activity.KliringActivity");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        subscribeReservationRescheduleEvent.e(layoutInflater, "");
        View inflate = layoutInflater.inflate(2131493191, viewGroup, false);
        Button button = (Button) setRotation.a(inflate, 2131296415);
        int i = 2131297155;
        if (button != null) {
            setMaxHeight setmaxheight = (setMaxHeight) setRotation.a(inflate, 2131296800);
            if (setmaxheight != null) {
                EditText editText = (EditText) setRotation.a(inflate, 2131296924);
                if (editText != null) {
                    EditText editText2 = (EditText) setRotation.a(inflate, 2131296954);
                    if (editText2 != null) {
                        EditText editText3 = (EditText) setRotation.a(inflate, 2131296971);
                        if (editText3 != null) {
                            EditText editText4 = (EditText) setRotation.a(inflate, 2131296972);
                            if (editText4 != null) {
                                EditText editText5 = (EditText) setRotation.a(inflate, 2131296975);
                                if (editText5 != null) {
                                    EditText editText6 = (EditText) setRotation.a(inflate, 2131296986);
                                    if (editText6 != null) {
                                        EditText editText7 = (EditText) setRotation.a(inflate, 2131297155);
                                        if (editText7 != null) {
                                            EditText editText8 = (EditText) setRotation.a(inflate, 2131297165);
                                            if (editText8 != null) {
                                                EditText editText9 = (EditText) setRotation.a(inflate, 2131297225);
                                                if (editText9 != null) {
                                                    FrameLayout frameLayout = (FrameLayout) setRotation.a(inflate, 2131297251);
                                                    if (frameLayout != null) {
                                                        ImageView imageView = (ImageView) setRotation.a(inflate, 2131297357);
                                                        if (imageView != null) {
                                                            setMaxHeight setmaxheight2 = (setMaxHeight) setRotation.a(inflate, 2131297435);
                                                            if (setmaxheight2 != null) {
                                                                TextView textView = (TextView) setRotation.a(inflate, 2131297507);
                                                                if (textView != null) {
                                                                    TextView textView2 = (TextView) setRotation.a(inflate, 2131297509);
                                                                    if (textView2 != null) {
                                                                        LogoutDialog_ViewBinding logoutDialog_ViewBinding = (LogoutDialog_ViewBinding) setRotation.a(inflate, 2131298473);
                                                                        if (logoutDialog_ViewBinding != null) {
                                                                            LogoutDialog_ViewBinding logoutDialog_ViewBinding2 = (LogoutDialog_ViewBinding) setRotation.a(inflate, 2131298504);
                                                                            if (logoutDialog_ViewBinding2 != null) {
                                                                                LogoutDialog_ViewBinding logoutDialog_ViewBinding3 = (LogoutDialog_ViewBinding) setRotation.a(inflate, 2131298522);
                                                                                if (logoutDialog_ViewBinding3 != null) {
                                                                                    LogoutDialog_ViewBinding logoutDialog_ViewBinding4 = (LogoutDialog_ViewBinding) setRotation.a(inflate, 2131298523);
                                                                                    if (logoutDialog_ViewBinding4 != null) {
                                                                                        LogoutDialog_ViewBinding logoutDialog_ViewBinding5 = (LogoutDialog_ViewBinding) setRotation.a(inflate, 2131298526);
                                                                                        if (logoutDialog_ViewBinding5 != null) {
                                                                                            LogoutDialog_ViewBinding logoutDialog_ViewBinding6 = (LogoutDialog_ViewBinding) setRotation.a(inflate, 2131298535);
                                                                                            if (logoutDialog_ViewBinding6 != null) {
                                                                                                LogoutDialog_ViewBinding logoutDialog_ViewBinding7 = (LogoutDialog_ViewBinding) setRotation.a(inflate, 2131298691);
                                                                                                if (logoutDialog_ViewBinding7 != null) {
                                                                                                    LogoutDialog_ViewBinding logoutDialog_ViewBinding8 = (LogoutDialog_ViewBinding) setRotation.a(inflate, 2131298701);
                                                                                                    if (logoutDialog_ViewBinding8 != null) {
                                                                                                        LogoutDialog_ViewBinding logoutDialog_ViewBinding9 = (LogoutDialog_ViewBinding) setRotation.a(inflate, 2131298756);
                                                                                                        if (logoutDialog_ViewBinding9 != null) {
                                                                                                            TextView textView3 = (TextView) setRotation.a(inflate, 2131298880);
                                                                                                            if (textView3 != null) {
                                                                                                                TextView textView4 = (TextView) setRotation.a(inflate, 2131298953);
                                                                                                                if (textView4 != null) {
                                                                                                                    TextView textView5 = (TextView) setRotation.a(inflate, 2131298984);
                                                                                                                    if (textView5 != null) {
                                                                                                                        TextView textView6 = (TextView) setRotation.a(inflate, 2131299001);
                                                                                                                        if (textView6 != null) {
                                                                                                                            TextView textView7 = (TextView) setRotation.a(inflate, 2131299002);
                                                                                                                            if (textView7 != null) {
                                                                                                                                TextView textView8 = (TextView) setRotation.a(inflate, 2131299005);
                                                                                                                                if (textView8 != null) {
                                                                                                                                    TextView textView9 = (TextView) setRotation.a(inflate, 2131299012);
                                                                                                                                    if (textView9 != null) {
                                                                                                                                        TextView textView10 = (TextView) setRotation.a(inflate, 2131299158);
                                                                                                                                        if (textView10 != null) {
                                                                                                                                            TextView textView11 = (TextView) setRotation.a(inflate, 2131299169);
                                                                                                                                            if (textView11 != null) {
                                                                                                                                                TextView textView12 = (TextView) setRotation.a(inflate, 2131299225);
                                                                                                                                                if (textView12 != null) {
                                                                                                                                                    ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH = new ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH((setWeightSum) inflate, button, setmaxheight, editText, editText2, editText3, editText4, editText5, editText6, editText7, editText8, editText9, frameLayout, imageView, setmaxheight2, textView, textView2, logoutDialog_ViewBinding, logoutDialog_ViewBinding2, logoutDialog_ViewBinding3, logoutDialog_ViewBinding4, logoutDialog_ViewBinding5, logoutDialog_ViewBinding6, logoutDialog_ViewBinding7, logoutDialog_ViewBinding8, logoutDialog_ViewBinding9, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12);
                                                                                                                                                    this.a = listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH;
                                                                                                                                                    subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH);
                                                                                                                                                    setWeightSum setweightsum = listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH.p;
                                                                                                                                                    subscribeReservationRescheduleEvent.d(setweightsum, "");
                                                                                                                                                    return setweightsum;
                                                                                                                                                }
                                                                                                                                                i = 2131299225;
                                                                                                                                            } else {
                                                                                                                                                i = 2131299169;
                                                                                                                                            }
                                                                                                                                        } else {
                                                                                                                                            i = 2131299158;
                                                                                                                                        }
                                                                                                                                    } else {
                                                                                                                                        i = 2131299012;
                                                                                                                                    }
                                                                                                                                } else {
                                                                                                                                    i = 2131299005;
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                i = 2131299002;
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            i = 2131299001;
                                                                                                                        }
                                                                                                                    } else {
                                                                                                                        i = 2131298984;
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    i = 2131298953;
                                                                                                                }
                                                                                                            } else {
                                                                                                                i = 2131298880;
                                                                                                            }
                                                                                                        } else {
                                                                                                            i = 2131298756;
                                                                                                        }
                                                                                                    } else {
                                                                                                        i = 2131298701;
                                                                                                    }
                                                                                                } else {
                                                                                                    i = 2131298691;
                                                                                                }
                                                                                            } else {
                                                                                                i = 2131298535;
                                                                                            }
                                                                                        } else {
                                                                                            i = 2131298526;
                                                                                        }
                                                                                    } else {
                                                                                        i = 2131298523;
                                                                                    }
                                                                                } else {
                                                                                    i = 2131298522;
                                                                                }
                                                                            } else {
                                                                                i = 2131298504;
                                                                            }
                                                                        } else {
                                                                            i = 2131298473;
                                                                        }
                                                                    } else {
                                                                        i = 2131297509;
                                                                    }
                                                                } else {
                                                                    i = 2131297507;
                                                                }
                                                            } else {
                                                                i = 2131297435;
                                                            }
                                                        } else {
                                                            i = 2131297357;
                                                        }
                                                    } else {
                                                        i = 2131297251;
                                                    }
                                                } else {
                                                    i = 2131297225;
                                                }
                                            } else {
                                                i = 2131297165;
                                            }
                                        }
                                    } else {
                                        i = 2131296986;
                                    }
                                } else {
                                    i = 2131296975;
                                }
                            } else {
                                i = 2131296972;
                            }
                        } else {
                            i = 2131296971;
                        }
                    } else {
                        i = 2131296954;
                    }
                } else {
                    i = 2131296924;
                }
            } else {
                i = 2131296800;
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
        this.a = null;
        this.c.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        TextView textView;
        EditText editText;
        Button button;
        EditText editText2;
        EditText editText3;
        EditText editText4;
        EditText editText5;
        ImageView imageView;
        EditText editText6;
        EditText editText7;
        EditText editText8;
        EditText editText9;
        EditText editText10;
        EditText editText11;
        EditText editText12;
        EditText editText13;
        EditText editText14;
        EditText editText15;
        EditText editText16;
        EditText editText17;
        EditText editText18;
        EditText editText19;
        EditText editText20;
        EditText editText21;
        EditText editText22;
        EditText editText23;
        EditText editText24;
        EditText editText25;
        EditText editText26;
        EditText editText27;
        EditText editText28;
        subscribeReservationRescheduleEvent.e(view, "");
        onViewCreated(view, bundle);
        documentProvider.b().c(this);
        String str = null;
        if (g().getVerified().equals("Y")) {
            ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH = this.a;
            EditText editText29 = listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH != null ? listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH.c : null;
            subscribeReservationRescheduleEvent.c(editText29);
            editText29.setFocusable(false);
            ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH2 = this.a;
            EditText editText30 = listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH2 != null ? listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH2.c : null;
            subscribeReservationRescheduleEvent.c(editText30);
            editText30.setLongClickable(false);
            ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH3 = this.a;
            EditText editText31 = listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH3 != null ? listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH3.c : null;
            subscribeReservationRescheduleEvent.c(editText31);
            editText31.setFocusableInTouchMode(false);
        }
        ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH4 = this.a;
        subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH4);
        EditText editText32 = listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH4.f;
        subscribeReservationRescheduleEvent.d(editText32, "");
        ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH5 = this.a;
        subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH5);
        EditText editText33 = listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH5.c;
        subscribeReservationRescheduleEvent.d(editText33, "");
        ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH6 = this.a;
        subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH6);
        EditText editText34 = listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH6.a;
        subscribeReservationRescheduleEvent.d(editText34, "");
        ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH7 = this.a;
        subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH7);
        EditText editText35 = listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH7.i;
        subscribeReservationRescheduleEvent.d(editText35, "");
        ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH8 = this.a;
        subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH8);
        EditText editText36 = listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH8.e;
        subscribeReservationRescheduleEvent.d(editText36, "");
        ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH9 = this.a;
        subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH9);
        EditText editText37 = listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH9.j;
        subscribeReservationRescheduleEvent.d(editText37, "");
        ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH10 = this.a;
        subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH10);
        EditText editText38 = listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH10.h;
        subscribeReservationRescheduleEvent.d(editText38, "");
        ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH11 = this.a;
        subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH11);
        EditText editText39 = listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH11.g;
        subscribeReservationRescheduleEvent.d(editText39, "");
        ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH12 = this.a;
        subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH12);
        EditText editText40 = listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH12.k;
        subscribeReservationRescheduleEvent.d(editText40, "");
        int i = 8;
        EditText[] editTextArr = {editText32, editText33, editText34, editText35, editText36, editText37, editText38, editText39, editText40};
        subscribeReservationRescheduleEvent.e(editTextArr, "");
        subscribeReservationRescheduleEvent.e(editTextArr, "");
        List<? extends EditText> asList = Arrays.asList(editTextArr);
        subscribeReservationRescheduleEvent.d(asList, "");
        this.b = asList;
        ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH13 = this.a;
        subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH13);
        LogoutDialog_ViewBinding logoutDialog_ViewBinding = listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH13.w;
        subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding, "");
        ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH14 = this.a;
        subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH14);
        LogoutDialog_ViewBinding logoutDialog_ViewBinding2 = listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH14.s;
        subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding2, "");
        ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH15 = this.a;
        subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH15);
        LogoutDialog_ViewBinding logoutDialog_ViewBinding3 = listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH15.r;
        subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding3, "");
        ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH16 = this.a;
        subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH16);
        LogoutDialog_ViewBinding logoutDialog_ViewBinding4 = listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH16.v;
        subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding4, "");
        ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH17 = this.a;
        subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH17);
        LogoutDialog_ViewBinding logoutDialog_ViewBinding5 = listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH17.q;
        subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding5, "");
        ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH18 = this.a;
        subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH18);
        LogoutDialog_ViewBinding logoutDialog_ViewBinding6 = listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH18.y;
        subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding6, "");
        ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH19 = this.a;
        subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH19);
        LogoutDialog_ViewBinding logoutDialog_ViewBinding7 = listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH19.x;
        subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding7, "");
        ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH20 = this.a;
        subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH20);
        LogoutDialog_ViewBinding logoutDialog_ViewBinding8 = listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH20.u;
        subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding8, "");
        ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH21 = this.a;
        subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH21);
        LogoutDialog_ViewBinding logoutDialog_ViewBinding9 = listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH21.C;
        subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding9, "");
        LogoutDialog_ViewBinding[] logoutDialog_ViewBindingArr = {logoutDialog_ViewBinding, logoutDialog_ViewBinding2, logoutDialog_ViewBinding3, logoutDialog_ViewBinding4, logoutDialog_ViewBinding5, logoutDialog_ViewBinding6, logoutDialog_ViewBinding7, logoutDialog_ViewBinding8, logoutDialog_ViewBinding9};
        subscribeReservationRescheduleEvent.e(logoutDialog_ViewBindingArr, "");
        subscribeReservationRescheduleEvent.e(logoutDialog_ViewBindingArr, "");
        List<? extends LogoutDialog_ViewBinding> asList2 = Arrays.asList(logoutDialog_ViewBindingArr);
        subscribeReservationRescheduleEvent.d(asList2, "");
        this.g = asList2;
        ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH22 = this.a;
        subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH22);
        TextView textView2 = listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH22.H;
        subscribeReservationRescheduleEvent.d(textView2, "");
        ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH23 = this.a;
        subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH23);
        TextView textView3 = listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH23.A;
        subscribeReservationRescheduleEvent.d(textView3, "");
        ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH24 = this.a;
        subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH24);
        TextView textView4 = listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH24.D;
        subscribeReservationRescheduleEvent.d(textView4, "");
        ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH25 = this.a;
        subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH25);
        TextView textView5 = listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH25.G;
        subscribeReservationRescheduleEvent.d(textView5, "");
        ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH26 = this.a;
        subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH26);
        TextView textView6 = listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH26.z;
        subscribeReservationRescheduleEvent.d(textView6, "");
        ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH27 = this.a;
        subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH27);
        TextView textView7 = listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH27.E;
        subscribeReservationRescheduleEvent.d(textView7, "");
        ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH28 = this.a;
        subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH28);
        TextView textView8 = listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH28.I;
        subscribeReservationRescheduleEvent.d(textView8, "");
        ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH29 = this.a;
        subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH29);
        TextView textView9 = listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH29.F;
        subscribeReservationRescheduleEvent.d(textView9, "");
        ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH30 = this.a;
        subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH30);
        TextView textView10 = listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH30.L;
        subscribeReservationRescheduleEvent.d(textView10, "");
        TextView[] textViewArr = {textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10};
        subscribeReservationRescheduleEvent.e(textViewArr, "");
        subscribeReservationRescheduleEvent.e(textViewArr, "");
        List<? extends TextView> asList3 = Arrays.asList(textViewArr);
        subscribeReservationRescheduleEvent.d(asList3, "");
        this.d = asList3;
        getView activity = getActivity();
        if (activity != null) {
            Kliring kliring = ((subscribeUbahVisaCardEvent) activity).m;
            ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH31 = this.a;
            if (!(listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH31 == null || (editText28 = listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH31.f) == null)) {
                editText28.setText(kliring != null ? kliring.getNamaPenerima() : null);
            }
            ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH32 = this.a;
            if (!(listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH32 == null || (editText27 = listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH32.c) == null)) {
                editText27.setText(kliring != null ? kliring.getNomorRekening() : null);
            }
            ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH33 = this.a;
            if (!(listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH33 == null || (editText26 = listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH33.a) == null)) {
                editText26.setText(kliring != null ? kliring.getKodeNegara() : null);
            }
            ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH34 = this.a;
            if (!(listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH34 == null || (editText25 = listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH34.i) == null)) {
                User g = g();
                String nomorHp = kliring != null ? kliring.getNomorHp() : null;
                String str2 = nomorHp;
                if (nomorHp == null) {
                    str2 = "";
                }
                editText25.setText(getPromotion.a(g, str2));
            }
            ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH35 = this.a;
            if (!(listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH35 == null || (editText24 = listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH35.e) == null)) {
                editText24.setText(kliring != null ? kliring.getBeritaAcara() : null);
            }
            ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH36 = this.a;
            if (!(listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH36 == null || (editText23 = listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH36.j) == null)) {
                getView activity2 = getActivity();
                if (activity2 != null) {
                    Kliring kliring2 = ((subscribeUbahVisaCardEvent) activity2).m;
                    editText23.setText(getAnnualFeeBasicAmount.b(kliring2 != null ? kliring2.getTanggalJatuhTempo() : null));
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type com.bca.smartbranch.activity.KliringActivity");
                }
            }
            ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH37 = this.a;
            if (!(listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH37 == null || (editText22 = listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH37.h) == null)) {
                editText22.setText(kliring != null ? kliring.getTipeNasabah() : null);
            }
            ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH38 = this.a;
            LogoutDialog_ViewBinding logoutDialog_ViewBinding10 = listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH38 != null ? listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH38.u : null;
            if (logoutDialog_ViewBinding10 != null) {
                LogoutDialog_ViewBinding logoutDialog_ViewBinding11 = logoutDialog_ViewBinding10;
                ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH39 = this.a;
                Editable text = (listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH39 == null || (editText21 = listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH39.h) == null) ? null : editText21.getText();
                logoutDialog_ViewBinding11.setVisibility((text == null || text.length() == 0) ^ true ? 0 : 8);
            }
            ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH40 = this.a;
            if (!(listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH40 == null || (editText20 = listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH40.g) == null)) {
                editText20.setText(kliring != null ? kliring.getSumberDana() : null);
            }
            ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH41 = this.a;
            LogoutDialog_ViewBinding logoutDialog_ViewBinding12 = listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH41 != null ? listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH41.C : null;
            if (logoutDialog_ViewBinding12 != null) {
                LogoutDialog_ViewBinding logoutDialog_ViewBinding13 = logoutDialog_ViewBinding12;
                ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH42 = this.a;
                Editable text2 = (listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH42 == null || (editText19 = listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH42.h) == null) ? null : editText19.getText();
                if (!(text2 == null || text2.length() == 0)) {
                    i = 0;
                }
                logoutDialog_ViewBinding13.setVisibility(i);
            }
            ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH43 = this.a;
            if (!(listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH43 == null || (editText18 = listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH43.k) == null)) {
                editText18.setText(kliring != null ? kliring.getTujuanTransaksi() : null);
            }
            List<? extends EditText> list = this.b;
            List<? extends EditText> list2 = list;
            if (list == null) {
                subscribeReservationRescheduleEvent.e("");
                list2 = null;
            }
            int size = list2.size();
            for (int i2 = 0; i2 < size; i2++) {
                List<? extends LogoutDialog_ViewBinding> list3 = this.g;
                List<? extends LogoutDialog_ViewBinding> list4 = list3;
                if (list3 == null) {
                    subscribeReservationRescheduleEvent.e("");
                    list4 = null;
                }
                LogoutDialog_ViewBinding logoutDialog_ViewBinding14 = (LogoutDialog_ViewBinding) list4.get(i2);
                List<? extends EditText> list5 = this.b;
                List<? extends EditText> list6 = list5;
                if (list5 == null) {
                    subscribeReservationRescheduleEvent.e("");
                    list6 = null;
                }
                logoutDialog_ViewBinding14.setHintEnabled(((EditText) list6.get(i2)).getText().toString().length() > 0);
            }
            ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH44 = this.a;
            if (!(listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH44 == null || (editText17 = listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH44.f) == null)) {
                editText17.addTextChangedListener(new read());
            }
            ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH45 = this.a;
            if (!(listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH45 == null || (editText16 = listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH45.c) == null)) {
                editText16.addTextChangedListener(new write());
            }
            ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH46 = this.a;
            if (!(listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH46 == null || (editText15 = listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH46.a) == null)) {
                editText15.addTextChangedListener(new IconCompatParcelizer());
            }
            ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH47 = this.a;
            if (!(listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH47 == null || (editText14 = listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH47.i) == null)) {
                editText14.addTextChangedListener(new MediaDescriptionCompat());
            }
            ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH48 = this.a;
            if (!(listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH48 == null || (editText13 = listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH48.e) == null)) {
                editText13.addTextChangedListener(new TextWatcher() { // from class: o.getClearingCode$MediaBrowserCompat$CustomActionResultReceiver
                    @Override // android.text.TextWatcher
                    public final void afterTextChanged(Editable editable) {
                        getClearingCode.a(getClearingCode.this).q.setHintEnabled(String.valueOf(editable).length() > 0);
                        getView activity3 = getClearingCode.this.getActivity();
                        if (activity3 != null) {
                            Kliring kliring3 = ((subscribeUbahVisaCardEvent) activity3).m;
                            if (kliring3 != null) {
                                kliring3.setBeritaAcara(String.valueOf(editable));
                                return;
                            }
                            return;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type com.bca.smartbranch.activity.KliringActivity");
                    }

                    @Override // android.text.TextWatcher
                    public final void beforeTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
                    }

                    @Override // android.text.TextWatcher
                    public final void onTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
                    }
                });
            }
            ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH49 = this.a;
            if (!(listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH49 == null || (editText12 = listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH49.f) == null)) {
                editText12.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: o.getBank_name
                    @Override // android.view.View.OnFocusChangeListener
                    public final void onFocusChange(View view2, boolean z) {
                        getClearingCode.a(getClearingCode.this, view2, z);
                    }
                });
            }
            ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH50 = this.a;
            if (!(listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH50 == null || (editText11 = listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH50.c) == null)) {
                editText11.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: o.setBank_name
                    @Override // android.view.View.OnFocusChangeListener
                    public final void onFocusChange(View view2, boolean z) {
                        getClearingCode.d(getClearingCode.this, view2, z);
                    }
                });
            }
            ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH51 = this.a;
            if (!(listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH51 == null || (editText10 = listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH51.a) == null)) {
                editText10.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: o.getWarkat_type
                    @Override // android.view.View.OnFocusChangeListener
                    public final void onFocusChange(View view2, boolean z) {
                        getClearingCode.e(getClearingCode.this, view2, z);
                    }
                });
            }
            ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH52 = this.a;
            if (!(listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH52 == null || (editText9 = listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH52.i) == null)) {
                editText9.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: o.setWarkat_number
                    @Override // android.view.View.OnFocusChangeListener
                    public final void onFocusChange(View view2, boolean z) {
                        getClearingCode.b(getClearingCode.this, view2, z);
                    }
                });
            }
            ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH53 = this.a;
            if (!(listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH53 == null || (editText8 = listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH53.e) == null)) {
                editText8.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: o.setClearingCode
                    @Override // android.view.View.OnFocusChangeListener
                    public final void onFocusChange(View view2, boolean z) {
                        getClearingCode.c(getClearingCode.this, view2, z);
                    }
                });
            }
            ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH54 = this.a;
            if (!(listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH54 == null || (editText7 = listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH54.g) == null)) {
                editText7.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: o.getWarkat_number
                    @Override // android.view.View.OnFocusChangeListener
                    public final void onFocusChange(View view2, boolean z) {
                        getClearingCode.j(getClearingCode.this, view2, z);
                    }
                });
            }
            ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH55 = this.a;
            if (!(listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH55 == null || (editText6 = listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH55.k) == null)) {
                editText6.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: o.TxnTellerRequest$TxnDataInput$TxnDataInputWarkat$$Parcelable
                    @Override // android.view.View.OnFocusChangeListener
                    public final void onFocusChange(View view2, boolean z) {
                        getClearingCode.i(getClearingCode.this, view2, z);
                    }
                });
            }
            ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH56 = this.a;
            if (!(listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH56 == null || (imageView = listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH56.l) == null)) {
                imageView.setOnClickListener(new getIncomeAmount() { // from class: o.getClearingCode$MediaBrowserCompat$ItemReceiver
                    @Override // o.getIncomeAmount
                    public final void b(View view2) {
                        getClearingCode.c(getClearingCode.this);
                    }
                });
            }
            ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH57 = this.a;
            if (!(listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH57 == null || (editText5 = listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH57.j) == null)) {
                editText5.setOnClickListener(new MediaMetadataCompat());
            }
            ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH58 = this.a;
            if (!(listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH58 == null || (editText4 = listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH58.h) == null)) {
                editText4.setOnClickListener(new getIncomeAmount() { // from class: o.getClearingCode$MediaBrowserCompat$MediaItem
                    @Override // o.getIncomeAmount
                    public final void b(View view2) {
                        ((subscribeUbahVisaCardEvent) getClearingCode.this.requireActivity()).i(getClearingCode.a(getClearingCode.this).h.getText().toString());
                    }
                });
            }
            ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH59 = this.a;
            if (!(listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH59 == null || (editText3 = listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH59.g) == null)) {
                editText3.setOnClickListener(new getIncomeAmount() { // from class: o.getClearingCode$MediaBrowserCompat$SearchResultReceiver
                    @Override // o.getIncomeAmount
                    public final void b(View view2) {
                        if (!((subscribeUbahVisaCardEvent) getClearingCode.this.requireActivity()).A.isEmpty()) {
                            ((subscribeUbahVisaCardEvent) getClearingCode.this.requireActivity()).c(getClearingCode.a(getClearingCode.this).g.getText().toString());
                        }
                    }
                });
            }
            ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH60 = this.a;
            if (!(listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH60 == null || (editText2 = listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH60.k) == null)) {
                editText2.setOnClickListener(new getIncomeAmount() { // from class: o.getClearingCode$MediaSessionCompat$QueueItem
                    @Override // o.getIncomeAmount
                    public final void b(View view2) {
                        if (!((subscribeUbahVisaCardEvent) getClearingCode.this.requireActivity()).E.isEmpty()) {
                            ((subscribeUbahVisaCardEvent) getClearingCode.this.requireActivity()).f(getClearingCode.a(getClearingCode.this).k.getText().toString());
                        }
                    }
                });
            }
            ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH61 = this.a;
            if (!(listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH61 == null || (button = listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH61.b) == null)) {
                button.setOnClickListener(new RatingCompat());
            }
            ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH62 = this.a;
            if (!(listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH62 == null || (editText = listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH62.c) == null)) {
                editText.setOnClickListener(new getIncomeAmount() { // from class: o.getClearingCode$MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver
                    @Override // o.getIncomeAmount
                    public final void b(View view2) {
                        List<GetCustAcctListResponse.AccountData> accountList;
                        if (((subscribeUbahVisaCardEvent) getClearingCode.this.requireActivity()).v != null) {
                            GetCustAcctListResponse getCustAcctListResponse = ((subscribeUbahVisaCardEvent) getClearingCode.this.requireActivity()).v;
                            boolean z = true;
                            if (getCustAcctListResponse == null || (accountList = getCustAcctListResponse.getAccountList()) == null || !accountList.isEmpty()) {
                                z = false;
                            }
                            if (!z) {
                                getClearingCode.e(getClearingCode.this);
                            }
                        }
                    }
                });
            }
            ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH63 = this.a;
            if (!(listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH63 == null || (textView = listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH63.B) == null)) {
                textView.setOnClickListener(new getIncomeAmount() { // from class: o.getClearingCode$MediaSessionCompat$ResultReceiverWrapper
                    @Override // o.getIncomeAmount
                    public final void b(View view2) {
                        getClearingCode.this.e(2131296811, new KliringInfoBiayaFragment(), "KliringInfoBiayaFragment");
                    }
                });
            }
            ListDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH64 = this.a;
            subscribeReservationRescheduleEvent.c(listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH64);
            getView activity3 = getActivity();
            if (activity3 != null) {
                Kliring kliring3 = ((subscribeUbahVisaCardEvent) activity3).m;
                if (kliring3 != null) {
                    getView activity4 = getActivity();
                    if (activity4 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type com.bca.smartbranch.activity.KliringActivity");
                    } else if (((Boolean) ((subscribeUbahVisaCardEvent) activity4).r.d()).booleanValue()) {
                        String namaPenerima = kliring3.getNamaPenerima();
                        if (namaPenerima != null) {
                            subscribeReservationRescheduleEvent.d(namaPenerima, "");
                            getView activity5 = getActivity();
                            if (activity5 != null) {
                                Kliring kliring4 = ((subscribeUbahVisaCardEvent) activity5).m;
                                if (kliring4 != null) {
                                    kliring4.setNamaPenerima(namaPenerima);
                                }
                                EditText editText41 = listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH64.f;
                                subscribeReservationRescheduleEvent.d(editText41, "");
                                EditText editText42 = editText41;
                                LogoutDialog_ViewBinding logoutDialog_ViewBinding15 = listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH64.w;
                                subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding15, "");
                                a(editText42, logoutDialog_ViewBinding15, namaPenerima, a());
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type com.bca.smartbranch.activity.KliringActivity");
                            }
                        }
                        String nomorRekening = kliring3.getNomorRekening();
                        if (nomorRekening != null) {
                            subscribeReservationRescheduleEvent.d(nomorRekening, "");
                            getView activity6 = getActivity();
                            if (activity6 != null) {
                                Kliring kliring5 = ((subscribeUbahVisaCardEvent) activity6).m;
                                if (kliring5 != null) {
                                    kliring5.setNomorRekening(nomorRekening);
                                }
                                EditText editText43 = listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH64.c;
                                subscribeReservationRescheduleEvent.d(editText43, "");
                                EditText editText44 = editText43;
                                LogoutDialog_ViewBinding logoutDialog_ViewBinding16 = listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH64.s;
                                subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding16, "");
                                a(editText44, logoutDialog_ViewBinding16, nomorRekening, false);
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type com.bca.smartbranch.activity.KliringActivity");
                            }
                        }
                        String nomorHp2 = kliring3.getNomorHp();
                        if (nomorHp2 != null) {
                            subscribeReservationRescheduleEvent.d(nomorHp2, "");
                            String a = getPromotion.a(g(), nomorHp2);
                            getView activity7 = getActivity();
                            if (activity7 != null) {
                                Kliring kliring6 = ((subscribeUbahVisaCardEvent) activity7).m;
                                if (kliring6 != null) {
                                    kliring6.setNomorHp(a);
                                }
                                EditText editText45 = listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH64.i;
                                subscribeReservationRescheduleEvent.d(editText45, "");
                                EditText editText46 = editText45;
                                LogoutDialog_ViewBinding logoutDialog_ViewBinding17 = listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH64.v;
                                subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding17, "");
                                subscribeReservationRescheduleEvent.d(a, "");
                                a(editText46, logoutDialog_ViewBinding17, a, false);
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type com.bca.smartbranch.activity.KliringActivity");
                            }
                        }
                        String kodeNegara = kliring3.getKodeNegara();
                        if (kodeNegara != null) {
                            subscribeReservationRescheduleEvent.d(kodeNegara, "");
                            getView activity8 = getActivity();
                            if (activity8 != null) {
                                Kliring kliring7 = ((subscribeUbahVisaCardEvent) activity8).m;
                                if (kliring7 != null) {
                                    kliring7.setKodeNegara(kodeNegara);
                                }
                                EditText editText47 = listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH64.a;
                                subscribeReservationRescheduleEvent.d(editText47, "");
                                EditText editText48 = editText47;
                                LogoutDialog_ViewBinding logoutDialog_ViewBinding18 = listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH64.r;
                                subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding18, "");
                                a(editText48, logoutDialog_ViewBinding18, kodeNegara, false);
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type com.bca.smartbranch.activity.KliringActivity");
                            }
                        }
                        String tipeNasabah = kliring3.getTipeNasabah();
                        if (tipeNasabah != null) {
                            subscribeReservationRescheduleEvent.d(tipeNasabah, "");
                            getView activity9 = getActivity();
                            if (activity9 != null) {
                                Kliring kliring8 = ((subscribeUbahVisaCardEvent) activity9).m;
                                if (kliring8 != null) {
                                    kliring8.setTipeNasabah(tipeNasabah);
                                }
                                EditText editText49 = listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH64.h;
                                subscribeReservationRescheduleEvent.d(editText49, "");
                                EditText editText50 = editText49;
                                LogoutDialog_ViewBinding logoutDialog_ViewBinding19 = listDetailOpenTransaksiAdapter$ListDetailMultiTransaksiVH64.x;
                                subscribeReservationRescheduleEvent.d(logoutDialog_ViewBinding19, "");
                                a(editText50, logoutDialog_ViewBinding19, tipeNasabah, a());
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type com.bca.smartbranch.activity.KliringActivity");
                            }
                        }
                    }
                }
                getView activity10 = getActivity();
                if (activity10 != null) {
                    Kliring kliring9 = ((subscribeUbahVisaCardEvent) activity10).m;
                    String tipeNasabah2 = kliring9 != null ? kliring9.getTipeNasabah() : null;
                    getView activity11 = getActivity();
                    if (activity11 != null) {
                        Kliring kliring10 = ((subscribeUbahVisaCardEvent) activity11).m;
                        if (kliring10 != null) {
                            str = kliring10.getTipeNasabahId();
                        }
                        String str3 = tipeNasabah2;
                        if (!(str3 == null || str3.length() == 0)) {
                            if (str3 == null || str3.length() == 0) {
                                tipeNasabah2 = "Individu";
                            }
                            String str4 = str;
                            int i3 = 0;
                            if (!(str4 == null || str4.length() == 0)) {
                                i3 = 0;
                                if (CheckOTPSessionPresenter.d(str, getResources().getString(2131822042), true)) {
                                    i3 = 1;
                                }
                            }
                            c(new ResetAccountActivity_ViewBinding(tipeNasabah2, i3, "auto_select"));
                            return;
                        }
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.bca.smartbranch.activity.KliringActivity");
                }
                throw new NullPointerException("null cannot be cast to non-null type com.bca.smartbranch.activity.KliringActivity");
            }
            throw new NullPointerException("null cannot be cast to non-null type com.bca.smartbranch.activity.KliringActivity");
        }
        throw new NullPointerException("null cannot be cast to non-null type com.bca.smartbranch.activity.KliringActivity");
    }
}
