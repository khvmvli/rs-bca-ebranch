package com.bca.smartbranch.activity;

import android.content.res.Resources;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import o.getCardImagePath;
import o.onClickKelurahan;
import o.setCurrencyName;
import o.setInputType;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/PhotoCardActivity_ViewBinding.class */
public class PhotoCardActivity_ViewBinding implements Unbinder {
    private View a;
    private View b;
    private View c;
    private PhotoCardActivity d;

    public PhotoCardActivity_ViewBinding(final PhotoCardActivity photoCardActivity, View view) {
        this.d = photoCardActivity;
        photoCardActivity.toolbar = (setInputType) Utils.findRequiredViewAsType(view, setCurrencyName.IconCompatParcelizer.ae, "field 'toolbar'", setInputType.class);
        photoCardActivity.tvTitle = (TextView) Utils.findRequiredViewAsType(view, 2131298790, "field 'tvTitle'", TextView.class);
        photoCardActivity.tvGuidance = (TextView) Utils.findRequiredViewAsType(view, 2131299265, "field 'tvGuidance'", TextView.class);
        photoCardActivity.mSimpleCameraPreview = (onClickKelurahan) Utils.findRequiredViewAsType(view, 2131296466, "field 'mSimpleCameraPreview'", onClickKelurahan.class);
        photoCardActivity.mOverlayPhoto = (getCardImagePath) Utils.findRequiredViewAsType(view, 2131298098, "field 'mOverlayPhoto'", getCardImagePath.class);
        photoCardActivity.llLanjut = (LinearLayout) Utils.findRequiredViewAsType(view, 2131297758, "field 'llLanjut'", LinearLayout.class);
        View findRequiredView = Utils.findRequiredView(view, 2131296454, "field 'btnTakePicture' and method 'onTakePicture'");
        photoCardActivity.btnTakePicture = (ImageButton) Utils.castView(findRequiredView, 2131296454, "field 'btnTakePicture'", ImageButton.class);
        this.b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.PhotoCardActivity_ViewBinding.2
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                photoCardActivity.onTakePicture();
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, 2131296396, "method 'onChooseLanjut'");
        this.c = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.PhotoCardActivity_ViewBinding.1
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                photoCardActivity.onChooseLanjut();
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, 2131296458, "method 'onChooseUlangi'");
        this.a = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() { // from class: com.bca.smartbranch.activity.PhotoCardActivity_ViewBinding.4
            @Override // butterknife.internal.DebouncingOnClickListener
            public final void doClick(View view2) {
                photoCardActivity.onChooseUlangi();
            }
        });
        Resources resources = view.getContext().getResources();
        photoCardActivity.fotoKTPTitle = resources.getString(2131821678);
        photoCardActivity.fotoKTPDesc = resources.getString(2131821677);
        photoCardActivity.fotoPasporTitle = resources.getString(2131821680);
        photoCardActivity.fotoPasporDesc = resources.getString(2131821679);
        photoCardActivity.fotoNpwpTitle = resources.getString(2131821683);
        photoCardActivity.fotoNpwpDesc = resources.getString(2131821682);
        photoCardActivity.fotoIdentitasTitle = resources.getString(2131821674);
        photoCardActivity.fotoIdentitasDesc = resources.getString(2131821673);
    }

    @Override // butterknife.Unbinder
    public void unbind() {
        PhotoCardActivity photoCardActivity = this.d;
        if (photoCardActivity != null) {
            this.d = null;
            photoCardActivity.toolbar = null;
            photoCardActivity.tvTitle = null;
            photoCardActivity.tvGuidance = null;
            photoCardActivity.mSimpleCameraPreview = null;
            photoCardActivity.mOverlayPhoto = null;
            photoCardActivity.llLanjut = null;
            photoCardActivity.btnTakePicture = null;
            this.b.setOnClickListener(null);
            this.b = null;
            this.c.setOnClickListener(null);
            this.c = null;
            this.a.setOnClickListener(null);
            this.a = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
