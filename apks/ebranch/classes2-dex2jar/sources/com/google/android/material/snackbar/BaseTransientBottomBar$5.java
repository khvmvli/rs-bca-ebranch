package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Message;
/* loaded from: classes2-dex2jar.jar:com/google/android/material/snackbar/BaseTransientBottomBar$5.class */
final class BaseTransientBottomBar$5 implements Handler.Callback {
    BaseTransientBottomBar$5() {
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            ((BaseTransientBottomBar) message.obj).h();
            return true;
        } else if (i != 1) {
            return false;
        } else {
            ((BaseTransientBottomBar) message.obj).b(message.arg1);
            return true;
        }
    }
}
