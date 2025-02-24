package o;
/* loaded from: classes-dex2jar.jar:o/performSaveInstanceState.class */
public final class performSaveInstanceState {
    public static final InquiryLoadDataSetunPresenter b(performPictureInPictureModeChanged performpictureinpicturemodechanged) {
        subscribeReservationRescheduleEvent.e(performpictureinpicturemodechanged, "");
        InquiryLoadDataSetunPresenter inquiryLoadDataSetunPresenter = (InquiryLoadDataSetunPresenter) performpictureinpicturemodechanged.a("androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY");
        if (inquiryLoadDataSetunPresenter != null) {
            return inquiryLoadDataSetunPresenter;
        }
        Object c = performpictureinpicturemodechanged.c("androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY", new onPrepareOptionsMenu(new HttpException((UpdateReceiverDataPresenter) null).b(ReservasiListChosenPresenter.c().e())));
        subscribeReservationRescheduleEvent.d(c, "");
        return (InquiryLoadDataSetunPresenter) c;
    }
}
