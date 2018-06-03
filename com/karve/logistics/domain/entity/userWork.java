package com.karve.logistics.domain.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "userwork")
public class userWork implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userWorkId;

    private Long userId;

    @Temporal(TemporalType.DATE)
    private Date workDate;

    @ManyToOne
    @JoinColumn(name = "fieldTicketId")
    private FieldTicket fieldTicket;

    @ManyToOne
    @JoinColumn(name = "routeId")
    private Route route;

    public Long getUserWorkId() {
        return userWorkId;
    }

    public void setUserWorkId(Long userWorkId) {
        this.userWorkId = userWorkId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Date getWorkDate() {
        return workDate;
    }

    public void setWorkDate(Date workDate) {
        this.workDate = workDate;
    }

    public FieldTicket getFieldTicket() {
        return fieldTicket;
    }

    public void setFieldTicket(FieldTicket fieldTicket) {
        this.fieldTicket = fieldTicket;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }
}
