package com.bca.smartbranch.data.api.response;

import java.util.List;
import o.infoContactPersonDialogEvent;
import org.parceler.Parcel;
@Parcel
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/response/GetCustAcctListResponse.class */
public class GetCustAcctListResponse {
    @infoContactPersonDialogEvent(c = "accounts")
    private List<AccountData> accountList;

    @Parcel
    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/response/GetCustAcctListResponse$AccountData.class */
    public static class AccountData {
        @infoContactPersonDialogEvent(c = "account_number")
        private String accountNumber;
        @infoContactPersonDialogEvent(c = "account_type")
        private String accountType;

        public String getAccountNumber() {
            return this.accountNumber;
        }

        public String getAccountType() {
            return this.accountType;
        }

        public void setAccountNumber(String str) {
            this.accountNumber = str;
        }

        public void setAccountType(String str) {
            this.accountType = str;
        }
    }

    public List<AccountData> getAccountList() {
        return this.accountList;
    }

    public void setAccountList(List<AccountData> list) {
        this.accountList = list;
    }
}
