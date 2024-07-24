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
import org.springframework.test.context.ActiveProfiles;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;


@SpringBootTest
@ActiveProfiles("test")
@ExtendWith(MockitoExtension.class)
public class ClientServiceTest {

    @InjectMocks
    private ClientServiceImpl clientServiceImpl ;

    @Mock
    private ClientRepository clientRepository;


    @BeforeEach
    public void setUp() {
        clientServiceImpl= new ClientServiceImpl( clientRepository);

    }




    @Test
    public void testgetAllClients() {


        List<Client> clients = clientServiceImpl.getAllClients();

        assertEquals(9, clients.size());

        Client client1 = clients.get(0);
        assertEquals(1, client1.getId());
        assertEquals("first_client_1", client1.getFirstName());
        assertEquals("last_client_1", client1.getLastName());

        Client client2 = clients.get(1);
        assertEquals(2, client2.getId());
        assertEquals("first_client_2", client2.getFirstName());
        assertEquals("last_client_2", client2.getLastName());

        Client client3 = clients.get(2);
        assertEquals(3, client3.getId());
        assertEquals("first_client_3", client3.getFirstName());
        assertEquals("last_client_3", client3.getLastName());

        Client client4 = clients.get(3);
        assertEquals(4, client4.getId());
        assertEquals("first_client_4", client4.getFirstName());
        assertEquals("last_client_4", client4.getLastName());

        Client client5 = clients.get(4);
        assertEquals(5, client1.getId());
        assertEquals("first_client_5", client5.getFirstName());
        assertEquals("last_client_5", client5.getLastName());


    }

}
