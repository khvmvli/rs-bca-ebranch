package o;

import java.io.Serializable;
import o.ProsesTarikanFragment_ViewBinding;
import o.subscribeTransaksiBatalEvent;
/* loaded from: classes2-dex2jar.jar:o/ProsesSetoranFragment.class */
public final class ProsesSetoranFragment implements ProsesTarikanFragment_ViewBinding, Serializable {
    private final ProsesTarikanFragment_ViewBinding c;
    private final ProsesTarikanFragment_ViewBinding.IconCompatParcelizer d;

    /* loaded from: classes2-dex2jar.jar:o/ProsesSetoranFragment$IconCompatParcelizer.class */
    static final class IconCompatParcelizer extends subscribeDraftTxnBerkalaEvent implements onClickInfo<onCLickStatusNpwp, ProsesTarikanFragment_ViewBinding.IconCompatParcelizer, onCLickStatusNpwp> {
        final /* synthetic */ subscribeTransaksiBatalEvent.IconCompatParcelizer c;
        final /* synthetic */ ProsesTarikanFragment_ViewBinding[] d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IconCompatParcelizer(ProsesTarikanFragment_ViewBinding[] prosesTarikanFragment_ViewBindingArr, subscribeTransaksiBatalEvent.IconCompatParcelizer iconCompatParcelizer) {
            super(2);
            this.d = prosesTarikanFragment_ViewBindingArr;
            this.c = iconCompatParcelizer;
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            ProsesTarikanFragment_ViewBinding.IconCompatParcelizer iconCompatParcelizer = (ProsesTarikanFragment_ViewBinding.IconCompatParcelizer) obj2;
            subscribeReservationRescheduleEvent.e((onCLickStatusNpwp) obj, "");
            subscribeReservationRescheduleEvent.e(iconCompatParcelizer, "");
            ProsesTarikanFragment_ViewBinding[] prosesTarikanFragment_ViewBindingArr = this.d;
            int i = this.c.d;
            this.c.d = i + 1;
            prosesTarikanFragment_ViewBindingArr[i] = iconCompatParcelizer;
            return onCLickStatusNpwp.e;
        }
    }

    /* loaded from: classes2-dex2jar.jar:o/ProsesSetoranFragment$read.class */
    static final class read implements Serializable {
        public static final write b = new write((byte) 0);
        private final ProsesTarikanFragment_ViewBinding[] e;

        /* loaded from: classes2-dex2jar.jar:o/ProsesSetoranFragment$read$write.class */
        public static final class write {
            private write() {
            }

            public /* synthetic */ write(byte b) {
                this();
            }
        }

        public read(ProsesTarikanFragment_ViewBinding[] prosesTarikanFragment_ViewBindingArr) {
            subscribeReservationRescheduleEvent.e(prosesTarikanFragment_ViewBindingArr, "");
            this.e = prosesTarikanFragment_ViewBindingArr;
        }

        private final Object readResolve() {
            ProsesTarikanFragment_ViewBinding[] prosesTarikanFragment_ViewBindingArr = this.e;
            ProsesTarikanFragment_ViewBinding prosesTarikanFragment_ViewBinding = ReviewSetoranFragment.e;
            for (ProsesTarikanFragment_ViewBinding prosesTarikanFragment_ViewBinding2 : prosesTarikanFragment_ViewBindingArr) {
                prosesTarikanFragment_ViewBinding = prosesTarikanFragment_ViewBinding.b(prosesTarikanFragment_ViewBinding2);
            }
            return prosesTarikanFragment_ViewBinding;
        }
    }

    public ProsesSetoranFragment(ProsesTarikanFragment_ViewBinding prosesTarikanFragment_ViewBinding, ProsesTarikanFragment_ViewBinding.IconCompatParcelizer iconCompatParcelizer) {
        subscribeReservationRescheduleEvent.e(prosesTarikanFragment_ViewBinding, "");
        subscribeReservationRescheduleEvent.e(iconCompatParcelizer, "");
        this.c = prosesTarikanFragment_ViewBinding;
        this.d = iconCompatParcelizer;
    }

    private final int a() {
        int i = 2;
        ProsesSetoranFragment prosesSetoranFragment = this;
        while (true) {
            ProsesTarikanFragment_ViewBinding prosesTarikanFragment_ViewBinding = prosesSetoranFragment.c;
            prosesSetoranFragment = prosesTarikanFragment_ViewBinding instanceof ProsesSetoranFragment ? (ProsesSetoranFragment) prosesTarikanFragment_ViewBinding : null;
            if (prosesSetoranFragment == null) {
                return i;
            }
            i++;
        }
    }

    private final Object writeReplace() {
        int a = a();
        ProsesTarikanFragment_ViewBinding[] prosesTarikanFragment_ViewBindingArr = new ProsesTarikanFragment_ViewBinding[a];
        subscribeTransaksiBatalEvent.IconCompatParcelizer iconCompatParcelizer = new subscribeTransaksiBatalEvent.IconCompatParcelizer();
        onCLickStatusNpwp onclickstatusnpwp = onCLickStatusNpwp.e;
        onClickInfo iconCompatParcelizer2 = new IconCompatParcelizer(prosesTarikanFragment_ViewBindingArr, iconCompatParcelizer);
        subscribeReservationRescheduleEvent.e(iconCompatParcelizer2, "");
        iconCompatParcelizer2.invoke(this.c.e(onclickstatusnpwp, iconCompatParcelizer2), this.d);
        if (iconCompatParcelizer.d == a) {
            return new read(prosesTarikanFragment_ViewBindingArr);
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @Override // o.ProsesTarikanFragment_ViewBinding
    public final <E extends ProsesTarikanFragment_ViewBinding.IconCompatParcelizer> E b(ProsesTarikanFragment_ViewBinding.read<E> read2) {
        subscribeReservationRescheduleEvent.e(read2, "");
        ProsesSetoranFragment prosesSetoranFragment = this;
        while (true) {
            E e = (E) prosesSetoranFragment.d.b(read2);
            if (e != null) {
                return e;
            }
            ProsesTarikanFragment_ViewBinding prosesTarikanFragment_ViewBinding = prosesSetoranFragment.c;
            if (!(prosesTarikanFragment_ViewBinding instanceof ProsesSetoranFragment)) {
                return (E) prosesTarikanFragment_ViewBinding.b(read2);
            }
            prosesSetoranFragment = (ProsesSetoranFragment) prosesTarikanFragment_ViewBinding;
        }
    }

    @Override // o.ProsesTarikanFragment_ViewBinding
    public final ProsesTarikanFragment_ViewBinding b(ProsesTarikanFragment_ViewBinding prosesTarikanFragment_ViewBinding) {
        return ProsesTarikanFragment_ViewBinding$MediaBrowserCompat$CustomActionResultReceiver.b(this, prosesTarikanFragment_ViewBinding);
    }

    @Override // o.ProsesTarikanFragment_ViewBinding
    public final <R> R e(R r, onClickInfo<? super R, ? super ProsesTarikanFragment_ViewBinding.IconCompatParcelizer, ? extends R> onclickinfo) {
        subscribeReservationRescheduleEvent.e(onclickinfo, "");
        return (R) onclickinfo.invoke(this.c.e(r, onclickinfo), this.d);
    }

    @Override // o.ProsesTarikanFragment_ViewBinding
    public final ProsesTarikanFragment_ViewBinding e(ProsesTarikanFragment_ViewBinding.read<?> read2) {
        subscribeReservationRescheduleEvent.e(read2, "");
        if (this.d.b((ProsesTarikanFragment_ViewBinding.read<ProsesTarikanFragment_ViewBinding.IconCompatParcelizer>) read2) != null) {
            return this.c;
        }
        ProsesTarikanFragment_ViewBinding e = this.c.e(read2);
        return e == this.c ? this : e == ReviewSetoranFragment.e ? this.d : new ProsesSetoranFragment(e, this.d);
    }

    @Override // java.lang.Object
    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this != obj) {
            z = false;
            if (obj instanceof ProsesSetoranFragment) {
                ProsesSetoranFragment prosesSetoranFragment = (ProsesSetoranFragment) obj;
                z = false;
                if (prosesSetoranFragment.a() == a()) {
                    ProsesSetoranFragment prosesSetoranFragment2 = this;
                    while (true) {
                        ProsesTarikanFragment_ViewBinding.IconCompatParcelizer iconCompatParcelizer = prosesSetoranFragment2.d;
                        if (subscribeReservationRescheduleEvent.b(prosesSetoranFragment.b((ProsesTarikanFragment_ViewBinding.read<ProsesTarikanFragment_ViewBinding.IconCompatParcelizer>) iconCompatParcelizer.d()), iconCompatParcelizer)) {
                            ProsesTarikanFragment_ViewBinding prosesTarikanFragment_ViewBinding = prosesSetoranFragment2.c;
                            if (!(prosesTarikanFragment_ViewBinding instanceof ProsesSetoranFragment)) {
                                subscribeReservationRescheduleEvent.c(prosesTarikanFragment_ViewBinding);
                                ProsesTarikanFragment_ViewBinding.IconCompatParcelizer iconCompatParcelizer2 = (ProsesTarikanFragment_ViewBinding.IconCompatParcelizer) prosesTarikanFragment_ViewBinding;
                                z2 = subscribeReservationRescheduleEvent.b(prosesSetoranFragment.b((ProsesTarikanFragment_ViewBinding.read<ProsesTarikanFragment_ViewBinding.IconCompatParcelizer>) iconCompatParcelizer2.d()), iconCompatParcelizer2);
                                break;
                            }
                            prosesSetoranFragment2 = (ProsesSetoranFragment) prosesTarikanFragment_ViewBinding;
                        } else {
                            z2 = false;
                            break;
                        }
                    }
                    if (!z2) {
                        z = false;
                    }
                }
            }
            return z;
        }
        z = true;
        return z;
    }

    @Override // java.lang.Object
    public final int hashCode() {
        return this.c.hashCode() + this.d.hashCode();
    }

    @Override // java.lang.Object
    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        onClickInfo onclickinfo = ProsesSetoranFragment$MediaBrowserCompat$CustomActionResultReceiver.c;
        subscribeReservationRescheduleEvent.e(onclickinfo, "");
        sb.append((String) onclickinfo.invoke(this.c.e("", onclickinfo), this.d));
        sb.append(']');
        return sb.toString();
    }
}
