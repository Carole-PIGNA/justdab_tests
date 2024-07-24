package com.training.justdab.service;

import com.training.justdab.model.Client;
import com.training.justdab.repository.ClientRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
@ExtendWith(MockitoExtension.class)

public class ClientServiceTest {

    @InjectMocks
    private ClientServiceImpl clientService;


    @Mock
    private ClientRepository clientRepository;

    private List<Client> clientList;


    @BeforeEach
    void setUp() {

        Client client1 = new Client();
        client1.setEmail("email@bidon.com");
        client1.setFirstName("bidon");
        client1.setLastName("bidule");
        client1.setPassword("trucmuche");

        Client client2 = new Client();
        client2.setEmail("email@machin.com");
        client2.setFirstName("Joe");
        client2.setLastName("Biden");
        client2.setPassword("password");

        clientList = Arrays.asList(client1, client2);

        when(clientRepository.findAll()).thenReturn(clientList);

    }


    @Test
    public void shouldReturnAllClientsWithSuccess() {
        List<Client> clients = clientService.getAllClients();

        assertEquals(2, clients.size());

        assertEquals("bidon", clients.get(0).getFirstName());
        assertEquals("bidule", clients.get(0).getLastName());
        assertEquals("Joe", clients.get(1).getFirstName());
        assertEquals("Biden", clients.get(1).getLastName());
    }

}
