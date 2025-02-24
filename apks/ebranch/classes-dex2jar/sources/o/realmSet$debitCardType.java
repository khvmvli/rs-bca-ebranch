package o;

import java.util.ArrayList;
import java.util.Map;
import o.setCitizenValue;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes-dex2jar.jar:o/realmSet$debitCardType.class */
public final class realmSet$debitCardType extends realmSet$flagMB {
    final /* synthetic */ realmSet$flagEKTP b;
    private final Map d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public realmSet$debitCardType(realmSet$flagEKTP realmset_flagektp, Map map) {
        super(realmset_flagektp, null);
        this.b = realmset_flagektp;
        this.d = map;
    }

    @Override // o.realmSet$flagMB
    public final void a() {
        setJobOthers setjobothers = new setJobOthers(this.b.b);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (realmGet$name$MediaBrowserCompat$SearchResultReceiver realmget_name_mediabrowsercompat_searchresultreceiver : this.d.keySet()) {
            if (!realmget_name_mediabrowsercompat_searchresultreceiver.o() || (((realmSet$createdAt) this.d.get(realmget_name_mediabrowsercompat_searchresultreceiver)).b)) {
                arrayList2.add(realmget_name_mediabrowsercompat_searchresultreceiver);
            } else {
                arrayList.add(realmget_name_mediabrowsercompat_searchresultreceiver);
            }
        }
        int i = -1;
        int i2 = 0;
        int i3 = 0;
        if (arrayList.isEmpty()) {
            int size = arrayList2.size();
            while (true) {
                if (i3 >= size) {
                    break;
                }
                int e = setjobothers.e(this.b.e, (realmGet$name$MediaBrowserCompat$SearchResultReceiver) arrayList2.get(i3));
                i3++;
                i = e;
                if (e == 0) {
                    i = e;
                    break;
                }
            }
        } else {
            int size2 = arrayList.size();
            while (true) {
                if (i2 >= size2) {
                    break;
                }
                int e2 = setjobothers.e(this.b.e, (realmGet$name$MediaBrowserCompat$SearchResultReceiver) arrayList.get(i2));
                i2++;
                i = e2;
                if (e2 != 0) {
                    i = e2;
                    break;
                }
            }
        }
        if (i != 0) {
            realmGet$jobValue realmget_jobvalue = new realmGet$jobValue(i, null);
            realmSet$flagEKTP realmset_flagektp = this.b;
            realmset_flagektp.a.a(new realmSet$fotoPribadi(realmset_flagektp, realmget_jobvalue) { // from class: o.realmSet$cobIsoCode
                final /* synthetic */ realmGet$jobValue a;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.a = r6;
                }

                @Override // o.realmSet$fotoPribadi
                public final void d() {
                    realmSet$debitCardType.this.b.c(this.a);
                }
            });
            return;
        }
        realmSet$flagEKTP realmset_flagektp2 = this.b;
        if ((realmset_flagektp2.n) && realmset_flagektp2.l != null) {
            realmset_flagektp2.l.K();
        }
        for (realmGet$name$MediaBrowserCompat$SearchResultReceiver realmget_name_mediabrowsercompat_searchresultreceiver2 : this.d.keySet()) {
            setCitizenValue.RemoteActionCompatParcelizer remoteActionCompatParcelizer = (setCitizenValue.RemoteActionCompatParcelizer) this.d.get(realmget_name_mediabrowsercompat_searchresultreceiver2);
            if (!realmget_name_mediabrowsercompat_searchresultreceiver2.o() || setjobothers.e(this.b.e, realmget_name_mediabrowsercompat_searchresultreceiver2) == 0) {
                realmget_name_mediabrowsercompat_searchresultreceiver2.a(remoteActionCompatParcelizer);
            } else {
                realmSet$flagEKTP realmset_flagektp3 = this.b;
                realmset_flagektp3.a.a(new realmSet$fotoPribadi(this, realmset_flagektp3, remoteActionCompatParcelizer) { // from class: o.realmSet$dob
                    final /* synthetic */ setCitizenValue.RemoteActionCompatParcelizer e;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.e = r6;
                    }

                    @Override // o.realmSet$fotoPribadi
                    public final void d() {
                        this.e.c(new realmGet$jobValue(16, null));
                    }
                });
            }
        }
    }
}
