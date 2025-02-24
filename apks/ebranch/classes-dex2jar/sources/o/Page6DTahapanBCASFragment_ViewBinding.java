package o;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes-dex2jar.jar:o/Page6DTahapanBCASFragment_ViewBinding.class */
public final class Page6DTahapanBCASFragment_ViewBinding {
    public static final read e = new read((byte) 0);
    private static final onChooseValueSumberPenghasilan f;
    private static Page6DTahapanBCASFragment_ViewBinding j;
    public final boolean a;
    public final boolean b;
    public final List<Page6DTahapanBCASFragment> c;
    public final boolean d;
    private final List<Page6DTahapanBCASFragment> i;

    /* loaded from: classes-dex2jar.jar:o/Page6DTahapanBCASFragment_ViewBinding$IconCompatParcelizer.class */
    public static final class IconCompatParcelizer {
        private boolean e;
        public final List<Page6DTahapanBCASFragment> d = new ArrayList();
        private boolean c = true;
        private boolean a = true;

        public final Page6DTahapanBCASFragment_ViewBinding b() {
            return new Page6DTahapanBCASFragment_ViewBinding(onClickUbahDataAlamatIdentitas.b((Iterable) this.d), this.c, this.a, this.e, (byte) 0);
        }
    }

    /* loaded from: classes-dex2jar.jar:o/Page6DTahapanBCASFragment_ViewBinding$read.class */
    public static final class read {
        static final /* synthetic */ BeneficiaryBankDetailPresenter[] d = {subscriberLoadDraftBankTransferEvent.b(new subscriberDeleteTmpListTeller(subscriberLoadDraftBankTransferEvent.a(read.class), "reflectiveFallbackViewCreator", "getReflectiveFallbackViewCreator()Lio/github/inflationx/viewpump/FallbackViewCreator;"))};

        private read() {
        }

        public /* synthetic */ read(byte b) {
            this();
        }

        public static IconCompatParcelizer d() {
            return new IconCompatParcelizer();
        }

        public static void d(Page6DTahapanBCASFragment_ViewBinding page6DTahapanBCASFragment_ViewBinding) {
            Page6DTahapanBCASFragment_ViewBinding.j = page6DTahapanBCASFragment_ViewBinding;
        }
    }

    static {
        Page6DTahapanBCASFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver page6DTahapanBCASFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver = Page6DTahapanBCASFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.a;
        subscribeReservationRescheduleEvent.e(page6DTahapanBCASFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver, "");
        f = new Page6KLFragment_ViewBinding(page6DTahapanBCASFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver, null, 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Page6DTahapanBCASFragment_ViewBinding(List<? extends Page6DTahapanBCASFragment> list, boolean z, boolean z2, boolean z3) {
        this.i = list;
        this.a = z;
        this.b = z2;
        this.d = z3;
        List<? extends Page6DTahapanBCASFragment> list2 = list;
        Page6DTahapanXpresiFragment page6DTahapanXpresiFragment = new Page6DTahapanXpresiFragment();
        subscribeReservationRescheduleEvent.e(list2, "");
        ArrayList arrayList = new ArrayList(list2.size() + 1);
        arrayList.addAll(list2);
        arrayList.add(page6DTahapanXpresiFragment);
        ArrayList arrayList2 = arrayList;
        subscribeReservationRescheduleEvent.e(arrayList2, "");
        this.c = new ArrayList(arrayList2);
    }

    public /* synthetic */ Page6DTahapanBCASFragment_ViewBinding(List list, boolean z, boolean z2, boolean z3, byte b) {
        this(list, z, z2, z3);
    }

    public static final void b(Page6DTahapanBCASFragment_ViewBinding page6DTahapanBCASFragment_ViewBinding) {
        read.d(page6DTahapanBCASFragment_ViewBinding);
    }

    public static final IconCompatParcelizer d() {
        return read.d();
    }
}
