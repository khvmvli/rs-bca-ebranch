package com.mobsandgeeks.saripaar;

import android.content.Context;
/* loaded from: classes-dex2jar.jar:com/mobsandgeeks/saripaar/Rule.class */
public abstract class Rule<VALIDATABLE> {
    private final int mSequence;

    protected Rule(int i) {
        this.mSequence = i;
    }

    public abstract String getMessage(Context context);

    public final int getSequence() {
        return this.mSequence;
    }

    public abstract boolean isValid(VALIDATABLE validatable);
}
