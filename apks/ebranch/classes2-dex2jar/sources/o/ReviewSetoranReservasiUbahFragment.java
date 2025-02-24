package o;

import o.Page6KLFragment;
/* loaded from: classes2-dex2jar.jar:o/ReviewSetoranReservasiUbahFragment.class */
public class ReviewSetoranReservasiUbahFragment {

    /* loaded from: classes2-dex2jar.jar:o/ReviewSetoranReservasiUbahFragment$IconCompatParcelizer.class */
    public static final class IconCompatParcelizer extends SumberDanaOrangDatangKeCabangSetunFragment_ViewBinding {
        final /* synthetic */ onClickInfo c;
        private int d;
        final /* synthetic */ Object e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public IconCompatParcelizer(ProsesTarikanFragment prosesTarikanFragment, onClickInfo onclickinfo, Object obj) {
            super(prosesTarikanFragment);
            this.c = onclickinfo;
            this.e = obj;
            subscribeReservationRescheduleEvent.c(prosesTarikanFragment);
        }

        @Override // o.ReviewSetoranUbahFragment_ViewBinding
        public final Object invokeSuspend(Object obj) {
            int i = this.d;
            if (i == 0) {
                this.d = 1;
                if (!(obj instanceof Page6KLFragment.IconCompatParcelizer)) {
                    subscribeReservationRescheduleEvent.c(this.c);
                    obj = ((onClickInfo) subscriberLoadDraftCC.d(this.c, 2)).invoke(this.e, this);
                } else {
                    throw ((Page6KLFragment.IconCompatParcelizer) obj).d;
                }
            } else if (i == 1) {
                this.d = 2;
                if (obj instanceof Page6KLFragment.IconCompatParcelizer) {
                    throw ((Page6KLFragment.IconCompatParcelizer) obj).d;
                }
            } else {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
            return obj;
        }
    }

    public static final <T> ProsesTarikanFragment<T> e(ProsesTarikanFragment<? super T> prosesTarikanFragment) {
        subscribeReservationRescheduleEvent.e(prosesTarikanFragment, "");
        SumberDanaDataPemilikSetunFragment_ViewBinding sumberDanaDataPemilikSetunFragment_ViewBinding = prosesTarikanFragment instanceof SumberDanaDataPemilikSetunFragment_ViewBinding ? (SumberDanaDataPemilikSetunFragment_ViewBinding) prosesTarikanFragment : null;
        ProsesTarikanFragment<T> prosesTarikanFragment2 = (ProsesTarikanFragment<T>) prosesTarikanFragment;
        if (sumberDanaDataPemilikSetunFragment_ViewBinding != null) {
            prosesTarikanFragment2 = (ProsesTarikanFragment<T>) sumberDanaDataPemilikSetunFragment_ViewBinding.intercepted();
            if (prosesTarikanFragment2 == null) {
                prosesTarikanFragment2 = (ProsesTarikanFragment<T>) prosesTarikanFragment;
            }
        }
        return prosesTarikanFragment2;
    }

    public static final <R, T> ProsesTarikanFragment<onCLickStatusNpwp> e(onClickInfo<? super R, ? super ProsesTarikanFragment<? super T>, ? extends Object> onclickinfo, R r, ProsesTarikanFragment<? super T> prosesTarikanFragment) {
        ReviewSetoranReservasiUbahFragment$MediaBrowserCompat$CustomActionResultReceiver reviewSetoranReservasiUbahFragment$MediaBrowserCompat$CustomActionResultReceiver;
        subscribeReservationRescheduleEvent.e(onclickinfo, "");
        subscribeReservationRescheduleEvent.e(prosesTarikanFragment, "");
        subscribeReservationRescheduleEvent.e(prosesTarikanFragment, "");
        if (onclickinfo instanceof ReviewSetoranUbahFragment_ViewBinding) {
            reviewSetoranReservasiUbahFragment$MediaBrowserCompat$CustomActionResultReceiver = ((ReviewSetoranUbahFragment_ViewBinding) onclickinfo).create(r, prosesTarikanFragment);
        } else {
            ProsesTarikanFragment_ViewBinding context = prosesTarikanFragment.getContext();
            reviewSetoranReservasiUbahFragment$MediaBrowserCompat$CustomActionResultReceiver = context == ReviewSetoranFragment.e ? new IconCompatParcelizer(prosesTarikanFragment, onclickinfo, r) : new SumberDanaDataPemilikSetunFragment_ViewBinding(prosesTarikanFragment, context, onclickinfo, r) { // from class: o.ReviewSetoranReservasiUbahFragment$MediaBrowserCompat$CustomActionResultReceiver
                private int b;
                final /* synthetic */ onClickInfo c;
                final /* synthetic */ Object e;

                {
                    this.c = r7;
                    this.e = r8;
                    subscribeReservationRescheduleEvent.c(r5);
                }

                @Override // o.ReviewSetoranUbahFragment_ViewBinding
                public final Object invokeSuspend(Object obj) {
                    int i = this.b;
                    if (i == 0) {
                        this.b = 1;
                        if (!(obj instanceof Page6KLFragment.IconCompatParcelizer)) {
                            subscribeReservationRescheduleEvent.c(this.c);
                            obj = ((onClickInfo) subscriberLoadDraftCC.d(this.c, 2)).invoke(this.e, this);
                        } else {
                            throw ((Page6KLFragment.IconCompatParcelizer) obj).d;
                        }
                    } else if (i == 1) {
                        this.b = 2;
                        if (obj instanceof Page6KLFragment.IconCompatParcelizer) {
                            throw ((Page6KLFragment.IconCompatParcelizer) obj).d;
                        }
                    } else {
                        throw new IllegalStateException("This coroutine had already completed".toString());
                    }
                    return obj;
                }
            };
        }
        return reviewSetoranReservasiUbahFragment$MediaBrowserCompat$CustomActionResultReceiver;
    }
}
