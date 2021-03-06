package com.omega.connect.integration;


import com.omega.commons.db.model.Client;
import com.omega.to.CreateClientRequest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CreateClientIntegrationTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void createClient() {
        ResponseEntity<Client> responseEntity =
            restTemplate.postForEntity("/clients", new CreateClientRequest("Foo"), Client.class);
        Client client = responseEntity.getBody();

        assertEquals(HttpStatus.CREATED, responseEntity.getStatusCode());
        assertEquals("Foo", client.getName());
    }
}
