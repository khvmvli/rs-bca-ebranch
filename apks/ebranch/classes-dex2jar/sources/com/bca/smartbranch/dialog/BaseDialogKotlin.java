package com.bca.smartbranch.dialog;

import android.app.Dialog;
import android.content.SharedPreferences;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import java.util.LinkedHashMap;
import java.util.Map;
import o.getText;
import o.onClickNegara;
import o.subscribeReservationRescheduleEvent;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/BaseDialogKotlin.class */
public abstract class BaseDialogKotlin extends getText {
    public Map<Integer, View> a = new LinkedHashMap();
    @onClickNegara
    public SharedPreferences sharedPreferences;

    public void d() {
        this.a.clear();
    }

    @Override // o.getText
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = onCreateDialog(bundle);
        subscribeReservationRescheduleEvent.d(onCreateDialog, "");
        Window window = onCreateDialog.getWindow();
        subscribeReservationRescheduleEvent.c(window);
        window.requestFeature(1);
        onCreateDialog.setCanceledOnTouchOutside(false);
        Window window2 = onCreateDialog.getWindow();
        subscribeReservationRescheduleEvent.c(window2);
        window2.setBackgroundDrawable(new ColorDrawable(0));
        Window window3 = onCreateDialog.getWindow();
        subscribeReservationRescheduleEvent.c(window3);
        window3.getAttributes().windowAnimations = 2131886328;
        return onCreateDialog;
    }

    @Override // o.getText, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        onDestroyView();
        d();
    }

    @Override // o.getText, androidx.fragment.app.Fragment
    public void onStart() {
        onStart();
        Dialog dialog = getDialog();
        subscribeReservationRescheduleEvent.c(dialog);
        Window window = dialog.getWindow();
        subscribeReservationRescheduleEvent.c(window);
        window.setLayout(-1, -2);
    }
}
