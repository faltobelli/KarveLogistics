package com.karve.logistics.service.mobileDelivery.face;

import com.karve.logistics.domain.entity.FieldTicket;
import org.springframework.stereotype.Component;

@Component
public interface MobileDeliveryService {

    FieldTicket getFieldTicketDetail(int fieldTicketNum);
}
