package com.karve.logistics.service.mobileDelivery.impl;

import com.karve.logistics.domain.entity.FieldTicket;
import com.karve.logistics.repository.mobileDelivery.face.FieldTicketRepository;
import com.karve.logistics.service.mobileDelivery.face.MobileDeliveryService;
import org.springframework.stereotype.Service;

@Service
public class MobileDeliveryServiceImpl implements MobileDeliveryService {

    private FieldTicketRepository fieldTicketRepository;

    public MobileDeliveryServiceImpl(FieldTicketRepository fieldTicketRepository) {
        this.fieldTicketRepository = fieldTicketRepository;
    }

    @Override
    public FieldTicket getFieldTicketDetail(int fieldTicketNum) {
        return null;
    }
}
