package com.facebook.stetho.dumpapp;

import io.realm.CollectionUtils;
import o.getInspectorModules;
import o.provide;
/* loaded from: classes-dex2jar.jar:com/facebook/stetho/dumpapp/GlobalOptions.class */
public class GlobalOptions {
    public final getInspectorModules optionHelp;
    public final getInspectorModules optionListPlugins;
    public final getInspectorModules optionProcess;
    public final provide options;

    public GlobalOptions() {
        getInspectorModules getinspectormodules = new getInspectorModules("h", "help", false, "Print this help");
        this.optionHelp = getinspectormodules;
        getInspectorModules getinspectormodules2 = new getInspectorModules("l", CollectionUtils.LIST_TYPE, false, "List available plugins");
        this.optionListPlugins = getinspectormodules2;
        getInspectorModules getinspectormodules3 = new getInspectorModules("p", "process", true, "Specify target process");
        this.optionProcess = getinspectormodules3;
        provide provide = new provide();
        this.options = provide;
        provide.c(getinspectormodules);
        provide.c(getinspectormodules2);
        provide.c(getinspectormodules3);
    }
}
