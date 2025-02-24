package com.bca.smartbranch.data.api.response;

import java.util.List;
import o.infoContactPersonDialogEvent;
import org.parceler.Parcel;
@Parcel
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/response/CustDataResponse.class */
public class CustDataResponse {
    @infoContactPersonDialogEvent(c = "AccountList")
    private List<Account> accountList;
    @infoContactPersonDialogEvent(c = "PhoneList")
    private List<Phone> phoneList;

    @Parcel
    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/response/CustDataResponse$Account.class */
    public static class Account {
        @infoContactPersonDialogEvent(c = "AccountID")
        private String accountID;
        @infoContactPersonDialogEvent(c = "AccountNumber")
        private String accountNumber;

        public String getAccountID() {
            return this.accountID;
        }

        public String getAccountNumber() {
            return this.accountNumber;
        }

        public void setAccountID(String str) {
            this.accountID = str;
        }

        public void setAccountNumber(String str) {
            this.accountNumber = str;
        }
    }

    @Parcel
    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/response/CustDataResponse$Phone.class */
    public static class Phone {
        @infoContactPersonDialogEvent(c = "PhoneID")
        private String phoneID;
        @infoContactPersonDialogEvent(c = "PhoneNumber")
        private String phoneNumber;

        public String getPhoneID() {
            return this.phoneID;
        }

        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        public void setPhoneID(String str) {
            this.phoneID = str;
        }

        public void setPhoneNumber(String str) {
            this.phoneNumber = str;
        }
    }

    public List<Account> getAccountList() {
        return this.accountList;
    }

    public List<Phone> getPhoneList() {
        return this.phoneList;
    }

    public void setAccountList(List<Account> list) {
        this.accountList = list;
    }

    public void setPhoneList(List<Phone> list) {
        this.phoneList = list;
    }
}
