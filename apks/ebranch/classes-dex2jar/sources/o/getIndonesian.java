package o;

import android.graphics.ImageDecoder;
import java.io.IOException;
/* loaded from: classes-dex2jar.jar:o/getIndonesian.class */
public abstract class getIndonesian<T> implements CategoryResponse$$Parcelable<ImageDecoder.Source, T> {
    final GetBankSpecialRelationResponse$SpecialBank$$Parcelable b = GetBankSpecialRelationResponse$SpecialBank$$Parcelable.c();

    /* JADX WARN: Removed duplicated region for block: B:26:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e8  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public final o.setIbanFlag<T> d(android.graphics.ImageDecoder.Source r15, final int r16, final int r17, o.CategoryResponse r18) throws java.io.IOException {
        /*
        // Method dump skipped, instructions count: 268
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getIndonesian.d(android.graphics.ImageDecoder$Source, int, int, o.CategoryResponse):o.setIbanFlag");
    }

    @Override // o.CategoryResponse$$Parcelable
    public final /* bridge */ /* synthetic */ boolean a(ImageDecoder.Source source, CategoryResponse categoryResponse) throws IOException {
        return true;
    }

    protected abstract setIbanFlag<T> b(ImageDecoder.Source source, int i, int i2, ImageDecoder.OnHeaderDecodedListener onHeaderDecodedListener) throws IOException;
}
