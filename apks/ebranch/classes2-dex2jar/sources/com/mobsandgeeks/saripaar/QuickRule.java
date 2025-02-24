package com.mobsandgeeks.saripaar;

import android.view.View;
/* loaded from: classes2-dex2jar.jar:com/mobsandgeeks/saripaar/QuickRule.class */
public abstract class QuickRule<VIEW extends View> extends Rule<VIEW> {
    public QuickRule() {
        super(-1);
    }

    protected QuickRule(int i) {
        super(i);
        if (i < 0) {
            throw new IllegalArgumentException("'sequence' should be a non-negative integer.");
        }
    }

    public abstract boolean isValid(VIEW view);

    /* JADX WARN: Multi-variable type inference failed */
    public /* bridge */ /* synthetic */ boolean isValid(Object obj) {
        return isValid((QuickRule<VIEW>) ((View) obj));
    }
}
