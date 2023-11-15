package com.example.legacyshop.unittest;

import com.example.legacyshop.unittest.thirdpartyjar.article.Article;
import com.example.legacyshop.unittest.thirdpartyjar.article.ArticlesRepository;

import java.util.HashMap;
import java.util.Map;

public class TestArticlesRepository implements ArticlesRepository {


    private static final Map<String, Article> ARTICLES_BY_ID = new HashMap<>();

    static {
        ARTICLES_BY_ID.put("modern ball", new Article("modern ball", 80));
        ARTICLES_BY_ID.put("ball", new Article("ball", 30));
        ARTICLES_BY_ID.put("sale ball", new Article("sale ball", 28));
        ARTICLES_BY_ID.put("ball Discount", new Article("ball Discount", 28));
        ARTICLES_BY_ID.put("sale modern bath", new Article("sale bath", 3690));
        ARTICLES_BY_ID.put("modern bath", new Article("modern bath", 2800));
        ARTICLES_BY_ID.put("expensive bath", new Article("expensive bath", 1000_000));
    }



    @Override
    public Article find(String id) {
        return ARTICLES_BY_ID.get(id);
    }

}
