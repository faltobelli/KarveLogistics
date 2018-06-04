package com.karve.logistics.controller;


import com.karve.logistics.service.mobileDelivery.face.MobileDeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;

@CrossOrigin
@RequestMapping("/md")
@Controller
public class MobileDeliveryController {

    // Mock
    private Integer userId;

    private MobileDeliveryService mobileDeliveryService;

    @Autowired
    public MobileDeliveryController(MobileDeliveryService mobileDeliveryService) {
        this.mobileDeliveryService = mobileDeliveryService;

        userId = 1;
    }

    @GetMapping("/")
    public String hello() {
        return "hello";
    }

    // **********************************
    // Field Ticket
    @GetMapping("/fieldticketDetail")
    public String getFieldTicketDetail(@RequestParam(name = "ticketid", required = true) int fieldTicketId,
                                    Model model) {

        model.addAttribute("userId", userId);
        model.addAttribute("ticketInfo", mobileDeliveryService.getFieldTicketDetail(fieldTicketId));

        return "mdFieldTicketDetail";
    }

    @GetMapping("/fieldtickets")
    public String getMobileDelieveryTickets(@RequestParam(name = "userId", required = true) int userId, Model model) {

        this.userId = userId;

        String name = "Billy Bob";
        model.addAttribute("name", name);
        model.addAttribute("userId", userId);

        model.addAttribute("tickets", mobileDeliveryService.getFieldTickets(new Long(userId)));

        return "mdFieldTicket";
    }


    // **********************************
    // Route for the day (Searchable)
    @GetMapping("/routes")
    public String getRoutes(@RequestParam(name = "userId", required = true) int userId, Model model) {

        this.userId = userId;

        model.addAttribute("userId", userId);

        String pattern = "yyyy-MM-dd";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String date = simpleDateFormat.format(new Date());
        model.addAttribute("date", date);

        model.addAttribute(mobileDeliveryService.getRoutes(new Long(userId)));

        return "mdRoutes";
    }

    @GetMapping("/routedetail")
    public String getRoutesDetail(@RequestParam(name="routeId", required=true) int routeId, Model model) {

        model.addAttribute("userId", userId);
        model.addAttribute("routeId", routeId);

        model.addAttribute(mobileDeliveryService.getRoute(new Long(routeId)));

        return "mdRouteDetail";
    }

    // **********************************
    // GPS Routing
    @GetMapping("/maproute")
    public String getMapRoute(@RequestParam(name = "userId", required = true) int userId,
                                 @RequestParam(name="routeId", required=false, defaultValue = "0") int routeId,
                                 Model model) {

        this.userId = userId;
        model.addAttribute("userId", userId);
        model.addAttribute("routeId", routeId);

        model.addAttribute(mobileDeliveryService.getRoute(new Long(routeId)));

        return "mdMapRoute";
    }
}
