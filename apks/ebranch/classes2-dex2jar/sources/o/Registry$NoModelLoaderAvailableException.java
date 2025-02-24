package o;
/* loaded from: classes2-dex2jar.jar:o/Registry$NoModelLoaderAvailableException.class */
public abstract class Registry$NoModelLoaderAvailableException extends InquiryLoadDataBTPresenter {
    protected final String c() {
        Registry$NoModelLoaderAvailableException registry$NoModelLoaderAvailableException;
        Registry$NoModelLoaderAvailableException c = ReservasiListChosenPresenter.c();
        if (this == c) {
            return "Dispatchers.Main";
        }
        try {
            registry$NoModelLoaderAvailableException = c.e();
        } catch (UnsupportedOperationException e) {
            registry$NoModelLoaderAvailableException = null;
        }
        if (this == registry$NoModelLoaderAvailableException) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }

    public abstract Registry$NoModelLoaderAvailableException e();

    @Override // o.InquiryLoadDataBTPresenter, java.lang.Object
    public String toString() {
        String c = c();
        String str = c;
        if (c == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(getClass().getSimpleName());
            sb.append('@');
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            str = sb.toString();
        }
        return str;
    }
}
