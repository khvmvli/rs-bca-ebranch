package o;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
/* loaded from: classes-dex2jar.jar:o/setBranchType.class */
public final class setBranchType implements CategoryResponse$$Parcelable<InputStream, getProvince> {
    private final CategoryResponse$$Parcelable<ByteBuffer, getProvince> c;
    private final List<ImageHeaderParser> d;
    private final DetailTransactionResponse e;

    public setBranchType(List<ImageHeaderParser> list, CategoryResponse$$Parcelable<ByteBuffer, getProvince> categoryResponse$$Parcelable, DetailTransactionResponse detailTransactionResponse) {
        this.d = list;
        this.c = categoryResponse$$Parcelable;
        this.e = detailTransactionResponse;
    }

    private static byte[] a(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    byteArrayOutputStream.flush();
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (IOException e) {
            if (!Log.isLoggable("StreamGifDecoder", 5)) {
                return null;
            }
            Log.w("StreamGifDecoder", "Error reading data from stream", e);
            return null;
        }
    }

    @Override // o.CategoryResponse$$Parcelable
    public final /* synthetic */ boolean a(InputStream inputStream, CategoryResponse categoryResponse) throws IOException {
        InputStream inputStream2 = inputStream;
        getCode<Boolean> getcode = setBranchInitial.a;
        return !((Boolean) (categoryResponse.c.containsKey(getcode) ? categoryResponse.c.get(getcode) : getcode.a)).booleanValue() && CategoriesORResponse$Category$$Parcelable.c(this.d, inputStream2, this.e) == ImageHeaderParser.ImageType.GIF;
    }

    @Override // o.CategoryResponse$$Parcelable
    public final /* synthetic */ setIbanFlag<getProvince> d(InputStream inputStream, int i, int i2, CategoryResponse categoryResponse) throws IOException {
        byte[] a = a(inputStream);
        if (a == null) {
            return null;
        }
        return this.c.d(ByteBuffer.wrap(a), i, i2, categoryResponse);
    }
}
