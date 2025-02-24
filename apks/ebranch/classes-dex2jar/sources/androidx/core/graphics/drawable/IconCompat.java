package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
/* loaded from: classes-dex2jar.jar:androidx/core/graphics/drawable/IconCompat.class */
public class IconCompat extends CustomVersionedParcelable {
    static final PorterDuff.Mode b = PorterDuff.Mode.SRC_IN;
    Object a;
    public int c;
    public byte[] d;
    public int e;
    public Parcelable f;
    public ColorStateList g;
    PorterDuff.Mode h;
    public String i;
    public String j;
    public int k;

    public IconCompat() {
        this.k = -1;
        this.d = null;
        this.f = null;
        this.e = 0;
        this.c = 0;
        this.g = null;
        this.h = b;
        this.j = null;
    }

    private IconCompat(int i) {
        this.d = null;
        this.f = null;
        this.e = 0;
        this.c = 0;
        this.g = null;
        this.h = b;
        this.j = null;
        this.k = i;
    }

    private static Uri a(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getUri();
        }
        try {
            return (Uri) icon.getClass().getMethod("getUri", new Class[0]).invoke(icon, new Object[0]);
        } catch (IllegalAccessException e) {
            Log.e("IconCompat", "Unable to get icon uri", e);
            return null;
        } catch (NoSuchMethodException e2) {
            Log.e("IconCompat", "Unable to get icon uri", e2);
            return null;
        } catch (InvocationTargetException e3) {
            Log.e("IconCompat", "Unable to get icon uri", e3);
            return null;
        }
    }

    private static int c(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getType();
        }
        try {
            return ((Integer) icon.getClass().getMethod("getType", new Class[0]).invoke(icon, new Object[0])).intValue();
        } catch (IllegalAccessException e) {
            StringBuilder sb = new StringBuilder("Unable to get icon type ");
            sb.append(icon);
            Log.e("IconCompat", sb.toString(), e);
            return -1;
        } catch (NoSuchMethodException e2) {
            StringBuilder sb2 = new StringBuilder("Unable to get icon type ");
            sb2.append(icon);
            Log.e("IconCompat", sb2.toString(), e2);
            return -1;
        } catch (InvocationTargetException e3) {
            StringBuilder sb3 = new StringBuilder("Unable to get icon type ");
            sb3.append(icon);
            Log.e("IconCompat", sb3.toString(), e3);
            return -1;
        }
    }

    public static IconCompat c(Resources resources, String str, int i) {
        if (str == null) {
            throw new IllegalArgumentException("Package must not be null.");
        } else if (i != 0) {
            IconCompat iconCompat = new IconCompat(2);
            iconCompat.e = i;
            if (resources != null) {
                try {
                    iconCompat.a = resources.getResourceName(i);
                } catch (Resources.NotFoundException e) {
                    throw new IllegalArgumentException("Icon resource cannot be found");
                }
            } else {
                iconCompat.a = str;
            }
            iconCompat.i = str;
            return iconCompat;
        } else {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
    }

    private static int d(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getResId();
        }
        try {
            return ((Integer) icon.getClass().getMethod("getResId", new Class[0]).invoke(icon, new Object[0])).intValue();
        } catch (IllegalAccessException e) {
            Log.e("IconCompat", "Unable to get icon resource", e);
            return 0;
        } catch (NoSuchMethodException e2) {
            Log.e("IconCompat", "Unable to get icon resource", e2);
            return 0;
        } catch (InvocationTargetException e3) {
            Log.e("IconCompat", "Unable to get icon resource", e3);
            return 0;
        }
    }

    public static IconCompat d(Bitmap bitmap) {
        if (bitmap != null) {
            IconCompat iconCompat = new IconCompat(1);
            iconCompat.a = bitmap;
            return iconCompat;
        }
        throw new IllegalArgumentException("Bitmap must not be null.");
    }

    private static String d(int i) {
        switch (i) {
            case 1:
                return "BITMAP";
            case 2:
                return "RESOURCE";
            case 3:
                return "DATA";
            case 4:
                return "URI";
            case 5:
                return "BITMAP_MASKABLE";
            case 6:
                return "URI_MASKABLE";
            default:
                return "UNKNOWN";
        }
    }

    static Bitmap e(Bitmap bitmap, boolean z) {
        int min = (int) (((float) Math.min(bitmap.getWidth(), bitmap.getHeight())) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f = (float) min;
        float f2 = 0.5f * f;
        float f3 = 0.9166667f * f2;
        if (z) {
            float f4 = 0.010416667f * f;
            paint.setColor(0);
            paint.setShadowLayer(f4, 0.0f, f * 0.020833334f, 1023410176);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.setShadowLayer(f4, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f2, f2, f3, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((float) ((-(bitmap.getWidth() - min)) / 2), (float) ((-(bitmap.getHeight() - min)) / 2));
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f2, f2, f3, paint);
        canvas.setBitmap(null);
        return createBitmap;
    }

    private static String e(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getResPackage();
        }
        try {
            return (String) icon.getClass().getMethod("getResPackage", new Class[0]).invoke(icon, new Object[0]);
        } catch (IllegalAccessException e) {
            Log.e("IconCompat", "Unable to get icon package", e);
            return null;
        } catch (NoSuchMethodException e2) {
            Log.e("IconCompat", "Unable to get icon package", e2);
            return null;
        } catch (InvocationTargetException e3) {
            Log.e("IconCompat", "Unable to get icon package", e3);
            return null;
        }
    }

    public String a() {
        if (this.k == -1 && Build.VERSION.SDK_INT >= 23) {
            return e((Icon) this.a);
        }
        if (this.k == 2) {
            return TextUtils.isEmpty(this.i) ? ((String) this.a).split(":", -1)[0] : this.i;
        }
        StringBuilder sb = new StringBuilder("called getResPackage() on ");
        sb.append(this);
        throw new IllegalStateException(sb.toString());
    }

    public Bitmap b() {
        if (this.k != -1 || Build.VERSION.SDK_INT < 23) {
            int i = this.k;
            if (i == 1) {
                return (Bitmap) this.a;
            }
            if (i == 5) {
                return e((Bitmap) this.a, true);
            }
            StringBuilder sb = new StringBuilder("called getBitmap() on ");
            sb.append(this);
            throw new IllegalStateException(sb.toString());
        }
        Object obj = this.a;
        if (obj instanceof Bitmap) {
            return (Bitmap) obj;
        }
        return null;
    }

    public Icon c(Context context) {
        Icon icon;
        switch (this.k) {
            case -1:
                return (Icon) this.a;
            case 0:
            default:
                throw new IllegalArgumentException("Unknown type");
            case 1:
                icon = Icon.createWithBitmap((Bitmap) this.a);
                break;
            case 2:
                icon = Icon.createWithResource(a(), this.e);
                break;
            case 3:
                icon = Icon.createWithData((byte[]) this.a, this.e, this.c);
                break;
            case 4:
                icon = Icon.createWithContentUri((String) this.a);
                break;
            case 5:
                if (Build.VERSION.SDK_INT < 26) {
                    icon = Icon.createWithBitmap(e((Bitmap) this.a, false));
                    break;
                } else {
                    icon = Icon.createWithAdaptiveBitmap((Bitmap) this.a);
                    break;
                }
            case 6:
                if (Build.VERSION.SDK_INT >= 30) {
                    icon = Icon.createWithAdaptiveBitmapContentUri(c());
                    break;
                } else if (context != null) {
                    InputStream d = d(context);
                    if (d != null) {
                        if (Build.VERSION.SDK_INT < 26) {
                            icon = Icon.createWithBitmap(e(BitmapFactory.decodeStream(d), false));
                            break;
                        } else {
                            icon = Icon.createWithAdaptiveBitmap(BitmapFactory.decodeStream(d));
                            break;
                        }
                    } else {
                        StringBuilder sb = new StringBuilder("Cannot load adaptive icon from uri: ");
                        sb.append(c());
                        throw new IllegalStateException(sb.toString());
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder("Context is required to resolve the file uri of the icon: ");
                    sb2.append(c());
                    throw new IllegalArgumentException(sb2.toString());
                }
        }
        ColorStateList colorStateList = this.g;
        if (colorStateList != null) {
            icon.setTintList(colorStateList);
        }
        PorterDuff.Mode mode = this.h;
        if (mode != b) {
            icon.setTintMode(mode);
        }
        return icon;
    }

    public Uri c() {
        if (this.k == -1 && Build.VERSION.SDK_INT >= 23) {
            return a((Icon) this.a);
        }
        int i = this.k;
        if (i == 4 || i == 6) {
            return Uri.parse((String) this.a);
        }
        StringBuilder sb = new StringBuilder("called getUri() on ");
        sb.append(this);
        throw new IllegalStateException(sb.toString());
    }

    public int d() {
        return (this.k != -1 || Build.VERSION.SDK_INT < 23) ? this.k : c((Icon) this.a);
    }

    public InputStream d(Context context) {
        Uri c = c();
        String scheme = c.getScheme();
        if ("content".equals(scheme) || "file".equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(c);
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder("Unable to load image from URI: ");
                sb.append(c);
                Log.w("IconCompat", sb.toString(), e);
                return null;
            }
        } else {
            try {
                return new FileInputStream(new File((String) this.a));
            } catch (FileNotFoundException e2) {
                StringBuilder sb2 = new StringBuilder("Unable to load image from path: ");
                sb2.append(c);
                Log.w("IconCompat", sb2.toString(), e2);
                return null;
            }
        }
    }

    @Override // androidx.versionedparcelable.CustomVersionedParcelable
    public void d(boolean z) {
        this.j = this.h.name();
        switch (this.k) {
            case -1:
                if (!z) {
                    this.f = (Parcelable) this.a;
                    return;
                }
                throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
            case 0:
            default:
                return;
            case 1:
            case 5:
                if (z) {
                    Bitmap bitmap = (Bitmap) this.a;
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    bitmap.compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                    this.d = byteArrayOutputStream.toByteArray();
                    return;
                }
                this.f = (Parcelable) this.a;
                return;
            case 2:
                this.d = ((String) this.a).getBytes(Charset.forName("UTF-16"));
                return;
            case 3:
                this.d = (byte[]) this.a;
                return;
            case 4:
            case 6:
                this.d = this.a.toString().getBytes(Charset.forName("UTF-16"));
                return;
        }
    }

    public int e() {
        if (this.k == -1 && Build.VERSION.SDK_INT >= 23) {
            return d((Icon) this.a);
        }
        if (this.k == 2) {
            return this.e;
        }
        StringBuilder sb = new StringBuilder("called getResId() on ");
        sb.append(this);
        throw new IllegalStateException(sb.toString());
    }

    @Deprecated
    public Icon h() {
        return c((Context) null);
    }

    @Override // androidx.versionedparcelable.CustomVersionedParcelable
    public void j() {
        this.h = PorterDuff.Mode.valueOf(this.j);
        switch (this.k) {
            case -1:
                Parcelable parcelable = this.f;
                if (parcelable != null) {
                    this.a = parcelable;
                    return;
                }
                throw new IllegalArgumentException("Invalid icon");
            case 0:
            default:
                return;
            case 1:
            case 5:
                Parcelable parcelable2 = this.f;
                if (parcelable2 != null) {
                    this.a = parcelable2;
                    return;
                }
                byte[] bArr = this.d;
                this.a = bArr;
                this.k = 3;
                this.e = 0;
                this.c = bArr.length;
                return;
            case 2:
            case 4:
            case 6:
                String str = new String(this.d, Charset.forName("UTF-16"));
                this.a = str;
                if (this.k == 2 && this.i == null) {
                    this.i = str.split(":", -1)[0];
                    return;
                }
                return;
            case 3:
                this.a = this.d;
                return;
        }
    }

    public String toString() {
        if (this.k == -1) {
            return String.valueOf(this.a);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        sb.append(d(this.k));
        switch (this.k) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.a).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.a).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.i);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(e())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.e);
                if (this.c != 0) {
                    sb.append(" off=");
                    sb.append(this.c);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.a);
                break;
        }
        if (this.g != null) {
            sb.append(" tint=");
            sb.append(this.g);
        }
        if (this.h != b) {
            sb.append(" mode=");
            sb.append(this.h);
        }
        sb.append(")");
        return sb.toString();
    }
}
