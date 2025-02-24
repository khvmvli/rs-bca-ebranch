package o;

import java.util.Set;
/* loaded from: classes-dex2jar.jar:o/TransaksiTundaSubDetail.class */
final class TransaksiTundaSubDetail implements getStatusType {
    private final getBusinessFieldFlagFreeText a;
    private final TransaksiTundaDetail$$Parcelable b;
    private final Set<getFlagRating> e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public TransaksiTundaSubDetail(Set<getFlagRating> set, TransaksiTundaDetail$$Parcelable transaksiTundaDetail$$Parcelable, getBusinessFieldFlagFreeText getbusinessfieldflagfreetext) {
        this.e = set;
        this.b = transaksiTundaDetail$$Parcelable;
        this.a = getbusinessfieldflagfreetext;
    }

    @Override // o.getStatusType
    public final <T> getSubToken<T> b(String str, getFlagRating getflagrating, getStatus<T, byte[]> getstatus) {
        if (this.e.contains(getflagrating)) {
            return new setTransaksiTundaDetail(this.b, str, getflagrating, getstatus, this.a);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", getflagrating, this.e));
    }
}
