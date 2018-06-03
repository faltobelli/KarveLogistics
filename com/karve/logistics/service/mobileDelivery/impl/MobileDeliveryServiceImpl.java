package com.karve.logistics.service.mobileDelivery.impl;

import com.karve.logistics.domain.entity.Client;
import com.karve.logistics.domain.entity.FieldTicket;
import com.karve.logistics.domain.entity.Route;
import com.karve.logistics.repository.mobileDelivery.face.ClientRepository;
import com.karve.logistics.repository.mobileDelivery.face.FieldTicketRepository;
import com.karve.logistics.service.mobileDelivery.face.MobileDeliveryService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class MobileDeliveryServiceImpl implements MobileDeliveryService {

    private FieldTicketRepository fieldTicketRepository;
    private ClientRepository clientRepository;

    public MobileDeliveryServiceImpl(FieldTicketRepository fieldTicketRepository,
                                     ClientRepository clientRepository) {
        this.fieldTicketRepository = fieldTicketRepository;
        this.clientRepository = clientRepository;
    }

    @Override
    public FieldTicket getFieldTicketDetail(int fieldTicketNum) {
        FieldTicket fieldTicket = new FieldTicket();
        fieldTicket.setActualDeleveryTime(new Date());
        fieldTicket.setTicketName(String.format("This Ticket: %s", fieldTicketNum));
        fieldTicket.setTicketId(234L);
        fieldTicket.setEstDileveryTime(new Date());
        fieldTicket.setPrice("$378 for disposal");
        fieldTicket.setProduct("Gun barrel water 130bls");
        fieldTicket.setSiteInstructions("Get this stuff out of here!!!");

        Client client = new Client();
        client.setDescription("this is a real client");
        client.setClientId(1L); client.setName("Challenger");
        fieldTicket.setClient(client);

        fieldTicket.setCreationDate(new Date());

        return fieldTicket;
    }

    @Override
    public List<FieldTicket> getFieldTickets(Long userId) {

/*
        Client client = new Client();
        client.setDescription("this is a real client");
        client.setClientId(1L); client.setName("Challenger");
*/


        List<FieldTicket> fieldTickets = new ArrayList<>();

        FieldTicket fieldTicket = new FieldTicket();
        fieldTicket.setCreationDate(new Date()); fieldTicket.setTicketId(11L); fieldTicket.setTicketName("Exxon");
        fieldTickets.add(fieldTicket);
        fieldTicket = new FieldTicket();
        fieldTicket.setCreationDate(new Date()); fieldTicket.setTicketId(12L); fieldTicket.setTicketName("Challenger");
        fieldTickets.add(fieldTicket);
        fieldTicket = new FieldTicket();
        fieldTicket.setCreationDate(new Date()); fieldTicket.setTicketId(13L); fieldTicket.setTicketName("Bubas");
        fieldTickets.add(fieldTicket);
        fieldTicket = new FieldTicket();
        fieldTicket.setCreationDate(new Date()); fieldTicket.setTicketId(14L); fieldTicket.setTicketName("Apache");
        fieldTickets.add(fieldTicket);

        return fieldTickets;
    }

    @Override
    public List<Route> getRoutes(Long userId) {
        List<Route> routes = new ArrayList<>();

        return routes;
    }

    @Override
    public Route getRoute(Long routeId) {
        Route route = new Route();

        return route;
    }
}
