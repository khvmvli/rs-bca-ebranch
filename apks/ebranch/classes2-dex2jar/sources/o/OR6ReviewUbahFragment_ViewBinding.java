package o;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import java.io.File;
/* loaded from: classes2-dex2jar.jar:o/OR6ReviewUbahFragment_ViewBinding.class */
public final class OR6ReviewUbahFragment_ViewBinding {
    private Context a;
    public float b;
    private Bitmap.Config c;
    private String d;
    private Bitmap.CompressFormat e;
    private float f;
    private int h;

    /* loaded from: classes2-dex2jar.jar:o/OR6ReviewUbahFragment_ViewBinding$RemoteActionCompatParcelizer.class */
    public static final class RemoteActionCompatParcelizer {
        public OR6ReviewUbahFragment_ViewBinding d;

        public RemoteActionCompatParcelizer(Context context) {
            this.d = new OR6ReviewUbahFragment_ViewBinding(context, (byte) 0);
        }
    }

    private OR6ReviewUbahFragment_ViewBinding(Context context) {
        this.b = 612.0f;
        this.f = 816.0f;
        this.e = Bitmap.CompressFormat.JPEG;
        this.c = Bitmap.Config.ARGB_8888;
        this.h = 80;
        this.a = context;
        StringBuilder sb = new StringBuilder();
        sb.append(context.getCacheDir().getPath());
        sb.append(File.pathSeparator);
        sb.append("Compressor");
        this.d = sb.toString();
    }

    /* synthetic */ OR6ReviewUbahFragment_ViewBinding(Context context, byte b) {
        this(context);
    }

    public final File d(File file) {
        return Page6DBCADollarFragment_ViewBinding.d(this.a, Uri.fromFile(file), this.b, this.f, this.e, this.c, this.h, this.d);
    }
}
