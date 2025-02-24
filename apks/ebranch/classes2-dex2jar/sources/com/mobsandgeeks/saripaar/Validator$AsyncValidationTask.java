package com.mobsandgeeks.saripaar;

import android.os.AsyncTask;
import android.view.View;
/* loaded from: classes2-dex2jar.jar:com/mobsandgeeks/saripaar/Validator$AsyncValidationTask.class */
class Validator$AsyncValidationTask extends AsyncTask<Void, Void, Validator$ValidationReport> {
    private boolean mOrderedRules;
    private String mReasonSuffix;
    private View mView;
    final /* synthetic */ Validator this$0;

    Validator$AsyncValidationTask(Validator validator, View view, boolean z, String str) {
        this.this$0 = validator;
        this.mView = view;
        this.mOrderedRules = z;
        this.mReasonSuffix = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Validator$ValidationReport doInBackground(Void... voidArr) {
        return Validator.access$000(this.this$0, this.mView, this.mOrderedRules, this.mReasonSuffix);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onPostExecute(Validator$ValidationReport validator$ValidationReport) {
        Validator.access$100(this.this$0, validator$ValidationReport);
    }
}
