package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes-dex2jar.jar:o/realmGet$SumberDanaTransaksiKode.class */
public final class realmGet$SumberDanaTransaksiKode extends getCurrCompanyBusinessType {
    private final realmGet$PromoCode d;

    public realmGet$SumberDanaTransaksiKode(realmGet$PromoCode realmget_promocode) {
        super("internal.logger");
        this.d = realmget_promocode;
        this.e.put("log", new getCurrCompanyBusinessType(false, true) { // from class: o.realmGet$ProdukRekomendasi
            final boolean b;
            final boolean d;

            {
                this.b = r5;
                this.d = r6;
            }

            @Override // o.getCurrCompanyBusinessType
            public final getCustomerFullName b(realmSet$ccOtherBankCreditCards realmset_ccotherbankcreditcards, List<getCustomerFullName> list) {
                realmSet$flagBCAAccount.d("log", 1, list);
                if (list.size() == 1) {
                    realmGet$SumberDanaTransaksiKode.this.d.c(3, realmset_ccotherbankcreditcards.a(list.get(0)).d(), Collections.emptyList(), this.b, this.d);
                    return g;
                }
                int e = realmSet$flagBCAAccount.e(realmset_ccotherbankcreditcards.a(list.get(0)).a().doubleValue());
                int i = e != 2 ? e != 3 ? e != 5 ? e != 6 ? 3 : 2 : 5 : 1 : 4;
                String d = realmset_ccotherbankcreditcards.a(list.get(1)).d();
                if (list.size() == 2) {
                    realmGet$SumberDanaTransaksiKode.this.d.c(i, d, Collections.emptyList(), this.b, this.d);
                    return g;
                }
                ArrayList arrayList = new ArrayList();
                for (int i2 = 2; i2 < Math.min(list.size(), 5); i2++) {
                    arrayList.add(realmset_ccotherbankcreditcards.a(list.get(i2)).d());
                }
                realmGet$SumberDanaTransaksiKode.this.d.c(i, d, arrayList, this.b, this.d);
                return g;
            }
        });
        this.e.put("silent", new getTypeOfProduct(this, "silent"));
        ((getCurrCompanyBusinessType) this.e.get("silent")).c("log", new getCurrCompanyBusinessType(true, true) { // from class: o.realmGet$ProdukRekomendasi
            final boolean b;
            final boolean d;

            {
                this.b = r5;
                this.d = r6;
            }

            @Override // o.getCurrCompanyBusinessType
            public final getCustomerFullName b(realmSet$ccOtherBankCreditCards realmset_ccotherbankcreditcards, List<getCustomerFullName> list) {
                realmSet$flagBCAAccount.d("log", 1, list);
                if (list.size() == 1) {
                    realmGet$SumberDanaTransaksiKode.this.d.c(3, realmset_ccotherbankcreditcards.a(list.get(0)).d(), Collections.emptyList(), this.b, this.d);
                    return g;
                }
                int e = realmSet$flagBCAAccount.e(realmset_ccotherbankcreditcards.a(list.get(0)).a().doubleValue());
                int i = e != 2 ? e != 3 ? e != 5 ? e != 6 ? 3 : 2 : 5 : 1 : 4;
                String d = realmset_ccotherbankcreditcards.a(list.get(1)).d();
                if (list.size() == 2) {
                    realmGet$SumberDanaTransaksiKode.this.d.c(i, d, Collections.emptyList(), this.b, this.d);
                    return g;
                }
                ArrayList arrayList = new ArrayList();
                for (int i2 = 2; i2 < Math.min(list.size(), 5); i2++) {
                    arrayList.add(realmset_ccotherbankcreditcards.a(list.get(i2)).d());
                }
                realmGet$SumberDanaTransaksiKode.this.d.c(i, d, arrayList, this.b, this.d);
                return g;
            }
        });
        this.e.put("unmonitored", new getCurrCompanyBusinessType(this, "unmonitored") { // from class: o.realmGet$KategoriTujuanTransaksiKode
            @Override // o.getCurrCompanyBusinessType
            public final getCustomerFullName b(realmSet$ccOtherBankCreditCards realmset_ccotherbankcreditcards, List<getCustomerFullName> list) {
                return this;
            }
        });
        ((getCurrCompanyBusinessType) this.e.get("unmonitored")).c("log", new getCurrCompanyBusinessType(false, false) { // from class: o.realmGet$ProdukRekomendasi
            final boolean b;
            final boolean d;

            {
                this.b = r5;
                this.d = r6;
            }

            @Override // o.getCurrCompanyBusinessType
            public final getCustomerFullName b(realmSet$ccOtherBankCreditCards realmset_ccotherbankcreditcards, List<getCustomerFullName> list) {
                realmSet$flagBCAAccount.d("log", 1, list);
                if (list.size() == 1) {
                    realmGet$SumberDanaTransaksiKode.this.d.c(3, realmset_ccotherbankcreditcards.a(list.get(0)).d(), Collections.emptyList(), this.b, this.d);
                    return g;
                }
                int e = realmSet$flagBCAAccount.e(realmset_ccotherbankcreditcards.a(list.get(0)).a().doubleValue());
                int i = e != 2 ? e != 3 ? e != 5 ? e != 6 ? 3 : 2 : 5 : 1 : 4;
                String d = realmset_ccotherbankcreditcards.a(list.get(1)).d();
                if (list.size() == 2) {
                    realmGet$SumberDanaTransaksiKode.this.d.c(i, d, Collections.emptyList(), this.b, this.d);
                    return g;
                }
                ArrayList arrayList = new ArrayList();
                for (int i2 = 2; i2 < Math.min(list.size(), 5); i2++) {
                    arrayList.add(realmset_ccotherbankcreditcards.a(list.get(i2)).d());
                }
                realmGet$SumberDanaTransaksiKode.this.d.c(i, d, arrayList, this.b, this.d);
                return g;
            }
        });
    }

    @Override // o.getCurrCompanyBusinessType
    public final getCustomerFullName b(realmSet$ccOtherBankCreditCards realmset_ccotherbankcreditcards, List<getCustomerFullName> list) {
        return getCustomerFullName.g;
    }
}
