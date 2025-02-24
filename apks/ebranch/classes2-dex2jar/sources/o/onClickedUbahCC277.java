package o;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
/* loaded from: classes2-dex2jar.jar:o/onClickedUbahCC277.class */
public final class onClickedUbahCC277 {
    public static int a(Context context, Uri uri) throws IOException {
        Throwable th;
        BitmapFactory.Options options = new BitmapFactory.Options();
        int i = 1;
        options.inJustDecodeBounds = true;
        InputStream inputStream = null;
        try {
            inputStream = context.getContentResolver().openInputStream(uri);
            try {
                BitmapFactory.decodeStream(inputStream, null, options);
                a(inputStream);
                int b = b(context);
                while (true) {
                    if (options.outHeight / i <= b && options.outWidth / i <= b) {
                        return i;
                    }
                    i <<= 1;
                }
            } catch (Throwable th2) {
                th = th2;
                a(inputStream);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static int a(File file) {
        if (file == null) {
            return 0;
        }
        try {
            int b = new getSharedElementTargetNames(file.getAbsolutePath()).b("Orientation", 0);
            if (b == 3) {
                return 180;
            }
            if (b != 6) {
                return b != 8 ? 0 : 270;
            }
            return 90;
        } catch (IOException e) {
            return 0;
        }
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable th) {
            }
        }
    }

    private static int b(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        return (int) Math.sqrt(Math.pow((double) point.x, 2.0d) + Math.pow((double) point.y, 2.0d));
    }

    private static File b(Context context, Uri uri) {
        FileOutputStream fileOutputStream;
        Throwable th;
        FileInputStream fileInputStream = null;
        if (uri == null) {
            return null;
        }
        try {
            fileInputStream = new FileInputStream(context.getContentResolver().openFileDescriptor(uri, "r").getFileDescriptor());
            try {
                String absolutePath = File.createTempFile("image", "tmp", context.getCacheDir()).getAbsolutePath();
                fileOutputStream = new FileOutputStream(absolutePath);
                try {
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int read = fileInputStream.read(bArr);
                        if (read != -1) {
                            fileOutputStream.write(bArr, 0, read);
                        } else {
                            File file = new File(absolutePath);
                            a(fileInputStream);
                            a(fileOutputStream);
                            return file;
                        }
                    }
                } catch (IOException e) {
                    a(fileInputStream);
                    a(fileOutputStream);
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    a(fileInputStream);
                    a(fileOutputStream);
                    throw th;
                }
            } catch (IOException e2) {
                fileOutputStream = null;
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream = null;
            }
        } catch (IOException e3) {
            fileOutputStream = null;
            fileInputStream = null;
        } catch (Throwable th4) {
            th = th4;
            fileOutputStream = null;
        }
    }

    public static File c(Context context, Uri uri) {
        Throwable th;
        r11 = null;
        Cursor cursor = null;
        if (uri == null) {
            return null;
        }
        if ("file".equals(uri.getScheme())) {
            return new File(uri.getPath());
        }
        try {
            if (!FirebaseAnalytics.Param.CONTENT.equals(uri.getScheme())) {
                return null;
            }
            try {
                cursor = context.getContentResolver().query(uri, new String[]{"_data", "_display_name"}, null, null, null);
                if (cursor != null) {
                    try {
                        if (cursor.moveToFirst()) {
                            int columnIndex = uri.toString().startsWith("content://com.google.android.gallery3d") ? cursor.getColumnIndex("_display_name") : cursor.getColumnIndex("_data");
                            if (columnIndex != -1) {
                                String string = cursor.getString(columnIndex);
                                if (!TextUtils.isEmpty(string)) {
                                    File file = new File(string);
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    return file;
                                }
                            }
                        }
                    } catch (IllegalArgumentException e) {
                        File b = b(context, uri);
                        if (cursor != null) {
                            cursor.close();
                        }
                        return b;
                    } catch (SecurityException e2) {
                        if (cursor == null) {
                            return null;
                        }
                        cursor.close();
                        return null;
                    } catch (Throwable th2) {
                        th = th2;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
                if (cursor == null) {
                    return null;
                }
            } catch (IllegalArgumentException e3) {
            } catch (SecurityException e4) {
                cursor = null;
            }
            cursor.close();
            return null;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static Bitmap e(Context context, Uri uri, Rect rect, int i, int i2, int i3) {
        Throwable th;
        int i4;
        r9 = null;
        InputStream inputStream = null;
        Bitmap bitmap = null;
        try {
            inputStream = context.getContentResolver().openInputStream(uri);
            int i5 = 0;
            boolean z = false;
            try {
                try {
                    BitmapRegionDecoder newInstance = BitmapRegionDecoder.newInstance(inputStream, false);
                    int width = newInstance.getWidth();
                    int height = newInstance.getHeight();
                    if (i3 != 0) {
                        Matrix matrix = new Matrix();
                        matrix.setRotate((float) (-i3));
                        RectF rectF = new RectF();
                        matrix.mapRect(rectF, new RectF(rect));
                        float f = 0.0f;
                        float f2 = rectF.left < 0.0f ? (float) width : 0.0f;
                        if (rectF.top < 0.0f) {
                            f = (float) height;
                        }
                        rectF.offset(f2, f);
                        rect = new Rect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                    }
                    int b = b(context);
                    boolean z2 = true;
                    int i6 = 1;
                    while (true) {
                        if (rect.width() / i6 <= b && rect.height() / i6 <= b) {
                            break;
                        }
                        i6 <<= 1;
                    }
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inSampleSize = i6;
                    bitmap = newInstance.decodeRegion(rect, options);
                    Matrix matrix2 = new Matrix();
                    if (i3 != 0) {
                        matrix2.postRotate((float) i3);
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (i > 0 && i2 > 0) {
                        onClickedUbahCC278 onclickedubahcc278 = new onClickedUbahCC278(bitmap, i3);
                        float f3 = (float) i;
                        if (onclickedubahcc278.c == null) {
                            i4 = 0;
                        } else {
                            i4 = (onclickedubahcc278.b / 90) % 2 != 0 ? onclickedubahcc278.c.getHeight() : onclickedubahcc278.c.getWidth();
                        }
                        float f4 = f3 / ((float) i4);
                        float f5 = (float) i2;
                        if (onclickedubahcc278.c != null) {
                            if ((onclickedubahcc278.b / 90) % 2 != 0) {
                                z = true;
                            }
                            i5 = z ? onclickedubahcc278.c.getWidth() : onclickedubahcc278.c.getHeight();
                        }
                        matrix2.postScale(f4, f5 / ((float) i5));
                    }
                    if (z2) {
                        bitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix2, true);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    a(inputStream);
                    throw th;
                }
            } catch (FileNotFoundException | IOException | IllegalArgumentException | OutOfMemoryError e) {
            }
        } catch (FileNotFoundException | IOException | OutOfMemoryError e2) {
            bitmap = null;
        } catch (Throwable th3) {
            th = th3;
        }
        a(inputStream);
        return bitmap;
    }
}
