package com.example.legacyshop.unittest.thirdpartyjar.article;

import java.util.Objects;

public class Article {

    private final String id;
    private final int basePrice;

    public Article(String id, int basePrice) {
        this.id = id;
        this.basePrice = basePrice;
    }

    public String getId() {
        return id;
    }


    public int getBasePrice() {
        return basePrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}
        if (o == null || getClass() != o.getClass()) {return false;}
        Article article = (Article) o;
        return basePrice == article.basePrice && Objects.equals(id, article.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, basePrice);
    }
}
