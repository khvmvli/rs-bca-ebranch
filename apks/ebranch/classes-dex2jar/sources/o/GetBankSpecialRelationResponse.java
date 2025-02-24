package o;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import java.io.IOException;
import java.nio.ByteBuffer;
/* loaded from: classes-dex2jar.jar:o/GetBankSpecialRelationResponse.class */
public final class GetBankSpecialRelationResponse extends getIndonesian<Bitmap> {
    private final setValueArray e = new getValueArray();

    /* loaded from: classes-dex2jar.jar:o/GetBankSpecialRelationResponse$SpecialBank.class */
    public final class SpecialBank implements CategoryResponse$$Parcelable<ByteBuffer, Bitmap> {
        private final GetBankSpecialRelationResponse b = new GetBankSpecialRelationResponse();

        @Override // o.CategoryResponse$$Parcelable
        public final /* bridge */ /* synthetic */ boolean a(ByteBuffer byteBuffer, CategoryResponse categoryResponse) throws IOException {
            return true;
        }

        @Override // o.CategoryResponse$$Parcelable
        public final /* synthetic */ setIbanFlag<Bitmap> d(ByteBuffer byteBuffer, int i, int i2, CategoryResponse categoryResponse) throws IOException {
            return this.b.d(ImageDecoder.createSource(byteBuffer), i, i2, categoryResponse);
        }
    }

    @Override // o.getIndonesian
    public final setIbanFlag<Bitmap> b(ImageDecoder.Source source, int i, int i2, ImageDecoder.OnHeaderDecodedListener onHeaderDecodedListener) throws IOException {
        Bitmap decodeBitmap = ImageDecoder.decodeBitmap(source, onHeaderDecodedListener);
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            StringBuilder sb = new StringBuilder("Decoded [");
            sb.append(decodeBitmap.getWidth());
            sb.append("x");
            sb.append(decodeBitmap.getHeight());
            sb.append("] for [");
            sb.append(i);
            sb.append("x");
            sb.append(i2);
            sb.append("]");
            Log.v("BitmapImageDecoder", sb.toString());
        }
        return new setIndonesian(decodeBitmap, this.e);
    }
}
