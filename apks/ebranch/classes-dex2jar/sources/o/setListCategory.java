package o;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import o.getAmountKliring;
/* loaded from: classes-dex2jar.jar:o/setListCategory.class */
public final class setListCategory<Data> implements getAmountKliring<Integer, Data> {
    private final Resources b;
    private final getAmountKliring<Uri, Data> e;

    /* loaded from: classes-dex2jar.jar:o/setListCategory$IconCompatParcelizer.class */
    public static final class IconCompatParcelizer implements GetAcctOpeningCategoryDataResponse<Integer, ParcelFileDescriptor> {
        private final Resources d;

        public IconCompatParcelizer(Resources resources) {
            this.d = resources;
        }

        @Override // o.GetAcctOpeningCategoryDataResponse
        public final getAmountKliring<Integer, ParcelFileDescriptor> e(getListCategory getlistcategory) {
            return new setListCategory(this.d, getlistcategory.b(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* loaded from: classes-dex2jar.jar:o/setListCategory$read.class */
    public static final class read implements GetAcctOpeningCategoryDataResponse<Integer, AssetFileDescriptor> {
        private final Resources a;

        public read(Resources resources) {
            this.a = resources;
        }

        @Override // o.GetAcctOpeningCategoryDataResponse
        public final getAmountKliring<Integer, AssetFileDescriptor> e(getListCategory getlistcategory) {
            return new setListCategory(this.a, getlistcategory.b(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* loaded from: classes-dex2jar.jar:o/setListCategory$write.class */
    public static final class write implements GetAcctOpeningCategoryDataResponse<Integer, Uri> {
        private final Resources c;

        public write(Resources resources) {
            this.c = resources;
        }

        @Override // o.GetAcctOpeningCategoryDataResponse
        public final getAmountKliring<Integer, Uri> e(getListCategory getlistcategory) {
            return new setListCategory(this.c, getCategoryName.b());
        }
    }

    public setListCategory(Resources resources, getAmountKliring<Uri, Data> getamountkliring) {
        this.b = resources;
        this.e = getamountkliring;
    }

    private Uri d(Integer num) {
        try {
            StringBuilder sb = new StringBuilder("android.resource://");
            sb.append(this.b.getResourcePackageName(num.intValue()));
            sb.append('/');
            sb.append(this.b.getResourceTypeName(num.intValue()));
            sb.append('/');
            sb.append(this.b.getResourceEntryName(num.intValue()));
            return Uri.parse(sb.toString());
        } catch (Resources.NotFoundException e) {
            if (!Log.isLoggable("ResourceLoader", 5)) {
                return null;
            }
            StringBuilder sb2 = new StringBuilder("Received invalid resource id: ");
            sb2.append(num);
            Log.w("ResourceLoader", sb2.toString(), e);
            return null;
        }
    }

    @Override // o.getAmountKliring
    public final /* bridge */ /* synthetic */ boolean a(Integer num) {
        return true;
    }

    @Override // o.getAmountKliring
    public final /* synthetic */ getAmountKliring.write c(Integer num, int i, int i2, CategoryResponse categoryResponse) {
        Uri d = d(num);
        return d == null ? null : this.e.c(d, i, i2, categoryResponse);
    }
}
