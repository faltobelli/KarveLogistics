package com.karve.logistics.service.mobileDelivery.face;

import com.karve.logistics.domain.entity.FieldTicket;
import com.karve.logistics.domain.entity.Route;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface MobileDeliveryService {

    FieldTicket getFieldTicketDetail(int fieldTicketNum);

    List<FieldTicket> getFieldTickets(Long userId);

    List<Route> getRoutes(Long userId);

    Route getRoute(Long routeId);
}
