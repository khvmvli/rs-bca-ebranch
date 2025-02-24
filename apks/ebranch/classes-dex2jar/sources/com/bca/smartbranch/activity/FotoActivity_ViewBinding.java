package com.bca.smartbranch.activity;

import android.content.res.Resources;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.onClickKelurahan;
import o.onClickedUbahCC275;
import o.setCurrencyName;
import o.setInputType;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/FotoActivity_ViewBinding.class */
public class FotoActivity_ViewBinding implements Unbinder {
    private View a;
    private FotoActivity b;
    private View c;
    private View d;
    private View e;
    private View h;
    private View j;

    public FotoActivity_ViewBinding(final FotoActivity fotoActivity, View view) {
        this.b = fotoActivity;
        fotoActivity.toolbar = (setInputType) Utils.findRequiredViewAsType(view, setCurrencyName.IconCompatParcelizer.ae, "field 'toolbar'", setInputType.class);
        fotoActivity.tvTitle = (TextView) Utils.findRequiredViewAsType(view, 2131298790, "field 'tvTitle'", TextView.class);
        View findRequiredView = Utils.findRequiredView(view, 2131297368, "field 'ivGallery' and method 'choosePic'");
        fotoActivity.ivGallery = (ImageView) Utils.castView(findRequiredView, 2131297368, "field 'ivGallery'", ImageView.class);
        this.h = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.FotoActivity_ViewBinding.5
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                fotoActivity.choosePic(view2);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131297313, "field 'ivCameraCopy' and method 'cameraCopy'");
        fotoActivity.ivCameraCopy = (ImageView) Utils.castView(findRequiredView2, 2131297313, "field 'ivCameraCopy'", ImageView.class);
        this.j = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.FotoActivity_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                fotoActivity.cameraCopy();
            }
        });
        fotoActivity.llLanjut = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297758, "field 'llLanjut'", LinearLayout.class);
        View findRequiredView3 = Utils.findRequiredView(view, 2131296458, "field 'btnUlangi' and method 'retakePicture'");
        fotoActivity.btnUlangi = (Button) Utils.castView(findRequiredView3, 2131296458, "field 'btnUlangi'", Button.class);
        this.d = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.FotoActivity_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                fotoActivity.retakePicture();
            }
        });
        View findRequiredView4 = Utils.findRequiredView(view, 2131296380, "field 'btnBatal' and method 'cancelPicture'");
        fotoActivity.btnBatal = (Button) Utils.castView(findRequiredView4, 2131296380, "field 'btnBatal'", Button.class);
        this.c = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.FotoActivity_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                fotoActivity.cancelPicture();
            }
        });
        fotoActivity.llMain = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297766, "field 'llMain'", LinearLayout.class);
        View findRequiredView5 = Utils.findRequiredView(view, 2131296454, "field 'ivCapture' and method 'capturePic'");
        fotoActivity.ivCapture = (ImageButton) Utils.castView(findRequiredView5, 2131296454, "field 'ivCapture'", ImageButton.class);
        this.a = findRequiredView5;
        findRequiredView5.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.FotoActivity_ViewBinding.3
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                fotoActivity.capturePic(view2);
            }
        });
        fotoActivity.cameraView = (onClickKelurahan) Utils.findRequiredViewAsType(view, 2131296466, "field 'cameraView'", onClickKelurahan.class);
        fotoActivity.cropView = (onClickedUbahCC275) Utils.findRequiredViewAsType(view, 2131296825, "field 'cropView'", onClickedUbahCC275.class);
        View findRequiredView6 = Utils.findRequiredView(view, 2131296396, "method 'onResultOk'");
        this.e = findRequiredView6;
        findRequiredView6.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.FotoActivity_ViewBinding.9
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                fotoActivity.onResultOk(view2);
            }
        });
        Resources resources = view.getContext().getResources();
        fotoActivity.fotoKartuIdentitasTitle = resources.getString(2131821676);
        fotoActivity.fotoKartuIdentitasDesc = resources.getString(2131821675);
        fotoActivity.fotoNpwpTitle = resources.getString(2131821683);
        fotoActivity.fotoNpwpDesc = resources.getString(2131821682);
        fotoActivity.fotoDiriTitle = resources.getString(2131821672);
        fotoActivity.fotoDiriDesc = resources.getString(2131821671);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        FotoActivity fotoActivity = this.b;
        if (fotoActivity != null) {
            this.b = null;
            fotoActivity.toolbar = null;
            fotoActivity.tvTitle = null;
            fotoActivity.ivGallery = null;
            fotoActivity.ivCameraCopy = null;
            fotoActivity.llLanjut = null;
            fotoActivity.btnUlangi = null;
            fotoActivity.btnBatal = null;
            fotoActivity.llMain = null;
            fotoActivity.ivCapture = null;
            fotoActivity.cameraView = null;
            fotoActivity.cropView = null;
            this.h.setOnClickListener(null);
            this.h = null;
            this.j.setOnClickListener(null);
            this.j = null;
            this.d.setOnClickListener(null);
            this.d = null;
            this.c.setOnClickListener(null);
            this.c = null;
            this.a.setOnClickListener(null);
            this.a = null;
            this.e.setOnClickListener(null);
            this.e = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
