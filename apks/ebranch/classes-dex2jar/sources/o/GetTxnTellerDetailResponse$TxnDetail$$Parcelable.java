package o;

import com.chuckerteam.chucker.internal.data.entity.HttpTransaction;
/* loaded from: classes-dex2jar.jar:o/GetTxnTellerDetailResponse$TxnDetail$$Parcelable.class */
public final class GetTxnTellerDetailResponse$TxnDetail$$Parcelable {
    public String a;
    public long b;
    public String c;
    public Long d;
    public String e;
    public Long f;
    public Long g;
    public Long h;
    public Integer i;
    public String j;
    private String n;

    /* renamed from: o  reason: collision with root package name */
    private String f90o;

    public GetTxnTellerDetailResponse$TxnDetail$$Parcelable(long j, Long l, Long l2, String str, String str2, String str3, String str4, String str5, Integer num, Long l3, Long l4, String str6) {
        this.b = j;
        this.d = l;
        this.h = l2;
        this.f90o = str;
        this.e = str2;
        this.c = str3;
        this.a = str4;
        this.j = str5;
        this.i = num;
        this.g = l3;
        this.f = l4;
        this.n = str6;
    }

    public final HttpTransaction.read e() {
        return this.n != null ? HttpTransaction.read.Failed : this.i == null ? HttpTransaction.read.Requested : HttpTransaction.read.Complete;
    }
}
