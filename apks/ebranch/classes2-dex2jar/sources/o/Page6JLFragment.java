package o;

import android.hardware.Camera;
import android.util.Log;
import java.util.List;
/* loaded from: classes2-dex2jar.jar:o/Page6JLFragment.class */
public final class Page6JLFragment {
    boolean a;
    boolean b;
    boolean c;
    boolean d;
    Camera e;
    int f;
    int g;
    Camera h;
    Camera.CameraInfo i;
    int j;
    int l;
    Camera.CameraInfo m;

    /* renamed from: o  reason: collision with root package name */
    int f49o;

    public Page6JLFragment() {
        this(-1);
    }

    public Page6JLFragment(int i) {
        this.e = null;
        this.i = null;
        this.j = -1;
        this.h = null;
        this.m = null;
        this.g = -1;
        this.f49o = -1;
        this.l = -1;
        this.f = 0;
        this.c = false;
        this.b = false;
        this.d = true;
        this.a = false;
        if (i == 0 || i == 1) {
            this.f49o = i;
        }
        e();
    }

    private void e() {
        int numberOfCameras = Camera.getNumberOfCameras();
        int i = 0;
        int i2 = 0;
        if (numberOfCameras > 0) {
            for (int i3 = 0; i3 < numberOfCameras; i3++) {
                Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                Camera.getCameraInfo(i3, cameraInfo);
                if (this.j == -1 && cameraInfo.facing == 0) {
                    this.i = cameraInfo;
                    this.j = i3;
                }
                if (this.g == -1 && cameraInfo.facing == 1) {
                    this.m = cameraInfo;
                    this.g = i3;
                }
                if (!(this.j == -1 || this.g == -1)) {
                    break;
                }
            }
        }
        int i4 = this.f49o;
        if (i4 == -1) {
            int i5 = this.j;
            if (i5 == -1) {
                i = 1;
            }
            this.f49o = i;
            this.l = i5 != -1 ? i5 : this.g;
        } else if (i4 == 0) {
            this.l = this.j;
        } else if (i4 == 1) {
            this.l = this.g;
        } else {
            int i6 = this.j;
            if (i6 == -1) {
                i2 = 1;
            }
            this.f49o = i2;
            this.l = i6 != -1 ? i6 : this.g;
        }
        a();
    }

    public final void a() {
        if (!this.c) {
            int i = this.l;
            int i2 = this.j;
            if (i == i2) {
                try {
                    this.e = Camera.open(i2);
                    this.c = true;
                } catch (Exception e) {
                    Log.i("SIMPLE_CAMERA", String.valueOf(e));
                    this.e = null;
                    Log.w(getClass().getSimpleName(), e.getMessage());
                }
            } else {
                int i3 = this.g;
                if (i == i3) {
                    try {
                        this.h = Camera.open(i3);
                        this.c = true;
                    } catch (Exception e2) {
                        Log.i("SIMPLE_CAMERA", String.valueOf(e2));
                        this.h = null;
                        Log.w(getClass().getSimpleName(), e2.getMessage());
                    }
                }
            }
        }
    }

    public final boolean b() {
        Camera d = d();
        Camera.Parameters parameters = d != null ? d.getParameters() : null;
        boolean z = false;
        if (parameters != null) {
            List<String> supportedFocusModes = parameters.getSupportedFocusModes();
            z = false;
            if (supportedFocusModes != null) {
                z = false;
                if (supportedFocusModes.contains("auto")) {
                    z = true;
                }
            }
        }
        return z;
    }

    public final Camera d() {
        int i = this.l;
        if (i == -1) {
            return null;
        }
        if (i == this.j) {
            return this.e;
        }
        if (i == this.g) {
            return this.h;
        }
        return null;
    }
}
