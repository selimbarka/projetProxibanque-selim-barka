package com.example.proxibanque.sevice;


import com.example.proxibanque.entity.Client;
import com.example.proxibanque.repository.ClientRepository;
import com.example.proxibanque.service.ClientService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class ClientServiceTest {

    @Autowired
    private ClientService clientService;

    @Autowired
    private ClientRepository clientRepository;

    @BeforeEach
    public void setUp() {
        clientRepository.deleteAll();
    }

    @Test
    public void testCreerClient() {

        Client client = new Client("Martin", "Marie");
        client.setVille("Paris");

        Client clientCree = clientService.creerClient(client);

        assertNotNull(clientCree.getId());
        assertEquals("Martin", clientCree.getNom());
        assertEquals("Marie", clientCree.getPrenom());
        assertEquals("Paris", clientCree.getVille());
    }

    @Test
    public void testGetTousLesClients() {
        Client client1 = new Client("Dupont", "Jean");
        Client client2 = new Client("Martin", "Marie");
        clientService.creerClient(client1);
        clientService.creerClient(client2);

        List<Client> clients = clientService.getTousLesClients();

        assertEquals(2, clients.size());
    }

    @Test
    public void testGetClientParId() {
        Client client = new Client("Dubois", "Pierre");
        Client clientCree = clientService.creerClient(client);

        Client clientTrouve = clientService.getClientParId(clientCree.getId());

        assertNotNull(clientTrouve);
        assertEquals("Dubois", clientTrouve.getNom());
    }

    @Test
    public void testSupprimerClient() {
        Client client = new Client("Bernard", "Sophie");
        Client clientCree = clientService.creerClient(client);
        Long clientId = clientCree.getId();

        clientService.supprimerClient(clientId);

        Client clientSupprime = clientService.getClientParId(clientId);
        assertNull(clientSupprime);
    }
}