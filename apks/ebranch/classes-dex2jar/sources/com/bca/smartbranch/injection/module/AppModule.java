package com.bca.smartbranch.injection.module;

import android.app.Application;
import com.bca.smartbranch.App;
import o.onChooseValueDescPekerjaan;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/injection/module/AppModule.class */
public class AppModule {
    private final App a;

    public AppModule(App app) {
        this.a = app;
    }

    @onChooseValueDescPekerjaan
    public Application e() {
        return this.a;
    }
}
