package o;

import javax.annotation.Nonnull;
/* loaded from: classes-dex2jar.jar:o/BN3PilihCabangFragment_ViewBinding.class */
final class BN3PilihCabangFragment_ViewBinding extends BN3PilihCabangFragment {
    private final String b;
    private final String e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BN3PilihCabangFragment_ViewBinding(String str, String str2) {
        if (str != null) {
            this.b = str;
            if (str2 != null) {
                this.e = str2;
                return;
            }
            throw new NullPointerException("Null version");
        }
        throw new NullPointerException("Null libraryName");
    }

    @Override // o.BN3PilihCabangFragment
    @Nonnull
    public final String d() {
        return this.b;
    }

    @Override // o.BN3PilihCabangFragment
    @Nonnull
    public final String e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BN3PilihCabangFragment)) {
            return false;
        }
        BN3PilihCabangFragment bN3PilihCabangFragment = (BN3PilihCabangFragment) obj;
        if (!this.b.equals(bN3PilihCabangFragment.d()) || !this.e.equals(bN3PilihCabangFragment.e())) {
            z = false;
        }
        return z;
    }

    public final int hashCode() {
        return ((this.b.hashCode() ^ 1000003) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LibraryVersion{libraryName=");
        sb.append(this.b);
        sb.append(", version=");
        sb.append(this.e);
        sb.append("}");
        return sb.toString();
    }
}
