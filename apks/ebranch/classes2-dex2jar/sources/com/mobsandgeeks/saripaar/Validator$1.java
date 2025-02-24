package com.mobsandgeeks.saripaar;

import android.view.View;
/* loaded from: classes2-dex2jar.jar:com/mobsandgeeks/saripaar/Validator$1.class */
class Validator$1 implements Runnable {
    final /* synthetic */ Validator this$0;
    final /* synthetic */ View val$view;
    final /* synthetic */ Validator$ViewValidatedAction val$viewValidatedAction;

    Validator$1(Validator validator, Validator$ViewValidatedAction validator$ViewValidatedAction, View view) {
        this.this$0 = validator;
        this.val$viewValidatedAction = validator$ViewValidatedAction;
        this.val$view = view;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.val$viewValidatedAction.onAllRulesPassed(this.val$view);
    }
}
