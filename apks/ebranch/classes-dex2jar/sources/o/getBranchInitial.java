package o;

import android.graphics.Bitmap;
import java.io.IOException;
/* loaded from: classes-dex2jar.jar:o/getBranchInitial.class */
public final class getBranchInitial implements CategoryResponse$$Parcelable<Bitmap, Bitmap> {

    /* loaded from: classes-dex2jar.jar:o/getBranchInitial$read.class */
    static final class read implements setIbanFlag<Bitmap> {
        private final Bitmap d;

        read(Bitmap bitmap) {
            this.d = bitmap;
        }

        @Override // o.setIbanFlag
        public final /* bridge */ /* synthetic */ Bitmap a() {
            return this.d;
        }

        @Override // o.setIbanFlag
        public final void b() {
        }

        @Override // o.setIbanFlag
        public final int d() {
            return getTxnNotes2.a(this.d);
        }

        @Override // o.setIbanFlag
        public final Class<Bitmap> e() {
            return Bitmap.class;
        }
    }

    @Override // o.CategoryResponse$$Parcelable
    public final /* bridge */ /* synthetic */ boolean a(Bitmap bitmap, CategoryResponse categoryResponse) throws IOException {
        return true;
    }

    @Override // o.CategoryResponse$$Parcelable
    public final /* synthetic */ setIbanFlag<Bitmap> d(Bitmap bitmap, int i, int i2, CategoryResponse categoryResponse) throws IOException {
        return new read(bitmap);
    }
}
