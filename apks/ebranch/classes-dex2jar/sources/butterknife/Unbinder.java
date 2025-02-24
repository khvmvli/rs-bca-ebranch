package butterknife;

import butterknife.Unbinder;
/* loaded from: classes-dex2jar.jar:butterknife/Unbinder.class */
public interface Unbinder {
    public static final Unbinder EMPTY = new Unbinder() { // from class: butterknife.Unbinder$$ExternalSyntheticLambda0
        @Override // butterknife.Unbinder
        public final void unbind() {
            Unbinder._CC.lambda$static$0();
        }
    };

    /* loaded from: classes-dex2jar.jar:butterknife/Unbinder$_CC.class */
    public final /* synthetic */ class _CC {
        static {
            Unbinder unbinder = Unbinder.EMPTY;
        }

        public static /* synthetic */ void lambda$static$0() {
        }
    }

    void unbind();
}
