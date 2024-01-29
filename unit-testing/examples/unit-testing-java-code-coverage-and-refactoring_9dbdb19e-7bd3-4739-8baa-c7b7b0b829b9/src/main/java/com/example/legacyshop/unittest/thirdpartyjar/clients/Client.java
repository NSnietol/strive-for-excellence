package com.example.legacyshop.unittest.thirdpartyjar.clients;

public class Client {

    private final String id;
    private final boolean isVip;

    public Client(String id, boolean isVip) {
        this.id = id;
        this.isVip = isVip;
    }

    public String getId() {
        return id;
    }

    public boolean isVip() {
        return isVip;
    }
}
