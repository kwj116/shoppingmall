package com.shoppingmallproject.domain.category;

public enum Category {
    CATEGORY_ACC("CATEGORY_ACC"),
    CATEGORY_PAD("CATEGORY_PAD"),
    CATEGORY_PHONECASE("CATEGORY_PHONECASE"),
    CATEGORY_BAG("CATEGORY_BAG");

    String category;

    Category(String category){
        this.category = category;
    }

    public String value(){
        return category;
    }
}
