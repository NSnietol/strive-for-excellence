package com.example.legacyshop.unittest.shop;

import com.example.legacyshop.unittest.exception.InvalidArticleException;
import com.example.legacyshop.unittest.exception.InvalidClientException;
import com.example.legacyshop.unittest.thirdpartyjar.article.Article;
import com.example.legacyshop.unittest.thirdpartyjar.article.ArticlesRepository;
import com.example.legacyshop.unittest.thirdpartyjar.clients.Client;
import com.example.legacyshop.unittest.thirdpartyjar.clients.ClientsRepository;

public class PriceCalculator {

    private final ArticlesRepository articlesRepository;
    private final ClientsRepository clientsRepository;

    public PriceCalculator(ArticlesRepository articlesRepository, ClientsRepository clientsRepository) {
        this.articlesRepository = articlesRepository;
        this.clientsRepository = clientsRepository;
    }

    public int calculatePrice(String articleId, String clientId, int quantity) {
        validateArticleId(articleId);
       // validateClientId(clientId);
        Article article = articlesRepository.find(articleId);
        Client client = clientsRepository.find(clientId);
        validateArticle(article);
        validateClient(client);
        validateQuantity(quantity);

        int totalPrice = article.getBasePrice();
        totalPrice = applyBiggerQuantityDiscount(quantity, totalPrice);
        totalPrice = applyVipDiscount(client, totalPrice);
        totalPrice = applySaleDiscount(articleId, totalPrice);

        return totalPrice;
    }

    private void validateArticleId(String articleId){
        if (articleId == null) {
            throw new InvalidArticleException("Article Id is null ");
        }
    }
    private void validateClientId(String clientId){
        if (clientId == null) {
            throw new InvalidClientException("Client Id is null ");
        }
    }
    private void validateClient (Client client) {
        if (client == null) {
            throw new InvalidClientException("Client not found " );
        }
    }
    private void validateArticle (Article article) {
        if (article == null) {
            throw new InvalidArticleException("Article not found " );
        }
    }

    private void validateQuantity(int quantity) {
        if (quantity <= 0) {
            throw new IllegalArgumentException("Quantity should be positive number, but current is: " + quantity);
        }
    }

    private int applyBiggerQuantityDiscount(int quantity, int totalPrice) {
        if (quantity > 50) {
            totalPrice = 10 * totalPrice;
        } else if (quantity > 30) {
            totalPrice = 5 * totalPrice;
        }
        return totalPrice;
    }

    private int applyVipDiscount(Client client, int totalPrice) {
        if (client.isVip()) {
            totalPrice = 30 * totalPrice;
        }
        return totalPrice;
    }

    private int applySaleDiscount(String articleId, int totalPrice) {
        if (isSaleId(articleId) || isSalePrice(totalPrice)) {
            totalPrice = totalPrice * 3 * ((totalPrice / 10000) + 1);
        }
        return totalPrice;
    }

    private boolean isSaleId(String articleId) {
        return articleId.toLowerCase().contains("sale") || articleId.endsWith("Discount");
    }

    private boolean isSalePrice(int totalPrice) {
        return totalPrice >= 10000 && totalPrice < 1000000;
    }

}
