package com.bca.smartbranch.data.api.response;

import java.util.List;
import o.infoContactPersonDialogEvent;
import org.parceler.Parcel;
@Parcel
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/response/GetAcctOpeningCategoryDataResponse.class */
public class GetAcctOpeningCategoryDataResponse {
    @infoContactPersonDialogEvent(c = "ListCategory")
    private List<CategoryAcct> listCategory = null;

    @Parcel
    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/response/GetAcctOpeningCategoryDataResponse$CategoryAcct.class */
    public static class CategoryAcct {
        @infoContactPersonDialogEvent(c = "CategoryCode")
        private String categoryCode;
        @infoContactPersonDialogEvent(c = "CategoryContent")
        private List<Content> categoryContent = null;
        @infoContactPersonDialogEvent(c = "CategoryName")
        private Languange categoryName;

        public String getCategoryCode() {
            return this.categoryCode;
        }

        public List<Content> getCategoryContent() {
            return this.categoryContent;
        }

        public Languange getCategoryName() {
            return this.categoryName;
        }

        public void setCategoryCode(String str) {
            this.categoryCode = str;
        }

        public void setCategoryContent(List<Content> list) {
            this.categoryContent = list;
        }

        public void setCategoryName(Languange languange) {
            this.categoryName = languange;
        }
    }

    @Parcel
    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/response/GetAcctOpeningCategoryDataResponse$Content.class */
    public static class Content {
        @infoContactPersonDialogEvent(c = "ContentName")
        private Languange contentName;
        @infoContactPersonDialogEvent(c = "ContentOrder")
        private String contentOrder;
        @infoContactPersonDialogEvent(c = "NextCategoryCd")
        private String nextCategoryCd;

        public Languange getContentName() {
            return this.contentName;
        }

        public String getContentOrder() {
            return this.contentOrder;
        }

        public String getNextCategoryCd() {
            return this.nextCategoryCd;
        }

        public void setContentName(Languange languange) {
            this.contentName = languange;
        }

        public void setContentOrder(String str) {
            this.contentOrder = str;
        }

        public void setNextCategoryCd(String str) {
            this.nextCategoryCd = str;
        }
    }

    @Parcel
    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/response/GetAcctOpeningCategoryDataResponse$Languange.class */
    public static class Languange {
        @infoContactPersonDialogEvent(c = "English")
        private String english;
        @infoContactPersonDialogEvent(c = "Indonesian")
        private String indonesian;

        public String getEnglish() {
            return this.english;
        }

        public String getIndonesian() {
            return this.indonesian;
        }

        public void setEnglish(String str) {
            this.english = str;
        }

        public void setIndonesian(String str) {
            this.indonesian = str;
        }
    }

    public List<CategoryAcct> getListCategory() {
        return this.listCategory;
    }

    public void setListCategory(List<CategoryAcct> list) {
        this.listCategory = list;
    }
}
