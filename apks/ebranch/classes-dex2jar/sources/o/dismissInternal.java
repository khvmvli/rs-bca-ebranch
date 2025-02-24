package o;

import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import o.createFragmentContainer;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/dismissInternal.class */
public final class dismissInternal {
    private static final Comparator<byte[]> b = new Comparator<byte[]>() { // from class: o.dismissInternal.4
        @Override // java.util.Comparator
        public final /* bridge */ /* synthetic */ int compare(byte[] bArr, byte[] bArr2) {
            byte[] bArr3 = bArr;
            byte[] bArr4 = bArr2;
            if (bArr3.length != bArr4.length) {
                return bArr3.length - bArr4.length;
            }
            for (int i = 0; i < bArr3.length; i++) {
                byte b2 = bArr3[i];
                byte b3 = bArr4[i];
                if (b2 != b3) {
                    return b2 - b3;
                }
            }
            return 0;
        }
    };

    private static createFragmentContainer.IconCompatParcelizer[] b(Context context, access$100 access_100, String str, CancellationSignal cancellationSignal) {
        ArrayList arrayList = new ArrayList();
        Uri build = new Uri.Builder().scheme("content").authority(str).build();
        Uri build2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
        Cursor cursor = null;
        try {
            Cursor query = context.getContentResolver().query(build, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{access_100.g}, null, cancellationSignal);
            ArrayList arrayList2 = arrayList;
            if (query != null) {
                arrayList2 = arrayList;
                if (query.getCount() > 0) {
                    int columnIndex = query.getColumnIndex("result_code");
                    ArrayList arrayList3 = new ArrayList();
                    int columnIndex2 = query.getColumnIndex("_id");
                    int columnIndex3 = query.getColumnIndex("file_id");
                    int columnIndex4 = query.getColumnIndex("font_ttc_index");
                    int columnIndex5 = query.getColumnIndex("font_weight");
                    int columnIndex6 = query.getColumnIndex("font_italic");
                    while (true) {
                        cursor = query;
                        if (!query.moveToNext()) {
                            break;
                        }
                        int i = columnIndex != -1 ? query.getInt(columnIndex) : 0;
                        arrayList3.add(createFragmentContainer.IconCompatParcelizer.c(columnIndex3 == -1 ? ContentUris.withAppendedId(build, query.getLong(columnIndex2)) : ContentUris.withAppendedId(build2, query.getLong(columnIndex3)), columnIndex4 != -1 ? query.getInt(columnIndex4) : 0, columnIndex5 != -1 ? query.getInt(columnIndex5) : 400, columnIndex6 != -1 && query.getInt(columnIndex6) == 1, i));
                    }
                    arrayList2 = arrayList3;
                }
            }
            if (query != null) {
                query.close();
            }
            return (createFragmentContainer.IconCompatParcelizer[]) arrayList2.toArray(new createFragmentContainer.IconCompatParcelizer[0]);
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    private static boolean c(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals(list.get(i), list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static createFragmentContainer.RemoteActionCompatParcelizer e(Context context, access$100 access_100, CancellationSignal cancellationSignal) throws PackageManager.NameNotFoundException {
        ProviderInfo providerInfo;
        PackageManager packageManager = context.getPackageManager();
        Resources resources = context.getResources();
        String str = access_100.a;
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(str, 0);
        if (resolveContentProvider == null) {
            StringBuilder sb = new StringBuilder("No package found for authority: ");
            sb.append(str);
            throw new PackageManager.NameNotFoundException(sb.toString());
        } else if (resolveContentProvider.packageName.equals(access_100.e)) {
            Signature[] signatureArr = packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures;
            ArrayList arrayList = new ArrayList();
            for (Signature signature : signatureArr) {
                arrayList.add(signature.toByteArray());
            }
            Collections.sort(arrayList, b);
            List<List<byte[]>> a = access_100.d != null ? access_100.d : getSystemGestureInsets.a(resources, access_100.c);
            int i = 0;
            while (true) {
                if (i >= a.size()) {
                    providerInfo = null;
                    break;
                }
                ArrayList arrayList2 = new ArrayList(a.get(i));
                Collections.sort(arrayList2, b);
                if (c(arrayList, arrayList2)) {
                    providerInfo = resolveContentProvider;
                    break;
                }
                i++;
            }
            return providerInfo == null ? createFragmentContainer.RemoteActionCompatParcelizer.b(1, null) : createFragmentContainer.RemoteActionCompatParcelizer.b(0, b(context, access_100, providerInfo.authority, cancellationSignal));
        } else {
            StringBuilder sb2 = new StringBuilder("Found content provider ");
            sb2.append(str);
            sb2.append(", but package was not ");
            sb2.append(access_100.e);
            throw new PackageManager.NameNotFoundException(sb2.toString());
        }
    }
}
