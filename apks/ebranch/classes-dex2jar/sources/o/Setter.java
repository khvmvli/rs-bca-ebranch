package o;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes-dex2jar.jar:o/Setter.class */
public final class Setter {
    private static final Object a = new Object();
    public setLayoutDirection b;
    private final String c;
    public final Context d;
    private final Map<String, BindColor> e;

    public Setter(Drawable.Callback callback, String str, setLayoutDirection setlayoutdirection, Map<String, BindColor> map) {
        if (TextUtils.isEmpty(str) || str.charAt(str.length() - 1) == '/') {
            this.c = str;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append('/');
            this.c = sb.toString();
        }
        if (!(callback instanceof View)) {
            AvailableBookingTimeActivity_ViewBinding.b("LottieDrawable must be inside of a view for images to work.");
            this.e = new HashMap();
            this.d = null;
            return;
        }
        this.d = ((View) callback).getContext();
        this.e = map;
        this.b = setlayoutdirection;
    }

    private Bitmap d(String str, Bitmap bitmap) {
        synchronized (a) {
            this.e.get(str).d = bitmap;
        }
        return bitmap;
    }

    public final Bitmap e(String str) {
        BindColor bindColor = this.e.get(str);
        if (bindColor == null) {
            return null;
        }
        Bitmap bitmap = bindColor.d;
        if (bitmap != null) {
            return bitmap;
        }
        setLayoutDirection setlayoutdirection = this.b;
        if (setlayoutdirection != null) {
            Bitmap e = setlayoutdirection.e();
            if (e != null) {
                d(str, e);
            }
            return e;
        }
        String str2 = bindColor.c;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = true;
        options.inDensity = 160;
        if (!str2.startsWith("data:") || str2.indexOf("base64,") <= 0) {
            try {
                if (!TextUtils.isEmpty(this.c)) {
                    AssetManager assets = this.d.getAssets();
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.c);
                    sb.append(str2);
                    try {
                        return d(str, copyNoRef.b(BitmapFactory.decodeStream(assets.open(sb.toString()), null, options), bindColor.e, bindColor.a));
                    } catch (IllegalArgumentException e2) {
                        AvailableBookingTimeActivity_ViewBinding.a("Unable to decode image.", e2);
                        return null;
                    }
                } else {
                    throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
                }
            } catch (IOException e3) {
                AvailableBookingTimeActivity_ViewBinding.a("Unable to open asset.", e3);
                return null;
            }
        } else {
            try {
                byte[] decode = Base64.decode(str2.substring(str2.indexOf(44) + 1), 0);
                return d(str, BitmapFactory.decodeByteArray(decode, 0, decode.length, options));
            } catch (IllegalArgumentException e4) {
                AvailableBookingTimeActivity_ViewBinding.a("data URL did not have correct base64 format.", e4);
                return null;
            }
        }
    }
}
