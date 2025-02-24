package com.bca.smartbranch.activity;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.Camera;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.provider.MediaStore;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.OnClick;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.List;
import o.CC6MastercardInfoActivity_ViewBinding;
import o.CardType;
import o.LogRedirector;
import o.OR6ReviewUbahFragment_ViewBinding;
import o.Page6ILFragment;
import o.ReRegistrationSuccessActivity;
import o.documentProvider;
import o.indexOf;
import o.onClickKelurahan;
import o.onClickKota;
import o.onClickProvinsi;
import o.onClickedUbahCC275;
import o.onClickedUbahCC277;
import o.setCardSlogan;
import o.setCurrencyName;
import o.setInputType;
import o.w;
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/activity/FotoActivity.class */
public class FotoActivity extends BaseActivityPostLogin {
    private Page6ILFragment B;
    private Context C;
    private onClickProvinsi D;
    @BindView(2131296380)
    Button btnBatal;
    @BindView(2131296458)
    Button btnUlangi;
    @BindView(2131296466)
    onClickKelurahan cameraView;
    @BindView(2131296825)
    onClickedUbahCC275 cropView;
    private AsyncTask<Void, Void, File> f;
    @BindString(2131821671)
    String fotoDiriDesc;
    @BindString(2131821672)
    String fotoDiriTitle;
    @BindString(2131821675)
    String fotoKartuIdentitasDesc;
    @BindString(2131821676)
    String fotoKartuIdentitasTitle;
    @BindString(2131821682)
    String fotoNpwpDesc;
    @BindString(2131821683)
    String fotoNpwpTitle;
    @BindView(2131297313)
    ImageView ivCameraCopy;
    @BindView(2131296454)
    ImageButton ivCapture;
    @BindView(2131297368)
    ImageView ivGallery;
    @BindView(2131297758)
    LinearLayout llLanjut;
    @BindView(2131297766)
    LinearLayout llMain;
    private AsyncTask<Void, Void, byte[]> n;
    private Uri q;
    private File r;
    private byte[] t;
    @BindView(setCurrencyName.IconCompatParcelizer.ae)
    setInputType toolbar;
    @BindView(2131298790)
    TextView tvTitle;
    private Bundle x;
    private boolean v = true;
    private boolean y = false;
    private boolean w = false;
    private boolean u = false;
    private CardType s = new CardType(this);
    private int p = -1;
    private boolean A = false;

    static /* synthetic */ Uri e(FotoActivity fotoActivity, Context context, byte[] bArr) {
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
        decodeByteArray.compress(Bitmap.CompressFormat.JPEG, 100, new ByteArrayOutputStream());
        ContentResolver contentResolver = context.getContentResolver();
        StringBuilder sb = new StringBuilder("tmp_image");
        sb.append(System.currentTimeMillis());
        return Uri.parse(MediaStore.Images.Media.insertImage(contentResolver, decodeByteArray, sb.toString(), (String) null));
    }

    public static void e(LogRedirector.Logger logger) {
        logger.a();
    }

    @OnClick({2131297313})
    public void cameraCopy() {
        if (!this.y) {
            this.cameraView.h();
        }
    }

    @OnClick({2131296380})
    public void cancelPicture() {
        if (!this.A) {
            if (this.v) {
                getContentResolver().delete(this.q, null, null);
            }
            this.v = true;
            this.y = false;
            this.w = false;
            this.cropView.setVisibility(8);
            this.llLanjut.setVisibility(8);
            this.ivCapture.setVisibility(0);
            this.y = false;
            if (Build.VERSION.SDK_INT >= 33) {
                CC6MastercardInfoActivity_ViewBinding.e((FotoActivity) this.C);
            } else {
                CC6MastercardInfoActivity_ViewBinding.a((FotoActivity) this.C);
            }
        } else {
            k();
        }
    }

    @OnClick({2131296454})
    public void capturePic(View view) {
        if (this.v && !this.w && !this.y) {
            this.w = true;
            if (this.cameraView.e()) {
                ((onClickKota) this.D).b = true;
            } else {
                ((onClickKota) this.D).b = false;
            }
            this.cameraView.d(this.D);
        }
    }

    @OnClick({2131297368})
    public void choosePic(View view) {
        startActivityForResult(indexOf.b(this, 0), 7458);
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    public final void d(Bundle bundle) {
        d(bundle);
        this.C = this;
        this.x = getIntent().getExtras();
        b(this.toolbar);
        i();
        i().d(true);
        i().d("");
        if (this.x.getString("title") == null) {
            this.tvTitle.setText(this.fotoDiriTitle);
        } else if (this.x.getString("title").equals("profil")) {
            this.tvTitle.setText("Foto Profil");
        }
        if (this.x.getString("IMAGE_URI") != null) {
            this.A = true;
            this.v = false;
            Uri parse = Uri.parse(this.x.getString("IMAGE_URI"));
            this.q = parse;
            onClickedUbahCC275 onclickedubahcc275 = this.cropView;
            onclickedubahcc275.n = parse;
            onclickedubahcc275.c = 1;
            onclickedubahcc275.a = 1;
            onclickedubahcc275.e(this);
            this.btnBatal.setVisibility(0);
            this.btnUlangi.setVisibility(8);
            this.llLanjut.setVisibility(0);
            this.ivCapture.setVisibility(8);
            this.cropView.setVisibility(0);
        }
    }

    @Override // o.getView, o.MediaSessionCompat$QueueItem, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        onActivityResult(i, i2, intent);
        indexOf.c(i, i2, intent, this, new w() { // from class: com.bca.smartbranch.activity.FotoActivity.3
            public final void b(final File file) {
                FotoActivity.this.t = null;
                FotoActivity.this.v = false;
                if (FotoActivity.this.f != null && FotoActivity.this.f.getStatus() == AsyncTask.Status.RUNNING) {
                    FotoActivity.this.f.cancel(true);
                }
                FotoActivity.this.f = new AsyncTask<Void, Void, File>() { // from class: com.bca.smartbranch.activity.FotoActivity.3.1
                    @Override // android.os.AsyncTask
                    protected final /* synthetic */ File doInBackground(Void[] voidArr) {
                        FotoActivity.this.r = file;
                        FotoActivity fotoActivity = FotoActivity.this;
                        OR6ReviewUbahFragment_ViewBinding.RemoteActionCompatParcelizer remoteActionCompatParcelizer = new OR6ReviewUbahFragment_ViewBinding.RemoteActionCompatParcelizer(FotoActivity.this);
                        remoteActionCompatParcelizer.d.b = (float) FotoActivity.this.getWindowManager().getDefaultDisplay().getWidth();
                        fotoActivity.r = remoteActionCompatParcelizer.d.d(file);
                        return FotoActivity.this.r;
                    }

                    @Override // android.os.AsyncTask
                    protected final /* synthetic */ void onPostExecute(File file2) {
                        onPostExecute(file2);
                        FotoActivity.this.q = Uri.fromFile(FotoActivity.this.r);
                        onClickedUbahCC275 onclickedubahcc275 = FotoActivity.this.cropView;
                        onclickedubahcc275.n = FotoActivity.this.q;
                        onclickedubahcc275.c = 1;
                        onclickedubahcc275.a = 1;
                        onclickedubahcc275.e(FotoActivity.this);
                        FotoActivity.this.btnBatal.setVisibility(0);
                        FotoActivity.this.btnUlangi.setVisibility(8);
                        FotoActivity.this.llLanjut.setVisibility(0);
                        FotoActivity.this.ivCapture.setVisibility(8);
                        FotoActivity.this.cropView.setVisibility(0);
                    }
                };
                FotoActivity.this.f.execute(new Void[0]);
            }

            public final void c(Exception exc) {
                Log.i("EBRANCH", String.valueOf(exc));
                FotoActivity.this.v = true;
            }
        });
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin, o.setPadding, o.getView, android.app.Activity
    public void onDestroy() {
        PreferenceManager.getDefaultSharedPreferences(this).edit().remove("pl.aprilapps.folder_name").remove("pl.aprilapps.folder_location").remove("pl.aprilapps.public_temp").apply();
        onDestroy();
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
        CC6MastercardInfoActivity_ViewBinding.c(this, i, iArr);
    }

    @OnClick({2131296396})
    public void onResultOk(View view) {
        Bitmap bitmap;
        z();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        onClickedUbahCC275 onclickedubahcc275 = this.cropView;
        if (onclickedubahcc275.getDrawable() == null || onclickedubahcc275.b == null) {
            bitmap = null;
        } else {
            onclickedubahcc275.g.set(onclickedubahcc275.d);
            onclickedubahcc275.g.postConcat(onclickedubahcc275.l);
            Matrix matrix = onclickedubahcc275.g;
            RectF d = onclickedubahcc275.d(matrix);
            float f = onclickedubahcc275.b.left - d.left;
            float f2 = onclickedubahcc275.b.top - d.top;
            matrix.getValues(onclickedubahcc275.f);
            matrix.getValues(onclickedubahcc275.f);
            float sqrt = (float) Math.sqrt((double) (((float) Math.pow((double) onclickedubahcc275.f[0], 2.0d)) + ((float) Math.pow((double) onclickedubahcc275.f[3], 2.0d))));
            float f3 = f / sqrt;
            float f4 = (float) onclickedubahcc275.h;
            bitmap = onClickedUbahCC277.e(onclickedubahcc275.getContext(), onclickedubahcc275.n, new Rect((int) (f3 * f4), (int) ((f2 / sqrt) * f4), (int) (((f + onclickedubahcc275.b.width()) / sqrt) * ((float) onclickedubahcc275.h)), (int) (((f2 + onclickedubahcc275.b.height()) / sqrt) * ((float) onclickedubahcc275.h))), onclickedubahcc275.i, onclickedubahcc275.j, onclickedubahcc275.e.b);
        }
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        documentProvider.b().d(new ReRegistrationSuccessActivity(bitmap));
        if (this.v) {
            getContentResolver().delete(this.q, null, null);
        }
        x();
        k();
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin, o.getView, android.app.Activity
    public void onResume() {
        onResume();
        getWindow().setFormat(-3);
        if (this.v) {
            new Handler().postDelayed(new Runnable() { // from class: com.bca.smartbranch.activity.FotoActivity.4
                @Override // java.lang.Runnable
                public final void run() {
                    FotoActivity.this.y = false;
                    if (Build.VERSION.SDK_INT >= 33) {
                        CC6MastercardInfoActivity_ViewBinding.e((FotoActivity) FotoActivity.this.C);
                    } else {
                        CC6MastercardInfoActivity_ViewBinding.a((FotoActivity) FotoActivity.this.C);
                    }
                }
            }, 500);
        }
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final void p() {
        setCardSlogan.e().b = "FotoActivity";
        this.j = "FotoActivity";
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final int q() {
        return 2131493185;
    }

    @Override // com.bca.smartbranch.activity.BaseActivityPostLogin
    protected final Activity r() {
        return this;
    }

    @OnClick({2131296458})
    public void retakePicture() {
        if (this.v) {
            getContentResolver().delete(this.q, null, null);
        }
        this.v = true;
        this.y = false;
        this.w = false;
        this.cropView.setVisibility(8);
        this.llLanjut.setVisibility(8);
        this.ivCapture.setVisibility(0);
        this.y = false;
        if (Build.VERSION.SDK_INT >= 33) {
            CC6MastercardInfoActivity_ViewBinding.e((FotoActivity) this.C);
        } else {
            CC6MastercardInfoActivity_ViewBinding.a((FotoActivity) this.C);
        }
    }

    public final void s() {
        if (!this.u) {
            if (this.x.getInt("TAKE_FOTO") == 2) {
                this.B = new Page6ILFragment(this, Page6ILFragment.IconCompatParcelizer.d);
            } else {
                this.B = new Page6ILFragment(this, Page6ILFragment.IconCompatParcelizer.c);
            }
            this.D = new onClickProvinsi(this, new onClickProvinsi.read() { // from class: com.bca.smartbranch.activity.FotoActivity.1
                public final void e(final byte[] bArr) {
                    if (FotoActivity.this.w) {
                        FotoActivity.this.r = null;
                        FotoActivity.this.cameraView.b();
                        if (FotoActivity.this.n != null && FotoActivity.this.n.getStatus() == AsyncTask.Status.RUNNING) {
                            FotoActivity.this.n.cancel(true);
                        }
                        FotoActivity.this.n = new AsyncTask<Void, Void, byte[]>() { // from class: com.bca.smartbranch.activity.FotoActivity.1.5
                            @Override // android.os.AsyncTask
                            protected final /* synthetic */ byte[] doInBackground(Void[] voidArr) {
                                FotoActivity.this.t = bArr;
                                return FotoActivity.this.t;
                            }

                            @Override // android.os.AsyncTask
                            protected final /* synthetic */ void onPostExecute(byte[] bArr2) {
                                onPostExecute(bArr2);
                                FotoActivity.this.q = FotoActivity.e(FotoActivity.this, FotoActivity.this, FotoActivity.this.t);
                                onClickedUbahCC275 onclickedubahcc275 = FotoActivity.this.cropView;
                                onclickedubahcc275.n = FotoActivity.this.q;
                                onclickedubahcc275.c = 1;
                                onclickedubahcc275.a = 1;
                                onclickedubahcc275.e(FotoActivity.this);
                                FotoActivity.this.btnBatal.setVisibility(8);
                                FotoActivity.this.btnUlangi.setVisibility(0);
                                FotoActivity.this.llLanjut.setVisibility(0);
                                FotoActivity.this.ivCapture.setVisibility(8);
                                FotoActivity.this.cropView.setVisibility(0);
                            }
                        };
                        FotoActivity.this.n.execute(new Void[0]);
                    }
                    FotoActivity.this.y = true;
                    FotoActivity.this.w = false;
                }
            });
            this.cameraView.setCamera(this.B);
            this.cameraView.setCameraCropped(true);
            this.cameraView.setCaptureOriginalImage(true);
            List a = this.cameraView.a();
            if (a != null) {
                if (((Camera.Size) a.get(0)).width > ((Camera.Size) a.get(a.size() - 1)).width) {
                    this.cameraView.setPictureSize((Camera.Size) a.get(0));
                } else {
                    this.cameraView.setPictureSize((Camera.Size) a.get(a.size() - 1));
                }
            }
            this.u = true;
        }
        new indexOf.read(this, (byte) 0);
        this.cameraView.c();
        this.cropView.setVisibility(8);
        this.ivCapture.setVisibility(0);
        this.llLanjut.setVisibility(8);
        this.y = false;
        this.w = false;
    }
}
