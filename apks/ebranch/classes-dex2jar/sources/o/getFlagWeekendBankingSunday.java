package o;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.io.IOException;
import java.util.List;
/* loaded from: classes-dex2jar.jar:o/getFlagWeekendBankingSunday.class */
public final class getFlagWeekendBankingSunday implements CategoryResponse$$Parcelable<Uri, Drawable> {
    private final Context e;

    public getFlagWeekendBankingSunday(Context context) {
        this.e = context.getApplicationContext();
    }

    private static int d(Uri uri) {
        try {
            return Integer.parseInt(uri.getPathSegments().get(0));
        } catch (NumberFormatException e) {
            StringBuilder sb = new StringBuilder("Unrecognized Uri format: ");
            sb.append(uri);
            throw new IllegalArgumentException(sb.toString(), e);
        }
    }

    private Context d(Uri uri, String str) {
        if (str.equals(this.e.getPackageName())) {
            return this.e;
        }
        try {
            return this.e.createPackageContext(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            if (str.contains(this.e.getPackageName())) {
                return this.e;
            }
            StringBuilder sb = new StringBuilder("Failed to obtain context or unrecognized Uri format for: ");
            sb.append(uri);
            throw new IllegalArgumentException(sb.toString(), e);
        }
    }

    private int e(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            List<String> pathSegments2 = uri.getPathSegments();
            String authority = uri.getAuthority();
            String str = pathSegments2.get(0);
            String str2 = pathSegments2.get(1);
            int identifier = context.getResources().getIdentifier(str2, str, authority);
            int i = identifier;
            if (identifier == 0) {
                i = Resources.getSystem().getIdentifier(str2, str, "android");
            }
            if (i != 0) {
                return i;
            }
            StringBuilder sb = new StringBuilder("Failed to find resource id for: ");
            sb.append(uri);
            throw new IllegalArgumentException(sb.toString());
        } else if (pathSegments.size() == 1) {
            return d(uri);
        } else {
            StringBuilder sb2 = new StringBuilder("Unrecognized Uri format: ");
            sb2.append(uri);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    public final setIbanFlag<Drawable> a(Uri uri) {
        Context d = d(uri, uri.getAuthority());
        int e = e(d, uri);
        getFlagReservationTellerPrioritas getflagreservationtellerprioritas = null;
        Drawable e2 = getFlagReservation.e(this.e, d, e, null);
        if (e2 != null) {
            getflagreservationtellerprioritas = new getFlagReservationTellerPrioritas(e2);
        }
        return getflagreservationtellerprioritas;
    }

    @Override // o.CategoryResponse$$Parcelable
    public final /* synthetic */ boolean a(Uri uri, CategoryResponse categoryResponse) throws IOException {
        return uri.getScheme().equals("android.resource");
    }

    @Override // o.CategoryResponse$$Parcelable
    public final /* synthetic */ setIbanFlag<Drawable> d(Uri uri, int i, int i2, CategoryResponse categoryResponse) throws IOException {
        return a(uri);
    }
}
