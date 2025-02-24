package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.bca.smartbranch.data.localdb.User;
/* loaded from: classes-dex2jar.jar:o/FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.class */
public final class FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver {

    /* loaded from: classes-dex2jar.jar:o/FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver$IconCompatParcelizer.class */
    public static final class IconCompatParcelizer extends getIncomeAmount {
        final /* synthetic */ EditText a;

        IconCompatParcelizer(EditText editText) {
            this.a = editText;
        }

        @Override // o.getIncomeAmount
        public final void b(View view) {
            FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver formReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver = FormReservasiUbahTellerActivity_ViewBinding.e;
            String obj = this.a.getText().toString();
            subscribeReservationRescheduleEvent.e("nomorRekening", "");
            subscribeReservationRescheduleEvent.e(obj, "");
            documentProvider.b().d(new UbahProfilActivity("nomorRekening", obj));
        }
    }

    private FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver() {
    }

    public /* synthetic */ FormReservasiUbahTellerActivity_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver(byte b) {
        this();
    }

    public static void a(Context context, LogoutDialog_ViewBinding logoutDialog_ViewBinding) {
        subscribeReservationRescheduleEvent.e(context, "");
        subscribeReservationRescheduleEvent.e(logoutDialog_ViewBinding, "");
        EditText editText = logoutDialog_ViewBinding.f;
        Editable text = editText != null ? editText.getText() : null;
        if (text == null || text.length() == 0) {
            logoutDialog_ViewBinding.setHintEnabled(false);
            logoutDialog_ViewBinding.setDefaultHintTextColor(ColorStateList.valueOf(copyWindowDataInto.a(context, 2131099739)));
            return;
        }
        logoutDialog_ViewBinding.setHintEnabled(true);
        logoutDialog_ViewBinding.setDefaultHintTextColor(ColorStateList.valueOf(copyWindowDataInto.a(context, 2131099731)));
    }

    public static void b(LogoutDialog_ViewBinding logoutDialog_ViewBinding, LinearLayout linearLayout, boolean z) {
        subscribeReservationRescheduleEvent.e(logoutDialog_ViewBinding, "");
        subscribeReservationRescheduleEvent.e(linearLayout, "");
        if (z) {
            logoutDialog_ViewBinding.setVisibility(0);
            linearLayout.setVisibility(8);
            return;
        }
        logoutDialog_ViewBinding.setVisibility(8);
        linearLayout.setVisibility(0);
    }

    public static void d(Context context, LogoutDialog_ViewBinding logoutDialog_ViewBinding) {
        subscribeReservationRescheduleEvent.e(context, "");
        subscribeReservationRescheduleEvent.e(logoutDialog_ViewBinding, "");
        EditText editText = logoutDialog_ViewBinding.f;
        boolean z = false;
        if (editText != null) {
            editText.setEnabled(false);
        }
        EditText editText2 = logoutDialog_ViewBinding.f;
        if (editText2 != null) {
            editText2.setClickable(false);
        }
        EditText editText3 = logoutDialog_ViewBinding.f;
        if (editText3 != null) {
            editText3.setTextColor(context.getResources().getColor(2131099739));
        }
        logoutDialog_ViewBinding.setHintEnabled(false);
        logoutDialog_ViewBinding.setDefaultHintTextColor(ColorStateList.valueOf(copyWindowDataInto.a(context, 2131099739)));
        EditText editText4 = logoutDialog_ViewBinding.f;
        Editable text = editText4 != null ? editText4.getText() : null;
        if (text == null || text.length() == 0) {
            z = true;
        }
        logoutDialog_ViewBinding.setHintEnabled(!z);
        EditText editText5 = logoutDialog_ViewBinding.f;
        if (editText5 != null) {
            editText5.setHintTextColor(context.getResources().getColor(2131099739));
        }
        EditText editText6 = logoutDialog_ViewBinding.f;
        if (editText6 != null) {
            editText6.setHintTextColor(context.getResources().getColor(2131099739));
        }
    }

    public static void d(User user, EditText editText) {
        if (CheckOTPSessionPresenter.d(user != null ? user.getVerified() : null, "Y", false)) {
            editText.setFocusable(false);
            editText.setLongClickable(false);
            editText.setFocusableInTouchMode(false);
            editText.setOnClickListener(new IconCompatParcelizer(editText));
        }
    }

    public static void d(LogoutDialog_ViewBinding logoutDialog_ViewBinding, Context context) {
        subscribeReservationRescheduleEvent.e(logoutDialog_ViewBinding, "");
        subscribeReservationRescheduleEvent.e(context, "");
        logoutDialog_ViewBinding.setClickable(false);
        logoutDialog_ViewBinding.setEnabled(false);
        logoutDialog_ViewBinding.setFocusable(false);
        logoutDialog_ViewBinding.setDefaultHintTextColor(context.getResources().getColorStateList(2131099753));
        EditText editText = logoutDialog_ViewBinding.f;
        if (editText != null) {
            editText.setHintTextColor(context.getResources().getColor(2131099753));
        }
        logoutDialog_ViewBinding.setBackgroundResource(2131230847);
        EditText editText2 = logoutDialog_ViewBinding.f;
        if (editText2 != null) {
            editText2.setTextColor(context.getResources().getColor(2131099753));
        }
    }

    public static void e(Context context, LogoutDialog_ViewBinding logoutDialog_ViewBinding, EditText editText, boolean z, boolean z2) {
        subscribeReservationRescheduleEvent.e(context, "");
        subscribeReservationRescheduleEvent.e(logoutDialog_ViewBinding, "");
        subscribeReservationRescheduleEvent.e(editText, "");
        EditText editText2 = logoutDialog_ViewBinding.f;
        Editable text = editText2 != null ? editText2.getText() : null;
        int i = text == null || text.length() == 0 ? 2131099739 : 2131099731;
        if (!z) {
            i = 2131099742;
        }
        ColorStateList valueOf = ColorStateList.valueOf(copyWindowDataInto.a(context, i));
        subscribeReservationRescheduleEvent.d(valueOf, "");
        logoutDialog_ViewBinding.setDefaultHintTextColor(valueOf);
        editText.setEnabled(z);
        if (z2) {
            editText.setFocusable(z);
            editText.setLongClickable(z);
            editText.setFocusableInTouchMode(z);
            return;
        }
        editText.setFocusable(false);
        editText.setLongClickable(false);
        editText.setFocusableInTouchMode(false);
    }
}
