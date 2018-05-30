package com.karve.logistics.repository.mobileDelivery.face;

import com.karve.logistics.domain.entity.FieldTicket;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface FieldTicketRepository extends CrudRepository<FieldTicket, Long> {
}
