package com.mobsandgeeks.saripaar;

import android.view.View;
import android.widget.TextView;
/* loaded from: classes2-dex2jar.jar:com/mobsandgeeks/saripaar/DefaultViewValidatedAction.class */
public class DefaultViewValidatedAction implements Validator$ViewValidatedAction {
    @Override // com.mobsandgeeks.saripaar.Validator$ViewValidatedAction
    public void onAllRulesPassed(View view) {
        if (view instanceof TextView) {
            ((TextView) view).setError(null);
        }
    }
}
