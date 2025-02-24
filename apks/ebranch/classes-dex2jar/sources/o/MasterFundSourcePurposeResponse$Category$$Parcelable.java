package o;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import o.Page6KLFragment;
/* loaded from: classes-dex2jar.jar:o/MasterFundSourcePurposeResponse$Category$$Parcelable.class */
public final class MasterFundSourcePurposeResponse$Category$$Parcelable {
    private static final Paint d = new Paint(2);

    /* loaded from: classes-dex2jar.jar:o/MasterFundSourcePurposeResponse$Category$$Parcelable$write.class */
    static final class write extends showSiupNibPage implements onClickInfo<InquiryLoadDataSetunPresenter, ProsesTarikanFragment<? super Double>, Object> {
        int b;
        final /* synthetic */ Bitmap d;
        final /* synthetic */ int e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        write(Bitmap bitmap, int i, ProsesTarikanFragment<? super write> prosesTarikanFragment) {
            super(2, prosesTarikanFragment);
            this.d = bitmap;
            this.e = i;
        }

        public final ProsesTarikanFragment<onCLickStatusNpwp> create(Object obj, ProsesTarikanFragment<?> prosesTarikanFragment) {
            return new write(this.d, this.e, prosesTarikanFragment);
        }

        @Override // o.onClickInfo
        public final /* synthetic */ Object invoke(InquiryLoadDataSetunPresenter inquiryLoadDataSetunPresenter, ProsesTarikanFragment<? super Double> prosesTarikanFragment) {
            return create(inquiryLoadDataSetunPresenter, prosesTarikanFragment).invokeSuspend(onCLickStatusNpwp.e);
        }

        public final Object invokeSuspend(Object obj) {
            ReviewSetoranFragment_ViewBinding reviewSetoranFragment_ViewBinding = ReviewSetoranFragment_ViewBinding.e;
            if (this.b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else if (!(obj instanceof Page6KLFragment.IconCompatParcelizer)) {
                return MasterFundSourcePurposeResponse$Category$$Parcelable.d(MasterFundSourcePurposeResponse$Category$$Parcelable.c(this.d, this.e), this.e);
            } else {
                throw ((Page6KLFragment.IconCompatParcelizer) obj).d;
            }
        }
    }

    public static final /* synthetic */ Bitmap c(Bitmap bitmap, int i) {
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        createBitmap.eraseColor(i);
        new Canvas(createBitmap).drawBitmap(bitmap, new Matrix(), d);
        subscribeReservationRescheduleEvent.d(createBitmap, "");
        return createBitmap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0, types: [double] */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump */
    public static final /* synthetic */ java.lang.Double d(android.graphics.Bitmap r9, int r10) {
        /*
        // Method dump skipped, instructions count: 1164
        */
        throw new UnsupportedOperationException("Method not decompiled: o.MasterFundSourcePurposeResponse$Category$$Parcelable.d(android.graphics.Bitmap, int):java.lang.Double");
    }

    public static final Object e(Bitmap bitmap, ProsesTarikanFragment<? super Double> prosesTarikanFragment) {
        return GetAreaPresenter.a(ReservasiListChosenPresenter.d(), new write(bitmap, -65281, null), prosesTarikanFragment);
    }
}
