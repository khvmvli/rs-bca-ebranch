package o;
/* loaded from: classes2-dex2jar.jar:o/SumberDanaOrangDatangKeCabangSetunFragment_ViewBinding.class */
public abstract class SumberDanaOrangDatangKeCabangSetunFragment_ViewBinding extends ReviewSetoranUbahFragment_ViewBinding {
    public SumberDanaOrangDatangKeCabangSetunFragment_ViewBinding(ProsesTarikanFragment<Object> prosesTarikanFragment) {
        super(prosesTarikanFragment);
        if (prosesTarikanFragment != null) {
            if (!(prosesTarikanFragment.getContext() == ReviewSetoranFragment.e)) {
                throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
            }
        }
    }

    @Override // o.ProsesTarikanFragment
    public ProsesTarikanFragment_ViewBinding getContext() {
        return ReviewSetoranFragment.e;
    }
}
