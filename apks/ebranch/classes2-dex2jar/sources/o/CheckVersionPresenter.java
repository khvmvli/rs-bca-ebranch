package o;

import java.util.Iterator;
import java.util.NoSuchElementException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2-dex2jar.jar:o/CheckVersionPresenter.class */
public final class CheckVersionPresenter implements CancelTundaPresenter<setRegionPrefix> {
    final int a;
    final int b;
    final onClickInfo<CharSequence, Integer, showSumberPenghasilanDialog<Integer, Integer>> c;
    final CharSequence e;

    /* loaded from: classes2-dex2jar.jar:o/CheckVersionPresenter$IconCompatParcelizer.class */
    public static final class IconCompatParcelizer implements Iterator<setRegionPrefix>, subscriberLoadDraftPemrekEvent {
        private int a;
        private setRegionPrefix b;
        private int d;
        private int e;
        private int g = -1;

        IconCompatParcelizer() {
            int e = DataModule.e(CheckVersionPresenter.this.b, 0, CheckVersionPresenter.this.e.length());
            this.a = e;
            this.e = e;
        }

        /* JADX WARN: Code restructure failed: missing block: B:9:0x0034, code lost:
            if (r0 < r7.c.a) goto L_0x0037;
         */
        /* Code decompiled incorrectly, please refer to instructions dump */
        private final void a() {
            /*
            // Method dump skipped, instructions count: 300
            */
            throw new UnsupportedOperationException("Method not decompiled: o.CheckVersionPresenter.IconCompatParcelizer.a():void");
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.g == -1) {
                a();
            }
            boolean z = true;
            if (this.g != 1) {
                z = false;
            }
            return z;
        }

        @Override // java.util.Iterator
        public final /* synthetic */ setRegionPrefix next() {
            if (this.g == -1) {
                a();
            }
            if (this.g != 0) {
                setRegionPrefix setregionprefix = this.b;
                subscribeReservationRescheduleEvent.c(setregionprefix);
                this.b = null;
                this.g = -1;
                return setregionprefix;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CheckVersionPresenter(CharSequence charSequence, int i, int i2, onClickInfo<? super CharSequence, ? super Integer, showSumberPenghasilanDialog<Integer, Integer>> onclickinfo) {
        subscribeReservationRescheduleEvent.e(charSequence, "");
        subscribeReservationRescheduleEvent.e(onclickinfo, "");
        this.e = charSequence;
        this.b = i;
        this.a = i2;
        this.c = onclickinfo;
    }

    @Override // o.CancelTundaPresenter
    public final Iterator<setRegionPrefix> d() {
        return new IconCompatParcelizer();
    }
}
