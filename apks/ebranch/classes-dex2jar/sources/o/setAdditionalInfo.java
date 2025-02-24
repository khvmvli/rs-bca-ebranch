package o;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;
/* loaded from: classes-dex2jar.jar:o/setAdditionalInfo.class */
public final class setAdditionalInfo extends getAdditionalInfo<ParcelFileDescriptor> {
    public setAdditionalInfo(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    @Override // o.getAdditionalInfo
    protected final /* synthetic */ ParcelFileDescriptor a(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
        if (openAssetFileDescriptor != null) {
            return openAssetFileDescriptor.getParcelFileDescriptor();
        }
        StringBuilder sb = new StringBuilder("FileDescriptor is null for: ");
        sb.append(uri);
        throw new FileNotFoundException(sb.toString());
    }

    @Override // o.CreateQueueReservationResponse$$Parcelable
    public final Class<ParcelFileDescriptor> e() {
        return ParcelFileDescriptor.class;
    }

    @Override // o.getAdditionalInfo
    protected final /* synthetic */ void e(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
        parcelFileDescriptor.close();
    }
}
