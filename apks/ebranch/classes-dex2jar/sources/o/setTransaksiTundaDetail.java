package o;

import o.getNoReffAnak;
/* loaded from: classes-dex2jar.jar:o/setTransaksiTundaDetail.class */
final class setTransaksiTundaDetail<T> implements getSubToken<T> {
    private final TransaksiTundaDetail$$Parcelable a;
    private final getFlagRating b;
    private final getStatus<T, byte[]> c;
    private final String d;
    private final getBusinessFieldFlagFreeText e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public setTransaksiTundaDetail(TransaksiTundaDetail$$Parcelable transaksiTundaDetail$$Parcelable, String str, getFlagRating getflagrating, getStatus<T, byte[]> getstatus, getBusinessFieldFlagFreeText getbusinessfieldflagfreetext) {
        this.a = transaksiTundaDetail$$Parcelable;
        this.d = str;
        this.b = getflagrating;
        this.c = getstatus;
        this.e = getbusinessfieldflagfreetext;
    }

    @Override // o.getSubToken
    public final void a(getServiceType<T> getservicetype) {
        d(getservicetype, new getTransaksiTundaDetailList() { // from class: o.getBusinessFieldValue
            @Override // o.getTransaksiTundaDetailList
            public final void onSchedule(Exception exc) {
            }
        });
    }

    @Override // o.getSubToken
    public final void d(getServiceType<T> getservicetype, getTransaksiTundaDetailList gettransaksitundadetaillist) {
        this.e.e(new getNoReffAnak.read().a(this.a).b((getServiceType<?>) getservicetype).b(this.d).b((getStatus<?, byte[]>) this.c).b(this.b).d(), gettransaksitundadetaillist);
    }
}
