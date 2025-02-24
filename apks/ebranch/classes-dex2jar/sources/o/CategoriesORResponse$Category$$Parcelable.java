package o;

import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
/* loaded from: classes-dex2jar.jar:o/CategoriesORResponse$Category$$Parcelable.class */
public final class CategoriesORResponse$Category$$Parcelable {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/CategoriesORResponse$Category$$Parcelable$RemoteActionCompatParcelizer.class */
    public interface RemoteActionCompatParcelizer {
        ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) throws IOException;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes-dex2jar.jar:o/CategoriesORResponse$Category$$Parcelable$write.class */
    public interface write {
        int a(ImageHeaderParser imageHeaderParser) throws IOException;
    }

    public static ImageHeaderParser.ImageType a(List<ImageHeaderParser> list, RemoteActionCompatParcelizer remoteActionCompatParcelizer) throws IOException {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ImageHeaderParser.ImageType a = remoteActionCompatParcelizer.a(list.get(i));
            if (a != ImageHeaderParser.ImageType.UNKNOWN) {
                return a;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    public static ImageHeaderParser.ImageType c(List<ImageHeaderParser> list, InputStream inputStream, DetailTransactionResponse detailTransactionResponse) throws IOException {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        final InputStream inputStream2 = inputStream;
        if (!inputStream.markSupported()) {
            inputStream2 = new GetBranchROResponse$$Parcelable(inputStream, detailTransactionResponse);
        }
        inputStream2.mark(5242880);
        return a(list, new RemoteActionCompatParcelizer() { // from class: o.CategoriesORResponse$Category$$Parcelable.2
            @Override // o.CategoriesORResponse$Category$$Parcelable.RemoteActionCompatParcelizer
            public final ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) throws IOException {
                try {
                    return imageHeaderParser.c(inputStream2);
                } finally {
                    inputStream2.reset();
                }
            }
        });
    }

    public static int d(List<ImageHeaderParser> list, InputStream inputStream, final DetailTransactionResponse detailTransactionResponse) throws IOException {
        if (inputStream == null) {
            return -1;
        }
        final InputStream inputStream2 = inputStream;
        if (!inputStream.markSupported()) {
            inputStream2 = new GetBranchROResponse$$Parcelable(inputStream, detailTransactionResponse);
        }
        inputStream2.mark(5242880);
        return d(list, new write() { // from class: o.CategoriesORResponse$Category$$Parcelable.5
            @Override // o.CategoriesORResponse$Category$$Parcelable.write
            public final int a(ImageHeaderParser imageHeaderParser) throws IOException {
                try {
                    return imageHeaderParser.a(inputStream2, detailTransactionResponse);
                } finally {
                    inputStream2.reset();
                }
            }
        });
    }

    public static int d(List<ImageHeaderParser> list, write write2) throws IOException {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int a = write2.a(list.get(i));
            if (a != -1) {
                return a;
            }
        }
        return -1;
    }
}
