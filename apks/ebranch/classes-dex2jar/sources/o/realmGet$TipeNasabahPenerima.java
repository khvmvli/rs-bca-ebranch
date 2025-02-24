package o;

import java.util.List;
/* loaded from: classes-dex2jar.jar:o/realmGet$TipeNasabahPenerima.class */
public final class realmGet$TipeNasabahPenerima extends getCurrCompanyBusinessType {
    public realmGet$TipeNasabahPenerima() {
        super("internal.platform");
        this.e.put("isAndroid", new getCurrCompanyBusinessType(this, "isAndroid") { // from class: o.realmGet$TujuanTransaksi
            @Override // o.getCurrCompanyBusinessType
            public final getCustomerFullName b(realmSet$ccOtherBankCreditCards realmset_ccotherbankcreditcards, List<getCustomerFullName> list) {
                return getCustomerFullName.n;
            }
        });
        this.e.put("getVersion", new getCurrCompanyBusinessType(this, "getVersion") { // from class: o.realmGet$typeOfProduct
            @Override // o.getCurrCompanyBusinessType
            public final getCustomerFullName b(realmSet$ccOtherBankCreditCards realmset_ccotherbankcreditcards, List<getCustomerFullName> list) {
                return new getCreditCardSupplements(Double.valueOf(0.0d));
            }
        });
    }

    @Override // o.getCurrCompanyBusinessType
    public final getCustomerFullName b(realmSet$ccOtherBankCreditCards realmset_ccotherbankcreditcards, List<getCustomerFullName> list) {
        return g;
    }
}
