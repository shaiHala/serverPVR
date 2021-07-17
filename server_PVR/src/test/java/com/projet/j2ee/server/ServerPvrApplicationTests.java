package com.projet.j2ee.server;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.test.context.SpringBootTest;

import com.projet.j2ee.models.product.test;
import com.projet.j2ee.repos.product.testRepository;
import com.projet.j2ee.models.prime.Article;
import com.projet.j2ee.repos.prime.ArticleRepository;
import com.projet.j2ee.repos.prime.*;

@SpringBootTest
class ServerPvrApplicationTests {



    @Autowired 
    private FournisseurRepository frRep;
    @Autowired
    private ArticleRepository arRep;
    @Test
    public void testCreateArticle() {
    	
    	Article ar = new  Article( 3360, 500, "test2", "thahah");
    	arRep.save(ar);
    }
}
