package com.projet.j2ee.server;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.test.context.SpringBootTest;

import com.projet.j2ee.models.g_stock.Article;
import com.projet.j2ee.models.g_vente.Client;
import com.projet.j2ee.repos.g_stock.*;
import com.projet.j2ee.repos.g_vente.ClientRepository;

@SpringBootTest
class ServerPvrApplicationTests {



    @Autowired
    private ClientRepository cRep;
    @Test
    public void testCreateArticle() {
    	
    	Client c = new  Client("Oukhira","Meknes","09090909");
    	cRep.save(c);
    }
}
