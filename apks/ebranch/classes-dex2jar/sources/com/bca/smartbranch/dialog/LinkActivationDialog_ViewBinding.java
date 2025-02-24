package com.bca.smartbranch.dialog;

import android.content.res.Resources;
import android.view.View;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/dialog/LinkActivationDialog_ViewBinding.class */
public class LinkActivationDialog_ViewBinding extends BaseInfoDialog_ViewBinding {
    public LinkActivationDialog_ViewBinding(LinkActivationDialog linkActivationDialog, View view) {
        super(linkActivationDialog, view);
        Resources resources = view.getContext().getResources();
        linkActivationDialog.title = resources.getString(2131820702);
        linkActivationDialog.desc = resources.getString(2131821865);
    }
}
