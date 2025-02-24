package com.bca.smartbranch.activity;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.hardware.Camera;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.MenuItem;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.OnClick;
import java.io.ByteArrayOutputStream;
import java.util.List;
import o.LogRedirector;
import o.Page6ILFragment;
import o.ReRegistrationSuccessActivity_ViewBinding;
import o.documentProvider;
import o.getCardImagePath;
import o.onClickKelurahan;
import o.onClickKirimanUang;
import o.onClickKota;
import o.onClickProvinsi;
import o.setCardSlogan;
import o.setCurrencyName;
import o.setInputType;
import o.ubahProfil;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/PhotoCardActivity.class */
public class PhotoCardActivity extends BaseActivityPostLogin {
    @BindView(2131296454)
    ImageButton btnTakePicture;
    @BindString(2131821673)
    String fotoIdentitasDesc;
    @BindString(2131821674)
    String fotoIdentitasTitle;
    @BindString(2131821677)
    String fotoKTPDesc;
    @BindString(2131821678)
    String fotoKTPTitle;
    @BindString(2131821682)
    String fotoNpwpDesc;
    @BindString(2131821683)
    String fotoNpwpTitle;
    @BindString(2131821679)
    String fotoPasporDesc;
    @BindString(2131821680)
    String fotoPasporTitle;
    @BindView(2131297758)
    LinearLayout llLanjut;
    @BindView(2131298098)
    getCardImagePath mOverlayPhoto;
    @BindView(2131296466)
    onClickKelurahan mSimpleCameraPreview;
    private Bitmap p;
    private Bundle q;
    protected onClickProvinsi r;
    protected Page6ILFragment s;
    @BindView(setCurrencyName.IconCompatParcelizer.ae)
    setInputType toolbar;
    @BindView(2131299265)
    TextView tvGuidance;
    @BindView(2131298790)
    TextView tvTitle;
    private byte[] y;
    protected boolean f = false;
    protected boolean t = false;
    protected boolean n = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/PhotoCardActivity$RemoteActionCompatParcelizer.class */
    public final class RemoteActionCompatParcelizer extends AsyncTask<Void, Void, Uri> {
        private RemoteActionCompatParcelizer() {
            PhotoCardActivity.this = r4;
        }

        /* synthetic */ RemoteActionCompatParcelizer(PhotoCardActivity photoCardActivity, byte b) {
            this();
        }

        @Override // android.os.AsyncTask
        protected final /* synthetic */ Uri doInBackground(Void[] voidArr) {
            PhotoCardActivity photoCardActivity = PhotoCardActivity.this;
            photoCardActivity.p = BitmapFactory.decodeByteArray(photoCardActivity.y, 0, PhotoCardActivity.this.y.length);
            PhotoCardActivity photoCardActivity2 = PhotoCardActivity.this;
            Uri c = PhotoCardActivity.c(photoCardActivity2, photoCardActivity2, photoCardActivity2.p);
            PhotoCardActivity.this.mOverlayPhoto.setImageUri(c);
            return c;
        }

        @Override // android.os.AsyncTask
        protected final /* synthetic */ void onPostExecute(Uri uri) {
            Uri uri2 = uri;
            onPostExecute(uri2);
            if (PhotoCardActivity.this.q != null) {
                if (PhotoCardActivity.this.q.getInt("TAKE_FOTO") == 3) {
                    documentProvider.b().d(new ReRegistrationSuccessActivity_ViewBinding(PhotoCardActivity.this.mOverlayPhoto.c()));
                } else {
                    documentProvider.b().d(new ubahProfil(PhotoCardActivity.this.mOverlayPhoto.c()));
                }
            }
            PhotoCardActivity.this.getContentResolver().delete(uri2, null, null);
            PhotoCardActivity photoCardActivity = PhotoCardActivity.this;
            ProgressDialog progressDialog = photoCardActivity.l;
            if (progressDialog != null && progressDialog.isShowing()) {
                photoCardActivity.l.dismiss();
            }
            PhotoCardActivity.this.k();
        }

        @Override // android.os.AsyncTask
        protected final void onPreExecute() {
            onPreExecute();
            PhotoCardActivity.this.z();
        }
    }

    public static void a(LogRedirector.Logger logger) {
        logger.a();
    }

    static /* synthetic */ Uri c(PhotoCardActivity photoCardActivity, Context context, Bitmap bitmap) {
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, new ByteArrayOutputStream());
        ContentResolver contentResolver = context.getContentResolver();
        StringBuilder sb = new StringBuilder("tmp_image");
        sb.append(System.currentTimeMillis());
        return Uri.parse(MediaStore.Images.Media.insertImage(contentResolver, bitmap, sb.toString(), (String) null));
    }

    private void v() {
        if (!this.n) {
            this.s = new Page6ILFragment(this, Page6ILFragment.IconCompatParcelizer.c);
            this.r = new onClickProvinsi(this, new onClickProvinsi.read() { // from class: com.bca.smartbranch.activity.PhotoCardActivity.5
                public final void e(byte[] bArr) {
                    if (PhotoCardActivity.this.t) {
                        PhotoCardActivity.this.mSimpleCameraPreview.b();
                        PhotoCardActivity.this.y = bArr;
                        PhotoCardActivity.this.llLanjut.setVisibility(0);
                        PhotoCardActivity.this.btnTakePicture.setVisibility(8);
                        PhotoCardActivity.this.tvGuidance.setVisibility(8);
                        PhotoCardActivity.this.mOverlayPhoto.setBackgroundTransparent(true);
                    }
                    PhotoCardActivity.this.f = true;
                    PhotoCardActivity.this.t = false;
                }
            });
            this.mSimpleCameraPreview.setCamera(this.s);
            this.mSimpleCameraPreview.setCameraCropped(true);
            this.mSimpleCameraPreview.setCaptureOriginalImage(false);
            List a = this.mSimpleCameraPreview.a();
            if (a != null) {
                if (((Camera.Size) a.get(0)).width > ((Camera.Size) a.get(a.size() - 1)).width) {
                    this.mSimpleCameraPreview.setPictureSize((Camera.Size) a.get(0));
                } else {
                    this.mSimpleCameraPreview.setPictureSize((Camera.Size) a.get(a.size() - 1));
                }
            }
            this.n = true;
        }
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    public final void d(Bundle bundle) {
        d(bundle);
        b(this.toolbar);
        i();
        i().d(true);
        i().d("");
        Bundle extras = getIntent().getExtras();
        this.q = extras;
        if (extras != null) {
            if (extras.getInt("TAKE_FOTO") == 1) {
                this.tvTitle.setText(this.fotoKTPTitle);
                this.tvGuidance.setText(this.fotoKTPDesc);
            } else if (this.q.getInt("TAKE_FOTO") == 2) {
                this.tvTitle.setText(this.fotoPasporTitle);
                this.tvGuidance.setText(this.fotoPasporDesc);
            } else if (this.q.getInt("TAKE_FOTO") == 3) {
                this.tvTitle.setText(this.fotoNpwpTitle);
                this.tvGuidance.setText(this.fotoNpwpDesc);
            } else {
                this.tvTitle.setText(this.fotoIdentitasTitle);
                this.tvGuidance.setText(this.fotoIdentitasDesc);
            }
        }
        if (Build.VERSION.SDK_INT >= 33) {
            onClickKirimanUang.d(this);
        } else {
            onClickKirimanUang.c(this);
        }
    }

    @OnClick({2131296396})
    public void onChooseLanjut() {
        new RemoteActionCompatParcelizer(this, (byte) 0).execute(new Void[0]);
    }

    @OnClick({2131296458})
    public void onChooseUlangi() {
        this.f = false;
        this.t = false;
        this.mSimpleCameraPreview.c();
        this.llLanjut.setVisibility(8);
        this.tvGuidance.setVisibility(0);
        this.btnTakePicture.setVisibility(0);
        this.mOverlayPhoto.setImageBitmap(null);
        this.mOverlayPhoto.setBackgroundTransparent(false);
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return onOptionsItemSelected(menuItem);
        }
        k();
        return true;
    }

    @Override // o.getView, o.MediaSessionCompat$QueueItem, android.app.Activity, o.setOnHierarchyChangeListener.RemoteActionCompatParcelizer
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        onRequestPermissionsResult(i, strArr, iArr);
        onClickKirimanUang.d(this, i, iArr);
    }

    @OnClick({2131296454})
    public void onTakePicture() {
        if (!this.t && !this.f) {
            this.t = true;
            if (this.mSimpleCameraPreview.e()) {
                ((onClickKota) this.r).b = true;
            } else {
                ((onClickKota) this.r).b = false;
            }
            this.mSimpleCameraPreview.d(this.r);
        }
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final void p() {
        setCardSlogan.e().b = "PhotoCardActivity";
        this.j = "PhotoCardActivity";
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final int q() {
        return 2131492975;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final Activity r() {
        return this;
    }

    public final void s() {
        v();
        this.mSimpleCameraPreview.c();
        this.f = false;
        this.t = false;
    }

    public final void t() {
        v();
        this.mSimpleCameraPreview.c();
        this.f = false;
        this.t = false;
    }
}
