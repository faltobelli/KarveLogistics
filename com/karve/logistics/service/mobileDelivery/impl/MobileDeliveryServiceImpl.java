package com.karve.logistics.service.mobileDelivery.impl;

import com.karve.logistics.domain.entity.FieldTicket;
import com.karve.logistics.service.mobileDelivery.face.MobileDeliveryService;
import org.springframework.stereotype.Service;

@Service
public class MobileDeliveryServiceImpl implements MobileDeliveryService {

    private FieldTicket fieldTicket;

    public MobileDeliveryServiceImpl(FieldTicket fieldTicket) {
        this.fieldTicket = fieldTicket;
    }

    @Override
    public FieldTicket getFieldTicketDetail(int fieldTicketNum) {
        return null;
    }
}
