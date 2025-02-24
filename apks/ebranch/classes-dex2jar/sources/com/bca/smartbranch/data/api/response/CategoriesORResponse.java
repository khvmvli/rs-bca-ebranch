package com.bca.smartbranch.data.api.response;

import java.util.List;
import o.infoContactPersonDialogEvent;
import org.parceler.Parcel;
@Parcel
/* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/response/CategoriesORResponse.class */
public class CategoriesORResponse {
    @infoContactPersonDialogEvent(c = "categories")
    private List<Category> categories = null;

    @Parcel
    /* loaded from: classes-dex2jar.jar:com/bca/smartbranch/data/api/response/CategoriesORResponse$Category.class */
    public static class Category {
        @infoContactPersonDialogEvent(c = "category_cd")
        private String categoryCd;
        @infoContactPersonDialogEvent(c = "category_en")
        private String categoryEn;
        @infoContactPersonDialogEvent(c = "category_in")
        private String categoryIn;
        @infoContactPersonDialogEvent(c = "content_en")
        private String contentEn;
        @infoContactPersonDialogEvent(c = "content_in")
        private String contentIn;
        @infoContactPersonDialogEvent(c = "content_order")
        private String contentOrder;
        @infoContactPersonDialogEvent(c = "next_category_cd")
        private String nextCategoryCd;

        public String getCategoryCd() {
            return this.categoryCd;
        }

        public String getCategoryEn() {
            return this.categoryEn;
        }

        public String getCategoryIn() {
            return this.categoryIn;
        }

        public String getContentEn() {
            return this.contentEn;
        }

        public String getContentIn() {
            return this.contentIn;
        }

        public String getContentOrder() {
            return this.contentOrder;
        }

        public String getNextCategoryCd() {
            return this.nextCategoryCd;
        }

        public void setCategoryCd(String str) {
            this.categoryCd = str;
        }

        public void setCategoryEn(String str) {
            this.categoryEn = str;
        }

        public void setCategoryIn(String str) {
            this.categoryIn = str;
        }

        public void setContentEn(String str) {
            this.contentEn = str;
        }

        public void setContentIn(String str) {
            this.contentIn = str;
        }

        public void setContentOrder(String str) {
            this.contentOrder = str;
        }

        public void setNextCategoryCd(String str) {
            this.nextCategoryCd = str;
        }
    }

    public List<Category> getCategories() {
        return this.categories;
    }

    public void setCategories(List<Category> list) {
        this.categories = list;
    }
}
