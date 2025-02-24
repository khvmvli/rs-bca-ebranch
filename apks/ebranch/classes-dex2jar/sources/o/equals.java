package o;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import io.realm.internal.Property;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes-dex2jar.jar:o/equals.class */
public class equals extends ContentProvider {
    private static final String[] a = {"_display_name", "_size"};
    private static final File d = new File("/");
    private static HashMap<String, IconCompatParcelizer> e = new HashMap<>();
    private IconCompatParcelizer b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/equals$IconCompatParcelizer.class */
    public interface IconCompatParcelizer {
        File d(Uri uri);

        Uri e(File file);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/equals$read.class */
    public static final class read implements IconCompatParcelizer {
        private final HashMap<String, File> a = new HashMap<>();
        private final String e;

        read(String str) {
            this.e = str;
        }

        @Override // o.equals.IconCompatParcelizer
        public final File d(Uri uri) {
            String encodedPath = uri.getEncodedPath();
            int indexOf = encodedPath.indexOf(47, 1);
            String decode = Uri.decode(encodedPath.substring(1, indexOf));
            String decode2 = Uri.decode(encodedPath.substring(indexOf + 1));
            File file = this.a.get(decode);
            if (file != null) {
                File file2 = new File(file, decode2);
                try {
                    File canonicalFile = file2.getCanonicalFile();
                    if (canonicalFile.getPath().startsWith(file.getPath())) {
                        return canonicalFile;
                    }
                    throw new SecurityException("Resolved path jumped beyond configured root");
                } catch (IOException e) {
                    StringBuilder sb = new StringBuilder("Failed to resolve canonical path for ");
                    sb.append(file2);
                    throw new IllegalArgumentException(sb.toString());
                }
            } else {
                StringBuilder sb2 = new StringBuilder("Unable to find configured root for ");
                sb2.append(uri);
                throw new IllegalArgumentException(sb2.toString());
            }
        }

        final void d(String str, File file) {
            if (!TextUtils.isEmpty(str)) {
                try {
                    this.a.put(str, file.getCanonicalFile());
                } catch (IOException e) {
                    StringBuilder sb = new StringBuilder("Failed to resolve canonical path for ");
                    sb.append(file);
                    throw new IllegalArgumentException(sb.toString(), e);
                }
            } else {
                throw new IllegalArgumentException("Name must not be empty");
            }
        }

        @Override // o.equals.IconCompatParcelizer
        public final Uri e(File file) {
            try {
                String canonicalPath = file.getCanonicalPath();
                Map.Entry<String, File> entry = null;
                for (Map.Entry<String, File> entry2 : this.a.entrySet()) {
                    String path = entry2.getValue().getPath();
                    if (canonicalPath.startsWith(path) && (entry == null || path.length() > entry.getValue().getPath().length())) {
                        entry = entry2;
                    }
                }
                if (entry != null) {
                    String path2 = entry.getValue().getPath();
                    String substring = path2.endsWith("/") ? canonicalPath.substring(path2.length()) : canonicalPath.substring(path2.length() + 1);
                    StringBuilder sb = new StringBuilder();
                    sb.append(Uri.encode(entry.getKey()));
                    sb.append('/');
                    sb.append(Uri.encode(substring, "/"));
                    return new Uri.Builder().scheme("content").authority(this.e).encodedPath(sb.toString()).build();
                }
                StringBuilder sb2 = new StringBuilder("Failed to find configured root that contains ");
                sb2.append(canonicalPath);
                throw new IllegalArgumentException(sb2.toString());
            } catch (IOException e) {
                StringBuilder sb3 = new StringBuilder("Failed to resolve canonical path for ");
                sb3.append(file);
                throw new IllegalArgumentException(sb3.toString());
            }
        }
    }

    private static IconCompatParcelizer b(Context context, String str) {
        read read2;
        File file;
        synchronized (e) {
            IconCompatParcelizer iconCompatParcelizer = e.get(str);
            read2 = iconCompatParcelizer;
            if (iconCompatParcelizer == null) {
                try {
                    try {
                        read read3 = new read(str);
                        ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider(str, Property.TYPE_ARRAY);
                        if (resolveContentProvider != null) {
                            XmlResourceParser loadXmlMetaData = resolveContentProvider.loadXmlMetaData(context.getPackageManager(), "android.support.FILE_PROVIDER_PATHS");
                            if (loadXmlMetaData != null) {
                                while (true) {
                                    int next = loadXmlMetaData.next();
                                    if (next == 1) {
                                        break;
                                    } else if (next == 2) {
                                        String name = loadXmlMetaData.getName();
                                        String attributeValue = loadXmlMetaData.getAttributeValue(null, "name");
                                        String attributeValue2 = loadXmlMetaData.getAttributeValue(null, "path");
                                        if ("root-path".equals(name)) {
                                            file = d;
                                        } else if ("files-path".equals(name)) {
                                            file = context.getFilesDir();
                                        } else if ("cache-path".equals(name)) {
                                            file = context.getCacheDir();
                                        } else if ("external-path".equals(name)) {
                                            file = Environment.getExternalStorageDirectory();
                                        } else if ("external-files-path".equals(name)) {
                                            File[] e2 = copyWindowDataInto.e(context, (String) null);
                                            file = null;
                                            if (e2.length > 0) {
                                                file = e2[0];
                                            }
                                        } else if ("external-cache-path".equals(name)) {
                                            File[] a2 = copyWindowDataInto.a(context);
                                            file = null;
                                            if (a2.length > 0) {
                                                file = a2[0];
                                            }
                                        } else {
                                            file = null;
                                            if ("external-media-path".equals(name)) {
                                                File[] externalMediaDirs = context.getExternalMediaDirs();
                                                file = null;
                                                if (externalMediaDirs.length > 0) {
                                                    file = externalMediaDirs[0];
                                                }
                                            }
                                        }
                                        if (file != null) {
                                            int i = 0;
                                            while (i <= 0) {
                                                String str2 = new String[]{attributeValue2}[0];
                                                file = file;
                                                if (str2 != null) {
                                                    file = new File(file, str2);
                                                }
                                                i++;
                                            }
                                            read3.d(attributeValue, file);
                                        }
                                    }
                                }
                                e.put(str, read3);
                                read2 = read3;
                            } else {
                                throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
                            }
                        } else {
                            StringBuilder sb = new StringBuilder("Couldn't find meta-data for provider with authority ");
                            sb.append(str);
                            throw new IllegalArgumentException(sb.toString());
                        }
                    } catch (XmlPullParserException e3) {
                        throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e3);
                    }
                } catch (IOException e4) {
                    throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e4);
                }
            }
        }
        return read2;
    }

    public static Uri d(Context context, String str, File file) {
        return b(context, str).e(file);
    }

    @Override // android.content.ContentProvider
    public void attachInfo(Context context, ProviderInfo providerInfo) {
        attachInfo(context, providerInfo);
        if (providerInfo.exported) {
            throw new SecurityException("Provider must not be exported");
        } else if (providerInfo.grantUriPermissions) {
            this.b = b(context, providerInfo.authority.split(";")[0]);
        } else {
            throw new SecurityException("Provider must grant uri permissions");
        }
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return this.b.d(uri).delete() ? 1 : 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        String mimeTypeFromExtension;
        File d2 = this.b.d(uri);
        int lastIndexOf = d2.getName().lastIndexOf(46);
        return (lastIndexOf < 0 || (mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(d2.getName().substring(lastIndexOf + 1))) == null) ? "application/octet-stream" : mimeTypeFromExtension;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public ParcelFileDescriptor openFile(Uri uri, String str) throws FileNotFoundException {
        int i;
        File d2 = this.b.d(uri);
        if ("r".equals(str)) {
            i = 268435456;
        } else if ("w".equals(str) || "wt".equals(str)) {
            i = 738197504;
        } else if ("wa".equals(str)) {
            i = 704643072;
        } else if ("rw".equals(str)) {
            i = 939524096;
        } else if ("rwt".equals(str)) {
            i = 1006632960;
        } else {
            StringBuilder sb = new StringBuilder("Invalid mode: ");
            sb.append(str);
            throw new IllegalArgumentException(sb.toString());
        }
        return ParcelFileDescriptor.open(d2, i);
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        File d2 = this.b.d(uri);
        String queryParameter = uri.getQueryParameter("displayName");
        String[] strArr3 = strArr;
        if (strArr == null) {
            strArr3 = a;
        }
        String[] strArr4 = new String[strArr3.length];
        Object[] objArr = new Object[strArr3.length];
        int i = 0;
        for (String str3 : strArr3) {
            if ("_display_name".equals(str3)) {
                strArr4[i] = "_display_name";
                i++;
                objArr[i] = queryParameter == null ? d2.getName() : queryParameter;
            } else {
                i = i;
                if ("_size".equals(str3)) {
                    strArr4[i] = "_size";
                    i++;
                    objArr[i] = Long.valueOf(d2.length());
                }
            }
        }
        String[] strArr5 = new String[i];
        System.arraycopy(strArr4, 0, strArr5, 0, i);
        Object[] objArr2 = new Object[i];
        System.arraycopy(objArr, 0, objArr2, 0, i);
        MatrixCursor matrixCursor = new MatrixCursor(strArr5, 1);
        matrixCursor.addRow(objArr2);
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }
}
