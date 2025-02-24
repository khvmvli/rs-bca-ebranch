package o;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
/* loaded from: classes-dex2jar.jar:o/getReferenceNumber.class */
public final class getReferenceNumber extends getAdditionalInfo<AssetFileDescriptor> {
    public getReferenceNumber(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    @Override // o.getAdditionalInfo
    protected final /* synthetic */ AssetFileDescriptor a(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
        if (openAssetFileDescriptor != null) {
            return openAssetFileDescriptor;
        }
        StringBuilder sb = new StringBuilder("FileDescriptor is null for: ");
        sb.append(uri);
        throw new FileNotFoundException(sb.toString());
    }

    @Override // o.CreateQueueReservationResponse$$Parcelable
    public final Class<AssetFileDescriptor> e() {
        return AssetFileDescriptor.class;
    }

    @Override // o.getAdditionalInfo
    protected final /* synthetic */ void e(AssetFileDescriptor assetFileDescriptor) throws IOException {
        assetFileDescriptor.close();
    }
}
