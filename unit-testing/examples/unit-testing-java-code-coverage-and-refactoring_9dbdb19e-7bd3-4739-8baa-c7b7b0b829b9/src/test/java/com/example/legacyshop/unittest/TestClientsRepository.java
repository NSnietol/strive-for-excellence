package com.example.legacyshop.unittest;

import com.example.legacyshop.unittest.thirdpartyjar.clients.Client;
import com.example.legacyshop.unittest.thirdpartyjar.clients.ClientsRepository;

import java.util.HashMap;
import java.util.Map;

public class TestClientsRepository implements ClientsRepository {

    private static final Map<String, Client> CLIENTS_BY_ID = new HashMap<>();

    static {
        CLIENTS_BY_ID.put("ordinary", new Client("ordinary", false));
        CLIENTS_BY_ID.put(
                "vip", new Client("vip", true));
        CLIENTS_BY_ID.put(null, null);
    }

    @Override
    public Client find(String id) {
        return CLIENTS_BY_ID.get(id);
    }
}
