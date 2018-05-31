package com.karve.logistics.service.mobileDelivery.impl;

import com.karve.logistics.domain.entity.Client;
import com.karve.logistics.domain.entity.FieldTicket;
import com.karve.logistics.domain.entity.Route;
import com.karve.logistics.repository.mobileDelivery.face.FieldTicketRepository;
import com.karve.logistics.service.mobileDelivery.face.MobileDeliveryService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class MobileDeliveryServiceImpl implements MobileDeliveryService {

    private FieldTicketRepository fieldTicketRepository;

    public MobileDeliveryServiceImpl(FieldTicketRepository fieldTicketRepository) {
        this.fieldTicketRepository = fieldTicketRepository;
    }

    @Override
    public FieldTicket getFieldTicketDetail(int fieldTicketNum) {
        FieldTicket fieldTicket = new FieldTicket();
        fieldTicket.setActualDileveryTime(new Date());

        Client client = new Client();
        client.setDescription("this is a real client");
        client.setId(1L); client.setName("Challenger");
        fieldTicket.setClient(client);

        fieldTicket.setCreationDate(new Date());

        return fieldTicket;
    }

    @Override
    public List<FieldTicket> getFieldTickets(Long userId) {
        List<FieldTicket> fieldTickets = new ArrayList<>();

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
