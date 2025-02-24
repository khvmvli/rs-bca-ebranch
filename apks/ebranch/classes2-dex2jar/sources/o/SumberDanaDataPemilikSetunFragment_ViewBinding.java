package o;

import o.ProsesTarikanFragment_ViewBinding;
/* loaded from: classes2-dex2jar.jar:o/SumberDanaDataPemilikSetunFragment_ViewBinding.class */
public abstract class SumberDanaDataPemilikSetunFragment_ViewBinding extends ReviewSetoranUbahFragment_ViewBinding {
    private final ProsesTarikanFragment_ViewBinding _context;
    private transient ProsesTarikanFragment<Object> intercepted;

    public SumberDanaDataPemilikSetunFragment_ViewBinding(ProsesTarikanFragment<Object> prosesTarikanFragment) {
        this(prosesTarikanFragment, prosesTarikanFragment != null ? prosesTarikanFragment.getContext() : null);
    }

    public SumberDanaDataPemilikSetunFragment_ViewBinding(ProsesTarikanFragment<Object> prosesTarikanFragment, ProsesTarikanFragment_ViewBinding prosesTarikanFragment_ViewBinding) {
        super(prosesTarikanFragment);
        this._context = prosesTarikanFragment_ViewBinding;
    }

    @Override // o.ProsesTarikanFragment
    public ProsesTarikanFragment_ViewBinding getContext() {
        ProsesTarikanFragment_ViewBinding prosesTarikanFragment_ViewBinding = this._context;
        subscribeReservationRescheduleEvent.c(prosesTarikanFragment_ViewBinding);
        return prosesTarikanFragment_ViewBinding;
    }

    public final ProsesTarikanFragment<Object> intercepted() {
        ProsesTarikanFragment<Object> prosesTarikanFragment = this.intercepted;
        SumberDanaDataPemilikSetunFragment_ViewBinding sumberDanaDataPemilikSetunFragment_ViewBinding = prosesTarikanFragment;
        if (prosesTarikanFragment == null) {
            ProsesORFragment prosesORFragment = (ProsesORFragment) getContext().b(ProsesORFragment.e);
            sumberDanaDataPemilikSetunFragment_ViewBinding = prosesORFragment != null ? prosesORFragment.b(this) : this;
            this.intercepted = sumberDanaDataPemilikSetunFragment_ViewBinding;
        }
        return sumberDanaDataPemilikSetunFragment_ViewBinding;
    }

    @Override // o.ReviewSetoranUbahFragment_ViewBinding
    protected void releaseIntercepted() {
        ProsesTarikanFragment<?> prosesTarikanFragment = this.intercepted;
        if (!(prosesTarikanFragment == null || prosesTarikanFragment == this)) {
            ProsesTarikanFragment_ViewBinding.IconCompatParcelizer b = getContext().b(ProsesORFragment.e);
            subscribeReservationRescheduleEvent.c(b);
            ((ProsesORFragment) b).e(prosesTarikanFragment);
        }
        this.intercepted = SumberDanaOrangDatangKeCabangSetunFragment.a;
    }
}
